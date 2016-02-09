app.controller('categorieController', ['$scope', '$http', 'API_URL', 'Upload', function ($scope, $http, API_URL, Upload) {
    $http.defaults.headers.post["Content-Type"] = "application/json";

    $scope.Categories = [];
    $scope.loadingCategorie = false;
    $scope.Categorie = null;
    $scope.isEditing = false;
    $scope.editedCategorie = -1;
    $scope.deletedCategorie = -1;


    $scope.initCategorie = function () {

        $http.get(API_URL + 'categories').
        success(function (data, status, headers, config) {
            $scope.Categories = data._embedded.categories;
        });
    };


    $scope.addCategorie = function () {

        $http.post(API_URL + 'categories', {
            libelle: $scope.Categorie.libelle,
            description: $scope.Categorie.description,
            statutDb: 1
        }).success(function (data, status, headers, config) {
            $scope.Categories.push(data);
            $scope.Categorie = null;
        });
    };

    $scope.prepareUpdateCategorie = function (temp, index) {
        $scope.EditCategorie = angular.copy(temp);
        $scope.editedCategorie = index;
    };
    $scope.updateCategorie = function (cat) {

        $http.put(API_URL + 'categories' + '/' + cat.categorieId, {
            libelle: cat.libelle,
            description: cat.description
        }).success(function (data, status, headers, config) {
            $scope.Categories[$scope.editedCategorie] = data;

        });
    };
    $scope.prepareDeleteCategorie = function (index) {
        $scope.deletedCategorie = angular.copy(index);
    };
    $scope.deleteCategorie = function () {
//            $scope.loadingCategorie = true;

        var cat = $scope.Categories[$scope.deletedCategorie];

        $http.delete(API_URL + 'categories' + '/' + cat.categorieId)
            .success(function () {
                $scope.Categories.splice($scope.deletedCategorie, 1);
//                        $scope.loadingCategorie = false;

            });
    };
    $scope.propriete = null;


    $scope.preparePropriete = function (temp, index) {
        $scope.EditProprietes = angular.copy(temp);
        $scope.editedCategorie = index;

        var elt = $('#object_tagsinput');
        elt.tagsinput({
            itemValue: 'proprieteId',
            itemText: 'libelle',
        });
        var c = $scope.EditProprietes.proprietes;
        for (i = 0; i < c.length; i++) {
            elt.tagsinput('add',
                {
                    "proprieteId": c[i].proprieteId,
                    "libelle": c[i].libelle,
                    "index":i,
                });
        }
    };
    $scope.addPropriete = function () {

        $http.post(API_URL + 'proprietes', {
            libelle: $scope.propriete.libelle,
            ID_CATEGORIE: $scope.EditProprietes.categorieId
        }).success(function (data, status, headers, config) {
            $scope.propriete = null;
            var elt = $('#object_tagsinput');
            elt.tagsinput({
                itemValue: 'proprieteId',
                itemText: 'libelle',
            });
            var c = data;
            elt.tagsinput('add',
                {
                    "proprieteId": c.proprieteId,
                    "libelle": c.libelle,
                    "index":1,
                });
        });
    };
    RemovePropriete = function (prop) {
        console.info("categorie"+$scope.editedCategorie);
        console.info("propre"+$scope.Categories[$scope.editedCategorie].proprietes);
        console.info("propre"+$scope.Categories[$scope.editedCategorie].proprietes[0]);
        $scope.Categories[$scope.editedCategorie].proprietes.splice(prop.proprieteId, 1);
        $http.delete(API_URL + 'proprietes' + '/' + prop.proprieteId)
            .success(function () {
                console.info("categorie"+$scope.editedCategorie);
                console.info("propre"+$scope.Categories[$scope.editedCategorie].proprietes);
                console.info("propre"+$scope.Categories[$scope.editedCategorie].proprietes[0]);
                $scope.Categories[$scope.editedCategorie].proprietes.splice(prop.proprieteId, 1);
                console.info("propriete deleted");

            });
    };
}]);

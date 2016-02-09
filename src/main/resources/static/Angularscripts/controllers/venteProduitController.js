/**
 * Created by DIALLO-IMRANA on 09/02/2016.
 */

app.controller('venteProduitController', ['$scope', '$http', 'API_URL', 'Upload', function ($scope, $http, API_URL, Upload) {
    $http.defaults.headers.post["Content-Type"] = "application/json";

    $scope.produits = [];
    $scope.loadingProduit = false;
    $scope.produit = null;
    $scope.isEditing = false;
    $scope.editedProduit = -1;
    $scope.deletedProduit = -1;


    $scope.initProduit = function () {

        $http.get(API_URL + 'produits').
        success(function (data, status, headers, config) {
            $scope.produits = data._embedded.produits;
        });
    };


    $scope.addProduit = function () {

        $http.post(API_URL + 'produits', {
            designation: $scope.produit.designation,
            prix: $scope.produit.prix,
            quantiteStock: $scope.produit.quantiteStock,
            tauxRemise: $scope.produit.tauxRemise,
            quantiteStock: $scope.produit.quantiteStock,
            tauxRemise: $scope.produit.tauxRemise,
            statutDb: 1
        }).success(function (data, status, headers, config) {
            $scope.Categories.push(data);
            $scope.Categorie = null;
        });
    };


}]);


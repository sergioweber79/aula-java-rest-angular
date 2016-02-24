angular.module('produto')
.controller('ProdutoCtrl', 
	function($scope, ProdutoService) {
		
		$scope.produto = {};
		$scope.produtos = [];
		$scope.categorias = [];
		
		var error = function() {
			console.log('Status = ' + ProdutoService.status + '\n');
			console.log('Erro = ' + ProdutoService.error + '\n');
		}
		
		$scope.findAll = function() {
			ProdutoService.findAll().then(
				function() {
					$scope.produtos = ProdutoService.data;
					ProdutoService.data = {};
				},
				error
			);
		}
		
		$scope.create = function() {
			ProdutoService.create($scope.produto).then(
				function() {
					alert($scope.produto.descricao + ' Salvo com sucesso!')
				},
				error
			);
		}
		
	}
);
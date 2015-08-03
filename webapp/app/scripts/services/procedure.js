'use strict';

angular.module('openehrPocApp')
  .factory('Procedure', function ($http) {

    var patientIdOveride = 9999999000;

    var all = function (patientId) {
      return $http.get('/api/patients/' + (patientIdOveride || patientId) + '/procedures');
    };

    var create = function (patientId, composition) {
      return $http.post('/api/patients/' + (patientIdOveride || patientId) + '/procedures', composition);
    };

    var update = function (patientId, composition) {
      return $http.put('/api/patients/' + (patientIdOveride || patientId) + '/procedures', composition);
    };

    return {
      all: all,
      update: update,
      create: create
    };
  });
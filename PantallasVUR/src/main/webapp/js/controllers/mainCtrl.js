runtConsulta.controller('mainController', ['$scope','$http', function($scope,$http){
        $scope.datosFormulario={};
        $scope.pantallaFiltros=true;
        $scope.pantallaBusqueda=false;
        $scope.pantallaDetalle=false;
        $scope.getParametrosBusqueda=function(){
            $http.get('webresources/consulta/parametrosBusqueda', {}).then(
                    function(response){
                        $scope.parametrosBusqueda=response.data;
                        $scope.datosFormulario.parametroBusqueda=$scope.parametrosBusqueda[0];
                    }, 
                    function(data){
                        alert("Error al consultar los datos");
                    });
        };
        $scope.getDepartamentos=function(){
            $http.get('webresources/consulta/departamento', {}).then(
                    function(response){
                        $scope.departamentos=response.data;
                        $scope.departamentos.splice(0, 0, {id:'',nombre:'TODOS'})
                        $scope.datosFormulario.departamento=$scope.departamentos[0];
                    }, 
                    function(data){
                        alert("Error al consultar los datos");
                    });
        };
        $scope.getMunicipios=function(depto){
            $http.get('webresources/consulta/municipio/'+depto.id, {}).then(
                    function(response){
                        $scope.municipios=response.data;
                        $scope.municipios.splice(0, 0, {id:'',nombre:'TODOS'})
                        $scope.datosFormulario.municipio=$scope.municipios[0];
                    }, 
                    function(data){
                        alert("Error al consultar los datos");
                    });
        };
        $scope.getTiposDocumento=function(){
            $http.get('webresources/consulta/tipoDocumento', {}).then(
                    function(response){
                        $scope.tipoDocumentos=response.data;
                        $scope.datosFormulario.tipoDocumento=$scope.tipoDocumentos[0];
                    }, 
                    function(data){
                        alert("Error al consultar los datos");
                    });
        };
        $scope.getCirculoRegistrales=function(){
            $http.get('webresources/consulta/oficina', {}).then(
                    function(response){
                        $scope.circulosRegistrales=response.data;
                        $scope.datosFormulario.circuloRegistral=$scope.circulosRegistrales[0];
                    }, 
                    function(data){
                        alert("Error al consultar los datos");
                    });
        };
        $scope.getDepartamentos();
        $scope.getMunicipios({id:'0'});
        $scope.getTiposDocumento();
        $scope.getCirculoRegistrales();
        $scope.getParametrosBusqueda();
        
        $scope.controlPantalla={matricula:true, documento:false, referenciaCatastral: false, cedulaCatastral:false, propietarioNatural:false, propietarioJuridico:false};
        $scope.tipoConsulta=function(parametroBusqueda){
            if(parametroBusqueda.id=='1'){
                $scope.controlPantalla.matricula=true;
                $scope.controlPantalla.documento=false;
                $scope.controlPantalla.referenciaCatastral= false;
                $scope.controlPantalla.cedulaCatastral=false;
                $scope.controlPantalla.propietarioNatural=false;
                $scope.controlPantalla.propietarioJuridico=false;
            }else if(parametroBusqueda.id=='2'){
                $scope.controlPantalla.matricula=false;
                $scope.controlPantalla.documento=true;
                $scope.controlPantalla.referenciaCatastral= false;
                $scope.controlPantalla.cedulaCatastral=false;
                $scope.controlPantalla.propietarioNatural=false;
                $scope.controlPantalla.propietarioJuridico=false;
            }else if(parametroBusqueda.id=='3'){
                $scope.controlPantalla.matricula=false;
                $scope.controlPantalla.documento=false;
                $scope.controlPantalla.referenciaCatastral= true;
                $scope.controlPantalla.cedulaCatastral=false;
                $scope.controlPantalla.propietarioNatural=false;
                $scope.controlPantalla.propietarioJuridico=false;
            }else if(parametroBusqueda.id=='4'){
                $scope.controlPantalla.matricula=false;
                $scope.controlPantalla.documento=false;
                $scope.controlPantalla.referenciaCatastral= false;
                $scope.controlPantalla.cedulaCatastral=true;
                $scope.controlPantalla.propietarioNatural=false;
                $scope.controlPantalla.propietarioJuridico=false;
            }else if(parametroBusqueda.id=='5'){
                $scope.controlPantalla.matricula=false;
                $scope.controlPantalla.documento=false;
                $scope.controlPantalla.referenciaCatastral= false;
                $scope.controlPantalla.cedulaCatastral=false;
                $scope.controlPantalla.propietarioNatural=true;
                $scope.controlPantalla.propietarioJuridico=false;
            }else if(parametroBusqueda.id=='6'){
                $scope.controlPantalla.matricula=false;
                $scope.controlPantalla.documento=false;
                $scope.controlPantalla.referenciaCatastral= false;
                $scope.controlPantalla.cedulaCatastral=false;
                $scope.controlPantalla.propietarioNatural=false;
                $scope.controlPantalla.propietarioJuridico=true;
            }else if(parametroBusqueda.id=='7'){
                $scope.controlPantalla.matricula=true;
                $scope.controlPantalla.documento=true;
                $scope.controlPantalla.referenciaCatastral= true;
                $scope.controlPantalla.cedulaCatastral=true;
                $scope.controlPantalla.propietarioNatural=true;
                $scope.controlPantalla.propietarioJuridico=true;
            }else {
                alert("Opción inválida");
            }
        };
        
        $scope.buscarInmueble=function(){
            $http.get('webresources/consulta/tipoDocumento', {}).then(
                    function(response){
                        $scope.tipoDocumentos=response.data;
                        $scope.datosFormulario.tipoDocumento=$scope.tipoDocumentos[0];
                    }, 
                    function(data){
                        alert("Error al consultar los datos");
                    });
        };
}]);
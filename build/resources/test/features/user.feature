Feature: Creacion de usuario

  Scenario: Creacion de usuario metodo POST
    Given  Registro la informacion del usuario
    When Consumo el servicio de creacion
    Then Puedo ver el codigo de respuesta 200
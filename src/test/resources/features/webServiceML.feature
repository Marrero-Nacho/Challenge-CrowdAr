Feature: WebServices Mercado Libre

  @Test
  Scenario: Comprobar que existen departamentos
    Given Realizo consulta de WebService ML
    When El codigo de respuesta es 200
    Then La respuesta devuelve al menos un departamento
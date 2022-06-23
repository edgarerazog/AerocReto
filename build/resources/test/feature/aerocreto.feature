Feature: Descargar el PDF de manera exitosa

  @pdf
  Scenario: Vamos a descargar el archivo Estado de situacion financiera del mes de marzo del presente año
    Given el cliente ingresa a la pagina web para realizar la descarga del archivo pdf Estado de situacion Financiera de marzo del presente año
    When cuando este en la opcion Estados financiero ingresar a la casilla Balances y descargar el PDF de marzo del presente año
    Then Validar que el PDF descargado sea el correcto
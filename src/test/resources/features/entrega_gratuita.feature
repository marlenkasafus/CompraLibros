Feature: Entrega gratuita por compra de libros
  Como departamento de marketing
  Quiero ofrecer entrega gratuita a partir de cierta cantidad de libros para clientes VIP
  Para ofrecerles un beneficio e incentivar que compren más cantidad.


  La entrega gratuita se ofrece a clientes VIP cuando solicitan cierto numero de libros.
  La entrega gratuita no se ofrece a clientes regulares.
  El numero minimo de libros para obtener entrega gratuita es 5
  El valor del envio es 100

  Scenario: Un cliente VIP pidiendo 5 libros no debe pagar envio
    Given el comprador es un cliente VIP
    When realiza la compra de 5 libros
    Then debe pagar 0

  Scenario: Un cliente STANDARD pidiendo 5 libros debe pagar 100 de envio
    Given el comprador es un cliente STANDARD
    When realiza la compra de 5 libros
    Then debe pagar 100


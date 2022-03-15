package com.ConsumingRESTFulService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*Las propiedades no encontradas en esta clase se ignoraran*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    /*Para conectar la data a las variables creadas en esta clase el nombre de las variables debe de ser
    * el mismo que la llave del JSON en caso de usar otro nombre se debe utilizar la anotacion
    * @JsonProperty para indicar el nombre de la llave que se mapeara a la variable*/

    private String type;
    private Value value;

    public Quote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}

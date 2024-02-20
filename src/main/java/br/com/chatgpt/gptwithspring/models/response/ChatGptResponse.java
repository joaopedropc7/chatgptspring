package br.com.chatgpt.gptwithspring.models.response;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ChatGptResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Choice> choices;

    public ChatGptResponse() {}

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatGptResponse that = (ChatGptResponse) o;
        return Objects.equals(choices, that.choices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(choices);
    }
}

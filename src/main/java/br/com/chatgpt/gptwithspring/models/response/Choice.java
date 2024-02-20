package br.com.chatgpt.gptwithspring.models.response;

import br.com.chatgpt.gptwithspring.models.request.Message;

import java.io.Serializable;
import java.util.Objects;

public class Choice implements Serializable {

    private static final long serialVersionUID = 1L;

    private int index;
    private Message message;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choice choice = (Choice) o;
        return index == choice.index && Objects.equals(message, choice.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, message);
    }
}

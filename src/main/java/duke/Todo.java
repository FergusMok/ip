package duke;

public class Todo extends Task {

  public Todo(String description) {
    this.description = description;
    this.done = false;
  }

  public Todo(String description, boolean done) {
    this.description = description;
    this.done = done;
  }

  public String toString() {
    String output = "[T]";
    if (this.done) {
      output += "[X] ";
    } else {
      output += "[] ";
    }
    output += this.description;
    return output;
  }

  /**
   * Returns proper format to write to txt file.
   */
  public String toWriteString() {
    String output = Duke.TODO_ENUM;
    String done = (this.done ? "1" : "0");
    output += DIVIDER + done + DIVIDER + this.description;
    return output;
  }
}

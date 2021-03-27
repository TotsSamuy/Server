package commands;


import server.Server;
import collection.MyTreeSet;
import data.Ticket;

import java.util.List;

public class AddIfMin extends AbstractCommand {
    private MyTreeSet myTreeSet;

    public AddIfMin(String name, MyTreeSet myTreeSet) {
        super(name);
        this.myTreeSet = myTreeSet;
    }

    @Override
    public String execute(List<Object> arguments) {
        Ticket ticket = (Ticket) arguments.get(0);
        if (ticket != null) {
            if (myTreeSet.isMin(ticket)) {
                myTreeSet.add(ticket);
                return "Ticket added";
            } else {
                return "Element isn't maximal";
            }
        } else {
            return "Incorrect data in script";
        }
    }
}

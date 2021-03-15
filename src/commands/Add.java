package commands;


import server.Server;
import collection.MyTreeSet;
import data.Ticket;

import java.util.List;


public class Add extends AbstractCommand {
    private MyTreeSet myTreeSet;
    //private Server server;

    public Add(String name, MyTreeSet myTreeSet) {
        super(name);
        this.myTreeSet = myTreeSet;
    }

    @Override
    public void execute(List<Object> arguments) {
        Ticket ticket = (Ticket)arguments.get(0);
        if (ticket != null) {
            myTreeSet.add(ticket);
            Server.sendMessage("Ticket added");
        } else {
            Server.sendMessage("Incorrect data in file");
        }
    }
}

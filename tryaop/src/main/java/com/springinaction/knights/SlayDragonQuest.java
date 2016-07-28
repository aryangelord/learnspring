package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by mike on 16-7-28.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay dragon!");
    }
}

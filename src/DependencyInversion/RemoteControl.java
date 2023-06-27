package DependencyInversion;

public abstract class RemoteControl {
    private OnOffDevice device; // instead of TV
}
/*
 * i can use device to do any sort of OnOffOperations
 * 
 * => if a new device were to be added => this code stays the same (OCP)
 * => Made it high level
 */
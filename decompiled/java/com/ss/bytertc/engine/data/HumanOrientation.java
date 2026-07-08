package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes21.dex */
public class HumanOrientation {
    public Orientation forward;
    public Orientation right;
    public Orientation up;

    public HumanOrientation() {
        this.forward = new Orientation(1.0f, 0.0f, 0.0f);
        this.right = new Orientation(0.0f, 1.0f, 0.0f);
        this.up = new Orientation(0.0f, 0.0f, 1.0f);
    }

    public HumanOrientation(Orientation orientation, Orientation orientation2, Orientation orientation3) {
        this.forward = orientation;
        this.right = orientation2;
        this.up = orientation3;
    }
}

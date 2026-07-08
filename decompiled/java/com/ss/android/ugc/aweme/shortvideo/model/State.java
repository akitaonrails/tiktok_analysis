package com.ss.android.ugc.aweme.shortvideo.model;

/* JADX INFO: loaded from: classes28.dex */
public abstract class State<T> {
    public final T resource;

    public final T getResource() {
        return this.resource;
    }

    public State(T t) {
        this.resource = t;
    }
}

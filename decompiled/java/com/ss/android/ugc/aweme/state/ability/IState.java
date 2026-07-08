package com.ss.android.ugc.aweme.state.ability;

/* JADX INFO: loaded from: classes10.dex */
public interface IState<S> {
    S currentState(String str, S s);

    S defaultState();

    void syncState(String str, S s, boolean z);
}

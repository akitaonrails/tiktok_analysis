package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum TorchState {
    TORCH_STATE_OFF(0),
    TORCH_STATE_ON(1);

    public int value;

    public static TorchState valueOf(String str) {
        return (TorchState) C08FF.LIZ(TorchState.class, str);
    }

    TorchState(int i) {
        this.value = i;
    }
}

package com.ss.android.ugc.aweme.memory.profiler.core;

import com.google.gson.n;

/* JADX INFO: loaded from: classes4.dex */
public final class BridgeMessage {
    public final n data;
    public final Boolean enable;
    public final String id;
    public final int subType;
    public final int type;

    public BridgeMessage(int i, int i2, Boolean bool, String str, n nVar) {
        this.type = i;
        this.subType = i2;
        this.enable = bool;
        this.id = str;
        this.data = nVar;
    }
}

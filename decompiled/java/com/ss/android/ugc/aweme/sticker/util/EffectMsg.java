package com.ss.android.ugc.aweme.sticker.util;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectMsg {

    @C09CT("body")
    public final Body body;

    @C09CT("interface")
    public final Interface interfaceStr;

    public EffectMsg() {
        this(null, null);
    }

    public EffectMsg(Interface r1, Body body) {
        this.interfaceStr = r1;
        this.body = body;
    }
}

package com.ss.android.ugc.aweme.emoji.common.sysemoji;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ImSysEmojiStruct implements Serializable {

    @C09CT("d")
    public List<? extends Emoji> d;

    @C09CT("v")
    public String v;

    public final List<Emoji> getD() {
        return this.d;
    }

    public final String getV() {
        return this.v;
    }

    public final void setD(List<? extends Emoji> list) {
        this.d = list;
    }

    public final void setV(String str) {
        this.v = str;
    }
}

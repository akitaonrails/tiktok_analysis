package com.ss.android.ugc.gamora.editor.audioservice.service.anchor;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class UgcTimbreInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("used_ugc_timbre_info")
    public String info;

    public UgcTimbreInfo() {
        this(null);
    }

    public UgcTimbreInfo(String str) {
        this.info = str;
    }

    public final void setInfo(String str) {
        this.info = str;
    }
}

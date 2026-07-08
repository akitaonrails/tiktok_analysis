package com.ss.android.ugc.gamora.editor.audioservice.service.anchor;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CapcutMetaInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("data")
    public UgcTimbreInfo data;

    public CapcutMetaInfo() {
        this(null);
    }

    public CapcutMetaInfo(UgcTimbreInfo ugcTimbreInfo) {
        this.data = ugcTimbreInfo;
    }

    public final void setData(UgcTimbreInfo ugcTimbreInfo) {
        this.data = ugcTimbreInfo;
    }
}

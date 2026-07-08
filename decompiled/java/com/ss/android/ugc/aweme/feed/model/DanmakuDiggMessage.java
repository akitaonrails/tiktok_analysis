package com.ss.android.ugc.aweme.feed.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuDiggMessage implements Serializable {
    public final String danmakuId;
    public final long danmakuOffset;

    public DanmakuDiggMessage(String str, long j) {
        this.danmakuId = str;
        this.danmakuOffset = j;
    }
}

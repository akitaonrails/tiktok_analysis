package com.bytedance.android.livesdk.sei;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicSei {

    @C09CT("infos")
    public final List<SeiInfos> infos;

    @C09CT("ts")
    public final long timestamp;

    public LinkMicSei(List<SeiInfos> list, long j) {
        this.infos = list;
        this.timestamp = j;
    }
}

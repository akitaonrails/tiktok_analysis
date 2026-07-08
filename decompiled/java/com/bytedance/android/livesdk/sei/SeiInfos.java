package com.bytedance.android.livesdk.sei;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class SeiInfos {

    @C09CT("uid")
    public final String linkMicId;

    @C09CT("talk")
    public final Integer talk;

    @C09CT("volume")
    public final Integer vol;

    public SeiInfos(Integer num, String str, Integer num2) {
        this.talk = num;
        this.linkMicId = str;
        this.vol = num2;
    }
}

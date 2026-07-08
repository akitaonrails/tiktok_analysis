package com.ss.android.ugc.aweme.im.message.content.utils;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemContentDismissContext {
    public final String convId;
    public final Long currentTimestamp;
    public final Integer streakPetStatus;
    public final Integer streakStatus;

    public SystemContentDismissContext(String str, Long l, Integer num, Integer num2) {
        this.convId = str;
        this.currentTimestamp = l;
        this.streakStatus = num;
        this.streakPetStatus = num2;
    }
}

package com.ss.android.ugc.aweme.im.streak.impl.utils;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakCmdMessageUploadInfo {

    @C09CT("consume_code")
    public final int consumeCode;

    @C09CT("craete_time")
    public final long createTime;

    @C09CT("days")
    public final int days;

    @C09CT("is_consume")
    public final Boolean isConsume;

    @C09CT("log_id")
    public final String logId;

    @C09CT("message_id")
    public final String messageId;

    @C09CT("receive_time")
    public final long receiveTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakCmdMessageUploadInfo)) {
            return false;
        }
        StreakCmdMessageUploadInfo streakCmdMessageUploadInfo = (StreakCmdMessageUploadInfo) obj;
        return Intrinsics.LJFF(this.logId, streakCmdMessageUploadInfo.logId) && Intrinsics.LJFF(this.messageId, streakCmdMessageUploadInfo.messageId) && this.receiveTime == streakCmdMessageUploadInfo.receiveTime && Intrinsics.LJFF(this.isConsume, streakCmdMessageUploadInfo.isConsume) && this.consumeCode == streakCmdMessageUploadInfo.consumeCode && this.days == streakCmdMessageUploadInfo.days && this.createTime == streakCmdMessageUploadInfo.createTime;
    }

    public StreakCmdMessageUploadInfo(String str, String str2, long j, Boolean bool, int i, int i2, long j2) {
        this.logId = str;
        this.messageId = str2;
        this.receiveTime = j;
        this.isConsume = bool;
        this.consumeCode = i;
        this.days = i2;
        this.createTime = j2;
    }
}

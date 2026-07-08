package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionStruct {

    @C09CT("create_time")
    public final long createTime;

    @C09CT("has_read")
    public final boolean hasRead;

    @C09CT("message_extra")
    public final String messageExtra;

    @C09CT("mid")
    public final long mid;

    @C09CT("source_type")
    public final int sourceType;

    @C09CT("status_type")
    public final int statusType;

    @C09CT("sub_source_label")
    public final String subSourceLabel;

    @C09CT("sub_source_text")
    public final String subSourceText;

    @C09CT("sub_source_type")
    public final int subSourceType;

    @C09CT("ui_struct")
    public final MissionUIStruct uiStruct;

    @C09CT("unsubscribe_status")
    public final int unsubscribeStatus;

    @C09CT("update_time")
    public final long updateTime;

    public MissionStruct() {
        this(0L, 0, 0, 0L, 0L, false, null, "", 0, "", "", 0);
    }

    public final MissionStruct copy(long j, int i, int i2, long j2, long j3, boolean z, MissionUIStruct missionUIStruct, String str, int i3, String str2, String str3, int i4) {
        return new MissionStruct(j, i, i2, j2, j3, z, missionUIStruct, str, i3, str2, str3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionStruct)) {
            return false;
        }
        MissionStruct missionStruct = (MissionStruct) obj;
        return this.mid == missionStruct.mid && this.sourceType == missionStruct.sourceType && this.statusType == missionStruct.statusType && this.updateTime == missionStruct.updateTime && this.createTime == missionStruct.createTime && this.hasRead == missionStruct.hasRead && Intrinsics.LJFF(this.uiStruct, missionStruct.uiStruct) && Intrinsics.LJFF(this.messageExtra, missionStruct.messageExtra) && this.subSourceType == missionStruct.subSourceType && Intrinsics.LJFF(this.subSourceLabel, missionStruct.subSourceLabel) && Intrinsics.LJFF(this.subSourceText, missionStruct.subSourceText) && this.unsubscribeStatus == missionStruct.unsubscribeStatus;
    }

    public int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.mid) * 31) + this.sourceType) * 31) + this.statusType) * 31) + C786410Ut5.Y2(this.updateTime)) * 31) + C786410Ut5.Y2(this.createTime)) * 31) + C786410Ut5.Z2(this.hasRead)) * 31;
        MissionUIStruct missionUIStruct = this.uiStruct;
        return ((((((((((iY2 + (missionUIStruct == null ? 0 : missionUIStruct.hashCode())) * 31) + this.messageExtra.hashCode()) * 31) + this.subSourceType) * 31) + this.subSourceLabel.hashCode()) * 31) + this.subSourceText.hashCode()) * 31) + this.unsubscribeStatus;
    }

    public MissionStruct(long j, int i, int i2, long j2, long j3, boolean z, MissionUIStruct missionUIStruct, String str, int i3, String str2, String str3, int i4) {
        this.mid = j;
        this.sourceType = i;
        this.statusType = i2;
        this.updateTime = j2;
        this.createTime = j3;
        this.hasRead = z;
        this.uiStruct = missionUIStruct;
        this.messageExtra = str;
        this.subSourceType = i3;
        this.subSourceLabel = str2;
        this.subSourceText = str3;
        this.unsubscribeStatus = i4;
    }
}

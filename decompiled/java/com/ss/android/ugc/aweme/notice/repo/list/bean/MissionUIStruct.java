package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionUIStruct {

    @C09CT("bottom")
    public final MissionBottomStruct bottom;

    @C09CT("middle")
    public final MissionMiddleStruct middle;

    @C09CT("top")
    public final MissionTopStruct top;

    @C09CT("ui_type")
    public final int uiType;

    public MissionUIStruct() {
        this(0, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionUIStruct)) {
            return false;
        }
        MissionUIStruct missionUIStruct = (MissionUIStruct) obj;
        return this.uiType == missionUIStruct.uiType && Intrinsics.LJFF(this.top, missionUIStruct.top) && Intrinsics.LJFF(this.middle, missionUIStruct.middle) && Intrinsics.LJFF(this.bottom, missionUIStruct.bottom);
    }

    public int hashCode() {
        int i = this.uiType * 31;
        MissionTopStruct missionTopStruct = this.top;
        int iHashCode = (i + (missionTopStruct == null ? 0 : missionTopStruct.hashCode())) * 31;
        MissionMiddleStruct missionMiddleStruct = this.middle;
        int iHashCode2 = (iHashCode + (missionMiddleStruct == null ? 0 : missionMiddleStruct.hashCode())) * 31;
        MissionBottomStruct missionBottomStruct = this.bottom;
        return iHashCode2 + (missionBottomStruct != null ? missionBottomStruct.hashCode() : 0);
    }

    public MissionUIStruct(int i, MissionTopStruct missionTopStruct, MissionMiddleStruct missionMiddleStruct, MissionBottomStruct missionBottomStruct) {
        this.uiType = i;
        this.top = missionTopStruct;
        this.middle = missionMiddleStruct;
        this.bottom = missionBottomStruct;
    }
}

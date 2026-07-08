package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionLineTextStruct {

    @C09CT("left_text")
    public final MissionTextStruct leftText;

    @C09CT("right_text")
    public final MissionTextStruct rightText;

    public MissionLineTextStruct() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionLineTextStruct)) {
            return false;
        }
        MissionLineTextStruct missionLineTextStruct = (MissionLineTextStruct) obj;
        return Intrinsics.LJFF(this.leftText, missionLineTextStruct.leftText) && Intrinsics.LJFF(this.rightText, missionLineTextStruct.rightText);
    }

    public int hashCode() {
        MissionTextStruct missionTextStruct = this.leftText;
        int iHashCode = (missionTextStruct == null ? 0 : missionTextStruct.hashCode()) * 31;
        MissionTextStruct missionTextStruct2 = this.rightText;
        return iHashCode + (missionTextStruct2 != null ? missionTextStruct2.hashCode() : 0);
    }

    public MissionLineTextStruct(MissionTextStruct missionTextStruct, MissionTextStruct missionTextStruct2) {
        this.leftText = missionTextStruct;
        this.rightText = missionTextStruct2;
    }
}

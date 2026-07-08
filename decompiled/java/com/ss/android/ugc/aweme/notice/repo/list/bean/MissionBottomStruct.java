package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionBottomStruct {

    @C09CT("left_text")
    public final MissionTextStruct leftText;

    @C09CT("right_button")
    public final MissionButtonStruct rightButton;

    @C09CT("schema_url")
    public final String schemaUrl;

    public MissionBottomStruct() {
        this(null, null, "");
    }

    public int hashCode() {
        MissionTextStruct missionTextStruct = this.leftText;
        int iHashCode = (missionTextStruct == null ? 0 : missionTextStruct.hashCode()) * 31;
        MissionButtonStruct missionButtonStruct = this.rightButton;
        return ((iHashCode + (missionButtonStruct != null ? missionButtonStruct.hashCode() : 0)) * 31) + this.schemaUrl.hashCode();
    }

    public MissionBottomStruct(MissionTextStruct missionTextStruct, MissionButtonStruct missionButtonStruct, String str) {
        this.leftText = missionTextStruct;
        this.rightButton = missionButtonStruct;
        this.schemaUrl = str;
    }
}

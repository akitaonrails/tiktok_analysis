package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionButtonStruct {

    @C09CT("button_type")
    public final int buttonType;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("text")
    public final MissionTextStruct text;

    public MissionButtonStruct() {
        this(0, null, "");
    }

    public int hashCode() {
        int i = this.buttonType * 31;
        MissionTextStruct missionTextStruct = this.text;
        return ((i + (missionTextStruct == null ? 0 : missionTextStruct.hashCode())) * 31) + this.schemaUrl.hashCode();
    }

    public MissionButtonStruct(int i, MissionTextStruct missionTextStruct, String str) {
        this.buttonType = i;
        this.text = missionTextStruct;
        this.schemaUrl = str;
    }
}

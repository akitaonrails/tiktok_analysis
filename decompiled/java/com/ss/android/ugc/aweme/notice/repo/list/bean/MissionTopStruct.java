package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionTopStruct {

    @C09CT("icon_url")
    public final TuxImageModel iconModel;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("title")
    public final MissionTextStruct title;

    public MissionTopStruct() {
        this(null, null, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionTopStruct)) {
            return false;
        }
        MissionTopStruct missionTopStruct = (MissionTopStruct) obj;
        return Intrinsics.LJFF(this.title, missionTopStruct.title) && Intrinsics.LJFF(this.iconModel, missionTopStruct.iconModel) && Intrinsics.LJFF(this.schemaUrl, missionTopStruct.schemaUrl);
    }

    public int hashCode() {
        MissionTextStruct missionTextStruct = this.title;
        int iHashCode = (missionTextStruct == null ? 0 : missionTextStruct.hashCode()) * 31;
        TuxImageModel tuxImageModel = this.iconModel;
        return ((iHashCode + (tuxImageModel != null ? tuxImageModel.hashCode() : 0)) * 31) + this.schemaUrl.hashCode();
    }

    public MissionTopStruct(MissionTextStruct missionTextStruct, TuxImageModel tuxImageModel, String str) {
        this.title = missionTextStruct;
        this.iconModel = tuxImageModel;
        this.schemaUrl = str;
    }
}

package com.ss.android.ugc.aweme.tools.draft.operate;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftSaveMonitorEvent {

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("draft_aweme_type")
    public final int draftAwemeType;

    @C09CT("draft_scene")
    public final String draftScene;

    @C09CT("draft_version")
    public final int draftVersion;

    @C09CT("file_tree_info")
    public final String fileTreeInfo;

    @C09CT("save_draft_app_version")
    public final long saveDraftAppVersion;

    @C09CT("save_draft_time")
    public final String saveDraftTime;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftSaveMonitorEvent(creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", draftScene=");
        sbLIZ.append(this.draftScene);
        sbLIZ.append(", draftAwemeType=");
        sbLIZ.append(this.draftAwemeType);
        sbLIZ.append(", draftVersion=");
        sbLIZ.append(this.draftVersion);
        sbLIZ.append(", saveDraftTime=");
        sbLIZ.append(this.saveDraftTime);
        sbLIZ.append(", saveDraftAppVersion=");
        sbLIZ.append(this.saveDraftAppVersion);
        sbLIZ.append(", fileTreeInfo=");
        sbLIZ.append(this.fileTreeInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DraftSaveMonitorEvent(String str, String str2, int i, int i2, String str3, long j, String str4) {
        this.creationId = str;
        this.draftScene = str2;
        this.draftAwemeType = i;
        this.draftVersion = i2;
        this.saveDraftTime = str3;
        this.saveDraftAppVersion = j;
        this.fileTreeInfo = str4;
    }
}

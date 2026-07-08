package com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class LiveRecordingsConfigResponse {

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("show_tab")
    public final Boolean showTab;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRecordingsConfigResponse(showTab=");
        sbLIZ.append(this.showTab);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveRecordingsConfigResponse(Boolean bool, String str, Long l) {
        this.showTab = bool;
        this.coverUrl = str;
        this.createTime = l;
    }
}

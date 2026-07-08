package com.ss.android.ugc.aweme.minis.feed.instantplay.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class PreviewDirectFeedCardResponse extends BaseResponse {

    @C09CT("feed_card_info")
    public final GameCardMaterial feedCardInfo;

    @C09CT("link")
    public final String link;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("minis_status")
    public final Integer minisStatus;

    public PreviewDirectFeedCardResponse() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewDirectFeedCardResponse)) {
            return false;
        }
        PreviewDirectFeedCardResponse previewDirectFeedCardResponse = (PreviewDirectFeedCardResponse) obj;
        return Intrinsics.LJFF(this.link, previewDirectFeedCardResponse.link) && Intrinsics.LJFF(this.feedCardInfo, previewDirectFeedCardResponse.feedCardInfo) && Intrinsics.LJFF(this.minisStatus, previewDirectFeedCardResponse.minisStatus) && Intrinsics.LJFF(this.logPb, previewDirectFeedCardResponse.logPb);
    }

    public final int hashCode() {
        String str = this.link;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        GameCardMaterial gameCardMaterial = this.feedCardInfo;
        int iHashCode2 = (iHashCode + (gameCardMaterial == null ? 0 : gameCardMaterial.hashCode())) * 31;
        Integer num = this.minisStatus;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode3 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewDirectFeedCardResponse(link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", feedCardInfo=");
        sbLIZ.append(this.feedCardInfo);
        sbLIZ.append(", minisStatus=");
        sbLIZ.append(this.minisStatus);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreviewDirectFeedCardResponse(String str, GameCardMaterial gameCardMaterial, Integer num, LogPbBean logPbBean) {
        this.link = str;
        this.feedCardInfo = gameCardMaterial;
        this.minisStatus = num;
        this.logPb = logPbBean;
    }
}

package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidCollectionPanelResponse extends BaseResponse implements Serializable {

    @C09CT("creator_uid")
    public final String creatorUid;

    @C09CT("episode_list")
    public final List<PaidCollectionEpisode> episodeList;

    @C09CT("free_banner_text")
    public final String freeBannerText;

    @C09CT("short_cut_num")
    public final int shortCutNumber;

    @C09CT("total_num")
    public final int totalNum;

    public PaidCollectionPanelResponse() {
        this(null, 0, 0, "", "");
    }

    public final PaidCollectionPanelResponse copy(List<PaidCollectionEpisode> list, int i, int i2, String str, String str2) {
        return new PaidCollectionPanelResponse(list, i, i2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidCollectionPanelResponse)) {
            return false;
        }
        PaidCollectionPanelResponse paidCollectionPanelResponse = (PaidCollectionPanelResponse) obj;
        return Intrinsics.LJFF(this.episodeList, paidCollectionPanelResponse.episodeList) && this.totalNum == paidCollectionPanelResponse.totalNum && this.shortCutNumber == paidCollectionPanelResponse.shortCutNumber && Intrinsics.LJFF(this.creatorUid, paidCollectionPanelResponse.creatorUid) && Intrinsics.LJFF(this.freeBannerText, paidCollectionPanelResponse.freeBannerText);
    }

    public int hashCode() {
        List<PaidCollectionEpisode> list = this.episodeList;
        return ((((((((list == null ? 0 : list.hashCode()) * 31) + this.totalNum) * 31) + this.shortCutNumber) * 31) + this.creatorUid.hashCode()) * 31) + this.freeBannerText.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidCollectionPanelResponse(episodeList=");
        sbLIZ.append(this.episodeList);
        sbLIZ.append(", totalNum=");
        sbLIZ.append(this.totalNum);
        sbLIZ.append(", shortCutNumber=");
        sbLIZ.append(this.shortCutNumber);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.creatorUid);
        sbLIZ.append(", freeBannerText=");
        sbLIZ.append(this.freeBannerText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCreatorUid() {
        return this.creatorUid;
    }

    public final List<PaidCollectionEpisode> getEpisodeList() {
        return this.episodeList;
    }

    public final String getFreeBannerText() {
        return this.freeBannerText;
    }

    public final int getShortCutNumber() {
        return this.shortCutNumber;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public PaidCollectionPanelResponse(List<PaidCollectionEpisode> list, int i, int i2, String str, String str2) {
        this.episodeList = list;
        this.totalNum = i;
        this.shortCutNumber = i2;
        this.creatorUid = str;
        this.freeBannerText = str2;
    }
}

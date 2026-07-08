package com.ss.android.ugc.aweme.minis.feed.instantplay.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class GameCardMaterial implements Serializable {
    public static final int $stable = 8;

    @C09CT("cta_button_text_info")
    public final CtaButtonTextInfo ctaButtonTextInfo;

    @C09CT("description")
    public final String description;

    @C09CT("feed_card_id")
    public final String feedCardId;

    @C09CT("feed_card_type")
    public final Integer feedCardType;

    @C09CT("feed_subcard_info_list")
    public final List<FeedSubcardInfo> feedSubcardInfoList;

    @C09CT("title")
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameCardMaterial)) {
            return false;
        }
        GameCardMaterial gameCardMaterial = (GameCardMaterial) obj;
        return Intrinsics.LJFF(this.feedCardId, gameCardMaterial.feedCardId) && Intrinsics.LJFF(this.feedCardType, gameCardMaterial.feedCardType) && Intrinsics.LJFF(this.title, gameCardMaterial.title) && Intrinsics.LJFF(this.description, gameCardMaterial.description) && Intrinsics.LJFF(this.feedSubcardInfoList, gameCardMaterial.feedSubcardInfoList) && Intrinsics.LJFF(this.ctaButtonTextInfo, gameCardMaterial.ctaButtonTextInfo);
    }

    public int hashCode() {
        String str = this.feedCardId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.feedCardType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<FeedSubcardInfo> list = this.feedSubcardInfoList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        CtaButtonTextInfo ctaButtonTextInfo = this.ctaButtonTextInfo;
        return iHashCode5 + (ctaButtonTextInfo != null ? ctaButtonTextInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameCardMaterial(feedCardId=");
        sbLIZ.append(this.feedCardId);
        sbLIZ.append(", feedCardType=");
        sbLIZ.append(this.feedCardType);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", feedSubcardInfoList=");
        sbLIZ.append(this.feedSubcardInfoList);
        sbLIZ.append(", ctaButtonTextInfo=");
        sbLIZ.append(this.ctaButtonTextInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GameCardMaterial(String str, Integer num, String str2, String str3, List<FeedSubcardInfo> list, CtaButtonTextInfo ctaButtonTextInfo) {
        this.feedCardId = str;
        this.feedCardType = num;
        this.title = str2;
        this.description = str3;
        this.feedSubcardInfoList = list;
        this.ctaButtonTextInfo = ctaButtonTextInfo;
    }
}

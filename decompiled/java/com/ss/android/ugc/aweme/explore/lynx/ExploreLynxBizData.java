package com.ss.android.ugc.aweme.explore.lynx;

import X.C09CT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ExploreLynxBizData {

    @C09CT("background_music")
    public final ExploreLynxBackgroundMusic backgroundMusic;

    @C09CT("card_style")
    public final Integer cardStyle;

    @C09CT("explore_items")
    public final List<ExploreLynxExploreItem> exploreItems;

    @C09CT("interest_id")
    public final Long interestId;

    @C09CT("interest_name")
    public final String interestName;

    @C09CT("is_pin_topic")
    public final boolean isPinTopic;

    @C09CT("jump_url")
    public final String jumpUrl;

    @C09CT("negative_button_text")
    public final String negativeButtonText;

    @C09CT("positive_button_text")
    public final String positiveButtonText;

    @C09CT("sub_title_for_new_user")
    public final String subTitleForNewUser;

    @C09CT("title_for_new_user")
    public final String titleForNewUser;

    public ExploreLynxBizData() {
        this(null, null, null, null, null, null, null, null, false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLynxBizData)) {
            return false;
        }
        ExploreLynxBizData exploreLynxBizData = (ExploreLynxBizData) obj;
        return Intrinsics.LJFF(this.cardStyle, exploreLynxBizData.cardStyle) && Intrinsics.LJFF(this.jumpUrl, exploreLynxBizData.jumpUrl) && Intrinsics.LJFF(this.backgroundMusic, exploreLynxBizData.backgroundMusic) && Intrinsics.LJFF(this.positiveButtonText, exploreLynxBizData.positiveButtonText) && Intrinsics.LJFF(this.negativeButtonText, exploreLynxBizData.negativeButtonText) && Intrinsics.LJFF(this.titleForNewUser, exploreLynxBizData.titleForNewUser) && Intrinsics.LJFF(this.subTitleForNewUser, exploreLynxBizData.subTitleForNewUser) && Intrinsics.LJFF(this.exploreItems, exploreLynxBizData.exploreItems) && this.isPinTopic == exploreLynxBizData.isPinTopic && Intrinsics.LJFF(this.interestName, exploreLynxBizData.interestName) && Intrinsics.LJFF(this.interestId, exploreLynxBizData.interestId);
    }

    public final int hashCode() {
        Integer num = this.cardStyle;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.jumpUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExploreLynxBackgroundMusic exploreLynxBackgroundMusic = this.backgroundMusic;
        int iHashCode3 = (iHashCode2 + (exploreLynxBackgroundMusic == null ? 0 : exploreLynxBackgroundMusic.hashCode())) * 31;
        String str2 = this.positiveButtonText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.negativeButtonText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleForNewUser;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subTitleForNewUser;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<ExploreLynxExploreItem> list = this.exploreItems;
        int iHashCode8 = (((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.isPinTopic)) * 31;
        String str6 = this.interestName;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.interestId;
        return iHashCode9 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "ExploreLynxBizData(cardStyle=" + this.cardStyle + ", jumpUrl=" + this.jumpUrl + ", backgroundMusic=" + this.backgroundMusic + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", titleForNewUser=" + this.titleForNewUser + ", subTitleForNewUser=" + this.subTitleForNewUser + ", exploreItems=" + this.exploreItems + ", isPinTopic=" + this.isPinTopic + ", interestName=" + this.interestName + ", interestId=" + this.interestId + ')';
    }

    public ExploreLynxBizData(Integer num, String str, ExploreLynxBackgroundMusic exploreLynxBackgroundMusic, String str2, String str3, String str4, String str5, List<ExploreLynxExploreItem> list, boolean z, String str6, Long l) {
        this.cardStyle = num;
        this.jumpUrl = str;
        this.backgroundMusic = exploreLynxBackgroundMusic;
        this.positiveButtonText = str2;
        this.negativeButtonText = str3;
        this.titleForNewUser = str4;
        this.subTitleForNewUser = str5;
        this.exploreItems = list;
        this.isPinTopic = z;
        this.interestName = str6;
        this.interestId = l;
    }
}

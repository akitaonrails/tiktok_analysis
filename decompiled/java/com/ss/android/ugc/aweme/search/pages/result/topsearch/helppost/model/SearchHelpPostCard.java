package com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.model;

import X.C09CT;
import X.C0Q6Z;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHelpPostCard implements Serializable {

    @C09CT("background")
    public final TuxImageModel backGround;

    @C09CT("show_cursor")
    public int cardShowCursor;

    @C09CT("card_type")
    public final int cardUIStyle;

    @C09CT("demand_type")
    public final String demandType;

    @C09CT("edit_page_style")
    public int editPageStyle;

    @C09CT("disable_subtitle")
    public final boolean isDisableSubtitle;

    @C09CT("post_button_config")
    public final SearchHelpPostCardUIStyle postBtnConfig;

    @C09CT("post_button_text")
    public final String postBtnText;

    @C09CT("question")
    public final String question;

    @C09CT("question_config")
    public final SearchHelpPostCardUIStyle questionConfig;

    @C09CT("question_tips")
    public final String questionTips;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    @C09CT("title_config")
    public final SearchHelpPostCardUIStyle titleConfig;
    public static final C0Q6Z Companion = new Object() { // from class: X.0Q6Z
    };
    public static final int $stable = 8;

    public SearchHelpPostCard() {
        this(null, "", "", "", "", "", 0, 0, 0, null, null, null, false, "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHelpPostCard)) {
            return false;
        }
        SearchHelpPostCard searchHelpPostCard = (SearchHelpPostCard) obj;
        return Intrinsics.LJFF(this.backGround, searchHelpPostCard.backGround) && Intrinsics.LJFF(this.title, searchHelpPostCard.title) && Intrinsics.LJFF(this.subtitle, searchHelpPostCard.subtitle) && Intrinsics.LJFF(this.question, searchHelpPostCard.question) && Intrinsics.LJFF(this.postBtnText, searchHelpPostCard.postBtnText) && Intrinsics.LJFF(this.demandType, searchHelpPostCard.demandType) && this.cardUIStyle == searchHelpPostCard.cardUIStyle && this.cardShowCursor == searchHelpPostCard.cardShowCursor && this.editPageStyle == searchHelpPostCard.editPageStyle && Intrinsics.LJFF(this.titleConfig, searchHelpPostCard.titleConfig) && Intrinsics.LJFF(this.questionConfig, searchHelpPostCard.questionConfig) && Intrinsics.LJFF(this.postBtnConfig, searchHelpPostCard.postBtnConfig) && this.isDisableSubtitle == searchHelpPostCard.isDisableSubtitle && Intrinsics.LJFF(this.questionTips, searchHelpPostCard.questionTips);
    }

    public int hashCode() {
        TuxImageModel tuxImageModel = this.backGround;
        int iHashCode = (tuxImageModel == null ? 0 : tuxImageModel.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.question;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postBtnText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.demandType;
        int iHashCode6 = (((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.cardUIStyle) * 31) + this.cardShowCursor) * 31) + this.editPageStyle) * 31;
        SearchHelpPostCardUIStyle searchHelpPostCardUIStyle = this.titleConfig;
        int iHashCode7 = (iHashCode6 + (searchHelpPostCardUIStyle == null ? 0 : searchHelpPostCardUIStyle.hashCode())) * 31;
        SearchHelpPostCardUIStyle searchHelpPostCardUIStyle2 = this.questionConfig;
        int iHashCode8 = (iHashCode7 + (searchHelpPostCardUIStyle2 == null ? 0 : searchHelpPostCardUIStyle2.hashCode())) * 31;
        SearchHelpPostCardUIStyle searchHelpPostCardUIStyle3 = this.postBtnConfig;
        int iHashCode9 = (((iHashCode8 + (searchHelpPostCardUIStyle3 == null ? 0 : searchHelpPostCardUIStyle3.hashCode())) * 31) + C786410Ut5.Z2(this.isDisableSubtitle)) * 31;
        String str6 = this.questionTips;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isDefaultUIStyle() {
        return this.cardUIStyle == 0;
    }

    public final boolean isDisableSubtitle() {
        return this.isDisableSubtitle;
    }

    public final void setCardShowCursor(int i) {
        this.cardShowCursor = i;
    }

    public final void setEditPageStyle(int i) {
        this.editPageStyle = i;
    }

    public SearchHelpPostCard(TuxImageModel tuxImageModel, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, SearchHelpPostCardUIStyle searchHelpPostCardUIStyle, SearchHelpPostCardUIStyle searchHelpPostCardUIStyle2, SearchHelpPostCardUIStyle searchHelpPostCardUIStyle3, boolean z, String str6) {
        this.backGround = tuxImageModel;
        this.title = str;
        this.subtitle = str2;
        this.question = str3;
        this.postBtnText = str4;
        this.demandType = str5;
        this.cardUIStyle = i;
        this.cardShowCursor = i2;
        this.editPageStyle = i3;
        this.titleConfig = searchHelpPostCardUIStyle;
        this.questionConfig = searchHelpPostCardUIStyle2;
        this.postBtnConfig = searchHelpPostCardUIStyle3;
        this.isDisableSubtitle = z;
        this.questionTips = str6;
    }
}

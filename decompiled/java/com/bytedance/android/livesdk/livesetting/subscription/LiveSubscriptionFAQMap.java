package com.bytedance.android.livesdk.livesetting.subscription;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSubscriptionFAQMap {
    public final String courseCreatorTerm;
    public final String courseTermOfSalePopup;
    public final String creatorFaqCategory;
    public final String creatorFaqCategoryPopup;
    public final String emotePollFaq;
    public final JSONObject jsonObject;
    public final String liveBoardFAQPage;
    public final String planChangeFaq;
    public final String servicePlusToolsAccessTerm;
    public final String smbDisclaimerUseCaution;
    public final String smbFaqFullScreen;
    public final String smbFaqHalfScreen;
    public final String smbRevenueShareFaq;
    public final String subPlanChangeFaq;
    public final String userFaqCategory;
    public final String userFaqCategoryPopup;

    public final String getCourseCreatorTermsSchema() {
        return this.courseCreatorTerm;
    }

    public final String getCourseTermOfSalePopup() {
        return this.courseTermOfSalePopup;
    }

    public final String getEmotePollFaq() {
        return this.emotePollFaq;
    }

    public final String getSmbRevenueShareFaq() {
        return this.smbRevenueShareFaq;
    }

    public final String getSubPlanChangeFaq() {
        return this.subPlanChangeFaq;
    }

    public LiveSubscriptionFAQMap(String str) {
        JSONObject jSONObject;
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        this.jsonObject = jSONObject;
        this.planChangeFaq = jSONObject.optString("plan_change_faq", "");
        this.userFaqCategory = jSONObject.optString("user_faq_category", "");
        this.userFaqCategoryPopup = jSONObject.optString("user_faq_category_popup", "");
        this.creatorFaqCategory = jSONObject.optString("creator_faq_category", "");
        this.creatorFaqCategoryPopup = jSONObject.optString("creator_faq_category_popup", "");
        this.liveBoardFAQPage = jSONObject.optString("board_faq", "");
        this.smbFaqHalfScreen = jSONObject.optString("smb_faq_halfscreen", "");
        this.smbFaqFullScreen = jSONObject.optString("smb_faq", "");
        this.courseTermOfSalePopup = jSONObject.optString("smb_course_terms_of_sale_popup", "");
        this.courseCreatorTerm = jSONObject.optString("smb_course_creator_terms", "");
        this.smbDisclaimerUseCaution = jSONObject.optString("smb_use_caution_faq", "");
        this.servicePlusToolsAccessTerm = jSONObject.optString("service-plus-tools-access-terms", "aweme://roma_redirect/?spark_page=smb-tools-access-faq");
        this.emotePollFaq = jSONObject.optString("emote_poll_faq_halfscreen", "");
        this.subPlanChangeFaq = jSONObject.optString("plan_change_faq", "");
        this.smbRevenueShareFaq = jSONObject.optString("smb_revenue_share_faq", "");
    }

    public final String getCreatorFaq(String str) {
        return String.valueOf(UriProtector.parse(this.creatorFaqCategory).buildUpon().appendQueryParameter("show_entrance", str).build());
    }

    public final String getLiveBoardFAQPage(String str) {
        return String.valueOf(UriProtector.parse(this.liveBoardFAQPage).buildUpon().appendQueryParameter("show_entrance", str).build());
    }

    public final String getServicePlusToolsAccessTerm(String str) {
        return String.valueOf(UriProtector.parse(this.servicePlusToolsAccessTerm).buildUpon().appendQueryParameter("show_entrance", str).build());
    }

    public final String getSmbDisclaimerUseCaution(String str) {
        return String.valueOf(UriProtector.parse(this.smbDisclaimerUseCaution).buildUpon().appendQueryParameter("show_entrance", str).build());
    }

    public final String getUserFaqPopup(String str) {
        return String.valueOf(UriProtector.parse(this.userFaqCategoryPopup).buildUpon().appendQueryParameter("show_entrance", str).build());
    }

    public final String getSmbOptinFaq(String str, String str2, String str3, boolean z, String str4, boolean z2, boolean z3) {
        String str5;
        String str6;
        if (z2) {
            str5 = this.smbFaqFullScreen;
        } else {
            str5 = this.smbFaqHalfScreen;
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str5).buildUpon().appendQueryParameter("show_entrance", str).appendQueryParameter("user_id", str3).appendQueryParameter("anchor_id", str2);
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_viewer", str6).appendQueryParameter("previous_page", str4);
        if (z3) {
            builderAppendQueryParameter2.appendQueryParameter("always_show_mask", "1");
            builderAppendQueryParameter2.appendQueryParameter("mask_bg_color", "0000007F");
        }
        return String.valueOf(builderAppendQueryParameter2.build());
    }
}

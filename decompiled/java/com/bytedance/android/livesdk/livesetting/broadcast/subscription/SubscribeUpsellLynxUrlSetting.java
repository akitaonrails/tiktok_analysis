package com.bytedance.android.livesdk.livesetting.broadcast.subscription;

import X.C500260Jjc;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_upsell_url")
public final class SubscribeUpsellLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final SubscribeUpsellLynxUrlSetting INSTANCE;
    public static final String boardDecorationAuditStatus;
    public static final String boardDecorationAuditStatusLive;
    public static final String dmOneStopShopPopup;
    public static final String smbAnchorMyServicePage;
    public static final String smbIndustryBlock;
    public static final String smbIndustrySelection;
    public static final String smbKycKybGuidance;
    public static final String smbManagementPage;
    public static final String smbModeratorPinCardView;
    public static final String smbOptInNotQualifiedSheet;
    public static final String smbOptInServiceEnable;
    public static final String smbOptInVerify;
    public static final int subPinCardActiveTimeSeconds;
    public static final String upsellContentUnavailable;
    public static final String upsellMainPage;
    public static final String upsellManagementLive;
    public static final String upsellOptinPage;
    public static final String upsellPinCard;

    static {
        SubscribeUpsellLynxUrlSetting subscribeUpsellLynxUrlSetting = new SubscribeUpsellLynxUrlSetting();
        INSTANCE = subscribeUpsellLynxUrlSetting;
        upsellPinCard = subscribeUpsellLynxUrlSetting.getValue().optString("upsell_pin_card", "");
        upsellOptinPage = subscribeUpsellLynxUrlSetting.getValue().optString("upsell_opt_in", "");
        upsellMainPage = subscribeUpsellLynxUrlSetting.getValue().optString("upsell_management", "");
        upsellManagementLive = subscribeUpsellLynxUrlSetting.getValue().optString("upsell_management_live", "");
        upsellContentUnavailable = subscribeUpsellLynxUrlSetting.getValue().optString("content_topic_not_available", "");
        dmOneStopShopPopup = subscribeUpsellLynxUrlSetting.getValue().optString("DM_one_stop_shop_popup", "");
        subPinCardActiveTimeSeconds = subscribeUpsellLynxUrlSetting.getValue().optInt("upsell_pin_card_active_time_seconds", 30);
        boardDecorationAuditStatus = subscribeUpsellLynxUrlSetting.getValue().optString("boards_audit_status", "");
        boardDecorationAuditStatusLive = subscribeUpsellLynxUrlSetting.getValue().optString("boards_audit_status_live", "");
        smbIndustrySelection = subscribeUpsellLynxUrlSetting.getValue().optString("content_topic_select", "");
        smbIndustryBlock = subscribeUpsellLynxUrlSetting.getValue().optString("content_topic_not_available", "");
        smbManagementPage = subscribeUpsellLynxUrlSetting.getValue().optString("smb_service_management", "");
        smbAnchorMyServicePage = subscribeUpsellLynxUrlSetting.getValue().optString("smb_service_management_live_room", "");
        smbOptInNotQualifiedSheet = subscribeUpsellLynxUrlSetting.getValue().optString("condition_popup", "");
        smbOptInServiceEnable = subscribeUpsellLynxUrlSetting.getValue().optString("smb_opt_in_service_enable", "");
        smbOptInVerify = subscribeUpsellLynxUrlSetting.getValue().optString("smb_opt_in_verify", "aweme://roma_redirect/?spark_page=smb-opt-in-verify");
        smbKycKybGuidance = subscribeUpsellLynxUrlSetting.getValue().optString("service_plus_verification_popup", "");
        smbModeratorPinCardView = subscribeUpsellLynxUrlSetting.getValue().optString("smb_moderator_pin_card", "");
    }

    public final JSONObject getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_subscription_upsell_url", DEFAULT);
        if (TextUtils.isEmpty(stringValue)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(stringValue);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public final String getBoardDecorationAuditStatus() {
        return boardDecorationAuditStatus;
    }

    public final String getBoardDecorationAuditStatusLive() {
        return boardDecorationAuditStatusLive;
    }

    public final String getDmOneStopShopPopup() {
        return dmOneStopShopPopup;
    }

    public final int getSubPinCardActiveTimeSeconds() {
        return subPinCardActiveTimeSeconds;
    }

    public final String getUpsellContentUnavailable() {
        return upsellContentUnavailable;
    }

    public final String getUpsellMainPage() {
        return upsellMainPage;
    }

    public final String getUpsellManagementLive() {
        return upsellManagementLive;
    }

    public final String getUpsellOptinPage() {
        return upsellOptinPage;
    }

    public final String getUpsellPinCard() {
        return upsellPinCard;
    }

    public final String getSMBOptInNotQualifiedSheet(String str, String str2, String str3) {
        String strValueOf = "";
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(smbOptInNotQualifiedSheet).buildUpon().appendQueryParameter("show_entrance", str2).appendQueryParameter("business_type", str);
            if (str3 == null) {
                str3 = "";
            }
            strValueOf = String.valueOf(builderAppendQueryParameter.appendQueryParameter("anchor_id", str3).build());
            return strValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strValueOf;
        }
    }

    public final String getSmbKycKybVerificationGuidance(String str, String str2, int i, int i2) {
        try {
            return String.valueOf(UriProtector.parse(smbKycKybGuidance).buildUpon().appendQueryParameter("anchor_id", str).appendQueryParameter("enter_from", str2).appendQueryParameter("verify_status_kyc", String.valueOf(i)).appendQueryParameter("verify_status_kyb", String.valueOf(i2)).build());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String getSmbOptInVerify(String str, String str2, String str3, Function1<? super Uri.Builder, Unit> function1) {
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(smbOptInVerify).buildUpon().appendQueryParameter("show_entrance", str).appendQueryParameter("upsell_source_page", str).appendQueryParameter("is_from_opt_in", str3).appendQueryParameter("user_id", str2).appendQueryParameter("enter_from", "verification_warning_page");
            function1.invoke(builderAppendQueryParameter);
            return String.valueOf(builderAppendQueryParameter.build());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String getSmbAnchorServicePage(String str, String str2, String str3, String str4, String str5) {
        try {
            return String.valueOf(UriProtector.parse(smbAnchorMyServicePage).buildUpon().appendQueryParameter("show_entrance", str).appendQueryParameter("user_id", str3).appendQueryParameter("anchor_id", str2).appendQueryParameter("sec_anchor_id", str4).appendQueryParameter("upsell_source_page", str).appendQueryParameter("locate_to", str5).build());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String getSmbOptInServiceEnableSchema(String str, String str2, String str3, String str4, Function1<? super Uri.Builder, Unit> function1) {
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(smbOptInServiceEnable).buildUpon().appendQueryParameter("skip_industry_selection", str2).appendQueryParameter("is_from_smb_opt_in", str3).appendQueryParameter("show_entrance", str).appendQueryParameter("pcs_track_context", str4);
            function1.invoke(builderAppendQueryParameter);
            return String.valueOf(builderAppendQueryParameter.build());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String getModeratorPinCardViewSchema(String str, String str2, String str3, String str4, String str5, Function1<? super Uri.Builder, Unit> function1) {
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(smbModeratorPinCardView).buildUpon().appendQueryParameter("room_id", str4).appendQueryParameter("user_id", str3).appendQueryParameter("show_entrance", str).appendQueryParameter("anchor_id", str2).appendQueryParameter("sec_anchor_id", str5).appendQueryParameter("user_type", "moderator");
            function1.invoke(builderAppendQueryParameter);
            return String.valueOf(builderAppendQueryParameter.build());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String getSmbIndustrySelection(String str, String str2, String str3, boolean z, boolean z2, String str4, Function1<? super Uri.Builder, Unit> function1) {
        String str5;
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(smbIndustrySelection).buildUpon().appendQueryParameter("show_entrance", str).appendQueryParameter("user_id", str3).appendQueryParameter("anchor_id", str2);
            String str6 = "1";
            if (z) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_from_smb", str5);
            if (!z2) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("is_from_smb_opt_in", str6).appendQueryParameter("pcs_track_context", str4);
            function1.invoke(builderAppendQueryParameter3);
            return String.valueOf(builderAppendQueryParameter3.build());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final String getSmbIndustryBlockPage(String str, String str2, String str3, boolean z, boolean z2, Boolean bool, String str4, String str5) {
        String str6;
        String string;
        String strValueOf = "";
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(smbIndustryBlock).buildUpon().appendQueryParameter("show_entrance", str).appendQueryParameter("user_id", str3).appendQueryParameter("anchor_id", str2);
            String str7 = "1";
            if (z) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_from_smb", str6);
            if (!z2) {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("is_from_smb_opt_in", str7).appendQueryParameter("upsell_source_page", str).appendQueryParameter("pcs_track_context", str4);
            if (bool != null) {
                string = Integer.valueOf(C500260Jjc.LJJJI(bool) ? 1 : 0).toString();
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            strValueOf = String.valueOf(builderAppendQueryParameter3.appendQueryParameter("revocation_restored", string).appendQueryParameter("business_type", str5).build());
            return strValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strValueOf;
        }
    }

    public final String getSmbManagementPage(String str, String str2, String str3, String str4, boolean z, String str5, String str6, boolean z2) {
        String str7;
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(smbManagementPage).buildUpon().appendQueryParameter("show_entrance", str).appendQueryParameter("user_id", str4).appendQueryParameter("anchor_id", str2).appendQueryParameter("upsell_source_page", str).appendQueryParameter("show_verification_popup", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0)).appendQueryParameter("pcs_track_context", str5).appendQueryParameter("sec_anchor_id", str3).appendQueryParameter("scroll_to", str6);
            if (z2) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            return String.valueOf(builderAppendQueryParameter.appendQueryParameter("skip_redirect", str7).build());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}

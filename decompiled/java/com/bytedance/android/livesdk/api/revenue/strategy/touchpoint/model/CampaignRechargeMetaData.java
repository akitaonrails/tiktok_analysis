package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.InterfaceC1151250g43;
import android.text.Spannable;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.FirstRechargeModel;
import webcast.data.RechargeBannerModel;
import webcast.data.TPClickableText;
import webcast.data.TPText;
import webcast.data.TouchPointBackground;
import webcast.data.TouchPointTitle;

/* JADX INFO: loaded from: classes18.dex */
public final class CampaignRechargeMetaData implements InterfaceC1151250g43 {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("activity_banner")
    public final FirstRechargeModel.ActivityBanner activityBanner;

    @C09CT("bottom_area")
    public final FirstRechargeModel.BottomArea bottomArea;

    @C09CT("exchange_banner_list")
    public final FirstRechargeModel.RechargeBannerListConfig exchangeBannerList;

    @C09CT("exchange_activity_banner_list")
    public final List<FirstRechargeModel.RechargeActivityBanner> exchangeBanners;

    @C09CT("exchange_button_text")
    public final Text exchangeButton;

    @C09CT("exchange_disclaimer")
    public final TPText exchangeDisclaimerText;

    @C09CT("panel_background")
    public final TouchPointBackground panelBg;

    @C09CT("recharge_banner")
    public final FirstRechargeModel.RechargeBanner rechargeBannerConfig;

    @C09CT("recharge_banner_list")
    public final FirstRechargeModel.RechargeBannerListConfig rechargeBannerList;

    @C09CT("recharge_activity_banner_list")
    public final List<FirstRechargeModel.RechargeActivityBanner> rechargeBanners;

    @C09CT("recharge_button_text")
    public final Text rechargeButton;

    @C09CT("recharge_dialog_banner")
    public final RechargeBannerModel rechargeDialogBanner;

    @C09CT("recharge_disclaimer")
    public final TPText rechargeDisclaimerText;

    @C09CT("sub_title")
    public final TouchPointTitle subTitle;

    @C09CT("title")
    public final TouchPointTitle title;

    @Override // X.InterfaceC1151250g43
    public final TPClickableText LJII() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignRechargeMetaData)) {
            return false;
        }
        CampaignRechargeMetaData campaignRechargeMetaData = (CampaignRechargeMetaData) obj;
        return Intrinsics.LJFF(this.title, campaignRechargeMetaData.title) && Intrinsics.LJFF(this.panelBg, campaignRechargeMetaData.panelBg) && Intrinsics.LJFF(this.subTitle, campaignRechargeMetaData.subTitle) && Intrinsics.LJFF(this.bottomArea, campaignRechargeMetaData.bottomArea) && Intrinsics.LJFF(this.activityBanner, campaignRechargeMetaData.activityBanner) && Intrinsics.LJFF(this.rechargeBanners, campaignRechargeMetaData.rechargeBanners) && Intrinsics.LJFF(this.exchangeBanners, campaignRechargeMetaData.exchangeBanners) && Intrinsics.LJFF(this.rechargeDialogBanner, campaignRechargeMetaData.rechargeDialogBanner) && Intrinsics.LJFF(this.rechargeBannerConfig, campaignRechargeMetaData.rechargeBannerConfig) && Intrinsics.LJFF(this.rechargeBannerList, campaignRechargeMetaData.rechargeBannerList) && Intrinsics.LJFF(this.exchangeBannerList, campaignRechargeMetaData.exchangeBannerList) && Intrinsics.LJFF(this.rechargeButton, campaignRechargeMetaData.rechargeButton) && Intrinsics.LJFF(this.exchangeButton, campaignRechargeMetaData.exchangeButton) && Intrinsics.LJFF(this.rechargeDisclaimerText, campaignRechargeMetaData.rechargeDisclaimerText) && Intrinsics.LJFF(this.exchangeDisclaimerText, campaignRechargeMetaData.exchangeDisclaimerText);
    }

    public final int hashCode() {
        TouchPointTitle touchPointTitle = this.title;
        int iHashCode = (touchPointTitle == null ? 0 : touchPointTitle.hashCode()) * 31;
        TouchPointBackground touchPointBackground = this.panelBg;
        int iHashCode2 = (iHashCode + (touchPointBackground == null ? 0 : touchPointBackground.hashCode())) * 31;
        TouchPointTitle touchPointTitle2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (touchPointTitle2 == null ? 0 : touchPointTitle2.hashCode())) * 31;
        FirstRechargeModel.BottomArea bottomArea = this.bottomArea;
        int iHashCode4 = (iHashCode3 + (bottomArea == null ? 0 : bottomArea.hashCode())) * 31;
        FirstRechargeModel.ActivityBanner activityBanner = this.activityBanner;
        int iHashCode5 = (iHashCode4 + (activityBanner == null ? 0 : activityBanner.hashCode())) * 31;
        List<FirstRechargeModel.RechargeActivityBanner> list = this.rechargeBanners;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<FirstRechargeModel.RechargeActivityBanner> list2 = this.exchangeBanners;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        RechargeBannerModel rechargeBannerModel = this.rechargeDialogBanner;
        int iHashCode8 = (iHashCode7 + (rechargeBannerModel == null ? 0 : rechargeBannerModel.hashCode())) * 31;
        FirstRechargeModel.RechargeBanner rechargeBanner = this.rechargeBannerConfig;
        int iHashCode9 = (iHashCode8 + (rechargeBanner == null ? 0 : rechargeBanner.hashCode())) * 31;
        FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfig = this.rechargeBannerList;
        int iHashCode10 = (iHashCode9 + (rechargeBannerListConfig == null ? 0 : rechargeBannerListConfig.hashCode())) * 31;
        FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfig2 = this.exchangeBannerList;
        int iHashCode11 = (iHashCode10 + (rechargeBannerListConfig2 == null ? 0 : rechargeBannerListConfig2.hashCode())) * 31;
        Text text = this.rechargeButton;
        int iHashCode12 = (iHashCode11 + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.exchangeButton;
        int iHashCode13 = (iHashCode12 + (text2 == null ? 0 : text2.hashCode())) * 31;
        TPText tPText = this.rechargeDisclaimerText;
        int iHashCode14 = (iHashCode13 + (tPText == null ? 0 : tPText.hashCode())) * 31;
        TPText tPText2 = this.exchangeDisclaimerText;
        return iHashCode14 + (tPText2 != null ? tPText2.hashCode() : 0);
    }

    public final String toString() {
        return "CampaignRechargeMetaData(title=" + this.title + ", panelBg=" + this.panelBg + ", subTitle=" + this.subTitle + ", bottomArea=" + this.bottomArea + ", activityBanner=" + this.activityBanner + ", rechargeBanners=" + this.rechargeBanners + ", exchangeBanners=" + this.exchangeBanners + ", rechargeDialogBanner=" + this.rechargeDialogBanner + ", rechargeBannerConfig=" + this.rechargeBannerConfig + ", rechargeBannerList=" + this.rechargeBannerList + ", exchangeBannerList=" + this.exchangeBannerList + ", rechargeButton=" + this.rechargeButton + ", exchangeButton=" + this.exchangeButton + ", rechargeDisclaimerText=" + this.rechargeDisclaimerText + ", exchangeDisclaimerText=" + this.exchangeDisclaimerText + ')';
    }

    @Override // X.InterfaceC1151250g43
    public final TouchPointBackground LJFF() {
        FirstRechargeModel.BottomArea bottomArea = this.bottomArea;
        if (bottomArea != null) {
            return bottomArea.background;
        }
        return null;
    }

    @Override // X.InterfaceC1151250g43
    public final FirstRechargeModel.RechargeBanner LIZLLL() {
        return this.rechargeBannerConfig;
    }

    @Override // X.InterfaceC1151250g43
    public final TPText LJ() {
        return this.rechargeDisclaimerText;
    }

    @Override // X.InterfaceC1151250g43
    public final TPText LJI() {
        return this.exchangeDisclaimerText;
    }

    @Override // X.InterfaceC1151250g43
    public final FirstRechargeModel.RechargeBannerListConfig LIZ(boolean z) {
        if (z) {
            return this.rechargeBannerList;
        }
        return this.exchangeBannerList;
    }

    @Override // X.InterfaceC1151250g43
    public final Spannable LIZIZ(int i, String str) {
        Text text = this.rechargeButton;
        if (text != null) {
            return LJIIIIZZ(text, i, str);
        }
        return null;
    }

    @Override // X.InterfaceC1151250g43
    public final Spannable LIZJ(int i, String str) {
        Text text = this.exchangeButton;
        if (text != null) {
            return LJIIIIZZ(text, i, str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Spannable LJIIIIZZ(com.bytedance.android.livesdk.model.message.common.Text r5, int r6, java.lang.String r7) {
        /*
            com.google.gson.Gson r2 = X.C19748512Ol.LIZJ
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r2, r5)
            java.lang.Class<com.bytedance.android.livesdk.model.message.common.Text> r0 = com.bytedance.android.livesdk.model.message.common.Text.class
            java.lang.Object r5 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            com.bytedance.android.livesdk.model.message.common.Text r5 = (com.bytedance.android.livesdk.model.message.common.Text) r5
            java.lang.String r1 = r5.key
            r4 = 0
            if (r1 == 0) goto L52
            X.0fNV r0 = X.C1124870fNV.LIZJ()
            r0.getClass()
            java.lang.String r0 = X.C1124870fNV.LIZIZ(r1)
            boolean r0 = X.C500260Jjc.LJJIIZ(r0)
            if (r0 == 0) goto L52
            X.0fNV r0 = X.C1124870fNV.LIZJ()
            r0.getClass()
            java.lang.String r3 = X.C1124870fNV.LIZIZ(r1)
            if (r3 == 0) goto L52
        L31:
            java.util.List<com.bytedance.android.livesdk.model.message.common.TextPiece> r0 = r5.pieces
            if (r0 == 0) goto L55
            java.util.Iterator r2 = r0.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.next()
            com.bytedance.android.livesdk.model.message.common.TextPiece r1 = (com.bytedance.android.livesdk.model.message.common.TextPiece) r1
            java.lang.String r0 = r1.stringValue
            if (r0 == 0) goto L50
            java.lang.String r0 = X.C1146930fx5.LIZ(r6, r0, r7)
        L4d:
            r1.stringValue = r0
            goto L39
        L50:
            r0 = r4
            goto L4d
        L52:
            java.lang.String r3 = r5.defaultPattern
            goto L31
        L55:
            if (r3 == 0) goto L60
            java.lang.String r0 = X.C1146930fx5.LIZ(r6, r3, r7)
        L5b:
            android.text.Spannable r0 = X.C1133830fbx.LJIILJJIL(r0, r5, r4)
            return r0
        L60:
            r0 = r4
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.CampaignRechargeMetaData.LJIIIIZZ(com.bytedance.android.livesdk.model.message.common.Text, int, java.lang.String):android.text.Spannable");
    }

    public CampaignRechargeMetaData(TouchPointTitle touchPointTitle, TouchPointBackground touchPointBackground, TouchPointTitle touchPointTitle2, FirstRechargeModel.BottomArea bottomArea, FirstRechargeModel.ActivityBanner activityBanner, List<FirstRechargeModel.RechargeActivityBanner> list, List<FirstRechargeModel.RechargeActivityBanner> list2, RechargeBannerModel rechargeBannerModel, FirstRechargeModel.RechargeBanner rechargeBanner, FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfig, FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfig2, Text text, Text text2, TPText tPText, TPText tPText2) {
        this.title = touchPointTitle;
        this.panelBg = touchPointBackground;
        this.subTitle = touchPointTitle2;
        this.bottomArea = bottomArea;
        this.activityBanner = activityBanner;
        this.rechargeBanners = list;
        this.exchangeBanners = list2;
        this.rechargeDialogBanner = rechargeBannerModel;
        this.rechargeBannerConfig = rechargeBanner;
        this.rechargeBannerList = rechargeBannerListConfig;
        this.exchangeBannerList = rechargeBannerListConfig2;
        this.rechargeButton = text;
        this.exchangeButton = text2;
        this.rechargeDisclaimerText = tPText;
        this.exchangeDisclaimerText = tPText2;
    }
}

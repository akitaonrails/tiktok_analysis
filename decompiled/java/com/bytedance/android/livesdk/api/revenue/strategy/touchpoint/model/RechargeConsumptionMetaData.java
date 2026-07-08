package com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model;

import X.C09CT;
import X.C1121510fI5;
import X.C2188811AlT;
import X.InterfaceC1151250g43;
import android.text.Spannable;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.FirstRechargeModel;
import webcast.data.TPActivityArea;
import webcast.data.TPClickableText;
import webcast.data.TPConsumptionArea;
import webcast.data.TPRechargeArea;
import webcast.data.TPText;
import webcast.data.TouchPointBackground;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeConsumptionMetaData implements InterfaceC1151250g43 {
    public static final C1121510fI5 LIZ = new Object() { // from class: X.0fI5
    };

    @C09CT("activity_area")
    public final TPActivityArea activityArea;

    @C09CT("consumption_area")
    public final TPConsumptionArea consumptionArea;

    @C09CT("exchange_disclaimer")
    public final TPText exchangeDisclaimerText;

    @C09CT("recharge_area")
    public final TPRechargeArea rechargeArea;

    @C09CT("recharge_disclaimer")
    public final TPText rechargeDisclaimerText;

    public RechargeConsumptionMetaData() {
        this(null, null, null, null, null);
    }

    @Override // X.InterfaceC1151250g43
    public final Spannable LIZJ(int i, String str) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RechargeConsumptionMetaData)) {
            return false;
        }
        RechargeConsumptionMetaData rechargeConsumptionMetaData = (RechargeConsumptionMetaData) obj;
        return Intrinsics.LJFF(this.activityArea, rechargeConsumptionMetaData.activityArea) && Intrinsics.LJFF(this.rechargeArea, rechargeConsumptionMetaData.rechargeArea) && Intrinsics.LJFF(this.consumptionArea, rechargeConsumptionMetaData.consumptionArea) && Intrinsics.LJFF(this.rechargeDisclaimerText, rechargeConsumptionMetaData.rechargeDisclaimerText) && Intrinsics.LJFF(this.exchangeDisclaimerText, rechargeConsumptionMetaData.exchangeDisclaimerText);
    }

    public final int hashCode() {
        TPActivityArea tPActivityArea = this.activityArea;
        int iHashCode = (tPActivityArea == null ? 0 : tPActivityArea.hashCode()) * 31;
        TPRechargeArea tPRechargeArea = this.rechargeArea;
        int iHashCode2 = (iHashCode + (tPRechargeArea == null ? 0 : tPRechargeArea.hashCode())) * 31;
        TPConsumptionArea tPConsumptionArea = this.consumptionArea;
        int iHashCode3 = (iHashCode2 + (tPConsumptionArea == null ? 0 : tPConsumptionArea.hashCode())) * 31;
        TPText tPText = this.rechargeDisclaimerText;
        int iHashCode4 = (iHashCode3 + (tPText == null ? 0 : tPText.hashCode())) * 31;
        TPText tPText2 = this.exchangeDisclaimerText;
        return iHashCode4 + (tPText2 != null ? tPText2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargeConsumptionMetaData(activityArea=");
        sbLIZ.append(this.activityArea);
        sbLIZ.append(", rechargeArea=");
        sbLIZ.append(this.rechargeArea);
        sbLIZ.append(", consumptionArea=");
        sbLIZ.append(this.consumptionArea);
        sbLIZ.append(", rechargeDisclaimerText=");
        sbLIZ.append(this.rechargeDisclaimerText);
        sbLIZ.append(", exchangeDisclaimerText=");
        sbLIZ.append(this.exchangeDisclaimerText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1151250g43
    public final FirstRechargeModel.RechargeBanner LIZLLL() {
        TPRechargeArea tPRechargeArea = this.rechargeArea;
        if (tPRechargeArea == null) {
            return null;
        }
        FirstRechargeModel.RechargeBanner rechargeBanner = new FirstRechargeModel.RechargeBanner();
        FirstRechargeModel.RechargeBannerListConfig rechargeBannerListConfig = tPRechargeArea.rechargePackageList;
        rechargeBanner.borderRadius = rechargeBannerListConfig != null ? rechargeBannerListConfig.borderRadius : 0.0f;
        TouchPointBackground touchPointBackground = tPRechargeArea.packageListBackground;
        rechargeBanner.backgroundColor = touchPointBackground != null ? touchPointBackground.color : null;
        return rechargeBanner;
    }

    @Override // X.InterfaceC1151250g43
    public final TouchPointBackground LJFF() {
        TPRechargeArea tPRechargeArea = this.rechargeArea;
        if (tPRechargeArea != null) {
            return tPRechargeArea.bottomBackground;
        }
        return null;
    }

    @Override // X.InterfaceC1151250g43
    public final TPClickableText LJII() {
        TPRechargeArea tPRechargeArea = this.rechargeArea;
        if (tPRechargeArea != null) {
            return tPRechargeArea.exchangeText;
        }
        return null;
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
        TPRechargeArea tPRechargeArea = this.rechargeArea;
        if (tPRechargeArea != null) {
            return tPRechargeArea.rechargePackageList;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // X.InterfaceC1151250g43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Spannable LIZIZ(int r6, java.lang.String r7) {
        /*
            r5 = this;
            webcast.data.TPRechargeArea r0 = r5.rechargeArea
            r1 = 0
            if (r0 == 0) goto L61
            webcast.data.TPText r0 = r0.buttonText
            if (r0 == 0) goto L61
            com.google.gson.Gson r2 = X.C19748512Ol.LIZJ
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r2, r0)
            java.lang.Class<webcast.data.TPText> r0 = webcast.data.TPText.class
            java.lang.Object r4 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)
            webcast.data.TPText r4 = (webcast.data.TPText) r4
            java.lang.String r1 = r4.key
            int r0 = r1.length()
            if (r0 <= 0) goto L51
            X.0fNV r0 = X.C1124870fNV.LIZJ()
            r0.getClass()
            java.lang.String r1 = X.C1124870fNV.LIZIZ(r1)
            if (r1 == 0) goto L51
            boolean r0 = X.C500260Jjc.LJJIIZ(r1)
            if (r0 == 0) goto L51
        L32:
            java.lang.String r3 = X.C1146930fx5.LIZ(r6, r1, r7)
            java.util.List<webcast.data.TPTextPiece> r0 = r4.pieces
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r1 = r2.next()
            webcast.data.TPTextPiece r1 = (webcast.data.TPTextPiece) r1
            java.lang.String r0 = r1.stringValue
            java.lang.String r0 = X.C1146930fx5.LIZ(r6, r0, r7)
            r1.stringValue = r0
            goto L3c
        L51:
            java.lang.String r1 = r4.stringValue
            goto L32
        L54:
            X.0fs7 r2 = X.C1143850fs7.LIZ
            java.util.List<webcast.data.TPTextPiece> r1 = r4.pieces
            webcast.data.TPFormat r0 = r4.format
            r2.getClass()
            android.text.SpannableStringBuilder r1 = X.C1143850fs7.LJ(r3, r1, r0)
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.RechargeConsumptionMetaData.LIZIZ(int, java.lang.String):android.text.Spannable");
    }

    public RechargeConsumptionMetaData(TPActivityArea tPActivityArea, TPRechargeArea tPRechargeArea, TPConsumptionArea tPConsumptionArea, TPText tPText, TPText tPText2) {
        this.activityArea = tPActivityArea;
        this.rechargeArea = tPRechargeArea;
        this.consumptionArea = tPConsumptionArea;
        this.rechargeDisclaimerText = tPText;
        this.exchangeDisclaimerText = tPText2;
    }
}

package com.ss.android.ugc.aweme.commercialize.promote.service;

import X.AbstractC1028360crq;
import X.AbstractC848400XPy;
import X.C00JL;
import X.C07PR;
import X.C0C48;
import X.C0C64;
import X.C0XQ7;
import X.C1017070cZd;
import X.C1049250dPX;
import X.C10GR;
import X.C1125604ak;
import X.C11S5;
import X.C123100dR;
import X.C1379360lzy;
import X.C1389805cG;
import X.C13LP;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1866610yfr;
import X.C1891520zK2;
import X.C1891540zK4;
import X.C1908480zlO;
import X.C1911500zqG;
import X.C1911520zqI;
import X.C1911530zqJ;
import X.C1911540zqK;
import X.C1911560zqM;
import X.C1911570zqN;
import X.C1911640zqU;
import X.C19323510in;
import X.C19EG;
import X.C1AF0;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C255850A0x;
import X.C419910GdJ;
import X.C516201zk;
import X.C666390QBx;
import X.EnumC891880Yyo;
import X.InterfaceC1891550zK5;
import X.InterfaceC1911550zqL;
import Y.AfS140S0000000_19;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.BannerActionReportModel;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.BannerActionReportRequest;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.commercialize.promote.model.BottomBanner;
import com.ss.android.ugc.aweme.commercialize.promote.model.BottomBannerFrequencySettingModel;
import com.ss.android.ugc.aweme.commercialize.promote.model.PromoteConfig;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.commercialize.promote.settings.BottomBarButtonLimitWidth;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PromotePageModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS85S1000000_35;
import kotlin.jvm.internal.Intrinsics;
import ye9.g;

/* JADX INFO: loaded from: classes29.dex */
public final class CommercePromoteService implements ICommercePromoteService {
    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJIIZILJ() {
        if (C1866610yfr.LIZ.contains(Integer.valueOf(C255850A0x.LIZ()))) {
            C1389805cG.LIZ();
            C1891520zK2.LIZ.getClass();
            C1891520zK2.LIZJ = true;
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL("tiktok_promote_spark_biz");
            C1891520zK2.LIZIZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJIJI() {
        C1911570zqN.LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = C1911570zqN.LIZIZ;
        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) < 1000) {
            return false;
        }
        C1911570zqN.LIZIZ = Long.valueOf(System.currentTimeMillis());
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void release() {
        C1049250dPX.LIZ.getClass();
        AbstractC1028360crq abstractC1028360crq = C1049250dPX.LIZIZ;
        if (abstractC1028360crq != null) {
            abstractC1028360crq.LJIJJLI();
        }
        C1049250dPX.LIZIZ = null;
        C1049250dPX.LIZLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LIZJ() {
        User currentUser;
        PromoteConfig promoteConfigLIZ;
        Integer recommendCML;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || currentUser.getMusicComplianceAccount() > 0 || (promoteConfigLIZ = g.LIZ()) == null || (recommendCML = promoteConfigLIZ.getRecommendCML()) == null) {
            return false;
        }
        return recommendCML.intValue() == 1 || recommendCML.intValue() == 2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJFF() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "promote_fyp_share", true, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJIILIIL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "promote_long_press", true, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJJII() {
        if (C255850A0x.LIZ() == 2) {
            C1389805cG.LIZ();
            C1891520zK2.LIZ.getClass();
            C1891520zK2.LIZJ = true;
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL("tiktok_promote_spark_biz");
            C1891520zK2.LIZIZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJIIZI() {
        Integer promoteProStatus;
        PromoteConfig promoteConfigLIZ = g.LIZ();
        return (promoteConfigLIZ == null || (promoteProStatus = promoteConfigLIZ.getPromoteProStatus()) == null || promoteProStatus.intValue() != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final int LJ(Aweme aweme) {
        long delayTimeTypeA;
        if (!C1379360lzy.LIZ.contains(Integer.valueOf(aweme.getHasPromoteEntry()))) {
            return 0;
        }
        if (aweme.getHasPromoteEntry() != 4 && aweme.getHasPromoteEntry() != 5) {
            delayTimeTypeA = C0C48.LIZ().getDelayTimeTypeB();
        } else {
            delayTimeTypeA = C0C48.LIZ().getDelayTimeTypeA();
        }
        return (int) delayTimeTypeA;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJIIIZ(Aweme aweme) {
        C1911570zqN.LIZ.getClass();
        List listLIZIZ = C1911570zqN.LIZIZ(aweme);
        if (listLIZIZ != null && ((ArrayList) listLIZIZ).contains(1)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJIIJ(Aweme aweme) {
        if (C1017070cZd.LJJLIIJ(aweme)) {
            C1911570zqN.LIZ.getClass();
            List listLIZIZ = C1911570zqN.LIZIZ(aweme);
            if (listLIZIZ == null || !((ArrayList) listLIZIZ).contains(3)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJIILL(String str) {
        String str2 = C1389805cG.LIZ;
        C1389805cG.LIZ = str;
        C1911560zqM.LIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJIJJLI(Aweme aweme) {
        C1911500zqG.LIZ.getClass();
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            String str = C1911500zqG.LJ;
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("time");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("times");
                sbLIZ2.append(str);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int iLJ = C1911500zqG.LJ();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Keva keva = C1911500zqG.LIZIZ;
                keva.storeLong(strLIZIZ, jCurrentTimeMillis);
                keva.storeInt(strLIZIZ2, iLJ + 1);
            }
        }
        C1911530zqJ.LIZIZ(aweme, true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJIL(Context context) {
        DisplayMetrics displayMetrics;
        int i;
        if (context == null || (i = (displayMetrics = context.getResources().getDisplayMetrics()).widthPixels) <= 0 || i / displayMetrics.density < BottomBarButtonLimitWidth.get()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJI(Aweme aweme) {
        if (C1017070cZd.LJJLIIJ(aweme) && !LJIIIZ(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJIFFI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        PromotePageModel promotePageModel;
        Integer num;
        if (!AwemeExtKt.isAdTraffic(aweme) || !C1017070cZd.LL(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isPromotePage() || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || awemeRawAd2.getPromotePageModel() == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null || (promotePageModel = awemeRawAd3.getPromotePageModel()) == null || (num = promotePageModel.promoteLynxSchemaType) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJIII(Aweme aweme) {
        return C1911570zqN.LJII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJIIJ(Aweme aweme) {
        if (aweme == null || aweme.getPromoteCapcutToggle() == 0) {
            return false;
        }
        return !((ArrayList) C07PR.LIZ).contains(aweme.getAid());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        C1911570zqN.LIZ.getClass();
        List listLIZIZ = C1911570zqN.LIZIZ(aweme);
        if (listLIZIZ != null && ((ArrayList) listLIZIZ).contains(2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final C1891540zK4 LJJIJ(InterfaceC1891550zK5 interfaceC1891550zK5) {
        return new C1891540zK4(interfaceC1891550zK5);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJJIJIIJI(Aweme aweme) {
        C1911530zqJ.LIZIZ(aweme, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final long LJJIJIIJIL(Aweme aweme) {
        return C1911530zqJ.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJIL(Aweme aweme) {
        C1911570zqN.LIZ.getClass();
        List listLIZIZ = C1911570zqN.LIZIZ(aweme);
        if (listLIZIZ != null && ((ArrayList) listLIZIZ).contains(4)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIZ(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 != 0) goto L4
            return r6
        L4:
            java.util.List<java.lang.Integer> r1 = X.C1379360lzy.LIZ
            int r0 = r8.getHasPromoteEntry()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L15
            return r6
        L15:
            com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel r0 = X.C0C48.LIZ()
            boolean r0 = r0.getSwitch()
            if (r0 != 0) goto L20
            return r6
        L20:
            long r3 = X.C1911530zqJ.LIZ(r8)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2b
            return r6
        L2b:
            int r1 = r8.getHasPromoteEntry()
            r0 = 5
            if (r1 == r0) goto L39
            int r1 = r8.getHasPromoteEntry()
            r0 = 4
            if (r1 != r0) goto L46
        L39:
            com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel r0 = X.C0C48.LIZ()
            long r1 = r0.getDelayTimeTypeA()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L46
            return r6
        L46:
            int r1 = r8.getHasPromoteEntry()
            r0 = 6
            if (r1 != r0) goto L5a
            com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel r0 = X.C0C48.LIZ()
            long r1 = r0.getDelayTimeTypeB()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5a
            return r6
        L5a:
            X.0zqG r0 = X.C1911500zqG.LIZ
            r0.getClass()
            int r1 = X.C1911500zqG.LJ()
            com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel r0 = X.C0C48.LIZ()
            int r0 = r0.getPromoteIconFlipMaxTimes()
            if (r1 < r0) goto L6e
            return r6
        L6e:
            long r4 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto Lb2
            java.lang.String r2 = X.C1911500zqG.LJ
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "time"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            com.bytedance.keva.Keva r2 = X.C1911500zqG.LIZIZ
            r0 = 0
            long r0 = r2.getLong(r3, r0)
        L9e:
            long r4 = r4 - r0
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            long r0 = (long) r0
            long r4 = r4 / r0
            com.ss.android.ugc.aweme.feed.model.PromoteIconFlipFrequencySettingsModel r0 = X.C0C48.LIZ()
            int r0 = r0.getPromoteIconFlipTimeGap()
            long r1 = (long) r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb7
            return r6
        Lb2:
            long r0 = java.lang.System.currentTimeMillis()
            goto L9e
        Lb7:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.promote.service.CommercePromoteService.LJJIZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LIZ(Context context, String str) {
        C1049250dPX.LIZ.getClass();
        C1049250dPX.LIZIZ(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(android.content.Context r8, com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            r7 = this;
            boolean r0 = X.C1911570zqN.LJII(r9)
            if (r0 == 0) goto L4b
            if (r9 == 0) goto L4b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L4b
            java.lang.String r6 = r0.getWebUrl()
            if (r6 == 0) goto L4b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            r5 = 0
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.feed.model.PromotePageModel r0 = r0.getPromotePageModel()
            if (r0 == 0) goto L4c
            java.lang.Integer r4 = r0.promoteLynxSchemaType
            if (r4 == 0) goto L4d
            int r1 = r4.intValue()
            r0 = 2
            if (r1 != r0) goto L4d
            java.lang.String r3 = r9.getAid()
            java.lang.String r2 = "Ad4Ad"
        L32:
            int r1 = r4.intValue()
            r0 = 1
            if (r1 != r0) goto L3b
            java.lang.String r2 = "internal_ads"
        L3b:
            X.C1911570zqN.LJIIIZ()
            java.lang.String r1 = X.C1911570zqN.LIZJ(r5, r6, r3, r2)
            X.0dPX r0 = X.C1049250dPX.LIZ
            r0.getClass()
            r0 = 0
            X.C1049250dPX.LIZ(r8, r1, r0)
        L4b:
            return
        L4c:
            r4 = r5
        L4d:
            java.lang.String r3 = ""
            r2 = r3
            if (r4 != 0) goto L32
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.promote.service.CommercePromoteService.LJIIL(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJIILLIIL(Context context, AwS377S0200000_11 awS377S0200000_11) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_promote_effect_share;
        awS377S0200000_11.invoke(new Pair("promote", c419910GdJ.LIZ(context)));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final String LJIJJ(Context context, Aweme aweme) {
        String iconText;
        if (aweme != null && aweme.getPromoteIconText() != null && C123100dR.LIZ(aweme.getPromoteIconText())) {
            return aweme.getPromoteIconText();
        }
        PromoteConfig promoteConfigLIZ = g.LIZ();
        if (promoteConfigLIZ != null && (iconText = promoteConfigLIZ.getIconText()) != null && C123100dR.LIZ(iconText)) {
            return iconText;
        }
        return context.getString(2131845525);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJJIJIL(final Context context, final String str) {
        ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIJ(new InterfaceC1891550zK5() { // from class: X.0haN
            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return "myself";
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return "during_live";
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                return context;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return str;
            }
        }).preload();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJJIJLIJ(Context context, String str) {
        C1049250dPX.LIZ.getClass();
        C1049250dPX.LIZ(context, str, true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LIZLLL(final Context context, final String str, final String str2) {
        ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIJ(new InterfaceC1891550zK5() { // from class: X.0haM
            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return "myself";
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                String str3 = str2;
                return str3 == null ? "during_live" : str3;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                return context;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return str;
            }
        }).open();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJI(final Aweme aweme, final String str, String str2) {
        String uid;
        final String str3;
        C1911640zqU c1911640zqULIZ;
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(aweme))) {
            str3 = "myself";
        } else {
            str3 = "others";
        }
        new C1891540zK4(new InterfaceC1891550zK5() { // from class: X.0haB
            public final /* synthetic */ String LIZIZ = "video";
            public final /* synthetic */ String LJ = "bottom_bar_button";

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return aweme.getAid();
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return str3;
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return aweme;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return str;
            }
        }).open();
        IPromoteReplaceMusicService iPromoteReplaceMusicService = (IPromoteReplaceMusicService) PluggableExtentionKt.pluggableSpi$default(IPromoteReplaceMusicService.class, false, false, false, 14, null);
        if (iPromoteReplaceMusicService != null && (c1911640zqULIZ = iPromoteReplaceMusicService.LIZ()) != null) {
            c1911640zqULIZ.LIZ(aweme.getAid());
        }
        C666390QBx.LIZ = aweme;
        ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        if (iCommercePromoteLogger != null) {
            iCommercePromoteLogger.LJIIIIZZ(aweme, "video", str3, "bottom_bar_button", str, null, null, new AwS85S1000000_35(str2, 17));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJIIIIZZ(final Aweme aweme, final String str, String str2) {
        String uid;
        final String str3;
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(aweme))) {
            str3 = "myself";
        } else {
            str3 = "others";
        }
        new C1891540zK4(new InterfaceC1891550zK5() { // from class: X.0haC
            public final /* synthetic */ String LIZIZ = "video";
            public final /* synthetic */ String LJ = "bottom_bar_button";

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return aweme.getAid();
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return str3;
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return aweme;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return str;
            }
        }).preload();
        ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        if (iCommercePromoteLogger != null) {
            iCommercePromoteLogger.LJIIJ(aweme, null, "video", str3, "bottom_bar_button", str, null, null, new AwS85S1000000_35(str2, 18));
        }
        C1911560zqM.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJIJ(final Aweme aweme, final String str, String str2) {
        String uid;
        final String str3;
        C1911640zqU c1911640zqULIZ;
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(aweme))) {
            str3 = "myself";
        } else {
            str3 = "others";
        }
        new C1891540zK4(new InterfaceC1891550zK5() { // from class: X.0hc9
            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return "bottom_button";
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return "video";
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return aweme.getAid();
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return str3;
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return aweme;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return str;
            }
        }).open();
        IPromoteReplaceMusicService iPromoteReplaceMusicService = (IPromoteReplaceMusicService) PluggableExtentionKt.pluggableSpi$default(IPromoteReplaceMusicService.class, false, false, false, 14, null);
        if (iPromoteReplaceMusicService != null && (c1911640zqULIZ = iPromoteReplaceMusicService.LIZ()) != null) {
            c1911640zqULIZ.LIZ(aweme.getAid());
        }
        C666390QBx.LIZ = aweme;
        if (str2 != null) {
            C1911500zqG.LIZ.getClass();
            C1911500zqG.LJI(aweme, true);
        }
        ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        if (iCommercePromoteLogger != null) {
            iCommercePromoteLogger.LJIIIZ(aweme, "video", str3, "bottom_button", str, null, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJJ(final C19EG c19eg, final String str, final Aweme aweme) {
        if (aweme == null || aweme.getPromoteCapcutToggle() == 0) {
            return;
        }
        List<String> list = C07PR.LIZ;
        if (((ArrayList) list).contains(aweme.getAid())) {
            return;
        }
        final ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) ServiceManager.get().getService(ICommercePromoteLogger.class);
        PopupManager.LJIJI(new C10GR(c19eg, str, aweme, iCommercePromoteLogger) { // from class: X.0mQi
            public final C19EG LL;
            public final String LLILLJJLI;
            public final Aweme LLILZ;
            public final ICommercePromoteLogger LLILZIL;
            public final String LLILLL = "myself";
            public final int LLILZLL = 1;

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19EG c19eg2 = this.LL;
                return new C688120Qyw(c19eg2, c19eg2, null);
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILZLL;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
                String aid;
                String str2;
                String str3;
                Aweme aweme2 = this.LLILZ;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                String str4 = this.LLILLL;
                Aweme aweme3 = this.LLILZ;
                String string = UUID.randomUUID().toString();
                String str5 = this.LLILLJJLI;
                String string2 = "";
                if (!Intrinsics.LJFF("capcut_toggle", "capcut_toggle")) {
                    str2 = "";
                } else {
                    str2 = C1395960mQk.LIZ().get("capcut_toggle");
                }
                if (!TextUtils.isEmpty(str2)) {
                    Uri uri = UriProtector.parse(str2);
                    Uri.Builder builderBuildUpon = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")).buildUpon();
                    Uri uriLIZ = C2821017j.LIZ(uri, C1697810uHb.LJIILJJIL("url"));
                    Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("source", "capcut_toggle");
                    String strLJI = C1911570zqN.LJI();
                    if (!TextUtils.isEmpty(strLJI)) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("user_id", strLJI);
                    }
                    if (!TextUtils.isEmpty(aid) && !TextUtils.equals("during_live", "capcut_toggle")) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("item_id", aid);
                    }
                    if (TextUtils.equals("during_live", "capcut_toggle")) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("room_id", aid);
                    }
                    if (lValueOf != null) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("click_time", lValueOf.toString());
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        if (Intrinsics.LJFF(str4, "myself")) {
                            str3 = "1";
                        } else {
                            str3 = "2";
                        }
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("promote_by", str3);
                    }
                    if (Intrinsics.LJFF("capcut_toggle", "video") && Intrinsics.LJFF(str4, "myself") && aweme3 != null && aweme3.getMusic() != null && !TextUtils.isEmpty(String.valueOf(aweme3.getMusic().getId()))) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("music_id", String.valueOf(aweme3.getMusic().getId()));
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("page_type", str5);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("panel_source", null);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("session_id", string);
                    }
                    string2 = uriLIZ.buildUpon().appendQueryParameter("url", builderAppendQueryParameter.build().toString()).toString();
                }
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                C19EG c19eg2 = this.LL;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(string2);
                sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0mQj
                    @Override // X.InterfaceC1554220qY0
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILJJIL(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILL(SparkPopup sparkPopup, int i) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILLIIL() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJIJI(SparkPopup sparkPopup) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJIJJ(SparkPopup sparkPopup) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIL(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJI(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIFFI(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJII() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIJ(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIZI() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void onViewAttachedToWindow() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void onViewDetachedFromWindow() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIZILJ(SparkPopup sparkPopup) {
                        c20656615sK.LIZ();
                    }
                });
                c1537900q7g.getClass();
                new C1541950qED(c19eg2, sparkContext).LIZIZ();
                ICommercePromoteLogger iCommercePromoteLogger2 = this.LLILZIL;
                if (iCommercePromoteLogger2 != null) {
                    iCommercePromoteLogger2.LJIIIZ(this.LLILZ, "capcut_toggle", "myself", null, this.LLILLJJLI, null, null);
                }
            }

            {
                this.LL = c19eg;
                this.LLILLJJLI = str;
                this.LLILZ = aweme;
                this.LLILZIL = iCommercePromoteLogger;
            }
        }, true);
        ((ArrayList) list).add(aweme.getAid());
        iCommercePromoteLogger.LJIIJJI("capcut_toggle", aweme, "myself", null, str, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJIIZ(final C19EG c19eg, final Aweme aweme, final String str) {
        ArrayList<String> arrayList;
        List<String> urlList;
        UrlModel cover;
        if (c19eg == null || !C1379360lzy.LIZLLL.contains(Integer.valueOf(aweme.getHasPromoteEntry())) || aweme.getCommerceVideoAuthInfo() == null) {
            return false;
        }
        ArrayList<String> arrayList2 = C00JL.LIZ;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            arrayList = C00JL.LIZ;
            ArrayList<String> arrayList3 = (ArrayList) settingsManagerLIZLLL.LJIIIIZZ("promote_post_push_list", ArrayList.class, arrayList);
            if (arrayList3 != null) {
                arrayList = arrayList3;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            arrayList = C00JL.LIZ;
        }
        if (!arrayList.contains(aweme.getCommerceVideoAuthInfo().getCommerceTrafficType())) {
            return false;
        }
        C1911500zqG c1911500zqG = C1911500zqG.LIZ;
        String aid = aweme.getAid();
        c1911500zqG.getClass();
        if (aid == null || C1911500zqG.LIZIZ.getBoolean(aid, false)) {
            return false;
        }
        final C1891540zK4 c1891540zK4 = new C1891540zK4(new InterfaceC1891550zK5() { // from class: X.0haE
            public final /* synthetic */ String LIZLLL = "in_app_push";

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return "myself";
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return "video";
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return aweme.getAid();
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return aweme;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                return c19eg;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return str;
            }
        });
        final ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        C1911540zqK c1911540zqK = C1911540zqK.LL;
        InterfaceC1911550zqL interfaceC1911550zqL = new InterfaceC1911550zqL() { // from class: X.0m6N
            public final /* synthetic */ String LIZLLL = "in_app_push";

            @Override // X.InterfaceC1911550zqL
            public final void LIZIZ() {
                c1891540zK4.open();
                ICommercePromoteLogger iCommercePromoteLogger2 = iCommercePromoteLogger;
                if (iCommercePromoteLogger2 != null) {
                    iCommercePromoteLogger2.LJIIIZ(aweme, "video", "myself", this.LIZLLL, str, CardStruct.IStatusCode.DEFAULT, null);
                }
            }

            @Override // X.InterfaceC1911550zqL
            public final void onShow() {
                c1891540zK4.preload();
                ICommercePromoteLogger iCommercePromoteLogger2 = iCommercePromoteLogger;
                if (iCommercePromoteLogger2 != null) {
                    iCommercePromoteLogger2.LJIIJJI("video", aweme, "myself", this.LIZLLL, str, CardStruct.IStatusCode.DEFAULT, null, null);
                }
            }
        };
        c1911540zqK.getClass();
        C1911540zqK.LLILLJJLI = interfaceC1911550zqL;
        C1908480zlO.LIZIZ.LJIILL(c1911540zqK, new int[]{2403});
        C1911570zqN.LIZ.getClass();
        Video video = aweme.getVideo();
        if (video != null && (cover = video.getCover()) != null) {
            urlList = cover.getUrlList();
        } else {
            urlList = null;
        }
        String string = c19eg.getString(2131821945);
        if (string == null) {
            string = "Your video is uploaded. Tap go to start promoting it.";
        }
        String string2 = c19eg.getString(2131821946);
        if (string2 == null) {
            string2 = "Go";
        }
        new C19323510in(2403, "inner_promote_post_push", new InnerPushConfig(0L, null, 0, C1697810uHb.LJIIJJI(1, 2, 3, 4, 5, 6, 9), 5), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, urlList, null, null, null, null, null, null, null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 1, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, string, null, 2, null, 3, string2, null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0), C2097608Jq.LJIIJ(new kotlin.Pair("business_tag", "TTMP")), null, 396).LIZIZ();
        String aid2 = aweme.getAid();
        if (aid2 != null) {
            C1911500zqG.LIZIZ.storeBoolean(aid2, true);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJJIJL(Aweme aweme, String str, String str2) {
        String uid;
        String authorUid;
        String str3;
        int iIntValue;
        int iIntValue2;
        User currentUser;
        BottomBanner bottomBanner = (BottomBanner) GsonProtectorUtils.fromJson(new Gson(), str2, BottomBanner.class);
        if (bottomBanner == null) {
            return true;
        }
        Integer type = bottomBanner.getType();
        if (type != null && type.intValue() == 0) {
            return false;
        }
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        Integer numValueOf = null;
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(uid, authorUid)) {
            str3 = "myself";
        } else {
            str3 = "others";
        }
        List<Integer> list = C1379360lzy.LIZLLL;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getHasPromoteEntry());
        }
        if (!C13LP.LJJJJ(numValueOf, list)) {
            ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
            if (iCommercePromoteLogger != null) {
                C1911500zqG.LIZ.getClass();
                iCommercePromoteLogger.LJIJJ(aweme, Long.valueOf(C1911500zqG.LIZJ(aweme)), str3, "bottom_button", str, str2, "no_entrance", null);
            }
            return false;
        }
        if (Intrinsics.LJFF(bottomBanner.getFrequencyClear(), Boolean.TRUE)) {
            C1911500zqG.LIZ.getClass();
            C1911500zqG.LIZLLL.clear();
        }
        Integer showTimes = bottomBanner.getShowTimes();
        if (showTimes != null) {
            iIntValue = showTimes.intValue();
        } else {
            iIntValue = 4;
        }
        C1911500zqG.LIZ.getClass();
        if (C1911500zqG.LIZLLL(aweme) < iIntValue) {
            return true;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - C1911500zqG.LIZJ(aweme)) / ((long) 86400000);
        Integer timeGap = bottomBanner.getTimeGap();
        if (timeGap != null) {
            iIntValue2 = timeGap.intValue();
        } else {
            iIntValue2 = 7;
        }
        if (jCurrentTimeMillis >= iIntValue2) {
            C1911500zqG.LJI(aweme, true);
            return true;
        }
        ICommercePromoteLogger iCommercePromoteLogger2 = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        if (iCommercePromoteLogger2 != null) {
            iCommercePromoteLogger2.LJIJJ(aweme, Long.valueOf(C1911500zqG.LIZJ(aweme)), str3, "bottom_button", str, str2, "frequency_control", null);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJJJ(final Aweme aweme, final String str, String str2) {
        String uid;
        final String str3;
        User currentUser;
        if (C1911560zqM.LIZ) {
            return;
        }
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(aweme))) {
            str3 = "myself";
        } else {
            str3 = "others";
        }
        new C1891540zK4(new InterfaceC1891550zK5() { // from class: X.0hcA
            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return "bottom_button";
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return "video";
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                return aweme.getAid();
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return str3;
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return aweme;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return str;
            }
        }).preload();
        if (str2 != null) {
            C1911500zqG.LIZ.getClass();
            C1911500zqG.LJI(aweme, false);
        }
        ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        if (iCommercePromoteLogger != null) {
            C1911500zqG.LIZ.getClass();
            iCommercePromoteLogger.LJIIJJI("video", aweme, str3, "bottom_button", str, null, str2, Integer.valueOf(C1911500zqG.LIZLLL(aweme)));
        }
        C1911560zqM.LIZ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJI(android.content.Context r11, com.ss.android.ugc.aweme.feed.model.Aweme r12, int r13) {
        /*
            r10 = this;
            boolean r0 = X.C1911570zqN.LJII(r12)
            if (r0 == 0) goto Lb6
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r3 = r0.toString()
            long r8 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            r5 = 0
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.feed.model.PromotePageModel r0 = r0.getPromotePageModel()
            if (r0 == 0) goto Lb0
            java.lang.Integer r7 = r0.promoteLynxSchemaType
            if (r7 == 0) goto Lb1
            int r1 = r7.intValue()
            r0 = 2
            if (r1 != r0) goto Lb1
            java.lang.String r1 = r12.getAid()
            java.lang.String r2 = "Ad4Ad"
        L30:
            java.lang.String r6 = "internal_ads"
            r4 = 1
            if (r7 == 0) goto L3c
            int r0 = r7.intValue()
            if (r0 != r4) goto L3c
            r2 = r6
        L3c:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.getWebUrl()
        L46:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb6
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            if (r0 == 0) goto L56
            java.lang.String r5 = r0.getWebUrl()
        L56:
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = X.C1911570zqN.LIZJ(r0, r5, r1, r2)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "session_id"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r3)
            java.lang.String r5 = r0.toString()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService> r0 = com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService.class
            java.lang.Object r0 = r1.getService(r0)
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService r0 = (com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService) r0
            r0.LIZIZ()
            X.C1022290ci3.LIZLLL(r11, r12, r13)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r6)
            if (r0 == 0) goto La5
            X.0q7g r0 = X.C1541950qED.LIZJ
            com.bytedance.hybrid.spark.SparkContext r1 = new com.bytedance.hybrid.spark.SparkContext
            r1.<init>()
            r1.LJJLIIJ(r5)
            r0.getClass()
            X.0qED r0 = new X.0qED
            r0.<init>(r11, r1)
            r0.LIZIZ()
        L9d:
            X.0zqQ r1 = X.C1911600zqQ.LIZIZ
            java.lang.String r0 = "myself"
            r1.LJII(r3, r2, r0)
            return r4
        La5:
            X.0dPX r0 = X.C1049250dPX.LIZ
            r0.getClass()
            X.C1049250dPX.LIZIZ(r11, r5)
            goto L9d
        Lae:
            r0 = r5
            goto L46
        Lb0:
            r7 = r5
        Lb1:
            java.lang.String r1 = ""
            r2 = r1
            goto L30
        Lb6:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.promote.service.CommercePromoteService.LJJJI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    public static void LJJJIL(Aweme aweme, int i, BottomBanner bottomBanner, String str) {
        int timeGap;
        Integer showTimes;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "promote_banner_freq_report", true, false) && aweme != null && aweme.getAid() != null) {
            BottomBannerFrequencySettingModel bottomBannerFrequencySettingModelLIZ = C1125604ak.LIZ();
            Integer regularVersionShowTimes = bottomBannerFrequencySettingModelLIZ.getRegularVersionShowTimes();
            if (C0C64.LJIILLIIL().LJIJ(31744, 2, "promote_banner_frequency", true) == 2) {
                regularVersionShowTimes = bottomBannerFrequencySettingModelLIZ.getStrictVersionShowTimes();
            }
            if (bottomBanner != null && (showTimes = bottomBanner.getShowTimes()) != null) {
                regularVersionShowTimes = showTimes;
            }
            BannerActionReportModel bannerActionReportModel = new BannerActionReportModel(null, 1, 0L, null, null, null, null);
            bannerActionReportModel.setItemId(aweme.getAid());
            bannerActionReportModel.setActionType(i);
            bannerActionReportModel.setUpdateTime(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            if (i == 1) {
                C1911500zqG.LIZ.getClass();
                bannerActionReportModel.setShowCount(Integer.valueOf(C1911500zqG.LIZIZ(aweme)));
                bannerActionReportModel.setMaxShowCount(regularVersionShowTimes);
                if (bottomBanner == null || (timeGap = bottomBanner.getTimeGap()) == null) {
                    timeGap = 7;
                }
                bannerActionReportModel.setFreqDays(timeGap);
                bannerActionReportModel.setCustomizedInfo(str);
            }
            C1911520zqI.LIZ.getClass();
            C1911520zqI.LIZIZ.reportBannerAction(new BannerActionReportRequest(Collections.singletonList(bannerActionReportModel))).LJL(C11S5.LIZ()).LJJLL(new AfS140S0000000_19(1), new AfS140S0000000_19(2));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LIZIZ(final String str, String str2, String str3, final Aweme aweme) {
        String authorUid;
        final String str4;
        String uid = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid();
        String aid = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(uid, authorUid)) {
            str4 = "myself";
        } else {
            str4 = "others";
        }
        final BottomBanner bottomBanner = (BottomBanner) GsonProtectorUtils.fromJson(new Gson(), str3, BottomBanner.class);
        ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIJ(new InterfaceC1891550zK5() { // from class: X.0hv8
            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return "bottom_banner";
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return "video";
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                BottomBanner bottomBanner2 = bottomBanner;
                return C2097908Jt.LIZJ(new kotlin.Pair("entrance_info", bottomBanner2 != null ? bottomBanner2.getKey() : null));
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                Aweme aweme2 = aweme;
                if (aweme2 != null) {
                    return aweme2.getAid();
                }
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                BottomBanner bottomBanner2 = bottomBanner;
                if (bottomBanner2 != null) {
                    return bottomBanner2.getSchema();
                }
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                Activity activityLIZIZ;
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                    return activityLIZIZ;
                }
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return str4;
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return aweme;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return str;
            }
        }).open();
        C1911640zqU c1911640zqULIZ = ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ();
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c1911640zqULIZ.LIZ(aid);
        C666390QBx.LIZ = aweme;
        C1911500zqG.LIZ.getClass();
        C1911500zqG.LJFF(aweme, true);
        ((ICommercePromoteLogger) ServiceManager.get().getService(ICommercePromoteLogger.class)).LJIIIZ(aweme, "video", str4, "bottom_banner", str, null, str2);
        LJJJIL(aweme, 2, bottomBanner, str3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJII(final String str, String str2, String str3, final Aweme aweme) {
        String authorUid;
        final String str4;
        String uid = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid();
        String aid = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(uid, authorUid)) {
            str4 = "myself";
        } else {
            str4 = "others";
        }
        final BottomBanner bottomBanner = (BottomBanner) GsonProtectorUtils.fromJson(new Gson(), str3, BottomBanner.class);
        ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIJ(new InterfaceC1891550zK5() { // from class: X.0hv7
            @Override // X.InterfaceC1891550zK5
            public final String LIZ() {
                return "bottom_banner";
            }

            @Override // X.InterfaceC1891550zK5
            public final String getEnterFrom() {
                return "video";
            }

            @Override // X.InterfaceC1891550zK5
            public final Context getContext() {
                C844470XAv.LIZ.getClass();
                return C844470XAv.LIZ();
            }

            @Override // X.InterfaceC1891550zK5
            public final Map<String, Object> getExtra() {
                BottomBanner bottomBanner2 = bottomBanner;
                return C2097908Jt.LIZJ(new kotlin.Pair("entrance_info", bottomBanner2 != null ? bottomBanner2.getKey() : null));
            }

            @Override // X.InterfaceC1891550zK5
            public final String getItemId() {
                Aweme aweme2 = aweme;
                if (aweme2 != null) {
                    return aweme2.getAid();
                }
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getSchema() {
                BottomBanner bottomBanner2 = bottomBanner;
                if (bottomBanner2 != null) {
                    return bottomBanner2.getSchema();
                }
                return null;
            }

            @Override // X.InterfaceC1891550zK5
            public final String LIZIZ() {
                return str4;
            }

            @Override // X.InterfaceC1891550zK5
            public final Aweme getAweme() {
                return aweme;
            }

            @Override // X.InterfaceC1891550zK5
            public final String getPageType() {
                return str;
            }
        }).preload();
        C1911500zqG.LIZ.getClass();
        C1911500zqG.LJFF(aweme, false);
        ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        if (iCommercePromoteLogger != null) {
            iCommercePromoteLogger.LJIIJJI("video", aweme, str4, "bottom_banner", str, null, str2, Integer.valueOf(C1911500zqG.LIZIZ(aweme)));
        }
        if (aweme != null) {
            aid = aweme.getAid();
        }
        C1911500zqG.LJFF = aid;
        C1911500zqG.LJI = System.currentTimeMillis();
        LJJJIL(aweme, 1, bottomBanner, str3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final void LJIIJJI(EnumC891880Yyo enumC891880Yyo, String str, Function1<? super Integer, Unit> function1, Function1<? super Throwable, Unit> function12) {
        C1911520zqI.LIZ.getClass();
        C1911520zqI.LIZIZ.getPromoteEntryControlStrategy(enumC891880Yyo.getValue(), str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(function1, 91), new C516201zk(function12, 92));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService
    public final boolean LJIILJJIL(Aweme aweme, String str, String str2, Boolean bool) {
        String uid;
        String authorUid;
        String str3;
        Integer numValueOf;
        int iIntValue;
        String aid;
        Integer timeGap;
        Integer showTimes;
        ICommercePromoteLogger iCommercePromoteLogger;
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        String aid2 = null;
        if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(uid, authorUid)) {
            str3 = "myself";
        } else {
            str3 = "others";
        }
        List<Integer> list = C1379360lzy.LIZLLL;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getHasPromoteEntry());
        } else {
            numValueOf = null;
        }
        if (!C13LP.LJJJJ(numValueOf, list)) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE) && (iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null)) != null) {
                C1911500zqG.LIZ.getClass();
                iCommercePromoteLogger.LJIJJ(aweme, Long.valueOf(C1911500zqG.LIZ(aweme)), str3, "bottom_banner", str, str2, "no_entrance", null);
            }
            return false;
        }
        BottomBanner bottomBanner = (BottomBanner) GsonProtectorUtils.fromJson(new Gson(), str2, BottomBanner.class);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && bottomBanner != null && Intrinsics.LJFF(bottomBanner.getFrequencyClear(), bool2)) {
            C1911500zqG.LIZ.getClass();
            C1911500zqG.LIZJ.clear();
        }
        BottomBannerFrequencySettingModel bottomBannerFrequencySettingModelLIZ = C1125604ak.LIZ();
        Integer regularVersionShowTimes = bottomBannerFrequencySettingModelLIZ.getRegularVersionShowTimes();
        if (C0C64.LJIILLIIL().LJIJ(31744, 2, "promote_banner_frequency", true) == 2) {
            regularVersionShowTimes = bottomBannerFrequencySettingModelLIZ.getStrictVersionShowTimes();
        }
        if (bottomBanner != null && (showTimes = bottomBanner.getShowTimes()) != null) {
            regularVersionShowTimes = showTimes;
        } else {
            if (regularVersionShowTimes != null) {
            }
            return true;
        }
        C1911500zqG.LIZ.getClass();
        if (C1911500zqG.LIZIZ(aweme) >= regularVersionShowTimes.intValue()) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - C1911500zqG.LIZ(aweme)) / ((long) 86400000);
            if (bottomBanner != null && (timeGap = bottomBanner.getTimeGap()) != null) {
                iIntValue = timeGap.intValue();
            } else {
                iIntValue = 7;
            }
            if (jCurrentTimeMillis >= iIntValue) {
                C1911500zqG.LJFF(aweme, true);
                return true;
            }
            if (Intrinsics.LJFF(bool, bool2)) {
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(C1911500zqG.LJFF, aid) || System.currentTimeMillis() - C1911500zqG.LJI >= 2000) {
                    ICommercePromoteLogger iCommercePromoteLogger2 = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
                    if (iCommercePromoteLogger2 != null) {
                        iCommercePromoteLogger2.LJIJJ(aweme, Long.valueOf(C1911500zqG.LIZ(aweme)), str3, "bottom_banner", str, str2, "frequency_control", null);
                    }
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    }
                    C1911500zqG.LJFF = aid2;
                    C1911500zqG.LJI = System.currentTimeMillis();
                    return false;
                }
            }
            return false;
        }
        return true;
    }
}

package com.ss.android.ugc.aweme.ecommerce.anchor;

import X.C098200Yq;
import X.C0CCZ;
import X.C12BL;
import X.C12BT;
import X.C189200o6;
import X.C21272618Mq;
import X.InterfaceC1393680mN4;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorFetchListTask;
import com.ss.android.ugc.aweme.ecommerce.fyp.tag.FeedEcCreatorRecommendVideoTagTrigger;
import com.ss.android.ugc.aweme.ecommerce.fyp.tag.FeedEcCreatorRecommendVideoTagTriggerV2;
import com.ss.android.ugc.aweme.ecommerce.fyp.tag.FeedEcCustomerRecommendVideoTagTrigger;
import com.ss.android.ugc.aweme.ecommerce.fyp.tag.FeedEcCustomerRecommendVideoTagTriggerV2;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService;
import com.ss.android.ugc.aweme.ecommerce.video.settings.ECVideoListOperatorWhiteList;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class EcommerceAnchorOuterService implements IEcommerceAnchorOuterService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final InterfaceC1393680mN4 LIZ() {
        return new InterfaceC1393680mN4() { // from class: X.12BN
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                return new AbstractC2249871D4f(interfaceC1392640mLO.LIZIZ()) { // from class: X.12BS
                    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 804));

                    @Override // X.AbstractC2249871D4f
                    public InterfaceC2249881D4g getAnchorBusiness() {
                        return (InterfaceC2249881D4g) this.LLILZIL.getValue();
                    }

                    {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setLayoutParams(layoutParams);
                    }
                };
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLJLI().LIZIZ(aweme, anchorCommonStruct, z);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final InterfaceC1393680mN4 LIZIZ() {
        return new InterfaceC1393680mN4() { // from class: X.12BO
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                return new AbstractC2249871D4f(interfaceC1392640mLO.LIZIZ()) { // from class: X.12BR
                    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 805));

                    @Override // X.AbstractC2249871D4f
                    public InterfaceC2249881D4g getAnchorBusiness() {
                        return (InterfaceC2249881D4g) this.LLILZIL.getValue();
                    }

                    {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setLayoutParams(layoutParams);
                    }
                };
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LIZIZ().LIZIZ(aweme, anchorCommonStruct, z);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final VideoTagCategoryProtocol LJFF() {
        return new FeedEcCreatorRecommendVideoTagTriggerV2();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final C0CCZ LJI() {
        return new AnchorFetchListTask();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final VideoTagCategoryProtocol LJII() {
        return new FeedEcCustomerRecommendVideoTagTriggerV2();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final VideoTagCategoryProtocol LJIIIIZZ() {
        return new FeedEcCreatorRecommendVideoTagTrigger();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final InterfaceC1393680mN4 LJIIJ() {
        return new InterfaceC1393680mN4() { // from class: X.12BM
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                return new AbstractC2249871D4f(interfaceC1392640mLO.LIZIZ()) { // from class: X.12BQ
                    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 803));

                    @Override // X.AbstractC2249871D4f
                    public InterfaceC2249881D4g getAnchorBusiness() {
                        return (InterfaceC2249881D4g) this.LLILZIL.getValue();
                    }

                    {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                        setLayoutParams(layoutParams);
                    }
                };
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJJL().LIZIZ(aweme, anchorCommonStruct, z);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final VideoTagCategoryProtocol LJIIJJI() {
        return new FeedEcCustomerRecommendVideoTagTrigger();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final boolean LIZJ() {
        ICommerceMediaOutService iCommerceMediaOutService;
        C12BT c12btLIZ;
        String shootWay;
        Object c098200Yq;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_enable_strict_ec_music_compliance", true) && (iCommerceMediaOutService = (ICommerceMediaOutService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaOutService.class, false, false, false, 14, null)) != null && (c12btLIZ = iCommerceMediaOutService.LIZ()) != null && (shootWay = c12btLIZ.getShootWay()) != null) {
            try {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                c098200Yq = C12BL.LIZ;
                String[] strArr = (String[]) settingsManagerLIZLLL.LJIIIIZZ("ec_sv_ec_shoot_way_allow_list", String[].class, c098200Yq);
                if (strArr != null) {
                    c098200Yq = strArr;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String[] strArr2 = (String[]) c098200Yq;
            if (strArr2 != null) {
                for (String str : strArr2) {
                    Locale locale = Locale.ROOT;
                    if (Intrinsics.LJFF(str.toLowerCase(locale), shootWay.toLowerCase(locale))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final List<String> LJ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig = ECVideoListOperatorWhiteList.LIZ;
        ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig2 = (ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_video_list_operator_white_list", ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig.class, eCVideoListOperatorWhiteListConfig);
        if (eCVideoListOperatorWhiteListConfig2 != null) {
            eCVideoListOperatorWhiteListConfig = eCVideoListOperatorWhiteListConfig2;
        }
        return eCVideoListOperatorWhiteListConfig.fromWhiteList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    public final boolean LJIIIZ(boolean z) {
        C21272618Mq.LIZ.getClass();
        return C21272618Mq.LJII(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [T, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean startVideoFeed(android.content.Context r49, com.bytedance.router.RouteIntent r50) {
        /*
            Method dump skipped, instruction units count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.EcommerceAnchorOuterService.startVideoFeed(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(org.json.JSONObject r4, java.lang.String r5, java.util.Map r6) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Throwable -> L23
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Throwable -> L23
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0     // Catch: java.lang.Throwable -> L23
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLILZ(r5)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L21
            boolean r1 = r0.isAd()     // Catch: java.lang.Throwable -> L23
            r0 = 1
            if (r1 != r0) goto L21
        L19:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L23
            goto L2f
        L21:
            r0 = 0
            goto L19
        L23:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L2f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L38
            r2 = r1
        L38:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            X.1D3a r0 = X.C2249561D3a.LIZ
            r0.getClass()
            boolean r0 = X.C2249561D3a.LIZJ(r6, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.EcommerceAnchorOuterService.LIZLLL(org.json.JSONObject, java.lang.String, java.util.Map):boolean");
    }
}

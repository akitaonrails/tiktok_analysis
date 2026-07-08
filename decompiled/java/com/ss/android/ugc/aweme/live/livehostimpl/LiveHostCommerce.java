package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0IIC;
import X.C0IJH;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.service.ISeaLiveService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveHostCommerce implements IHostCommerce {
    public static final LiveHostCommerce LL = new LiveHostCommerce();

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean hitTopTabExpExperiment() {
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService != null) {
            return iECommerceMallService.hitTopTabExpExperiment();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean Ba() {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).Ba();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean Ch() {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).Ch();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean K6() {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).K6();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final LifecycleObserver Nf() {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).Nf();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean Wh() {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).Wh();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean kp() {
        return ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).kp();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final int ln() {
        return ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).ln();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean s7() {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).s7();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final n tl() {
        return ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).tl();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean tz() {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).LJJIIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean zs() {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).zs();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0001, B:7:0x0010, B:10:0x0025, B:12:0x0048, B:15:0x0051, B:18:0x0058, B:20:0x0061, B:27:0x007e, B:22:0x006c, B:24:0x0075), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean GD1(android.app.Activity r14) {
        /*
            r13 = this;
            r12 = 0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "1:"
            r1.append(r0)     // Catch: java.lang.Exception -> L8b
            r11 = 1
            if (r14 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            r1.append(r0)     // Catch: java.lang.Exception -> L8b
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L8b
            X.01GW r0 = X.C07FP.LIZ     // Catch: java.lang.Exception -> L8b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L8b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L8b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L8b
            if (r0 != 0) goto L25
            return r12
        L25:
            android.app.Activity[] r7 = com.ss.android.ugc.aweme.utils.ActivityStack.getActivityStack()     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L8b
            java.lang.Class<com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService> r0 = com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService.class
            java.lang.Object r6 = r1.getService(r0)     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService r6 = (com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService) r6     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L8b
            java.lang.Class<com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService> r0 = com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService.class
            java.lang.Object r5 = r1.getService(r0)     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService r5 = (com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService) r5     // Catch: java.lang.Exception -> L8b
            int r4 = r7.length     // Catch: java.lang.Exception -> L8b
            r3 = -1
            r2 = 0
            r10 = 0
            r1 = -1
        L46:
            if (r2 >= r4) goto L83
            r8 = r7[r2]     // Catch: java.lang.Exception -> L8b
            int r9 = r10 + 1
            boolean r0 = r8 instanceof X.C19EG     // Catch: java.lang.Exception -> L8b
            if (r0 != 0) goto L51
            goto L82
        L51:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r14)     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L58
            r1 = r10
        L58:
            r0 = r8
            X.19EG r0 = (X.C19EG) r0     // Catch: java.lang.Exception -> L8b
            boolean r0 = r6.LJJIIJZLJL(r0)     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ     // Catch: java.lang.Exception -> L8b
            r0.getClass()     // Catch: java.lang.Exception -> L8b
            boolean r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJIZL(r8)     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L7d
        L6c:
            r0 = r8
            X.19EG r0 = (X.C19EG) r0     // Catch: java.lang.Exception -> L8b
            boolean r0 = r5.LJIIJ(r0)     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L7e
            X.19EG r8 = (X.C19EG) r8     // Catch: java.lang.Exception -> L8b
            boolean r0 = r8.isFinishing()     // Catch: java.lang.Exception -> L8b
            if (r0 != 0) goto L7e
        L7d:
            r3 = r10
        L7e:
            int r2 = r2 + 1
            r10 = r9
            goto L46
        L82:
            return r12
        L83:
            if (r3 < 0) goto L8a
            if (r1 < 0) goto L8a
            if (r3 <= r1) goto L8a
            return r11
        L8a:
            return r12
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostCommerce.GD1(android.app.Activity):boolean");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final String Xh(GoLiveECIconInfo goLiveECIconInfo) {
        return ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).Xh(goLiveECIconInfo);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void ld(String str) {
        ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).ld(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void nj(Long l) {
        ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).nj(l);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void setCurrentRoomId(Long l) {
        ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).setCurrentRoomId(l);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean wg(String str) {
        return ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).wg(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final String Bb(String str, JSONObject jSONObject) {
        return ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).Bb(str, jSONObject);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void Gi(String str, JSONObject jSONObject) {
        ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).Gi(str, jSONObject);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final String Tv(int i, GoLiveECIconInfo goLiveECIconInfo) {
        return ((IEcommerceInfluencerService) ServiceManager.get().getService(IEcommerceInfluencerService.class)).Tv(i, goLiveECIconInfo);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final String il(String str, Map<String, String> map) {
        String strIl;
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
        if (iEcommerceLiveService != null && (strIl = iEcommerceLiveService.il(str, map)) != null) {
            return strIl;
        }
        return str;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final C0IIC rC(Fragment fragment, C0IJH c0ijh) {
        ISeaLiveService iSeaLiveService = (ISeaLiveService) PluggableExtentionKt.pluggableSpi$default(ISeaLiveService.class, false, false, false, 14, null);
        if (iSeaLiveService != null) {
            return iSeaLiveService.LIZ(fragment, c0ijh);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void Xt(int i, long j, HashMap map) {
        ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).Xt(i, j, map);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void Yt(long j, HashMap<String, String> map, LifecycleOwner lifecycleOwner) {
        ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).Yt(j, map, lifecycleOwner);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void fw(Integer num, String str, Map map) {
        ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).fw(num, str, map);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean Pf(int i, String str, boolean z, boolean z2) {
        return ((IEcommerceLiveService) ServiceManager.get().getService(IEcommerceLiveService.class)).Pf(i, str, z, z2);
    }
}

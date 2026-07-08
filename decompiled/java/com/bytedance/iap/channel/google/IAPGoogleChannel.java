package com.bytedance.iap.channel.google;

import X.AbstractC1795460wp6;
import X.C05YC;
import X.C099R;
import X.C09IC;
import X.C09IR;
import X.C13LQ;
import X.C1790310wgn;
import X.C1792740wki;
import X.C1795670wpR;
import X.C1795740wpY;
import X.C1796340wqW;
import X.C19885612rG;
import X.C2252331DDr;
import X.C786410Ut5;
import X.EnumC1409040mlq;
import X.EnumC2252401DDy;
import X.EnumC993990byP;
import X.InterfaceC1364105Vn;
import X.InterfaceC1786800wb8;
import X.InterfaceC1786840wbC;
import X.InterfaceC346201Wa;
import X.InterfaceC790710V0b;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public final class IAPGoogleChannel implements InterfaceC1786800wb8 {
    public static final C1796340wqW Companion = new Object() { // from class: X.0wqW
    };
    public final C05YC<EnumC1409040mlq> _cashierUpdate;
    public final C05YC<InterfaceC1786840wbC> _purchaseUpdate;
    public final Context applicationContext;
    public AbstractC1795460wp6 billingClient;
    public final InterfaceC346201Wa<EnumC1409040mlq> cashierUpdate;
    public final C1795740wpY gpConfigInfo;
    public final InterfaceC346201Wa<InterfaceC1786840wbC> purchaseUpdate;
    public final Map<String, C1792740wki> productDetailCache = new LinkedHashMap();
    public final EnumC993990byP channel = EnumC993990byP.GP;
    public final Set<Class<? extends Activity>> cashierActivityClass = C13LQ.LJLIIL(new Class[]{ProxyBillingActivity.class, ProxyBillingActivityV2.class});

    public final AbstractC1795460wp6 getBillingClient$iap_channel_google_release() {
        AbstractC1795460wp6 abstractC1795460wp6 = this.billingClient;
        if (abstractC1795460wp6 != null) {
            return abstractC1795460wp6;
        }
        return null;
    }

    @Override // X.InterfaceC1786800wb8
    public Map<String, String> getCommonEventInfo() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("channel_sdk_version", this.gpConfigInfo.LIZ);
        linkedHashMap.put("billing_country_code", this.gpConfigInfo.LIZIZ);
        linkedHashMap.put("billing_connection_state", String.valueOf(getBillingClient$iap_channel_google_release().LJFF()));
        C19885612rG c19885612rG = this.gpConfigInfo.LIZLLL;
        linkedHashMap.put("billing_connection_result", String.valueOf(c19885612rG != null ? Integer.valueOf(c19885612rG.LIZ) : null));
        return linkedHashMap;
    }

    @Override // X.InterfaceC1786800wb8
    public String getCurrentRegionCode() {
        return this.gpConfigInfo.LIZIZ;
    }

    public final boolean isBillingInitialized$iap_channel_google_release() {
        return this.billingClient != null;
    }

    @Override // X.InterfaceC1786800wb8
    public InterfaceC346201Wa<EnumC1409040mlq> getCashierUpdate() {
        return this.cashierUpdate;
    }

    @Override // X.InterfaceC1786800wb8
    public EnumC993990byP getChannel() {
        return this.channel;
    }

    public final C1795740wpY getGpConfigInfo$iap_channel_google_release() {
        return this.gpConfigInfo;
    }

    @Override // X.InterfaceC1786800wb8
    public InterfaceC346201Wa<InterfaceC1786840wbC> getPurchaseUpdate() {
        return this.purchaseUpdate;
    }

    public IAPGoogleChannel(Context context) {
        this.applicationContext = context;
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.DROP_OLDEST;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, enumC2252401DDy, 1);
        this._purchaseUpdate = c2252331DDrLIZIZ;
        this.purchaseUpdate = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 1, enumC2252401DDy, 1);
        this._cashierUpdate = c2252331DDrLIZIZ2;
        this.cashierUpdate = C09IC.LIZ(c2252331DDrLIZIZ2);
        this.gpConfigInfo = new C1795740wpY(0);
    }

    private final void registerCashierUpdateListener(Context context) {
        ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0wdR
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                if (this.LL.cashierActivityClass.contains(activity.getClass())) {
                    this.LL._cashierUpdate.LIZJ(EnumC1409040mlq.DISMISSED);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (this.LL.cashierActivityClass.contains(activity.getClass())) {
                    this.LL._cashierUpdate.LIZJ(EnumC1409040mlq.SHOWN);
                }
            }
        });
    }

    @Override // X.InterfaceC1786800wb8
    public Object checkEnvironment(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws C1790310wgn {
        try {
            C786410Ut5.Y3(this.applicationContext.getPackageManager(), "com.android.vending", 1);
            int iB4 = C786410Ut5.b4(GoogleApiAvailability.getInstance(), this.applicationContext);
            if (iB4 == 0) {
                Object objCheckGoogleIAPFeature = checkGoogleIAPFeature(interfaceC1364105Vn);
                if (objCheckGoogleIAPFeature == C099R.LJFF()) {
                    return objCheckGoogleIAPFeature;
                }
                return Unit.LIZ;
            }
            throw new C1790310wgn(iB4, "Google Play Service Disconnected", "GP");
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            throw new C1790310wgn(-1, message, "GP");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkGoogleIAPFeature(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1795640wpO
            if (r0 == 0) goto L3d
            r4 = r6
            X.0wpO r4 = (X.C1795640wpO) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L4f
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0wp6 r3 = (X.AbstractC1795460wp6) r3
            java.lang.String r0 = "fff"
            X.12rG r1 = r3.LJII(r0)
            int r0 = r1.LIZ
            if (r0 != 0) goto L43
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = X.C1795470wp7.LIZIZ(r5, r4)
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.0wpO r4 = new X.0wpO
            r4.<init>(r5, r6)
            goto L12
        L43:
            X.0wgn r3 = new X.0wgn
            int r2 = r1.LIZ
            java.lang.String r1 = r1.LIZJ
            java.lang.String r0 = "GP"
            r3.<init>(r2, r1, r0)
            throw r3
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.iap.channel.google.IAPGoogleChannel.checkGoogleIAPFeature(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0wp6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0wpl] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0wrF] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object reloadConfig(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1795570wpH
            if (r0 == 0) goto L47
            r4 = r6
            X.0wpH r4 = (X.C1795570wpH) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r0 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L4d
            X.0wpl r1 = r4.LL
            X.C155000ia.LIZIZ(r0)
        L24:
            X.0wp6 r0 = (X.AbstractC1795460wp6) r0
            r0.LJ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r0)
            X.0wqY r0 = new X.0wqY
            r0.<init>()
            X.0wpl r1 = new X.0wpl
            r1.<init>()
            r4.getClass()
            r4.LL = r1
            r4.LLILZ = r2
            java.lang.Object r0 = X.C1795470wp7.LIZIZ(r5, r4)
            if (r0 != r3) goto L24
            return r3
        L47:
            X.0wpH r4 = new X.0wpH
            r4.<init>(r5, r6)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.iap.channel.google.IAPGoogleChannel.reloadConfig(X.05Vn):java.lang.Object");
    }

    public final void setBillingClient$iap_channel_google_release(AbstractC1795460wp6 abstractC1795460wp6) {
        this.billingClient = abstractC1795460wp6;
    }

    @Override // X.InterfaceC1786800wb8
    public Object checkExternalPaymentEligibility(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws C1790310wgn {
        Object objLIZ = C1795670wpR.LIZ(this, str, interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1786800wb8
    public Object getExternalPaymentToken(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return C1795670wpR.LIZIZ(this, str, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    @Override // X.InterfaceC1786800wb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object queryPurchases(X.EnumC1782260wTo r9, X.InterfaceC1364105Vn<? super java.util.List<X.C1788060wdA>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1795560wpG
            if (r0 == 0) goto L90
            r4 = r10
            X.0wpG r4 = (X.C1795560wpG) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L26
            if (r0 == r6) goto L59
            if (r0 != r2) goto L97
            X.C155000ia.LIZIZ(r7)
        L25:
            return r7
        L26:
            X.C155000ia.LIZIZ(r7)
            int[] r1 = X.C1782270wTp.LIZ
            int r0 = r9.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L4d
            if (r0 != r2) goto L9f
            X.0woV r1 = new X.0woV
            r1.<init>()
            java.lang.String r0 = "inapp"
            r1.LIZ = r0
        L3e:
            X.0woY r3 = r1.LIZ()
            r4.LL = r3
            r4.LLILZ = r6
            java.lang.Object r7 = X.C1795470wp7.LIZIZ(r8, r4)
            if (r7 != r5) goto L5e
            return r5
        L4d:
            X.0woV r1 = new X.0woV
            r1.<init>()
            java.lang.String r0 = "subs"
            r1.LIZ = r0
            r1.LIZIZ = r6
            goto L3e
        L59:
            X.0woY r3 = r4.LL
            X.C155000ia.LIZIZ(r7)
        L5e:
            X.0wp6 r7 = (X.AbstractC1795460wp6) r7
            r4.LL = r3
            r4.getClass()
            r4.LLILZ = r2
            X.1DEt r2 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r2.<init>(r6, r0)
            r2.LJIJJ()
            X.0wgo r1 = new X.0wgo
            r1.<init>(r2)
            X.0woW r0 = new X.0woW
            r0.<init>()
            r7.LJIIL(r3, r0)
            java.lang.Object r7 = r2.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r7 != r0) goto L8d
            X.C099Q.LIZJ(r4)
        L8d:
            if (r7 != r5) goto L25
            return r5
        L90:
            X.0wpG r4 = new X.0wpG
            r4.<init>(r8, r10)
            goto L12
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "productType "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " is not supported"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.iap.channel.google.IAPGoogleChannel.queryPurchases(X.0wTo, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    @Override // X.InterfaceC1786800wb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object consumePurchase(X.EnumC1782260wTo r11, X.C1788060wdA r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.iap.channel.google.IAPGoogleChannel.consumePurchase(X.0wTo, X.0wdA, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    @Override // X.InterfaceC1786800wb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initChannel(final java.lang.String r8, boolean r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1795620wpM
            if (r0 == 0) goto L70
            r6 = r10
            X.0wpM r6 = (X.C1795620wpM) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L64
            if (r0 != r4) goto L76
            X.C155000ia.LIZIZ(r1)
        L25:
            android.content.Context r0 = r7.applicationContext
            r7.registerCashierUpdateListener(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            X.0wpx r0 = new X.0wpx
            r0.<init>()
            r0.LIZ = r3
            X.0wqM r2 = r0.LIZ()
            android.content.Context r0 = r7.applicationContext
            X.0wss r1 = new X.0wss
            r1.<init>(r0)
            X.0woX r0 = new X.0woX
            r0.<init>()
            r1.LIZJ = r0
            r1.LIZ = r2
            r1.LIZIZ()
            if (r9 == 0) goto L52
            r1.LJII = r3
        L52:
            X.1BAY r0 = r1.LIZ()
            r7.setBillingClient$iap_channel_google_release(r0)
            if (r9 == 0) goto L67
            r6.LLILLL = r3
            java.lang.Object r0 = X.C1795470wp7.LIZ(r7, r6)
            if (r0 != r5) goto L67
            return r5
        L64:
            X.C155000ia.LIZIZ(r1)
        L67:
            r6.LLILLL = r4
            java.lang.Object r0 = r7.reloadConfig(r6)
            if (r0 != r5) goto L25
            return r5
        L70:
            X.0wpM r6 = new X.0wpM
            r6.<init>(r7, r10)
            goto L12
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.iap.channel.google.IAPGoogleChannel.initChannel(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.bytedance.iap.channel.google.IAPGoogleChannel] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC1786800wb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object queryProductDetails(X.EnumC1782260wTo r29, java.util.List<java.lang.String> r30, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1780600wR8>> r31) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.iap.channel.google.IAPGoogleChannel.queryProductDetails(X.0wTo, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r8
      0x0033: PHI (r8v11 java.lang.Object) = (r8v10 java.lang.Object), (r8v0 java.lang.Object) binds: [B:56:0x0179, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queryProductDetailsInternal$iap_channel_google_release(X.EnumC1782260wTo r14, java.util.List<java.lang.String> r15, X.InterfaceC1364105Vn<? super java.util.List<X.C1792740wki>> r16) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.iap.channel.google.IAPGoogleChannel.queryProductDetailsInternal$iap_channel_google_release(X.0wTo, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1786800wb8
    public Object launchExternalPayment(String str, Activity activity, String str2, InterfaceC1364105Vn<? super InterfaceC790710V0b> interfaceC1364105Vn) {
        return C1795670wpR.LIZJ(this, str, activity, UriProtector.parse(str2), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0204 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0226 A[Catch: 0wgn -> 0x0232, TryCatch #12 {0wgn -> 0x0232, blocks: (B:128:0x01ea, B:137:0x0220, B:139:0x0226, B:140:0x0231), top: B:246:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x038e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: 0wgn -> 0x01c2, TryCatch #20 {0wgn -> 0x01c2, blocks: (B:30:0x0097, B:32:0x00a1, B:33:0x00a8), top: B:262:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4 A[Catch: 0wgn -> 0x01b8, TryCatch #6 {0wgn -> 0x01b8, blocks: (B:48:0x00da, B:50:0x00e4, B:52:0x00ec, B:54:0x00f4, B:58:0x0104, B:65:0x0112, B:66:0x0117, B:67:0x0118, B:68:0x011d), top: B:236:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0143 A[Catch: 0wgn -> 0x01b2, TryCatch #13 {0wgn -> 0x01b2, blocks: (B:70:0x0127, B:73:0x0133, B:75:0x0137, B:81:0x0143, B:82:0x0146, B:85:0x015f, B:92:0x017a, B:93:0x018a), top: B:248:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a5 A[RETURN] */
    @Override // X.InterfaceC1786800wb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object launchPurchaseFlow(android.app.Activity r27, java.lang.String r28, java.lang.String r29, X.EnumC1782260wTo r30, java.lang.String r31, java.lang.String r32, X.InterfaceC1364105Vn<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.iap.channel.google.IAPGoogleChannel.launchPurchaseFlow(android.app.Activity, java.lang.String, java.lang.String, X.0wTo, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}

package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.AbstractC1067720dtK;
import X.AbstractC1542100qES;
import X.C01GW;
import X.C1000690c9D;
import X.C1014910cW9;
import X.C1028380crs;
import X.C1049260dPY;
import X.C1051170dSd;
import X.C1051180dSe;
import X.C1051200dSg;
import X.C1051220dSi;
import X.C1051290dSp;
import X.C1051410dT1;
import X.C1077220e8e;
import X.C1077560e9C;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1542120qEU;
import X.C1954807lC;
import X.C1ER0;
import X.C2188811AlT;
import X.C2487409ou;
import X.C259800zU;
import X.C452501pT;
import X.C811103Ev;
import X.C823050WQl;
import X.C830490Whz;
import X.EnumC055900Ij;
import X.EnumC1000680c9C;
import X.EnumC2008907tv;
import X.InterfaceC1020440cf4;
import X.InterfaceC1028400cru;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036150d4P;
import X.InterfaceC1036870d5Z;
import X.InterfaceC1051160dSc;
import X.InterfaceC1051190dSf;
import X.InterfaceC1051330dSt;
import X.InterfaceC1051480dT8;
import X.InterfaceC1057870ddR;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS4S2200000_16;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridAsyncSparkLoader;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdHybridAsyncSparkLoader extends IAdHybridCustomLoader {
    public static final C1051200dSg Companion = new Object() { // from class: X.0dSg
    };
    public static String tag = "AdHybridAsyncSparkLoader";
    public Context context;
    public InterfaceC1051190dSf iAdHybridLoadStatus;
    public boolean isFromPre;
    public boolean isLoadFailed;
    public boolean isPreRenderLoadFailed;
    public boolean isPreloadSuccess;
    public C1542120qEU preRenderLoadFailedReason;
    public String scene;
    public InterfaceC1051160dSc sparkMixture;
    public final AbstractC1542100qES renderLoadCallback = new C1077560e9C(this, 1);
    public final C01GW cachePool$delegate = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(132));

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public InterfaceC1034470d1h createHybridFragment(C1051290dSp c1051290dSp, boolean z, C830490Whz<String, Object> c830490Whz) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowFailed(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowSuccess() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registAdWebFragmentViewProvider(InterfaceC1036870d5Z interfaceC1036870d5Z) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityCallback(C1ER0 c1er0) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityRootViewProvider(InterfaceC1051330dSt interfaceC1051330dSt) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerHybridRootContainer(InterfaceC1036150d4P interfaceC1036150d4P) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerTitleBarProvider(AbstractC1067720dtK abstractC1067720dtK) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderFullScreen(C1051290dSp c1051290dSp) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderPopup(C1051290dSp c1051290dSp, InterfaceC1051480dT8 interfaceC1051480dT8) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void router(Context context, String str) {
    }

    private final Map<String, C1051180dSe> getCachePool() {
        return (Map) this.cachePool$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void close() {
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null) {
            interfaceC1051160dSc.close();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void destroy() {
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null) {
            interfaceC1051160dSc.destroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onHide() {
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null) {
            interfaceC1051160dSc.onHide();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void refresh() {
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null) {
            interfaceC1051160dSc.refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCache() {
        Map<String, C1051180dSe> cachePool = getCachePool();
        String str = this.scene;
        if (str == null) {
            str = null;
        }
        cachePool.remove(str);
    }

    public final boolean isPreloadSuccess() {
        return this.isPreloadSuccess;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public boolean isRendering() {
        return this.isPreloadSuccess;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCacheWithKey(String str) {
        ConcurrentHashMap<String, C1051170dSd> concurrentHashMap;
        C1051170dSd c1051170dSd;
        SoftReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> softReference;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        Map<String, C1051180dSe> cachePool = getCachePool();
        String str2 = this.scene;
        if (str2 == null) {
            str2 = null;
        }
        C1051180dSe c1051180dSe = cachePool.get(str2);
        if (c1051180dSe != null && (concurrentHashMap = c1051180dSe.LIZ) != null && (c1051170dSd = concurrentHashMap.get(str)) != null && (softReference = c1051170dSd.LIZ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = softReference.get()) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
        }
        C811103Ev.LIZ(tag);
    }

    public final void runOnUiThread(Function0<Unit> function0) {
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C2487409ou.LIZJ(new ARunnableS106S0100000_6((Function0) function0, 41));
        } else {
            function0.invoke();
        }
    }

    public final void setPreloadSuccess(boolean z) {
        this.isPreloadSuccess = z;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void updateGlobalProps(Map<String, ? extends Object> map) {
        InterfaceC1541990qEH kitView;
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null && (kitView = interfaceC1051160dSc.getKitView()) != null) {
            kitView.U0(map);
        }
    }

    private final C1051170dSd getCachedSparkView(String str, String str2) {
        ConcurrentHashMap<String, C1051170dSd> concurrentHashMap;
        C1051180dSe c1051180dSe = getCachePool().get(str);
        if (c1051180dSe != null && (concurrentHashMap = c1051180dSe.LIZ) != null) {
            return concurrentHashMap.get(str2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void initialize(String str, Context context) {
        this.context = context;
        this.scene = str;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void notifyFE(String str, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkMixture is empty = ");
        boolean z3 = true;
        if (this.sparkMixture == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ(tag);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sparkView is empty = ");
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null && interfaceC1051160dSc.getView() != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        sbLIZ2.append(z2);
        C2188811AlT.LIZIZ(sbLIZ2);
        C811103Ev.LIZ(tag);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("KitView is empty = ");
        InterfaceC1051160dSc interfaceC1051160dSc2 = this.sparkMixture;
        if (interfaceC1051160dSc2 != null && interfaceC1051160dSc2.getKitView() != null) {
            z3 = false;
        }
        sbLIZ3.append(z3);
        C2188811AlT.LIZIZ(sbLIZ3);
        C811103Ev.LIZ(tag);
        InterfaceC1051160dSc interfaceC1051160dSc3 = this.sparkMixture;
        if (interfaceC1051160dSc3 != null) {
            interfaceC1051160dSc3.LIZ(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onPreRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp) {
        String str;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null && (str = c1049260dPY.LIZIZ) != null) {
            String str2 = c1049260dPY.LIZLLL;
            if (getCachePool().get(c1051290dSp.LIZIZ) != null) {
                return;
            }
            C823050WQl.LIZLLL().execute(new ARunnableS4S2200000_16(this, str, str2, c1051290dSp, 0));
        }
    }

    private final void cacheSparkView(String str, String str2, C1051170dSd c1051170dSd) {
        if (getCachePool().get(str) == null) {
            getCachePool().put(str, new C1051180dSe(0));
        }
        C1051180dSe c1051180dSe = getCachePool().get(str);
        if (c1051180dSe != null) {
            c1051180dSe.LIZ.put(str2, c1051170dSd);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp, InterfaceC1051190dSf interfaceC1051190dSf) {
        String str;
        String str2;
        Bundle bundle;
        InterfaceC1020440cf4 interfaceC1020440cf4;
        this.iAdHybridLoadStatus = interfaceC1051190dSf;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        Context context = null;
        if (c1049260dPY != null && (str = c1049260dPY.LIZIZ) != null && !a0.LJJJIL(str)) {
            C1049260dPY c1049260dPY2 = c1051290dSp.LJFF;
            if (c1049260dPY2 != null && (str2 = c1049260dPY2.LIZLLL) != null && !a0.LJJJIL(str2)) {
                int i = C1000690c9D.LIZ[c1051290dSp.LIZ.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    if (i == 4) {
                        this.isFromPre = false;
                        InterfaceC1028400cru adRenderLifecycle = getAdRenderLifecycle();
                        if (adRenderLifecycle != null) {
                            adRenderLifecycle.LIZIZ();
                        }
                        C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
                        Context context2 = this.context;
                        if (context2 == null) {
                            context2 = null;
                        }
                        C1049260dPY c1049260dPY3 = c1051290dSp.LJFF;
                        if (c1049260dPY3 != null) {
                            bundle = c1049260dPY3.LIZJ;
                        } else {
                            bundle = null;
                        }
                        AbstractC1542100qES abstractC1542100qES = this.renderLoadCallback;
                        if (c1049260dPY3 != null) {
                            interfaceC1020440cf4 = c1049260dPY3.LJ;
                        } else {
                            interfaceC1020440cf4 = null;
                        }
                        String str3 = this.scene;
                        if (str3 == null) {
                            str3 = null;
                        }
                        C1051220dSi c1051220dSiLIZJ = c1051410dT1.LIZJ(context2, str, bundle, str2, abstractC1542100qES, interfaceC1020440cf4, str3, null);
                        this.sparkMixture = c1051220dSiLIZJ;
                        c1051220dSiLIZJ.LIZIZ();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    Context context3 = this.context;
                    if (context3 == null) {
                        context3 = null;
                    }
                    String str4 = c1051290dSp.LIZIZ;
                    String str5 = this.scene;
                    if (str5 == null) {
                        str5 = null;
                    }
                    fetchViewInPool(context3, str4, str, str5, str2, c1051290dSp, null);
                }
                Context context4 = this.context;
                if (context4 != null) {
                    context = context4;
                }
                C811103Ev.LIZIZ(context, "Lynx optimize");
                return;
            }
            interfaceC1051190dSf.k3("-3", "access_key_empty");
            return;
        }
        interfaceC1051190dSf.k3("-2", "schema_illegal");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0e8e] */
    public final void realLoad(String str, SparkContext sparkContext, String str2, String str3, final C1049260dPY c1049260dPY) {
        final C1051170dSd c1051170dSd = new C1051170dSd(EnumC055900Ij.LOADING);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C1077220e8e(0);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = this.context;
        if (context == null) {
            context = null;
        }
        InterfaceC1057870ddR interfaceC1057870ddR = new InterfaceC1057870ddR() { // from class: X.0dPb
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                Integer numValueOf;
                Integer numValueOf2;
                if (interfaceC1531560pxS instanceof C1537910q7h) {
                    C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                    C1049260dPY c1049260dPY2 = c1049260dPY;
                    if (c1049260dPY2 != null && c1049260dPY2.LJII != null) {
                        numValueOf = c1049260dPY2.LJII;
                    } else {
                        Context context2 = this.context;
                        if (context2 == null) {
                            context2 = null;
                        }
                        numValueOf = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(context2), 1073741824));
                    }
                    c1537910q7h.LJIJ = numValueOf;
                    C1049260dPY c1049260dPY3 = c1049260dPY;
                    if (c1049260dPY3 != null && c1049260dPY3.LJIIIIZZ != null) {
                        numValueOf2 = c1049260dPY3.LJIIIIZZ;
                    } else {
                        numValueOf2 = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    c1537910q7h.LJIIZILJ = numValueOf2;
                    C649560Pdq c649560Pdq = new C649560Pdq();
                    c649560Pdq.LIZIZ = Integer.valueOf(EnumC665490Q8l.MULTI_THREADS.id());
                    c649560Pdq.LIZ = Boolean.TRUE;
                    c1537910q7h.LJIJJ(c649560Pdq);
                    LynxViewClient lynxViewClient = (LynxViewClient) c259800zU.element;
                    if (lynxViewClient != null) {
                        c1537910q7h.LJIIIIZZ(lynxViewClient);
                    }
                }
            }
        };
        sparkContext.getClass();
        sparkContext.LJJ(InterfaceC1057870ddR.class, interfaceC1057870ddR);
        sparkContext.LJJJJLL(new AbstractC1542100qES() { // from class: X.0dSb
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                AdHybridAsyncSparkLoader adHybridAsyncSparkLoader = this.LL;
                if (!adHybridAsyncSparkLoader.isPreRenderLoadFailed) {
                    adHybridAsyncSparkLoader.setPreloadSuccess(true);
                    c1051170dSd.LIZIZ = EnumC055900Ij.SUCCEED;
                    AdHybridAsyncSparkLoader adHybridAsyncSparkLoader2 = this.LL;
                    adHybridAsyncSparkLoader2.runOnUiThread(new AwS417S0200000_16(interfaceC1541990qEH, adHybridAsyncSparkLoader2, 9));
                }
                AdHybridAsyncSparkLoader.Companion.getClass();
                C811103Ev.LIZ(AdHybridAsyncSparkLoader.tag);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
                c1051170dSd.LIZIZ = EnumC055900Ij.SUCCEED;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str4) {
                Bundle bundle;
                AdHybridAsyncSparkLoader adHybridAsyncSparkLoader = this.LL;
                adHybridAsyncSparkLoader.isPreRenderLoadFailed = false;
                InterfaceC1020440cf4 interfaceC1020440cf4 = null;
                adHybridAsyncSparkLoader.preRenderLoadFailedReason = null;
                C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
                C1049260dPY c1049260dPY2 = c1049260dPY;
                if (c1049260dPY2 != null) {
                    bundle = c1049260dPY2.LIZJ;
                    interfaceC1020440cf4 = c1049260dPY2.LJ;
                } else {
                    bundle = null;
                }
                c1051410dT1.getClass();
                C1051410dT1.LJ(interfaceC1541990qEH, bundle, interfaceC1020440cf4);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str4, C1542120qEU c1542120qEU) {
                LJLI(interfaceC1541990qEH, str4, c1542120qEU.LIZIZ);
                c1051170dSd.LIZIZ = EnumC055900Ij.FAILED;
                AdHybridAsyncSparkLoader adHybridAsyncSparkLoader = this.LL;
                adHybridAsyncSparkLoader.isPreRenderLoadFailed = true;
                adHybridAsyncSparkLoader.preRenderLoadFailedReason = c1542120qEU;
                adHybridAsyncSparkLoader.setPreloadSuccess(false);
                AdHybridAsyncSparkLoader adHybridAsyncSparkLoader2 = this.LL;
                adHybridAsyncSparkLoader2.runOnUiThread(new AwS417S0200000_16(c1542120qEU, adHybridAsyncSparkLoader2, 8));
            }
        });
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
        c1051170dSd.LIZ = new SoftReference<>(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
        cacheSparkView(str3, str2, c1051170dSd);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
    }

    public final void renderRetry(final Context context, final String str, final String str2, final C1051290dSp c1051290dSp, final Bundle bundle) {
        InterfaceC1020440cf4 interfaceC1020440cf4;
        C811103Ev.LIZ(tag);
        EnumC1000680c9C enumC1000680c9C = c1051290dSp.LIZ;
        if (enumC1000680c9C == EnumC1000680c9C.ONLY_CACHE) {
            C811103Ev.LIZ(tag);
            InterfaceC1051190dSf interfaceC1051190dSf = this.iAdHybridLoadStatus;
            if (interfaceC1051190dSf != null) {
                interfaceC1051190dSf.k3("-5", "preload_failed");
                return;
            }
            return;
        }
        if (enumC1000680c9C == EnumC1000680c9C.CACHE_WITH_ASYNC_RETRY) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0dSa
                /* JADX WARN: Type inference failed for: r1v2, types: [T, X.0e8e] */
                public final void LIZ() {
                    AdHybridAsyncSparkLoader adHybridAsyncSparkLoader = this.LL;
                    adHybridAsyncSparkLoader.isFromPre = true;
                    InterfaceC1028400cru adRenderLifecycle = adHybridAsyncSparkLoader.getAdRenderLifecycle();
                    if (adRenderLifecycle != null) {
                        adRenderLifecycle.LIZIZ();
                    }
                    C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
                    Context context2 = context;
                    String str3 = str;
                    String str4 = str2;
                    Bundle bundle2 = bundle;
                    C1049260dPY c1049260dPY = c1051290dSp.LJFF;
                    InterfaceC1020440cf4 interfaceC1020440cf42 = c1049260dPY != null ? c1049260dPY.LJ : null;
                    String str5 = this.LL.scene;
                    if (str5 == null) {
                        str5 = null;
                    }
                    c1051410dT1.getClass();
                    AdSparkHybridContext adSparkHybridContextLIZ = C1051410dT1.LIZ(context2, str3, str4, bundle2, interfaceC1020440cf42, str5, null, null, null, false, null);
                    adSparkHybridContextLIZ.LJJLJ(this.LL.renderLoadCallback);
                    final C259800zU c259800zU = new C259800zU();
                    c259800zU.element = new C1077220e8e(1);
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    final Context context3 = context;
                    final C1051290dSp c1051290dSp2 = c1051290dSp;
                    adSparkHybridContextLIZ.LJJ(InterfaceC1057870ddR.class, new InterfaceC1057870ddR() { // from class: X.0dPa
                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }

                        @Override // X.InterfaceC1057870ddR
                        public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                            Integer numValueOf;
                            if (interfaceC1531560pxS instanceof C1537910q7h) {
                                C1049260dPY c1049260dPY2 = c1051290dSp2.LJFF;
                                Integer numValueOf2 = null;
                                if (c1049260dPY2 != null) {
                                    numValueOf = c1049260dPY2.LJII;
                                    numValueOf2 = c1049260dPY2.LJIIIIZZ;
                                } else {
                                    numValueOf = null;
                                }
                                C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                                if (numValueOf == null) {
                                    numValueOf = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(C12ES.LJIIJ(context3), 1073741824));
                                }
                                c1537910q7h.LJIJ = numValueOf;
                                if (numValueOf2 == null) {
                                    numValueOf2 = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
                                }
                                c1537910q7h.LJIIZILJ = numValueOf2;
                                C649560Pdq c649560Pdq = new C649560Pdq();
                                c649560Pdq.LIZIZ = Integer.valueOf(EnumC665490Q8l.MULTI_THREADS.id());
                                c649560Pdq.LIZ = Boolean.TRUE;
                                c1537910q7h.LJIJJ(c649560Pdq);
                                LynxViewClient lynxViewClient = (LynxViewClient) c259800zU.element;
                                if (lynxViewClient != null) {
                                    c1537910q7h.LJIIIIZZ(lynxViewClient);
                                }
                            }
                        }
                    });
                    c1537900q7g.getClass();
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context3, adSparkHybridContextLIZ).LIZ(false);
                    this.LL.sparkMixture = new C1051220dSi(adSparkHybridContextLIZ, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AdHybridAsyncSparkLoader@4832.renderRetry$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AdHybridAsyncSparkLoader@4832.renderRetry$1");
                }
            });
            return;
        }
        if (enumC1000680c9C != EnumC1000680c9C.CACHE_WITH_RETRY) {
            return;
        }
        this.isFromPre = true;
        InterfaceC1028400cru adRenderLifecycle = getAdRenderLifecycle();
        if (adRenderLifecycle != null) {
            adRenderLifecycle.LIZIZ();
        }
        C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
        AbstractC1542100qES abstractC1542100qES = this.renderLoadCallback;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null) {
            interfaceC1020440cf4 = c1049260dPY.LJ;
        } else {
            interfaceC1020440cf4 = null;
        }
        String str3 = this.scene;
        if (str3 == null) {
            str3 = null;
        }
        C1051220dSi c1051220dSiLIZJ = c1051410dT1.LIZJ(context, str, bundle, str2, abstractC1542100qES, interfaceC1020440cf4, str3, null);
        this.sparkMixture = c1051220dSiLIZJ;
        c1051220dSiLIZJ.LIZIZ();
    }

    private final void fetchViewInPool(Context context, String str, String str2, String str3, String str4, C1051290dSp c1051290dSp, Bundle bundle) {
        ConcurrentHashMap<String, C1051170dSd> concurrentHashMap;
        C1051170dSd c1051170dSd;
        SoftReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> softReference;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        EnumC055900Ij enumC055900Ij;
        SparkContext sparkContextLLIILZL;
        C1051180dSe c1051180dSe = getCachePool().get(str3);
        String str5 = null;
        if (c1051180dSe != null && (concurrentHashMap = c1051180dSe.LIZ) != null && (c1051170dSd = concurrentHashMap.get(str)) != null && (softReference = c1051170dSd.LIZ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = softReference.get()) != null) {
            if (c1051170dSd != null) {
                enumC055900Ij = c1051170dSd.LIZIZ;
            } else {
                enumC055900Ij = null;
            }
            if (enumC055900Ij == EnumC055900Ij.SUCCEED) {
                C811103Ev.LIZ(tag);
                InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
                if (interfaceC1051160dSc != null) {
                    sparkContextLLIILZL = interfaceC1051160dSc.LLIILZL();
                } else {
                    sparkContextLLIILZL = null;
                }
                this.sparkMixture = new C1051220dSi(sparkContextLLIILZL, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                InterfaceC1051190dSf interfaceC1051190dSf = this.iAdHybridLoadStatus;
                if (interfaceC1051190dSf != null) {
                    EnumC2008907tv enumC2008907tv = EnumC2008907tv.STATUS_LOAD_SUCCESS;
                    SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                    if (sparkContext != null) {
                        str5 = sparkContext.containerId;
                    }
                    interfaceC1051190dSf.A9(new C1014910cW9(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, enumC2008907tv, str5, false));
                    return;
                }
                return;
            }
        }
        C811103Ev.LIZ(tag);
        renderRetry(context, str2, str4, c1051290dSp, bundle);
    }
}

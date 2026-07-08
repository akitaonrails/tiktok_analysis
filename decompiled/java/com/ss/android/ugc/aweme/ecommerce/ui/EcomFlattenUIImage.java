package com.ss.android.ugc.aweme.ecommerce.ui;

import X.AbstractC1539020q9U;
import X.AnonymousClass0317;
import X.C00J7;
import X.C034S;
import X.C1066210dqt;
import X.C1120604Zw;
import X.C1254504vX;
import X.C1315750kLN;
import X.C1315960kLi;
import X.C1320770kTT;
import X.C1322270kVt;
import X.C1323210kXP;
import X.C1323300kXY;
import X.C1323310kXZ;
import X.C1323350kXd;
import X.C1323400kXi;
import X.C1323410kXj;
import X.C1326250kcJ;
import X.C1326840kdG;
import X.C1326860kdI;
import X.C1331070kk5;
import X.C1507830pLB;
import X.C1507840pLC;
import X.C1AQS;
import X.C2552109zL;
import X.C314740CVk;
import X.C770702zh;
import X.EnumC1323290kXX;
import X.EnumC1323330kXb;
import X.EnumC1331380kka;
import X.InterfaceC1310460kCq;
import X.InterfaceC1312540kGC;
import X.InterfaceC1316360kMM;
import X.InterfaceC1323360kXe;
import X.InterfaceC1507880pLG;
import X.InterfaceC1541990qEH;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.ui.image.FlattenUIImage;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.image.EcomLynxPrefetchData;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage;
import j27.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomFlattenUIImage extends FlattenUIImage implements InterfaceC1310460kCq {
    public static final Field LLJJIJI;
    public static final BPEAHandler LLJJIJIIJIL;
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final EnumC1331380kka LLILZIL;
    public final C1323310kXZ LLILZLL;
    public HashMap<String, Object> LLIZ;
    public String LLIZLLLIL;
    public HashMap<String, Object> LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public C1326860kdI LLJILJILJ;
    public final HashMap<String, Long> LLJILLL;
    public final C1323300kXY LLJJ;
    public final ARunnableS120S0100000_20 LLJJI;
    public long LLJJIII;

    static {
        Field declaredField;
        try {
            declaredField = C1315750kLN.class.getDeclaredField("LJIJ");
            declaredField.setAccessible(true);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            declaredField = null;
        }
        LLJJIJI = declaredField;
        LLJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // X.InterfaceC1310460kCq
    public final void LJIIIIZZ() {
        this.LLJJ.LJFF = false;
    }

    @Override // X.InterfaceC1310460kCq
    public final void LJIILLIIL() {
        this.LLJJ.LJFF = true;
    }

    public final void LJJIIZI() {
        C1323300kXY c1323300kXY = this.LLJJ;
        c1323300kXY.getClass();
        c1323300kXY.LIZ = EnumC1323290kXX.LOADING;
        this.LLJILLL.put(this.LLJILJIL, Long.valueOf(System.currentTimeMillis()));
    }

    public final void LJJIJ() {
        String str = this.LLJI;
        if (str == null || !this.LLJIJIL) {
            return;
        }
        LJJIJIIJI(str);
        C1326860kdI c1326860kdILIZ = C1326840kdG.LIZ(str, false);
        String str2 = c1326860kdILIZ.LIZ;
        this.LLJILJIL = str2;
        this.LLJILJILJ = c1326860kdILIZ;
        if (!Intrinsics.LJFF(str2, str)) {
            LJJIJIIJI(this.LLJILJIL);
        }
        super.setSource(this.LLJILJIL);
        C1323300kXY c1323300kXY = this.LLJJ;
        c1323300kXY.getClass();
        c1323300kXY.LIZ = EnumC1323290kXX.INIT;
        c1323300kXY.LIZLLL = EnumC1323330kXb.INIT;
        c1323300kXY.LIZIZ = 0;
        c1323300kXY.LIZJ = 0;
        LJJIIZI();
        this.LLJIJIL = false;
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage, com.lynx.tasm.behavior.ui.LynxFlattenUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        if (this.LLJILLL.containsKey(this.LLJILJIL)) {
            LJJIIZI();
        }
        super.onAttach();
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        AnonymousClass0317 anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin;
        super.onDetach();
        if (this.LLILLL) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = NetworkUtilDependencyService.createINetworkUtilDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, INetworkUtilDependencyService.class.getName(), anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkUtilDependencyService.class);
            }
            ((INetworkUtilDependencyService) anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin).removeNetworkChangeObserver(this.LLILZLL);
            LLJJIJIIJIL.removeCallbacks(this.LLJJI);
        }
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        C1326250kcJ.LIZIZ().LIZJ("props_updated", "EcomFlattenUIImage onPropsUpdated");
        if (this.LLJI != null && this.LLJIJIL && this.LLJJIII == 0) {
            this.LLJJIII = System.currentTimeMillis();
        }
        if (!this.LLILZ) {
            LJJIJ();
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        } else {
            LJJIJ();
        }
        super.onPropsUpdated();
    }

    public final void LJJIJIIJI(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.LL;
        if (str2 != null) {
            C1066210dqt.LIZLLL(str, "lynx", new Pair("page_name", str2));
        }
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            C1066210dqt.LIZLLL(str, "lynx", new Pair("template_path", str3));
        }
        C1066210dqt.LIZJ(str, "lynx", this.LLJ);
        C1066210dqt.LIZJ(str, "lynx", this.LLIZ);
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final C1315750kLN createImageManager(Context context) {
        if (C1507840pLC.LIZ.enable && C1507840pLC.LIZIZ().enableSubs.contains("image") && (context instanceof s)) {
            return new C1323410kXj((s) context, this);
        }
        return super.createImageManager(context);
    }

    @InterfaceC1312540kGC(name = "func-params")
    public final void setFuncParams(ReadableMap readableMap) {
        HashMap<String, Object> mapAsHashMap;
        if (readableMap != null) {
            mapAsHashMap = readableMap.asHashMap();
        } else {
            mapAsHashMap = null;
        }
        this.LLJ = mapAsHashMap;
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final void setPreFetchHeight(String str) {
        EcomLynxPrefetchData ecomLynxPrefetchData = C1323350kXd.LIZ;
        if (!C1323350kXd.LIZ.ignorePrefetch) {
            super.setPreFetchHeight(str);
        }
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final void setPreFetchWidth(String str) {
        EcomLynxPrefetchData ecomLynxPrefetchData = C1323350kXd.LIZ;
        if (!C1323350kXd.LIZ.ignorePrefetch) {
            super.setPreFetchWidth(str);
        }
    }

    @Override // com.lynx.tasm.ui.image.FlattenUIImage
    public final void setSource(String str) {
        InterfaceC1316360kMM interfaceC1316360kMM;
        C1320770kTT<C1331070kk5> c1320770kTT;
        if (C770702zh.LIZIZ(str) && !Intrinsics.LJFF(this.LLJI, str)) {
            this.LLJI = str;
            if (C2552109zL.LIZ) {
                C1315750kLN c1315750kLN = this.mLynxImageManager;
                if (c1315750kLN != null && (c1320770kTT = c1315750kLN.LJIIJJI) != null) {
                    interfaceC1316360kMM = c1320770kTT.LLILZ;
                    interfaceC1316360kMM.getClass();
                } else {
                    interfaceC1316360kMM = null;
                }
                C1322270kVt.LIZIZ(str, interfaceC1316360kMM);
            }
            this.LLJIJIL = true;
        }
    }

    @InterfaceC1312540kGC(name = "track-params")
    public final void setTrackParams(ReadableMap readableMap) {
        HashMap<String, Object> mapAsHashMap;
        Object obj;
        String string = null;
        if (readableMap != null) {
            mapAsHashMap = readableMap.asHashMap();
        } else {
            mapAsHashMap = null;
        }
        this.LLIZ = mapAsHashMap;
        if (mapAsHashMap != null && (obj = mapAsHashMap.get("data_from")) != null) {
            string = obj.toString();
        }
        String str = this.LLIZLLLIL;
        this.LLIZLLLIL = string;
        String str2 = this.LLJILJIL;
        if (str2 != null) {
            C1066210dqt.LIZJ(str2, "lynx", mapAsHashMap);
        }
        if (C00J7.LIZ.enable == 1 && Intrinsics.LJFF(str, "prefetch_cache") && string != null && !Intrinsics.LJFF(string, "prefetch_cache")) {
            LJJIIZI();
            this.mLynxImageManager.LJIIIIZZ = true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0kXh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0kXZ, X.0kXe] */
    public EcomFlattenUIImage(s sVar, String str, String str2, boolean z, boolean z2, EnumC1331380kka enumC1331380kka) throws IllegalAccessException {
        Object obj;
        final C1315960kLi c1315960kLi;
        C1323410kXj c1323410kXj;
        C1323400kXi c1323400kXi;
        WeakReference<InterfaceC1541990qEH> weakReference;
        InterfaceC1541990qEH interfaceC1541990qEH;
        AnonymousClass0317 anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin;
        boolean z3;
        String name;
        s sVar2 = sVar;
        if (sVar2 != null) {
            if (C314740CVk.LIZ.enableLynxImageAsync && (str == null || (!r1.disableLynxImageAsyncPages.contains(str)))) {
                sVar2.LLJZ = true;
            }
        } else {
            sVar2 = null;
        }
        super(sVar2);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = enumC1331380kka;
        ?? r4 = new InterfaceC1323360kXe(this) { // from class: X.0kXZ
            public final WeakReference<EcomFlattenUIImage> LIZ;

            {
                this.LIZ = new WeakReference<>(this);
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
            @Override // X.InterfaceC1323360kXe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.EnumC1323320kXa r9) {
                /*
                    r8 = this;
                    java.lang.ref.WeakReference<com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage> r0 = r8.LIZ
                    java.lang.Object r4 = r0.get()
                    com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage r4 = (com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage) r4
                    if (r4 == 0) goto L6a
                    X.0kXY r5 = r4.LLJJ
                    X.0kXa r3 = r5.LJ
                    java.lang.String r7 = r4.LLJILJIL
                    X.0kXX r1 = r5.LIZ
                    X.0kXX r0 = X.EnumC1323290kXX.FAIL
                    r6 = 1
                    if (r1 != r0) goto L74
                    r2 = 1
                L18:
                    int r1 = r5.LIZJ
                    r0 = 2
                    if (r1 >= r0) goto L72
                    r1 = 1
                L1e:
                    boolean r0 = X.C770702zh.LIZIZ(r7)
                    if (r0 == 0) goto L70
                    if (r2 == 0) goto L70
                    if (r1 == 0) goto L70
                    boolean r0 = r5.LJFF
                    if (r0 != 0) goto L70
                    X.0kXa r2 = X.EnumC1323320kXa.STRONG
                    if (r9 != r2) goto L6e
                    if (r3 == r2) goto L6e
                    r1 = 1
                L33:
                    X.0kXa r0 = X.EnumC1323320kXa.WEAK
                    if (r9 != r0) goto L6b
                    if (r3 == r2) goto L6b
                    if (r3 == r0) goto L6b
                L3b:
                    int r0 = r5.LIZJ
                    int r0 = r0 + 1
                    r5.LIZJ = r0
                    X.0kXb r0 = X.EnumC1323330kXb.NETWORK
                    r5.LIZLLL = r0
                L45:
                    r5.LJ = r9
                    if (r6 == 0) goto L6a
                    X.0kXY r1 = r4.LLJJ
                    r1.getClass()
                    X.0kXX r0 = X.EnumC1323290kXX.LOADING
                    r1.LIZ = r0
                    java.util.Map r2 = X.C2097608Jq.LJ()
                    kotlin.jvm.internal.AwS229S0300000_20 r1 = new kotlin.jvm.internal.AwS229S0300000_20
                    r0 = 4
                    r1.<init>(r3, r9, r4, r0)
                    java.lang.String r0 = "rd_tiktokec_image_no_network_retry"
                    X.C1018703yb.LIZJ(r0, r2, r1)
                    com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage.LLJJIJIIJIL
                    Y.ARunnableS120S0100000_20 r2 = r4.LLJJI
                    r0 = 300(0x12c, double:1.48E-321)
                    X.C786410Ut5.LJLIIL(r0, r3, r2)
                L6a:
                    return
                L6b:
                    if (r1 == 0) goto L70
                    goto L3b
                L6e:
                    r1 = 0
                    goto L33
                L70:
                    r6 = 0
                    goto L45
                L72:
                    r1 = 0
                    goto L1e
                L74:
                    r2 = 0
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1323310kXZ.LIZ(X.0kXa):void");
            }
        };
        this.LLILZLL = r4;
        Field field = LLJJIJI;
        if (field != null) {
            obj = field.get(this.mLynxImageManager);
        } else {
            obj = null;
        }
        if (obj instanceof C1315960kLi) {
            c1315960kLi = (C1315960kLi) obj;
        } else {
            c1315960kLi = null;
        }
        if (field != null) {
            field.set(this.mLynxImageManager, new C1315960kLi() { // from class: X.0kXW
                @Override // X.C1315960kLi
                public final void LJFF() {
                    EcomFlattenUIImage ecomFlattenUIImage = this.LIZ;
                    if (ecomFlattenUIImage.LLJILLL.containsKey(ecomFlattenUIImage.LLJILJIL)) {
                        this.LIZ.LJJIIZI();
                    }
                }

                @Override // X.C1315960kLi
                public final void LJ(int i, int i2) {
                    EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel;
                    C1323300kXY c1323300kXY = this.LIZ.LLJJ;
                    c1323300kXY.getClass();
                    c1323300kXY.LIZ = EnumC1323290kXX.SUCCESS;
                    C1315960kLi c1315960kLi2 = c1315960kLi;
                    if (c1315960kLi2 != null) {
                        c1315960kLi2.LJ(i, i2);
                    }
                    EcomFlattenUIImage ecomFlattenUIImage = this.LIZ;
                    String str3 = ecomFlattenUIImage.LLJILJIL;
                    if (str3 == null) {
                        return;
                    }
                    try {
                        Long lRemove = ecomFlattenUIImage.LLJILLL.remove(str3);
                        if (lRemove != null) {
                            EcomFlattenUIImage ecomFlattenUIImage2 = this.LIZ;
                            long jLongValue = lRemove.longValue();
                            C1325710kbR c1325710kbR = ecomFlattenUIImage2.mLynxImageManager.LJIIZILJ;
                            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                            int iLIZIZ = ecomFlattenUIImage2.LLJJ.LIZIZ();
                            HashMap<String, Object> map = ecomFlattenUIImage2.LLIZ;
                            C1326860kdI c1326860kdI = ecomFlattenUIImage2.LLJILJILJ;
                            boolean z4 = false;
                            if (c1326860kdI != null && (ecomImageAdaptSizeConfigModel = c1326860kdI.LIZJ) != null && C20158413uA.LIZ(ecomImageAdaptSizeConfigModel, null, false) != null) {
                                z4 = true;
                            }
                            C1326230kcH.LJFF(true, true, c1325710kbR, jCurrentTimeMillis, iLIZIZ, map, null, null, null, Boolean.valueOf(z4));
                        }
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.C1315960kLi
                public final void LIZJ(int i, int i2, String str3) {
                    EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel;
                    C1323300kXY c1323300kXY = this.LIZ.LLJJ;
                    c1323300kXY.getClass();
                    c1323300kXY.LIZ = EnumC1323290kXX.FAIL;
                    EcomFlattenUIImage ecomFlattenUIImage = this.LIZ;
                    boolean z4 = true;
                    if (ecomFlattenUIImage.LLJJ.LIZ()) {
                        ecomFlattenUIImage.LJJIIZI();
                        ecomFlattenUIImage.mLynxImageManager.LJIIIIZZ = true;
                        ecomFlattenUIImage.renderIfNeeded();
                        return;
                    }
                    EcomFlattenUIImage ecomFlattenUIImage2 = this.LIZ;
                    if (ecomFlattenUIImage2.LLILLL && ecomFlattenUIImage2.LLJJ.LIZLLL == EnumC1323330kXb.NETWORK) {
                        return;
                    }
                    C1315960kLi c1315960kLi2 = c1315960kLi;
                    if (c1315960kLi2 != null) {
                        c1315960kLi2.LIZJ(i, i2, str3);
                    }
                    EcomFlattenUIImage ecomFlattenUIImage3 = this.LIZ;
                    String str4 = ecomFlattenUIImage3.LLJILJIL;
                    if (str4 == null) {
                        return;
                    }
                    try {
                        Long lRemove = ecomFlattenUIImage3.LLJILLL.remove(str4);
                        if (lRemove != null) {
                            EcomFlattenUIImage ecomFlattenUIImage4 = this.LIZ;
                            long jLongValue = lRemove.longValue();
                            C1325710kbR c1325710kbR = ecomFlattenUIImage4.mLynxImageManager.LJIIZILJ;
                            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                            int iLIZIZ = ecomFlattenUIImage4.LLJJ.LIZIZ();
                            HashMap<String, Object> map = ecomFlattenUIImage4.LLIZ;
                            Integer numValueOf = Integer.valueOf(i);
                            Integer numValueOf2 = Integer.valueOf(i2);
                            C1326860kdI c1326860kdI = ecomFlattenUIImage4.LLJILJILJ;
                            if (c1326860kdI == null || (ecomImageAdaptSizeConfigModel = c1326860kdI.LIZJ) == null || C20158413uA.LIZ(ecomImageAdaptSizeConfigModel, null, false) == null) {
                                z4 = false;
                            }
                            C1326230kcH.LJFF(true, false, c1325710kbR, jCurrentTimeMillis, iLIZIZ, map, str3, numValueOf, numValueOf2, Boolean.valueOf(z4));
                        }
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            });
        }
        Set<String> set = C1254504vX.LIZ;
        if (str != null) {
            Set<String> set2 = C1254504vX.LIZ;
            if (!set2.isEmpty() && set2.contains(str)) {
                setSimpleCacheKey(true);
            }
        }
        if (z) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = NetworkUtilDependencyService.createINetworkUtilDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name2 = INetworkUtilDependencyService.class.getName();
                if (anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkUtilDependencyService.class);
            }
            ((INetworkUtilDependencyService) anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin).observerNetworkChange(r4);
        }
        if (enumC1331380kka != null) {
            this.mLynxImageManager.LJJJZ = new C1323210kXP(this);
        }
        if (str != null) {
            C1315750kLN c1315750kLN = this.mLynxImageManager;
            if ((c1315750kLN instanceof C1323410kXj) && (c1323410kXj = (C1323410kXj) c1315750kLN) != null) {
                String str3 = this.LL;
                if (!c1323410kXj.LJLI) {
                    c1323410kXj.LJJLIIIJJI = str3;
                    if (C1507840pLC.LIZIZ().pages.containsKey(str3)) {
                        c1323410kXj.LJJLIIIJLJLI = true;
                        if (!Intrinsics.LJFF(c1323410kXj.LJL, str3) || c1323410kXj.LJJZZIII == null) {
                            String str4 = c1323410kXj.LJL;
                            if (str4 != null && (c1323400kXi = c1323410kXj.LJJZZIII) != null) {
                                C1507830pLB.LJII(c1323400kXi, str4);
                                CopyOnWriteArraySet<InterfaceC1507880pLG> copyOnWriteArraySet = C1507830pLB.LJIIJ.get(str4);
                                if (copyOnWriteArraySet != null) {
                                    copyOnWriteArraySet.remove(c1323400kXi);
                                }
                                c1323410kXj.LJL = null;
                                c1323410kXj.LJJZZIII = null;
                            }
                            C1323400kXi c1323400kXi2 = new C1323400kXi(c1323410kXj, str3);
                            c1323410kXj.LJJZZIII = c1323400kXi2;
                            c1323410kXj.LJL = str3;
                            C1507830pLB.LJI(str3, c1323400kXi2);
                            ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC1507880pLG>> concurrentHashMap = C1507830pLB.LJIIJ;
                            CopyOnWriteArraySet<InterfaceC1507880pLG> copyOnWriteArraySet2 = concurrentHashMap.get(str3);
                            if (copyOnWriteArraySet2 == null) {
                                copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
                                concurrentHashMap.put(str3, copyOnWriteArraySet2);
                            }
                            copyOnWriteArraySet2.add(c1323400kXi2);
                        }
                        if (c1323410kXj.LJJZZI == null && (weakReference = c1323410kXj.LJJZ) != null && (interfaceC1541990qEH = weakReference.get()) != null) {
                            final WeakReference weakReference2 = new WeakReference(c1323410kXj);
                            ?? r2 = new AbstractC1539020q9U() { // from class: X.0kXh
                                @Override // X.InterfaceC1539090q9b
                                public final void LIZ(InterfaceC1541990qEH interfaceC1541990qEH2) {
                                    C1323410kXj c1323410kXj2 = weakReference2.get();
                                    if (c1323410kXj2 != null) {
                                        c1323410kXj2.LJIJJLI();
                                    }
                                }
                            };
                            c1323410kXj.LJJZZI = r2;
                            interfaceC1541990qEH.getHybridContext().LJJ(AbstractC1539020q9U.class, r2);
                        }
                    }
                }
            }
        }
        this.LLJILLL = new HashMap<>();
        this.LLJJ = new C1323300kXY();
        this.LLJJI = new ARunnableS120S0100000_20(this, 81);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        if (this.LLILZ && (getWidth() <= 0 || getHeight() <= 0)) {
            LJJIJ();
            super.onPropsUpdated();
        }
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
    }
}

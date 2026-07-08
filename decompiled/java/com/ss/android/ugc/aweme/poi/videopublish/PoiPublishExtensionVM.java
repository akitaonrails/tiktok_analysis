package com.ss.android.ugc.aweme.poi.videopublish;

import X.AbstractC1200170hKx;
import X.C09YA;
import X.C1192750h8z;
import X.C1199800hKM;
import X.C1199840hKQ;
import X.C1199950hKb;
import X.C1200000hKg;
import X.C1200020hKi;
import X.C1200260hL6;
import X.C1200280hL8;
import X.C1201120hMU;
import X.C1205850hU7;
import X.C1220000hqw;
import X.C13LE;
import X.C2188811AlT;
import X.C356901a3;
import X.C443120HZe;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC0148002o;
import X.InterfaceC1199830hKP;
import X.InterfaceC1199990hKf;
import X.InterfaceC687820QyS;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.manager.JSEventCenter;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishExtensionVM extends AssemViewModel<C1199800hKM> {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public Long LLILZ;
    public String LLILZIL;
    public long LLIZ;
    public AbstractC1200170hKx LLIZLLLIL;
    public boolean LLJI;
    public final C736950SvV LLJILJILJ;
    public final JSEventCenter LLJILLL;
    public C1200260hL6 LLJJ;
    public String LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLILZLL = "";
    public long LLJ = -1;
    public final C1200280hL8 LLJIJIL = C1199950hKb.LIZ();
    public final C09YA LLJILJIL = new C09YA(this, AFwS206S0000000_18.get$arr$(551));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1199800hKM(this.LLJIJIL.LIZ(), 2039);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoiPublishExtensionVM() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(550);
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(PoiSearchVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS256S0000000_18.get$arr$(725), null, null, null);
        JSEventCenter jSEventCenter = new JSEventCenter(false);
        this.LLJILLL = jSEventCenter;
        jSEventCenter.LIZ("poiSubmit", new AwS597S0100000_18(this, 536));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        JSEventCenter jSEventCenter = this.LLJILLL;
        Lifecycle lifecycle = getLifecycle();
        jSEventCenter.getClass();
        lifecycle.addObserver(jSEventCenter);
    }

    public static final class PoiBDLocationCallbackProxy implements InterfaceC687820QyS {
        public PoiPublishExtensionVM LIZ;
        public LifecycleOwner LIZIZ;
        public final long LIZJ;
        public final String LIZLLL;
        public final List<String> LJ;
        public final String LJFF;

        /* JADX INFO: renamed from: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM$PoiBDLocationCallbackProxy$1, reason: invalid class name */
        public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZJ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZLLL(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                C356901a3.LJ(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                C356901a3.LJFF(this, lifecycleOwner);
            }

            public AnonymousClass1() {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(LifecycleOwner lifecycleOwner) {
                C356901a3.LIZIZ(this, lifecycleOwner);
                PoiBDLocationCallbackProxy poiBDLocationCallbackProxy = PoiBDLocationCallbackProxy.this;
                poiBDLocationCallbackProxy.LIZ = null;
                poiBDLocationCallbackProxy.LIZIZ = null;
            }
        }

        @Override // X.InterfaceC687820QyS
        public final void LIZ(LocationData locationData) {
            InterfaceC1199990hKf interfaceC1199990hKfLIZ = C1200000hKg.LIZ(this.LJFF, "gps_request");
            interfaceC1199990hKfLIZ.LJIJ(locationData.isCache);
            interfaceC1199990hKfLIZ.LJJ(null);
            PoiPublishExtensionVM poiPublishExtensionVM = this.LIZ;
            if (poiPublishExtensionVM != null) {
                poiPublishExtensionVM.vQ2(locationData, this.LIZIZ, this.LIZLLL, this.LJ, this.LJFF, false);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
            PoiPublishExtensionVM poiPublishExtensionVM2 = this.LIZ;
            if (poiPublishExtensionVM2 != null) {
                poiPublishExtensionVM2.LLJ = jCurrentTimeMillis;
            }
            C1200020hKi c1200020hKi = C1200020hKi.LIZ;
            c1200020hKi.getClass();
            c1200020hKi.LIZJ("add_location_gps_result", new C1192750h8z(null, null, (int) jCurrentTimeMillis, true));
        }

        @Override // X.InterfaceC687820QyS
        public final void onError(int i, String str) {
            InterfaceC1199990hKf interfaceC1199990hKfLIZ = C1200000hKg.LIZ(this.LJFF, "gps_request");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gps_");
            sbLIZ.append(i);
            interfaceC1199990hKfLIZ.LJIJI(C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1199990hKfLIZ.LJJIFFI();
            PoiPublishExtensionVM poiPublishExtensionVM = this.LIZ;
            if (poiPublishExtensionVM != null) {
                poiPublishExtensionVM.vQ2(null, this.LIZIZ, this.LIZLLL, this.LJ, this.LJFF, false);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
            PoiPublishExtensionVM poiPublishExtensionVM2 = this.LIZ;
            if (poiPublishExtensionVM2 != null) {
                poiPublishExtensionVM2.LLJ = jCurrentTimeMillis;
            }
            C1200020hKi c1200020hKi = C1200020hKi.LIZ;
            Integer numValueOf = Integer.valueOf(i);
            c1200020hKi.getClass();
            c1200020hKi.LIZJ("add_location_gps_result", new C1192750h8z(numValueOf, str, (int) jCurrentTimeMillis, false));
        }

        public PoiBDLocationCallbackProxy(PoiPublishExtensionVM poiPublishExtensionVM, LifecycleOwner lifecycleOwner, long j, String str, List<String> list, String str2) {
            Lifecycle lifecycle;
            this.LIZ = poiPublishExtensionVM;
            this.LIZIZ = lifecycleOwner;
            this.LIZJ = j;
            this.LIZLLL = str;
            this.LJ = list;
            this.LJFF = str2;
            if (lifecycleOwner != null) {
                lifecycle = lifecycleOwner.getLifecycle();
            } else {
                lifecycle = null;
            }
            C1205850hU7.LIZIZ(lifecycle, C1201120hMU.LIZ().leakOptCreativeTools, new AnonymousClass1());
        }
    }

    public final void yQ2(PoiData poiData) {
        String string;
        setState(new AwS597S0100000_18(poiData, 537));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPoiItemSelected ");
        if (poiData != null) {
            string = poiData.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C443120HZe<java.lang.Double, java.lang.Double, java.lang.Boolean> zQ2(com.bytedance.i18n.location.api.LocationData r10, boolean r11, boolean r12, boolean r13) {
        /*
            r9 = this;
            kotlin.jvm.internal.AwS156S0110000_18 r6 = new kotlin.jvm.internal.AwS156S0110000_18
            r0 = 0
            r6.<init>(r11, r9, r0)
            r0 = 0
            r7 = 1
            if (r12 == 0) goto L46
            if (r11 == 0) goto L46
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            r3 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r2 = "poi_search_cache_optimize"
            r5 = 0
            int r3 = r4.LJIJ(r3, r5, r2, r7)
            if (r3 == r7) goto L1f
            r2 = 2
            if (r3 != r2) goto L46
        L1f:
            X.0hK5 r2 = com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader.Companion
            r2.getClass()
            double r2 = com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader.preloadLatitude
            double r7 = com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader.preloadLongitude
            if (r13 != 0) goto L4d
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L4d
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 != 0) goto L4d
        L32:
            X.0HZe r4 = new X.0HZe
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r7)
            r0 = r5 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.<init>(r2, r1, r0)
            return r4
        L46:
            if (r10 == 0) goto L5a
            double r2 = r10.latitude
            double r0 = r10.longitude
        L4c:
            r7 = r0
        L4d:
            r5 = 1
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r6.invoke(r1, r0)
            goto L32
        L5a:
            r2 = 0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM.zQ2(com.bytedance.i18n.location.api.LocationData, boolean, boolean, boolean):X.0HZe");
    }

    public final void vQ2(LocationData locationData, LifecycleOwner lifecycleOwner, String str, List<String> list, String str2, boolean z) {
        if (lifecycleOwner != null && lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            boolean zLIZJ = this.LLJIJIL.LIZJ();
            C443120HZe<Double, Double, Boolean> c443120HZeZQ2 = zQ2(locationData, zLIZJ, z, false);
            withState(new C1199840hKQ(str2, this, c443120HZeZQ2.getFirst().doubleValue(), c443120HZeZQ2.getSecond().doubleValue(), zLIZJ, str, list, c443120HZeZQ2.getThird().booleanValue(), locationData, z));
            ((InterfaceC1199830hKP) this.LLJILJIL.getValue().getOperator()).LJJIJIIJI();
            return;
        }
        InterfaceC1199990hKf interfaceC1199990hKfLIZIZ = C1200000hKg.LIZIZ(str2);
        interfaceC1199990hKfLIZIZ.LJIJI("page_destroy");
        interfaceC1199990hKfLIZIZ.LJJIFFI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void xQ2(com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM r12, androidx.lifecycle.LifecycleOwner r13, java.lang.String r14, java.util.List r15, java.lang.String r16, com.ss.android.ugc.aweme.creative.model.GpsConsumingOptModel r17, int r18) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM.xQ2(com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM, androidx.lifecycle.LifecycleOwner, java.lang.String, java.util.List, java.lang.String, com.ss.android.ugc.aweme.creative.model.GpsConsumingOptModel, int):void");
    }
}

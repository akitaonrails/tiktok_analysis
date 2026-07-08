package com.ss.android.ugc.aweme.poi.claim.view;

import X.AbstractC1200800hLy;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0QSJ;
import X.C0XQ7;
import X.C1178280gle;
import X.C1179470gnZ;
import X.C1180740gpc;
import X.C1200710hLp;
import X.C1200750hLt;
import X.C1200760hLu;
import X.C1200770hLv;
import X.C1200780hLw;
import X.C1200810hLz;
import X.C1200880hM6;
import X.C1203050hPb;
import X.C1208920hZ4;
import X.C1227904rF;
import X.C13LE;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20742916Ex;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C987103tV;
import X.EnumC1203090hPf;
import X.InterfaceC1146704e9;
import X.InterfaceC1176690gj5;
import X.InterfaceC1177250gjz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.gson.reflect.TypeToken;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiClaimFragment extends BasePage implements IPoiClaimFragmentAbility, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGHELIOSEwJCQlJGElISA7Zx88IQYgKCY+DjctLiI2JjE=";
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(271), "enter_from", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(276), "target_page", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(274), "poi_id", String.class);
    public String LLJIJIL;
    public long LLJILJIL;
    public FrameLayout LLJILJILJ;
    public InterfaceC1176690gj5 LLJILLL;
    public Fragment LLJJ;
    public boolean LLJJI;
    public InterfaceC1177250gjz LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C1208920hZ4 LLJJIJIIJIL;
    public View LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiClaimFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/claim/vm/PoiClaimViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PoiClaimFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiClaimFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PoiClaimFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public PoiClaimFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiClaimViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 876);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(275);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 877), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 878), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 879), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJI = assemVMLazy;
        this.LLJJIJIIJIL = new C1208920hZ4(this, 2);
    }

    public final PoiClaimViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (PoiClaimViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility
    public final void Dc() {
        if (C1200810hLz.LIZ()) {
            C1200710hLp.LIZ.getClass();
            C1200710hLp.LIZIZ.clear();
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        VR(false);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IPoiClaimFragmentAbility.class, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.a0o);
        tuxImmersionBarLIZLLL.LJ(R.attr.a0o);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.poi.BasePage, X.InterfaceC21503819Do
    public final void tv() {
        String str;
        C1200780hLw c1200780hLw = UR().LL;
        if (c1200780hLw == null || (str = c1200780hLw.LIZJ) == null || !Intrinsics.LJFF(str, "upload_image_page")) {
            C1200750hLt c1200750hLt = UR().LLILLJJLI;
            c1200750hLt.LIZIZ(c1200750hLt, C1558360qeg.LJFF(this, null));
        } else {
            IPoiClaimFragmentAbility iPoiClaimFragmentAbility = (IPoiClaimFragmentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPoiClaimFragmentAbility.class, null);
            if (iPoiClaimFragmentAbility != null) {
                iPoiClaimFragmentAbility.Dc();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility
    public final View RJ1() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility
    public final Fragment yj2() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility
    public final void Ce2(View view) {
        this.LLJJIJIL = view;
    }

    public final void VR(boolean z) {
        for (String str : C1200760hLu.LIZ) {
            if (z) {
                C1548820qPI.LIZLLL(str, this.LLJJIJIIJIL);
            } else {
                C1548820qPI.LJIIIIZZ(str, this.LLJJIJIIJIL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
            r10 = this;
            r3 = 0
            if (r11 == 0) goto L84
            java.lang.String r0 = "cache_data"
            java.lang.Object r2 = r11.get(r0)
        L9:
            boolean r0 = r2 instanceof java.util.HashMap
            if (r0 == 0) goto L82
            java.util.HashMap r2 = (java.util.HashMap) r2
        Lf:
            java.lang.String r1 = "category_page"
            if (r2 == 0) goto L71
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L71
            java.lang.Object r1 = r2.get(r1)
            boolean r0 = r1 instanceof java.util.HashMap
            if (r0 == 0) goto L7f
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 == 0) goto L80
            java.lang.String r0 = "tt_typecode"
            java.lang.Object r8 = r1.get(r0)
        L2b:
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L7d
            java.lang.String r8 = (java.lang.String) r8
        L31:
            java.lang.String r9 = ""
            if (r8 != 0) goto L36
            r8 = r9
        L36:
            if (r1 == 0) goto L7b
            java.lang.String r0 = "type"
            java.lang.Object r1 = r1.get(r0)
        L3e:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L47
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L47
            r9 = r1
        L47:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "receive event from lynx, typeCode="
            r1.append(r0)
            r1.append(r8)
            X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel r1 = r10.UR()
            com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel r0 = r10.UR()
            X.0hLw r0 = r0.LL
            if (r0 == 0) goto L6f
            java.lang.String r4 = r0.LIZ
            java.lang.String r5 = r0.LIZIZ
            java.lang.String r6 = r0.LIZJ
            java.lang.String r7 = r0.LIZLLL
            X.0hLw r3 = new X.0hLw
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L6f:
            r1.LL = r3
        L71:
            com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimViewModel r0 = r10.UR()
            X.0hLt r0 = r0.LLILLJJLI
            r0.LIZ(r2)
            return
        L7b:
            r1 = r3
            goto L3e
        L7d:
            r8 = r3
            goto L31
        L7f:
            r1 = r3
        L80:
            r8 = r3
            goto L2b
        L82:
            r2 = r3
            goto Lf
        L84:
            r2 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.view.PoiClaimFragment.WR(java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility
    public final void X(Function1<? super InterfaceC1177250gjz, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initMapSDK, isMapInited=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(", mapHolder=");
        sbLIZ.append(this.LLJILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLJJI) {
            InterfaceC1176690gj5 interfaceC1176690gj5 = this.LLJILLL;
            if (interfaceC1176690gj5 != null) {
                interfaceC1176690gj5.X(new AwS384S0200000_18(this, (PoiClaimFragment) function1, (Function1<? super InterfaceC1177250gjz, Unit>) 72));
                return;
            }
            return;
        }
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJJIII;
        if (interfaceC1177250gjz == null) {
            return;
        }
        function1.invoke(interfaceC1177250gjz);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.claim.view.PoiClaimFragment for r7v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r0 = 272(0x110, float:3.81E-43)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r7.activityConfiguration(r0)
            r0 = 273(0x111, float:3.83E-43)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r7.NR(r0)
            r5 = 0
            X.0Q7z r4 = X.C1558360qeg.LJFF(r7, r5)
            java.lang.Class<com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility> r0 = com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility.class
            X.01wD r6 = X.C1558520qew.LIZ(r4, r0, r5)
            if (r6 != 0) goto L39
            java.lang.Class<com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility> r0 = com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility.class
            X.C1558520qew.LJII(r4, r7, r0, r5, r5)
        L27:
            X.19EG r0 = r7.getActivity()
            if (r0 == 0) goto L38
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L38
            r0 = 32
            r1.setSoftInputMode(r0)
        L38:
            return
        L39:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r6)     // Catch: java.lang.IllegalArgumentException -> L51
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L51
            if (r0 == 0) goto L49
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L51
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L51
            r0.add(r7)     // Catch: java.lang.IllegalArgumentException -> L51
            goto L27
        L49:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L51
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L51
            throw r1     // Catch: java.lang.IllegalArgumentException -> L51
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility> r0 = com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility> r0 = com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility.class
            r2[r1] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r7)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r6)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L80
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility> r0 = com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility.class
            X.C1558520qew.LJII(r4, r1, r0, r5, r5)
            goto L27
        L80:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.view.PoiClaimFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("poi_claim_abnormal_case_key", true);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC1200800hLy abstractC1200800hLyLIZ;
        Map map;
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        boolean z = true;
        if (bundle != null && bundle.getBoolean("poi_claim_abnormal_case_key", false)) {
            Dc();
        }
        C1200770hLv c1200770hLv = C1200770hLv.LIZ;
        c1200770hLv.getClass();
        Fragment fragmentLIZIZ = null;
        c1200770hLv.LIZJ("enter_poi_claim", null);
        view.findViewById(R.id.qyj);
        this.LLJILJILJ = (FrameLayout) view.findViewById(R.id.qya);
        VR(true);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 908), 3);
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId);
        sbLIZ.append(jCurrentTimeMillis);
        this.LLJIJIL = C2188811AlT.LIZIZ(sbLIZ);
        C1200780hLw c1200780hLw = new C1200780hLw((String) this.LLIZLLLIL.getValue(), this.LLJIJIL, (String) this.LLJ.getValue(), (String) this.LLJI.getValue(), null, null);
        try {
            C1200710hLp.LIZ.getClass();
            Keva keva = C1200710hLp.LIZIZ;
            String string = keva.getString(C1200710hLp.LIZ(), "");
            if (string != null && !a0.LJJJIL(string) && !C1200810hLz.LIZ()) {
                C1227904rF.LIZ.getClass();
                Object obj = ((Map) C1227904rF.LIZLLL().LJIIIIZZ(string, new TypeToken<Map<String, Object>>() { // from class: X.04YD
                }.getType())).get("category_page");
                if (C19719512Dh.LJII(obj) && (map = (Map) obj) != null) {
                    Object obj2 = map.get("tt_typecode");
                    if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                        str = "";
                    }
                    Object obj3 = map.get("type");
                    if (!(obj3 instanceof String) || (str2 = (String) obj3) == null) {
                        str2 = "";
                    }
                    UR().LL = new C1200780hLw((String) this.LLIZLLLIL.getValue(), this.LLJIJIL, (String) this.LLJ.getValue(), (String) this.LLJI.getValue(), str, str2);
                } else {
                    UR().LL = c1200780hLw;
                }
            } else {
                UR().LL = c1200780hLw;
                keva.clear();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("something was wrong when initPoiClaimParams, e=");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            UR().LL = c1200780hLw;
            C1200770hLv.LIZ.LIZLLL("deserialization_poi_claim_cache", e.getMessage());
        }
        PoiClaimViewModel poiClaimViewModelUR = UR();
        String str3 = (String) this.LLJ.getValue();
        if (str3 != null) {
            abstractC1200800hLyLIZ = C1200880hM6.LIZ(str3);
        } else {
            C1200710hLp.LIZ.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Keva keva2 = C1200710hLp.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("poi_claim_last_page_key_");
            sbLIZ3.append(curUserId);
            abstractC1200800hLyLIZ = C1200880hM6.LIZ(keva2.getString(C2188811AlT.LIZIZ(sbLIZ3), ""));
            z = false;
        }
        poiClaimViewModelUR.LLILLJJLI.LIZJ(abstractC1200800hLyLIZ, z);
        C1180740gpc.LIZ.getClass();
        IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
        C1179470gnZ c1179470gnZ = new C1179470gnZ();
        c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
        c1179470gnZ.LIZJ = false;
        c1179470gnZ.LJ = false;
        c1179470gnZ.LIZLLL = false;
        c1179470gnZ.LIZIZ = false;
        c1179470gnZ.LJII = false;
        c1179470gnZ.LJI = C1178280gle.LIZ(getContext());
        InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
        this.LLJILLL = iMapManager;
        if (iMapManager != null) {
            fragmentLIZIZ = iMapManager.LIZIZ();
        }
        this.LLJJ = fragmentLIZIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJILJIL = System.currentTimeMillis();
        View viewLIZ = C20742916Ex.LIZ(getContext(), R.layout.dyu, viewGroup, false, -1);
        C19GS c19gs = null;
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.0mTF, X.0mTX] */
    @Override // com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lt2(java.lang.String r13, java.lang.String r14, com.ss.android.ugc.aweme.poi.claim.api.IPoiClaimApi.PoiClaimCheckDataDialog r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.view.PoiClaimFragment.Lt2(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.poi.claim.api.IPoiClaimApi$PoiClaimCheckDataDialog, kotlin.jvm.functions.Function0):void");
    }
}

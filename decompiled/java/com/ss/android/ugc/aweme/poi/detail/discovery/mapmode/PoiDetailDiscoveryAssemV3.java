package com.ss.android.ugc.aweme.poi.detail.discovery.mapmode;

import X.C019F;
import X.C07ZK;
import X.C1173300gdc;
import X.C1174830gg5;
import X.C1174850gg7;
import X.C1175440gh4;
import X.C1175450gh5;
import X.C1180060goW;
import X.C1185600gxS;
import X.C1189060h32;
import X.C1192260h8C;
import X.C1203130hPj;
import X.C1227904rF;
import X.C1308910kAL;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1582480rHa;
import X.C1582580rHk;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2255108sX;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1166860gTE;
import X.InterfaceC1181010gq3;
import X.InterfaceC1203170hPn;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.detail.discovery.ability.IDiscoverySectionVisibleAbility;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeCategory;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import com.ss.android.ugc.aweme.slash.data.SlashParam;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS75S1300000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailDiscoveryAssemV3 extends PoiDetailBaseAssem<PoiDiscoveryApi$PoiDiscoveryCardListResponse> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public String LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public C1203130hPj LLJL;
    public TuxIconView LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public C197039127h LLJLL;
    public final List<PoiMapModeCategory> LLJLLIL;
    public String LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailDiscoveryAssemV3.class, "poiDetailDiscoveryMapVM", "getPoiDetailDiscoveryMapVM()Lcom/ss/android/ugc/aweme/poi/detail/discovery/mapmode/PoiDetailDiscoveryMapViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailDiscoveryAssemV3() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailDiscoveryMapViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 544), AFwS256S0000000_18.get$arr$(385), null, true);
        this.LLJLLIL = new ArrayList();
        this.LLJZ = true;
        this.LLJZIJLIL = true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2x;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final PoiDetailDiscoveryMapViewModel Ep() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (PoiDetailDiscoveryMapViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final void up() {
        C1192260h8C.LIZ(this, "poi_detail_discovery", new AwS597S0100000_18(this, 325));
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        C07ZK c07zk;
        Map<String, EventModel> map;
        EventModel eventModel;
        SlashParam slashParam;
        DynamicMapParams dynamicMapParams;
        PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse = (PoiDiscoveryApi$PoiDiscoveryCardListResponse) baseComponentData;
        super.CG1(poiDiscoveryApi$PoiDiscoveryCardListResponse);
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        if (poiDetailResponseLp != null && (dynamicMapParams = poiDetailResponseLp.getDynamicMapParams()) != null && Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.FALSE)) {
            Bp(false);
            return;
        }
        PoiDetailDiscoveryMapViewModel poiDetailDiscoveryMapViewModelEp = Ep();
        poiDetailDiscoveryMapViewModelEp.vQ2(poiDiscoveryApi$PoiDiscoveryCardListResponse);
        poiDetailDiscoveryMapViewModelEp.setState(new AwS597S0100000_18(poiDiscoveryApi$PoiDiscoveryCardListResponse, 661));
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C07ZK.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c07zk = (C07ZK) interfaceC1555100qZQLIZIZ.getSource()) == null || (map = c07zk.LL) == null || (eventModel = map.get("change_tab")) == null || (slashParam = eventModel.slashParam) == null) {
            return;
        }
        PoiDetailDiscoveryMapViewModel poiDetailDiscoveryMapViewModelEp2 = Ep();
        C1227904rF.LIZ.getClass();
        poiDetailDiscoveryMapViewModelEp2.LLILLL = C1227904rF.LJI(slashParam);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        String str;
        C1185600gxS c1185600gxS;
        Integer numLIZJ2;
        super.onViewCreated(view);
        this.LLJL = (C1203130hPj) getContentView().findViewById(R.id.q6x);
        this.LLJLIL = (TuxIconView) getContentView().findViewById(R.id.fx1);
        this.LLJLILLLLZIIL = (FrameLayout) getContentView().findViewById(R.id.i7l);
        this.LLJLL = (C197039127h) getContentView().findViewById(R.id.nli);
        Context context = getContext();
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.c3, context)) != null) {
            int iIntValue = numLIZJ2.intValue();
            C197039127h c197039127h = this.LLJLL;
            if (c197039127h != null) {
                C1180060goW.LJIIJ(C418440Gaw.LIZIZ(32), iIntValue, c197039127h);
            }
        }
        if (!C1175450gh5.LIZJ()) {
            C1203130hPj c1203130hPj = this.LLJL;
            if (c1203130hPj != null) {
                C786410Ut5.LLLLLLL(c1203130hPj, 8);
            }
        } else {
            C1203130hPj c1203130hPj2 = this.LLJL;
            if (c1203130hPj2 != null) {
                C786410Ut5.LLLLLLL(c1203130hPj2, 0);
            }
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2)) != null) {
                int iIntValue2 = numLIZJ.intValue();
                C1203130hPj c1203130hPj3 = this.LLJL;
                if (c1203130hPj3 != null) {
                    c1203130hPj3.setBackgroundColor(iIntValue2);
                }
            }
            final C1203130hPj c1203130hPj4 = this.LLJL;
            if (c1203130hPj4 != null) {
                c1203130hPj4.setVariant(EnumC1166860gTE.CAPSULE);
                c1203130hPj4.setWidthRule(new C1582580rHk(0, 0, 7));
                c1203130hPj4.setSelectionStyle(new C1582480rHa(C1308910kAL.LIZJ(R.attr.d8, c1203130hPj4.getContext()), C1308910kAL.LIZJ(R.attr.a0o, c1203130hPj4.getContext()), C1308910kAL.LIZJ(R.attr.a03, c1203130hPj4.getContext()), C1308910kAL.LIZJ(R.attr.a1k, c1203130hPj4.getContext())));
                c1203130hPj4.setFont(62);
                c1203130hPj4.setHorizontalMargin(16);
                c1203130hPj4.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.0ggz
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[PHI: r8
                      0x00a0: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v7 java.lang.String) binds: [B:41:0x009d, B:30:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4 A[PHI: r8 r9
                      0x00a4: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v6 java.lang.String) binds: [B:44:0x00a1, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]
                      0x00a4: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v5 java.lang.String) binds: [B:44:0x00a1, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8 A[PHI: r8 r9 r10
                      0x00a8: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:47:0x00a5, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE]
                      0x00a8: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v4 java.lang.String) binds: [B:47:0x00a5, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE]
                      0x00a8: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:47:0x00a5, B:36:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC1203170hPn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(int r16, boolean r17, X.AbstractC1203190hPp r18) {
                        /*
                            Method dump skipped, instruction units count: 264
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1175390ggz.LIZ(int, boolean, X.0hPp):void");
                    }
                });
            }
        }
        Context context3 = getContext();
        if (context3 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZ = R.raw.icon_chevron_expand_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context3);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context3));
            TuxIconView tuxIconView = this.LLJLIL;
            if (tuxIconView != null) {
                tuxIconView.setBackground(layerDrawableLJIILIIL);
            }
            TuxIconView tuxIconView2 = this.LLJLIL;
            if (tuxIconView2 != null) {
                C1189060h32.LJJIIJ(tuxIconView2, new AwS597S0100000_18(this, 660));
            }
        }
        C723850SaN.LIZLLL(this, new AwS597S0100000_18(this, 662));
        C2211631BhB.LJ(getContentView(), new AwS597S0100000_18(this, 663));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IDiscoverySectionVisibleAbility iDiscoverySectionVisibleAbility = new IDiscoverySectionVisibleAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.discovery.ability.IDiscoverySectionVisibleAbility
                public final boolean sK2() {
                    return this.LL.sp();
                }
            };
            AwS75S1300000_6 awS75S1300000_6 = new AwS75S1300000_6(this, interfaceC665370Q7zLJFF, iDiscoverySectionVisibleAbility, null, 3);
            if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                awS75S1300000_6.invoke();
            } else {
                C1189060h32.LJIJ(new ARunnableS104S0100000_4((Object) awS75S1300000_6, 63));
            }
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IDiscoverySectionVisibleAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iDiscoverySectionVisibleAbility, IDiscoverySectionVisibleAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iDiscoverySectionVisibleAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iDiscoverySectionVisibleAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IDiscoverySectionVisibleAbility.class.getClassLoader(), new Class[]{IDiscoverySectionVisibleAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IDiscoverySectionVisibleAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.discovery.ability.IDiscoverySectionVisibleAbility");
                    }
                }
            }
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI2, null);
            IPoiDetailDiscoveryAbility iPoiDetailDiscoveryAbility = new IPoiDetailDiscoveryAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3$loadAbility$2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x008c A[PHI: r8
                  0x008c: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v7 java.lang.String) binds: [B:39:0x0089, B:16:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0090 A[PHI: r8 r9
                  0x0090: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v6 java.lang.String) binds: [B:42:0x008d, B:19:0x0038] A[DONT_GENERATE, DONT_INLINE]
                  0x0090: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v5 java.lang.String) binds: [B:42:0x008d, B:19:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[PHI: r8 r9 r10
                  0x0094: PHI (r8v3 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:45:0x0091, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]
                  0x0094: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v4 java.lang.String) binds: [B:45:0x0091, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]
                  0x0094: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:45:0x0091, B:22:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.IPoiDetailDiscoveryAbility
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void Ih() {
                    /*
                        r19 = this;
                        r1 = r19
                        com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3 r0 = r1.LL
                        r0.getClass()
                        X.0gdc r0 = X.C1174850gg7.LJ(r0)
                        r13 = 0
                        if (r0 == 0) goto L9b
                        CONTEXT r2 = r0.LIZ
                        X.0gxS r2 = (X.C1185600gxS) r2
                    L12:
                        X.0ghD r3 = X.C1175530ghD.LIZ
                        if (r2 == 0) goto L98
                        java.lang.String r5 = r2.LIZ
                    L18:
                        com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3 r0 = r1.LL
                        com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r0 = r0.lp()
                        if (r0 == 0) goto L96
                        java.lang.String r6 = r0.getCollectInfo()
                    L24:
                        if (r2 == 0) goto L88
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L88
                        java.lang.String r8 = r0.getEnterFrom()
                    L2e:
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L8c
                        java.lang.String r9 = r0.getEnterMethod()
                    L36:
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L90
                        java.lang.String r10 = r0.getInitialEnterFrom()
                    L3e:
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L94
                        java.lang.String r11 = r0.getInitialEnterMethod()
                    L46:
                        com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3 r0 = r1.LL
                        java.lang.String r12 = r0.LLJLLL
                        if (r12 != 0) goto L4e
                        java.lang.String r12 = "no_subtab"
                    L4e:
                        if (r2 == 0) goto L58
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L58
                        java.lang.String r13 = r0.getInitialPoiFromGroupId()
                    L58:
                        com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3 r0 = r1.LL
                        r0.getClass()
                        com.ss.android.ugc.aweme.slash.component.BaseComponentData r0 = X.C1174850gg7.LIZJ(r0)
                        com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse r0 = (com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse) r0
                        if (r0 == 0) goto L6b
                        com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType r15 = r0.getMapModeType$poi_release()
                        if (r15 != 0) goto L6d
                    L6b:
                        com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType r15 = com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType.OTHERS
                    L6d:
                        com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3 r0 = r1.LL
                        androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r0)
                        com.bytedance.android.btm.api.model.PageFinder r14 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
                        com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3 r0 = r1.LL
                        X.0Q7z r17 = X.C1558520qew.LJIIL(r0)
                        java.lang.String r4 = "click_map_other_area"
                        r7 = 0
                        r18 = 16424(0x4028, float:2.3015E-41)
                        r16 = r7
                        X.C1175530ghD.LIZIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                        return
                    L88:
                        r8 = r13
                        if (r2 == 0) goto L8c
                        goto L2e
                    L8c:
                        r9 = r13
                        if (r2 == 0) goto L90
                        goto L36
                    L90:
                        r10 = r13
                        if (r2 == 0) goto L94
                        goto L3e
                    L94:
                        r11 = r13
                        goto L46
                    L96:
                        r6 = r13
                        goto L24
                    L98:
                        r5 = r13
                        goto L18
                    L9b:
                        r2 = r13
                        goto L12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3$loadAbility$2.Ih():void");
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.IPoiDetailDiscoveryAbility
                public final String Rb() {
                    PoiDetailDiscoveryAssemV3 poiDetailDiscoveryAssemV3 = this.LL;
                    String str2 = poiDetailDiscoveryAssemV3.LLJLLL;
                    if (str2 != null) {
                        return str2;
                    }
                    PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponseLIZ = poiDetailDiscoveryAssemV3.Ep().getState().LL.LIZ();
                    if (poiDiscoveryApi$PoiDiscoveryCardListResponseLIZ != null) {
                        return poiDiscoveryApi$PoiDiscoveryCardListResponseLIZ.getCurrentTabCode();
                    }
                    return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:102:0x014c A[PHI: r27 r28 r29
                  0x014c: PHI (r27v3 java.lang.String) = (r27v2 java.lang.String), (r27v5 java.lang.String) binds: [B:100:0x0148, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE]
                  0x014c: PHI (r28v2 java.lang.String) = (r28v1 java.lang.String), (r28v4 java.lang.String) binds: [B:100:0x0148, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE]
                  0x014c: PHI (r29v1 java.lang.String) = (r29v0 java.lang.String), (r29v3 java.lang.String) binds: [B:100:0x0148, B:22:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0119 A[PHI: r11
                  0x0119: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v10 java.lang.String) binds: [B:75:0x0116, B:50:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:80:0x011e A[PHI: r11 r16
                  0x011e: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v9 java.lang.String) binds: [B:78:0x011b, B:53:0x00c6] A[DONT_GENERATE, DONT_INLINE]
                  0x011e: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v8 java.lang.String) binds: [B:78:0x011b, B:53:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0123 A[PHI: r11 r16 r17
                  0x0123: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v8 java.lang.String) binds: [B:81:0x0120, B:56:0x00ce] A[DONT_GENERATE, DONT_INLINE]
                  0x0123: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v7 java.lang.String) binds: [B:81:0x0120, B:56:0x00ce] A[DONT_GENERATE, DONT_INLINE]
                  0x0123: PHI (r17v1 java.lang.String) = (r17v0 java.lang.String), (r17v6 java.lang.String) binds: [B:81:0x0120, B:56:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0128 A[PHI: r11 r16 r17 r18
                  0x0128: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v7 java.lang.String) binds: [B:84:0x0125, B:59:0x00d6] A[DONT_GENERATE, DONT_INLINE]
                  0x0128: PHI (r16v3 java.lang.String) = (r16v2 java.lang.String), (r16v6 java.lang.String) binds: [B:84:0x0125, B:59:0x00d6] A[DONT_GENERATE, DONT_INLINE]
                  0x0128: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v5 java.lang.String) binds: [B:84:0x0125, B:59:0x00d6] A[DONT_GENERATE, DONT_INLINE]
                  0x0128: PHI (r18v1 java.lang.String) = (r18v0 java.lang.String), (r18v4 java.lang.String) binds: [B:84:0x0125, B:59:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:89:0x012d  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0140 A[PHI: r27
                  0x0140: PHI (r27v1 java.lang.String) = (r27v0 java.lang.String), (r27v7 java.lang.String) binds: [B:94:0x013c, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0146 A[PHI: r27 r28
                  0x0146: PHI (r27v2 java.lang.String) = (r27v1 java.lang.String), (r27v6 java.lang.String) binds: [B:97:0x0142, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]
                  0x0146: PHI (r28v1 java.lang.String) = (r28v0 java.lang.String), (r28v5 java.lang.String) binds: [B:97:0x0142, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.IPoiDetailDiscoveryAbility
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void Q40(com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard r39) {
                    /*
                        Method dump skipped, instruction units count: 348
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3$loadAbility$2.Q40(com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard):void");
                }
            };
            AwS75S1300000_6 awS75S1300000_62 = new AwS75S1300000_6(this, interfaceC665370Q7zLJFF2, iPoiDetailDiscoveryAbility, null, 4);
            if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                awS75S1300000_62.invoke();
            } else {
                C1189060h32.LJIJ(new ARunnableS104S0100000_4((Object) awS75S1300000_62, 64));
            }
            InterfaceC494301wD interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLJFF2, IPoiDetailDiscoveryAbility.class, null);
            if (interfaceC494301wDLIZ2 == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF2, iPoiDetailDiscoveryAbility, IPoiDetailDiscoveryAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(interfaceC494301wDLIZ2);
                    if (invocationHandler2 instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler2).LL.add(iPoiDetailDiscoveryAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2255108sX c2255108sX2 = new C2255108sX();
                    c2255108sX2.LL.add(iPoiDetailDiscoveryAbility);
                    c2255108sX2.LL.add((T) interfaceC494301wDLIZ2);
                    Object objNewProxyInstance2 = Proxy.newProxyInstance(IPoiDetailDiscoveryAbility.class.getClassLoader(), new Class[]{IPoiDetailDiscoveryAbility.class}, c2255108sX2);
                    if (objNewProxyInstance2 != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF2, (InterfaceC494301wD) objNewProxyInstance2, IPoiDetailDiscoveryAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.IPoiDetailDiscoveryAbility");
                    }
                }
            }
        }
        PoiDetailDiscoveryMapViewModel poiDetailDiscoveryMapViewModelEp = Ep();
        Fragment fragmentLJI3 = C724240Sb0.LJI(this);
        if (fragmentLJI3 != null) {
            interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI3);
        } else {
            interfaceC1181010gq3LIZ = null;
        }
        poiDetailDiscoveryMapViewModelEp.LLILLJJLI = interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null) {
            str = c1185600gxS.LIZ;
        } else {
            str = null;
        }
        this.LLJJL = str;
        Ep().LL = this.LLJJL;
        AssemViewModel.asyncSubscribe$default(Ep(), new C2217381BqS() { // from class: X.0gh3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158900gGO) obj).LL;
            }
        }, this, null, new AwS597S0100000_18(this, 668), new AwS562S0100000_18(this, 2446), new AwS597S0100000_18(this, 669), 4, null);
        String str2 = "";
        if (!C1175450gh5.LIZJ()) {
            String strLJFF = C1174850gg7.LJFF(this);
            if (strLJFF != null) {
                str2 = strLJFF;
            }
            C1175440gh4.LIZ(this, str2, null, 10);
            pH(new AwS597S0100000_18(this, 665));
            return;
        }
        String strLJFF2 = C1174850gg7.LJFF(this);
        if (strLJFF2 != null) {
            str2 = strLJFF2;
        }
        C1175440gh4.LIZ(this, str2, null, 10);
        pH(new AwS597S0100000_18(this, 667));
    }
}

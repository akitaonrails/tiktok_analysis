package com.ss.android.ugc.aweme.poi.detail.nearbyv2;

import X.C019F;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1175680ghS;
import X.C1175690ghT;
import X.C1176590giv;
import X.C1181890grT;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C18JG;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2255108sX;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737910Sx3;
import X.EnumC1175760gha;
import X.EnumC1985707qB;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiNearbyV2MapAbility;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM;
import com.ss.android.ugc.aweme.poi.mapdetail.PoiMapDetailFragment;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeTargetData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2Assem extends BaseSlashReusedComponent<PoiNearbyV2Model> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final InterfaceC1731706qJ LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyV2Assem.class, "nearbyVM", "getNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearbyv2/vm/PoiDetailNearbyV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailNearbyV2Assem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyV2VM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1169), null, AFwS256S0000000_18.get$arr$(413));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e3f;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1174850gg7.LJII(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        String strLJFF = C1174850gg7.LJFF(this);
        if (strLJFF == null) {
            strLJFF = S2();
        }
        C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, S2(), new C1185050gwZ(PageFinder.via(getContentView())), 16);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723830SaL.LIZ(this, null, new AwS600S0100000_21(this, 372));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiNearbyV2Ability iPoiNearbyV2Ability = new IPoiNearbyV2Ability() { // from class: com.ss.android.ugc.aweme.poi.detail.nearbyv2.PoiDetailNearbyV2Assem$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.nearbyv2.IPoiNearbyV2Ability
                public final PoiNearbyV2Model Q8() {
                    PoiDetailNearbyV2Assem poiDetailNearbyV2Assem = this.LL;
                    poiDetailNearbyV2Assem.getClass();
                    return (PoiNearbyV2Model) C1174850gg7.LIZJ(poiDetailNearbyV2Assem);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.ss.android.ugc.aweme.poi.detail.nearbyv2.IPoiNearbyV2Ability
                public final void al1(MapModeEnterMethod mapModeEnterMethod, String str, PoiMapModeTargetData poiMapModeTargetData, EnumC1985707qB enumC1985707qB) {
                    C1173300gdc c1173300gdcLJ;
                    C1185600gxS c1185600gxS;
                    PoiListApi.PoiDetailResponse poiDetailResponseLIZ;
                    MapBounds mapBoundsK60;
                    String enterFrom;
                    String enterMethod;
                    String initialEnterFrom;
                    String initialEnterMethod;
                    String initialPoiFromGroupId;
                    String initialPoiId;
                    String fromGroupId;
                    String fromPoiId;
                    PoiNearbyV2MapAbility poiNearbyV2MapAbility;
                    PoiDetailNearbyV2Assem poiDetailNearbyV2Assem = this.LL;
                    Context context = poiDetailNearbyV2Assem.getContext();
                    if (context != null && (c1173300gdcLJ = C1174850gg7.LJ(poiDetailNearbyV2Assem)) != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null && (poiDetailResponseLIZ = C1181890grT.LIZ(C724240Sb0.LJI(poiDetailNearbyV2Assem))) != null) {
                        C1175690ghT c1175690ghT = PoiMapDetailFragment.LLJJJJ;
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(poiDetailNearbyV2Assem);
                        EnumC1175760gha enumC1175760gha = EnumC1175760gha.ACC_NEARBY;
                        C1176590giv c1176590giv = new C1176590giv(poiDetailResponseLIZ.getPoiLocation(), c1185600gxS.LIZ, poiDetailResponseLIZ.getName());
                        String str2 = c1185600gxS.LIZ;
                        String name = poiDetailResponseLIZ.getName();
                        Fragment fragmentLJI2 = C724240Sb0.LJI(poiDetailNearbyV2Assem);
                        if (fragmentLJI2 != null && (poiNearbyV2MapAbility = (PoiNearbyV2MapAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), PoiNearbyV2MapAbility.class, null)) != null) {
                            mapBoundsK60 = poiNearbyV2MapAbility.k60();
                        } else {
                            mapBoundsK60 = null;
                        }
                        String adClickId = null;
                        C1175680ghS c1175680ghS = new C1175680ghS(c1176590giv, poiMapModeTargetData, null, str2, name, str, mapBoundsK60, enumC1985707qB);
                        C1185410gx9 c1185410gx9 = c1185600gxS.LJFF;
                        if (c1185410gx9 != null) {
                            enterFrom = c1185410gx9.getEnterFrom();
                        } else {
                            enterFrom = null;
                        }
                        C1185410gx9 c1185410gx92 = c1185600gxS.LJFF;
                        if (c1185410gx92 != null) {
                            enterMethod = c1185410gx92.getEnterMethod();
                        } else {
                            enterMethod = null;
                        }
                        C1185410gx9 c1185410gx93 = c1185600gxS.LJFF;
                        if (c1185410gx93 != null) {
                            initialEnterFrom = c1185410gx93.getInitialEnterFrom();
                        } else {
                            initialEnterFrom = null;
                        }
                        C1185410gx9 c1185410gx94 = c1185600gxS.LJFF;
                        if (c1185410gx94 != null) {
                            initialEnterMethod = c1185410gx94.getInitialEnterMethod();
                        } else {
                            initialEnterMethod = null;
                        }
                        C1185410gx9 c1185410gx95 = c1185600gxS.LJFF;
                        if (c1185410gx95 != null) {
                            initialPoiFromGroupId = c1185410gx95.getInitialPoiFromGroupId();
                        } else {
                            initialPoiFromGroupId = null;
                        }
                        C1185410gx9 c1185410gx96 = c1185600gxS.LJFF;
                        if (c1185410gx96 != null) {
                            initialPoiId = c1185410gx96.getInitialPoiId();
                        } else {
                            initialPoiId = null;
                        }
                        C1185410gx9 c1185410gx97 = c1185600gxS.LJFF;
                        if (c1185410gx97 != null) {
                            fromGroupId = c1185410gx97.getFromGroupId();
                        } else {
                            fromGroupId = null;
                        }
                        C1185410gx9 c1185410gx98 = c1185600gxS.LJFF;
                        if (c1185410gx98 != null) {
                            fromPoiId = c1185410gx98.getFromPoiId();
                        } else {
                            fromPoiId = null;
                        }
                        C1185410gx9 c1185410gx99 = c1185600gxS.LJFF;
                        if (c1185410gx99 != null) {
                            adClickId = c1185410gx99.getAdClickId();
                        }
                        PoiMapModeMobParams poiMapModeMobParams = new PoiMapModeMobParams(fromGroupId, fromPoiId, mapModeEnterMethod, enterFrom, enterMethod, initialEnterFrom, initialEnterMethod, initialPoiFromGroupId, initialPoiId, adClickId, MapModeType.OTHERS, poiDetailResponseLIZ.getCollectInfo(), C18JG.LIZ("c24308.d75266", PageFinder.via(C724240Sb0.LJI(poiDetailNearbyV2Assem)), null), "poi_detail", null);
                        c1175690ghT.getClass();
                        C1175690ghT.LIZ(context, interfaceC665370Q7zLJIIL, enumC1175760gha, c1175680ghS, poiMapModeMobParams);
                    }
                }
            };
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiNearbyV2Ability.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiNearbyV2Ability, IPoiNearbyV2Ability.class, null, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                if (invocationHandler instanceof C2255108sX) {
                    ((C2255108sX) invocationHandler).LL.add(iPoiNearbyV2Ability);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C2255108sX c2255108sX = new C2255108sX();
                c2255108sX.LL.add(iPoiNearbyV2Ability);
                c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                Object objNewProxyInstance = Proxy.newProxyInstance(IPoiNearbyV2Ability.class.getClassLoader(), new Class[]{IPoiNearbyV2Ability.class}, c2255108sX);
                if (objNewProxyInstance != null) {
                    C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiNearbyV2Ability.class, null, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.nearbyv2.IPoiNearbyV2Ability");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashReusedComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model r8) {
        /*
            r7 = this;
            super.up(r8)
            X.0gq3 r2 = X.C1174850gg7.LIZ(r7)
            r6 = 0
            if (r2 == 0) goto L7d
            X.0goZ r1 = new X.0goZ
            java.lang.String r0 = "poi_head_info"
            r1.<init>(r0)
            java.lang.Object r3 = r2.ta2(r1)
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r3 = (com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse) r3
        L17:
            X.06qJ r2 = r7.LLJL
            X.1Bqa<java.lang.Object>[] r1 = com.ss.android.ugc.aweme.poi.detail.nearbyv2.PoiDetailNearbyV2Assem.LLJLIL
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r5 = r2.getValue(r7, r0)
            com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM r5 = (com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM) r5
            X.0gi7 r4 = new X.0gi7
            if (r3 == 0) goto L7a
            com.ss.android.ugc.aweme.poi_api.model.PoiLocation r1 = r3.getPoiLocation()
            java.lang.String r0 = r3.getName()
        L30:
            r4.<init>(r1, r0)
            if (r8 != 0) goto L39
            r5.getClass()
        L38:
            return
        L39:
            java.util.Map<java.lang.String, java.util.Map<java.lang.Integer, com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard>> r0 = r5.LL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            java.util.List r0 = r8.getTabList()
            if (r0 == 0) goto L69
            java.util.Iterator r2 = r0.iterator()
        L4a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r3 = r2.next()
            r0 = r3
            com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab r0 = (com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab) r0
            java.lang.String r1 = r0.getTabKey()
            java.lang.String r0 = r8.getCurrentTabKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4a
        L65:
            com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab r3 = (com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab) r3
            if (r3 != 0) goto L7f
        L69:
            java.util.List r0 = r8.getTabList()
            if (r0 == 0) goto L38
            java.lang.Object r3 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab r3 = (com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab) r3
            if (r3 != 0) goto L7f
            return
        L78:
            r3 = r6
            goto L65
        L7a:
            r1 = r6
            r0 = r6
            goto L30
        L7d:
            r3 = r6
            goto L17
        L7f:
            com.ss.android.ugc.aweme.poi_api.model.PoiLocation r0 = r4.centerPoi
            java.util.Map r2 = r5.vQ2(r0, r3)
            kotlin.jvm.internal.AwS227S0300000_18 r1 = new kotlin.jvm.internal.AwS227S0300000_18
            r0 = 79
            r1.<init>(r3, r2, r4, r0)
            r5.setStateImmediate(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearbyv2.PoiDetailNearbyV2Assem.up(com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model):void");
    }
}

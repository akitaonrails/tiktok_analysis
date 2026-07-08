package com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem;

import X.AbstractC19994813Le;
import X.C019F;
import X.C1177220gjw;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2MapTopViewAssem extends ReusedUIContentAssem<PoiDetailNearbyV2MapTopViewAssem> implements InterfaceC712990Rxx<PoiNearbyV2Model> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public static final int LLJLL;
    public final AssemVMLazy LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public final Map<String, List<C1177220gjw>> LLJJJJLIIL;
    public PoiNearbyV2Model LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final List<View> LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyV2MapTopViewAssem.class, "nearbyVM", "getNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearbyv2/vm/PoiDetailNearbyV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LLJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    }

    public PoiDetailNearbyV2MapTopViewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyV2VM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1173), AFwS256S0000000_18.get$arr$(417), null, true);
        this.LLJJJJLIIL = new LinkedHashMap();
        this.LLJL = new ArrayList();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final PoiDetailNearbyV2VM dp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (PoiDetailNearbyV2VM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e A[PHI: r7
      0x006e: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v8 java.lang.String) binds: [B:33:0x006b, B:19:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072 A[PHI: r7 r8
      0x0072: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v7 java.lang.String) binds: [B:36:0x006f, B:22:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v6 java.lang.String) binds: [B:36:0x006f, B:22:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076 A[PHI: r7 r8 r9
      0x0076: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v6 java.lang.String) binds: [B:39:0x0073, B:25:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v5 java.lang.String) binds: [B:39:0x0073, B:25:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0076: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:39:0x0073, B:25:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ep(java.lang.String r19) {
        /*
            r18 = this;
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r18)
            r12 = 0
            if (r0 == 0) goto L7e
            X.0gq3 r0 = X.C1174830gg5.LIZ(r0)
            if (r0 == 0) goto L7e
            X.0gdc r0 = r0.qr0()
            if (r0 == 0) goto L7e
            CONTEXT r1 = r0.LIZ
            X.0gxS r1 = (X.C1185600gxS) r1
        L17:
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r18)
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r0 = X.C1181890grT.LIZ(r0)
            X.0ghD r2 = X.C1175530ghD.LIZ
            if (r1 == 0) goto L7c
            java.lang.String r4 = r1.LIZ
        L25:
            if (r0 == 0) goto L7a
            java.lang.String r5 = r0.getCollectInfo()
        L2b:
            if (r1 == 0) goto L6a
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L6a
            java.lang.String r7 = r0.getEnterFrom()
        L35:
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L6e
            java.lang.String r8 = r0.getEnterMethod()
        L3d:
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L72
            java.lang.String r9 = r0.getInitialEnterFrom()
        L45:
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L76
            java.lang.String r10 = r0.getInitialEnterMethod()
        L4d:
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L55
            java.lang.String r12 = r0.getInitialPoiFromGroupId()
        L55:
            com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType r14 = com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType.OTHERS
            com.bytedance.android.btm.api.model.PageFinder r13 = com.bytedance.android.btm.api.model.PageFinder.via(r18)
            X.0Q7z r16 = X.C1558520qew.LJIIL(r18)
            r6 = 0
            r17 = 17448(0x4428, float:2.445E-41)
            r3 = r19
            r11 = r6
            r15 = r6
            X.C1175530ghD.LIZIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L6a:
            r7 = r12
            if (r1 == 0) goto L6e
            goto L35
        L6e:
            r8 = r12
            if (r1 == 0) goto L72
            goto L3d
        L72:
            r9 = r12
            if (r1 == 0) goto L76
            goto L45
        L76:
            r10 = r12
            if (r1 == 0) goto L55
            goto L4d
        L7a:
            r5 = r12
            goto L2b
        L7c:
            r4 = r12
            goto L25
        L7e:
            r1 = r12
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2MapTopViewAssem.ep(java.lang.String):void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.r0v);
        this.LLJJJJJIL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 37), viewGroup);
        }
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0gi9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176080gi6) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS302S0000000_18.get$arr$(30), 4);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0giA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1176080gi6) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS302S0000000_18.get$arr$(31), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(PoiNearbyV2Model poiNearbyV2Model) {
        PoiNearbyV2Model poiNearbyV2Model2 = poiNearbyV2Model;
        this.LLJJL = poiNearbyV2Model2;
        List<PoiNearbyV2Tab> tabList = poiNearbyV2Model2.getTabList();
        if (tabList != null) {
            for (PoiNearbyV2Tab poiNearbyV2Tab : tabList) {
                poiNearbyV2Tab.getTabName();
                String tabKey = poiNearbyV2Tab.getTabKey();
                poiNearbyV2Tab.getPoiList();
                this.LLJJJJLIIL.put(tabKey, new ArrayList());
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(PoiNearbyV2Model poiNearbyV2Model) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(PoiNearbyV2Model poiNearbyV2Model) {
    }

    public final int cp(int i, int i2) {
        return AbstractC19994813Le.Default.nextInt(0, i2 + 1);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

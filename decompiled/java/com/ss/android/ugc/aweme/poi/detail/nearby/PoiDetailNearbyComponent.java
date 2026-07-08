package com.ss.android.ugc.aweme.poi.detail.nearby;

import X.C019F;
import X.C07ZK;
import X.C1173300gdc;
import X.C1174830gg5;
import X.C1174850gg7;
import X.C1175130ggZ;
import X.C1180060goW;
import X.C1185600gxS;
import X.C1189060h32;
import X.C1195640hDe;
import X.C1227904rF;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C2255108sX;
import X.C295220Bhg;
import X.C298370Bml;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1181010gq3;
import X.InterfaceC1183590guD;
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
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS75S1300000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyComponent extends PoiDetailBaseAssem<PoiNearbyModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public String LLJJL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public C1175130ggZ LLJL;
    public HorizontalScrollView LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public final List<C1195640hDe> LLJLL;
    public int LLJLLIL;
    public TuxIconView LLJLLL;
    public FrameLayout LLJZ;
    public C197039127h LLJZIJLIL;
    public final List<PoiMapModeCategory> LLL;
    public final List<PoiMapModeCategory> LLLF;
    public String LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public PoiNearbyModel LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyComponent.class, "poiDetailNearbyVM", "getPoiDetailNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearby/PoiDetailNearbyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailNearbyComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 747), AFwS256S0000000_18.get$arr$(411), null, true);
        this.LLJLL = new ArrayList();
        this.LLJLLIL = -1;
        this.LLL = new ArrayList();
        this.LLLF = new ArrayList();
        this.LLLFFI = true;
        this.LLLFZ = true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3b;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final String Ep() {
        String str = this.LLLFF;
        if (str != null) {
            return str;
        }
        PoiNearbyModel poiNearbyModelLIZ = Fp().getState().LL.LIZ();
        if (poiNearbyModelLIZ != null) {
            return poiNearbyModelLIZ.getCurrentTabCode();
        }
        return null;
    }

    public final PoiDetailNearbyViewModel Fp() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        return (PoiDetailNearbyViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0174 A[PHI: r17 r18
      0x0174: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v16 java.lang.String) binds: [B:99:0x0170, B:61:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r18v1 java.lang.String) = (r18v0 java.lang.String), (r18v15 java.lang.String) binds: [B:99:0x0170, B:61:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017a A[PHI: r17 r18 r19
      0x017a: PHI (r17v3 java.lang.String) = (r17v2 java.lang.String), (r17v15 java.lang.String) binds: [B:102:0x0176, B:64:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v14 java.lang.String) binds: [B:102:0x0176, B:64:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r19v1 java.lang.String) = (r19v0 java.lang.String), (r19v13 java.lang.String) binds: [B:102:0x0176, B:64:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180 A[PHI: r17 r18 r19 r20
      0x0180: PHI (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v14 java.lang.String) binds: [B:105:0x017c, B:67:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v13 java.lang.String) binds: [B:105:0x017c, B:67:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v12 java.lang.String) binds: [B:105:0x017c, B:67:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      0x0180: PHI (r20v2 java.lang.String) = (r20v1 java.lang.String), (r20v12 java.lang.String) binds: [B:105:0x017c, B:67:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0186 A[PHI: r17 r18 r19 r20 r21
      0x0186: PHI (r17v5 java.lang.String) = (r17v4 java.lang.String), (r17v13 java.lang.String) binds: [B:108:0x0182, B:70:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r18v4 java.lang.String) = (r18v3 java.lang.String), (r18v12 java.lang.String) binds: [B:108:0x0182, B:70:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r19v3 java.lang.String) = (r19v2 java.lang.String), (r19v11 java.lang.String) binds: [B:108:0x0182, B:70:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r20v3 java.lang.String) = (r20v2 java.lang.String), (r20v11 java.lang.String) binds: [B:108:0x0182, B:70:0x0103] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r21v2 java.lang.String) = (r21v1 java.lang.String), (r21v10 java.lang.String) binds: [B:108:0x0182, B:70:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018c A[PHI: r17 r18 r19 r20 r21 r22
      0x018c: PHI (r17v6 java.lang.String) = (r17v5 java.lang.String), (r17v12 java.lang.String) binds: [B:111:0x0188, B:73:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r18v5 java.lang.String) = (r18v4 java.lang.String), (r18v11 java.lang.String) binds: [B:111:0x0188, B:73:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r19v4 java.lang.String) = (r19v3 java.lang.String), (r19v10 java.lang.String) binds: [B:111:0x0188, B:73:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r20v4 java.lang.String) = (r20v3 java.lang.String), (r20v10 java.lang.String) binds: [B:111:0x0188, B:73:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r21v3 java.lang.String) = (r21v2 java.lang.String), (r21v9 java.lang.String) binds: [B:111:0x0188, B:73:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x018c: PHI (r22v2 java.lang.String) = (r22v1 java.lang.String), (r22v8 java.lang.String) binds: [B:111:0x0188, B:73:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190 A[PHI: r14 r17 r18 r19 r20 r21 r22
      0x0190: PHI (r14v2 java.lang.String) = (r14v1 java.lang.String), (r14v6 java.lang.String) binds: [B:114:0x018d, B:76:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r17v7 java.lang.String) = (r17v6 java.lang.String), (r17v11 java.lang.String) binds: [B:114:0x018d, B:76:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r18v6 java.lang.String) = (r18v5 java.lang.String), (r18v10 java.lang.String) binds: [B:114:0x018d, B:76:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r19v5 java.lang.String) = (r19v4 java.lang.String), (r19v9 java.lang.String) binds: [B:114:0x018d, B:76:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r20v5 java.lang.String) = (r20v4 java.lang.String), (r20v9 java.lang.String) binds: [B:114:0x018d, B:76:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r21v4 java.lang.String) = (r21v3 java.lang.String), (r21v8 java.lang.String) binds: [B:114:0x018d, B:76:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0190: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v7 java.lang.String) binds: [B:114:0x018d, B:76:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0194 A[PHI: r14 r15 r17 r18 r19 r20 r21 r22
      0x0194: PHI (r14v3 java.lang.String) = (r14v2 java.lang.String), (r14v5 java.lang.String) binds: [B:117:0x0191, B:79:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String) binds: [B:117:0x0191, B:79:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r17v8 java.lang.String) = (r17v7 java.lang.String), (r17v10 java.lang.String) binds: [B:117:0x0191, B:79:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r18v7 java.lang.String) = (r18v6 java.lang.String), (r18v9 java.lang.String) binds: [B:117:0x0191, B:79:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r19v6 java.lang.String) = (r19v5 java.lang.String), (r19v8 java.lang.String) binds: [B:117:0x0191, B:79:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r20v6 java.lang.String) = (r20v5 java.lang.String), (r20v8 java.lang.String) binds: [B:117:0x0191, B:79:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r21v5 java.lang.String) = (r21v4 java.lang.String), (r21v7 java.lang.String) binds: [B:117:0x0191, B:79:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0194: PHI (r22v4 java.lang.String) = (r22v3 java.lang.String), (r22v6 java.lang.String) binds: [B:117:0x0191, B:79:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d9 A[PHI: r7
      0x01d9: PHI (r7v1 java.lang.Double) = (r7v0 java.lang.Double), (r7v9 java.lang.Double) binds: [B:126:0x01d5, B:36:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016e A[PHI: r17
      0x016e: PHI (r17v1 java.lang.String) = (r17v0 java.lang.String), (r17v17 java.lang.String) binds: [B:96:0x016a, B:58:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gp() {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent.Gp():void");
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        C07ZK c07zk;
        Map<String, EventModel> map;
        EventModel eventModel;
        SlashParam slashParam;
        PoiNearbyModel poiNearbyModel = (PoiNearbyModel) baseComponentData;
        super.CG1(poiNearbyModel);
        if (C295220Bhg.LIZIZ() || C298370Bml.LIZ()) {
            Qp(poiNearbyModel);
        }
        PoiDetailNearbyViewModel poiDetailNearbyViewModelFp = Fp();
        poiDetailNearbyViewModelFp.vQ2(poiNearbyModel);
        poiDetailNearbyViewModelFp.setState(new AwS597S0100000_18(poiNearbyModel, 944));
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C07ZK.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (c07zk = (C07ZK) interfaceC1555100qZQLIZIZ.getSource()) != null && (map = c07zk.LL) != null && (eventModel = map.get("change_tab")) != null && (slashParam = eventModel.slashParam) != null) {
            PoiDetailNearbyViewModel poiDetailNearbyViewModelFp2 = Fp();
            C1227904rF.LIZ.getClass();
            poiDetailNearbyViewModelFp2.LLILLL = C1227904rF.LJI(slashParam);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079 A[PHI: r7
      0x0079: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v7 java.lang.String) binds: [B:39:0x0076, B:16:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d A[PHI: r7 r8
      0x007d: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:42:0x007a, B:19:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:42:0x007a, B:19:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081 A[PHI: r7 r8 r9
      0x0081: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String) binds: [B:45:0x007e, B:22:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:45:0x007e, B:22:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:45:0x007e, B:22:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ip(java.lang.String r19) {
        /*
            r18 = this;
            X.0gdc r0 = X.C1174850gg7.LJ(r18)
            r12 = 0
            if (r0 == 0) goto L87
            CONTEXT r1 = r0.LIZ
            X.0gxS r1 = (X.C1185600gxS) r1
        Lb:
            X.0ghD r2 = X.C1175530ghD.LIZ
            if (r1 == 0) goto L85
            java.lang.String r4 = r1.LIZ
        L11:
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r0 = r18.lp()
            if (r0 == 0) goto L83
            java.lang.String r5 = r0.getCollectInfo()
        L1b:
            if (r1 == 0) goto L75
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L75
            java.lang.String r7 = r0.getEnterFrom()
        L25:
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L79
            java.lang.String r8 = r0.getEnterMethod()
        L2d:
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L7d
            java.lang.String r9 = r0.getInitialEnterFrom()
        L35:
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L81
            java.lang.String r10 = r0.getInitialEnterMethod()
        L3d:
            java.lang.String r11 = r18.Ep()
            if (r11 != 0) goto L45
            java.lang.String r11 = "no_subtab"
        L45:
            if (r1 == 0) goto L4f
            X.0gx9 r0 = r1.LJFF
            if (r0 == 0) goto L4f
            java.lang.String r12 = r0.getInitialPoiFromGroupId()
        L4f:
            com.ss.android.ugc.aweme.slash.component.BaseComponentData r0 = X.C1174850gg7.LIZJ(r18)
            com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel r0 = (com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel) r0
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType r14 = r0.getMapModeType$poi_release()
            if (r14 != 0) goto L5f
        L5d:
            com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType r14 = com.ss.android.ugc.aweme.poi.mapmode.model.MapModeType.OTHERS
        L5f:
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r18)
            com.bytedance.android.btm.api.model.PageFinder r13 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            X.0Q7z r16 = X.C1558520qew.LJIIL(r18)
            r6 = 0
            r17 = 16424(0x4028, float:2.3015E-41)
            r3 = r19
            r15 = r6
            X.C1175530ghD.LIZIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L75:
            r7 = r12
            if (r1 == 0) goto L79
            goto L25
        L79:
            r8 = r12
            if (r1 == 0) goto L7d
            goto L2d
        L7d:
            r9 = r12
            if (r1 == 0) goto L81
            goto L35
        L81:
            r10 = r12
            goto L3d
        L83:
            r5 = r12
            goto L1b
        L85:
            r4 = r12
            goto L11
        L87:
            r1 = r12
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent.Ip(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0337, code lost:
    
        if (r6 >= ((java.util.ArrayList) r22.LLJLL).size()) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0339, code lost:
    
        ((X.C1195640hDe) com.bytedance.mt.protector.impl.collections.ListProtector.get(r22.LLJLL, r6)).setSelected(true);
        r22.LLJLLIL = r6;
        r3 = (com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeCategory) X.C13LP.LJJJLZIJ(r6, r22.LLLF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x034e, code lost:
    
        if (r3 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0350, code lost:
    
        r22.LLLFF = r3.getTabCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0356, code lost:
    
        r5 = r22.LLJLILLLLZIIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0358, code lost:
    
        if (r5 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x035a, code lost:
    
        com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r5, new Y.ARunnableS29S0101000_18(r6, r22, 13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0369, code lost:
    
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Qp(com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel r23) {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent.Qp(com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel):void");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1185600gxS c1185600gxS;
        Integer numLIZJ;
        super.onViewCreated(view);
        this.LLJL = (C1175130ggZ) getContentView().findViewById(R.id.y3o);
        this.LLJLIL = (HorizontalScrollView) getContentView().findViewById(R.id.q6x);
        this.LLJLILLLLZIIL = (LinearLayout) getContentView().findViewById(R.id.q6y);
        this.LLJLLL = (TuxIconView) getContentView().findViewById(R.id.fx1);
        this.LLJZ = (FrameLayout) getContentView().findViewById(R.id.i7l);
        this.LLJZIJLIL = (C197039127h) getContentView().findViewById(R.id.nli);
        FrameLayout frameLayout = this.LLJZ;
        if (frameLayout != null) {
            C2211631BhB.LJ(frameLayout, new AwS597S0100000_18(this, 941));
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C197039127h c197039127h = this.LLJZIJLIL;
            if (c197039127h != null) {
                C1180060goW.LJIIJ(C418440Gaw.LIZIZ(32), iIntValue, c197039127h);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZ = R.raw.icon_chevron_expand_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context2);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context2));
            TuxIconView tuxIconView = this.LLJLLL;
            if (tuxIconView != null) {
                tuxIconView.setBackground(layerDrawableLJIILIIL);
            }
            TuxIconView tuxIconView2 = this.LLJLLL;
            if (tuxIconView2 != null) {
                C1189060h32.LJJIIJ(tuxIconView2, new AwS597S0100000_18(this, 939));
            }
        }
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 570));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        String str = null;
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            IPoiDetailNearbyAbility iPoiDetailNearbyAbility = new IPoiDetailNearbyAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent$loadAbility$1
                @Override // com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility
                public final void Jh2() {
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility
                public final void G70() {
                    this.LL.Gp();
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility
                public final void Ih() {
                    this.LL.Ip("click_map_other_area");
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility
                public final String Rb() {
                    return this.LL.Ep();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[PHI: r10
                  0x0096: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v9 java.lang.String) binds: [B:39:0x0093, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[PHI: r10 r15
                  0x009b: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v8 java.lang.String) binds: [B:42:0x0098, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE]
                  0x009b: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v7 java.lang.String) binds: [B:42:0x0098, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00a0 A[PHI: r10 r15 r16
                  0x00a0: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v7 java.lang.String) binds: [B:45:0x009d, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]
                  0x00a0: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v6 java.lang.String) binds: [B:45:0x009d, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]
                  0x00a0: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v5 java.lang.String) binds: [B:45:0x009d, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[PHI: r10 r15 r16 r17
                  0x00a5: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v6 java.lang.String) binds: [B:48:0x00a2, B:27:0x0058] A[DONT_GENERATE, DONT_INLINE]
                  0x00a5: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v5 java.lang.String) binds: [B:48:0x00a2, B:27:0x0058] A[DONT_GENERATE, DONT_INLINE]
                  0x00a5: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v4 java.lang.String) binds: [B:48:0x00a2, B:27:0x0058] A[DONT_GENERATE, DONT_INLINE]
                  0x00a5: PHI (r17v1 java.lang.String) = (r17v0 java.lang.String), (r17v3 java.lang.String) binds: [B:48:0x00a2, B:27:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
                @Override // com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void AJ1(java.lang.String r22) {
                    /*
                        r21 = this;
                        r1 = r21
                        com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent r0 = r1.LL
                        r0.getClass()
                        X.0gdc r0 = X.C1174850gg7.LJ(r0)
                        r19 = 0
                        if (r0 == 0) goto Lb1
                        CONTEXT r2 = r0.LIZ
                        X.0gxS r2 = (X.C1185600gxS) r2
                    L13:
                        com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent r3 = r1.LL
                        java.lang.String r0 = "click_map_poi_marker"
                        r3.Ip(r0)
                        X.0gfv r3 = X.C1174730gfv.LIZ
                        if (r2 == 0) goto Lab
                        java.lang.String r12 = r2.LIZ
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto Lad
                        java.lang.String r9 = r0.getFromPoiId()
                    L28:
                        com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent r0 = r1.LL
                        com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r0 = r0.lp()
                        if (r0 == 0) goto La8
                        java.lang.String r13 = r0.getCollectInfo()
                    L34:
                        if (r2 == 0) goto L91
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L91
                        java.lang.String r10 = r0.getFromGroupId()
                    L3e:
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L96
                        java.lang.String r15 = r0.getEnterFrom()
                    L46:
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L9b
                        java.lang.String r16 = r0.getEnterMethod()
                    L4e:
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto La0
                        java.lang.String r17 = r0.getInitialEnterFrom()
                    L56:
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto La5
                        java.lang.String r18 = r0.getInitialEnterMethod()
                    L5e:
                        com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent r0 = r1.LL
                        java.lang.String r11 = r0.Ep()
                        if (r11 != 0) goto L68
                        java.lang.String r11 = "no_subtab"
                    L68:
                        if (r2 == 0) goto L72
                        X.0gx9 r0 = r2.LJFF
                        if (r0 == 0) goto L72
                        java.lang.String r19 = r0.getInitialPoiFromGroupId()
                    L72:
                        com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent r0 = r1.LL
                        X.0Q7z r5 = X.C1558520qew.LJIIL(r0)
                        com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent r0 = r1.LL
                        androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r0)
                        com.bytedance.android.btm.api.model.PageFinder r4 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
                        r6 = 0
                        java.lang.String r7 = "poi_detail"
                        r3.getClass()
                        r8 = r22
                        r14 = r6
                        r20 = r6
                        X.C1174730gfv.LIZJ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                        return
                    L91:
                        r10 = r19
                        if (r2 == 0) goto L96
                        goto L3e
                    L96:
                        r15 = r19
                        if (r2 == 0) goto L9b
                        goto L46
                    L9b:
                        r16 = r19
                        if (r2 == 0) goto La0
                        goto L4e
                    La0:
                        r17 = r19
                        if (r2 == 0) goto La5
                        goto L56
                    La5:
                        r18 = r19
                        goto L5e
                    La8:
                        r13 = r19
                        goto L34
                    Lab:
                        r12 = r19
                    Lad:
                        r9 = r19
                        goto L28
                    Lb1:
                        r2 = r19
                        goto L13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent$loadAbility$1.AJ1(java.lang.String):void");
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility
                public final void pH(Function1<? super InterfaceC1183590guD, Unit> function1) {
                    this.LL.pH(function1);
                }
            };
            AwS75S1300000_6 awS75S1300000_6 = new AwS75S1300000_6(this, interfaceC665370Q7zLJFF, iPoiDetailNearbyAbility, null, 5);
            if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                awS75S1300000_6.invoke();
            } else {
                C1189060h32.LJIJ(new ARunnableS104S0100000_4((Object) awS75S1300000_6, 114));
            }
            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJFF, IPoiDetailNearbyAbility.class, null);
            if (interfaceC494301wDLIZ == null) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, iPoiDetailNearbyAbility, IPoiDetailNearbyAbility.class, null, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(interfaceC494301wDLIZ);
                    if (invocationHandler instanceof C2255108sX) {
                        ((C2255108sX) invocationHandler).LL.add(iPoiDetailNearbyAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2255108sX c2255108sX = new C2255108sX();
                    c2255108sX.LL.add(iPoiDetailNearbyAbility);
                    c2255108sX.LL.add((T) interfaceC494301wDLIZ);
                    Object objNewProxyInstance = Proxy.newProxyInstance(IPoiDetailNearbyAbility.class.getClassLoader(), new Class[]{IPoiDetailNearbyAbility.class}, c2255108sX);
                    if (objNewProxyInstance != null) {
                        C1558520qew.LJII(interfaceC665370Q7zLJFF, (InterfaceC494301wD) objNewProxyInstance, IPoiDetailNearbyAbility.class, null, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.nearby.IPoiDetailNearbyAbility");
                    }
                }
            }
        }
        PoiDetailNearbyViewModel poiDetailNearbyViewModelFp = Fp();
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI2);
        } else {
            interfaceC1181010gq3LIZ = null;
        }
        poiDetailNearbyViewModelFp.LLILLJJLI = interfaceC1181010gq3LIZ;
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null) {
            str = c1185600gxS.LIZ;
        }
        this.LLJJL = str;
        Fp().LL = this.LLJJL;
        AssemViewModel.asyncSubscribe$default(Fp(), new C2217381BqS() { // from class: X.0gh1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158870gGL) obj).LL;
            }
        }, this, null, new AwS597S0100000_18(this, 942), new AwS562S0100000_18(this, 2627), new AwS597S0100000_18(this, 943), 4, null);
    }

    public final void Jp(int i, boolean z) {
        View view;
        int width;
        HorizontalScrollView horizontalScrollView = this.LLJLIL;
        if (horizontalScrollView == null || (view = (View) C13LP.LJJJLZIJ(i, this.LLJLL)) == null) {
            return;
        }
        int left = (view.getLeft() + (view.getWidth() / 2)) - (horizontalScrollView.getWidth() / 2);
        LinearLayout linearLayout = this.LLJLILLLLZIIL;
        if (linearLayout != null) {
            width = linearLayout.getWidth();
        } else {
            width = 0;
        }
        int width2 = width - horizontalScrollView.getWidth();
        if (width2 < 0) {
            width2 = 0;
        }
        int iLJ = C13LZ.LJ(left, 0, width2);
        if (z) {
            horizontalScrollView.smoothScrollTo(iLJ, 0);
        } else {
            horizontalScrollView.scrollTo(iLJ, 0);
        }
    }
}

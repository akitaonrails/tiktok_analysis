package com.ss.android.ugc.aweme.poi.detail.chartv3;

import X.AbstractC848400XPy;
import X.C019F;
import X.C09R3;
import X.C0XQ7;
import X.C1173240gdW;
import X.C1173260gdY;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1182410gsJ;
import X.C1185410gx9;
import X.C1185600gxS;
import X.C1189060h32;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C166V;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailChartsV3Assem extends PoiDetailBaseAssem<PoiDetailApi.ChartsBasicData> implements IPoiDetailChartsAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C166V LLJJL = new C166V(new AwS597S0100000_18((UISlotAssem) this, 313));
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public Function0<Boolean> LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailChartsV3Assem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiLayoutDetailChartsV3Binding;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiDetailChartsV3Assem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/chartv3/PoiDetailChartsV3VM;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiDetailChartsV3Assem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailChartsV3VM.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1063), AFwS256S0000000_18.get$arr$(367), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2o;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final C1173260gdY Ep() {
        C166V c166v = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (C1173260gdY) c166v.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility
    public final String VC() {
        return C1174850gg7.LJFF(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility
    public final HashMap<String, String> r70() {
        List<PoiDetailApi.ChartTab> chartTabs;
        C1185410gx9 c1185410gx9;
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        String fromGroupId = null;
        C1185600gxS c1185600gxS = c1173300gdcLJ != null ? (C1185600gxS) c1173300gdcLJ.LIZ : null;
        HashMap<String, String> map = new HashMap<>();
        C1182410gsJ.LIZ(map, C1558520qew.LJIIL(this));
        map.put("enter_from", "poi_detail");
        C1189060h32.LJIJI(map, "poi_id", c1185600gxS != null ? c1185600gxS.LIZ : null);
        C1189060h32.LIZ(poiDetailResponseLp != null ? poiDetailResponseLp.getCollectInfo() : null, map);
        if (c1185600gxS != null && (c1185410gx9 = c1185600gxS.LJFF) != null) {
            fromGroupId = c1185410gx9.getFromGroupId();
        }
        C1189060h32.LJIJI(map, "from_group_id", fromGroupId);
        C1189060h32.LJIJI(map, "user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        PoiDetailApi.ChartsBasicData chartsBasicData = ((C1173240gdW) assemVMLazy.getValue().getState()).LL;
        if (chartsBasicData != null && (chartTabs = chartsBasicData.getChartTabs()) != null) {
            C1189060h32.LJIJI(map, "tab_list", C13LP.LJJLIIIJ(chartTabs, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(366), 30));
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CG1(com.ss.android.ugc.aweme.slash.component.BaseComponentData r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$ChartsBasicData r8 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.ChartsBasicData) r8
            super.CG1(r8)
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r7.LLJJLIIIJLLLLLLLZ
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.poi.detail.chartv3.PoiDetailChartsV3Assem.LLJLIL
            com.bytedance.assem.arch.viewModel.AssemViewModel r4 = r1.getValue()
            if (r8 == 0) goto La0
            boolean r0 = r8.hasChartsBasicData$poi_release()
            if (r0 == 0) goto La0
            java.util.List r0 = r8.getChartContents()
            if (r0 == 0) goto L94
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$ChartContent r0 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.ChartContent) r0
            java.util.List r0 = r0.getPoiInfoList()
            if (r0 == 0) goto L24
            int r1 = r0.size()
            r0 = 3
            if (r1 < r0) goto L24
            r5.add(r2)
            goto L24
        L42:
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r1 = r5.iterator()
        L51:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$ChartContent r0 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.ChartContent) r0
            java.lang.Integer r0 = r0.getChartType()
            r6.add(r0)
            goto L51
        L65:
            java.util.List r0 = r8.getChartTabs()
            if (r0 == 0) goto L94
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L74:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$ChartTab r0 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.ChartTab) r0
            java.lang.Integer r0 = r0.chartType
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L74
            r3.add(r1)
            goto L74
        L8d:
            java.lang.Integer r0 = r8.chartUIType
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$ChartsBasicData r2 = r8.copy(r3, r5, r0)
            goto L95
        L94:
            r2 = 0
        L95:
            kotlin.jvm.internal.AwS597S0100000_18 r1 = new kotlin.jvm.internal.AwS597S0100000_18
            r0 = 991(0x3df, float:1.389E-42)
            r1.<init>(r2, r0)
            r4.setState(r1)
            return
        La0:
            r0 = 999(0x3e7, float:1.4E-42)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r4.setState(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.chartv3.PoiDetailChartsV3Assem.CG1(com.ss.android.ugc.aweme.slash.component.BaseComponentData):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility
    public final void ay0(Function0<Boolean> function0) {
        if (this.LLJL != null) {
            return;
        }
        this.LLJL = function0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.chartv3.PoiDetailChartsV3Assem for r13v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.chartv3.PoiDetailChartsV3Assem.onViewCreated(android.view.View):void");
    }
}

package com.ss.android.ugc.aweme.poi.detail.charts;

import X.AbstractC848400XPy;
import X.C019F;
import X.C0XQ7;
import X.C1182410gsJ;
import X.C1189060h32;
import X.C13LE;
import X.C13LP;
import X.C1558520qew;
import X.C1637806bA;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailChartsAssem extends PoiDetailBaseAssem<PoiDetailApi.ChartsBasicData> implements IPoiDetailChartsAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final AssemVMLazy LLJJL;
    public C1846060y8i LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20631115oD LLJL;
    public int LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailChartsAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/charts/PoiDetailChartsVM;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailChartsAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailChartsVM.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1061), AFwS256S0000000_18.get$arr$(364), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2n;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility
    public final String VC() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility
    public final void ay0(Function0<Boolean> function0) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final void up() {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public final PoiDetailChartsVM Ep() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (PoiDetailChartsVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility
    public final HashMap<String, String> r70() {
        List<PoiDetailApi.ChartTab> chartTabs;
        Object obj;
        PoiListApi.PoiDetailResponse poiDetailResponseLp = lp();
        HashMap<String, String> map = new HashMap<>();
        C1182410gsJ.LIZ(map, C1558520qew.LJIIL(this));
        map.put("enter_from", "poi_detail");
        C1189060h32.LJIJI(map, "poi_id", Ep().LL);
        String string = null;
        C1189060h32.LIZ(poiDetailResponseLp != null ? poiDetailResponseLp.getCollectInfo() : null, map);
        C1189060h32.LJIJI(map, "from_group_id", Ep().LLILLJJLI);
        C1189060h32.LJIJI(map, "user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        PoiDetailApi.ChartsBasicData chartsBasicData = Ep().getState().LL;
        if (chartsBasicData != null && (chartTabs = chartsBasicData.getChartTabs()) != null) {
            C1189060h32.LJIJI(map, "tab_list", C13LP.LJJLIIIJ(chartTabs, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(363), 30));
            C1846060y8i c1846060y8i = this.LLJJLIIIJLLLLLLLZ;
            if (c1846060y8i != null) {
                C1845940y8W c1845940y8WLJII = c1846060y8i.LJII(c1846060y8i.getSelectedTabPosition());
                if (c1845940y8WLJII != null && (obj = c1845940y8WLJII.LIZ) != null) {
                    string = obj.toString();
                }
                C1189060h32.LJIJI(map, "tab_name", string);
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        PoiDetailApi.ChartsBasicData chartsBasicData = (PoiDetailApi.ChartsBasicData) baseComponentData;
        super.CG1(chartsBasicData);
        PoiDetailChartsVM poiDetailChartsVMEp = Ep();
        if (chartsBasicData != null && chartsBasicData.hasChartsBasicData$poi_release()) {
            poiDetailChartsVMEp.setState(new AwS597S0100000_18(chartsBasicData, 976));
        } else {
            poiDetailChartsVMEp.setState(AFwS256S0000000_18.get$arr$(988));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.charts.PoiDetailChartsAssem for r16v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.charts.PoiDetailChartsAssem.onViewCreated(android.view.View):void");
    }
}

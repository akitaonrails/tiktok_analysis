package com.ss.android.ugc.aweme.poi.detail.chartv3.horizontallist;

import X.C01GW;
import X.C04JC;
import X.C1173160gdO;
import X.C1174170gf1;
import X.C1174180gf2;
import X.C1174870gg9;
import X.C1174900ggC;
import X.C1189060h32;
import X.C1195630hDd;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C166X;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility;
import com.ss.android.ugc.aweme.poi.detail.chartv3.poilist.PoiDetailChartsV3BigCardPoiCell;
import com.ss.android.ugc.aweme.poi.detail.chartv3.poilist.smallcard.PoiDetailChartsV3SmallCardPoiCell;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailChartsV3PageCardReusedAssem extends ReusedUISlotAssem<PoiDetailChartsV3PageCardReusedAssem> implements InterfaceC712990Rxx<C1173160gdO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public C1173160gdO LLJL;
    public C1174900ggC LLJLIL;
    public final C166X LLJJLIIIJLLLLLLLZ = new C166X(new AwS597S0100000_18((ReusedUISlotAssem) this, 314));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1064));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailChartsV3PageCardReusedAssem.class, "viewBinding", "getViewBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiDetailChartsV3CardCellLayoutBinding;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dzn;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C1174870gg9 op() {
        C166X c166x = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (C1174870gg9) c166x.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        IPoiDetailChartsAbility iPoiDetailChartsAbility;
        String string;
        ConstraintLayout constraintLayout = op().LLILLJJLI;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zr);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        constraintLayout.setBackground(c384050F3z.LIZ(view.getContext()));
        String str = "";
        op().LLILZ.setText("");
        C1195630hDd c1195630hDd = op().LLILZIL;
        Context context = getContext();
        if (context != null && (string = context.getString(2131830117)) != null) {
            str = string;
        }
        c1195630hDd.LIZLLL(str);
        C1195630hDd c1195630hDd2 = op().LLILZIL;
        c1195630hDd2.setAutoReportViewAllShow(false);
        C2211631BhB.LJ(c1195630hDd2, new AwS384S0200000_18(this, c1195630hDd2, 267));
        C786410Ut5.I7(new AkS87S0100000_18(this, 70), op().LLILZIL);
        C786410Ut5.I7(new AkS87S0100000_18(this, 71), op().LLILZ);
        C786410Ut5.I7(new AkS87S0100000_18(this, 72), op().LLILZLL);
        HandlerHook.viewPost(op().LLILLJJLI, new ARunnableS118S0100000_18(this, 88));
        op().LLILLL.LJIILJJIL(PoiDetailChartsV3SmallCardPoiCell.class);
        op().LLILLL.LJIILJJIL(PoiDetailChartsV3BigCardPoiCell.class);
        op().LLILLL.setLayoutManager(new LinearLayoutManager(getContext()));
        op().LLILLL.addItemDecoration(new C04JC(15));
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (iPoiDetailChartsAbility = (IPoiDetailChartsAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiDetailChartsAbility.class, null)) != null) {
            iPoiDetailChartsAbility.ay0(new AwS562S0100000_18(this, 2708));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1173160gdO c1173160gdO) {
        String strVC;
        List<PoiDetailApi.ChartPoi> poiInfoList;
        List<PoiDetailApi.ChartPoi> listLL;
        InterfaceC1891350zJl c1174170gf1;
        Integer num;
        Integer num2;
        String str;
        IPoiDetailChartsAbility iPoiDetailChartsAbility;
        C1173160gdO c1173160gdO2 = c1173160gdO;
        this.LLJL = c1173160gdO2;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null && (iPoiDetailChartsAbility = (IPoiDetailChartsAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiDetailChartsAbility.class, null)) != null) {
            strVC = iPoiDetailChartsAbility.VC();
        } else {
            strVC = null;
        }
        String str2 = "";
        if (strVC == null) {
            strVC = "";
        }
        C1174900ggC c1174900ggC = new C1174900ggC("poi_detail_page", "aoi_top_header", C2097608Jq.LJIIIIZZ(new Pair("ttls_module_name", strVC), new Pair("ttls_btn_location", "top_right")));
        this.LLJLIL = c1174900ggC;
        op().LLILZIL.setTrackParams(c1174900ggC);
        TuxTextView tuxTextView = op().LLILZ;
        PoiDetailApi.ChartTab chartTab = c1173160gdO2.getChartTab();
        if (chartTab != null && (str = chartTab.tabName) != null) {
            str2 = str;
        }
        tuxTextView.setText(str2);
        PoiDetailApi.ChartContent chartContent = c1173160gdO2.getChartContent();
        if (chartContent != null && (poiInfoList = chartContent.getPoiInfoList()) != null && (listLL = C13LP.LL(poiInfoList, 3)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            for (PoiDetailApi.ChartPoi chartPoi : listLL) {
                Integer chartUIType = c1173160gdO2.getChartUIType();
                if (chartUIType != null && chartUIType.intValue() == 2) {
                    Integer chartUIType2 = c1173160gdO2.getChartUIType();
                    PoiDetailApi.ChartTab chartTab2 = c1173160gdO2.getChartTab();
                    if (chartTab2 != null) {
                        num2 = chartTab2.chartType;
                    } else {
                        num2 = null;
                    }
                    c1174170gf1 = new C1174180gf2(chartPoi, chartUIType2, num2);
                } else {
                    Integer chartUIType3 = c1173160gdO2.getChartUIType();
                    PoiDetailApi.ChartTab chartTab3 = c1173160gdO2.getChartTab();
                    if (chartTab3 != null) {
                        num = chartTab3.chartType;
                    } else {
                        num = null;
                    }
                    c1174170gf1 = new C1174170gf1(chartPoi, chartUIType3, num);
                }
                arrayList.add(c1174170gf1);
            }
            C20600815jK<InterfaceC1891350zJl> state = op().LLILLL.getState();
            if (state != null) {
                state.LJIILL(arrayList, null);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1173160gdO c1173160gdO) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1173160gdO c1173160gdO) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(java.lang.Integer r15, java.lang.String r16) {
        /*
            r14 = this;
            android.content.Context r4 = r14.getContext()
            if (r4 != 0) goto L7
            return
        L7:
            X.0gdO r0 = r14.LLJL
            if (r0 != 0) goto Lc
            return
        Lc:
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r14)
            if (r0 != 0) goto L13
            return
        L13:
            X.0gq3 r0 = X.C1174830gg5.LIZ(r0)
            r11 = 0
            if (r0 == 0) goto Lbc
            X.0gdc r0 = r0.qr0()
            if (r0 == 0) goto Lbc
            CONTEXT r3 = r0.LIZ
            X.0gxS r3 = (X.C1185600gxS) r3
        L24:
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r14)
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse r1 = X.C1181890grT.LIZ(r0)
            X.0gvt r2 = X.C1184630gvt.LIZ
            android.view.View r5 = r14.LJJIJL()
            if (r3 == 0) goto Lb8
            java.lang.String r6 = r3.LIZ
            java.lang.String r7 = r3.LIZ
            X.0gx9 r0 = r3.LJFF
            if (r0 == 0) goto Lba
            java.lang.String r8 = r0.getFromGroupId()
        L40:
            if (r1 == 0) goto Lb6
            java.lang.String r9 = r1.getCollectInfo()
        L46:
            X.0gdO r0 = r14.LLJL
            if (r0 == 0) goto Lb4
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$ChartTab r0 = r0.getChartTab()
            if (r0 == 0) goto Lb4
            java.lang.Integer r0 = r0.chartType
        L52:
            int r10 = X.C1175120ggY.LIZJ(r0)
            X.01GW r0 = r14.LLJLILLLLZIIL
            java.lang.Object r0 = r0.getValue()
            X.0gxD r0 = (X.C1185450gxD) r0
            if (r0 == 0) goto Lb2
            java.lang.String r12 = r0.getSessionId()
        L64:
            X.0gg9 r0 = r14.op()
            X.0hDd r0 = r0.LLILZIL
            com.bytedance.android.btm.api.model.PageFinder r1 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            java.lang.String r0 = "c33207.d43239"
            java.lang.String r13 = X.C18JG.LIZ(r0, r1, r11)
            r2.getClass()
            X.C1184630gvt.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = java.lang.String.valueOf(r15)
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r14)
            if (r0 == 0) goto Lb0
            X.0Q7z r1 = X.C1558360qeg.LJFF(r0, r11)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility> r0 = com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r11)
            com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility r0 = (com.ss.android.ugc.aweme.poi.detail.charts.IPoiDetailChartsAbility) r0
            if (r0 == 0) goto Lb0
            java.util.HashMap r1 = r0.r70()
        L96:
            androidx.fragment.app.Fragment r0 = X.C1189060h32.LJIIJ(r14)
            if (r0 == 0) goto La0
            X.0Q7z r11 = X.C1558360qeg.LJFF(r0, r11)
        La0:
            X.0gg9 r0 = r14.op()
            X.0hDd r0 = r0.LLILZIL
            com.bytedance.android.btm.api.model.PageFinder r0 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
            r3 = r16
            X.C1172390gc9.LIZ(r3, r2, r1, r11, r0)
            return
        Lb0:
            r1 = r11
            goto L96
        Lb2:
            r12 = r11
            goto L64
        Lb4:
            r0 = r11
            goto L52
        Lb6:
            r9 = r11
            goto L46
        Lb8:
            r6 = r11
            r7 = r11
        Lba:
            r8 = r11
            goto L40
        Lbc:
            r3 = r11
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.chartv3.horizontallist.PoiDetailChartsV3PageCardReusedAssem.sp(java.lang.Integer, java.lang.String):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

package com.ss.android.ugc.aweme.poi.detail.charts;

import X.C019F;
import X.C0DXR;
import X.C1185450gxD;
import X.C1189060h32;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailChartsTabPageAssem extends ReusedUISlotAssem<PoiDetailChartsTabPageAssem> implements InterfaceC712990Rxx<PoiDetailApi.ChartContent> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public C197039127h LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public C1185450gxD LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailChartsTabPageAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/detail/charts/PoiDetailChartsVM;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailChartsTabPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailChartsVM.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1062), null, AFwS256S0000000_18.get$arr$(365));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dzm;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        this.LLJJLIIIJLLLLLLLZ = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.rn0);
        this.LLJL = (C197039127h) view.findViewById(R.id.dp0);
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        C1185450gxD c1185450gxD = null;
        if (fragmentLJIIJ != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), "source_default_key", C1185450gxD.class, null)) != null) {
            c1185450gxD = (C1185450gxD) interfaceC1555100qZQLIZIZ.getSource();
        }
        this.LLJLILLLLZIIL = c1185450gxD;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiDetailChartsPoiListCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new GridLayoutManager(2, 0, getContext(), false));
        }
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJLIIIJLLLLLLLZ;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.addItemDecoration(new C0DXR() { // from class: X.0gXK
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int i = iLIZIZ;
                    rect.left = i;
                    rect.right = i;
                    int i2 = iLIZIZ2;
                    rect.top = i2;
                    rect.bottom = i2;
                }
            });
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(PoiDetailApi.ChartContent chartContent) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        PoiDetailApi.ChartContent chartContent2 = chartContent;
        C197039127h c197039127h = this.LLJL;
        if (c197039127h != null) {
            c197039127h.setText(chartContent2.getViewAll());
        }
        C197039127h c197039127h2 = this.LLJL;
        if (c197039127h2 != null) {
            C1189060h32.LJJIIJ(c197039127h2, new AwS384S0200000_18(this, chartContent2, 259));
        }
        List<PoiDetailApi.ChartPoi> poiInfoList = chartContent2.getPoiInfoList();
        if (poiInfoList != null && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJLIIIJLLLLLLLZ) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(poiInfoList, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(PoiDetailApi.ChartContent chartContent) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(PoiDetailApi.ChartContent chartContent) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

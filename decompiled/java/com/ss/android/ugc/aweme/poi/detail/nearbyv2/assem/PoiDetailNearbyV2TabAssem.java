package com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem;

import X.C019F;
import X.C1174900ggC;
import X.C1176050gi3;
import X.C1194900hCS;
import X.C1195640hDe;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1175460gh6;
import X.EnumC1195650hDf;
import X.EnumC1195670hDh;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS54S0101000_18;
import Y.ARunnableS118S0100000_18;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2TabAssem extends ReusedUIContentAssem<PoiDetailNearbyV2TabAssem> implements InterfaceC712990Rxx<PoiNearbyV2Model> {
    public static final C1176050gi3 LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public HorizontalScrollView LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public final List<PoiNearbyV2Tab> LLJJJJLIIL = new ArrayList();
    public final List<C1195640hDe> LLJJL = new ArrayList();
    public int LLJJLIIIJLLLLLLLZ = -1;
    public final AssemVMLazy LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyV2TabAssem.class, "nearbyVM", "getNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearbyv2/vm/PoiDetailNearbyV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLIL = new C1176050gi3();
    }

    public PoiDetailNearbyV2TabAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyV2VM.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1174), AFwS256S0000000_18.get$arr$(418), null, true);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJ = (HorizontalScrollView) view.findViewById(R.id.r0w);
        this.LLJJJJJIL = (LinearLayout) view.findViewById(R.id.r0x);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(PoiNearbyV2Model poiNearbyV2Model) {
        PoiNearbyV2Model poiNearbyV2Model2 = poiNearbyV2Model;
        LLJLIL.getClass();
        if (!C1176050gi3.LIZ(poiNearbyV2Model2)) {
            HorizontalScrollView horizontalScrollView = this.LLJJJJ;
            if (horizontalScrollView != null) {
                C339190DRl.LIZIZ(horizontalScrollView);
                return;
            }
            return;
        }
        HorizontalScrollView horizontalScrollView2 = this.LLJJJJ;
        if (horizontalScrollView2 != null) {
            C339190DRl.LIZLLL(horizontalScrollView2);
        }
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout == null) {
            return;
        }
        C786410Ut5.LJJJJJL(linearLayout);
        ((ArrayList) this.LLJJJJLIIL).clear();
        ((ArrayList) this.LLJJL).clear();
        this.LLJJLIIIJLLLLLLLZ = -1;
        List<PoiNearbyV2Tab> tabList = poiNearbyV2Model2.getTabList();
        if (tabList != null) {
            int i = 0;
            for (PoiNearbyV2Tab poiNearbyV2Tab : tabList) {
                int i2 = i + 1;
                if (i >= 0) {
                    PoiNearbyV2Tab poiNearbyV2Tab2 = poiNearbyV2Tab;
                    String tabName = poiNearbyV2Tab2.getTabName();
                    if (tabName != null && tabName.length() != 0) {
                        int size = ((ArrayList) this.LLJJJJLIIL).size();
                        ((ArrayList) this.LLJJJJLIIL).add(poiNearbyV2Tab2);
                        C1195640hDe c1195640hDe = new C1195640hDe(linearLayout.getContext());
                        c1195640hDe.setStyle(new C1194900hCS(EnumC1195650hDf.LARGE, EnumC1175460gh6.CAPSULE, EnumC1195670hDh.STROKED));
                        c1195640hDe.setLabel(poiNearbyV2Tab2.getTabName());
                        c1195640hDe.setTrackParams(new C1174900ggC("poi_detail_page", "poi_detail_nearby_tab", null));
                        C786410Ut5.Ga(c1195640hDe, new ACListenerS54S0101000_18(this, size, 1));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        if (size > 0) {
                            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        }
                        linearLayout.addView(c1195640hDe, layoutParams);
                        ((ArrayList) this.LLJJL).add(c1195640hDe);
                        if (Intrinsics.LJFF(poiNearbyV2Tab2.getTabKey(), poiNearbyV2Model2.getCurrentTabKey())) {
                            this.LLJJLIIIJLLLLLLLZ = size;
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        int i3 = this.LLJJLIIIJLLLLLLLZ;
        if (i3 < 0 || i3 >= ((ArrayList) this.LLJJL).size()) {
            return;
        }
        ((C1195640hDe) ListProtector.get(this.LLJJL, this.LLJJLIIIJLLLLLLLZ)).setSelected(true);
        LinearLayout linearLayout2 = this.LLJJJJJIL;
        if (linearLayout2 == null) {
            return;
        }
        HandlerHook.viewPost(linearLayout2, new ARunnableS118S0100000_18(this, 87));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(PoiNearbyV2Model poiNearbyV2Model) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(PoiNearbyV2Model poiNearbyV2Model) {
    }

    public final void cp(int i, boolean z) {
        View view;
        int width;
        HorizontalScrollView horizontalScrollView = this.LLJJJJ;
        if (horizontalScrollView == null || (view = (View) C13LP.LJJJLZIJ(i, this.LLJJL)) == null) {
            return;
        }
        int left = (view.getLeft() + (view.getWidth() / 2)) - (horizontalScrollView.getWidth() / 2);
        LinearLayout linearLayout = this.LLJJJJJIL;
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

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

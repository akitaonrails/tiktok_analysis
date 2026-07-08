package com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem;

import X.C019F;
import X.C1174820gg4;
import X.C1174860gg8;
import X.C1174900ggC;
import X.C1176080gi6;
import X.C1195630hDd;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.IPoiNearbyV2Ability;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM;
import com.ss.android.ugc.aweme.poi.mapmode.model.MapModeEnterMethod;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailNearbyV2ViewAllAssem extends ReusedUIContentAssem<PoiDetailNearbyV2ViewAllAssem> implements InterfaceC712990Rxx<PoiNearbyV2Model> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public C1195630hDd LLJJJJLIIL;
    public PoiNearbyV2Model LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiDetailNearbyV2ViewAllAssem.class, "nearbyVM", "getNearbyVM()Lcom/ss/android/ugc/aweme/poi/detail/nearbyv2/vm/PoiDetailNearbyV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiDetailNearbyV2ViewAllAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailNearbyV2VM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1175), AFwS256S0000000_18.get$arr$(419), null, true);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void cp(boolean z) {
        String tabKey;
        IPoiNearbyV2Ability iPoiNearbyV2Ability;
        String currentTabKey;
        C1195630hDd c1195630hDd;
        if (z && (c1195630hDd = this.LLJJJJLIIL) != null) {
            c1195630hDd.LIZIZ();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (fragmentLJI != null && (iPoiNearbyV2Ability = (IPoiNearbyV2Ability) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IPoiNearbyV2Ability.class, null)) != null) {
            MapModeEnterMethod mapModeEnterMethod = MapModeEnterMethod.CLICK_MAP_BOTTOM_BTN;
            AssemVMLazy assemVMLazy = this.LLJJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
            PoiNearbyV2Tab poiNearbyV2Tab = ((C1176080gi6) assemVMLazy.getValue().getState()).LL;
            if (poiNearbyV2Tab == null || (currentTabKey = poiNearbyV2Tab.getTabKey()) == null) {
                PoiNearbyV2Model poiNearbyV2Model = this.LLJJL;
                if (poiNearbyV2Model != null) {
                    currentTabKey = poiNearbyV2Model.getCurrentTabKey();
                } else {
                    currentTabKey = null;
                }
            }
            iPoiNearbyV2Ability.al1(mapModeEnterMethod, currentTabKey, null, null);
        }
        C1174820gg4 c1174820gg4 = C1174820gg4.LIZ;
        AssemVMLazy assemVMLazy2 = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJLIIIJLLLLLLLZ;
        PoiNearbyV2Tab poiNearbyV2Tab2 = ((C1176080gi6) assemVMLazy2.getValue().getState()).LL;
        if (poiNearbyV2Tab2 != null) {
            tabKey = poiNearbyV2Tab2.getTabKey();
        } else {
            tabKey = null;
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI2, null);
        }
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1174820gg4.getClass();
        C1174820gg4.LIZIZ(pageFinderVia, interfaceC665370Q7zLJFF, tabKey, "bottom_center");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String tabKey;
        this.LLJJJJJIL = (FrameLayout) view.findViewById(R.id.r0z);
        C1195630hDd c1195630hDd = (C1195630hDd) view.findViewById(R.id.r10);
        this.LLJJJJLIIL = c1195630hDd;
        if (c1195630hDd != null) {
            c1195630hDd.setTextColorByAttr(R.attr.a1h);
        }
        C1174820gg4 c1174820gg4 = C1174820gg4.LIZ;
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        PoiNearbyV2Tab poiNearbyV2Tab = ((C1176080gi6) assemVMLazy.getValue().getState()).LL;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (poiNearbyV2Tab != null) {
            tabKey = poiNearbyV2Tab.getTabKey();
        } else {
            tabKey = null;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        }
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1174820gg4.getClass();
        C1174820gg4.LIZJ(pageFinderVia, interfaceC665370Q7zLJFF, tabKey, "bottom_center");
        FrameLayout frameLayout = this.LLJJJJJIL;
        if (frameLayout != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 38), frameLayout);
        }
        C1195630hDd c1195630hDd2 = this.LLJJJJLIIL;
        if (c1195630hDd2 != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 39), c1195630hDd2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(PoiNearbyV2Model poiNearbyV2Model) {
        C1195630hDd c1195630hDd;
        this.LLJJL = poiNearbyV2Model;
        String strLIZIZ = C1174860gg8.LIZIZ(this);
        if (strLIZIZ != null && strLIZIZ.length() != 0 && (c1195630hDd = this.LLJJJJLIIL) != null) {
            c1195630hDd.setTrackParams(new C1174900ggC("poi_detail_page", "nearby_view_all_footer", C2097608Jq.LJIIIIZZ(new Pair("ttls_module_name", strLIZIZ), new Pair("ttls_btn_location", "bottom_center"))));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(PoiNearbyV2Model poiNearbyV2Model) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(PoiNearbyV2Model poiNearbyV2Model) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

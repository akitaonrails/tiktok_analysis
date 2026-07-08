package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list;

import X.AbstractC329610Cw3;
import X.C019F;
import X.C0Q4Y;
import X.C1158150gFB;
import X.C1173300gdc;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1183240gte;
import X.C1183250gtf;
import X.C1185430gxB;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20600815jK;
import X.C20603715jn;
import X.C2217381BqS;
import X.C2217401BqU;
import X.C444540Hbw;
import X.C444550Hbx;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444640Hc6;
import X.C444690HcB;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C786990Uu1;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import X.InterfaceC1181010gq3;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AsS7S0101000_18;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.vm.PoiRecommendFeatureListViewModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureListAssem extends BaseSlashGlueSlotAssemComponent<PoiRecommendFeatureListModule> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public C786990Uu1 LLJJIJIIJIL;
    public C1749280vcc LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AsS7S0101000_18 LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiRecommendFeatureListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/recommendfeature/list/vm/PoiRecommendFeatureListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiRecommendFeatureListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiRecommendFeatureListViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1729), AFwS256S0000000_18.get$arr$(568), null, true);
        this.LLJJJIL = new AsS7S0101000_18(this, 2);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e6w;
    }

    public final PoiRecommendFeatureListViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (PoiRecommendFeatureListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1174850gg7.LJII(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinderVia = PageFinder.via(getContentView());
        c1185430gxB.getClass();
        C1185430gxB.LJJLIIIJILLIZJL(pageFinderVia, interfaceC665370Q7zLJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        boolean z;
        C1183240gte c1183240gte;
        C1183250gtf c1183250gtf;
        C1749280vcc c1749280vcc;
        PoiRecommendFeatureListModule poiRecommendFeatureListModule = (PoiRecommendFeatureListModule) baseComponentData;
        super.CG1(poiRecommendFeatureListModule);
        List<PoiRecommendFeatureListItem> items = poiRecommendFeatureListModule.getItems();
        if (items != null && !items.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        List<SlashEvent> listL00 = null;
        if (z) {
            C786990Uu1 c786990Uu1 = this.LLJJIJIIJIL;
            if (c786990Uu1 != null && (c1749280vcc = this.LLJJIJIL) != null) {
                C786410Ut5.m0(c786990Uu1, 8);
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                EnumC444680HcA enumC444680HcA = EnumC444680HcA.NO_CONTENT;
                c1749280vcc.setStatus(C444600Hc2.LIZ(c1749280vcc.getContext(), c1749280vcc, C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.FIXED, (Float) null, 6), new C444550Hbx(Boolean.TRUE, Integer.valueOf(R.drawable.n5), 4), 2131825338, null, null, new C444590Hc1(3))));
                C444690HcB.LIZ(enumC444680HcA, c1749280vcc);
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLJJIJIL;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 8);
        }
        C786990Uu1 c786990Uu12 = this.LLJJIJIIJIL;
        if (c786990Uu12 != null) {
            C786410Ut5.m0(c786990Uu12, 0);
        }
        C786990Uu1 c786990Uu13 = this.LLJJIJIIJIL;
        if (c786990Uu13 == null) {
            return;
        }
        lp().LL = C1174850gg7.LIZ(this);
        PoiRecommendFeatureListViewModel poiRecommendFeatureListViewModelLp = lp();
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1183250gtf = (C1183250gtf) c1173300gdcLJ.LIZ) != null) {
            c1183240gte = c1183250gtf.LIZ;
        } else {
            c1183240gte = null;
        }
        poiRecommendFeatureListViewModelLp.LLILLJJLI = c1183240gte;
        PoiRecommendFeatureListViewModel poiRecommendFeatureListViewModelLp2 = lp();
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        String str = "";
        if (interfaceC1181010gq3LIZ != null) {
            String strLIZ = C1173980gei.LIZ(this);
            if (strLIZ == null) {
                strLIZ = "";
            }
            listL00 = interfaceC1181010gq3LIZ.l00(strLIZ);
        }
        poiRecommendFeatureListViewModelLp2.LLILLL = listL00;
        PoiRecommendFeatureListViewModel poiRecommendFeatureListViewModelLp3 = lp();
        poiRecommendFeatureListViewModelLp3.LLILZ = poiRecommendFeatureListModule;
        String nextCursor = poiRecommendFeatureListModule.getNextCursor();
        if (nextCursor != null) {
            str = nextCursor;
        }
        new C1158150gFB(str, Intrinsics.LJFF(poiRecommendFeatureListModule.getHasMore(), Boolean.TRUE));
        poiRecommendFeatureListViewModelLp3.setStateImmediate(new AwS597S0100000_18(poiRecommendFeatureListModule, 658));
        lp().setListState(c786990Uu13.getState());
        final PoiRecommendFeatureListViewModel poiRecommendFeatureListViewModelLp4 = lp();
        c786990Uu13.LJIIL((AbstractC329610Cw3) new C2217401BqU(poiRecommendFeatureListViewModelLp4) { // from class: X.0goe
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786990Uu1 c786990Uu1 = (C786990Uu1) view.findViewById(R.id.ra5);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.ra6);
        this.LLJJIJIIJIL = c786990Uu1;
        this.LLJJIJIL = c1749280vcc;
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null) {
            interfaceC1181010gq3LIZ.iY0(c786990Uu1);
        }
        c786990Uu1.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        c786990Uu1.setLifecycleOwner(this);
        c786990Uu1.setItemAnimator(null);
        C20600815jK<InterfaceC1891350zJl> state = c786990Uu1.getState();
        if (state != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZLLL = PoiRecommendFeatureListLoadingFooterCell.class;
        c786990Uu1.setListConfig(c20603715jn);
        c786990Uu1.LJIILJJIL(PoiRecommendFeatureListCell.class);
        c786990Uu1.addOnScrollListener(this.LLJJJIL);
    }
}

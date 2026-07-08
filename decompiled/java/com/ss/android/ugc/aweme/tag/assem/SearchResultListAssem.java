package com.ss.android.ugc.aweme.tag.assem;

import X.C019F;
import X.C01GW;
import X.C1252710ihh;
import X.C13LE;
import X.C15NN;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20509915Nh;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1568490qv1;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS56S0100000_31;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tag.SearchResultListCell;
import com.ss.android.ugc.aweme.tag.SectionCell;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchResultListAssem extends UIListContentAssem<VideoTagSearchListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public C1749280vcc LLJ;
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public C20509915Nh LLJILLL;
    public volatile String LLJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(363));
    public EnumC1568490qv1 LLJI = EnumC1568490qv1.INIT;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchResultListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagSearchListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchResultListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTagSearchListViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1209), AFwS276S0000000_31.get$arr$(217), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1208));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final VideoTagSearchListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (VideoTagSearchListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C20509915Nh c20509915Nh = this.LLJILLL;
        if (c20509915Nh != null) {
            c20509915Nh.LIZIZ();
        }
        this.LLJILLL = null;
        this.LLJJ = null;
        super.onDestroy();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJ = (C1749280vcc) LJJIJL().findViewById(R.id.w28);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(SearchResultListCell.class, SectionCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(new AsS56S0100000_31(this, 5));
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        C1252710ihh.LJIIJJI(this, C13LE.LIZ(C15NN.class), new C2217381BqS() { // from class: X.15NO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GH) obj).LIZIZ;
            }
        }, new C2217381BqS() { // from class: X.15NP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GH) obj).LIZ;
            }
        }, new AwS645S0100000_31(this, 62));
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15Nf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1235790iGP) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 63), 4);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.15Ng
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1235790iGP c1235790iGP = (C1235790iGP) obj;
                c1235790iGP.getClass();
                return C627260Oiy.LIZLLL(c1235790iGP);
            }
        }, null, new AwS610S0100000_31(this, 241), new AwS575S0100000_31(this, 1161), new AwS610S0100000_31(this, 240), 2, null);
    }
}

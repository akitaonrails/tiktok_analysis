package com.ss.android.ugc.aweme.topic.trendingtopic.ui;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C1252710ihh;
import X.C13LE;
import X.C15GB;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS56S0100000_31;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicCell;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicSearchViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SearchResultListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1382));
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchResultListAssem.class, "searchVm", "getSearchVm()Lcom/ss/android/ugc/aweme/topic/trendingtopic/VideoTrendingTopicSearchViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchResultListAssem.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/topic/trendingtopic/VideoTrendingTopicListViewModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchResultListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTrendingTopicSearchViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1383), AFwS276S0000000_31.get$arr$(237), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoTrendingTopicListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1384), AFwS276S0000000_31.get$arr$(238), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LJJIJL().findViewById(R.id.w28);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(VideoTrendingTopicCell.class);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS56S0100000_31(this, 7));
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        C1252710ihh.LJIIJJI(this, C13LE.LIZ(C15GB.class), new C2217381BqS() { // from class: X.15G7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GA) obj).LIZIZ;
            }
        }, new C2217381BqS() { // from class: X.15G6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GA) obj).LIZ;
            }
        }, new AwS645S0100000_31(this, 75));
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.159S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C159P) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 76), 4);
    }
}

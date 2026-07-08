package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe;

import X.C09R3;
import X.C0HHT;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C435960H7q;
import X.C659520Ptu;
import X.C723830SaL;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ARunnableS25S0110000_6;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoKeyFrameViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS442S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchKeyframeOptDir3Assem extends ReusedUISlotAssem<SearchKeyframeOptDir3Assem> implements InterfaceC712990Rxx<C659520Ptu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchKeyframeOptDir3Assem.class, "keyFrameVM", "getKeyFrameVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoKeyFrameViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchKeyframeOptDir3Assem.class, "searchVideoHolderVM", "getSearchVideoHolderVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchVideoHolderVM;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchKeyframeOptDir3Assem() {
        C0HHT c0hht = C0HHT.LIZ;
        AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(128);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchVideoKeyFrameViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, aFwS192S0000000_6, null, AFwS236S0000000_6.get$arr$(289));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchVideoHolderVM.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 584), null, AFwS236S0000000_6.get$arr$(290));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d03;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SearchVideoKeyFrameViewModel op() {
        return (SearchVideoKeyFrameViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLIL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        op().LLILLL = ((SearchVideoHolderVM) this.LLJL.getValue(this, LLJLIL[1])).LLILLL;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.i56);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.i57);
        C723830SaL.LIZ(this, null, new AwS215S0300000_6(this, frameLayout, frameLayout2, 4));
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0H7k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C435950H7p) obj).LL;
            }
        }, null, new AwS442S0200000_6(frameLayout, frameLayout2, 21), 6);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0H7o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C435950H7p) obj).LLILLJJLI);
            }
        }, null, new AwS442S0200000_6(frameLayout, frameLayout2, 22), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        op().vQ2(c659520Ptu);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void tp(FrameLayout frameLayout, FrameLayout frameLayout2, boolean z) {
        if (z) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchKeyframeOptDir3PanelAssem.class), false, null);
            C786410Ut5.LJLLLLLL(8, frameLayout);
            C786410Ut5.LJLLLLLL(0, frameLayout2);
        } else {
            C723830SaL.LJ(this, C13LE.LIZ(SearchKeyframeOptDir3EntranceAssem.class), false, null);
            C786410Ut5.LJLLLLLL(0, frameLayout);
            C786410Ut5.LJLLLLLL(8, frameLayout2);
        }
    }

    public static void sp(View view, float f, float f2, float f3, float f4, long j, boolean z) {
        view.animate().cancel();
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.T4(view, f);
        C786410Ut5.ed(view, f3);
        view.animate().alpha(f2).translationY(f4).setDuration(j).setInterpolator(C435960H7q.LIZ).withEndAction(new ARunnableS25S0110000_6(view, z, 2)).start();
    }
}

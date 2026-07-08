package com.ss.android.ugc.aweme.feed.collection.friends.component;

import X.C01GW;
import X.C04UD;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2765015f;
import X.C704760Rkg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC705550Rlx;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem;
import com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailMultiTagAssem extends BaseFeedMultiTagAssem<FriendsDetailMultiTagAssem> implements InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsDetailMultiTagAssem.class, "tagVM", "getTagVM()Lcom/ss/android/ugc/aweme/fcpanchor/access/VideoFeedMultiTagVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsDetailMultiTagAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoFeedMultiTagVM.class);
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 314), null, AFwS243S0000000_11.get$arr$(113));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(114));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(115));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(116));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.d_m;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2025602746) {
            return null;
        }
        return this;
    }

    public final VideoFeedMultiTagVM Ep() {
        return (VideoFeedMultiTagVM) this.LLJLLL.getValue(this, LLLF[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C2765015f.LIZJ("VideoFeedMultiTagAssem.onViewCreated", new AwS555S0100000_11(this, 313));
        super.onViewCreated(view);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = null;
        this.LLJLLIL = new C704760Rkg(LJJIJL(), (InterfaceC705550Rlx) view.findViewById(R.id.feed_multi_tag_layout), (InterfaceC705550Rlx) view.findViewById(R.id.feed_multi_tag_layout), null);
        if (C04UD.LIZ()) {
            interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        }
        C704760Rkg c704760Rkg = this.LLJLLIL;
        if (c704760Rkg != null) {
            c704760Rkg.LIZIZ(m128do(), interfaceC665370Q7zLJIIL);
        }
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0RkO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C704520RkI) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(250), 6);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0RkX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C704520RkI) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(251), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RkZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(66), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Rka
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(67), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Rkb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJLLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(68), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0Rkc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIII;
            }
        }, null, AFwS294S0000000_11.get$arr$(69), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0RkY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(65), 4);
    }
}

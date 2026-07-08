package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.tag;

import X.C019F;
import X.C01GW;
import X.C04UD;
import X.C09R3;
import X.C1261804wi;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C704760Rkg;
import X.C704790Rkj;
import X.C705700RmC;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC705550Rlx;
import X.InterfaceC705620Rm4;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.fcpanchor.access.BaseFeedMultiTagAssem;
import com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3MultiTagAssem extends BaseFeedMultiTagAssem<FriendsV3MultiTagAssem> implements InterfaceC705620Rm4, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final InterfaceC1731706qJ LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final InterfaceC1731706qJ LLLF;
    public boolean LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3MultiTagAssem.class, "tagVM", "getTagVM()Lcom/ss/android/ugc/aweme/fcpanchor/access/VideoFeedMultiTagVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3MultiTagAssem.class, "publishVM", "getPublishVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PublishStatusViewModel;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsV3MultiTagAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoFeedMultiTagVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 463), null, AFwS243S0000000_11.get$arr$(274));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(276));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS243S0000000_11.get$arr$(277));
        this.LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(278));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3PublishStatusViewModel.class);
        this.LLLF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 464), null, AFwS243S0000000_11.get$arr$(275));
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

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.d_m, new AwS555S0100000_11(this, 462));
        if (C1261804wi.LIZ()) {
            C705700RmC.LIZJ(R.layout.b51, getContext());
        }
    }

    public final VideoFeedMultiTagVM Fp() {
        return (VideoFeedMultiTagVM) this.LLJLLL.getValue(this, LLLFFI[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
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
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0RkM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C704520RkI) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(266), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0RkW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C704520RkI) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(267), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Rlw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(88), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0Rkd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJLLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(89), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0Rke
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIII;
            }
        }, null, AFwS294S0000000_11.get$arr$(90), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0Rkf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(91), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(this, LLLFFI[1]), new C2217381BqS() { // from class: X.0I9o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C461930I9n) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(87), 4);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        sr((VideoItemParams) interfaceC1587906Jp, list);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: up */
    public final void sr(VideoItemParams videoItemParams, List<? extends Object> list) {
        boolean z = !va(list);
        this.LLLFF = z;
        if (z) {
            return;
        }
        up(videoItemParams);
    }
}

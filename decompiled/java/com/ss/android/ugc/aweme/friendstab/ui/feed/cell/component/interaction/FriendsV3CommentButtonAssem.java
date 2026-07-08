package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction;

import X.C01GW;
import X.C0OB8;
import X.C0SDD;
import X.C1206504nn;
import X.C1351060lGK;
import X.C1357780lRA;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C418440Gaw;
import X.C452501pT;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729510SjV;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1361270lWn;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3CommentButtonAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3CommentButtonAssem, InterfaceC1361270lWn> implements FriendsV3CommentProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C630740Ooa LLJL = new C630740Ooa(EnumC452301pR.NONE, new AwS555S0100000_11(this, 441), null);
    public final InterfaceC1731706qJ LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3CommentButtonAssem.class, "commentVM", "getCommentVM()Lcom/ss/android/ugc/aweme/feed/assem/videocomment/VideoCommentVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3CommentButtonAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCommentVM.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 444), null, AFwS243S0000000_11.get$arr$(216));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(114));
        this.LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 442));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Cj0(Comment comment) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Lw2() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void U71(String str) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return ((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue() ? R.layout.cal : R.layout.cak;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (!C729510SjV.LJJIJIL(((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            super.oo();
        } else if (bp()) {
            if (C1206504nn.LIZ()) {
                C337180DJs.LIZ(LJJIJL());
            } else {
                C337180DJs.LIZIZ(LJJIJL());
            }
        }
    }

    public final C1351060lGK sp() {
        C0SDD c0sdd;
        C1351060lGK c1351060lGKLJLIIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = c724270Sb3 != null ? c724270Sb3.LL : null;
        return (!(obj instanceof C0SDD) || (c0sdd = (C0SDD) obj) == null || (c1351060lGKLJLIIL = c0sdd.LJLIIL()) == null) ? C1357780lRA.LIZ(null) : c1351060lGKLJLIIL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, Oo(), new AwS555S0100000_11(this, 443));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FriendsV3CommentProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final boolean I0(String str) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        return Intrinsics.LJFF(((C0OB8) obj).getAweme().getAid(), str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.protocol.FriendsV3CommentProtocol
    public final void Kn0(long j) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        AwemeStatistics statistics = ((C0OB8) obj).getAweme().getStatistics();
        if (statistics != null) {
            statistics.setCommentCount(j);
        }
        VideoCommentVM videoCommentVM = (VideoCommentVM) this.LLJLIL.getValue(this, LLJLLIL[0]);
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        videoCommentVM.yQ2(((C0OB8) obj2).getAweme());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS693S0100000_11(this, 0, 42), LJJIJL());
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(this, LLJLLIL[0]), new C2217381BqS() { // from class: X.0SpW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C733080SpG) obj).LLILZ;
            }
        }, null, AFwS289S0000000_6.get$arr$(4), 6);
        if (((Boolean) this.LLJLILLLLZIIL.getValue()).booleanValue()) {
            ((TextView) this.LLJL.getValue()).setMaxWidth(((Number) this.LLJLL.getValue()).intValue());
            LJJIJL().setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        long commentCount;
        AwemeStatistics statistics;
        Aweme aweme;
        AwemeStatistics statistics2;
        C0OB8 c0ob8 = (C0OB8) obj;
        if (c0ob8 != null && (aweme = c0ob8.getAweme()) != null && (statistics2 = aweme.getStatistics()) != null) {
            commentCount = statistics2.getCommentCount();
        } else {
            commentCount = 0;
        }
        if (commentCount != sp().LIZ.total && sp().LIZ.total != 0 && (statistics = c0ob8.getAweme().getStatistics()) != null) {
            statistics.setCommentCount(sp().LIZ.total);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        C0OB8 c0ob8 = (C0OB8) obj;
        if ((c0ob8 instanceof C0SDD) && !C729510SjV.LJJIJIL(c0ob8.getAweme())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}

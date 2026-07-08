package com.ss.android.ugc.now.interaction.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C03IT;
import X.C1220000hqw;
import X.C1243240iSQ;
import X.C1345700l7g;
import X.C1352460lIa;
import X.C1352490lId;
import X.C1352780lJ6;
import X.C1352810lJ9;
import X.C1354870lMT;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C427660Gpo;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentListAssem extends UIListContentAssem<CommentListVM> implements ICommentListAssemAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1101));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1103));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1100));
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;
    public final C736950SvV LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/now/interaction/assem/CommentListVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2022), AFwS259S0000000_21.get$arr$(290), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NowKeyboardVM.class);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ2, c1637906bB, new C452230HoL(c19719912DlLIZ2), new C452250HoN(), (Function0) null, 66));
        this.LLJILJILJ = new C736950SvV(C13LE.LIZ(InteractionSyncVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(291), new AwS565S0100000_21((AbstractC738140SxQ) this, 1102), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLJ.getValue();
    }

    public final InteractionSyncVM No() {
        return (InteractionSyncVM) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final CommentListVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (CommentListVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLJIL, ICommentListAssemAbility.class, null);
        }
    }

    public final void So(Aweme aweme) {
        CommentItem commentItem;
        Comment comment = null;
        if (Go().getState().LJIIIIZZ() != 0) {
            commentItem = (CommentItem) Go().getState().LJI(0);
            CommentItem commentItem2 = (CommentItem) Go().getState().LJI(Go().getState().LJIIIIZZ() - 1);
            if (commentItem.getComment().getCreateTime() < commentItem2.getComment().getCreateTime()) {
                commentItem = commentItem2;
            }
        } else {
            commentItem = null;
        }
        InteractionSyncVM interactionSyncVMNo = No();
        if (interactionSyncVMNo != null) {
            if (commentItem != null) {
                comment = commentItem.getComment();
            }
            interactionSyncVMNo.setState(new AwS135S1100000_21(comment, aweme.getAid(), 13));
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        Aweme aweme;
        String desc;
        User author;
        String nickname;
        String desc2;
        User author2;
        NowFeedMobHierarchyData nowFeedMobHierarchyData;
        Integer nowFeedType;
        Aweme aweme2;
        NowFeedMobHierarchyData nowFeedMobHierarchyData2;
        super.onViewCreated(view);
        Go().LJIILJJIL(CommentCell.class);
        Go().setLayoutManager(new LinearLayoutManager(getContext()));
        C1352460lIa c1352460lIaLIZ = C1352810lJ9.LIZ(this);
        if (c1352460lIaLIZ != null && (aweme2 = c1352460lIaLIZ.LL) != null) {
            CommentListVM commentListVMIp = ip();
            String aid = aweme2.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(aweme2);
            C1352460lIa c1352460lIaLIZ2 = C1352810lJ9.LIZ(this);
            if (c1352460lIaLIZ2 != null) {
                nowFeedMobHierarchyData2 = c1352460lIaLIZ2.LLILZIL;
            } else {
                nowFeedMobHierarchyData2 = null;
            }
            commentListVMIp.LL = aid;
            commentListVMIp.LLILLL = authorUid;
            commentListVMIp.LLIZ = nowFeedMobHierarchyData2;
            C1352780lJ6 c1352780lJ6 = commentListVMIp.LLJ;
            c1352780lJ6.LJI = aid;
            c1352780lJ6.LJFF = authorUid;
            c1352780lJ6.LJII = c1352780lJ6.LJII;
            ip().LLILLJJLI = aweme2;
            ip().LLILZLL = AwemeExtKt.isPrivate(aweme2);
        }
        CommentListVM commentListVMIp2 = ip();
        C1352460lIa c1352460lIaLIZ3 = C1352810lJ9.LIZ(this);
        if (c1352460lIaLIZ3 != null) {
            str = c1352460lIaLIZ3.LLILLJJLI;
        } else {
            str = null;
        }
        commentListVMIp2.LLILZ = str;
        C1352490lId c1352490lId = C1352490lId.LIZIZ;
        if (c1352490lId.LIZIZ() != 0 && ((c1352490lId.LIZIZ() != 2 || ((nowFeedMobHierarchyData = C1352810lJ9.LIZ(this).LLILZIL) != null && (nowFeedType = nowFeedMobHierarchyData.getNowFeedType()) != null && c1352490lId.LIZ(nowFeedType.intValue()))) && (aweme = C1352810lJ9.LIZ(this).LL) != null && (desc = aweme.getDesc()) != null && desc.length() != 0)) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(C724240Sb0.LIZ(this)), R.layout.cts, null, false);
            Go().LJ(0, viewTd);
            C427660Gpo c427660Gpo = (C427660Gpo) viewTd.findViewById(R.id.l9h);
            TextView textView = (TextView) viewTd.findViewById(R.id.zym);
            TextView textView2 = (TextView) viewTd.findViewById(R.id.dcd);
            Aweme aweme3 = C1352810lJ9.LIZ(this).LL;
            if (aweme3 != null) {
                author = aweme3.getAuthor();
            } else {
                author = null;
            }
            C03IT c03itLIZ = C1354870lMT.LIZ(author);
            if (c03itLIZ != null && c427660Gpo != null) {
                C427660Gpo.LJIIJJI(c427660Gpo, c03itLIZ, false, null, null, false, false, null, null, false, null, 1006);
            }
            Aweme aweme4 = C1352810lJ9.LIZ(this).LL;
            if (aweme4 != null && (author2 = aweme4.getAuthor()) != null) {
                C1243240iSQ.LIZ.getClass();
                nickname = author2.getNickname();
                if (nickname == null) {
                    nickname = "";
                }
            } else {
                nickname = null;
            }
            textView.setText(nickname);
            Aweme aweme5 = C1352810lJ9.LIZ(this).LL;
            if (aweme5 != null) {
                desc2 = aweme5.getDesc();
            } else {
                desc2 = null;
            }
            textView2.setText(desc2);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.0lHx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 156), 4);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0lJB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InteractionSyncViewModelState) obj).getCommentPublishState();
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 158), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.0lII
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 160), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0lJ1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352910lJJ) obj).LLILZIL;
            }
        }, null, AnonymousClass0208.get$arr$(46), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0lJ3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352910lJJ) obj).LLILLL;
            }
        }, null, new AwS635S0100000_21(this, 151), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0lJ2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352910lJJ) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 152), 4);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0lJL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1352910lJJ c1352910lJJ = (C1352910lJJ) obj;
                c1352910lJJ.getClass();
                return C627260Oiy.LIZLLL(c1352910lJJ);
            }
        }, null, new AwS600S0100000_21(this, 318), new AwS565S0100000_21(this, 1403), new AwS600S0100000_21(this, 319), 2, null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.0lIG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJ;
            }
        }, null, new AwS635S0100000_21(this, 155), 6);
        InterfaceC665370Q7z interfaceC665370Q7zLJIL = C1345700l7g.LJIL(this);
        if (interfaceC665370Q7zLJIL != null) {
            C1558520qew.LJII(interfaceC665370Q7zLJIL, this, ICommentListAssemAbility.class, null, null);
        }
    }
}

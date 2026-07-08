package com.ss.android.ugc.aweme.comment.poll;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0HZQ;
import X.C1220000hqw;
import X.C1344790l6D;
import X.C1344890l6N;
import X.C1345260l6y;
import X.C1346950l9h;
import X.C13LE;
import X.C1402000maU;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1344800l6E;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS155S0100000_21;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.OptionCount;
import com.ss.android.ugc.aweme.comment.model.PollInfo;
import com.ss.android.ugc.aweme.comment.model.UserVoteInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleLineCommentVoteCheckAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C01GW LLIZLLLIL;
    public final C736950SvV LLJ;
    public final C726120Se2 LLJI;
    public LinearLayout LLJIJIL;
    public final C01GW LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleLineCommentVoteCheckAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public SingleLineCommentVoteCheckAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 54));
        this.LLJ = new C736950SvV(C13LE.LIZ(CommentPollViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(92), new AwS563S0100000_19((AbstractC738140SxQ) this, 637), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = new C726120Se2();
        this.LLJILJIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(143));
    }

    public final CommentContextSource Go() {
        C726120Se2 c726120Se2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return c726120Se2.LIZ(this);
    }

    public final void Jo() {
        Aweme aweme;
        String aid;
        Aweme aweme2;
        String aid2;
        C0HZQ c0hzq;
        TuxTextView tuxTextView;
        C0HZQ c0hzq2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        CommentContextSource commentContextSourceGo = Go();
        if (commentContextSourceGo == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceGo)) == null || (aid = aweme.getAid()) == null || !C1344890l6N.LIZ() || !C1345260l6y.LIZ(((C1346950l9h) ((AssemViewModel) this.LLIZLLLIL.getValue()).getState()).LL) || ((CommentPollViewModel) this.LLJ.getValue()).AQ2(aid) == null) {
            Ho();
            return;
        }
        CommentContextSource commentContextSourceGo2 = Go();
        if (commentContextSourceGo2 == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSourceGo2)) == null || (aid2 = aweme2.getAid()) == null) {
            Ho();
            return;
        }
        final PollInfo pollInfoAQ2 = ((CommentPollViewModel) this.LLJ.getValue()).AQ2(aid2);
        if (pollInfoAQ2 == null) {
            Ho();
            return;
        }
        C1344790l6D c1344790l6D = (C1344790l6D) this.LLJILJIL.getValue();
        LinearLayout linearLayout = this.LLJIJIL;
        InterfaceC1344800l6E interfaceC1344800l6E = new InterfaceC1344800l6E() { // from class: X.0l6C
            @Override // X.InterfaceC1344800l6E
            public final void LIZ(boolean z) {
                this.LIZ.Lo(pollInfoAQ2, z);
            }
        };
        c1344790l6D.getClass();
        if (linearLayout != null && (c0hzq2 = (C0HZQ) linearLayout.findViewById(R.id.rfq)) != null) {
            TuxTextView tuxTextView2 = (TuxTextView) linearLayout.findViewById(R.id.rfr);
            c0hzq2.setSize(0);
            linearLayout.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), linearLayout.getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            ViewGroup.LayoutParams layoutParams = tuxTextView2 != null ? tuxTextView2.getLayoutParams() : null;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                C786410Ut5.R6(tuxTextView2, marginLayoutParams);
            }
            if (tuxTextView2 != null) {
                tuxTextView2.setText(linearLayout.getContext().getString(2131829073));
            }
            C786410Ut5.I7(new ACListenerS155S0100000_21(c0hzq2, 39), linearLayout);
            C786410Ut5.D7(c0hzq2, new C1402000maU(c1344790l6D, interfaceC1344800l6E, c0hzq2, 2));
            if (!Intrinsics.LJFF(aid2, c1344790l6D.LIZ)) {
                c1344790l6D.LIZIZ = true;
                c1344790l6D.LIZ = aid2;
            }
            c0hzq2.setChecked(c1344790l6D.LIZIZ);
        }
        Lo(pollInfoAQ2, ((C1344790l6D) this.LLJILJIL.getValue()).LIZIZ);
        Object value = this.LLJILJIL.getValue();
        LinearLayout linearLayout2 = this.LLJIJIL;
        value.getClass();
        if (linearLayout2 != null && (c0hzq = (C0HZQ) linearLayout2.findViewById(R.id.rfq)) != null && (tuxTextView = (TuxTextView) linearLayout2.findViewById(R.id.rfr)) != null) {
            c0hzq.setEnabled(true);
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
    }

    public final void Ho() {
        CommentKeyboardModel keyboardModel;
        CommentContextSource commentContextSourceGo = Go();
        if (commentContextSourceGo != null && (keyboardModel = commentContextSourceGo.getKeyboardModel()) != null) {
            keyboardModel.setPollBadgeUserVoteInfo(null);
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJIJIL = (LinearLayout) view.findViewById(R.id.ngh);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0l69
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 48), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0l6A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1342030l1l) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 49), 6);
        Jo();
    }

    public final void Lo(PollInfo pollInfo, boolean z) {
        CommentKeyboardModel keyboardModel;
        Integer num;
        int iIntValue;
        OptionCount next;
        CommentKeyboardModel keyboardModel2;
        CommentContextSource commentContextSourceGo = Go();
        if (commentContextSourceGo != null && (keyboardModel2 = commentContextSourceGo.getKeyboardModel()) != null) {
            keyboardModel2.setPollVoteBadgeChecked(z);
        }
        CommentContextSource commentContextSourceGo2 = Go();
        if (commentContextSourceGo2 != null && (keyboardModel = commentContextSourceGo2.getKeyboardModel()) != null) {
            UserVoteInfo userVoteInfo = null;
            str = null;
            String str = null;
            userVoteInfo = null;
            userVoteInfo = null;
            if (z && (num = pollInfo.userPollOption) != null && (iIntValue = num.intValue()) >= 0) {
                Long lValueOf = Long.valueOf(pollInfo.pollId);
                Integer numValueOf = Integer.valueOf(iIntValue);
                List<OptionCount> list = pollInfo.optionCountList;
                if (list != null) {
                    Iterator<OptionCount> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.index == iIntValue) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    OptionCount optionCount = next;
                    if (optionCount != null) {
                        str = optionCount.text;
                    }
                }
                userVoteInfo = new UserVoteInfo(lValueOf, numValueOf, str);
            }
            keyboardModel.setPollBadgeUserVoteInfo(userVoteInfo);
        }
    }
}

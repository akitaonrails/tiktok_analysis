package com.ss.android.ugc.now.interaction.assem;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03IT;
import X.C03K6;
import X.C1243240iSQ;
import X.C1351950lHl;
import X.C1352780lJ6;
import X.C1354870lMT;
import X.C1355730lNr;
import X.C13IQ;
import X.C13LE;
import X.C1402390mb7;
import X.C1440005kM;
import X.C1848410yCV;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2215101Bmm;
import X.C2217381BqS;
import X.C295200Bhe;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452080Ho6;
import X.C452501pT;
import X.C5182020e;
import X.C735410St1;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1210900hcG;
import X.InterfaceC1355720lNq;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnLongClickListenerC1401890maJ;
import Y.ACListenerS124S0200000_21;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import avg.f;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.CommentCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentCell extends PowerCell<CommentItem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public String LLJJI;
    public User LLJJIII;
    public Comment LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentCell.class, "commentListVM", "getCommentListVM()Lcom/ss/android/ugc/now/interaction/assem/CommentListVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2017);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(289);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1086), awS563S0100000_19, AFwS209S0000000_21.get$arr$(404), new AwS563S0100000_19((C03K6) this, 1978), new AwS563S0100000_19((C03K6) this, 1980), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1090), aFwS259S0000000_21, new AwS563S0100000_19((C03K6) this, 1981), null, new AwS563S0100000_19((C03K6) this, 1982));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 1979);
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1089);
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21(c19719912DlLIZ, 1091);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 108));
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1983);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 2013);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 2014);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 2015);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 2016);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_212, awS563S0100000_19, new C452080Ho6(), awS563S0100000_193, awS563S0100000_194, awS565S0100000_21, aFwS259S0000000_21, awS563S0100000_195, awS563S0100000_196, awS563S0100000_197);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1096), awS563S0100000_19, AFwS209S0000000_21.get$arr$(405), new AwS563S0100000_19((C03K6) this, 2018), new AwS563S0100000_19((C03K6) this, 2019), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1098), aFwS259S0000000_21, new AwS563S0100000_19((C03K6) this, 2020), null, new AwS563S0100000_19((C03K6) this, 2021));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1099), awS563S0100000_19, AFwS209S0000000_21.get$arr$(402), new AwS563S0100000_19((C03K6) this, 1974), new AwS563S0100000_19((C03K6) this, 1975), new AwS563S0100000_19((C03K6) this, 1976), aFwS259S0000000_21, null, null, new AwS563S0100000_19((C03K6) this, 1977));
        }
        this.LL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NowKeyboardVM.class);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ2, new C5182020e((C13IQ) c19719912DlLIZ2, 432), AFwS259S0000000_21.get$arr$(390), (Function0) null, 26));
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1082));
        this.LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1083));
        this.LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1088));
        this.LLILZLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1094));
        this.LLIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1097));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1092));
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1093));
        this.LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1095));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1085));
        this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJJI = "";
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1087));
    }

    public final CommentListVM L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (CommentListVM) assemVMLazy.getValue();
    }

    public final C1355730lNr P5() {
        return (C1355730lNr) this.LLIZLLLIL.getValue();
    }

    public final TuxTextView R5() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    public final TuxTextView S5() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C1402390mb7(this, 4));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        CommentItem item = getItem();
        if (item != null) {
            L5().LLJ.LIZJ(item.getComment().getCid(), item);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        Comment comment;
        String cid;
        super.onViewDetachedFromWindow();
        C1352780lJ6 c1352780lJ6 = L5().LLJ;
        CommentItem item = getItem();
        if (item == null || (comment = item.getComment()) == null || (cid = comment.getCid()) == null) {
            c1352780lJ6.getClass();
        } else {
            c1352780lJ6.LIZIZ(cid);
            c1352780lJ6.LIZJ.remove(cid);
        }
    }

    public static int N5(TuxTextView tuxTextView) {
        return (int) tuxTextView.getPaint().measureText(tuxTextView.getText().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T5(com.ss.android.ugc.now.interaction.assem.CommentItem r11) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.CommentCell.T5(com.ss.android.ugc.now.interaction.assem.CommentItem):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String enterFrom;
        User user;
        User user2;
        String replyToNickName;
        boolean z;
        String text;
        List<TextExtraStruct> textExtra;
        long createTime;
        Comment comment;
        String replyToUserId;
        String replyToNickName2;
        User user3;
        CommentItem commentItem = (CommentItem) interfaceC1891350zJl;
        super.onBindItemView(commentItem);
        this.LLJJIJI = commentItem.getComment();
        final NowFeedMobHierarchyData interactionHierarchyData = commentItem.getInteractionHierarchyData();
        String str = "";
        if (interactionHierarchyData == null || (enterFrom = interactionHierarchyData.getEnterFrom()) == null) {
            enterFrom = "";
        }
        this.LLJJI = enterFrom;
        Comment comment2 = this.LLJJIJI;
        if (comment2 != null) {
            user = comment2.getUser();
        } else {
            user = null;
        }
        this.LLJJIII = user;
        TuxTextView tuxTextViewR5 = R5();
        Comment comment3 = this.LLJJIJI;
        if (comment3 != null && (user3 = comment3.getUser()) != null) {
            C1243240iSQ.LIZ.getClass();
            String nickname = user3.getNickname();
            if (nickname != null) {
                str = nickname;
            }
        } else {
            str = null;
        }
        tuxTextViewR5.setText(str);
        C786410Ut5.T8((C427660Gpo) this.LLILZ.getValue(), new ACListenerS124S0200000_21(interactionHierarchyData, this, 72));
        ((View) this.LLILZ.getValue()).setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0lJm
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return true;
            }
        });
        Comment comment4 = this.LLJJIJI;
        if (comment4 != null) {
            user2 = comment4.getUser();
        } else {
            user2 = null;
        }
        C03IT c03itLIZ = C1354870lMT.LIZ(user2);
        if (c03itLIZ != null) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.LLILZ.getValue(), c03itLIZ, false, null, null, false, false, null, null, false, null, 1006);
        }
        C786410Ut5.h9(R5(), new ACListenerS124S0200000_21(interactionHierarchyData, this, 73));
        R5().setOnLongClickListener(new ViewOnLongClickListenerC1401890maJ(this, commentItem, 3));
        Comment comment5 = this.LLJJIJI;
        if (comment5 != null) {
            replyToNickName = comment5.getReplyToNickName();
        } else {
            replyToNickName = null;
        }
        int i = 0;
        if (replyToNickName != null && replyToNickName.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (comment = this.LLJJIJI) != null && (replyToUserId = comment.getReplyToUserId()) != null && replyToUserId.length() != 0) {
            TuxTextView tuxTextViewS5 = S5();
            Comment comment6 = this.LLJJIJI;
            if (comment6 != null) {
                replyToNickName2 = comment6.getReplyToNickName();
            } else {
                replyToNickName2 = null;
            }
            tuxTextViewS5.setText(replyToNickName2);
            C786410Ut5.LJZL(0, (LinearLayout) this.LLJIJIL.getValue());
            C786410Ut5.h9(S5(), new ACListenerS124S0200000_21(interactionHierarchyData, this, 60));
            S5().setOnLongClickListener(new ViewOnLongClickListenerC1401890maJ(this, commentItem, 4));
        } else {
            C786410Ut5.LJZL(8, (LinearLayout) this.LLJIJIL.getValue());
        }
        P5().setOnSpanClickListener(new InterfaceC1355720lNq() { // from class: X.0lJk
            @Override // X.InterfaceC1355720lNq
            public final void LIZ(TextExtraStruct textExtraStruct) {
                User user4 = new User();
                user4.setUid(textExtraStruct.getUserId());
                user4.setSecUid(textExtraStruct.getSecUid());
                CommentCell commentCell = this.LIZ;
                commentCell.I5(user4, commentCell.itemView.getContext(), interactionHierarchyData, "comment_at");
            }
        });
        P5().setMentionSpanColor(C1351950lHl.LJ(R.attr.a1h, R.color.da, P5().getContext()));
        C1355730lNr c1355730lNrP5 = P5();
        Comment comment7 = this.LLJJIJI;
        if (comment7 != null) {
            text = comment7.getText();
        } else {
            text = null;
        }
        c1355730lNrP5.setText(text);
        C1355730lNr c1355730lNrP52 = P5();
        Comment comment8 = this.LLJJIJI;
        if (comment8 != null) {
            textExtra = comment8.getTextExtra();
        } else {
            textExtra = null;
        }
        c1355730lNrP52.LJJJJIZL(textExtra, null, null);
        P5().setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView = (TextView) this.LLJ.getValue();
        Comment comment9 = this.LLJJIJI;
        if (comment9 != null) {
            createTime = ((long) comment9.getCreateTime()) * 1000;
        } else {
            createTime = 0;
        }
        textView.setText(C2215101Bmm.LJ(createTime));
        C1355730lNr c1355730lNrP53 = P5();
        View.OnClickListener aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(this, 214);
        if (C1848410yCV.LIZ) {
            aCListenerS155S0100000_21 = new f(aCListenerS155S0100000_21);
        }
        a aVar = new a(aCListenerS155S0100000_21);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1355730lNrP53);
        }
        c1355730lNrP53.setOnClickListener(aVar);
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 217), this.itemView);
        C786410Ut5.h9((TuxTextView) this.LLJI.getValue(), new ACListenerS155S0100000_21(this, 218));
        ((View) this.LLJI.getValue()).setOnLongClickListener(new ViewOnLongClickListenerC1401890maJ(this, commentItem, 5));
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1401890maJ(this, commentItem, 6));
        HandlerHook.viewPost(this.itemView, new ARunnableS121S0100000_21(this, 127));
        TuxTextView tuxTextView = (TuxTextView) this.LLJI.getValue();
        if (L5().LLILZLL) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        Comment comment10 = this.LLJJIJI;
        if (comment10 != null && comment10.needHighlight) {
            HandlerHook.viewPostDelay((View) this.LLILLL.getValue(), new ARunnableS90S0200000_21(comment10, this, 55), 150L);
        }
        InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLJJIJIIJIL.getValue();
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LIZLLL(this.LLJJIII);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ctr, viewGroup, false);
    }

    public final void I5(User user, Context context, NowFeedMobHierarchyData nowFeedMobHierarchyData, String str) {
        String enterFrom;
        String enterFrom2;
        Aweme aweme;
        String str2;
        int followStatus;
        Aweme aweme2;
        User author;
        Aweme aweme3;
        NowPostInfo nowPostInfo;
        if (!TextUtils.isEmpty(user.getUid())) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", user.getUid());
            Aweme aweme4 = null;
            if (nowFeedMobHierarchyData != null) {
                enterFrom = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                enterFrom = null;
            }
            smartRouteBuildRoute.withParam("enter_from", enterFrom);
            smartRouteBuildRoute.withParam("extra_from_pre_page", "homepage_now");
            smartRouteBuildRoute.withParam("extra_previous_page_position", "comment_panel");
            smartRouteBuildRoute.withParam("source_page", "homepage_now_comment");
            smartRouteBuildRoute.withParam("sec_uid", user.getSecUid());
            smartRouteBuildRoute.open();
            C735410St1 c735410St1 = new C735410St1();
            if (nowFeedMobHierarchyData == null || (enterFrom2 = nowFeedMobHierarchyData.getEnterFrom()) == null) {
                enterFrom2 = "";
            }
            c735410St1.LIZLLL = enterFrom2;
            c735410St1.LJJLIIIJILLIZJL = str;
            c735410St1.LJJZZIII = "comment_panel";
            c735410St1.LJL = "comment_panel";
            c735410St1.LJLJJI = "";
            CommentItem item = getItem();
            if (item != null) {
                aweme = item.getAweme();
            } else {
                aweme = null;
            }
            c735410St1.LJIJI(aweme);
            c735410St1.LJJLIIJ = user.getUid();
            if (C295200Bhe.LIZIZ) {
                c735410St1.LJIJJ = user.getRecType();
                c735410St1.LJZL = Boolean.FALSE;
            }
            CommentItem item2 = getItem();
            if (item2 != null && (aweme3 = item2.getAweme()) != null && (nowPostInfo = aweme3.nowPostInfo) != null) {
                str2 = nowPostInfo.nowMediaType;
            } else {
                str2 = null;
            }
            c735410St1.LJFF("now_type", str2, InterfaceC1210900hcG.LIZ);
            CommentItem item3 = getItem();
            if (item3 != null && (aweme2 = item3.getAweme()) != null && (author = aweme2.getAuthor()) != null) {
                followStatus = author.getFollowStatus();
            } else {
                followStatus = 0;
            }
            c735410St1.LIZLLL(followStatus, "follow_status");
            c735410St1.LJIILJJIL();
            CommentItem item4 = getItem();
            if (item4 != null) {
                aweme4 = item4.getAweme();
            }
            C1440005kM.LIZ(new C737030Svd(36, aweme4));
        }
    }
}

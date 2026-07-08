package com.ss.android.ugc.aweme.comment.exposedcmt;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C0LAB;
import X.C0RI2;
import X.C0S24;
import X.C0S25;
import X.C1209980ham;
import X.C123100dR;
import X.C1350750lFp;
import X.C1387870mDh;
import X.C1387890mDj;
import X.C1387900mDk;
import X.C1387910mDl;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2002007so;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C430750Gun;
import X.C452501pT;
import X.C582980Mtk;
import X.C622680Oba;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.experiment.ExposedCommentConfig;
import com.ss.android.ugc.aweme.comment.exposedcmt.fyp.ExposedCommentTriggerAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.adapter.FypExposedCommentAvoidViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ExposedCommentAssem extends BaseCellSlotComponent<ExposedCommentAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILLL;
    public SmartAvatarImageView LLJLLIL;
    public TuxTextView LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public final C01GW LLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS259S0000000_21.get$arr$(66));
    public Aweme LLLF;
    public Integer LLLFF;
    public boolean LLLFFI;
    public Comment LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public final InterfaceC1731706qJ LLLIILIL;
    public boolean LLLIL;
    public int LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public ARunnableS121S0100000_21 LLLJ;
    public boolean LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public final InterfaceC1731706qJ LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExposedCommentAssem.class, "exposedCommentAvoidVM", "getExposedCommentAvoidVM()Lcom/ss/android/ugc/aweme/feed/adapter/FypExposedCommentAvoidViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ExposedCommentAssem.class, "exposedCommentVM", "getExposedCommentVM()Lcom/ss/android/ugc/aweme/comment/exposedcmt/FypExposedCommentVM;", 0);
        c09r3.getClass();
        LLLLIILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ExposedCommentAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FypExposedCommentAvoidViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLIILIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ, 117), null, AFwS259S0000000_21.get$arr$(64));
        this.LLLILZ = -1;
        this.LLLJIL = true;
        this.LLLJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 119));
        this.LLLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 120));
        this.LLLLII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(109));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FypExposedCommentVM.class);
        this.LLLLIIIILLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS565S0100000_21(c19719912DlLIZ2, 118), null, AFwS259S0000000_21.get$arr$(65));
        this.LLLLIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(108));
        this.LLLLIILL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(67));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.a22;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLLF = null;
        this.LLLFZ = null;
    }

    public final void Bp() {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = this.LLLJ;
        if (aRunnableS121S0100000_21 != null) {
            ((Handler) this.LLLLII.getValue()).removeCallbacks(aRunnableS121S0100000_21);
            this.LLLJ = null;
        }
    }

    public final boolean Qp() {
        C2002007so c2002007so = (C2002007so) ((AssemViewModel) this.LLLIILIL.getValue(this, LLLLIILLL[0])).getState();
        String str = c2002007so.LL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        boolean z = Intrinsics.LJFF(str, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid()) && c2002007so.LLILLJJLI;
        IUpvoteGuideAbility iUpvoteGuideAbility = (IUpvoteGuideAbility) this.LLLL.getValue();
        if (iUpvoteGuideAbility == null || !iUpvoteGuideAbility.f51()) {
            return z;
        }
        return true;
    }

    public final void Tp() {
        Aweme awemeAN;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        Aweme aweme = this.LLLF;
        if (Intrinsics.LJFF(aid, aweme != null ? aweme.getAid() : null)) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (C123100dR.LIZ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid())) {
                IPanelUIAbility iPanelUIAbility = (IPanelUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPanelUIAbility.class, null);
                String aid2 = (iPanelUIAbility == null || (awemeAN = iPanelUIAbility.aN()) == null) ? null : awemeAN.getAid();
                C724270Sb3 c724270Sb33 = this.LLJI;
                if (Intrinsics.LJFF(aid2, ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().getAid())) {
                    Up();
                } else {
                    this.LLLILZLLLI = true;
                }
            }
        }
    }

    public final void Up() {
        if (this.LLLII || this.LLLIIII || this.LLLI) {
            return;
        }
        C1387870mDh c1387870mDh = C1387870mDh.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        c1387870mDh.getClass();
        if (C1387870mDh.LJFF(aid)) {
            this.LLLIIII = true;
            return;
        }
        if (!C1387870mDh.LIZIZ()) {
            this.LLLIIII = true;
            return;
        }
        if (Qp()) {
            this.LLLIIII = true;
            return;
        }
        Bp();
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 26);
        this.LLLJ = aRunnableS121S0100000_21;
        C786410Ut5.LJLIIL(3000L, (Handler) this.LLLLII.getValue(), aRunnableS121S0100000_21);
    }

    public final void Vp() {
        CommentItemList commentItemList;
        FypExposedCommentVM fypExposedCommentVM = (FypExposedCommentVM) this.LLLLIIIILLL.getValue(this, LLLLIILLL[1]);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Comment comment = null;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        fypExposedCommentVM.getClass();
        String aid = videoItemParams.getAweme().getAid();
        if (aid != null) {
            C1387870mDh.LIZ.getClass();
            if (!C1387870mDh.LIZLLL(aid) || C1387870mDh.LIZJ(aid) || (commentItemList = C0S25.LIZ.get(aid)) == null) {
                fypExposedCommentVM.setState(AFwS243S0000000_11.get$arr$(830));
                C23250099c.LIZLLL(fypExposedCommentVM.getAssemVMScope(), null, null, new C0S24(fypExposedCommentVM, aid, videoItemParams, null), 3);
                return;
            }
            List<Comment> list = commentItemList.items;
            if (list != null) {
                Iterator<Comment> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Comment next = it2.next();
                    if (next.getCid() != null) {
                        comment = next;
                        break;
                    }
                }
                comment = comment;
            }
            fypExposedCommentVM.setState(new AwS590S0100000_11(comment, 616));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        ViewTreeObserver viewTreeObserver;
        Bp();
        View view = this.LLJZIJLIL;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.isAlive();
        }
        C622680Oba.LIZLLL(this);
    }

    public final void Ep(int i) {
        if (LJJIJL().getVisibility() == i) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, LJJIJL());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> Fp(com.ss.android.ugc.aweme.comment.model.Comment r6) {
        /*
            r5 = this;
            X.0l0N r1 = X.C1341170l0N.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LLLF
            r1.getClass()
            boolean r0 = X.C1341170l0N.LIZ(r0)
            r4 = 1
            r1 = r0 ^ 1
            com.bytedance.tux.input.TuxTextView r0 = r5.LLJLLL
            if (r0 == 0) goto L4e
            android.content.Context r0 = r0.getContext()
        L16:
            r3 = 0
            if (r0 == 0) goto L4c
            if (r1 == 0) goto L4c
            java.lang.Integer r2 = r6.getHotCommentShowType()
            X.0mDi r0 = X.EnumC1387880mDi.REPLY
            int r1 = r0.getValue()
            if (r2 == 0) goto L3b
            int r0 = r2.intValue()
            if (r0 != r1) goto L3b
        L2d:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r1, r0)
            return r2
        L3b:
            X.0mDi r0 = X.EnumC1387880mDi.DIGG
            int r1 = r0.getValue()
            if (r2 == 0) goto L4c
            int r0 = r2.intValue()
            if (r0 != r1) goto L4c
            r3 = 1
            r4 = 0
            goto L2d
        L4c:
            r4 = 0
            goto L2d
        L4e:
            r0 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentAssem.Fp(com.ss.android.ugc.aweme.comment.model.Comment):kotlin.Pair");
    }

    public final C0LAB Jp(Comment comment) {
        Object obj;
        String strLIZ = C1350750lFp.LIZ(comment);
        if (!C123100dR.LIZ(strLIZ)) {
            strLIZ = "text_comment";
        }
        C0LAB c0lab = new C0LAB();
        String cid = comment.getCid();
        String str = "";
        if (cid == null) {
            cid = "";
        }
        c0lab.LJ("comment_id", cid);
        String awemeId = comment.getAwemeId();
        if (awemeId == null) {
            awemeId = "";
        }
        c0lab.LJ("group_id", awemeId);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String authorUid = AwemeExtKt.getAuthorUid(((VideoItemParams) obj).getAweme());
        if (authorUid == null) {
            authorUid = "";
        }
        c0lab.LJ("author_id", authorUid);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        User author = ((VideoItemParams) obj2).getAweme().getAuthor();
        c735840Sti.getClass();
        c0lab.LIZLLL(Integer.valueOf(C735840Sti.LJIIIIZZ(author)), "follow_status");
        c0lab.LJ("message_type", strLIZ);
        c0lab.LIZLLL(Integer.valueOf(C735840Sti.LJIIIIZZ(comment.getUser())), "follow_status_to_user");
        String uid = comment.getUser().getUid();
        if (uid != null) {
            str = uid;
        }
        c0lab.LJ("comment_author_uid", str);
        c0lab.LIZLLL(comment.getHotCommentShowType(), "show_cmt_inter_metric_type");
        C1387870mDh.LIZ.getClass();
        Pair pairLJ = C1387870mDh.LJ(comment);
        String str2 = (String) pairLJ.getFirst();
        Long l = (Long) pairLJ.getSecond();
        if (str2 != null) {
            c0lab.LJ("show_cmt_inter_metric_type", str2);
        }
        if (l != null) {
            l.longValue();
            c0lab.LIZIZ(l.longValue(), "show_cmt_inter_metric_value");
        }
        return c0lab;
    }

    @C14EU
    public final void onEvent(C1209980ham c1209980ham) {
        String aid;
        Object obj;
        if (this.LLLI && c1209980ham.LIZ == 24) {
            Aweme aweme = c1209980ham.LIZJ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(aid, ((VideoItemParams) obj).getAweme().getAid())) {
                Object obj2 = c1209980ham.LIZIZ;
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                if (Intrinsics.LJFF(obj2, "homepage_hot")) {
                    ((Handler) this.LLLLII.getValue()).removeCallbacksAndMessages(null);
                    this.LLLIIII = true;
                    this.LLLI = false;
                    Ep(8);
                    Aweme aweme2 = this.LLLF;
                    if (aweme2 != null && C123100dR.LIZ(aweme2.getAid())) {
                        C1387870mDh c1387870mDh = C1387870mDh.LIZ;
                        String aid2 = aweme2.getAid();
                        c1387870mDh.getClass();
                        String strLIZ = C1387870mDh.LIZ(aid2);
                        ConcurrentHashMap<String, C1387890mDj> concurrentHashMap = C1387870mDh.LIZIZ;
                        C1387890mDj c1387890mDj = concurrentHashMap.get(strLIZ);
                        if (c1387890mDj != null) {
                            c1387890mDj.LIZIZ = true;
                        } else {
                            concurrentHashMap.put(strLIZ, new C1387890mDj(false, true, false, null, null, 29));
                            C1387870mDh.LJI(strLIZ);
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (SmartAvatarImageView) view.findViewById(R.id.ebb);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.ebc);
        this.LLJZ = view.findViewById(R.id.hte);
        this.LLJZIJLIL = view.findViewById(R.id.htf);
        View view2 = this.LLJZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 287), view2);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0Nyy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJ;
            }
        }, null, AFwS305S0000000_21.get$arr$(89), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLL.getValue(), new C2217381BqS() { // from class: X.0SFs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJJ;
            }
        }, null, AFwS305S0000000_21.get$arr$(90), 6);
        C0RI2.LIZIZ.LIZ(this, new AwS635S0100000_21(this, 216));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLIILL.getValue(), new C2217381BqS() { // from class: X.0Nyx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(87), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLIILL.getValue(), new C2217381BqS() { // from class: X.0Nko
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS305S0000000_21.get$arr$(88), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLLIIIILLL.getValue(this, LLLLIILLL[1]), new C2217381BqS() { // from class: X.0RtA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C710030RtB) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(315), 4);
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        ExposedCommentTriggerAbility exposedCommentTriggerAbility = (ExposedCommentTriggerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ExposedCommentTriggerAbility.class, null);
        if (exposedCommentTriggerAbility != null) {
            return exposedCommentTriggerAbility.wO();
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String nickname;
        int iValueOf;
        Object obj;
        Object obj2;
        Object obj3;
        int duration;
        ViewTreeObserver viewTreeObserver;
        VideoItemParams videoItemParams2 = videoItemParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem bind");
        User author = videoItemParams2.getAweme().getAuthor();
        Object obj4 = null;
        if (author != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLF = videoItemParams2.getAweme();
        boolean z = true;
        this.LLLIIIL = true;
        Video video = videoItemParams2.getAweme().getVideo();
        int iMax = -1;
        if (video != null) {
            iValueOf = Integer.valueOf(video.getDuration());
        } else {
            iValueOf = -1;
        }
        this.LLLFF = iValueOf;
        View view = this.LLJZIJLIL;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.isAlive();
        }
        Bp();
        Ep(8);
        this.LLLFFI = false;
        this.LLLI = false;
        this.LLLII = false;
        this.LLLIIII = false;
        this.LLLIIIIL = false;
        this.LLLIIL = false;
        this.LLLJIL = true;
        this.LLLIL = false;
        this.LLLILZ = -1;
        this.LLLILZLLLI = false;
        this.LLLIZZ = false;
        this.LLLILZJ = false;
        C1387870mDh c1387870mDh = C1387870mDh.LIZ;
        String aid = videoItemParams2.getAweme().getAid();
        c1387870mDh.getClass();
        if (C1387870mDh.LIZLLL(aid) && !C1387870mDh.LIZJ(videoItemParams2.getAweme().getAid())) {
            if (Qp()) {
                this.LLLIIII = true;
            } else {
                this.LLLJIL = false;
                Vp();
            }
        } else {
            C1387910mDl.LIZ.getClass();
            if (((ExposedCommentConfig) C1387910mDl.LIZJ.getValue()).triggerStrategy == 0) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj2 = c724270Sb3.LL;
                } else {
                    obj2 = null;
                }
                boolean zIsPhotoMode = AwemeExtKt.isPhotoMode(((VideoItemParams) obj2).getAweme());
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj3 = c724270Sb32.LL;
                } else {
                    obj3 = null;
                }
                Video video2 = ((VideoItemParams) obj3).getAweme().getVideo();
                if (video2 != null) {
                    duration = video2.getDuration();
                } else {
                    duration = -1;
                }
                if (zIsPhotoMode) {
                    C724270Sb3 c724270Sb33 = this.LLJI;
                    if (c724270Sb33 != null) {
                        obj4 = c724270Sb33.LL;
                    }
                    if (!C582980Mtk.LIZ(((VideoItemParams) obj4).getAweme())) {
                        Tp();
                    } else {
                        this.LLLIZZ = true;
                    }
                } else {
                    if (duration > 0) {
                        if (duration <= 10000) {
                            iMax = (int) (((double) duration) * 0.5d);
                        } else if (duration <= 60000) {
                            iMax = Math.max(5000, (int) (((double) duration) * 0.3d));
                        } else {
                            iMax = 15000;
                        }
                    }
                    this.LLLILZ = iMax;
                    if (iMax <= 0) {
                        z = false;
                    }
                    this.LLLIL = z;
                }
            } else {
                C724270Sb3 c724270Sb34 = this.LLJI;
                if (c724270Sb34 != null) {
                    obj = c724270Sb34.LL;
                } else {
                    obj = null;
                }
                if (AwemeExtKt.isPhotoMode(((VideoItemParams) obj).getAweme())) {
                    C724270Sb3 c724270Sb35 = this.LLJI;
                    if (c724270Sb35 != null) {
                        obj4 = c724270Sb35.LL;
                    }
                    if (!C582980Mtk.LIZ(((VideoItemParams) obj4).getAweme())) {
                        Tp();
                    } else {
                        this.LLLIZZ = true;
                    }
                } else {
                    this.LLLILZJ = true;
                }
            }
        }
        IExposedCommentAssemHost iExposedCommentAssemHost = (IExposedCommentAssemHost) this.LLLJL.getValue();
        if (iExposedCommentAssemHost != null) {
            iExposedCommentAssemHost.LLLILZ(new AwS387S0200000_21(this, videoItemParams2, 110));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    public final C430750Gun<View> Gp(Context context, String str) {
        int i = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
        tuxTextView.setText(str);
        tuxTextView.setTextColorRes(R.attr.eh);
        tuxTextView.setTuxFont(62);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_heart;
        c419910GdJ.LJ = Integer.valueOf(R.attr.eh);
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        if (!C426750GoL.LIZLLL(context)) {
            tuxTextView.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
        } else {
            tuxTextView.setCompoundDrawables(null, null, tuxIconDrawableLIZ, null);
        }
        C430750Gun<View> c430750Gun = new C430750Gun<>(tuxTextView);
        TuxTextView tuxTextView2 = this.LLJLLL;
        if (tuxTextView2 != null && tuxTextView2.getLayoutDirection() == 1) {
            i = 1;
        }
        if (i != 0) {
            c430750Gun.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            return c430750Gun;
        }
        c430750Gun.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        return c430750Gun;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        AnimatorSet animatorSet = ((C1387900mDk) this.LLLLIIL.getValue()).LIZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
    }

    public final C430750Gun Ip(Context context, String str, long j) {
        Integer numValueOf;
        int iIntValue;
        Resources resources = context.getResources();
        AttributeSet attributeSet = null;
        if (j >= -2147483648L && j <= 2147483647L) {
            numValueOf = Integer.valueOf((int) j);
        } else {
            numValueOf = null;
        }
        int i = 0;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        String quantityString = resources.getQuantityString(2131755156, iIntValue, str);
        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, 6, i);
        tuxTextView.setText(quantityString);
        tuxTextView.setTextColorRes(R.attr.eh);
        tuxTextView.setTuxFont(62);
        C430750Gun c430750Gun = new C430750Gun(tuxTextView);
        TuxTextView tuxTextView2 = this.LLJLLL;
        if (tuxTextView2 != null && tuxTextView2.getLayoutDirection() == 1) {
            i = 1;
        }
        if (i != 0) {
            c430750Gun.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            return c430750Gun;
        }
        c430750Gun.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        return c430750Gun;
    }
}

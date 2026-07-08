package com.ss.android.ugc.aweme.comment.photocomment;

import X.AbstractC848400XPy;
import X.C036E;
import X.C0XIR;
import X.C0XPD;
import X.C0XQ7;
import X.C1340010kyV;
import X.C1341170l0N;
import X.C1342140l1w;
import X.C1344030l4z;
import X.C1344550l5p;
import X.C1345420l7E;
import X.C1345520l7O;
import X.C1345570l7T;
import X.C1345760l7m;
import X.C1345890l7z;
import X.C1346420l8q;
import X.C1350920lG6;
import X.C1354920lMY;
import X.C1372520low;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1875607Wg;
import X.C1954807lC;
import X.C2035907yH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23112093u;
import X.C294290BgB;
import X.C622680Oba;
import X.C627150Oin;
import X.C724240Sb0;
import X.C726120Se2;
import X.C735370Ssx;
import X.C7770031s;
import X.C786410Ut5;
import X.EnumC1345510l7N;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.AAListenerS332S0100000_21;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import Y.AfS190S0100000_21;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInnerDiggAssemV2 extends ReusedUIContentAssem<CommentInnerPhotoAssem> implements InterfaceC712990Rxx<C1875607Wg> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public TuxIconView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public AnimatorSet LLJJL;
    public AnimatorSet LLJJLIIIJLLLLLLLZ;
    public Comment LLJLIL;
    public boolean LLJLL;
    public final C726120Se2 LLJL = new C726120Se2();
    public final CommentLikeViewModel LLJLILLLLZIIL = (CommentLikeViewModel) new ViewModelProvider(this).get(CommentLikeViewModel.class);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentInnerDiggAssemV2.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final CommentContextSource cp() {
        C726120Se2 c726120Se2 = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return c726120Se2.LIZ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        this.LLJLILLLLZIIL.LLILLJJLI.observe(this, new AObserverS224S0100000_21(this, 24));
    }

    public final void dp(String str) {
        Activity activityLIZ;
        boolean z;
        int i;
        String authorUid;
        Aweme aweme;
        int i2;
        Activity activityLIZ2;
        String str2;
        String aid;
        String authorUid2;
        String aid2;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        CommentCommonModel commonModel;
        Comment comment = this.LLJLIL;
        CommentPerfMonitorUtil.LIZ.getClass();
        C1345420l7E c1345420l7E = CommentPerfMonitorUtil.LJFF;
        c1345420l7E.LIZIZ();
        c1345420l7E.LIZIZ = System.currentTimeMillis();
        if (!this.LLJLILLLLZIIL.LLILLL && !C1345890l7z.LIZ(comment)) {
            String cid = null;
            if (comment != null && comment.getCid() != null) {
                getContext();
                boolean z2 = false;
                try {
                    if (C036E.LIZ.LIZIZ()) {
                        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                            Context context = getContext();
                            if (context != null) {
                                activityLIZ2 = C1388190mED.LIZ(context);
                            } else {
                                activityLIZ2 = null;
                            }
                            CommentContextSource commentContextSourceCp = cp();
                            if (commentContextSourceCp == null || (commonModel = commentContextSourceCp.getCommonModel()) == null || (str2 = commonModel.eventType) == null) {
                                str2 = "";
                            }
                            C627150Oin c627150Oin = new C627150Oin();
                            C786410Ut5.LJJJI("login_title", "", c627150Oin.LIZ);
                            CommentContextSource commentContextSourceCp2 = cp();
                            if (commentContextSourceCp2 != null && (aweme4 = CommentContextSourceKt.aweme(commentContextSourceCp2)) != null) {
                                aid = aweme4.getAid();
                            } else {
                                aid = null;
                            }
                            C786410Ut5.LJJJI("group_id", aid, c627150Oin.LIZ);
                            CommentContextSource commentContextSourceCp3 = cp();
                            if (commentContextSourceCp3 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceCp3)) != null) {
                                authorUid2 = AwemeExtKt.getAuthorUid(aweme3);
                            } else {
                                authorUid2 = null;
                            }
                            C786410Ut5.LJJJI("author_id", authorUid2, c627150Oin.LIZ);
                            CommentContextSource commentContextSourceCp4 = cp();
                            if (commentContextSourceCp4 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceCp4)) != null) {
                                aid2 = aweme2.getAid();
                            } else {
                                aid2 = null;
                            }
                            C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(aid2), c627150Oin.LIZ);
                            C0XPD.LIZIZ(activityLIZ2, str2, "like_comment", c627150Oin.LIZ, null);
                            return;
                        }
                        if (C1345570l7T.LIZ(comment)) {
                            int i3 = 1;
                            if (comment != null && comment.isUserDigged()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z3 = !z;
                            if (comment != null) {
                                int diggCount = comment.getDiggCount();
                                if (z3) {
                                    i2 = 1;
                                } else {
                                    i2 = -1;
                                }
                                i = diggCount + i2;
                                if (comment.isAuthorDigged()) {
                                    z2 = true;
                                }
                            } else {
                                i = 0;
                            }
                            CommentContextSource commentContextSourceCp5 = cp();
                            if (commentContextSourceCp5 != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceCp5)) != null) {
                                authorUid = AwemeExtKt.getAuthorUid(aweme);
                            } else {
                                authorUid = null;
                            }
                            if (TextUtils.equals(authorUid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                                z2 = z3;
                            }
                            if (z2) {
                                C1350920lG6.LJLLL("show");
                            }
                            if (z3) {
                                AnimatorSet animatorSet = this.LLJJL;
                                if (animatorSet != null) {
                                    animatorSet.start();
                                }
                            } else {
                                AnimatorSet animatorSet2 = this.LLJJLIIIJLLLLLLLZ;
                                if (animatorSet2 != null) {
                                    animatorSet2.start();
                                }
                            }
                            hp(Boolean.valueOf(z3), Boolean.valueOf(z2), Integer.valueOf(i), false, true);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onLikeClicked: comment id ");
                            if (comment != null) {
                                cid = comment.getCid();
                            }
                            sbLIZ.append(cid);
                            sbLIZ.append(", toDiggState ");
                            sbLIZ.append(z3);
                            sbLIZ.append(", toDiggCount ");
                            sbLIZ.append(i);
                            C1344030l4z.LIZJ("LikeAndHateView", C2188811AlT.LIZIZ(sbLIZ));
                            if (z3 && comment != null) {
                                comment.isUserBuried();
                            }
                            CommentLikeViewModel commentLikeViewModel = this.LLJLILLLLZIIL;
                            if (!z3) {
                                i3 = 2;
                            }
                            commentLikeViewModel.zQ2(i3, str, z2);
                            return;
                        }
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                Context context2 = getContext();
                if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131837962);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
    }

    @C14EU
    public final void onEvent(C2035907yH c2035907yH) {
        String cid;
        if (c2035907yH == null) {
            return;
        }
        String cid2 = c2035907yH.LIZ.getCid();
        Comment comment = this.LLJLIL;
        Object objH2 = null;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        if (!Intrinsics.LJFF(cid2, cid)) {
            return;
        }
        Comment comment2 = this.LLJLIL;
        if (comment2 != null && comment2.isUserDigged()) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "vibrator");
        }
        Vibrator vibrator = (Vibrator) objH2;
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(25L, 100));
        } else {
            vibrator.vibrate(25L);
        }
        dp("double_tap");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Boolean boolValueOf;
        Integer numValueOf;
        Boolean boolValueOf2;
        C622680Oba.LIZJ(this);
        this.LLJJJJ = (TuxIconView) view.findViewById(R.id.lmj);
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.lf0);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.zts);
        C1342140l1w.LIZIZ(this.LLJJJJJIL).addListener(new AAListenerS332S0100000_21(this, 63));
        C1342140l1w.LIZIZ(this.LLJJJJ).addListener(new AAListenerS332S0100000_21(this, 64));
        AnimatorSet animatorSetLIZLLL = C1342140l1w.LIZLLL(this.LLJJJJ, this.LLJJJJJIL);
        this.LLJJLIIIJLLLLLLLZ = animatorSetLIZLLL;
        animatorSetLIZLLL.addListener(new AAListenerS332S0100000_21(this, 65));
        AnimatorSet animatorSetLIZJ = C1342140l1w.LIZJ(this.LLJJJJJIL, this.LLJJJJ);
        this.LLJJL = animatorSetLIZJ;
        animatorSetLIZJ.addListener(new AAListenerS332S0100000_21(this, 66));
        Comment comment = this.LLJLIL;
        if (comment != null) {
            boolValueOf = Boolean.valueOf(comment.isUserDigged());
        } else {
            boolValueOf = null;
        }
        Comment comment2 = this.LLJLIL;
        if (comment2 != null) {
            numValueOf = Integer.valueOf(comment2.getDiggCount());
        } else {
            numValueOf = null;
        }
        Comment comment3 = this.LLJLIL;
        if (comment3 != null) {
            boolValueOf2 = Boolean.valueOf(comment3.isAuthorDigged);
        } else {
            boolValueOf2 = null;
        }
        hp(boolValueOf, boolValueOf2, numValueOf, true, false);
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 34), LJJIJL());
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 11));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(C1875607Wg c1875607Wg) {
        String aid;
        FypExposedCommentMobParams fypExposedCommentMobParams;
        String cid;
        Boolean boolValueOf;
        Integer numValueOf;
        CommentCommonModel commonModel;
        C1875607Wg c1875607Wg2 = c1875607Wg;
        if (LJJIJL().getId() == R.id.mo3) {
            List<Comment> replyComments = c1875607Wg2.LL.getReplyComments();
            Comment commentLIZ = C1340010kyV.LIZ(replyComments);
            if (c1875607Wg2.LL.getCommentType() == 1 && commentLIZ != null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    C786410Ut5.LJLLLLLL(0, viewLJJIJL);
                }
                this.LLJLIL = (Comment) C13LP.LJJJLL(replyComments);
            } else {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, viewLJJIJL2);
                return;
            }
        } else {
            this.LLJLIL = c1875607Wg2.LL;
        }
        CommentLikeViewModel commentLikeViewModel = this.LLJLILLLLZIIL;
        Aweme aweme = CommentContextSourceKt.aweme(cp());
        Boolean boolValueOf2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Comment comment = this.LLJLIL;
        String sessionId = CommentContextSourceKt.getSessionId(cp());
        CommentContextSource commentContextSourceCp = cp();
        if (commentContextSourceCp != null && (commonModel = commentContextSourceCp.getCommonModel()) != null) {
            fypExposedCommentMobParams = commonModel.fypExposedCommentMobParams;
        } else {
            fypExposedCommentMobParams = null;
        }
        commentLikeViewModel.LLILZIL = aid;
        commentLikeViewModel.LLILZ = comment;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        commentLikeViewModel.LLILZLL = cid;
        commentLikeViewModel.LLIZ = sessionId;
        commentLikeViewModel.LLIZLLLIL = fypExposedCommentMobParams;
        commentLikeViewModel.LLJ = null;
        commentLikeViewModel.LLJI = null;
        commentLikeViewModel.LLILLL = false;
        Comment comment2 = this.LLJLIL;
        if (comment2 != null) {
            boolValueOf = Boolean.valueOf(comment2.isUserDigged());
        } else {
            boolValueOf = null;
        }
        Comment comment3 = this.LLJLIL;
        if (comment3 != null) {
            numValueOf = Integer.valueOf(comment3.getDiggCount());
        } else {
            numValueOf = null;
        }
        Comment comment4 = this.LLJLIL;
        if (comment4 != null) {
            boolValueOf2 = Boolean.valueOf(comment4.isAuthorDigged);
        }
        hp(boolValueOf, boolValueOf2, numValueOf, true, false);
        this.LLJLILLLLZIIL.LLJILLL = C1558520qew.LJIIL(this);
        this.LLJLILLLLZIIL.LLJJ = new WeakReference<>(C724240Sb0.LJI(this));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1875607Wg c1875607Wg) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1875607Wg c1875607Wg) {
    }

    public final void ep(EnumC1345510l7N enumC1345510l7N, Throwable th) {
        Integer num;
        C23112093u c23112093u;
        C23112093u c23112093u2;
        CommentContextSource commentContextSource;
        C23112093u c23112093u3;
        C23112093u c23112093u4;
        int i = C1345520l7O.LIZ[enumC1345510l7N.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        num = 2131828360;
                        if ((th instanceof C0XIR) && (c23112093u4 = (C23112093u) th) != null && c23112093u4.getErrorCode() == 3002043) {
                            num = 2131828361;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    num = 2131828360;
                }
            } else {
                num = 2131857729;
                if ((th instanceof C0XIR) && (c23112093u3 = (C23112093u) th) != null && c23112093u3.getErrorCode() == 3002043) {
                    num = 2131829239;
                }
            }
        } else {
            num = 2131830649;
            if ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null && c23112093u.getErrorCode() == 3002043) {
                num = 2131829238;
            }
        }
        C1354920lMY.LIZLLL(getContext(), th, num.intValue());
        if ((th instanceof C0XIR) && (c23112093u2 = (C23112093u) th) != null && c23112093u2.getErrorCode() == 3002043) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null) {
                commentContextSource.innerRefreshCommentStatus(true);
            }
            ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageAbility.class, null);
            if (iCommentPageAbility != null) {
                iCommentPageAbility.LP0();
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }

    public final void hp(Boolean bool, Boolean bool2, Integer num, boolean z, boolean z2) {
        String cid;
        String cid2;
        int i;
        long jIntValue;
        if (z) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                TuxIconView tuxIconView = this.LLJJJJJIL;
                if (tuxIconView != null) {
                    C786410Ut5.x5(tuxIconView, 0.0f);
                }
                TuxIconView tuxIconView2 = this.LLJJJJ;
                if (tuxIconView2 != null) {
                    C786410Ut5.x5(tuxIconView2, 1.0f);
                }
            } else {
                TuxIconView tuxIconView3 = this.LLJJJJJIL;
                if (tuxIconView3 != null) {
                    C786410Ut5.x5(tuxIconView3, 1.0f);
                }
                TuxIconView tuxIconView4 = this.LLJJJJ;
                if (tuxIconView4 != null) {
                    C786410Ut5.x5(tuxIconView4, 0.0f);
                }
            }
        }
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            C1341170l0N c1341170l0N = C1341170l0N.LIZ;
            Aweme aweme = CommentContextSourceKt.aweme(cp());
            c1341170l0N.getClass();
            if (C1341170l0N.LIZ(aweme)) {
                i = 4;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            if (num != null) {
                jIntValue = num.intValue();
            } else {
                jIntValue = 0;
            }
            tuxTextView.setText(C1372520low.LIZ(jIntValue));
            if (C294290BgB.LIZJ()) {
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    tuxTextView.setTextColorRes(R.attr.a1q);
                } else {
                    tuxTextView.setTextColorRes(R.attr.ef);
                }
            }
        }
        if (z2) {
            Boolean bool3 = Boolean.TRUE;
            String cid3 = null;
            if (Intrinsics.LJFF(bool2, bool3)) {
                Comment comment = this.LLJLIL;
                if (comment != null) {
                    cid2 = comment.getCid();
                } else {
                    cid2 = null;
                }
                C1440005kM.LIZ(new C7770031s(cid2, bool3));
            } else {
                Comment comment2 = this.LLJLIL;
                if (comment2 != null) {
                    cid = comment2.getCid();
                } else {
                    cid = null;
                }
                C1440005kM.LIZ(new C7770031s(cid, Boolean.FALSE));
            }
            ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(C724240Sb0.LJI(this), C1558520qew.LJIIL(this));
            if (iCommentListVMAbilityLJ != null) {
                Comment comment3 = this.LLJLIL;
                if (comment3 != null) {
                    cid3 = comment3.getCid();
                }
                iCommentListVMAbilityLJ.cE1(cid3, C1346420l8q.LIZJ(bool2));
            }
        }
    }
}

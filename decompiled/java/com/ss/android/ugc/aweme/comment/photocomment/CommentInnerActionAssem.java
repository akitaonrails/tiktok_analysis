package com.ss.android.ugc.aweme.comment.photocomment;

import X.C019F;
import X.C03DZ;
import X.C07CC;
import X.C09R3;
import X.C0H9H;
import X.C0HW6;
import X.C1340340kz2;
import X.C1344550l5p;
import X.C13LE;
import X.C1554610qYd;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C294430BgP;
import X.C724750Sbp;
import X.C726120Se2;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS124S0200000_21;
import Y.ACListenerS155S0100000_21;
import Y.AfS190S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInnerActionAssem extends UIContentAssem implements PhotoDetailAnimProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public View LLIZLLLIL;
    public View LLJ;
    public final C1340340kz2 LLJI = new C1340340kz2();
    public final C726120Se2 LLJIJIL = new C726120Se2();
    public final AssemVMLazy LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentInnerActionAssem.class, "source", "getSource()Lcom/ss/android/ugc/aweme/comment/photocomment/PhotoDetailContextSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentInnerActionAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommentInnerActionAssem.class, "commentActionMenuVM", "getCommentActionMenuVM()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentActionMenuVM;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public CommentInnerActionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentActionMenuVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 211), AFwS259S0000000_21.get$arr$(85), null, true);
    }

    public final CommentContextSource Go() {
        C726120Se2 c726120Se2 = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return c726120Se2.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), CommentInnerActionAssem.class, this);
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void CM0(String str) {
        String cid;
        Comment curSelectedComment;
        C1340340kz2 c1340340kz2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        C1344550l5p c1344550l5pLIZ = c1340340kz2.LIZ(this);
        if (c1344550l5pLIZ != null && (curSelectedComment = c1344550l5pLIZ.getCurSelectedComment()) != null) {
            cid = curSelectedComment.getCid();
        } else {
            cid = null;
        }
        if (Intrinsics.LJFF(str, cid)) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            C786410Ut5.T4(LJJIJL(), 1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void bq0(String str) {
        C0HW6 c0hw6 = C0HW6.LIZ;
        Context context = LJJIJL().getContext();
        View viewLJJIJL = LJJIJL();
        c0hw6.getClass();
        C0HW6.LIZ(context, viewLJJIJL).LJI(true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Activity activityLIZIZ;
        super.onViewCreated(view);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), PhotoDetailAnimProtocol.class, C1697810uHb.LJIILJJIL(this));
        this.LLIZLLLIL = view.findViewById(R.id.bn2);
        this.LLJ = view.findViewById(R.id.okn);
        if (C07CC.LIZ()) {
            C03DZ.LIZJ(this.LLJ);
            View view2 = this.LLJ;
            if (view2 != null) {
                C786410Ut5.I7(new ACListenerS155S0100000_21(this, 30), view2);
            }
        }
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS124S0200000_21(view, this, 13), view3);
        }
        Context context = getContext();
        if (context != null && C737910Sx3.LIZIZ(context) != null) {
            View viewLJJIJL = LJJIJL();
            Context context2 = getContext();
            if (context2 != null) {
                activityLIZIZ = C737910Sx3.LIZIZ(context2);
            } else {
                activityLIZIZ = null;
            }
            C0H9H.LJI(ScreenUtils.getStatusBarHeight(activityLIZIZ), viewLJJIJL);
        }
        if (C294430BgP.LIZIZ) {
            C786410Ut5.T4(LJJIJL(), 0.0f);
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1344550l5p.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            interfaceC1555100qZQLIZIZ.LIZ(new AfS190S0100000_21(this, 6));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.photocomment.util.PhotoDetailAnimProtocol
    public final void yJ(String str) {
        String cid;
        Comment curSelectedComment;
        C1340340kz2 c1340340kz2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        C1344550l5p c1344550l5pLIZ = c1340340kz2.LIZ(this);
        if (c1344550l5pLIZ != null && (curSelectedComment = c1344550l5pLIZ.getCurSelectedComment()) != null) {
            cid = curSelectedComment.getCid();
        } else {
            cid = null;
        }
        if (Intrinsics.LJFF(str, cid)) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
    }
}

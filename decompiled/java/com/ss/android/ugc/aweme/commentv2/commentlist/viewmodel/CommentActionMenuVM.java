package com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel;

import X.AnonymousClass0038;
import X.C1345410l7D;
import X.C1345760l7m;
import X.C1350920lG6;
import X.C1554960qZC;
import X.C15O7;
import X.C616460OFw;
import X.DialogInterfaceC21560019Ze;
import X.EnumC1342450l2R;
import X.EnumC725960Sdm;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2385309Wh;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentActionMenuVM extends AssemViewModel<AnonymousClass0038> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public InterfaceC665370Q7z LL;
    public WeakReference<Fragment> LLILLJJLI;
    public CommentContextSource LLILLL;
    public WeakReference<CommentLongPressFragment> LLILZ;
    public DialogInterfaceC21560019Ze LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new AnonymousClass0038(0);
    }

    public CommentActionMenuVM() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        CommentContextSource commentContextSource = null;
        if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", CommentContextSource.class, null)) != null) {
            commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
        }
        this.LLILLL = commentContextSource;
    }

    public final void zQ2(Fragment fragment) {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        InterfaceC665370Q7z interfaceC665370Q7z;
        ICommentExposureAbility iCommentExposureAbilityLIZIZ;
        if (!this.LLILZLL) {
            return;
        }
        if (fragment != null && (lifecycle = fragment.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null && currentState.isAtLeast(Lifecycle.State.STARTED) && (interfaceC665370Q7z = this.LL) != null && (iCommentExposureAbilityLIZIZ = C1345760l7m.LIZIZ(fragment, interfaceC665370Q7z)) != null) {
            iCommentExposureAbilityLIZIZ.RI0(EnumC725960Sdm.RESUME);
        }
        this.LLILZLL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010b A[PHI: r4
      0x010b: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String), (r4v5 java.lang.String) binds: [B:71:0x0107, B:20:0x003e, B:22:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map wQ2(com.ss.android.ugc.aweme.comment.model.Comment r10, com.ss.android.ugc.aweme.feed.model.Aweme r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM.wQ2(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee A[PHI: r15
      0x00ee: PHI (r15v6 java.lang.String) = (r15v4 java.lang.String), (r15v7 java.lang.String) binds: [B:73:0x0103, B:63:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(com.ss.android.ugc.aweme.feed.model.Aweme r22, com.ss.android.ugc.aweme.comment.model.Comment r23, androidx.fragment.app.Fragment r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM.yQ2(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.Comment, androidx.fragment.app.Fragment, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(com.ss.android.ugc.aweme.feed.model.Aweme r37, java.lang.String r38, com.ss.android.ugc.aweme.comment.model.CommentVideoModel.Type r39, com.ss.android.ugc.aweme.comment.model.Comment r40, X.C19EG r41, com.ss.android.ugc.aweme.comment.model.CommentContextSource r42) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM.xQ2(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, com.ss.android.ugc.aweme.comment.model.CommentVideoModel$Type, com.ss.android.ugc.aweme.comment.model.Comment, X.19EG, com.ss.android.ugc.aweme.comment.model.CommentContextSource):void");
    }

    public final void vQ2(final int i, final int i2, final int i3, final int i4, final int i5, final Comment comment, final Fragment fragment, final boolean z) {
        String authorUid;
        String sessionId;
        FypExposedCommentMobParams fypExposedCommentMobParams;
        EnumC1342450l2R currSortType;
        Boolean boolValueOf;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        Aweme aweme;
        String strEnterFrom = CommentContextSourceKt.enterFrom(this.LLILLL);
        CommentContextSource commentContextSource = this.LLILLL;
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        CommentContextSource commentContextSource2 = this.LLILLL;
        if (commentContextSource2 != null) {
            sessionId = CommentContextSourceKt.getSessionId(commentContextSource2);
        } else {
            sessionId = null;
        }
        CommentContextSource commentContextSource3 = this.LLILLL;
        if (commentContextSource3 != null && (commonModel2 = commentContextSource3.getCommonModel()) != null) {
            fypExposedCommentMobParams = commonModel2.fypExposedCommentMobParams;
        } else {
            fypExposedCommentMobParams = null;
        }
        CommentContextSource commentContextSource4 = this.LLILLL;
        if (commentContextSource4 != null) {
            currSortType = commentContextSource4.getCurrSortType();
        } else {
            currSortType = null;
        }
        CommentContextSource commentContextSource5 = this.LLILLL;
        if (commentContextSource5 != null && (commonModel = commentContextSource5.getCommonModel()) != null) {
            boolValueOf = Boolean.valueOf(commonModel.isInPhotoCommentDetailPage());
        } else {
            boolValueOf = null;
        }
        C1350920lG6.LJLLI(strEnterFrom, i, comment, authorUid, sessionId, fypExposedCommentMobParams, z, currSortType, boolValueOf, this.LLIZ);
        C15O7<BaseResponse> c15o7LIZIZ = C616460OFw.LIZ.LIZIZ(comment.getCid(), i);
        if (c15o7LIZIZ != null) {
            CommentPerfMonitorUtil.LIZ.getClass();
            C1345410l7D c1345410l7D = CommentPerfMonitorUtil.LJ;
            c1345410l7D.LIZIZ();
            c1345410l7D.LJI = String.valueOf(i2);
            c1345410l7D.LJFF = CommentPerfMonitorUtil.LJI();
            c1345410l7D.LIZLLL = System.currentTimeMillis();
            c15o7LIZIZ.LJ(new InterfaceC2385309Wh() { // from class: X.0l7s
                /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
                @Override // X.InterfaceC2385309Wh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object then(X.C15O7 r13) {
                    /*
                        Method dump skipped, instruction units count: 313
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1345820l7s.then(X.15O7):java.lang.Object");
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be A[PHI: r7
      0x00be: PHI (r7v6 java.lang.String) = (r7v0 java.lang.String), (r7v7 java.lang.String) binds: [B:49:0x00bc, B:47:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Type inference failed for: r29v2, types: [X.0l7n, X.0l8a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void AQ2(final com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM r40, final X.C1340400kz8 r41, final X.InterfaceC1345780l7o r42, final X.C1343670l4P r43, final androidx.fragment.app.Fragment r44, com.ss.android.ugc.aweme.comment.model.CommentContextSource r45, X.C20600815jK r46, X.C1339430kxZ r47, java.lang.String r48, int r49, X.C1339610kxr r50, boolean r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM.AQ2(com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentActionMenuVM, X.0kz8, X.0l7o, X.0l4P, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.comment.model.CommentContextSource, X.15jK, X.0kxZ, java.lang.String, int, X.0kxr, boolean, int):void");
    }
}

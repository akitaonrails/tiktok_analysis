package com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel;

import X.AnonymousClass0037;
import X.C1342260l28;
import X.C1345700l7g;
import X.C13LE;
import X.C1697810uHb;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C277760Auc;
import X.C294820Bh2;
import X.C722710SWn;
import X.C725970Sdn;
import X.EnumC725960Sdm;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentExposureVM extends AssemViewModel<AnonymousClass0037> implements ICommentExposureAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public InterfaceC665370Q7z LL;
    public WeakReference<Fragment> LLILLJJLI;
    public final C1342260l28 LLILLL = new C1342260l28(new AwS565S0100000_21(this, 501));
    public final C722710SWn LLILZ;
    public final C722710SWn LLILZIL;
    public final C722710SWn LLILZLL;
    public final List<C722710SWn> LLIZ;
    public final ConcurrentHashSet<String> LLIZLLLIL;
    public boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentExposureVM.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final boolean DQ2() {
        CommentCommonModel commonModel;
        if (((Number) C277760Auc.LIZ.getValue()).intValue() <= 0) {
            return false;
        }
        CommentContextSource commentContextSourceWQ2 = wQ2();
        return !Intrinsics.LJFF((commentContextSourceWQ2 == null || (commonModel = commentContextSourceWQ2.getCommonModel()) == null) ? null : commonModel.fromPage, "graphic_detail");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new AnonymousClass0037(0);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility
    public final void reset() {
        for (C722710SWn c722710SWn : this.LLIZ) {
            if (c722710SWn != null) {
                c722710SWn.LIZIZ.clear();
                c722710SWn.LIZJ.clear();
            }
        }
        this.LLIZLLLIL.clear();
    }

    public final CommentContextSource wQ2() {
        C1342260l28 c1342260l28 = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return c1342260l28.LIZIZ();
    }

    public CommentExposureVM() {
        C722710SWn c722710SWn;
        C722710SWn c722710SWn2 = new C722710SWn(new AwS635S0100000_21(this, 53));
        this.LLILZ = c722710SWn2;
        C722710SWn c722710SWn3 = null;
        if (!C294820Bh2.LIZ() || DQ2()) {
            c722710SWn = null;
        } else {
            c722710SWn = new C722710SWn(new AwS635S0100000_21(this, 55));
            c722710SWn.LIZLLL = 500;
        }
        this.LLILZIL = c722710SWn;
        if (C294820Bh2.LIZ()) {
            c722710SWn3 = new C722710SWn(new AwS635S0100000_21(this, 54));
            c722710SWn3.LIZLLL = 500;
        }
        this.LLILZLL = c722710SWn3;
        this.LLIZ = C1697810uHb.LJIIJJI(c722710SWn2, c722710SWn3, c722710SWn);
        this.LLIZLLLIL = new ConcurrentHashSet<>();
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLJ;
    }

    public final void AQ2(Comment comment) {
        if (comment == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("common onDetach  curComment?.cid = ");
        sbLIZ.append(comment.getCid());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ.LIZJ(comment);
    }

    public final void BQ2(Comment comment) {
        if (comment == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachFocusArea curComment?.cid = ");
        sbLIZ.append(comment.getCid());
        C2188811AlT.LIZIZ(sbLIZ);
        C722710SWn c722710SWn = this.LLILZLL;
        if (c722710SWn != null) {
            c722710SWn.LIZJ(comment);
        }
    }

    public final void CQ2(Comment comment) {
        if (comment == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachNonFocusArea curComment?.cid = ");
        sbLIZ.append(comment.getCid());
        C2188811AlT.LIZIZ(sbLIZ);
        C722710SWn c722710SWn = this.LLILZIL;
        if (c722710SWn != null) {
            c722710SWn.LIZJ(comment);
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility
    public final void RI0(EnumC725960Sdm enumC725960Sdm) {
        for (C722710SWn c722710SWn : this.LLIZ) {
            if (c722710SWn != null) {
                switch (C725970Sdn.LIZ[enumC725960Sdm.ordinal()]) {
                    case 1:
                        c722710SWn.LIZLLL();
                        break;
                    case 2:
                        c722710SWn.LIZ();
                        for (Map.Entry<Comment, Long> entry : c722710SWn.LIZJ.entrySet()) {
                            c722710SWn.LIZ.invoke(entry.getKey(), entry.getValue());
                        }
                        c722710SWn.LIZJ.clear();
                        break;
                    case 3:
                        c722710SWn.LIZLLL();
                        break;
                    case 4:
                        c722710SWn.LIZ();
                        break;
                    case 5:
                        c722710SWn.LIZ();
                        for (Map.Entry<Comment, Long> entry2 : c722710SWn.LIZJ.entrySet()) {
                            c722710SWn.LIZ.invoke(entry2.getKey(), entry2.getValue());
                        }
                        c722710SWn.LIZJ.clear();
                        break;
                    case 6:
                        c722710SWn.LIZLLL();
                        break;
                    default:
                        throw new C1954807lC();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility
    public final void aZ0(Comment comment) {
        Long l;
        long jCurrentTimeMillis;
        for (C722710SWn c722710SWn : this.LLIZ) {
            if (c722710SWn != null && comment != null && (l = c722710SWn.LIZIZ.get(comment)) != null) {
                long jLongValue = l.longValue();
                long jLongValue2 = 0;
                if (jLongValue == 0) {
                    jCurrentTimeMillis = 0;
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                }
                Long l2 = c722710SWn.LIZJ.get(comment);
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                }
                c722710SWn.LIZ.invoke(comment, Long.valueOf(jLongValue2 + jCurrentTimeMillis));
                c722710SWn.LIZJ.remove(comment);
                c722710SWn.LIZIZ.remove(comment);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> vQ2(com.ss.android.ugc.aweme.comment.model.Comment r6) {
        /*
            r5 = this;
            int r2 = X.C1345700l7g.LIZLLL(r6)
            r0 = 2
            r1 = 0
            r3 = -1
            if (r2 != r0) goto L4f
            X.0Q7z r2 = r5.LL
            if (r2 == 0) goto L4d
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r0 = r5.LLILLJJLI
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
        L17:
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility r2 = X.C1345760l7m.LJ(r0, r2)
            if (r2 == 0) goto L4d
            java.lang.String r0 = r6.getRootCommentId()
            int r0 = r2.fg2(r0)
        L25:
            X.0Q7z r4 = r5.LL
            if (r4 == 0) goto L3d
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r2 = r5.LLILLJJLI
            if (r2 == 0) goto L33
            java.lang.Object r1 = r2.get()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
        L33:
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility r1 = X.C1345760l7m.LJ(r1, r4)
            if (r1 == 0) goto L3d
            int r3 = r1.PD(r6)
        L3d:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.<init>(r1, r0)
            return r2
        L4b:
            r0 = r1
            goto L17
        L4d:
            r0 = -1
            goto L25
        L4f:
            X.0Q7z r2 = r5.LL
            if (r2 == 0) goto L6c
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r0 = r5.LLILLJJLI
            if (r0 == 0) goto L5d
            java.lang.Object r1 = r0.get()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
        L5d:
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility r1 = X.C1345760l7m.LJ(r1, r2)
            if (r1 == 0) goto L6c
            java.lang.String r0 = r6.getCid()
            int r0 = r1.fg2(r0)
            goto L3d
        L6c:
            r0 = -1
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentExposureVM.vQ2(com.ss.android.ugc.aweme.comment.model.Comment):kotlin.Pair");
    }

    public final boolean xQ2(Comment comment) {
        Fragment fragment;
        WeakReference<Fragment> weakReference = this.LLILLJJLI;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        return C1345700l7g.LJIIL(comment, fragment, this.LL);
    }

    public final void yQ2(Comment comment) {
        if (comment == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("common onAttach  curComment?.cid = ");
        sbLIZ.append(comment.getCid());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ.LIZIZ(comment);
    }

    public final void zQ2(Comment comment) {
        C722710SWn c722710SWn;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachFocusArea curComment?.cid = ");
        sbLIZ.append(comment.getCid());
        C2188811AlT.LIZIZ(sbLIZ);
        C722710SWn c722710SWn2 = this.LLILZLL;
        if (c722710SWn2 != null) {
            c722710SWn2.LIZIZ(comment);
        }
        if (!DQ2() && (c722710SWn = this.LLILZIL) != null) {
            c722710SWn.LIZIZ.remove(comment);
        }
    }
}

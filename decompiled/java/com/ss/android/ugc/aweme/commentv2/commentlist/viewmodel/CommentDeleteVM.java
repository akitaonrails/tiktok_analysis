package com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel;

import X.AnonymousClass0036;
import X.C093Y;
import X.C09AY;
import X.C09YA;
import X.C0XF1;
import X.C1220000hqw;
import X.C123100dR;
import X.C1340400kz8;
import X.C1342260l28;
import X.C1342770l2x;
import X.C1343500l48;
import X.C1343700l4S;
import X.C1345700l7g;
import X.C1345760l7m;
import X.C1389890mGx;
import X.C13LE;
import X.C1479605qk;
import X.C14EU;
import X.C20600815jK;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C888460YtI;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS16S0401000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentDeleteVM extends AssemViewModel<AnonymousClass0036> implements ICommentDeleteAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public InterfaceC665370Q7z LL;
    public WeakReference<Fragment> LLILLJJLI;
    public final C09YA LLILLL = new C09YA(this, AFwS209S0000000_21.get$arr$(219));
    public final C736950SvV LLILZ;
    public final C1342260l28 LLILZIL;
    public C09AY LLILZLL;
    public boolean LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentDeleteVM.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new AnonymousClass0036(0);
    }

    public final CommentContextSource wQ2() {
        C1342260l28 c1342260l28 = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return c1342260l28.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20600815jK<X.InterfaceC1891350zJl> xQ2() {
        /*
            r3 = this;
            X.0Q7z r1 = r3.LL
            r2 = 0
            if (r1 == 0) goto L4e
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r0 = r3.LLILLJJLI
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
        Lf:
            com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility r0 = X.C1345760l7m.LIZLLL(r0, r1)
            if (r0 == 0) goto L4e
            java.lang.String r1 = r0.getAid()
        L19:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r3.wQ2()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt.aweme(r0)
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.getAid()
        L29:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L47
            X.0Q7z r1 = r3.LL
            if (r1 == 0) goto L47
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r0 = r3.LLILLJJLI
            if (r0 == 0) goto L48
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
        L3d:
            com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility r0 = X.C1345760l7m.LIZLLL(r0, r1)
            if (r0 == 0) goto L47
            X.15jK r2 = r0.ad0()
        L47:
            return r2
        L48:
            r0 = r2
            goto L3d
        L4a:
            r0 = r2
            goto L29
        L4c:
            r0 = r2
            goto Lf
        L4e:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM.xQ2():X.15jK");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentDeleteVM() {
        this.LLILZ = new C736950SvV(C13LE.LIZ(CommentSyncSharedVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS259S0000000_21.get$arr$(131), null, null, null);
        this.LLILZIL = new C1342260l28(new AwS565S0100000_21(this, 500));
        this.LLILZLL = AFwS209S0000000_21.get$arr$(218);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.LimitRootAbility
    public final boolean cD0() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility
    public final void Fx0(Set<String> set) {
        runOnUIThread(new AwS387S0200000_21(this, (CommentDeleteVM) set, (Set<String>) 21));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility
    public final void Y21(List<Comment> list) {
        yQ2(this, list, null, null, false, 30);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(C1479605qk c1479605qk) {
        Fragment fragment;
        Fragment fragment2;
        String str = c1479605qk.LIZ;
        if (C123100dR.LIZ(str)) {
            Fx0(C093Y.LJ(str));
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z != null) {
                WeakReference<Fragment> weakReference = this.LLILLJJLI;
                if (weakReference != null) {
                    fragment2 = weakReference.get();
                } else {
                    fragment2 = null;
                }
                ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(fragment2, interfaceC665370Q7z);
                if (iCommentListVMAbilityLJ != null) {
                    iCommentListVMAbilityLJ.qZ0(str);
                }
            }
            WeakReference<Fragment> weakReference2 = this.LLILLJJLI;
            if (weakReference2 != null && (fragment = weakReference2.get()) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                c1389890mGx.LJIIIZ(2131826446);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDeleteCommentEvent(C1343500l48 c1343500l48) {
        Fragment fragment;
        C1340400kz8 c1340400kz8;
        WeakReference<Fragment> weakReference = this.LLILLJJLI;
        if (weakReference != null && (fragment = weakReference.get()) != null && (c1340400kz8 = c1343500l48.LIZ) != null) {
            uk1(c1343500l48.LIZIZ, fragment, null, wQ2(), c1340400kz8);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserBlockedEvent(C888460YtI c888460YtI) {
        String uid;
        User user = c888460YtI.LIZ;
        Fragment fragment = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (C123100dR.LIZ(uid)) {
            Fx0(C093Y.LJ(uid));
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z != null) {
                WeakReference<Fragment> weakReference = this.LLILLJJLI;
                if (weakReference != null) {
                    fragment = weakReference.get();
                }
                ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(fragment, interfaceC665370Q7z);
                if (iCommentListVMAbilityLJ != null) {
                    iCommentListVMAbilityLJ.qZ0(uid);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility
    public final void wh0(Set<String> set) {
        runOnUIThread(new AwS387S0200000_21(this, (CommentDeleteVM) set, (Set<String>) 20));
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility
    public final void uk1(int i, Fragment fragment, C20600815jK c20600815jK, CommentContextSource commentContextSource, C1340400kz8 c1340400kz8) {
        CommentContextSource commentContextSourceWQ2 = commentContextSource;
        if (!C0XF1.LIZLLL(fragment.requireContext())) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
        } else {
            if (C1345700l7g.LJIIJJI(c1340400kz8.LIZ()) && C1343700l4S.LIZ()) {
                if (commentContextSourceWQ2 == null) {
                    commentContextSourceWQ2 = wQ2();
                }
                runOnUIThread(new AwS16S0401000_21(i, fragment, commentContextSourceWQ2, c1340400kz8, this, 1));
                return;
            }
            vQ2(i, fragment, c20600815jK, commentContextSourceWQ2, c1340400kz8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(int r31, androidx.fragment.app.Fragment r32, X.C20600815jK r33, com.ss.android.ugc.aweme.comment.model.CommentContextSource r34, X.C1340400kz8 r35) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM.vQ2(int, androidx.fragment.app.Fragment, X.15jK, com.ss.android.ugc.aweme.comment.model.CommentContextSource, X.0kz8):void");
    }

    public static void yQ2(CommentDeleteVM commentDeleteVM, List list, C20600815jK c20600815jK, CommentContextSource commentContextSource, boolean z, int i) {
        boolean z2;
        boolean z3 = z;
        C20600815jK c20600815jK2 = c20600815jK;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        CommentContextSource commentContextSource2 = null;
        if ((i & 4) != 0) {
            c20600815jK2 = null;
        }
        if ((i & 8) == 0) {
            commentContextSource2 = commentContextSource;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        commentDeleteVM.getClass();
        commentDeleteVM.runOnUIThread(new C1342770l2x(list, c20600815jK2, commentDeleteVM, commentContextSource2, z3, z2));
    }
}

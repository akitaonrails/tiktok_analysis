package com.ss.android.ugc.aweme.commentv2.title;

import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C724240Sb0;
import X.InterfaceC665370Q7z;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentPanelFakeInput;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class TitleCommentPanelFakeInput extends CommentPanelFakeInput {
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentPanelFakeInput
    public final void kq() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ICommentFakeInputAbility.class, null, null);
            this.LLLJL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentPanelFakeInput
    public final boolean tq() {
        ICommentPageContainer iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentPageContainer.class, null);
        return iCommentPageContainer != null && iCommentPageContainer.l91();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.ss.android.ugc.aweme.commentv2.title.TitleCommentPanelFakeInput$onViewCreated$1] */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentPanelFakeInput, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput, com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Throwable {
        super.onViewCreated(view);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        final ?? r3 = new ICommentPageVisibilityProtocol() { // from class: com.ss.android.ugc.aweme.commentv2.title.TitleCommentPanelFakeInput.onViewCreated.1
            @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
            public final void LJLLLLLL() {
            }

            @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
            public final void LLFF() {
            }

            @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
            public final void onPagePause() {
            }

            @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
            public final void LJJJJZI() {
                TitleCommentPanelFakeInput.this.Le1();
            }

            @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
            public final void P61() {
                TitleCommentPanelFakeInput.this.V92();
            }
        };
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(r3));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.commentv2.title.TitleCommentPanelFakeInput$onViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, ICommentPageVisibilityProtocol.class, r3);
                    }
                }
            });
        }
    }
}

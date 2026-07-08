package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C1346950l9h;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseContentComponentTrigger extends UIContentAssem implements IComponentTrigger {
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IComponentTrigger
    public final void IE0(CommentContextSource commentContextSource, C1346950l9h c1346950l9h) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IComponentTrigger.class, C1697810uHb.LJIILJJIL(this));
    }
}

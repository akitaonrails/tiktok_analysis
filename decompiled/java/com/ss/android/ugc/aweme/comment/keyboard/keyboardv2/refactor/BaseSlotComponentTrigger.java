package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C1346950l9h;
import X.C13IQ;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C723850SaN;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseSlotComponentTrigger extends UIContentAssem implements IComponentTrigger {
    public boolean LLIZLLLIL;

    public boolean Go(CommentContextSource commentContextSource, C1346950l9h c1346950l9h) {
        return false;
    }

    public abstract int Ho();

    public abstract C13IQ<? extends UISlotAssem> getType();

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IComponentTrigger.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IComponentTrigger
    public final void IE0(CommentContextSource commentContextSource, C1346950l9h c1346950l9h) {
        if (!Go(commentContextSource, c1346950l9h) || this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        C723850SaN.LIZLLL(this, new AwS598S0100000_19(this, 106));
    }
}

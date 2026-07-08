package com.ss.android.ugc.aweme.search.detail.comment.ui;

import X.C0RQ4;
import X.C1558520qew;
import X.C339190DRl;
import X.C418440Gaw;
import X.C420860Geq;
import X.C814420VxA;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchVideoDetailDescriptionCommentAssem extends BaseSearchVideoDetailCommentAssem<SearchVideoDetailDescriptionCommentAssem> {
    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final boolean Ip() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f4b;
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final void Jp() {
        InteractInfoDescAbility interactInfoDescAbility = (InteractInfoDescAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoDescAbility.class, null);
        if (interactInfoDescAbility != null) {
            interactInfoDescAbility.gY1(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final TuxTextView Tp(View view) {
        return (TuxTextView) view.findViewById(R.id.u88);
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final void Gp(C420860Geq c420860Geq, int i) {
        ObjectAnimator objectAnimatorQI;
        View contentView = getContentView();
        Integer numValueOf = Integer.valueOf(i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        View viewLJJIJL = LJJIJL();
        Integer numValueOf2 = null;
        InteractInfoDescAbility interactInfoDescAbility = (InteractInfoDescAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoDescAbility.class, null);
        if (interactInfoDescAbility != null) {
            objectAnimatorQI = interactInfoDescAbility.qI();
        } else {
            objectAnimatorQI = null;
        }
        InteractInfoDescAbility interactInfoDescAbility2 = (InteractInfoDescAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoDescAbility.class, null);
        if (interactInfoDescAbility2 != null) {
            numValueOf2 = Integer.valueOf(interactInfoDescAbility2.JD1());
        }
        C420860Geq.LIZ(c420860Geq, contentView, numValueOf, viewLJJIJL, objectAnimatorQI, numValueOf2);
    }

    @Override // com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem
    public final void Qp(C420860Geq c420860Geq, int i) {
        Integer numValueOf;
        ObjectAnimator objectAnimatorFs1 = null;
        InteractInfoDescAbility interactInfoDescAbility = (InteractInfoDescAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoDescAbility.class, null);
        if (interactInfoDescAbility != null && (numValueOf = Integer.valueOf(interactInfoDescAbility.JD1())) != null && numValueOf.intValue() > 20 && C0RQ4.LIZ() != 0) {
            View contentView = getContentView();
            Integer numValueOf2 = Integer.valueOf(i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            View viewLJJIJL = LJJIJL();
            InteractInfoDescAbility interactInfoDescAbility2 = (InteractInfoDescAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoDescAbility.class, null);
            if (interactInfoDescAbility2 != null) {
                objectAnimatorFs1 = interactInfoDescAbility2.fs1();
            }
            C420860Geq.LIZIZ(c420860Geq, contentView, numValueOf2, viewLJJIJL, objectAnimatorFs1, numValueOf);
            return;
        }
        InteractInfoDescAbility interactInfoDescAbility3 = (InteractInfoDescAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoDescAbility.class, null);
        if (interactInfoDescAbility3 != null) {
            interactInfoDescAbility3.gY1(8);
        }
        C339190DRl.LIZLLL(LJJIJL());
    }
}

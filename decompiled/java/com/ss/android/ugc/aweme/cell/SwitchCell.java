package com.ss.android.ugc.aweme.cell;

import X.C11GO;
import X.C127A;
import X.C127M;
import X.C19319810iC;
import X.C755750Tkj;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class SwitchCell extends TuxCell<C19319810iC, C127A> {
    public C755750Tkj LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C755750Tkj c755750Tkj = this.LLILLJJLI;
        if (c755750Tkj != null) {
            c755750Tkj.LIZ = null;
            AnimatorSet animatorSet = c755750Tkj.LIZIZ;
            if (animatorSet != null) {
                animatorSet.setTarget(null);
            }
            AnimatorSet animatorSet2 = c755750Tkj.LIZIZ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            c755750Tkj.LIZIZ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final C127M N5(Context context) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C127A c127a = new C127A(context);
        C19319810iC c19319810iC = (C19319810iC) getItem();
        if (c19319810iC != null) {
            onCheckedChangeListener = c19319810iC.LLJJJJJIL;
        } else {
            onCheckedChangeListener = null;
        }
        c127a.LJIILLIIL(onCheckedChangeListener);
        c127a.LJIILL(new AwS572S0100000_28(this, 976));
        return c127a;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void onBindItemView(C19319810iC c19319810iC) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        super.onBindItemView(c19319810iC);
        C11GO c11go = (C11GO) this.LL;
        if (c11go != null) {
            c11go.LJIILJJIL(c19319810iC.LLJJIJIL);
        }
        if (c19319810iC.LLL) {
            View view = this.itemView;
            if ((view instanceof ViewGroup) && ((ViewGroup) view).getChildCount() > 0) {
                C755750Tkj c755750Tkj = new C755750Tkj(((ViewGroup) this.itemView).getChildAt(0));
                this.LLILLJJLI = c755750Tkj;
                AnimatorSet animatorSet3 = c755750Tkj.LIZIZ;
                if ((animatorSet3 == null || !animatorSet3.isStarted()) && (animatorSet2 = c755750Tkj.LIZIZ) != null) {
                    animatorSet2.start();
                }
            } else {
                C755750Tkj c755750Tkj2 = new C755750Tkj(this.itemView);
                this.LLILLJJLI = c755750Tkj2;
                AnimatorSet animatorSet4 = c755750Tkj2.LIZIZ;
                if ((animatorSet4 == null || !animatorSet4.isStarted()) && (animatorSet = c755750Tkj2.LIZIZ) != null) {
                    animatorSet.start();
                }
            }
            c19319810iC.LLL = false;
        }
    }
}

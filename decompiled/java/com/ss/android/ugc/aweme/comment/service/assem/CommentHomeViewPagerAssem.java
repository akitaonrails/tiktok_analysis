package com.ss.android.ugc.aweme.comment.service.assem;

import X.C1150504el;
import X.C14EU;
import X.C1591390rVx;
import X.C739870T0n;
import X.C786410Ut5;
import Y.ARunnableS124S0100000_24;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class CommentHomeViewPagerAssem extends BaseMainContainerUIAssem {
    public C1591390rVx LLJI;

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"CommentHomeViewPagerAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onCommentListPageDialogEvent(C739870T0n c739870T0n) {
        Integer numValueOf;
        if (this.LLJI == null) {
            return;
        }
        C1591390rVx c1591390rVx = null;
        if (c739870T0n != null && (numValueOf = Integer.valueOf(c739870T0n.LIZ)) != null) {
            if (numValueOf.intValue() == 1) {
                C1591390rVx c1591390rVx2 = this.LLJI;
                if (c1591390rVx2 != null) {
                    c1591390rVx = c1591390rVx2;
                }
                c1591390rVx.setImportantForAccessibility(4);
                return;
            }
            if (numValueOf.intValue() != 0) {
                return;
            }
            C1591390rVx c1591390rVx3 = this.LLJI;
            if (c1591390rVx3 != null) {
                c1591390rVx = c1591390rVx3;
            }
            c1591390rVx.setImportantForAccessibility(1);
            HandlerHook.viewPostDelay(c1591390rVx, new ARunnableS124S0100000_24(c1591390rVx, 16), 750L);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = (C1591390rVx) view;
    }
}

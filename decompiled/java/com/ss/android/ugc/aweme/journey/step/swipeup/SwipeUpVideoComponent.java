package com.ss.android.ugc.aweme.journey.step.swipeup;

import X.C10H5;
import X.C10SV;
import X.C1489670ort;
import X.C1848530yCh;
import X.C197039127h;
import X.C2187451AjH;
import X.C2344009Gk;
import X.C616540OGe;
import X.C786410Ut5;
import X.C823050WQl;
import Y.ARunnableS119S0100000_19;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes29.dex */
public final class SwipeUpVideoComponent extends BaseSwipeUpComponent {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjHELIOSs2OGs/PiYjLTA8ZxwkITUpHD8FISEpJgw8JTUjJyo9PA==";
    public ConstraintLayout LLJJIJI;
    public C197039127h LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public CardView LLJJJIL;
    public View LLJJJJ;
    public ObjectAnimator LLJJJJJIL;
    public final int LLJJJJLIIL = R.drawable.fj6;

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final String aS() {
        return "picture_slide_up";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final int getLayoutId() {
        return R.layout.czc;
    }

    public final ConstraintLayout kS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tqy) : null;
            this.LLJJIJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxTextView mS() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.title) : null;
            this.LLJJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final CardView nS() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.video_container) : null;
            this.LLJJJIL = (CardView) viewFindViewById;
        }
        return (CardView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ObjectAnimator objectAnimator = this.LLJJJJJIL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.LLJJJJJIL.cancel();
        }
        super.onDestroyView();
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (!this.LLJJI) {
            bS("background");
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final View ZR() {
        return kS();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final void cS() {
        if (C1489670ort.LIZ()) {
            C823050WQl.LIZLLL().execute(new ARunnableS119S0100000_19(this, 77));
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SwipeUpVideoComponent.class.getName());
        }
        super.onResume();
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vzt) : null;
            this.LLJJIJIIJIL = (C197039127h) viewFindViewById;
        }
        C1848530yCh.LIZ(viewFindViewById, "btn_nuj_next", AFwS248S0000000_14.get$arr$(305));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01e3  */
    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gS(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent.gS(android.view.View):void");
    }

    public final void iS(C197039127h c197039127h, String str) {
        if (isViewValid() && c197039127h.getVisibility() != 0) {
            C786410Ut5.S4(0.0f, c197039127h);
            C786410Ut5.LLIL(c197039127h, 0);
            if (str.length() > 0) {
                C10H5 c10h5 = C10H5.START_WATCHING_BUTTON_SHOW;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("exit_method", str);
                c2344009Gk.LJIIIIZZ("user_type", (String) this.LLJJIII.getValue());
                c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJIJIL, "duration");
                C10SV.LIZIZ(c10h5, c2344009Gk.LIZ);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c197039127h, "alpha", 0.0f, 1.0f);
            this.LLJJJJJIL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            C786410Ut5.Pd(this.LLJJJJJIL);
        }
    }
}

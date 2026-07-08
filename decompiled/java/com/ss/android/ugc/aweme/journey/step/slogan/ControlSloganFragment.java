package com.ss.android.ugc.aweme.journey.step.slogan;

import X.C10NW;
import X.C12ES;
import X.C1749280vcc;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C616540OGe;
import X.C786410Ut5;
import Y.ALAdapterS22S0200000_28;
import Y.ALAdapterS3S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.step.slogan.ControlSloganFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class ControlSloganFragment extends SloganFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiHELIOSOjs2OGs/JSA0KStiCiA9PDcjJRw/JyItJwkhKSIhLCEn";
    public ImageView LLJILLL;
    public TuxTextView LLJJ;
    public C1749280vcc LLJJI;
    public ImageView LLJJIII;
    public TuxTextView LLJJIJI;
    public C1749280vcc LLJJIJIIJIL;
    public final String LLJJIJIL = "online";

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment
    public final void VR() {
        C1749280vcc c1749280vcc = this.LLJJIJIIJIL;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C1749280vcc c1749280vcc2 = this.LLJJIJIIJIL;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1749280vcc c1749280vcc = this.LLJJIJIIJIL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        super.onDestroyView();
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
    }

    public ControlSloganFragment() {
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJII : null);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(ControlSloganFragment.class.getName());
        }
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJI : null);
        super.onResume();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ2 != null ? c1912940zsaLIZ2.LJI : null);
        C1912940zsa c1912940zsaLIZ3 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ3 != null ? c1912940zsaLIZ3.LJII : null);
        C1912930zsZ.LIZLLL(c10nw);
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final String RR() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment
    public final View WR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.czs, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.slogan.SloganFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        C1912950zsb c1912950zsb;
        String string;
        String string2;
        final ImageView imageView;
        long j;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_SLOGAN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJFF;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.vkn);
            } else {
                viewFindViewById = null;
            }
            this.LLJILLL = (ImageView) viewFindViewById;
        }
        this.LLJJIII = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.LLJJ;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.vkq);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJJ = (TuxTextView) viewFindViewById2;
        }
        this.LLJJIJI = (TuxTextView) viewFindViewById2;
        View viewFindViewById3 = this.LLJJI;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.vkr);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJI = (C1749280vcc) viewFindViewById3;
        }
        this.LLJJIJIIJIL = (C1749280vcc) viewFindViewById3;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("useNewAppUpdateSloganUI")) {
            string = getString(2131838046);
            string2 = getString(2131838047);
        } else {
            C2222691Bz1.LIZ.getClass();
            if (C2222691Bz1.LJIIL()) {
                string = getString(2131838038);
            } else {
                string = getString(2131838036);
            }
            C2222691Bz1.LIZ.getClass();
            if (C2222691Bz1.LJIIL()) {
                string2 = getString(2131838039);
            } else {
                string2 = getString(2131838037);
            }
        }
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(42.0f);
        }
        TuxTextView tuxTextView2 = this.LLJJIJI;
        if (tuxTextView2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append("\n");
            sbLIZ.append(string2);
            tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        final TuxTextView tuxTextView3 = this.LLJJIJI;
        if (tuxTextView3 != null && (imageView = this.LLJJIII) != null) {
            final float fLIZJ = C12ES.LIZJ(60.0f, view.getContext());
            final float fLIZJ2 = C12ES.LIZJ(46.0f, view.getContext());
            Bundle arguments2 = getArguments();
            if (arguments2 != null && arguments2.getInt("extra_optimize_option", 0) > 0) {
                j = 0;
            } else {
                j = 1000;
            }
            HandlerHook.viewPostDelay(imageView, new Runnable() { // from class: X.0Gcg
                public final void LIZ() {
                    View view5 = view;
                    TuxTextView tuxTextView4 = tuxTextView3;
                    float f = fLIZJ;
                    ImageView imageView2 = imageView;
                    float f2 = fLIZJ2;
                    ControlSloganFragment controlSloganFragment = this;
                    int height = view5.getHeight();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView4, "translationY", f, (-height) + f + tuxTextView4.getHeight());
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, "translationY", height - f2, -f2);
                    objectAnimatorOfFloat.setDuration(420L);
                    objectAnimatorOfFloat2.setDuration(420L);
                    objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(tuxTextView4, 31));
                    objectAnimatorOfFloat2.addListener(new ALAdapterS22S0200000_28(imageView2, controlSloganFragment, 0));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                    animatorSet.start();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ControlSloganFragment@d6e7.maybeInitLogoViewAnimation$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ControlSloganFragment@d6e7.maybeInitLogoViewAnimation$1");
                }
            }, j);
        }
        SloganFragment.aS();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJFF;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }
}

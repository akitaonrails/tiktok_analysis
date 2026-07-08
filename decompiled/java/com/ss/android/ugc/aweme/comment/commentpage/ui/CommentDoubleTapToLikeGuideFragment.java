package com.ss.android.ugc.aweme.comment.commentpage.ui;

import X.C098200Yq;
import X.C1295960jpS;
import X.C1345250l6x;
import X.C1356810lPb;
import X.C14EU;
import X.C1619980sG4;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import Y.AAListenerS332S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.bullet.ui.common.view.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentDoubleTapToLikeGuideFragment extends AbsFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiKiA+JSAiPT8yHELIOSLyBiPCZ9CyohJCo9PAEjPC0/LREtORs8BCwnLAgmISEpDz0yLygpJzs=";
    public C1295960jpS LLILLJJLI;
    public TuxTextView LLILLL;
    public boolean LLILZ;
    public Aweme LLILZIL;

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL != null) {
            eventBusLIZLLL.LJJI(this);
        }
        C1295960jpS c1295960jpS = this.LLILLJJLI;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1295960jpS c1295960jpS = this.LLILLJJLI;
        if (c1295960jpS != null) {
            c1295960jpS.pauseAnimation();
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLILZ) {
            C1295960jpS c1295960jpS = this.LLILLJJLI;
            if (c1295960jpS != null) {
                c1295960jpS.resumeAnimation();
                return;
            }
            return;
        }
        C1295960jpS c1295960jpS2 = this.LLILLJJLI;
        if (c1295960jpS2 != null) {
            c1295960jpS2.playAnimation();
        }
        this.LLILZ = true;
    }

    public final void MR(String str) {
        if (isAdded()) {
            try {
                C1345250l6x c1345250l6x = C1345250l6x.LIZ;
                C19EG c19egRequireActivity = requireActivity();
                Aweme aweme = this.LLILZIL;
                c1345250l6x.getClass();
                C1345250l6x.LIZIZ(c19egRequireActivity, str, aweme);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            MR("disappear");
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        Fade fade = new Fade(1);
        fade.setInterpolator(C1619980sG4.LJI());
        fade.setDuration(200L);
        setEnterTransition(fade);
        Fade fade2 = new Fade(2);
        fade2.setInterpolator(C1619980sG4.LJI());
        fade2.setDuration(200L);
        setExitTransition(fade2);
    }

    @C14EU
    public final void onEvent(C1356810lPb c1356810lPb) {
        MR("disappear");
    }

    @Override // com.bytedance.ies.bullet.ui.common.view.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Integer num2;
        TuxTextView tuxTextView;
        C1295960jpS c1295960jpS;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float fLIZIZ;
        float fLIZIZ2;
        Integer num3;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        View viewFindViewById = view.findViewById(R.id.uxs);
        ViewGroup.LayoutParams layoutParams3 = null;
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("comment_panel_height");
            if (serializable instanceof Integer) {
                num2 = (Integer) serializable;
            } else {
                num2 = null;
            }
            Serializable serializable2 = arguments.getSerializable("comment_panel_width");
            if (serializable2 instanceof Integer) {
                num3 = (Integer) serializable2;
            } else {
                num3 = null;
            }
            Serializable serializable3 = arguments.getSerializable("comment_panel_radius");
            if (serializable3 instanceof Integer) {
                num = (Integer) serializable3;
            } else {
                num = null;
            }
            if (num2 != null && num2.intValue() > 0 && viewFindViewById != null && (layoutParams2 = viewFindViewById.getLayoutParams()) != null) {
                layoutParams2.height = num2.intValue();
            }
            if (num3 != null && num3.intValue() > 0 && viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                layoutParams.width = num3.intValue();
            }
        } else {
            num = null;
            num2 = null;
        }
        Context context = view.getContext();
        if (context != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1_);
            if (num != null) {
                fLIZIZ = num.intValue();
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(12);
            }
            c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
            if (num != null) {
                fLIZIZ2 = num.intValue();
            } else {
                fLIZIZ2 = C418440Gaw.LIZIZ(12);
            }
            c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ2);
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
        }
        C1295960jpS c1295960jpS2 = (C1295960jpS) view.findViewById(R.id.bgo);
        this.LLILLJJLI = c1295960jpS2;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setRepeatCount(2);
        }
        C1295960jpS c1295960jpS3 = this.LLILLJJLI;
        if (c1295960jpS3 != null) {
            c1295960jpS3.setRepeatMode(1);
        }
        C1295960jpS c1295960jpS4 = this.LLILLJJLI;
        if (c1295960jpS4 != null) {
            c1295960jpS4.addAnimatorListener(new AAListenerS332S0100000_21(this, 35));
        }
        if (num2 != null && num2.intValue() > 0) {
            C1295960jpS c1295960jpS5 = this.LLILLJJLI;
            if (c1295960jpS5 != null) {
                layoutParams3 = c1295960jpS5.getLayoutParams();
            }
            if ((layoutParams3 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                if (num2.intValue() > ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210))) * 3.5d) {
                    marginLayoutParams.topMargin = (int) (((double) num2.intValue()) * 0.3d);
                } else {
                    marginLayoutParams.topMargin = (int) (((double) num2.intValue()) * 0.15d);
                }
            }
        }
        if (view.getContext() != null && (c1295960jpS = this.LLILLJJLI) != null) {
            c1295960jpS.setAnimation(R.raw.tux_lottie_tux_gestures_only_tt_double_tap);
        }
        this.LLILLL = (TuxTextView) view.findViewById(R.id.zot);
        Context context2 = view.getContext();
        if (context2 != null && (tuxTextView = this.LLILLL) != null) {
            tuxTextView.setText(context2.getString(2131832367));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a27, viewGroup, false);
        if (viewTd != null) {
            viewTd.setOnTouchListener(new ATListenerS454S0100000_21(this, 4));
        }
        if (viewTd != null) {
            viewTd.setClickable(true);
        }
        if (viewTd != null) {
            viewTd.setFocusableInTouchMode(true);
        }
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}

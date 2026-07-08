package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment;

import X.C0HE8;
import X.C1308910kAL;
import X.C1766560w4U;
import X.C19EG;
import X.C19EH;
import X.C497820Jfg;
import X.C510650K0x;
import X.C515640KKc;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class SubSpaceBaseFragment extends PgcBaseFragment {
    public static final Object LLILZLL = new Object();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiHELIOSOSohIzZiOjoxOzUtKip9KyohJCA9ZiM+KCg+LSs4ZxwmKhY8KCw2CiQ/LAkhKSIhLCEn";
    public ImageView LLILLJJLI;
    public String LLILLL = "";
    public int LLILZ;
    public FragmentManager LLILZIL;

    public void NR(ImageView imageView) {
    }

    public String OR() {
        return "";
    }

    public void clearFromXmlViewCache() {
        this.LLILLJJLI = null;
    }

    public final void PR() {
        C19EG activity;
        try {
            FragmentManager supportFragmentManager = this.LLILZIL;
            if (supportFragmentManager == null && ((activity = getActivity()) == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
                return;
            }
            if (supportFragmentManager.LJJLIIIJL().size() > 1) {
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJJ(R.anim.mi, R.anim.mh);
                c19ehLJIIJ.LJIIZILJ(this);
                c19ehLJIIJ.LJIIJ();
                return;
            }
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    public void MR(View view) {
        ViewParent parent;
        int i;
        View viewFindViewById = view.findViewById(R.id.bn2);
        View viewFindViewById2 = null;
        if (viewFindViewById != null) {
            parent = viewFindViewById.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof View) {
            viewFindViewById2 = (View) parent;
        }
        if (viewFindViewById2 == null && (viewFindViewById2 = view.findViewById(R.id.wg0)) == null) {
            return;
        }
        Object tag = viewFindViewById2.getTag(R.id.wg0);
        Object obj = LLILZLL;
        if (Intrinsics.LJFF(tag, obj)) {
            return;
        }
        int iLIZJ = C497820Jfg.LIZJ(view.getContext());
        if (iLIZJ <= 0) {
            viewFindViewById2.setTag(R.id.wg0, obj);
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
        if (layoutParams != null && (i = layoutParams.height) > 0) {
            layoutParams.height = i + iLIZJ;
            C786410Ut5.W5(viewFindViewById2, layoutParams);
        }
        viewFindViewById2.setPadding(viewFindViewById2.getPaddingLeft(), viewFindViewById2.getPaddingTop() + iLIZJ, viewFindViewById2.getPaddingRight(), viewFindViewById2.getPaddingBottom());
        viewFindViewById2.setTag(R.id.wg0, obj);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C0HE8.LIZ(layoutInflaterOnGetLayoutInflater.getContext()));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.f8f, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
            tuxImmersionBarLIZLLL.LJIIIZ(iIntValue);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
        View viewFindViewById = this.LLILLJJLI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bn2);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (ImageView) viewFindViewById;
        }
        C515640KKc.LIZ(10, viewFindViewById);
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.bn2);
            }
            this.LLILLJJLI = (ImageView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        ImageView imageView = (ImageView) view3;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS142S0100000_7(this, 313));
        }
        NR((ImageView) view.findViewById(R.id.cs1));
        TextView textView = (TextView) view.findViewById(R.id.title);
        String strOR = OR();
        if (C510650K0x.LIZ(strOR)) {
            textView.setText(strOR);
        }
        MR(view);
    }
}

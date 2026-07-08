package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment;

import X.C0JTI;
import X.C1308910kAL;
import X.C1533950q1J;
import X.C1766560w4U;
import X.C19EG;
import X.C19EH;
import X.C635860Owq;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class SubSpaceBaseFragment extends BaseFragment implements C0JTI {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlHELIOSJyogO2s8LD04O2s/PC0gOCQvLGEwJyghJiF9LjctLiI2JjFiGjoxGzUtKioRKTYpDz0yLygpJzs=";
    public LiveIconView LL;
    public String LLILLJJLI = "";
    public int LLILLL;
    public boolean LLILZ;
    public FragmentManager LLILZIL;

    public void NR(LiveIconView liveIconView) {
    }

    public String OR() {
        return "";
    }

    public void clearFromXmlViewCache() {
        this.LL = null;
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
                c19ehLJIIJ.LJIJJ(R.anim.hb, R.anim.hg);
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

    @Override // X.C0JTI
    public final boolean onBackPressed() {
        PR();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c61, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(true);
            tuxImmersionBarLIZLLL.LJIIIZ(iIntValue);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
        C635860Owq c635860Owq = C635860Owq.LIZ;
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bn2);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LiveIconView) viewFindViewById;
        }
        c635860Owq.LIZJ(10, viewFindViewById);
        View view3 = this.LL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.bn2);
            }
            this.LL = (LiveIconView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        LiveIconView liveIconView = (LiveIconView) view3;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0Jc3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    this.LL.PR();
                }
            });
        }
        NR((LiveIconView) view.findViewById(R.id.cs1));
        TextView textView = (TextView) view.findViewById(R.id.title);
        String strOR = OR();
        if (C1533950q1J.LJ(strOR)) {
            textView.setText(strOR);
        }
    }
}

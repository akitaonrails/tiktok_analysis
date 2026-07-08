package com.ss.android.ugc.aweme.portrait.tab;

import X.AbstractC214814194y;
import X.C098200Yq;
import X.C0MGE;
import X.C1308910kAL;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EH;
import X.C20622515mp;
import X.C2188811AlT;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitTabRootScene extends AbstractC214814194y implements C0MGE {
    public int LLJJIJIL = -1;

    public AIPortraitTabRootScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(58));
    }

    public final String LLLLJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aiPortraitTabFragmentTag:");
        sbLIZ.append(this.LLJJIJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        Unit unit;
        try {
            FragmentManager fragmentManagerLJIILLIIL = C20622515mp.LJIILLIIL(this);
            Fragment fragmentLJJJJZI = fragmentManagerLJIILLIIL.LJJJJZI(LLLLJI());
            if (fragmentLJJJJZI != null) {
                C19EH c19ehLJIIJ = fragmentManagerLJIILLIIL.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIL();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.onDestroyView();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(requireFragmentActivity());
        tuxImmersionBarLJ.LJIIIIZZ(R.attr.e1);
        tuxImmersionBarLJ.LJ(R.attr.e1);
        tuxImmersionBarLJ.LIZLLL();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Object c098200Yq;
        super.onActivityCreated(bundle);
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(requireFragmentActivity());
        tuxImmersionBarLJ.LJIIIIZZ(R.attr.e1);
        tuxImmersionBarLJ.LJ(R.attr.e1);
        tuxImmersionBarLJ.LIZLLL();
        try {
            c098200Yq = C20622515mp.LJIILLIIL(this);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        FragmentManager fragmentManager = (FragmentManager) c098200Yq;
        if (fragmentManager != null && this.LLJJIJIL != -1) {
            Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(LLLLJI());
            if (fragmentLJJJJZI != null && fragmentLJJJJZI.isVisible()) {
                return;
            }
            AIPortraitTabFragment aIPortraitTabFragment = new AIPortraitTabFragment();
            aIPortraitTabFragment.setArguments(this.mArguments);
            aIPortraitTabFragment.LLILLJJLI = new AwS552S0100000_8(this, 1059);
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(this.LLJJIJIL, aIPortraitTabFragment, LLLLJI());
            c19ehLJIIJ.LJIIL();
        }
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        int iGenerateViewId;
        super.onCreate(bundle);
        if (bundle == null || (iGenerateViewId = bundle.getInt("ai_portrait_tab_container_view_id", -1)) == -1) {
            iGenerateViewId = View.generateViewId();
        }
        this.LLJJIJIL = iGenerateViewId;
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ai_portrait_tab_container_view_id", this.LLJJIJIL);
    }

    @Override // X.AbstractC214814194y
    public final boolean processNewArguments(Bundle bundle) {
        Object c098200Yq;
        AIPortraitTabFragment aIPortraitTabFragment;
        if (bundle != null && bundle.getBoolean("from_cameo_created_continue")) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("from_cameo_created_continue", true);
            this.mArguments = bundle2;
        }
        try {
            c098200Yq = C20622515mp.LJIILLIIL(this);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        FragmentManager fragmentManager = (FragmentManager) c098200Yq;
        if (fragmentManager == null) {
            return true;
        }
        Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(LLLLJI());
        if ((fragmentLJJJJZI instanceof AIPortraitTabFragment) && (aIPortraitTabFragment = (AIPortraitTabFragment) fragmentLJJJJZI) != null && bundle != null && bundle.getBoolean("from_cameo_created_continue")) {
            aIPortraitTabFragment.OR();
        }
        return true;
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        frameLayout.setId(this.LLJJIJIL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, requireSceneContext());
        if (numLIZJ != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }
}

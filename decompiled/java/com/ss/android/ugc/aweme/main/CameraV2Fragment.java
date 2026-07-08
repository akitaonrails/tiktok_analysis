package com.ss.android.ugc.aweme.main;

import X.C01GW;
import X.C098200Yq;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.C844470XAv;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.external.ui.ICameraFragment;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: loaded from: classes22.dex */
public final class CameraV2Fragment extends CommonPageFragment implements ICameraFragmentAbility, ICameraFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZigtICF9CyQhLD0yHncKOy40JSAiPQ==";
    public View LL;
    public FrameLayout LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(296));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(294));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(295));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 215));

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final boolean LLZLL() {
        return false;
    }

    public CameraV2Fragment() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("shoot_way", "story", bundle);
        C786410Ut5.LJJJI("shoot_entrance", "story", bundle);
        C786410Ut5.LJJJI("shoot_enter_from", "homepage_hot", bundle);
        C786410Ut5.LJJJI("shoot_enter_method", "swipe_right", bundle);
        C786410Ut5.LJJJI("enter_from", "homepage_hot", bundle);
        C786410Ut5.LJJJI("enter_method", "swipe_right", bundle);
        ShootExtraData shootExtraData = new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
        shootExtraData.setShootEnterFrom("homepage_hot");
        shootExtraData.setShootEnterMethod("swipe_right");
        C786410Ut5.LJJIJL(bundle, "extra_shoot_data", shootExtraData);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), ICameraFragmentAbility.class, null);
        }
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout == null) {
            frameLayout = null;
        }
        if (!(frameLayout instanceof ViewGroup) || frameLayout == null) {
            return;
        }
        C786410Ut5.LJJJJI(frameLayout);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(CameraV2Fragment.class.getName());
        }
        super.onResume();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, ICameraFragmentAbility.class, null, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        FrameLayout frameLayout = new FrameLayout(contextLIZ);
        frameLayout.setId(R.id.jql);
        frameLayout.setBackgroundColor(Color.argb(255, 0, 0, 0));
        this.LLILLJJLI = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(contextLIZ);
        frameLayout2.setId(R.id.jqm);
        this.LL = frameLayout2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout3 = this.LLILLJJLI;
        C19GS c19gs = null;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        View view = this.LL;
        if (view == null) {
            view = null;
        }
        frameLayout3.addView(view, layoutParams);
        FrameLayout frameLayout4 = this.LLILLJJLI;
        if (frameLayout4 == null) {
            frameLayout4 = null;
        }
        if (!(frameLayout4 instanceof View)) {
            frameLayout4 = null;
        }
        if (frameLayout4 != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout4, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout4, this);
                frameLayout4.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return frameLayout4;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return frameLayout4;
    }
}

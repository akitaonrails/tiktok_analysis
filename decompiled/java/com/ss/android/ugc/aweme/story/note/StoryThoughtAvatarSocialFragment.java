package com.ss.android.ugc.aweme.story.note;

import X.C01GW;
import X.C098200Yq;
import X.C1608750rxx;
import X.C1609550rzF;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import Y.AObserverS23S0310000_24;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS110S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryThoughtAvatarSocialFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjPSHELIOSp9GzEjOzYHICo5LicnCTMtPS4hGyovIC4/DjctLiI2JjE=";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1196));
    public C1609550rzF LLIZLLLIL;

    public final StoryThoughtAvatarCreationVM SR() {
        return (StoryThoughtAvatarCreationVM) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IUserService iUserService;
        User currentUser;
        boolean z;
        super.onViewCreated(view, bundle);
        C1609550rzF c1609550rzF = this.LLIZLLLIL;
        if (c1609550rzF != null && (iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null)) != null && (currentUser = iUserService.getCurrentUser()) != null) {
            if (Intrinsics.LJFF(SR().LLL.getValue(), Boolean.TRUE) && Intrinsics.LJFF(SR().LLLFZ.getValue(), Boolean.FALSE)) {
                z = false;
            } else {
                z = true;
            }
            AvatarComponentView avatarComponentView = c1609550rzF.LLILLJJLI;
            C1608750rxx config = avatarComponentView.getConfig();
            new AwS110S0110000_24(this, z, 1).invoke(config.LIZ);
            new AwS603S0100000_24(this, 307).invoke(config.LIZJ);
            avatarComponentView.LJFF(avatarComponentView.getConfig());
            SR().LLLLILI.observe(getViewLifecycleOwner(), new AObserverS23S0310000_24(currentUser, z, c1609550rzF, this, 0));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fe9, viewGroup, false);
        AvatarComponentView avatarComponentView = (AvatarComponentView) C1616006Uk.LIZ(R.id.bh2, viewTd);
        if (avatarComponentView != null) {
            FrameLayout frameLayout = (FrameLayout) viewTd;
            this.LLIZLLLIL = new C1609550rzF(frameLayout, avatarComponentView);
            C19GS c19gs = null;
            if (!(frameLayout instanceof View)) {
                frameLayout = null;
            }
            if (frameLayout != null) {
                try {
                    ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                    ViewTreeViewModelStoreOwner.set(frameLayout, this);
                    frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                    C19EG activity = getActivity();
                    if (activity instanceof C19GS) {
                        c19gs = (C19GS) activity;
                    }
                    C1685300txQ.LIZ(c19gs);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return frameLayout;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.bh2)));
    }
}

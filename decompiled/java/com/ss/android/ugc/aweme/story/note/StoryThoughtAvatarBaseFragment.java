package com.ss.android.ugc.aweme.story.note;

import X.C01GW;
import X.C098200Yq;
import X.C0S1B;
import X.C1608750rxx;
import X.C1609800rze;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
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
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryThoughtAvatarBaseFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZisjHELIOSPSp9GzEjOzYHICo5LicnCTMtPS4hCiQ/LAkhKSIhLCEn";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1195));
    public C1609800rze LLIZLLLIL;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1609800rze c1609800rze = this.LLIZLLLIL;
        if (c1609800rze == null) {
            return;
        }
        User currentUser = null;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUser = iUserService.getCurrentUser();
        }
        AvatarComponentView avatarComponentView = c1609800rze.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = avatarComponentView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((StoryThoughtAvatarCreationVM) this.LLIZ.getValue()).LLILZ.getAvatarSizeDp())));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(((StoryThoughtAvatarCreationVM) this.LLIZ.getValue()).LLILZ.getAvatarSizeDp())));
            C786410Ut5.W5(avatarComponentView, layoutParams2);
            AvatarComponentView avatarComponentView2 = c1609800rze.LLILLJJLI;
            C1608750rxx config = avatarComponentView2.getConfig();
            new AwS603S0100000_24(this, 305).invoke(config.LIZ);
            new AwS603S0100000_24(this, 306).invoke(config.LIZJ);
            avatarComponentView2.LJFF(avatarComponentView2.getConfig());
            if (currentUser != null && currentUser.getUid() != null) {
                C0S1B.LIZ(c1609800rze.LLILLJJLI, currentUser.getUid(), currentUser, getViewLifecycleOwner(), false, null, 56);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fe5, viewGroup, false);
        AvatarComponentView avatarComponentView = (AvatarComponentView) C1616006Uk.LIZ(R.id.bh2, viewTd);
        if (avatarComponentView != null) {
            FrameLayout frameLayout = (FrameLayout) viewTd;
            this.LLIZLLLIL = new C1609800rze(frameLayout, avatarComponentView);
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

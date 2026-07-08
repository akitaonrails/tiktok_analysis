package com.ss.android.ugc.aweme.ui.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0SSX;
import X.C0SSZ;
import X.C1220000hqw;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20673215v0;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1253300iie;
import Y.AObserverS215S0100000_11;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeProfileWrapperFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeProfileWrapperFragment extends CommonPageFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZykhKSIhLCHELIOSEnZhUjOjseJyEpGT08LiwgLBghKTU8LD0VOiQrJCo9PA==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1102));
    public final C736950SvV LLILLJJLI = new C736950SvV(C13LE.LIZ(PhotoSharedViewModel.class), new AwS555S0100000_11((Fragment) this, 1461), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(641), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public AmeBaseFragment LLILLL;
    public AmeBaseFragment LLILZ;
    public boolean LLILZIL;
    public Aweme LLILZLL;
    public boolean LLIZ;

    public static boolean MR(User user) {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        String curUserId = null;
        if (iAccountService != null) {
            accountUserServiceLJIIJ = iAccountService.LJIIJ();
        } else {
            accountUserServiceLJIIJ = null;
        }
        if (user != null && user.getUid() != null) {
            String uid = user.getUid();
            if (accountUserServiceLJIIJ != null) {
                curUserId = accountUserServiceLJIIJ.getCurUserId();
            }
            return Intrinsics.LJFF(uid, curUserId);
        }
        return false;
    }

    public final void NR(boolean z, Boolean bool) {
        C0SSZ c0ssz;
        C0SSX c0ssx;
        if (z) {
            if (this.LLILZIL) {
                return;
            }
        } else if (!this.LLILZIL) {
            return;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            ComponentCallbacks componentCallbacks = this.LLILLL;
            if ((componentCallbacks instanceof C0SSX) && (c0ssx = (C0SSX) componentCallbacks) != null) {
                c0ssx.setVisible(z);
            }
        } else {
            ComponentCallbacks componentCallbacks2 = this.LLILLL;
            if ((componentCallbacks2 instanceof C0SSZ) && (c0ssz = (C0SSZ) componentCallbacks2) != null) {
                c0ssz.j7(z);
            }
        }
        this.LLILZIL = !this.LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        User user;
        C0SSX c0ssx;
        String string;
        super.onViewCreated(view, bundle);
        ((PostModePageViewModel) this.LL.getValue()).LLIZLLLIL.observe(this, new AObserverS215S0100000_11(this, 7));
        ((PostModePageViewModel) this.LL.getValue()).LLJJLIIIJLLLLLLLZ.observe(this, new AObserverS215S0100000_11(this, 8));
        this.LLILZLL = ((PhotoSharedViewModel) this.LLILLJJLI.getValue()).LLILLJJLI;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("author");
        } else {
            serializable = null;
        }
        if (serializable instanceof User) {
            user = (User) serializable;
        } else {
            user = null;
        }
        if (MR(user)) {
            AmeBaseFragment i18nMyProfileFragment = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).getI18nMyProfileFragment();
            if (i18nMyProfileFragment instanceof C0SSZ) {
                final WeakReference weakReference = new WeakReference(this);
                C0SSZ c0ssz = (C0SSZ) i18nMyProfileFragment;
                c0ssz.Zv(new InterfaceC1253300iie() { // from class: X.0SSV
                    @Override // X.InterfaceC1253300iie
                    public final void LJIJ() {
                        PostModePageViewModel postModePageViewModel;
                        PostModeProfileWrapperFragment postModeProfileWrapperFragment = weakReference.get();
                        if (postModeProfileWrapperFragment == null || (postModePageViewModel = (PostModePageViewModel) postModeProfileWrapperFragment.LL.getValue()) == null) {
                            return;
                        }
                        postModePageViewModel.LLJIJIL.setValue(Unit.LIZ);
                    }
                });
                Aweme aweme = this.LLILZLL;
                if (aweme != null) {
                    c0ssz.LJIILIIL(aweme);
                }
            }
            i18nMyProfileFragment.setArguments(getArguments());
            this.LLILZ = i18nMyProfileFragment;
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.rkh, i18nMyProfileFragment, null);
            c19ehLJIIJ.LJIIIZ();
            return;
        }
        AmeBaseFragment i18nUserProfileFragment = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).getI18nUserProfileFragment();
        boolean z = i18nUserProfileFragment instanceof C0SSX;
        if (z) {
            final WeakReference weakReference2 = new WeakReference(this);
            C0SSX c0ssx2 = (C0SSX) i18nUserProfileFragment;
            c0ssx2.mu(new InterfaceC1253300iie() { // from class: X.0SSW
                @Override // X.InterfaceC1253300iie
                public final void LJIJ() {
                    PostModePageViewModel postModePageViewModel;
                    PostModeProfileWrapperFragment postModeProfileWrapperFragment = weakReference2.get();
                    if (postModeProfileWrapperFragment == null || (postModePageViewModel = (PostModePageViewModel) postModeProfileWrapperFragment.LL.getValue()) == null) {
                        return;
                    }
                    postModePageViewModel.LLJIJIL.setValue(Unit.LIZ);
                }
            });
            Aweme aweme2 = this.LLILZLL;
            if (aweme2 != null) {
                c0ssx2.R6(aweme2.getAid());
            }
            c0ssx2.hJ();
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            C786410Ut5.LJJJI("profile_from", "post_mode", arguments2);
        }
        String str = "";
        if (arguments2 != null && (string = arguments2.getString("BUNDLE_KEY_EVENT_TYPE", "")) != null) {
            str = string;
        }
        if (((ISearchService) ServiceManager.get().getService(ISearchService.class)).LJJJLL(str) && z) {
            ((C0SSX) i18nUserProfileFragment).setEventType(str);
        }
        i18nUserProfileFragment.setArguments(getArguments());
        this.LLILLL = i18nUserProfileFragment;
        C19EH c19ehLJIIJ2 = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ2.LJIJ(R.id.rkh, i18nUserProfileFragment, null);
        c19ehLJIIJ2.LJIIIZ();
        ComponentCallbacks componentCallbacks = this.LLILLL;
        if (!(componentCallbacks instanceof C0SSX) || (c0ssx = (C0SSX) componentCallbacks) == null) {
            return;
        }
        c0ssx.WL(user, false);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.e_0, getActivity(), viewGroup, false);
        C19GS c19gs = null;
        if (!(viewLIZLLL instanceof View)) {
            viewLIZLLL = null;
        }
        if (viewLIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZLLL;
    }
}

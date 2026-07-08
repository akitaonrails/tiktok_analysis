package com.bytedance.tiktok.homepage.services;

import X.C01GW;
import X.C0QSJ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564620qom;
import X.C1564650qop;
import X.C19EG;
import X.C297720Bli;
import X.C452501pT;
import X.C687700QyG;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.scope.MainPageFragmentScope;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes25.dex */
public final class MainPageFragmentImpl implements IMainPageFragment {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1564650qop());
    public WeakReference<MainPageFragment> LIZIZ;

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LIZJ() {
        MainPageFragment mainPageFragment;
        NoticeAbility noticeAbility;
        WeakReference<MainPageFragment> weakReference = this.LIZIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (noticeAbility = (NoticeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(mainPageFragment, null), NoticeAbility.class, null)) == null) {
            return;
        }
        noticeAbility.EF();
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final String LJJLIIIJJI() {
        MainPageFragment mainPageFragment;
        String strNM;
        WeakReference<MainPageFragment> weakReference = this.LIZIZ;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && mainPageFragment.getFragmentManager() != null) {
            MainPageBusinessAbility mainPageBusinessAbilitySR = C297720Bli.LIZ() ? mainPageFragment.SR() : (MainPageBusinessAbility) C1558520qew.LIZ(C1558360qeg.LJFF(mainPageFragment, null), MainPageBusinessAbility.class, null);
            if (mainPageBusinessAbilitySR != null && (strNM = mainPageBusinessAbilitySR.nM()) != null) {
                return strNM;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void fp() {
        MainPageFragment mainPageFragment;
        NoticeAbility noticeAbility;
        WeakReference<MainPageFragment> weakReference = this.LIZIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (noticeAbility = (NoticeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(mainPageFragment, null), NoticeAbility.class, null)) == null) {
            return;
        }
        noticeAbility.fp();
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void qg() {
        MainPageFragment mainPageFragment;
        WeakReference<MainPageFragment> weakReference = this.LIZIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null) {
            return;
        }
        MainPageBusinessAbility mainPageBusinessAbilitySR = C297720Bli.LIZ() ? mainPageFragment.SR() : (MainPageBusinessAbility) C1558520qew.LIZ(C1558360qeg.LJFF(mainPageFragment, null), MainPageBusinessAbility.class, null);
        if (mainPageBusinessAbilitySR != null) {
            mainPageBusinessAbilitySR.qg();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void yl() {
        MainPageFragment mainPageFragment;
        NoticeAbility noticeAbility;
        WeakReference<MainPageFragment> weakReference = this.LIZIZ;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || mainPageFragment.getFragmentManager() == null || (noticeAbility = (NoticeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(mainPageFragment, null), NoticeAbility.class, null)) == null) {
            return;
        }
        noticeAbility.yl();
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LIZ(Fragment fragment) {
        if (fragment instanceof MainPageFragment) {
            this.LIZIZ = new WeakReference<>(fragment);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LIZIZ(C19EG c19eg) {
        MainActivity mainActivity;
        if ((c19eg instanceof MainActivity) && (mainActivity = (MainActivity) c19eg) != null) {
            mainActivity.refreshSlideSwitchCanScrollRight();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LIZLLL(C19EG c19eg) {
        C1564620qom.LIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LJ(C19EG c19eg) {
        C1564620qom.LIZIZ(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void LJFF(LifecycleObserver lifecycleObserver) {
        Lifecycle lifecycle;
        WeakReference<MainPageFragment> weakReference = this.LIZIZ;
        MainPageFragment mainPageFragment = null;
        if (weakReference != null) {
            mainPageFragment = weakReference.get();
        }
        if ((mainPageFragment instanceof LifecycleOwner) && mainPageFragment != null && (lifecycle = mainPageFragment.getLifecycle()) != null) {
            lifecycle.addObserver(lifecycleObserver);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void Zi(ScrollSwitchStateManager scrollSwitchStateManager) {
        MainPageFragment mainPageFragment;
        NoticeAbility noticeAbility;
        WeakReference<MainPageFragment> weakReference = this.LIZIZ;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && mainPageFragment.getFragmentManager() != null && (noticeAbility = (NoticeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(mainPageFragment, null), NoticeAbility.class, null)) != null) {
            noticeAbility.Zi(scrollSwitchStateManager);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void C8(String str, String str2) {
        MainPageFragment mainPageFragment;
        MainPageSocialAbility mainPageSocialAbility;
        Object ability;
        WeakReference<MainPageFragment> weakReference = this.LIZIZ;
        Object obj = null;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && mainPageFragment.getFragmentManager() != null) {
            if (C297720Bli.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(mainPageFragment, null), MainPageFragmentScope.class);
                if (c0qsjLIZJ != null) {
                    ability = c0qsjLIZJ.getAbility(MainPageSocialAbility.class);
                } else {
                    ability = null;
                }
                if (ability instanceof MainPageSocialAbility) {
                    obj = ability;
                }
                mainPageSocialAbility = (MainPageSocialAbility) obj;
            } else {
                mainPageSocialAbility = (MainPageSocialAbility) C1558520qew.LIZ(C1558360qeg.LJFF(mainPageFragment, null), MainPageSocialAbility.class, null);
            }
            if (mainPageSocialAbility != null) {
                mainPageSocialAbility.C8(str, str2);
            }
        }
    }
}

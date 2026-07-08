package com.ss.android.ugc.profile.business.feed;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1171990gbV;
import X.C128Y;
import X.C19252910Tv;
import X.C19EH;
import X.C20533215Wg;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C23250099c;
import X.C452501pT;
import X.C912270Zqb;
import X.InterfaceC1258040iqI;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class CollectProfileListFragment extends ProfileListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9LiApLWEQJykgLCwnGDcjLyY/LQklOjsVOiQrJCo9PA==";
    public Fragment LLILZLL;
    public User LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public View LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public int LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(354));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(644));

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        InterfaceC1258040iqI interfaceC1258040iqI;
        C128Y c128y = this.LLILZLL;
        if (!(c128y instanceof InterfaceC1258040iqI) || (interfaceC1258040iqI = (InterfaceC1258040iqI) c128y) == null) {
            return null;
        }
        return interfaceC1258040iqI.LJJLIIIJILLIZJL();
    }

    public final IFavoriteService wS() {
        return (IFavoriteService) this.LLJJ.getValue();
    }

    public final void yS() {
        Fragment fragment;
        FragmentManager fragmentManager;
        if (this.LLILZLL == null) {
            IFavoriteService iFavoriteServiceWS = wS();
            this.LLILZLL = iFavoriteServiceWS != null ? iFavoriteServiceWS.LJJI(this.LLIZ, this.LLILLL, this.LLIZLLLIL, this.LLJ) : null;
            IFavoriteService iFavoriteServiceWS2 = wS();
            if (iFavoriteServiceWS2 != null) {
                iFavoriteServiceWS2.LJJIJ(this.LLILZLL, this.LLJILJILJ);
            }
            if (getView() != null && (fragment = this.LLILZLL) != null && (fragmentManager = getFragmentManager()) != null && !fragmentManager.LJLJJI()) {
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.s0y, fragment, "user_favorites_fragment_tag");
                c19ehLJIIJ.LJIIIZ();
            }
        }
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJJI.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectProfileListFragment tryLoadRealCollectFragment user: ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isMyProfile: ");
        sbLIZ.append(this.LLIZLLLIL);
        abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZLL = null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (viewLJJLIIIJILLIZJL == null) {
            return;
        }
        if (viewLJJLIIIJILLIZJL instanceof RecyclerView) {
            if (z) {
                ((RecyclerView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
                return;
            } else {
                ((RecyclerView) viewLJJLIIIJILLIZJL).scrollToPosition(0);
                return;
            }
        }
        if (viewLJJLIIIJILLIZJL instanceof ScrollView) {
            ((ScrollView) viewLJJLIIIJILLIZJL).scrollTo(0, 0);
        } else {
            if (!(viewLJJLIIIJILLIZJL instanceof ListView)) {
                return;
            }
            if (z) {
                ((ListView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
            } else {
                viewLJJLIIIJILLIZJL.scrollTo(0, 0);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJJIFFI(this.LLJI, Integer.valueOf(configuration.orientation), Integer.valueOf(this.LLJILLL));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/profile/business/feed/CollectProfileListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vsCwImqMAzusPQrqUCcuKqCYP2X8API4kM8lgmCm3BA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        Fragment fragment = this.LLILZLL;
        if (fragment != null) {
            fragment.setUserVisibleHint(z);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(CollectProfileListFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void uS(boolean z) {
        super.uS(z);
        if (z) {
            if (!C1171990gbV.LIZJ()) {
                IFavoriteService iFavoriteServiceWS = wS();
                if (iFavoriteServiceWS != null) {
                    iFavoriteServiceWS.LJJIFFI();
                }
                yS();
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C912270Zqb(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5  */
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.feed.CollectProfileListFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}

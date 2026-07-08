package com.ss.android.ugc.profile.business.profile.tab;

import X.AbstractC1255880imo;
import X.C0BL9;
import X.C0BLA;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1206330hUt;
import X.C1206700hVU;
import X.C1255780ime;
import X.C1255920ims;
import X.C1258820irY;
import X.C1259360isQ;
import X.C1260360iu2;
import X.C1722300uv6;
import X.C19EG;
import X.C20533215Wg;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C2344809Gs;
import X.C288970BUh;
import X.C430420GuG;
import X.C616540OGe;
import X.EnumC1258840ira;
import Y.AObserverS223S0100000_19;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteInvalidVideosSharedVM;
import com.ss.android.ugc.aweme.favorites.service.IExternalHeaderProvider;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteInvalidVideosService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FavoriteInvalidAwemeListFragment extends AwemeListFragmentImpl {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjLyHELIOSY/LWs4KC19DiQ6Jj06PCAFJzkyJCwoCDg2JSAAIDwnDjctLiI2JjE=";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public FavoriteInvalidVideosSharedVM f434J;
    public IFavoriteInvalidVideosService K;
    public IExternalHeaderProvider L;
    public boolean M;

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final boolean dU() {
        return true;
    }

    public final void HU() {
        FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM = this.f434J;
        if (favoriteInvalidVideosSharedVM != null) {
            boolean z = getUserVisibleHint() && isResumed();
            if (Intrinsics.LJFF(favoriteInvalidVideosSharedVM.LLIZ.getValue(), Boolean.valueOf(z))) {
                return;
            }
            favoriteInvalidVideosSharedVM.LLIZ.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1259360isQ c1259360isQ;
        IExternalHeaderProvider iExternalHeaderProvider = this.L;
        if (iExternalHeaderProvider != null && (c1259360isQ = this.LLJJJ) != null && c1259360isQ.LLLIIIL == iExternalHeaderProvider) {
            c1259360isQ.LLLIIIL = null;
            c1259360isQ.notifyDataSetChanged();
        }
        this.L = null;
        IFavoriteInvalidVideosService iFavoriteInvalidVideosService = this.K;
        if (iFavoriteInvalidVideosService != null) {
            iFavoriteInvalidVideosService.LJI();
        }
        this.K = null;
        this.f434J = null;
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1206390hUz
    public final void LLLILZLLLI() throws Throwable {
        super.LLLILZLLLI();
        setUserVisibleHint(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final boolean hT() {
        C1255780ime c1255780ime;
        MutableLiveData mutableLiveData;
        Integer num;
        if (!C0BL9.LIZ()) {
            return false;
        }
        FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM = this.f434J;
        if (favoriteInvalidVideosSharedVM != null && (mutableLiveData = favoriteInvalidVideosSharedVM.LLILZ) != null && (num = (Integer) mutableLiveData.getValue()) != null && num.intValue() == 0) {
            return true;
        }
        C1255920ims<AbstractC1255880imo> c1255920ims = this.LLJJJJJIL;
        AbstractC1255880imo abstractC1255880imo = c1255920ims != null ? (AbstractC1255880imo) c1255920ims.LL : null;
        if (!(abstractC1255880imo instanceof C1255780ime) || (c1255780ime = (C1255780ime) abstractC1255880imo) == null || !c1255780ime.LLJLIL) {
            return false;
        }
        C1259360isQ c1259360isQ = this.LLJJJ;
        if (c1259360isQ != null) {
            c1259360isQ.setShowFooter(false);
        }
        FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM2 = this.f434J;
        if (favoriteInvalidVideosSharedVM2 != null) {
            EnumC1258840ira enumC1258840ira = EnumC1258840ira.MANUAL_LOAD_MORE;
            Context context = getContext();
            String string = context != null ? context.getString(2131846214) : null;
            Context context2 = getContext();
            favoriteInvalidVideosSharedVM2.LLJIJIL.setValue(new C1258820irY(enumC1258840ira, null, string, context2 != null ? context2.getString(2131846213) : null));
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void kT() {
        FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVMLIZ;
        super.kT();
        C19EG activity = getActivity();
        if (activity == null || (favoriteInvalidVideosSharedVMLIZ = C1206330hUt.LIZ(this)) == null) {
            return;
        }
        boolean z = !C0BLA.LIZ() && ((Number) C288970BUh.LIZ.getValue()).intValue() > 0;
        this.f434J = favoriteInvalidVideosSharedVMLIZ;
        if (z) {
            IFavoriteInvalidVideosService iFavoriteInvalidVideosService = (IFavoriteInvalidVideosService) PluggableExtentionKt.pluggableSpi$default(IFavoriteInvalidVideosService.class, false, false, false, 14, null);
            if (iFavoriteInvalidVideosService == null) {
                return;
            }
            this.K = iFavoriteInvalidVideosService;
            C430420GuG c430420GuGLIZ = iFavoriteInvalidVideosService.LIZ();
            C1259360isQ c1259360isQ = this.LLJJJ;
            if (c1259360isQ != null && c1259360isQ.LLLIIIL != c430420GuGLIZ) {
                c1259360isQ.LLLIIIL = c430420GuGLIZ;
                c1259360isQ.notifyDataSetChanged();
            }
            this.L = c430420GuGLIZ;
            iFavoriteInvalidVideosService.LIZIZ(favoriteInvalidVideosSharedVMLIZ, activity, this);
        } else {
            this.K = null;
            this.L = null;
        }
        favoriteInvalidVideosSharedVMLIZ.LLJI.observe(this, new AObserverS223S0100000_19(this, 72));
        favoriteInvalidVideosSharedVMLIZ.LLJILJIL.observe(this, new AObserverS223S0100000_19(this, 73));
        favoriteInvalidVideosSharedVMLIZ.LLJILLL.observe(this, new AObserverS223S0100000_19(this, 74));
        HU();
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        HU();
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(FavoriteInvalidAwemeListFragment.class.getName());
        }
        super.onResume();
        HU();
        if (this.LLJJJJJIL.LJIIL() && this.LLJJJ.LLLLIIL() == 0) {
            LJ();
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1206390hUz
    public final void onPageSelected(int i) throws Throwable {
        setUserVisibleHint(true);
        super.onPageSelected(i);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/profile/business/profile/tab/FavoriteInvalidAwemeListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkXRrvOZVJxI7O9qww3WvwxvzT3C4TvEQnrmJlAVtjF3xO+Wso=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        HU();
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(FavoriteInvalidAwemeListFragment.class);
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void uU(Aweme aweme) {
        this.M = true;
        super.uU(aweme);
        this.M = true;
    }

    public static C1722300uv6 EU(C1258820irY c1258820irY, Function0 function0) {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        String str = c1258820irY.LIZIZ;
        if (str != null) {
            c1722300uv6.LJI = str;
        }
        String str2 = c1258820irY.LIZJ;
        if (str2 != null) {
            c1722300uv6.LJIIIIZZ = str2;
        }
        String str3 = c1258820irY.LIZLLL;
        if (str3 != null && str3.length() != 0) {
            c1722300uv6.LJIIIZ = new AwS133S1100000_19(str3, (String) function0, (Function0<Unit>) 14);
        }
        return c1722300uv6;
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        super.LLJJJIL(list, z);
        GU(list, z, !this.M);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        super.Pj(list, z);
        GU(list, z, false);
    }

    public final void GU(List<? extends Aweme> list, boolean z, boolean z2) {
        FeedItemList feedItemList;
        boolean z3;
        T t;
        FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM = this.f434J;
        if (favoriteInvalidVideosSharedVM == null) {
            return;
        }
        C1255920ims<AbstractC1255880imo> c1255920ims = this.LLJJJJJIL;
        Object data = null;
        if (c1255920ims != null && (t = c1255920ims.LL) != 0) {
            data = t.getData();
        }
        if ((data instanceof FeedItemList) && (feedItemList = (FeedItemList) data) != null) {
            String str = this.LLIZ;
            if (str == null) {
                str = "";
            }
            int i = feedItemList.fetchType;
            int i2 = feedItemList.invalidCount;
            long j = feedItemList.cursor;
            if (list != null && !list.isEmpty()) {
                z3 = false;
            } else {
                z3 = true;
            }
            favoriteInvalidVideosSharedVM.LL.setValue(new C1206700hVU<>(new C1260360iu2(str, i, i2, j, z2, !z3, z)));
            feedItemList.invalidCount = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void vT(int i, int i2, String str) {
        MutableLiveData mutableLiveData;
        Integer num;
        FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM = this.f434J;
        if (favoriteInvalidVideosSharedVM != null && (mutableLiveData = favoriteInvalidVideosSharedVM.LLILZ) != null && (num = (Integer) mutableLiveData.getValue()) != null && num.intValue() == 0) {
            C2344809Gs.LJ("collect posts tab count is 0, abort load more");
        } else {
            super.vT(4, i2, str);
        }
    }
}

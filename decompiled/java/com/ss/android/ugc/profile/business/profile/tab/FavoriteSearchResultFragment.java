package com.ss.android.ugc.profile.business.profile.tab;

import X.AbstractC1255880imo;
import X.AnonymousClass0345;
import X.C01GW;
import X.C1255780ime;
import X.C1255790imf;
import X.C1255920ims;
import X.C1257170iot;
import X.C1259360isQ;
import X.C1264160j0A;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19EG;
import X.C300180Bpg;
import X.C452501pT;
import X.C737030Svd;
import X.C786410Ut5;
import X.InterfaceC1258470iqz;
import Y.AObserverS223S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FavoriteSearchResultFragment extends AwemeListFragmentImpl {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjHELIOSLyY/LWs4KC19DiQ6Jj06PCAfLC4hKy0eLDwmJDEKOy40JSAiPQ==";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C01GW f435J = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2127));
    public int K;
    public boolean L;
    public boolean M;

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final int US() {
        return 2131847162;
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC737090Svj
    public final boolean W0() {
        this.M = false;
        this.K = 0;
        return super.W0();
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void onVideoCollectEvent(AnonymousClass0345 anonymousClass0345) {
    }

    public final FavoriteSearchViewModel GU() {
        return (FavoriteSearchViewModel) this.f435J.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final C1722300uv6 BS() {
        String string = getString(2131847103);
        C1722300uv6 c1722300uv6BS = super.BS();
        c1722300uv6BS.LJI = "";
        c1722300uv6BS.LJIIIIZZ = string;
        return c1722300uv6BS;
    }

    public final C1255790imf EU() {
        String str;
        String str2;
        String str3;
        String str4;
        FavoriteSearchViewModel favoriteSearchViewModelGU = GU();
        String str5 = (favoriteSearchViewModelGU == null || !favoriteSearchViewModelGU.LLJJIII) ? "enter_search" : "click_search_history";
        FavoriteSearchViewModel favoriteSearchViewModelGU2 = GU();
        String str6 = "";
        if (favoriteSearchViewModelGU2 == null || (str = favoriteSearchViewModelGU2.LLJILJILJ) == null) {
            str = "";
        }
        FavoriteSearchViewModel favoriteSearchViewModelGU3 = GU();
        if (favoriteSearchViewModelGU3 == null || (str2 = favoriteSearchViewModelGU3.LLJILLL) == null) {
            str2 = "";
        }
        FavoriteSearchViewModel favoriteSearchViewModelGU4 = GU();
        if (favoriteSearchViewModelGU4 == null || (str3 = favoriteSearchViewModelGU4.LLJJ) == null) {
            str3 = "";
        }
        FavoriteSearchViewModel favoriteSearchViewModelGU5 = GU();
        if (favoriteSearchViewModelGU5 != null && (str4 = favoriteSearchViewModelGU5.LLJJI) != null) {
            str6 = str4;
        }
        return new C1255790imf(str, str2, str5, str3, str6, 224);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1212360hec
    public final void Ng1() {
        super.Ng1();
        if (QS() == 0 && this.C) {
            c5("load_more_empty_but_has_more_search");
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void mT() {
        C1255780ime c1255780ime;
        super.mT();
        C1255920ims<AbstractC1255880imo> c1255920ims = this.LLJJJJJIL;
        AbstractC1255880imo abstractC1255880imo = c1255920ims != null ? (AbstractC1255880imo) c1255920ims.LL : null;
        if (!(abstractC1255880imo instanceof C1255780ime) || (c1255780ime = (C1255780ime) abstractC1255880imo) == null) {
            return;
        }
        c1255780ime.LLJILLL = EU();
        c1255780ime.LLJILJILJ = 0;
        c1255780ime.LLJJ++;
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJL = null;
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        INetworkStandardUIService iNetworkStandardUIService;
        C1259360isQ c1259360isQ = this.LLJJJ;
        if (c1259360isQ != null && c1259360isQ.getItemCount() != 0) {
            super.Wi(exc);
            return;
        }
        C1749280vcc c1749280vcc = this.LLJJJJLIIL;
        if (c1749280vcc == null) {
            return;
        }
        this.LLLJ = 3;
        c1749280vcc.setTopMargin(this.LLJJL);
        C786410Ut5.LLLZLZ(this.LLJJJJLIIL, 0);
        C19EG activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null && (iNetworkStandardUIService = (INetworkStandardUIService) serviceManager.getService(INetworkStandardUIService.class)) != null && iNetworkStandardUIService.isStandardUIEnable()) {
            C1257170iot.LIZIZ(activity, ZS(), exc, this.LLJJJJLIIL);
            C1264160j0A.LIZIZ(this.LLJJJJLIIL, ZS(), exc, new AwS563S0100000_19(this, 2128));
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
        if (this.LLLILZLLLI == null) {
            return;
        }
        this.LLJJJJLIIL.setStatus(this.LLLILZLLLI);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC683650Qrj
    public final void n2(boolean z) {
        C1259360isQ c1259360isQ;
        super.n2(z);
        if (!z && !C300180Bpg.LIZ() && (c1259360isQ = this.LLJJJ) != null && c1259360isQ.LLLLIIL() > 0) {
            this.LLJJJ.setLoadEmptyText(2131847162);
            this.LLJJJ.setShowFooter(true);
            this.LLJJJ.showLoadMoreEmpty();
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void onVideoEvent(C737030Svd c737030Svd) {
        if (c737030Svd.LIZ == 54) {
            return;
        }
        super.onVideoEvent(c737030Svd);
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        this.C = z;
        super.LLJJJIL(list, z);
        if (list != null && !list.isEmpty()) {
            this.M = false;
            this.K = 0;
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        super.Pj(list, z);
        if (list != null && !list.isEmpty()) {
            this.M = false;
            this.K = 0;
            LJIIL();
        }
        if (QS() == 0 && z) {
            c5("load_more_empty_but_has_more_search");
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData mutableLiveData;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0irr
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        view.setPadding(view.getPaddingLeft(), (int) TypedValue.applyDimension(1, 52.0f, getResources().getDisplayMetrics()), view.getPaddingRight(), view.getPaddingBottom());
        TuxTextView tuxTextView = (TuxTextView) this.LLJJJJLIIL.findViewById(R.id.message_tv);
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(102);
        }
        FavoriteSearchViewModel favoriteSearchViewModelGU = GU();
        if (favoriteSearchViewModelGU != null && (mutableLiveData = favoriteSearchViewModelGU.LLILZLL) != null) {
            mutableLiveData.observe(this, new AObserverS223S0100000_19(this, 41));
        }
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final Bundle HS(Aweme aweme, String str, boolean z) {
        String str2;
        Bundle bundleHS = super.HS(aweme, str, z);
        bundleHS.putBoolean("is_profile_tab_search", true);
        FavoriteSearchViewModel favoriteSearchViewModelGU = GU();
        if (favoriteSearchViewModelGU == null || (str2 = favoriteSearchViewModelGU.LLJJI) == null) {
            str2 = "";
        }
        C786410Ut5.LJJJI("profile_tab_search_id", str2, bundleHS);
        return bundleHS;
    }

    @Override // com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl
    public final void vT(int i, int i2, String str) {
        C1255780ime c1255780ime;
        C1255790imf c1255790imf;
        if (!Intrinsics.LJFF(str, "load_more_after_refresh") && !Intrinsics.LJFF(str, "load_more_feed_empty_but_has_more")) {
            if (QS() == 0 && !Intrinsics.LJFF(str, "load_more_empty_but_has_more_manually")) {
                int i3 = this.K;
                SettingsManager.LIZLLL().getClass();
                if (i3 >= SettingsManager.LJ("profile_favorite_search_auto_load_count_setting", 4)) {
                    LJIIL();
                    if (this.M) {
                        if (this.C) {
                            n2(false);
                            jU();
                            InterfaceC1258470iqz interfaceC1258470iqz = this.LLJL;
                            if (interfaceC1258470iqz != null) {
                                interfaceC1258470iqz.LIZJ(this.LLJIJIL, this.LLJILLL);
                                return;
                            }
                            return;
                        }
                        Ng1();
                        return;
                    }
                    this.LLLJ = 2;
                    C1749280vcc c1749280vcc = this.LLJJJJLIIL;
                    if (c1749280vcc != null) {
                        C786410Ut5.LLLZLZ(c1749280vcc, 0);
                    }
                    C1749280vcc c1749280vcc2 = this.LLJJJJLIIL;
                    if (c1749280vcc2 != null) {
                        c1749280vcc2.setTopMargin(this.LLJJL);
                    }
                    C1749280vcc c1749280vcc3 = this.LLJJJJLIIL;
                    if (c1749280vcc3 == null) {
                        return;
                    }
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    c1722300uv6.LJI = "";
                    c1722300uv6.LJIIIIZZ = getString(2131847105);
                    c1722300uv6.LJIIIZ = new AwS598S0100000_19(this, 821);
                    c1722300uv6.LJIIJ = new AwS598S0100000_19(this, 822);
                    c1749280vcc3.setStatus(c1722300uv6);
                    return;
                }
                this.K++;
            } else {
                this.M = false;
                this.K = 0;
            }
            if (QS() == 0) {
                LJ();
            } else {
                LJIIL();
            }
            C1255920ims<AbstractC1255880imo> c1255920ims = this.LLJJJJJIL;
            AbstractC1255880imo abstractC1255880imo = null;
            if (c1255920ims != null) {
                abstractC1255880imo = (AbstractC1255880imo) c1255920ims.LL;
            }
            if ((abstractC1255880imo instanceof C1255780ime) && (c1255780ime = (C1255780ime) abstractC1255880imo) != null && (c1255790imf = c1255780ime.LLJILLL) != null) {
                c1255790imf.LJII = QS();
            }
            if (i2 < 0) {
                i2 = this.LLLZZ;
            }
            super.vT(4, i2, str);
        }
    }
}

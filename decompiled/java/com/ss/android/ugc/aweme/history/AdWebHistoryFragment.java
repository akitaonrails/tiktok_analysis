package com.ss.android.ugc.aweme.history;

import X.AbstractC1053500dWO;
import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C01GW;
import X.C098200Yq;
import X.C0PEM;
import X.C1022670cif;
import X.C1025720cna;
import X.C1026310coX;
import X.C1028100crQ;
import X.C1040580dBY;
import X.C1040750dBp;
import X.C1053310dW5;
import X.C1053320dW6;
import X.C1053330dW7;
import X.C1053350dW9;
import X.C1053410dWF;
import X.C1053440dWI;
import X.C1227904rF;
import X.C123100dR;
import X.C1247510iZJ;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1389890mGx;
import X.C1390410mHn;
import X.C1390850mIV;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14EU;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C23250099c;
import X.C452501pT;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1036160d4Q;
import X.InterfaceC1053520dWQ;
import Y.AObserverS220S0100000_16;
import Y.ARunnableS85S0200000_16;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryAdInfo;
import com.ss.android.ugc.aweme.history.model.AdWebHistorySessionInfo;
import com.ss.android.ugc.aweme.history.model.HistorySessionInfo;
import com.ss.android.ugc.aweme.history.model.HistorySessionShowInfo;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS103S0110000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS9S0101100_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebHistoryFragment extends Fragment implements InterfaceC1053520dWQ {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi0lHELIOSOjs8OjxiCCsELScEIDwnJzc1Dz0yLygpJzs=";
    public RecyclerView LL;
    public AdWebHistoryViewModel LLILLJJLI;
    public C1053440dWI LLILLL;
    public C1390410mHn LLILZ;
    public C1749280vcc LLILZIL;
    public Integer LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 135));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 136));

    public final void LJIIL() {
        C1390410mHn c1390410mHn = this.LLILZ;
        if (c1390410mHn != null && c1390410mHn.LLIZLLLIL) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLILZ;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
    }

    public final void MR() {
        C1053440dWI c1053440dWI;
        AdWebHistoryViewModel adWebHistoryViewModel = this.LLILLJJLI;
        if (adWebHistoryViewModel == null || !adWebHistoryViewModel.LLILZLL) {
            RecyclerView recyclerView = this.LL;
            if (recyclerView == null || (c1053440dWI = this.LLILLL) == null) {
                return;
            }
            c1053440dWI.mmLoadMoreState.LIZ = -1;
            HandlerHook.viewPost(recyclerView, new ARunnableS85S0200000_16(c1053440dWI, recyclerView, 66));
            return;
        }
        C1053440dWI c1053440dWI2 = this.LLILLL;
        if (c1053440dWI2 != null) {
            c1053440dWI2.showLoadMoreLoading();
        }
        AdWebHistoryViewModel adWebHistoryViewModel2 = this.LLILLJJLI;
        if (adWebHistoryViewModel2 != null) {
            adWebHistoryViewModel2.yQ2(adWebHistoryViewModel2.LLILZIL);
        }
    }

    public final void UR() {
        C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
        c1397580mTM.LJFF(2131821687);
        c1397580mTM.LIZ(2131821688);
        C985403tE.LIZ(c1397580mTM, new AwS595S0100000_16(this, 358));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        C1040580dBY c1040580dBY = new C1040580dBY(new Object[0]);
        C1040750dBp.LIZ.getClass();
        c1040580dBY.log(C1040750dBp.LJJIJLIJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL == null || !eventBusLIZLLL.LJIIJ(this)) {
            return;
        }
        eventBusLIZLLL.LJJI(this);
    }

    public final void NR(boolean z) {
        List<AbstractC1053500dWO> data;
        C19EG activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            return;
        }
        if (z) {
            SR(2131821691);
        } else {
            SR(2131821689);
        }
        C1053440dWI c1053440dWI = this.LLILLL;
        if (c1053440dWI != null && (data = c1053440dWI.getData()) != null && data.isEmpty()) {
            VR(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC1053520dWQ
    public final void Qn(C1053410dWF c1053410dWF) {
        RR(2131821690, true, new AwS417S0200000_16(this, c1053410dWF, 25));
    }

    public final void SR(int i) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(getString(i));
        c1389890mGx.LIZLLL(3000L);
        c1389890mGx.LJIIJJI();
    }

    public final void VR(Boolean bool) {
        LJIIL();
        C1749280vcc c1749280vcc = this.LLILZIL;
        if (c1749280vcc != null) {
            c1749280vcc.setStatus((C1722300uv6) this.LLJI.getValue());
        }
        C1749280vcc c1749280vcc2 = this.LLILZIL;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            PR(0, 0L);
        }
    }

    @Override // X.InterfaceC1053520dWQ
    public final void kA(C1053410dWF c1053410dWF) {
        String str;
        String str2;
        User user;
        String str3;
        User user2;
        UrlModel avatarLarger;
        Integer num = c1053410dWF.LJIIJ;
        if ((num == null || num.intValue() != 0) && c1053410dWF.LJIIJ != null) {
            SR(2131821685);
            return;
        }
        if (C123100dR.LIZ(c1053410dWF.LIZIZ)) {
            WR(c1053410dWF.LJIIL, c1053410dWF.LJ);
            try {
                String str4 = c1053410dWF.LIZIZ;
                AdWebHistoryAdInfo adWebHistoryAdInfo = c1053410dWF.LJFF;
                C1227904rF c1227904rF = C1227904rF.LIZ;
                if (adWebHistoryAdInfo != null) {
                    str = adWebHistoryAdInfo.rawAdData;
                } else {
                    str = null;
                }
                c1227904rF.getClass();
                AwemeRawAd awemeRawAd = (AwemeRawAd) C1227904rF.LIZIZ(str, AwemeRawAd.class);
                Boolean boolValueOf = null;
                AdlpExtraModel adlpExtraModel = new AdlpExtraModel(null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
                if (adWebHistoryAdInfo == null) {
                    str2 = null;
                } else {
                    str2 = adWebHistoryAdInfo.requestId;
                }
                adlpExtraModel.setRequestId(str2);
                if (adWebHistoryAdInfo == null) {
                    user = null;
                } else {
                    user = adWebHistoryAdInfo.author;
                }
                adlpExtraModel.setAuthor(user);
                if (adWebHistoryAdInfo == null) {
                    str3 = null;
                } else {
                    str3 = adWebHistoryAdInfo.awemeId;
                }
                adlpExtraModel.setAid(str3);
                adlpExtraModel.setRefer("ad_history");
                adlpExtraModel.setLandingPageStyle(0);
                if (adWebHistoryAdInfo != null) {
                    user2 = adWebHistoryAdInfo.author;
                } else {
                    user2 = null;
                }
                if (user2 == null) {
                    avatarLarger = null;
                } else {
                    avatarLarger = user2.getAvatarLarger();
                    if (avatarLarger == null && (avatarLarger = user2.getAvatarMedium()) == null) {
                        avatarLarger = user2.getAvatarThumb();
                    }
                }
                adlpExtraModel.setAuthorAvatar(avatarLarger);
                String webUrl = awemeRawAd.getWebUrl();
                if (webUrl == null || a0.LJJJIL(webUrl)) {
                    awemeRawAd.setWebUrl(str4);
                }
                C1026310coX c1026310coX = new C1026310coX(str4, awemeRawAd, adlpExtraModel, false, new C1025720cna(-1.0f, null, null, -1, Boolean.FALSE, -1, -1, Boolean.FALSE), null);
                Boolean bool = Boolean.TRUE;
                IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) PluggableExtentionKt.pluggableSpi$default(IAdLandingPagePopUpService.class, false, false, false, 14, null);
                if (iAdLandingPagePopUpService != null) {
                    boolValueOf = Boolean.valueOf(iAdLandingPagePopUpService.LJIIJJI(c1026310coX, bool));
                }
                c1026310coX.setPopUpCustomConfig(new C1028100crQ(bool, null, Boolean.FALSE, false, false, Boolean.TRUE, boolValueOf, null, null, null, false, false, false, false, null, Boolean.FALSE));
                C1053330dW7 c1053330dW7LIZ = C1053310dW5.LIZ();
                if (c1053330dW7LIZ.LIZ && c1053330dW7LIZ.LIZIZ != null) {
                    C19EG activity = getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS85S0200000_16(c1053330dW7LIZ, c1026310coX, 60));
                } else {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "//commercialize/ad_landing_page/fullscreen");
                    smartRouteBuildRoute.withParam("keyAdWebModel", c1026310coX);
                    smartRouteBuildRoute.withParam("keyFromScene", EnumC1036160d4Q.FROM_FEED_AD_FLING);
                    smartRouteBuildRoute.open();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1053350dW9(this, c1053410dWF, null), 2);
            return;
        }
        SR(2131821685);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILZLL = Integer.valueOf(arguments.getInt("enter_from"));
            arguments.getString("entrance");
            this.LLIZ = arguments.getBoolean("embedded_mode", false);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onStartNewIABEvent(C1053320dW6 c1053320dW6) {
        int iHashCode;
        String creativeIdStr;
        int i = c1053320dW6.LIZ;
        C19EG activity = getActivity();
        if (activity != null) {
            iHashCode = activity.hashCode();
        } else {
            iHashCode = 0;
        }
        if (i == iHashCode) {
            AwemeRawAd awemeRawAd = c1053320dW6.LIZIZ.getAwemeRawAd();
            if (awemeRawAd != null) {
                creativeIdStr = awemeRawAd.getCreativeIdStr();
            } else {
                creativeIdStr = null;
            }
            WR(1, creativeIdStr);
            C1026310coX c1026310coX = c1053320dW6.LIZIZ;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "//commercialize/ad_landing_page/fullscreen");
            smartRouteBuildRoute.withParam("keyAdWebModel", c1026310coX);
            smartRouteBuildRoute.withParam("keyFromScene", EnumC1036160d4Q.FROM_FEED_AD_FLING);
            smartRouteBuildRoute.open();
        }
    }

    public static void WR(int i, String str) {
        if (str != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("iab_custom_session_switch", true)) {
                try {
                    HistorySessionInfo historySessionInfo = new HistorySessionInfo(UUID.randomUUID().toString(), new HistorySessionShowInfo(new AdWebHistorySessionInfo(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()))));
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(historySessionInfo);
                    if (strLJI != null) {
                        C1022670cif.LIZ.getClass();
                        C1022670cif.LIZ().LIZLLL(str, strLJI);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        }
    }

    public final void OR(List<AbstractC1053500dWO> list, boolean z) {
        C1053440dWI c1053440dWI = this.LLILLL;
        if (c1053440dWI != null) {
            c1053440dWI.setData(list);
        }
        if (z) {
            this.LLIZLLLIL = System.currentTimeMillis();
        } else {
            this.LLJ = System.currentTimeMillis();
        }
        if (!list.isEmpty()) {
            LJIIL();
            C1749280vcc c1749280vcc = this.LLILZIL;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            if (!z) {
                PR(1, this.LLJ - this.LLIZLLLIL);
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        VR(Boolean.TRUE);
    }

    public final void PR(int i, long j) {
        C1040580dBY c1040580dBY = new C1040580dBY(new Object[0]);
        C1040750dBp.LIZ.getClass();
        c1040580dBY.log(C1040750dBp.LJJIJIIJIL, new AwS9S0101100_16(this, i, j, 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC21674919sB abstractC21674919sB;
        super.onViewCreated(view, bundle);
        if (!this.LLIZ) {
            TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p1f);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131821702);
            tuxNavBar.LJIJJ(c1250250idj);
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS560S0100000_16(this, 897));
            tuxNavBar.LIZIZ(c1251150ifB);
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_ellipsis_horizontal;
            c1251150ifB2.LIZJ(new AwS560S0100000_16(this, 899));
            tuxNavBar.LIZ(c1251150ifB2);
            tuxNavBar.LJIIZILJ(false);
        } else {
            TuxNavBar tuxNavBar2 = (TuxNavBar) view.findViewById(R.id.p1f);
            if (tuxNavBar2 != null) {
                C786410Ut5.LLLLZLLLI(tuxNavBar2, 8);
            }
        }
        C1053440dWI c1053440dWI = new C1053440dWI(requireContext(), this, this.LLILZLL, this.LLIZ, new AwS560S0100000_16(this, 895));
        c1053440dWI.setLoadEmptyText(2131821703);
        c1053440dWI.setShowFooter(true);
        c1053440dWI.setLoadMoreListener(new AwS560S0100000_16(this, 896));
        this.LLILLL = c1053440dWI;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.toe);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.LLILLL);
        this.LL = recyclerView;
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
            abstractC21674919sB.LLIZ = true;
            abstractC21674919sB.LJIJJ(300L);
            abstractC21674919sB.LJIJJLI(300L);
            abstractC21674919sB.LJIL(300L);
            abstractC21674919sB.LJJ(300L);
        }
        this.LLILZ = (C1390410mHn) view.findViewById(R.id.nl7);
        this.LLILZIL = (C1749280vcc) view.findViewById(R.id.w0t);
        AdWebHistoryViewModel adWebHistoryViewModel = (AdWebHistoryViewModel) new ViewModelProvider(this).get(AdWebHistoryViewModel.class);
        this.LLILLJJLI = adWebHistoryViewModel;
        if (adWebHistoryViewModel != null) {
            adWebHistoryViewModel.LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS220S0100000_16(this, 36));
            adWebHistoryViewModel.LLILLL.observe(getViewLifecycleOwner(), new AObserverS220S0100000_16(this, 37));
            adWebHistoryViewModel.LLILZ.observe(getViewLifecycleOwner(), new AObserverS220S0100000_16(this, 38));
            adWebHistoryViewModel.LLIZLLLIL.observe(getViewLifecycleOwner(), new AObserverS220S0100000_16(this, 39));
            adWebHistoryViewModel.yQ2(0L);
        }
        C1390410mHn c1390410mHn = this.LLILZ;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLILZ;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        C1749280vcc c1749280vcc = this.LLILZIL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL != null && !eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
    }

    public final void RR(int i, boolean z, Function0<Unit> function0) {
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(i);
        c1247510iZJ.LIZJ = 1;
        c1247510iZJ.LIZLLL = z;
        c1247510iZJ.LIZ(new AwS103S0110000_16(function0, z, 2));
        c1390850mIV.LIZIZ(c1247510iZJ);
        c1390850mIV.LIZLLL(R.string.f1_);
        c1390850mIV.LIZJ().show(getParentFragmentManager(), getString(2131821692));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.lp, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}

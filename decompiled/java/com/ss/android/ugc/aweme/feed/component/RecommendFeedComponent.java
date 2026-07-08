package com.ss.android.ugc.aweme.feed.component;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C036E;
import X.C0O0L;
import X.C0R9P;
import X.C0SOG;
import X.C0SOJ;
import X.C0SZ8;
import X.C1255920ims;
import X.C1257170iot;
import X.C1389300mG0;
import X.C1488520oq2;
import X.C1492500owS;
import X.C1492520owU;
import X.C1582010rGp;
import X.C1589010rS7;
import X.C1589020rS8;
import X.C1589030rS9;
import X.C1589040rSA;
import X.C1589060rSC;
import X.C1589070rSD;
import X.C1589080rSE;
import X.C1589090rSF;
import X.C1601380rm4;
import X.C1601390rm5;
import X.C1601440rmA;
import X.C1618110sD3;
import X.C19EG;
import X.C1AF0;
import X.C20684815ws;
import X.C2276411E8h;
import X.C23250099c;
import X.C2344809Gs;
import X.C281140B0e;
import X.C300960Bqw;
import X.C452501pT;
import X.C583070Mtt;
import X.C584960Mww;
import X.C613920O6c;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1609900rzo;
import X.EnumC452301pR;
import X.InterfaceC427710Gpt;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.service.FeedSkylightServiceProviderImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.fragment.IRecommendFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class RecommendFeedComponent extends HomeFeedComponent implements IRecommendFeedFragmentAbility {
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1589060rSC(this));
    public final C01GW LLJJIJI = C452501pT.LIZ(EnumC452301pR.NONE, new C1589070rSD());
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C1589030rS9(this));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C1589020rS8(this));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new C1589040rSA());
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new C1589080rSE(this));
    public final C0SOG LLJJJJ = new C0SOG(new C0SOJ(this));
    public final C0SOG LLJJJJJIL = new C0SOG(new C1589090rSF(this));

    public final C1601390rm5 Ho() {
        return (C1601390rm5) this.LLJJIJIL.getValue();
    }

    @Override // X.InterfaceC1603280rp8
    public final void LJJIIJ() {
        C19EG activity;
        C2276411E8h.LIZIZ.LIZJ("recommend_feed", 4, "FeedFetchModel", "feedRecommendFragment called onLoadMore()");
        AtomicBoolean atomicBoolean = C583070Mtt.LJ;
        if (atomicBoolean.get()) {
            C583070Mtt.LIZ();
        }
        if (C583070Mtt.LIZLLL == 0) {
            C583070Mtt.LIZLLL = System.currentTimeMillis();
        }
        atomicBoolean.set(true);
        C0R9P.LIZ.getClass();
        if (C0R9P.LIZ() && (activity = ((Fragment) this.LLJJIII.getValue()).getActivity()) != null && !activity.isFinishing() && C036E.LIZ.LIZJ == C0O0L.NOT_AVAILABLE) {
            LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper = this.LLJJ;
            if (loadMorePanelComponentTempHelper != null) {
                loadMorePanelComponentTempHelper.resetLoadMoreState();
            }
            C1257170iot.LIZ(activity, EnumC1609900rzo.RECOMMEND_FEED, null, null);
            C583070Mtt.LIZ();
            ((AbstractC1604130rqV) this.LLJJIJI.getValue()).LJIJ(AFwS213S0000000_24.get$arr$(141));
            return;
        }
        C1601440rmA c1601440rmA = new C1601440rmA();
        c1601440rmA.LIZ = 0;
        c1601440rmA.LIZIZ = 2;
        c1601440rmA.LJJIZ = "slide_up";
        Ho().LIZJ(4, c1601440rmA.LIZ());
        if (C1492500owS.LIZ()) {
            C1492520owU.LIZ();
        }
        ((FeedRecommendFragment) this.LLJJIII.getValue()).mS("slide_up");
        ((AbstractC1604130rqV) this.LLJJIJI.getValue()).LJIIJJI(AFwS213S0000000_24.get$arr$(142));
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility
    public final C0SZ8 k4() {
        return ((BaseListFragmentPanel) this.LLJJIJIIJIL.getValue()).LJLIL();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IRecommendFeedFragmentAbility
    public final boolean mx0() {
        C1601440rmA c1601440rmA = new C1601440rmA();
        c1601440rmA.LIZ = getPanelContext().LIZLLL;
        c1601440rmA.LJJIZ = "load_more_pip";
        c1601440rmA.LIZIZ = 2;
        return Ho().LIZJ(4, c1601440rmA.LIZ());
    }

    @Override // X.InterfaceC740200T1u
    public final boolean q9() {
        C1582010rGp c1582010rGp = C1582010rGp.LIZ;
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        c1582010rGp.getClass();
        return C1582010rGp.LIZ(this, strLIZ, null);
    }

    public final void Jo() {
        int iLJ;
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    iLJ = SettingsManager.LJ("tt_story2_fyp_skylight_init_between_first_frame_interval", 0);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    iLJ = 0;
                }
                long j = iLJ;
                if (j == 0 || ((Integer) C281140B0e.LIZ.getValue()).intValue() == 1) {
                    FeedSkylightServiceProviderImpl.LJIIIIZZ().LJ().LJII(this);
                } else {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragmentLJI), null, null, new C613920O6c(j, this, null), 3);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJ(e.getMessage());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C1255920ims KB1() {
        return Ho();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJJJJI() {
        if (isLoading()) {
            return false;
        }
        T t = Ho().LL;
        return t == 0 || ((C1601380rm4) t).LLIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LLLLL() {
        boolean zLJI = MethodIDManager.LJI(137682);
        boolean zEQ = EQ("");
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zEQ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        if (C300960Bqw.LIZ()) {
            C20684815ws.LIZ(C584960Mww.LIZ.LJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((IAccountService) this.LLJJJ.getValue()).LJIIJ().LJIILLIIL((InterfaceC427710Gpt) this.LLJJJIL.getValue());
        if (C300960Bqw.LIZ()) {
            C20684815ws.LJIJJLI(C584960Mww.LIZ.LJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean EQ(String str) {
        boolean z;
        boolean zLJI = MethodIDManager.LJI(137682);
        Ho().LLIZLLLIL = true;
        C1601440rmA c1601440rmA = new C1601440rmA();
        c1601440rmA.LIZ = getPanelContext().LIZLLL;
        if (str == null) {
            str = "prefetch";
        }
        c1601440rmA.LJJIZ = str;
        c1601440rmA.LIZIZ = 2;
        if (C1618110sD3.LIZ() && C1488520oq2.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        c1601440rmA.LJIILJJIL = z;
        boolean zLIZJ = Ho().LIZJ(4, c1601440rmA.LIZ());
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLIZJ;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, X.InterfaceC740200T1u
    public final boolean Ed(String str) {
        C1582010rGp c1582010rGp = C1582010rGp.LIZ;
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        c1582010rGp.getClass();
        return C1582010rGp.LIZ(this, strLIZ, str);
    }

    @Override // X.InterfaceC606880NrC
    public final boolean LLZLLIL(Aweme aweme) {
        boolean zLJIILLIIL;
        boolean zLJI = MethodIDManager.LJI(71690);
        C1582010rGp.LIZ.getClass();
        C1255920ims c1255920imsKB1 = KB1();
        if (c1255920imsKB1 != null) {
            zLJIILLIIL = c1255920imsKB1.LJIILLIIL(aweme);
        } else {
            zLJIILLIIL = false;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLJIILLIIL;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, X.InterfaceC606880NrC
    public final int Um(List<Aweme> list) {
        C1582010rGp.LIZ.getClass();
        C1255920ims c1255920imsKB1 = KB1();
        if (c1255920imsKB1 != null) {
            return c1255920imsKB1.LJIIZILJ(list);
        }
        return 0;
    }

    @Override // X.InterfaceC606880NrC
    public final boolean deleteItem(String str) {
        return C1582010rGp.LIZIZ(C1582010rGp.LIZ, this, str);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner viewLifecycleOwner;
        LifecycleOwner viewLifecycleOwner2;
        super.onViewCreated(view);
        SettingsManager.LIZLLL().getClass();
        long jLJ = SettingsManager.LJ("tt_story2_guide_card_component_init_delay", 5000);
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && (viewLifecycleOwner2 = fragmentLJI.getViewLifecycleOwner()) != null) {
                ((MutableLiveData) C1589010rS7.LIZ.getValue()).observe(viewLifecycleOwner2, new Observer<String>() { // from class: X.0rS5
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(String str) {
                        if (str != null) {
                            this.LL.LLJJJJ.run();
                            ((LiveData) C1589010rS7.LIZ.getValue()).removeObserver(this);
                        }
                    }
                });
                C786410Ut5.LJLIIL(jLJ, C799570VYd.LIZJ(), this.LLJJJJ);
            } else {
                C786410Ut5.LJLIIL(jLJ, C799570VYd.LIZJ(), this.LLJJJJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.LJLIIL(jLJ, C799570VYd.LIZJ(), this.LLJJJJ);
        }
        try {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && (viewLifecycleOwner = fragmentLJI2.getViewLifecycleOwner()) != null) {
                ((MutableLiveData) C1589010rS7.LIZ.getValue()).observe(viewLifecycleOwner, new Observer<String>() { // from class: X.0rS6
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(String str) {
                        if (str != null) {
                            this.LL.LLJJJJJIL.run();
                            ((LiveData) C1589010rS7.LIZ.getValue()).removeObserver(this);
                        }
                    }
                });
                C786410Ut5.LJLIIL(8000L, C799570VYd.LIZJ(), this.LLJJJJJIL);
            } else {
                C786410Ut5.LJLIIL(8000L, C799570VYd.LIZJ(), this.LLJJJJJIL);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C786410Ut5.LJLIIL(8000L, C799570VYd.LIZJ(), this.LLJJJJJIL);
        }
        if (!((IAccountService) this.LLJJJ.getValue()).LJIIJ().isLogin()) {
            ((IAccountService) this.LLJJJ.getValue()).LJIIJ().LJJIFFI((InterfaceC427710Gpt) this.LLJJJIL.getValue());
        }
    }
}

package com.ss.android.ugc.aweme.feed.panel;

import X.C00CB;
import X.C01GW;
import X.C05PZ;
import X.C0AH6;
import X.C0AJH;
import X.C0BOA;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0CN5;
import X.C0HTT;
import X.C0JBT;
import X.C0N1B;
import X.C0N1D;
import X.C0NDN;
import X.C0OF0;
import X.C0P13;
import X.C0PN0;
import X.C0R9L;
import X.C0S4J;
import X.C0SR4;
import X.C0SR5;
import X.C0SR8;
import X.C0SZ8;
import X.C0T17;
import X.C0XQ7;
import X.C1029590ctp;
import X.C1045340dJE;
import X.C1055280dZG;
import X.C1055290dZH;
import X.C1073600e2o;
import X.C1347505Pd;
import X.C1389890mGx;
import X.C1440005kM;
import X.C14EU;
import X.C1558520qew;
import X.C1583200rIk;
import X.C1589320rSc;
import X.C1589350rSf;
import X.C1589360rSg;
import X.C1589380rSi;
import X.C1589410rSl;
import X.C1589440rSo;
import X.C1589520rSw;
import X.C1601380rm4;
import X.C1601390rm5;
import X.C1603210rp1;
import X.C1720106oR;
import X.C1790906zr;
import X.C1834107Gh;
import X.C19EG;
import X.C1AF0;
import X.C1C7U;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21370218k8;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2277891EDz;
import X.C23250099c;
import X.C2547509yb;
import X.C259100ADk;
import X.C269430AhB;
import X.C278710Aw9;
import X.C285020BFc;
import X.C289790BXl;
import X.C295980Biu;
import X.C299830Bp7;
import X.C309530CBj;
import X.C312240CLu;
import X.C430590GuX;
import X.C484220Iyq;
import X.C590380NDo;
import X.C690420R6i;
import X.C690440R6k;
import X.C691870RBx;
import X.C714460S0u;
import X.C718580SGq;
import X.C729510SjV;
import X.C786410Ut5;
import X.C823050WQl;
import X.C849850XVn;
import X.EnumC1589340rSe;
import X.InterfaceC1601600rmQ;
import X.InterfaceC1864007Ru;
import X.InterfaceC665370Q7z;
import X.InterfaceC689860R4e;
import Y.AObjectS398S0100000_24;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS20S0101000_9;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.api.IFeedRecommendAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverAbility;
import com.ss.android.ugc.aweme.feed.component.RecommendInstantFeedAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager;
import com.ss.android.ugc.aweme.service.IDramaDiscoverService;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class RecommendFeedFragmentPanel extends FullFeedFragmentPanel implements InterfaceC1601600rmQ {
    public static final /* synthetic */ int m0 = 0;
    public final C0S4J a0;
    public InterfaceC1864007Ru b0;
    public IPipAbility c0;
    public int d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f375e0;
    public boolean f0;
    public FeedRefreshRecoverAbility g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public C0SR8 f376h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public volatile boolean f377i0;
    public final C1055280dZG j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public volatile boolean f378k0;
    public final C1055290dZH l0;

    public final void N() {
        this.f378k0 = false;
        if (C2547509yb.LIZ) {
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            try {
                C786410Ut5.LJIJJ(C786410Ut5.N3(getContext()), this.l0, intentFilter);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void T() {
        this.f377i0 = false;
        if (C2547509yb.LIZ) {
            try {
                C786410Ut5.LJIJJ(C786410Ut5.N3(getContext()), this.j0, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0dZG] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0dZH] */
    public RecommendFeedFragmentPanel() {
        super("homepage_hot", 0);
        this.a0 = new C0S4J("RecommendFeedFragmentPanel");
        this.d0 = 0;
        this.f375e0 = -1;
        this.f0 = false;
        this.g0 = null;
        this.f377i0 = true;
        this.j0 = new BroadcastReceiver() { // from class: X.0dZG
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (!this.LIZ.f377i0 && this.LIZ.getUserVisibleHint()) {
                        C1E95.LIZIZ.LJIIJ();
                        return;
                    }
                    return;
                }
                C2408409cA.LIZ();
                if (this.LIZ.f377i0 || !this.LIZ.getUserVisibleHint()) {
                    return;
                }
                C1E95.LIZIZ.LJIIJ();
            }
        };
        this.f378k0 = true;
        this.l0 = new BroadcastReceiver() { // from class: X.0dZH
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (!this.LIZ.f378k0 && this.LIZ.getUserVisibleHint()) {
                        C1E95.LIZIZ.LJJIII();
                        return;
                    }
                    return;
                }
                C2408409cA.LIZ();
                if (this.LIZ.f378k0 || !this.LIZ.getUserVisibleHint()) {
                    return;
                }
                C1E95.LIZIZ.LJJIII();
            }
        };
        new Function2<Integer, C00CB<Aweme>, Unit>() { // from class: X.0r4O
            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Integer num, C00CB<Aweme> c00cb) {
                Integer num2 = num;
                if (num2 != null && num2.intValue() == 1) {
                    List<Aweme> listLLZZZIL = this.LL.LLZZZIL();
                    if (!C086I.LIZIZ(listLLZZZIL) && c00cb != null) {
                        int size = 0;
                        int iMax = Math.max(this.LL.LJLLJ(), 0);
                        if (iMax >= 0) {
                            size = iMax;
                        }
                        if (size > listLLZZZIL.size()) {
                            size = listLLZZZIL.size();
                        }
                        if (C729980SkG.LJFF(null, listLLZZZIL) < 0) {
                            this.LL.LLJJJJLIIL.Gm2(null, size, C606500Nqa.LIZLLL);
                            if (PluggableExtentionKt.pluggableSpi(IPaidContentService.class) == null) {
                                INUJUnderTakeManager.LIZ.getClass();
                                C1589520rSw.LIZ().LJIIIIZZ();
                            } else {
                                IDramaDiscoverService.LIZ.getClass();
                                C1573420r2y.LIZ().LJFF();
                                throw null;
                            }
                        }
                    } else {
                        return Unit.LIZ;
                    }
                }
                return Unit.LIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJJJLIIL() {
        int iIntValue;
        INUJUnderTakeManager.LIZ.getClass();
        INUJUnderTakeManager iNUJUnderTakeManagerLIZ = C1589520rSw.LIZ();
        LJIIIIZZ();
        iNUJUnderTakeManagerLIZ.LJIIL();
        super.LLJJJJLIIL();
        INUJUnderTakeManager iNUJUnderTakeManagerLIZ2 = C1589520rSw.LIZ();
        LJIIIIZZ();
        iNUJUnderTakeManagerLIZ2.LJIIJJI();
        C849850XVn c849850XVn = C849850XVn.LIZIZ;
        if (!c849850XVn.LIZJ().LIZJ()) {
            if (c849850XVn.LIZJ().LJIILIIL()) {
                Fragment fragment = getFragment();
                if (c849850XVn.LIZJ().LJII()) {
                    if (fragment instanceof FeedRecommendFragment) {
                        C0XQ7.LJ();
                        int i = C0XQ7.LIZ.LJIIL().getLatestLoginMethodName().equals("facebook") ? 2 : 1;
                        Boolean bool = Boolean.TRUE;
                        C1440005kM.LIZ(new C1073600e2o(i, new Pair(bool, bool), true));
                    }
                } else if (c849850XVn.LIZJ().LJJII() && (fragment instanceof FeedRecommendFragment)) {
                    ((FeedRecommendFragment) fragment).dS();
                }
            } else if (C1589380rSi.LIZIZ.LIZIZ()) {
                if (LJLLJ() > c849850XVn.LIZJ().LJJIIZI()) {
                    c849850XVn.LIZJ().LIZ();
                }
                Fragment fragment2 = getFragment();
                if (c849850XVn.LIZJ().LJJIIZI() < 10) {
                    Activity activity = this.activity;
                    if (activity != null && activity.getIntent() != null) {
                        this.activity.getIntent().putExtra("from_new_user_journey", false);
                    }
                    ((IFriendsService) ServiceManager.get().getService(IFriendsService.class)).LJFF().LIZIZ();
                }
                if (c849850XVn.LIZJ().LJJIIZI() >= 10 && (fragment2 instanceof FeedRecommendFragment)) {
                    L();
                }
            }
        }
        if (C278710Aw9.LIZ() && !this.f0) {
            int iLJLLJ = LJLLJ();
            if (iLJLLJ > this.d0) {
                this.d0 = iLJLLJ;
            }
            if (!C2277891EDz.LIZIZ.LJIILJJIL().LIZIZ() || (iIntValue = this.f375e0) == -1) {
                iIntValue = ((Number) C0AJH.LIZ.getValue()).intValue();
            }
            if (this.d0 == iIntValue) {
                if (((Boolean) C0AH6.LIZ.getValue()).booleanValue()) {
                    C823050WQl.LIZLLL().submit(new ARunnableS112S0100000_12((Object) this, 187));
                } else {
                    U();
                }
                this.f0 = true;
            }
        }
        if (C1790906zr.LIZ()) {
            if (this.LLJJIJI != null) {
                HandlerHook.viewPost(this.LLJJIJI, new Runnable() { // from class: X.0T2i
                    public final void LIZ() {
                        if (this.LL.LLILLL() || this.LL.LJIIIIZZ() == null) {
                            return;
                        }
                        ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZIZ(this.LL.getFragment(), this.LL.LJIIIIZZ(), this.LL.xy2(), this.LL.LJIIIIZZ().isAd());
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("RecommendFeedFragmentPanel@f5b.onPageSelected$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("RecommendFeedFragmentPanel@f5b.onPageSelected$2");
                    }
                });
            }
        } else if (LJIIIIZZ() != null) {
            ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZIZ(getFragment(), LJIIIIZZ(), xy2(), LJIIIIZZ().isAd());
        }
        if (C295980Biu.LIZ()) {
            Aweme awemeLJIIIIZZ = LJIIIIZZ();
            if (awemeLJIIIIZZ == null) {
                C1347505Pd c1347505Pd = C1347505Pd.LIZ;
            } else {
                C1347505Pd.LIZ.getClass();
                C23250099c.LIZLLL(C1347505Pd.LIZIZ(), null, null, new C05PZ(awemeLJIIIIZZ, null), 3);
            }
        }
        if (C590380NDo.LIZIZ() && C289790BXl.LIZ() && LJIIIIZZ() != null) {
            C0N1B.LIZIZ(new C0NDN(xy2()));
            C0N1B.LIZIZ(new C0N1D(xy2()));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void LLZ() {
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this, 164);
        if (getFragment() != null) {
            C2277891EDz.LIZIZ.LIZLLL(getFragment().requireActivity(), LJIIIIZZ(), getFragment() != null ? IMainSAFLifecycleKt.findSAFExpLifecycleOwner(getFragment(), (C19EG) null) : null).LIZ();
            aRunnableS119S0100000_19.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final int LLZZLLIL() {
        C1601390rm5 c1601390rm5;
        if (this.f376h0 == null) {
            return -1;
        }
        Fragment fragment = getFragment();
        if (!(fragment instanceof FeedRecommendFragment) || (c1601390rm5 = ((FeedRecommendFragment) fragment).LLJLIL) == null) {
            return -1;
        }
        C1601380rm4 c1601380rm4 = (C1601380rm4) c1601390rm5.LL;
        if (c1601380rm4 instanceof C1589320rSc) {
            return ((C1589320rSc) c1601380rm4).LLJJJJLIIL;
        }
        return -1;
    }

    public final IPipAbility M() {
        if (this.c0 == null && k0() != null) {
            this.c0 = (IPipAbility) C1558520qew.LIZ(k0(), IPipAbility.class, null);
        }
        return this.c0;
    }

    public final void U() {
        if (this.b0 == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("FEED_UR_DOWNGRADE", "tryFetchBigCardDataOnce - fypRecUserBigCardController is null");
            return;
        }
        if ((C299830Bp7.LIZIZ() & 1) != 1) {
            this.b0.LIZ();
            return;
        }
        AObjectS398S0100000_24 aObjectS398S0100000_24 = new AObjectS398S0100000_24(this, 10);
        try {
            if (C0P13.LIZ()) {
                C823050WQl.LIZJ().execute(new ARunnableS103S0100000_3((Object) aObjectS398S0100000_24, 109));
            } else {
                aObjectS398S0100000_24.invoke();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void checkLoadMore() {
        if (this.LLLII == null) {
            C1AF0.LIZJ("loadmore");
        }
        super.checkLoadMore();
    }

    public static void L() {
        C0XQ7.LJ();
        if (!C0XQ7.LIZ.LJIIL().getLatestLoginMethodName().equals("facebook")) {
            Boolean bool = Boolean.TRUE;
            C1440005kM.LIZ(new C1073600e2o(1, new Pair(bool, bool), false));
        } else if (((ISocialFriendsService) ServiceManager.get().getService(ISocialFriendsService.class)).LJII(2).getFirst().booleanValue()) {
            C1589380rSi.LIZIZ.LIZ(false);
        } else {
            Boolean bool2 = Boolean.TRUE;
            C1440005kM.LIZ(new C1073600e2o(2, new Pair(bool2, bool2), false));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final boolean LJLJI() {
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility;
        boolean zLJLJI = super.LJLJI();
        IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi(IHomeSidebarService.class);
        if (iHomeSidebarService != null && iHomeSidebarService.LJ(this.activity)) {
            return true;
        }
        if (!zLJLJI) {
            return false;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null || (feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) C1558520qew.LIZ(interfaceC665370Q7z, FeedRecommendSkylightDrawerAbility.class, null)) == null) {
            return true;
        }
        return !feedRecommendSkylightDrawerAbility.yw0();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Ng1() {
        int iIntValue;
        super.Ng1();
        if (C0BOA.LIZ() && this.K) {
            String string = this.activity.getString(2131829440);
            if (C1589410rSl.LIZ) {
                iIntValue = 32;
            } else {
                Integer num = C1589410rSl.LIZIZ;
                iIntValue = num != null ? num.intValue() : 33;
            }
            CharSequence charSequenceLIZ = C430590GuX.LIZ(iIntValue, string);
            C1389890mGx c1389890mGx = new C1389890mGx(this.activity);
            c1389890mGx.LJIIJ(charSequenceLIZ);
            c1389890mGx.LJIIJJI();
            C1589410rSl.LIZ = false;
            C1589410rSl.LIZIZ = 0;
        }
    }

    public final void V() {
        if (getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            if (C1589440rSo.LIZ || C1589440rSo.LIZIZ) {
                if (C1589440rSo.LIZ) {
                    C1389890mGx c1389890mGx = new C1389890mGx(getFragment());
                    c1389890mGx.LJIIIZ(2131834996);
                    c1389890mGx.LJIIJJI();
                    C1589440rSo.LIZ = false;
                }
                if (C1589440rSo.LIZIZ) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(getFragment());
                    c1389890mGx2.LJIIIZ(2131834997);
                    c1389890mGx2.LJIIJJI();
                    C1589440rSo.LIZIZ = false;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroyView() {
        super.onDestroyView();
        C849850XVn.LIZIZ.LIZJ().LJJIJIIJIL();
        this.f378k0 = true;
        if (C2547509yb.LIZ) {
            try {
                C786410Ut5.LJJIFFI(C786410Ut5.N3(getContext()), this.l0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.f377i0 = true;
        if (C2547509yb.LIZ) {
            try {
                C786410Ut5.LJJIFFI(C786410Ut5.N3(getContext()), this.j0);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        INUJUnderTakeManager.LIZ.getClass();
        C1589520rSw.LIZ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onResume() {
        super.onResume();
        if (M() != null) {
            M().cq();
        }
        if (this.LLJJIJI != null) {
            HandlerHook.viewPost(this.LLJJIJI, new ARunnableS124S0100000_24(this, 137));
        }
        ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJIJJ();
        if (getUserVisibleHint()) {
            C849850XVn.LIZIZ.LIZJ().resume();
        }
    }

    public static /* synthetic */ void lambda$onViewCreated$0(RecommendFeedFragmentPanel recommendFeedFragmentPanel) {
        C1C7U.LIZ("RecommendFeedFragmentPanel@f5b.onViewCreated$1L");
        recommendFeedFragmentPanel.N();
        recommendFeedFragmentPanel.T();
        C1C7U.LIZIZ("RecommendFeedFragmentPanel@f5b.onViewCreated$1L");
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC1255930imt
    public final boolean B1(C0PN0<Aweme> c0pn0) {
        if (this.f376h0 == null) {
            super.B1(c0pn0);
            return true;
        }
        if (LLILLL() || this.LLJL == null) {
            return false;
        }
        List<Aweme> list = c0pn0.LJFF;
        int i = c0pn0.LIZIZ;
        boolean z = c0pn0.LIZLLL;
        int i2 = c0pn0.LIZJ;
        List<Aweme> list2 = c0pn0.LIZ;
        if (list != null && list.size() >= i) {
            if (this.LLJL.getCount() == 0) {
                this.LLJL.setData(list2);
            } else if (z) {
                this.LLJL.LJJLIIIJILLIZJL(i, i2, list2);
            }
        }
        if (this.LLJJJJLIIL != null && list2 != null) {
            String strLIZ = c0pn0.LJI;
            if (strLIZ == null && !list2.isEmpty()) {
                strLIZ = C0OF0.LIZ((Aweme) ListProtector.get(list2, 0));
            }
            this.LLJJJJLIIL.Aq2(i, strLIZ, list2);
        }
        return true;
    }

    @Override // X.InterfaceC1601600rmQ
    public final void LJIJJLI(Exception exc) {
        RecommendInstantFeedAbility recommendInstantFeedAbility = (RecommendInstantFeedAbility) C1558520qew.LIZ(this.LL, RecommendInstantFeedAbility.class, null);
        if (recommendInstantFeedAbility != null) {
            recommendInstantFeedAbility.Kh1(exc);
        }
    }

    @Override // X.InterfaceC1601600rmQ
    public final void LJJI(List<? extends Aweme> list) {
        RecommendInstantFeedAbility recommendInstantFeedAbility = (RecommendInstantFeedAbility) C1558520qew.LIZ(this.LL, RecommendInstantFeedAbility.class, null);
        if (recommendInstantFeedAbility != null) {
            recommendInstantFeedAbility.q02(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        super.LJJIJIIJI(str);
        C849850XVn c849850XVn = C849850XVn.LIZIZ;
        if (c849850XVn.LIZJ().LIZJ()) {
            if (c849850XVn.LIZJ().LJJIJIIJI() && c849850XVn.LIZJ().LJIJJLI()) {
                HandlerHook.viewPostDelay(this.LLJJIJI, new ARunnableS119S0100000_19(this, 165), 1000L);
            }
        } else if (!c849850XVn.LIZJ().LJIILIIL() && !C1589380rSi.LIZIZ.LIZIZ() && !c849850XVn.LIZJ().LJIIJJI()) {
            HandlerHook.viewPostDelay(this.LLJJIJI, new ARunnableS119S0100000_19(this, 166), 1000L);
            c849850XVn.LIZJ().LJJIII();
        }
        if (C590380NDo.LIZIZ() && !C289790BXl.LIZ() && LJIIIIZZ() != null) {
            C0N1B.LIZIZ(new C0NDN(xy2()));
            C0N1B.LIZIZ(new C0N1D(xy2()));
        }
        if (C295980Biu.LIZ() && ((Boolean) C259100ADk.LIZ.getValue()).booleanValue()) {
            Aweme awemeLJIIIIZZ = LJIIIIZZ();
            if (awemeLJIIIIZZ == null) {
                C1347505Pd c1347505Pd = C1347505Pd.LIZ;
            } else {
                C1347505Pd.LIZ.getClass();
                C23250099c.LIZLLL(C1347505Pd.LIZIZ(), null, null, new C05PZ(awemeLJIIIIZZ, null), 3);
            }
        }
        IFeedRecommendAppDiffProtocol.LIZ.getClass();
        IFeedRecommendAppDiffProtocol value = C1583200rIk.LIZIZ.getValue();
        LJIIIIZZ();
        getPlayerManager();
        value.LJII();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC1255930imt
    public final void LLLZZIL(List<Aweme> list) {
        C0SR4 c0sr4 = this.LLJL;
        if (c0sr4 != null) {
            c0sr4.LJJLIIIJLJLI(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC581700Mrg
    public final int hu(Aweme aweme) {
        C0SR8 c0sr8 = this.f376h0;
        if (c0sr8 != null) {
            return c0sr8.au(aweme);
        }
        return super.hu(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final boolean i(String str) {
        C1601390rm5 c1601390rm5;
        C1601380rm4 c1601380rm4;
        FeedItemList feedItemList;
        List<Aweme> awemeList;
        Aweme aweme;
        Fragment fragment = getFragment();
        if (!(fragment instanceof FeedRecommendFragment) || (c1601390rm5 = ((FeedRecommendFragment) fragment).LLJLIL) == null || (c1601380rm4 = (C1601380rm4) c1601390rm5.LL) == null || (feedItemList = c1601380rm4.LLILZ) == null || (awemeList = feedItemList.getAwemeList()) == null || awemeList.isEmpty() || (aweme = (Aweme) ListProtector.get(awemeList, 0)) == null) {
            return false;
        }
        return TextUtils.equals(aweme.getAid(), str);
    }

    @C14EU
    public void onAdTabChangedEvent(C0T17 c0t17) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        boolean zEquals = TextUtils.equals(c0t17.LIZ, "For You");
        ((C1045340dJE) C1029590ctp.LIZ()).LJIL(getContext(), BaseListFragmentPanel.LJLLLLLL(LJLIL()), LJIIIIZZ(), zEquals);
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null) {
            interfaceC689860R4eK9.LJJIIJ(zEquals);
            interfaceC689860R4eK9.LLILLL(zEquals);
            if (!zEquals) {
                interfaceC689860R4eK9.LLFII(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onFriendsTabCleanModeChangedEvent(C718580SGq c718580SGq) {
        boolean z = C690440R6k.LIZ().LIZLLL;
        if (!LLILLL() && this.LLJJIJI != null) {
            for (int i = 0; i < this.LLJJIJI.getChildCount(); i++) {
                C0SZ8 c0sz8LJLJJI = LJLJJI(i);
                if (c0sz8LJLJJI != null) {
                    c0sz8LJLJJI.LJIIZILJ(z);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        Fragment fragment;
        JSONObject jSONObjectOptJSONObject;
        super.onJsBroadCastEvent(c484220Iyq);
        JSONObject jSONObject = c484220Iyq.LIZ;
        if (jSONObject == null || !TextUtils.equals(jSONObject.optString("eventName"), "videoReportSuccess") || (fragment = getFragment()) == null || fragment.isHidden() || !this.LLLZZ || (jSONObjectOptJSONObject = c484220Iyq.LIZ.optJSONObject("data")) == null) {
            return;
        }
        ComplianceServiceProvider.LJIJJ().LJIIZILJ(getContext(), this, jSONObjectOptJSONObject);
    }

    @C14EU
    public void onLandPagePopupWebShowEvent(C691870RBx c691870RBx) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        Activity activity;
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null && (activity = this.activity) != null && (activity instanceof C19EG) && Hox.AQ2((C19EG) activity).KQ2("For You")) {
            interfaceC689860R4eK9.LJLLLLLL(c691870RBx);
        }
    }

    @C14EU
    public void onLandPagePopupWebShowPauseEvent(C690420R6i c690420R6i) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        Activity activity;
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null && (activity = this.activity) != null && (activity instanceof C19EG) && Hox.AQ2((C19EG) activity).KQ2("For You")) {
            interfaceC689860R4eK9.LLJJL(c690420R6i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        V();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[PHI: r0
      0x00f2: PHI (r0v35 com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverAbility) = 
      (r0v34 com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverAbility)
      (r0v38 com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverAbility)
     binds: [B:34:0x00e2, B:36:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJIL(java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel.LLJJJIL(java.util.List, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        boolean z2;
        int size;
        if (!z || this.LLILZLL == null || this.LLILZIL == null) {
            C0S4J c0s4j = this.a0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onLoadMoreResult] abnormal loadmore state, hasMore=");
            sbLIZ.append(z);
            sbLIZ.append(",loadMoreAbilityNull=");
            boolean z3 = true;
            if (this.LLILZLL == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            sbLIZ.append(",refreshAbilityNull=");
            if (this.LLILZIL != null) {
                z3 = false;
            }
            sbLIZ.append(z3);
            c0s4j.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadmore ");
            sbLIZ2.append(z);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (list == null || list.size() < 5) {
            C0S4J c0s4j2 = this.a0;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[onLoadMoreResult] small result, size=");
            if (list == null) {
                size = -1;
            } else {
                size = list.size();
            }
            sbLIZ3.append(size);
            c0s4j2.LJIILL(C2188811AlT.LIZIZ(sbLIZ3));
            C1AF0.LIZJ("loadmore empty");
        }
        super.Pj(list, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        new Date().getTime();
        this.activity.getWindow().setBackgroundDrawableResource(R.color.b6);
        if (k0() != null) {
            this.c0 = (IPipAbility) C1558520qew.LIZ(k0(), IPipAbility.class, null);
        }
        C21370218k8.LJIILL = ((Boolean) C309530CBj.LIZ.getValue()).booleanValue();
        View viewFindViewById = view.findViewById(R.id.nns);
        if (viewFindViewById != null && C1834107Gh.LIZ()) {
            viewFindViewById.setBackground(null);
        }
        if (C1834107Gh.LIZ() && (viewFindViewById instanceof C1603210rp1)) {
            ((C1603210rp1) viewFindViewById).setEnableOverdarwOpt(true);
        }
        long j = C285020BFc.LIZ;
        if (j != -1) {
            C0CN5.LIZJ(Long.valueOf(j), new ARunnableS124S0100000_24(this, 139), false);
        } else {
            N();
            T();
        }
        C1589360rSg c1589360rSg = C1589360rSg.LIZ;
        Activity activity = this.activity;
        c1589360rSg.getClass();
        if (activity != null) {
            if (C1589360rSg.LJ) {
                C1589360rSg.LJ = false;
                if (activity instanceof C19EG) {
                    C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), C0CME.FIRST_VIDEO_SHOW, "recreate_register_receiver", new C0JBT(activity), true));
                }
            } else {
                if ((activity.getIntent().getFlags() & 32768) == 32768 && C1589360rSg.LIZJ != EnumC1589340rSe.RECREATE) {
                    C1589360rSg.LIZJ = EnumC1589340rSe.CLEAR_ACTIVITY;
                }
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("reason", C1589360rSg.LIZJ.name());
                if (C1589360rSg.LIZIZ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[1] = new Pair("has_cache", str);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                if (C1589350rSf.LIZ[C1589360rSg.LIZJ.ordinal()] == 1) {
                    mapLJIIJ.put("configChange", String.valueOf(C1589360rSg.LIZLLL));
                }
                C20684815ws.LJIILLIIL("rd_feed_fyp_new_instance", mapLJIIJ);
                C1589360rSg.LIZJ = EnumC1589340rSe.OTHER;
                C1589360rSg.LIZLLL = 0;
            }
        }
        INUJUnderTakeManager.LIZ.getClass();
        C1589520rSw.LIZ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC1255930imt
    public final void w(int i, List list) {
        C0SR4 c0sr4;
        if (!LLILLL() && (c0sr4 = this.LLJL) != null && this.LLJJIJI != null) {
            if (c0sr4.getCount() == 0) {
                this.LLJL.setData(list);
            } else {
                this.LLJL.LJJLIIIJILLIZJL(i, 1, list);
            }
            if (i >= 0 && i < this.LLJL.getCount()) {
                this.LLJJIJI.setCurrentItem(i);
                Aweme item = this.LLJL.getItem(i);
                if (C729510SjV.LJJIIZ(item)) {
                    LJLIL().LJJJJ(i, item);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJIJIIJIL(boolean z, Aweme aweme, Aweme aweme2) {
        if (M() != null && M().ty2()) {
            return;
        }
        super.LLJJIJIIJIL(z, aweme, aweme2);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(Context context, LayoutInflater layoutInflater, C0HTT c0htt, Fragment fragment, C714460S0u c714460S0u, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l) {
        C01GW c01gw = C269430AhB.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            if (((Number) c01gw.getValue()).intValue() == 2) {
                this.f376h0 = new C0SR8() { // from class: X.00rO
                    public final ArrayList<Aweme> LIZ = new ArrayList<>();
                    public boolean LIZIZ;
                    public IllegalStateException LIZJ;

                    public final void LIZIZ() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Container updated current count: ");
                        sbLIZ.append(this.LIZ.size());
                        this.LIZJ = new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.C0SR8
                    public final void clear() {
                        if (this.LIZIZ) {
                            LIZIZ();
                        }
                        this.LIZ.clear();
                    }

                    @Override // X.C0SR8
                    public final List<Aweme> getList() {
                        return new ArrayList(this.LIZ);
                    }

                    @Override // X.C0SR8
                    public final int getSize() {
                        return this.LIZ.size();
                    }

                    @Override // X.C0SR8
                    public final boolean isEmpty() {
                        return this.LIZ.isEmpty();
                    }

                    @Override // X.C0SR8
                    public final Exception hu() {
                        return this.LIZJ;
                    }

                    @Override // X.C0SR8
                    public final int LIZ(Aweme aweme) {
                        if (this.LIZIZ) {
                            LIZIZ();
                        }
                        int iAu = au(aweme);
                        if (iAu >= 0) {
                            ListProtector.remove(this.LIZ, iAu);
                        }
                        return iAu;
                    }

                    @Override // X.C0SR8
                    public final void LIZLLL(List<? extends Aweme> list) {
                        if (this.LIZIZ) {
                            LIZIZ();
                        }
                        int size = this.LIZ.size();
                        this.LIZ.addAll(list);
                        int i = 0;
                        for (Aweme aweme : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                AwemeBizExtKt.setAwemePosition(aweme, i + size);
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }

                    @Override // X.C0SR8
                    public final int au(Aweme aweme) {
                        ArrayList<Aweme> arrayList = this.LIZ;
                        ListIterator<Aweme> listIterator = arrayList.listIterator(arrayList.size());
                        while (listIterator.hasPrevious()) {
                            if (Intrinsics.LJFF(listIterator.previous().getAid(), aweme.getAid())) {
                                return listIterator.nextIndex();
                            }
                        }
                        return -1;
                    }

                    @Override // X.C0SR8
                    public final int du(String str) {
                        ArrayList<Aweme> arrayList = this.LIZ;
                        ListIterator<Aweme> listIterator = arrayList.listIterator(arrayList.size());
                        while (listIterator.hasPrevious()) {
                            if (Intrinsics.LJFF(listIterator.previous().getAid(), str)) {
                                return listIterator.nextIndex();
                            }
                        }
                        return -1;
                    }

                    @Override // X.C0SR8
                    public final Aweme eu(int i) {
                        if (i >= 0 && i < this.LIZ.size()) {
                            if (this.LIZIZ) {
                                LIZIZ();
                            }
                            return (Aweme) ListProtector.remove(this.LIZ, i);
                        }
                        return null;
                    }

                    @Override // X.C0SR8
                    public final void fu(boolean z) {
                        this.LIZIZ = z;
                    }

                    @Override // X.C0SR8
                    public final Aweme getItem(int i) {
                        if (i >= 0) {
                            try {
                                if (i < this.LIZ.size()) {
                                    return this.LIZ.get(i);
                                }
                                return null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }
                        return null;
                    }

                    @Override // X.C0SR8
                    public final void setData(List<? extends Aweme> list) {
                        if (this.LIZIZ) {
                            LIZIZ();
                        }
                        this.LIZ.clear();
                        this.LIZ.addAll(list);
                        int i = 0;
                        for (Aweme aweme : this.LIZ) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                AwemeBizExtKt.setAwemePosition(aweme, i);
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }

                    @Override // X.C0SR8
                    public final void bu(int i, Aweme aweme) {
                        if (this.LIZIZ) {
                            LIZIZ();
                        }
                        ListProtector.add(this.LIZ, i, aweme);
                        AwemeBizExtKt.setAwemePosition(aweme, i);
                    }

                    @Override // X.C0SR8
                    public final void gu(int i, List<? extends Aweme> list) {
                        if (this.LIZIZ) {
                            LIZIZ();
                        }
                        this.LIZ.addAll(i, list);
                    }

                    @Override // X.C0SR8
                    public final void iu(int i, Aweme aweme) {
                        if (i >= 0 && i < this.LIZ.size()) {
                            ListProtector.set(this.LIZ, i, aweme);
                            AwemeBizExtKt.setAwemePosition(aweme, i);
                        }
                    }

                    @Override // X.C0SR8
                    public final List cu(int i, int i2, List list) {
                        if (this.LIZIZ) {
                            LIZIZ();
                        }
                        List<Aweme> listSubList = this.LIZ.subList(i, i2);
                        ArrayList arrayList = new ArrayList(listSubList);
                        listSubList.clear();
                        this.LIZ.addAll(i, list);
                        return arrayList;
                    }
                };
            } else {
                this.f376h0 = new C0SR8() { // from class: X.00rP
                    public final HashMap<String, Integer> LIZ = new HashMap<>();
                    public final ArrayList<Aweme> LIZIZ = new ArrayList<>();
                    public final boolean LIZJ = true;

                    @Override // X.C0SR8
                    public final void fu(boolean z) {
                    }

                    @Override // X.C0SR8
                    public final Exception hu() {
                        return null;
                    }

                    @Override // X.C0SR8
                    public final void clear() {
                        this.LIZ.clear();
                        this.LIZIZ.clear();
                    }

                    @Override // X.C0SR8
                    public final List<Aweme> getList() {
                        return new ArrayList(this.LIZIZ);
                    }

                    @Override // X.C0SR8
                    public final int getSize() {
                        return this.LIZIZ.size();
                    }

                    @Override // X.C0SR8
                    public final boolean isEmpty() {
                        return this.LIZIZ.isEmpty();
                    }

                    @Override // X.C0SR8
                    public final int LIZ(Aweme aweme) {
                        int iAu = au(aweme);
                        eu(iAu);
                        return iAu;
                    }

                    public final void LIZJ(Aweme aweme) {
                        String strLIZIZ = C607430Ns5.LIZIZ(aweme);
                        if (!C607430Ns5.LIZ(aweme) && this.LIZ.containsKey(strLIZIZ)) {
                            LIZIZ(0, aweme);
                            return;
                        }
                        this.LIZIZ.add(aweme);
                        int size = this.LIZIZ.size() - 1;
                        this.LIZ.put(strLIZIZ, Integer.valueOf(size));
                        AwemeBizExtKt.setAwemePosition(aweme, size);
                    }

                    @Override // X.C0SR8
                    public final void LIZLLL(List<? extends Aweme> list) {
                        Iterator<? extends Aweme> it2 = list.iterator();
                        while (it2.hasNext()) {
                            LIZJ(it2.next());
                        }
                    }

                    @Override // X.C0SR8
                    public final int au(Aweme aweme) {
                        Integer num = this.LIZ.get(C607430Ns5.LIZIZ(aweme));
                        if (num != null) {
                            return num.intValue();
                        }
                        return -1;
                    }

                    @Override // X.C0SR8
                    public final int du(String str) {
                        Integer num = this.LIZ.get(str);
                        if (num != null) {
                            return num.intValue();
                        }
                        return -1;
                    }

                    @Override // X.C0SR8
                    public final Aweme eu(int i) {
                        if (i >= 0 && i < this.LIZIZ.size()) {
                            Aweme aweme = (Aweme) ListProtector.remove(this.LIZIZ, i);
                            this.LIZ.remove(C607430Ns5.LIZIZ(aweme));
                            int size = this.LIZIZ.size();
                            while (i < size) {
                                Aweme aweme2 = (Aweme) ListProtector.get(this.LIZIZ, i);
                                AwemeBizExtKt.setAwemePosition(aweme2, i);
                                this.LIZ.put(C607430Ns5.LIZIZ(aweme2), Integer.valueOf(i));
                                i++;
                            }
                            return aweme;
                        }
                        return null;
                    }

                    @Override // X.C0SR8
                    public final Aweme getItem(int i) {
                        if (i >= 0 && i < getSize()) {
                            return (Aweme) ListProtector.get(this.LIZIZ, i);
                        }
                        return null;
                    }

                    @Override // X.C0SR8
                    public final void setData(List<? extends Aweme> list) {
                        this.LIZ.clear();
                        this.LIZIZ.clear();
                        Iterator<? extends Aweme> it2 = list.iterator();
                        while (it2.hasNext()) {
                            LIZJ(it2.next());
                        }
                    }

                    public final void LIZIZ(int i, Aweme aweme) {
                        if (this.LIZJ && C0SRA.LIZ) {
                            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS20S0101000_9(i, aweme, 0));
                        }
                    }

                    @Override // X.C0SR8
                    public final void bu(int i, Aweme aweme) {
                        if (i >= 0 && i <= this.LIZIZ.size()) {
                            String strLIZIZ = C607430Ns5.LIZIZ(aweme);
                            if (!C607430Ns5.LIZ(aweme) && this.LIZ.containsKey(strLIZIZ)) {
                                LIZIZ(1, aweme);
                                return;
                            }
                            ListProtector.add(this.LIZIZ, i, aweme);
                            this.LIZ.put(strLIZIZ, Integer.valueOf(i));
                            int size = this.LIZIZ.size();
                            for (int i2 = i + 1; i2 < size; i2++) {
                                Aweme aweme2 = (Aweme) ListProtector.get(this.LIZIZ, i2);
                                AwemeBizExtKt.setAwemePosition(aweme2, i2);
                                this.LIZ.put(C607430Ns5.LIZIZ(aweme2), Integer.valueOf(i2));
                            }
                        }
                    }

                    @Override // X.C0SR8
                    public final void gu(int i, List<? extends Aweme> list) {
                        if (i >= 0 && i <= this.LIZIZ.size()) {
                            ArrayList arrayList = new ArrayList();
                            int i2 = i;
                            for (Aweme aweme : list) {
                                String strLIZIZ = C607430Ns5.LIZIZ(aweme);
                                if (!C607430Ns5.LIZ(aweme) && this.LIZ.containsKey(strLIZIZ)) {
                                    LIZIZ(1, aweme);
                                } else {
                                    arrayList.add(aweme);
                                    this.LIZ.put(strLIZIZ, Integer.valueOf(i2));
                                    AwemeBizExtKt.setAwemePosition(aweme, i2);
                                    i2++;
                                }
                            }
                            this.LIZIZ.addAll(i, arrayList);
                            int size = this.LIZIZ.size();
                            for (int size2 = i + arrayList.size(); size2 < size; size2++) {
                                Aweme aweme2 = (Aweme) ListProtector.get(this.LIZIZ, size2);
                                AwemeBizExtKt.setAwemePosition(aweme2, size2);
                                this.LIZ.put(C607430Ns5.LIZIZ(aweme2), Integer.valueOf(size2));
                            }
                        }
                    }

                    @Override // X.C0SR8
                    public final void iu(int i, Aweme aweme) {
                        if (!C607430Ns5.LIZ(aweme) && this.LIZ.containsKey(C607430Ns5.LIZIZ(aweme))) {
                            return;
                        }
                        Aweme aweme2 = (Aweme) ListProtector.get(this.LIZIZ, i);
                        ListProtector.set(this.LIZIZ, i, aweme);
                        this.LIZ.remove(C607430Ns5.LIZIZ(aweme2));
                        this.LIZ.put(C607430Ns5.LIZIZ(aweme), Integer.valueOf(i));
                    }

                    @Override // X.C0SR8
                    public final List cu(int i, int i2, List list) {
                        List<Aweme> listSubList = this.LIZIZ.subList(i, i2);
                        ArrayList arrayList = new ArrayList(listSubList);
                        Iterator<Aweme> it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            this.LIZ.remove(C607430Ns5.LIZIZ(it2.next()));
                        }
                        listSubList.clear();
                        gu(i, list);
                        return arrayList;
                    }
                };
            }
            return new C0SR5(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l, this.f376h0);
        }
        return super.LJJLIIIJLJLI(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l);
    }
}

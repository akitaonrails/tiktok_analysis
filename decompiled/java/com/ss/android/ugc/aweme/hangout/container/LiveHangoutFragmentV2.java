package com.ss.android.ugc.aweme.hangout.container;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0IGQ;
import X.C0PEM;
import X.C0ZP4;
import X.C1161920gLG;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11JF;
import X.C11NZ;
import X.C1361400lX0;
import X.C13LE;
import X.C13LP;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1EOY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C475260IkO;
import X.C477860Ioa;
import X.C477930Ioh;
import X.C478090Iox;
import X.C478540Ipg;
import X.C478550Iph;
import X.C478580Ipk;
import X.C478590Ipl;
import X.C478750Iq1;
import X.C478920IqI;
import X.C478950IqL;
import X.C479140Iqe;
import X.C479250Iqp;
import X.C479300Iqu;
import X.C479440Ir8;
import X.C479450Ir9;
import X.C479670IrV;
import X.C479760Ire;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC475180IkG;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC475150IkD;
import X.InterfaceC475300IkS;
import X.InterfaceC479210Iql;
import X.InterfaceC479780Irg;
import X.InterfaceC479830Irl;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AComparatorS26S0000000_7;
import Y.AObserverS211S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.AfS176S0100000_7;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutBackupRoomFeedLoadedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutTopliveCrashFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkHangoutPeriodFluencyEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestTopLiveCenterEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TtliveHangoutEnableLiveCardAudioPlayerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestTopLivePushCardConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.NotConsumeControlsModel;
import com.bytedance.android.livesdkapi.TopLiveRandomMatchFragmentShowEvent;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectionVM;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.HangoutRoomFeedViewModel;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;
import com.ss.android.ugc.aweme.hangout.component.push.MultiGuestTopLivePushCardFragment;
import com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS4S0020000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHangoutFragmentV2 extends AbsTabFragment implements C0IGQ, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi0tJyg8PTFiHELIOSKiA9PCQlJyohZgklPyobKSsrJjonDjctLiI2JjEaew==";
    public volatile boolean LLILLJJLI;
    public boolean LLILLL = true;
    public InterfaceC479780Irg<?> LLILZ;
    public boolean LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public ViewStub LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC475300IkS LLJILJILJ;
    public final int LLJILLL;
    public final EnumC475180IkG LLJJ;
    public final int LLJJI;
    public WeakReference<View> LLJJIII;
    public Drawable LLJJIJI;
    public final ARunnableS107S0100000_7 LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveHangoutFragmentV2.class, "interactionVM", "getInteractionVM()Lcom/ss/android/ugc/aweme/hangout/component/interact/viewmodel/MultiTopLiveInteractModuleVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LiveHangoutFragmentV2.class, "playFeedListVM", "getPlayFeedListVM()Lcom/ss/android/ugc/aweme/hangout/component/livecard/viewmodel/MultiTopLivePlayFeedListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(LiveHangoutFragmentV2.class, "roomFeedVM", "getRoomFeedVM()Lcom/ss/android/ugc/aweme/hangout/component/livecard/viewmodel/HangoutRoomFeedViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(LiveHangoutFragmentV2.class, "hangoutSelectionVM", "getHangoutSelectionVM()Lcom/ss/android/ugc/aweme/hangout/common/contract/LiveHangoutV2SelectionVM;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC479810Irj
    public final Fragment LLLIILIL() {
        return this;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0IGQ
    public final boolean onBackPressed() {
        C477860Ioa.LJI = true;
        C479670IrV.LIZ(8, "hangout");
        return false;
    }

    public LiveHangoutFragmentV2() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        boolean z;
        AssemVMLazy assemVMLazy3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLiveInteractModuleVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 293);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(101);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 295), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 296), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 297), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MultiTopLivePlayFeedListViewModel.class);
        AwS551S0100000_7 awS551S0100000_72 = new AwS551S0100000_7(c19719912DlLIZ2, 298);
        AFwS237S0000000_7 aFwS237S0000000_72 = AFwS237S0000000_7.get$arr$(102);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS551S0100000_72, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 299), aFwS237S0000000_72, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS551S0100000_72, new AwS551S0100000_7((Fragment) this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), aFwS237S0000000_72, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS551S0100000_72, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 285), aFwS237S0000000_72, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(HangoutRoomFeedViewModel.class);
        AwS551S0100000_7 awS551S0100000_73 = new AwS551S0100000_7(c19719912DlLIZ3, 286);
        AFwS237S0000000_7 aFwS237S0000000_73 = AFwS237S0000000_7.get$arr$(99);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS551S0100000_73, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 287), aFwS237S0000000_73, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS551S0100000_73, new AwS551S0100000_7((Fragment) this, 288), aFwS237S0000000_73, null, null, null);
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS551S0100000_73, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 289), aFwS237S0000000_73, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy2;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(LiveHangoutV2SelectionVM.class);
        AwS551S0100000_7 awS551S0100000_74 = new AwS551S0100000_7(c19719912DlLIZ4, 290);
        AFwS237S0000000_7 aFwS237S0000000_74 = AFwS237S0000000_7.get$arr$(100);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS551S0100000_74, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 291), aFwS237S0000000_74, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS551S0100000_74, new AwS551S0100000_7((Fragment) this, 292), aFwS237S0000000_74, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS551S0100000_74, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 294), aFwS237S0000000_74, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLIZLLLIL = assemVMLazy3;
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 284));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 283));
        TiktokLiveTopLiveArchitectureOptSetting tiktokLiveTopLiveArchitectureOptSetting = TiktokLiveTopLiveArchitectureOptSetting.INSTANCE;
        int i = tiktokLiveTopLiveArchitectureOptSetting.getValue().preloadTiming;
        this.LLJILLL = i;
        this.LLJJ = i == 1 ? EnumC475180IkG.STREAM_END : EnumC475180IkG.WIDGET_LOADED_END;
        this.LLJJI = tiktokLiveTopLiveArchitectureOptSetting.getValue().preloadType;
        this.LLJJIJIIJIL = new ARunnableS107S0100000_7(this, 123);
    }

    public final MultiTopLivePlayFeedListViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (MultiTopLivePlayFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "onDestroy");
        C478090Iox c478090Iox = (C478090Iox) this.LLJIJIL.getValue();
        if (c478090Iox != null) {
            c478090Iox.LIZLLL();
        }
        if (LiveSdkHangoutPeriodFluencyEnableSetting.INSTANCE.isEnable()) {
            C1EOY.LIZ.LJJIIJ();
        }
        this.LLJILJIL = false;
        this.LLILLL = false;
        C477930Ioh c477930Ioh = (C477930Ioh) this.LLJI.getValue();
        c477930Ioh.LIZIZ();
        c477930Ioh.LIZLLL = false;
        c477930Ioh.LIZJ = null;
        ((ArrayList) C478550Iph.LIZIZ).clear();
        ((ArrayList) C478550Iph.LIZLLL).clear();
        ((ArrayList) C478550Iph.LJ).clear();
        C478550Iph.LJFF.clear();
        C477860Ioa.LJIILIIL();
        C478920IqI.LIZ.getClass();
        C478920IqI.LIZJ = 0L;
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "MultiTopLiveDataCacheManager Card feed data fetch timestamp reset");
        DataChannelGlobal.LLILZ.zQ2(this);
        C478920IqI.LIZJ();
        C478580Ipk.LIZ("hangoutFragment#onDestroy");
        C479670IrV.LIZ.getClass();
        C479670IrV.LIZIZ = "discover";
        C479670IrV.LIZJ = "";
        C479670IrV.LIZLLL = "none";
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            MR().CQ2();
        }
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null) {
            iPullStreamService.v42();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view;
        super.onDestroyView();
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "onDestroyView");
        C478090Iox c478090Iox = (C478090Iox) this.LLJIJIL.getValue();
        if (c478090Iox != null) {
            c478090Iox.LIZLLL();
        }
        if (LiveSdkHangoutPeriodFluencyEnableSetting.INSTANCE.isEnable()) {
            C1EOY.LIZ.LJJIIJ();
        }
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            MR().CQ2();
        }
        boolean z = C479760Ire.LJIJI;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLJJIJIIJIL;
        LinkedHashSet<Runnable> linkedHashSet = C479760Ire.LJIJJ;
        synchronized (linkedHashSet) {
            try {
                linkedHashSet.remove(aRunnableS107S0100000_7);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        WeakReference<View> weakReference = this.LLJJIII;
        if (weakReference != null && (view = weakReference.get()) != null) {
            view.setBackground(this.LLJJIJI);
        }
        this.LLJJIJI = null;
        this.LLJJIII = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C477930Ioh c477930Ioh = (C477930Ioh) this.LLJI.getValue();
        if (c477930Ioh.LIZLLL && c477930Ioh.LIZ()) {
            MultiGuestTopLivePushCardFragment multiGuestTopLivePushCardFragment = c477930Ioh.LIZJ;
            if (multiGuestTopLivePushCardFragment == null) {
                c477930Ioh.LIZLLL = false;
                return;
            }
            if (c477930Ioh.LIZ()) {
                try {
                    multiGuestTopLivePushCardFragment.dismiss();
                    c477930Ioh.LIZJ = null;
                    c477930Ioh.LIZLLL = false;
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF(c477930Ioh.LIZIZ, "dismiss pushCardDialog failed", e);
                }
            }
        }
    }

    @Override // X.InterfaceC479810Irj
    public final void IR(int i) {
        InterfaceC475150IkD interfaceC475150IkD;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        C479450Ir9 c479450Ir9;
        String str;
        C479450Ir9 c479450Ir92;
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "onSelected");
        this.LLILLJJLI = true;
        C479250Iqp.LIZ = true;
        C478090Iox c478090Iox = (C478090Iox) this.LLJIJIL.getValue();
        if (c478090Iox != null) {
            c478090Iox.LJ(Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        if (LiveSdkHangoutPeriodFluencyEnableSetting.INSTANCE.isEnable()) {
            C1EOY c1eoy = C1EOY.LIZ;
            if (!Intrinsics.LJFF(C1EOY.LJIILL, "toplive_hangout_page_period")) {
                c1eoy.LJJ();
                C1EOY.LJIILL = "toplive_hangout_page_period";
                c1eoy.LJIILL();
            }
        }
        if ((!isAdded() || getActivity() == null || getContext() == null || isDetached() || isRemoving()) && (interfaceC475150IkD = this.LL) != null) {
            interfaceC475150IkD.rf();
        }
        if (this.LLJILJIL) {
            C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
            if (c479440Ir8 != null && (c479450Ir92 = c479440Ir8.LIZIZ) != null) {
                c479450Ir92.LIZJ(System.currentTimeMillis());
            }
            C479440Ir8 c479440Ir82 = C478750Iq1.LIZ;
            if (c479440Ir82 != null && (c479450Ir9 = c479440Ir82.LIZIZ) != null) {
                if (C478950IqL.LIZ()) {
                    str = "expired";
                } else {
                    str = "cached";
                }
                c479450Ir9.LJII = str;
            }
            C479670IrV.LIZJ("V2 onSelected");
        }
        System.currentTimeMillis();
        C477930Ioh c477930Ioh = (C477930Ioh) this.LLJI.getValue();
        C20441214yg.LIZIZ(c477930Ioh.LIZIZ, "tryShowPushCard");
        MultiGuestTopLivePushCardConfig multiGuestTopLivePushCardConfig = MultiGuestTopLivePushCardConfig.INSTANCE;
        if (multiGuestTopLivePushCardConfig.enable()) {
            C479300Iqu.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_date:");
            sbLIZ.append(C479300Iqu.LIZ().getString("multi_guest_top_live_push_card_last_show_date", ""));
            sbLIZ.append(",not_consume_count:");
            sbLIZ.append(C479300Iqu.LIZ().getInt("multi_guest_top_live_push_card_not_consume_count", 0));
            C20441214yg.LIZIZ("MultiGuestTopLivePushCardControlUtil", C2188811AlT.LIZIZ(sbLIZ));
            if (!Intrinsics.LJFF(C479300Iqu.LIZ().getString("multi_guest_top_live_push_card_last_show_date", ""), C479300Iqu.LIZIZ())) {
                Iterator it2 = C13LP.LJLLLL(new AComparatorS26S0000000_7(4), multiGuestTopLivePushCardConfig.getNotConsumeControls()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        NotConsumeControlsModel notConsumeControlsModel = (NotConsumeControlsModel) it2.next();
                        Integer num = notConsumeControlsModel.notConsumeTimes;
                        Integer num2 = notConsumeControlsModel.notConsumeGapDay;
                        if (num != null && num2 != null) {
                            C479300Iqu.LIZ.getClass();
                            if (C479300Iqu.LIZ().getInt("multi_guest_top_live_push_card_not_consume_count", 0) >= num.intValue() && System.currentTimeMillis() - C479300Iqu.LIZ().getLong("multi_guest_top_live_push_card_not_consume_timestamp", 0L) < num2.intValue() * 24 * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
                                break;
                            }
                        }
                    } else {
                        MultiGuestTopLivePushCardFragment multiGuestTopLivePushCardFragment = c477930Ioh.LIZJ;
                        if (multiGuestTopLivePushCardFragment == null || !multiGuestTopLivePushCardFragment.isVisible()) {
                            C11JF c11jf = c477930Ioh.LJ;
                            if (c11jf != null && !c11jf.isDisposed()) {
                                C11JF c11jf2 = c477930Ioh.LJ;
                                if (c11jf2 != null) {
                                    c11jf2.dispose();
                                }
                                c477930Ioh.LJ = null;
                            }
                            c477930Ioh.LJ = (C11JF) C11NZ.LJLJJLL(MultiGuestTopLivePushCardConfig.INSTANCE.getDelaySeconds(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(c477930Ioh, 244), new AfS176S0100000_7(c477930Ioh, 245));
                        }
                    }
                }
            }
        }
        if (isAdded()) {
            if (HangoutTopliveCrashFixSetting.INSTANCE.isFix()) {
                AssemVMLazy assemVMLazy = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
                assemVMLazy.getValue().setStateImmediate(new AwS4S0020000_7(this.LLILLL, 1));
            } else {
                AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
                if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
                    for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
                        if (interfaceC665370Q7z instanceof InterfaceC479210Iql) {
                            try {
                                ((InterfaceC479210Iql) interfaceC665370Q7z).u(this.LLILLL, false);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onSelected error for ");
                                sbLIZ2.append(interfaceC665370Q7z.getClass().getSimpleName());
                                C20441214yg.LJFF("LiveHangoutFragmentV2", C2188811AlT.LIZIZ(sbLIZ2), e);
                            }
                        }
                    }
                }
            }
            this.LLILLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void eP(C475260IkO c475260IkO) {
        LifecycleOwner lifecycleOwnerXL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageEvent: ");
        sbLIZ.append(c475260IkO.LIZ);
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJILLL != 0 && c475260IkO.LIZ == this.LLJJ) {
            if (this.LLJJI == 0) {
                if (!this.LLILZIL) {
                    InterfaceC479780Irg<?> interfaceC479780Irg = this.LLILZ;
                    if (interfaceC479780Irg != null && (lifecycleOwnerXL = interfaceC479780Irg.xL()) != null) {
                        C478590Ipl c478590Ipl = C478590Ipl.LIZ;
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerXL), C0PEM.LIZJ, null, new C478540Ipg(System.currentTimeMillis(), null), 2);
                        C478590Ipl.LJII(lifecycleOwnerXL);
                    }
                    this.LLILZIL = true;
                    return;
                }
                return;
            }
            InterfaceC475150IkD interfaceC475150IkD = this.LL;
            if (interfaceC475150IkD == null) {
                return;
            }
            interfaceC475150IkD.rf();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigurationChanged: screenWidthDp=");
        sbLIZ.append(configuration.screenWidthDp);
        sbLIZ.append(", screenHeightDp=");
        sbLIZ.append(configuration.screenHeightDp);
        sbLIZ.append(", screenLayout=");
        sbLIZ.append(configuration.screenLayout);
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "handleScreenSizeChange: refreshing UI for foldable screen");
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
        View view2 = getView();
        if (view2 != null) {
            HandlerHook.viewPost(view2, new ARunnableS107S0100000_7(this, 231));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IPullStreamService iPullStreamService;
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "hangoutFragment onCreate");
        super.onCreate(bundle);
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable() && (iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)) != null) {
            iPullStreamService.XZ0();
        }
    }

    @Override // X.InterfaceC479810Irj
    public final void py(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        this.LLILLJJLI = false;
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "onUnSelected");
        if (C479250Iqp.LIZ) {
            C479250Iqp.LIZ = false;
            Keva.getRepo("top_live_tab").storeBoolean("is_hangout_new_user_for_metric", false);
        }
        C478090Iox c478090Iox = (C478090Iox) this.LLJIJIL.getValue();
        if (c478090Iox != null) {
            c478090Iox.LIZLLL();
        }
        if (LiveSdkHangoutPeriodFluencyEnableSetting.INSTANCE.isEnable()) {
            C1EOY.LIZ.LJJIIJ();
        }
        ((C477930Ioh) this.LLJI.getValue()).LIZIZ();
        if (isAdded()) {
            AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
            if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
                for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
                    if (interfaceC665370Q7z instanceof InterfaceC479210Iql) {
                        ((InterfaceC479210Iql) interfaceC665370Q7z).LLLLIILL();
                    }
                }
            }
            if (HangoutTopliveCrashFixSetting.INSTANCE.isFix()) {
                AssemVMLazy assemVMLazy = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
                assemVMLazy.getValue().setStateImmediate(AFwS237S0000000_7.get$arr$(367));
            }
        }
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            MR().CQ2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "lifeCycle onViewCreated");
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 473), 3);
        MR().LLILZIL.observe(this, new AObserverS211S0100000_7(this, 71));
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        ((HangoutRoomFeedViewModel) assemVMLazy.getValue()).LL.observe(this, new AObserverS211S0100000_7(this, 72));
        DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveRandomMatchFragmentShowEvent.class, new AwS586S0100000_7(this, 474));
        if (HangoutBackupRoomFeedLoadedSetting.INSTANCE.enable()) {
            Ah(EnumC475180IkG.HANGOUT_LOADED_END);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.root.tab.AbsTabFragment, X.InterfaceC479810Irj
    public final void E2(EnterRoomConfig enterRoomConfig, InterfaceC479830Irl<?> interfaceC479830Irl, C19EH c19eh) {
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "onNewIntent");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        View viewFindViewById;
        C20441214yg.LIZIZ("LiveHangoutFragmentV2", "lifeCycle onCreateView");
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(new C1361400lX0(getActivity(), R.style.y0));
        C19GS c19gs = null;
        if (HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            viewTd = C786410Ut5.Td(layoutInflaterCloneInContext, R.layout.ddl, viewGroup, false);
            boolean z = C479760Ire.LJIJI;
            if (C479140Iqe.LIZ() && (viewFindViewById = viewTd.findViewById(R.id.trt)) != null) {
                this.LLJJIJI = viewFindViewById.getBackground();
                this.LLJJIII = new WeakReference<>(viewFindViewById);
                viewFindViewById.setBackground(null);
                ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLJJIJIIJIL;
                LinkedHashSet<Runnable> linkedHashSet = C479760Ire.LJIJJ;
                synchronized (linkedHashSet) {
                    try {
                        linkedHashSet.add(aRunnableS107S0100000_7);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } else {
            viewTd = C786410Ut5.Td(layoutInflaterCloneInContext, R.layout.ddi, viewGroup, false);
            if (LiveSdkMultiGuestTopLiveCenterEnableSetting.isEnable()) {
                ViewStub viewStub = (ViewStub) viewTd.findViewById(R.id.vs_multi_toplive);
                this.LLJ = viewStub;
                if (viewStub != null) {
                    viewStub.setLayoutResource(R.layout.ddn);
                }
                ViewStub viewStub2 = this.LLJ;
                if (viewStub2 != null) {
                    C786410Ut5.LJLLLL(viewStub2);
                }
            }
        }
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
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}

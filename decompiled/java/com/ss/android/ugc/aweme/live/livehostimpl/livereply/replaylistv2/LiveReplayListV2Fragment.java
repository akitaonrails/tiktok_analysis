package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2;

import X.AbstractC1623806Xk;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0OM1;
import X.C0ZP4;
import X.C1173220gdU;
import X.C1194810hCJ;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1300480jwk;
import X.C13LE;
import X.C1622206Wu;
import X.C1623606Xi;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C16FZ;
import X.C16GX;
import X.C1770850wBP;
import X.C1782840wUk;
import X.C1833570xoZ;
import X.C1833580xoa;
import X.C1833990xpF;
import X.C1834120xpS;
import X.C1834140xpU;
import X.C1834240xpe;
import X.C1835440xra;
import X.C1835460xrc;
import X.C1835520xri;
import X.C1835530xrj;
import X.C1835540xrk;
import X.C1835580xro;
import X.C1846060y8i;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1EOY;
import X.C20277814Wa;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C465520INi;
import X.C473410IhP;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1194840hCM;
import X.InterfaceC1483820oiS;
import X.InterfaceC1484830ok5;
import X.InterfaceC1488100opM;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1733780vDc;
import X.InterfaceC1846110y8n;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ARunnableS119S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReplayShareSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.LiveReplayHighlightTabCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.LiveReplayMyClipsTabCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.LiveReplayReplayTabCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.HighlightListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.SharedPlayerVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.myclips.MyClipsListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay.ReplayListViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
@InterfaceC836760Ws6
public final class LiveReplayListV2Fragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklHELIOSPyohLTUgMGEhLTUgKDY/ITY4P319BCw6LB02OCktMAM6OzEaewkhKSIhLCEn";
    public TuxNavBar LLIZ;
    public C1846060y8i LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20631115oD LLJ;
    public View LLJI;
    public C16FZ LLJIJIL;
    public C16GX LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxIconView LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public final AwS571S0100000_27 LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveReplayListV2Fragment.class, "sharedPlayerVM", "getSharedPlayerVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/highlight/vm/SharedPlayerVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LiveReplayListV2Fragment.class, "notificationBarVM", "getNotificationBarVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/NotificationBarVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(LiveReplayListV2Fragment.class, "guideVM", "getGuideVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/GuideVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(LiveReplayListV2Fragment.class, "highlightListVM", "getHighlightListVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/highlight/vm/HighlightListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(LiveReplayListV2Fragment.class, "replayListVM", "getReplayListVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/replay/ReplayListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(LiveReplayListV2Fragment.class, "myClipsListVM", "getMyClipsListVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/myclips/MyClipsListViewModel;", 0);
        c09r3.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
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

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public LiveReplayListV2Fragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        AssemVMLazy assemVMLazy3;
        boolean z3;
        AssemVMLazy assemVMLazy4;
        boolean z4;
        AssemVMLazy assemVMLazy5;
        boolean z5;
        boolean z6;
        AssemVMLazy assemVMLazy6;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SharedPlayerVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1610);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(103);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 496), aFwS269S0000000_27, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS571S0100000_27((Fragment) this, 497), aFwS269S0000000_27, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 498), aFwS269S0000000_27, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIIJIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NotificationBarVM.class);
        AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c19719912DlLIZ2, 1607);
        AFwS269S0000000_27 aFwS269S0000000_272 = AFwS269S0000000_27.get$arr$(106);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 500), aFwS269S0000000_272, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new AwS571S0100000_27((Fragment) this, 501), aFwS269S0000000_272, null, null, null);
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 499), aFwS269S0000000_272, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(GuideVM.class);
        AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c19719912DlLIZ3, 1608);
        AFwS269S0000000_27 aFwS269S0000000_273 = AFwS269S0000000_27.get$arr$(107);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_193, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 502), aFwS269S0000000_273, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_193, new AwS571S0100000_27((Fragment) this, 503), aFwS269S0000000_273, null, null, null);
            z3 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = true;
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_193, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 504), aFwS269S0000000_273, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJ = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(HighlightListViewModel.class);
        AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ4, 1609);
        AFwS269S0000000_27 aFwS269S0000000_274 = AFwS269S0000000_27.get$arr$(108);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_194, new C452070Ho5(), new C1622206Wu(this, z3), new C338490DOt(this, z3), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 505), aFwS269S0000000_274, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
            z4 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_194, new AwS571S0100000_27((Fragment) this, 506), aFwS269S0000000_274, null, null, null);
            z4 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z4 = true;
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_194, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 507), aFwS269S0000000_274, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJIL = assemVMLazy4;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(ReplayListViewModel.class);
        AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c19719912DlLIZ5, 1611);
        AFwS269S0000000_27 aFwS269S0000000_275 = AFwS269S0000000_27.get$arr$(109);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS563S0100000_195, new C452070Ho5(), new C1622206Wu(this, z4), new C338490DOt(this, z4), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 508), aFwS269S0000000_275, new C451460Hn6(this, z4), new C451620HnM(this, z4), new C987103tV(this, z4));
            z6 = true;
            z5 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy5 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS563S0100000_195, new AwS571S0100000_27((Fragment) this, 509), aFwS269S0000000_275, null, null, null);
            z5 = false;
            z6 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z5 = false;
            z6 = true;
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS563S0100000_195, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 510), aFwS269S0000000_275, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJ = assemVMLazy5;
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(MyClipsListViewModel.class);
        AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c19719912DlLIZ6, 1612);
        AFwS269S0000000_27 aFwS269S0000000_276 = AFwS269S0000000_27.get$arr$(110);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS563S0100000_196, new C452070Ho5(), new C1622206Wu(this, z6), new C338490DOt(this, z6), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 511), aFwS269S0000000_276, new C451460Hn6(this, z6), new C451620HnM(this, z6), new C987103tV(this, z6));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy6 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS563S0100000_196, new AwS571S0100000_27((Fragment) this, 493), aFwS269S0000000_276, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS563S0100000_196, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 495), aFwS269S0000000_276, new C451460Hn6(this, z5), new C451620HnM(this, z5), new C987103tV(this, z5));
        }
        this.LLJJJJJIL = assemVMLazy6;
        this.LLJJLIIIJLLLLLLLZ = "";
        this.LLJLLL = new AwS571S0100000_27(this, 494);
    }

    public final HighlightListViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (HighlightListViewModel) assemVMLazy.getValue();
    }

    public final MyClipsListViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (MyClipsListViewModel) assemVMLazy.getValue();
    }

    public final NotificationBarVM VR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (NotificationBarVM) assemVMLazy.getValue();
    }

    public final ReplayListViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (ReplayListViewModel) assemVMLazy.getValue();
    }

    public final boolean aS() {
        return this.LLJJL > 0;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C465520INi.LIZ.qu1();
        C1833990xpF.LIZIZ(this.LLJJLIIIJLLLLLLLZ, "live_replay");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1833580xoa.LJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1833990xpF.LIZJ("live_replay");
        C473410IhP.LJ(new ARunnableS119S0100000_19(this, 80));
        if (!this.LLJLLIL) {
            C1EOY.LIZ.LJJIII();
        }
        this.LLJLLIL = true;
        C1EOY.LIZ.LJII();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        List<ITEM> listListGetAll;
        List<ITEM> listListGetAll2;
        super.onResume();
        if (this.LLJLLIL) {
            C1EOY c1eoy = C1EOY.LIZ;
            c1eoy.LJJI();
            C1EOY.LJIILJJIL = "replay_list_page_period";
            c1eoy.LJIILLIIL();
        }
        C465520INi.LIZ.o41("live_replay");
        C1833990xpF.LIZLLL("live_replay");
        long j = C1834120xpS.LIZLLL;
        float f = C1834120xpS.LJ;
        if (j != 0 && f > 0.0f) {
            AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
            SharedPlayerVM sharedPlayerVM = (SharedPlayerVM) assemVMLazy.getValue();
            sharedPlayerVM.LLILZ.put(Long.valueOf(j), Float.valueOf(f));
            Long l = sharedPlayerVM.getState().LL;
            if (l != null && l.longValue() == j) {
                sharedPlayerVM.LLILZLL = Float.valueOf(f);
            }
            C1834120xpS.LIZLLL = 0L;
            C1834120xpS.LJ = 0.0f;
        }
        if (C1834120xpS.LIZ || C1834120xpS.LIZIZ || C1834120xpS.LIZJ) {
            Set<String> set = C1834120xpS.LJFF;
            if (!set.isEmpty()) {
                List<ITEM> listListGetAll3 = WR().listGetAll();
                if (listListGetAll3 != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listListGetAll3) {
                        if (set.contains(((C1835460xrc) obj).LL)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        WR().listRemoveItem((C1835460xrc) it2.next());
                    }
                }
                List<ITEM> listListGetAll4 = SR().listGetAll();
                if (listListGetAll4 != 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listListGetAll4) {
                        if (set.contains(((C1835580xro) obj2).LLIZ)) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        SR().listRemoveItem((C1835580xro) it3.next());
                    }
                }
                if (!aS() && (listListGetAll2 = UR().listGetAll()) != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listListGetAll2) {
                        if (set.contains(((C1782840wUk) obj3).LLILZIL)) {
                            arrayList3.add(obj3);
                        }
                    }
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        UR().listRemoveItem((C1782840wUk) it4.next());
                    }
                }
            }
            Set<Long> set2 = C1834120xpS.LJI;
            if (!set2.isEmpty()) {
                List<ITEM> listListGetAll5 = SR().listGetAll();
                if (listListGetAll5 != 0) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : listListGetAll5) {
                        if (set2.contains(Long.valueOf(((C1835580xro) obj4).LL))) {
                            arrayList4.add(obj4);
                        }
                    }
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        SR().listRemoveItem((C1835580xro) it5.next());
                    }
                }
                if (!aS() && (listListGetAll = UR().listGetAll()) != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : listListGetAll) {
                        if (set2.contains(Long.valueOf(((C1782840wUk) obj5).LL))) {
                            arrayList5.add(obj5);
                        }
                    }
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        UR().listRemoveItem((C1782840wUk) it6.next());
                    }
                }
            }
            if (!aS() && C1834120xpS.LIZ) {
                UR();
                UR().manualListRefresh();
                if (UR().listGetAll() != 0 && (!r0.isEmpty())) {
                    UR().listClear();
                }
            }
            C1834120xpS.LIZ();
        }
        AssemVMLazy assemVMLazy2 = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLL;
        SharedPlayerVM sharedPlayerVM2 = (SharedPlayerVM) assemVMLazy2.getValue();
        WeakReference<InterfaceC1483820oiS> weakReference = sharedPlayerVM2.LLILLJJLI;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        InterfaceC1484830ok5 interfaceC1484830ok5WQ2 = sharedPlayerVM2.wQ2();
        if (interfaceC1484830ok5WQ2 != null) {
            interfaceC1484830ok5WQ2.LJIIZILJ(sharedPlayerVM2);
            if (sharedPlayerVM2.LLILLL) {
                InterfaceC1488100opM interfaceC1488100opMLJIILIIL = interfaceC1484830ok5WQ2.LJIILIIL();
                if (interfaceC1488100opMLJIILIIL != null) {
                    interfaceC1488100opMLJIILIIL.mute();
                }
            } else {
                InterfaceC1488100opM interfaceC1488100opMLJIILIIL2 = interfaceC1484830ok5WQ2.LJIILIIL();
                if (interfaceC1488100opMLJIILIIL2 != null) {
                    interfaceC1488100opMLJIILIIL2.unmute();
                }
            }
            Float f2 = sharedPlayerVM2.LLILZLL;
            if (f2 != null) {
                float fFloatValue = f2.floatValue();
                interfaceC1484830ok5WQ2.seek(fFloatValue);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resumePlayer: seek to ");
                sbLIZ.append(fFloatValue);
                sbLIZ.append('%');
                C20441214yg.LIZIZ("LiveRecordingV2", C2188811AlT.LIZIZ(sbLIZ));
                sharedPlayerVM2.LLILZLL = null;
            }
            interfaceC1484830ok5WQ2.resume();
        }
        sharedPlayerVM2.setState(AFwS269S0000000_27.get$arr$(384));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("resumePlayer: mute=");
        sbLIZ2.append(sharedPlayerVM2.LLILLL);
        C20441214yg.LIZIZ("LiveRecordingV2", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        SharedPlayerVM sharedPlayerVM = (SharedPlayerVM) assemVMLazy.getValue();
        InterfaceC1484830ok5 interfaceC1484830ok5WQ2 = sharedPlayerVM.wQ2();
        if (interfaceC1484830ok5WQ2 != null) {
            interfaceC1484830ok5WQ2.pause();
            interfaceC1484830ok5WQ2.LJJIIZ(sharedPlayerVM);
        }
        C20441214yg.LIZIZ("LiveRecordingV2", "pausePlayer");
    }

    public final void bS(AbstractC1623806Xk<?> abstractC1623806Xk) {
        if (!this.LLJZ && (abstractC1623806Xk instanceof C1623606Xi)) {
            this.LLJZ = true;
            if (!this.LLJZIJLIL) {
                this.LLJZIJLIL = true;
                C16FZ c16fz = this.LLJIJIL;
                if (c16fz != null) {
                    C500260Jjc.LJIILIIL(c16fz);
                }
                View view = this.LLJI;
                if (view != null) {
                    C500260Jjc.LLFFF(view);
                }
                cS(this.LLJJJJLIIL);
            }
            if (this.LLJJJJLIIL != 0) {
                SR().manualListRefresh();
            }
            if (this.LLJJJJLIIL != 1) {
                WR().manualListRefresh();
            }
            if (!aS() && this.LLJJJJLIIL != 2) {
                UR().manualListRefresh();
            }
        }
    }

    public final void cS(int i) {
        String str;
        C1835440xra c1835440xra = C1835440xra.LIZ;
        if (i != 1) {
            if (i != 2) {
                str = "highlights";
            } else {
                str = "clips";
            }
        } else {
            str = "replay";
        }
        String str2 = this.LLJJLIIIJLLLLLLLZ;
        c1835440xra.getClass();
        LiveReplayShareSetting liveReplayShareSetting = LiveReplayShareSetting.INSTANCE;
        boolean zEnable = liveReplayShareSetting.enable();
        boolean zEnable2 = liveReplayShareSetting.enable();
        C2344009Gk c2344009GkLIZ = C1835440xra.LIZ();
        c2344009GkLIZ.LJIIIIZZ("tab", str);
        c2344009GkLIZ.LIZJ(0, "is_setting_red_dot");
        Boolean bool = Boolean.FALSE;
        c2344009GkLIZ.LIZJ(C500260Jjc.LJJJI(bool) ? 1 : 0, "is_amplify_content_show");
        c2344009GkLIZ.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(zEnable)) ? 1 : 0, "is_settings_button_show");
        c2344009GkLIZ.LIZJ(C500260Jjc.LJJJI(Boolean.valueOf(zEnable2)) ? 1 : 0, "is_clips_button_show");
        c2344009GkLIZ.LIZJ(C500260Jjc.LJJJI(bool) ? 1 : 0, "is_subscribe_inbox_show");
        c2344009GkLIZ.LJIIIIZZ(Scene.SCENE_SERVICE, "replay_list");
        c2344009GkLIZ.LJIIIIZZ("room_id", str2);
        C20684815ws.LJIILLIIL("livesdk_live_replay_page_show", c2344009GkLIZ.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        boolean z2;
        String string2;
        boolean z3;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        this.LLJLIL = Intrinsics.LJFF(string, "bulletin_board");
        Bundle arguments2 = getArguments();
        int i = 0;
        if (arguments2 != null && arguments2.getBoolean("is_from_sfv_campaign", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLILLLLZIIL = z;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && arguments3.getBoolean("is_from_owner", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJL = z2;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string2 = arguments4.getString("room_id")) == null) {
            string2 = "";
        }
        this.LLJJLIIIJLLLLLLLZ = string2;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && arguments5.getBoolean("support_bb_download", false)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLJLL = z3;
        if (!this.LLJL) {
            if (this.LLJLIL && !this.LLJLILLLLZIIL) {
                i = 5;
            } else if (this.LLJLILLLLZIIL) {
                i = 6;
            }
        }
        this.LLJJL = i;
        C1833990xpF.LIZ("live_replay");
        C1EOY c1eoy = C1EOY.LIZ;
        c1eoy.LJJI();
        C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("replay_list_page_enter");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(null);
        }
        C473410IhP.LIZJ(new ARunnableS119S0100000_19((Object) this.LLJLLL, 81), 3000L);
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        NR(AFwS269S0000000_27.get$arr$(104));
        activityConfiguration(AFwS269S0000000_27.get$arr$(105));
    }

    public final void ZR(String str, boolean z) {
        C1834140xpU c1834140xpU = C1834140xpU.LIZ;
        Context context = getContext();
        c1834140xpU.getClass();
        if (context != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webcast_replay_setting");
            C1833570xoZ.LIZ.getClass();
            smartRouteBuildRoute.withParam("enter_from_page", C1833570xoZ.LIZIZ);
            smartRouteBuildRoute.withParam("enter_from", C1833570xoZ.LIZJ);
            smartRouteBuildRoute.withParam("is_from_guide_dialog", z);
            smartRouteBuildRoute.withParam("enter_method", str);
            smartRouteBuildRoute.open();
        }
        C1833570xoZ.LIZ.getClass();
        C1833570xoZ.LIZ("settings", "", "");
        TuxNavBar tuxNavBar = this.LLIZ;
        if (tuxNavBar != null) {
            tuxNavBar.LJIIIZ("setting");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        int i;
        String string3;
        super.onViewCreated(view, bundle);
        this.LLIZ = (TuxNavBar) view.findViewById(R.id.p2f);
        this.LLIZLLLIL = (C1846060y8i) view.findViewById(R.id.wz6);
        this.LLJ = (ViewOnAttachStateChangeListenerC20631115oD) view.findViewById(R.id.viewpager);
        this.LLJI = view.findViewById(R.id.exy);
        this.LLJIJIL = (C16FZ) view.findViewById(R.id.nnp);
        this.LLJILJIL = (C16GX) view.findViewById(R.id.pfw);
        this.LLJILJILJ = view.findViewById(R.id.pfq);
        this.LLJILLL = view.findViewById(R.id.pfn);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.pfu);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.pfr);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.pfj);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.pfm);
        C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("enter_from_page")) == null) {
            string = "";
        }
        c1833570xoZ.getClass();
        C1833570xoZ.LIZIZ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("enter_from")) == null) {
            string2 = "";
        }
        C1833570xoZ.LIZJ = string2;
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        GuideVM guideVM = (GuideVM) assemVMLazy.getValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string3 = arguments3.getString("source_params")) != null) {
            str = string3;
        }
        guideVM.LLILLJJLI = str;
        C1835440xra c1835440xra = C1835440xra.LIZ;
        String strLIZJ = C1834240xpe.LIZJ(this.LLJJL);
        c1835440xra.getClass();
        C1835440xra.LIZIZ = strLIZJ;
        SR().LLILLL = this.LLJJLIIIJLLLLLLLZ;
        SR().LLILZ = this.LLJJL;
        SR().LLILZIL = this.LLJLL;
        WR().LLILLL = this.LLJJLIIIJLLLLLLLZ;
        WR().LLILZ = this.LLJJL;
        if (!aS()) {
            UR().LLILLL = this.LLJJLIIIJLLLLLLLZ;
            UR().LLILZ = this.LLJJL;
            UR().LLILZIL = this.LLJLL;
        }
        ArrayList arrayList = new ArrayList();
        if (!aS()) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_toothed_gear;
            c1251150ifB.LIZIZ = "setting";
            c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1131));
            arrayList.add(c1251150ifB);
            if (LiveReplayShareSetting.INSTANCE.enable()) {
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_star_on_feed;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LIZJ(new AwS571S0100000_27(this, 1132));
                ListProtector.add(arrayList, 0, c1251150ifB2);
            }
        }
        TuxNavBar tuxNavBar = this.LLIZ;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB3 = new C1251150ifB();
            c1251150ifB3.LIZLLL();
            c1251150ifB3.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB3.LIZJ(new AwS563S0100000_19(this, 2885));
            c0om1.LJ(c1251150ifB3);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131851073);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZ(arrayList);
            tuxNavBar.setNavActions(c0om1);
        }
        C1846060y8i c1846060y8i = this.LLIZLLLIL;
        if (c1846060y8i != null && (viewOnAttachStateChangeListenerC20631115oD = this.LLJ) != null) {
            final List listLJIILJJIL = C1697810uHb.LJIILJJIL(C1835520xri.LL, C1835540xrk.LL);
            if (!aS()) {
                listLJIILJJIL.add(C1835530xrj.LL);
            }
            InterfaceC1733780vDc viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator();
            C1173220gdU c1173220gdU = new C1173220gdU();
            c1173220gdU.LIZ = listLJIILJJIL.size() - 1;
            c1173220gdU.LJI = false;
            viewItemOperator.LIZLLL(c1173220gdU);
            if (aS()) {
                viewItemOperator.LIZJ(LiveReplayHighlightTabCell.class, LiveReplayReplayTabCell.class);
            } else {
                viewItemOperator.LIZJ(LiveReplayHighlightTabCell.class, LiveReplayReplayTabCell.class, LiveReplayMyClipsTabCell.class);
            }
            viewItemOperator.getState().LJIILL(listLJIILJJIL, null);
            new C1194810hCJ(c1846060y8i, viewOnAttachStateChangeListenerC20631115oD, true, new InterfaceC1194840hCM() { // from class: X.0xrd
                @Override // X.InterfaceC1194840hCM
                public final void LIZ(C1845940y8W c1845940y8W, int i2) {
                    Object obj = ListProtector.get(listLJIILJJIL, i2);
                    if (Intrinsics.LJFF(obj, C1835520xri.LL)) {
                        c1845940y8W.LIZIZ(this.getString(2131842166));
                    } else if (Intrinsics.LJFF(obj, C1835540xrk.LL)) {
                        c1845940y8W.LIZIZ(this.getString(2131853382));
                    } else {
                        if (Intrinsics.LJFF(obj, C1835530xrj.LL)) {
                            c1845940y8W.LIZIZ(this.getString(2131853363));
                            return;
                        }
                        throw new C1954807lC();
                    }
                }
            }).LIZ();
            c1846060y8i.LIZ(new InterfaceC1846110y8n() { // from class: X.0xrf
                @Override // X.InterfaceC1846110y8n
                public final void LIZ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZJ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZIZ(C1845940y8W c1845940y8W) {
                    this.LIZ.cS(c1845940y8W.LIZLLL);
                }
            });
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                i = arguments4.getInt("default_tab", 0);
            } else {
                i = 0;
            }
            this.LLJJJJLIIL = i;
            if (aS() && this.LLJJJJLIIL == 2) {
                this.LLJJJJLIIL = 0;
            }
            int i2 = this.LLJJJJLIIL;
            if (i2 >= 0 && i2 < 3 && i2 != 0) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(i2, false);
            }
            int i3 = this.LLJJJJLIIL;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2 && !aS()) {
                        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0xrg
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj) {
                                return ((C0HXF) obj).LL;
                            }
                        }, null, new AwS641S0100000_27(this, 97), 6);
                    }
                } else {
                    C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0OUD
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C612730O1n) obj).LL;
                        }
                    }, null, new AwS641S0100000_27(this, 96), 6);
                }
            } else {
                C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0OUC
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C612690O1j) obj).LL;
                    }
                }, null, new AwS641S0100000_27(this, 95), 6);
            }
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            C500260Jjc.LJIILIIL(view2);
        }
        C736680Sv4.LJIIIIZZ(this, VR(), new C2217381BqS() { // from class: X.0gLY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155590gB3) obj).LL;
            }
        }, null, new AwS641S0100000_27(this, 94), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0195
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0146002m) obj).LL);
            }
        }, null, new AwS641S0100000_27(this, 93), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ddb, viewGroup, false);
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

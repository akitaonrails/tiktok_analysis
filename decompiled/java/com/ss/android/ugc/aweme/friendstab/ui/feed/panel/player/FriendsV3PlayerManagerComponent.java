package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player;

import X.AbstractC1585810rMx;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0AIA;
import X.C0AIB;
import X.C0AIR;
import X.C0BLI;
import X.C0CN5;
import X.C0N0Y;
import X.C0N14;
import X.C0NCM;
import X.C0O0X;
import X.C0O2L;
import X.C0OB8;
import X.C0SDF;
import X.C0SDG;
import X.C0W17;
import X.C0ZP4;
import X.C1157804fw;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1223430hwT;
import X.C1277904zJ;
import X.C1360330lVH;
import X.C1386160mAw;
import X.C1386570mBb;
import X.C1387230mCf;
import X.C1387240mCg;
import X.C1387690mDP;
import X.C1389300mG0;
import X.C13LE;
import X.C1480290ocl;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481060oe0;
import X.C1481290oeN;
import X.C1483410ohn;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1582120rH0;
import X.C1588110rQf;
import X.C1599640rjG;
import X.C1637806bA;
import X.C1637906bB;
import X.C1770850wBP;
import X.C1906580ziK;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1DD1;
import X.C1ER1;
import X.C20291514aX;
import X.C20684815ws;
import X.C21699719wB;
import X.C21699819wC;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C260210AHr;
import X.C278610Avz;
import X.C296380BjY;
import X.C339190DRl;
import X.C452501pT;
import X.C583620Mum;
import X.C584140Mvc;
import X.C584190Mvh;
import X.C584830Mwj;
import X.C585370Mxb;
import X.C627260Oiy;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C735370Ssx;
import X.C736680Sv4;
import X.EnumC1002540cCC;
import X.EnumC21696919vj;
import X.EnumC2281141EQm;
import X.InterfaceC0148002o;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC1361290lWp;
import X.InterfaceC1386640mBi;
import X.InterfaceC1582750rI1;
import X.InterfaceC1588310rQz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21699519w9;
import X.InterfaceC21699619wA;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC585470Mxl;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS66S0300000_33;
import android.app.Activity;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.api.BaseControllerContext;
import com.ss.android.ugc.aweme.feed.api.I18nPlayControllerContext;
import com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.friendstab.playback.IFriendsV3PlaybackOwnership;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3AudioMuteViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class FriendsV3PlayerManagerComponent extends BasePanelComponent implements FriendsV3PlayerAbility, IFriendsV3PlaybackOwnership, InterfaceC724530SbT, OnUIPlayListener, InterfaceC1386640mBi, I18nPlayControllerContext, BaseControllerContext, IFeedMobParamsProvider {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public InterfaceC1588310rQz LL;
    public EnumC1002540cCC LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public final C01GW LLILZIL;
    public final int LLILZLL;
    public final ConcurrentHashMap<String, Long> LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public InterfaceC21699519w9 LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public Boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final C01GW LLJJI;
    public final AssemVMLazy LLJJIII;
    public boolean LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3PlayerManagerComponent.class, "audioMuteVM", "getAudioMuteVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3AudioMuteViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3PlayerManagerComponent.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FriendsV3PlayerManagerComponent.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public FriendsV3PlayerManagerComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3AudioMuteViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 222), AFwS279S0000000_33.get$arr$(155), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 223), AFwS279S0000000_33.get$arr$(156), null, true);
        this.LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2280));
        this.LLILZLL = -1;
        this.LLIZ = new ConcurrentHashMap<>();
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(121));
        this.LLJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(119));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 162));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(120));
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2281));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 224), AFwS279S0000000_33.get$arr$(157), null, true);
        new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final /* synthetic */ String Ci0() {
        return "";
    }

    @Override // X.InterfaceC1386640mBi
    public final String Jj() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final /* synthetic */ String Xe1() {
        return "";
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

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1386640mBi
    public final void gn(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final /* synthetic */ void kd2() {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBrightnessChanged(String str, float f) {
        C583620Mum.LIZIZ(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
        C583620Mum.LIZLLL(this, str, j);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z) {
        C583620Mum.LJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJFF(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
        C583620Mum.LJII(this, str, z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ((C1386570mBb) this.LLIZLLLIL.getValue()).LIZ();
        C1582120rH0.LIZ();
        C736680Sv4.LJIIIIZZ(this, fo(), new C2217381BqS() { // from class: X.0rxC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1608260rxA) obj).LLILLL);
            }
        }, null, new AwS647S0100000_33(this, 13), 6);
        FriendsV3FeedListAbility friendsV3FeedListAbilityKo = ko();
        if (friendsV3FeedListAbilityKo != null) {
            friendsV3FeedListAbilityKo.OD((AbstractC1585810rMx) this.LLJJI.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str) {
        C583620Mum.LJIIIIZZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
        C583620Mum.LJIIIZ(this, str, list);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
        C583620Mum.LJIIJ(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
        C583620Mum.LJIILIIL(this, i, j, j2, map);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJIILJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        C583620Mum.LJIILLIIL(this, str, c1480290ocl);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPausePlay(String str) {
        C583620Mum.LJIIZILJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str) {
        C583620Mum.LJIJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
        C583620Mum.LJIJJLI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPause(String str) {
        C583620Mum.LJJII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepare(String str) {
        C583620Mum.LJJIII(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayPrepared(String str) {
        C583620Mum.LJJIIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
        C583620Mum.LJJIJIIJI(this, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str, boolean z) {
        C583620Mum.LJJIJIL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        C583620Mum.LJJIJL(this, str, i, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlaying(String str) {
        C583620Mum.LJJIJLIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreRenderSessionMissed(String str) {
        C583620Mum.LJJIZ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJL(this, str, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekEnd(String str, boolean z) {
        C583620Mum.LJJJJLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSeekStart(String str, int i, float f) {
        C583620Mum.LJJJJZ(this, str, i, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onSpeedChanged(String str, float f) {
        C583620Mum.LJJJJZI(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onStopPlay(String str) {
        C583620Mum.LJJJLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
        C583620Mum.LJJJZ(this, str, i, i2);
    }

    @Override // X.InterfaceC1386640mBi
    public final boolean z3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.I18nPlayControllerContext
    public final String GI1() {
        Aweme aweme;
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        if (interfaceC1588310rQz == null || (aweme = interfaceC1588310rQz.getAweme()) == null) {
            return null;
        }
        return AwemeExtKt.getAuthorUid(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.I18nPlayControllerContext
    public final Integer LJLLJ() {
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        if (interfaceC1588310rQz != null) {
            return Integer.valueOf(interfaceC1588310rQz.y2());
        }
        return null;
    }

    public JSONObject RC2() throws JSONException {
        InterfaceC1588310rQz interfaceC1588310rQz;
        Aweme aweme;
        JSONObject jSONObject = new JSONObject();
        String strLIZIZ = C1389300mG0.LIZIZ(C724240Sb0.LJI(this));
        InterfaceC1588310rQz interfaceC1588310rQz2 = this.LL;
        Boolean boolValueOf = Boolean.valueOf((interfaceC1588310rQz2 != null ? interfaceC1588310rQz2.LJIL() : null) instanceof InterfaceC1357880lRK);
        boolValueOf.booleanValue();
        if (!C0BLI.LIZ()) {
            boolValueOf = null;
        }
        C1277904zJ.LIZ(jSONObject, new C1360330lVH(strLIZIZ, null, null, boolValueOf, 6));
        InterfaceC1588310rQz interfaceC1588310rQz3 = this.LL;
        jSONObject.put("is_with_comment", C1386160mAw.LJIIIIZZ(interfaceC1588310rQz3 != null ? Boolean.valueOf(interfaceC1588310rQz3.G2()) : null));
        jSONObject.put("is_mute", C1386160mAw.LJIIIIZZ(Boolean.valueOf(fo().getState().LL || !((interfaceC1588310rQz = this.LL) == null || (aweme = interfaceC1588310rQz.getAweme()) == null || !AwemeExtKt.isPhotoMode(aweme)))));
        jSONObject.put("is_auto_play", C1386160mAw.LJIIIIZZ(Boolean.valueOf(this.LLILLJJLI == EnumC1002540cCC.AUTO)));
        jSONObject.put("is_friends_v3_fragment", C1599640rjG.LIZIZ.Pu(C724240Sb0.LJI(this)));
        return jSONObject;
    }

    public final FriendsV3AudioMuteViewModel fo() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (FriendsV3AudioMuteViewModel) assemVMLazy.getValue();
    }

    public final InterfaceC21699619wA ho() {
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        if (interfaceC1588310rQz instanceof InterfaceC21699619wA) {
            return (InterfaceC21699619wA) interfaceC1588310rQz;
        }
        return null;
    }

    public final FriendsV3FeedListAbility ko() {
        return (FriendsV3FeedListAbility) this.LLILZIL.getValue();
    }

    public FriendsV3FeedListViewModel lo() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    public final C584140Mvc oo() {
        return (C584140Mvc) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.playback.IFriendsV3PlaybackOwnership
    public final C0NCM rw0() {
        Aweme aweme;
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        if (interfaceC1588310rQz == null || (aweme = interfaceC1588310rQz.getAweme()) == null) {
            return null;
        }
        C1483410ohn c1483410ohnLJ = oo().LJ();
        boolean zIsPlaying = c1483410ohnLJ.isPlaying();
        String strLIZJ = C1588110rQf.LIZJ(interfaceC1588310rQz);
        if (strLIZJ == null) {
            strLIZJ = aweme.getAid();
        }
        return new C0NCM(c1483410ohnLJ, aweme.getAid(), strLIZJ, zIsPlaying);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final String Cf() {
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            return c2189821An6.getEventType();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final Activity getActivity() {
        return C724240Sb0.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getContentSource() {
        String contentSource = getParam().getContentSource();
        return contentSource == null ? "" : contentSource;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final String getEnterMethod() {
        String enterMethodValue;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        return (c2189821An6 == null || (enterMethodValue = c2189821An6.getEnterMethodValue()) == null) ? "click" : enterMethodValue;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getEventType() {
        String eventType = getParam().getEventType();
        return eventType == null ? "" : eventType;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final String getFrom() {
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            return c2189821An6.getFrom();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.BaseControllerContext
    public final int getPageType() {
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            return c2189821An6.getPageType();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final C2189821An6 getParam() {
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            return c2189821An6;
        }
        C2189821An6 c2189821An62 = new C2189821An6();
        C0W17.LIZ("playerComponent", "unexpected empty feed param");
        return c2189821An62;
    }

    @Override // X.InterfaceC1386640mBi
    public final C0N0Y getPlayerManager() {
        return oo().LJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getPreviousPage() {
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            return c2189821An6.getPreviousPage();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getTabName() {
        String tabName = getParam().getTabName();
        return tabName == null ? "" : tabName;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String getTracker() {
        String tracker = getParam().getTracker();
        return tracker == null ? "" : tracker;
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String im0() {
        String likeEnterMethod = getParam().getLikeEnterMethod();
        return likeEnterMethod == null ? "" : likeEnterMethod;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    public final boolean isPlaying() {
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPlaying, aid=");
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        sbLIZ.append((interfaceC1588310rQz == null || (aweme = interfaceC1588310rQz.getAweme()) == null) ? null : aweme.getAid());
        C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        return xc().isPlaying();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    /* JADX INFO: renamed from: mo, reason: merged with bridge method [inline-methods] */
    public final C1483410ohn xc() {
        return oo().LJ();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (!((Boolean) C278610Avz.LIZ.getValue()).booleanValue() || ((C1483410ohn) getPlayerManager()).isPlaying()) {
            reset();
        } else {
            reset();
            oo().LJ().release();
            this.LLJILJIL.getValue().getClass();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3PlayerAbility.class, null);
        }
        FriendsV3FeedListAbility friendsV3FeedListAbilityKo = ko();
        if (friendsV3FeedListAbilityKo != null) {
            friendsV3FeedListAbilityKo.f52((AbstractC1585810rMx) this.LLJJI.getValue());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, this, FriendsV3PlayerAbility.class, null, null);
            if (C296380BjY.LIZ()) {
                C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IFriendsV3PlaybackOwnership.class, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    public final void pe2() {
        C584140Mvc c584140MvcOo = oo();
        c584140MvcOo.LJ().LJJJI((InterfaceC585470Mxl) c584140MvcOo.LIZJ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final String qE2() {
        String searchKeyword = getParam().getSearchKeyword();
        return searchKeyword == null ? "" : searchKeyword;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    public final void reset() {
        C584140Mvc c584140MvcOo = oo();
        c584140MvcOo.getClass();
        C0W17.LIZJ("playerManager", "resetPlayer");
        C1483410ohn c1483410ohnLJ = c584140MvcOo.LJ();
        c1483410ohnLJ.LIZ = c1483410ohnLJ.LIZJ;
        c584140MvcOo.LJ().LJJIJ(null);
        ((C585370Mxb) this.LLJILJIL.getValue()).LIZ = null;
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        if (interfaceC1588310rQz == null || interfaceC1588310rQz.LLIZLLLIL() == null) {
            return;
        }
        this.LL = null;
    }

    public static void wo(Function0 function0) {
        if (((Boolean) C0AIA.LIZ.getValue()).booleanValue()) {
            C20684815ws.LJFF().execute(new ARunnableS109S0100000_9(function0, 79));
        } else {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.playback.IFriendsV3PlaybackOwnership
    public final void Dk0(C0NCM c0ncm) {
        InterfaceC1588310rQz interfaceC1588310rQzFL;
        String str = c0ncm.LIZJ;
        FriendsV3FeedListAbility friendsV3FeedListAbilityKo = ko();
        if (friendsV3FeedListAbilityKo != null && (interfaceC1588310rQzFL = friendsV3FeedListAbilityKo.fL(str)) != null) {
            bo(interfaceC1588310rQzFL, c0ncm);
            return;
        }
        FriendsV3FeedListAbility friendsV3FeedListAbilityKo2 = ko();
        if (friendsV3FeedListAbilityKo2 != null) {
            friendsV3FeedListAbilityKo2.yi0(new C21699719wB(this, str, c0ncm));
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    public final void KI2(InterfaceC1588310rQz interfaceC1588310rQz) {
        String aid;
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("syncCurrentVHFromInnerFeed, aid=");
        Aweme aweme2 = interfaceC1588310rQz.getAweme();
        String aid2 = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", prev=");
        InterfaceC1588310rQz interfaceC1588310rQz2 = this.LL;
        if (interfaceC1588310rQz2 != null && (aweme = interfaceC1588310rQz2.getAweme()) != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ.append(aid2);
        C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LL = interfaceC1588310rQz;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    public final boolean Vo0(Aweme aweme) {
        Aweme aweme2;
        String aid = null;
        if (aweme != null && aweme.getAid() != null) {
            String aid2 = aweme.getAid();
            InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
            if (interfaceC1588310rQz != null && (aweme2 = interfaceC1588310rQz.getAweme()) != null) {
                aid = aweme2.getAid();
            }
            if (Intrinsics.LJFF(aid2, aid)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    public final void aE1(InterfaceC1588310rQz interfaceC1588310rQz) {
        String str;
        Aweme aweme = interfaceC1588310rQz.getAweme();
        if (aweme != null) {
            InterfaceC21699619wA interfaceC21699619wAHo = ho();
            if (interfaceC21699619wAHo != null) {
                interfaceC21699619wAHo.onPlayCompletedFirstTime(aweme.getAid(), null);
            }
            C1387230mCf c1387230mCf = new C1387230mCf(null, null, null, null, null, null, null, 32767);
            c1387230mCf.LL = "output";
            c1387230mCf.LLILLL = aweme.getAid();
            c1387230mCf.LLILZ = Boolean.TRUE;
            C01GW<C1387690mDP> c01gw = C1387690mDP.LIZIZ;
            C0O0X.LIZ().LIZ(C735370Ssx.LIZJ(aweme));
            c1387230mCf.LLILLJJLI = 0;
            if (C1906580ziK.LJI()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c1387230mCf.LLJIJIL = str;
            aweme.getAid();
            AwemeExtKt.getAuthorUid(aweme);
            wo(new AwS434S0200000_33(this, new C1387240mCg(aweme, this.LLILZLL, null, null, this, this, this, c1387230mCf, this), 154));
        }
    }

    public final boolean so(InterfaceC1588310rQz interfaceC1588310rQz) {
        Integer numValueOf;
        String nickname;
        String aid;
        Integer numValueOf2;
        String nickname2;
        String aid2;
        String aid3;
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        Aweme aweme4;
        User author;
        Aweme aweme5;
        Aweme aweme6;
        User author2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCurrentHost, currentHost:<");
        InterfaceC1588310rQz interfaceC1588310rQz2 = this.LL;
        String aid4 = null;
        if (interfaceC1588310rQz2 != null) {
            numValueOf = Integer.valueOf(interfaceC1588310rQz2.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(">[nickName=");
        InterfaceC1588310rQz interfaceC1588310rQz3 = this.LL;
        if (interfaceC1588310rQz3 != null && (aweme6 = interfaceC1588310rQz3.getAweme()) != null && (author2 = aweme6.getAuthor()) != null) {
            nickname = author2.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        sbLIZ.append(", aid=");
        InterfaceC1588310rQz interfaceC1588310rQz4 = this.LL;
        if (interfaceC1588310rQz4 != null && (aweme5 = interfaceC1588310rQz4.getAweme()) != null) {
            aid = aweme5.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isCurrentHost, host:<");
        if (interfaceC1588310rQz != null) {
            numValueOf2 = Integer.valueOf(interfaceC1588310rQz.hashCode());
        } else {
            numValueOf2 = null;
        }
        sbLIZ2.append(numValueOf2);
        sbLIZ2.append(">[nickName=");
        if (interfaceC1588310rQz != null && (aweme4 = interfaceC1588310rQz.getAweme()) != null && (author = aweme4.getAuthor()) != null) {
            nickname2 = author.getNickname();
        } else {
            nickname2 = null;
        }
        sbLIZ2.append(nickname2);
        sbLIZ2.append(", aid=");
        if (interfaceC1588310rQz != null && (aweme3 = interfaceC1588310rQz.getAweme()) != null) {
            aid2 = aweme3.getAid();
        } else {
            aid2 = null;
        }
        sbLIZ2.append(aid2);
        sbLIZ2.append(']');
        C2188811AlT.LIZIZ(sbLIZ2);
        if (Intrinsics.LJFF(this.LL, interfaceC1588310rQz)) {
            InterfaceC1588310rQz interfaceC1588310rQz5 = this.LL;
            if (interfaceC1588310rQz5 != null && (aweme2 = interfaceC1588310rQz5.getAweme()) != null) {
                aid3 = aweme2.getAid();
            } else {
                aid3 = null;
            }
            if (interfaceC1588310rQz != null && (aweme = interfaceC1588310rQz.getAweme()) != null) {
                aid4 = aweme.getAid();
            }
            if (Intrinsics.LJFF(aid3, aid4)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void uo(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlayerMute, isMute = ");
        sbLIZ.append(z);
        C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C0N0Y playerManager = getPlayerManager();
            if (playerManager != null) {
                ((C1483410ohn) playerManager).LJFF();
                return;
            }
            return;
        }
        C0N0Y playerManager2 = getPlayerManager();
        if (playerManager2 == null) {
            return;
        }
        ((C1483410ohn) playerManager2).LJIJJ();
    }

    public final void vo(String str) {
        Aweme aweme;
        String aid;
        Map<String, String> mapLLLIIL;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPausePlay, sourceId = ");
        sbLIZ.append(str);
        C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        String aid2 = null;
        if (interfaceC1588310rQz != null) {
            aweme = interfaceC1588310rQz.getAweme();
        } else {
            aweme = null;
        }
        if (str != null) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                C584830Mwj c584830Mwj = (C584830Mwj) this.LLJ.getValue();
                if (c584830Mwj != null) {
                    c584830Mwj.LIZJ();
                }
                if (!C1157804fw.LIZ() || C0CN5.LJII()) {
                    mapLLLIIL = C1ER1.LIZIZ.LLLIIL(aweme);
                } else {
                    mapLLLIIL = new HashMap<>();
                }
                Long lRemove = this.LLIZ.remove(str);
                if (lRemove != null) {
                    long jLongValue = lRemove.longValue();
                    C1387230mCf c1387230mCf = new C1387230mCf(null, null, null, null, null, null, null, 32767);
                    c1387230mCf.LL = "output";
                    c1387230mCf.LLILLL = aweme.getAid();
                    c1387230mCf.LLILZ = Boolean.TRUE;
                    C01GW<C1387690mDP> c01gw = C1387690mDP.LIZIZ;
                    C0O0X.LIZ().LIZ(C735370Ssx.LIZJ(aweme));
                    int iIntValue = 0;
                    c1387230mCf.LLILLJJLI = 0;
                    c1387230mCf.LLILZLL = getFrom();
                    c1387230mCf.LLIZLLLIL = System.currentTimeMillis() - jLongValue;
                    if (C1906580ziK.LJI()) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c1387230mCf.LLJIJIL = str2;
                    c1387230mCf.LLJL = 0;
                    c1387230mCf.LLJLIL = null;
                    c1387230mCf.LLJLILLLLZIIL = 0;
                    c1387230mCf.LLJLL = mapLLLIIL;
                    c1387230mCf.LLJZ = Boolean.FALSE;
                    InterfaceC1588310rQz interfaceC1588310rQz2 = this.LL;
                    if (interfaceC1588310rQz2 != null) {
                        iIntValue = Integer.valueOf(interfaceC1588310rQz2.y2() + 1).intValue();
                    }
                    c1387230mCf.LLJLLL = String.valueOf(iIntValue);
                    AwemeExtKt.getAuthorUid(aweme);
                    wo(new AwS434S0200000_33(this, new C1387240mCg(aweme, this.LLILZLL, null, null, this, this, this, c1387230mCf, this), 87));
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onPausePlay, different sourceId, sourceId = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", currentId = ");
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        C0W17.LIZ("playerComponent", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    public final void D90(InterfaceC1588310rQz interfaceC1588310rQz, EnumC21696919vj enumC21696919vj) {
        String aid;
        C0N14 second;
        Aweme aweme;
        String aid2;
        Boolean first;
        Aweme aweme2;
        Aweme aweme3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPause, cell aid= ");
        String aid3 = null;
        C0N14 second2 = null;
        aid3 = null;
        if (interfaceC1588310rQz != null && (aweme3 = interfaceC1588310rQz.getAweme()) != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", reason=");
        sbLIZ.append(enumC21696919vj);
        C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (so(interfaceC1588310rQz)) {
            if (((Boolean) C0AIB.LIZ.getValue()).booleanValue()) {
                EnumC21696919vj enumC21696919vj2 = EnumC21696919vj.NAVIGATE_TO_DETAIL;
                if (enumC21696919vj == enumC21696919vj2) {
                    InterfaceC21699519w9 interfaceC21699519w9 = this.LLJI;
                    if (interfaceC21699519w9 != null) {
                        interfaceC21699519w9.LJJIJ(null);
                    }
                    if (interfaceC1588310rQz != null && (aweme2 = interfaceC1588310rQz.getAweme()) != null) {
                        aid2 = aweme2.getAid();
                    } else {
                        aid2 = null;
                    }
                    vo(aid2);
                    AssemVMLazy assemVMLazy = this.LLILZ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
                    Pair<Boolean, C0N14> pair = ((C0O2L) assemVMLazy.getValue().getState()).LLILLL;
                    if (pair != null) {
                        first = pair.getFirst();
                    } else {
                        first = null;
                    }
                    Pair<Boolean, C0N14> pair2 = ((C0O2L) this.LLILZ.getValue().getState()).LLILLL;
                    if (pair2 != null) {
                        second2 = pair2.getSecond();
                    }
                    if (enumC21696919vj == enumC21696919vj2 && Intrinsics.LJFF(first, Boolean.TRUE) && second2 != null && second2.LIZIZ && so(second2.LIZJ)) {
                        C0W17.LIZJ("playerComponent", "tryPause, skip pause");
                        return;
                    }
                    InterfaceC21699519w9 interfaceC21699519w92 = this.LLJI;
                    if (interfaceC21699519w92 == null) {
                        return;
                    }
                    interfaceC21699519w92.LIZIZ(interfaceC1588310rQz);
                    return;
                }
                InterfaceC21699519w9 interfaceC21699519w93 = this.LLJI;
                if (interfaceC21699519w93 == null) {
                    return;
                }
                interfaceC21699519w93.LIZIZ(interfaceC1588310rQz);
                return;
            }
            if (enumC21696919vj == EnumC21696919vj.NAVIGATE_TO_DETAIL) {
                AssemVMLazy assemVMLazy2 = this.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIJIIJIL;
                Pair<Boolean, C0N14> pair3 = ((C0O2L) assemVMLazy2.getValue().getState()).LLILLL;
                if (pair3 != null && (second = pair3.getSecond()) != null && second.LIZIZ) {
                    C0W17.LIZJ("playerComponent", "tryPause, skip pause, but report play_time in outer flow");
                    if (interfaceC1588310rQz != null && (aweme = interfaceC1588310rQz.getAweme()) != null) {
                        aid3 = aweme.getAid();
                    }
                    vo(aid3);
                    return;
                }
            }
            InterfaceC21699519w9 interfaceC21699519w94 = this.LLJI;
            if (interfaceC21699519w94 == null) {
                return;
            }
            interfaceC21699519w94.LIZIZ(interfaceC1588310rQz);
        }
    }

    public final void bo(InterfaceC1588310rQz interfaceC1588310rQz, C0NCM c0ncm) {
        this.LL = interfaceC1588310rQz;
        this.LLJI = oo();
        oo().LJ().LJJIJ(this);
        if (!c0ncm.LIZLLL) {
            return;
        }
        C1483410ohn c1483410ohnLJ = oo().LJ();
        String strLJJJLIIL = null;
        if ((c1483410ohnLJ instanceof C1483410ohn) && c1483410ohnLJ != null) {
            strLJJJLIIL = c1483410ohnLJ.LJJJLIIL();
        }
        if (Intrinsics.LJFF(strLJJJLIIL, c0ncm.LIZIZ) && c1483410ohnLJ.isPlaying()) {
            return;
        }
        nq2(interfaceC1588310rQz, EnumC21696919vj.NAVIGATE_TO_DETAIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final Aweme m221do(int i, String str) {
        boolean z;
        String uid;
        InterfaceC1361290lWp interfaceC1361290lWpLJIL;
        String uid2;
        int size;
        InterfaceC1361270lWn interfaceC1361270lWn;
        User userLLILLL;
        C1223430hwT c1223430hwT = (C1223430hwT) lo().getState();
        c1223430hwT.getClass();
        List listLIZ = C627260Oiy.LIZ(c1223430hwT);
        if (listLIZ != null && !listLIZ.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Iterator it2 = listLIZ.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1361290lWp interfaceC1361290lWp = (InterfaceC1361290lWp) it2.next();
            if (interfaceC1361290lWp instanceof InterfaceC1361270lWn) {
                InterfaceC1361270lWn interfaceC1361270lWn2 = (InterfaceC1361270lWn) interfaceC1361290lWp;
                if (Intrinsics.LJFF(interfaceC1361270lWn2.getAweme().getAid(), str)) {
                    User userLLILLL2 = interfaceC1361270lWn2.LLILLL();
                    if (userLLILLL2 != null) {
                        uid = userLLILLL2.getUid();
                    } else {
                        uid = null;
                    }
                    InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
                    if (interfaceC1588310rQz != null) {
                        interfaceC1361290lWpLJIL = interfaceC1588310rQz.LJIL();
                    } else {
                        interfaceC1361290lWpLJIL = null;
                    }
                    if ((interfaceC1361290lWpLJIL instanceof InterfaceC1361270lWn) && (interfaceC1361270lWn = (InterfaceC1361270lWn) interfaceC1361290lWpLJIL) != null && (userLLILLL = interfaceC1361270lWn.LLILLL()) != null) {
                        uid2 = userLLILLL.getUid();
                    } else {
                        uid2 = null;
                    }
                    if (Intrinsics.LJFF(uid, uid2)) {
                        if (i2 != -1) {
                            if (i > 0) {
                                size = Math.min(listLIZ.size(), i2 + 1 + i);
                            } else {
                                size = listLIZ.size();
                            }
                            for (int i3 = i2 + 1; i3 < size; i3++) {
                                InterfaceC1361290lWp interfaceC1361290lWp2 = (InterfaceC1361290lWp) ListProtector.get(listLIZ, i3);
                                if (interfaceC1361290lWp2 instanceof InterfaceC1361270lWn) {
                                    C0OB8 c0ob8 = (C0OB8) interfaceC1361290lWp2;
                                    if (!AwemeExtKt.isPhotoMode(c0ob8.getAweme())) {
                                        return c0ob8.getAweme();
                                    }
                                }
                            }
                            return null;
                        }
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility
    public final void nq2(InterfaceC1588310rQz interfaceC1588310rQz, EnumC21696919vj enumC21696919vj) {
        InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL;
        RecyclerView.ViewHolder viewHolder;
        View view;
        Surface surface;
        if (enumC21696919vj != EnumC21696919vj.NAVIGATE_TO_DETAIL || !C296380BjY.LIZ() || interfaceC1588310rQz == 0 || (((interfaceC1582750rI1LLIZLLLIL = interfaceC1588310rQz.LLIZLLLIL()) != null && (surface = interfaceC1582750rI1LLIZLLLIL.getSurface()) != null && surface.isValid()) || !(interfaceC1588310rQz instanceof RecyclerView.ViewHolder) || (viewHolder = (RecyclerView.ViewHolder) interfaceC1588310rQz) == null || (view = viewHolder.itemView) == null)) {
            xo(interfaceC1588310rQz, enumC21696919vj);
        } else {
            HandlerHook.viewPost(view, new ARunnableS66S0300000_33(enumC21696919vj, this, interfaceC1588310rQz, 12));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onLoopPlay(String str, int i) {
        Aweme aweme;
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoopPlay, sourceId = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        String aid2 = null;
        if (interfaceC1588310rQz != null) {
            aweme = interfaceC1588310rQz.getAweme();
        } else {
            aweme = null;
        }
        if (str != null) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                C584830Mwj c584830Mwj = (C584830Mwj) this.LLJ.getValue();
                if (c584830Mwj != null) {
                    c584830Mwj.LIZ(aweme, C1389300mG0.LIZ(getPanelContext()), null, null, new AwS603S0100000_24(this, 84));
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onLoopPlay return, different sourceId, sourceId = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", currentId = ");
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        C0W17.LIZ("playerComponent", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        vo(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        Aweme aweme;
        String aid;
        String str2;
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        String aid2 = null;
        if (interfaceC1588310rQz != null) {
            aweme = interfaceC1588310rQz.getAweme();
        } else {
            aweme = null;
        }
        if (str != null) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                InterfaceC21699619wA interfaceC21699619wAHo = ho();
                if (interfaceC21699619wAHo != null) {
                    interfaceC21699619wAHo.onPlayCompletedFirstTime(str, c1480430ocz);
                }
                C1387230mCf c1387230mCf = new C1387230mCf(null, null, null, null, null, null, null, 32767);
                c1387230mCf.LL = "output";
                c1387230mCf.LLILLL = str;
                c1387230mCf.LLILZ = Boolean.TRUE;
                C01GW<C1387690mDP> c01gw = C1387690mDP.LIZIZ;
                C0O0X.LIZ().LIZ(C735370Ssx.LIZJ(aweme));
                c1387230mCf.LLILLJJLI = 0;
                if (C1906580ziK.LJI()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c1387230mCf.LLJIJIL = str2;
                if (aweme != null) {
                    AwemeExtKt.getAuthorUid(aweme);
                }
                wo(new AwS434S0200000_33(this, new C1387240mCg(aweme, this.LLILZLL, null, null, this, this, this, c1387230mCf, this), 85));
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayCompletedFirstTime, different sourceId, sourceId = ");
        sbLIZ.append(str);
        sbLIZ.append(", currentId = ");
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ.append(aid2);
        C0W17.LIZ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlaying, sourceId = ");
        sbLIZ.append(str);
        C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC21699619wA interfaceC21699619wAHo = ho();
        if (interfaceC21699619wAHo != null) {
            interfaceC21699619wAHo.onPlaying(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        Aweme aweme;
        String aid;
        Map<String, String> mapLLLIIL;
        String str2;
        Integer numValueOf;
        Integer numValueOf2;
        int iValueOf;
        int iValueOf2;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL;
        FrameLayout playViewContainer;
        InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL2;
        FrameLayout playViewContainer2;
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        String aid2 = null;
        if (interfaceC1588310rQz != null) {
            aweme = interfaceC1588310rQz.getAweme();
        } else {
            aweme = null;
        }
        if (str != null) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                InterfaceC21699619wA interfaceC21699619wAHo = ho();
                if (interfaceC21699619wAHo != null) {
                    interfaceC21699619wAHo.onRenderFirstFrame(str, c1480420ocy);
                }
                this.LLIZ.put(str, Long.valueOf(System.currentTimeMillis()));
                if (this.LLILLJJLI == EnumC1002540cCC.BACK_DETAIL) {
                    C0W17.LIZJ("playerComponent", "onRenderFirstFrame, skip video_play when back to detail");
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRenderFirstFrame, sourceId = ");
                sbLIZ.append(str);
                C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
                int i = C1481060oe0.LIZLLL + 1;
                C1481060oe0.LIZLLL = i;
                if (!C1157804fw.LIZ() || C0CN5.LJII()) {
                    mapLLLIIL = C1ER1.LIZIZ.LLLIIL(aweme);
                } else {
                    mapLLLIIL = new HashMap<>();
                }
                C1387230mCf c1387230mCf = new C1387230mCf(null, null, null, null, null, null, null, 32767);
                c1387230mCf.LL = "output";
                c1387230mCf.LLILLL = aweme.getAid();
                c1387230mCf.LLILZ = Boolean.TRUE;
                C01GW<C1387690mDP> c01gw = C1387690mDP.LIZIZ;
                C0O0X.LIZ().LIZ(C735370Ssx.LIZJ(aweme));
                int iIntValue = 0;
                c1387230mCf.LLILLJJLI = 0;
                c1387230mCf.LLILZLL = getFrom();
                c1387230mCf.LLIZ = null;
                if (C1906580ziK.LJI()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c1387230mCf.LLJIJIL = str2;
                InterfaceC1588310rQz interfaceC1588310rQz2 = this.LL;
                if (interfaceC1588310rQz2 != null && (interfaceC1582750rI1LLIZLLLIL2 = interfaceC1588310rQz2.LLIZLLLIL()) != null && (playViewContainer2 = interfaceC1582750rI1LLIZLLLIL2.getPlayViewContainer()) != null) {
                    numValueOf = Integer.valueOf(playViewContainer2.getHeight());
                } else {
                    numValueOf = null;
                }
                c1387230mCf.LLJILJIL = numValueOf;
                InterfaceC1588310rQz interfaceC1588310rQz3 = this.LL;
                if (interfaceC1588310rQz3 != null && (interfaceC1582750rI1LLIZLLLIL = interfaceC1588310rQz3.LLIZLLLIL()) != null && (playViewContainer = interfaceC1582750rI1LLIZLLLIL.getPlayViewContainer()) != null) {
                    numValueOf2 = Integer.valueOf(playViewContainer.getWidth());
                } else {
                    numValueOf2 = null;
                }
                c1387230mCf.LLJILJILJ = numValueOf2;
                Video video = aweme.getVideo();
                if (video != null) {
                    iValueOf = Integer.valueOf(video.getHeight());
                } else {
                    iValueOf = 0;
                }
                c1387230mCf.LLJJ = iValueOf;
                Video video2 = aweme.getVideo();
                if (video2 != null) {
                    iValueOf2 = Integer.valueOf(video2.getWidth());
                } else {
                    iValueOf2 = 0;
                }
                c1387230mCf.LLJJI = iValueOf2;
                c1387230mCf.LLJJIII = Integer.valueOf(C1DD1.LIZJ());
                c1387230mCf.LLJJIJI = Integer.valueOf(C1DD1.LIZLLL());
                c1387230mCf.LLJJIJIIJIL = Integer.valueOf(C20291514aX.LIZLLL);
                c1387230mCf.LLJJJ = null;
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    lValueOf = Long.valueOf(statistics.getPlayCount());
                } else {
                    lValueOf = null;
                }
                c1387230mCf.LLJJJJ = lValueOf;
                AwemeStatistics statistics2 = aweme.getStatistics();
                if (statistics2 != null) {
                    lValueOf2 = Long.valueOf(statistics2.getDiggCount());
                } else {
                    lValueOf2 = null;
                }
                c1387230mCf.LLJJJJJIL = lValueOf2;
                AwemeStatistics statistics3 = aweme.getStatistics();
                if (statistics3 != null) {
                    lValueOf3 = Long.valueOf(statistics3.getCollectCount());
                } else {
                    lValueOf3 = null;
                }
                c1387230mCf.LLJJJJLIIL = lValueOf3;
                AwemeStatistics statistics4 = aweme.getStatistics();
                if (statistics4 != null) {
                    lValueOf4 = Long.valueOf(statistics4.getCommentCount());
                } else {
                    lValueOf4 = null;
                }
                c1387230mCf.LLJJL = lValueOf4;
                AwemeStatistics statistics5 = aweme.getStatistics();
                if (statistics5 != null) {
                    lValueOf5 = Long.valueOf(statistics5.getShareCount());
                } else {
                    lValueOf5 = null;
                }
                c1387230mCf.LLJJLIIIJLLLLLLLZ = lValueOf5;
                c1387230mCf.LLJL = 0;
                c1387230mCf.LLJLIL = null;
                c1387230mCf.LLJLL = mapLLLIIL;
                InterfaceC1588310rQz interfaceC1588310rQz4 = this.LL;
                if (interfaceC1588310rQz4 != null) {
                    iIntValue = Integer.valueOf(interfaceC1588310rQz4.y2() + 1).intValue();
                }
                c1387230mCf.LLJLLL = String.valueOf(iIntValue);
                AwemeExtKt.getAuthorUid(aweme);
                wo(new AwS434S0200000_33(this, new C1387240mCg(aweme, i, null, null, this, this, this, c1387230mCf, this), 86));
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onRenderFirstFrame, different sourceId, sourceId = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", currentId = ");
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        C0W17.LIZ("playerComponent", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        Aweme aweme;
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResumePlay, sourceId = ");
        sbLIZ.append(str);
        C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
        String aid2 = null;
        if (interfaceC1588310rQz != null) {
            aweme = interfaceC1588310rQz.getAweme();
        } else {
            aweme = null;
        }
        if (str != null) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                InterfaceC21699619wA interfaceC21699619wAHo = ho();
                if (interfaceC21699619wAHo != null) {
                    interfaceC21699619wAHo.onResumePlay(str, c1480430ocz);
                }
                this.LLIZ.put(str, Long.valueOf(System.currentTimeMillis()));
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onResumePlay, different sourceId, sourceId = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", currentId = ");
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        sbLIZ2.append(aid2);
        C0W17.LIZ("playerComponent", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void xo(InterfaceC1588310rQz interfaceC1588310rQz, EnumC21696919vj enumC21696919vj) {
        String aid;
        Aweme aweme;
        C0SDF c0sdfEd;
        InterfaceC21699519w9 interfaceC21699519w9Oo;
        EnumC1002540cCC enumC1002540cCC;
        InterfaceC21699519w9 interfaceC21699519w9;
        Aweme aweme2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPlay, cell aid= ");
        Surface surface = null;
        if (interfaceC1588310rQz != null && (aweme2 = interfaceC1588310rQz.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", reason=");
        sbLIZ.append(enumC21696919vj);
        C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1588310rQz != null && (aweme = interfaceC1588310rQz.getAweme()) != null) {
            InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL = interfaceC1588310rQz.LLIZLLLIL();
            if (interfaceC1582750rI1LLIZLLLIL != null && (c0sdfEd = interfaceC1582750rI1LLIZLLLIL.ed()) != null) {
                int i = C0SDG.LIZ[c0sdfEd.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        interfaceC21699519w9Oo = (C585370Mxb) this.LLJILJIL.getValue();
                    }
                } else {
                    interfaceC21699519w9Oo = oo();
                }
                if (!Intrinsics.LJFF(interfaceC21699519w9Oo, this.LLJI)) {
                    if ((!((Boolean) C0AIB.LIZ.getValue()).booleanValue() || enumC21696919vj != EnumC21696919vj.NAVIGATE_TO_DETAIL) && (interfaceC21699519w9 = this.LLJI) != null) {
                        interfaceC21699519w9.LJJIJ(null);
                    }
                    this.LLJI = interfaceC21699519w9Oo;
                }
                InterfaceC21699519w9 interfaceC21699519w92 = this.LLJI;
                if (interfaceC21699519w92 != null) {
                    interfaceC21699519w92.LJJIJ(this);
                }
                InterfaceC21699519w9 interfaceC21699519w93 = this.LLJI;
                if (interfaceC21699519w93 != null) {
                    InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL2 = interfaceC1588310rQz.LLIZLLLIL();
                    if (interfaceC1582750rI1LLIZLLLIL2 != null) {
                        surface = interfaceC1582750rI1LLIZLLLIL2.getSurface();
                    }
                    interfaceC21699519w93.setSurface(surface);
                }
                if (enumC21696919vj == EnumC21696919vj.NAVIGATE_TO_DETAIL) {
                    enumC1002540cCC = EnumC1002540cCC.BACK_DETAIL;
                } else {
                    enumC1002540cCC = EnumC1002540cCC.AUTO;
                }
                this.LLILLJJLI = enumC1002540cCC;
                C584190Mvh c584190Mvh = new C584190Mvh(this.LLJILJILJ);
                if (so(interfaceC1588310rQz) && enumC21696919vj != EnumC21696919vj.SESSION_CHANGE) {
                    InterfaceC21699519w9 interfaceC21699519w94 = this.LLJI;
                    if (interfaceC21699519w94 != null) {
                        interfaceC21699519w94.LIZLLL(aweme, c584190Mvh, interfaceC1588310rQz);
                    }
                } else {
                    this.LL = interfaceC1588310rQz;
                    InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL3 = interfaceC1588310rQz.LLIZLLLIL();
                    if (interfaceC1582750rI1LLIZLLLIL3 != null) {
                        interfaceC1582750rI1LLIZLLLIL3.bk();
                    }
                    this.LLJJIJI = false;
                    InterfaceC21699519w9 interfaceC21699519w95 = this.LLJI;
                    if (interfaceC21699519w95 != null) {
                        interfaceC21699519w95.LIZ(aweme, c584190Mvh);
                    }
                }
                InterfaceC21699519w9 interfaceC21699519w96 = this.LLJI;
                if (interfaceC21699519w96 != null) {
                    interfaceC21699519w96.LIZJ(aweme.getAid());
                }
                uo(fo().getState().LLILLL);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tryPlay, cell = ");
                sbLIZ2.append(interfaceC1588310rQz);
                sbLIZ2.append(",aweme:");
                sbLIZ2.append(aweme.getAid());
                C0W17.LIZJ("playerComponent", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            this.LL = null;
            this.LLILLJJLI = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        InterfaceC1361290lWp interfaceC1361290lWpLJIL;
        C0OB8 c0ob8;
        Aweme awemeM221do;
        String aid;
        String uid;
        InterfaceC1361290lWp interfaceC1361290lWpLJIL2;
        String uid2;
        InterfaceC1361270lWn interfaceC1361270lWn;
        User userLLILLL;
        int i2;
        if (str == null || getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C583620Mum.LIZJ(this, str, j, i);
        boolean z = true;
        if (C21699819wC.LIZ().enable && !this.LLJJIJI) {
            if (C21699819wC.LIZ().skipFastScroll && this.LLJILLL == 2 && (i2 = C21699819wC.LIZ().fastScrollDyThresholdDp) > 0) {
                if (Math.abs(this.LLJJ) > C339190DRl.LIZ(i2)) {
                    return;
                }
            }
            if (i < C21699819wC.LIZ().videoLoadThreshold && C21699819wC.LIZ().lowBufferAction == 0) {
                this.LLJJIJI = true;
                return;
            }
            this.LLJJIJI = true;
            int i3 = C21699819wC.LIZ().maxPhotoSkipDistance;
            if (!((Boolean) C260210AHr.LIZ.getValue()).booleanValue()) {
                awemeM221do = m221do(i3, str);
            } else {
                FriendsV3FeedListAbility friendsV3FeedListAbilityKo = ko();
                if (friendsV3FeedListAbilityKo != null) {
                    boolean zL50 = friendsV3FeedListAbilityKo.L50();
                    InterfaceC1588310rQz interfaceC1588310rQz = this.LL;
                    if (interfaceC1588310rQz != null) {
                        interfaceC1361290lWpLJIL = interfaceC1588310rQz.LJIL();
                    } else {
                        interfaceC1361290lWpLJIL = null;
                    }
                    if ((interfaceC1361290lWpLJIL instanceof InterfaceC1361270lWn) && (c0ob8 = (C0OB8) interfaceC1361290lWpLJIL) != null) {
                        if (zL50) {
                            String aid2 = c0ob8.getAweme().getAid();
                            C1223430hwT c1223430hwT = (C1223430hwT) lo().getState();
                            c1223430hwT.getClass();
                            List<InterfaceC1361290lWp> list = c1223430hwT.getListState().LLILZ;
                            if (list != null && !list.isEmpty()) {
                                Iterator<InterfaceC1361290lWp> it2 = list.iterator();
                                int i4 = 0;
                                while (true) {
                                    int iMax = -1;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    InterfaceC1361290lWp next = it2.next();
                                    if (next instanceof InterfaceC1361270lWn) {
                                        InterfaceC1361270lWn interfaceC1361270lWn2 = (InterfaceC1361270lWn) next;
                                        if (Intrinsics.LJFF(interfaceC1361270lWn2.getAweme().getAid(), aid2)) {
                                            User userLLILLL2 = interfaceC1361270lWn2.LLILLL();
                                            if (userLLILLL2 != null) {
                                                uid = userLLILLL2.getUid();
                                            } else {
                                                uid = null;
                                            }
                                            InterfaceC1588310rQz interfaceC1588310rQz2 = this.LL;
                                            if (interfaceC1588310rQz2 != null) {
                                                interfaceC1361290lWpLJIL2 = interfaceC1588310rQz2.LJIL();
                                            } else {
                                                interfaceC1361290lWpLJIL2 = null;
                                            }
                                            if ((interfaceC1361290lWpLJIL2 instanceof InterfaceC1361270lWn) && (interfaceC1361270lWn = (InterfaceC1361270lWn) interfaceC1361290lWpLJIL2) != null && (userLLILLL = interfaceC1361270lWn.LLILLL()) != null) {
                                                uid2 = userLLILLL.getUid();
                                            } else {
                                                uid2 = null;
                                            }
                                            if (Intrinsics.LJFF(uid, uid2)) {
                                                if (i4 != -1) {
                                                    if (i3 > 0) {
                                                        iMax = Math.max(-1, (i4 - 1) - i3);
                                                    }
                                                    int i5 = i4 - 1;
                                                    int i6 = iMax + 1;
                                                    if (i6 <= i5) {
                                                        while (true) {
                                                            InterfaceC1361290lWp interfaceC1361290lWp = (InterfaceC1361290lWp) ListProtector.get(list, i5);
                                                            if (interfaceC1361290lWp instanceof InterfaceC1361270lWn) {
                                                                C0OB8 c0ob82 = (C0OB8) interfaceC1361290lWp;
                                                                if (!AwemeExtKt.isPhotoMode(c0ob82.getAweme())) {
                                                                    awemeM221do = c0ob82.getAweme();
                                                                    break;
                                                                }
                                                            }
                                                            if (i5 == i6) {
                                                                break;
                                                            } else {
                                                                i5--;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    i4++;
                                }
                                awemeM221do = null;
                            } else {
                                awemeM221do = null;
                            }
                        } else {
                            awemeM221do = m221do(i3, c0ob8.getAweme().getAid());
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tryGetNextPrerenderAwemeByScrollDirection, current aid is ");
                        sbLIZ.append(c0ob8.getAweme().getAid());
                        sbLIZ.append(",next aid is ");
                        if (awemeM221do != null) {
                            aid = awemeM221do.getAid();
                        } else {
                            aid = null;
                        }
                        sbLIZ.append(aid);
                        sbLIZ.append(",isScrollDown:");
                        sbLIZ.append(zL50);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (awemeM221do != null) {
                if (!((Boolean) C0AIR.LIZ.getValue()).booleanValue() && (i >= C21699819wC.LIZ().videoLoadThreshold || C21699819wC.LIZ().lowBufferAction != 1)) {
                    z = false;
                }
                oo().LJI(awemeM221do, null, z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayFailed, sourceId=");
        sbLIZ.append(str);
        sbLIZ.append(", error=");
        sbLIZ.append(c1481290oeN);
        sbLIZ.append(", playerEvent=");
        sbLIZ.append(c1480430ocz);
        C0W17.LIZ("playerComponent", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC21699619wA interfaceC21699619wAHo = ho();
        if (interfaceC21699619wAHo != null) {
            interfaceC21699619wAHo.onPlayFailed(str, c1481290oeN, c1480430ocz);
        }
        C584830Mwj c584830Mwj = (C584830Mwj) this.LLJ.getValue();
        if (c584830Mwj != null) {
            c584830Mwj.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayProgressChange, sourceId = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC21699619wA interfaceC21699619wAHo = ho();
        if (interfaceC21699619wAHo != null) {
            interfaceC21699619wAHo.onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
        C584830Mwj c584830Mwj = (C584830Mwj) this.LLJ.getValue();
        if (c584830Mwj != null) {
            c584830Mwj.LIZJ();
        }
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

package com.ss.android.ugc.aweme.series.commonfeed.holder;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C0RF0;
import X.C0SFC;
import X.C0XQ7;
import X.C1012040cRW;
import X.C1336100ksC;
import X.C1388190mED;
import X.C1480420ocy;
import X.C1483410ohn;
import X.C1579380rCa;
import X.C1600820rlA;
import X.C1600830rlB;
import X.C1600840rlC;
import X.C1600850rlD;
import X.C1600910rlJ;
import X.C1611420s2G;
import X.C1612090s3L;
import X.C1612650s4F;
import X.C1906580ziK;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C452501pT;
import X.C583620Mum;
import X.C628500Oky;
import X.C630740Ooa;
import X.C694550RMf;
import X.C695070ROf;
import X.C718510SGj;
import X.C737910Sx3;
import X.InterfaceC690460R6m;
import Y.ARunnableS111S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService;
import com.ss.android.ugc.aweme.appdiff.ISeriesInnerFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.adapter.ForwardFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.series.common.utils.MiniDramaMonitor;
import com.ss.android.ugc.aweme.series.commonfeed.component.playnext.IAutoPlayNextConflictAbility;
import com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public class PaidContentVideoViewHolder extends ForwardFeedVideoViewHolder {
    public long V0;
    public long W0;
    public final String X0;
    public final C01GW Y0;
    public final C01GW Z0;
    public final C01GW a1;
    public final C01GW b1;
    public boolean c1;
    public String d1;
    public final C630740Ooa e1;
    public final C01GW f1;
    public final C01GW g1;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LLLIIL() {
        return 27;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJLLILLLL() {
        if (y1(new AwS568S0100000_24(this, 906))) {
            p1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final boolean LLLZ() {
        if ((Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "paid_series_detail_page") && C0SFC.LIZIZ.LJIIIIZZ(this.LLJJ)) || ((ISeriesLimitedFreeService) this.g1.getValue()).LJI()) {
            return false;
        }
        return super.LLLZ();
    }

    public final void p1() {
        C19EG activity;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        boolean z = true;
        if (Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "paid_series_detail_page")) {
            return;
        }
        C694550RMf.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("paid_content_prevent_screen_recording", true) || (activity = getActivity()) == null) {
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) == null) {
            activityLIZIZ = null;
        } else {
            activityLIZIZ = C737910Sx3.LIZIZ(activityLIZIZ2);
            if (activityLIZIZ != null && !activityLIZIZ.isFinishing() && !activityLIZIZ.isDestroyed()) {
                z = false;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("disable screen capture, activity: ");
        C19EG activity2 = getActivity();
        sbLIZ.append(activity2 != null ? activity2.getClass().getSimpleName() : null);
        sbLIZ.append(", topActivity: ");
        sbLIZ.append(activityLIZIZ != null ? activityLIZIZ.getClass().getSimpleName() : null);
        sbLIZ.append(", topNotRunning: ");
        sbLIZ.append(z);
        C2344809Gs.LIZLLL(4, "PaidContent", C2188811AlT.LIZIZ(sbLIZ));
        if (z || Intrinsics.LJFF(getActivity(), activityLIZIZ)) {
            C1336100ksC.LJFF(activity);
            C2344809Gs.LIZLLL(4, "PaidContent", "disable screen capture, done");
        }
    }

    public final void v1() {
        Window window;
        if (Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "paid_series_detail_page")) {
            return;
        }
        C694550RMf.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("paid_content_prevent_screen_recording", true)) {
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.clearFlags(8192);
            }
            C2344809Gs.LIZLLL(4, "PaidContent", "enable screen capture");
        }
    }

    public final C1600820rlA x1() {
        return (C1600820rlA) this.b1.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LLFF() {
        super.LLFF();
        if (y1(new AwS568S0100000_24(this, 905))) {
            p1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void unBind() {
        super.unBind();
        C1600820rlA c1600820rlAX1 = x1();
        if (c1600820rlAX1.LIZIZ) {
            EventBus.LIZLLL().LJJI(c1600820rlAX1);
            c1600820rlAX1.LIZIZ = false;
        }
        this.c1 = false;
        this.d1 = null;
    }

    public PaidContentVideoViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.X0 = C0XQ7.LJFF().getCurUserId();
        this.Y0 = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(262));
        this.Z0 = C452501pT.LIZIZ(new AwS568S0100000_24(this, 908));
        this.a1 = C452501pT.LIZIZ(new AwS555S0100000_11(this, 544));
        this.b1 = C452501pT.LIZIZ(new AwS568S0100000_24(this, 909));
        this.e1 = C628500Oky.LIZ(new AwS568S0100000_24(this, 904));
        this.f1 = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(264));
        this.g1 = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(263));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ForwardFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public void LJI(Aweme aweme) {
        super.LJI(aweme);
        C1600820rlA c1600820rlAX1 = x1();
        c1600820rlAX1.getClass();
        if (C1600840rlC.LIZ() && !c1600820rlAX1.LIZIZ) {
            EventBus.LIZLLL().LJIJJ(c1600820rlAX1);
            c1600820rlAX1.LIZIZ = true;
        }
        C1600910rlJ.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("drama_reset_progress_on_bind", 1) == C1600910rlJ.LIZIZ) {
            this.V0 = 0L;
            this.W0 = 0L;
        }
        z1(aweme);
        IClearModePanelComponent iClearModePanelComponent = (IClearModePanelComponent) this.e1.getValue();
        if (iClearModePanelComponent != null && iClearModePanelComponent.uT1()) {
            LifecycleOwnerExtensionsKt.LIZ(this, new ARunnableS111S0100000_11((Object) this, 44));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        ((ICommerceFeedSeriesService) this.Y0.getValue()).Q00(this.LLJJ);
        this.W0 = 0L;
        this.V0 = 0L;
        p1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void LJLIIIL(int i) {
        super.LJLIIIL(i);
        B1(2, this.W0, this.V0);
        v1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public void LLLI(int i) {
        super.LLLI(i);
        if (y1(new AwS555S0100000_11(this, 543))) {
            p1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public void h(boolean z) {
        boolean z2;
        C1600830rlB c1600830rlB;
        Long lValueOf;
        List<Aweme> awemeList;
        super.h(z);
        C1600910rlJ.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("drama_reset_progress_on_bind", 1) == C1600910rlJ.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || this.V0 > 0) {
            B1(1, this.W0, this.V0);
        }
        x1().LIZIZ(this.V0);
        C1600820rlA c1600820rlAX1 = x1();
        PaidContentVideoViewHolder paidContentVideoViewHolder = c1600820rlAX1.LIZ;
        Aweme aweme = paidContentVideoViewHolder.LLJJ;
        if (aweme != null && C1600850rlD.LIZIZ.LIZ(paidContentVideoViewHolder.LLJILJILJ.LJIIIZ) && aweme.isPaidContent && !C695070ROf.LIZ(aweme) && !C1579380rCa.LIZ(aweme) && !C1611420s2G.LIZ(aweme) && (c1600830rlB = C1600830rlB.LIZJ) != null) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null) {
                lValueOf = Long.valueOf(paidContentInfo.getPaidCollectionId());
            } else {
                lValueOf = null;
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) c1600820rlAX1.LIZ.a1.getValue();
            if (iFeedPanelPlatformAbility != null && (awemeList = iFeedPanelPlatformAbility.getAwemeList()) != null && !awemeList.isEmpty()) {
                Iterator<Aweme> it2 = awemeList.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it2.next().getAid(), aweme.getAid())) {
                        if (i >= 0) {
                            int i2 = i + 1;
                            int size = awemeList.size();
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                Aweme aweme2 = (Aweme) ListProtector.get(awemeList, i2);
                                if (!C1611420s2G.LIZ(aweme2) && !C695070ROf.LIZ(aweme2) && !C0SFC.LIZIZ.LJIIIIZZ(aweme2)) {
                                    aweme = aweme2;
                                    break;
                                } else if (C695070ROf.LIZ(aweme2) || C0SFC.LIZIZ.LJIIIIZZ(aweme2)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
                aweme = null;
                c1600830rlB.LIZJ(lValueOf, aweme, 0.0f);
            } else {
                aweme = null;
                c1600830rlB.LIZJ(lValueOf, aweme, 0.0f);
            }
        }
        this.W0 = 0L;
        this.V0 = 0L;
        this.c1 = false;
        this.d1 = null;
        v1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        super.onPausePlay(str);
        if (this.LLJJ.getAid() != null && this.LLJJ.getAid().equals(str)) {
            B1(0, this.W0, this.V0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        long duration;
        super.onPlayCompleted(str);
        long j = this.W0;
        Video video = this.LLJJ.getVideo();
        if (video != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        B1(4, j, duration);
        this.W0 = 0L;
        this.V0 = 0L;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        String aid;
        C583620Mum.LJJIII(this, str);
        IPaidContentService iPaidContentService = (IPaidContentService) ServiceManager.get().getService(IPaidContentService.class);
        Aweme aweme = this.LLJJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        iPaidContentService.LIZIZ(aid);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        String aid;
        super.onPreparePlay(str);
        IPaidContentService iPaidContentService = (IPaidContentService) ServiceManager.get().getService(IPaidContentService.class);
        Aweme aweme = this.LLJJ;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        iPaidContentService.LIZIZ(aid);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        PaidContentVideoViewHolder paidContentVideoViewHolder;
        Aweme aweme;
        super.onRenderFirstFrame(c1480420ocy);
        C1600820rlA c1600820rlAX1 = x1();
        c1600820rlAX1.getClass();
        if (C1600840rlC.LIZ() && c1600820rlAX1.LIZ.getActivity() != null && (aweme = (paidContentVideoViewHolder = c1600820rlAX1.LIZ).LLJJ) != null && Intrinsics.LJFF(paidContentVideoViewHolder.LLJILJILJ.LJIIIZ, "paid_series_detail_page") && !C1611420s2G.LIZ(aweme) && !C695070ROf.LIZ(aweme) && !C1579380rCa.LIZ(aweme)) {
            C1012040cRW c1012040cRWLIZIZ = C1012040cRW.LIZIZ();
            c1012040cRWLIZIZ.LIZ = C1483410ohn.LJLJJI();
            c1012040cRWLIZIZ.LIZIZ = aweme.getAid();
        }
        this.c1 = false;
        this.d1 = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        String aid;
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        String string;
        super.onResumePlay(str);
        if (Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "paid_series_detail_page") && (aweme = this.LLJJ) != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (string = Long.valueOf(paidContentInfo.getPaidCollectionId()).toString()) != null) {
            ((IPaidContentService) ServiceManager.get().getService(IPaidContentService.class)).LJFF(string);
        }
        Aweme aweme2 = this.LLJJ;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid) && y1(new AwS568S0100000_24(this, 907))) {
            p1();
        }
        s1(str);
    }

    public final void s1(String str) {
        Aweme aweme;
        String aid;
        Aweme aweme2;
        if (!this.c1 || (aweme = this.LLJJ) == null || (aid = aweme.getAid()) == null || !Intrinsics.LJFF(aid, str)) {
            return;
        }
        this.c1 = false;
        String str2 = this.d1;
        this.d1 = null;
        if (str2 != null && Intrinsics.LJFF(str2, aid)) {
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("mini_drama_video_play_et_compensation", true) || (aweme2 = this.LLJJ) == null) {
            return;
        }
        String eventType = getEventType();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", eventType);
        String aid2 = aweme2.getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid2);
        C2344009Gk c2344009Gk2 = (C2344009Gk) C1612650s4F.LIZIZ(c2344009Gk, aweme2);
        c2344009Gk2.LJFF("enter_from", eventType);
        c2344009Gk2.LJFF("series_enter_entrance", "");
        C20684815ws.LJIILLIIL("video_play", c2344009Gk2.LIZ);
    }

    public final boolean y1(Function0<Boolean> function0) {
        ISeriesInnerFeedAppDiffProtocol.LIZ.getClass();
        ISeriesInnerFeedAppDiffProtocol iSeriesInnerFeedAppDiffProtocolLIZ = C1612090s3L.LIZ();
        Context context = this.LLLLLLLLLL;
        if (context != null) {
            C1388190mED.LIZIZ(context);
        }
        boolean zBooleanValue = function0.invoke().booleanValue();
        iSeriesInnerFeedAppDiffProtocolLIZ.LIZJ(zBooleanValue);
        return zBooleanValue;
    }

    public void z1(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        this.W0 = 0L;
        Aweme aweme2 = this.LLJJ;
        if (!C718510SGj.LJ(aweme2) && ((aweme2 == null || (paidContentInfo = aweme2.mPaidContentInfo) == null || !paidContentInfo.isLimitedFreeShortDrama()) && !Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "homepage_hot"))) {
            Ft2(new InterfaceC690460R6m() { // from class: X.0SHi
                @Override // X.InterfaceC690460R6m
                public final void LIZ(float f, float f2) {
                    FragmentManager supportFragmentManager;
                    C19EG c19egLIZIZ;
                    PaidContentVideoViewHolder paidContentVideoViewHolder = this.LIZ;
                    paidContentVideoViewHolder.getClass();
                    IPaidContentService iPaidContentService = (IPaidContentService) ServiceManager.get().getService(IPaidContentService.class);
                    String authorUid = AwemeExtKt.getAuthorUid(paidContentVideoViewHolder.LLJJ);
                    String aid = paidContentVideoViewHolder.LLJJ.getAid();
                    String uid = "";
                    if (aid == null) {
                        aid = "";
                    }
                    Aweme aweme3 = paidContentVideoViewHolder.LLJJ;
                    String eventType = paidContentVideoViewHolder.getEventType();
                    Context context = paidContentVideoViewHolder.LLLLLLLLLL;
                    if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                        supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                    } else {
                        supportFragmentManager = null;
                    }
                    iPaidContentService.LJIILL(authorUid, aid, aweme3, eventType, supportFragmentManager, new DialogInterfaceOnDismissListenerC738790SyT(paidContentVideoViewHolder, 11));
                    IAutoPlayNextConflictAbility iAutoPlayNextConflictAbility = (IAutoPlayNextConflictAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(paidContentVideoViewHolder), IAutoPlayNextConflictAbility.class, null);
                    if (iAutoPlayNextConflictAbility != null) {
                        iAutoPlayNextConflictAbility.xI0(true);
                    }
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    C19651011uW c19651011uW = C19651011uW.LIZIZ;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    String aid2 = paidContentVideoViewHolder.LLJJ.getAid();
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    c2344009Gk.LJIIIIZZ("group_id", aid2);
                    if (paidContentVideoViewHolder.LLJJ.getAuthor() != null) {
                        uid = paidContentVideoViewHolder.LLJJ.getAuthor().getUid();
                    }
                    c2344009Gk.LJIIIIZZ("author_id", uid);
                    c2344009Gk.LJIIIIZZ("content_type", C735370Ssx.LJFF(paidContentVideoViewHolder.LLJJ));
                    c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(paidContentVideoViewHolder.LLJJ)));
                    c2344009Gk.LJIIIIZZ("enter_from", paidContentVideoViewHolder.getEventType());
                    c2344009Gk.LJIIIIZZ("enter_method", "detail");
                    c2344009Gk.LJIIIIZZ("from_group_id", C584760Mwc.LIZ(C0SUC.LIZ(paidContentVideoViewHolder.LLLLLLLLLL).getPreviousPage(), C0SUC.LIZ(paidContentVideoViewHolder.LLLLLLLLLL).getFromGroupId()));
                    String str = "1";
                    c2344009Gk.LJIIIIZZ("is_collection_item", "1");
                    c2344009Gk.LJ(Boolean.valueOf(paidContentVideoViewHolder.LLJJ.isSubOnlyVideo()), "is_sub_only_video");
                    c2344009Gk.LJ(Boolean.valueOf(paidContentVideoViewHolder.LLJJ.isSubOnlyVideo()), "is_sub_only_video");
                    Object objLJIIIZ = c19651011uW.LJIIIZ(paidContentVideoViewHolder.LLJJ, c2344009Gk);
                    Aweme aweme4 = paidContentVideoViewHolder.LLJJ;
                    c735840Sti.getClass();
                    C735840Sti.LIZIZ(aweme4, objLJIIIZ);
                    C2344009Gk c2344009Gk2 = (C2344009Gk) C1612650s4F.LIZIZ(objLJIIIZ, paidContentVideoViewHolder.LLJJ);
                    if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk2.getClass();
                    c2344009Gk2.LJIIIIZZ("login_type", str);
                    C20684815ws.LJIILLIIL("click_trans_layer", c2344009Gk2.LIZ);
                }
            });
        }
        MiniDramaMonitor.LIZ(new AwS173S1100000_24(aweme, this.LLJILJILJ.LJIIIZ, 4));
        MiniDramaMonitor.LIZ(new AwS568S0100000_24(aweme, 894));
        MiniDramaMonitor.LIZ(new AwS173S1100000_24(aweme, this.LLJILJILJ.LJIIIZ, 3));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        super.onSeekEnd(str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(int r28, long r29, long r31) {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder.B1(int, long, long):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        super.onPlayProgressChange(str, j, j2);
        if (this.LLJJ.getAid() != null && this.LLJJ.getAid().equals(str)) {
            if (j < this.W0) {
                this.W0 = j;
            }
            this.V0 = j;
        }
        s1(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        super.onSeekStart(str, i, f);
        B1(3, this.W0, this.V0);
        long j = i;
        this.W0 = j;
        this.V0 = j;
    }
}

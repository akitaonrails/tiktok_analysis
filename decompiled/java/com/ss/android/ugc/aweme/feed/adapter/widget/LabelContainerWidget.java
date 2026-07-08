package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C011Y;
import X.C01GW;
import X.C0IJT;
import X.C0K9P;
import X.C0RZW;
import X.C0SD1;
import X.C0UO0;
import X.C1017070cZd;
import X.C1088200eQM;
import X.C10EU;
import X.C1161920gLG;
import X.C11JF;
import X.C1308910kAL;
import X.C1324840ka2;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1AAZ;
import X.C1AB0;
import X.C1AB1;
import X.C1AB2;
import X.C1AB4;
import X.C1AB5;
import X.C1AB7;
import X.C1AB8;
import X.C1AB9;
import X.C1ABA;
import X.C1ABB;
import X.C1ABC;
import X.C1ABF;
import X.C1ABT;
import X.C1ABV;
import X.C1AC7;
import X.C1ACA;
import X.C20684815ws;
import X.C2175181AAy;
import X.C2175191AAz;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2651010v;
import X.C299470BoX;
import X.C300940Bqu;
import X.C420420Ge8;
import X.C446060HeO;
import X.C446080HeQ;
import X.C452501pT;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C994460bzA;
import X.C998730c63;
import X.C998740c64;
import X.C998750c65;
import X.C998760c66;
import X.C998770c67;
import X.C998780c68;
import X.C998790c69;
import X.EnumC1847410yAt;
import X.EnumC2175001AAg;
import X.EnumC494740Jai;
import X.EnumC765980U2y;
import X.EnumC994450bz9;
import X.ViewOnLayoutChangeListenerC2175171AAx;
import Y.AObserverS235S0100000_33;
import Y.AfS176S0100000_7;
import Y.AfS48S1200000_27;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubSuperFanFeedPreviewEntranceSettings;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubSuperFanFeedPreviewUseLocalTextSettings;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePreviewCardMultiRepostTagSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.subscribe.model.SubOnlyLiveInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.service.IAdTagLogHelper;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.PreviewMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostApi;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveShareUser;
import com.ss.android.ugc.aweme.feed.model.live.PaidEventPreview;
import com.ss.android.ugc.aweme.feed.model.live.RepostInfo;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.feed.model.live.WatchReasonItem;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS65S2100000_27;
import kotlin.jvm.internal.AwS676S0100000_27;
import kotlin.jvm.internal.AwS78S0100100_33;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: loaded from: classes34.dex */
public final class LabelContainerWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLLF = 0;
    public final C01GW LLJ = C452501pT.LIZIZ(new C1AB7(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C2175181AAy(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1AB8(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1AB9(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1ABC(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C2175191AAz(this));
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1ABA(this));
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1ABB(this));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2088));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C998730c63(this));
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public C1AB2 LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public boolean LLJLIL;
    public C1AB5 LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public C011Y LLJLLL;
    public boolean LLJZ;
    public String LLJZIJLIL;
    public final ViewOnLayoutChangeListenerC2175171AAx LLL;

    /* JADX WARN: Type inference failed for: r0v40, types: [X.1AAx] */
    public LabelContainerWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        C998770c67 c998770c67 = new C998770c67(c19719912DlLIZ);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJJIJIIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, c998770c67, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewFollowVM.class);
        this.LLJJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new C998780c68(c19719912DlLIZ2), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SubscribeMaskLayerVM.class);
        this.LLJJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new C998790c69(c19719912DlLIZ3), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(PreviewMaskLayerVM.class);
        this.LLJJJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new C998740c64(c19719912DlLIZ4), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJJJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new C998750c65(c19719912DlLIZ5), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        this.LLJJJJJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ6, enumC494740Jai, new C998760c66(c19719912DlLIZ6), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(LiveRepostVM.class);
        this.LLJJJJLIIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ7, enumC494740Jai, new AwS560S0100000_16((C13IQ) c19719912DlLIZ7, 270), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ8, enumC494740Jai, new AwS560S0100000_16((C13IQ) c19719912DlLIZ8, 271), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJL = -1L;
        this.LLJZIJLIL = "";
        this.LLL = new View.OnLayoutChangeListener() { // from class: X.1AAx
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 == i7) {
                    LabelContainerWidget labelContainerWidget = this.LL;
                    if (labelContainerWidget.LLJLL != 0 && labelContainerWidget.LLJLLIL != 0) {
                        return;
                    }
                }
                int iLJIIZILJ = C497740JfY.LJIIZILJ();
                this.LL.LLJLLIL = iLJIIZILJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
                LabelContainerWidget labelContainerWidget2 = this.LL;
                labelContainerWidget2.LLJLL = (labelContainerWidget2.LLJLLIL - i3) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                this.LL.k2();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        this.LLJZ = false;
        C1AB5 c1ab5 = this.LLJLILLLLZIIL;
        if (c1ab5 != null) {
            c1ab5.cancel();
        }
        this.LLJLILLLLZIIL = null;
        C786410Ut5.LJZ(8, X1());
        Q1().removeOnLayoutChangeListener(this.LLL);
        LiveRepostVM liveRepostVMT1 = T1();
        if (liveRepostVMT1 != null) {
            liveRepostVMT1.LLIZ = false;
            ((CopyOnWriteArrayList) liveRepostVMT1.LLILZ).clear();
            liveRepostVMT1.LLJILJIL = false;
            C11JF c11jf = liveRepostVMT1.LLILZIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            liveRepostVMT1.LLILZIL = null;
            C11JF c11jf2 = liveRepostVMT1.LLILZLL;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            liveRepostVMT1.LLILZLL = null;
        }
        C011Y c011y = this.LLJLLL;
        if (c011y != null) {
            HandlerHook.viewRemoveCallbacks(W1(), c011y);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        this.LLJZ = false;
        M1(EnumC994450bz9.HIDE);
        LiveRepostVM liveRepostVMT1 = T1();
        if (liveRepostVMT1 != null) {
            if (liveRepostVMT1.LLJIJIL) {
                liveRepostVMT1.CQ2();
            }
            liveRepostVMT1.LLJIJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    static {
        new Object() { // from class: X.1ABD
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        M1(EnumC994450bz9.SHOW);
        LiveRepostVM liveRepostVMT1 = T1();
        if (liveRepostVMT1 != null) {
            if (!liveRepostVMT1.LLJIJIL && liveRepostVMT1.LLJILJIL) {
                liveRepostVMT1.EQ2();
            }
            liveRepostVMT1.LLJIJIL = true;
        }
    }

    public final C0SD1 O1() {
        return (C0SD1) this.LLJJIJI.getValue();
    }

    public final FeedLiveViewHolderVM P1() {
        return (FeedLiveViewHolderVM) this.LLJJIJIIJIL.getValue();
    }

    public final LinearLayout Q1() {
        return (LinearLayout) this.LLJ.getValue();
    }

    public final TuxTextView R1() {
        return (TuxTextView) this.LLJIJIL.getValue();
    }

    public final LivePreviewPlayerVM S1() {
        return (LivePreviewPlayerVM) this.LLJJJJ.getValue();
    }

    public final LiveRepostVM T1() {
        return (LiveRepostVM) this.LLJJJJLIIL.getValue();
    }

    public final C420420Ge8 V1() {
        return (C420420Ge8) this.LLJJIII.getValue();
    }

    public final C446080HeQ W1() {
        return (C446080HeQ) this.LLJJI.getValue();
    }

    public final FrameLayout X1() {
        return (FrameLayout) this.LLJILJIL.getValue();
    }

    public final RemoteImageView Y1() {
        return (RemoteImageView) this.LLJILLL.getValue();
    }

    public final TuxTextView a2() {
        return (TuxTextView) this.LLJJ.getValue();
    }

    public final boolean h2() {
        return LiveFansClubSuperFanFeedPreviewEntranceSettings.INSTANCE.getValue() || ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).pY1(User.subSplitStatus) || ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.dataChannel);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.1AB5, android.os.CountDownTimer] */
    public final void i2() {
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct;
        LiveEventInfo liveEventInfo;
        PaidEventPreview paidEventPreview;
        Long l;
        LiveRoomStruct liveRoomStruct2;
        LiveEventInfo liveEventInfo2;
        PaidEventPreview paidEventPreview2;
        Long l2;
        LiveRoomStruct liveRoomStruct3;
        LiveEventInfo liveEventInfo3;
        PaidEventPreview paidEventPreview3;
        LiveRoomStruct liveRoomStruct4;
        LiveRoomStruct liveRoomStruct5;
        C1AB5 c1ab5 = this.LLJLILLLLZIIL;
        if (c1ab5 != null) {
            c1ab5.cancel();
        }
        EnumC2175001AAg enumC2175001AAgLJIILLIIL = null;
        this.LLJLILLLLZIIL = null;
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null && (liveRoomStruct5 = c1acaZ12.LIZJ) != null) {
            enumC2175001AAgLJIILLIIL = C1ABT.LJIILLIIL(liveRoomStruct5);
        }
        if (enumC2175001AAgLJIILLIIL != EnumC2175001AAg.PREVIEW || (c1acaZ1 = z1()) == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || (liveEventInfo = liveRoomStruct.liveEventInfo) == null || (paidEventPreview = liveEventInfo.paidEventPreview) == null || (l = paidEventPreview.allowPreviewTime) == null) {
            return;
        }
        long jLongValue = l.longValue();
        C1ACA c1acaZ13 = z1();
        long j = 0;
        final long jLIZIZ = C2651010v.LIZIZ(jLongValue, Long.valueOf((c1acaZ13 == null || (liveRoomStruct4 = c1acaZ13.LIZJ) == null) ? 0L : liveRoomStruct4.id));
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 != null && (liveRoomStruct3 = c1acaZ14.LIZJ) != null && (liveEventInfo3 = liveRoomStruct3.liveEventInfo) != null && (paidEventPreview3 = liveEventInfo3.paidEventPreview) != null) {
            paidEventPreview3.setAllowPreviewTime(Long.valueOf(jLIZIZ));
        }
        PreviewMaskLayerVM previewMaskLayerVM = (PreviewMaskLayerVM) this.LLJJJIL.getValue();
        if (previewMaskLayerVM != null) {
            C1ACA c1acaVQ2 = previewMaskLayerVM.vQ2();
            if (c1acaVQ2 != null && (liveRoomStruct2 = c1acaVQ2.LIZJ) != null && (liveEventInfo2 = liveRoomStruct2.liveEventInfo) != null && (paidEventPreview2 = liveEventInfo2.paidEventPreview) != null && (l2 = paidEventPreview2.allowPreviewTime) != null) {
                long jLongValue2 = l2.longValue();
                if (jLongValue2 > 0) {
                    j = jLongValue2;
                }
            }
            previewMaskLayerVM.LLILZIL = j;
        }
        C1AAZ c1aaz = C1AAZ.LIZ;
        C1ACA c1acaZ15 = z1();
        c1aaz.getClass();
        Map mapLIZ = C1AAZ.LIZ(c1acaZ15);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(mapLIZ);
        C20684815ws.LJIILLIIL("livesdk_paid_event_count_down_show", c2344009Gk.LIZ);
        ?? r0 = new CountDownTimer(jLIZIZ) { // from class: X.1AB5
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                LiveRoomStruct liveRoomStruct6;
                LiveEventInfo liveEventInfo4;
                PaidEventPreview paidEventPreview4;
                C1ACA c1acaZ16 = this.z1();
                if (c1acaZ16 != null && (liveRoomStruct6 = c1acaZ16.LIZJ) != null && (liveEventInfo4 = liveRoomStruct6.liveEventInfo) != null && (paidEventPreview4 = liveEventInfo4.paidEventPreview) != null) {
                    paidEventPreview4.setAllowPreviewTime(0L);
                }
                PreviewMaskLayerVM previewMaskLayerVM2 = (PreviewMaskLayerVM) this.LLJJJIL.getValue();
                if (previewMaskLayerVM2 != null) {
                    previewMaskLayerVM2.LLILLJJLI.setValue(Boolean.TRUE);
                }
                PreviewMaskLayerVM previewMaskLayerVM3 = (PreviewMaskLayerVM) this.LLJJJIL.getValue();
                if (previewMaskLayerVM3 != null) {
                    previewMaskLayerVM3.wQ2(false);
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j2) {
                LiveRoomStruct liveRoomStruct6;
                LiveEventInfo liveEventInfo4;
                PaidEventPreview paidEventPreview4;
                LabelContainerWidget labelContainerWidget = this;
                C1ACA c1acaZ16 = labelContainerWidget.z1();
                if (c1acaZ16 != null && (liveRoomStruct6 = c1acaZ16.LIZJ) != null && (liveEventInfo4 = liveRoomStruct6.liveEventInfo) != null && (paidEventPreview4 = liveEventInfo4.paidEventPreview) != null) {
                    paidEventPreview4.setAllowPreviewTime(Long.valueOf(j2));
                }
                labelContainerWidget.a2().setText(LabelContainerWidget.U1(j2));
            }
        };
        this.LLJLILLLLZIIL = r0;
        r0.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0438, code lost:
    
        if (r5.icon != null) goto L265;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.011Y] */
    /* JADX WARN: Type inference failed for: r1v31, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k2() {
        /*
            Method dump skipped, instruction units count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget.k2():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        C1ACA c1acaVQ2;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        String str;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LL = false;
        }
        C786410Ut5.LJZL(0, Q1());
        Q1().addOnLayoutChangeListener(this.LLL);
        LiveRepostVM liveRepostVMT1 = T1();
        if (liveRepostVMT1 == null || (c1acaVQ2 = liveRepostVMT1.vQ2()) == null || (liveRoomStruct = c1acaVQ2.LIZJ) == null) {
            return;
        }
        RepostInfo repostInfo = liveRoomStruct.repostInfo;
        if (!(repostInfo != null && repostInfo.showTag) || !((CopyOnWriteArrayList) liveRepostVMT1.LLILZ).isEmpty()) {
            LiveRepostVM.HQ2(liveRepostVMT1, null, Boolean.TRUE, 1);
            return;
        }
        C1ACA c1acaVQ22 = liveRepostVMT1.vQ2();
        if (c1acaVQ22 != null && (liveRoomStruct2 = c1acaVQ22.LIZJ) != null) {
            long j = liveRoomStruct2.id;
            RepostInfo repostInfo2 = liveRoomStruct2.repostInfo;
            if (repostInfo2 == null || (str = repostInfo2.repostersToken) == null) {
                str = "";
            }
            HashMap<String, List<WebcastRoomRepostRepostersResponse.Reposter>> map = LiveRepostVM.LLJILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append('_');
            sbLIZ.append(str);
            List<WebcastRoomRepostRepostersResponse.Reposter> list = map.get(C2188811AlT.LIZIZ(sbLIZ));
            if (list == null || list.isEmpty()) {
                if (liveRepostVMT1.LLILZIL == null) {
                    boolean zLJFF = Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE);
                    C480460Ism.LIZ().getClass();
                    liveRepostVMT1.LLILZIL = (C11JF) ((LiveRepostApi) C480460Ism.LIZLLL(LiveRepostApi.class)).getReposters(j, str, zLJFF).LJIILIIL(new C0UO0()).LJJLL(new AfS48S1200000_27(liveRepostVMT1, liveRoomStruct2, str, 0), new AfS176S0100000_7(liveRepostVMT1, 187));
                    return;
                }
                return;
            }
            liveRepostVMT1.LLILZ = new CopyOnWriteArrayList(list);
        }
        LiveRepostVM.HQ2(liveRepostVMT1, null, Boolean.TRUE, 1);
    }

    public static String U1(long j) {
        return C497740JfY.LJIJJ(2131844247, C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 1000)}, 1)));
    }

    public static String b2(long j) {
        long j2 = j / 1000;
        if (j2 > 60) {
            return C497740JfY.LJIJJ(2131843858, String.valueOf(j2 / 60));
        }
        return C497740JfY.LJIJJ(2131844247, String.valueOf(j2));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        boolean z;
        WatchReasonItem watchReasonItem;
        String str;
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct2;
        FeedRoomTagList feedRoomTagList;
        List<FeedRoomTag> list;
        FeedRoomTag feedRoomTag;
        Long lValueOf;
        Long lValueOf2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        LiveRoomStruct liveRoomStruct5;
        LiveRoomStruct liveRoomStruct6;
        FeedRoomTagList feedRoomTagList2;
        List<FeedRoomTag> list2;
        FeedRoomTag feedRoomTag2;
        Map<String, String> map;
        String value;
        LiveRoomStruct liveRoomStruct7;
        LivePreviewPlayerVM livePreviewPlayerVMS1;
        int showTagNum;
        AwemeRawAd awemeRawAd;
        Aweme aweme;
        Aweme aweme2;
        super.LJJIJIIJIL(i);
        if (!this.LLJLIL) {
            k2();
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null && (aweme2 = c1acaZ12.LIZIZ) != null && C1017070cZd.LJLJI(aweme2)) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf3 = null;
        if (z) {
            if (O1().getVisibility() == 0) {
                showTagNum = O1().getShowTagNum();
            } else {
                showTagNum = 0;
            }
            IAdTagLogHelper iAdTagLogHelper = (IAdTagLogHelper) PluggableExtentionKt.pluggableSpi$default(IAdTagLogHelper.class, false, false, false, 14, null);
            if (iAdTagLogHelper != null) {
                C1ACA c1acaZ13 = z1();
                if (c1acaZ13 != null && (aweme = c1acaZ13.LIZIZ) != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                iAdTagLogHelper.LIZ(awemeRawAd, 2, showTagNum);
            }
        }
        C1AB2 c1ab2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1ab2 != null) {
            c1ab2.cancel();
        }
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 != null && (liveRoomStruct7 = c1acaZ14.LIZJ) != null) {
            long j = liveRoomStruct7.allowPreviewTime;
            if (j > 0) {
                LivePreviewPlayerVM livePreviewPlayerVMS12 = S1();
                if (livePreviewPlayerVMS12 != null) {
                    livePreviewPlayerVMS12.LLJJJJLIIL = C1ABV.SHOW;
                }
                C1AB2 c1ab22 = this.LLJJLIIIJLLLLLLLZ;
                if (c1ab22 != null) {
                    c1ab22.cancel();
                }
                LivePreviewPlayerVM livePreviewPlayerVMS13 = S1();
                if (livePreviewPlayerVMS13 != null) {
                    livePreviewPlayerVMS13.wQ2(new AwS78S0100100_33(j, this, 1), false);
                }
            } else if (j == 0 && (livePreviewPlayerVMS1 = S1()) != null) {
                livePreviewPlayerVMS1.wQ2(new AwS577S0100000_33(this, 3852), false);
            }
        }
        i2();
        M1(EnumC994450bz9.SHOW);
        T1();
        if (C500260Jjc.LJJJJIZL(a2()) && (c1acaZ1 = z1()) != null && (liveRoomStruct2 = c1acaZ1.LIZJ) != null && (feedRoomTagList = liveRoomStruct2.feedRoomTagList) != null && (list = feedRoomTagList.subTags) != null && (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) != null && feedRoomTag.id == 1007) {
            HashMap map2 = new HashMap();
            C1ACA c1acaZ15 = z1();
            if (c1acaZ15 != null && (liveRoomStruct6 = c1acaZ15.LIZJ) != null && (feedRoomTagList2 = liveRoomStruct6.feedRoomTagList) != null && (list2 = feedRoomTagList2.subTags) != null && (feedRoomTag2 = (FeedRoomTag) C13LP.LJJJLL(list2)) != null && (map = feedRoomTag2.eventTags) != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && (value = entry.getValue()) != null) {
                        map2.put(key, value);
                    }
                }
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_nearby_label_show");
            c474500IjALIZ.LJJII("viewer", "user_type");
            C1ACA c1acaZ16 = z1();
            if (c1acaZ16 != null && (liveRoomStruct5 = c1acaZ16.LIZJ) != null) {
                lValueOf = Long.valueOf(liveRoomStruct5.id);
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJIJIIJI(lValueOf);
            C1ACA c1acaZ17 = z1();
            if (c1acaZ17 != null && (liveRoomStruct4 = c1acaZ17.LIZJ) != null) {
                lValueOf2 = Long.valueOf(liveRoomStruct4.ownerUserId);
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZ.LJI(lValueOf2);
            C1ACA c1acaZ18 = z1();
            if (c1acaZ18 != null && (liveRoomStruct3 = c1acaZ18.LIZJ) != null) {
                c474500IjALIZ.LJJ(RoomStruct.getStreamType(liveRoomStruct3).logStreamingType);
            }
            c474500IjALIZ.LJJIIZI(map2);
            c474500IjALIZ.LJJII("preview_card", "event_scene");
            c474500IjALIZ.LIZ();
        }
        C1ACA c1acaZ19 = z1();
        if (c1acaZ19 != null && (watchReasonItem = c1acaZ19.LJLZ) != null) {
            C1088200eQM c1088200eQM = C1088200eQM.LIZ;
            Text text = watchReasonItem.content;
            if (text != null) {
                str = text.key;
            } else {
                str = null;
            }
            C1ACA c1acaZ110 = z1();
            if (c1acaZ110 != null && (liveRoomStruct = c1acaZ110.LIZJ) != null) {
                lValueOf3 = Long.valueOf(liveRoomStruct.id);
            }
            c1088200eQM.getClass();
            C1088200eQM.LIZJ(lValueOf3, str, true);
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaZ111 = z1();
            String strValueOf = String.valueOf(watchReasonItem.reasonId);
            c1ac7.getClass();
            C1AC7.LJIJ(c1acaZ111, "tag2", strValueOf);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        M1(EnumC994450bz9.HIDE);
        LiveRepostVM liveRepostVMT1 = T1();
        if (liveRepostVMT1 != null) {
            if (liveRepostVMT1.LLJIJIL) {
                liveRepostVMT1.CQ2();
            }
            liveRepostVMT1.LLJIJIL = false;
        }
    }

    public final void M1(EnumC994450bz9 enumC994450bz9) {
        int i = C994460bzA.LIZ[enumC994450bz9.ordinal()];
        if (i != 1) {
            if (i == 2) {
                W1().LIZ();
                V1().getClass();
                return;
            }
            throw new C1954807lC();
        }
        W1().LIZIZ();
        V1().getClass();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1AB2] */
    public final C1AB2 N1(final long j) {
        C0K9P.LIZ(z1(), false, this.dataChannel);
        this.LLJL = j;
        return new CountDownTimer(j) { // from class: X.1AB2
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                SubscribeMaskLayerVM subscribeMaskLayerVM;
                SubOnlyLiveInfo subOnlyLiveInfo;
                C1ACA c1acaZ1 = this.z1();
                LabelContainerWidget labelContainerWidget = this;
                C0K9P.LIZIZ(c1acaZ1, labelContainerWidget.LLJL, labelContainerWidget.dataChannel);
                LivePreviewPlayerVM livePreviewPlayerVMS1 = this.S1();
                if (livePreviewPlayerVMS1 != null) {
                    livePreviewPlayerVMS1.LLJJJJLIIL = C1ABV.HIDE;
                }
                C786410Ut5.LLLLZLL(this.a2(), 4);
                DataChannel dataChannel = this.dataChannel;
                SubscribeUserInfoResponse subscribeUserInfoResponse = dataChannel != null ? (SubscribeUserInfoResponse) dataChannel.gg0(C2276291E7v.class) : null;
                if ((subscribeUserInfoResponse == null || (subOnlyLiveInfo = subscribeUserInfoResponse.subOnlyLiveInfo) == null || !subOnlyLiveInfo.hasPermission) && (subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LLJJJ.getValue()) != null) {
                    subscribeMaskLayerVM.LLILLJJLI.setValue(Boolean.TRUE);
                    subscribeMaskLayerVM.vQ2(false);
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j2) {
                long j3;
                MutableLiveData<Boolean> mutableLiveData;
                MutableLiveData<Boolean> mutableLiveData2;
                LiveRoomStruct liveRoomStruct;
                Long lValueOf;
                LiveRoomStruct liveRoomStruct2;
                Long lValueOf2;
                LiveRoomStruct liveRoomStruct3;
                LiveRoomStruct liveRoomStruct4;
                LabelContainerWidget labelContainerWidget = this;
                C1ACA c1acaZ1 = labelContainerWidget.z1();
                if (c1acaZ1 != null && (liveRoomStruct4 = c1acaZ1.LIZJ) != null) {
                    liveRoomStruct4.allowPreviewTime = j2;
                }
                labelContainerWidget.a2().setText(LabelContainerWidget.b2(j2));
                C1ACA c1acaZ12 = this.z1();
                if (c1acaZ12 != null && (liveRoomStruct3 = c1acaZ12.LIZJ) != null) {
                    j3 = liveRoomStruct3.maxPreviewTime;
                } else {
                    j3 = -1;
                }
                C0IU0.LJFF = false;
                long j4 = C538540LAe.LLJJJIL;
                if (j3 > j4 && j3 - j2 > j4) {
                    C098J<Long, Long> c098j = C1287300jbU.LIZ;
                    C1ACA c1acaZ13 = this.z1();
                    if (c1acaZ13 != null && (liveRoomStruct2 = c1acaZ13.LIZJ) != null && (lValueOf2 = Long.valueOf(liveRoomStruct2.id)) != null && C1287300jbU.LIZ.get(lValueOf2) != null) {
                        return;
                    }
                    C1ACA c1acaZ14 = this.z1();
                    if (c1acaZ14 != null && (liveRoomStruct = c1acaZ14.LIZJ) != null && (lValueOf = Long.valueOf(liveRoomStruct.id)) != null) {
                        C1287300jbU.LIZ.put(lValueOf, lValueOf);
                    }
                    LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJJJJJIL.getValue();
                    if (livePreviewGuideEnterVM != null && (mutableLiveData2 = livePreviewGuideEnterVM.LLILLL) != null) {
                        mutableLiveData2.setValue(Boolean.TRUE);
                    }
                    LivePreviewGuideEnterVM livePreviewGuideEnterVM2 = (LivePreviewGuideEnterVM) this.LLJJJJJIL.getValue();
                    if (livePreviewGuideEnterVM2 == null || (mutableLiveData = livePreviewGuideEnterVM2.LLILLJJLI) == null) {
                        return;
                    }
                    mutableLiveData.setValue(Boolean.TRUE);
                }
            }
        };
    }

    public final void c2(View view) {
        C786410Ut5.LJZ(0, X1());
        int childCount = X1().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = X1().getChildAt(i);
            if (!Intrinsics.LJFF(childAt, view)) {
                C786410Ut5.LJLLLLLL(8, childAt);
            } else {
                C786410Ut5.LJLLLLLL(0, childAt);
            }
        }
    }

    public final void e2(String str) {
        LiveRoomStruct liveRoomStruct;
        this.LLJZIJLIL = str;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && liveRoomStruct.liveSubOnly == 1 && !TextUtils.isEmpty(str) && h2() && LiveFansClubSuperFanFeedPreviewUseLocalTextSettings.INSTANCE.getValue()) {
            TuxTextView tuxTextViewR1 = R1();
            if (tuxTextViewR1 != null) {
                tuxTextViewR1.setText(C497740JfY.LJIJI(2131856631));
            }
            this.LLJZIJLIL = "";
        }
    }

    public final void j2(String str) {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1;
        C1ACA c1acaZ12;
        if (T1() != null && LiveRepostVM.AQ2() && ((T1() == null || !LivePreviewCardMultiRepostTagSetting.INSTANCE.enable()) && ((Intrinsics.LJFF(str, "hasHigherPriorityTag") || Intrinsics.LJFF(str, "subscriptionTrialMask")) && (c1acaZ12 = z1()) != null))) {
            c1acaZ12.LJLJLLL = "other_high_priority_tag";
        }
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null && (liveRoomStruct = c1acaZ13.LIZJ) != null && liveRoomStruct.isRepostedExpect > 0 && (c1acaZ1 = z1()) != null) {
            c1acaZ1.LJLJLJ = str;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C786410Ut5.LJZL(0, Q1());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<List<WebcastRoomRepostRepostersResponse.Reposter>> mutableLiveDataXQ2;
        MutableLiveData<Boolean> mutableLiveData;
        NextLiveData<Boolean> nextLiveData;
        MutableLiveData<EnumC765980U2y> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<EnumC1847410yAt> mutableLiveData4;
        NextLiveData nextLiveData2;
        NextLiveData<C1ABF> nextLiveData3;
        NextLiveData<Unit> nextLiveData4;
        NextLiveData<Boolean> nextLiveData5;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null && (nextLiveData5 = feedLiveViewHolderVMP1.LLJJL) != null) {
            nextLiveData5.observe(this, new C1AB0(this), true);
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP12 = P1();
        if (feedLiveViewHolderVMP12 != null && (nextLiveData4 = feedLiveViewHolderVMP12.LLJJLIIIJLLLLLLLZ) != null) {
            nextLiveData4.observe(this, new C1AB4(this), true);
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LLJJJ.getValue();
        if (subscribeMaskLayerVM != null && (nextLiveData3 = subscribeMaskLayerVM.LLILLL) != null) {
            nextLiveData3.observe(this, new C1AB1(this), true);
        }
        PreviewMaskLayerVM previewMaskLayerVM = (PreviewMaskLayerVM) this.LLJJJIL.getValue();
        if (previewMaskLayerVM != null && (nextLiveData2 = previewMaskLayerVM.LLILLL) != null) {
            nextLiveData2.observe(this, new Observer() { // from class: X.1AB3
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LiveRoomStruct liveRoomStruct;
                    LiveEventInfo liveEventInfo;
                    LiveRoomStruct liveRoomStruct2;
                    LiveEventInfo liveEventInfo2;
                    PaidEventPreview paidEventPreview;
                    Long l;
                    long j;
                    LiveRoomStruct liveRoomStruct3;
                    LiveEventInfo liveEventInfo3;
                    PaidEventPreview paidEventPreview2;
                    LiveRoomStruct liveRoomStruct4;
                    C1ABE c1abe = (C1ABE) obj;
                    if (c1abe.LIZ) {
                        this.LL.i2();
                        return;
                    }
                    C1AB5 c1ab5 = this.LL.LLJLILLLLZIIL;
                    if (c1ab5 != null) {
                        c1ab5.cancel();
                    }
                    LabelContainerWidget labelContainerWidget = this.LL;
                    labelContainerWidget.LLJLILLLLZIIL = null;
                    C1ACA c1acaZ1 = labelContainerWidget.z1();
                    if (c1acaZ1 != null && (liveRoomStruct2 = c1acaZ1.LIZJ) != null && (liveEventInfo2 = liveRoomStruct2.liveEventInfo) != null && (paidEventPreview = liveEventInfo2.paidEventPreview) != null && (l = paidEventPreview.allowPreviewTime) != null) {
                        LabelContainerWidget labelContainerWidget2 = this.LL;
                        long jLongValue = l.longValue();
                        C1ACA c1acaZ12 = labelContainerWidget2.z1();
                        if (c1acaZ12 != null && (liveRoomStruct4 = c1acaZ12.LIZJ) != null) {
                            j = liveRoomStruct4.id;
                        } else {
                            j = 0;
                        }
                        long jLIZIZ = C2651010v.LIZIZ(jLongValue, Long.valueOf(j));
                        C1ACA c1acaZ13 = labelContainerWidget2.z1();
                        if (c1acaZ13 != null && (liveRoomStruct3 = c1acaZ13.LIZJ) != null && (liveEventInfo3 = liveRoomStruct3.liveEventInfo) != null && (paidEventPreview2 = liveEventInfo3.paidEventPreview) != null) {
                            paidEventPreview2.setAllowPreviewTime(Long.valueOf(jLIZIZ));
                        }
                    }
                    C1ACA c1acaZ14 = this.LL.z1();
                    if (c1acaZ14 == null || (liveRoomStruct = c1acaZ14.LIZJ) == null || (liveEventInfo = liveRoomStruct.liveEventInfo) == null || !c1abe.LIZIZ || !Intrinsics.LJFF(liveEventInfo.isPaidEvent(), Boolean.TRUE) || !liveEventInfo.subscribed) {
                        return;
                    }
                    this.LL.k2();
                }
            });
        }
        if ((T1() != null && LiveRepostVM.AQ2()) || (T1() != null && LivePreviewCardMultiRepostTagSetting.INSTANCE.enable())) {
            LiveRepostVM liveRepostVMT1 = T1();
            if (liveRepostVMT1 != null && (mutableLiveData4 = liveRepostVMT1.LLILLJJLI) != null) {
                mutableLiveData4.observe(this, new AObserverS235S0100000_33(this, 9));
            }
        } else {
            LiveRepostVM liveRepostVMT12 = T1();
            if (liveRepostVMT12 != null && (mutableLiveDataXQ2 = liveRepostVMT12.xQ2()) != null) {
                mutableLiveDataXQ2.observe(this, new Observer() { // from class: X.1AAn
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        this.LL.k2();
                    }
                });
            }
        }
        LivePreviewFollowVM livePreviewFollowVM = (LivePreviewFollowVM) this.LLJJIJIL.getValue();
        if (livePreviewFollowVM != null && (mutableLiveData3 = livePreviewFollowVM.LL) != null) {
            mutableLiveData3.observe(this, new AObserverS235S0100000_33(this, 10));
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJJL.getValue();
        if (livePreviewHighlightsPlayerVM != null && (mutableLiveData2 = livePreviewHighlightsPlayerVM.LLILLL) != null) {
            mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 11));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP13 = P1();
        if (feedLiveViewHolderVMP13 != null && (nextLiveData = feedLiveViewHolderVMP13.LLJJJIL) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 12));
        }
        LivePreviewPlayerVM livePreviewPlayerVMS1 = S1();
        if (livePreviewPlayerVMS1 != null && (mutableLiveData = livePreviewPlayerVMS1.LLJILJIL) != null) {
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 8));
        }
    }

    public final void f2(FeedRoomTag feedRoomTag, int i) {
        String str;
        String str2;
        List<String> list;
        c2(W1());
        List<String> listLJIILJJIL = null;
        if (i != 6) {
            if (i == 7) {
                List<LiveShareUser> list2 = feedRoomTag.fromUserList;
                if (list2 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (LiveShareUser liveShareUser : list2) {
                    User user = new User();
                    user.setId(liveShareUser.userId);
                    user.setNickName(liveShareUser.nickname);
                    ImageModel imageModel = new ImageModel();
                    LiveImageUrlModel liveImageUrlModel = liveShareUser.avatarThumb;
                    if (liveImageUrlModel != null) {
                        str2 = liveImageUrlModel.uri;
                    } else {
                        str2 = null;
                    }
                    imageModel.setUri(str2);
                    LiveImageUrlModel liveImageUrlModel2 = liveShareUser.avatarThumb;
                    if (liveImageUrlModel2 != null) {
                        list = liveImageUrlModel2.urls;
                    } else {
                        list = null;
                    }
                    imageModel.setUrls(list);
                    user.setAvatarThumb(imageModel);
                    arrayList.add(user);
                }
                listLJIILJJIL = arrayList;
            }
        } else {
            LiveShareUser liveShareUser2 = feedRoomTag.fromUser;
            if (liveShareUser2 == null) {
                return;
            }
            User[] userArr = new User[1];
            User user2 = new User();
            user2.setId(liveShareUser2.userId);
            user2.setNickName(liveShareUser2.nickname);
            ImageModel imageModel2 = new ImageModel();
            LiveImageUrlModel liveImageUrlModel3 = liveShareUser2.avatarThumb;
            if (liveImageUrlModel3 != null) {
                str = liveImageUrlModel3.uri;
            } else {
                str = null;
            }
            imageModel2.setUri(str);
            LiveImageUrlModel liveImageUrlModel4 = liveShareUser2.avatarThumb;
            if (liveImageUrlModel4 != null) {
                listLJIILJJIL = liveImageUrlModel4.urls;
            }
            imageModel2.setUrls(listLJIILJJIL);
            user2.setAvatarThumb(imageModel2);
            userArr[0] = user2;
            listLJIILJJIL = C1697810uHb.LJIILJJIL(userArr);
        }
        C446080HeQ c446080HeQW1 = W1();
        C446060HeO c446060HeO = new C446060HeO();
        c446060HeO.LIZ = listLJIILJJIL;
        c446060HeO.LIZIZ = this.LLJLL;
        c446060HeO.LIZJ = this.LLJLLIL;
        c446060HeO.LIZLLL = true;
        c446060HeO.LJ = feedRoomTag.content;
        c446060HeO.LJI = false;
        C446080HeQ.LIZJ(c446080HeQW1, c446060HeO, false, false, 6);
    }

    public final void g2(int i, String str, UrlModel urlModel) {
        String str2;
        Aweme aweme;
        com.ss.android.ugc.aweme.profile.model.User author;
        c2((View) this.LLJILJILJ.getValue());
        Aweme aweme2 = null;
        ((View) this.LLJILJILJ.getValue()).setBackground(null);
        int iIntValue = 0;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 8) {
                        a2().setText(str);
                        C786410Ut5.l(Y1(), 8);
                        C786410Ut5.LLLLZLL(a2(), 0);
                        TuxTextView tuxTextViewA2 = a2();
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0p, this.context);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        tuxTextViewA2.setTextColor(iIntValue);
                        a2().setBackgroundResource(R.drawable.ako);
                        return;
                    }
                    return;
                }
                C786410Ut5.l(Y1(), 4);
                C786410Ut5.LLLLZLL(a2(), 8);
                if (urlModel == null) {
                    return;
                }
                C786410Ut5.l(Y1(), 0);
                Y1().getLayoutParams().width = Y1().getHeight() * (urlModel.getWidth() / urlModel.getHeight());
                C1324840ka2.LJFF(Y1(), urlModel);
                return;
            }
            a2().setText(str);
            C786410Ut5.l(Y1(), 8);
            C786410Ut5.LLLLZLL(a2(), 0);
            TuxTextView tuxTextViewA22 = a2();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, this.context);
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            tuxTextViewA22.setTextColor(iIntValue);
            a2().setBackgroundResource(R.drawable.akn);
            return;
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (aweme = c1acaZ1.LIZIZ) != null && (author = aweme.getAuthor()) != null && ((C300940Bqu.LIZ() || C299470BoX.LIZ()) && !C10EU.LJIILLIIL(author))) {
            C786410Ut5.l(Y1(), 8);
            C786410Ut5.LLLLZLL(a2(), 8);
            return;
        }
        a2().setText(str);
        C786410Ut5.l(Y1(), 8);
        C786410Ut5.LLLLZLL(a2(), 0);
        TuxTextView tuxTextViewA23 = a2();
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ej, this.context);
        if (numLIZJ3 != null) {
            iIntValue = numLIZJ3.intValue();
        }
        tuxTextViewA23.setTextColor(iIntValue);
        a2().setBackgroundResource(R.drawable.akl);
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null) {
            str2 = c1acaZ12.LJ;
        } else {
            str2 = null;
        }
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null) {
            aweme2 = c1acaZ13.LIZIZ;
        }
        C0RZW.LIZIZ(str2, aweme2, C13BV.INSTANCE);
    }

    public final void d2(String str, String str2, String str3, String str4, boolean z, List list) {
        EnumC1847410yAt value;
        boolean z2;
        MutableLiveData<EnumC1847410yAt> mutableLiveData;
        LiveRepostVM liveRepostVMT1 = T1();
        if (liveRepostVMT1 != null && (mutableLiveData = liveRepostVMT1.LLILLJJLI) != null) {
            value = mutableLiveData.getValue();
        } else {
            value = null;
        }
        if (value == EnumC1847410yAt.ICON) {
            z2 = true;
            LiveRepostVM liveRepostVMT12 = T1();
            if (liveRepostVMT12 != null) {
                liveRepostVMT12.DQ2(Boolean.TRUE, Boolean.FALSE);
            }
            C446080HeQ c446080HeQW1 = W1();
            if (c446080HeQW1 != null) {
                c446080HeQW1.setOnGuideClickListener$live_release(new AwS676S0100000_27(this, 2));
            }
        } else {
            z2 = false;
        }
        C446080HeQ c446080HeQW12 = W1();
        C446060HeO c446060HeO = new C446060HeO();
        c446060HeO.LIZ = list;
        c446060HeO.LIZIZ = this.LLJLL;
        c446060HeO.LIZJ = this.LLJLLIL;
        c446060HeO.LIZLLL = true;
        c446060HeO.LJ = str;
        c446060HeO.LJFF = str2;
        c446060HeO.LJI = z;
        c446060HeO.LJIIIIZZ = new AwS65S2100000_27(this, str3, str4, 0);
        c446060HeO.LJII = new AwS65S2100000_27(this, str3, str4, 1);
        C446080HeQ.LIZJ(c446080HeQW12, c446060HeO, z2, false, 4);
    }
}

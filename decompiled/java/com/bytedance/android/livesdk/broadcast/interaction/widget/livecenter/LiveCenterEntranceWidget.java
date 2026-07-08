package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.AbstractC19994813Le;
import X.C001A;
import X.C01GW;
import X.C01QD;
import X.C0IQ1;
import X.C0UO0;
import X.C0UVW;
import X.C1086310eNJ;
import X.C1152720g6Q;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C12O8;
import X.C12OA;
import X.C12OE;
import X.C12OK;
import X.C12OR;
import X.C12OS;
import X.C12OV;
import X.C12OX;
import X.C1548820qPI;
import X.C158B;
import X.C1701940uOG;
import X.C19747412Oa;
import X.C19MB;
import X.C1AHG;
import X.C251900yD;
import X.C262100zr;
import X.C389001fE;
import X.C418440Gaw;
import X.C452501pT;
import X.C465520INi;
import X.C473410IhP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751980Tee;
import X.C776250Uch;
import X.C784440Upu;
import X.C786410Ut5;
import X.C800330VaR;
import X.C804420Vh2;
import X.C814420VxA;
import X.EnumC452301pR;
import X.EnumC466180IPw;
import X.EnumC804620VhM;
import X.InterfaceC1141530foN;
import X.InterfaceC19748112Oh;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS98S0200000_29;
import Y.AfS198S0100000_29;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveMockLiveCenterEvent;
import com.bytedance.android.live.banner.BannerVisibilityEvent;
import com.bytedance.android.live.broadcast.api.EnterBackgroundEvent;
import com.bytedance.android.live.broadcast.api.LiveCenterTopNoticeUserDismissEvent;
import com.bytedance.android.live.broadcast.api.MergeApiResponseEvent;
import com.bytedance.android.live.broadcast.api.MergeApiResponseFailEvent;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.broadcast.api.NetworkStatusV3;
import com.bytedance.android.livesdk.broadcast.debugtool.LiveCenterMockChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatus;
import com.bytedance.android.livesdk.dataChannel.LiveCenterEntranceShow;
import com.bytedance.android.livesdk.dataChannel.LiveCenterVisibilityNew;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.event.LiveBoostCardFreshChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorMergeCreateApiABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterEntranceXmlOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameNetworkSpeedMonitorOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyMockEnabledSetting;
import com.bytedance.android.livesdk.model.message.AnchorReminderWordInfoMsg;
import com.bytedance.android.livesdk.model.message.LiveCenterStatusBarMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import tikcast.api.anchor_data.GetRealtimeLiveCenterOverviewContainer;
import tikcast.api.anchor_data.HostFirstGiftInfo;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import webcast.data.ColdStartStatData;
import webcast.data.LiveJourneyImMessage;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterWhiteBoxIM;
import webcast.data.RealtimeViolationRecord;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveCenterEntranceWidget extends LiveWidget implements OnMessageListener, InterfaceC1141530foN, C1AHG {
    public final EnumC804620VhM LL = C804420Vh2.LJ(C497740JfY.LJII());
    public int LLILLJJLI = 1;
    public int LLILLL = 1;
    public final C01GW LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS573S0100000_29(this, 33));
    public final C11NJ LLILZIL = new C11NJ();
    public C12OA LLILZLL;
    public HostFirstGiftInfo LLIZ;
    public int LLIZLLLIL;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C1AHG
    public final boolean LLLIL() {
        C12OA c12oa = this.LLILZLL;
        if (c12oa != null && c12oa.LIZ(C12OE.ANCHOR_CUE)) {
            return true;
        }
        C12OA c12oa2 = this.LLILZLL;
        return c12oa2 != null && c12oa2.LIZ(C12OE.EC_SUGGEST) && LiveCenterECSuggestionSetting.INSTANCE.isEnabled();
    }

    @Override // X.C1AHG
    public final boolean X() {
        C12OA c12oa = this.LLILZLL;
        return c12oa != null && c12oa.LIZ(C12OE.WHITE_BOX_2);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return LiveCenterUIStyleOptimizationSetting.INSTANCE.enable() ? R.layout.g1n : LiveCenterEntranceXmlOptSetting.INSTANCE.enable() ? R.layout.g1o : R.layout.g1m;
    }

    public final C12OX x1() {
        return (C12OX) this.LLILZ.getValue();
    }

    public final void z1() {
        this.dataChannel.BQ2(this, PerceptionMessageChannel.class, new AwS608S0100000_29(this, 19));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        View viewFindViewById;
        String idStr;
        LiveCenterEntranceWidget liveCenterEntranceWidget;
        View view;
        IMessageManager iMessageManager;
        C12OA c12oa;
        View view2;
        ConstraintLayout constraintLayout;
        super.onCreate();
        C497740JfY.LJJ();
        this.LLILZLL = new C12OA(this);
        LiveCenterUIStyleOptimizationSetting liveCenterUIStyleOptimizationSetting = LiveCenterUIStyleOptimizationSetting.INSTANCE;
        if (liveCenterUIStyleOptimizationSetting.enable() && (view2 = getView()) != null) {
            ViewParent parent = view2.getParent();
            if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJIIIIZZ(view2.getId(), 7, R.id.h4p, 6);
                c19mb.LIZIZ(constraintLayout);
                view2.requestLayout();
            }
        }
        if (LiveCenterECSuggestionSetting.INSTANCE.isEnabled() && (c12oa = this.LLILZLL) != null) {
            C12OK.LIZ = new WeakReference<>(c12oa);
        }
        this.dataChannel.FQ2(LiveCenterEntranceShow.class);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.COLD_START_MESSAGE.getIntType(), this);
            C001A c001a = C001A.LIVE_CENTER_STATUS_BAR_MESSAGE;
            iMessageManager.addMessageListener(c001a.getIntType(), this);
            iMessageManager.addMessageListener(C001A.ANCHOR_GROW_LEVEL_MESSAGE.getIntType(), this);
            if (C751980Tee.LIZJ(this.dataChannel) == LiveMode.VIDEO) {
                iMessageManager.addMessageListener(C001A.WALLET_LIVE_REWARDS_RATIO_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.ANCHOR_REMINDER_WORD_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(C001A.LIVE_JOURNEY_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(c001a.getIntType(), this);
                iMessageManager.addMessageListener(C001A.DAILY_CHALLENGES_LIVE_CARD_MESSAGE.getIntType(), this);
            }
            if (liveCenterUIStyleOptimizationSetting.enable()) {
                iMessageManager.addMessageListener(C001A.REALTIME_UNIFIED_ENTRANCE_MESSAGE.getIntType(), this);
            }
        }
        View view3 = getView();
        if (view3 != null) {
            View view4 = getView();
            Object parent2 = view4 != null ? view4.getParent() : null;
            View view5 = parent2 instanceof View ? (View) parent2 : null;
            Rect rect = new Rect();
            view3.getHitRect(rect);
            rect.top += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            rect.bottom += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            rect.left += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            rect.right += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            view3.setTouchDelegate(new TouchDelegate(rect, getView()));
            if (view5 != null) {
                view5.setTouchDelegate(view3.getTouchDelegate());
            }
        }
        View viewFindViewById2 = findViewById(R.id.bnu);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 15), viewFindViewById2);
        }
        C12OA c12oa2 = this.LLILZLL;
        if (c12oa2 != null && (liveCenterEntranceWidget = c12oa2.LIZIZ.get()) != null && (view = liveCenterEntranceWidget.getView()) != null) {
            c12oa2.LJFF(view, C12OE.DEFAULT);
            c12oa2.LIZJ(new C19747412Oa(view));
            c12oa2.LJIILL("show", null);
        }
        Object objGg0 = this.dataChannel.gg0(LiveModeChannel.class);
        if (C497740JfY.LJJ()) {
            View viewFindViewById3 = findViewById(R.id.bnu);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setBackground(C800330VaR.LIZIZ(this.context, (objGg0 == LiveMode.LIVE_VOICE || objGg0 == LiveMode.SCREEN_RECORD) ? R.drawable.enr : R.drawable.enq));
            }
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.context, R.drawable.dx7);
            View viewFindViewById4 = findViewById(R.id.e8s);
            if (viewFindViewById4 != null) {
                viewFindViewById4.setBackground(drawableLIZIZ);
            }
            View viewFindViewById5 = findViewById(R.id.e8t);
            if (viewFindViewById5 != null) {
                viewFindViewById5.setBackground(drawableLIZIZ);
            }
            View viewFindViewById6 = findViewById(R.id.e8u);
            if (viewFindViewById6 != null) {
                viewFindViewById6.setBackground(drawableLIZIZ);
            }
        } else if ((objGg0 == LiveMode.LIVE_VOICE || objGg0 == LiveMode.SCREEN_RECORD) && (viewFindViewById = findViewById(R.id.bnu)) != null) {
            viewFindViewById.setBackground(C800330VaR.LIZIZ(this.context, R.drawable.enn));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if ((dataChannel2 != null ? dataChannel2.gg0(LiveModeChannel.class) : null) != LiveMode.SCREEN_RECORD || TtliveGameNetworkSpeedMonitorOptSetting.INSTANCE.useTTNet()) {
            this.LLILZIL.LIZ(C784440Upu.LIZ().LJ(C12OV.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS198S0100000_29(this, 3)));
            C1548820qPI.LIZLLL("anchor_center_net_quality_request", this);
        } else {
            this.LLILZIL.LIZ(C11NZ.LJJJJZ(Boolean.TRUE).LJJI(30000L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS198S0100000_29(this, 2)));
        }
        this.LLILZIL.LIZ(C784440Upu.LIZ().LJ(C251900yD.class).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS198S0100000_29(this, 4)));
        this.LLILZIL.LIZ(C784440Upu.LIZ().LJ(C1086310eNJ.class).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS198S0100000_29(this, 5)));
        DataChannel dataChannel3 = this.dataChannel;
        dataChannel3.EQ2(this, NetworkStatus.class, new AwS608S0100000_29(this, 31));
        dataChannel3.EQ2(this, NetworkStatusV3.class, new AwS608S0100000_29(this, 20));
        dataChannel3.EQ2(this, BroadcastAudioStatus.class, new AwS608S0100000_29(this, 21));
        dataChannel3.EQ2(this, EnterBackgroundEvent.class, new AwS608S0100000_29(this, 22));
        dataChannel3.EQ2(this, LiveBoostCardFreshChannel.class, new AwS608S0100000_29(this, 23));
        dataChannel3.BQ2(this, LiveCenterVisibilityNew.class, new AwS608S0100000_29(this, 24));
        dataChannel3.EQ2(this, BannerVisibilityEvent.class, new AwS608S0100000_29(this, 25));
        dataChannel3.EQ2(this, LiveMockLiveCenterEvent.class, new AwS608S0100000_29(this, 26));
        dataChannel3.EQ2(this, MergeApiResponseEvent.class, new AwS608S0100000_29(this, 27));
        dataChannel3.EQ2(this, MergeApiResponseFailEvent.class, new AwS608S0100000_29(this, 28));
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            this.dataChannel.BQ2(this, LiveCenterMockChannel.class, new AwS608S0100000_29(this, 29));
        }
        this.dataChannel.BQ2(this, LiveCenterTopNoticeUserDismissEvent.class, new AwS608S0100000_29(this, 30));
        if (!AnchorMergeCreateApiABSetting.INSTANCE.enable() || C751980Tee.LIZJ(this.dataChannel) != LiveMode.VIDEO) {
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            LiveCenterApi liveCenterApiLIZLLL = C01QD.LIZ().LIZLLL();
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.dataChannel);
            if (roomLJJLIIIIJ == null || (idStr = roomLJJLIIIIJ.getIdStr()) == null) {
                idStr = "";
            }
            liveCenterApiLIZLLL.getOverview(idStr, 1, 0, 2, "", "").LJIILIIL(new C0UO0()).LJJLL(new AfS198S0100000_29(this, 32), new AfS198S0100000_29(this, 33));
        }
        C12OS.LIZJ = this;
        if (C1152720g6Q.LIZ()) {
            C465520INi.LIZ.L11(x1().LJJII);
        }
        C12OR.LIZLLL = new InterfaceC19748112Oh() { // from class: X.12OQ
            @Override // X.InterfaceC19748112Oh
            public final C214718191g LIZJ() {
                int[] iArr = new int[2];
                View view6 = this.LIZ.getView();
                if (view6 != null) {
                    view6.getLocationOnScreen(iArr);
                }
                int i = iArr[0];
                int iLJIJ = iArr[1] - C497740JfY.LJIJ();
                View view7 = this.LIZ.getView();
                int width = view7 != null ? view7.getWidth() : 0;
                View view8 = this.LIZ.getView();
                return new C214718191g(i, iLJIJ, width, view8 != null ? view8.getHeight() : 0);
            }

            @Override // X.InterfaceC19748112Oh
            public final void LIZ() {
                C12OA c12oa3 = this.LIZ.LLILZLL;
                if (c12oa3 != null) {
                    c12oa3.LJJ();
                }
            }

            @Override // X.InterfaceC19748112Oh
            public final C214718191g LIZIZ() {
                C12O8 c12o8;
                C12OA c12oa3;
                C12OA c12oa4;
                C12O8 c12o82;
                View viewLJFF;
                C12O8 c12o83;
                View viewLJFF2;
                C12O8 c12o84;
                View viewLJFF3;
                C12O8 c12o85;
                View viewLJFF4;
                C12O8 c12o86;
                View viewLJFF5;
                C12O8 c12o87;
                View viewLJFF6;
                C12OA c12oa5 = this.LIZ.LLILZLL;
                if (c12oa5 != null && (c12o8 = c12oa5.LIZJ) != null) {
                    int height = 0;
                    if (c12o8.LJFF() == null || !(((c12oa3 = this.LIZ.LLILZLL) == null || (c12o87 = c12oa3.LIZJ) == null || (viewLJFF6 = c12o87.LJFF()) == null || viewLJFF6.getVisibility() != 8) && ((c12oa4 = this.LIZ.LLILZLL) == null || (c12o86 = c12oa4.LIZJ) == null || (viewLJFF5 = c12o86.LJFF()) == null || viewLJFF5.getVisibility() != 4))) {
                        return null;
                    }
                    C12OA c12oa6 = this.LIZ.LLILZLL;
                    if (!Intrinsics.LIZLLL((c12oa6 == null || (c12o85 = c12oa6.LIZJ) == null || (viewLJFF4 = c12o85.LJFF()) == null) ? null : Float.valueOf(viewLJFF4.getAlpha()), 0.0f)) {
                        int[] iArr = new int[2];
                        C12OA c12oa7 = this.LIZ.LLILZLL;
                        if (c12oa7 != null && (c12o84 = c12oa7.LIZJ) != null && (viewLJFF3 = c12o84.LJFF()) != null) {
                            viewLJFF3.getLocationOnScreen(iArr);
                        }
                        int i = iArr[0];
                        int iLJIJ = iArr[1] - C497740JfY.LJIJ();
                        C12OA c12oa8 = this.LIZ.LLILZLL;
                        int width = (c12oa8 == null || (c12o83 = c12oa8.LIZJ) == null || (viewLJFF2 = c12o83.LJFF()) == null) ? 0 : viewLJFF2.getWidth();
                        C12OA c12oa9 = this.LIZ.LLILZLL;
                        if (c12oa9 != null && (c12o82 = c12oa9.LIZJ) != null && (viewLJFF = c12o82.LJFF()) != null) {
                            height = viewLJFF.getHeight();
                        }
                        return new C214718191g(i, iLJIJ, width, height);
                    }
                }
                return null;
            }

            @Override // X.InterfaceC19748112Oh
            public final HostFirstGiftInfo LIZLLL() {
                return this.LIZ.LLIZ;
            }
        };
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C12OA c12oa;
        WeakReference<C12OA> weakReference;
        x1().LIZLLL(true);
        super.onDestroy();
        this.LLILZIL.LJ();
        if (C1152720g6Q.LIZ()) {
            C465520INi.LIZ.zO1(x1().LJJII);
        }
        if (LiveCenterECSuggestionSetting.INSTANCE.isEnabled() && (c12oa = this.LLILZLL) != null && (weakReference = C12OK.LIZ) != null && weakReference.get() == c12oa) {
            WeakReference<C12OA> weakReference2 = C12OK.LIZ;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            C12OK.LIZ = null;
        }
        C12OX c12oxX1 = x1();
        ARunnableS98S0200000_29 aRunnableS98S0200000_29 = c12oxX1.LJIIIZ;
        if (aRunnableS98S0200000_29 != null) {
            c12oxX1.LIZJ(aRunnableS98S0200000_29);
        }
        ARunnableS98S0200000_29 aRunnableS98S0200000_292 = c12oxX1.LJIIJ;
        if (aRunnableS98S0200000_292 != null) {
            c12oxX1.LIZJ(aRunnableS98S0200000_292);
        }
        ARunnableS98S0200000_29 aRunnableS98S0200000_293 = c12oxX1.LJIIJJI;
        if (aRunnableS98S0200000_293 != null) {
            c12oxX1.LIZJ(aRunnableS98S0200000_293);
        }
        c12oxX1.LJIIIZ = null;
        c12oxX1.LJIIJ = null;
        c12oxX1.LJIIJJI = null;
        C12OA c12oa2 = this.LLILZLL;
        if (c12oa2 != null) {
            C473410IhP.LIZ().removeCallbacks(c12oa2.LJII);
            Iterator<C12O8> it2 = c12oa2.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIZILJ();
            }
            c12oa2.LIZ.clear();
            c12oa2.LIZJ = null;
            ((LinkedHashMap) c12oa2.LJ).clear();
            ((LinkedHashMap) c12oa2.LJFF).clear();
            c12oa2.LJI = 0;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C1548820qPI.LJIIIIZZ("anchor_center_net_quality_request", this);
        C12OS.LIZJ = null;
        C12OR.LIZLLL = null;
        C12OR.LIZ = false;
        C12OR.LIZJ = false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void A1(String str) {
        C12OA c12oa;
        C12OA c12oa2;
        C12OA c12oa3;
        C12OA c12oa4;
        C12OA c12oa5;
        C12OA c12oa6;
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest() && !LiveEffectNotifyMockEnabledSetting.enable()) {
        }
        switch (str.hashCode()) {
            case -1800134746:
                if (str.equals("punish_long") && (c12oa = this.LLILZLL) != null) {
                    RealtimeViolationRecord realtimeViolationRecord = new RealtimeViolationRecord();
                    PunishEventInfo punishEventInfo = new PunishEventInfo();
                    punishEventInfo.punishId = UUID.randomUUID().toString();
                    realtimeViolationRecord.punishInfo = punishEventInfo;
                    realtimeViolationRecord.startTime = C158B.LIZ();
                    realtimeViolationRecord.endTime = (C158B.LIZ() + ((long) 200000)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    c12oa.LJJIII(Collections.singletonList(realtimeViolationRecord));
                    break;
                }
                break;
            case -1654244171:
                if (str.equals(LiveCenterMockToolSwitch.WHITEBOX)) {
                    LiveCenterStatusBarMessage liveCenterStatusBarMessage = new LiveCenterStatusBarMessage();
                    liveCenterStatusBarMessage.duration = 10000L;
                    liveCenterStatusBarMessage.type = 3;
                    RealtimeLiveCenterWhiteBoxIM realtimeLiveCenterWhiteBoxIM = new RealtimeLiveCenterWhiteBoxIM();
                    realtimeLiveCenterWhiteBoxIM.viewer = AbstractC19994813Le.Default.nextInt(100) + 1;
                    liveCenterStatusBarMessage.whiteBox = realtimeLiveCenterWhiteBoxIM;
                    onMessage(liveCenterStatusBarMessage);
                }
                break;
            case -1584571539:
                if (str.equals(LiveCenterMockToolSwitch.LIVEJOURNEY) && (c12oa2 = this.LLILZLL) != null) {
                    LiveJourneyImMessage liveJourneyImMessage = new LiveJourneyImMessage();
                    liveJourneyImMessage.msg = "Live journey challenges";
                    liveJourneyImMessage.level = 3L;
                    liveJourneyImMessage.type = 1;
                    c12oa2.LJIJI("Live journey challenges", liveJourneyImMessage);
                    break;
                }
                break;
            case -1237458489:
                str.equals(LiveCenterMockToolSwitch.GROWTH);
                break;
            case -977068843:
                if (str.equals(LiveCenterMockToolSwitch.PUNISH) && (c12oa3 = this.LLILZLL) != null) {
                    RealtimeViolationRecord realtimeViolationRecord2 = new RealtimeViolationRecord();
                    PunishEventInfo punishEventInfo2 = new PunishEventInfo();
                    punishEventInfo2.punishId = UUID.randomUUID().toString();
                    realtimeViolationRecord2.punishInfo = punishEventInfo2;
                    realtimeViolationRecord2.startTime = C158B.LIZ();
                    realtimeViolationRecord2.endTime = (C158B.LIZ() + ((long) 20000)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    c12oa3.LJJIII(Collections.singletonList(realtimeViolationRecord2));
                    break;
                }
                break;
            case 39592609:
                if (str.equals(LiveCenterMockToolSwitch.ANCHORCUE) && (c12oa4 = this.LLILZLL) != null) {
                    AnchorReminderWordInfoMsg anchorReminderWordInfoMsg = new AnchorReminderWordInfoMsg();
                    Text text = new Text();
                    text.key = null;
                    text.defaultPattern = "From Manager";
                    anchorReminderWordInfoMsg.title = text;
                    anchorReminderWordInfoMsg.content = "testCueeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
                    c12oa4.LJIJJLI(anchorReminderWordInfoMsg);
                    break;
                }
                break;
            case 97513422:
                if (str.equals(LiveCenterMockToolSwitch.FLARE) && (c12oa5 = this.LLILZLL) != null) {
                    c12oa5.LJIIJJI(1, "Test x1");
                    break;
                }
                break;
            case 1262255133:
                if (str.equals("common_notify") && (c12oa6 = this.LLILZLL) != null) {
                    c12oa6.LJJI(new C0IQ1(EnumC466180IPw.NETWORK, 2, 2, 0L, 24));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(int r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget.B1(int):void");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws JSONException {
        if (Intrinsics.LJFF(c262100zr.LIZ, "anchor_center_net_quality_request")) {
            JSONObject jSONObject = new JSONObject();
            w.LIZ.getClass();
            jSONObject.put("room_id", String.valueOf(w.LJIJJ()));
            jSONObject.put("quality", this.LLILLJJLI);
            C389001fE.LIZ("anchor_center_net_quality_changed", jSONObject, System.currentTimeMillis(), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r21) {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void y1(GetRealtimeLiveCenterOverviewContainer getRealtimeLiveCenterOverviewContainer) {
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData;
        boolean z;
        ColdStartStatData coldStartStatData;
        C12OA c12oa;
        String str;
        int i;
        if (getRealtimeLiveCenterOverviewContainer != null && getRealtimeLiveCenterOverviewContainer.detail != null) {
            if (getRealtimeLiveCenterOverviewContainer != null && (realtimeLiveCenterDetailData = getRealtimeLiveCenterOverviewContainer.detail) != null) {
                this.LLIZ = realtimeLiveCenterDetailData.hostFirstGiftInfo;
                RealtimeLiveCenterBaseData realtimeLiveCenterBaseData = realtimeLiveCenterDetailData.baseInfo;
                if (realtimeLiveCenterBaseData != null) {
                    Math.max(realtimeLiveCenterBaseData.liveEndTime - realtimeLiveCenterBaseData.liveStartTime, 0L);
                    System.currentTimeMillis();
                }
                List<RealtimeViolationRecord> list = realtimeLiveCenterDetailData.violationRecords;
                ArrayList arrayList = new ArrayList();
                for (RealtimeViolationRecord realtimeViolationRecord : list) {
                    RealtimeViolationRecord realtimeViolationRecord2 = realtimeViolationRecord;
                    PunishEventInfo punishEventInfo = realtimeViolationRecord2.punishInfo;
                    if (punishEventInfo != null) {
                        str = punishEventInfo.punishId;
                    } else {
                        str = null;
                    }
                    if (C500260Jjc.LJJIIZ(str) && realtimeViolationRecord2.status == 0 && ((i = realtimeViolationRecord2.type) == 1 || i == 3 || realtimeViolationRecord2.endTime - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) > 0)) {
                        arrayList.add(realtimeViolationRecord);
                    }
                }
                RealtimeLiveCenterDetailData realtimeLiveCenterDetailData2 = getRealtimeLiveCenterOverviewContainer.detail;
                if (realtimeLiveCenterDetailData2 != null && realtimeLiveCenterDetailData2.whiteBoxData != null) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!arrayList.isEmpty()) && (c12oa = this.LLILZLL) != null) {
                    c12oa.LJJIII(arrayList);
                }
                if (arrayList.isEmpty() && (coldStartStatData = realtimeLiveCenterDetailData.coldStartStatData) != null && coldStartStatData.status == 1 && !z) {
                    C500260Jjc.LJJLIIIJJIZ(new AwS430S0200000_29(this, realtimeLiveCenterDetailData, 5));
                }
                z1();
                return;
            }
            return;
        }
        z1();
    }
}

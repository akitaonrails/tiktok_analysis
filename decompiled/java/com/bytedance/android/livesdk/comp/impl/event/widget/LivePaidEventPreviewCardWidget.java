package com.bytedance.android.livesdk.comp.impl.event.widget;

import X.C018P;
import X.C0IJT;
import X.C0K9J;
import X.C1102070emj;
import X.C1102130emp;
import X.C1102420enI;
import X.C1107780evw;
import X.C1107810evz;
import X.C1113800f5e;
import X.C1161920gLG;
import X.C16F5;
import X.C16FS;
import X.C474500IjA;
import X.C497740JfY;
import X.C512870K9l;
import X.C512900K9o;
import X.C512940K9s;
import X.C513000K9y;
import X.C786410Ut5;
import X.C916790Zxt;
import X.CountDownTimerC512880K9m;
import X.EnumC1100250ejn;
import X.EnumC1107830ew1;
import X.EnumC512780K9c;
import X.EnumC512800K9e;
import X.InterfaceC1102120emo;
import X.InterfaceC1102160ems;
import X.InterfaceC513010K9z;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidInputAnimOpt;
import com.bytedance.android.livesdk.comp.impl.event.widget.LivePaidEventPreviewCardWidget;
import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.notify.AnimatableNotifyWidget;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import webcast.data.PaidEventPreview;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePaidEventPreviewCardWidget extends AnimatableNotifyWidget implements InterfaceC1102160ems {
    public LiveIconView LLILLJJLI;
    public C16F5 LLILLL;
    public C16FS LLILZ;
    public Room LLILZIL;
    public CountDownTimerC512880K9m LLILZLL;
    public long LLIZ = -1;
    public long LLIZLLLIL = -1;
    public C018P LLJ;
    public final List<String> LLJI;
    public final C512870K9l LLJIJIL;

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 8;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0s;
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return new C0K9J();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0K9l] */
    public LivePaidEventPreviewCardWidget() {
        ArrayList arrayList = new ArrayList();
        if (LiveConflictAvoidInputAnimOpt.INSTANCE.enable()) {
            C1107810evz c1107810evz = C1107810evz.LIZIZ;
            arrayList.add(C1107810evz.LJJIIJZLJL.LIZ);
        }
        this.LLJI = arrayList;
        this.LLJIJIL = new InterfaceC513010K9z() { // from class: X.0K9l
            @Override // X.InterfaceC513010K9z
            public final void LIZ() {
            }

            @Override // X.InterfaceC513010K9z
            public final boolean LIZIZ() {
                return false;
            }

            @Override // X.InterfaceC513010K9z
            public final int LIZLLL() {
                return 3;
            }

            @Override // X.InterfaceC513010K9z
            public final Map<Integer, List<String>> LIZJ() {
                HashMap map = new HashMap();
                C1107810evz c1107810evz2 = C1107810evz.LIZIZ;
                map.put(1, C1697810uHb.LJIIJJI(C1107810evz.LJIJJLI.LIZ, C1107810evz.LJJIIZI.LIZ));
                map.put(0, Collections.singletonList(C1107810evz.LJJIJIIJI.LIZ));
                return map;
            }

            @Override // X.InterfaceC513010K9z
            public final boolean isShowing() {
                return this.LIZ.isShowing();
            }

            @Override // X.InterfaceC513010K9z
            public final boolean LJ(String str) {
                if (!this.LIZ.isShowing()) {
                    return false;
                }
                this.LIZ.LLIILII(!((ArrayList) r1.LLJI).contains(str), false, true, C513000K9y.LIZ, null);
                this.LIZ.D1(false);
                return true;
            }
        };
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (isShowing()) {
            return;
        }
        boolean zEnable = LiveNotifyMessageFrequencySetting.INSTANCE.enable();
        if (zEnable) {
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(8, this.dataChannel, "watch", false, false);
            if (!c512940K9sLIZLLL.LIZ) {
                y1(c512940K9sLIZLLL.LIZIZ);
                return;
            }
        }
        this.LLIZLLLIL = SystemClock.uptimeMillis();
        cancelShowAnimation();
        cancelHideAnimation();
        animateShow();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_paid_event_count_down_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_side_card_show");
        c474500IjALIZ2.LJIJJLI(this.dataChannel);
        c474500IjALIZ2.LJJII("paid_event_preview_card", "content");
        c474500IjALIZ2.LIZ();
        ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).f10(this.dataChannel, C1107810evz.LJJIJ, new C1107780evw(true, (Object) EnumC512780K9c.PAID_EVENT_TRAIL_CARD));
        if (zEnable) {
            HashMap<Long, MsgNotifyQuota> map2 = C1102420enI.LIZ;
            Room room = this.LLILZIL;
            C1102420enI.LIZIZ(8, false, false, "watch", "LivePaidEventPreviewCard", room != null ? room.getId() : 0L);
        }
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.SIDE_CARD;
    }

    @Override // X.InterfaceC512840K9i
    public final InterfaceC1102120emo LJJLIIIIJ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public final void onHide() {
        IHiddenChangeAwareWidget.DefaultImpls.onHide(this);
    }

    public final String C1(long j) {
        long j2 = j / 1000;
        if (j2 > 60) {
            return C497740JfY.LJIJJ(2131843857, C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60)}, 1)));
        }
        return C497740JfY.LJIJJ(2131844444, C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
    }

    public final void D1(boolean z) {
        String str;
        if (this.LLIZLLLIL != -1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_side_card_close");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("paid_event_preview_card", "content");
            c474500IjALIZ.LJJII(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.LLIZLLLIL)), "duration");
            if (z) {
                str = "close";
            } else {
                str = "auto";
            }
            c474500IjALIZ.LJJII(str, "close_type");
            c474500IjALIZ.LIZ();
            this.LLIZLLLIL = -1L;
        }
    }

    public final void E1(boolean z) {
        String str;
        if (z) {
            str = "purchase";
        } else {
            str = "close";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_paid_event_count_down_click");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJJII(str, "button_name");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLIZ / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "count_down_time");
        c474500IjALIZ.LIZ();
        if (z) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_side_card_click");
            c474500IjALIZ2.LJIJJLI(this.dataChannel);
            c474500IjALIZ2.LJJII("paid_event_preview_card", "content");
            c474500IjALIZ2.LIZ();
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        if (this.LLJ != null) {
            EnumC512800K9e enumC512800K9e = this.LL;
            if (enumC512800K9e == null || enumC512800K9e == EnumC512800K9e.CONFLICT_CONTROLLED) {
                show();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.e1g);
        findViewById(R.id.wj1);
        this.LLILLL = (C16F5) findViewById(R.id.f04);
        findViewById(R.id.wi7);
        this.LLILZ = (C16FS) findViewById(R.id.whx);
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        CountDownTimerC512880K9m countDownTimerC512880K9m = this.LLILZLL;
        if (countDownTimerC512880K9m != null) {
            countDownTimerC512880K9m.cancel();
        }
        this.LLILZLL = null;
        cancelShowAnimation();
        cancelHideAnimation();
        D1(false);
        C513000K9y c513000K9y = C513000K9y.LIZ;
        C513000K9y.LJIIIIZZ(2, this.LLJIJIL);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0K9m, android.os.CountDownTimer] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.018P] */
    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        final long j;
        boolean zLIZ;
        LiveEventInfo liveEventInfo;
        PaidEventPreview paidEventPreview;
        this.LLIZLLLIL = -1L;
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLILZIL = room;
        if (room != null && (liveEventInfo = room.liveEventInfo) != null && (paidEventPreview = liveEventInfo.paidEventPreview) != null) {
            j = paidEventPreview.allowPreviewTime;
        } else {
            j = 0;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            C1102070emj.LIZ.getClass();
            final long jLIZLLL = C1102070emj.LIZLLL(dataChannel);
            final String string = UUID.randomUUID().toString();
            this.LLJ = new InterfaceC1102120emo(jLIZLLL, string) { // from class: X.018P
                public final long LIZ;
                public final String LIZIZ;

                @Override // X.InterfaceC1102120emo
                public final String LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LIZJ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJFF() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final void LJI() {
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIIIIZZ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIIJJI() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final Boolean LJIIL() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIILIIL() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final /* bridge */ /* synthetic */ String LJJJ() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final String getBusinessName() {
                    return "live_event";
                }

                @Override // X.InterfaceC1102120emo
                public final Map<String, String> getExtras() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final C1099880ejC LJIIIZ() {
                    View view = this.LIZJ.getView();
                    return new C1099880ejC(view != null ? view.hasWindowFocus() : false);
                }

                @Override // X.InterfaceC1102120emo
                public final View LJIILJJIL() {
                    View view = this.LIZJ.getView();
                    if (view != null) {
                        return view.getRootView();
                    }
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final EnumC245600xC LIZLLL() {
                    return C245700xD.LIZ(this);
                }

                @Override // X.InterfaceC1102120emo
                public final int getComponentType() {
                    return ((LivePaidEventPreviewCardWidget) LJII()).getComponentType();
                }

                @Override // X.InterfaceC1102120emo
                public final InterfaceC1102150emr LJII() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC1102120emo
                public final long LJIIJ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1102120emo
                public final String getId() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = jLIZLLL;
                    this.LIZIZ = string;
                }
            };
        }
        if (j > 0 && ((zLIZ = C916790Zxt.LIZ(8)) || C513000K9y.LIZ.LJII(this.LLJIJIL, this.dataChannel))) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel2 = this.dataChannel;
            C018P c018p = this.LLJ;
            c1102070emj.getClass();
            C1102070emj.LJJIII(dataChannel2, this, c018p);
            C1113800f5e.LJIIIIZZ = false;
            C16F5 c16f5 = this.LLILLL;
            if (c16f5 != null) {
                c16f5.setText(C1(j));
            }
            if (zLIZ) {
                this.LL = null;
            }
            c1102070emj.LJJI(this.dataChannel, this, this.LLJ, null);
            if (!zLIZ) {
                show();
            }
            CountDownTimerC512880K9m countDownTimerC512880K9m = this.LLILZLL;
            if (countDownTimerC512880K9m != null) {
                countDownTimerC512880K9m.cancel();
            }
            ?? r0 = new CountDownTimer(j) { // from class: X.0K9m
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    LiveEventInfo liveEventInfo2;
                    PaidEventPreview paidEventPreview2;
                    LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget = this;
                    C16F5 c16f52 = livePaidEventPreviewCardWidget.LLILLL;
                    if (c16f52 != null) {
                        c16f52.setText(livePaidEventPreviewCardWidget.C1(0L));
                    }
                    LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget2 = this;
                    EnumC512800K9e enumC512800K9e = EnumC512800K9e.TIMEOUT;
                    livePaidEventPreviewCardWidget2.D1(false);
                    livePaidEventPreviewCardWidget2.z1(enumC512800K9e, false);
                    Room room2 = this.LLILZIL;
                    if (room2 != null && (liveEventInfo2 = room2.liveEventInfo) != null && (paidEventPreview2 = liveEventInfo2.paidEventPreview) != null) {
                        paidEventPreview2.allowPreviewTime = 0L;
                    }
                    C2651010v.LIZ(0L, room2 != null ? Long.valueOf(room2.getId()) : null);
                    LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget3 = this;
                    livePaidEventPreviewCardWidget3.LLIZ = 0L;
                    if (livePaidEventPreviewCardWidget3.dataChannel.gg0(PaidEventStatusChannel.class) == EnumC464630IJx.PREVIEW) {
                        this.dataChannel.zW(PaidEventStatusChannel.class, EnumC464630IJx.MASK);
                    }
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j2) {
                    Long lValueOf;
                    LiveEventInfo liveEventInfo2;
                    PaidEventPreview paidEventPreview2;
                    LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget = this;
                    C16F5 c16f52 = livePaidEventPreviewCardWidget.LLILLL;
                    if (c16f52 != null) {
                        c16f52.setText(livePaidEventPreviewCardWidget.C1(j2));
                    }
                    Room room2 = this.LLILZIL;
                    if (room2 != null && (liveEventInfo2 = room2.liveEventInfo) != null && (paidEventPreview2 = liveEventInfo2.paidEventPreview) != null) {
                        paidEventPreview2.allowPreviewTime = j2;
                    }
                    if (room2 != null) {
                        lValueOf = Long.valueOf(room2.getId());
                    } else {
                        lValueOf = null;
                    }
                    C2651010v.LIZ(j2, lValueOf);
                    this.LLIZ = j2;
                }
            };
            this.LLILZLL = r0;
            r0.start();
        }
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0K9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, view);
        }
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0K9p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget = this.LL;
                    EnumC512800K9e enumC512800K9e = EnumC512800K9e.MANUALLY_CLOSE;
                    livePaidEventPreviewCardWidget.D1(true);
                    livePaidEventPreviewCardWidget.z1(enumC512800K9e, false);
                    this.LL.E1(false);
                }
            });
        }
        C16FS c16fs = this.LLILZ;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0K9n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget = this.LL;
                    Room room2 = livePaidEventPreviewCardWidget.LLILZIL;
                    if (room2 != null) {
                        C0IZS.LIZ(livePaidEventPreviewCardWidget.context, room2, "paid_event_countdown_card");
                        livePaidEventPreviewCardWidget.E1(true);
                    }
                    C1102070emj c1102070emj2 = C1102070emj.LIZ;
                    LivePaidEventPreviewCardWidget livePaidEventPreviewCardWidget2 = this.LL;
                    C1102070emj.LJIILJJIL(c1102070emj2, livePaidEventPreviewCardWidget2.dataChannel, livePaidEventPreviewCardWidget2, livePaidEventPreviewCardWidget2.LLJ, C0KAJ.MANUALLY_ROUTE, null, null, 112);
                }
            });
        }
        this.dataChannel.BQ2(this, PaidEventStatusChannel.class, new C512900K9o(this));
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) {
        LLFFF(i);
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget
    public final void z1(EnumC512800K9e enumC512800K9e, boolean z) {
        if (!isShowing()) {
            return;
        }
        cancelShowAnimation();
        cancelHideAnimation();
        if (z) {
            A1(enumC512800K9e);
        } else {
            x1(enumC512800K9e);
        }
        B1(enumC512800K9e);
        IBusinessAvoidConflictNotifyService iBusinessAvoidConflictNotifyService = (IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class);
        DataChannel dataChannel = this.dataChannel;
        C1107810evz c1107810evz = C1107810evz.LIZIZ;
        iBusinessAvoidConflictNotifyService.f10(dataChannel, C1107810evz.LJJIJ, new C1107780evw(false, (Object) EnumC512780K9c.PAID_EVENT_TRAIL_CARD));
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        String strLIZ;
        if (z) {
            EnumC512800K9e enumC512800K9e = EnumC512800K9e.CONFLICT_CONTROLLED;
            D1(false);
            z1(enumC512800K9e, false);
        } else {
            if (c1102130emp.LIZ() == null || (strLIZ = c1102130emp.LIZ()) == null || ((ArrayList) this.LLJI).contains(strLIZ)) {
                return;
            }
            z1(EnumC512800K9e.CONFLICT_CONTROLLED, false);
        }
    }
}

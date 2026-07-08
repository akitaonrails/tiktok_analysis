package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive;

import X.AbstractC509530JyZ;
import X.C001A;
import X.C0IGW;
import X.C0II9;
import X.C0IJT;
import X.C0IL2;
import X.C0INV;
import X.C0K90;
import X.C0K94;
import X.C0K95;
import X.C0K96;
import X.C0K98;
import X.C0K99;
import X.C0K9A;
import X.C0K9B;
import X.C0K9J;
import X.C0K9Q;
import X.C0KAG;
import X.C0U3P;
import X.C0U3Q;
import X.C1078480eAg;
import X.C1102070emj;
import X.C1102130emp;
import X.C1102420enI;
import X.C1107780evw;
import X.C1107810evz;
import X.C1113800f5e;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C1BNE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C389001fE;
import X.C474500IjA;
import X.C492290JSh;
import X.C494680Jac;
import X.C497740JfY;
import X.C510070JzR;
import X.C512610K8l;
import X.C512940K9s;
import X.C513000K9y;
import X.C776250Uch;
import X.C784440Upu;
import X.C786410Ut5;
import X.C916790Zxt;
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
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidInputAnimOpt;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.repository.PrivilegeRepository;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveChangedChannel;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.bytedance.android.livesdk.livesetting.level.LiveSuperFansOnlyRoomBackGroundMuteSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSettingV3;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.notify.AnimatableNotifyWidget;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionTrialLiveCardWidget extends AnimatableNotifyWidget implements OnMessageListener, InterfaceC1102160ems {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public LiveIconView LLILLJJLI;
    public C1324720kZq LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16FS LLILZLL;
    public IMessageManager LLIZ;
    public Room LLIZLLLIL;
    public C0K94 LLJ;
    public long LLJI;
    public long LLJIJIL = -1;
    public long LLJILJIL = -1;
    public C0K99 LLJILJILJ;
    public PrivilegeRepository LLJILLL;
    public final ISubscriptionStatusService LLJJ;
    public C492290JSh LLJJI;
    public final C2252321DDq LLJJIII;
    public final List<String> LLJJIJI;
    public final C0K98 LLJJIJIIJIL;

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 8;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2l;
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean E1() {
        AbstractC509530JyZ abstractC509530JyZLIZJ;
        C492290JSh c492290JSh = this.LLJJI;
        return (c492290JSh == null || (abstractC509530JyZLIZJ = c492290JSh.LIZJ()) == null || !abstractC509530JyZLIZJ.LIZ) ? false : true;
    }

    public final void G1() {
        User owner;
        long j = this.LLJIJIL;
        if (j < 0) {
            return;
        }
        long j2 = (this.LLJI - j) / 1000;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_preview_duration");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
        c474500IjALIZ.LJJII("", "enter_from");
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII(Integer.valueOf(E1() ? 1 : 0), "user_type");
        Room room = this.LLIZLLLIL;
        Object objValueOf = null;
        c474500IjALIZ.LJJII(room != null ? Long.valueOf(room.getId()) : null, "room_id");
        Room room2 = this.LLIZLLLIL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            objValueOf = Long.valueOf(owner.getId());
        }
        c474500IjALIZ.LJJII(objValueOf, "anchor_id");
        c474500IjALIZ.LJJII("live_detail_page", "event_page");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "duration");
        Room room3 = this.LLIZLLLIL;
        c474500IjALIZ.LJJII(Long.valueOf((room3 != null ? room3.maxPreviewTime : 0L) / 1000), "maximum_preview_duration");
        c474500IjALIZ.LIZ();
        this.LLJIJIL = -1L;
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return new C0K9J();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0K98] */
    public SubscriptionTrialLiveCardWidget() {
        ISubscriptionStatusService.LJIIIZ.getClass();
        this.LLJJ = C0K9Q.LIZ();
        this.LLJJIII = C1BNE.LIZ(Boolean.FALSE);
        ArrayList arrayList = new ArrayList();
        if (LiveConflictAvoidInputAnimOpt.INSTANCE.enable()) {
            arrayList.add(C1107810evz.LJJIIJZLJL.LIZ);
        }
        this.LLJJIJI = arrayList;
        this.LLJJIJIIJIL = new InterfaceC513010K9z() { // from class: X.0K98
            @Override // X.InterfaceC513010K9z
            public final void LIZ() {
            }

            @Override // X.InterfaceC513010K9z
            public final boolean LIZIZ() {
                return false;
            }

            @Override // X.InterfaceC513010K9z
            public final int LIZLLL() {
                return 2;
            }

            @Override // X.InterfaceC513010K9z
            public final Map<Integer, List<String>> LIZJ() {
                HashMap map = new HashMap();
                C1107810evz c1107810evz = C1107810evz.LIZIZ;
                map.put(1, Collections.singletonList(C1107810evz.LJIJJLI.LIZ));
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
                this.LIZ.LLIILII(!((ArrayList) r1.LLJJIJI).contains(str), false, true, C513000K9y.LIZ, null);
                this.LIZ.F1(false);
                return true;
            }
        };
    }

    public final void J1() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0K9B(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (!isShowing() && C494680Jac.LJIIL(this.LLIZLLLIL)) {
            this.LLJILJIL = SystemClock.uptimeMillis();
            cancelShowAnimation();
            cancelHideAnimation();
            animateShow();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_show");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("sub_only_preview_card", "show_entrance");
            if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJJIJIL();
                c474500IjALIZ.LJJIJL();
            } else {
                c474500IjALIZ.LIZ();
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_side_card_show");
            c474500IjALIZ2.LJIJJLI(this.dataChannel);
            c474500IjALIZ2.LJJII("sub_only_preview_card", "content");
            c474500IjALIZ2.LIZ();
            ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).f10(this.dataChannel, C1107810evz.LJJIJ, new C1107780evw(true, (Object) EnumC512780K9c.SUB_ONLY_TRAIL_CARD));
            if (LiveNotifyMessageFrequencySetting.INSTANCE.enable()) {
                HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
                Room room = this.LLIZLLLIL;
                C1102420enI.LIZIZ(8, false, false, "watch", "SubscriptionTrailCard", room != null ? room.getId() : 0L);
            }
        }
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.SIDE_CARD;
    }

    @Override // X.InterfaceC512840K9i
    public final InterfaceC1102120emo LJJLIIIIJ() {
        return this.LLJILJILJ;
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
            return C497740JfY.LJIJJ(2131856676, String.valueOf(j2 / 60));
        }
        return C497740JfY.LJIJJ(2131856675, String.valueOf(j2));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0K94] */
    public final void D1(final long j) {
        if (C494680Jac.LIZ(this.LLIZLLLIL)) {
            J1();
            C1113800f5e.LJIIIIZZ = false;
            return;
        }
        long j2 = 0;
        if (j > 0) {
            boolean zLIZ = C916790Zxt.LIZ(8);
            if (!zLIZ && !C513000K9y.LIZ.LJII(this.LLJJIJIIJIL, this.dataChannel)) {
                return;
            }
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel = this.dataChannel;
            C0K99 c0k99 = this.LLJILJILJ;
            c1102070emj.getClass();
            C1102070emj.LJJIII(dataChannel, this, c0k99);
            this.dataChannel.zW(SubOnlyLiveAudienceStatusChannel.class, C0II9.NON_SUBSCRIBER_TRIAL_LIVE);
            C1113800f5e.LJIIIIZZ = false;
            C16F5 c16f5 = this.LLILZ;
            if (c16f5 != null) {
                c16f5.setText(C1(j));
            }
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(8, this.dataChannel, "watch", false, false);
            if (!c512940K9sLIZLLL.LIZ) {
                y1(c512940K9sLIZLLL.LIZIZ);
                return;
            }
            if (zLIZ) {
                this.LL = null;
            }
            c1102070emj.LJJI(this.dataChannel, this, this.LLJILJILJ, null);
            if (!zLIZ) {
                show();
            }
            C0K94 c0k94 = this.LLJ;
            if (c0k94 != null) {
                c0k94.cancel();
            }
            this.LLJ = new CountDownTimer(j) { // from class: X.0K94
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this;
                    C16F5 c16f52 = subscriptionTrialLiveCardWidget.LLILZ;
                    if (c16f52 != null) {
                        c16f52.setText(subscriptionTrialLiveCardWidget.C1(0L));
                    }
                    SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget2 = this;
                    EnumC512800K9e enumC512800K9e = EnumC512800K9e.TIMEOUT;
                    subscriptionTrialLiveCardWidget2.F1(false);
                    subscriptionTrialLiveCardWidget2.z1(enumC512800K9e, false);
                    Room room = this.LLIZLLLIL;
                    if (room != null) {
                        room.allowPreviewTime = 0L;
                        C0IU0.LJII(new C0IU1(room.allowPreviewTime, room.getId()));
                    }
                    SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget3 = this;
                    subscriptionTrialLiveCardWidget3.LLJIJIL = 0L;
                    subscriptionTrialLiveCardWidget3.J1();
                    this.G1();
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j3) {
                    SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this;
                    C16F5 c16f52 = subscriptionTrialLiveCardWidget.LLILZ;
                    if (c16f52 != null) {
                        c16f52.setText(subscriptionTrialLiveCardWidget.C1(j3));
                    }
                    Room room = this.LLIZLLLIL;
                    if (room != null) {
                        room.allowPreviewTime = j3;
                        C0IU0.LJII(new C0IU1(room.allowPreviewTime, room.getId()));
                    }
                    this.LLJIJIL = j3;
                }
            };
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_preview_play");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            Room room = this.LLIZLLLIL;
            if (room != null) {
                j2 = room.maxPreviewTime;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j2 / 1000), "maximum_preview_duration");
            c474500IjALIZ.LJJII(Integer.valueOf(E1() ? 1 : 0), "user_type");
            c474500IjALIZ.LIZ();
            C0K94 c0k942 = this.LLJ;
            if (c0k942 == null) {
                return;
            }
            c0k942.start();
            return;
        }
        if (j < 0) {
            return;
        }
        J1();
        C1113800f5e.LJIIIIZZ = false;
    }

    public final void F1(boolean z) {
        String str;
        if (this.LLJILJIL != -1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_side_card_close");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("sub_only_preview_card", "content");
            c474500IjALIZ.LJJII(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - this.LLJILJIL)), "duration");
            if (z) {
                str = "close";
            } else {
                str = "auto";
            }
            c474500IjALIZ.LJJII(str, "close_type");
            c474500IjALIZ.LIZ();
            this.LLJILJIL = -1L;
        }
    }

    public final void H1(MemberMessage memberMessage) {
        long j;
        Long lValueOf;
        if (C494680Jac.LJI(this.dataChannel)) {
            long j2 = memberMessage.allowPreviewTime;
            Room room = this.LLIZLLLIL;
            if (room != null) {
                j = room.maxPreviewTime;
            } else {
                j = -1;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("message previewTime");
            sbLIZ.append(memberMessage.allowPreviewTime);
            sbLIZ.append(", max preview time:");
            Room room2 = this.LLIZLLLIL;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.maxPreviewTime);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            C20441214yg.LIZIZ("SubscriptionTrialLiveCardWidget", C2188811AlT.LIZIZ(sbLIZ));
            if (j2 > 0 && this.LLIZLLLIL != null && j > 0) {
                j2 = j;
            }
            Room room3 = this.LLIZLLLIL;
            if (room3 != null) {
                room3.allowPreviewTime = j2;
            }
            this.LLJI = j2;
            this.LLJILJILJ = new C0K99(this, memberMessage.baseMessage.createTime, String.valueOf(memberMessage.getMessageId()));
            D1(j2);
            return;
        }
        if (!C494680Jac.LJIILLIIL(this.dataChannel)) {
            return;
        }
        this.dataChannel.zW(SubOnlyLiveAudienceStatusChannel.class, C0II9.SUBSCRIBER_NORMAL_LIVE);
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        if (this.LLJILJILJ != null) {
            EnumC512800K9e enumC512800K9e = this.LL;
            if (enumC512800K9e == null || enumC512800K9e == EnumC512800K9e.CONFLICT_CONTROLLED) {
                show();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup.LayoutParams layoutParams;
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.e1g);
        this.LLILLL = (C1324720kZq) findViewById(R.id.wj1);
        this.LLILZ = (C16F5) findViewById(R.id.f04);
        this.LLILZIL = (C16F5) findViewById(R.id.wi7);
        this.LLILZLL = (C16FS) findViewById(R.id.whx);
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c1324720kZq != null && (layoutParams = c1324720kZq.getLayoutParams()) != null) {
            layoutParams.width = (int) C497740JfY.LIZIZ(72.0f);
            layoutParams.height = (int) C497740JfY.LIZIZ(60.0f);
            C1324720kZq c1324720kZq2 = this.LLILLL;
            if (c1324720kZq2 != null) {
                C786410Ut5.u6(c1324720kZq2, layoutParams);
            }
        }
        C1143680frq.LIZLLL(this.LLILLL, "tiktok_live_super_fans_resource", "ttlive_super_fans_icon_new_large_preview.png");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof MemberMessage) {
            MemberMessage memberMessage = (MemberMessage) iMessage;
            int i = memberMessage.action;
            if (i == 28) {
                Room room = this.LLIZLLLIL;
                if (room != null) {
                    room.liveSubOnly = 1L;
                }
                this.dataChannel.zW(SubOnlyLiveChangedChannel.class, 1L);
                ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
                C0U3P.LIZLLL(C0U3Q.SUB_ONLY);
                if (LiveSuperFansOnlyRoomBackGroundMuteSetting.INSTANCE.getValue() && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
                    C784440Upu.LIZ().LIZIZ(new C0IGW());
                }
                C389001fE.LIZ("switch_sub_only_live", null, System.currentTimeMillis(), false);
                long j = memberMessage.liveSubOnlyMonth;
                if (j <= 0 && memberMessage.liveSubOnlyTier <= 0) {
                    H1(memberMessage);
                    return;
                } else {
                    I1(0, j, memberMessage.liveSubOnlyTier, new C512610K8l(this, iMessage));
                    return;
                }
            }
            if (i != 36) {
                return;
            }
            Room room2 = this.LLIZLLLIL;
            if (room2 != null) {
                room2.disablePreviewSubOnly = 1L;
            }
            long j2 = memberMessage.liveSubOnlyMonth;
            if (j2 <= 0 && memberMessage.liveSubOnlyTier <= 0) {
                if (!C494680Jac.LJI(this.dataChannel)) {
                    return;
                }
                EnumC512800K9e enumC512800K9e = EnumC512800K9e.OTHERS;
                F1(false);
                z1(enumC512800K9e, false);
                C0K94 c0k94 = this.LLJ;
                if (c0k94 != null) {
                    c0k94.cancel();
                }
                J1();
                C1113800f5e.LJIIIIZZ = false;
                return;
            }
            I1(0, j2, memberMessage.liveSubOnlyTier, new C0K95(this));
        }
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        C0K94 c0k94 = this.LLJ;
        if (c0k94 != null) {
            c0k94.cancel();
        }
        this.LLJ = null;
        this.LLJILJILJ = null;
        cancelShowAnimation();
        cancelHideAnimation();
        C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.subscribePreviewTime = -1L;
        G1();
        F1(false);
        C513000K9y c513000K9y = C513000K9y.LIZ;
        C513000K9y.LJIIIIZZ(2, this.LLJJIJIIJIL);
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        String secUid;
        C1078480eAg c1078480eAg;
        Object obj;
        long jLongValue;
        boolean z;
        Room room;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        SubscribeInfo subscribeInfo2;
        String str;
        Room room2;
        User owner3;
        super.z1(EnumC512800K9e.OTHERS, false);
        this.LLJILJIL = -1L;
        this.LLIZ = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        Room room3 = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLIZLLLIL = room3;
        C492290JSh c492290JShFi2 = this.LLJJ.fi2(room3, this, this);
        this.LLJJI = c492290JShFi2;
        if (c492290JShFi2 != null) {
            c492290JShFi2.LIZIZ(this, new C0K96(this));
        }
        IMessageManager iMessageManager = this.LLIZ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), this);
        }
        Room room4 = this.LLIZLLLIL;
        if (room4 == null || (owner3 = room4.getOwner()) == null || (secUid = owner3.getSecUid()) == null) {
            secUid = "";
        }
        this.LLJILLL = C510070JzR.LIZ(secUid, this);
        Long lValueOf = null;
        if (C494680Jac.LJI(this.dataChannel)) {
            Room room5 = this.LLIZLLLIL;
            if (room5 != null && room5.allowPreviewTime < 0) {
                return;
            }
            C0INV c0inv = C0IL2.LIZ;
            Long lValueOf2 = Long.valueOf(c0inv.LIZ().mEnterRoomConfig.mRoomsData.subscribePreviewTime);
            if (lValueOf2.longValue() < 0) {
                lValueOf2 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("previewTimeFromConfig:");
            sbLIZ.append(lValueOf2);
            C20441214yg.LIZIZ("SubscriptionTrialLiveCardWidget", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("room?.allowPreviewTime:");
            Room room6 = this.LLIZLLLIL;
            if (room6 != null) {
                lValueOf = Long.valueOf(room6.allowPreviewTime);
            }
            sbLIZ2.append(lValueOf);
            C20441214yg.LIZIZ("SubscriptionTrialLiveCardWidget", C2188811AlT.LIZIZ(sbLIZ2));
            Long lValueOf3 = Long.valueOf(c0inv.LIZ().mEnterRoomConfig.mRoomsData.subscribePreviewTime);
            if (lValueOf3.longValue() >= 0 || ((room2 = this.LLIZLLLIL) != null && (lValueOf3 = Long.valueOf(room2.allowPreviewTime)) != null)) {
                jLongValue = lValueOf3.longValue();
            } else {
                jLongValue = 0;
            }
            this.LLJI = jLongValue;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                C1102070emj.LIZ.getClass();
                this.LLJILJILJ = new C0K99(this, C1102070emj.LIZLLL(dataChannel), UUID.randomUUID().toString());
            }
            Room room7 = this.LLIZLLLIL;
            if (room7 != null && (room7.liveSubOnlyTier > 0 || (room7 != null && room7.liveSubOnlyMonth > 0))) {
                z = true;
            } else {
                z = false;
            }
            if (room7 != null && (owner2 = room7.getOwner()) != null && (subscribeInfo2 = owner2.getSubscribeInfo()) != null && (str = subscribeInfo2.solRoomDisplayText) != null && str.length() > 0) {
                C16F5 c16f5 = this.LLILZIL;
                if (c16f5 != null) {
                    c16f5.setText("");
                }
                C16F5 c16f52 = this.LLILZIL;
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 8);
                }
            } else {
                C16F5 c16f53 = this.LLILZIL;
                if (c16f53 != null) {
                    c16f53.setText("");
                }
                C16F5 c16f54 = this.LLILZIL;
                if (c16f54 != null) {
                    C786410Ut5.LLJJJJ(c16f54, 8);
                }
            }
            if (E1() && z && (room = this.LLIZLLLIL) != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && !subscribeInfo.isSolEligible) {
                C16FS c16fs = this.LLILZLL;
                if (c16fs != null) {
                    c16fs.setText(C497740JfY.LJIJI(2131856674));
                }
            } else {
                C16FS c16fs2 = this.LLILZLL;
                if (c16fs2 != null) {
                    c16fs2.setText(C497740JfY.LJIJI(2131856674));
                }
            }
            D1(jLongValue);
        }
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0K9H
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, view);
        }
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0K9G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this.LL;
                    EnumC512800K9e enumC512800K9e = EnumC512800K9e.MANUALLY_CLOSE;
                    subscriptionTrialLiveCardWidget.F1(true);
                    subscriptionTrialLiveCardWidget.z1(enumC512800K9e, false);
                }
            });
        }
        this.dataChannel.EQ2(this, RoomUserChannel.class, new C0K9A(this));
        C16FS c16fs3 = this.LLILZLL;
        if (c16fs3 != null) {
            C786410Ut5.h8(c16fs3, new View.OnClickListener() { // from class: X.0K97
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).i31("super fans only live", false);
                    SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this.LL;
                    subscriptionTrialLiveCardWidget.getClass();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_click");
                    c474500IjALIZ.LJIJJLI(subscriptionTrialLiveCardWidget.dataChannel);
                    c474500IjALIZ.LJJII("sub_only_preview_card", "click_position");
                    c474500IjALIZ.LIZ();
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_side_card_click");
                    c474500IjALIZ2.LJIJJLI(subscriptionTrialLiveCardWidget.dataChannel);
                    c474500IjALIZ2.LJJII("sub_only_preview_card", "content");
                    c474500IjALIZ2.LIZ();
                    C1102070emj c1102070emj = C1102070emj.LIZ;
                    SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget2 = this.LL;
                    C1102070emj.LJIILJJIL(c1102070emj, subscriptionTrialLiveCardWidget2.dataChannel, subscriptionTrialLiveCardWidget2, subscriptionTrialLiveCardWidget2.LLJILJILJ, C0KAJ.MANUALLY_ROUTE, null, null, 112);
                }
            });
        }
        if (LiveWidgetMinLoadSettingV3.INSTANCE.enableSubTrailCard() && objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C1078480eAg) && (c1078480eAg = (C1078480eAg) obj2) != null && (obj = c1078480eAg.LIZ) != null && (obj instanceof IMessage)) {
                    onMessage((IMessage) obj);
                }
            }
        }
        C16FS c16fs4 = this.LLILZLL;
        if (c16fs4 != null) {
            c16fs4.setText(C497740JfY.LJIJI(2131856674));
        }
        C16F5 c16f55 = this.LLILZIL;
        if (c16f55 != null) {
            c16f55.setText("");
        }
        C16F5 c16f56 = this.LLILZIL;
        if (c16f56 != null) {
            C786410Ut5.LLJJJJ(c16f56, 8);
        }
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
        iBusinessAvoidConflictNotifyService.f10(dataChannel, C1107810evz.LJJIJ, new C1107780evw(false, (Object) EnumC512780K9c.SUB_ONLY_TRAIL_CARD));
    }

    public final void I1(int i, long j, long j2, Function1 function1) {
        String secUid;
        User owner;
        C0K90 c0k90 = new C0K90(j, j2, this, function1);
        ISubscriptionStatusService iSubscriptionStatusService = this.LLJJ;
        Room room = this.LLIZLLLIL;
        if (room != null && (owner = room.getOwner()) != null) {
            secUid = owner.getSecUid();
        } else {
            secUid = null;
        }
        iSubscriptionStatusService.jw(new C0KAG(secUid, j, j2, i), c0k90);
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        if (z) {
            EnumC512800K9e enumC512800K9e = EnumC512800K9e.CONFLICT_CONTROLLED;
            F1(false);
            z1(enumC512800K9e, false);
        } else {
            String strLIZ = c1102130emp.LIZ();
            if (strLIZ == null || ((ArrayList) this.LLJJIJI).contains(strLIZ)) {
                return;
            }
            z1(EnumC512800K9e.CONFLICT_CONTROLLED, false);
        }
    }
}

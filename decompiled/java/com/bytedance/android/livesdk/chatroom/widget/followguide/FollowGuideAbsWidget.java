package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.C08D5;
import X.C09JN;
import X.C0KAJ;
import X.C1102070emj;
import X.C11NJ;
import X.C11S5;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C500260Jjc;
import X.C519290KYd;
import X.C786410Ut5;
import X.EnumC1100250ejn;
import X.EnumC1107830ew1;
import X.EnumC512800K9e;
import X.InterfaceC1102120emo;
import X.InterfaceC500940Jki;
import Y.ARunnableS107S0100000_7;
import Y.AfS176S0100000_7;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.GuideMessageChannel;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdk.notify.AnimatableNotifyWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public abstract class FollowGuideAbsWidget extends AnimatableNotifyWidget {
    public Room LLILZ;
    public GuideMessage LLILZIL;
    public C519290KYd LLILZLL;
    public boolean LLIZLLLIL;
    public InterfaceC1102120emo LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public final C11NJ LLILLJJLI = new C11NJ();
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLIZ = true;
    public final ARunnableS107S0100000_7 LLJILJIL = new ARunnableS107S0100000_7(this, 72);
    public final List<Class<? extends Channel<Boolean>>> LLJILJILJ = C1697810uHb.LJIIJJI(HighPriorityTooltipVisibilityChannel.class, HighPrioritySlotVisibilityChannel.class);

    public abstract C519290KYd C1();

    /* JADX WARN: Removed duplicated region for block: B:44:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1() {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget.D1():void");
    }

    public Map<String, String> E1() {
        return null;
    }

    public abstract long F1();

    public void H1() {
        C519290KYd c519290KYdC1 = C1();
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJJI = C500260Jjc.LJJJI(dataChannel != null ? (Boolean) dataChannel.gg0(LockScreenChannel.class) : null);
        if (zLJJJI) {
            c519290KYdC1 = new C519290KYd("LockScreenChannel", true, false, 12);
        }
        if (isShowing()) {
            if (zLJJJI) {
                if (this.LLILZLL == null) {
                    L1(c519290KYdC1 != null ? c519290KYdC1.LIZ : null, false);
                }
                LLIILII(true, false, true, null, null);
                this.LLILZIL = null;
            } else if (c519290KYdC1 != null) {
                if (this.LLILZLL == null) {
                    L1(c519290KYdC1.LIZ, false);
                }
                if (c519290KYdC1.LIZIZ) {
                    LLIILII(true, false, false, null, null);
                    if (!c519290KYdC1.LIZJ) {
                        this.LLILLL.removeCallbacksAndMessages(this.LLJILJILJ);
                    }
                } else {
                    LLIILII(false, false, false, null, null);
                    V1();
                }
            } else if (!this.LLJI) {
                C519290KYd c519290KYd = this.LLILZLL;
                if (c519290KYd != null) {
                    O1(c519290KYd.LIZ);
                }
                U1();
            }
        } else if (c519290KYdC1 != null) {
            if (this.LLILZLL == null) {
                L1(c519290KYdC1.LIZ, true);
            }
            if (c519290KYdC1.LIZIZ && !c519290KYdC1.LIZJ) {
                this.LLILLL.removeCallbacksAndMessages(this.LLJILJILJ);
            }
        } else {
            C519290KYd c519290KYd2 = this.LLILZLL;
            if (J1(c519290KYd2 != null ? c519290KYd2.LIZ : null)) {
                this.LLILLL.removeCallbacksAndMessages(this.LLJILJILJ);
                C08D5.LIZIZ(this.LLILLL, new ARunnableS107S0100000_7(this, 73), this.LLJILJILJ, 30000L);
            } else if (!this.LLILLL.hasMessages(0, this.LLJILJILJ)) {
                T1(false);
            }
        }
        this.LLILZLL = c519290KYdC1;
    }

    public boolean J1(String str) {
        return false;
    }

    public InterfaceC1102120emo P1(GuideMessage guideMessage) {
        return null;
    }

    public abstract void Q1();

    public void R1(boolean z) {
    }

    public abstract void S1();

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N1() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            r3 = 0
            if (r0 == 0) goto L6f
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            if (r0 == 0) goto L6f
            java.lang.String r1 = r0.describe
        Lb:
            java.lang.String r0 = "change_orientation"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L64
            java.lang.String r0 = "livesdk_follow_popup_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "follow_guide_style"
            java.lang.String r0 = "live_follow_popup"
            r2.LJJII(r0, r1)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L6d
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            if (r0 == 0) goto L6d
            java.lang.String r1 = r0.logId
        L2a:
            java.lang.String r0 = "notification_request_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L6b
            java.lang.String r1 = r0.scene
        L35:
            java.lang.String r0 = "notification_type"
            r2.LJJII(r1, r0)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L68
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L4a
            long r0 = r0.displayStyle
        L46:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L4a:
            java.lang.String r0 = "style"
            r2.LJJII(r3, r0)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L65
            java.lang.String r1 = "portrait"
        L57:
            java.lang.String r0 = "room_orientation"
            r2.LJJII(r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            r2.LJIJJLI(r0)
            r2.LIZ()
        L64:
            return
        L65:
            java.lang.String r1 = "landscape"
            goto L57
        L68:
            r0 = 2
            goto L46
        L6b:
            r1 = r3
            goto L35
        L6d:
            r1 = r3
            goto L2a
        L6f:
            r1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget.N1():void");
    }

    public final void U1() {
        if (this.LLJI) {
            return;
        }
        GuideMessage guideMessage = this.LLILZIL;
        if (guideMessage != null) {
            guideMessage.duration = G1(guideMessage);
        }
        C786410Ut5.LJLIIL(1000L, this.LLILLL, this.LLJILJIL);
        this.LLJI = true;
    }

    public final void V1() {
        this.LLILLL.removeCallbacks(this.LLJILJIL);
        this.LLJI = false;
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        if (isShowing()) {
            return;
        }
        cancelShowAnimation();
        cancelHideAnimation();
        animateShow();
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.SPECIAL_CAPSULE;
    }

    @Override // X.InterfaceC512840K9i
    public final InterfaceC1102120emo LJJLIIIIJ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    public long G1(GuideMessage guideMessage) {
        long j = guideMessage.duration;
        if (j < Mp4ScreenVideoLoadTimeout.CONTROL) {
            return Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O1(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "livesdk_follow_popup_show_again"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "follow_guide_style"
            java.lang.String r0 = "live_follow_popup"
            r2.LJJII(r0, r1)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            r3 = 0
            if (r0 == 0) goto L60
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.logId
        L18:
            java.lang.String r0 = "notification_request_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L5e
            java.lang.String r1 = r0.scene
        L23:
            java.lang.String r0 = "notification_type"
            r2.LJJII(r1, r0)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L5b
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L38
            long r0 = r0.displayStyle
        L34:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L38:
            java.lang.String r0 = "style"
            r2.LJJII(r3, r0)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L58
            java.lang.String r1 = "portrait"
        L45:
            java.lang.String r0 = "room_orientation"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "avoid_reason"
            r2.LJJII(r5, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            r2.LJIJJLI(r0)
            r2.LIZ()
            return
        L58:
            java.lang.String r1 = "landscape"
            goto L45
        L5b:
            r0 = 2
            goto L34
        L5e:
            r1 = r3
            goto L23
        L60:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget.O1(java.lang.String):void");
    }

    public void T1(boolean z) {
        String str;
        User owner;
        if (this.LLILZIL == null) {
            C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, this.LLJ, C0KAJ.AUTO_TERMINATE, null, null, 112);
            return;
        }
        if (!UserService.getInstance().user().isLogin()) {
            C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, this.LLJ, C0KAJ.AUTO_TERMINATE, null, null, 112);
            return;
        }
        Room room = this.LLILZ;
        if (room != null && (owner = room.getOwner()) != null && owner.isFollowing()) {
            C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, this.LLJ, C0KAJ.AUTO_TERMINATE, null, null, 112);
            return;
        }
        if (this.LLIZ) {
            N1();
        } else {
            C519290KYd c519290KYd = this.LLILZLL;
            if (c519290KYd != null) {
                str = c519290KYd.LIZ;
            } else {
                str = null;
            }
            O1(str);
        }
        show();
        U1();
        R1(z);
        this.LLIZ = false;
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
        Long lValueOf;
        CommonMessageData commonMessageData;
        cancelShowAnimation();
        cancelHideAnimation();
        this.LLILLL.removeCallbacksAndMessages(null);
        this.LLILLJJLI.LJ();
        GuideMessage guideMessage = this.LLILZIL;
        if (guideMessage != null && (commonMessageData = guideMessage.baseMessage) != null) {
            commonMessageData.describe = "change_orientation";
        }
        if (guideMessage != null && guideMessage.duration > 2000 && !(this instanceof FollowGuideDialogWidget)) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = this.LLILZ;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            dataChannelGlobal.HQ2(GuideMessageChannel.class, new Pair(guideMessage, lValueOf));
        } else {
            DataChannelGlobal.LLILZ.HQ2(GuideMessageChannel.class, new Pair(null, 0L));
        }
        this.LLILZIL = null;
        this.LLJI = false;
    }

    public void I1(boolean z, EnumC512800K9e enumC512800K9e) {
        z1(enumC512800K9e, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L1(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "livesdk_follow_popup_avoid"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "follow_guide_style"
            java.lang.String r0 = "live_follow_popup"
            r2.LJJII(r0, r1)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            r3 = 0
            if (r0 == 0) goto L6c
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            if (r0 == 0) goto L6c
            java.lang.String r1 = r0.logId
        L18:
            java.lang.String r0 = "notification_request_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L6a
            java.lang.String r1 = r0.scene
        L23:
            java.lang.String r0 = "notification_type"
            r2.LJJII(r1, r0)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L67
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L38
            long r0 = r0.displayStyle
        L34:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L38:
            java.lang.String r0 = "style"
            r2.LJJII(r3, r0)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L64
            java.lang.String r1 = "portrait"
        L45:
            java.lang.String r0 = "room_orientation"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "avoid_reason"
            r2.LJJII(r5, r0)
            if (r6 == 0) goto L61
            java.lang.String r1 = "1"
        L53:
            java.lang.String r0 = "is_first_show"
            r2.LJJII(r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            r2.LJIJJLI(r0)
            r2.LIZ()
            return
        L61:
            java.lang.String r1 = "0"
            goto L53
        L64:
            java.lang.String r1 = "landscape"
            goto L45
        L67:
            r0 = 2
            goto L34
        L6a:
            r1 = r3
            goto L23
        L6c:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget.L1(java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "livesdk_follow_popup_exit"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "follow_guide_style"
            java.lang.String r0 = "live_follow_popup"
            r2.LJJII(r0, r1)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            r3 = 0
            if (r0 == 0) goto L65
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            if (r0 == 0) goto L65
            java.lang.String r1 = r0.logId
        L18:
            java.lang.String r0 = "notification_request_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L63
            java.lang.String r1 = r0.scene
        L23:
            java.lang.String r0 = "notification_type"
            r2.LJJII(r1, r0)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L60
            com.bytedance.android.livesdk.model.message.GuideMessage r0 = r4.LLILZIL
            if (r0 == 0) goto L38
            long r0 = r0.displayStyle
        L34:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L38:
            java.lang.String r0 = "style"
            r2.LJJII(r3, r0)
            boolean r0 = X.C497740JfY.LJIL()
            if (r0 == 0) goto L5d
            java.lang.String r1 = "portrait"
        L45:
            java.lang.String r0 = "room_orientation"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "exit_method"
            r2.LJJII(r5, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r4.dataChannel
            r2.LJIJJLI(r0)
            if (r6 == 0) goto L59
            r2.LJJIIZI(r6)
        L59:
            r2.LIZ()
            return
        L5d:
            java.lang.String r1 = "landscape"
            goto L45
        L60:
            r0 = 2
            goto L34
        L63:
            r1 = r3
            goto L23
        L65:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideAbsWidget.M1(java.lang.String, java.util.Map):void");
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Room room;
        long ownerUserId;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZ = room;
        S1();
        C11NJ c11nj = this.LLILLJJLI;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        Room room2 = this.LLILZ;
        if (room2 != null) {
            ownerUserId = room2.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c11nj.LIZ(interfaceC500940JkiUser.LIZIZ(ownerUserId).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 53), new C09JN() { // from class: X.0KYc
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FollowGuideAbsWidget@5608.onLoad$2");
                C1C7U.LIZIZ("FollowGuideAbsWidget@5608.onLoad$2");
            }
        }));
    }

    @Override // com.bytedance.android.livesdk.notify.AnimatableNotifyWidget
    public void z1(EnumC512800K9e enumC512800K9e, boolean z) {
        if (!isShowing()) {
            return;
        }
        B1(enumC512800K9e);
        V1();
        if (z) {
            A1(enumC512800K9e);
            return;
        }
        cancelShowAnimation();
        cancelHideAnimation();
        x1(enumC512800K9e);
    }
}

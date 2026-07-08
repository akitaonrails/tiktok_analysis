package com.bytedance.android.livesdk.hashtag;

import X.C0UO0;
import X.C11JF;
import X.C19490011Na;
import X.C20441214yg;
import X.C5183020f;
import X.C754700Tj2;
import Y.AfS181S0100000_12;
import Y.AfS4S0100100_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.room.MicRoomDisableInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastGameTagHasChangeChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNewFeaturedAnchorAnimTimeSettings;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS586S0100000_7;
import org.json.JSONException;

/* JADX INFO: loaded from: classes13.dex */
public final class BroadcastHashTagWidget extends BaseHashTagWidget {
    public GameTag LLIZLLLIL;
    public Hashtag LLJ;
    public C11JF LLJI;

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void E1() {
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void F1() {
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final boolean z1() {
        return true;
    }

    public final void J1() {
        C20441214yg.LIZIZ("featured-tag", "disposeProgressTask");
        C11JF c11jf = this.LLJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJI = null;
    }

    public final void M1() {
        if (this.LLJI != null) {
            return;
        }
        C20441214yg.LIZIZ("featured-tag", "startCountdown");
        long time = MultiGuestNewFeaturedAnchorAnimTimeSettings.INSTANCE.getTime();
        this.LLJI = (C11JF) C19490011Na.LIZLLL(1L, time, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS4S0100100_12(time, this, 9), new AfS181S0100000_12(this, 108));
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        super.onUnload();
        J1();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void C1() throws JSONException {
        B1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0175, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r7.LIZIZ()) == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(androidx.fragment.app.FragmentManager r12) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget.D1(androidx.fragment.app.FragmentManager):void");
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void G1(Hashtag hashtag) {
        C754700Tj2.LJ(hashtag);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L1(int r4) {
        /*
            r3 = this;
            java.lang.String r0 = "livesdk_native_gaming_toast_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.LJJII(r0, r1)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L68
            long r0 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L38:
            java.lang.String r0 = "room_id"
            r2.LJJII(r1, r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r0
            if (r0 == 0) goto L65
            int[] r1 = X.C200500pv.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L62
            r0 = 2
            if (r1 != r0) goto L65
            java.lang.String r1 = "mobile_gaming"
        L59:
            java.lang.String r0 = "live_room_mode"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L62:
            java.lang.String r1 = "obs"
            goto L59
        L65:
            java.lang.String r1 = ""
            goto L59
        L68:
            r1 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget.L1(int):void");
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.DQ2(MicRoomDisableInteractionEvent.class, this, new AwS586S0100000_7(this, 106));
        dataChannel.EQ2(this, BroadcastGameTagHasChangeChannel.class, new C5183020f(this, 120));
        M1();
    }
}

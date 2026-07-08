package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C098200Yq;
import X.C0IJT;
import X.C0UM6;
import X.C0UYZ;
import X.C1143680frq;
import X.C1161920gLG;
import X.C11S5;
import X.C1295960jpS;
import X.C1324720kZq;
import X.C1336240ksQ;
import X.C158B;
import X.C189200o6;
import X.C354201Zc;
import X.C418440Gaw;
import X.C474500IjA;
import X.C480460Ism;
import X.C500260Jjc;
import X.C760180Trs;
import X.C786410Ut5;
import X.C814420VxA;
import X.C930940aKi;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.model.ActivitiesIconInfo;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.broadcast.setting.LiveCampaignSchemaSetting;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.room.EventTrackingMeta;
import webcast.api.room.EventTrackingReportReqMessage;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewCampaignWidget extends PreviewToolBaseWidget {
    public ActivitiesIconInfo LLIZLLLIL;
    public boolean LLJ;
    public C1336240ksQ LLJI;
    public C1295960jpS LLJIJIL;
    public C1324720kZq LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public Uri.Builder LLJJIJIIJIL;
    public final int LLILZLL = 2131840908;
    public final int LLIZ = R.drawable.ekk;
    public final BPEAHandler LLJJIJI = new BPEAHandler(Looper.getMainLooper());

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1e;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final Integer J1() {
        return Integer.valueOf(this.LLIZ);
    }

    public final String W1() {
        String str;
        String string;
        LiveMode streamType;
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = UriProtector.parse(LiveCampaignSchemaSetting.INSTANCE.getValue()).buildUpon().appendQueryParameter("enter_from", "live_take_page_campaign_center").appendQueryParameter("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId())).appendQueryParameter("campaign_traffic_id", "cptraffic010005cp2846395827631948653");
        }
        Uri.Builder builder = this.LLJJIJIIJIL;
        if (builder != null) {
            ActivitiesIconInfo activitiesIconInfo = this.LLIZLLLIL;
            if (activitiesIconInfo == null || (str = activitiesIconInfo.activityId) == null) {
                str = "";
            }
            builder.appendQueryParameter("from_activity_id", str);
            builder.appendQueryParameter("has_campaign_icon", this.LLIZLLLIL != null ? "1" : CardStruct.IStatusCode.DEFAULT);
            builder.appendQueryParameter("enable_code_cache", SecondPageCodeCacheABSetting.INSTANCE.isMatch() ? "1" : CardStruct.IStatusCode.DEFAULT);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            builder.appendQueryParameter("live_type", (room == null || (streamType = room.getStreamType()) == null) ? null : C354201Zc.LIZ(streamType));
            Uri uriBuild = builder.build();
            if (uriBuild != null && (string = uriBuild.toString()) != null) {
                return string;
            }
        }
        return "";
    }

    public final boolean X1() {
        ActivitiesIconInfo activitiesIconInfo = this.LLIZLLLIL;
        if (Intrinsics.LJFF(activitiesIconInfo != null ? activitiesIconInfo.activityId : null, "24_fest")) {
            return true;
        }
        ActivitiesIconInfo activitiesIconInfo2 = this.LLIZLLLIL;
        return C500260Jjc.LJJJI(activitiesIconInfo2 != null ? Boolean.valueOf(activitiesIconInfo2.isLiveFest) : null);
    }

    public final void a2() {
        C1324720kZq c1324720kZq = this.LLJILJIL;
        if (c1324720kZq != null) {
            c1324720kZq.setImageResource(R.drawable.ekk);
        }
        if (C760180Trs.LJFF()) {
            View view = getView();
            (view != null ? view.findViewById(R.id.widget_icon) : null).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            View view2 = getView();
            C1143680frq.LJ(view2 != null ? view2.findViewById(R.id.widget_icon) : null, "tiktok_live_broadcast_demand_8", "open_live_icon_live_active_new.png", ImageView.ScaleType.CENTER_CROP);
        }
        C1324720kZq c1324720kZq2 = this.LLJILJIL;
        if (c1324720kZq2 != null) {
            C786410Ut5.Yb(c1324720kZq2, 1.0f);
        }
        C1324720kZq c1324720kZq3 = this.LLJILJIL;
        if (c1324720kZq3 != null) {
            C786410Ut5.xc(c1324720kZq3, 1.0f);
        }
        this.LLIZLLLIL = null;
        b2(this, false, 0L, 7);
    }

    public final void c2() {
        String str;
        String str2;
        ActivitiesIconInfo activitiesIconInfo;
        EventTrackingReportReqMessage eventTrackingReportReqMessage = new EventTrackingReportReqMessage();
        List<EventTrackingMeta> list = eventTrackingReportReqMessage.metaList;
        EventTrackingMeta eventTrackingMeta = new EventTrackingMeta();
        eventTrackingMeta.type = X1() ? 6 : 4;
        if (!X1() || (activitiesIconInfo = this.LLIZLLLIL) == null || (str = activitiesIconInfo.currenPhase) == null) {
            str = "1";
        }
        eventTrackingMeta.objectId = str;
        eventTrackingMeta.timestamp = C158B.LIZJ();
        list.add(eventTrackingMeta);
        List<EventTrackingMeta> list2 = eventTrackingReportReqMessage.metaList;
        EventTrackingMeta eventTrackingMeta2 = new EventTrackingMeta();
        eventTrackingMeta2.type = 3;
        ActivitiesIconInfo activitiesIconInfo2 = this.LLIZLLLIL;
        if (activitiesIconInfo2 == null || (str2 = activitiesIconInfo2.activityId) == null) {
            str2 = "";
        }
        eventTrackingMeta2.objectId = str2;
        eventTrackingMeta2.timestamp = C158B.LIZJ();
        list2.add(eventTrackingMeta2);
        if (LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
            C0UYZ.LIZ(eventTrackingReportReqMessage);
        } else {
            C480460Ism.LIZ().getClass();
            ((BroadcastRoomApi) C480460Ism.LIZLLL(BroadcastRoomApi.class)).reportCampaignEvent(eventTrackingReportReqMessage).LJL(C11S5.LIZ()).LJJLJ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C760180Trs.LJIIJJI(this.dataChannel, "activities");
        String str = this.LLJILJILJ;
        String str2 = this.LLJILLL;
        if (str != null && str2 != null) {
            try {
                C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
                c474500IjALIZ.LJJIIJZLJL(new JSONObject(str2));
                c474500IjALIZ.LIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LLJILJILJ = null;
            this.LLJILLL = null;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("live_center_campaign_show");
        c474500IjALIZ2.LJIJJLI(this.dataChannel);
        c474500IjALIZ2.LJJII(Integer.valueOf(this.LLJJ ? 2 : 0), "prompt_icon");
        c474500IjALIZ2.LJJII("live_take_page_campaign_center", "enter_from");
        c474500IjALIZ2.LJJII(1, "prompt_api_return");
        c474500IjALIZ2.LJJII(W1(), "next_page_url");
        c474500IjALIZ2.LIZ();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLJIJIL = (C1295960jpS) findViewById(R.id.widget_animation);
        this.LLJILJIL = (C1324720kZq) findViewById(R.id.widget_icon);
        if (C760180Trs.LJFF()) {
            View view = getView();
            (view != null ? view.findViewById(R.id.widget_icon) : null).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            View view2 = getView();
            C1143680frq.LJ(view2 != null ? view2.findViewById(R.id.widget_icon) : null, "tiktok_live_broadcast_demand_8", "open_live_icon_live_active_new.png", ImageView.ScaleType.CENTER_CROP);
        }
        C500260Jjc.LLFFF(this.LLJILJIL);
        C500260Jjc.LJIILLIIL(this.LLJIJIL);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 258));
            dataChannel.EQ2(this, PreviewMoreLessVisibilityChannel.class, new AwS591S0100000_12(this, 259));
        }
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJIJI.removeCallbacksAndMessages(null);
        if (this.LLIZLLLIL != null) {
            c2();
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        int i;
        int i2;
        String str;
        String str2;
        int i3;
        ActivitiesIconInfo activitiesIconInfo;
        String str3;
        ActivitiesIconInfo activitiesIconInfo2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        String strW1 = W1();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_campaign_center_enter");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("live_take_page_campaign_center", "enter_from");
        if (this.LLJJ) {
            i = 2;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "prompt_icon");
        c474500IjALIZ.LJJII(1, "prompt_api_return");
        c474500IjALIZ.LJJII(strW1, "next_page_url");
        c474500IjALIZ.LIZ();
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(view.getContext(), strW1);
        this.LLJJIJI.removeCallbacksAndMessages(null);
        C1324720kZq c1324720kZq = this.LLJILJIL;
        if (c1324720kZq != null && (viewPropertyAnimatorAnimate2 = c1324720kZq.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        C1295960jpS c1295960jpS = this.LLJIJIL;
        if (c1295960jpS != null && (viewPropertyAnimatorAnimate = c1295960jpS.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        C1324720kZq c1324720kZq2 = this.LLJILJIL;
        if (c1324720kZq2 != null) {
            C786410Ut5.Yb(c1324720kZq2, 1.0f);
        }
        C1324720kZq c1324720kZq3 = this.LLJILJIL;
        if (c1324720kZq3 != null) {
            C786410Ut5.xc(c1324720kZq3, 1.0f);
        }
        C500260Jjc.LJIILLIIL(this.LLJIJIL);
        C500260Jjc.LLFFF(this.LLJILJIL);
        this.LLJJ = false;
        if (this.LLIZLLLIL != null) {
            EventTrackingReportReqMessage eventTrackingReportReqMessage = new EventTrackingReportReqMessage();
            List<EventTrackingMeta> list = eventTrackingReportReqMessage.metaList;
            EventTrackingMeta eventTrackingMeta = new EventTrackingMeta();
            if (X1()) {
                i2 = 6;
            } else {
                i2 = 4;
            }
            eventTrackingMeta.type = i2;
            String str4 = "1";
            if (!X1() || (activitiesIconInfo2 = this.LLIZLLLIL) == null || (str = activitiesIconInfo2.currenPhase) == null) {
                str = "1";
            }
            eventTrackingMeta.objectId = str;
            eventTrackingMeta.timestamp = C158B.LIZJ();
            list.add(eventTrackingMeta);
            List<EventTrackingMeta> list2 = eventTrackingReportReqMessage.metaList;
            EventTrackingMeta eventTrackingMeta2 = new EventTrackingMeta();
            eventTrackingMeta2.type = 3;
            ActivitiesIconInfo activitiesIconInfo3 = this.LLIZLLLIL;
            if (activitiesIconInfo3 == null || (str2 = activitiesIconInfo3.activityId) == null) {
                str2 = "";
            }
            eventTrackingMeta2.objectId = str2;
            eventTrackingMeta2.timestamp = C158B.LIZJ();
            list2.add(eventTrackingMeta2);
            List<EventTrackingMeta> list3 = eventTrackingReportReqMessage.metaList;
            EventTrackingMeta eventTrackingMeta3 = new EventTrackingMeta();
            if (X1()) {
                i3 = 7;
            } else {
                i3 = 5;
            }
            eventTrackingMeta3.type = i3;
            if (X1() && (activitiesIconInfo = this.LLIZLLLIL) != null && (str3 = activitiesIconInfo.currenPhase) != null) {
                str4 = str3;
            }
            eventTrackingMeta3.objectId = str4;
            eventTrackingMeta3.timestamp = C158B.LIZJ();
            list3.add(eventTrackingMeta3);
            if (LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
                C0UYZ.LIZ(eventTrackingReportReqMessage);
            } else {
                C480460Ism.LIZ().getClass();
                ((BroadcastRoomApi) C480460Ism.LIZLLL(BroadcastRoomApi.class)).reportCampaignEvent(eventTrackingReportReqMessage).LJL(C11S5.LIZ()).LJJLJ();
            }
            C1336240ksQ c1336240ksQ = this.LLJI;
            if (c1336240ksQ != null) {
                c1336240ksQ.LIZ();
            }
            C1324720kZq c1324720kZq4 = this.LLJILJIL;
            if (c1324720kZq4 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate3 = c1324720kZq4.animate();
                if (viewPropertyAnimatorAnimate3 != null) {
                    viewPropertyAnimatorAnimate3.cancel();
                }
                C786410Ut5.Yb(c1324720kZq4, 1.0f);
                C786410Ut5.Yb(c1324720kZq4, 1.0f);
            }
            a2();
        }
    }

    public final void Y1(String str, boolean z) {
        String str2;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_campaign_icon_release");
        c474500IjALIZ.LJIIIIZZ();
        ActivitiesIconInfo activitiesIconInfo = this.LLIZLLLIL;
        if (activitiesIconInfo == null || (str2 = activitiesIconInfo.activityId) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "activity_id");
        if (z) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        c474500IjALIZ.LJJII(str3, "show_status");
        if (!z) {
            c474500IjALIZ.LJJII(str, "fail_reason");
        }
        c474500IjALIZ.LIZ();
    }

    public static void b2(PreviewCampaignWidget previewCampaignWidget, boolean z, long j, int i) {
        long j2 = j;
        boolean z2 = z;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            j2 = 0;
        }
        if (previewCampaignWidget.LLJJ) {
            C1143680frq.LJIILL(previewCampaignWidget.LLJIJIL, "tiktok_live_broadcast_demand_7", "ttlive_broadcast_campaign_icon.zip", false, new C0UM6(previewCampaignWidget, false, j2, z2));
        }
    }
}

package com.bytedance.android.livesdk.impl.revenue.crm.widget;

import X.C001A;
import X.C01BA;
import X.C1161920gLG;
import X.C1548820qPI;
import X.C19748512Ol;
import X.C262000zq;
import X.C497740JfY;
import X.C515301zb;
import X.C5183020f;
import X.C776250Uch;
import X.C786410Ut5;
import X.C963140bAe;
import X.InterfaceC1541990qEH;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.api.revenue.crm.CRMGoalChannel;
import com.bytedance.android.livesdk.api.revenue.crm.CRMUseLynxWidget;
import com.bytedance.android.livesdk.api.revenue.crm.CRMUseLynxWidgetLazyLoad;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class CRMGoalWidgetV2 extends LiveWidget implements OnIMMessageListener {
    public boolean LL;
    public InterfaceC1541990qEH LLILLJJLI;
    public long LLILLL;
    public final C515301zb LLILZ = new C515301zb(this, 8);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hy3;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "CRMGoalWidgetV2";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void x1() {
        ViewGroup viewGroup;
        this.LL = true;
        InterfaceC1541990qEH interfaceC1541990qEHNN = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).NN(this.context, "aweme://roma_redirect/?spark_page=companion_tool_tip", this, true, new C5183020f(this, 122));
        this.LLILLJJLI = interfaceC1541990qEHNN;
        View view = this.contentView;
        if (!(view instanceof FrameLayout) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        View viewE1 = interfaceC1541990qEHNN != null ? interfaceC1541990qEHNN.e1() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(16.0f);
        viewGroup.addView(viewE1, marginLayoutParams);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        FrameLayout frameLayout;
        this.LLILLL = 0L;
        C01BA.LIZ = "";
        this.LLILLJJLI = null;
        View view = this.contentView;
        if ((view instanceof FrameLayout) && (frameLayout = (FrameLayout) view) != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        C1548820qPI.LJIIIIZZ("creator_succ_hub_goal_update", this.LLILZ);
        C1548820qPI.LJIIIIZZ("CHOOSE_MAIN_FOCUS", this.LLILZ);
        C1548820qPI.LJIIIIZZ("force_close_extended_screen", this.LLILZ);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        this.LLILLL = ((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? C963140bAe.LIZJ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) : room.getCreateTime()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (CRMUseLynxWidget.INSTANCE.getValue() == 1 && !CRMUseLynxWidgetLazyLoad.INSTANCE.needLazy()) {
            show();
            x1();
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.INTERACTION_HUB_GOAL_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
        this.dataChannel.BQ2(this, LiveExtendedScreenStatus.class, new C5183020f(this, 123));
        C1548820qPI.LIZLLL("creator_succ_hub_goal_update", this.LLILZ);
        C1548820qPI.LIZLLL("CHOOSE_MAIN_FOCUS", this.LLILZ);
        C1548820qPI.LIZLLL("force_close_extended_screen", this.LLILZ);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof InteractionHubGoalMessage) {
            InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLJJLI;
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.LIZ("receive_creator_succ_hub_goal", new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, iMessage)));
            }
            InteractionHubGoalMessage interactionHubGoalMessage = (InteractionHubGoalMessage) iMessage;
            y1(new C262000zq(interactionHubGoalMessage.interactionGoal, interactionHubGoalMessage.interactionTips, interactionHubGoalMessage.newGiftInfo, interactionHubGoalMessage.taskProgress, interactionHubGoalMessage.interactionGoalType));
        }
    }

    public final void y1(C262000zq c262000zq) {
        String str;
        Text text = c262000zq.LIZ;
        if (text == null || (str = text.key) == null) {
            str = "";
        }
        C01BA.LIZ = str;
        this.dataChannel.zW(CRMGoalChannel.class, Integer.valueOf(c262000zq.LIZIZ));
    }
}

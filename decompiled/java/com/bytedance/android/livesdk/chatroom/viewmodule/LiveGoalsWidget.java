package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.AnonymousClass0956;
import X.C0IFW;
import X.C0PEM;
import X.C1091250eVH;
import X.C1098020egC;
import X.C1098060egG;
import X.C1098150egP;
import X.C11NJ;
import X.C20441214yg;
import X.C2097608Jq;
import X.C23250099c;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1098110egL;
import X.InterfaceC1098120egM;
import X.InterfaceC1541990qEH;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC501410JlT;
import X.InterfaceC753440Th0;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.performance.widget.PerformProcessSourceWidget;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalServerMessage;
import com.bytedance.android.livesdk.model.message.GameGuessWidgetsMessage;
import com.bytedance.android.livesdk.model.message.SubWaveMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGoalsWidget extends PerformProcessSourceWidget implements OnIMMessageListener, C0IFW {
    public ViewGroup LL;
    public C1091250eVH LLILLJJLI;
    public InterfaceC1541990qEH LLILLL;
    public final C11NJ LLILZ = new C11NJ();
    public Room LLILZIL;
    public InterfaceC1098120egM LLILZLL;
    public InterfaceC1098110egL LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC753440Th0 LLJI;
    public InterfaceC501410JlT LLJIJIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i04;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "LiveGoalsWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessSourceWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0IFW
    public final void pause() {
    }

    @Override // X.C0IFW
    public final void resume() {
    }

    @Override // X.C0IFW
    public final void W() {
        C20441214yg.LJIIIZ("matao-test", "LiveGoal cancel");
        cancel();
    }

    @Override // X.C0IFW
    public final void cancel() {
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass09562 = this.LLIZLLLIL;
        if (anonymousClass09562 == null || anonymousClass09562.isCompleted() || (anonymousClass0956 = this.LLIZLLLIL) == null) {
            return;
        }
        anonymousClass0956.LIZIZ(null);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() throws JSONException {
        super.onPause();
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LIZ("container_disappear", new JSONObject());
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLILLL;
        if (interfaceC1541990qEH2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", false));
            interfaceC1541990qEH2.LIZ("H5_appStateChange", jSONObject);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() throws JSONException {
        super.onResume();
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LIZ("container_appear", new JSONObject());
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLILLL;
        if (interfaceC1541990qEH2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", true));
            interfaceC1541990qEH2.LIZ("H5_appStateChange", jSONObject);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if ((!(iMessage instanceof LiveStreamGoalServerMessage) && !(iMessage instanceof SubWaveMessage) && !(iMessage instanceof GameGuessWidgetsMessage)) || this.LLILLL != null || this.LLIZLLLIL != null) {
            return;
        }
        y1(false);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessSourceWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) throws JSONException {
        boolean z;
        String string;
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass09562 = this.LLIZLLLIL;
        if (anonymousClass09562 != null && !anonymousClass09562.isCompleted()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (anonymousClass0956 = this.LLIZLLLIL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZLLLIL = null;
        IMessageManager iMessageManagerLJJJJLL = C500260Jjc.LJJJJLL(this.dataChannel);
        if (iMessageManagerLJJJJLL != null) {
            iMessageManagerLJJJJLL.removeMessageListener((OnIMMessageListener) this);
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        if (interfaceC1541990qEH != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "unmount");
            Room room = this.LLILZIL;
            if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("roomId", string);
            interfaceC1541990qEH.LIZ("goal_indicator_load_status_change", jSONObject);
        }
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLILLL;
        if (interfaceC1541990qEH2 != null) {
            interfaceC1541990qEH2.LLD(true);
        }
        this.LLILLL = null;
        this.LLILZ.LJ();
        C1098060egG.LIZIZ = null;
        InterfaceC1098120egM interfaceC1098120egM = this.LLILZLL;
        if (interfaceC1098120egM != null) {
            interfaceC1098120egM.onUnload();
        }
        InterfaceC1098110egL interfaceC1098110egL = this.LLIZ;
        if (interfaceC1098110egL != null) {
            interfaceC1098110egL.onUnload();
        }
        if (recycleSource == RecycleSource.FROM_CONFIG_CHANGE) {
            InterfaceC753440Th0 interfaceC753440Th0 = this.LLJI;
            if (interfaceC753440Th0 != null) {
                interfaceC753440Th0.LJJIII();
            }
        } else {
            InterfaceC753440Th0 interfaceC753440Th02 = this.LLJI;
            if (interfaceC753440Th02 != null) {
                interfaceC753440Th02.onUnload();
            }
            this.LLJI = null;
        }
        InterfaceC501410JlT interfaceC501410JlT = this.LLJIJIL;
        if (interfaceC501410JlT != null) {
            interfaceC501410JlT.LJJ(recycleSource);
        }
        this.LLJIJIL = null;
        this.LLILZIL = null;
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    public final void y1(boolean z) {
        C1098020egC c1098020egCLIZIZ = C1098060egG.LIZIZ();
        if (z) {
            c1098020egCLIZIZ.LIZ("init_api", "create_from");
        } else {
            c1098020egCLIZIZ.LIZ("message", "create_from");
        }
        c1098020egCLIZIZ.LIZ(Integer.valueOf(C500260Jjc.LJJJI(Boolean.FALSE) ? 1 : 0), "is_new_indicator");
        this.LLIZLLLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1098150egP(this, z, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01dc  */
    @Override // com.bytedance.android.live.performance.widget.PerformProcessSourceWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(com.bytedance.ies.sdk.widgets.RecycleSource r7, java.lang.Object[] r8) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LiveGoalsWidget.onLoad(com.bytedance.ies.sdk.widgets.RecycleSource, java.lang.Object[]):void");
    }

    public final HashMap<String, Object> x1(String str, String str2) {
        Boolean boolValueOf;
        String str3;
        InterfaceC2262081DgM currentUser;
        long id;
        String string;
        User user;
        DataChannel dataChannel = this.dataChannel;
        String string2 = null;
        if (dataChannel != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUser = interfaceC500940JkiUser.getCurrentUser();
        } else {
            currentUser = null;
        }
        if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("is_anchor", str3);
        pairArr[1] = new Pair("container_id", str);
        pairArr[2] = new Pair("url", str2);
        Room room = this.LLILZIL;
        if (room != null) {
            string = Long.valueOf(room.getId()).toString();
        } else {
            string = null;
        }
        pairArr[3] = new Pair("room_id", string);
        Room room2 = this.LLILZIL;
        if (room2 != null) {
            string2 = Long.valueOf(room2.getOwnerUserId()).toString();
        }
        pairArr[4] = new Pair("anchor_id", string2);
        pairArr[5] = new Pair("current_user_id", Long.valueOf(id));
        return C2097608Jq.LJI(pairArr);
    }
}

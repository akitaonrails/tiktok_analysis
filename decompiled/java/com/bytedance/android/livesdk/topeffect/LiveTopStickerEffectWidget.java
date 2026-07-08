package com.bytedance.android.livesdk.topeffect;

import X.C0IJT;
import X.C1161920gLG;
import X.C13LP;
import X.C474500IjA;
import X.C500260Jjc;
import X.EnumC1087550ePJ;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.TopEffectEvent;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveTopStickerEffectWidget extends LiveWidget implements WeakHandler.IHandler {
    public final WeakHandler LL = new WeakHandler(Looper.getMainLooper(), this);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        if (this.LL.hasMessages(1001)) {
            this.LL.removeMessages(1001);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.dataChannel.BQ2(this, TopEffectEvent.class, new AwS591S0100000_12(this, 580));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        LiveEffect liveEffect;
        if (message.what == 1001) {
            String string = message.getData().getString("panel_name");
            if (string != null && (liveEffect = (LiveEffect) C13LP.LJJJLL(((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).composerManagerB().qr(string))) != null) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).composerManagerB().LJIIJ(liveEffect, string);
            }
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
        }
    }

    public final void x1(PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage) {
        Long lValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_privilege_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        String str5 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "to_user_id");
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LJJII("top_animation", "privilege_type");
        c474500IjALIZ.LJJII("room_top", "show_place");
        c474500IjALIZ.LJJII("top_animation", "privilege_scenario");
        PrivilegeLogExtra privilegeLogExtra = privilegeDynamicEffectMessage.privilegeLogExtra;
        if (privilegeLogExtra != null) {
            str2 = privilegeLogExtra.privilege_id;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "privilege_id");
        PrivilegeLogExtra privilegeLogExtra2 = privilegeDynamicEffectMessage.privilegeLogExtra;
        if (privilegeLogExtra2 != null) {
            str3 = privilegeLogExtra2.privilege_order_id;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "privilege_order_id");
        PrivilegeLogExtra privilegeLogExtra3 = privilegeDynamicEffectMessage.privilegeLogExtra;
        if (privilegeLogExtra3 != null) {
            str4 = privilegeLogExtra3.privilege_version;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "privilege_version_id");
        PrivilegeLogExtra privilegeLogExtra4 = privilegeDynamicEffectMessage.privilegeLogExtra;
        if (privilegeLogExtra4 != null) {
            str5 = privilegeLogExtra4.data_version;
        }
        c474500IjALIZ.LJJII(str5, "data_version_id");
        c474500IjALIZ.LIZ();
    }
}

package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C0XPD;
import X.C0XQ7;
import X.C1051660dTQ;
import X.C1336205Ku;
import X.InterfaceC1019840ce6;
import X.InterfaceC849390XTt;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LaunchChatMethod extends BaseBridgeMethod {
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public LaunchChatMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "launchChat";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, final InterfaceC1019840ce6 interfaceC1019840ce6) {
        String str;
        final int i;
        final Context context = (Context) this.contextProviderFactory.LIZIZ(Context.class);
        final IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        iMUser.setSignature(jSONObject.optString("alias"));
        iMUser.setFake(true);
        boolean zOptBoolean = jSONObject.optBoolean("is_author_service");
        if (zOptBoolean) {
            str = "message";
        } else {
            str = "";
        }
        if (zOptBoolean) {
            i = 12;
        } else {
            i = 0;
        }
        if (!C0XQ7.LJFF().isLogin()) {
            if (context != null && (context instanceof Activity)) {
                C0XPD.LIZIZ((Activity) context, str, "click_chat_button", null, new InterfaceC849390XTt() { // from class: X.0dnT
                    @Override // X.InterfaceC849390XTt
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        if (this.LIZ.jump2Chat(context, iMUser, i)) {
                            interfaceC1019840ce6.onSuccess(1);
                        } else {
                            interfaceC1019840ce6.LIZ(0, "open chat fail");
                        }
                    }
                });
                return;
            }
            return;
        }
        if (jump2Chat(context, iMUser, i)) {
            interfaceC1019840ce6.onSuccess(1);
        } else {
            interfaceC1019840ce6.LIZ(0, "open chat fail");
        }
    }

    public final boolean jump2Chat(Context context, IMUser iMUser, int i) {
        if (context == null) {
            return false;
        }
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        EnterChatParams enterChatParams = new EnterChatParams(context, iMUser);
        enterChatParams.setEnterFrom(i);
        imChatService.LJIILLIIL(enterChatParams, null);
        return true;
    }
}

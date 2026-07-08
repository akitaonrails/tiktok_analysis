package com.ss.android.ugc.aweme.fe.method;

import X.C0XPD;
import X.C0XQ7;
import X.C1336205Ku;
import X.InterfaceC1041760dDS;
import X.InterfaceC849390XTt;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.LaunchChatMethod;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LaunchChatMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, final InterfaceC1041760dDS interfaceC1041760dDS) {
        String str;
        final int i;
        if (jSONObject == null) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, "no params found");
                return;
            }
            return;
        }
        final IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        iMUser.setSignature(jSONObject.optString("alias"));
        iMUser.setFake(true);
        if (jSONObject.optBoolean("is_author_service")) {
            str = "message";
            i = 12;
        } else {
            str = "";
            i = 0;
        }
        if (!C0XQ7.LJFF().isLogin()) {
            Context actContext = getActContext();
            if (actContext != null && (actContext instanceof Activity)) {
                C0XPD.LIZIZ((Activity) actContext, str, "click_chat_button", null, new InterfaceC849390XTt() { // from class: X.0dnS
                    @Override // X.InterfaceC849390XTt
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        LaunchChatMethod launchChatMethod = this.LIZ;
                        if (launchChatMethod.LIZ(launchChatMethod.getActContext(), iMUser, i)) {
                            InterfaceC1041760dDS interfaceC1041760dDS2 = interfaceC1041760dDS;
                            if (interfaceC1041760dDS2 != null) {
                                interfaceC1041760dDS2.onSuccess(1);
                                return;
                            }
                            return;
                        }
                        InterfaceC1041760dDS interfaceC1041760dDS3 = interfaceC1041760dDS;
                        if (interfaceC1041760dDS3 != null) {
                            interfaceC1041760dDS3.LIZ(0, "open chat fail");
                        }
                    }
                });
                return;
            }
            return;
        }
        if (LIZ(getActContext(), iMUser, i)) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.onSuccess(1);
            }
        } else {
            if (interfaceC1041760dDS == null) {
                return;
            }
            interfaceC1041760dDS.LIZ(0, "open chat fail");
        }
    }

    public final boolean LIZ(Context context, IMUser iMUser, int i) {
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

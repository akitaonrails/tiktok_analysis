package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XPD;
import X.C0XQ7;
import X.C1051660dTQ;
import X.C1064010dnL;
import X.C1336205Ku;
import X.C452501pT;
import X.C663340Q0e;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051470dT7;
import X.InterfaceC849390XTt;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchLaunchChatMethod extends BaseBridgeMethod {
    public final C663340Q0e helper;
    public final C01GW mContextProvider$delegate;
    public final String name;
    public static final C1064010dnL Companion = new Object() { // from class: X.0dnL
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final InterfaceC1051470dT7<Context> getMContextProvider() {
        return (InterfaceC1051470dT7) this.mContextProvider$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public SearchLaunchChatMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.mContextProvider$delegate = C452501pT.LIZIZ(new AwS560S0100000_16(c1051660dTQ, 571));
        this.name = "searchLaunchChat";
        this.helper = new C663340Q0e(c1051660dTQ, getName());
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, final InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context contextLIZ;
        if (this.helper.LIZ(interfaceC1019840ce6)) {
            return;
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        InterfaceC1051470dT7<Context> mContextProvider = getMContextProvider();
        if (mContextProvider != null) {
            contextLIZ = mContextProvider.LIZ();
        } else {
            contextLIZ = null;
        }
        sAFHelper.getClass();
        final Context contextLJ = SAFHelper.LJ(contextLIZ);
        if (contextLJ == null) {
            interfaceC1019840ce6.LIZ(0, "no params found");
            return;
        }
        final IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        final String strOptString = jSONObject.optString("enter_from", "search");
        final String strOptString2 = jSONObject.optString("enter_method", "button");
        iMUser.setFake(true);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (contextLJ instanceof Activity) {
                C0XPD.LIZIZ((Activity) contextLJ, strOptString, strOptString2, null, new InterfaceC849390XTt() { // from class: X.0dnK
                    @Override // X.InterfaceC849390XTt
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.InterfaceC849390XTt
                    public final void LIZ() {
                        if (this.LIZ.jump2Chat(contextLJ, iMUser, strOptString, strOptString2)) {
                            interfaceC1019840ce6.onSuccess(1);
                        } else {
                            interfaceC1019840ce6.LIZ(0, "open chat fail");
                        }
                    }
                });
            }
        } else if (jump2Chat(contextLJ, iMUser, strOptString, strOptString2)) {
            interfaceC1019840ce6.onSuccess(1);
        } else {
            interfaceC1019840ce6.LIZ(0, "open chat fail");
        }
    }

    public final boolean jump2Chat(Context context, IMUser iMUser, String str, String str2) {
        if (context == null) {
            return false;
        }
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        EnterChatParams enterChatParams = new EnterChatParams(context, iMUser);
        enterChatParams.setEnterFromForMob(str);
        enterChatParams.setEnterMethodForMob(str2);
        enterChatParams.setNoEnterChatEvent(true);
        imChatService.LJIILLIIL(enterChatParams, null);
        return true;
    }
}

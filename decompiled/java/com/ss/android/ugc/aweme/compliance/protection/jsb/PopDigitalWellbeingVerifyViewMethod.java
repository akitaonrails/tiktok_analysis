package com.ss.android.ugc.aweme.compliance.protection.jsb;

import X.C0XQ7;
import X.C1051660dTQ;
import X.C123100dR;
import X.C1388190mED;
import X.C207205166h;
import X.C20748616Hc;
import X.InterfaceC1019840ce6;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class PopDigitalWellbeingVerifyViewMethod extends BaseBridgeMethod {
    public final String name;
    public static final C207205166h Companion = new Object() { // from class: X.166h
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    private final void openBindEmail(InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context context = getContext();
        if (context != null) {
            C0XQ7.LIZ().bindEmail(C1388190mED.LIZ(context), "digital_wellbeing", "", new Bundle(), new C20748616Hc(interfaceC1019840ce6, 0));
        } else {
            interfaceC1019840ce6.LIZ(0, "context is null");
        }
    }

    private final void openBindPhone(InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context context = getContext();
        if (context != null) {
            C0XQ7.LIZ().bindMobile(C1388190mED.LIZ(context), "digital_wellbeing", "", new Bundle(), new C20748616Hc(interfaceC1019840ce6, 1));
        } else {
            interfaceC1019840ce6.LIZ(0, "context is null");
        }
    }

    private final void openVerifyEmail(InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context context = getContext();
        if (context != null) {
            C0XQ7.LIZ().verifyEmailForTicket(C1388190mED.LIZ(context), "digital_wellbeing", "", new Bundle(), new C20748616Hc(interfaceC1019840ce6, 2));
        } else {
            interfaceC1019840ce6.LIZ(0, "context is null");
        }
    }

    private final void openVerifyPhone(InterfaceC1019840ce6 interfaceC1019840ce6) {
        Context context = getContext();
        if (context != null) {
            C0XQ7.LIZ().verifyMobileForTicket(C1388190mED.LIZ(context), "digital_wellbeing", "", new Bundle(), new C20748616Hc(interfaceC1019840ce6, 3));
        } else {
            interfaceC1019840ce6.LIZ(0, "context is null");
        }
    }

    public PopDigitalWellbeingVerifyViewMethod(C1051660dTQ c1051660dTQ, String str) {
        super(c1051660dTQ);
        this.name = str;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        User curUser;
        User curUser2;
        try {
            String strOptString = jSONObject.optString("verifyType");
            String email = null;
            if (Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strOptString)) {
                IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                if (iAccountUserServiceLJFF != null && (curUser2 = iAccountUserServiceLJFF.getCurUser()) != null) {
                    email = curUser2.getBindPhone();
                }
                if (C123100dR.LIZ(email)) {
                    openVerifyPhone(interfaceC1019840ce6);
                    return;
                } else {
                    openBindPhone(interfaceC1019840ce6);
                    return;
                }
            }
            if (Intrinsics.LJFF("1", strOptString)) {
                IAccountUserService iAccountUserServiceLJFF2 = C0XQ7.LJFF();
                if (iAccountUserServiceLJFF2 != null && (curUser = iAccountUserServiceLJFF2.getCurUser()) != null) {
                    email = curUser.getEmail();
                }
                if (C123100dR.LIZ(email)) {
                    openVerifyEmail(interfaceC1019840ce6);
                    return;
                } else {
                    openBindEmail(interfaceC1019840ce6);
                    return;
                }
            }
            interfaceC1019840ce6.LIZ(-3, "JSB_PARAMS_ERROR");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(-3, e.getMessage());
        }
    }
}

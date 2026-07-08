package com.ss.android.ugc.aweme.web.jsbridge;

import X.C0WZX;
import X.C0XQ7;
import X.C1388190mED;
import X.C142C;
import X.C1701330uNH;
import X.C2204961BRm;
import X.InterfaceC1041760dDS;
import X.InterfaceC342470Dbh;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenThirdLoginVerifyMethod extends BaseCommonJavaMethod {
    public final IESJsBridge LLILLL;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenThirdLoginVerifyMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = iESJsBridge;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, final InterfaceC1041760dDS interfaceC1041760dDS) throws Throwable {
        final String string;
        Activity activityLIZ;
        if (this.mContextRef != null && this.LLILLL != null) {
            if (jSONObject != null) {
                string = JSONObjectProtectorUtils.getString(jSONObject, "platform");
            } else {
                string = null;
            }
            Context baseContext = this.mContextRef.get();
            while (baseContext instanceof MutableContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (!C142C.LIZ(baseContext, new InterfaceC342470Dbh() { // from class: X.0dpi
                @Override // X.InterfaceC342470Dbh
                public final boolean onActivityResult(int i, int i2, Intent intent) {
                    String stringExtra;
                    String stringExtra2;
                    String stringExtra3;
                    String stringExtra4;
                    if (intent == null) {
                        return false;
                    }
                    if (i2 == -1 && i == 10000) {
                        try {
                            stringExtra = intent.getStringExtra("access_token");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        try {
                            stringExtra2 = intent.getStringExtra("access_token_secret");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        if (stringExtra2 == null) {
                            stringExtra2 = "";
                        }
                        try {
                            stringExtra3 = intent.getStringExtra("code");
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                        if (stringExtra3 == null) {
                            stringExtra3 = "";
                        }
                        try {
                            stringExtra4 = intent.getStringExtra("platform_id");
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                        if (stringExtra4 == null) {
                            stringExtra4 = "";
                        }
                        if (Intrinsics.LJFF(stringExtra, "") && Intrinsics.LJFF(stringExtra2, "") && Intrinsics.LJFF(stringExtra3, "")) {
                            InterfaceC1041760dDS interfaceC1041760dDS2 = interfaceC1041760dDS;
                            if (interfaceC1041760dDS2 != null) {
                                interfaceC1041760dDS2.LIZ(0, "");
                            }
                            return true;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            if (Intrinsics.LJFF("line", string)) {
                                jSONObject2.put("access_token", Uri.encode(stringExtra));
                                jSONObject2.put("access_token_secret", Uri.encode(stringExtra2));
                                jSONObject2.put("code", Uri.encode(stringExtra3));
                            } else {
                                jSONObject2.put("access_token", stringExtra);
                                jSONObject2.put("access_token_secret", stringExtra2);
                                jSONObject2.put("code", stringExtra3);
                            }
                            jSONObject2.put("platform", string);
                            jSONObject2.put("platform_app_id", stringExtra4);
                            InterfaceC1041760dDS interfaceC1041760dDS3 = interfaceC1041760dDS;
                            if (interfaceC1041760dDS3 != null) {
                                interfaceC1041760dDS3.onSuccess(jSONObject2);
                                return true;
                            }
                        } catch (JSONException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            InterfaceC1041760dDS interfaceC1041760dDS4 = interfaceC1041760dDS;
                            if (interfaceC1041760dDS4 != null) {
                                interfaceC1041760dDS4.LIZ(0, "failed");
                            }
                            return true;
                        }
                    } else {
                        InterfaceC1041760dDS interfaceC1041760dDS5 = interfaceC1041760dDS;
                        if (interfaceC1041760dDS5 != null) {
                            interfaceC1041760dDS5.LIZ(0, "");
                        }
                    }
                    return true;
                }
            })) {
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.LIZ(0, "");
                }
            } else if (baseContext != null && (activityLIZ = C1388190mED.LIZ(baseContext)) != null) {
                Intent authorizeActivityStartIntent = C0XQ7.LIZ().getAuthorizeActivityStartIntent(activityLIZ);
                authorizeActivityStartIntent.putExtra("platform", string);
                authorizeActivityStartIntent.putExtra("is_login", false);
                authorizeActivityStartIntent.putExtra("is_only_fetch_token", true);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, authorizeActivityStartIntent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(authorizeActivityStartIntent, activityLIZ);
                C2204961BRm.LJIIZILJ(10000, activityLIZ, authorizeActivityStartIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHEzzAfthIz0NZE9sCPGX9p06ZtWVxzyxPfAdd/fUzZRqqAMg==", null));
            }
        }
    }
}

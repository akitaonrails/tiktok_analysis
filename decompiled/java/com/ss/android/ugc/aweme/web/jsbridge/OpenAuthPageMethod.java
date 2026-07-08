package com.ss.android.ugc.aweme.web.jsbridge;

import X.C0FNV;
import X.C0WZX;
import X.C123100dR;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1550010qRD;
import X.C1701330uNH;
import X.C1B3P;
import X.C1B3S;
import X.C20684815ws;
import X.C2198691B3j;
import X.C2198811B3v;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC1041760dDS;
import X.InterfaceC2190121Ana;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScopeStruct;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS128S0400000_34;
import kotlin.jvm.internal.AwS148S1100000_34;
import kotlin.jvm.internal.AwS182S0400000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class OpenAuthPageMethod extends BaseCommonJavaMethod implements InterfaceC2190121Ana {
    public static final C2198691B3j Companion = new Object() { // from class: X.1B3j
    };
    public final IESJsBridge LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public JSONObject LLILZLL;
    public DialogC1389620mGW LLIZ;
    public long LLIZLLLIL;
    public InterfaceC1041760dDS mIReturn;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void endLoading() {
        DialogC1389620mGW dialogC1389620mGW = this.LLIZ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        this.LLIZ = null;
    }

    public OpenAuthPageMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = iESJsBridge;
        this.LLIZLLLIL = Long.MIN_VALUE;
    }

    public final void LIZ(C2344009Gk c2344009Gk) {
        if (this.LLIZLLLIL > -9223372036854775807L) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZLLLIL;
            if (jCurrentTimeMillis <= 0) {
                jCurrentTimeMillis = 0;
            }
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        }
    }

    public final String LIZJ(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.LLILZLL;
        if (jSONObject2 != null && jSONObject2.has(str) && (jSONObject = this.LLILZLL) != null) {
            return JSONObjectProtectorUtils.getString(jSONObject, str);
        }
        return null;
    }

    public final void onCancel(String str) {
        EventBus.LIZLLL().LJJI(this);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "code");
        String str2 = this.LLILZ;
        if (str2 != null) {
            c2344009Gk.LJFF("channel", str2);
        }
        String str3 = this.LLILZIL;
        if (str3 != null) {
            c2344009Gk.LJFF("scopes", str3);
        }
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("jump_open_auth_page", c2344009Gk.LIZ);
        InterfaceC1041760dDS interfaceC1041760dDS = this.mIReturn;
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZ(-2, str);
        }
    }

    @Override // X.InterfaceC2190121Ana
    public void onClick(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ticket", str);
        jSONObject.put("code", 1);
        jSONObject.put("response", jSONObject2);
        InterfaceC1041760dDS interfaceC1041760dDS = this.mIReturn;
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZIZ(jSONObject);
        }
    }

    @C14EU
    public final void onEvent$crossplatform_from_main_release(C1B3P c1b3p) {
        boolean z;
        int iIntValue;
        EventBus.LIZLLL().LJJI(this);
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = this.LLILZ;
        if (str != null) {
            c2344009Gk.LJFF("channel", str);
        }
        String str2 = this.LLILZIL;
        if (str2 != null) {
            c2344009Gk.LJFF("scopes", str2);
        }
        String str3 = c1b3p.LIZ;
        int iIntValue2 = 1;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String str4 = c1b3p.LIZLLL;
            if (str4 != null) {
                c2344009Gk.LJFF("msg", str4);
            }
            Integer num = c1b3p.LIZJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            c2344009Gk.LIZJ(iIntValue, "code");
            LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("jump_open_auth_page", c2344009Gk.LIZ);
            InterfaceC1041760dDS interfaceC1041760dDS = this.mIReturn;
            if (interfaceC1041760dDS != null) {
                Integer num2 = c1b3p.LIZJ;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                }
                interfaceC1041760dDS.LIZ(iIntValue2, c1b3p.LIZLLL);
                return;
            }
            return;
        }
        if (C123100dR.LIZ(c1b3p.LIZ)) {
            IOpenPlatformService iOpenPlatformService = (IOpenPlatformService) ServiceManager.get().getService(IOpenPlatformService.class);
            String str5 = this.LLILZ;
            if (str5 == null) {
                str5 = "";
            }
            iOpenPlatformService.LIZLLL(str5);
        }
        c2344009Gk.LIZJ(0, "code");
        LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("jump_open_auth_page", c2344009Gk.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_code", c1b3p.LIZ);
        String str6 = c1b3p.LIZIZ;
        if (str6 != null) {
            jSONObject.put("scopes", str6);
        }
        InterfaceC1041760dDS interfaceC1041760dDS2 = this.mIReturn;
        if (interfaceC1041760dDS2 == null) {
            return;
        }
        interfaceC1041760dDS2.LIZJ(0, jSONObject, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void returnStatus(com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage r6) {
        /*
            r5 = this;
            r3 = 0
            java.lang.String r4 = "not_login"
            if (r6 == 0) goto L13
            com.ss.android.ugc.aweme.openauthorize.entity.OAuthPageDetail r0 = r6.pageDetail
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.openauthorize.entity.CheckResultInfo r0 = r0.getCheckResultInfo()
            if (r0 == 0) goto L39
            java.lang.String r0 = r0.messageStarlingKey
            if (r0 == 0) goto L39
        L13:
            java.lang.String r0 = "get_status_failed"
            kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r6 == 0) goto L26
        L1a:
            java.lang.Boolean r0 = r6.canSkipConfirm
            if (r0 == 0) goto L26
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L26
            java.lang.String r4 = "authorized"
        L26:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "status"
            r2.put(r0, r4)
            X.0dDS r1 = r5.mIReturn
            if (r1 == 0) goto L38
            r0 = 0
            r1.LIZJ(r0, r2, r3)
        L38:
            return
        L39:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.IAccountService> r0 = com.ss.android.ugc.aweme.IAccountService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.IAccountService r0 = (com.ss.android.ugc.aweme.IAccountService) r0
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L1a
            java.lang.String r4 = "unauthorized"
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod.returnStatus(com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage):void");
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_jsbridge_OpenAuthPageMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHEzzAfthIz0NZE9sCPDGJ0yZJARxNrwPP8VSo=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_jsbridge_OpenAuthPageMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_jsbridge_OpenAuthPageMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        boolean z;
        boolean z2;
        Activity activity;
        C2198811B3v c2198811B3v;
        this.mIReturn = interfaceC1041760dDS;
        this.LLILZLL = jSONObject;
        WeakReference<C2198811B3v> weakReference = this.LL;
        Object objLIZ = null;
        if (weakReference != null && (c2198811B3v = weakReference.get()) != null) {
            objLIZ = c2198811B3v.LIZ(C1550010qRD.class);
        }
        objLIZ.getClass();
        this.LLILZ = LIZJ("client_key");
        this.LLILZIL = LIZJ("scope");
        String strLIZJ = LIZJ("state");
        String strLIZJ2 = LIZJ("redirect_uri");
        String strLIZJ3 = LIZJ("package_name");
        boolean z3 = false;
        if (jSONObject != null && jSONObject.has("use_sheet")) {
            z = JSONObjectProtectorUtils.getBoolean(jSONObject, "use_sheet");
        } else {
            z = false;
        }
        if (jSONObject != null && jSONObject.has("disable_auto_auth")) {
            z2 = JSONObjectProtectorUtils.getBoolean(jSONObject, "disable_auto_auth");
        } else {
            z2 = false;
        }
        if (jSONObject != null && jSONObject.has("get_status_only")) {
            z3 = JSONObjectProtectorUtils.getBoolean(jSONObject, "get_status_only");
        }
        C1B3S c1b3s = new C1B3S();
        c1b3s.LJII = this.LLILZIL;
        c1b3s.LIZ = strLIZJ;
        c1b3s.LJFF = "wap_to_native";
        c1b3s.LIZIZ = strLIZJ2;
        Bundle bundle = new Bundle();
        c1b3s.toBundle(bundle);
        C786410Ut5.LJJJI("_bytedance_params_client_key", this.LLILZ, bundle);
        C786410Ut5.LJJJI("__bytedance_base_caller_version", "1", bundle);
        if (strLIZJ3 == null) {
            strLIZJ3 = getActContext().getPackageName();
        }
        C786410Ut5.LJJJI("_bytedance_params_type_caller_package", strLIZJ3, bundle);
        C786410Ut5.LJJJI("_aweme_params_enter_from_flag", "ENTER_FROM_INNER_WEB", bundle);
        bundle.putBoolean("_bytedance_params_auto_auth_disabled", z2);
        C786410Ut5.LJJJI("_bytedance_params_initiate_url", this.LLILLL.LIZ.getUrl(), bundle);
        C786410Ut5.LJJJI("_bytedance_params_source", "jsb", bundle);
        IOpenPlatformService iOpenPlatformService = (IOpenPlatformService) ServiceManager.get().getService(IOpenPlatformService.class);
        if (z3) {
            if (this.LLILZ == null) {
                InterfaceC1041760dDS interfaceC1041760dDS2 = this.mIReturn;
                if (interfaceC1041760dDS2 != null) {
                    interfaceC1041760dDS2.LIZ(1, "client key is null");
                    return;
                }
                return;
            }
            if (this.LLILZIL == null) {
                InterfaceC1041760dDS interfaceC1041760dDS3 = this.mIReturn;
                if (interfaceC1041760dDS3 == null) {
                    return;
                }
                interfaceC1041760dDS3.LIZ(1, "scope is null");
                return;
            }
            LIZIZ(iOpenPlatformService, c1b3s, bundle, new AwS613S0100000_34(this, 54));
            return;
        }
        String str = this.LLILZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        iOpenPlatformService.LJIIL(str);
        if (z) {
            C786410Ut5.LJJJI("_bytedance_params_enter_source", "authorization_sdk", bundle);
            C786410Ut5.LJJJI("_bytedance_params_enter_method", "iab_android", bundle);
            C786410Ut5.LJJJI("_bytedance_params_enter_from", "authorization_sdk", bundle);
            Pair<Boolean, Boolean> pairLJFF = iOpenPlatformService.LJFF();
            boolean zBooleanValue = pairLJFF.getFirst().booleanValue();
            boolean zBooleanValue2 = pairLJFF.getSecond().booleanValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("channel", this.LLILZ);
            c2344009Gk.LJFF("enter_method", "iab_android");
            c2344009Gk.LIZJ(zBooleanValue ? 1 : 0, "is_login");
            c2344009Gk.LJFF("enter_source", "authorization_sdk");
            C20684815ws.LJIILLIIL("auth_init", c2344009Gk.LIZ);
            this.LLIZLLLIL = System.currentTimeMillis();
            if (zBooleanValue2) {
                InterfaceC1041760dDS interfaceC1041760dDS4 = this.mIReturn;
                if (interfaceC1041760dDS4 == null) {
                    return;
                }
                interfaceC1041760dDS4.LIZ(1, "child_mode");
                return;
            }
            if (!zBooleanValue) {
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJJI("enter_method", "iab_android", bundle2);
                C786410Ut5.LJJJI("enter_from", "authorization_sdk", bundle2);
                Context actContext = getActContext();
                if (!(actContext instanceof Activity) || (activity = (Activity) actContext) == null) {
                    return;
                }
                String str3 = this.LLILZ;
                if (str3 != null) {
                    str2 = str3;
                }
                iOpenPlatformService.LJIIIIZZ(activity, str2, bundle2, new AwS182S0400000_34(this, iOpenPlatformService, c1b3s, bundle, 1));
                return;
            }
            startAuth(iOpenPlatformService, c1b3s, bundle);
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
        Intent intentLIZ = iOpenPlatformService.LIZ(getActContext());
        if (intentLIZ == null) {
            return;
        }
        intentLIZ.addFlags(67108864);
        intentLIZ.putExtras(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_web_jsbridge_OpenAuthPageMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(getActContext(), intentLIZ);
    }

    @Override // X.InterfaceC2190121Ana
    public void onError(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("errorCode", str);
        jSONObject.put("errorMsg", str2);
        InterfaceC1041760dDS interfaceC1041760dDS = this.mIReturn;
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZIZ(jSONObject);
        }
    }

    public final void autoAuth(IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, OAuthPage oAuthPage) {
        String strLJJLIIIJ;
        OAuthScopeStruct scopeListStruct;
        List<OAuthScope> list;
        String url = this.LLILLL.LIZ.getUrl();
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        if (str2 == null) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = str2;
        }
        OAuthPageDetail oAuthPageDetail = oAuthPage.pageDetail;
        if (oAuthPageDetail != null && (scopeListStruct = oAuthPageDetail.getScopeListStruct()) != null && (list = scopeListStruct.authorizedScopeList) != null) {
            HashSet hashSet = new HashSet();
            Iterator<OAuthScope> it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = it2.next().scopeName;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            if ((!hashSet.isEmpty()) && str2 != null) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                while (it3.hasNext()) {
                    arrayList.add(a0.LJLIIIL((String) it3.next()).toString());
                }
                hashSet.addAll(C13LP.LLIIJI(arrayList));
                strLJJLIIIJ = C13LP.LJJLIIIJ(hashSet, ",", null, null, 0, null, null, 62);
            }
        }
        if (str != null && strLJJLIIIJ != null) {
            iOpenPlatformService.LJIIJ(str, strLJJLIIIJ, url, c1b3s.LIZ, "", false, new AwS148S1100000_34(this, str2, 4));
        }
    }

    public final void showAuthPage(IOpenPlatformService iOpenPlatformService, Bundle bundle, OAuthPage oAuthPage) {
        EventBus.LIZLLL().LJIJJ(this);
        if (oAuthPage != null) {
            C786410Ut5.LJJIZ(bundle, "auth_page_info", oAuthPage);
        }
        iOpenPlatformService.LJIIJJI(getActContext(), bundle, new AwS613S0100000_34(this, 55), null, this.LLILZ);
    }

    public final void startAuth(IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle) {
        if (this.LLIZ == null) {
            this.LLIZ = new DialogC1389620mGW(getActContext());
        }
        DialogC1389620mGW dialogC1389620mGW = this.LLIZ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZJ(dialogC1389620mGW);
        }
        LIZIZ(iOpenPlatformService, c1b3s, bundle, new AwS128S0400000_34(this, iOpenPlatformService, c1b3s, bundle, 3));
    }

    public final void LIZIZ(IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle, Function1<? super OAuthPage, Unit> function1) {
        String str;
        if (this.LLILZ == null) {
            InterfaceC1041760dDS interfaceC1041760dDS = this.mIReturn;
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(1, "client key is null");
                return;
            }
            return;
        }
        if (this.LLILZIL == null) {
            InterfaceC1041760dDS interfaceC1041760dDS2 = this.mIReturn;
            if (interfaceC1041760dDS2 == null) {
                return;
            }
            interfaceC1041760dDS2.LIZ(1, "scope is null");
            return;
        }
        String url = this.LLILLL.LIZ.getUrl();
        String string = bundle.getString("_bytedance_params_type_caller_package");
        boolean z = bundle.getBoolean("_bytedance_params_auto_auth_disabled");
        String str2 = this.LLILZ;
        if (str2 == null || (str = this.LLILZIL) == null) {
            return;
        }
        iOpenPlatformService.LJI(str2, str, c1b3s.LIZIZ, string, z, url, c1b3s.LIZ, false, new AwS613S0100000_34(function1, 53));
    }
}

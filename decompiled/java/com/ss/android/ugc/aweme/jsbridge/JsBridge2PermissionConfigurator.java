package com.ss.android.ugc.aweme.jsbridge;

import X.C080U;
import X.C0X9S;
import X.C1515120pWw;
import X.C1542860qFg;
import X.C1542900qFk;
import X.C1553670qX7;
import X.C1BR0;
import X.C2204721BQo;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC1516470pZ7;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2204671BQj;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class JsBridge2PermissionConfigurator implements C1BR0 {

    public interface NetRequest {
        @InterfaceC1501170pAR
        C0X9S<String> postBody(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list);
    }

    @Override // X.C1BR0
    public final /* synthetic */ void LJ() {
    }

    @Override // X.C1BR0
    public final void LJIIIZ() {
    }

    @Override // X.C1BR0
    public final String LJIIJ() {
        return AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
    }

    @Override // X.C1BR0
    public final InterfaceC2204671BQj LIZ() {
        return new InterfaceC2204671BQj() { // from class: X.0pZ6
            @Override // X.InterfaceC2204671BQj
            public final void LIZ(String str, String str2) {
                Keva repo = KevaImpl.getRepo("jsbridge2-permission", 1);
                if (str == "com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response") {
                    repo.storeBoolean("jsb_permission_write", false);
                    repo.storeInt("jsb_permission_string_length", str2.length());
                }
                repo.storeString(str, str2);
                if (str == "com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response") {
                    repo.storeBoolean("jsb_permission_write", true);
                }
                try {
                    C1542900qFk.LIZJ("jsb_auth_jsb2_write", new JSONObject().put("key", str));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.InterfaceC2204671BQj
            public final void LIZIZ(String str, InterfaceC1059350dfp interfaceC1059350dfp) {
                interfaceC1059350dfp.LIZ(KevaImpl.getRepo("jsbridge2-permission", 1).getString(str, ""));
                try {
                    C1542900qFk.LIZJ("jsb_auth_jsb2_read", new JSONObject().put("key", str));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    @Override // X.C1BR0
    public final Collection<String> LJFF() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("webcast");
        return linkedList;
    }

    @Override // X.C1BR0
    public final String LJII() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZJ();
    }

    @Override // X.C1BR0
    public final int LJIIIIZZ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    @Override // X.C1BR0
    public final Executor LIZIZ() {
        return C823050WQl.LIZJ();
    }

    @Override // X.C1BR0
    public final String LIZLLL() {
        String strLIZJ = C1542860qFg.LIZJ();
        try {
            JSONObject jSONObjectPut = new JSONObject().put("is_empty", TextUtils.isEmpty(strLIZJ));
            if (!TextUtils.isEmpty(strLIZJ)) {
                jSONObjectPut.put("res_length", strLIZJ.length());
            }
            C1542900qFk.LIZJ("jsb_auth_jsb2_PermissionConfigResponse", jSONObjectPut);
            return strLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLIZJ;
        }
    }

    @Override // X.C1BR0
    public final String W2() {
        return C1553670qX7.LIZ();
    }

    @Override // X.C1BR0
    public final EnumC1516470pZ7 Ap() {
        return EnumC1516470pZ7.US;
    }

    @Override // X.C1BR0
    public final String LIZJ() {
        return "https://jsb-va.tiktokv.com/src/server/v2/package";
    }

    public static void LJIIJJI(String str) {
        Boolean boolValueOf;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectOptJSONObject = null;
        if (str == null) {
            boolValueOf = null;
        } else {
            try {
                boolValueOf = Boolean.valueOf(str.isEmpty());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    jSONObject.put("exception", e.getMessage());
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        jSONObject.put("body_null_or_empty", boolValueOf);
        if (str != null && !"".equals(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("packages");
            }
            JSONObject jSONObjectPut = jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, jSONObject2.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1128));
            boolean z2 = true;
            if (jSONObjectOptJSONObject2 == null) {
                z = true;
            } else {
                z = false;
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("currentData_is_null", z);
            if (jSONObjectOptJSONObject != null) {
                z2 = false;
            }
            jSONObjectPut2.put("currentPackages_is_null", z2);
        }
        C1542900qFk.LIZJ("jsb_auth_jsb2_do_post_success", jSONObject);
    }

    @Override // X.C1BR0
    public final void LJI(String str, byte[] bArr, C2204721BQo c2204721BQo) {
        try {
            NetRequest netRequest = (NetRequest) C1515120pWw.LJIIIZ(NetRequest.class, str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C080U("ContentType", "application/json"));
            String str2 = netRequest.postBody(str, new TypedByteArray(null, bArr, new String[0]), arrayList).execute().LIZIZ;
            c2204721BQo.LIZIZ(str2);
            LJIIJJI(str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c2204721BQo.LIZ(e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", e.getMessage());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1542900qFk.LIZJ("jsb_auth_jsb2_do_post_failed", jSONObject);
        }
    }
}

package com.bytedance.bdinstall;

import X.C080U;
import X.C0X52;
import X.C0XCI;
import X.C0XCJ;
import X.C0XCY;
import X.C2188811AlT;
import X.C2210711Bfh;
import X.C844770XBz;
import X.C844870XCj;
import X.InterfaceC1904907d9;
import X.InterfaceC844540XBc;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class BDDeviceTokenInterceptor implements InterfaceC1904907d9 {
    public final Context LL;
    public final String LLILLJJLI;

    public static String LIZ(C0X52 c0x52) {
        C080U c080u;
        String str;
        Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
        while (true) {
            c080u = null;
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            C080U next = it2.next();
            C080U c080u2 = next;
            if (c080u2 != null) {
                str2 = c080u2.LIZ;
            }
            if (u.LJIJI("x-tt-logid", str2, true)) {
                c080u = next;
                break;
            }
        }
        C080U c080u3 = c080u;
        if (c080u3 == null || (str = c080u3.LIZIZ) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0393 A[LOOP:0: B:137:0x038d->B:139:0x0393, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> intercept(X.InterfaceC841770X0l r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.BDDeviceTokenInterceptor.intercept(X.0X0l):X.0X52");
    }

    public BDDeviceTokenInterceptor(Context context, String str) {
        this.LL = context;
        this.LLILLJJLI = str;
    }

    public final void LIZIZ(C0X52<Object> c0x52, Request request, C0XCY c0xcy) throws JSONException {
        C080U c080u;
        String str;
        C844770XBz c844770XBz;
        InterfaceC844540XBc interfaceC844540XBc;
        Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
        while (true) {
            c080u = null;
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            C080U next = it2.next();
            C080U c080u2 = next;
            if (c080u2 != null) {
                str2 = c080u2.LIZ;
            }
            if (u.LJIJI("tt-device-guard-result", str2, true)) {
                c080u = next;
                break;
            }
        }
        C080U c080u3 = c080u;
        if (c080u3 == null || (str = c080u3.LIZIZ) == null) {
            str = "";
        }
        if (str.length() != 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            String strLIZ = LIZ(c0x52);
            C0XCI c0xci = C0XCJ.LIZIZ;
            List listLIZIZ = c0xci.LJIIIZ.LIZIZ();
            if (listLIZIZ != null && listLIZIZ.contains(Integer.valueOf(CastIntegerProtector.parseInt(str)))) {
                C844870XCj.LIZ(Intrinsics.LJIIJJI(str, "onVerifyResultIfNeed: retryDSign with errorCode="));
                C0XCI c0xciLJII = C0XCI.LJII(this.LLILLJJLI);
                if (c0xciLJII != null) {
                    c0xciLJII.LJIIJ("zti_server_err", str);
                }
            }
            if (!Intrinsics.LJFF(c0xci.LJIIIZ.LIZJ("enable_event_track"), Boolean.TRUE)) {
                return;
            }
            if (c0xcy == null) {
                c0xcy = new C0XCY();
                c0xcy.LJIIIIZZ = false;
                c0xcy.LIZJ = false;
                c0xcy.LIZLLL = false;
                c0xcy.LJ = false;
                c0xcy.LJFF = false;
            }
            boolean z = c0xcy.LJ;
            boolean z2 = c0xcy.LJFF;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", request.getPath());
            jSONObject.put("host", request.getHost());
            jSONObject.put("logid", strLIZ);
            jSONObject.put("request_iteration_version", "1");
            jSONObject.put("request_client_data", z2 ? 1 : 0);
            jSONObject.put("request_public_key", z ? 1 : 0);
            jSONObject.put("remote_error", str);
            jSONObject.put("is_signed", c0xcy.LJIIIIZZ ? 1 : 0);
            int i = c0xcy.LJI;
            String str3 = c0xcy.LJII;
            StringBuilder sb = new StringBuilder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dtoken_error=");
            sbLIZ.append(i);
            sbLIZ.append('&');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dtoken_error_msg=");
            sbLIZ2.append(str3);
            sbLIZ2.append('&');
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("private_key_error_code=");
            sbLIZ3.append(z ? 1 : 0);
            sbLIZ3.append('&');
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("private_key_error_msg=");
            sbLIZ4.append("");
            sbLIZ4.append('&');
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("public_key_error_code=");
            sbLIZ5.append(z ? 1 : 0);
            sbLIZ5.append('&');
            sb.append(C2188811AlT.LIZIZ(sbLIZ5));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("public_key_error_msg=");
            sbLIZ6.append("");
            sbLIZ6.append('&');
            sb.append(C2188811AlT.LIZIZ(sbLIZ6));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("dreq_sign_error_code=");
            sbLIZ7.append(z2 ? 1 : 0);
            sbLIZ7.append('&');
            sb.append(C2188811AlT.LIZIZ(sbLIZ7));
            sb.append(Intrinsics.LJIIJJI("", "dreq_sign_error_msg="));
            jSONObject.put("local_error", sb.toString());
            C0XCI c0xciLJII2 = C0XCI.LJII(this.LLILLJJLI);
            if (c0xciLJII2 != null && (c844770XBz = c0xciLJII2.LIZ) != null && (interfaceC844540XBc = c844770XBz.LJJII) != null) {
                ((C2210711Bfh) interfaceC844540XBc).LIZ("device_zti_verify_error", jSONObject);
            }
            C844870XCj.LIZ(Intrinsics.LJIIJJI(jSONObject, "onVerifyResultIfNeed: device_zti_verify_error, info="));
        }
    }
}

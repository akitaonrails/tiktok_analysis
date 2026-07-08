package com.ss.android.ugc.aweme.sec;

import X.AbstractC842510X3h;
import X.C07FG;
import X.C0X0P;
import X.C0X0W;
import X.C0X0Z;
import X.C0XLY;
import X.C1495400p18;
import X.C842000X1i;
import X.InterfaceC1496620p36;
import X.InterfaceC836900WsK;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SecVerifyInterceptor implements InterfaceC836900WsK {
    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        String str;
        String strLIZ;
        C0XLY c0xlyLIZIZ;
        String strName;
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        C0XLY c0xlyLIZ = c1495400p18.LIZ(c1495400p18.LJFF);
        String strResponse2String = null;
        String strLIZ2 = c0xlyLIZ.LIZ("Content-Type", null);
        Request request = c0xlyLIZ.LL;
        String str2 = "";
        if (request == null || request.url() == null) {
            str = "";
        } else {
            str = request.url().LJIIIIZZ;
        }
        if (TextUtils.isEmpty(strLIZ2)) {
            return c0xlyLIZ;
        }
        if ((!TextUtils.isEmpty(strLIZ2) && !strLIZ2.contains("json")) || (!TextUtils.isEmpty(str) && (str.contains("/effect/api") || str.contains("/model/api")))) {
            return c0xlyLIZ;
        }
        AbstractC842510X3h abstractC842510X3h = c0xlyLIZ.LLIZ;
        if (abstractC842510X3h != null) {
            InterfaceC1496620p36 interfaceC1496620p36Source = abstractC842510X3h.source();
            interfaceC1496620p36Source.request(Long.MAX_VALUE);
            C842000X1i c842000X1i = new C842000X1i(interfaceC1496620p36Source.buffer().clone());
            String strLIZ3 = c0xlyLIZ.LIZ("Content-Encoding", null);
            if (strLIZ3 == null || !"gzip".equalsIgnoreCase(strLIZ3)) {
                Logger.debug();
            }
            try {
                C0X0P c0x0pContentType = abstractC842510X3h.contentType();
                if (c0x0pContentType != null) {
                    strLIZ = c0x0pContentType.LIZ;
                } else {
                    strLIZ = c0xlyLIZ.LIZ("Content-Type", null);
                }
                if (strLIZ != null) {
                    str2 = strLIZ;
                }
                boolean zTestIsSSBinary = NetworkUtils.testIsSSBinary(str2);
                if (abstractC842510X3h.contentLength() <= 2147483647L) {
                    if (c0x0pContentType == null || c0x0pContentType.LIZ(null) == null || (strName = c0x0pContentType.LIZ(null).name()) == null) {
                        strName = "UTF-8";
                    }
                    System.currentTimeMillis();
                    if (((Boolean) C07FG.LIZLLL.getValue()).booleanValue()) {
                        strResponse2String = NetworkUtils.response2StringOpt(false, zTestIsSSBinary, 0, c842000X1i, strName);
                    } else {
                        strResponse2String = NetworkUtils.response2String(false, zTestIsSSBinary, 0, c842000X1i, strName);
                    }
                }
                NetworkUtils.safeClose(c842000X1i);
                if (!TextUtils.isEmpty(strResponse2String)) {
                    try {
                        JSONObject jSONObject = new JSONObject(strResponse2String);
                        C0X0Z c0x0z = new C0X0Z((C1495400p18) c0x0w, c0xlyLIZ);
                        if (c0x0z.LJ(((C1495400p18) c0x0w).LJFF.url().LJIIIIZZ, jSONObject)) {
                            if (c0x0z.LIZIZ) {
                                c0xlyLIZIZ = c0x0z.LIZ();
                            } else {
                                c0xlyLIZIZ = c0x0z.LIZIZ();
                            }
                            return c0xlyLIZIZ;
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return c0xlyLIZ;
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return c0xlyLIZ;
                    }
                }
                return c0xlyLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                NetworkUtils.safeClose(c842000X1i);
                throw th;
            }
        }
        throw new IllegalArgumentException("HTTP body may not be null");
    }
}

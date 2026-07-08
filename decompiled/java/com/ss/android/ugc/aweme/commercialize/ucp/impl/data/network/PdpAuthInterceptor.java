package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network;

import X.C051K;
import X.C09CT;
import X.C0D7R;
import X.C0D7S;
import X.C0X52;
import X.C1494590ozp;
import X.C2106208My;
import X.C2107108Nh;
import X.C2175508fh;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C334060D7s;
import X.C334070D7t;
import X.C334130D7z;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes5.dex */
public final class PdpAuthInterceptor implements InterfaceC1904907d9 {

    /* JADX INFO: loaded from: classes.dex */
    public static final class JsonRpcErrorEnvelope {

        @C09CT("error")
        public final JsonRpcError error;

        public JsonRpcErrorEnvelope() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JsonRpcErrorEnvelope) && Intrinsics.LJFF(this.error, ((JsonRpcErrorEnvelope) obj).error);
        }

        public final int hashCode() {
            JsonRpcError jsonRpcError = this.error;
            if (jsonRpcError == null) {
                return 0;
            }
            return jsonRpcError.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JsonRpcErrorEnvelope(error=");
            sbLIZ.append(this.error);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public JsonRpcErrorEnvelope(JsonRpcError jsonRpcError) {
            this.error = jsonRpcError;
        }
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) throws Throwable {
        C334060D7s c334060D7s;
        String str;
        boolean z;
        TypedInput typedInput;
        String str2;
        C334060D7s c334060D7s2;
        String str3;
        JsonRpcError jsonRpcError;
        Integer num;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        C334070D7t c334070D7t = C334130D7z.LIZJ;
        c334070D7t.getClass();
        try {
            c334060D7s = (C334060D7s) C23250099c.LJ(C23271099x.INSTANCE, new C0D7R(c334070D7t, null, null));
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            c334060D7s = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intercept worked: path -> ");
        sbLIZ.append(request.getPath());
        sbLIZ.append(", hasBuyerIp=");
        if (c334060D7s != null) {
            str = c334060D7s.LIZIZ;
        } else {
            str = null;
        }
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        sbLIZ.append(!z);
        C2188811AlT.LIZIZ(sbLIZ);
        C0X52<?> c0x52LIZ = c1494590ozp.LIZ(LIZ(request, c334060D7s));
        C051K c051k = C051K.LIZ;
        C2175508fh c2175508fh = c0x52LIZ.LIZ;
        if ((c2175508fh == null || (typedInput = c2175508fh.LJ) == null) && (typedInput = c0x52LIZ.LIZJ) == null) {
            str2 = null;
        } else {
            try {
                InputStream inputStreamIn = typedInput.in();
                try {
                    str2 = new String(C2106208My.LIZIZ(inputStreamIn), Charsets.UTF_8);
                    C2107108Nh.LIZ(inputStreamIn, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(inputStreamIn, th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = null;
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                str2 = null;
            }
        }
        c051k.getClass();
        JsonRpcErrorEnvelope jsonRpcErrorEnvelope = (JsonRpcErrorEnvelope) C051K.LIZIZ(str2, JsonRpcErrorEnvelope.class);
        if ((jsonRpcErrorEnvelope != null && (jsonRpcError = jsonRpcErrorEnvelope.error) != null && (num = jsonRpcError.code) != null && num.intValue() == -32000 && Intrinsics.LJFF(jsonRpcError.message, "AuthenticationFailed")) || c0x52LIZ.LIZ.LIZIZ == 401) {
            C334070D7t c334070D7t2 = C334130D7z.LIZJ;
            c334070D7t2.getClass();
            try {
                c334060D7s2 = (C334060D7s) C23250099c.LJ(C23271099x.INSTANCE, new C0D7S(c334070D7t2, null, null));
            } catch (InterruptedException e3) {
                TryCatchGuardChecker.doCheck(e3);
                c334060D7s2 = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("retryWithRefreshedToken: path -> ");
            sbLIZ2.append(request.getPath());
            sbLIZ2.append(", hasBuyerIp=");
            if (c334060D7s2 == null || (str3 = c334060D7s2.LIZIZ) == null || str3.length() == 0) {
                z2 = true;
            }
            sbLIZ2.append(!z2);
            C2188811AlT.LIZIZ(sbLIZ2);
            return ((C1494590ozp) interfaceC841770X0l).LIZ(LIZ(request, c334060D7s2));
        }
        return c0x52LIZ;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class JsonRpcError {

        @C09CT("code")
        public final Integer code;

        @C09CT("message")
        public final String message;

        public JsonRpcError() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JsonRpcError)) {
                return false;
            }
            JsonRpcError jsonRpcError = (JsonRpcError) obj;
            return Intrinsics.LJFF(this.code, jsonRpcError.code) && Intrinsics.LJFF(this.message, jsonRpcError.message);
        }

        public final int hashCode() {
            Integer num = this.code;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.message;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JsonRpcError(code=");
            sbLIZ.append(this.code);
            sbLIZ.append(", message=");
            sbLIZ.append(this.message);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public JsonRpcError(Integer num, String str) {
            this.code = num;
            this.message = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.retrofit2.client.Request LIZ(com.bytedance.retrofit2.client.Request r7, X.C334060D7s r8) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r7.getHeaders()
            if (r0 == 0) goto Le
            r6.addAll(r0)
        Le:
            r5 = 0
            if (r8 == 0) goto L98
            java.lang.String r0 = r8.LIZ
        L13:
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            int r0 = r0.length()
            if (r0 == 0) goto L3b
            X.080U r2 = new X.080U
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Bearer "
            r1.append(r0)
            if (r8 == 0) goto L96
            java.lang.String r0 = r8.LIZ
        L2c:
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "Authorization"
            r2.<init>(r0, r1)
            r6.add(r2)
        L3b:
            boolean r0 = r6.isEmpty()
            java.lang.String r2 = "Shopify-Buyer-IP"
            if (r0 != 0) goto L7d
            java.util.Iterator r1 = r6.iterator()
        L47:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r1.next()
            X.080U r0 = (X.C080U) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.text.u.LJIJI(r0, r2, r3)
            if (r0 == 0) goto L47
        L5b:
            java.lang.Object r1 = r7.getExtraInfo()
            boolean r0 = r1 instanceof X.C1494160oz8
            if (r0 == 0) goto L67
            X.0oz8 r1 = (X.C1494160oz8) r1
            if (r1 != 0) goto L6c
        L67:
            X.0oyG r1 = new X.0oyG
            r1.<init>()
        L6c:
            r1.LJIIIZ = r3
            X.0XMB r0 = r7.newBuilder()
            r0.LIZJ = r6
            r0.LJIIJJI = r1
            r0.LJII = r4
            com.bytedance.retrofit2.client.Request r0 = r0.LIZ()
            return r0
        L7d:
            if (r8 == 0) goto L5b
            java.lang.String r0 = r8.LIZIZ
            if (r0 == 0) goto L5b
            int r0 = r0.length()
            if (r0 == 0) goto L5b
            X.080U r0 = new X.080U
            if (r8 == 0) goto L8f
            java.lang.String r5 = r8.LIZIZ
        L8f:
            r0.<init>(r2, r5)
            r6.add(r0)
            goto L5b
        L96:
            r0 = r5
            goto L2c
        L98:
            r0 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.PdpAuthInterceptor.LIZ(com.bytedance.retrofit2.client.Request, X.0D7s):com.bytedance.retrofit2.client.Request");
    }
}

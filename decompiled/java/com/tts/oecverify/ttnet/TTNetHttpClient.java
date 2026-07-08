package com.tts.oecverify.ttnet;

import X.C0X52;
import X.C1515120pWw;
import X.C2178008g6;
import X.InterfaceC2178208g8;
import android.content.Context;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TTNetHttpClient implements InterfaceC2178208g8 {
    public Context context;

    public TTNetHttpClient(Context context) {
        this.context = context;
        if (BdTuring.getInstance().getConfig().getInjectHeader()) {
            TTNetUtil.LIZ();
        }
    }

    @Override // X.InterfaceC2178208g8
    public byte[] get(String str, Map<String, String> map) {
        C2178008g6.LIZ(this.context, str, map);
        try {
            C0X52<TypedInput> c0x52Execute = ((INetworkApi) C1515120pWw.LJIILIIL(str).LIZ(INetworkApi.class)).doGet(true, str, null, TTNetUtil.LIZIZ(map)).execute();
            if (c0x52Execute.LIZ.LIZIZ == 200) {
                InputStream inputStreamIn = c0x52Execute.LIZIZ.in();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamIn.read(bArr);
                    if (i != -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        return byteArrayOutputStream.toByteArray();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new byte[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    @Override // X.InterfaceC2178208g8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] post(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, byte[] r12) {
        /*
            r9 = this;
            r0 = 137714(0x219f2, float:1.92978E-40)
            boolean r8 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            android.content.Context r0 = r9.context
            X.C2178008g6.LIZ(r0, r10, r11)
            r0 = 137902(0x21aae, float:1.93242E-40)
            boolean r7 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            java.util.List r4 = com.tts.oecverify.ttnet.TTNetUtil.LIZIZ(r11)
            com.bytedance.retrofit2.Retrofit r1 = X.C1515120pWw.LJIILIIL(r10)
            java.lang.Class<com.tts.oecverify.ttnet.INetworkApi> r0 = com.tts.oecverify.ttnet.INetworkApi.class
            java.lang.Object r3 = r1.LIZ(r0)
            com.tts.oecverify.ttnet.INetworkApi r3 = (com.tts.oecverify.ttnet.INetworkApi) r3
            com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray
            r5 = 0
            java.lang.String[] r1 = new java.lang.String[r5]
            r0 = 0
            r2.<init>(r0, r12, r1)
            X.0X9S r6 = r3.doPost(r10, r0, r2, r4)
            X.0X52 r2 = r6.execute()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            X.08fh r0 = r2.LIZ     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            int r1 = r0.LIZIZ     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L63
            T r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            java.io.InputStream r4 = r0.in()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            r3.<init>()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
        L4d:
            int r1 = r4.read(r2)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            r0 = -1
            if (r1 == r0) goto L58
            r3.write(r2, r5, r1)     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            goto L4d
        L58:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L7c
            goto L6e
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto L66
        L63:
            r6.cancel()
        L66:
            byte[] r0 = new byte[r5]
            if (r7 == 0) goto L76
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
            goto L76
        L6e:
            r6.cancel()
            if (r7 == 0) goto L76
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L76:
            if (r8 == 0) goto L7b
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L7b:
            return r0
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7c
            if (r6 == 0) goto L85
            r6.cancel()
        L85:
            if (r7 == 0) goto L8a
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L8a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tts.oecverify.ttnet.TTNetHttpClient.post(java.lang.String, java.util.Map, byte[]):byte[]");
    }
}

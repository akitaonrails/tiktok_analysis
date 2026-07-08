package com.bytedance.bdturing.ttnet;

import X.C0X52;
import X.C0X9S;
import X.C148Q;
import X.C1494690ozz;
import X.C1498550p6D;
import X.C1515120pWw;
import X.C2175508fh;
import X.C2178108g7;
import X.InterfaceC2202808k6;
import android.content.Context;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TTNetHttpClient implements InterfaceC2202808k6 {
    public Context context;

    public TTNetHttpClient(Context context) {
        this.context = context;
        if (C1498550p6D.LIZ.LIZ.LJIJI) {
            TTNetUtil.LIZ();
        }
    }

    @Override // X.InterfaceC2202808k6
    public C148Q get(String str, Map<String, String> map) {
        int statusCode;
        C0X52<TypedInput> c0x52Execute;
        C2175508fh c2175508fh;
        C2178108g7.LIZ(this.context, str, map);
        C0X9S<TypedInput> c0x9sDoGet = ((INetworkApi) C1515120pWw.LJIILIIL(str).LIZ(INetworkApi.class)).doGet(true, str, null, TTNetUtil.LIZJ(map));
        byte[] byteArray = new byte[0];
        Map map2 = new HashMap();
        int i = -1;
        try {
            try {
                c0x52Execute = c0x9sDoGet.execute();
                c2175508fh = c0x52Execute.LIZ;
                statusCode = c2175508fh.LIZIZ;
            } catch (Exception e) {
                e = e;
            }
            try {
                map2 = TTNetUtil.LIZLLL(c2175508fh.LIZLLL);
                if (statusCode == 200) {
                    InputStream inputStreamIn = c0x52Execute.LIZIZ.in();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStreamIn.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                } else {
                    c0x52Execute.LIZJ.toString();
                }
            } catch (Exception e2) {
                e = e2;
                i = statusCode;
                TryCatchGuardChecker.doCheck(e);
                e.toString();
                statusCode = i;
            }
        } catch (C1494690ozz e3) {
            TryCatchGuardChecker.doCheck(e3);
            e3.toString();
            statusCode = e3.getStatusCode();
        }
        return new C148Q("get", statusCode, map2, byteArray);
    }

    @Override // X.InterfaceC2202808k6
    public C148Q post(String str, Map<String, String> map, byte[] bArr) {
        int statusCode;
        C2178108g7.LIZ(this.context, str, map);
        C0X9S<TypedInput> c0x9sDoPost = ((INetworkApi) C1515120pWw.LJIILIIL(str).LIZ(INetworkApi.class)).doPost(str, null, new TypedByteArray(null, bArr, new String[0]), TTNetUtil.LIZJ(map));
        byte[] byteArray = new byte[0];
        Map map2 = new HashMap();
        int i = -1;
        try {
            try {
                C0X52<TypedInput> c0x52Execute = c0x9sDoPost.execute();
                C2175508fh c2175508fh = c0x52Execute.LIZ;
                statusCode = c2175508fh.LIZIZ;
                try {
                    map2 = TTNetUtil.LIZLLL(c2175508fh.LIZLLL);
                    if (statusCode == 200) {
                        InputStream inputStreamIn = c0x52Execute.LIZIZ.in();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i2 = inputStreamIn.read(bArr2);
                            if (i2 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i2);
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                    } else {
                        c0x52Execute.LIZJ.toString();
                    }
                } catch (Exception e) {
                    e = e;
                    i = statusCode;
                    TryCatchGuardChecker.doCheck(e);
                    e.toString();
                    statusCode = i;
                }
            } catch (C1494690ozz e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.toString();
                statusCode = e2.getStatusCode();
            }
        } catch (Exception e3) {
            e = e3;
        }
        return new C148Q("verify", statusCode, map2, byteArray);
    }
}

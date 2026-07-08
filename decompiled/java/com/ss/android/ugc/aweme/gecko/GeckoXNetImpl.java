package com.ss.android.ugc.aweme.gecko;

import X.C080U;
import X.C0CQT;
import X.C0X52;
import X.C0X9S;
import X.C1256140inE;
import X.C1499850p8J;
import X.C1504280pFS;
import X.C1551140qT2;
import X.C1551680qTu;
import X.C2175508fh;
import X.InterfaceC1485405rg;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1504270pFR;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoXNetImpl implements InterfaceC1504270pFR {
    public GeckoXNetApi LIZ;

    public interface GeckoXNetApi {
        @InterfaceC1501160pAQ
        C0X9S<String> doGet(@InterfaceC2174708fZ String str);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR
        C0X9S<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC2174608fY
        @InterfaceC1501160pAQ
        C0X9S<TypedInput> downloadFile(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);

        @InterfaceC1501170pAR
        C0X9S<String> postBody(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput);
    }

    @Override // X.InterfaceC1504290pFT
    public final C1551140qT2 LIZJ(String str, String str2) throws Exception {
        boolean zLJI = MethodIDManager.LJI(202109);
        C1551140qT2 c1551140qT2DoPost = doPost(str, str2, null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c1551140qT2DoPost;
    }

    @Override // X.InterfaceC1504270pFR
    public final C1551140qT2 doPost(String str, String str2, Map<String, String> map) throws Exception {
        boolean zLJI = MethodIDManager.LJI(202109);
        if (a0.LJJIIZI(str, ".snssdk.", false)) {
            Exception exc = new Exception("Cannot access this host");
            if (zLJI) {
                MethodIDManager.LJ();
                throw exc;
            }
            throw exc;
        }
        TypedByteArray typedByteArray = new TypedByteArray("application/json", str2.getBytes(Charset.forName("UTF-8")), new String[0]);
        if (this.LIZ == null) {
            C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
            c1499850p8JCreateBuilder.getClass();
            c1499850p8JCreateBuilder.LJIIIIZZ(0);
            this.LIZ = (GeckoXNetApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(GeckoXNetApi.class);
        }
        C0X52<String> c0x52Execute = this.LIZ.postBody(str, typedByteArray).execute();
        List<C080U> list = c0x52Execute.LIZ.LIZLLL;
        HashMap map2 = new HashMap();
        if (!C1256140inE.LIZ(list)) {
            for (C080U c080u : list) {
                map2.put(c080u.LIZ, c080u.LIZIZ);
            }
        }
        String str3 = c0x52Execute.LIZIZ;
        C2175508fh c2175508fh = c0x52Execute.LIZ;
        C1551140qT2 c1551140qT2 = new C1551140qT2(map2, str3, c2175508fh.LIZIZ, c2175508fh.LIZJ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c1551140qT2;
    }

    @Override // X.InterfaceC1504290pFT
    public final void LIZIZ(String str, long j, C1504280pFS c1504280pFS, C1551680qTu c1551680qTu) throws Throwable {
        boolean zLJI = MethodIDManager.LJI(137325);
        LIZ(str, j, c1504280pFS, null, 0L, c1551680qTu);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C1504280pFS r7, java.lang.String r8, long r9, int r11, X.C1494850p0F r12) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.gecko.GeckoXNetImpl.LIZLLL(X.0pFS, java.lang.String, long, int, X.0p0F):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01be A[Catch: all -> 0x021b, TryCatch #25 {all -> 0x021b, blocks: (B:108:0x01b7, B:110:0x01be, B:115:0x01da, B:117:0x01df, B:119:0x01e8, B:120:0x01eb, B:121:0x01ec, B:123:0x0217, B:124:0x021a, B:111:0x01ca, B:113:0x01ce), top: B:156:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ca A[Catch: all -> 0x021b, TryCatch #25 {all -> 0x021b, blocks: (B:108:0x01b7, B:110:0x01be, B:115:0x01da, B:117:0x01df, B:119:0x01e8, B:120:0x01eb, B:121:0x01ec, B:123:0x0217, B:124:0x021a, B:111:0x01ca, B:113:0x01ce), top: B:156:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01df A[Catch: all -> 0x021b, TryCatch #25 {all -> 0x021b, blocks: (B:108:0x01b7, B:110:0x01be, B:115:0x01da, B:117:0x01df, B:119:0x01e8, B:120:0x01eb, B:121:0x01ec, B:123:0x0217, B:124:0x021a, B:111:0x01ca, B:113:0x01ce), top: B:156:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ec A[Catch: all -> 0x021b, TryCatch #25 {all -> 0x021b, blocks: (B:108:0x01b7, B:110:0x01be, B:115:0x01da, B:117:0x01df, B:119:0x01e8, B:120:0x01eb, B:121:0x01ec, B:123:0x0217, B:124:0x021a, B:111:0x01ca, B:113:0x01ce), top: B:156:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0156 A[EDGE_INSN: B:175:0x0156->B:68:0x0156 BREAK  A[LOOP:1: B:58:0x013e->B:63:0x014c, LOOP_LABEL: LOOP:1: B:58:0x013e->B:63:0x014c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    @Override // X.InterfaceC1504270pFR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r21, long r22, X.C1504280pFS r24, java.util.Map<java.lang.String, java.lang.String> r25, long r26, X.C1551680qTu r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.gecko.GeckoXNetImpl.LIZ(java.lang.String, long, X.0pFS, java.util.Map, long, X.0qTu):boolean");
    }
}

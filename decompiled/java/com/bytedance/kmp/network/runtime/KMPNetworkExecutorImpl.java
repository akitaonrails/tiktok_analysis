package com.bytedance.kmp.network.runtime;

import X.AbstractC219400sy;
import X.AbstractC219600t0;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09SW;
import X.C0X52;
import X.C0X9S;
import X.C1493620oyG;
import X.C1496330p2d;
import X.C1496340p2e;
import X.C1496690p3D;
import X.C1501820pBU;
import X.C1501830pBV;
import X.C1501850pBX;
import X.C1501870pBZ;
import X.C1501900pBc;
import X.C2097608Jq;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C219500sz;
import X.C2252611DEt;
import X.C238400w2;
import X.InterfaceC1498620p6K;
import X.InterfaceC2661011f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.kmp.network.runtime.KMPNetworkExecutorImpl;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.DigestUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class KMPNetworkExecutorImpl implements IKMPNetworkExecutor {
    @Override // com.bytedance.kmp.network.runtime.IKMPNetworkExecutor
    public final Object LIZ(final C1501820pBU c1501820pBU, C1501850pBX c1501850pBX) {
        InterfaceC2661011f interfaceC2661011fLIZ;
        KmpNetworkRetrofitService kmpNetworkRetrofitService;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        TypedOutput typedOutput = null;
        if (iRetrofitFactory != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(c1501820pBU.LIZ)) != null && (kmpNetworkRetrofitService = (KmpNetworkRetrofitService) interfaceC2661011fLIZ.create(KmpNetworkRetrofitService.class)) != null) {
            final InterfaceC1498620p6K interfaceC1498620p6KLIZIZ = c1501820pBU.LIZJ.LIZIZ();
            if (interfaceC1498620p6KLIZIZ != null) {
                typedOutput = new TypedOutput() { // from class: X.0p6J
                    @Override // com.bytedance.retrofit2.mime.TypedOutput
                    public final String fileName() {
                        return null;
                    }

                    @Override // com.bytedance.retrofit2.mime.TypedOutput
                    public final long length() {
                        return interfaceC1498620p6KLIZIZ.length();
                    }

                    @Override // com.bytedance.retrofit2.mime.TypedOutput
                    public final String md5Stub() throws Throwable {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(interfaceC1498620p6KLIZIZ.LIZ().getBytes(Charsets.UTF_8));
                        try {
                            String strMd5Hex = DigestUtil.md5Hex(byteArrayInputStream);
                            C2107108Nh.LIZ(byteArrayInputStream, null);
                            return strMd5Hex;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(byteArrayInputStream, th);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = null;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(byteArrayInputStream, th);
                                throw th;
                            }
                        }
                    }

                    @Override // com.bytedance.retrofit2.mime.TypedOutput
                    public final String mimeType() {
                        return interfaceC1498620p6KLIZIZ.mimeType();
                    }

                    @Override // com.bytedance.retrofit2.mime.TypedOutput
                    public final void writeTo(OutputStream outputStream) {
                        String strLIZ;
                        if (outputStream != null) {
                            C1496710p3F c1496710p3F = new C1496710p3F(C1496330p2d.LIZ(outputStream));
                            KMPNetworkExecutorImpl kMPNetworkExecutorImpl = this;
                            C1501820pBU c1501820pBU2 = c1501820pBU;
                            kMPNetworkExecutorImpl.getClass();
                            InterfaceC1498620p6K interfaceC1498620p6KLIZIZ2 = c1501820pBU2.LIZJ.LIZIZ();
                            if (interfaceC1498620p6KLIZIZ2 != null && (strLIZ = interfaceC1498620p6KLIZIZ2.LIZ()) != null) {
                                c1496710p3F.LJLLILLLL(strLIZ);
                            }
                            c1496710p3F.flush();
                        }
                    }
                };
            }
            Map<String, String> mapLIZ = c1501820pBU.LIZJ.LIZ();
            if (mapLIZ == null) {
                mapLIZ = C2097608Jq.LJ();
            }
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1501820pBU.LJ.getClass();
            c1493620oyG.LJIIIIZZ = -1L;
            String str = c1501820pBU.LIZLLL;
            if (str == null || !(!a0.LJJJIL(str))) {
                AbstractC219600t0 abstractC219600t0 = c1501820pBU.LIZJ;
                if (abstractC219600t0 instanceof C219500sz) {
                    str = "GET";
                } else if (abstractC219600t0 instanceof AbstractC219400sy) {
                    str = "POST";
                } else {
                    throw new IllegalArgumentException("kmp request not support this body yet.");
                }
            }
            String str2 = c1501820pBU.LIZIZ;
            Map<String, String> map = c1501820pBU.LJFF;
            c1501820pBU.LJ.getClass();
            C0X9S<TypedInput> c0x9sExecuteWithParams = kmpNetworkRetrofitService.executeWithParams(str, str2, mapLIZ, map, typedOutput, true, c1493620oyG);
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1501850pBX));
            c2252611DEt.LJIJJ();
            c0x9sExecuteWithParams.enqueue(new C09SW<TypedInput>() { // from class: X.0pBT
                @Override // X.C09SW
                public final void onAsyncPreRequest(RequestBuilder requestBuilder) {
                }

                @Override // X.C09SW
                public final void onAsyncResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                }

                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
                    int statusCode;
                    if (!c2252611DEt.isCompleted()) {
                        InterfaceC20236714Gf<C1501900pBc> interfaceC20236714Gf = c2252611DEt;
                        KMPNetworkExecutorImpl kMPNetworkExecutorImpl = this.LL;
                        C1501820pBU c1501820pBU2 = c1501820pBU;
                        kMPNetworkExecutorImpl.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        sbLIZ.append(message);
                        sbLIZ.append(" :");
                        sbLIZ.append(c1501820pBU2.LIZIZ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (th instanceof C1494690ozz) {
                            statusCode = ((C1494690ozz) th).getCronetInternalErrorCode();
                        } else if (th instanceof C1494430ozZ) {
                            statusCode = ((C1494430ozZ) th).getStatusCode();
                        } else {
                            statusCode = -1;
                        }
                        interfaceC20236714Gf.LJJIFFI(null, new C1501900pBc(statusCode, strLIZIZ, null, new C1501830pBV(th)));
                    }
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) throws IOException {
                    C1501900pBc c1501900pBcLIZIZ;
                    try {
                        KMPNetworkExecutorImpl kMPNetworkExecutorImpl = this.LL;
                        C1501820pBU c1501820pBU2 = c1501820pBU;
                        kMPNetworkExecutorImpl.getClass();
                        c1501900pBcLIZIZ = KMPNetworkExecutorImpl.LIZIZ(c1501820pBU2, c0x52, null);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        KMPNetworkExecutorImpl kMPNetworkExecutorImpl2 = this.LL;
                        C1501820pBU c1501820pBU3 = c1501820pBU;
                        kMPNetworkExecutorImpl2.getClass();
                        c1501900pBcLIZIZ = KMPNetworkExecutorImpl.LIZIZ(c1501820pBU3, c0x52, th);
                    }
                    if (!c2252611DEt.isCompleted()) {
                        c2252611DEt.LJJIFFI(null, c1501900pBcLIZIZ);
                    }
                }
            });
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(c1501850pBX);
            }
            return objLJIJ;
        }
        return new C1501900pBc("Internal Error: Can not find service");
    }

    public static C1501900pBc LIZIZ(C1501820pBU c1501820pBU, C0X52 c0x52, Throwable th) throws IOException {
        InputStream inputStreamIn;
        C1496340p2e c1496340p2eLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = c0x52.LIZ.LJI;
        String strLJJIZ = "";
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(" : ");
        sbLIZ.append(c1501820pBU.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = c0x52.LIZ.LIZIZ;
        TypedInput typedInput = (TypedInput) c0x52.LIZIZ;
        C1501830pBV c1501830pBV = null;
        if (typedInput != null && (inputStreamIn = typedInput.in()) != null && (c1496340p2eLIZJ = C1496330p2d.LIZJ(inputStreamIn)) != null) {
            C1496690p3D c1496690p3D = new C1496690p3D();
            C1496690p3D c1496690p3D2 = new C1496690p3D();
            try {
                try {
                    new C238400w2();
                    while (true) {
                        long j = c1496340p2eLIZJ.read(c1496690p3D2, 8192L);
                        if (j == -1) {
                            break;
                        }
                        c1496690p3D.LLFF(c1496690p3D2, j);
                    }
                    c1496340p2eLIZJ.close();
                    try {
                        strLJJIZ = c1496690p3D.LJJIZ();
                        C2107108Nh.LIZ(c1496690p3D, null);
                    } finally {
                        try {
                            try {
                            } catch (Throwable th2) {
                                while (true) {
                                }
                            }
                        } catch (Throwable th3) {
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
                c1496340p2eLIZJ.close();
            }
        }
        C1501870pBZ c1501870pBZ = new C1501870pBZ(strLJJIZ);
        if (th != null) {
            c1501830pBV = new C1501830pBV(th);
        }
        return new C1501900pBc(i, strLIZIZ, c1501870pBZ, c1501830pBV);
    }
}

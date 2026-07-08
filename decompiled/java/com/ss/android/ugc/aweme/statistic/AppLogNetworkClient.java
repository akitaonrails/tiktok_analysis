package com.ss.android.ugc.aweme.statistic;

import X.AbstractC808800Vo6;
import X.C080U;
import X.C0X52;
import X.C0X9S;
import X.C0XDN;
import X.C1493620oyG;
import X.C1494430ozZ;
import X.C1494690ozz;
import X.C2188811AlT;
import X.C2210691Bff;
import X.C2210701Bfg;
import X.C2213981Bky;
import X.C829590WgX;
import X.InterfaceC1485405rg;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import android.net.Uri;
import android.util.Pair;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class AppLogNetworkClient extends AbstractC808800Vo6 {
    public volatile AppLogGetApi LIZIZ;
    public volatile AppLogPostApi LIZJ;

    public interface AppLogGetApi {
        @InterfaceC1501160pAQ
        ListenableFuture<String> getResponse(@InterfaceC2174708fZ String str);
    }

    public interface AppLogPostApi {
        @InterfaceC1501170pAR
        ListenableFuture<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501170pAR
        C0X9S<String> doPostOffline(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174908fb int i, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR
        ListenableFuture<String> getResponse(@InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC2174908fb int i);

        @InterfaceC1501170pAR
        C0X9S<TypedInput> postDataStream(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z);
    }

    public final AppLogPostApi LJI() {
        if (this.LIZJ == null) {
            this.LIZJ = (AppLogPostApi) ((IRetrofitFactory) PluggableExtentionKt.pluggableSpi(IRetrofitFactory.class)).createBuilder(C2210691Bff.LIZIZ.LJFF()).build().retrofit.LIZ(AppLogPostApi.class);
        }
        return this.LIZJ;
    }

    public static List<C080U> LJII(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static Pair<String, String> LJIIIIZZ(String str) {
        Uri uri = UriProtector.parse(str);
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (host != null) {
            if (scheme != null) {
                sb.append(scheme);
                sb.append("://");
            }
            sb.append(host);
            if (port > 0) {
                sb.append(':');
                sb.append(port);
            }
        }
        String string = sb.toString();
        String path = uri.getPath();
        String query = uri.getQuery();
        if (query != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(path);
            sbLIZ.append("?");
            sbLIZ.append(query);
            path = C2188811AlT.LIZIZ(sbLIZ);
        }
        return new Pair<>(string, path);
    }

    @Override // X.AbstractC808800Vo6
    public final String LIZIZ(String str, Map map) throws C829590WgX {
        if (str == null) {
            return null;
        }
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = (AppLogGetApi) ((IRetrofitFactory) PluggableExtentionKt.pluggableSpi(IRetrofitFactory.class)).createBuilder(C2210691Bff.LIZIZ.LJFF()).build().retrofit.LIZ(AppLogGetApi.class);
            }
            return this.LIZIZ.getResponse(str).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getCause() instanceof C1494430ozZ) {
                throw new C829590WgX(((C1494430ozZ) e.getCause()).getStatusCode(), e.getMessage());
            }
            throw new C829590WgX(0, e.getMessage());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C829590WgX(0, e2.getMessage());
        }
    }

    @Override // X.AbstractC808800Vo6
    public final String LIZLLL(String str, List list, Map map) throws C829590WgX {
        boolean zLJI = MethodIDManager.LJI(137647);
        if (str == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return null;
            }
            return null;
        }
        HashMap map2 = new HashMap();
        for (Pair pair : (ArrayList) list) {
            map2.put(pair.first, pair.second);
        }
        C0XDN.LIZJ(map2, true);
        try {
            String str2 = LJI().getResponse(str, map2, -1).get();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return str2;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getCause() instanceof C1494430ozZ) {
                C829590WgX c829590WgX = new C829590WgX(((C1494430ozZ) e.getCause()).getStatusCode(), e.getMessage());
                if (zLJI) {
                    MethodIDManager.LJ();
                    throw c829590WgX;
                }
                throw c829590WgX;
            }
            if (e.getCause() instanceof C1494690ozz) {
                C829590WgX c829590WgX2 = new C829590WgX(C2210701Bfg.LIZIZ.LIZIZ(e), e.getCause().getMessage());
                if (zLJI) {
                    MethodIDManager.LJ();
                    throw c829590WgX2;
                }
                throw c829590WgX2;
            }
            C829590WgX c829590WgX3 = new C829590WgX(C2210701Bfg.LIZIZ.LIZIZ(e), e.getMessage());
            if (zLJI) {
                MethodIDManager.LJ();
                throw c829590WgX3;
            }
            throw c829590WgX3;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C829590WgX c829590WgX4 = new C829590WgX(C2210701Bfg.LIZIZ.LIZIZ(e2), e2.getMessage());
            if (zLJI) {
                MethodIDManager.LJ();
                throw c829590WgX4;
            }
            throw c829590WgX4;
        }
    }

    @Override // X.AbstractC808800Vo6
    public final String LJ(String str, byte[] bArr, Map map) throws C829590WgX {
        boolean zLJI = MethodIDManager.LJI(137647);
        String strLJ = C2210691Bff.LIZIZ.LJ(str);
        if (strLJ == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return null;
            }
            return null;
        }
        try {
            String str2 = (String) map.get("Content-Encoding");
            String str3 = (String) map.get("Content-Type");
            ArrayList arrayList = new ArrayList();
            if (str2 != null) {
                arrayList.add(new C080U("Content-Encoding", str2));
            }
            if (str3 != null && str3.length() > 0) {
                arrayList.add(new C080U("Content-Type", str3));
            }
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
            }
            TypedByteArray typedByteArray = new TypedByteArray(str3, bArr, new String[0]);
            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
            if (!c2213981Bky.isOffline() && !c2213981Bky.isRegressionTest()) {
                String str4 = LJI().doPost(strLJ, typedByteArray, -1, arrayList).get();
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return str4;
            }
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1493620oyG.LJIIIZ = true;
            C0X52<String> c0x52Execute = LJI().doPostOffline(strLJ, typedByteArray, -1, arrayList, c1493620oyG).execute();
            if (c0x52Execute.LIZ.LIZIZ == 403) {
                TypedInput typedInput = c0x52Execute.LIZJ;
                if (typedInput instanceof TypedByteArray) {
                    String str5 = new String(((TypedByteArray) typedInput).getBytes(), Charset.defaultCharset());
                    ExecutionException executionException = new ExecutionException(str5, new C1494430ozZ(c0x52Execute.LIZ.LIZIZ, str5));
                    if (zLJI) {
                        MethodIDManager.LJ();
                        throw executionException;
                    }
                    throw executionException;
                }
            }
            String str6 = c0x52Execute.LIZIZ;
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return str6;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            if (e.getCause() instanceof C1494430ozZ) {
                C829590WgX c829590WgX = new C829590WgX(((C1494430ozZ) e.getCause()).getStatusCode(), e.getMessage());
                if (zLJI) {
                    MethodIDManager.LJ();
                    throw c829590WgX;
                }
                throw c829590WgX;
            }
            if (e.getCause() instanceof C1494690ozz) {
                C829590WgX c829590WgX2 = new C829590WgX(C2210701Bfg.LIZIZ.LIZIZ(e), e.getCause().getMessage());
                if (zLJI) {
                    MethodIDManager.LJ();
                    throw c829590WgX2;
                }
                throw c829590WgX2;
            }
            C829590WgX c829590WgX3 = new C829590WgX(C2210701Bfg.LIZIZ.LIZIZ(e), e.getMessage());
            if (zLJI) {
                MethodIDManager.LJ();
                throw c829590WgX3;
            }
            throw c829590WgX3;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C829590WgX c829590WgX4 = new C829590WgX(C2210701Bfg.LIZIZ.LIZIZ(e2), e2.getMessage());
            if (zLJI) {
                MethodIDManager.LJ();
                throw c829590WgX4;
            }
            throw c829590WgX4;
        }
    }

    @Override // X.AbstractC808800Vo6
    public final byte[] LJFF(String str, byte[] bArr, Map map) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStreamIn;
        ByteArrayOutputStream byteArrayOutputStream2;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        ByteArrayOutputStream byteArrayOutputStream4 = null;
        inputStream = null;
        try {
            try {
                Pair<String, String> pairLJIIIIZZ = LJIIIIZZ(str);
                String str2 = (String) pairLJIIIIZZ.second;
                HashMap map2 = (HashMap) map;
                String str3 = (String) map2.get("Content-Type");
                map2.remove("Content-Type");
                inputStreamIn = ((AppLogPostApi) ((IRetrofitFactory) PluggableExtentionKt.pluggableSpi(IRetrofitFactory.class)).createBuilder(C2210691Bff.LIZIZ.LIZIZ()).build().retrofit.LIZ(AppLogPostApi.class)).postDataStream(-1, str2, new TypedByteArray(str3, bArr, new String[0]), LJII(map), false).execute().LIZIZ.in();
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (Exception e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = inputStreamIn.read(bArr2);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream2.write(bArr2, 0, i);
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            try {
                inputStreamIn.close();
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                byteArrayOutputStream2.close();
                return byteArray;
            } catch (IOException e4) {
                TryCatchGuardChecker.doCheck(e4);
                return byteArray;
            }
        } catch (Exception e5) {
            e = e5;
            byteArrayOutputStream3 = byteArrayOutputStream2;
            TryCatchGuardChecker.doCheck(e);
            throw new C829590WgX(C2210701Bfg.LIZIZ.LIZIZ(e), e.getMessage());
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream4 = byteArrayOutputStream2;
            byteArrayOutputStream = byteArrayOutputStream4;
            inputStream = inputStreamIn;
            TryCatchGuardChecker.doCheck(th);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    throw th;
                }
            }
            throw th;
        }
    }
}

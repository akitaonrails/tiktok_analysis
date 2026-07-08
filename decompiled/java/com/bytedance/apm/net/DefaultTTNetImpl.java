package com.bytedance.apm.net;

import X.AbstractC793700VBo;
import X.C080U;
import X.C0X52;
import X.C0X9S;
import X.C1494430ozZ;
import X.C1494690ozz;
import X.C1515120pWw;
import X.C2106708Nd;
import X.C2403309bL;
import X.C2403609bO;
import X.C792400V6o;
import X.C792420V6q;
import X.C792600V7i;
import X.InterfaceC2403509bN;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultTTNetImpl implements IHttpService {
    public static List<C080U> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new C080U(entry.getKey(), entry.getValue()));
                }
            }
        }
        Context context = C792400V6o.LIZ;
        return arrayList;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        Context context = C792400V6o.LIZ;
        AbstractC793700VBo abstractC793700VBoLIZIZ = AbstractC793700VBo.LIZIZ(C792420V6q.LJIILL());
        byte[] bArr = new byte[8192];
        if (inputStream == null) {
            return new byte[0];
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 != i) {
                abstractC793700VBoLIZIZ.write(bArr, 0, i);
            } else {
                inputStream.close();
                return abstractC793700VBoLIZIZ.LIZLLL();
            }
        }
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C2403609bO doGet(String str, Map<String, String> map) throws IOException {
        C0X9S<TypedInput> c0x9sFetch;
        List<C080U> listConvertHeaderMap = convertHeaderMap(null);
        RetrofitMonitorService retrofitMonitorService = (RetrofitMonitorService) C1515120pWw.LJIIIZ(RetrofitMonitorService.class, str);
        if (listConvertHeaderMap != null && listConvertHeaderMap.size() > 0) {
            c0x9sFetch = retrofitMonitorService.fetch(str, listConvertHeaderMap, map, false);
        } else {
            c0x9sFetch = retrofitMonitorService.fetch(str, map, false);
        }
        C0X52<TypedInput> c0x52Execute = c0x9sFetch.execute();
        return new C2403609bO(c0x52Execute.LIZ.LIZIZ, toByteArray(c0x52Execute.LIZIZ.in()));
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public InterfaceC2403509bN buildMultipartUpload(String str, String str2, boolean z) {
        return new C2403309bL(str, null);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C2403609bO doPost(String str, byte[] bArr, Map<String, String> map) {
        int statusCode = 0;
        C0X9S<TypedInput> c0x9sReport = ((RetrofitMonitorService) C1515120pWw.LJIIIZ(RetrofitMonitorService.class, str)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map), false);
        HashMap map2 = new HashMap();
        byte[] byteArray = null;
        try {
            C0X52<TypedInput> c0x52Execute = c0x9sReport.execute();
            byteArray = toByteArray(c0x52Execute.LIZIZ.in());
            List<C080U> list = c0x52Execute.LIZ.LIZLLL;
            if (!C2106708Nd.LIZ(list)) {
                for (C080U c080u : list) {
                    map2.put(c080u.LIZ, c080u.LIZIZ);
                }
            }
            statusCode = c0x52Execute.LIZ.LIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                if (th instanceof C1494430ozZ) {
                    statusCode = ((C1494430ozZ) th).getStatusCode();
                }
                if (th instanceof C1494690ozz) {
                    statusCode = ((C1494690ozz) th).getStatusCode();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new C2403609bO(statusCode, map2, byteArray);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C2403609bO uploadFiles(String str, List<File> list, Map<String, String> map) {
        try {
            IHttpService defaultTTNetImpl = (IHttpService) C792600V7i.LIZ(IHttpService.class);
            if (defaultTTNetImpl == null) {
                defaultTTNetImpl = new DefaultTTNetImpl();
            }
            InterfaceC2403509bN interfaceC2403509bNBuildMultipartUpload = defaultTTNetImpl.buildMultipartUpload(str, "UTF-8", false);
            if (list != null && !list.isEmpty()) {
                for (File file : list) {
                    if (file.exists()) {
                        interfaceC2403509bNBuildMultipartUpload.LIZJ(file, file.getName(), new HashMap());
                    }
                }
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    interfaceC2403509bNBuildMultipartUpload.LIZ(entry.getKey(), entry.getValue());
                }
            }
            String str2 = new String(interfaceC2403509bNBuildMultipartUpload.finish().LIZJ);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    return new C2403609bO(jSONObject.optInt("error_code", 0), jSONObject.optString("message", "").getBytes());
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public InterfaceC2403509bN buildMultipartUpload(String str, String str2, boolean z, Map<String, String> map) {
        return new C2403309bL(str, map);
    }
}

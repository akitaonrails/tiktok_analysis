package com.tiktok.forestx.net;

import X.C080U;
import X.C0X9S;
import X.C1493620oyG;
import X.C1502260pCC;
import X.C1515120pWw;
import X.C1532710pzJ;
import X.C2097608Jq;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1502280pCE;
import X.InterfaceC1529320ptq;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import X.InterfaceC2177008fw;
import android.net.Uri;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultNetApi implements InterfaceC1502280pCE {
    public static final DefaultNetApi LIZ = new DefaultNetApi();

    public interface TTNetApi {
        @InterfaceC2174608fY
        @InterfaceC1501160pAQ
        C0X9S<TypedInput> doGet(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC2177008fw Object obj);
    }

    public final Map<String, String> LIZIZ(List<C080U> list) {
        HashMap map = new HashMap();
        for (C080U c080u : list) {
            map.put(c080u.LIZ.toLowerCase(Locale.ENGLISH), c080u.LIZIZ);
        }
        return map;
    }

    @Override // X.InterfaceC1502280pCE
    public final InterfaceC1529320ptq LIZ(String str, Uri uri, Map<String, String> map, C1532710pzJ c1532710pzJ) {
        Map<String, String> mapLJ;
        TTNetApi tTNetApi = (TTNetApi) C1515120pWw.LJIIIZ(TTNetApi.class, str);
        if (map == null) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = map;
        }
        C1493620oyG c1493620oyG = new C1493620oyG();
        long j = c1532710pzJ.LIZJ;
        c1493620oyG.LIZJ = j;
        c1493620oyG.LIZLLL = j;
        c1493620oyG.LJIIIZ = true;
        c1493620oyG.LJIILLIIL = c1532710pzJ.LIZ;
        C0X9S<TypedInput> c0x9sDoGet = tTNetApi.doGet(str, mapLJ, c1493620oyG);
        if (c0x9sDoGet != null) {
            return new C1502260pCC(map, c0x9sDoGet);
        }
        return null;
    }
}

package com.ss.android.ugc.aweme.ecommerce.network;

import X.C1336330ksZ;
import X.C1504140pFE;
import X.C23250099c;
import X.C2341109Fh;
import X.C817503Hh;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomStreamMonitorObserver implements Observer {
    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        Map map;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        if ((obj instanceof Map) && (map = (Map) obj) != null && (obj2 = map.get("content_type")) != null && (obj2 instanceof String) && (str = (String) obj2) != null) {
            if ((a0.LJJIIZI(str, "application/json", false) || a0.LJJIIZI(str, "application/x-protobuf", false)) && map != null && (obj3 = map.get("url")) != null && (obj3 instanceof String) && (str2 = (String) obj3) != null) {
                EcommerceBystander.LIZ.getClass();
                Uri uri = UriProtector.parse(str2);
                if (C1336330ksZ.LIZLLL(uri.getHost(), uri.getPath())) {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LIZ(str2);
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1504140pFE(str2, null), 3);
                }
            }
        }
    }
}

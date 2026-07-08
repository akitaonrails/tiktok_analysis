package com.lynx.animax.loader;

import X.C1288960jeA;
import X.EnumC1288520jdS;
import X.InterfaceC1285790jZ3;
import com.lynx.animax.base.bridge.JavaOnlyMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXLoaderRequest implements InterfaceC1285790jZ3 {
    public final String LIZ;
    public final EnumC1288520jdS LIZIZ;
    public final Map<String, Object> LIZJ;

    public final C1288960jeA LIZ() {
        Map<String, Object> map = this.LIZJ;
        if (map == null) {
            return null;
        }
        Object obj = map.get("image_width");
        Object obj2 = this.LIZJ.get("image_height");
        if ((obj instanceof Integer) && (obj2 instanceof Integer)) {
            return new C1288960jeA(obj, obj2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r6 = this;
            java.lang.String r0 = r6.LIZ
            r2 = 0
            if (r0 != 0) goto L79
            r1 = r2
        L6:
            r0 = r2
        L7:
            java.lang.String r5 = "asset"
            boolean r0 = r5.equals(r0)
            java.lang.String r4 = "file"
            if (r0 != 0) goto L84
            if (r1 != 0) goto L74
            r0 = r2
        L14:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L84
            if (r1 == 0) goto L20
            java.lang.String r2 = r1.getScheme()
        L20:
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L84
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L84
            java.lang.String r3 = r6.LIZ
            X.0jdS r2 = r6.LIZIZ
            if (r2 == 0) goto L55
            X.0jdS r0 = X.EnumC1288520jdS.ASSET
            java.lang.String r1 = ""
            if (r2 != r0) goto L56
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r5)
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri$Builder r0 = r0.path(r3)
            android.net.Uri r0 = r0.build()
            java.lang.String r3 = r0.toString()
        L55:
            return r3
        L56:
            X.0jdS r0 = X.EnumC1288520jdS.FILE
            if (r2 != r0) goto L55
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r4)
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri$Builder r0 = r0.path(r3)
            android.net.Uri r0 = r0.build()
            java.lang.String r3 = r0.toString()
            return r3
        L74:
            java.lang.String r0 = r1.getScheme()
            goto L14
        L79:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r1 == 0) goto L6
            java.lang.String r0 = r1.getScheme()
            goto L7
        L84:
            java.lang.String r0 = r6.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.animax.loader.AnimaXLoaderRequest.LIZIZ():java.lang.String");
    }

    public static AnimaXLoaderRequest createRequest(String str) {
        return new AnimaXLoaderRequest(str, null);
    }

    public AnimaXLoaderRequest(String str, Map<String, Object> map) {
        this.LIZ = str;
        this.LIZJ = map;
        if (map != null && map.get("scheme") != null) {
            this.LIZIZ = EnumC1288520jdS.values()[((Integer) map.get("scheme")).intValue()];
        } else {
            this.LIZIZ = null;
        }
    }

    public static AnimaXLoaderRequest createRequestWithParams(String str, JavaOnlyMap javaOnlyMap) {
        return new AnimaXLoaderRequest(str, javaOnlyMap);
    }
}

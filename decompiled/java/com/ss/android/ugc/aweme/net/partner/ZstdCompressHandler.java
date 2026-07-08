package com.ss.android.ugc.aweme.net.partner;

import X.C0XLG;
import X.C0XM9;
import X.C0XS7;
import X.C1494570ozn;
import X.C1499330p7T;
import X.C2241008qG;
import X.C718040SEo;
import X.C794240VDq;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;

/* JADX INFO: loaded from: classes24.dex */
public final class ZstdCompressHandler implements NetworkPartner.RequestHandler, NetworkPartner.ResponseHandler, NetworkPartner.ExceptionHandler {
    public static final ZstdCompressHandler LIZ = new ZstdCompressHandler();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
        C1494570ozn c1494570ozn;
        Object objLIZ = c1499330p7T.LIZ(this);
        if (!(objLIZ instanceof String) || objLIZ == null || (c1494570ozn = c1499330p7T.LIZIZ) == null) {
            return;
        }
        C0XLG c0xlg = c0xs7.LJ;
        String strLIZJ = c0xlg.LIZJ("x-tt-logid");
        String strLIZJ2 = c0xlg.LIZJ("ttzip-version");
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("path", c0xs7.LIZIZ.LJFF.LIZ());
        c2241008qG.LIZ.put("logid", strLIZJ);
        c2241008qG.LIZ.put("request_ttzip_version", objLIZ);
        c2241008qG.LIZ.put("response_ttzip_version", strLIZJ2);
        c2241008qG.LIZ.put("stream_read_size", c1494570ozn.LJJJLZIJ.get("streamReadByteCount"));
        c2241008qG.LIZ.put("received_size", c1494570ozn.LJJJLZIJ.get("receivedByteCount"));
        c2241008qG.LIZ.put("stream_read_time", c1494570ozn.LJJJLZIJ.get("streamReadTime"));
        c2241008qG.LIZ.put("err_code", c1494570ozn.LJJJLZIJ.get("zstd_err_code"));
        C794240VDq.LIZJ("zstd_api_all", c2241008qG.LJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C0XM9 r5, X.C1499330p7T r6) {
        /*
            r4 = this;
            X.0XLO r0 = r5.LIZJ
            X.0TBH r0 = r0.LJFF
            java.lang.String r3 = r0.LIZ()
            X.01GW r0 = X.C1219204pq.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2d
            X.0XLO r0 = r5.LIZJ
            java.lang.String r2 = r0.LJIIIIZZ
            java.lang.String r1 = "use_chunk=1"
            r0 = 1
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r1, r0)
            if (r0 == 0) goto L2d
            X.0XLG r2 = r5.LIZLLL
            java.lang.String r1 = "accept-encoding"
            java.lang.String r0 = "none"
            r2.LIZ(r1, r0)
            return
        L2d:
            X.0p2k r2 = X.C1496400p2k.LIZ
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = X.C1496400p2k.LIZLLL     // Catch: java.lang.Throwable -> L7d
            r1 = 0
            if (r0 == 0) goto L7b
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L7b
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r3)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L5e
            r0.intValue()     // Catch: java.lang.Throwable -> L7d
            com.bytedance.keva.Keva r0 = X.C1496400p2k.LIZIZ     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = r0.getString(r3, r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L5a
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L5a
            goto L5c
        L5a:
            java.lang.String r3 = ""
        L5c:
            monitor-exit(r2)
            goto L61
        L5e:
            java.lang.String r3 = ""
            monitor-exit(r2)
        L61:
            r6.LIZIZ(r4, r3)
            X.0XLG r2 = r5.LIZLLL
            java.lang.String r1 = "accept-encoding"
            java.lang.String r0 = "gzip, deflate, br, ttzip"
            r2.LIZ(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L7a
            X.0XLG r1 = r5.LIZLLL
            java.lang.String r0 = "ttzip-version"
            r1.LIZ(r0, r3)
        L7a:
            return
        L7b:
            monitor-exit(r2)
            return
        L7d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.partner.ZstdCompressHandler.LJIIIIZZ(X.0XM9, X.0p7T):void");
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ExceptionHandler
    public final boolean LJIIIZ(C0XM9 c0xm9, C1499330p7T c1499330p7T, Throwable th, int i, boolean z) {
        C1494570ozn c1494570ozn;
        Object objLIZ = c1499330p7T.LIZ(this);
        if (!(objLIZ instanceof String)) {
            objLIZ = null;
        }
        if (objLIZ == null || (c1494570ozn = c1499330p7T.LIZIZ) == null) {
            return false;
        }
        C0XLG c0xlg = c0xm9.LIZLLL;
        String strLIZJ = c0xlg.LIZJ("x-tt-logid");
        String strLIZJ2 = c0xlg.LIZJ("ttzip-version");
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("path", c0xm9.LIZJ.LJFF.LIZ());
        c2241008qG.LIZ.put("logid", strLIZJ);
        c2241008qG.LIZ.put("request_ttzip_version", objLIZ);
        c2241008qG.LIZ.put("response_ttzip_version", strLIZJ2);
        c2241008qG.LIZ.put("stream_read_size", c1494570ozn.LJJJLZIJ.get("streamReadByteCount"));
        c2241008qG.LIZ.put("received_size", c1494570ozn.LJJJLZIJ.get("receivedByteCount"));
        c2241008qG.LIZ.put("stream_read_time", c1494570ozn.LJJJLZIJ.get("streamReadTime"));
        c2241008qG.LIZ.put("err_code", c1494570ozn.LJJJLZIJ.get("zstd_err_code"));
        c2241008qG.LIZ.put("err_msg", th.getMessage());
        C794240VDq.LIZJ("zstd_api_all", c2241008qG.LJ());
        return false;
    }
}

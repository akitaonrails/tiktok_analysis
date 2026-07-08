package com.ss.android.ugc.aweme.poi.videopublish.eventtrack;

import X.C093000Wq;
import X.InterfaceC665370Q7z;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishCreationProvider implements IPoiPublishExtensionProvider<C093000Wq> {
    public final InterfaceC665370Q7z LL;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[PHI: r2
      0x0028: PHI (r2v5 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String) binds: [B:14:0x0026, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[PHI: r2
      0x0034: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String) binds: [B:14:0x0026, B:16:0x002a, B:18:0x002e, B:20:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[PHI: r1 r2
      0x0037: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:22:0x0035, B:20:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:22:0x0035, B:20:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.tracker.event.EventParamsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1282004zy getParam() {
        /*
            r7 = this;
            X.0Q7z r2 = r7.LL
            java.lang.Class<X.0hL6> r1 = X.C1200260hL6.class
            java.lang.String r0 = "source_default_key"
            r6 = 0
            X.0qZQ r0 = X.C1554960qZC.LIZIZ(r2, r0, r1, r6)
            if (r0 == 0) goto L4e
            X.014t r5 = r0.getSource()
            X.0hL6 r5 = (X.C1200260hL6) r5
        L13:
            X.00Wq r4 = new X.00Wq
            java.lang.String r3 = ""
            if (r5 == 0) goto L25
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.LLILLJJLI
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.services.publish.MobParam r0 = r0.mobParam
            if (r0 == 0) goto L25
            java.lang.String r2 = r0.creationId
            if (r2 != 0) goto L28
        L25:
            r2 = r3
            if (r5 == 0) goto L34
        L28:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.LLILLJJLI
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.services.publish.MobParam r0 = r0.mobParam
            if (r0 == 0) goto L34
            java.lang.String r1 = r0.contentType
            if (r1 != 0) goto L37
        L34:
            r1 = r3
            if (r5 == 0) goto L4a
        L37:
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r5.LLILLJJLI
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.services.publish.MobParam r0 = r0.mobParam
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.shootWay
            if (r0 == 0) goto L44
            r3 = r0
        L44:
            X.0hL6 r0 = X.C1200270hL7.LIZ(r5)
            java.util.Map<java.lang.String, java.lang.String> r6 = r0.LL
        L4a:
            r4.<init>(r2, r1, r3, r6)
            return r4
        L4e:
            r5 = r6
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.videopublish.eventtrack.PoiPublishCreationProvider.getParam():X.04zy");
    }

    public PoiPublishCreationProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}

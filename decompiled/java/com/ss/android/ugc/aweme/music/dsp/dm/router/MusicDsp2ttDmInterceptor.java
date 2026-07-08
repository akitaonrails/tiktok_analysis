package com.ss.android.ugc.aweme.music.dsp.dm.router;

import X.C1976907ol;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDsp2ttDmInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        String path;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = "";
        if (routeIntent == null || (uri2 = routeIntent.getUri()) == null || (host = uri2.getHost()) == null) {
            host = "";
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (path = uri.getPath()) != null) {
            str = path;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(strLIZIZ, "music/dsp2tt/bottom_sheet") && !Intrinsics.LJFF(strLIZIZ, "music/dsp2tt/audio_player")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0206, code lost:
    
        if (r2 != null) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[PHI: r11
      0x00a4: PHI (r11v12 java.lang.String) = (r11v0 java.lang.String), (r11v13 java.lang.String) binds: [B:47:0x00a2, B:45:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac A[PHI: r11
      0x00ac: PHI (r11v11 java.lang.String) = (r11v0 java.lang.String), (r11v12 java.lang.String) binds: [B:47:0x00a2, B:49:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0 A[PHI: r11 r12
      0x00b0: PHI (r11v1 java.lang.String) = (r11v11 java.lang.String), (r11v12 java.lang.String) binds: [B:51:0x00ae, B:49:0x00aa] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r12v0 java.lang.String) = (r12v10 java.lang.String), (r12v11 java.lang.String) binds: [B:51:0x00ae, B:49:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8 A[PHI: r11 r12
      0x00b8: PHI (r11v10 java.lang.String) = (r11v1 java.lang.String), (r11v11 java.lang.String) binds: [B:53:0x00b6, B:51:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r12v9 java.lang.String) = (r12v0 java.lang.String), (r12v10 java.lang.String) binds: [B:53:0x00b6, B:51:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc A[PHI: r11 r12 r13
      0x00bc: PHI (r11v9 java.lang.String) = (r11v1 java.lang.String), (r11v10 java.lang.String) binds: [B:53:0x00b6, B:55:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r12v8 java.lang.String) = (r12v0 java.lang.String), (r12v9 java.lang.String) binds: [B:53:0x00b6, B:55:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r13v8 java.lang.String) = (r13v0 java.lang.String), (r13v9 java.lang.String) binds: [B:53:0x00b6, B:55:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4 A[PHI: r11 r12 r13
      0x00c4: PHI (r11v2 java.lang.String) = (r11v9 java.lang.String), (r11v10 java.lang.String) binds: [B:57:0x00c2, B:55:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r12v1 java.lang.String) = (r12v8 java.lang.String), (r12v9 java.lang.String) binds: [B:57:0x00c2, B:55:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r13v1 java.lang.String) = (r13v8 java.lang.String), (r13v9 java.lang.String) binds: [B:57:0x00c2, B:55:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8 A[PHI: r11 r12 r13 r14
      0x00c8: PHI (r11v8 java.lang.String) = (r11v2 java.lang.String), (r11v9 java.lang.String) binds: [B:59:0x00c6, B:57:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r12v7 java.lang.String) = (r12v1 java.lang.String), (r12v8 java.lang.String) binds: [B:59:0x00c6, B:57:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r13v7 java.lang.String) = (r13v1 java.lang.String), (r13v8 java.lang.String) binds: [B:59:0x00c6, B:57:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r14v6 java.lang.String) = (r14v0 java.lang.String), (r14v7 java.lang.String) binds: [B:59:0x00c6, B:57:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0 A[PHI: r11 r12 r13 r14
      0x00d0: PHI (r11v7 java.lang.String) = (r11v2 java.lang.String), (r11v8 java.lang.String) binds: [B:59:0x00c6, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r12v6 java.lang.String) = (r12v1 java.lang.String), (r12v7 java.lang.String) binds: [B:59:0x00c6, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r13v6 java.lang.String) = (r13v1 java.lang.String), (r13v7 java.lang.String) binds: [B:59:0x00c6, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r14v5 java.lang.String) = (r14v0 java.lang.String), (r14v6 java.lang.String) binds: [B:59:0x00c6, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d4 A[PHI: r11 r12 r13 r14 r15
      0x00d4: PHI (r11v3 java.lang.String) = (r11v7 java.lang.String), (r11v8 java.lang.String) binds: [B:63:0x00d2, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r12v2 java.lang.String) = (r12v6 java.lang.String), (r12v7 java.lang.String) binds: [B:63:0x00d2, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r13v2 java.lang.String) = (r13v6 java.lang.String), (r13v7 java.lang.String) binds: [B:63:0x00d2, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r14v1 java.lang.String) = (r14v5 java.lang.String), (r14v6 java.lang.String) binds: [B:63:0x00d2, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r15v0 java.lang.String) = (r15v4 java.lang.String), (r15v5 java.lang.String) binds: [B:63:0x00d2, B:61:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc A[PHI: r11 r12 r13 r14 r15
      0x00dc: PHI (r11v6 java.lang.String) = (r11v3 java.lang.String), (r11v7 java.lang.String) binds: [B:65:0x00da, B:63:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r12v5 java.lang.String) = (r12v2 java.lang.String), (r12v6 java.lang.String) binds: [B:65:0x00da, B:63:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r13v5 java.lang.String) = (r13v2 java.lang.String), (r13v6 java.lang.String) binds: [B:65:0x00da, B:63:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r14v4 java.lang.String) = (r14v1 java.lang.String), (r14v5 java.lang.String) binds: [B:65:0x00da, B:63:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r15v3 java.lang.String) = (r15v0 java.lang.String), (r15v4 java.lang.String) binds: [B:65:0x00da, B:63:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0 A[PHI: r11 r12 r13 r14 r15 r16
      0x00e0: PHI (r11v5 java.lang.String) = (r11v3 java.lang.String), (r11v6 java.lang.String) binds: [B:65:0x00da, B:67:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r12v4 java.lang.String) = (r12v2 java.lang.String), (r12v5 java.lang.String) binds: [B:65:0x00da, B:67:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r13v4 java.lang.String) = (r13v2 java.lang.String), (r13v5 java.lang.String) binds: [B:65:0x00da, B:67:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r14v3 java.lang.String) = (r14v1 java.lang.String), (r14v4 java.lang.String) binds: [B:65:0x00da, B:67:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r15v2 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String) binds: [B:65:0x00da, B:67:0x00de] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r16v2 java.lang.String) = (r16v0 java.lang.String), (r16v3 java.lang.String) binds: [B:65:0x00da, B:67:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r19, com.bytedance.router.RouteIntent r20) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.dsp.dm.router.MusicDsp2ttDmInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}

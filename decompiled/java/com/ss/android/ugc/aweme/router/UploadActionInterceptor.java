package com.ss.android.ugc.aweme.router;

import X.C1976907ol;
import X.C2188811AlT;
import X.C538260L9c;
import X.C566430MJl;
import X.C575870MiH;
import X.EnumC538250L9b;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.album.IToolsAlbumService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class UploadActionInterceptor implements IInterceptor {
    public final String LL = "createPhoto";

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        }
        sbLIZ.append(path);
        return Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), this.LL);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r36, com.bytedance.router.RouteIntent r37) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.UploadActionInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static void LIZ(Activity activity, String str, Bundle bundle, RecordConfig recordConfig) {
        boolean z;
        EnumC538250L9b enumC538250L9b;
        C575870MiH c575870MiH = new C575870MiH();
        c575870MiH.LIZ(recordConfig);
        c575870MiH.LIZ.setRecordConfig(recordConfig);
        int i = 0;
        if (!Intrinsics.LJFF(str, "educate_phase_iii") && !Intrinsics.LJFF(str, "educate_phase_iii_feedback")) {
            z = false;
        } else {
            z = true;
        }
        c575870MiH.LIZ.setHasRecordEntrance(z);
        c575870MiH.LIZ.setExtras(bundle);
        C566430MJl c566430MJlLIZ = ((IToolsAlbumService) ServiceManager.get().getService(IToolsAlbumService.class)).LIZ(c575870MiH.LIZ);
        C538260L9c c538260L9c = EnumC538250L9b.Companion;
        int i2 = bundle.getInt("default_tab", 2);
        c538260L9c.getClass();
        EnumC538250L9b[] enumC538250L9bArrValues = EnumC538250L9b.values();
        int length = enumC538250L9bArrValues.length;
        while (true) {
            if (i < length) {
                enumC538250L9b = enumC538250L9bArrValues[i];
                if (enumC538250L9b.getType() == i2) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC538250L9b = EnumC538250L9b.DEFAULT;
                break;
            }
        }
        c566430MJlLIZ.LIZ(enumC538250L9b);
        c566430MJlLIZ.LIZIZ();
        c566430MJlLIZ.LIZLLL(bundle);
        if (Intrinsics.LJFF(str, "fixed_shoot_cell")) {
            c566430MJlLIZ.LJ = true;
        }
        c566430MJlLIZ.LIZJ(activity, Intrinsics.LJFF(str, "photo_2023_eoy"));
    }
}

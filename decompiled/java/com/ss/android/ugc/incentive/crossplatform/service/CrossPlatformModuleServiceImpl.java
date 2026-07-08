package com.ss.android.ugc.incentive.crossplatform.service;

import X.C01CI;
import X.C098200Yq;
import X.C189200o6;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.service.ICrossPlatformModuleService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
public final class CrossPlatformModuleServiceImpl implements ICrossPlatformModuleService {
    @Override // com.bytedance.touchpoint.api.service.ICrossPlatformModuleService
    public final boolean LIZ(Uri uri) {
        Object c098200Yq;
        String path;
        String host = uri.getHost();
        String path2 = uri.getPath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(host);
        sbLIZ.append(path2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(strLIZIZ, "webview") && !Intrinsics.LJFF(strLIZIZ, "lynxview")) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl")) == null) || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
            return false;
        }
        try {
            c098200Yq = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri2 = (Uri) c098200Yq;
        if (uri2 == null || (path = uri2.getPath()) == null || path.length() == 0) {
            return false;
        }
        List list = (List) C01CI.LIZIZ.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(path, (String) it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}

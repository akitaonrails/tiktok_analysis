package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AbstractC1743840vTq;
import X.C040O;
import X.C1760810vvD;
import X.C19EG;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.router.IStrategyService;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public final class StrategyService implements IStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.router.IStrategyService
    public final C040O LIZ() {
        return new C040O() { // from class: X.0vvL
            public Function0<? extends AbstractC1760900vvM> LIZ;
            public Function0<? extends AbstractC1760900vvM> LIZIZ;

            @Override // X.C040O
            public final AbstractC1760900vvM LIZ(Uri uri) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                Function0<? extends AbstractC1760900vvM> function0 = null;
                if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                    Uri uriBuild = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    if (("aweme".equals(uriBuild.getScheme()) && "echybrid".equals(uriBuild.getAuthority())) || ("aweme".equals(uriBuild.getScheme()) && "webview".equals(uriBuild.getAuthority()))) {
                        Uri.Builder builderEncodedAuthority = new Uri.Builder().scheme("bullet").encodedAuthority("bullet");
                        for (String str : UriProtector.getQueryParameterNames(uriBuild)) {
                            builderEncodedAuthority.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, str));
                        }
                        uriBuild = builderEncodedAuthority.build();
                    } else if ("bullet".equals(uriBuild.getScheme()) && "bullet".equals(uriBuild.getAuthority())) {
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "url");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                        Uri.Builder builderLIZLLL = LIZLLL(uriBuild, Collections.singletonList("url"));
                        Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                        Uri.Builder builderLIZLLL2 = LIZLLL(uri2, null);
                        for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                            if (!"fallback".equals(str2) && !UriProtector.getQueryParameterNames(uri2).contains(str2)) {
                                builderLIZLLL2.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                            }
                        }
                        builderLIZLLL.appendQueryParameter("url", builderLIZLLL2.toString());
                        Uri uriLIZ = C1943307jL.LIZ(builderLIZLLL.build(), "aweme");
                        Function0<? extends AbstractC1760900vvM> function02 = this.LIZIZ;
                        if (function02 != null) {
                            function0 = function02;
                        }
                        AbstractC1760900vvM abstractC1760900vvMInvoke = function0.invoke();
                        abstractC1760900vvMInvoke.LLILLL = EnumC1760910vvN.FALLBACK;
                        abstractC1760900vvMInvoke.LLILZIL = uriLIZ;
                        abstractC1760900vvMInvoke.LLILZ = uri;
                        return abstractC1760900vvMInvoke;
                    }
                }
                Function0<? extends AbstractC1760900vvM> function03 = this.LIZ;
                if (function03 != null) {
                    function0 = function03;
                }
                AbstractC1760900vvM abstractC1760900vvMInvoke2 = function0.invoke();
                abstractC1760900vvMInvoke2.LLILLL = EnumC1760910vvN.NATIVE;
                abstractC1760900vvMInvoke2.LLILZIL = uri;
                abstractC1760900vvMInvoke2.LLILZ = uri;
                return abstractC1760900vvMInvoke2;
            }

            @Override // X.C040O
            public final C040O LIZIZ(Function0<? extends AbstractC1760900vvM> function0) {
                this.LIZIZ = function0;
                return this;
            }

            @Override // X.C040O
            public final C040O LIZJ(Function0<? extends AbstractC1760900vvM> function0) {
                this.LIZ = function0;
                return this;
            }

            public static Uri.Builder LIZLLL(Uri uri, List list) {
                Uri.Builder builderEncodedPath = new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getAuthority()).encodedPath(uri.getPath());
                if (list != null && !list.isEmpty()) {
                    for (String str : UriProtector.getQueryParameterNames(uri)) {
                        if (!list.contains(str)) {
                            builderEncodedPath.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
                        }
                    }
                } else {
                    for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                        builderEncodedPath.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                    }
                }
                return builderEncodedPath;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.IStrategyService
    public final AbstractC1743840vTq LIZIZ(C19EG c19eg, Uri uri, boolean z) {
        C1760810vvD c1760810vvD = new C1760810vvD(c19eg);
        c1760810vvD.LJ(c19eg, uri, z, null);
        return c1760810vvD;
    }
}

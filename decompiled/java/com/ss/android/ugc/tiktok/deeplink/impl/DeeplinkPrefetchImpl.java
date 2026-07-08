package com.ss.android.ugc.tiktok.deeplink.impl;

import X.C04TD;
import X.C0W8R;
import X.C0X8E;
import X.C0X90;
import X.C0X91;
import X.C0X92;
import X.C0X93;
import X.C0X95;
import X.C15O7;
import X.C1886807aE;
import X.C19273110af;
import X.C2188811AlT;
import X.C843990X8z;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class DeeplinkPrefetchImpl implements IDeepLinkSecurityService {
    public static IDeepLinkSecurityService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IDeepLinkSecurityService.class, false);
        if (objLIZ != null) {
            return (IDeepLinkSecurityService) objLIZ;
        }
        if (C04TD.W6 == null) {
            synchronized (IDeepLinkSecurityService.class) {
                if (C04TD.W6 == null) {
                    C04TD.W6 = new DeeplinkPrefetchImpl();
                }
            }
        }
        return C04TD.W6;
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final C0X93 LIZ(final C0W8R c0w8r) {
        LocalTestApi localTestApiLIZ;
        boolean z;
        List<C0X91> list;
        String host;
        String path;
        Set<String> queryParameterNames;
        boolean z2;
        List<C843990X8z> list2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        List<String> list3;
        boolean z3;
        String str;
        String str2;
        String scheme;
        final C0X93 c0x93 = new C0X93();
        SettingsManager.LIZLLL().getClass();
        boolean z4 = false;
        final boolean z5 = true;
        if (SettingsManager.LIZ("roma_schema_interceptor_enabled", false) && (localTestApiLIZ = C19273110af.LIZ()) != null && localTestApiLIZ.enableDeeplinkIntercept()) {
            Uri uri = c0w8r.LIZ;
            if ((uri != null && (scheme = uri.getScheme()) != null && u.LJJIIJZLJL(scheme, "http", false)) || Intrinsics.LJFF(c0w8r.LIZIZ, Boolean.TRUE)) {
                c0x93.LIZJ = true;
            } else {
                C0X95.LIZ.getClass();
                C0X92 c0x92 = C0X95.LIZIZ;
                if (c0x92 != null && (list = c0x92.LIZJ) != null) {
                    ArrayList arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C0X91 c0x91 = (C0X91) it2.next();
                            if (c0x91.LIZ.length() > 0) {
                                String str3 = c0x91.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                Uri uri2 = c0w8r.LIZ;
                                if (uri2 != null) {
                                    host = uri2.getHost();
                                } else {
                                    host = null;
                                }
                                sbLIZ.append(host);
                                Uri uri3 = c0w8r.LIZ;
                                if (uri3 != null) {
                                    path = uri3.getPath();
                                } else {
                                    path = null;
                                }
                                sbLIZ.append(path);
                                if (C1886807aE.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ))) {
                                    c0x93.LIZ = true;
                                    c0x93.LIZIZ = true;
                                    C0X90 c0x90 = c0x91.LIZIZ;
                                    if (c0x90 != null) {
                                        Uri uri4 = c0w8r.LIZ;
                                        List<String> list4 = c0x90.LIZ;
                                        if (uri4 != null) {
                                            queryParameterNames = UriProtector.getQueryParameterNames(uri4);
                                        } else {
                                            queryParameterNames = null;
                                        }
                                        if (list4 != null) {
                                            ArrayList arrayList2 = (ArrayList) list4;
                                            if (arrayList2.size() > 0) {
                                                for (Object obj : arrayList2) {
                                                    if (queryParameterNames != null && !queryParameterNames.contains(obj)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (!c0x93.LJ) {
                                            List<String> list5 = c0x90.LIZIZ;
                                            if (list5 != null) {
                                                ArrayList arrayList3 = (ArrayList) list5;
                                                if (arrayList3.size() > 0) {
                                                    Iterator it3 = arrayList3.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            break;
                                                        }
                                                        Object next = it3.next();
                                                        if (queryParameterNames != null && queryParameterNames.contains(next)) {
                                                            c0x93.LJFF = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!c0x93.LJFF && (list2 = c0x90.LIZJ) != null) {
                                                ArrayList<C843990X8z> arrayList4 = (ArrayList) list2;
                                                if (arrayList4.size() > 0) {
                                                    for (C843990X8z c843990X8z : arrayList4) {
                                                        if (c843990X8z != null) {
                                                            String str4 = c843990X8z.LIZ;
                                                            if (uri4 != null) {
                                                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, str4);
                                                            } else {
                                                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                                                            }
                                                            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                                                C0X8E c0x8e = c843990X8z.LIZIZ;
                                                                if (c0x8e != null) {
                                                                    List<String> list6 = c0x8e.LIZIZ;
                                                                    if (list6 != null) {
                                                                        ArrayList arrayList5 = (ArrayList) list6;
                                                                        if (arrayList5.size() > 0) {
                                                                            Iterator it4 = arrayList5.iterator();
                                                                            while (it4.hasNext()) {
                                                                                boolean zLIZ = C1886807aE.LIZ((String) it4.next(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                                                                c0x93.LJI = zLIZ;
                                                                                if (zLIZ) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!c0x93.LJI && (list3 = c0x8e.LIZ) != null) {
                                                                        ArrayList arrayList6 = (ArrayList) list3;
                                                                        if (arrayList6.size() > 0) {
                                                                            Iterator it5 = arrayList6.iterator();
                                                                            while (true) {
                                                                                if (it5.hasNext()) {
                                                                                    if (C1886807aE.LIZ((String) it5.next(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                                                                        z3 = false;
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    z3 = true;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            c0x93.LJI = z3;
                                                                        }
                                                                    }
                                                                    if (c0x93.LJI) {
                                                                        break;
                                                                    }
                                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                    sbLIZ2.append("param value is valid for key : ");
                                                                    sbLIZ2.append(str4);
                                                                    C2188811AlT.LIZIZ(sbLIZ2);
                                                                } else {
                                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                                    sbLIZ3.append(" value validator is null: ");
                                                                    sbLIZ3.append(str4);
                                                                    C2188811AlT.LIZIZ(sbLIZ3);
                                                                }
                                                            } else {
                                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                                sbLIZ4.append(" no param value match key: ");
                                                                sbLIZ4.append(str4);
                                                                C2188811AlT.LIZIZ(sbLIZ4);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (!c0x93.LJ && !c0x93.LJFF && !c0x93.LJI) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c0x93.LIZIZ = z2;
                                    }
                                }
                            }
                        }
                        c0x93.LIZLLL = false;
                    }
                }
                if (c0x93.LIZ && c0x93.LIZIZ) {
                    z = true;
                } else {
                    z = false;
                }
                c0x93.LIZJ = z;
            }
            if (c0x93.LIZJ || c0x93.LIZLLL) {
                z4 = true;
            }
            c0x93.LJII = z4;
            if (!z4) {
                C15O7.LIZJ(new Callable() { // from class: X.0W8Q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object c098200Yq;
                        C1C7U.LIZ("SchemaSecurityStrategy@101e.monitorDeeplink$1");
                        C0W8R c0w8r2 = c0w8r;
                        boolean z6 = z5;
                        C0X93 c0x932 = c0x93;
                        try {
                            Uri uri5 = c0w8r2.LIZ;
                            c098200Yq = null;
                            if (uri5 != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("scheme", uri5.getScheme());
                                jSONObject.put("host", uri5.getHost());
                                jSONObject.put("uri", uri5);
                                if (TextUtils.isEmpty(uri5.getPath())) {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append(uri5.getScheme());
                                    sbLIZ5.append("://");
                                    sbLIZ5.append(uri5.getHost());
                                    jSONObject.put("schema", C2188811AlT.LIZIZ(sbLIZ5));
                                } else {
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append(uri5.getScheme());
                                    sbLIZ6.append("://");
                                    sbLIZ6.append(uri5.getHost());
                                    sbLIZ6.append('/');
                                    sbLIZ6.append(uri5.getPath());
                                    jSONObject.put("schema", C2188811AlT.LIZIZ(sbLIZ6));
                                    jSONObject.put("path", uri5.getPath());
                                }
                                jSONObject.put("intercepted", z6);
                                jSONObject.put("allow", c0x932.LJII);
                                C793770VBv.LJII("monitor_deeplink_intercept", jSONObject, null, null);
                                c098200Yq = Unit.LIZ;
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
                        C1C7U.LIZIZ("SchemaSecurityStrategy@101e.monitorDeeplink$1");
                        return c189200o6M1boximpl;
                    }
                });
                if (!c0x93.LIZ) {
                    str = "Illegal Link Host";
                    str2 = "You can either open [DebugPanel] and find [Turn off deeplink secure intercept] to skip this validation or configure on the [Roma] platform";
                } else if (!c0x93.LIZIZ) {
                    if (c0x93.LJ) {
                        str2 = "required params not present, please check [Roma] config";
                    } else if (c0x93.LJFF) {
                        str2 = "contains exclude params, please check [Roma] config";
                    } else if (c0x93.LJI) {
                        str2 = "params value invalid, please check [Roma] config";
                    } else {
                        str2 = "Params illegal, please check [Roma] config";
                    }
                    str = "Illegal Link Params";
                } else {
                    str = "Unknown Link";
                    str2 = "illegal link, please check [Roma] config";
                }
                LocalTestApi localTestApiLIZ2 = C19273110af.LIZ();
                if (localTestApiLIZ2 != null) {
                    localTestApiLIZ2.showDeeplinkInterceptorRemind(str, str2);
                }
            }
        }
        return c0x93;
    }

    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    public final boolean LIZIZ(String str) {
        return C1886807aE.LIZ("[0-9]", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa A[PHI: r8
      0x01aa: PHI (r8v3 java.io.InputStream) = (r8v2 java.io.InputStream), (r8v4 java.io.InputStream) binds: [B:88:0x01a8, B:72:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.bytedance.ies.abmock.SettingsManager] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl.LIZJ(android.content.Context):void");
    }
}

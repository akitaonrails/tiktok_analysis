package com.ss.android.ugc.aweme.localservice.preload;

import X.C08A4;
import X.C098200Yq;
import X.C1181330gqZ;
import X.C1181430gqj;
import X.C1186560gz0;
import X.C1202730hP5;
import X.C123100dR;
import X.C1336370ksd;
import X.C13LP;
import X.C189200o6;
import X.C1976907ol;
import X.C20152113t9;
import X.C20152913tH;
import X.C20153113tJ;
import X.C2188811AlT;
import X.InterfaceC1186540gyy;
import X.InterfaceC20153313tL;
import X.InterfaceC727570SgN;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes19.dex */
public final class LSCommonPageInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        if (!Intrinsics.LJFF(host, "poi")) {
            return false;
        }
        String strValueOf = String.valueOf(routeIntent.getUri());
        Iterator it2 = C13LP.LLIIII(((Map) C1186560gz0.LIZ.getValue()).keySet()).iterator();
        while (it2.hasNext()) {
            if (a0.LJJIIZI(strValueOf, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String host;
        String path;
        Bundle extras;
        Intent extra;
        Bundle extras2;
        Intent extra2;
        int iIntValue;
        Bundle extras3;
        Intent extra3;
        Intent extra4;
        Bundle extras4;
        Unit unit;
        Uri uri;
        Uri uri2;
        Intent extra5;
        if (routeIntent != null && (extra5 = routeIntent.getExtra()) != null) {
            extra5.putExtra("page_start_ts", System.currentTimeMillis());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("//");
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            path = uri.getPath();
        } else {
            path = null;
        }
        sbLIZ.append(path);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1186540gyy interfaceC1186540gyy = (InterfaceC1186540gyy) ((Map) C1186560gz0.LIZ.getValue()).get(strLIZIZ);
        if (interfaceC1186540gyy != null) {
            if (interfaceC1186540gyy instanceof InterfaceC727570SgN) {
                if (routeIntent != null && (extra4 = routeIntent.getExtra()) != null) {
                    try {
                        C20152913tH.LIZLLL.getClass();
                        C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
                        if (c20152113t9LIZIZ != 0) {
                            try {
                                extras4 = extra4.getExtras();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                extras4 = null;
                            }
                            c20152113t9LIZIZ.LIZLLL(extras4, interfaceC1186540gyy.getClass());
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(":execNetPreload:");
                if (routeIntent != null && (extra3 = routeIntent.getExtra()) != null) {
                    try {
                        extras3 = extra3.getExtras();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        extras3 = null;
                    }
                    sbLIZ2.append(extras3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    extras3 = null;
                    sbLIZ2.append(extras3);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else {
                List<Class<? extends InterfaceC20153313tL>> netPreloadConfig = interfaceC1186540gyy.getNetPreloadConfig(context, routeIntent);
                if (netPreloadConfig != null) {
                    for (Class<? extends InterfaceC20153313tL> cls : netPreloadConfig) {
                        C20152913tH.LIZLLL.getClass();
                        C20152113t9 c20152113t9LIZIZ2 = C20153113tJ.LIZIZ();
                        if (c20152113t9LIZIZ2 != null) {
                            if (routeIntent != null && (extra2 = routeIntent.getExtra()) != null) {
                                try {
                                    extras2 = extra2.getExtras();
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    extras2 = null;
                                }
                                c20152113t9LIZIZ2.LIZLLL(extras2, cls);
                            } else {
                                extras2 = null;
                                c20152113t9LIZIZ2.LIZLLL(extras2, cls);
                            }
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append(":execNetPreload:");
                        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                            try {
                                extras = extra.getExtras();
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                extras = null;
                            }
                        } else {
                            extras = null;
                        }
                        sbLIZ3.append(extras);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                }
            }
            List<C1181330gqZ> xmlPreloadConfig = interfaceC1186540gyy.getXmlPreloadConfig(context, routeIntent);
            if (xmlPreloadConfig != null) {
                if (context != null) {
                    for (C1181330gqZ c1181330gqZ : xmlPreloadConfig) {
                        if (C123100dR.LIZ(c1181330gqZ.LIZ) || c1181330gqZ.LIZIZ != null) {
                            if (C08A4.LIZ(c1181330gqZ.LIZJ)) {
                                Integer num = c1181330gqZ.LIZIZ;
                                String str = c1181330gqZ.LIZ;
                                Integer num2 = c1181330gqZ.LIZJ;
                                if (num2 != null) {
                                    iIntValue = num2.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                C1181430gqj.LIZJ(context, num, str, iIntValue, c1181330gqZ.LIZLLL, Integer.valueOf(c1181330gqZ.LJ), null, 64);
                            }
                        }
                    }
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(":execXmlPreload");
                C2188811AlT.LIZIZ(sbLIZ4);
            }
            List<C1202730hP5> imagePreloadConfig = interfaceC1186540gyy.getImagePreloadConfig(context, routeIntent);
            if (imagePreloadConfig != null) {
                Iterator<C1202730hP5> it2 = imagePreloadConfig.iterator();
                while (it2.hasNext()) {
                    C1336370ksd.LIZ.LJFF(it2.next());
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append(":preloadImages");
                    C2188811AlT.LIZIZ(sbLIZ5);
                }
            }
            interfaceC1186540gyy.doPreload(context, routeIntent);
        }
        return false;
    }
}

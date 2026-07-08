package com.ss.android.ugc.aweme.iab.service;

import X.C085T;
import X.C08S3;
import X.C098200Yq;
import X.C0WZX;
import X.C1389890mGx;
import X.C1701330uNH;
import X.C189200o6;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2429209fW;
import X.C2442409he;
import X.C2442509hf;
import X.EnumC2004607tE;
import X.EnumC2434109gJ;
import X.EnumC2434209gK;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ITtopIABService;
import com.ss.android.ugc.aweme.iab.TtopIABRouterParams;
import com.ss.android.ugc.aweme.iab.config.SystemBrowser;
import com.ss.android.ugc.aweme.iab.config.SystemBrowserRule;
import com.ss.android.ugc.aweme.iab.config.TtopIABHyperLinkConfig;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class TtopIABServiceImpl implements ITtopIABService {
    @Override // com.ss.android.ugc.aweme.api.ITtopIABService
    public final EnumC2004607tE LIZ(Context context, String str, EnumC2434109gJ enumC2434109gJ, EnumC2434209gK enumC2434209gK, boolean z, Long l, String str2, Integer num) {
        List<SystemBrowserRule> list;
        Object c098200Yq;
        Activity activityLIZ;
        String strLIZIZ = str;
        TtopIABHyperLinkConfig ttopIABHyperLinkConfig = (TtopIABHyperLinkConfig) C2442509hf.LIZIZ.getValue();
        try {
            String scheme = new URI(strLIZIZ).getScheme();
            if (scheme == null || scheme.length() == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://");
            sbLIZ2.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        SystemBrowser systemBrowser = ttopIABHyperLinkConfig.systemBrowser;
        if (systemBrowser != null && (list = systemBrowser.rules) != null) {
            for (SystemBrowserRule systemBrowserRule : list) {
                List<String> list2 = systemBrowserRule.domain;
                List<String> list3 = systemBrowserRule.firstPath;
                try {
                    URI uri = new URI(strLIZIZ);
                    String host = uri.getHost();
                    if (host == null) {
                        continue;
                    } else {
                        if (list2 != null) {
                            if (list2.isEmpty()) {
                                continue;
                            } else {
                                for (String str3 : list2) {
                                    if (!Intrinsics.LJFF(host, str3)) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append('.');
                                        sbLIZ3.append(str3);
                                        if (u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ3), false)) {
                                        }
                                    }
                                }
                            }
                        }
                        String path = uri.getPath();
                        if (path != null) {
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJLJJLL(path, '/'), new String[]{"/"}, 0, 6);
                            if (listLJJLIIIJILLIZJL.isEmpty()) {
                                continue;
                            } else {
                                Object obj = ListProtector.get(listLJJLIIIJILLIZJL, 0);
                                if (list3 == null || list3.contains(obj)) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.VIEW");
                                        intent.addFlags(268435456);
                                        intent.addCategory("android.intent.category.BROWSABLE");
                                        C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
                                        intent.setData(UriProtector.parse(strLIZIZ));
                                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                                        C1701330uNH.LIZ(intent, context);
                                        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOpYdHd2SC9C4+zUKF1OVm4PctqFQTvxL1+qTKrhQ==", null));
                                        c098200Yq = Unit.LIZ;
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null && (activityLIZ = C085T.LIZ(context)) != null) {
                                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                        c1389890mGx.LJIIIZ(2131857180);
                                        c1389890mGx.LJIIJJI();
                                    }
                                    C2442409he.LIZ.getClass();
                                    C08S3 c08s3 = C08S3.LIZ;
                                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("url", strLIZIZ));
                                    c08s3.getClass();
                                    C08S3.LIZJ("external_browser_navigation", mapLIZJ);
                                    return EnumC2004607tE.EXTERNAL_BROWSER;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//ttop/iab");
        smartRouteBuildRoute.withParam("router_params", new TtopIABRouterParams(strLIZIZ, enumC2434109gJ.getType(), enumC2434209gK.getType(), z, l, str2, num));
        smartRouteBuildRoute.open();
        return EnumC2004607tE.IAB;
    }
}

package com.ss.android.ugc.aweme.spark;

import X.C07J2;
import X.C0WZX;
import X.C0XJ6;
import X.C1027660cqi;
import X.C1028040crK;
import X.C1028210crb;
import X.C1038730d8Z;
import X.C1039050d95;
import X.C1039120d9C;
import X.C1039200d9K;
import X.C1039290d9T;
import X.C1039320d9W;
import X.C1040370dBD;
import X.C1041070dCL;
import X.C1041600dDC;
import X.C1041690dDL;
import X.C1041880dDe;
import X.C1388190mED;
import X.C13LP;
import X.C1521250pgp;
import X.C1701330uNH;
import X.C1AF0;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2429209fW;
import X.C786410Ut5;
import X.C793770VBv;
import X.C794240VDq;
import X.C988570bpf;
import X.InterfaceC1037730d6x;
import X.InterfaceC1039110d9B;
import X.InterfaceC1521890phr;
import X.InterfaceC988110bov;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.settings.IntentSchemeInterceptConfig;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness;
import com.ss.android.ugc.aweme.bullet.business.PlayableBusiness;
import com.ss.android.ugc.aweme.bullet.business.XpathBusiness;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdSparkBizWebViewClientDelegate extends C1039320d9W {
    public boolean jumpFromLynx;
    public long startLoadUrlTimeStamp;
    public static final C1039290d9T Companion = new Object() { // from class: X.0d9T
    };
    public static final int $stable = 8;

    public AdSparkBizWebViewClientDelegate(C1039050d95 c1039050d95) {
        boolean z;
        C1038730d8Z c1038730d8Z;
        C1028040crK c1028040crK;
        Long lLIZJ;
        super(c1039050d95);
        this.startLoadUrlTimeStamp = -1L;
        C1041600dDC params = this.bulletBusiness.getParams();
        if ((params instanceof C1038730d8Z) && (c1038730d8Z = (C1038730d8Z) params) != null && (c1028040crK = c1038730d8Z.LLD) != null && (lLIZJ = c1028040crK.LIZJ()) != null && lLIZJ.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.jumpFromLynx = z;
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final String commerceUrlFilter(String str) {
        if (!TextUtils.isEmpty(str) && str != null && a0.LJJIIZI(str, "__back_url__", false)) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("snssdk");
                sbLIZ.append(C1028210crb.LJ());
                sbLIZ.append("://adx");
                return u.LJJIFFI(str, "__back_url__", Uri.encode(C2188811AlT.LIZIZ(sbLIZ)), false);
            }
            return str;
        }
        return str;
    }

    private final boolean handlePassBackPageInfo(String str) {
        if (str == null) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        if (!TextUtils.equals(uri.getScheme(), "bytedance") || !TextUtils.equals(uri.getHost(), "adPageHtmlContent")) {
            return false;
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.bulletBusiness.LIZIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LIZ();
            return true;
        }
        return true;
    }

    private final void reportH5SchemeEvent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.bulletBusiness.LIZJ();
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm4Yo3FkhO1dHc+H9jVQ7a/GcVdfixk0IZ62U/8sM55j57GdwI=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0130 A[Catch: Exception -> 0x02a4, TryCatch #1 {Exception -> 0x02a4, blocks: (B:13:0x002e, B:15:0x0039, B:16:0x0041, B:21:0x004b, B:24:0x0054, B:26:0x005c, B:28:0x0060, B:30:0x0065, B:31:0x0069, B:36:0x0072, B:37:0x0075, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:46:0x0093, B:53:0x00a1, B:54:0x00a3, B:69:0x00ca, B:79:0x00de, B:81:0x00f4, B:83:0x00f8, B:85:0x00fc, B:87:0x0104, B:88:0x0108, B:90:0x0112, B:94:0x011b, B:96:0x0121, B:106:0x0147, B:108:0x014f, B:111:0x0159, B:113:0x0163, B:115:0x016f, B:131:0x01c1, B:130:0x01be, B:116:0x0176, B:118:0x017e, B:119:0x0185, B:121:0x018d, B:122:0x0199, B:124:0x01a1, B:125:0x01ad, B:127:0x01b5, B:133:0x01c5, B:134:0x01c9, B:138:0x01d2, B:140:0x01dd, B:150:0x0201, B:152:0x0207, B:154:0x0212, B:155:0x0217, B:157:0x021d, B:158:0x0223, B:165:0x0237, B:167:0x024e, B:169:0x0257, B:170:0x0267, B:172:0x026e, B:178:0x028d, B:145:0x01e8, B:147:0x01f0, B:149:0x01fb, B:180:0x0294, B:182:0x02a0, B:103:0x0130, B:57:0x00ac, B:62:0x00b7, B:63:0x00b9, B:173:0x027c, B:175:0x0282), top: B:189:0x002e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02a0 A[Catch: Exception -> 0x02a4, TryCatch #1 {Exception -> 0x02a4, blocks: (B:13:0x002e, B:15:0x0039, B:16:0x0041, B:21:0x004b, B:24:0x0054, B:26:0x005c, B:28:0x0060, B:30:0x0065, B:31:0x0069, B:36:0x0072, B:37:0x0075, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:46:0x0093, B:53:0x00a1, B:54:0x00a3, B:69:0x00ca, B:79:0x00de, B:81:0x00f4, B:83:0x00f8, B:85:0x00fc, B:87:0x0104, B:88:0x0108, B:90:0x0112, B:94:0x011b, B:96:0x0121, B:106:0x0147, B:108:0x014f, B:111:0x0159, B:113:0x0163, B:115:0x016f, B:131:0x01c1, B:130:0x01be, B:116:0x0176, B:118:0x017e, B:119:0x0185, B:121:0x018d, B:122:0x0199, B:124:0x01a1, B:125:0x01ad, B:127:0x01b5, B:133:0x01c5, B:134:0x01c9, B:138:0x01d2, B:140:0x01dd, B:150:0x0201, B:152:0x0207, B:154:0x0212, B:155:0x0217, B:157:0x021d, B:158:0x0223, B:165:0x0237, B:167:0x024e, B:169:0x0257, B:170:0x0267, B:172:0x026e, B:178:0x028d, B:145:0x01e8, B:147:0x01f0, B:149:0x01fb, B:180:0x0294, B:182:0x02a0, B:103:0x0130, B:57:0x00ac, B:62:0x00b7, B:63:0x00b9, B:173:0x027c, B:175:0x0282), top: B:189:0x002e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac A[Catch: Exception -> 0x02a4, TryCatch #1 {Exception -> 0x02a4, blocks: (B:13:0x002e, B:15:0x0039, B:16:0x0041, B:21:0x004b, B:24:0x0054, B:26:0x005c, B:28:0x0060, B:30:0x0065, B:31:0x0069, B:36:0x0072, B:37:0x0075, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:46:0x0093, B:53:0x00a1, B:54:0x00a3, B:69:0x00ca, B:79:0x00de, B:81:0x00f4, B:83:0x00f8, B:85:0x00fc, B:87:0x0104, B:88:0x0108, B:90:0x0112, B:94:0x011b, B:96:0x0121, B:106:0x0147, B:108:0x014f, B:111:0x0159, B:113:0x0163, B:115:0x016f, B:131:0x01c1, B:130:0x01be, B:116:0x0176, B:118:0x017e, B:119:0x0185, B:121:0x018d, B:122:0x0199, B:124:0x01a1, B:125:0x01ad, B:127:0x01b5, B:133:0x01c5, B:134:0x01c9, B:138:0x01d2, B:140:0x01dd, B:150:0x0201, B:152:0x0207, B:154:0x0212, B:155:0x0217, B:157:0x021d, B:158:0x0223, B:165:0x0237, B:167:0x024e, B:169:0x0257, B:170:0x0267, B:172:0x026e, B:178:0x028d, B:145:0x01e8, B:147:0x01f0, B:149:0x01fb, B:180:0x0294, B:182:0x02a0, B:103:0x0130, B:57:0x00ac, B:62:0x00b7, B:63:0x00b9, B:173:0x027c, B:175:0x0282), top: B:189:0x002e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4 A[Catch: Exception -> 0x02a4, TryCatch #1 {Exception -> 0x02a4, blocks: (B:13:0x002e, B:15:0x0039, B:16:0x0041, B:21:0x004b, B:24:0x0054, B:26:0x005c, B:28:0x0060, B:30:0x0065, B:31:0x0069, B:36:0x0072, B:37:0x0075, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:46:0x0093, B:53:0x00a1, B:54:0x00a3, B:69:0x00ca, B:79:0x00de, B:81:0x00f4, B:83:0x00f8, B:85:0x00fc, B:87:0x0104, B:88:0x0108, B:90:0x0112, B:94:0x011b, B:96:0x0121, B:106:0x0147, B:108:0x014f, B:111:0x0159, B:113:0x0163, B:115:0x016f, B:131:0x01c1, B:130:0x01be, B:116:0x0176, B:118:0x017e, B:119:0x0185, B:121:0x018d, B:122:0x0199, B:124:0x01a1, B:125:0x01ad, B:127:0x01b5, B:133:0x01c5, B:134:0x01c9, B:138:0x01d2, B:140:0x01dd, B:150:0x0201, B:152:0x0207, B:154:0x0212, B:155:0x0217, B:157:0x021d, B:158:0x0223, B:165:0x0237, B:167:0x024e, B:169:0x0257, B:170:0x0267, B:172:0x026e, B:178:0x028d, B:145:0x01e8, B:147:0x01f0, B:149:0x01fb, B:180:0x0294, B:182:0x02a0, B:103:0x0130, B:57:0x00ac, B:62:0x00b7, B:63:0x00b9, B:173:0x027c, B:175:0x0282), top: B:189:0x002e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112 A[Catch: Exception -> 0x02a4, TryCatch #1 {Exception -> 0x02a4, blocks: (B:13:0x002e, B:15:0x0039, B:16:0x0041, B:21:0x004b, B:24:0x0054, B:26:0x005c, B:28:0x0060, B:30:0x0065, B:31:0x0069, B:36:0x0072, B:37:0x0075, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:46:0x0093, B:53:0x00a1, B:54:0x00a3, B:69:0x00ca, B:79:0x00de, B:81:0x00f4, B:83:0x00f8, B:85:0x00fc, B:87:0x0104, B:88:0x0108, B:90:0x0112, B:94:0x011b, B:96:0x0121, B:106:0x0147, B:108:0x014f, B:111:0x0159, B:113:0x0163, B:115:0x016f, B:131:0x01c1, B:130:0x01be, B:116:0x0176, B:118:0x017e, B:119:0x0185, B:121:0x018d, B:122:0x0199, B:124:0x01a1, B:125:0x01ad, B:127:0x01b5, B:133:0x01c5, B:134:0x01c9, B:138:0x01d2, B:140:0x01dd, B:150:0x0201, B:152:0x0207, B:154:0x0212, B:155:0x0217, B:157:0x021d, B:158:0x0223, B:165:0x0237, B:167:0x024e, B:169:0x0257, B:170:0x0267, B:172:0x026e, B:178:0x028d, B:145:0x01e8, B:147:0x01f0, B:149:0x01fb, B:180:0x0294, B:182:0x02a0, B:103:0x0130, B:57:0x00ac, B:62:0x00b7, B:63:0x00b9, B:173:0x027c, B:175:0x0282), top: B:189:0x002e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean filterUrl(android.webkit.WebView r25, java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.spark.AdSparkBizWebViewClientDelegate.filterUrl(android.webkit.WebView, java.lang.String):boolean");
    }

    @Override // X.C1039320d9W
    public void monitorAdOpenWebUrlRate(JSONObject jSONObject, boolean z) {
        C1038730d8Z c1038730d8Z;
        Long lLIZJ;
        C1041600dDC params = this.bulletBusiness.getParams();
        if ((params instanceof C1038730d8Z) && (c1038730d8Z = (C1038730d8Z) params) != null && (lLIZJ = c1038730d8Z.LJJLL.LIZJ()) != null && lLIZJ.longValue() > 0) {
            safePutJsonKV(jSONObject, "creativeId", c1038730d8Z.LJJLL.LIZJ());
            if (z) {
                if (this.startLoadUrlTimeStamp > 0) {
                    safePutJsonKV(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - this.startLoadUrlTimeStamp));
                }
            } else {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI("aweme_ad_landingpage_open_error", 1, jSONObject);
            }
            int i = !z ? 1 : 0;
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
            C793770VBv.LJIIJJI("aweme_ad_landingpage_open_error_rate", i, jSONObject);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C1039320d9W, X.AbstractC2205961BVi
    public void onPageFinished(WebView webView, String str) {
        Long lLIZJ;
        int i;
        super.onPageFinished(webView, str);
        XpathBusiness xpathBusiness = (XpathBusiness) this.bulletBusiness.LIZIZ(XpathBusiness.class);
        if (xpathBusiness != null) {
            xpathBusiness.xpathDirect(webView);
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            C1039200d9K c1039200d9K = adWebStatBusiness.LIZIZ;
            long jLIZJ = adWebStatBusiness.LIZJ();
            JSONObject jSONObjectLJFF = adWebStatBusiness.LJFF();
            JSONObject jSONObjectLIZIZ = adWebStatBusiness.LIZIZ(null, null);
            int iLJI = adWebStatBusiness.LJI();
            boolean zLIZ = C07J2.LIZ();
            c1039200d9K.getClass();
            if (!TextUtils.isEmpty(str) && !c1039200d9K.LIZJ && !c1039200d9K.LIZLLL) {
                c1039200d9K.LIZIZ = System.currentTimeMillis();
                c1039200d9K.LIZLLL = true;
                c1039200d9K.LIZIZ(str, jLIZJ, jSONObjectLJFF, jSONObjectLIZIZ, iLJI, zLIZ ? 1 : 0);
            }
            C1041600dDC c1041600dDC = adWebStatBusiness.LIZ.LIZIZ;
            if (c1041600dDC != null && (c1041600dDC instanceof C1038730d8Z)) {
                C1038730d8Z c1038730d8Z = (C1038730d8Z) c1041600dDC;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("cid", c1038730d8Z.LJJLL.LIZJ());
                    jSONObject.put("ad_type", c1038730d8Z.LJJZZI.LIZJ());
                    jSONObject.put("log_extra", c1038730d8Z.LJLJLJ.LIZJ());
                    jSONObject.put("download_url", c1038730d8Z.LJLJJI.LIZJ());
                    jSONObject.put("package_name", c1038730d8Z.LJLJJLL.LIZJ());
                    jSONObject.put("app_name", c1038730d8Z.LJLJJL.LIZJ());
                    Long lLIZJ2 = c1038730d8Z.LJJLL.LIZJ();
                    if (lLIZJ2 != null && lLIZJ2.longValue() != 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("code", i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
                C786410Ut5.J3(jSONObject);
                if (webView != null && (lLIZJ = c1038730d8Z.LJJLL.LIZJ()) != null) {
                    lLIZJ.longValue();
                }
            }
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.bulletBusiness.LIZIZ(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.LIZ(false, true);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.bulletBusiness.LIZIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.LIZ();
        }
    }

    @Override // X.AbstractC2205961BVi
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        PassBackWebInfoBusiness passBackWebInfoBusiness;
        if (webResourceRequest != null && webResourceRequest.getUrl() != null && (!webResourceRequest.getRequestHeaders().isEmpty()) && (passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.bulletBusiness.LIZIZ(PassBackWebInfoBusiness.class)) != null) {
            webResourceRequest.getUrl().toString();
            webResourceRequest.getRequestHeaders();
            passBackWebInfoBusiness.LIZ();
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // X.C1039320d9W, X.AbstractC2205961BVi
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return filterUrl(webView, commerceUrlFilter(str));
    }

    private final void reportIntentSchemeMonitor(String str, String str2, IntentSchemeInterceptConfig intentSchemeInterceptConfig) throws Throwable {
        String shortClassName;
        String shortClassName2;
        String strLJJIJIL;
        String strLJJIJIL2;
        String strLJJIJIIJIL;
        String strLJJIJIIJIL2;
        String string;
        if (str2 != null && !a0.LJJJIL(str2) && str != null && !a0.LJJJIL(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("scheme", str2);
            jSONObject.put("from", "AdSparkBizWebViewClientDelegate");
            if (intentSchemeInterceptConfig != null) {
                jSONObject.put("pattern", intentSchemeInterceptConfig.pattern);
                jSONObject.put("config_type", intentSchemeInterceptConfig.type);
            }
            if (Intrinsics.LJFF("intent", str2)) {
                try {
                    Intent uri = Intent.parseUri(str, 1);
                    if (uri != null) {
                        String str3 = uri.getPackage();
                        if (str3 != null && !a0.LJJJIL(str3)) {
                            jSONObject.put("package", uri.getPackage());
                        }
                        if (INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(uri) != null) {
                            Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(uri);
                            if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null) {
                                string = bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.toString();
                            } else {
                                string = null;
                            }
                            jSONObject.put("extra", string);
                        }
                        ComponentName component = uri.getComponent();
                        if (component != null && (strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm4Yo3FkhO1dHc+H9jVQ7a/GcVdfixk0IZ62U/8sM55j57GdwI=", null))) != null && (!a0.LJJJIL(strLJJIJIIJIL))) {
                            ComponentName component2 = uri.getComponent();
                            if (component2 != null) {
                                strLJJIJIIJIL2 = C2204961BRm.LJJIJIIJIL(component2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm4Yo3FkhO1dHc+H9jVQ7a/GcVdfixk0IZ62U/8sM55j57GdwI=", null));
                            } else {
                                strLJJIJIIJIL2 = null;
                            }
                            jSONObject.put("className", strLJJIJIIJIL2);
                        }
                        ComponentName component3 = uri.getComponent();
                        if (component3 != null && (strLJJIJIL = C2204961BRm.LJJIJIL(component3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm4Yo3FkhO1dHc+H9jVQ7a/GcVdfixk0IZ62U/8sM55j57GdwI=", null))) != null && (!a0.LJJJIL(strLJJIJIL))) {
                            ComponentName component4 = uri.getComponent();
                            if (component4 != null) {
                                strLJJIJIL2 = C2204961BRm.LJJIJIL(component4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm4Yo3FkhO1dHc+H9jVQ7a/GcVdfixk0IZ62U/8sM55j57GdwI=", null));
                            } else {
                                strLJJIJIL2 = null;
                            }
                            jSONObject.put("packageName", strLJJIJIL2);
                        }
                        ComponentName component5 = uri.getComponent();
                        if (component5 != null && (shortClassName = component5.getShortClassName()) != null && (!a0.LJJJIL(shortClassName))) {
                            ComponentName component6 = uri.getComponent();
                            if (component6 != null) {
                                shortClassName2 = component6.getShortClassName();
                            } else {
                                shortClassName2 = null;
                            }
                            jSONObject.put("shortClassName", shortClassName2);
                        }
                        String action = uri.getAction();
                        if (action != null && !a0.LJJJIL(action)) {
                            jSONObject.put("action", uri.getAction());
                        }
                        Set<String> categories = uri.getCategories();
                        if (categories != null && !categories.isEmpty()) {
                            jSONObject.put("categories", uri.getCategories().toString());
                        }
                        String dataString = uri.getDataString();
                        if (dataString != null && !a0.LJJJIL(dataString)) {
                            jSONObject.put("data", uri.getDataString());
                        }
                        String type = uri.getType();
                        if (type != null && !a0.LJJJIL(type)) {
                            jSONObject.put("type", uri.getType());
                        }
                        jSONObject.put("flag", uri.getFlags());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    jSONObject.put("exception_name", e.getClass().getSimpleName());
                    String message = e.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    jSONObject.put("exception_message", message);
                }
            }
            C0XJ6.LIZ("webview_intent_scheme_log", null, jSONObject);
        }
    }

    @Override // X.C1039320d9W, X.AbstractC2205961BVi
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        final AdWebStatBusiness adWebStatBusiness;
        String str2;
        boolean z;
        C1041880dDe c1041880dDe;
        SparkContext sparkContext;
        C1038730d8Z c1038730d8Z;
        String strLJIJI;
        Bundle bundle;
        this.startLoadUrlTimeStamp = SystemClock.elapsedRealtime();
        super.onPageStarted(webView, str, bitmap);
        C1039050d95 c1039050d95 = this.container;
        String strLJ = null;
        if (!c1039050d95.LLJJJJLIIL && (sparkContext = c1039050d95.LLIZLLLIL) != null && (c1038730d8Z = (C1038730d8Z) sparkContext.LJFF(C1038730d8Z.class)) != null) {
            c1039050d95.LLJ = c1038730d8Z;
            SparkContext sparkContext2 = c1039050d95.LLIZLLLIL;
            if (sparkContext2 != null) {
                strLJIJI = sparkContext2.LJIJI();
            } else {
                strLJIJI = null;
            }
            Uri uri = UriProtector.parse(strLJIJI);
            SparkContext sparkContext3 = c1039050d95.LLIZLLLIL;
            if (sparkContext3 != null) {
                bundle = (Bundle) sparkContext3.LJFF(Bundle.class);
            } else {
                bundle = null;
            }
            C1027660cqi c1027660cqi = new C1027660cqi();
            C1041690dDL.LIZ(uri, bundle, c1027660cqi);
            c1039050d95.LLJI = c1027660cqi;
            if (c1039050d95.LLJJLIIIJLLLLLLLZ) {
                c1038730d8Z.LLFZ = 1;
            }
            c1039050d95.LL.LJIIIIZZ(c1038730d8Z);
            c1039050d95.LL.LJFF(c1039050d95.LLJI);
        }
        C1039120d9C.LIZ(this.bulletBusiness);
        InterfaceC1039110d9B interfaceC1039110d9B = this.bulletBusiness;
        if (interfaceC1039110d9B != null && (adWebStatBusiness = (AdWebStatBusiness) interfaceC1039110d9B.LIZIZ(AdWebStatBusiness.class)) != null) {
            if (!adWebStatBusiness.LJIIIIZZ) {
                adWebStatBusiness.LJIIIIZZ = true;
                C1521250pgp c1521250pgpBuildConfig = WebViewMonitorHelper.getInstance().buildConfig();
                c1521250pgpBuildConfig.LJ = true;
                c1521250pgpBuildConfig.LIZ = new String[]{WebView.class.getName()};
                c1521250pgpBuildConfig.LJII = new InterfaceC1521890phr() { // from class: X.0d9O
                    @Override // X.InterfaceC1521890phr
                    public final void LIZ(long j) {
                        adWebStatBusiness.LJII = j;
                    }

                    @Override // X.InterfaceC1521890phr
                    public final void LIZIZ(int i, View view) {
                        String strLIZJ;
                        String str3;
                        C1038730d8Z c1038730d8Z2;
                        AdWebStatBusiness adWebStatBusiness2 = adWebStatBusiness;
                        C1039200d9K c1039200d9K = adWebStatBusiness2.LIZIZ;
                        String strLIZLLL = adWebStatBusiness2.LIZLLL();
                        C1041600dDC c1041600dDC = adWebStatBusiness.LIZ.LIZIZ;
                        if ((c1041600dDC instanceof C1038730d8Z) && (c1038730d8Z2 = (C1038730d8Z) c1041600dDC) != null) {
                            strLIZJ = c1038730d8Z2.LIZJ();
                        } else {
                            strLIZJ = "";
                        }
                        AdWebStatBusiness adWebStatBusiness3 = adWebStatBusiness;
                        long j = adWebStatBusiness3.LJII;
                        int iLJI = adWebStatBusiness3.LJI();
                        boolean z2 = c1039200d9K.LIZJ;
                        String str4 = CardStruct.IStatusCode.DEFAULT;
                        if (!z2 && c1039200d9K.LIZLLL && !c1039200d9K.LJ) {
                            str3 = "1";
                        } else {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        if (c1039200d9K.LJ) {
                            str4 = "2";
                        } else if (c1039200d9K.LIZIZ > 0) {
                            str4 = str3;
                        }
                        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "landing_page_blank", strLIZLLL, strLIZJ, null);
                        c1022820ciuLJ.LIZIZ(str4, "loading_status");
                        int i2 = 1;
                        if (c1039200d9K.LJIIIZ && c1039200d9K.LJIIJ != 1) {
                            i2 = 0;
                        }
                        c1022820ciuLJ.LIZIZ(Integer.valueOf(i2), "first_page");
                        c1022820ciuLJ.LIZIZ(0, "ix_to_externalurl");
                        c1022820ciuLJ.LIZIZ(Integer.valueOf(i), "is_blank");
                        c1022820ciuLJ.LIZIZ(Long.valueOf(j), "cost_time");
                        c1022820ciuLJ.LIZIZ(Integer.valueOf(iLJI), "landing_page_style");
                        c1022820ciuLJ.LJII();
                    }
                };
                WebViewMonitorHelper.getInstance().addConfig(c1521250pgpBuildConfig);
                WebViewMonitorHelper.getInstance().setTTWebDelegateEnable(true);
            }
            adWebStatBusiness.LJI.clear();
            C1039200d9K c1039200d9K = adWebStatBusiness.LIZIZ;
            C1027660cqi c1027660cqi2 = adWebStatBusiness.LIZ.LIZJ;
            if (c1027660cqi2 == null || (c1041880dDe = c1027660cqi2.LJLILLLLZI) == null || (str2 = (String) c1041880dDe.LIZJ()) == null) {
                str2 = "";
            }
            c1039200d9K.getClass();
            if (webView != null && !TextUtils.isEmpty(str)) {
                if (c1039200d9K.LJIIIZ && !c1039200d9K.LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                if (c1039200d9K.LJFF == null) {
                    c1039200d9K.LJFF = str;
                }
                if (c1039200d9K.LIZ == 0) {
                    c1039200d9K.LIZ = System.currentTimeMillis();
                }
                c1039200d9K.LJII = str2;
                c1039200d9K.LJIIIZ = true;
                c1039200d9K.LJIIIIZZ = false;
                if (!z) {
                    c1039200d9K.LJIIJ++;
                }
                if (c1039200d9K.LJIIJ == 2) {
                    c1039200d9K.LIZLLL = false;
                }
            }
            C1041600dDC c1041600dDC = adWebStatBusiness.LIZ.LIZIZ;
            if (c1041600dDC != null && (c1041600dDC instanceof C1038730d8Z)) {
                if (!Intrinsics.LJFF(str, "about:blank") && !adWebStatBusiness.LJFF) {
                    C988570bpf.LIZ.getClass();
                    if (C1041070dCL.LIZ() != null) {
                        C1038730d8Z c1038730d8Z2 = (C1038730d8Z) c1041600dDC;
                        c1038730d8Z2.LJJJLZIJ.LIZJ();
                        c1038730d8Z2.LJJJZ.LIZJ();
                        Integer numLIZJ = c1038730d8Z2.LJJL.LIZJ();
                        if (numLIZJ != null) {
                            numLIZJ.intValue();
                        }
                        adWebStatBusiness.LJIIIIZZ();
                        c1038730d8Z2.LIZJ();
                        adWebStatBusiness.LIZLLL();
                        Boolean boolLIZJ = c1038730d8Z2.LJJLIL.LIZJ();
                        if (boolLIZJ != null) {
                            boolLIZJ.booleanValue();
                        }
                        C1028210crb.LJIIZILJ();
                    }
                    adWebStatBusiness.LJFF = true;
                }
                try {
                    C988570bpf.LIZ.getClass();
                    InterfaceC1037730d6x interfaceC1037730d6xLIZJ = C1041070dCL.LIZJ();
                    if (interfaceC1037730d6xLIZJ != null) {
                        strLJ = C1040370dBD.LJ();
                    }
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService != null) {
                        iAdLandPagePreloadService.Q0(strLJ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.bulletBusiness.LIZIZ(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null && TextUtils.isEmpty(passBackWebInfoBusiness.LJFF) && !TextUtils.isEmpty(str)) {
            passBackWebInfoBusiness.LJFF = str;
            if (str != null && !TextUtils.equals("about:blank", str)) {
                ((Map) passBackWebInfoBusiness.LIZJ.getValue()).put(URLEncoder.encode(str, "UTF-8"), "");
            }
        }
    }

    @Override // X.C1039320d9W, X.AbstractC2205961BVi
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String string;
        String string2;
        CharSequence description;
        Uri url;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            Integer numValueOf = null;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                string = url.toString();
            } else {
                string = null;
            }
            if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                string2 = description.toString();
            } else {
                string2 = null;
                if (webResourceError != null) {
                }
                adWebStatBusiness.LJIIIZ(numValueOf, string, string2);
            }
            numValueOf = Integer.valueOf(webResourceError.getErrorCode());
            adWebStatBusiness.LJIIIZ(numValueOf, string, string2);
        }
    }

    @Override // X.AbstractC2205961BVi
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String string;
        String reasonPhrase;
        Uri url;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            Integer numValueOf = null;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                string = url.toString();
            } else {
                string = null;
            }
            if (webResourceResponse != null) {
                reasonPhrase = webResourceResponse.getReasonPhrase();
                numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
            } else {
                reasonPhrase = null;
            }
            adWebStatBusiness.LJIIIZ(numValueOf, string, reasonPhrase);
        }
    }

    private final boolean handleOneJumpWithIntent(String str, boolean z, String str2, WebView webView) {
        String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && Intrinsics.LJFF("intent", str) && !z) {
            try {
                Intent uri = Intent.parseUri(str2, 1);
                if (uri != null && (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(uri, "browser_fallback_url")) != null) {
                    if (webView != null) {
                        C786410Ut5.ue(webView, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    }
                    return true;
                }
            } catch (URISyntaxException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        return false;
    }

    @Override // X.C1039320d9W, X.AbstractC2205961BVi
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZIZ(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.LJIIIZ(Integer.valueOf(i), str2, str);
        }
    }

    private final boolean handleOpenVastApp(Uri uri, String str, Context context, String str2, Aweme aweme, boolean z) {
        C988570bpf.LIZ.getClass();
        InterfaceC988110bov interfaceC988110bovLIZ = C1041070dCL.LIZ();
        if (interfaceC988110bovLIZ != null) {
            Boolean bool = Boolean.FALSE;
            return ((C1028210crb) interfaceC988110bovLIZ).LJIIJ(uri, str, context, str2, aweme, z, false, null, bool, bool);
        }
        return false;
    }

    private final boolean handleTwoJumpWithIntentOrMarket(Aweme aweme, String str, Uri uri, String str2, boolean z, String str3, WebView webView) throws Throwable {
        Intent uri2;
        Context baseContext;
        PackageManager packageManager;
        Activity activityLIZ;
        PackageManager packageManager2;
        String strLJJIJIL;
        ActivityInfo activityInfoResolveActivityInfo;
        if (!TextUtils.isEmpty(str) && uri != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (Intrinsics.LJFF("market", str2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.addFlags(268435456);
                reportH5SchemeEvent(str3);
                Activity activity = this.bulletBusiness.getActivity();
                if (activity != null) {
                    INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intent);
                }
                return true;
            }
            if (Intrinsics.LJFF("intent", str2) && z) {
                String str4 = null;
                try {
                    uri2 = Intent.parseUri(str3, 1);
                } catch (URISyntaxException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    uri2 = null;
                }
                Activity activity2 = this.bulletBusiness.getActivity();
                if (activity2 != null) {
                    baseContext = activity2.getBaseContext();
                } else {
                    baseContext = null;
                }
                if (baseContext != null && uri2 != null && (activityLIZ = C1388190mED.LIZ(baseContext)) != null && (packageManager2 = activityLIZ.getPackageManager()) != null) {
                    String packageName = baseContext.getPackageName();
                    ComponentName component = uri2.getComponent();
                    if (component != null) {
                        strLJJIJIL = C2204961BRm.LJJIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOMMEXVCrEGGlwwDGXAg==", null));
                    } else {
                        strLJJIJIL = null;
                    }
                    if (!Intrinsics.LJFF(packageName, strLJJIJIL) && (activityInfoResolveActivityInfo = uri2.resolveActivityInfo(packageManager2, 65536)) != null && activityInfoResolveActivityInfo.exported) {
                        HashSet hashSet = new HashSet();
                        hashSet.add("android.intent.action.CHOOSER");
                        hashSet.add("android.intent.action.SEND");
                        hashSet.add("android.intent.action.SEND_MULTIPLE");
                        hashSet.add("android.media.action.IMAGE_CAPTURE");
                        hashSet.add("android.media.action.IMAGE_CAPTURE_SECURE");
                        hashSet.add("android.media.action.VIDEO_CAPTURE");
                        if (!C13LP.LJJJJ(uri2.getAction(), hashSet)) {
                            C2429209fW.LIZ().appendDataFlowId(uri2, 1207964161);
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(baseContext, uri2, "Context_startActivity_1");
                            C1701330uNH.LIZ(uri2, baseContext);
                            C2204961BRm.LJJJJJL(baseContext, uri2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOMMEXVCrEGGlwwDGXAg==", null));
                            reportH5SchemeEvent(str3);
                            return true;
                        }
                    }
                }
                Activity activity3 = this.bulletBusiness.getActivity();
                if (activity3 != null) {
                    packageManager = activity3.getPackageManager();
                } else {
                    packageManager = null;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW");
                if (uri2 != null) {
                    C988570bpf.LIZ.getClass();
                    if (C1041070dCL.LIZ() != null && C1028210crb.LJIIJJI(this.bulletBusiness.getActivity())) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("market://details?id=");
                        sbLIZ.append(uri2.getPackage());
                        intent2.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                        if (packageManager != null && intent2.resolveActivity(packageManager) != null) {
                            uri2.addFlags(268435456);
                            C2429209fW.LIZ().appendDataFlowId(uri2, 1207965953);
                            reportH5SchemeEvent(str3);
                            Activity activity4 = this.bulletBusiness.getActivity();
                            if (activity4 != null) {
                                INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_bytedance_router_monitor_page_PageLancet_startActivity(activity4, intent2);
                            }
                            return true;
                        }
                    }
                    String strINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(uri2, "browser_fallback_url");
                    if (strINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null) {
                        if (webView != null) {
                            C786410Ut5.ue(webView, strINVOKEVIRTUAL_com_ss_android_ugc_aweme_spark_AdSparkBizWebViewClientDelegate_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                        }
                        return true;
                    }
                }
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null && !C1028210crb.LJIIJJI(this.bulletBusiness.getActivity())) {
                    Activity activity5 = this.bulletBusiness.getActivity();
                    if (uri2 != null) {
                        str4 = uri2.getPackage();
                    }
                    return C1028210crb.LJIJJ(activity5, str4);
                }
            }
        }
        return false;
    }
}

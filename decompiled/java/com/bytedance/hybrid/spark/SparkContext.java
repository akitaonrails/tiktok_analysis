package com.bytedance.hybrid.spark;

import X.AbstractC1067810dtT;
import X.AbstractC1076640e7i;
import X.AbstractC1539010q9T;
import X.AbstractC1542100qES;
import X.AbstractC1542200qEc;
import X.C01GW;
import X.C098200Yq;
import X.C1051650dTP;
import X.C1067780dtQ;
import X.C1067790dtR;
import X.C1075480e5q;
import X.C1075530e5v;
import X.C1326430kcb;
import X.C1524270plh;
import X.C1529830puf;
import X.C1529860pui;
import X.C1529880puk;
import X.C1530570pvr;
import X.C1532950pzh;
import X.C1533020pzo;
import X.C1535610q3z;
import X.C1535630q41;
import X.C1537170q6V;
import X.C1537480q70;
import X.C1537510q73;
import X.C1537540q76;
import X.C1538070q7x;
import X.C1538190q89;
import X.C1538200q8A;
import X.C1540320qBa;
import X.C1540330qBb;
import X.C1542410qEx;
import X.C1545480qJu;
import X.C1545530qJz;
import X.C1545570qK3;
import X.C1545580qK4;
import X.C1545590qK5;
import X.C1545810qKR;
import X.C1545820qKS;
import X.C1545830qKT;
import X.C1545870qKX;
import X.C1546010qKl;
import X.C1550300qRg;
import X.C1550360qRm;
import X.C189200o6;
import X.C1946007jm;
import X.C1954807lC;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2117708Rj;
import X.C2282808x0;
import X.C2819017h;
import X.C786410Ut5;
import X.C905703gN;
import X.EnumC1042550dEj;
import X.EnumC1160910gJd;
import X.EnumC1537220q6a;
import X.InterfaceC1059280dfi;
import X.InterfaceC1163110gNB;
import X.InterfaceC1294060jmO;
import X.InterfaceC1531560pxS;
import X.InterfaceC1540940qCa;
import X.InterfaceC1542060qEO;
import X.InterfaceC1542250qEh;
import X.InterfaceC1542320qEo;
import X.InterfaceC1542790qFZ;
import X.InterfaceC1545600qK6;
import X.InterfaceC1546060qKq;
import X.InterfaceC1554220qY0;
import X.InterfaceC1892990zMP;
import X.InterfaceC2217701Bqy;
import X.InterfaceC2217711Bqz;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.roma.IRomaOfflineService;
import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SparkContext extends C1537480q70 implements Parcelable {
    public static final Parcelable.Creator<SparkContext> CREATOR;
    public static final C1529880puk Companion = new C1529880puk();
    public static boolean fixDefaultSchemaType;
    public ThirdPartyBizCert bizCert;
    public Bundle bundle;
    public int containerType;
    public boolean disableSeclinkExplicit;
    public EnumC1042550dEj forceHybridRuntimeTypeInBlankPage;
    public C1532950pzh forestX;
    public String fullUrl;
    public boolean hasBootSSP;
    public boolean hasExecuteGlobalPreHandler;
    public boolean hasHandleBySecurityLayer;
    public boolean hasParseSchema;
    public boolean isPrepared;
    public String originShortLink;
    public int pageType;
    public final Function1<Context, InterfaceC1540940qCa> performanceViewInvoke;
    public SchemaBundle schemaBundle;
    public SparkSchemaParam schemaParams;
    public C1524270plh session;
    public String sessionTag;
    public ConcurrentHashMap<String, String> shortLinkUrlCacheMap;
    public int requestCode = -1;
    public ConcurrentHashMap<String, String> defaultParams = new ConcurrentHashMap<>();
    public C1537510q73 extraRuntimeInfo = new C1537510q73();
    public boolean autoLoad = true;

    public final String LJJJIL() {
        int i = C1540330qBb.LIZ[LJIIZILJ(null).ordinal()];
        if (i == 1) {
            return "light";
        }
        if (i == 2) {
            return "dark";
        }
        if (i == 3) {
            return "const";
        }
        throw new C1954807lC();
    }

    public final void LJJJJLI() {
        this.hasHandleBySecurityLayer = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        Object c098200Yq;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("fix_default_schema_type");
            c098200Yq = config != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        fixDefaultSchemaType = bool != null ? bool.booleanValue() : true;
        CREATOR = new Parcelable.Creator<SparkContext>() { // from class: X.0dVg
            @Override // android.os.Parcelable.Creator
            public final SparkContext createFromParcel(Parcel parcel) {
                SparkContext sparkContext = new SparkContext();
                C905703gN.LIZ.getClass();
                return sparkContext;
            }

            @Override // android.os.Parcelable.Creator
            public final SparkContext[] newArray(int i) {
                return new SparkContext[i];
            }
        };
    }

    @Override // X.C1537480q70, X.InterfaceC1532890pzb
    public final Map<String, String> LIZ() {
        Map<String, String> allQueries;
        SchemaBundle schemaBundle = this.schemaBundle;
        return (schemaBundle == null || (allQueries = schemaBundle.getAllQueries()) == null) ? super.LIZ() : allQueries;
    }

    @Override // X.C1537480q70
    public final int LJ() {
        String string;
        ThirdPartyBizCert thirdPartyBizCert = this.bizCert;
        if (thirdPartyBizCert != null) {
            return thirdPartyBizCert.dataflowId;
        }
        Bundle bundle = this.bundle;
        int i = 0;
        if (bundle == null || !bundle.containsKey("dataflowId")) {
            return 0;
        }
        try {
            Bundle bundle2 = this.bundle;
            if (bundle2 == null || (string = bundle2.getString("dataflowId")) == null) {
                return 0;
            }
            i = CastIntegerProtector.parseInt(string);
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    @Override // X.C1537480q70
    public final C1532950pzh LJI() {
        C1532950pzh c1532950pzh = this.forestX;
        if (c1532950pzh == null) {
            C1535610q3z c1535610q3z = (C1535610q3z) LJFF(C1535610q3z.class);
            if ((c1535610q3z == null || (c1532950pzh = c1535610q3z.LIZ) == null) && (c1532950pzh = (C1532950pzh) LJFF(C1532950pzh.class)) == null) {
                C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
                C1535610q3z c1535610q3z2 = (C1535610q3z) C1075530e5v.LIZIZ().LIZIZ(C1535610q3z.class, this.bid);
                c1532950pzh = c1535610q3z2 != null ? c1535610q3z2.LIZ : null;
            }
            this.forestX = c1532950pzh;
        }
        return c1532950pzh;
    }

    @Override // X.C1537480q70
    public final String LJII() {
        String surl;
        String url;
        SparkSchemaParam sparkSchemaParam = this.schemaParams;
        if (sparkSchemaParam != null && (url = sparkSchemaParam.getUrl()) != null && (!a0.LJJJIL(url))) {
            return url;
        }
        SparkSchemaParam sparkSchemaParam2 = this.schemaParams;
        return (sparkSchemaParam2 == null || (surl = sparkSchemaParam2.getSurl()) == null || !(a0.LJJJIL(surl) ^ true)) ? super.LJII() : surl;
    }

    @Override // X.C1537480q70
    public final String LJIIJJI() {
        String strLIZ;
        C1524270plh c1524270plh = this.session;
        return (c1524270plh == null || (strLIZ = c1524270plh.LIZ()) == null) ? "unknown" : strLIZ;
    }

    @Override // X.C1537480q70
    public final double LJIILL() {
        return C1545580qK4.LIZIZ.getSampleRatio(LJIIJJI());
    }

    @Override // X.C1537480q70
    public final void LJIJJLI() {
        LJJJI(this.pageType);
    }

    @Override // X.C1537480q70
    public final boolean LJJIJIIJI() {
        SparkSchemaParam sparkSchemaParam = this.schemaParams;
        return (sparkSchemaParam != null && sparkSchemaParam.getUseForest()) || super.LJJIJIIJI();
    }

    public final void LJJIJL() {
        String url;
        SchemaBundle schemaBundle = this.schemaBundle;
        if (schemaBundle == null || (url = schemaBundle.getUrl()) == null) {
            return;
        }
        LJJIIZ(url);
        this.hasParseSchema = false;
    }

    public final InterfaceC1059280dfi LJJIJLIJ() {
        InterfaceC1059280dfi interfaceC1059280dfi;
        String str = this.containerId;
        if (str != null) {
            Map<String, String> map = C1529860pui.LIZ;
            C1537480q70.Companion.getClass();
            if (map.containsKey(C1529830puf.LIZ(str)) && str != null) {
                Map<String, String> map2 = C1529860pui.LIZ;
                C1537480q70.Companion.getClass();
                String str2 = (String) ((LinkedHashMap) map2).get(C1529830puf.LIZ(str));
                if (str2 != null) {
                    str = str2;
                }
            }
        }
        Companion.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(str);
        return (c1537480q70LIZIZ == null || (interfaceC1059280dfi = (InterfaceC1059280dfi) c1537480q70LIZIZ.LJFF(InterfaceC1059280dfi.class)) == null) ? (InterfaceC1059280dfi) LJFF(InterfaceC1059280dfi.class) : interfaceC1059280dfi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIL() {
        /*
            r6 = this;
            X.0qJu r1 = X.C1545480qJu.LIZ
            java.lang.String r0 = r6.containerId
            r1.getClass()
            java.util.Map r2 = X.C08RQ.LIZJ(r0)
            java.lang.String r0 = r6.LJIJI()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            boolean r0 = r1.isHierarchical()
            if (r0 != 0) goto L20
            java.lang.String r0 = r6.LJIJI()
            r6.fullUrl = r0
            return r0
        L20:
            android.net.Uri$Builder r5 = r1.buildUpon()
            java.util.Set r4 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r1)
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L63
        L30:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L63
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L4a
            java.lang.Object r0 = r2.getKey()     // Catch: java.lang.Throwable -> L63
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> L63
            r0 = 1
            if (r1 != r0) goto L4a
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r0 != 0) goto L30
            java.lang.Object r1 = r2.getKey()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L63
            r5.appendQueryParameter(r1, r0)     // Catch: java.lang.Throwable -> L63
            goto L30
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L63
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L63
            goto L6f
        L63:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L6f:
            android.net.Uri r0 = r5.build()
            java.lang.String r0 = r0.toString()
            r6.fullUrl = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.SparkContext.LJJIL():java.lang.String");
    }

    public SparkContext() {
        this.pageType = 3;
        this.pageType = fixDefaultSchemaType ? -1 : 3;
        C1537480q70.Companion.getClass();
        this.containerType = C1537480q70.CONTAINER_TYPE_SPARK;
        this.fullUrl = "";
        this.performanceViewInvoke = new C1051650dTP(this);
    }

    @Override // X.C1537480q70
    public final boolean LJIIIIZZ() {
        return this.hasHandleBySecurityLayer;
    }

    @Override // X.C1537480q70
    public final Function1<Context, InterfaceC1540940qCa> LJIIL() {
        return this.performanceViewInvoke;
    }

    public final Map<String, String> LJJJ() {
        return this.defaultParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    @Override // X.C1537480q70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1540340qBc LJIIZILJ(android.content.Context r4) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.SparkContext.LJIIZILJ(android.content.Context):X.0qBc");
    }

    @Override // X.C1537480q70
    public final void LJIL(String str) throws JSONException {
        String strLIZIZ;
        String str2;
        String str3;
        C1524270plh c1524270plh;
        boolean z;
        ConcurrentHashMap<String, String> concurrentHashMap;
        C1545590qK5 c1545590qK5 = C1545590qK5.LIZIZ;
        String str4 = null;
        if (c1545590qK5.LIZLLL(str)) {
            this.originShortLink = str;
            ConcurrentHashMap<String, String> concurrentHashMap2 = this.shortLinkUrlCacheMap;
            if (concurrentHashMap2 == null || concurrentHashMap2.get(str) == null || (concurrentHashMap = this.shortLinkUrlCacheMap) == null || (strLIZIZ = concurrentHashMap.get(str)) == null) {
                C2117708Rj c2117708Rj = new C2117708Rj(str);
                Map mapLJ = this.defaultParams;
                Map<String, String> map = c2117708Rj.LIZ;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                ((HashMap) map).putAll(mapLJ);
                c2117708Rj.LIZ(this.bundle);
                strLIZIZ = c1545590qK5.LIZIZ(str, c2117708Rj.LIZ);
                ConcurrentHashMap<String, String> concurrentHashMap3 = this.shortLinkUrlCacheMap;
                if (concurrentHashMap3 != null) {
                    concurrentHashMap3.put(str, strLIZIZ);
                }
            }
            LJJIIZ(strLIZIZ);
            this.schemaBundle = null;
            InterfaceC1531560pxS interfaceC1531560pxS = this.hybridParams;
            if (interfaceC1531560pxS != null) {
                interfaceC1531560pxS.LJI(C1537540q76.LJ(LJJIL()));
            }
        } else {
            strLIZIZ = null;
        }
        C1545580qK4 c1545580qK4 = C1545580qK4.LIZIZ;
        if (strLIZIZ == null) {
            strLIZIZ = str;
        }
        InterfaceC1546060qKq interfaceC1546060qKqLJ = c1545580qK4.LJ(strLIZIZ);
        if (interfaceC1546060qKqLJ != null) {
            LJJ(InterfaceC1546060qKq.class, interfaceC1546060qKqLJ);
            final String accessKey = interfaceC1546060qKqLJ.getAccessKey();
            if (accessKey != null && accessKey.length() != 0) {
                LJJJZ("access_key", accessKey);
                LJJ(AbstractC1076640e7i.class, new AbstractC1076640e7i() { // from class: X.0qK7
                    @Override // X.AbstractC1076640e7i
                    public final C1533560q0g LIZ(C1533560q0g c1533560q0g) {
                        C1533570q0h c1533570q0h = c1533560q0g.LIZIZ;
                        if (c1533570q0h != null) {
                            c1533570q0h.LIZ = accessKey;
                        }
                        return c1533560q0g;
                    }
                });
            }
        }
        C1545570qK3 c1545570qK3LIZ = C1545530qJz.LIZ(null, str);
        if (c1545570qK3LIZ == null) {
            this.session = null;
            return;
        }
        C1524270plh c1524270plh2 = this.session;
        if (c1524270plh2 != null) {
            str2 = c1524270plh2.LIZJ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, c1545570qK3LIZ.LIZ)) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap4 = this.defaultParams;
        Bundle bundle = this.bundle;
        SparkSchemaParam sparkSchemaParamLIZIZ = C1545480qJu.LIZIZ(str, null, null, "");
        int i = C1067780dtQ.LIZ[sparkSchemaParamLIZIZ.getEngineType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            str3 = "lynxJsRuntime";
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        str3 = "sdui";
                    }
                } else {
                    str3 = "lynx";
                }
            } else {
                str3 = "web";
            }
        } else {
            str3 = "unknown";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", c1545570qK3LIZ.LIZ);
        jSONObject.put("engine_type", str3);
        String pageName = sparkSchemaParamLIZIZ.getPageName();
        if (pageName != null && !a0.LJJJIL(pageName)) {
            c1524270plh = new C1524270plh(pageName, null, c1545570qK3LIZ.LIZ);
            jSONObject.put("page_name", pageName);
            C1067790dtR.LIZ(jSONObject);
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(concurrentHashMap4);
            if (bundle != null) {
                for (String str5 : bundle.keySet()) {
                    String string = bundle.getString(str5);
                    if (string != null) {
                        linkedHashMap.put(str5, string);
                    }
                }
            }
            C1545830qKT c1545830qKTLJFF = C1545580qK4.LIZIZ.LJFF(new C1550360qRm(str, c1545570qK3LIZ.LIZ, c1545570qK3LIZ.LIZJ, c1545570qK3LIZ.LIZIZ, linkedHashMap));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String str6 = c1545830qKTLJFF.LIZIZ;
            String str7 = c1545830qKTLJFF.LIZLLL;
            String str8 = c1545830qKTLJFF.LIZJ;
            c1524270plh = new C1524270plh(str6, str7, c1545570qK3LIZ.LIZ);
            jSONObject.put("match_duration", jCurrentTimeMillis2 - jCurrentTimeMillis);
            jSONObject.put("pattern", str7);
            jSONObject.put("name", str6);
            if (c1545830qKTLJFF.LIZ == EnumC1160910gJd.DISABLED) {
                C1067790dtR.LIZ(jSONObject);
            } else {
                jSONObject.put("origin_schema", str);
                if (str6 != null && !a0.LJJJIL(str6)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && str8 != null && !a0.LJJJIL(str8)) {
                    C1545570qK3 c1545570qK3LIZ2 = C1545530qJz.LIZ(null, str8);
                    if (c1545570qK3LIZ2 != null) {
                        str4 = c1545570qK3LIZ2.LIZ;
                    }
                    if (!Intrinsics.LJFF(str4, c1545570qK3LIZ.LIZ)) {
                        jSONObject.put("match_status", -3);
                    } else {
                        LJJIIZ(str8);
                        InterfaceC1531560pxS interfaceC1531560pxS2 = this.hybridParams;
                        if (interfaceC1531560pxS2 != null) {
                            interfaceC1531560pxS2.LJI(C1537540q76.LJ(LJJIL()));
                        }
                        jSONObject.put("match_status", 1);
                    }
                    C1067790dtR.LIZ(jSONObject);
                } else if (str6 != null && !a0.LJJJIL(str6) && c1545830qKTLJFF.LIZ != EnumC1160910gJd.NO_MATCHED_NAME) {
                    jSONObject.put("match_status", -2);
                    C1067790dtR.LIZ(jSONObject);
                } else {
                    jSONObject.put("match_status", -1);
                    C1067790dtR.LIZ(jSONObject);
                    String str9 = c1545570qK3LIZ.LIZ;
                    if (C1550300qRg.LIZIZ.isLocalTest()) {
                        IRomaOfflineService.LIZ.getClass();
                        IRomaOfflineService value = C2282808x0.LIZIZ.getValue();
                        if (value != null) {
                            C786410Ut5.LJLIIL(300L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS85S0200000_16(this, value, str9, new WeakReference(this), 3));
                        }
                    }
                }
            }
        }
        this.session = c1524270plh;
    }

    public final SparkSchemaParam LJJJI(int i) {
        Long l;
        boolean z;
        int i2 = this.pageType;
        if (i > 0) {
            this.pageType = i;
        }
        if (i2 != this.pageType) {
            this.hasParseSchema = false;
        }
        if (!this.hasParseSchema) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1538200q8A c1538200q8A = (C1538200q8A) LJFF(C1538200q8A.class);
            if (c1538200q8A != null) {
                l = c1538200q8A.LIZLLL;
            } else {
                l = null;
            }
            if (l != null) {
                z = true;
            } else {
                z = false;
                C1530570pvr.LIZJ(this, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_INIT_DATA_START}, Long.valueOf(jCurrentTimeMillis));
            }
            C1538200q8A c1538200q8A2 = (C1538200q8A) LJFF(C1538200q8A.class);
            if (c1538200q8A2 != null) {
                c1538200q8A2.LIZLLL = Long.valueOf(jCurrentTimeMillis);
            }
            if (i <= 0 && (i = this.pageType) <= 0) {
                i = C1542410qEx.LIZ(LJIJI());
            }
            LJJJJIZL(i);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (!z) {
                C1530570pvr.LIZJ(this, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_INIT_DATA_END}, Long.valueOf(jCurrentTimeMillis2));
            }
            LJFF(C1538200q8A.class);
        }
        return this.schemaParams;
    }

    public final Integer LJJJJ(Context context) {
        InterfaceC1545600qK6 interfaceC1545600qK6LIZLLL;
        InterfaceC1542060qEO interfaceC1542060qEO = C1546010qKl.LIZ;
        if (interfaceC1542060qEO == null || (interfaceC1545600qK6LIZLLL = interfaceC1542060qEO.LIZLLL()) == null || !C1540320qBa.LIZ) {
            return null;
        }
        int i = C1540330qBb.LIZ[LJIIZILJ(context).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return Integer.valueOf(interfaceC1545600qK6LIZLLL.LJ());
        }
        return Integer.valueOf(interfaceC1545600qK6LIZLLL.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:465:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0aac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL(int r14) {
        /*
            Method dump skipped, instruction units count: 2735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.SparkContext.LJJJJIZL(int):void");
    }

    public final void LJJJJJ(InterfaceC1059280dfi interfaceC1059280dfi) {
        LJJ(InterfaceC1059280dfi.class, interfaceC1059280dfi);
    }

    public final void LJJJJJL(C1532950pzh c1532950pzh) {
        this.forestX = c1532950pzh;
        C1533020pzo c1533020pzo = this.resourceGroup;
        if (c1533020pzo != null) {
            if (c1532950pzh == null) {
                c1532950pzh = c1533020pzo.LJIIIIZZ;
            }
            c1533020pzo.LJIIIIZZ = c1532950pzh;
        }
    }

    public final void LJJJJL(Bundle bundle) {
        this.bundle = bundle;
        this.hasParseSchema = false;
    }

    @InterfaceC1294060jmO
    public final void LJJJJLL(AbstractC1542100qES abstractC1542100qES) {
        LJJ(AbstractC1542100qES.class, abstractC1542100qES);
        LJJIJIIJIL(new C1538190q89(abstractC1542100qES));
    }

    public final void LJJJJZ(AbstractC1539010q9T abstractC1539010q9T) {
        LJJ(AbstractC1539010q9T.class, abstractC1539010q9T);
    }

    public final void LJJJJZI(AbstractC1542200qEc abstractC1542200qEc) {
        LJJ(AbstractC1542200qEc.class, abstractC1542200qEc);
        LJJIJIIJIL(new C1538190q89(abstractC1542200qEc));
    }

    public final void LJJJLIIL(InterfaceC1542790qFZ interfaceC1542790qFZ) {
        LJJ(InterfaceC1542790qFZ.class, interfaceC1542790qFZ);
    }

    public final void LJJLI(Map map) {
        Boolean bool;
        Double d;
        Integer num;
        String str;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                Object value2 = entry.getValue();
                if ((value2 instanceof Boolean) && (bool = (Boolean) value2) != null) {
                    LJJL(String.valueOf(entry.getKey()), bool.booleanValue());
                }
            } else if (value instanceof Double) {
                Object value3 = entry.getValue();
                if ((value3 instanceof Double) && (d = (Double) value3) != null) {
                    LJJJLL(d.doubleValue(), String.valueOf(entry.getKey()));
                }
            } else if (value instanceof Integer) {
                Object value4 = entry.getValue();
                if ((value4 instanceof Integer) && (num = (Integer) value4) != null) {
                    LJJJLZIJ(num.intValue(), String.valueOf(entry.getKey()));
                }
            } else if (value instanceof String) {
                Object value5 = entry.getValue();
                if ((value5 instanceof String) && (str = (String) value5) != null) {
                    LJJJZ(String.valueOf(entry.getKey()), str);
                }
            }
        }
    }

    public final void LJJLIIIIJ(AbstractC1067810dtT abstractC1067810dtT) {
        LJJ(InterfaceC1542250qEh.class, abstractC1067810dtT);
    }

    public final void LJJLIIIJILLIZJL(Map map) {
        this.extraRuntimeInfo.putAll(map);
        this.hasParseSchema = false;
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        C1326430kcb.LIZ().LJ(this.containerId, map);
    }

    public final synchronized void LJJLIIIJJI(InterfaceC2217701Bqy interfaceC2217701Bqy) {
        C1545810qKR c1545810qKR = (C1545810qKR) LJFF(C1545810qKR.class);
        if (c1545810qKR == null) {
            c1545810qKR = new C1545810qKR(new ArrayList());
        }
        c1545810qKR.LL.add(interfaceC2217701Bqy);
        LJJ(C1545810qKR.class, c1545810qKR);
    }

    public final synchronized void LJJLIIIJJIZ(InterfaceC1554220qY0 interfaceC1554220qY0) {
        C1545870qKX c1545870qKX = (C1545870qKX) LJFF(C1545870qKX.class);
        if (c1545870qKX == null) {
            c1545870qKX = new C1545870qKX(new ArrayList());
        }
        c1545870qKX.LIZ.add(interfaceC1554220qY0);
        LJJ(C1545870qKX.class, c1545870qKX);
    }

    public final synchronized void LJJLIIIJL(InterfaceC2217711Bqz interfaceC2217711Bqz) {
        C1545820qKS c1545820qKS = (C1545820qKS) LJFF(C1545820qKS.class);
        if (c1545820qKS == null) {
            c1545820qKS = new C1545820qKS(new ArrayList());
        }
        c1545820qKS.LL.add(interfaceC2217711Bqz);
        LJJ(C1545820qKS.class, c1545820qKS);
    }

    public final void LJJLIIIJLJLI(InterfaceC1163110gNB interfaceC1163110gNB) {
        LJJ(InterfaceC1163110gNB.class, interfaceC1163110gNB);
    }

    public final void LJJLIIIJLLLLLLLZ(InterfaceC1892990zMP interfaceC1892990zMP) {
        LJJ(InterfaceC1892990zMP.class, interfaceC1892990zMP);
    }

    public final void LJJLIIJ(String str) {
        LJJIIZ(str);
        this.schemaBundle = null;
        this.hasParseSchema = false;
        InterfaceC1531560pxS interfaceC1531560pxS = this.hybridParams;
        if (interfaceC1531560pxS != null) {
            interfaceC1531560pxS.LJI(C1537540q76.LJ(LJJIL()));
        }
    }

    public final void LJJLIL(InterfaceC1542320qEo interfaceC1542320qEo) {
        LJJ(InterfaceC1542320qEo.class, interfaceC1542320qEo);
    }

    @Override // X.C1537480q70, X.InterfaceC679950Qll
    public final String get(String str) {
        String str2 = this.defaultParams.get(str);
        if (str2 == null) {
            return super.get(str);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006d A[PHI: r0
      0x006d: PHI (r0v11 com.bytedance.forest.Forest) = (r0v10 com.bytedance.forest.Forest), (r0v14 com.bytedance.forest.Forest) binds: [B:36:0x006b, B:34:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b A[PHI: r6
      0x007b: PHI (r6v5 java.lang.String) = (r6v1 java.lang.String), (r6v2 java.lang.String), (r6v6 java.lang.String), (r6v7 java.lang.String) binds: [B:30:0x005a, B:42:0x0079, B:26:0x0048, B:28:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C1537480q70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1533020pzo LJIILIIL(boolean r11, com.bytedance.forest.Forest r12) {
        /*
            r10 = this;
            X.0pzo r1 = r10.resourceGroup
            r3 = 0
            if (r1 != 0) goto L13
            java.lang.Class<X.0qFV> r0 = X.C1542750qFV.class
            java.lang.Object r0 = r10.LJFF(r0)
            X.0qFV r0 = (X.C1542750qFV) r0
            if (r0 == 0) goto L20
            X.0pzo r1 = r0.LIZ
            if (r1 == 0) goto L20
        L13:
            r10.resourceGroup = r1
            X.0pzh r0 = r10.LJI()
            if (r0 != 0) goto L1d
            X.0pzh r0 = r1.LJIIIIZZ
        L1d:
            r1.LJIIIIZZ = r0
            return r1
        L20:
            r2 = 0
            r1 = 1
            if (r11 != 0) goto L2e
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r10.schemaParams
            if (r0 == 0) goto L95
            boolean r0 = r0.getEnableForestPreDecode()
            if (r0 != r1) goto L95
        L2e:
            r8 = 1
        L2f:
            X.0pzh r4 = r10.LJI()
            if (r4 != 0) goto L3c
            X.0pzG r0 = X.C1532680pzG.LIZ
            r0.getClass()
            X.0pzh r4 = X.C1532680pzG.LJJ
        L3c:
            java.lang.String r5 = r10.LJIIJJI()
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r10.schemaParams
            if (r0 == 0) goto L50
            java.lang.String r6 = r0.getAccessKey()
            if (r6 != 0) goto L7b
            java.lang.String r6 = r0.getAccessKeyBp()
            if (r6 != 0) goto L7b
        L50:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r10.defaultParams
            java.lang.String r0 = "access_key"
            java.lang.Object r6 = r1.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L7b
            org.json.JSONArray r0 = X.C1533710q0v.LIZ
            com.bytedance.lynx.hybrid.service.IResourceServiceX r0 = X.C1533710q0v.LIZIZ(r10, r2)
            if (r0 == 0) goto L6a
            com.bytedance.forest.Forest r0 = r0.getForest()
            if (r0 != 0) goto L6d
        L6a:
            r0 = r12
            if (r12 == 0) goto L93
        L6d:
            X.0q0g r0 = r0.getConfig()
            if (r0 == 0) goto L93
            X.0q0h r0 = r0.LIZIZ
            if (r0 == 0) goto L93
            java.lang.String r6 = r0.LIZ
            if (r6 == 0) goto L93
        L7b:
            boolean r0 = kotlin.text.a0.LJJJIL(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L93
        L83:
            java.lang.String r7 = r10.containerId
            r9 = 8
            X.0pzo r3 = new X.0pzo
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.resourceGroup = r3
            X.0pzo r0 = super.LJIILIIL(r8, r12)
            return r0
        L93:
            r6 = r3
            goto L83
        L95:
            r8 = 0
            boolean r0 = X.C1535630q41.LJJIII
            if (r0 != 0) goto L2f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.SparkContext.LJIILIIL(boolean, com.bytedance.forest.Forest):X.0pzo");
    }

    public final boolean LJJJJI(String str, String str2) {
        Uri uriLIZ;
        Uri uriLIZ2;
        Uri uriLIZ3;
        String str3;
        String str4;
        Uri uriLIZ4 = null;
        if (str != null) {
            uriLIZ = C2819017h.LIZ(C1946007jm.LJ(str), "spark_page_session");
        } else {
            uriLIZ = null;
        }
        if (str2 != null) {
            uriLIZ2 = C2819017h.LIZ(C1946007jm.LJ(str2), "spark_page_session");
        } else {
            uriLIZ2 = null;
        }
        if (Intrinsics.LJFF(uriLIZ, uriLIZ2)) {
            return true;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.shortLinkUrlCacheMap;
        if (concurrentHashMap != null && (str4 = concurrentHashMap.get(str)) != null) {
            uriLIZ3 = C2819017h.LIZ(C1946007jm.LJ(str4), "spark_page_session");
        } else {
            uriLIZ3 = null;
        }
        if (Intrinsics.LJFF(uriLIZ3, uriLIZ2)) {
            return true;
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = this.shortLinkUrlCacheMap;
        if (concurrentHashMap2 != null && (str3 = concurrentHashMap2.get(str2)) != null) {
            uriLIZ4 = C2819017h.LIZ(C1946007jm.LJ(str3), "spark_page_session");
        }
        if (Intrinsics.LJFF(uriLIZ, uriLIZ4)) {
            return true;
        }
        if (uriLIZ3 != null && Intrinsics.LJFF(uriLIZ3, uriLIZ4)) {
            return true;
        }
        return false;
    }

    public final void LJJJLL(double d, String str) {
        this.defaultParams.put(str, String.valueOf(d));
        this.hasParseSchema = false;
    }

    public final void LJJJLZIJ(int i, String str) {
        this.defaultParams.put(str, String.valueOf(i));
        this.hasParseSchema = false;
    }

    public final void LJJJZ(String str, String str2) {
        C1537170q6V c1537170q6V = this.dslPrefetchConfig;
        if (c1537170q6V.LIZ == 0 && C1535630q41.LJJIIJ && Intrinsics.LJFF(str, "prefetch_dsl_name")) {
            c1537170q6V.LIZIZ = a0.LJJLIIIJ(str2, new char[]{','}, false, 0, 6);
            c1537170q6V.LIZ = 1;
            c1537170q6V.LIZ(this);
        }
        this.defaultParams.put(str, str2);
        this.hasParseSchema = false;
    }

    public final void LJJL(String str, boolean z) {
        String str2;
        ConcurrentHashMap<String, String> concurrentHashMap = this.defaultParams;
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put(str, str2);
        this.hasParseSchema = false;
    }

    public final void LJJLIIIJ(Object obj, String str) {
        this.extraRuntimeInfo.put((Object) str, obj);
        this.hasParseSchema = false;
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        C1326430kcb.LIZ().LJ(this.containerId, C2097908Jt.LIZJ(new Pair(str, obj)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C905703gN.LIZ.getClass();
    }
}

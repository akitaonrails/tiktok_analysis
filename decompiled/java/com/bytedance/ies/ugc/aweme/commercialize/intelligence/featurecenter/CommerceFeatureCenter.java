package com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter;

import X.AnonymousClass1455;
import X.C01GW;
import X.C0A3T;
import X.C0A3W;
import X.C1022620cia;
import X.C1843650y4p;
import X.C1843670y4r;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C452501pT;
import X.C844470XAv;
import X.InterfaceC1843720y4w;
import X.InterfaceC1905507dF;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.IAdFastScrollService;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.CommerceFeatureCenter;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IFeatureSchema;
import com.bytedance.pitaya.api.feature.store.IFeatureStore;
import com.bytedance.pitaya.api.feature.store.PTYFeatureStoreInstance;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class CommerceFeatureCenter implements ICommerceFeatureCenter {
    public long LJFF;
    public final String LIZ = "CommerceFeatureCenter";
    public final Set<InterfaceC1905507dF> LIZIZ = new LinkedHashSet();
    public final C01GW LIZJ = C452501pT.LIZIZ(new C0A3W());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C0A3T());
    public final C1843670y4r LJ = new C1843670y4r(this);
    public final C01GW LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(762));

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter
    public final String LIZJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C1843650y4p.LIZ.getClass();
            C1843650y4p.LIZIZ();
            String strLIZ = this.LJ.LIZ();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            String str = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[fetchUploadFeatures] result=");
            sbLIZ.append(strLIZ);
            C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            C1843650y4p.LIZ(jCurrentTimeMillis2, strLIZ == null ? "" : strLIZ, strLIZ == null || strLIZ.length() == 0);
            return strLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            C1843650y4p.LIZ.getClass();
            AnonymousClass1455.LIZ.getClass();
            boolean zLJII = AnonymousClass1455.LJII();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[reportFetchFailed] duration=");
            sbLIZ2.append(jCurrentTimeMillis3);
            sbLIZ2.append(", pitayaIsReady=");
            sbLIZ2.append(zLJII ? 1 : 0);
            C1022620cia.LIZ("FeatureUploadEvent", C2188811AlT.LIZIZ(sbLIZ2));
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "fetch_failed");
            c2344009Gk.LIZLLL(jCurrentTimeMillis3, "duration");
            c2344009Gk.LIZJ(zLJII ? 1 : 0, "pitaya_is_ready");
            C20684815ws.LJIILLIIL("tt_ad_feature_upload", c2344009Gk.LIZ);
            return "";
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter
    public final boolean LIZLLL() {
        return ((Boolean) this.LJI.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter
    public final void LJ() {
        C1843650y4p.LIZ.getClass();
        C1022620cia.LIZ("FeatureUploadEvent", "[reportFeedRequest]");
        AnonymousClass1455.LIZ.getClass();
        boolean zLJII = AnonymousClass1455.LJII();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "feed_request");
        c2344009Gk.LIZJ(zLJII ? 1 : 0, "pitaya_is_ready");
        C20684815ws.LJIILLIIL("tt_ad_feature_upload", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter
    public final boolean LJFF() {
        return ((Boolean) this.LIZJ.getValue()).booleanValue() && ((Boolean) this.LIZLLL.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter
    public final void init() {
        C1022620cia.LIZ(this.LIZ, "[init] begin");
        if (((Boolean) this.LIZJ.getValue()).booleanValue()) {
            this.LJFF = System.currentTimeMillis();
            C1022620cia.LIZ(this.LIZ, "[init] feature enable");
            final C1843670y4r c1843670y4r = this.LJ;
            final InterfaceC1843720y4w interfaceC1843720y4w = new InterfaceC1843720y4w() { // from class: X.0y4q
                @Override // X.InterfaceC1843720y4w
                public final void LIZ(int i, boolean z) {
                    CommerceFeatureCenter commerceFeatureCenter = this.LIZ;
                    commerceFeatureCenter.getClass();
                    InterfaceC1905507dF interfaceC1905507dF = new InterfaceC1905507dF() { // from class: X.0y4u
                        public static final Map<String, C13IQ<? extends InterfaceC1905407dE>> LIZJ() {
                            return C2097608Jq.LJIIJ(new Pair("last_req_time", C13LE.LIZ(C1909707dv.class)), new Pair("last_async_req_time", C13LE.LIZ(C1909707dv.class)), new Pair("last_ad_show_time_stamp", C13LE.LIZ(C1909707dv.class)), new Pair("last_ad_end_show_time_stamp", C13LE.LIZ(C1909707dv.class)));
                        }

                        @Override // X.InterfaceC1905507dF
                        public final boolean LIZ(String str) {
                            return LIZJ().containsKey(str);
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
                        @Override // X.InterfaceC1905507dF
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final X.InterfaceC1905407dE LIZIZ(java.lang.String r15, org.json.JSONObject r16) {
                            /*
                                Method dump skipped, instruction units count: 258
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1843700y4u.LIZIZ(java.lang.String, org.json.JSONObject):X.07dE");
                        }
                    };
                    if (!commerceFeatureCenter.LIZIZ.contains(interfaceC1905507dF)) {
                        commerceFeatureCenter.LIZIZ.add(interfaceC1905507dF);
                    }
                    InterfaceC1905507dF interfaceC1905507dF2 = new InterfaceC1905507dF() { // from class: X.0y4n
                        public static final Map<String, C13IQ<? extends InterfaceC1905407dE>> LIZJ() {
                            return C2097608Jq.LJIIJ(new Pair("ad_fast_slow_sliding_status", C13LE.LIZ(C1909707dv.class)));
                        }

                        @Override // X.InterfaceC1905507dF
                        public final boolean LIZ(String str) {
                            return LIZJ().containsKey(str);
                        }

                        @Override // X.InterfaceC1905507dF
                        public final InterfaceC1905407dE LIZIZ(String str, JSONObject jSONObject) {
                            String strOptString;
                            EnumC1843560y4g enumC1843560y4gLIZJ;
                            if (Intrinsics.LJFF(str, "ad_fast_slow_sliding_status")) {
                                if (jSONObject != null && (strOptString = jSONObject.optString("item_id")) != null && strOptString.length() != 0) {
                                    IAdFastScrollService iAdFastScrollService = (IAdFastScrollService) PluggableExtentionKt.pluggableSpi$default(IAdFastScrollService.class, false, false, false, 14, null);
                                    if (iAdFastScrollService == null || (enumC1843560y4gLIZJ = iAdFastScrollService.LIZJ(strOptString)) == null) {
                                        enumC1843560y4gLIZJ = EnumC1843560y4g.UNKNOWN;
                                    }
                                    return new C1909707dv(enumC1843560y4gLIZJ.getValue());
                                }
                                return new C1909707dv(EnumC1843560y4g.UNKNOWN.getValue());
                            }
                            return C1905607dG.LIZ;
                        }
                    };
                    if (!commerceFeatureCenter.LIZIZ.contains(interfaceC1905507dF2)) {
                        commerceFeatureCenter.LIZIZ.add(interfaceC1905507dF2);
                    }
                    String str = this.LIZ.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[onInited] isSuccess=");
                    sbLIZ.append(z);
                    sbLIZ.append(", errorCode=");
                    sbLIZ.append(i);
                    sbLIZ.append(", time=");
                    sbLIZ.append(System.currentTimeMillis() - this.LIZ.LJFF);
                    sbLIZ.append(" ms");
                    C1022620cia.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            c1843670y4r.getClass();
            PreHostSetupWatcher.INSTANCE.registerListener(new PreHostSetupListener() { // from class: com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.platform.pitaya.PitayaFeatureCenter$init$1
                @Override // com.bytedance.pitaya.api.mutilinstance.PreHostSetupListener
                public void onPreHostSetup(boolean z) {
                    IFeatureSchema iFeatureSchemaSharedFeatureSchema;
                    c1843670y4r.getClass();
                    C1022620cia.LIZ("PitayaFeatureCenter", "[onPreHostSetup]");
                    C1843670y4r c1843670y4r2 = c1843670y4r;
                    FeatureCoreFactory featureCoreFactory = FeatureCoreFactory.INSTANCE;
                    C844470XAv.LIZ.getClass();
                    c1843670y4r2.LIZIZ = featureCoreFactory.getFeatureCore(String.valueOf(C844470XAv.LJIIJ));
                    C1843670y4r c1843670y4r3 = c1843670y4r;
                    IFeatureCore iFeatureCore = c1843670y4r3.LIZIZ;
                    if (iFeatureCore != null) {
                        iFeatureSchemaSharedFeatureSchema = iFeatureCore.sharedFeatureSchema();
                    } else {
                        iFeatureSchemaSharedFeatureSchema = null;
                    }
                    c1843670y4r3.LIZJ = iFeatureSchemaSharedFeatureSchema;
                    IFeatureStore featureStore = PTYFeatureStoreInstance.INSTANCE.getFeatureStore();
                    if (featureStore != null) {
                        CommerceFeatureCenterPitayaProducer commerceFeatureCenterPitayaProducer = new CommerceFeatureCenterPitayaProducer(c1843670y4r.LIZ);
                        final C1843670y4r c1843670y4r4 = c1843670y4r;
                        final InterfaceC1843720y4w interfaceC1843720y4w2 = interfaceC1843720y4w;
                        featureStore.registerFeatureProducer(commerceFeatureCenterPitayaProducer, new PTYNormalCallback() { // from class: com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.platform.pitaya.PitayaFeatureCenter$init$1$onPreHostSetup$1
                            @Override // com.bytedance.pitaya.api.PTYNormalCallback
                            public void onResult(boolean z2, PTYError pTYError) {
                                int code;
                                c1843670y4r4.getClass();
                                C1022620cia.LIZ("PitayaFeatureCenter", "[onResult]");
                                InterfaceC1843720y4w interfaceC1843720y4w3 = interfaceC1843720y4w2;
                                if (interfaceC1843720y4w3 != null) {
                                    if (pTYError != null) {
                                        code = pTYError.getCode();
                                    } else {
                                        code = 0;
                                    }
                                    interfaceC1843720y4w3.LIZ(code, z2);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1905407dE LIZIZ(java.lang.String r25, org.json.JSONObject r26) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.CommerceFeatureCenter.LIZIZ(java.lang.String, org.json.JSONObject):X.07dE");
    }
}

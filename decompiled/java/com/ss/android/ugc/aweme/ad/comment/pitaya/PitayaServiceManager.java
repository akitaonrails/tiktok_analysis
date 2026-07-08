package com.ss.android.ugc.aweme.ad.comment.pitaya;

import X.AbstractC1023380cjo;
import X.AnonymousClass1455;
import X.C013C;
import X.C04TD;
import X.C098200Yq;
import X.C1022620cia;
import X.C1053240dVy;
import X.C148I;
import X.C148M;
import X.C15O7;
import X.C189200o6;
import X.C1AF0;
import X.C2188811AlT;
import X.C259800zU;
import Y.ACallableS433S0100000_30;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger;
import com.ss.android.ugc.aweme.ad.comment.pitaya.M18nClientAiPitayaDownloadSettings;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS4S0000200_16;

/* JADX INFO: loaded from: classes31.dex */
public final class PitayaServiceManager implements IPitayaServiceManeger {
    public static IPitayaServiceManeger LIZLLL() {
        Object objLIZ = C04TD.LIZ(IPitayaServiceManeger.class, false);
        return objLIZ != null ? (IPitayaServiceManeger) objLIZ : new PitayaServiceManager();
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger
    public final void LIZ() {
        ICommerceFeatureCenter iCommerceFeatureCenter = (ICommerceFeatureCenter) PluggableExtentionKt.pluggableSpi$default(ICommerceFeatureCenter.class, false, false, false, 14, null);
        if (iCommerceFeatureCenter == null || !iCommerceFeatureCenter.LIZLLL()) {
            try {
                C15O7.LIZJ(new ACallableS433S0100000_30(new C148I(), 5));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[cachePitayaKVData] error, e=");
                sbLIZ.append(e);
                C1022620cia.LIZ("AdPitayaService", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger
    public final String LIZJ() {
        boolean zLIZ;
        C148I c148i = new C148I();
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_client_ai_realtime_feature_reading", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLIZ = true;
        }
        if (!zLIZ) {
            return C148M.LIZ.getString("client_ai_download_json_str", "");
        }
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        AnonymousClass1455.LIZ.getClass();
        if (AnonymousClass1455.LJII()) {
            M18nClientAiPitayaDownloadSettings.PitayaKeyNameModel pitayaKeyNameModelLIZ = M18nClientAiPitayaDownloadSettings.LIZ();
            Object c098200Yq = null;
            List<String> arrayList = pitayaKeyNameModelLIZ != null ? pitayaKeyNameModelLIZ.keyNameList : null;
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[getPitayaKVData] keyList=");
                sbLIZ.append(arrayList);
                C1022620cia.LIZ("AdPitayaService", C2188811AlT.LIZIZ(sbLIZ));
                IFeatureCore iFeatureCoreLIZ = C148I.LIZ();
                if (iFeatureCoreLIZ != null) {
                    IKVStore iKVStoreCreateInMemoryKVStore = iFeatureCoreLIZ.createInMemoryKVStore("tiktok_clientai_cloud_local_predict");
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    c259800zU.element = iKVStoreCreateInMemoryKVStore.tryGetValuesForRequest(arrayList);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[getPitayaKVData] data=");
                    sbLIZ2.append((String) c259800zU.element);
                    C1022620cia.LIZ("AdPitayaService", C2188811AlT.LIZIZ(sbLIZ2));
                    c013c.element = true;
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        AbstractC1023380cjo abstractC1023380cjo = (AbstractC1023380cjo) c148i.LIZ.getValue();
        C1053240dVy.LIZ.getClass();
        abstractC1023380cjo.log(C1053240dVy.LIZLLL, new AwS4S0000200_16(jCurrentTimeMillis2, jCurrentTimeMillis, 1));
        ((AbstractC1023380cjo) c148i.LIZ.getValue()).log(C1053240dVy.LJ, new AwS382S0200000_16(c013c, (C013C) c259800zU, (C259800zU<String>) 126));
        return (String) c259800zU.element;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.IPitayaServiceManeger
    public final void LIZIZ(final String str) {
        ICommerceFeatureCenter iCommerceFeatureCenter = (ICommerceFeatureCenter) PluggableExtentionKt.pluggableSpi$default(ICommerceFeatureCenter.class, false, false, false, 14, null);
        if (iCommerceFeatureCenter != null && iCommerceFeatureCenter.LIZLLL()) {
            return;
        }
        final C148I c148i = new C148I();
        if (str != null && str.length() != 0) {
            try {
                C15O7.LIZJ(new Callable() { // from class: X.148K
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("AdPitayaService@503a.setPitayaKVData$1");
                        c148i.getClass();
                        if (C148I.LIZIZ()) {
                            c148i.getClass();
                            IFeatureCore iFeatureCoreLIZ = C148I.LIZ();
                            if (iFeatureCoreLIZ != null) {
                                iFeatureCoreLIZ.createInMemoryKVStore("tiktok_clientai_cloud_data").setValueForKey("client_ai_upload_json_str", str);
                            }
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("AdPitayaService@503a.setPitayaKVData$1");
                        return unit;
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[setPitayaKVData] error, e=");
                sbLIZ.append(e);
                C1022620cia.LIZ("AdPitayaService", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}

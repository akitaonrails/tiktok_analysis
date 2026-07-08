package com.ss.android.ugc.aweme.live.strategy;

import X.C1093210eYR;
import X.C464190IIf;
import X.InterfaceC472980Igi;
import X.InterfaceC472990Igj;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.ss.android.ugc.aweme.feed.util.LiveHotReloadCepManager;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class HostClientAiService$wrapperLivePitayaCore$1 implements InterfaceC472980Igi {
    public final /* synthetic */ IPitayaCore LIZ;
    public final /* synthetic */ IFeatureCore LIZIZ;

    @Override // X.InterfaceC472980Igi
    public final boolean LIZ() {
        return this.LIZ.isReady();
    }

    @Override // X.InterfaceC472980Igi
    public final JSONObject LIZIZ() {
        IKVStore iKVStoreCreateInMemoryKVStore;
        IFeatureCore iFeatureCore = this.LIZIZ;
        if (iFeatureCore == null || (iKVStoreCreateInMemoryKVStore = iFeatureCore.createInMemoryKVStore("live_business_epi_features")) == null) {
            return null;
        }
        return iKVStoreCreateInMemoryKVStore.getCacheWithTryLock();
    }

    @Override // X.InterfaceC472980Igi
    public final void LIZJ(PTYPackageCallback pTYPackageCallback) {
        this.LIZ.downloadPackage("live_fyp_update_trigger", pTYPackageCallback);
    }

    @Override // X.InterfaceC472980Igi
    public final void LJ(LiveHotReloadCepManager.AnonymousClass1 anonymousClass1) {
        this.LIZ.queryPackage("live_fyp_update_trigger", anonymousClass1);
    }

    public final JSONObject LJFF(String str) {
        IKVStore iKVStoreCreateInMemoryKVStore;
        IFeatureCore iFeatureCore = this.LIZIZ;
        if (iFeatureCore != null && (iKVStoreCreateInMemoryKVStore = iFeatureCore.createInMemoryKVStore(str)) != null) {
            return iKVStoreCreateInMemoryKVStore.getKVData();
        }
        return null;
    }

    public final JSONObject LJI(String str) {
        IKVStore iKVStoreCreateKVStore;
        IFeatureCore iFeatureCore = this.LIZIZ;
        if (iFeatureCore != null && (iKVStoreCreateKVStore = iFeatureCore.createKVStore(str)) != null) {
            return iKVStoreCreateKVStore.getKVData();
        }
        return null;
    }

    public HostClientAiService$wrapperLivePitayaCore$1(IPitayaCore iPitayaCore, IFeatureCore iFeatureCore) {
        this.LIZ = iPitayaCore;
        this.LIZIZ = iFeatureCore;
    }

    public final void LJII(String str, Map<String, ? extends Object> map) {
        IKVStore iKVStoreCreateKVStore;
        String string;
        IFeatureCore iFeatureCore = this.LIZIZ;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (iFeatureCore != null && (iKVStoreCreateKVStore = iFeatureCore.createKVStore(str)) != null) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                iKVStoreCreateKVStore.setValueForKey(str2, string);
            }
        }
    }

    @Override // X.InterfaceC472980Igi
    public final void LIZLLL(String str, JSONObject jSONObject, final InterfaceC472990Igj interfaceC472990Igj, C464190IIf c464190IIf) {
        float f;
        IPitayaCore iPitayaCore = this.LIZ;
        PTYTaskData pTYTaskData = new PTYTaskData(jSONObject);
        long j = c464190IIf.LIZ;
        if (j > 0) {
            f = j;
        } else {
            f = -1.0f;
        }
        iPitayaCore.runTask(str, pTYTaskData, new PTYTaskConfig(false, null, f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.live.strategy.HostClientAiService$wrapperLivePitayaCore$1$runTask$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData2, PTYPackageInfo pTYPackageInfo) {
                JSONObject params;
                JSONObject params2 = null;
                if (z) {
                    InterfaceC472990Igj interfaceC472990Igj2 = interfaceC472990Igj;
                    if (pTYTaskData2 != null) {
                        params = pTYTaskData2.getParams();
                    } else {
                        params = null;
                    }
                    interfaceC472990Igj2.LIZ(new C1093210eYR(0, params, null));
                    return;
                }
                InterfaceC472990Igj interfaceC472990Igj3 = interfaceC472990Igj;
                if (pTYTaskData2 != null) {
                    params2 = pTYTaskData2.getParams();
                }
                interfaceC472990Igj3.LIZ(new C1093210eYR(-2, params2, pTYError));
            }
        });
    }
}

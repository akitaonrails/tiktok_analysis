package com.ss.android.ugc.aweme.bytebench;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes29.dex */
public class ByteBenchStrategySlideSlipConfiguration$$Imp implements ByteBenchStrategySlideSlipConfiguration {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public final ConcurrentHashMap<String, Object> mStickyStrategy = new ConcurrentHashMap<>();
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0zM9
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == String.class) {
                return (T) new String();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategySlideSlipConfiguration
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategySlideSlipConfiguration
    public String getPreloadConfiguration() {
        String strLJ;
        Object obj = this.mStickyStrategy.get("shooting_hc_effect_preload_android");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                try {
                    if (this.mStickyStrategy.contains("shooting_hc_effect_preload_android")) {
                        strLJ = (String) this.mStickyStrategy.get("shooting_hc_effect_preload_android");
                    } else {
                        strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "shooting_hc_effect_preload_android");
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        this.mStickyStrategy.put("shooting_hc_effect_preload_android", strLJ);
                    }
                } finally {
                }
            }
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategySlideSlipConfiguration, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}

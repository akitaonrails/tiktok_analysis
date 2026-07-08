package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class SmartSynthesisStrategy$$Imp implements SmartSynthesisStrategy {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0neP
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == String.class) {
                return (T) new String();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.property.bytebench.SmartSynthesisStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.SmartSynthesisStrategy, X.InterfaceC1440260naC
    public String getModelPath() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "studio_smart_synthesis_model_path");
            return strLJ != null ? strLJ : "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.SmartSynthesisStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}

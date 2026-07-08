package com.ss.android.ugc.aweme.template;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.template.ImportingMaterialLimit;

/* JADX INFO: loaded from: classes23.dex */
public class TemplateDynamicStrateryV2$$Imp implements TemplateDynamicStrateryV2 {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0neM
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == ImportingMaterialLimit.class) {
                return (T) new ImportingMaterialLimit();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.template.TemplateDynamicStrateryV2
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.template.TemplateDynamicStrateryV2
    public ImportingMaterialLimit importMaterailMax() {
        try {
            C21308818aE c21308818aE = C21308818aE.LIZJ;
            String strLJ = c21308818aE.LJ(this.mRepoName, "bytebench_creative_tools_pugc_importing_material_limit_strategy");
            return strLJ != null ? (ImportingMaterialLimit) this.mGson.LJII(strLJ, ImportingMaterialLimit.class) : (ImportingMaterialLimit) c21308818aE.LIZIZ(ImportingMaterialLimit.class, this.mDefaultCreate);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return (ImportingMaterialLimit) C21308818aE.LIZJ.LIZIZ(ImportingMaterialLimit.class, this.mDefaultCreate);
        }
    }

    @Override // com.ss.android.ugc.aweme.template.TemplateDynamicStrateryV2, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}

package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import X.InterfaceC1865190ydZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class ExternalSettingByteBenchStrategy$$Imp implements ExternalSettingByteBenchStrategy {
    public C09GA mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public InterfaceC1865190ydZ mDefaultCreate = new InterfaceC1865190ydZ() { // from class: X.0neI
        @Override // X.InterfaceC1865190ydZ
        public final <T> T create(Class<T> cls) {
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            if (cls == String.class) {
                return (T) new String();
            }
            return null;
        }
    };

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy, X.InterfaceC1442790neH
    public String compileExternalSettings() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "ve_synthesis_settings");
            return strLJ != null ? strLJ : "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy, X.InterfaceC1442790neH
    public String hdCompileExternalSettings() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "high_quality_ve_synthesis_settings");
            return strLJ != null ? strLJ : "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy, X.InterfaceC1442790neH
    public String importExternalSettings() {
        try {
            String strLJ = C21308818aE.LIZJ.LJ(this.mRepoName, "import_compile_external_settings");
            return strLJ != null ? strLJ : "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.ExternalSettingByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}

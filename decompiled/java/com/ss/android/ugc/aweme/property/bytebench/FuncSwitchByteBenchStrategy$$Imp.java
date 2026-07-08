package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class FuncSwitchByteBenchStrategy$$Imp implements FuncSwitchByteBenchStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC1442780neG
    public boolean enableDefaultOpenHDSwitch() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "enable_default_open_hd_video_switch", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy
    public boolean enableFastImport1080pHigher() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "fast_import_1080p_higher_benchmark_enable", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy
    public boolean enableFastImport1080pLower() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "fast_import_1080p_lower_benchmark_enable", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC1442780neG
    public boolean enableImportHD() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "avtools_enable_hd_import_resolution", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC1442780neG
    public boolean enableRecordHD() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "avtools_enable_hd_record_resolution", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC1442780neG
    public boolean showHDButton() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "enable_high_quality_video", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.property.bytebench.FuncSwitchByteBenchStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}

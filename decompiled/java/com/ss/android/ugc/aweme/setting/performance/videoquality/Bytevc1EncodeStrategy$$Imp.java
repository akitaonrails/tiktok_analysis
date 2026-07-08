package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C09GA;
import X.C21308818aE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes23.dex */
public class Bytevc1EncodeStrategy$$Imp implements Bytevc1EncodeStrategy {
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public C09GA mStrategyImp;

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy, X.InterfaceC20194513zz
    public int getMinSpeedForUsingBytevc1() {
        try {
            return C21308818aE.LIZJ.LIZLLL(this.mRepoName, "studio_upload_speed_threshold_using_bytevc1", -1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy, X.InterfaceC20194513zz
    public boolean isEnableBytevc1enc8Plugin() {
        try {
            return C21308818aE.LIZJ.LIZ(this.mRepoName, "studio_is_enable_bytevc1enc8_plugin", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy, X.InterfaceC21142817oY
    public void setByteBenchStrategy(C09GA c09ga) {
        this.mRepoName = c09ga.getRepoName();
        this.mStrategyImp = c09ga;
    }
}

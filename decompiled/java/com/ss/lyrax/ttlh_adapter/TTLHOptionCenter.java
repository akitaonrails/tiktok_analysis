package com.ss.lyrax.ttlh_adapter;

import X.C1269200j8I;
import com.ss.lyrax.augur.AugurCommandRequest;
import com.ss.lyrax.augur.AugurCommandResponse;
import com.ss.lyrax.augur.IAugurCommand;
import com.ss.lyrax.ttlh_adapter.push_param.SDKSettingsConfig;
import com.ss.lyrax.ttlh_adapter.settings_param.ABSettingsConfigs;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHOptionCenter implements IAugurCommand {
    public static TTLHOptionCenter sInstance;
    public long handle;

    public static native ABSettingsConfigs nativeQueryABSettingsConfig(long j);

    public static native SDKSettingsConfig nativeQuerySDKSettingsConfig(long j);

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateDenoiseParams(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LIZ(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateEffectGPUTurbo(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LIZIZ(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateEffectModel(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LIZJ(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateEffectResource(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LIZLLL(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateEffectStrategy(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJ(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateFPSAndResolution(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJFF(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateGameFPSAndResolution(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJI(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateLinkMicPerformanceParams(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJII(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateLinkMicVideoParams(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJIIIIZZ(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateShowToast(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJIIIZ(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateSimulcast(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJIIJ(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateStreamHDParams(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJIIJJI(this, augurCommandRequest);
    }

    @Override // com.ss.lyrax.augur.IAugurCommand
    public final /* synthetic */ AugurCommandResponse updateSubscribeSimulcast(AugurCommandRequest augurCommandRequest) {
        return C1269200j8I.LJIIL(this, augurCommandRequest);
    }

    public static synchronized TTLHOptionCenter getInstance() {
        return sInstance;
    }

    public static synchronized void release() {
        TTLHOptionCenter tTLHOptionCenter = sInstance;
        if (tTLHOptionCenter != null) {
            tTLHOptionCenter.handle = 0L;
        }
    }

    public ABSettingsConfigs queryABSettingsConfig() {
        return nativeQueryABSettingsConfig(this.handle);
    }

    public SDKSettingsConfig querySDKSettingsConfig() {
        return nativeQuerySDKSettingsConfig(this.handle);
    }

    public TTLHOptionCenter(long j) {
        this.handle = j;
        if (j != 0) {
        } else {
            throw new IllegalStateException("Failed to create TTLHOptionCenter");
        }
    }

    public static synchronized void init(long j) {
        sInstance = new TTLHOptionCenter(j);
    }
}

package com.ss.lyrax.augur;

/* JADX INFO: loaded from: classes21.dex */
public interface IAugurCommand {
    AugurCommandResponse updateDenoiseParams(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateEffectGPUTurbo(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateEffectModel(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateEffectResource(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateEffectStrategy(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateFPSAndResolution(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateGameFPSAndResolution(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateLinkMicPerformanceParams(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateLinkMicVideoParams(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateShowToast(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateSimulcast(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateStreamHDParams(AugurCommandRequest augurCommandRequest);

    AugurCommandResponse updateSubscribeSimulcast(AugurCommandRequest augurCommandRequest);
}

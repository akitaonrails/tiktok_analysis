package com.ss.android.ugc.gamora.celebration;

import X.C1420280n3y;
import X.C201955140j;
import X.C554890LpX;
import X.EnumC1420320n42;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CreationPreloadAssetServiceImpl implements ICreationPreloadAssetService {
    @Override // com.ss.android.ugc.gamora.celebration.ICreationPreloadAssetService
    public final List LIZ() {
        C1420280n3y.LIZ.getClass();
        return C1420280n3y.LIZJ("celebration", "create_tab");
    }

    @Override // com.ss.android.ugc.gamora.celebration.ICreationPreloadAssetService
    public final void LIZIZ() {
        C1420280n3y.LIZ.getClass();
        C201955140j.LIZJ(C554890LpX.LIZIZ, "CelebrationAsset, onLanguageChanged");
        C1420280n3y.LIZ(EnumC1420320n42.LANGUAGE_CHANGE);
    }

    @Override // com.ss.android.ugc.gamora.celebration.ICreationPreloadAssetService
    public final CreationPreloadAssetLegoTask getPreloadLegoTask() {
        return new CreationPreloadAssetLegoTask();
    }
}

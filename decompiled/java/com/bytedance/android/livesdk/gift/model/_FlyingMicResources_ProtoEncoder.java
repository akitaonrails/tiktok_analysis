package com.bytedance.android.livesdk.gift.model;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _FlyingMicResources_ProtoEncoder implements InterfaceC1132110fZB<FlyingMicResources> {
    public static void LIZIZ(C1142350fph c1142350fph, FlyingMicResources flyingMicResources) {
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, flyingMicResources.pathImage);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, flyingMicResources.micImage);
        List<TransitionConfig> list = flyingMicResources.transitionConfigs;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < flyingMicResources.transitionConfigs.size(); i++) {
                TransitionConfig transitionConfig = (TransitionConfig) ListProtector.get(flyingMicResources.transitionConfigs, i);
                if (transitionConfig != null) {
                    c1142350fph.LIZLLL(3, 2);
                    c1142350fph.LJ(C1142340fpg.LJIIL(1, transitionConfig.configId) + _ImageModel_ProtoEncoder.LJ(2, transitionConfig.resourceImage));
                    long j = transitionConfig.configId;
                    c1142350fph.LIZLLL(1, 0);
                    c1142350fph.LJFF(j);
                    _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, transitionConfig.resourceImage);
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, FlyingMicResources flyingMicResources) {
        LIZIZ(c1142350fph, flyingMicResources);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, FlyingMicResources flyingMicResources) {
        int iLIZIZ;
        if (flyingMicResources == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        int iLJ = _ImageModel_ProtoEncoder.LJ(1, flyingMicResources.pathImage) + _ImageModel_ProtoEncoder.LJ(2, flyingMicResources.micImage);
        List<TransitionConfig> list = flyingMicResources.transitionConfigs;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < flyingMicResources.transitionConfigs.size(); i2++) {
                TransitionConfig transitionConfig = (TransitionConfig) ListProtector.get(flyingMicResources.transitionConfigs, i2);
                if (transitionConfig == null) {
                    iLIZIZ = 0;
                } else {
                    int iLJIIL = C1142340fpg.LJIIL(1, transitionConfig.configId) + _ImageModel_ProtoEncoder.LJ(2, transitionConfig.resourceImage);
                    iLIZIZ = iLJIIL + C1142350fph.LIZIZ(iLJIIL) + C1142350fph.LIZ(3);
                }
                iLJ += iLIZIZ;
            }
        }
        c1142350fph.LJ(iLJ);
        LIZIZ(c1142350fph, flyingMicResources);
    }
}

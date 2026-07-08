package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlyingMicResources_ProtoDecoder implements C0IMD<FlyingMicResources> {
    public static FlyingMicResources LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlyingMicResources flyingMicResources = new FlyingMicResources();
        flyingMicResources.transitionConfigs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            flyingMicResources.transitionConfigs.add(_TransitionConfig_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        flyingMicResources.micImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    flyingMicResources.pathImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flyingMicResources;
            }
        }
    }

    public static void LJ(FlyingMicResources flyingMicResources) {
        ImageModel imageModel;
        ImageModel imageModel2 = flyingMicResources.pathImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = flyingMicResources.micImage;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        List<TransitionConfig> list = flyingMicResources.transitionConfigs;
        if (list == null) {
            flyingMicResources.transitionConfigs = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (TransitionConfig transitionConfig : flyingMicResources.transitionConfigs) {
            if (transitionConfig != null && (imageModel = transitionConfig.resourceImage) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FlyingMicResources flyingMicResources) {
        LJ(flyingMicResources);
    }

    @Override // X.C0IMD
    public final FlyingMicResources LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlyingMicResources flyingMicResources, List list) {
    }
}

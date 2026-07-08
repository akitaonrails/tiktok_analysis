package com.ss.android.ugc.aweme.ad.service;

import com.ss.android.ugc.aweme.ability.overlay.ICommerceFeedOverlayAbility;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class CommerceOverlayServiceImpl implements ICommerceFeedOverlayService {
    public final CopyOnWriteArrayList<ICommerceFeedOverlayAbility> LIZ = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.ad.service.ICommerceFeedOverlayService
    public final List<ICommerceFeedOverlayAbility> LIZ() {
        return Collections.unmodifiableList(this.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ad.service.ICommerceFeedOverlayService
    public final void LIZIZ(ICommerceFeedOverlayAbility iCommerceFeedOverlayAbility) {
        if (!this.LIZ.contains(iCommerceFeedOverlayAbility)) {
            this.LIZ.add(iCommerceFeedOverlayAbility);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.service.ICommerceFeedOverlayService
    public final void LIZJ(ICommerceFeedOverlayAbility iCommerceFeedOverlayAbility) {
        this.LIZ.remove(iCommerceFeedOverlayAbility);
    }
}

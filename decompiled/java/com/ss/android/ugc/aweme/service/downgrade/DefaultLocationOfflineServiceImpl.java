package com.ss.android.ugc.aweme.service.downgrade;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ILocationOfflineService;
import com.ss.android.ugc.aweme.service.ILocationPrfService;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class DefaultLocationOfflineServiceImpl implements ILocationOfflineService {
    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final boolean LIZIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final void LIZJ(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final boolean LIZLLL(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final void LJ(List<? extends Aweme> list) {
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final void LJI(Object obj, String str) {
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final Boolean LJII(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final void LJIIIZ(double d, double d2) {
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final boolean LJIIJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ILocationOfflineService
    public final ILocationPrfService LJFF() {
        return (ILocationPrfService) ServiceManager.get().getService(ILocationPrfService.class);
    }
}

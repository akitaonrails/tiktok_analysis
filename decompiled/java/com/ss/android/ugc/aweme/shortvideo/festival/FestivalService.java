package com.ss.android.ugc.aweme.shortvideo.festival;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.in.IFestivalService;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;

/* JADX INFO: loaded from: classes3.dex */
public class FestivalService implements IFestivalService {
    @Override // com.ss.android.ugc.aweme.port.in.IFestivalService
    public final String LJ() {
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);
        return iUnKnownOwnershipBusinessOuterService != null ? iUnKnownOwnershipBusinessOuterService.LJ() : "";
    }
}

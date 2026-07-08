package com.ss.android.ugc.aweme.anchor.service;

import X.C04TD;
import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class AnchorStateServiceImpl implements AnchorLock$IAnchorStateService, AnchorDialogPanelService {
    public int LIZ;
    public boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final void LIZLLL() {
        this.LIZ = 0;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final void LJI() {
    }

    static {
        new ArrayList();
    }

    public static AnchorDialogPanelService LJII() {
        Object objLIZ = C04TD.LIZ(AnchorDialogPanelService.class, false);
        if (objLIZ != null) {
            return (AnchorDialogPanelService) objLIZ;
        }
        if (C04TD.LLF == null) {
            synchronized (AnchorDialogPanelService.class) {
                if (C04TD.LLF == null) {
                    C04TD.LLF = new AnchorStateServiceImpl();
                }
            }
        }
        return C04TD.LLF;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService
    public final boolean isAnchorDialogPanelVisible() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final void LIZ(int i) {
        if (LIZJ(i) || i == 4) {
            this.LIZ = i;
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorDialogPanelService
    public final void LIZIZ(boolean z) {
        this.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final boolean LIZJ(int i) {
        if ((this.LIZ | i) == i) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final void LJ(int i) {
        if ((this.LIZ | i) == i) {
            this.LIZ = 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService
    public final String LJFF(Context context) {
        Resources resources = null;
        if (this.LIZ == 4) {
            if (context != null) {
                resources = context.getResources();
            }
            return resources.getString(2131844978);
        }
        if (context != null) {
            resources = context.getResources();
        }
        return resources.getString(2131844977);
    }
}

package com.ss.android.ugc.aweme.portrait.api;

import X.C1152604f6;
import X.C1152804f8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PortraitCenterInitService implements IPortraitCenterInitService {
    public static final C1152804f8 Companion = new Object() { // from class: X.04f8
    };

    @Override // com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService
    public abstract /* synthetic */ void checkAndInit();

    public static final IPortraitCenterInitService instance() {
        Companion.getClass();
        return C1152604f6.LIZ;
    }
}

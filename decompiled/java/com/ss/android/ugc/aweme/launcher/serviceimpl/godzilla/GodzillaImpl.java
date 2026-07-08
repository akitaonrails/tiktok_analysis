package com.ss.android.ugc.aweme.launcher.serviceimpl.godzilla;

import X.AnonymousClass0893;
import X.C20674088a;
import X.C20693088t;
import com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi;

/* JADX INFO: loaded from: classes4.dex */
public final class GodzillaImpl implements IGodzillaApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi
    public final void LIZ() {
        if (C20674088a.LIZ) {
            if (C20693088t.LIZJ == null) {
                throw new RuntimeException("Godzilla.init() method must be called first");
            }
            C20693088t.LIZJ.LIZ(AnonymousClass0893.REGISTER_EXCEPTION);
        }
    }
}

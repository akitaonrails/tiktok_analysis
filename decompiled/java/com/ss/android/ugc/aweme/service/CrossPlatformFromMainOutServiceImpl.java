package com.ss.android.ugc.aweme.service;

import X.AbstractC1216410hl9;
import X.AbstractC1255880imo;
import X.C0PQ7;
import X.C1065740dq8;
import X.C1255920ims;
import X.C835770WqV;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final class CrossPlatformFromMainOutServiceImpl implements ICrossPlatformFromMainOutService {
    @Override // com.ss.android.ugc.aweme.service.ICrossPlatformFromMainOutService
    public final String LIZ() {
        new C835770WqV();
        return C835770WqV.LJIIIIZZ();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0PQ7] */
    @Override // com.ss.android.ugc.aweme.service.ICrossPlatformFromMainOutService
    public final C0PQ7 LIZIZ(final AbstractC1255880imo abstractC1255880imo) {
        return new AbstractC1216410hl9<C1065740dq8, C1255920ims<C1065740dq8>>(abstractC1255880imo) { // from class: X.0PQ7
            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = abstractC1255880imo instanceof C1065740dq8 ? abstractC1255880imo : null;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final boolean init(Fragment fragment) {
                if (this.mModel != 0) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i));
            }
        };
    }
}

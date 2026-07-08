package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.pendant;

import X.AbstractC1764240w0k;
import X.C1764130w0Z;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPendantHelper implements ISeaPendantHelper {
    public final C1764130w0Z LL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.pendant.ISeaPendantHelper
    public final void Dz() {
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z != null) {
            c1764130w0Z.LIZIZ("video_hidden");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.pendant.ISeaPendantHelper
    public final Object Ny0() {
        AbstractC1764240w0k<?, ?> abstractC1764240w0k;
        C1764130w0Z c1764130w0Z = this.LL;
        if (c1764130w0Z == null || (abstractC1764240w0k = c1764130w0Z.LLILLJJLI.getCurrentPendantMap().get("tab_style")) == null) {
            return null;
        }
        return abstractC1764240w0k.LLILZIL;
    }

    public SeaPendantHelper(C1764130w0Z c1764130w0Z) {
        this.LL = c1764130w0Z;
    }
}

package com.ss.android.ugc.aweme.newselector.protocol.topentry;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226750i1p;
import X.C1227880i3e;
import X.C1228170i47;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class CreateQRGroupHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_header_create_qr_group";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        C1227880i3e c1227880i3e;
        if (!(c1226750i1p instanceof C1227880i3e) || (c1227880i3e = (C1227880i3e) c1226750i1p) == null) {
            return null;
        }
        C1228170i47 c1228170i47 = new C1228170i47(abstractC1225770i0F, c1227880i3e);
        c1228170i47.LLJ = str;
        return c1228170i47;
    }
}

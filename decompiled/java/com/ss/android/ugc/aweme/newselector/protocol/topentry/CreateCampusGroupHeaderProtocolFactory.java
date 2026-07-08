package com.ss.android.ugc.aweme.newselector.protocol.topentry;

import X.AbstractC1225770i0F;
import X.C1226700i1k;
import X.C1226750i1p;
import X.C1227900i3g;
import X.C1227930i3j;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class CreateCampusGroupHeaderProtocolFactory implements IContactSelectorHeaderFactory {
    public final String LL = "id_header_create_campus_group";

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final String lW() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorHeaderFactory
    public final C1226700i1k Fu0(AbstractC1225770i0F abstractC1225770i0F, C1226750i1p c1226750i1p, String str) {
        C1227900i3g c1227900i3g;
        if (!(c1226750i1p instanceof C1227900i3g) || (c1227900i3g = (C1227900i3g) c1226750i1p) == null) {
            return null;
        }
        C1227930i3j c1227930i3j = new C1227930i3j(abstractC1225770i0F, c1227900i3g);
        c1227930i3j.LLJ = str;
        return c1227930i3j;
    }
}

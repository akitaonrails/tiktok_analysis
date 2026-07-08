package com.ss.android.ugc.aweme.poi.detail.container.slash.component;

import X.C01GW;
import X.C1173300gdc;
import X.C1174850gg7;
import X.C1180090goZ;
import X.C1180100goa;
import X.C1181460gqm;
import X.C1184480gve;
import X.C1185600gxS;
import X.C1559260qg8;
import X.C452501pT;
import X.C723580SZw;
import X.InterfaceC1181010gq3;
import X.InterfaceC1185170gwl;
import Y.AObserverS222S0100000_18;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiDetailBaseUiContentComponent<T extends BaseComponentData> extends BaseSlashContentAssemComponent<T> {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1184480gve.class, "PoiVideoDetailHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS562S0100000_18((PoiDetailBaseUiContentComponent) this, 1105));

    public void Jo(PoiListApi.PoiDetailResponse poiDetailResponse) {
    }

    public final InterfaceC1185170gwl Ho() {
        C1184480gve c1184480gve = (C1184480gve) this.LLIZLLLIL.getValue();
        return c1184480gve == null ? (C1181460gqm) this.LLJ.getValue() : c1184480gve;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, X.InterfaceC1173990gej
    public final InterfaceC1181010gq3 BK2() {
        return C1174850gg7.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PoiListApi.PoiDetailResponse Go() {
        C1185600gxS c1185600gxS;
        PoiListApi.PoiDetailResponse poiDetailResponse;
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null && (poiDetailResponse = c1185600gxS.LJIIIZ) != null) {
            return poiDetailResponse;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null) {
            return (PoiListApi.PoiDetailResponse) interfaceC1181010gq3LIZ.ta2(new C1180090goZ("poi_head_info"));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashContentAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null) {
            interfaceC1181010gq3LIZ.sB1(C1180100goa.LIZ("poi_head_info"), this, new AObserverS222S0100000_18(this, 10));
        }
    }
}

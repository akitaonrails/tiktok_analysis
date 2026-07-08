package com.ss.android.ugc.aweme.poi.detail.container.slash.component;

import X.C01GW;
import X.C1173300gdc;
import X.C1173980gei;
import X.C1174850gg7;
import X.C1180080goY;
import X.C1180090goZ;
import X.C1180100goa;
import X.C1184480gve;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1185600gxS;
import X.C1558520qew;
import X.C1559260qg8;
import X.C452501pT;
import X.C723580SZw;
import X.InterfaceC1181010gq3;
import X.InterfaceC1185170gwl;
import X.InterfaceC665370Q7z;
import Y.AObserverS222S0100000_18;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiDetailBaseUiSlotComponent<T extends BaseComponentData> extends BaseSlashSlotAssemComponent<T> {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1184480gve.class, "PoiVideoDetailHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18((PoiDetailBaseUiSlotComponent) this, 1106));

    public boolean mp() {
        return this instanceof PoiHeaderGalleryAssem;
    }

    public void op(PoiListApi.PoiDetailResponse poiDetailResponse) {
    }

    public final InterfaceC1185170gwl kp() {
        C1184480gve c1184480gve = (C1184480gve) this.LLJJI.getValue();
        return c1184480gve == null ? (C1180080goY) this.LLJJIII.getValue() : c1184480gve;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final InterfaceC1181010gq3 BK2() {
        return C1174850gg7.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173990gej
    public final void fm1() {
        C1174850gg7.LJII(this);
        if (mp()) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            String strLJFF = C1174850gg7.LJFF(this);
            if (strLJFF == null) {
                strLJFF = C1173980gei.LIZ(this);
            }
            C1185430gxB.LJJIJIL(c1185430gxB, interfaceC665370Q7zLJIIL, strLJFF, C1173980gei.LIZ(this), new C1185050gwZ(PageFinder.via(getContentView())), 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PoiListApi.PoiDetailResponse ip() {
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

    public boolean lp(PoiListApi.PoiDetailResponse poiDetailResponse) {
        return !Intrinsics.LJFF(poiDetailResponse.getDataFromAnchor(), Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
        if (interfaceC1181010gq3LIZ != null) {
            interfaceC1181010gq3LIZ.sB1(C1180100goa.LIZ("poi_head_info"), this, new AObserverS222S0100000_18(this, 11));
        }
    }
}

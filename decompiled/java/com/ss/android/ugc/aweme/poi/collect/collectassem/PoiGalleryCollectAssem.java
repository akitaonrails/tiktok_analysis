package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C01GW;
import X.C1005220cGW;
import X.C1185430gxB;
import X.C1188530h2B;
import X.C1206904nr;
import X.C1558520qew;
import X.C197039127h;
import X.C452501pT;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGalleryCollectAssem extends PoiCollectStatusBaseActivityAssem {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 926));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 928));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 929));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 930));
    public final String LLJLLIL = "album_inner_page";
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 927));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e1h;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final boolean up() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final TuxIconView Ap() {
        return (TuxIconView) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final void Fp() {
        C1185430gxB.LJJIJL(C1185430gxB.LIZ, "poi_detail", "click", C1558520qew.LJIIL(this), "poi_secondary_preview_page", "category_background_album", (PageFinder) this.LLJLLL.getValue());
    }

    public final C197039127h Jp() {
        return (C197039127h) this.LLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final View yp() {
        return (View) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final String getEnterFrom() {
        return this.LLJLLIL;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        return new ContextThemeWrapper(context, R.style.y0);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final void Ep(boolean z) {
        Map<String, String> linkedHashMap;
        Map<String, String> linkedHashMap2;
        C1188530h2B c1188530h2B = zp().LLIZ;
        int i = 3;
        String enterFrom = null;
        if (z) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            if (c1188530h2B == null || (linkedHashMap2 = c1188530h2B.forceToMap()) == null) {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            PageFinder pageFinder = (PageFinder) this.LLJLLL.getValue();
            if (c1188530h2B != null) {
                enterFrom = c1188530h2B.getEnterFrom();
            }
            if (Intrinsics.LJFF(enterFrom, "album_inner_page")) {
                i = 4;
            } else if (!Intrinsics.LJFF(enterFrom, "header_inner_page")) {
                i = 2;
            }
            Integer numValueOf = Integer.valueOf(i);
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            c1185430gxB.getClass();
            C1185430gxB.LJIJJ(linkedHashMap2, pageFinder, numValueOf, interfaceC665370Q7zLJIIL);
            return;
        }
        C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
        if (c1188530h2B == null || (linkedHashMap = c1188530h2B.forceToMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        PageFinder pageFinder2 = (PageFinder) this.LLJLLL.getValue();
        if (c1188530h2B != null) {
            enterFrom = c1188530h2B.getEnterFrom();
        }
        if (Intrinsics.LJFF(enterFrom, "album_inner_page")) {
            i = 4;
        } else if (!Intrinsics.LJFF(enterFrom, "header_inner_page")) {
            i = 2;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
        c1185430gxB2.getClass();
        C1185430gxB.LJII(linkedHashMap, pageFinder2, numValueOf2, interfaceC665370Q7zLJIIL2);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final void Ip(boolean z) {
        int i;
        int i2;
        boolean zLIZ = C1206904nr.LIZ();
        if (z) {
            C197039127h c197039127hJp = Jp();
            if (c197039127hJp != null) {
                c197039127hJp.setButtonVariant(1);
                if (zLIZ) {
                    i2 = 2131844689;
                } else {
                    i2 = 2131844691;
                }
                c197039127hJp.setText(i2);
                c197039127hJp.LJJJLZIJ(null, null);
                return;
            }
            return;
        }
        C197039127h c197039127hJp2 = Jp();
        if (c197039127hJp2 == null) {
            return;
        }
        c197039127hJp2.setButtonVariant(0);
        if (zLIZ) {
            i = 2131844688;
        } else {
            i = 2131844690;
        }
        c197039127hJp2.setText(i);
        c197039127hJp2.LJJJLZIJ(null, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C197039127h c197039127hJp = Jp();
        if (c197039127hJp != null) {
            C1005220cGW.LIZ(c197039127hJp);
        }
    }
}

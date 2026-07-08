package com.ss.android.ugc.aweme.poi.detail.gallery;

import X.C01GW;
import X.C1185430gxB;
import X.C1188530h2B;
import X.C1206904nr;
import X.C1558520qew;
import X.C197039127h;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGalleryBottomCollectAssem extends PoiCollectStatusBaseActivityAssem {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1130));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1132));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1133));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1134));
    public final String LLJLLIL = "album_inner_page";
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1131));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e18;
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

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final View yp() {
        return (View) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem
    public final String getEnterFrom() {
        return this.LLJLLIL;
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
            C197039127h c197039127h = (C197039127h) this.LLJL.getValue();
            if (c197039127h != null) {
                c197039127h.setButtonVariant(1);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
                if (zLIZ) {
                    i2 = 2131844689;
                } else {
                    i2 = 2131844691;
                }
                c197039127h.setText(i2);
                c197039127h.setTextColorRes(R.attr.ee);
                c197039127h.LJJJLZIJ(Integer.valueOf(R.raw.icon_bookmark_fill), null);
                c197039127h.setIconTintColorRes(R.attr.ee);
                return;
            }
            return;
        }
        C197039127h c197039127h2 = (C197039127h) this.LLJL.getValue();
        if (c197039127h2 == null) {
            return;
        }
        c197039127h2.setButtonVariant(0);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        c197039127h2.setBackground(c384050F3z2.LIZ(c197039127h2.getContext()));
        if (zLIZ) {
            i = 2131844688;
        } else {
            i = 2131844690;
        }
        c197039127h2.setText(i);
        c197039127h2.setTextColorRes(R.attr.ee);
        c197039127h2.LJJJLZIJ(Integer.valueOf(R.raw.icon_bookmark), null);
        c197039127h2.setIconTintColorRes(R.attr.ee);
    }
}

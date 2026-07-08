package com.ss.android.ugc.aweme.poi.detail.post.assem;

import X.C01GW;
import X.C1005220cGW;
import X.C1174730gfv;
import X.C1185430gxB;
import X.C1188530h2B;
import X.C1206904nr;
import X.C1558360qeg;
import X.C1558520qew;
import X.C197039127h;
import X.C452501pT;
import X.C724240Sb0;
import X.C848230XPh;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageFooterFavAssem extends PoiCollectStatusBaseAssem {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1176));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1177));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1178));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e65;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Gp() {
        C1185430gxB.LJJIJL(C1185430gxB.LIZ, "poi_detail", "click", C1558520qew.LJIIL(this), "poi_secondary_gallery_page", "category_background_album", PageFinder.via(LJJIJL()));
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        Map<String, String> linkedHashMap;
        Map<String, String> linkedHashMap2;
        C1188530h2B c1188530h2B = Ap().LLIZ;
        if (z) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            if (c1188530h2B == null || (linkedHashMap2 = c1188530h2B.forceToMap()) == null) {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            c1185430gxB.getClass();
            C1185430gxB.LJIJJ(linkedHashMap2, pageFinderVia, null, interfaceC665370Q7zLJIIL);
            return;
        }
        C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
        if (c1188530h2B == null || (linkedHashMap = c1188530h2B.forceToMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        PageFinder pageFinderVia2 = PageFinder.via(C724240Sb0.LJI(this));
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
        c1185430gxB2.getClass();
        C1185430gxB.LJII(linkedHashMap, pageFinderVia2, null, interfaceC665370Q7zLJIIL2);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        C197039127h c197039127h;
        int i;
        int i2;
        View viewZp = zp();
        if (viewZp instanceof C197039127h) {
            c197039127h = (C197039127h) viewZp;
        } else {
            c197039127h = null;
        }
        boolean zLIZ = C1206904nr.LIZ();
        if (z) {
            if (c197039127h != null) {
                c197039127h.setButtonVariant(1);
                Context context = LJJIJL().getContext();
                if (zLIZ) {
                    i2 = 2131844689;
                } else {
                    i2 = 2131844691;
                }
                c197039127h.setText(context.getString(i2));
                c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark_fill));
                return;
            }
            return;
        }
        if (c197039127h == null) {
            return;
        }
        c197039127h.setButtonVariant(0);
        Context context2 = LJJIJL().getContext();
        if (zLIZ) {
            i = 2131844688;
        } else {
            i = 2131844690;
        }
        c197039127h.setText(context2.getString(i));
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark));
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Boolean boolValueOf;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        C197039127h c197039127h;
        super.onViewCreated(view);
        boolean zLJI = C848230XPh.LL.LJI();
        if (zLJI) {
            boolValueOf = Boolean.valueOf(sp().LIZLLL);
        } else {
            boolValueOf = null;
        }
        C1174730gfv c1174730gfv = C1174730gfv.LIZ;
        Boolean boolValueOf2 = Boolean.valueOf(zLJI);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        C1174730gfv.LJIILIIL(c1174730gfv, null, "bottom_operate_btn", null, null, null, null, null, null, null, null, null, boolValueOf2, boolValueOf, interfaceC665370Q7zLJFF, PageFinder.via(LJJIJL()), 2045);
        View viewZp = zp();
        if ((viewZp instanceof C197039127h) && (c197039127h = (C197039127h) viewZp) != null) {
            C1005220cGW.LIZ(c197039127h);
        }
    }
}

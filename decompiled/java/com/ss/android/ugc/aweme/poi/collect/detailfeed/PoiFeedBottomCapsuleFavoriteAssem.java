package com.ss.android.ugc.aweme.poi.collect.detailfeed;

import X.C01GW;
import X.C1188560h2E;
import X.C1206904nr;
import X.C1559260qg8;
import X.C197039127h;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C814420VxA;
import X.EnumC452301pR;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiFeedBottomCapsuleFavoriteAssem extends PoiFeedBottomBaseFavoriteAssem {
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C1559260qg8 LLJLL;

    @Override // com.ss.android.ugc.aweme.poi.collect.detailfeed.PoiFeedBottomBaseFavoriteAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        C1188560h2E c1188560h2E = (C1188560h2E) this.LLJLL.getValue();
        return (c1188560h2E == null || c1188560h2E.LLJ != 3) ? R.layout.e17 : R.layout.e18;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public PoiFeedBottomCapsuleFavoriteAssem() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 939));
        this.LLJL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 940));
        this.LLJLIL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 941));
        this.LLJLILLLLZIIL = C452501pT.LIZ(enumC452301pR, new AwS562S0100000_18(this, 938));
        this.LLJLL = new C1559260qg8(new C723580SZw(this, C1188560h2E.class, "PoiFeedBottomHierarchyData"), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        int i;
        int i2;
        boolean zLIZ = C1206904nr.LIZ();
        if (z) {
            C197039127h c197039127h = (C197039127h) this.LLJLILLLLZIIL.getValue();
            if (c197039127h != null) {
                c197039127h.setButtonVariant(1);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
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
        C197039127h c197039127h2 = (C197039127h) this.LLJLILLLLZIIL.getValue();
        if (c197039127h2 == null) {
            return;
        }
        c197039127h2.setButtonVariant(0);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
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

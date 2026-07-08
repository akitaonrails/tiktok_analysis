package com.ss.android.ugc.nearby.status.detail;

import X.C1205260hTA;
import X.C1749280vcc;
import X.C444540Hbw;
import X.C444550Hbx;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444630Hc5;
import X.C444640Hc6;
import X.C444690HcB;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class FullEmptyDataAssem extends UISlotAssem {
    public C1749280vcc LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dsk;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = (C1749280vcc) view.findViewById(R.id.h2a);
        EnumC444680HcA enumC444680HcA = EnumC444680HcA.NO_CONTENT;
        C444630Hc5 c444630Hc5LIZ = C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.HUG, (Float) null, 6), new C444550Hbx(Boolean.TRUE, Integer.valueOf(R.drawable.n5), 4), 2131833892, 2131833891, new C444560Hby(EnumC444580Hc0.PILL_BUTTON, null, 2131833889, 1, new AwS562S0100000_18(this, 2396), 2), new C444590Hc1(3));
        C1749280vcc c1749280vcc = this.LLJJI;
        if (c1749280vcc != null) {
            c1749280vcc.setStatus(C444600Hc2.LIZ(getContext(), this.LLJJI, c444630Hc5LIZ));
        }
        C444690HcB.LIZ(enumC444680HcA, this.LLJJI);
        C1205260hTA.LIZ.getClass();
        C1205260hTA.LJIIJJI("empty_page");
    }
}

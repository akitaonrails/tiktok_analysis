package com.ss.android.ugc.nearby.status.detail;

import X.C0HTI;
import X.C0HW7;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C418440Gaw;
import X.C444540Hbw;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444630Hc5;
import X.C444640Hc6;
import X.C444690HcB;
import X.C814420VxA;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class FullNoNetworkAssem extends UISlotAssem {
    public C1749280vcc LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dso;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        String string2;
        super.onViewCreated(view);
        this.LLJJI = (C1749280vcc) view.findViewById(R.id.w1z);
        if (C0HW7.LIZ) {
            EnumC444680HcA enumC444680HcA = EnumC444680HcA.NO_NETWORK;
            C444630Hc5 c444630Hc5LIZ = C444540Hbw.LIZ(enumC444680HcA, new C444640Hc6(EnumC444620Hc4.HUG, (Float) null, 6), null, null, null, new C444560Hby(EnumC444580Hc0.PILL_BUTTON, 2, null, 1, new AwS562S0100000_18(this, 2397), 4), new C444590Hc1(3));
            C1749280vcc c1749280vcc = this.LLJJI;
            if (c1749280vcc != null) {
                c1749280vcc.setStatus(C444600Hc2.LIZ(getContext(), this.LLJJI, c444630Hc5LIZ));
            }
            C444690HcB.LIZ(enumC444680HcA, this.LLJJI);
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLJJI;
        if (c1749280vcc2 == null) {
            return;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.nl;
        Drawable drawableLIZ = c0hti.LIZ(c1749280vcc2.getContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        Context context = getContext();
        String str = "";
        if (context == null || (string = context.getString(2131837925)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        Context context2 = getContext();
        if (context2 != null && (string2 = context2.getString(2131837922)) != null) {
            str = string2;
        }
        c1722300uv6.LJIIIIZZ = str;
        c1722300uv6.LJIIIZ = new AwS585S0100000_6(this, 225);
        c1749280vcc2.setStatus(c1722300uv6);
    }
}

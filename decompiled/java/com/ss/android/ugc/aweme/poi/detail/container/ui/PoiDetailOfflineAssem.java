package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C1183520gu6;
import X.C1205490hTX;
import X.C1749280vcc;
import X.C1EMR;
import X.C444540Hbw;
import X.C444560Hby;
import X.C444590Hc1;
import X.C444600Hc2;
import X.C444640Hc6;
import X.EnumC444580Hc0;
import X.EnumC444620Hc4;
import X.EnumC444680HcA;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailOfflineAssem extends UIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C1749280vcc c1749280vcc = new C1749280vcc(viewGroup.getContext(), null, 6);
            c1749280vcc.setStatus(C444600Hc2.LIZ(viewGroup.getContext(), c1749280vcc, C444540Hbw.LIZ(EnumC444680HcA.SOMETHING_WRONG, new C444640Hc6(EnumC444620Hc4.ILLUSTRATION, (Float) null, 6), null, 2131844869, 2131844868, new C444560Hby(EnumC444580Hc0.SQUARED_BUTTON, 3, 2131844864, 1, new AwS562S0100000_18(viewGroup, 1113)), new C444590Hc1(3))));
            viewGroup.addView(c1749280vcc, new ViewGroup.LayoutParams(-1, -1));
            C1183520gu6 c1183520gu6 = C1183520gu6.LIZ;
            c1183520gu6.getClass();
            c1183520gu6.LIZJ("poi_detail_page_error", new AwS32S0001000_18(0, 8));
            C1205490hTX.LIZ.LJ(C1EMR.POI_OFFLINE, null);
        }
    }
}

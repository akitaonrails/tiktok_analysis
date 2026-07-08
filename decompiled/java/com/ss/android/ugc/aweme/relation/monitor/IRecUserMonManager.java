package com.ss.android.ugc.aweme.relation.monitor;

import X.C10LT;
import X.C1261270ivV;
import X.C1AJ2;
import X.C1AJ3;
import X.EnumC20621415me;
import X.InterfaceC1331910klR;
import X.InterfaceC494301wD;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes34.dex */
public interface IRecUserMonManager extends InterfaceC494301wD {
    C1AJ2 Ge0(String str, String str2, int i, C10LT c10lt);

    C1AJ3 J52(String str, String str2, C10LT c10lt, InterfaceC1331910klR interfaceC1331910klR);

    RelationPageMonitor hO1(Lifecycle lifecycle, C1261270ivV c1261270ivV);

    RecUserBehaviorMonImpl oK(Lifecycle lifecycle, C1261270ivV c1261270ivV, int i);

    RecUserPopupMonImpl t62(C1261270ivV c1261270ivV, EnumC20621415me enumC20621415me);
}

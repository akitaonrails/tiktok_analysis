package com.ss.android.ugc.aweme.search.creation.template.service;

import X.C0ET4;
import X.C1424300nAS;
import X.C1425980nDA;
import X.C1427280nFG;
import X.C1659700tI8;
import X.C19A3;
import X.C2188811AlT;
import X.C539960LFq;
import X.C559610Lx9;
import X.EnumC1642750sqn;
import X.EnumC371580EhY;
import X.InterfaceC2272891Dxn;
import com.ss.android.ugc.aweme.template.search.ITemplateSearchBridge;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateSearchBridge implements ITemplateSearchBridge {
    @Override // com.ss.android.ugc.aweme.template.search.ITemplateSearchBridge
    public final void LIZ(C539960LFq c539960LFq, C1427280nFG c1427280nFG) {
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.HIDE;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(C1424300nAS.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC2272891Dxn.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC2272891Dxn.class, C1424300nAS.class, C1425980nDA.class, R.id.vkx, enumC371580EhY, new AwS388S0200000_22(new C0ET4(), (C559610Lx9) c539960LFq, (C19A3) c1427280nFG, 302));
    }
}

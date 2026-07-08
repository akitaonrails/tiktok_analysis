package com.ss.android.ugc.aweme.aigc.label;

import X.C01GW;
import X.C054G;
import X.C05MP;
import X.C05MT;
import X.C0PEM;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class AIGCLabelServiceImpl implements IAIGCLabelService {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(177));

    @Override // com.ss.android.ugc.aweme.aigc.label.IAIGCLabelService
    public final void LIZ(String str, String str2, String str3, String str4, AwS581S0100000_2 awS581S0100000_2, AwS581S0100000_2 awS581S0100000_22) {
        if (!a0.LJJJIL(str) && !a0.LJJJIL(str2)) {
            C23250099c.LIZLLL(this.LIZ, null, null, new C05MT(this, str, str2, str3, str4, awS581S0100000_2, awS581S0100000_22, null), 3);
        } else {
            C23250099c.LIZLLL(this.LIZ, null, null, new C05MP(this, awS581S0100000_22, null), 3);
        }
    }
}

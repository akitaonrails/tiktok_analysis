package com.ss.android.ugc.aweme;

import X.C0C64;
import X.C0W9A;
import X.C19233310Mh;
import X.C19233810Mm;
import X.C2095008Iq;
import com.ss.android.ugc.aweme.journey.INUJRevampService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NUJRevampService implements INUJRevampService {
    @Override // com.ss.android.ugc.aweme.journey.INUJRevampService
    public final boolean LIZIZ() {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(C0W9A.LIZ());
        return (lLJIILIIL != null ? lLJIILIIL.longValue() : Long.MAX_VALUE) < 13 && C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "remove_nuj_push_popup_background", false, false);
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJRevampService
    public final boolean LIZ(boolean z) {
        if (z) {
            return false;
        }
        C19233810Mm.LIZ.getClass();
        return Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip");
    }
}

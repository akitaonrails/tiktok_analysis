package com.ss.android.ugc.aweme.aigc;

import X.C04TD;
import X.C0BJ5;
import X.C140D;
import X.C15464063q;
import X.InterfaceC1364105Vn;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class C2PAServiceImpl implements IC2PAService {
    @Override // com.ss.android.ugc.aweme.aigc.IC2PAService
    public final void LIZIZ() {
        C140D.LIZ.LJJIIJ(true);
    }

    public static IC2PAService LJ() {
        Object objLIZ = C04TD.LIZ(IC2PAService.class, false);
        if (objLIZ != null) {
            return (IC2PAService) objLIZ;
        }
        if (C04TD.LJZL == null) {
            synchronized (IC2PAService.class) {
                if (C04TD.LJZL == null) {
                    C04TD.LJZL = new C2PAServiceImpl();
                }
            }
        }
        return C04TD.LJZL;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IC2PAService
    public final boolean LIZLLL() {
        return C0BJ5.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.aigc.IC2PAService
    public final void LIZ(Context context) {
        C140D.LIZ.getClass();
        C140D.LJJIII(context);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IC2PAService
    public final Object hasC2PAAIGCInfoInFile(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C140D.LIZ.LJJIFFI(str, new C15464063q(null), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IC2PAService
    public final void LIZJ(Context context, Function0<Unit> function0, Function1<? super Integer, Unit> function1) {
        C140D.LIZ.LJJIIJZLJL(context, function0, function1);
    }
}

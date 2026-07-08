package com.ss.android.ugc.aweme.tako.share.panel;

import X.C036E;
import X.C063T;
import X.C0M7Y;
import X.C0PEM;
import X.C1370940lmO;
import X.C15428062g;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoImageSharePackage extends TakoSharePackage {
    public static final C063T Companion = new Object() { // from class: X.063T
    };
    public static final int $stable = 8;

    public TakoImageSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        boolean zLIZIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C15428062g(context, null), 3);
            return true;
        }
        super.LJII(interfaceC1369790lkX, context, view, c0m7y, function1);
        return false;
    }
}

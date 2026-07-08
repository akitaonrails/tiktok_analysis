package com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.profiletab;

import X.C04TD;
import X.C0ICE;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import android.content.Context;
import com.ss.android.ugc.aweme.profile.ui.ability.IProfileBottomTabService;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileBottomTabServiceImpl implements IProfileBottomTabService {
    public boolean LIZ;

    public static IProfileBottomTabService LIZJ() {
        Object objLIZ = C04TD.LIZ(IProfileBottomTabService.class, false);
        if (objLIZ != null) {
            return (IProfileBottomTabService) objLIZ;
        }
        if (C04TD.P6 == null) {
            synchronized (IProfileBottomTabService.class) {
                if (C04TD.P6 == null) {
                    C04TD.P6 = new ProfileBottomTabServiceImpl();
                }
            }
        }
        return C04TD.P6;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.IProfileBottomTabService
    public final boolean LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ability.IProfileBottomTabService
    public final void LIZIZ(Context context, boolean z) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0ICE(z, this, context, null), 3);
    }
}

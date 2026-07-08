package com.ss.android.ugc.now.interaction.service;

import X.C04TD;
import X.C1220000hqw;
import X.C13LE;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.ss.android.ugc.now.interaction.api.IInteractionService;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import com.ss.android.ugc.now.interaction.assem.InteractionSyncVM;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class InteractionService implements IInteractionService {
    @Override // com.ss.android.ugc.now.interaction.api.IInteractionService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(InteractionBubbleListAssem.class);
    }

    public static IInteractionService LIZJ() {
        Object objLIZ = C04TD.LIZ(IInteractionService.class, false);
        if (objLIZ != null) {
            return (IInteractionService) objLIZ;
        }
        if (C04TD.D6 == null) {
            synchronized (IInteractionService.class) {
                if (C04TD.D6 == null) {
                    C04TD.D6 = new InteractionService();
                }
            }
        }
        return C04TD.D6;
    }

    @Override // com.ss.android.ugc.now.interaction.api.IInteractionService
    public final InteractionSyncVM LIZIZ(Fragment fragment) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InteractionSyncVM.class);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(298);
        C451460Hn6 c451460Hn6 = new C451460Hn6(fragment, false);
        C451620HnM c451620HnM = new C451620HnM(fragment, true);
        C338520DOw c338520DOw = new C338520DOw(fragment);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(fragment);
        if (!(fragment instanceof HasDefaultViewModelProviderFactory)) {
            fragment = null;
        }
        return (InteractionSyncVM) new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(fragment), aFwS259S0000000_21, c451460Hn6, c451620HnM, c338520DOw).getValue();
    }
}

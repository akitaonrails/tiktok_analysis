package com.ss.android.ugc.aweme.tako.signal;

import X.AbstractC1387200mCc;
import X.C1388190mED;
import X.C1862720yZa;
import X.C1906580ziK;
import X.C19EG;
import X.C20230914Dz;
import X.InterfaceC214902198i;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tako.signal.impl.TakoContextAbilityImpl;
import com.ss.android.ugc.aweme.tako.ui.TakoChatActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSignalServiceImpl implements ITakoSignalService {
    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoSignalService
    public final TakoContextAbilityImpl LIZ() {
        return new TakoContextAbilityImpl(7, null);
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoSignalService
    public final TakoContextAbilityImpl LIZIZ() {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL();
        if (abstractC1387200mCcLIZLLL == null || (activityLIZIZ = abstractC1387200mCcLIZLLL.LIZIZ()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) == null) {
            return new TakoContextAbilityImpl(7, null);
        }
        InterfaceC214902198i interfaceC214902198iLIZLLL = C20230914Dz.LIZLLL(c19egLIZIZ);
        C1862720yZa.LIZ.getClass();
        Fragment fragmentLIZIZ = C1862720yZa.LIZIZ(c19egLIZIZ, interfaceC214902198iLIZLLL);
        return fragmentLIZIZ != null ? new TakoContextAbilityImpl(3, fragmentLIZIZ) : c19egLIZIZ instanceof TakoChatActivity ? new TakoContextAbilityImpl(3, c19egLIZIZ) : new TakoContextAbilityImpl(7, null);
    }

    @Override // com.ss.android.ugc.aweme.tako.signal.ITakoSignalService
    public final TakoContextAbilityImpl LIZJ() {
        Activity topActivity = ActivityStack.getTopActivity();
        C19EG c19eg = topActivity instanceof C19EG ? (C19EG) topActivity : null;
        InterfaceC214902198i interfaceC214902198iLIZLLL = C20230914Dz.LIZLLL(c19eg);
        C1862720yZa.LIZ.getClass();
        Fragment fragmentLIZIZ = C1862720yZa.LIZIZ(c19eg, interfaceC214902198iLIZLLL);
        if (fragmentLIZIZ != null) {
            return new TakoContextAbilityImpl(3, fragmentLIZIZ);
        }
        if (c19eg instanceof TakoChatActivity) {
            return new TakoContextAbilityImpl(3, c19eg);
        }
        return null;
    }
}

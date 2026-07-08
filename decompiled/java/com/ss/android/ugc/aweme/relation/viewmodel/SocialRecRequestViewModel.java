package com.ss.android.ugc.aweme.relation.viewmodel;

import X.AbstractC1387200mCc;
import X.C004I;
import X.C1070910dyT;
import X.C1071780dzs;
import X.C1072630e1F;
import X.C11S5;
import X.C1239330iM7;
import X.C1388190mED;
import X.C1701940uOG;
import X.C1906580ziK;
import X.C19EG;
import X.C23250099c;
import X.EnumC1070340dxY;
import X.EnumC1072920e1i;
import Y.AfS185S0100000_16;
import Y.AkS478S0100000_16;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialRecRequestViewModel extends JediViewModel<SocialRecRequestState> {
    public static final /* synthetic */ int LLILZLL = 0;
    public boolean LLILZIL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new SocialRecRequestState(false, false, false, false, false, false, null, -1, -1, false);
    }

    public final void hR2(int i) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        if (i == EnumC1072920e1i.NEW_VERSION_FACEBOOK.getValue()) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ), null, null, new C1070910dyT(c19egLIZIZ, EnumC1070340dxY.FACEBOOK, this, null), 3);
                return;
            }
            return;
        }
        C1071780dzs.LIZIZ(C1071780dzs.LIZ, "version_update", "user", "contact", "auto", "uid", "process", null, 448);
        C1072630e1F.LIZ.LJFF(true);
        FriendApi.LIZ.getClass();
        disposeOnClear(C1239330iM7.LIZ().LIZ(1, Boolean.TRUE, Boolean.FALSE, false, false).LJJJ(new AkS478S0100000_16(this, 0), false).LJLJI(5L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 24), new AfS185S0100000_16(this, 25)));
    }
}

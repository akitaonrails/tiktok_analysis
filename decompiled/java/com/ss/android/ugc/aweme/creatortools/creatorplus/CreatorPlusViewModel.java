package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C0TA3;
import X.C11IR;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import Y.AfS181S0100000_12;
import androidx.lifecycle.ViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class CreatorPlusViewModel extends ViewModel {
    public final C11NJ LL = new C11NJ();
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(180));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(179));

    public final void vQ2() {
        C11NZ<CreatorPlusFeaturesResponse> c11nzLIZIZ;
        try {
            c11nzLIZIZ = C0TA3.LIZ.getValue().LIZIZ();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            c11nzLIZIZ = C11IR.LL;
        }
        this.LL.LIZ(c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 121), new AfS181S0100000_12(this, 122)));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL.dispose();
    }
}

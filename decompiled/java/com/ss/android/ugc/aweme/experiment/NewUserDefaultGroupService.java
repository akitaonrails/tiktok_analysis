package com.ss.android.ugc.aweme.experiment;

import X.C104100aN;
import X.C1400310mXl;
import X.C1785606z0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class NewUserDefaultGroupService implements INewUserDefaultGroup {
    @Override // com.ss.android.ugc.aweme.experiment.INewUserDefaultGroup
    public final boolean LIZJ() {
        C1400310mXl.LIZ.getClass();
        return C1400310mXl.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.experiment.INewUserDefaultGroup
    public final boolean LIZ() {
        return C1785606z0.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.experiment.INewUserDefaultGroup
    public final boolean LIZIZ(Function0<Boolean> function0) {
        if (C104100aN.LIZ().isNewUser()) {
            return C1785606z0.LIZ();
        }
        return function0.invoke().booleanValue();
    }
}

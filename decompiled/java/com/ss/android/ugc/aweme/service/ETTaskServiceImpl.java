package com.ss.android.ugc.aweme.service;

import X.C2097908Jt;
import X.InterfaceC381510ExZ;
import com.ss.android.ugc.aweme.api.IETTaskService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class ETTaskServiceImpl implements IETTaskService {
    public final Map<String, Function0<InterfaceC381510ExZ<?, ?>>> LIZ = C2097908Jt.LIZJ(new Pair("COMBINE_EFFECT", AFwS191S0000000_5.get$arr$(42)));

    @Override // com.ss.android.ugc.aweme.api.IETTaskService
    public final InterfaceC381510ExZ LIZ() {
        Function0<InterfaceC381510ExZ<?, ?>> function0 = this.LIZ.get("COMBINE_EFFECT");
        InterfaceC381510ExZ<?, ?> interfaceC381510ExZInvoke = function0 != null ? function0.invoke() : null;
        if (interfaceC381510ExZInvoke instanceof InterfaceC381510ExZ) {
            return interfaceC381510ExZInvoke;
        }
        return null;
    }
}

package com.ss.android.ugc.aweme.account.eventtracking;

import X.AbstractC207072161e;
import X.C13LE;
import X.C2097908Jt;
import X.C2805016t;
import X.InterfaceC1282004zy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class SmsVerifyHasSimEvent extends AbstractC207072161e {
    public final Map<String, C2805016t> LJII;

    public SmsVerifyHasSimEvent() {
        super("sms_retriever_sim");
        this.LJII = C2097908Jt.LIZJ(new Pair("has_sim", new C2805016t(true, AbstractC207072161e.LIZIZ(C13LE.LIZ(Integer.TYPE)), null, false)));
    }

    @Override // X.AbstractC207072161e
    public final Map<String, C2805016t> LIZJ() {
        return this.LJII;
    }

    @Override // X.AbstractC207072161e
    public final AbstractC207072161e LJII(InterfaceC1282004zy interfaceC1282004zy) {
        LIZ().add(interfaceC1282004zy);
        return this;
    }
}

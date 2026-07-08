package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C0CHQ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectDeserializer implements j<Effect> {
    @Override // com.google.gson.j
    public final Effect deserialize(k kVar, Type type, i iVar) {
        try {
            return (Effect) C0CHQ.LIZ().LJJIJL().LIZJ(kVar.LJIILIIL(), Effect.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C0CHQ;
import X.C2346009He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes35.dex */
public final class BackgroundVideoDeserializer implements j<BackgroundVideo> {
    @Override // com.google.gson.j
    public final BackgroundVideo deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            C2346009He.LIZJ(nVarLJIILIIL, "videoPath");
            return (BackgroundVideo) C0CHQ.LIZ().LJJIJL().LIZJ(nVarLJIILIIL, BackgroundVideo.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

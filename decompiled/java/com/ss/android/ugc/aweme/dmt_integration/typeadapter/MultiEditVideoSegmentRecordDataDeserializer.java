package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C2346009He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiEditVideoSegmentRecordDataDeserializer implements j<MultiEditVideoSegmentRecordData> {
    @Override // com.google.gson.j
    public final MultiEditVideoSegmentRecordData deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            C2346009He.LIZJ(nVarLJIILIIL, "video_path");
            C2346009He.LIZLLL(nVarLJIILIIL, "video_path", "new_video_path");
            C2346009He.LIZJ(nVarLJIILIIL, "draft_video_path");
            C2346009He.LIZLLL(nVarLJIILIIL, "draft_video_path", "new_draft_video_path");
            return (MultiEditVideoSegmentRecordData) new Gson().LIZJ(nVarLJIILIIL, MultiEditVideoSegmentRecordData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

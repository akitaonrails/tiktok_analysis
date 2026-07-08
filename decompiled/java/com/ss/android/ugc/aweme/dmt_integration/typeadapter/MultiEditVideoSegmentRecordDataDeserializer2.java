package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C201955140j;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiEditVideoSegmentRecordDataDeserializer2 implements j<MultiEditVideoSegmentRecordData> {
    @Override // com.google.gson.j
    public final MultiEditVideoSegmentRecordData deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("video_path");
            if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof q)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MultiEditVideoSegmentRecordDataDeserializer2 video_path : ");
                sbLIZ.append(kVarLJJIIZ.LJIILIIL().LJJIIZ("path"));
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                nVarLJIILIIL.LJJIJL("video_path");
                nVarLJIILIIL.LJJIFFI("video_path", kVarLJJIIZ.LJIILIIL().LJJIIZ("path"));
            }
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("new_video_path");
            if (kVarLJJIIZ2 != null && !(kVarLJJIIZ2 instanceof q)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MultiEditVideoSegmentRecordDataDeserializer2 new_video_path : ");
                sbLIZ2.append(kVarLJJIIZ2.LJIILIIL().LJJIIZ("path"));
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                nVarLJIILIIL.LJJIJL("video_path");
                nVarLJIILIIL.LJJIFFI("video_path", kVarLJJIIZ2.LJIILIIL().LJJIIZ("path"));
            }
            k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("draft_video_path");
            if (kVarLJJIIZ3 != null && !(kVarLJJIIZ3 instanceof q)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MultiEditVideoSegmentRecordDataDeserializer2 draft_video_path : ");
                sbLIZ3.append(kVarLJJIIZ3.LJIILIIL().LJJIIZ("path"));
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                nVarLJIILIIL.LJJIJL("draft_video_path");
                nVarLJIILIIL.LJJIFFI("draft_video_path", kVarLJJIIZ3.LJIILIIL().LJJIIZ("path"));
            }
            k kVarLJJIIZ4 = nVarLJIILIIL.LJJIIZ("new_draft_video_path");
            if (kVarLJJIIZ4 != null && !(kVarLJJIIZ4 instanceof q)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("MultiEditVideoSegmentRecordDataDeserializer2 new_draft_video_path : ");
                sbLIZ4.append(kVarLJJIIZ4.LJIILIIL().LJJIIZ("path"));
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                nVarLJIILIIL.LJJIJL("draft_video_path");
                nVarLJIILIIL.LJJIFFI("draft_video_path", kVarLJJIIZ4.LJIILIIL().LJJIIZ("path"));
            }
            return (MultiEditVideoSegmentRecordData) new Gson().LIZJ(nVarLJIILIIL, MultiEditVideoSegmentRecordData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("MultiEditVideoSegmentRecordDataDeserializer2 error :");
            sbLIZ5.append(e);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ5));
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C0CHQ;
import X.C2346009He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class MvCreateVideoDataDeserializer implements j<MvCreateVideoData> {
    @Override // com.google.gson.j
    public final MvCreateVideoData deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            C2346009He.LIZ(nVarLJIILIIL, "select_media_list");
            C2346009He.LIZIZ(nVarLJIILIIL, "select_media_list", "new_select_media_list");
            C2346009He.LIZ(nVarLJIILIIL, "select_src_media_list");
            C2346009He.LIZIZ(nVarLJIILIIL, "select_src_media_list", "new_select_src_media_list");
            C2346009He.LIZ(nVarLJIILIIL, "photo_to_save");
            C2346009He.LIZIZ(nVarLJIILIIL, "photo_to_save", "new_photo_to_save");
            C2346009He.LIZJ(nVarLJIILIIL, "mv_contact_video_path");
            C2346009He.LIZLLL(nVarLJIILIIL, "mv_contact_video_path", "new_mv_contact_video_path");
            return (MvCreateVideoData) C0CHQ.LIZ().LJJIJL().LIZJ(nVarLJIILIIL, MvCreateVideoData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

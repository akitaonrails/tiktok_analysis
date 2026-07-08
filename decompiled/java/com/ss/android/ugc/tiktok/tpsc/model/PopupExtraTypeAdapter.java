package com.ss.android.ugc.tiktok.tpsc.model;

import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.r;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class PopupExtraTypeAdapter implements j<PopupExtra>, r<PopupExtra> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        return aVar.LIZIZ(obj);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.tiktok.tpsc.model.PopupExtra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.tiktok.tpsc.model.PopupExtra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.tiktok.tpsc.model.PopupExtra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.ss.android.ugc.tiktok.tpsc.model.PopupExtra, java.lang.Object] */
    @Override // com.google.gson.j
    public final PopupExtra deserialize(k kVar, Type type, i iVar) {
        Integer numValueOf;
        k kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("type");
        if (kVarLJJIIZ == null || (numValueOf = Integer.valueOf(kVarLJJIIZ.LJIIJJI())) == null) {
            return null;
        }
        if (numValueOf.intValue() == 1) {
            if (iVar == null) {
                return null;
            }
            return ((TreeTypeAdapter.a) iVar).LIZ(kVar, ContentReuseAccountExtra.class);
        }
        if (numValueOf.intValue() == 2) {
            if (iVar == null) {
                return null;
            }
            return ((TreeTypeAdapter.a) iVar).LIZ(kVar, ContentReuseItemExtra.class);
        }
        if (numValueOf.intValue() == 3) {
            if (iVar == null) {
                return null;
            }
            return ((TreeTypeAdapter.a) iVar).LIZ(kVar, CheckupExtra.class);
        }
        if ((numValueOf.intValue() != 5 && numValueOf.intValue() != 6) || iVar == null) {
            return null;
        }
        return ((TreeTypeAdapter.a) iVar).LIZ(kVar, ViewerHistoryExtra.class);
    }
}

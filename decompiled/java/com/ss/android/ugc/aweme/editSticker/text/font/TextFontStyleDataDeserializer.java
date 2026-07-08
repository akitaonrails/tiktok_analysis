package com.ss.android.ugc.aweme.editSticker.text.font;

import X.C0CHQ;
import X.C1465490oEt;
import X.C201955140j;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.text.u;

/* JADX INFO: loaded from: classes3.dex */
public final class TextFontStyleDataDeserializer implements j<TextFontStyleData> {
    @Override // com.google.gson.j
    public final TextFontStyleData deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : nVarLJIILIIL.LJJIJIL()) {
                if (u.LJJIIJZLJL(str, "translated_title_", false)) {
                    linkedHashMap.put(str, nVarLJIILIIL.LJJIIZ(str).LJIL());
                }
            }
            Object objLIZJ = C0CHQ.LIZ().LJJIJL().LIZJ(nVarLJIILIIL, TextFontStyleData.class);
            ((TextFontStyleData) objLIZJ).LIZIZ = linkedHashMap;
            return (TextFontStyleData) objLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C1465490oEt.LIZIZ, "deserialize TextFontStyleData error", e);
            return null;
        }
    }
}

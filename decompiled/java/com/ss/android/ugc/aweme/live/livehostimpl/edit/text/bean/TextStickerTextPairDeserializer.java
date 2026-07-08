package com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean;

import X.C1632480saE;
import X.C19748512Ol;
import X.C201955140j;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class TextStickerTextPairDeserializer implements j<TextStickerTextPair> {
    @Override // com.google.gson.j
    public final TextStickerTextPair deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("a");
            if (kVarLJJIIZ == null && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("first")) == null) {
                return new TextStickerTextPair("", new ArrayList());
            }
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("b");
            if (kVarLJJIIZ2 == null && (kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("second")) == null) {
                return new TextStickerTextPair("", new ArrayList());
            }
            if (kVarLJJIIZ instanceof q) {
                return new TextStickerTextPair(kVarLJJIIZ.LJIL(), (List) C19748512Ol.LIZIZ.LJIIIIZZ(kVarLJJIIZ2.LJIIL().toString(), new TypeToken<List<? extends InteractTextStructWrap>>() { // from class: X.1253
                }.getType()));
            }
            if (kVarLJJIIZ2 instanceof q) {
                return new TextStickerTextPair(kVarLJJIIZ2.LJIL(), (List) C19748512Ol.LIZIZ.LJIIIIZZ(kVarLJJIIZ.LJIIL().toString(), new TypeToken<List<? extends InteractTextStructWrap>>() { // from class: X.1254
                }.getType()));
            }
            return new TextStickerTextPair("", new ArrayList());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C1632480saE.LIZIZ, "TextStickerTextPairDeserializer.deserialize error", e);
            return new TextStickerTextPair("", new ArrayList());
        }
    }
}

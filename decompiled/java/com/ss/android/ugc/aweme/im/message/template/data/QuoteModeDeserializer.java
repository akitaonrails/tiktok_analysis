package com.ss.android.ugc.aweme.im.message.template.data;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class QuoteModeDeserializer implements j<QuoteMode> {
    @Override // com.google.gson.j
    public final QuoteMode deserialize(k kVar, Type type, i iVar) {
        try {
            if (kVar instanceof n) {
                n nVarLJIILIIL = kVar.LJIILIIL();
                if (nVarLJIILIIL.LJJIJIIJIL("refInfo")) {
                    return (QuoteMode) ((TreeTypeAdapter.a) iVar).LIZ(nVarLJIILIIL, QuoteMode.Reply.class);
                }
                if (nVarLJIILIIL.LJJIJIIJIL("attachment")) {
                    return (QuoteMode) ((TreeTypeAdapter.a) iVar).LIZ(nVarLJIILIIL, QuoteMode.Quote.class);
                }
                if (nVarLJIILIIL.LJJIJIIJIL("type") && Intrinsics.LJFF(nVarLJIILIIL.LJJIIZ("type").LJIL(), "None")) {
                    return QuoteMode.None.INSTANCE;
                }
                return null;
            }
            throw new o("Expected JsonObject for QuoteMode");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.im.message.template.data;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.r;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes35.dex */
public final class QuoteModeSerializer implements r<QuoteMode> {
    @Override // com.google.gson.r
    public final k LIZ(Object obj, Type type, TreeTypeAdapter.a aVar) {
        try {
            if (obj instanceof QuoteMode.Reply) {
                return aVar.LIZJ(obj, QuoteMode.Reply.class);
            }
            if (obj instanceof QuoteMode.Quote) {
                return aVar.LIZJ(obj, QuoteMode.Quote.class);
            }
            if (obj instanceof QuoteMode.None) {
                n nVar = new n();
                nVar.LJJIIJ("type", "None");
                return nVar;
            }
            return m.LL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return m.LL;
        }
    }
}

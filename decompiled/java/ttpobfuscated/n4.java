package ttpobfuscated;

import java.util.HashMap;
import ttp.orbu.sdk.repository.model.DBEvent;

/* JADX INFO: loaded from: classes24.dex */
public final class n4 implements m4 {
    public final HashMap<String, c4<?>> a = new HashMap<>();

    @Override // ttpobfuscated.m4
    public fg<? extends b2> a(DBEvent dBEvent) {
        c4<?> c4Var = this.a.get(dBEvent.c);
        if (c4Var != null) {
            return c4Var.a(dBEvent);
        }
        return null;
    }

    @Override // ttpobfuscated.m4
    public void a(String str, c4<?> c4Var) {
        this.a.put(str, c4Var);
    }
}

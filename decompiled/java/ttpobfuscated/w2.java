package ttpobfuscated;

import java.util.Date;
import ttp.orbu.sdk.repository.model.DBEventSent;

/* JADX INFO: loaded from: classes24.dex */
public final class w2 {
    public static final qd a(DBEventSent dBEventSent) {
        return new qd(dBEventSent.a, new Date(dBEventSent.b));
    }

    public static final DBEventSent a(qd qdVar) {
        return new DBEventSent(qdVar.a, qdVar.b.getTime());
    }
}

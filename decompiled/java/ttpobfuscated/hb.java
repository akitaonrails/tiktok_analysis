package ttpobfuscated;

import X.C2097908Jt;
import java.util.Date;
import kotlin.Pair;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class hb {
    public static final cc a(gb gbVar) {
        return new cc("predefined", new Request.PreDefinedFlow(Integer.valueOf(gbVar.a), new Date()), System.currentTimeMillis(), C2097908Jt.LIZJ(new Pair("x-tt-dataflow-id", String.valueOf(gbVar.a))));
    }
}

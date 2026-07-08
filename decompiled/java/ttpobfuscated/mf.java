package ttpobfuscated;

import java.util.Map;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class mf {
    public static final a a = new a();
    public static mf b = new mf();

    public static final class a {
        public final mf a() {
            return mf.b;
        }
    }

    public final ra a(OrbuCodeConfig orbuCodeConfig, fe feVar, GeneralConfig generalConfig, Map<String, ? extends Map<String, String>> map, ad<Request> adVar) {
        bh.c.getClass();
        if (bh.d.a) {
            return new ef(orbuCodeConfig, feVar, generalConfig, map, adVar);
        }
        return new df(orbuCodeConfig, feVar, generalConfig, map, adVar);
    }
}

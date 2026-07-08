package com.bytedance.pia.core.cache;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes35.dex */
public interface IPiaCacheProvider {

    public static final class CacheConfig {

        @C09CT("expire")
        public Number expire;

        @C09CT("marked")
        public Boolean marked;

        @C09CT("maxAge")
        public final Number maxAge;

        @C09CT("meta")
        public final n meta;

        @C09CT("version")
        public final String version;

        public CacheConfig() {
            this(null, null, null, null, null);
        }

        public final n LIZ() {
            n nVar = new n();
            Number number = this.maxAge;
            if (number != null) {
                nVar.LJJIII(number, "maxAge");
            }
            String str = this.version;
            if (str != null) {
                nVar.LJJIIJ("version", str);
            }
            Number number2 = this.expire;
            if (number2 != null) {
                nVar.LJJIII(number2, "expire");
            }
            n nVar2 = this.meta;
            if (nVar2 != null) {
                nVar.LJJIFFI("meta", nVar2);
            }
            Boolean bool = this.marked;
            if (bool != null) {
                bool.booleanValue();
                nVar.LJJII(this.marked, "marked");
            }
            return nVar;
        }

        public final String toString() {
            return LIZ().toString();
        }

        public CacheConfig(Number number, String str, n nVar, Number number2, Boolean bool) {
            this.maxAge = number;
            this.version = str;
            this.meta = nVar;
            this.expire = number2;
            this.marked = bool;
        }
    }

    String LIZ();

    CacheConfig LIZIZ();

    String LIZJ();
}

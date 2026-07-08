package ttp.orbu.sdk.app.domain.usecase;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public abstract class TTPResult<DATA> {
    public final Map<String, List<String>> a;

    public static final class a<DATA> extends TTPResult<DATA> {
        public final TTPError b;

        public final TTPError b() {
            return this.b;
        }

        public a(TTPError tTPError, Map<String, ? extends List<String>> map) {
            super(map);
            this.b = tTPError;
        }
    }

    public static final class b<DATA> extends TTPResult<DATA> {
        public final DATA b;

        public final DATA b() {
            return this.b;
        }

        public b(DATA data, Map<String, ? extends List<String>> map) {
            super(map);
            this.b = data;
        }
    }

    public final Map<String, List<String>> a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTPResult(Map<String, ? extends List<String>> map) {
        this.a = map;
    }
}

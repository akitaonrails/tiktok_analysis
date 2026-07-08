package defpackage;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoPrefetchEventConfig {

    @C09CT("disabled_events")
    public final List<String> disabledEvents;

    public PipoPrefetchEventConfig() {
        this(null);
    }

    public PipoPrefetchEventConfig(List<String> list) {
        this.disabledEvents = list;
    }
}

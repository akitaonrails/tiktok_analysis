package ttpobfuscated;

import X.C01GW;
import X.C09AY;
import X.C452501pT;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes24.dex */
public final class ee {
    public static final C01GW c = C452501pT.LIZIZ(a.a);

    public static final class a extends C09AY implements Function0<Regex> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final Regex a() {
            return new Regex("[0-9a-fA-F]+");
        }

        @Override // kotlin.jvm.functions.Function0
        public Regex invoke() {
            return new Regex("[0-9a-fA-F]+");
        }
    }

    public static final Regex a() {
        return (Regex) c.getValue();
    }

    public static final Regex b() {
        return (Regex) c.getValue();
    }
}

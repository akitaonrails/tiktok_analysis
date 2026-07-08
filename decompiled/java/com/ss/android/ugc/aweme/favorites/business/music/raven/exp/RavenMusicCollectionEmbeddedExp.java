package com.ss.android.ugc.aweme.favorites.business.music.raven.exp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class RavenMusicCollectionEmbeddedExp {
    public static final EmbeddedModel LIZ = new EmbeddedModel(false, 0, "aweme://roma_redirect/?spark_page=music_collection_embedded_single_card");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(71));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(70));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(72));

    public static final boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static final class EmbeddedModel {

        @C09CT("embedded_mode")
        public final int embeddedMode;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("test_schema")
        public final String testSchema;

        public EmbeddedModel() {
            this(false, 0, "aweme://roma_redirect/?spark_page=music_collection_embedded_single_card");
        }

        public EmbeddedModel(boolean z, int i, String str) {
            this.enable = z;
            this.embeddedMode = i;
            this.testSchema = str;
        }
    }
}

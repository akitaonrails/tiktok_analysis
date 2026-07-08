package com.bytedance.android.starship;

import X.C08FF;
import X.C1308100k92;

/* JADX INFO: loaded from: classes21.dex */
public interface StarshipCxxContainer {
    public static final C1308100k92 Companion = C1308100k92.LIZ;

    public enum Type {
        STARSHIP_CLIENT,
        MULTI_MEDIA,
        LYRAX,
        LYRAX_TEST,
        TTLH_CLIENT;

        public static Type valueOf(String str) {
            return (Type) C08FF.LIZ(Type.class, str);
        }
    }

    boolean initStrategies();

    void registerDataStore(IDataStore iDataStore);
}

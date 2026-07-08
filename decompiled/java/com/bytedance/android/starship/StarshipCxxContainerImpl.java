package com.bytedance.android.starship;

import X.C01GW;
import X.C1308080k90;
import X.C452501pT;
import com.bytedance.android.starship.StarshipCxxContainer;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes21.dex */
public final class StarshipCxxContainerImpl implements StarshipCxxContainer {
    public static final C1308080k90 Companion = new C1308080k90();
    public static final ConcurrentHashMap<StarshipCxxContainer.Type, StarshipCxxContainerImpl> instances = new ConcurrentHashMap<>();
    public static final C01GW<Unit> loadSdkLibrary$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(339));
    public final StarshipCxxContainer.Type type;

    public static final StarshipCxxContainer get(StarshipCxxContainer.Type type) {
        return Companion.LIZ(type);
    }

    public static final native boolean initStrategies(int i);

    public static final native boolean registerDataProvider(String str, Object obj);

    public static final native boolean registerDataStore(int i, String str, Object obj);

    @Override // com.bytedance.android.starship.StarshipCxxContainer
    public boolean initStrategies() {
        C1308080k90 c1308080k90 = Companion;
        int iOrdinal = this.type.ordinal();
        c1308080k90.getClass();
        return initStrategies(iOrdinal);
    }

    public final StarshipCxxContainer.Type getType() {
        return this.type;
    }

    public StarshipCxxContainerImpl(StarshipCxxContainer.Type type) {
        this.type = type;
        Companion.getClass();
        loadSdkLibrary$delegate.getValue();
    }

    @Override // com.bytedance.android.starship.StarshipCxxContainer
    public void registerDataStore(IDataStore iDataStore) {
        C1308080k90 c1308080k90 = Companion;
        int iOrdinal = this.type.ordinal();
        String name = iDataStore.getName();
        c1308080k90.getClass();
        registerDataStore(iOrdinal, name, iDataStore);
    }
}

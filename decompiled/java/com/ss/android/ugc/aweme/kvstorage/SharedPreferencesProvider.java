package com.ss.android.ugc.aweme.kvstorage;

import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import com.aweme.kvstorage.spi.ISharedPreferencesProvider;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class SharedPreferencesProvider implements ISharedPreferencesProvider {
    @Override // com.aweme.kvstorage.spi.ISharedPreferencesProvider
    public final SharedPreferences LIZ(Context context, int i, String str) {
        HashSet<String> hashSet = C810670Vr7.LIZLLL;
        if (!hashSet.contains(str)) {
            hashSet.add(str);
        }
        return C810670Vr7.LIZJ(context, i, str);
    }
}

package com.bytedance.pumbaa.common.impl.store;

import X.C1ECE;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.pumbaa.common.interfaces.IStore;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class KevaStoreImpl implements IStore {
    public final Map<String, C1ECE> LIZ = new LinkedHashMap();

    @Override // com.bytedance.pumbaa.common.interfaces.IStore
    public final C1ECE LIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1ECE c1ece = (C1ECE) ((LinkedHashMap) this.LIZ).get(strLIZIZ);
        if (c1ece == null) {
            final Keva repo = KevaImpl.getRepo(str, i);
            C1ECE c1ece2 = new C1ECE(repo) { // from class: X.052R
                public final Keva LIZ;

                @Override // X.C1ECE
                public final void clear() {
                    this.LIZ.clear();
                }

                @Override // X.C1ECE
                public final Map<String, ?> getAll() {
                    return this.LIZ.getAll();
                }

                {
                    this.LIZ = repo;
                }

                @Override // X.C1ECE
                public final void remove(String str2) {
                    this.LIZ.erase(str2);
                }

                @Override // X.C1ECE
                public final boolean getBoolean(String str2, boolean z) {
                    return this.LIZ.getBoolean(str2, z);
                }

                @Override // X.C1ECE
                public final float getFloat(String str2, float f) {
                    return this.LIZ.getFloat(str2, f);
                }

                @Override // X.C1ECE
                public final int getInt(String str2, int i2) {
                    return this.LIZ.getInt(str2, i2);
                }

                @Override // X.C1ECE
                public final long getLong(String str2, long j) {
                    return this.LIZ.getLong(str2, j);
                }

                @Override // X.C1ECE
                public final String getString(String str2, String str3) {
                    String string = this.LIZ.getString(str2, str3);
                    if (string != null) {
                        return string;
                    }
                    return str3;
                }

                @Override // X.C1ECE
                public final Set<String> getStringSet(String str2, Set<String> set) {
                    return this.LIZ.getStringSet(str2, set);
                }

                @Override // X.C1ECE
                public final void putBoolean(String str2, boolean z) {
                    this.LIZ.storeBoolean(str2, z);
                }

                @Override // X.C1ECE
                public final void putFloat(String str2, float f) {
                    this.LIZ.storeFloat(str2, f);
                }

                @Override // X.C1ECE
                public final void putInt(String str2, int i2) {
                    this.LIZ.storeInt(str2, i2);
                }

                @Override // X.C1ECE
                public final void putLong(String str2, long j) {
                    this.LIZ.storeLong(str2, j);
                }

                @Override // X.C1ECE
                public final void putString(String str2, String str3) {
                    this.LIZ.storeString(str2, str3);
                }

                @Override // X.C1ECE
                public final void putStringSet(String str2, Set<String> set) {
                    this.LIZ.storeStringSet(str2, set);
                }
            };
            ((LinkedHashMap) this.LIZ).get(strLIZIZ);
            return c1ece2;
        }
        return c1ece;
    }
}

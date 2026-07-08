package com.ss.android.ugc.aweme.net;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C0W75;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes31.dex */
public class UserTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!User.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        final TypeAdapter<T> typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.net.UserTypeAdapterFactory.1
            /* JADX WARN: Type inference failed for: r3v1, types: [T, com.ss.android.ugc.aweme.profile.model.User] */
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                    c09cu.LJJJJJL();
                    return null;
                }
                ?? r3 = (T) ((User) typeAdapterLJIIJJI.read(c09cu));
                C0W75.LIZ().LJI(r3.getUid(), r3.getSecUid());
                return r3;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                if (t == null) {
                    c09dl.LJIJJ();
                } else {
                    typeAdapterLJIIJJI.write(c09dl, t);
                }
            }
        };
    }
}

package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C09FI;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeSpeedModelChallengeAdapterFactory implements v {

    public static final class TimeSpeedModelChallengeAdapter extends TypeAdapter<List<? extends AVChallenge>> {
        public final TypeAdapter<AVChallenge> LIZ;

        public TimeSpeedModelChallengeAdapter(Gson gson) {
            this.LIZ = gson.LJIIJ(AVChallenge.class);
        }

        @Override // com.google.gson.TypeAdapter
        public final List<? extends AVChallenge> read(C09CU c09cu) {
            if (c09cu != null) {
                C09D6 c09d6LJJLIIIJ = c09cu.LJJLIIIJ();
                if (c09d6LJJLIIIJ != null) {
                    int i = C09FI.LIZ[c09d6LJJLIIIJ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return Collections.singletonList(this.LIZ.read(c09cu));
                            }
                        } else {
                            c09cu.LIZ();
                            ArrayList arrayList = new ArrayList();
                            while (c09cu.LJIIZILJ()) {
                                arrayList.add(this.LIZ.read(c09cu));
                            }
                            c09cu.LJI();
                            return arrayList;
                        }
                    } else {
                        return null;
                    }
                }
                throw new o("Expected JSON ARRAY or JSON OBJECT ");
            }
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(C09DL c09dl, List<? extends AVChallenge> list) {
            List<? extends AVChallenge> list2 = list;
            if (c09dl != null) {
                if (list2 != null) {
                    c09dl.LIZIZ();
                    Iterator<? extends AVChallenge> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        this.LIZ.write(c09dl, it2.next());
                    }
                    c09dl.LJI();
                    return;
                }
                c09dl.LJIJJ();
            }
        }
    }

    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (!Intrinsics.LJFF(typeToken, new TypeToken<List<AVChallenge>>() { // from class: X.09FJ
        }) && !Intrinsics.LJFF(typeToken.getRawType(), AVChallenge.class)) {
            return null;
        }
        return new TimeSpeedModelChallengeAdapter(gson);
    }
}

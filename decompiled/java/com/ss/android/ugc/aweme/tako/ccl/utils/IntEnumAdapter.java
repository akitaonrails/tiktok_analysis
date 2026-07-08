package com.ss.android.ugc.aweme.tako.ccl.utils;

import X.C089E;
import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C09GY;
import X.C1859820yUu;
import X.C19991913Kb;
import X.C19992013Kc;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.tako.ccl.model.api.DisclaimerType;
import java.lang.Enum;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class IntEnumAdapter<T extends Enum<T>> extends TypeAdapter<T> {
    public final T LIZ;
    public final Function1<T, Integer> LIZIZ;
    public final C19991913Kb LIZJ;

    @Override // com.google.gson.TypeAdapter
    public final Object read(C09CU c09cu) {
        C09D6 c09d6LJJLIIIJ;
        if (c09cu == null || (c09d6LJJLIIIJ = c09cu.LJJLIIIJ()) == null || C09GY.LIZ[c09d6LJJLIIIJ.ordinal()] != 1) {
            return null;
        }
        V vLIZLLL = this.LIZJ.LIZLLL(Integer.valueOf(c09cu.LJJIZ()));
        if (vLIZLLL == 0) {
            return this.LIZ;
        }
        return vLIZLLL;
    }

    public IntEnumAdapter(DisclaimerType disclaimerType, C1859820yUu c1859820yUu) {
        C19991913Kb c19991913Kb;
        this.LIZ = disclaimerType;
        this.LIZIZ = c1859820yUu;
        Enum[] enumArr = (Enum[]) disclaimerType.getClass().getEnumConstants();
        if (enumArr != null) {
            c19991913Kb = new C19991913Kb(enumArr.length);
            C089E c089e = new C089E(enumArr);
            while (c089e.hasNext()) {
                Object next = c089e.next();
                c19991913Kb.LJIIJJI(this.LIZIZ.invoke((T) next), next);
            }
        } else {
            c19991913Kb = C19992013Kc.LIZIZ;
        }
        this.LIZJ = c19991913Kb;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Object obj) {
        if (obj != null) {
            if (c09dl != null) {
                c09dl.LJJJJ(this.LIZIZ.invoke(obj));
            }
        } else {
            if (c09dl == null) {
                return;
            }
            c09dl.LJIJJ();
        }
    }
}

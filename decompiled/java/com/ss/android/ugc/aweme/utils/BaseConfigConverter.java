package com.ss.android.ugc.aweme.utils;

import X.C06W3;
import X.C06W4;
import X.C06W5;
import X.C06W6;
import X.C1202330hOR;
import X.C13LQ;
import X.C19D4;
import X.C680910QnJ;
import X.C721340SRg;
import com.bytedance.ies.foundation.base.IBaseConfigConverter;

/* JADX INFO: loaded from: classes33.dex */
public final class BaseConfigConverter implements IBaseConfigConverter {
    @Override // com.bytedance.ies.foundation.base.IBaseConfigConverter
    public final C06W3 LIZ(C06W4 c06w4) {
        if (c06w4 instanceof C06W3) {
            return (C06W3) c06w4;
        }
        if (c06w4 instanceof C680910QnJ) {
            return new C721340SRg(((C680910QnJ) c06w4).LIZ);
        }
        if (c06w4 instanceof C06W6) {
            C06W6 c06w6 = (C06W6) c06w4;
            if (C13LQ.LJJIJ(c06w6.LIZ, new int[]{-1, 0, 1, 2, 6, 7, 8, 9, 10, 11}) >= 0) {
                return new C06W5(c06w6.LIZ);
            }
            return null;
        }
        if (c06w4 instanceof C19D4) {
            C1202330hOR c1202330hOR = new C1202330hOR(false, 3);
            C19D4 c19d4 = (C19D4) c06w4;
            c1202330hOR.LIZ = c19d4.LIZ;
            c1202330hOR.LIZIZ = c19d4.LIZIZ;
            c1202330hOR.LIZJ = c19d4.LIZJ;
            c1202330hOR.LIZLLL = c19d4.LIZLLL;
            c1202330hOR.LJ = c19d4.LJ;
            c1202330hOR.LJFF = c19d4.LJFF;
            c1202330hOR.LJI = c19d4.LJI;
            return c1202330hOR;
        }
        return null;
    }
}

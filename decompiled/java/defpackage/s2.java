package defpackage;

import X.C2095008Iq;

/* JADX INFO: loaded from: classes28.dex */
public final class s2 {
    public static final Integer LIZ(r2 r2Var) {
        String str = r2Var.LJJIFFI.get("active_ai_image_sub_bar");
        if (str != null) {
            return C2095008Iq.LJIIJJI(str);
        }
        return null;
    }

    public static final boolean LIZIZ(r2 r2Var) {
        long j;
        int i;
        if (r2Var.LJ()) {
            j = r2Var.LJJ.LJIIL.LJIILJJIL;
        } else {
            j = r2Var.LJIILLIIL.LJII;
        }
        if (j == 1) {
            if (r2Var.LJ()) {
                i = r2Var.LJJ.LJIIL.LJIILL;
            } else {
                i = r2Var.LJIILLIIL.LJIIIIZZ;
            }
            if (i == 1) {
                if (r2Var.LIZIZ == 1 && r2Var.LIZJ.msgType == 7) {
                    return false;
                }
                return r2Var.LJIILLIIL.LJIL;
            }
        }
        return false;
    }
}

package mcf;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.status.loading.TuxSpinner;
import dc.a;

/* JADX INFO: loaded from: classes32.dex */
public final class d0 {
    public int LIZ = -1;
    public int LIZIZ = -1;

    public final void LIZ(String str, a.b bVar, TuxSpinner tuxSpinner) {
        int i;
        tuxSpinner.getContext();
        String strLJ = ec.a.LJ(str);
        int iHashCode = strLJ.hashCode();
        if (iHashCode != 280523342) {
            if (iHashCode != 292743585) {
                if (iHashCode == 1495653632 && strLJ.equals("tux_tintColor")) {
                    this.LIZIZ = CastIntegerProtector.parseInt(bVar.LIZ);
                }
            } else if (strLJ.equals("tux_icon")) {
                this.LIZ = CastIntegerProtector.parseInt(bVar.LIZ);
            }
        } else if (strLJ.equals("gravity")) {
            tuxSpinner.setForegroundGravity(17);
        }
        int i2 = this.LIZ;
        if (i2 > 0 && (i = this.LIZIZ) > 0) {
            tuxSpinner.LIZ(i2, i);
        }
    }
}

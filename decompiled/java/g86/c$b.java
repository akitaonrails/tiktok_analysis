package g86;

import X.AbstractC1317910kOr;
import X.C1317920kOs;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class c$b extends AbstractC1317910kOr {
    public int LIZIZ;

    public final void LIZLLL(int i) throws C1317920kOs {
        try {
            if ((i & (-128)) == 0) {
                this.LIZIZ++;
                throw null;
            }
            this.LIZIZ++;
            throw null;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1317920kOs(C786410Ut5.j4("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LIZIZ), 0, 1}), e);
        }
    }

    @Override // X.AbstractC1317910kOr
    public final void LIZ(int i, int i2) throws C1317920kOs {
        LIZJ(i, 5);
        throw null;
    }

    public final void LIZJ(int i, int i2) throws C1317920kOs {
        LIZLLL((i << 3) | i2);
        throw null;
    }
}

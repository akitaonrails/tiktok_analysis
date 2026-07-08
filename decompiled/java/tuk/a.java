package tuk;

import X.AbstractC1632560saM;
import X.C1284660jXE;
import X.C1629340sVA;
import X.C1629620sVc;
import X.C1632710sab;
import X.C2188811AlT;
import X.InterfaceC1627740sSa;
import X.InterfaceC1629760sVq;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public final class a extends AbstractC1632560saM<C1629340sVA, Effect, C1629620sVc> implements InterfaceC1627740sSa {
    public InterfaceC1629760sVq LJIIJJI;

    @Override // X.AbstractC1632560saM
    public final Void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    public a(InterfaceC1629760sVq interfaceC1629760sVq) {
        super(5);
        this.LJIIJJI = interfaceC1629760sVq;
    }

    @Override // X.AbstractC1632560saM, X.InterfaceC1632590saP
    public final void LIZJ(boolean z) {
        super.LIZJ(z);
        this.LJIIJJI = null;
    }

    @Override // X.AbstractC1632560saM
    public final String LJII(C1629340sVA c1629340sVA) {
        return c1629340sVA.LIZ.getEffectId();
    }

    @Override // X.InterfaceC1627740sSa
    public final boolean LIZ(Effect effect, boolean z) {
        InterfaceC1629760sVq interfaceC1629760sVq = this.LJIIJJI;
        if (interfaceC1629760sVq != null) {
            return interfaceC1629760sVq.LIZ(effect, z);
        }
        return false;
    }

    @Override // X.AbstractC1632560saM
    public final void LJFF(Object obj, C1632710sab c1632710sab) {
        InterfaceC1629760sVq interfaceC1629760sVq = this.LJIIJJI;
        if (interfaceC1629760sVq != null) {
            interfaceC1629760sVq.LIZIZ(obj, c1632710sab);
        }
    }
}

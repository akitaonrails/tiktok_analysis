package com.bytedance.ies.safemode.SmartProtected.state;

import X.C09CT;
import X.C09DE;
import X.C1BN4;

/* JADX INFO: loaded from: classes35.dex */
public abstract class BaseState implements C1BN4 {
    public SmartProtectedStateMachine LIZ;

    @C09CT("stateParam")
    @C09DE
    public StateParam stateParam;

    @Override // X.C1BN4
    public void LIZ(long j, String str, String str2) {
    }

    public void LJFF() {
    }

    public void LJI(C1BN4 c1bn4, StateParam stateParam) {
    }

    public void LJII(C1BN4 c1bn4) {
    }

    public final ExceptionManager LJ() {
        return ExceptionManager.LIZJ(this.LIZ.LJ);
    }

    @Override // X.C1BN4
    public final StateParam getParam() {
        return this.stateParam;
    }

    @Override // X.C1BN4
    public final void LIZIZ(SmartProtectedStateMachine smartProtectedStateMachine) {
        this.LIZ = smartProtectedStateMachine;
        LJFF();
    }

    @Override // X.C1BN4
    public void LIZJ(C1BN4 c1bn4) {
        LJII(c1bn4);
    }

    @Override // X.C1BN4
    public final void LIZLLL(C1BN4 c1bn4, StateParam stateParam) {
        this.stateParam = stateParam;
        LJI(c1bn4, stateParam);
    }

    public final synchronized void LJIIIIZZ(C1BN4 c1bn4, StateParam stateParam) {
        if (c1bn4 == null) {
            return;
        }
        if (this.LIZ.LIZ() == this) {
            this.LIZ.LJIIIZ(c1bn4, stateParam);
        }
    }
}

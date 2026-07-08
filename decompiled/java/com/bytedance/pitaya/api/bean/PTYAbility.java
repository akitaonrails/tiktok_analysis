package com.bytedance.pitaya.api.bean;

import X.C1344205Nw;
import X.C1344305Nx;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes3.dex */
public final class PTYAbility implements ReflectionCall {
    public static final C1344205Nw Companion = new Object() { // from class: X.05Nw
    };
    public int status;

    public final boolean containsCep() {
        return contains(4);
    }

    public final boolean containsAll() {
        return contains(32767);
    }

    public final boolean containsFeature() {
        return contains(8);
    }

    public final boolean containsPackage() {
        return contains(32);
    }

    public final int getStatus() {
        return this.status;
    }

    public PTYAbility(int i) {
        this.status = i;
    }

    public final PTYAbility add(PTYAbility pTYAbility) {
        this.status = pTYAbility.status | this.status;
        return this;
    }

    public final boolean contains(int i) {
        if (i == (this.status & i)) {
            return true;
        }
        return false;
    }

    public final void remove(PTYAbility pTYAbility) {
        int i = this.status;
        if (i != 32767) {
            this.status = (~pTYAbility.status) & i;
        }
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public PTYAbility(C1344305Nx c1344305Nx) {
        this(c1344305Nx.LIZ);
    }

    public final boolean contains(PTYAbility pTYAbility) {
        return contains(pTYAbility.status);
    }
}

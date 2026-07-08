package com.ss.android.ugc.gamora.recorder.bottom;

import X.C1646670sx7;
import X.C560530Lyd;
import com.bytedance.als.h0;
import kotlin.Unit;

/* JADX INFO: loaded from: classes26.dex */
public final class BottomTabChangeServiceImpl implements IBottomTabChangeService {
    public final C560530Lyd<Object> LIZ;
    public final C560530Lyd<C1646670sx7> LIZIZ;
    public final C560530Lyd LIZJ;
    public final h0<Unit> LIZLLL;
    public final h0 LJ;
    public final h0<Unit> LJFF;
    public final h0 LJI;

    @Override // com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService
    public final void LIZ() {
        this.LIZLLL.LJII(Unit.LIZ);
    }

    @Override // com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService
    public final void LJFF() {
        this.LJFF.LJII(Unit.LIZ);
    }

    public BottomTabChangeServiceImpl() {
        C560530Lyd<Object> c560530Lyd = new C560530Lyd<>();
        this.LIZ = c560530Lyd;
        this.LIZIZ = new C560530Lyd<>();
        this.LIZJ = c560530Lyd;
        Unit unit = Unit.LIZ;
        h0<Unit> h0Var = new h0<>(unit);
        this.LIZLLL = h0Var;
        this.LJ = h0Var;
        h0<Unit> h0Var2 = new h0<>(unit);
        this.LJFF = h0Var2;
        this.LJI = h0Var2;
    }

    @Override // com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService
    public final h0 LIZIZ() {
        return this.LJI;
    }

    @Override // com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService
    public final C560530Lyd LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService
    public final h0 P7() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService
    public final C560530Lyd getBottomTabIndexChangeEvent() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService
    public final void LIZLLL(Object obj) {
        this.LIZ.LJIIJ(obj);
    }

    @Override // com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService
    public final void LJ(C1646670sx7 c1646670sx7) {
        this.LIZIZ.LJIIJ(new C1646670sx7(c1646670sx7.LIZ, c1646670sx7.LIZIZ, c1646670sx7.LIZJ));
    }
}

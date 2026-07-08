package com.bytedance.effectcreatormobile.infrastructure.ui.view;

import X.AnonymousClass0956;
import X.C05P0;
import X.C05P1;
import X.C05U4;
import X.C05ZL;
import X.C13FE;
import X.C13FI;
import X.C1668650tWZ;
import X.C1691250u71;
import X.C20028913Yh;
import X.C23250099c;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: loaded from: classes3.dex */
public final class AMEImageCutoutCircleViewModel extends ViewModel {
    public final C05P0<C1668650tWZ> LL;
    public final C05P1<C1668650tWZ> LLILLJJLI;
    public final C05P0<Boolean> LLILLL;
    public final C05P1<Boolean> LLILZ;
    public final C05P0<Boolean> LLILZIL;
    public final C05P1<Boolean> LLILZLL;
    public AnonymousClass0956 LLIZ;
    public final C05ZL LLIZLLLIL;
    public final C05P1<Float> LLJ;
    public final C05ZL LLJI;
    public final C05P1<Float> LLJIJIL;

    public AMEImageCutoutCircleViewModel() {
        C05P0<C1668650tWZ> c05p0LJI = C20028913Yh.LJI(new C1668650tWZ(55.0f));
        this.LL = c05p0LJI;
        this.LLILLJJLI = c05p0LJI;
        Boolean bool = Boolean.FALSE;
        C05P0<Boolean> c05p0LJI2 = C20028913Yh.LJI(bool);
        this.LLILLL = c05p0LJI2;
        this.LLILZ = c05p0LJI2;
        C05P0<Boolean> c05p0LJI3 = C20028913Yh.LJI(bool);
        this.LLILZIL = c05p0LJI3;
        this.LLILZLL = c05p0LJI3;
        C05ZL c05zlLIZ = C1691250u71.LIZ(0.0f);
        this.LLIZLLLIL = c05zlLIZ;
        this.LLJ = c05zlLIZ;
        C05ZL c05zlLIZ2 = C1691250u71.LIZ(0.0f);
        this.LLJI = c05zlLIZ2;
        this.LLJIJIL = c05zlLIZ2;
    }

    public final void vQ2(boolean z) {
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ((C13FE) this.LLILLL).setValue(Boolean.TRUE);
        ((C13FE) this.LLILZIL).setValue(Boolean.FALSE);
        if (z) {
            this.LLIZ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C05U4(this, null), 3);
        }
    }

    public final void wQ2(float f, float f2) {
        ((C13FI) this.LLIZLLLIL).LJIILJJIL(f);
        ((C13FI) this.LLJI).LJIILJJIL(f2);
        vQ2(true);
    }
}

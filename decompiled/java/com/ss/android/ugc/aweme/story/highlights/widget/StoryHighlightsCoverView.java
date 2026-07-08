package com.ss.android.ugc.aweme.story.highlights.widget;

import X.AbstractC20085213iM;
import X.C05P0;
import X.C13FE;
import X.C13ZC;
import X.C1674780tgS;
import X.C1674790tgT;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C20088113ip;
import X.InterfaceC1680500tpg;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.AwS181S0101000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class StoryHighlightsCoverView extends AbstractC20085213iM {
    public final C05P0<C1674790tgT> LLJ;

    public StoryHighlightsCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final C05P0<C1674790tgT> getUiState() {
        return this.LLJ;
    }

    @Override // X.AbstractC20085213iM
    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean zLJII;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-575421437);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(this);
            } else {
                zLJII = c13zcLJIIJ.LJII(this);
            }
            if (zLJII) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1674780tgS.LIZ((C1674790tgT) ((C13FE) this.LLJ).getValue(), null, c13zcLJIIJ, 0, 2);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 33);
        }
    }

    public StoryHighlightsCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setViewCompositionStrategy(C20088113ip.LIZIZ);
        this.LLJ = C20028913Yh.LJI(new C1674790tgT(null, null, null, 0, 0, 0.0f, false, 0, 0.0f, 1023));
    }
}

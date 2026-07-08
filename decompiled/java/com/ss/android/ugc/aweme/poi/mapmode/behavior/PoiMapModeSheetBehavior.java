package com.ss.android.ugc.aweme.poi.mapmode.behavior;

import X.AbstractC1177930gl5;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.poi.mapmode.behavior.PoiMapModeSheetBehavior;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeSheetBehavior extends BottomSheetBehavior<View> {
    public boolean LIZ;

    public PoiMapModeSheetBehavior() {
        addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0gl3
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                if (i == 5) {
                    PoiMapModeSheetBehavior poiMapModeSheetBehavior = this.LIZ;
                    if (!poiMapModeSheetBehavior.LIZ) {
                        poiMapModeSheetBehavior.setState(4);
                    } else {
                        poiMapModeSheetBehavior.LIZ = false;
                    }
                }
            }
        });
    }
}

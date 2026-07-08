package com.ss.android.ugc.aweme.search.lynx.xsearch.searchcutoff.core.ui;

import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchcutoff.core.ui.LynxSearchCutoff;
import com.ss.android.ugc.governance.eventbus.IEvent;
import j27.s;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxSearchCutoff extends UISimpleView<AndroidView> {
    public float LL;
    public float LLILLJJLI;

    public LynxSearchCutoff(s sVar) {
        super(sVar);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        return new AndroidView(context) { // from class: X.19lv
            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                this.LL = C445120Hcs.LIZJ(Float.valueOf(View.MeasureSpec.getSize(i2)));
            }

            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                LynxSearchCutoff lynxSearchCutoff = this;
                float f = lynxSearchCutoff.LL;
                if (f < lynxSearchCutoff.LLILLJJLI) {
                    C1440005kM.LIZ(new IEvent(f) { // from class: X.02zD
                        public final float LIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C767702zD) && Float.compare(this.LIZ, ((C767702zD) obj).LIZ) == 0;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("HideCutoffButtonEvent(viewHeight=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        public final int hashCode() {
                            return Float.floatToIntBits(this.LIZ);
                        }

                        {
                            this.LIZ = f;
                        }
                    });
                }
            }
        };
    }

    @InterfaceC1312540kGC(name = "maxHeight")
    public final void setMaxHeight(float f) {
        this.LLILLJJLI = f;
    }
}

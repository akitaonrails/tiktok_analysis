package dmt.av.video;

import X.AbstractC1465910oFZ;
import X.C0APM;
import X.C1437210nVH;
import X.C1437220nVI;
import X.C1446280nju;
import X.C1446290njv;
import X.C201955140j;
import X.InterfaceC1439290nYd;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes23.dex */
public final class CompileProbeViewModel extends ViewModel {
    public AbstractC1465910oFZ LL;

    public final InterfaceC1439290nYd vQ2() {
        AbstractC1465910oFZ c1446290njv;
        AbstractC1465910oFZ abstractC1465910oFZ = this.LL;
        if (abstractC1465910oFZ != null) {
            return abstractC1465910oFZ;
        }
        C201955140j.LJ("CompileProbeViewModel -> init");
        if (C0APM.LIZ() != null) {
            C201955140j.LJ("CompileProbeViewModel -> CompileProbeV2");
            c1446290njv = new C1446280nju(C1437210nVH.LL);
        } else {
            C201955140j.LJ("CompileProbeViewModel -> CompileProbe");
            c1446290njv = new C1446290njv(C1437220nVI.LL);
        }
        this.LL = c1446290njv;
        return c1446290njv;
    }
}

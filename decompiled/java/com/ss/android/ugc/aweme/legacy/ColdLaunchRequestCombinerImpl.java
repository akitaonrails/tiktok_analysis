package com.ss.android.ugc.aweme.legacy;

import X.C04TD;
import X.C312980COq;
import X.InterfaceC312970COp;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner;

/* JADX INFO: loaded from: classes5.dex */
public class ColdLaunchRequestCombinerImpl implements IColdLaunchRequestCombiner {
    public final C312980COq LIZ = C312980COq.LIZ;

    public static IColdLaunchRequestCombiner LIZJ() {
        Object objLIZ = C04TD.LIZ(IColdLaunchRequestCombiner.class, false);
        if (objLIZ != null) {
            return (IColdLaunchRequestCombiner) objLIZ;
        }
        if (C04TD.F1 == null) {
            synchronized (IColdLaunchRequestCombiner.class) {
                if (C04TD.F1 == null) {
                    C04TD.F1 = new ColdLaunchRequestCombinerImpl();
                }
            }
        }
        return C04TD.F1;
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final BaseCombineMode getResponse() {
        return this.LIZ.getResponse();
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final void LIZIZ(InterfaceC312970COp interfaceC312970COp) {
        this.LIZ.LIZIZ(interfaceC312970COp);
    }
}

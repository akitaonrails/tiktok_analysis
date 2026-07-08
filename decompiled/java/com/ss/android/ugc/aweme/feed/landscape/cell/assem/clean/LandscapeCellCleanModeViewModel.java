package com.ss.android.ugc.aweme.feed.landscape.cell.assem.clean;

import X.C009H;
import X.C009I;
import X.InterfaceC0148002o;
import android.os.Looper;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class LandscapeCellCleanModeViewModel extends AssemViewModel<C009I> {
    public final C009H LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        final C009H c009h = this.LL;
        return new InterfaceC0148002o(c009h) { // from class: X.009I
            public final C009H LL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C009I) && this.LL == ((C009I) obj).LL;
            }

            public final int hashCode() {
                return this.LL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LandscapeCellCleanModeState(cleanMode=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LL = c009h;
            }
        };
    }

    public LandscapeCellCleanModeViewModel() {
        new TreeSet();
        new BPEAHandler(Looper.getMainLooper());
        this.LL = C009H.FULL_CLEAN;
    }
}

package com.ss.android.ugc.aweme.discover.ui;

import X.C0N1U;
import X.C20684815ws;
import X.C2344009Gk;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;

/* JADX INFO: loaded from: classes30.dex */
public abstract class BaseDiscoverTabFragment extends JediBaseFragment {
    public long LLILLJJLI = -1;

    public abstract String MR();

    public abstract int NR();

    public void OR(boolean z, boolean z2) {
        if (!z) {
            if (this.LLILLJJLI <= 0) {
                this.LLILLJJLI = SystemClock.elapsedRealtime();
            }
        } else {
            if (this.LLILLJJLI <= 0) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLJJLI;
            C0N1U c0n1u = C0N1U.LIZ;
            String strMR = MR();
            c0n1u.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", strMR);
            c2344009Gk.LIZLLL(jElapsedRealtime, "duration");
            C20684815ws.LJIILLIIL("stay_time", c2344009Gk.LIZ);
            this.LLILLJJLI = -1L;
        }
    }
}

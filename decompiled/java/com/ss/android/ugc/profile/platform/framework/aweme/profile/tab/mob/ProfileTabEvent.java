package com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.mob;

import X.C20684815ws;
import X.C2344009Gk;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileTabEvent implements IProfileTabEventAbility {
    public int LL;
    public long LLILLJJLI;

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.mob.IProfileTabEventAbility
    public final void PS0() {
        this.LL++;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.mob.IProfileTabEventAbility
    public final void S31() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LIZLLL(this.LLILLJJLI, "duration");
        c2344009Gk.LIZJ(this.LL, "load_times");
        C20684815ws.LJIILLIIL("tab_load_time", c2344009Gk.LIZ);
        this.LL = 0;
        this.LLILLJJLI = 0L;
    }

    @Override // com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.mob.IProfileTabEventAbility
    public final void uF0() {
        this.LLILLJJLI += System.currentTimeMillis() - 0;
    }
}

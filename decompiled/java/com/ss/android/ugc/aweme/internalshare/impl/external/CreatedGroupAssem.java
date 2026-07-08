package com.ss.android.ugc.aweme.internalshare.impl.external;

import X.C0Y8T;
import X.C1226350i1B;
import X.C1559260qg8;
import X.C427660Gpo;
import X.C438710HIf;
import X.C723590SZx;
import X.C786410Ut5;
import X.C879390Yef;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class CreatedGroupAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1226350i1B.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ctx;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        UrlModel urlModelLIZIZ;
        super.onViewCreated(view);
        C427660Gpo c427660Gpo = (C427660Gpo) view.findViewById(R.id.bh2);
        if (c427660Gpo != null) {
            C0Y8T c0y8t = ((C1226350i1B) this.LLJJI.getValue()).LLILLJJLI;
            if (c0y8t != null) {
                urlModelLIZIZ = C879390Yef.LIZIZ(c0y8t);
            } else {
                urlModelLIZIZ = null;
            }
            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(urlModelLIZIZ), false, null, null, false, false, null, null, false, null, 1022);
        }
        C786410Ut5.I7(new AbS700S0100000_19(this, 0), view);
        View viewFindViewById = view.findViewById(R.id.bh2);
        if (viewFindViewById != null) {
            viewFindViewById.setForeground(null);
        }
    }
}

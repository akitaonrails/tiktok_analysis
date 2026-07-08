package com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.span;

import X.C03J8;
import X.C1388190mED;
import X.C19EG;
import X.C1AF0;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbsFullSpanCell<ITEM extends InterfaceC1891350zJl> extends ECPowerCell<ITEM> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public void onCreate() {
        super.onCreate();
        C03J8.LIZ(this.itemView, true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onStop() {
        super.onStop();
        this.itemView.setTag(R.id.ei0, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(ITEM item) {
        Context context;
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        Context context2 = this.itemView.getContext();
        if ((context2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) != null && c19egLIZIZ2.isFinishing()) || ((context = this.itemView.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && c19egLIZIZ.isDestroyed())) {
            IllegalStateException illegalStateException = new IllegalStateException("activity is null");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getClass().getSimpleName());
            sbLIZ.append(" onBind, activity is finishing or destroyed!");
            C1AF0.LJFF(illegalStateException, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C03J8.LIZ(this.itemView, false);
    }
}

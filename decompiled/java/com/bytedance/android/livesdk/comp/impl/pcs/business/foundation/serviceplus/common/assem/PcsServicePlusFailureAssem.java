package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.common.assem;

import X.C197039127h;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class PcsServicePlusFailureAssem extends UISlotAssem {
    public View LLJJI;
    public View LLJJIII;
    public C197039127h LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fz5;
    }

    public void hp() {
        throw null;
    }

    public void ip(View view) {
        this.LLJJI = view.findViewById(R.id.hbx);
        this.LLJJIII = view.findViewById(R.id.pxk);
        this.LLJJIJI = (C197039127h) view.findViewById(R.id.pxm);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        ip(view);
        hp();
    }
}

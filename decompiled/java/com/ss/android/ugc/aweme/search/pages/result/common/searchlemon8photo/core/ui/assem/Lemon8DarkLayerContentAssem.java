package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem;

import X.C07E5;
import X.C723830SaL;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class Lemon8DarkLayerContentAssem extends ReusedUISlotAssem<Lemon8DarkLayerContentAssem> {
    public final int LLJJLIIIJLLLLLLLZ = R.id.mlw;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.euh;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 192));
    }
}

package com.ss.android.ugc.aweme.poi.content.poicampaign;

import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class MyMomentsAddLocationUnavailalbleAssem extends UISlotAssem {
    public TuxTextView LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dxq;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.hm_);
        this.LLJJI = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText(2131823065);
        }
        TuxTextView tuxTextView2 = this.LLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(51);
        }
    }
}

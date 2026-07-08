package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C786410Ut5;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS87S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomentsAddLocationNoGooglePlayAssem extends UISlotAssem {
    public TuxTextView LLJJI;
    public ConstraintLayout LLJJIII;
    public TuxTextView LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dxs;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.hlk);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.hm_);
        this.LLJJIII = (ConstraintLayout) view.findViewById(R.id.hlj);
        TuxTextView tuxTextView = this.LLJJI;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(51);
        }
        TuxTextView tuxTextView2 = this.LLJJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(2131823049);
        }
        TuxTextView tuxTextView3 = this.LLJJIJI;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(33);
        }
        TuxTextView tuxTextView4 = this.LLJJIJI;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(2131823047);
        }
        ConstraintLayout constraintLayout = this.LLJJIII;
        if (constraintLayout != null) {
            C786410Ut5.I7(new AkS87S0100000_18(this, 13), constraintLayout);
        }
    }
}

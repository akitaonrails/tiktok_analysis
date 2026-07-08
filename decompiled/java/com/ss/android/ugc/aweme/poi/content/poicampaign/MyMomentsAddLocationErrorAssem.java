package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS76S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class MyMomentsAddLocationErrorAssem extends UISlotAssem {
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public ConstraintLayout LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dxo;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        super.onViewCreated(view);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.hlk);
        this.LLJJI = (TuxTextView) view.findViewById(R.id.hm_);
        this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.hlj);
        TuxTextView tuxTextView = this.LLJJI;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(51);
        }
        TuxTextView tuxTextView2 = this.LLJJI;
        String string2 = null;
        if (tuxTextView2 != null) {
            Context context = getContext();
            if (context != null) {
                string = context.getString(2131823044);
            } else {
                string = null;
            }
            tuxTextView2.setText(string);
        }
        TuxTextView tuxTextView3 = this.LLJJIII;
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(33);
        }
        TuxTextView tuxTextView4 = this.LLJJIII;
        if (tuxTextView4 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                string2 = context2.getString(2131823043);
            }
            tuxTextView4.setText(string2);
        }
        ConstraintLayout constraintLayout = this.LLJJIJI;
        if (constraintLayout != null) {
            C786410Ut5.I7(new AkS76S0100000_4(this, 0), constraintLayout);
        }
    }
}

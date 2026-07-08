package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common;

import X.C01GW;
import X.C1509305vX;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ChatDetailNameAssem extends UISlotAssem {
    public final C01GW LLJJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 572));
    public final C01GW LLJJIII = C1509305vX.LIZ(new AwS546S0100000_2(this, 573));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.cns;
    }

    public abstract void kp();

    public abstract void lp();

    public final TuxTextView hp() {
        return (TuxTextView) this.LLJJI.getValue();
    }

    public final TuxTextView ip() {
        return (TuxTextView) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        kp();
        lp();
    }
}

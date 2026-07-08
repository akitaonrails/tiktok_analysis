package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common;

import X.C01GW;
import X.C1509305vX;
import X.C427870Gq9;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ChatDetailAvatarAssem extends UISlotAssem {
    public final C01GW LLJJI = C1509305vX.LIZ(new AwS546S0100000_2(this, 567));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.cno;
    }

    public abstract String hp();

    public abstract void lp();

    public abstract void mp();

    public View ip() {
        return kp();
    }

    public C427870Gq9 kp() {
        return (C427870Gq9) getContentView().findViewById(R.id.fpy);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        lp();
        mp();
    }
}

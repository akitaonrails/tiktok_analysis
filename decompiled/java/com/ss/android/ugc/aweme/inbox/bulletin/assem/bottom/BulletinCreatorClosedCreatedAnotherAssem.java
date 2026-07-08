package com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom;

import X.C1618770sE7;
import X.C337180DJs;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCreatorClosedCreatedAnotherAssem extends BulletinBottomBaseAssem {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a63;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((TextView) LJJIJL().findViewById(R.id.czn)).setText(C1618770sE7.LIZJ(2131828075));
        C337180DJs.LIZJ(LJJIJL().findViewById(R.id.chl));
        C337180DJs.LIZJ(LJJIJL().findViewById(R.id.czn));
    }
}

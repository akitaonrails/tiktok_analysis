package com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight;

import X.C2211631BhB;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicFanSpotlightEmptyAssem extends ReusedUISlotAssem<MusicFanSpotlightEmptyAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eg1;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 63), getContentView());
        C2211631BhB.LJ(view, AFwS240S0000000_9.get$arr$(448));
    }
}

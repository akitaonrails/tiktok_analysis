package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.soundcontrol.ui;

import X.C07E5;
import X.C657280PqI;
import X.C723580SZw;
import X.C723830SaL;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaSoundControlAssem extends ReusedUISlotAssem<SearchMediaSoundControlAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu_;
    }

    public SearchMediaSoundControlAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C657280PqI.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
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
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 392));
    }
}

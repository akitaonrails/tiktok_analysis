package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.tag.ui;

import X.C1169904ht;
import X.C1559260qg8;
import X.C21565319aV;
import X.C426750GoL;
import X.C657280PqI;
import X.C723590SZx;
import X.InterfaceC657240PqE;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaIndexTagAssem extends BaseSearchMediaOptionalAssem {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C657280PqI.class, null), checkSupervisorPrepared());
    public TuxTextView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eub;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        op(view);
        Context context = getContext();
        if (context != null && C426750GoL.LIZLLL(context)) {
            C21565319aV.LIZIZ(this.LLJL, null, null, null, Float.valueOf(((C657280PqI) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLJJLI), null, 23);
        } else {
            C21565319aV.LIZIZ(this.LLJL, null, null, null, null, Float.valueOf(((C657280PqI) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLJJLI), 15);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final void op(View view) {
        this.LLJL = (TuxTextView) view.findViewById(R.id.u93);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC657240PqE interfaceC657240PqE) {
        up(interfaceC657240PqE);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    /* JADX INFO: renamed from: tp */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        super.up(interfaceC657240PqE);
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            boolean z = interfaceC657240PqE.getTag() instanceof C1169904ht;
            tuxTextView.setText("");
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.BaseSearchMediaOptionalAssem
    public final boolean up(InterfaceC657240PqE interfaceC657240PqE) {
        return interfaceC657240PqE.getTag() instanceof C1169904ht;
    }
}

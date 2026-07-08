package com.ss.android.ugc.aweme.music.assem.list.cell.fanspotlight;

import X.C005N;
import X.C1559260qg8;
import X.C723580SZw;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightV2Assem extends ReusedUISlotAssem<HighlightV2Assem> implements InterfaceC712990Rxx<C005N> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.efs;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 62), view);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C005N c005n) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C005N c005n) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C005N c005n) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}

package com.ss.android.ugc.aweme.music.assem.report;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C13LE;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import com.ss.android.ugc.aweme.music.assem.MusicPlayAssemBase;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class ReportMusicPlayAssem extends MusicPlayAssemBase {
    public final C736950SvV LLILZ;

    @Override // com.ss.android.ugc.aweme.music.assem.MusicPlayAssemBase
    /* JADX INFO: renamed from: do */
    public final MusicPlayViewModel mo272do() {
        return (MusicPlayViewModel) this.LLILZ.getValue();
    }

    public ReportMusicPlayAssem() {
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(238);
        this.LLILZ = new C736950SvV(C13LE.LIZ(MusicPlayViewModel.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(469), new AwS553S0100000_9((AbstractC738140SxQ) this, 1136), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        mo272do().yQ2(true);
    }
}

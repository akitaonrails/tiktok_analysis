package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.tag.ui;

import X.C1169904ht;
import X.C13LE;
import X.C1559260qg8;
import X.C652290PiF;
import X.C652840Pj8;
import X.C656260Poe;
import X.C657280PqI;
import X.C723590SZx;
import X.C723830SaL;
import X.InterfaceC1587906Jp;
import X.InterfaceC655790Pnt;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.ui.SearchMediaAssem;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaTagAssem extends ReusedUIContentAssem<SearchMediaTagAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    public final C1559260qg8 LLJJJJ = new C1559260qg8(new C723590SZx(this, C657280PqI.class, null), checkSupervisorPrepared());
    public final int LLJJJJJIL;

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public SearchMediaTagAssem() {
        SearchMediaAssem.LLLFFI.getClass();
        this.LLJJJJJIL = SearchMediaAssem.LLLII;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 125));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        InterfaceC655790Pnt tag = interfaceC657240PqE.getTag();
        if (tag instanceof C656260Poe) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchMediaIconTagAssem.class), true, null);
            return;
        }
        if (tag instanceof C652290PiF) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchMediaLiveTagAssem.class), true, null);
        } else if (tag instanceof C652840Pj8) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchMediaTextTagAssem.class), true, null);
        } else {
            if (!(tag instanceof C1169904ht)) {
                return;
            }
            C723830SaL.LJ(this, C13LE.LIZ(SearchMediaIndexTagAssem.class), true, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC657240PqE interfaceC657240PqE) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC657240PqE interfaceC657240PqE) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

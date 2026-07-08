package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.desc.ui;

import X.C13LE;
import X.C657250PqF;
import X.C723830SaL;
import X.InterfaceC1587906Jp;
import X.InterfaceC657240PqE;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaDescAssem extends ReusedUIContentAssem<SearchMediaDescAssem> implements InterfaceC712990Rxx<InterfaceC657240PqE> {
    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS589S0100000_10(this, 124));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC657240PqE interfaceC657240PqE) {
        C657250PqF itemVisibility = interfaceC657240PqE.LJJIIZI().getItemVisibility();
        if (itemVisibility.LIZJ || itemVisibility.LIZIZ || itemVisibility.LJ) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchMediaTextDescAssem.class), true, null);
        }
        if (itemVisibility.LIZ) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchMediaUserDescAssem.class), true, null);
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

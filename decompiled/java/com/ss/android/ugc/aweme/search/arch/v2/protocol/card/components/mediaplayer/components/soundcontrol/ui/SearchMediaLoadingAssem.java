package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.soundcontrol.ui;

import X.C0HHT;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C657280PqI;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.viewmodel.SearchMediaPlayStateVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaLoadingAssem extends ReusedUIContentAssem<SearchMediaLoadingAssem> implements InterfaceC712990Rxx<InterfaceC1891350zJl> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchMediaLoadingAssem.class, "playStateVM", "getPlayStateVM()Lcom/ss/android/ugc/aweme/search/arch/v2/protocol/card/components/mediaplayer/viewmodel/SearchMediaPlayStateVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchMediaLoadingAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchMediaPlayStateVM.class);
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 247), null, AFwS241S0000000_10.get$arr$(153));
        checkSupervisorPrepared();
        new C723580SZw(this, C657280PqI.class, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        TuxSpinner tuxSpinner;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof TuxSpinner) && (tuxSpinner = (TuxSpinner) viewLJJIJL) != null) {
                tuxSpinner.LIZ(R.raw.icon_spinner_normal, iIntValue);
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, LLJJJJJIL[0]), new C2217381BqS() { // from class: X.0Psr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C658860Psq) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(40), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1891350zJl interfaceC1891350zJl) {
        C337180DJs.LIZ(LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1891350zJl interfaceC1891350zJl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

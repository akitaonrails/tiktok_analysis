package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice;

import X.AbstractC883730Ylf;
import X.C13IQ;
import X.C13LE;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1868650yj9;
import X.C1868660yjA;
import X.C1868690yjD;
import X.C1868720yjG;
import X.C1874110yrx;
import X.C1874120yry;
import X.C1874130yrz;
import X.C1874140ys0;
import X.C1874150ys1;
import X.C1880890z2t;
import X.C1880910z2v;
import X.C1884020z7w;
import X.C1889340zGW;
import X.C19212010Ec;
import X.C19328310jZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C824390WVp;
import X.C881500Yi4;
import X.EnumC1599580rjA;
import X.EnumC1783110wVB;
import X.EnumC1874080yru;
import X.InterfaceC1868680yjC;
import X.InterfaceC1891350zJl;
import Y.AObserverS230S0100000_28;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TopNoticeInboxWidgetV2 extends InboxWidget {
    public final SessionListTopNoticeViewModel LLIZLLLIL;
    public final AFwS217S0000000_28 LLJ;

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return C1697810uHb.LJIIJJI(C13LE.LIZ(C1874130yrz.class), C13LE.LIZ(C1874140ys0.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        EnumC1874080yru enumC1874080yru = (EnumC1874080yru) this.LLIZLLLIL.LLJJIJI.getValue();
        Object c1874150ys1 = null;
        InterfaceC1868680yjC config = enumC1874080yru != null ? enumC1874080yru.getConfig() : null;
        if (config instanceof C1868660yjA) {
            c1874150ys1 = new C1874130yrz(enumC1874080yru);
        } else if (config instanceof C1868650yj9) {
            c1874150ys1 = new C1874140ys0(enumC1874080yru);
        } else if (config instanceof C1868720yjG) {
            c1874150ys1 = new C1874150ys1(enumC1874080yru);
        }
        return C1697810uHb.LJIIL(c1874150ys1);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        this.LLIZLLLIL.LLJJIJI.observe(this, new AObserverS230S0100000_28(this, 27));
        this.LLIZLLLIL.LLJILJILJ.observe(this, new AObserverS230S0100000_28(this, 28));
        this.LLIZLLLIL.LLJILLL.observe(this, new AObserverS230S0100000_28(this, 29));
        vo(EnumC1599580rjA.WIDGET_INTERNAL);
    }

    public TopNoticeInboxWidgetV2() {
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel = new SessionListTopNoticeViewModel(new AwS642S0100000_28(this, 14), new AwS572S0100000_28(this, 228), new AwS603S0100000_24(this, 107), new AwS568S0100000_24(this, 589));
        sessionListTopNoticeViewModel.LLJJJJ = new AwS603S0100000_24(this, 108);
        sessionListTopNoticeViewModel.LLJJJIL = new AwS638S0100000_24(this, 41);
        sessionListTopNoticeViewModel.LLJJJJLIIL = new AwS603S0100000_24(this, 109);
        this.LLIZLLLIL = sessionListTopNoticeViewModel;
        this.LLJ = AFwS217S0000000_28.get$arr$(193);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        int iLJIILL;
        if (C19212010Ec.LIZJ.LJIIJ()) {
            int i = C2187451AjH.LIZ;
            Co(C1889340zGW.LIZ);
            return;
        }
        int iIntValue = ((Number) this.LLJ.invoke()).intValue();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        int i2 = 0;
        if (abstractC883730YlfLJ != null) {
            iLJIILL = AbstractC883730Ylf.LJIILL(abstractC883730YlfLJ);
        } else {
            iLJIILL = 0;
        }
        if (C824390WVp.LIZJ(getContext())) {
            if (!C19328310jZ.LIZIZ.LIZJ()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        SessionListTopNoticeViewModel.vQ2(this.LLIZLLLIL, iIntValue, i2, iLJIILL);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1874130yrz.class))) {
            int i = C1880890z2t.LLILZIL;
            return new C1880890z2t(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cri, viewGroup, false));
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1874140ys0.class))) {
            int i2 = C1880910z2v.LLILZ;
            return new C1880910z2v(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.crj, viewGroup, false));
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1874150ys1.class))) {
            int i3 = C1884020z7w.LLILZ;
            return new C1884020z7w(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.crk, viewGroup, false));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown ViewHolder: ");
        sbLIZ.append(c13iq.LJI());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void so(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        C1874120yry c1874120yry;
        EnumC1783110wVB enumC1783110wVB;
        if ((interfaceC1891350zJl instanceof C1874120yry) && (c1874120yry = (C1874120yry) interfaceC1891350zJl) != null) {
            EnumC1874080yru enumC1874080yru = c1874120yry.LL;
            if (enumC1874080yru.getConfig() instanceof C1868690yjD) {
                return;
            }
            if ((enumC1874080yru.getConfig() instanceof C1868660yjA) && (viewHolder instanceof C1880890z2t)) {
                ((C1880890z2t) viewHolder).I5((C1868660yjA) enumC1874080yru.getConfig(), this.LLIZLLLIL);
                return;
            }
            if ((enumC1874080yru.getConfig() instanceof C1868650yj9) && (viewHolder instanceof C1880910z2v)) {
                int i2 = C1874110yrx.LIZ[enumC1874080yru.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            enumC1783110wVB = EnumC1783110wVB.CREATOR_OTHERS_ONLY;
                        } else {
                            "unknown permission type".toString();
                            throw new IllegalStateException("unknown permission type");
                        }
                    } else {
                        enumC1783110wVB = EnumC1783110wVB.CREATOR_REVAMP;
                    }
                } else {
                    enumC1783110wVB = EnumC1783110wVB.FRIENDS_REVAMP;
                }
                ((C1880910z2v) viewHolder).I5((C1868650yj9) enumC1874080yru.getConfig(), this.LLIZLLLIL, enumC1783110wVB);
                return;
            }
            if ((enumC1874080yru.getConfig() instanceof C1868720yjG) && (viewHolder instanceof C1884020z7w)) {
                ((C1884020z7w) viewHolder).I5(this.LLIZLLLIL, (C1868720yjG) enumC1874080yru.getConfig());
            } else {
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LIZ("TopNoticeInboxWidgetV2", "unknown item config type or invalid view holder");
            }
        }
    }
}

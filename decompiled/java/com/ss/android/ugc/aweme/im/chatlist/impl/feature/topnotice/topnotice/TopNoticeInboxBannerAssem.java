package com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.topnotice;

import X.AbstractC883730Ylf;
import X.C13IQ;
import X.C13LE;
import X.C1720106oR;
import X.C1868650yj9;
import X.C1868660yjA;
import X.C1868690yjD;
import X.C1868720yjG;
import X.C1874100yrw;
import X.C1874120yry;
import X.C1874130yrz;
import X.C1874140ys0;
import X.C1874150ys1;
import X.C1880890z2t;
import X.C1880910z2v;
import X.C1884020z7w;
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
import X.EnumC637310OzB;
import X.InterfaceC1891350zJl;
import Y.AObserverS230S0100000_28;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TopNoticeInboxBannerAssem extends InboxBannerCustomAssem {
    public final SessionListTopNoticeViewModel LLILZ;
    public final AFwS217S0000000_28 LLILZIL;

    public TopNoticeInboxBannerAssem() {
        SessionListTopNoticeViewModel sessionListTopNoticeViewModel = new SessionListTopNoticeViewModel(new AwS642S0100000_28(this, 13), new AwS572S0100000_28(this, 227), new AwS603S0100000_24(this, 101), new AwS568S0100000_24(this, 587));
        sessionListTopNoticeViewModel.LLJJJJ = new AwS603S0100000_24(this, 102);
        sessionListTopNoticeViewModel.LLJJJIL = AFwS310S0000000_24.get$arr$(21);
        sessionListTopNoticeViewModel.LLJJJJJIL = new AwS603S0100000_24(this, 103);
        sessionListTopNoticeViewModel.LLJJLIIIJLLLLLLLZ = new AwS603S0100000_24(this, 104);
        sessionListTopNoticeViewModel.LLJJJJLIIL = new AwS603S0100000_24(this, 105);
        new AwS603S0100000_24(this, 106);
        sessionListTopNoticeViewModel.LLJJL = new AwS568S0100000_24(this, 588);
        this.LLILZ = sessionListTopNoticeViewModel;
        this.LLILZIL = AFwS217S0000000_28.get$arr$(192);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLILZ.LLJJIJI.observe(this, new AObserverS230S0100000_28(this, 24));
        this.LLILZ.LLJILJILJ.observe(this, new AObserverS230S0100000_28(this, 25));
        this.LLILZ.LLJILLL.observe(this, new AObserverS230S0100000_28(this, 26));
        bo(EnumC1599580rjA.WIDGET_INTERNAL);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerAssem
    public final void bo(EnumC1599580rjA enumC1599580rjA) {
        int iLJIILL;
        if (C19212010Ec.LIZJ.LJIIJ()) {
            int i = C2187451AjH.LIZ;
            this.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
            return;
        }
        int iIntValue = ((Number) this.LLILZIL.invoke()).intValue();
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
        SessionListTopNoticeViewModel.vQ2(this.LLILZ, iIntValue, i2, iLJIILL);
    }

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final RecyclerView.ViewHolder ko(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
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

    @Override // com.ss.android.ugc.aweme.inbox.banner.InboxBannerCustomAssem
    public final void ho(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        C1874120yry c1874120yry;
        EnumC1783110wVB enumC1783110wVB;
        if ((interfaceC1891350zJl instanceof C1874120yry) && (c1874120yry = (C1874120yry) interfaceC1891350zJl) != null) {
            EnumC1874080yru enumC1874080yru = c1874120yry.LL;
            if (enumC1874080yru.getConfig() instanceof C1868690yjD) {
                return;
            }
            if ((enumC1874080yru.getConfig() instanceof C1868660yjA) && (viewHolder instanceof C1880890z2t)) {
                ((C1880890z2t) viewHolder).I5((C1868660yjA) enumC1874080yru.getConfig(), this.LLILZ);
                return;
            }
            if ((enumC1874080yru.getConfig() instanceof C1868650yj9) && (viewHolder instanceof C1880910z2v)) {
                int i2 = C1874100yrw.LIZ[enumC1874080yru.ordinal()];
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
                ((C1880910z2v) viewHolder).I5((C1868650yj9) enumC1874080yru.getConfig(), this.LLILZ, enumC1783110wVB);
                return;
            }
            if ((enumC1874080yru.getConfig() instanceof C1868720yjG) && (viewHolder instanceof C1884020z7w)) {
                ((C1884020z7w) viewHolder).I5(this.LLILZ, (C1868720yjG) enumC1874080yru.getConfig());
            } else {
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LIZ("TopNoticeInboxWidgetV2", "unknown item config type or invalid view holder");
            }
        }
    }
}

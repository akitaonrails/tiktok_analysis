package com.ss.android.ugc.aweme.series.feed.tab.skylight;

import X.C019F;
import X.C01GW;
import X.C1287400jbe;
import X.C13LE;
import X.C1559260qg8;
import X.C1568080quM;
import X.C1579900rDQ;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSkylightAssem;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesSkyLightAssem extends BaseSkylightAssem {
    public static final C1579900rDQ LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C1559260qg8 LLJILLL;
    public ViewGroup LLJJ;
    public C1287400jbe LLJJI;
    public final C630740Ooa LLJJIII;
    public final C630740Ooa LLJJIJI;
    public final AwS638S0100000_24 LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesSkyLightAssem.class, "skylightVM", "getSkylightVM()Lcom/ss/android/ugc/aweme/series/feed/tab/skylight/SeriesSkyLightVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new C1579900rDQ();
    }

    public SeriesSkyLightAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesSkyLightVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 995), AFwS264S0000000_24.get$arr$(312), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 994));
        this.LLJILLL = new C1559260qg8(new C723590SZx(this, C1568080quM.class, null), checkSupervisorPrepared());
        this.LLJJIII = C628500Oky.LIZ(new AwS568S0100000_24(this, 997));
        this.LLJJIJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 996));
        this.LLJJIJIIJIL = new AwS638S0100000_24(this, 77);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSkylightAssem
    public final SeriesSkyLightVM Go() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (SeriesSkyLightVM) assemVMLazy.getValue();
    }
}

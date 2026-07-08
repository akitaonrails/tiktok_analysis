package com.ss.android.ugc.aweme.poi.map.assem;

import X.C019F;
import X.C01GW;
import X.C1179690gnv;
import X.C1209110hZN;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1DFK;
import X.C2217381BqS;
import X.C23118094a;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS19S0210000_18;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Looper;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS109S0210000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiStaticMapAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C1179690gnv LLJI;
    public final C1209110hZN LLJIJIL;
    public Integer LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public final C1DFK LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiStaticMapAssem.class, "mapViewModel", "getMapViewModel()Lcom/ss/android/ugc/aweme/poi/map/PoiMapViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiStaticMapAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1367), AFwS256S0000000_18.get$arr$(448), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1359));
        this.LLJI = new C1179690gnv();
        this.LLJIJIL = new C1209110hZN(this, 1);
        this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJILLL = C23118094a.LIZ();
    }

    public final PoiMapViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (PoiMapViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJILLL.LIZIZ(null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numValueOf;
        boolean zLIZIZ;
        Resources resources;
        Configuration configuration;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            numValueOf = Integer.valueOf(configuration.orientation);
        } else {
            numValueOf = null;
        }
        this.LLJILJIL = numValueOf;
        Context context2 = getContext();
        if (context2 != null) {
            zLIZIZ = C960203pA.LIZIZ(context2);
        } else {
            zLIZIZ = false;
        }
        this.LLJILJILJ.removeCallbacksAndMessages(null);
        C786410Ut5.LJJZZIII(this.LLJILJILJ, new ARunnableS19S0210000_18(view, this, zLIZIZ, 0));
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0gnu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1179620gno) obj).LLILZLL;
            }
        }, null, new AwS109S0210000_18(view, this, zLIZIZ, 0), 6);
    }
}

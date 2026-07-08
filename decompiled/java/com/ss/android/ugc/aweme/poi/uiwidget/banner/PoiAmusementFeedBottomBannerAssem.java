package com.ss.android.ugc.aweme.poi.uiwidget.banner;

import X.C01D1;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C960203pA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAmusementFeedBottomBannerAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public SmartImageView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiAmusementFeedBottomBannerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/uiwidget/banner/PoiAmusementFeedBottomBannerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiAmusementFeedBottomBannerAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiAmusementFeedBottomBannerViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2071), AFwS256S0000000_18.get$arr$(699), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dyk;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            C960203pA.LIZIZ(context);
        }
        this.LLJJIII = (SmartImageView) getContentView().findViewById(R.id.az3);
        this.LLJJIJI = (TuxTextView) getContentView().findViewById(R.id.az4);
        this.LLJJIJIIJIL = (TuxTextView) getContentView().findViewById(R.id.az2);
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, new ContextThemeWrapper(tuxTextView.getContext(), R.style.y0))) != null) {
            tuxTextView.setTextColor(numLIZJ2.intValue());
        }
        TuxTextView tuxTextView2 = this.LLJJIJIIJIL;
        if (tuxTextView2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, new ContextThemeWrapper(tuxTextView2.getContext(), R.style.y0))) != null) {
            tuxTextView2.setTextColor(numLIZJ.intValue());
        }
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gLb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155460gAq) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 224), 4);
    }
}

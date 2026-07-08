package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.AutoPostSwitchCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightAutoPostSwitchCell extends PowerCell<AutoPostSwitchCell> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final AwS623S0100000_9 LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightAutoPostSwitchCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/highlights/viewmodel/HighlightsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HighlightAutoPostSwitchCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightsListViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 877);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(401);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 858), awS553S0100000_9, AFwS195S0000000_9.get$arr$(206), new AwS553S0100000_9((C03K6) this, 860), new AwS553S0100000_9((C03K6) this, 862), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 864), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 866), null, new AwS553S0100000_9((C03K6) this, 867));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((C03K6) this, 861);
            AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 863);
            AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ, 865);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_92, 39));
            AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c01gwLIZIZ, 868);
            AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c01gwLIZIZ, 870);
            AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c01gwLIZIZ, 872);
            AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c01gwLIZIZ, 874);
            AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c01gwLIZIZ, 875);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS553S0100000_94, awS553S0100000_9, new C452080Ho6(), awS553S0100000_95, awS553S0100000_96, awS553S0100000_93, aFwS240S0000000_9, awS553S0100000_97, awS553S0100000_98, awS553S0100000_99);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 876), awS553S0100000_9, AFwS195S0000000_9.get$arr$(207), new AwS553S0100000_9((C03K6) this, 878), new AwS553S0100000_9((C03K6) this, 879), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 880), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 881), null, new AwS553S0100000_9((C03K6) this, 882));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 883), awS553S0100000_9, AFwS195S0000000_9.get$arr$(208), new AwS553S0100000_9((C03K6) this, 884), new AwS553S0100000_9((C03K6) this, 885), new AwS553S0100000_9((C03K6) this, 886), aFwS240S0000000_9, null, null, new AwS553S0100000_9((C03K6) this, 887));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 869));
        this.LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 859));
        this.LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 873));
        this.LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 871));
        this.LLILZLL = new AwS623S0100000_9(this, 85);
    }

    public final C21411818qq I5() {
        return (C21411818qq) this.LLILLJJLI.getValue();
    }

    public final HighlightsListViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (HighlightsListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.AutoPostSwitchCell r4 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.AutoPostSwitchCell) r4
            X.01GW r0 = r3.LLILZ
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r4.getTitle()
            r1.setText(r0)
            X.01GW r0 = r3.LLILZIL
            java.lang.Object r1 = r0.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r4.getDesc()
            r1.setText(r0)
            X.01GW r0 = r3.LLILLL
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            X.0P4C r1 = new X.0P4C
            r0 = 2
            r1.<init>(r3, r0)
            X.C786410Ut5.I7(r1, r2)
            X.18qq r2 = r3.I5()
            java.lang.Integer r0 = r4.getAutoPostSwitch()
            if (r0 == 0) goto L54
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L54
        L42:
            r2.setChecked(r1)
            X.18qq r2 = r3.I5()
            kotlin.jvm.internal.AwS553S0100000_9 r1 = new kotlin.jvm.internal.AwS553S0100000_9
            r0 = 1822(0x71e, float:2.553E-42)
            r1.<init>(r3, r0)
            r2.setInterceptToggleListener(r1)
            return
        L54:
            r1 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.HighlightAutoPostSwitchCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.bto, false, 4, null);
    }
}

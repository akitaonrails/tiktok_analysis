package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.assem;

import X.C019F;
import X.C01GW;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C960203pA;
import X.DialogC1390150mHN;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.HighlightAutoPostSwitchCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.HighlightCardCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.HighlightEmptyCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.LiveRecordingEntranceCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.NewUserGuideCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightsAssem extends UIListContentAssem<HighlightsListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C1749280vcc LLJ;
    public C1749280vcc LLJI;
    public DialogC1390150mHN LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 856));
    public final AssemVMLazy LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightsAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/highlights/viewmodel/HighlightsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HighlightsAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightsListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 857), AFwS240S0000000_9.get$arr$(400), null, true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 1;
        c20603715jn.LIZJ = true;
        c20603715jn.LJIIJ = true;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1749280vcc Lo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.bcp) : null;
            this.LLJI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1749280vcc No() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jmb) : null;
            this.LLJ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final HighlightsListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (HighlightsListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        Integer numLIZJ;
        super.onViewCreated(view);
        Context context2 = view.getContext();
        if (context2 != null && C960203pA.LIZIZ(context2) && (context = view.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        Go().LJIILJJIL(HighlightCardCell.class, NewUserGuideCell.class, HighlightAutoPostSwitchCell.class, LiveRecordingEntranceCell.class, HighlightEmptyCell.class);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0OGk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612590O0z) obj).LL;
            }
        }, null, null, new AwS553S0100000_9(this, 1784), new AwS588S0100000_9(this, 605), 6, null);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0O12
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612590O0z) obj).LLILZIL;
            }
        }, null, new AwS588S0100000_9(this, 606), new AwS553S0100000_9(this, 1785), new AwS588S0100000_9(this, 607), 2, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0O13
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612590O0z) obj).LLILLL;
            }
        }, null, new AwS635S0100000_21(this, 164), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0O11
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612590O0z) obj).LLILZ;
            }
        }, null, new AwS623S0100000_9(this, 206), 6);
    }
}

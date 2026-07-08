package com.ss.android.ugc.aweme.live.toplives.watchlater;

import X.C019F;
import X.C01GW;
import X.C0HTI;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class WatchLaterHistoryContentAssem extends UIListContentAssem<WatchLaterHistoryViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 600));
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WatchLaterHistoryContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/toplives/watchlater/WatchLaterHistoryViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public WatchLaterHistoryContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WatchLaterHistoryViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 670), AFwS269S0000000_27.get$arr$(131), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 602));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLJI.getValue();
    }

    public final void No() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C1749280vcc c1749280vccLo = Lo();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n4;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJI = context.getString(2131856905);
        c1722300uv6.LJIIIIZZ = context.getString(2131856903);
        c1722300uv6.LJIIIZ = new AwS393S0200000_27(context, this, 40);
        c1749280vccLo.setStatus(c1722300uv6);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0y2d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325960CqA c325960CqA = (C325960CqA) obj;
                c325960CqA.getClass();
                return C627260Oiy.LIZLLL(c325960CqA);
            }
        }, this, null, new AwS606S0100000_27(this, 162), new AwS571S0100000_27(this, 601), new AwS606S0100000_27(this, 163), 4, null);
    }
}

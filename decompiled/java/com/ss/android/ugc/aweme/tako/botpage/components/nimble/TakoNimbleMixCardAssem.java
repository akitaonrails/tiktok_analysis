package com.ss.android.ugc.aweme.tako.botpage.components.nimble;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0R2N;
import X.C13IQ;
import X.C13LE;
import X.C14NE;
import X.C14NH;
import X.C14NX;
import X.C1558520qew;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.nimblecard.NimbleCardUIVM;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol.ITakoNimbleAbility;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoNimbleMixCardAssem extends ReusedUIContentAssem<TakoNimbleMixCardAssem> implements InterfaceC712990Rxx<C0R2N>, INimbleContainerAbility, INimbleModelAbility, ITakoNimbleAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final String LLJJJJ;
    public C0R2N LLJJJJJIL;
    public NimbleTemplateContext LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoNimbleMixCardAssem.class, "takoNimbleVM", "getTakoNimbleVM()Lcom/ss/android/ugc/aweme/tako/nimblecard/flexnimble/vm/TakoNimbleVM;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final C14NX Bs1(C19719912Dl c19719912Dl) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final void Sg1(List list, AwS376S0200000_10 awS376S0200000_10) {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Boolean Yw1(Map<String, ? extends Object> map) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, Object> Zo0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final NimbleCardUIVM mH0() {
        return null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, String> G7() {
        String str;
        Map<String, String> mapLJ;
        Message messageYy1;
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (str = messageYy1.uuid) == null) {
            str = "";
        }
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("message_id", str));
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return C2097608Jq.LJIIL(mapLIZJ, mapLJ);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleModelAbility
    public final Map<String, Object> KD2() {
        Message messageYy1;
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null) {
            return null;
        }
        return messageYy1.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol.ITakoNimbleAbility
    public final TakoNimbleVM fq0() {
        AssemVMLazy assemVMLazy = this.LLJJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (TakoNimbleVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final /* bridge */ /* synthetic */ Object uv2() {
        return this.LLJJJJJIL;
    }

    public TakoNimbleMixCardAssem(String str) {
        this.LLJJJJ = str;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoNimbleVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 850);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(372);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS554S0100000_10((AbstractC738140SxQ) this, 851), aFwS241S0000000_10, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJL = assemVMLazy;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 852));
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility
    public final void jE1(String str) {
        C0R2N c0r2n;
        NimbleTemplateContext nimbleTemplateContext;
        C14NX c14nx;
        C14NX c14nxLIZ;
        if ((str == null || str.length() == 0) && (c0r2n = this.LLJJJJJIL) != null && (nimbleTemplateContext = this.LLJJJJLIIL) != null) {
            nimbleTemplateContext.LIZIZ(c0r2n.getRawData(), null, true);
        }
        NimbleTemplateContext nimbleTemplateContext2 = this.LLJJJJLIIL;
        if (nimbleTemplateContext2 != null && (c14nx = nimbleTemplateContext2.LLJIJIL) != null && (c14nxLIZ = C14NE.LIZ(c14nx, new AwS61S1000000_10(str, 6))) != null) {
            c14nxLIZ.LJIILJJIL(c14nxLIZ.LIZJ(), c14nxLIZ.LJIIIIZZ());
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        Context context = getContext();
        if (context != null) {
            C14NH c14nh = C14NH.LIZ;
            String str = this.LLJJJJ;
            c14nh.getClass();
            NimbleTemplateContext nimbleTemplateContextLJIIL = C14NH.LJIIL(C14NH.LJIIIIZZ(str), context, C2097608Jq.LJIIIIZZ(new Pair("biz", "tako"), new Pair(FollowStatusChangeMethod.PARAM_UID, this.LLJJJJ)), this, false);
            if (nimbleTemplateContextLJIIL != null) {
                nimbleTemplateContextLJIIL.LIZ(C1558520qew.LJIIL(this));
                nimbleTemplateContextLJIIL.LLIZ = this;
                C14NX c14nx = nimbleTemplateContextLJIIL.LLJIJIL;
                if (c14nx != null && (view2 = c14nx.getView()) != null) {
                    ((ViewGroup) LJJIJL()).addView(view2);
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -1;
                        C786410Ut5.W5(view2, layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            } else {
                nimbleTemplateContextLJIIL = null;
            }
            this.LLJJJJLIIL = nimbleTemplateContextLJIIL;
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0R2N c0r2n) {
        C0R2N c0r2n2 = c0r2n;
        this.LLJJJJJIL = c0r2n2;
        NimbleTemplateContext nimbleTemplateContext = this.LLJJJJLIIL;
        if (nimbleTemplateContext != null) {
            nimbleTemplateContext.LIZIZ(c0r2n2.getRawData(), null, true);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0R2N c0r2n) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0R2N c0r2n) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

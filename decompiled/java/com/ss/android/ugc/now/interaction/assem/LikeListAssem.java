package com.ss.android.ugc.now.interaction.assem;

import X.C019F;
import X.C01GW;
import X.C1352470lIb;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1352360lIQ;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class LikeListAssem extends UIListContentAssem<LikeListVM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1352470lIb.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1115));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1117));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1114));
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LikeListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/now/interaction/assem/LikeListVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LikeListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LikeListVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 1116), AFwS259S0000000_21.get$arr$(296), null, true);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1118));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1352470lIb Lo() {
        return (C1352470lIb) this.LLIZLLLIL.getValue();
    }

    public final C1749280vcc No() {
        return (C1749280vcc) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final LikeListVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (LikeListVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        NowFeedMobHierarchyData nowFeedMobHierarchyData;
        Aweme aweme;
        super.onViewCreated(view);
        Go().LJIILJJIL(LikeCell.class);
        Go().setLayoutManager(new LinearLayoutManager(getContext()));
        C1352470lIb c1352470lIbLo = Lo();
        if (c1352470lIbLo != null && (aweme = c1352470lIbLo.LL) != null) {
            ip().LL = aweme.getAid();
            ip().LLILLJJLI = aweme;
        }
        LikeListVM likeListVMIp = ip();
        C1352470lIb c1352470lIbLo2 = Lo();
        if (c1352470lIbLo2 != null) {
            nowFeedMobHierarchyData = c1352470lIbLo2.LLILLJJLI;
        } else {
            nowFeedMobHierarchyData = null;
        }
        likeListVMIp.LLILLL = nowFeedMobHierarchyData;
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0hpU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1218150hnx c1218150hnx = (C1218150hnx) obj;
                c1218150hnx.getClass();
                return C627260Oiy.LIZLLL(c1218150hnx);
            }
        }, null, new AwS600S0100000_21(this, 320), new AwS565S0100000_21(this, 1404), new AwS600S0100000_21(this, 321), 2, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0hny
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218150hnx) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 162), 4);
        Object obj = (InterfaceC1352360lIQ) this.LLJILJILJ.getValue();
        if (obj != null) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) obj, new C2217381BqS() { // from class: X.0lJF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((InteractionSyncViewModelState) obj2).getLikeState();
                }
            }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 163), 4);
        }
    }
}

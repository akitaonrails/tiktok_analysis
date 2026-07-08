package com.ss.android.ugc.aweme.business.followinguser;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1572230r13;
import X.C1588620rRU;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1595030rbp;
import X.InterfaceC1595070rbt;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.FollowingSkylightOperationAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingSkylightOperationAssem extends AbstractC738140SxQ implements FollowingSkylightOperationAbility {
    public InterfaceC1595070rbt LLILZIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS568S0100000_24(this, 111));
    public final C736950SvV LLILLL = new C736950SvV(C13LE.LIZ(FeedSkylightListViewModel.class), new AwS568S0100000_24(this, 113), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(37), new AwS568S0100000_24((AbstractC738140SxQ) this, 112), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 110));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(77));

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FollowingSkylightOperationAbility.class, null, null);
        }
        ((List) this.LLILZLL.getValue()).add(AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLILLL.getValue(), new C2217381BqS() { // from class: X.0r0w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573030r2L c1573030r2L = (C1573030r2L) obj;
                c1573030r2L.getClass();
                return C627260Oiy.LIZLLL(c1573030r2L);
            }
        }, this, null, new AwS603S0100000_24(this, 584), null, new AwS603S0100000_24(this, 585), 20, null));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZIL = null;
        C1572230r13.LIZ((List) this.LLILZLL.getValue());
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FollowingSkylightOperationAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.FollowingSkylightOperationAbility
    public final void S10(int i) {
        ((FeedSkylightListViewModel) this.LLILLL.getValue()).sA1(i, null, true, false);
    }

    @Override // com.ss.android.ugc.aweme.ability.FollowingSkylightOperationAbility
    public final void Xw2(C1588620rRU c1588620rRU) {
        this.LLILZIL = c1588620rRU;
    }

    @Override // com.ss.android.ugc.aweme.ability.FollowingSkylightOperationAbility
    public final void jg1(String str) {
        InterfaceC1595030rbp interfaceC1595030rbp = (InterfaceC1595030rbp) this.LLILZ.getValue();
        if (interfaceC1595030rbp != null) {
            S10(interfaceC1595030rbp.LJIIJJI(str));
        }
    }

    @Override // com.ss.android.ugc.aweme.ability.FollowingSkylightOperationAbility
    public final void Wg2(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, User user, int i, int i2) {
        InterfaceC1595070rbt interfaceC1595070rbt = this.LLILZIL;
        if (interfaceC1595070rbt != null) {
            interfaceC1595070rbt.LIZJ(user, i, i2);
        }
    }
}

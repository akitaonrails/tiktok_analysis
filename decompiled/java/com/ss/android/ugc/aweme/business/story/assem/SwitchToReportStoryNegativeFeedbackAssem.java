package com.ss.android.ugc.aweme.business.story.assem;

import X.AbstractC1569120qw2;
import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1568970qvn;
import X.C1569180qw8;
import X.C1620910sHZ;
import X.C2188811AlT;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C723580SZw;
import X.InterfaceC1569000qvq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS50S0100000_24;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SwitchToReportStoryNegativeFeedbackAssem extends AbstractC738140SxQ {
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS568S0100000_24(this, 224));
    public final C630740Ooa LLILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 223));
    public final C630740Ooa LLILZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 225));
    public final C1620910sHZ LLILZIL = new C1620910sHZ(this, 10);
    public final C1620910sHZ LLILZLL = new C1620910sHZ(this, 9);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(88));
    public boolean LLIZLLLIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final int bo() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m167do() {
        AbstractC1569120qw2 abstractC1569120qw2LIZIZ = C1569180qw8.LIZIZ(bo());
        if (abstractC1569120qw2LIZIZ != null && ((InterfaceC1569000qvq) this.LLIZ.getValue()).LIZJ(abstractC1569120qw2LIZIZ)) {
            ((InterfaceC1569000qvq) this.LLIZ.getValue()).LJI(abstractC1569120qw2LIZIZ, C1568970qvn.LIZIZ);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLILLL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.ao(this.LLILZIL);
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLILLL.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.UC1(this.LLILZLL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLILLL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.tx0(this.LLILZIL);
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLILLL.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.Ik0(this.LLILZLL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        ISkylightListAbility iSkylightListAbility;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvWl;
        super.onResume();
        if (this.LLIZLLLIL || (iSkylightListAbility = (ISkylightListAbility) this.LLILZ.getValue()) == null || (viewOnAttachStateChangeListenerC20604515jvWl = iSkylightListAbility.Wl()) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("listenListScrollState, scene: ");
        ISkylightListAbility iSkylightListAbility2 = (ISkylightListAbility) this.LLILZ.getValue();
        sbLIZ.append(iSkylightListAbility2 != null ? Integer.valueOf(iSkylightListAbility2.uH2()) : null);
        sbLIZ.append(", current scene: ");
        sbLIZ.append(bo());
        C2188811AlT.LIZIZ(sbLIZ);
        viewOnAttachStateChangeListenerC20604515jvWl.addOnScrollListener(new AsS50S0100000_24(this, 12));
        this.LLIZLLLIL = true;
    }
}

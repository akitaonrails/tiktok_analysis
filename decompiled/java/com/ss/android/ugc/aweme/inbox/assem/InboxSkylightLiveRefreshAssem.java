package com.ss.android.ugc.aweme.inbox.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0DMM;
import X.C1558520qew;
import X.C452501pT;
import X.C481790Iuv;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC1599580rjA;
import X.InterfaceC1585190rLx;
import X.InterfaceC1602300rnY;
import X.InterfaceC481880Iv4;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxFragmentAbility;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxSkylightLiveRefreshAssem extends AbstractC738140SxQ implements InterfaceC1585190rLx, InterfaceC481880Iv4 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(203));
    public final String LLILLJJLI = "inbox_skylight";
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(204));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 648));
    public final C630740Ooa LLILZIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 649));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(202));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void bo() {
        Hox hox = (Hox) this.LLILZIL.getValue();
        if (hox == null || !hox.KQ2((String) this.LLILLL.getValue())) {
            return;
        }
        ((InterfaceC1602300rnY) this.LLILZLL.getValue()).LIZLLL(this, (String) this.LL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        HomeTabAbility homeTabAbilityLIZIZ = C0DMM.LIZIZ(C1558520qew.LJIIL(this));
        if (homeTabAbilityLIZIZ != null) {
            homeTabAbilityLIZIZ.ao(this);
        }
        HomeTabAbility homeTabAbilityLIZIZ2 = C0DMM.LIZIZ(C1558520qew.LJIIL(this));
        if (homeTabAbilityLIZIZ2 != null) {
            homeTabAbilityLIZIZ2.UC1(this);
        }
        bo();
        ((InterfaceC1602300rnY) this.LLILZLL.getValue()).LJIIJJI((String) this.LL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        HomeTabAbility homeTabAbilityLIZIZ = C0DMM.LIZIZ(C1558520qew.LJIIL(this));
        if (homeTabAbilityLIZIZ != null) {
            homeTabAbilityLIZIZ.tx0(this);
        }
        HomeTabAbility homeTabAbilityLIZIZ2 = C0DMM.LIZIZ(C1558520qew.LJIIL(this));
        if (homeTabAbilityLIZIZ2 != null) {
            homeTabAbilityLIZIZ2.Ik0(this);
        }
        ((InterfaceC1602300rnY) this.LLILZLL.getValue()).LJIILJJIL(this, (String) this.LL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Hox hox = (Hox) this.LLILZIL.getValue();
        if (hox == null || !hox.KQ2((String) this.LLILLL.getValue())) {
            return;
        }
        ((InterfaceC1602300rnY) this.LLILZLL.getValue()).LJIILJJIL(this, (String) this.LL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        bo();
    }

    @Override // X.InterfaceC481880Iv4
    public final C481790Iuv q(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
        Boolean boolValueOf;
        Hox hox = (Hox) this.LLILZIL.getValue();
        if (hox != null && hox.KQ2((String) this.LLILLL.getValue())) {
            InboxAbilityCenter$IInboxFragmentAbility inboxAbilityCenter$IInboxFragmentAbility = (InboxAbilityCenter$IInboxFragmentAbility) this.LLILZ.getValue();
            if (inboxAbilityCenter$IInboxFragmentAbility != null) {
                boolValueOf = Boolean.valueOf(inboxAbilityCenter$IInboxFragmentAbility.Bv(EnumC1599580rjA.INBOX_NEW_HIGH_VALUE_LIVE));
            } else {
                boolValueOf = null;
            }
            return new C481790Iuv(Intrinsics.LJFF(boolValueOf, Boolean.TRUE), false, this.LLILLJJLI);
        }
        return new C481790Iuv(false, false, this.LLILLJJLI);
    }

    @Override // X.InterfaceC1585190rLx
    public final void p1(String str, String str2) {
        Hox hox = (Hox) this.LLILZIL.getValue();
        if (hox != null && hox.KQ2((String) this.LLILLL.getValue())) {
            bo();
        } else {
            ((InterfaceC1602300rnY) this.LLILZLL.getValue()).LJIILJJIL(this, (String) this.LL.getValue());
        }
    }
}

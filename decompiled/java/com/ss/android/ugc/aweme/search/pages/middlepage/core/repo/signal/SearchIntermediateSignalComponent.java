package com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal;

import X.C01GW;
import X.C0RUJ;
import X.C14EU;
import X.C1566140qrE;
import X.C1ER1;
import X.C299750Boz;
import X.C452501pT;
import X.C606790Nr3;
import X.C606800Nr4;
import X.C630740Ooa;
import X.C724240Sb0;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC581770Mrn;
import X.InterfaceC739770T0d;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS553S0100000_9;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchIntermediateSignalComponent extends BasePanelComponent implements C0RUJ {
    public final C01GW LL;
    public boolean LLILLJJLI;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "search_intermediate_signal_component";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    public SearchIntermediateSignalComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 1457), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C606790Nr3(false, this));
        }
        this.LL = c01gwLIZIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLILLJJLI = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLILLJJLI = true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        super.onPagePause(i);
        this.LLILLJJLI = false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        this.LLILLJJLI = true;
    }

    @C14EU
    public final void onSearchSuggestSignalEvent(C606800Nr4 c606800Nr4) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        InterfaceC739770T0d interfaceC739770T0dP2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility2;
        Aweme awemeLJIIIIZZ;
        long jCurrentTimeMillis;
        int duration;
        if (this.LLILLJJLI && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue()) != null && (interfaceC739770T0dP2 = iFeedPanelPlatformAbility.P2()) != null && (iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LL.getValue()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility2.LJIIIIZZ()) != null) {
            String aid = awemeLJIIIIZZ.getAid();
            if (TextUtils.isEmpty(aid)) {
                return;
            }
            long jLJLJJI = interfaceC739770T0dP2.LJLJJI(aid);
            long jLIZLLL = 0;
            if (jLJLJJI <= 0) {
                return;
            }
            C1ER1 c1er1 = C1ER1.LIZIZ;
            InterfaceC581770Mrn interfaceC581770MrnLJLJL = c1er1.LJLJL();
            if (c1er1.LJJJLL(interfaceC739770T0dP2.getEventType())) {
                jLIZLLL = interfaceC581770MrnLJLJL.LIZLLL() + (System.currentTimeMillis() - interfaceC581770MrnLJLJL.LIZIZ());
                jCurrentTimeMillis = interfaceC581770MrnLJLJL.LJFF();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis() - jLJLJJI;
            }
            if (awemeLJIIIIZZ.getVideo() != null) {
                duration = awemeLJIIIIZZ.getVideo().getDuration();
            } else {
                duration = 0;
            }
            c1er1.LLILLL(C724240Sb0.LIZ(this), interfaceC739770T0dP2.getEventType(), awemeLJIIIIZZ.getGroupId(), jLJLJJI, jLIZLLL, jCurrentTimeMillis, Integer.valueOf(duration));
        }
    }
}

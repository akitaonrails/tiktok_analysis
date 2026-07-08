package com.ss.android.ugc.feed.platform.panel.earphone;

import X.C01GW;
import X.C0RD6;
import X.C0RUJ;
import X.C0SXW;
import X.C0SXX;
import X.C0SXY;
import X.C0SXZ;
import X.C452501pT;
import X.C722840SXa;
import X.C724240Sb0;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217831BrB;
import X.InterfaceC494301wD;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class EarphonePlayerControlComponent extends BasePanelComponent implements IEarphonePlayerControlComponent, C0RUJ, InterfaceC1554640qYg {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C01GW LL = C452501pT.LIZIZ(new C0SXX(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C722840SXa());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C0SXZ(this));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0SXW(this));

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "panel_earphone_player_control";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1143713310) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.earphone.IEarphonePlayerControlComponent
    public final void z12() {
        ((IEarphonePlayerControlService) this.LLILLJJLI.getValue()).LIZJ("common_feed", true);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (((IEarphonePlayerControlService) this.LLILLJJLI.getValue()).LJ()) {
            InterfaceC2217831BrB interfaceC2217831BrB = new InterfaceC2217831BrB() { // from class: X.0SVF
                @Override // X.InterfaceC2217831BrB
                public final String getScenario() {
                    return "common_feed";
                }

                @Override // X.InterfaceC2217831BrB
                public final void LIZ() {
                    C0N0Y playerManager;
                    C0N0Y playerManager2;
                    Hox hox;
                    IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LIZ.LL.getValue();
                    if (iPlayerComponentAbility == null || (playerManager = iPlayerComponentAbility.getPlayerManager()) == null || !playerManager.isPaused() || !Intrinsics.LJFF(C724240Sb0.LIZ(this.LIZ), C2214201BlK.LJFF())) {
                        return;
                    }
                    String str = (String) this.LIZ.LLILZ.getValue();
                    if (Intrinsics.LJFF((str == null || (hox = (Hox) this.LIZ.LLILLL.getValue()) == null) ? null : Boolean.valueOf(hox.LQ2(str)), Boolean.FALSE)) {
                        return;
                    }
                    C722880SXe.LIZLLL("common_feed");
                    IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LIZ.LL.getValue();
                    if (iPlayerComponentAbility2 != null) {
                        iPlayerComponentAbility2.tryResumePlay();
                    }
                    IPlayerComponentAbility iPlayerComponentAbility3 = (IPlayerComponentAbility) this.LIZ.LL.getValue();
                    C722880SXe.LIZJ((iPlayerComponentAbility3 == null || (playerManager2 = iPlayerComponentAbility3.getPlayerManager()) == null) ? null : Boolean.valueOf(playerManager2.isPlaying()), "common_feed");
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), IFeedPanelPlatformAbility.class, null);
                    Aweme awemeLJIIIIZZ = iFeedPanelPlatformAbility != null ? iFeedPanelPlatformAbility.LJIIIIZZ() : null;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", C1389300mG0.LIZ(this.LIZ.getPanelContext()));
                    c2344009Gk.LJIIIIZZ("group_id", awemeLJIIIIZZ != null ? awemeLJIIIIZZ.getAid() : null);
                    c2344009Gk.LJIIIIZZ("author_id", awemeLJIIIIZZ != null ? AwemeExtKt.getAuthorUid(awemeLJIIIIZZ) : null);
                    C20684815ws.LJIILLIIL("earphone_play_continue", c2344009Gk.LIZ);
                }
            };
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                ((IEarphonePlayerControlService) this.LLILLJJLI.getValue()).LJI(fragmentLJI, interfaceC2217831BrB);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        if (((IEarphonePlayerControlService) this.LLILLJJLI.getValue()).LJ()) {
            c0rd6.LIZIZ("event_on_playing", new C0SXY(this));
        }
    }
}

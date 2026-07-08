package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C01GW;
import X.C0RD6;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC2217831BrB;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedEarphonePlayerControlComponent extends BasePanelComponent {
    public final C01GW LL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 412));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 411));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 410));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(110));

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        Context context;
        super.onDestroy();
        if (!((IEarphonePlayerControlService) this.LLILZ.getValue()).LJ() || (context = getContext()) == null) {
            return;
        }
        C786410Ut5.LJJIFFI(context, (BroadcastReceiver) this.LLILLL.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() throws Exception {
        super.onParentViewCreated();
        if (((IEarphonePlayerControlService) this.LLILZ.getValue()).LJ()) {
            Context context = getContext();
            if (context != null) {
                C786410Ut5.LJIL(context, (BroadcastReceiver) this.LLILLL.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), null, null);
            }
            InterfaceC2217831BrB interfaceC2217831BrB = new InterfaceC2217831BrB() { // from class: X.0SVG
                @Override // X.InterfaceC2217831BrB
                public final String getScenario() {
                    return "landscape_feed";
                }

                @Override // X.InterfaceC2217831BrB
                public final void LIZ() {
                    Aweme awemeLLLLLJLJLL;
                    LandscapeFeedPlayerAbility landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) this.LIZ.LLILLJJLI.getValue();
                    if (landscapeFeedPlayerAbility == null || !landscapeFeedPlayerAbility.isPaused()) {
                        return;
                    }
                    C722880SXe.LIZLLL("landscape_feed");
                    LandscapeFeedPlayerAbility landscapeFeedPlayerAbility2 = (LandscapeFeedPlayerAbility) this.LIZ.LLILLJJLI.getValue();
                    if (landscapeFeedPlayerAbility2 != null) {
                        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) this.LIZ.LL.getValue();
                        if (landscapeFeedViewPagerAbility == null || (awemeLLLLLJLJLL = landscapeFeedViewPagerAbility.LLLLLJLJLL()) == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        landscapeFeedPlayerAbility2.ui(awemeLLLLLJLJLL);
                    }
                    LandscapeFeedPlayerAbility landscapeFeedPlayerAbility3 = (LandscapeFeedPlayerAbility) this.LIZ.LLILLJJLI.getValue();
                    C722880SXe.LIZJ(landscapeFeedPlayerAbility3 != null ? Boolean.valueOf(landscapeFeedPlayerAbility3.isPlaying()) : null, "landscape_feed");
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
                ((IEarphonePlayerControlService) this.LLILZ.getValue()).LJI(fragmentLJI, interfaceC2217831BrB);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        if (((IEarphonePlayerControlService) this.LLILZ.getValue()).LJ()) {
            c0rd6.LIZIZ("event_on_playing", new AwS590S0100000_11(this, 146));
        }
    }
}

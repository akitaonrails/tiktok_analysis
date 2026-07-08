package com.ss.android.ugc.feed.platform.panel.player;

import X.C01GW;
import X.C052Z;
import X.C0N0Y;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1559650qgl;
import X.C1566140qrE;
import X.C1578630rBN;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C691710RBh;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC581420MrE;
import X.InterfaceC739770T0d;
import Y.ARunnableS29S1100000_24;
import Y.ARunnableS93S0200000_24;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PlayerEventPanelComponent extends BasePanelComponent implements InterfaceC581420MrE {
    public final C01GW LL;

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public PlayerEventPanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1564), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559650qgl(false, this));
        }
        this.LL = c01gwLIZIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC739770T0d interfaceC739770T0dP2;
        super.onParentSet();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility == null || (interfaceC739770T0dP2 = iFeedPanelPlatformAbility.P2()) == null) {
            return;
        }
        interfaceC739770T0dP2.LJLJL(this);
    }

    @Override // X.InterfaceC581420MrE
    public final void Dj(String str) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        C691710RBh.LIZ(this, "event_on_pre_pause", str);
    }

    @Override // X.InterfaceC581420MrE
    public final void LJJIJIIJI(String str) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        if (C052Z.LIZ()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS29S1100000_24(this, str, 2));
        } else {
            C691710RBh.LIZ(this, "event_on_render_first_frame", str);
        }
    }

    @Override // X.InterfaceC581420MrE
    public final void onPlayCompleted(String str) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        C691710RBh.LIZ(this, "event_on_play_completed", str);
    }

    @Override // X.InterfaceC581420MrE
    public final void onPlayPause(String str) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        C691710RBh.LIZ(this, "event_on_play_pause", str);
    }

    @Override // X.InterfaceC581420MrE
    public final void onPlaying(String str) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        C691710RBh.LIZ(this, "event_on_playing", str);
    }

    @Override // X.InterfaceC581420MrE
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        if (C052Z.LIZIZ()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS93S0200000_24(this, c1480430ocz, 36));
        } else {
            C691710RBh.LIZ(this, "event_on_render_ready", c1480430ocz);
        }
    }

    @Override // X.InterfaceC581420MrE
    public final void onResumePlay(String str) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        C691710RBh.LIZ(this, "event_on_request_resume_play", str);
    }

    @Override // X.InterfaceC581420MrE
    public final void g5(float f, String str) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        C691710RBh.LIZ(this, "event_on_play_progress_change", new Pair(str, Float.valueOf(f)));
    }

    @Override // X.InterfaceC581420MrE
    public final void n7(C0N0Y c0n0y, String str) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("aid", str);
        linkedHashMap.put("player_manager", c0n0y);
        C691710RBh.LIZ(this, "event_on_pre_play", linkedHashMap);
    }

    @Override // X.InterfaceC581420MrE
    public final void onBuffering(String str, boolean z) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        C691710RBh.LIZ(this, "event_on_buffering", new Pair(str, Boolean.valueOf(z)));
    }

    @Override // X.InterfaceC581420MrE
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        if (C1578630rBN.LJIIIZ(this)) {
            return;
        }
        if (str == null) {
            str = "";
        }
        C691710RBh.LIZ(this, "event_on_play_failed", new Pair(str, c1481290oeN));
    }
}

package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C0BKF;
import X.C0RD6;
import X.C0RDX;
import X.C1389300mG0;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1558520qew;
import X.C1618440sDa;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724270Sb3;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CollectionCleanModeProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressMonitorAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.SubCellAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.aweme.story.ability.StoryGestureEducationAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class PinchMonitorComponent extends BaseCellLogicComponent<PinchMonitorComponent> implements IPinchMonitorAbility {
    public final C630740Ooa LLJJIJI = C628500Oky.LIZ(new AwS555S0100000_11(this, 350));
    public final C630740Ooa LLJJIJIIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 347));
    public final C630740Ooa LLJJIJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 348));
    public final C630740Ooa LLJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 351));
    public final C630740Ooa LLJJJIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 352));
    public final C630740Ooa LLJJJJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 349));
    public boolean LLJJJJJIL;

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    public final boolean Bo() {
        return C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(this)) || C1389300mG0.LJIILJJIL(C724240Sb0.LJI(this));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility
    public final void LJJJIL() {
        BasePostViewCell basePostViewCellBV0;
        if (Bo()) {
            this.LLJJJJJIL = true;
            IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJIJI.getValue();
            if (iPlayerComponentAbility == null || iPlayerComponentAbility.uz1() != 2) {
                return;
            }
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), CollectionCleanModeProtocol.class, false);
            if (listLIZIZ != null) {
                Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                while (it2.hasNext()) {
                    ((CollectionCleanModeProtocol) it2.next()).n82(C1558520qew.LJIIL(this));
                }
            }
            SubCellAbility subCellAbility = (SubCellAbility) this.LLJJJIL.getValue();
            if (subCellAbility != null && (basePostViewCellBV0 = subCellAbility.BV0()) != null) {
                basePostViewCellBV0.LLJLIL(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime())));
            }
            IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LLJJIJI.getValue();
            if (iPlayerComponentAbility2 != null) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                iPlayerComponentAbility2.Y2(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme(), false, true);
            }
            FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLJJIJIL.getValue();
            if (fakePlayerAbility != null) {
                fakePlayerAbility.lv();
            }
            StoryGestureEducationAbility storyGestureEducationAbility = (StoryGestureEducationAbility) this.LLJJJ.getValue();
            if (storyGestureEducationAbility != null) {
                storyGestureEducationAbility.pause();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility
    public final void LJZL() {
        LongPressMonitorAbility longPressMonitorAbility;
        if (Bo()) {
            if (this.LLJJJJJIL || !C0BKF.LIZIZ) {
                this.LLJJJJJIL = false;
                IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJIJI.getValue();
                if (iPlayerComponentAbility == null || iPlayerComponentAbility.uz1() != 3) {
                    return;
                }
                List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), CollectionCleanModeProtocol.class, false);
                if (listLIZIZ != null) {
                    Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                    while (it2.hasNext()) {
                        ((CollectionCleanModeProtocol) it2.next()).iO0(C1558520qew.LJIIL(this));
                    }
                }
                LongPressMonitorAbility longPressMonitorAbility2 = (LongPressMonitorAbility) this.LLJJJJ.getValue();
                if (longPressMonitorAbility2 != null && longPressMonitorAbility2.nA1() && (longPressMonitorAbility = (LongPressMonitorAbility) this.LLJJJJ.getValue()) != null) {
                    longPressMonitorAbility.uI1();
                }
                IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) this.LLJJIJI.getValue();
                if (iPlayerComponentAbility2 != null) {
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    iPlayerComponentAbility2.Y2(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme(), false, true);
                }
                FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLJJIJIL.getValue();
                if (fakePlayerAbility != null) {
                    fakePlayerAbility.D7();
                }
                StoryGestureEducationAbility storyGestureEducationAbility = (StoryGestureEducationAbility) this.LLJJJ.getValue();
                if (storyGestureEducationAbility != null) {
                    storyGestureEducationAbility.resume();
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onDestroy();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLJJIJIIJIL.getValue();
        if (commonCellAbility == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) {
            return;
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IPinchMonitorAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        super.onParentSet();
        CommonCellAbility commonCellAbility = (CommonCellAbility) this.LLJJIJIIJIL.getValue();
        if (commonCellAbility == null || (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IPinchMonitorAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IPinchMonitorAbility
    public final boolean Eo0() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        C0RDX.LIZJ(this, "event_on_play_progress_change", new AwS590S0100000_11(this, 129));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}

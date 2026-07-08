package com.ss.android.ugc.aweme.feed.assem.tikbot;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0B16;
import X.C13IQ;
import X.C13LE;
import X.C1ER1;
import X.C2189821An6;
import X.C300940Bqu;
import X.C339190DRl;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC691660RBc;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoTriggerRoof extends BaseCellTriggerComponent<TakoTriggerRoof> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 258));

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(TakoAssemRoof.class);
    }

    public static boolean yp(C2189821An6 c2189821An6) {
        String eventType;
        String eventType2;
        String eventType3 = null;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (!Intrinsics.LJFF(eventType, "homepage_hot")) {
            if (c2189821An6 != null) {
                eventType2 = c2189821An6.getEventType();
            } else {
                eventType2 = null;
            }
            if (!Intrinsics.LJFF(eventType2, "general_search")) {
                if (c2189821An6 != null) {
                    eventType3 = c2189821An6.getEventType();
                }
                if (Intrinsics.LJFF(eventType3, "playlist") && Intrinsics.LJFF(c2189821An6.getPlaylistPreviousPage(), "general_search")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean ip(BaseFeedPageParams baseFeedPageParams) {
        if (((Boolean) C0B16.LIZ.getValue()).booleanValue() && yp(baseFeedPageParams.param)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaAttachAbility interactAreaAttachAbility;
        tp(videoItemParams);
        C339190DRl.LIZIZ(LJJIJL());
        if (up(videoItemParams) && (interactAreaAttachAbility = (InteractAreaAttachAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            interactAreaAttachAbility.Fn1(this, new AwS555S0100000_11(this, 259));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        C2189821An6 c2189821An6;
        Aweme aweme = videoItemParams.getAweme();
        if (((Boolean) C0B16.LIZ.getValue()).booleanValue() && !C300940Bqu.LIZ()) {
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null) {
                c2189821An6 = baseFeedPageParams.param;
            } else {
                c2189821An6 = null;
            }
            if (yp(c2189821An6) && !aweme.isAd() && !AwemeSaaSExtKt.isLive(aweme) && !C1ER1.LIZIZ.LJJII().LJFF(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
    }
}

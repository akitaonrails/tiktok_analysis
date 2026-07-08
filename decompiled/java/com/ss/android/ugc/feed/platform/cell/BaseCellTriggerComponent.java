package com.ss.android.ugc.feed.platform.cell;

import X.AbstractC1616230sA1;
import X.C03H5;
import X.C0RJE;
import X.C0RK3;
import X.C0RK5;
import X.C0RK6;
import X.C13IQ;
import X.C1618440sDa;
import X.C1AV3;
import X.C21600219g8;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C2276411E8h;
import X.C709080Rre;
import X.C723830SaL;
import X.EnumC2180541AVo;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.template.CCTemplateAreaComponent;
import com.ss.android.ugc.feed.platform.componentmanager.view.InteractAreaRootLayout;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseCellTriggerComponent<RECEIVER extends C03H5> extends BaseCellContentComponent<RECEIVER> implements C0RK6 {
    public final /* synthetic */ C0RK5 LLJJJJLIIL = new C0RK5();
    public boolean LLJJL = true;

    public abstract C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType();

    public Map<String, Object> hp() {
        return null;
    }

    public boolean ip(BaseFeedPageParams baseFeedPageParams) {
        return true;
    }

    public final synchronized boolean mp() {
        return this.LLJJL;
    }

    public abstract boolean up(VideoItemParams videoItemParams);

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        if ((this instanceof CCTemplateAreaComponent) || (LJJIJL() instanceof VideoViewCellRootView) || Intrinsics.LJFF(LJJIJL().getTag(R.id.el5), Boolean.TRUE) || (LJJIJL().getParent() instanceof AbstractC1616230sA1) || (LJJIJL().getParent() instanceof C21600219g8) || (LJJIJL().getParent() instanceof ViewPager) || (LJJIJL().getParent() instanceof ViewOnAttachStateChangeListenerC20631115oD) || (LJJIJL().getParent() instanceof RecyclerView) || (LJJIJL() instanceof C709080Rre) || (LJJIJL().getParent() instanceof C709080Rre) || (LJJIJL() instanceof InteractAreaRootLayout) || (LJJIJL().getParent() instanceof InteractAreaRootLayout)) {
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TriggerComponent invalid onInactive: ");
            sbLIZ.append(getClass().getCanonicalName());
            c2276411E8h.LIZJ("common_feed", 6, "onInActive", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!Intrinsics.LJFF("cell_story_immersive_collection", jm().LJII) || C1618440sDa.LIZIZ.LJJIIJ().LJIJ(LJJIJL().getId())) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                C2180521AVm.LIZ(viewLJJIJL, EnumC2180541AVo.V_VISIBLITY, C1AV3.LIZ(1, "Feed", null, "celltrigger"));
            }
            super.oo();
            return;
        }
        C2276411E8h c2276411E8h2 = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TriggerComponent invalid onInactive: ");
        sbLIZ2.append(getClass().getCanonicalName());
        c2276411E8h2.LIZJ("common_feed", 6, "onInActive", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public boolean op() {
        return this.LLJJJJLIIL.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public boolean ur(VideoItemParams videoItemParams) {
        if (C0RJE.LIZIZ(this, false)) {
            return ep(videoItemParams);
        }
        return true;
    }

    public final boolean ep(VideoItemParams videoItemParams) {
        boolean zUp = up(videoItemParams);
        synchronized (this) {
            this.LLJJL = zUp;
        }
        return zUp;
    }

    public final boolean lp(VideoItemParams videoItemParams) {
        if (op()) {
            return true;
        }
        return ep(videoItemParams);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new C0RK3(this));
    }

    @Override // X.C0RK6
    public final void sn(boolean z) {
        this.LLJJJJLIIL.LL = z;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
    }

    public final void tp(VideoItemParams videoItemParams) {
        if (op() && (this instanceof PriorityProtocol)) {
            return;
        }
        if ((C0RJE.LIZIZ(this, false) && mp()) || ep(videoItemParams)) {
            C723830SaL.LJ(this, getType(), true, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    public boolean kp(BaseFeedPageParams baseFeedPageParams, int i) {
        return ip(baseFeedPageParams);
    }
}

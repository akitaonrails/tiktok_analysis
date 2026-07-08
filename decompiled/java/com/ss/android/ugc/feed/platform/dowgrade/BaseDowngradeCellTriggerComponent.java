package com.ss.android.ugc.feed.platform.dowgrade;

import X.C03H5;
import X.C098200Yq;
import X.C0B8O;
import X.C0BX5;
import X.C0RF0;
import X.C0RIA;
import X.C0RIC;
import X.C0RUB;
import X.C0RUC;
import X.C0RUJ;
import X.C1111504Wj;
import X.C1370970lmR;
import X.C189200o6;
import X.C283260B8i;
import X.C283970BBb;
import X.C693550RIj;
import X.C723830SaL;
import X.C724240Sb0;
import X.EnumC695670RQn;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnTrigger;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationTrigger;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTriggerV2;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceTrigger;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.UpvoteVideoTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedDMSharedTagTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseDowngradeCellTriggerComponent<RECEIVER extends C03H5> extends BaseCellTriggerComponent<RECEIVER> {
    public ReusedUISlotAssem<? extends C03H5> LLJJLIIIJLLLLLLLZ;

    public boolean yp() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!yp()) {
            super.onViewCreated(view);
        } else {
            C723830SaL.LIZ(this, null, new C0RIC(this));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public void up(VideoItemParams videoItemParams) {
        Object c098200Yq;
        Object c098200Yq2;
        String str;
        Integer num;
        C0RUJ c0ruj;
        C0RUJ c0ruj2;
        if (!yp()) {
            tp(videoItemParams);
            return;
        }
        IInternalShareApi.LIZ.getClass();
        boolean zBooleanValue = false;
        if ((!C1370970lmR.LIZ().LIZIZ().LJJIII(this) && !(this instanceof UpvoteVideoTrigger) && !(this instanceof VideoRelationBtnTrigger) && !(this instanceof QuickDMEntranceTrigger) && !(this instanceof FeedStoryTagTriggerV2) && !(this instanceof VideoExposeSharerInformationTrigger) && !(this instanceof FeedDMSharedTagTrigger) && ((!(this instanceof VideoBottomLabelProtocol) || C1111504Wj.LIZ()) && ((C0BX5.LIZ() || (((this instanceof BottomBarPriorityProtocol) && ((Number) C283260B8i.LIZ.getValue()).intValue() == 0) || (((this instanceof VideoTagCategoryProtocol) && ((Number) C283970BBb.LIZ.getValue()).intValue() == 0) || ((this instanceof PriorityProtocol) && ((Number) C0B8O.LIZ.getValue()).intValue() == 1)))) && mp()))) || up(videoItemParams)) {
            Integer numValueOf = null;
            try {
                if ((this instanceof C0RUJ) && (c0ruj2 = (C0RUJ) this) != null) {
                    c098200Yq = c0ruj2.T1();
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            try {
                if ((this instanceof C0RUJ) && (c0ruj = (C0RUJ) this) != null) {
                    c098200Yq2 = Boolean.valueOf(c0ruj.m8());
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            Boolean bool = (Boolean) c098200Yq2;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            C0RF0 c0rf0 = jm().LIZLLL;
            if (c0rf0 != null) {
                str = c0rf0.LJIIIZ;
            } else {
                str = null;
            }
            C0RF0 c0rf02 = jm().LIZLLL;
            if (c0rf02 != null) {
                num = c0rf02.LJIIZILJ;
            } else {
                num = null;
            }
            C0RF0 c0rf03 = jm().LIZLLL;
            if (c0rf03 != null) {
                numValueOf = Integer.valueOf(c0rf03.LJIILJJIL);
            }
            C0RUB c0rubLIZJ = C0RUC.LIZJ(str, str2, num, numValueOf, zBooleanValue);
            EnumC695670RQn enumC695670RQn = c0rubLIZJ.LIZ;
            int i = C693550RIj.LIZ[enumC695670RQn.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    ReusedUISlotAssem<? extends C03H5> reusedUISlotAssem = this.LLJJLIIIJLLLLLLLZ;
                    if (reusedUISlotAssem != null) {
                        C0RUC.LIZLLL(C724240Sb0.LIZ(this), enumC695670RQn, c0rubLIZJ, reusedUISlotAssem, new C0RIA(this));
                        return;
                    }
                    return;
                }
                C723830SaL.LJ(this, getType(), true, null);
            }
        }
    }
}

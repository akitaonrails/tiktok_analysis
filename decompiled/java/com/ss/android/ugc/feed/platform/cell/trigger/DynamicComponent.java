package com.ss.android.ugc.feed.platform.cell.trigger;

import X.C01GW;
import X.C03H5;
import X.C0RJE;
import X.C0RKZ;
import X.C452501pT;
import X.C693990RKb;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.ab.FeedComponentComplexityExpConfig;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DynamicComponent<RECEIVER extends C03H5> extends BaseCellSlotComponent<RECEIVER> {
    public final /* synthetic */ C693990RKb LLJLLIL = new Object() { // from class: X.0RKb
    };
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11((DynamicComponent) this, 1288));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11((DynamicComponent) this, 1289));

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public void unBind() {
    }

    public final AbsComponentTrigger Bp() {
        return (AbsComponentTrigger) this.LLJZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        AbsComponentTrigger absComponentTriggerBp = Bp();
        getClass();
        if (absComponentTriggerBp != null) {
            absComponentTriggerBp.LLJIJIL = this;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    public final boolean sp() {
        AbsComponentTrigger absComponentTriggerBp = Bp();
        if (absComponentTriggerBp == null) {
            return true;
        }
        return C0RJE.LIZIZ(absComponentTriggerBp, false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        FeedComponentComplexityExpConfig feedComponentComplexityExpConfig = C0RKZ.LIZ;
        if (C0RKZ.LIZ((String) this.LLJLLL.getValue())) {
            AbsComponentTrigger absComponentTriggerBp = Bp();
            if (absComponentTriggerBp != null && C0RJE.LIZIZ(absComponentTriggerBp, false)) {
                return absComponentTriggerBp.LLILLJJLI;
            }
            return true;
        }
        return super.ur(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}

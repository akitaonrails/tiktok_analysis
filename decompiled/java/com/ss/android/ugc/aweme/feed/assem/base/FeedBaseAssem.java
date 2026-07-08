package com.ss.android.ugc.aweme.feed.assem.base;

import X.C03H5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedBaseAssem<RECEIVER extends C03H5> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<VideoItemParams>, FeedModeBaseProtocol {
    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public void vr(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public void wr() {
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

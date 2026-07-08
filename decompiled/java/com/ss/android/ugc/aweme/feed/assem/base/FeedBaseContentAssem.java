package com.ss.android.ugc.aweme.feed.assem.base;

import X.C03H5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FeedBaseContentAssem<RECEIVER extends C03H5> extends ReusedUIContentAssem<RECEIVER> implements InterfaceC712990Rxx<VideoItemParams> {
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(VideoItemParams videoItemParams) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

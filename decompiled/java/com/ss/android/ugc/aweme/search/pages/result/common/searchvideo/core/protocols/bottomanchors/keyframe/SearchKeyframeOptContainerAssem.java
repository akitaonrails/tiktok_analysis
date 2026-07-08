package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe;

import X.C659520Ptu;
import X.C723830SaL;
import X.EnumC666240QBi;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.ISearchVideoKeyFrameOptProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchKeyframeOptContainerAssem extends ReusedUIContentAssem<SearchKeyframeOptContainerAssem> implements InterfaceC712990Rxx<C659520Ptu> {
    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ISearchVideoKeyFrameOptProtocol.LL.getClass();
        EnumC666240QBi enumC666240QBi = (EnumC666240QBi) ISearchVideoKeyFrameOptProtocol.LLILLJJLI.getValue();
        if (enumC666240QBi == null) {
            return;
        }
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(this, enumC666240QBi, 43));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}

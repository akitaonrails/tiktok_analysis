package com.ss.android.ugc.aweme.poi.detail.container;

import X.C1181990grd;
import X.C1188440h22;
import X.EnumC1181950grZ;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailInfoViewModel extends AssemViewModel<C1181990grd> {
    public String LL;
    public PoiListApi.PoiDetailResponse LLILLJJLI;
    public C1188440h22 LLILLL;
    public int LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1181990grd(0);
    }

    public final void vQ2(EnumC1181950grZ enumC1181950grZ) {
        if (getState().LLILLL != enumC1181950grZ) {
            setStateImmediate(new AwS597S0100000_18(enumC1181950grZ, 315));
        }
    }
}

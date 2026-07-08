package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel;

import X.C594640NTy;
import X.C660910Pw9;
import X.InterfaceC0148002o;
import X.InterfaceC435460H5s;
import X.InterfaceC661400Pww;
import Y.AObjectS353S0100000_10;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.ISearchPhotoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoImmersiveVM extends AssemViewModelWithItem<C594640NTy, InterfaceC435460H5s> {
    public ISearchVideoHolderAbility LL;
    public ISearchPhotoHolderAbility LLILLJJLI;
    public final C660910Pw9 LLILLL = new InterfaceC661400Pww() { // from class: X.0Pw9
        @Override // X.InterfaceC661400Pww
        public final void LIZIZ(EnumC661340Pwq enumC661340Pwq) {
            int i = C660920PwA.LIZ[enumC661340Pwq.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LL.setStateImmediate(AFwS241S0000000_10.get$arr$(262));
                    return;
                }
                return;
            }
            this.LL.setStateImmediate(AFwS241S0000000_10.get$arr$(261));
        }
    };
    public final AObjectS353S0100000_10 LLILZ = new AObjectS353S0100000_10(this, 0);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C594640NTy(0);
    }
}

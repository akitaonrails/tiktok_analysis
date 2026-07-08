package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C237400vs;
import X.C653660PkS;
import X.C659750PuH;
import X.InterfaceC0148002o;
import X.InterfaceC738070SxJ;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoViewModel extends AssemViewModelWithItem<C237400vs, C659750PuH> implements InterfaceC738070SxJ<C237400vs, C659750PuH> {
    public C653660PkS LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C237400vs(0);
    }

    @Override // X.InterfaceC738070SxJ
    public final C659750PuH state2ItemAccept(InterfaceC0148002o interfaceC0148002o, C659750PuH c659750PuH) {
        return c659750PuH;
    }

    @Override // X.InterfaceC738070SxJ
    public final InterfaceC0148002o itemSync2StateAccept(InterfaceC0148002o interfaceC0148002o, C659750PuH c659750PuH, List list) {
        return new C237400vs(0);
    }
}

package com.ss.android.ugc.aweme.favorites.business.collection.vm;

import X.C09YA;
import X.C1160250gIZ;
import X.C1170270gYj;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoCollectionListViewModel extends AssemViewModel<C1160250gIZ> {
    public static final Map<String, CollectionDetail> LLIZLLLIL = new LinkedHashMap();
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public CollaborativeUserInfo LLILZIL;
    public String LLILZLL;
    public final C09YA LLIZ = new C09YA(this, AFwS206S0000000_18.get$arr$(141));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1160250gIZ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((LinkedHashMap) LLIZLLLIL).clear();
    }

    public final void vQ2(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        withState(new C1170270gYj(z, this, str, z2, z3, z4));
    }
}

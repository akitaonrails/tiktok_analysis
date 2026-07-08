package com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm;

import X.AnonymousClass0956;
import X.C09R9;
import X.C0PEM;
import X.C1159010gGZ;
import X.C13LE;
import X.C1770380wAe;
import X.C1770400wAg;
import X.C1770420wAi;
import X.C1770520wAs;
import X.C23250099c;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequencyParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchNoCartFeedVideoGuideVM extends AssemViewModel<C1159010gGZ> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C1770520wAs.class));
    public boolean LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159010gGZ(0);
    }

    public final void wQ2(EcSearchFeedVideoGuideFrequencyParams ecSearchFeedVideoGuideFrequencyParams) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1770420wAi(ecSearchFeedVideoGuideFrequencyParams, this, null), 2);
    }

    public final AnonymousClass0956 vQ2(Aweme aweme, String str, C1770380wAe c1770380wAe, List list, Map map, int i, int i2, float f, String str2) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1770400wAg(this, aweme, c1770380wAe, str2, str, list, i, i2, f, map, null), 2);
    }
}

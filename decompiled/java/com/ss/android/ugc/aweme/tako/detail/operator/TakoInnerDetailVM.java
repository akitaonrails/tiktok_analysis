package com.ss.android.ugc.aweme.tako.detail.operator;

import X.C09YA;
import X.C0PEM;
import X.C2217381BqS;
import X.C23250099c;
import X.C329250CvT;
import X.C329290CvX;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS118S1100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoInnerDetailVM extends AssemViewModel<C329290CvX> {
    public final C09YA LL = new C09YA(this, AFwS190S0000000_4.get$arr$(2043));
    public Map<String, ? extends List<TakoKeyFramePoint>> LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C329290CvX(0);
    }

    public final void vQ2(String str) {
        withState(new AwS118S1100000_4(this, str, 3));
    }

    public final void xQ2(Function0 function0, Function1 function1, Function1 function12) {
        AssemViewModel.asyncSubscribe$default(this, new C2217381BqS() { // from class: X.0CvY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C329290CvX) obj).LL;
            }
        }, null, function1, function0, function12, 2, null);
    }

    public final void wQ2(String str, Function1 function1, Function1 function12, Function0 function0) {
        function0.invoke();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C329250CvT(this, str, function12, function1, null), 2);
    }
}

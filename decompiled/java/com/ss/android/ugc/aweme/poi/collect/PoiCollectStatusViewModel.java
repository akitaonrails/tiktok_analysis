package com.ss.android.ugc.aweme.poi.collect;

import X.C08I7;
import X.C09JN;
import X.C1155540gAy;
import X.C1171370gaV;
import X.C1188440h22;
import X.C11S5;
import X.C1701940uOG;
import X.C614890O9v;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS105S0110000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectStatusViewModel extends AssemViewModel<C1155540gAy> {
    public static final List<PoiCollectStatusViewModel> LL = new ArrayList();
    public static final HashMap<String, String> LLILLJJLI = new HashMap<>();
    public static final HashMap<String, C1188440h22> LLILLL = new HashMap<>();
    public static final HashMap<String, Boolean> LLILZ = new HashMap<>();
    public static final C08I7<String, Boolean> LLILZIL = new C08I7<>(100);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155540gAy(false);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        List<PoiCollectStatusViewModel> list = LL;
        ((ArrayList) list).remove(this);
        if (((ArrayList) list).isEmpty()) {
            LLILLJJLI.clear();
            LLILLL.clear();
            LLILZ.clear();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        ((ArrayList) LL).add(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void vQ2(String str, final Function1<? super Boolean, Unit> function1, Boolean bool) {
        final boolean z;
        C614890O9v.LIZ.start();
        if (bool == null) {
            z = getState().LL;
        } else if (!bool.booleanValue()) {
            z = 1;
        } else {
            z = 0;
        }
        PoiListApi.LIZ.getClass();
        C1171370gaV.LIZ().collectPoi(str, !z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0gJY
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PoiCollectStatusViewModel@afad.collectPoi$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && baseResponse.status_code == 0) {
                    this.LL.setState(new AwS105S0110000_18((Function1) function1, (Function1<? super Boolean, Unit>) z, true));
                }
                C1C7U.LIZIZ("PoiCollectStatusViewModel@afad.collectPoi$1");
            }
        });
    }
}

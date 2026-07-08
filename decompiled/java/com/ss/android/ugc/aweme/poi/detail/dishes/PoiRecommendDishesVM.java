package com.ss.android.ugc.aweme.poi.detail.dishes;

import X.C09R9;
import X.C0CAU;
import X.C1182480gsQ;
import X.C1182960gtC;
import X.C13LE;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import Y.ARunnableS87S0200000_18;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.manager.JSEventCenter;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendDishesVM extends AssemViewModel<C1182480gsQ> {
    public ARunnableS87S0200000_18 LLILLL;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C1182960gtC.class));
    public final Map<String, Integer> LLILLJJLI = new LinkedHashMap();
    public final JSEventCenter LLILZ = new JSEventCenter(false);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1182480gsQ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        JSEventCenter jSEventCenter = this.LLILZ;
        Lifecycle lifecycle = getLifecycle();
        jSEventCenter.getClass();
        lifecycle.addObserver(jSEventCenter);
    }

    public final void vQ2(PoiDetailApi.RecommendedDish recommendedDish) {
        int iIntValue;
        Map<String, Integer> map = this.LLILLJJLI;
        String dishId = recommendedDish.getDishId();
        if (dishId == null) {
            dishId = "";
        }
        Integer num = (Integer) ((LinkedHashMap) this.LLILLJJLI).get(recommendedDish.getDishId());
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put(dishId, Integer.valueOf(iIntValue + 1));
        setState(new AwS384S0200000_18(recommendedDish, this, 98));
        ARunnableS87S0200000_18 aRunnableS87S0200000_18 = this.LLILLL;
        if (aRunnableS87S0200000_18 != null) {
            C0CAU.LIZ.removeCallbacks(aRunnableS87S0200000_18);
            this.LLILLL = null;
        }
        ARunnableS87S0200000_18 aRunnableS87S0200000_182 = new ARunnableS87S0200000_18(this, recommendedDish, 10);
        C786410Ut5.LJLIIL(300L, C0CAU.LIZ, aRunnableS87S0200000_182);
        this.LLILLL = aRunnableS87S0200000_182;
    }

    public final ArrayList<PoiDetailApi.RecommendedDish> wQ2(String str, Function1<? super PoiDetailApi.RecommendedDish, PoiDetailApi.RecommendedDish> function1) {
        ArrayList<PoiDetailApi.RecommendedDish> arrayList = getState().LLILLJJLI;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<PoiDetailApi.RecommendedDish> arrayList2 = new ArrayList<>();
            for (PoiDetailApi.RecommendedDish recommendedDish : arrayList) {
                if (Intrinsics.LJFF(recommendedDish.getDishId(), str)) {
                    arrayList2.add(function1.invoke(recommendedDish));
                } else {
                    arrayList2.add(recommendedDish);
                }
            }
            return arrayList2;
        }
        return arrayList;
    }
}

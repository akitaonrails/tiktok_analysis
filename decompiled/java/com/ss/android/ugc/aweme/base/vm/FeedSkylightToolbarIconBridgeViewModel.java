package com.ss.android.ugc.aweme.base.vm;

import X.C01GW;
import X.C1575720r6g;
import X.C452501pT;
import X.EnumC1582650rHr;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS7S0402000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightToolbarIconBridgeViewModel extends AssemViewModel<C1575720r6g> {
    public int LL = -1;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 108));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(75));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1575720r6g(0);
    }

    public static List vQ2(List list, List list2) {
        if (list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!list2.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void wQ2(FeedSkylightToolbarIconBridgeViewModel feedSkylightToolbarIconBridgeViewModel, Context context, List list, int i, int i2) {
        EnumC1582650rHr enumC1582650rHr = EnumC1582650rHr.DEFAULT;
        feedSkylightToolbarIconBridgeViewModel.LL = i;
        if (context != null) {
            feedSkylightToolbarIconBridgeViewModel.setState(new AwS7S0402000_24(feedSkylightToolbarIconBridgeViewModel, (FeedSkylightToolbarIconBridgeViewModel) context, (Context) list, (List<? extends InterfaceC1891350zJl>) enumC1582650rHr, (EnumC1582650rHr) i2, i, 1));
        }
    }
}

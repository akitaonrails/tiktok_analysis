package com.ss.android.ugc.aweme.vibefeed.feed.interact.msg;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0P31;
import X.C0VKZ;
import X.C0YI5;
import X.C0YNY;
import X.C0YUT;
import X.C0Z7P;
import X.C0Z7U;
import X.C1165820gRY;
import X.C13LP;
import X.C2188811AlT;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C452501pT;
import X.C627660Ojc;
import X.C869590Y9l;
import X.C876310YZh;
import X.C876340YZk;
import X.C877250YbD;
import X.C912570Zr5;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC874680YTa;
import Y.AComparatorS33S0000000_14;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class VibeMessageListViewModel extends AssemListViewModel<C1165820gRY, C912570Zr5, Integer> {
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL = "";
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1167));
    public C0P31 LLIZ;
    public Function0<Boolean> LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1165820gRY(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
        ((C876310YZh) c0yi5LIZ).LIZ.LJIJI().LJII(this.LL, (C877250YbD) this.LLILZLL.getValue());
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C912570Zr5> c627660Ojc) {
        List listLJLLLL;
        List<C912570Zr5> list = c627660Ojc.LLILZ;
        if (list != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (C912570Zr5 c912570Zr5 : list) {
                if (hashSet.add(Long.valueOf(c912570Zr5.LLILLJJLI.getMsgId()))) {
                    arrayList.add(c912570Zr5);
                }
            }
            listLJLLLL = C13LP.LJLLLL(new AComparatorS33S0000000_14(6), arrayList);
        } else {
            listLJLLLL = null;
        }
        setState(new AwS593S0100000_14(C627660Ojc.LIZ(c627660Ojc, null, null, null, listLJLLLL, 7), (C627660Ojc<C912570Zr5>) 166));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        C0YUT messageStatus;
        if (this.LL.length() != 0 && this.LLILLJJLI.length() != 0) {
            String str = this.LLILLJJLI;
            C0Z7U.LIZ.getClass();
            List<C0VKZ> listLIZ = C0Z7P.LIZ().LIZ(this.LL, this.LLILLJJLI);
            ArrayList arrayList = new ArrayList();
            Iterator<C0VKZ> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(it2.next().LIZ);
                if (c869590Y9lLJJJ != null && (messageStatus = c869590Y9lLJJJ.getMessageStatus()) != C0YUT.DELETED && messageStatus != C0YUT.RECALLED) {
                    arrayList.add(new C912570Zr5(str, c869590Y9lLJJJ, this.LLILLL, this.LLILZ, this.LLILZIL));
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msgList size: ");
            sbLIZ.append(arrayList.size());
            C2188811AlT.LIZIZ(sbLIZ);
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(arrayList);
        }
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Exception exc = new Exception("conversationId or awemeId is empty");
        c317290CcB.getClass();
        return new C316650Cb9(exc);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }
}

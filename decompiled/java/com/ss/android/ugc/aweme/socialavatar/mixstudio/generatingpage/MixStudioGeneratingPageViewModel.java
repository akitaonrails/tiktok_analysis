package com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage;

import X.AnonymousClass0956;
import X.C01GW;
import X.C05YD;
import X.C0H6Q;
import X.C0HKU;
import X.C0HR5;
import X.C0HR9;
import X.C0HRA;
import X.C0HRB;
import X.C0PEM;
import X.C10EU;
import X.C1372805Yw;
import X.C1372905Yx;
import X.C1373105Yz;
import X.C13LP;
import X.C15438062q;
import X.C1DFB;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC0148002o;
import X.InterfaceC440090HNn;
import X.InterfaceC440230HOb;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioGeneratingPageViewModel extends AssemViewModel<C0HR5> {
    public AnonymousClass0956 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(197));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(195));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(196));

    public final MixStudioStatusRepository vQ2() {
        return (MixStudioStatusRepository) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        ArrayList arrayList;
        InterfaceC440230HOb<?> interfaceC440230HObWQ2;
        C05YD<List<Pair<Integer, String>>> c05ydLJIIL;
        List<Pair<Integer, String>> value;
        C05YD<InterfaceC440090HNn> c05ydLIZ;
        InterfaceC440090HNn value2;
        C05YD<List<Pair<Integer, String>>> c05ydLJIIL2;
        List<Pair<Integer, String>> value3;
        Pair pair;
        if (C0H6Q.LIZ()) {
            MixStudioStatusRepository mixStudioStatusRepositoryVQ2 = vQ2();
            interfaceC440230HObWQ2 = new C1372905Yx((mixStudioStatusRepositoryVQ2 == null || (c05ydLJIIL2 = mixStudioStatusRepositoryVQ2.LJIIL()) == null || (value3 = c05ydLJIIL2.getValue()) == null || (pair = (Pair) C13LP.LJJJLL(value3)) == null) ? 0 : ((Number) pair.getFirst()).intValue());
        } else {
            MixStudioStatusRepository mixStudioStatusRepositoryVQ22 = vQ2();
            if (mixStudioStatusRepositoryVQ22 == null || (c05ydLJIIL = mixStudioStatusRepositoryVQ22.LJIIL()) == null || (value = c05ydLJIIL.getValue()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
                Iterator<Pair<Integer, String>> it2 = value.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getSecond());
                }
            }
            interfaceC440230HObWQ2 = wQ2(arrayList);
        }
        MixStudioStatusRepository mixStudioStatusRepositoryVQ23 = vQ2();
        if (mixStudioStatusRepositoryVQ23 == null || (c05ydLIZ = mixStudioStatusRepositoryVQ23.LIZ()) == null || (value2 = c05ydLIZ.getValue()) == null) {
            throw new IllegalStateException();
        }
        return new C0HR5(interfaceC440230HObWQ2, value2, Integer.MAX_VALUE);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFB c1dfb = C0PEM.LIZJ;
        C23250099c.LIZLLL(assemVMScope, c1dfb, null, new C0HRA(this, null), 2);
        C23250099c.LIZLLL(getAssemVMScope(), c1dfb, null, new C0HR9(this, null), 2);
        C23250099c.LIZLLL(getAssemVMScope(), c1dfb, null, new C0HRB(this, null), 2);
    }

    public final InterfaceC440230HOb<?> wQ2(List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() >= 2) {
                return new C1373105Yz(ViewModelKt.getViewModelScope(this), null, list);
            }
            String str = (String) C13LP.LJJJLL(list);
            if (!C10EU.LJIIZILJ(str) && str != null) {
                return new C1372805Yw(ViewModelKt.getViewModelScope(this), null, str);
            }
            return new C0HKU(ViewModelKt.getViewModelScope(this));
        }
        return new C0HKU(ViewModelKt.getViewModelScope(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(java.util.List<kotlin.Pair<java.lang.Integer, java.lang.String>> r11, X.InterfaceC1364105Vn<? super X.InterfaceC440230HOb<?>> r12) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel.xQ2(java.util.List, X.05Vn):java.lang.Object");
    }
}

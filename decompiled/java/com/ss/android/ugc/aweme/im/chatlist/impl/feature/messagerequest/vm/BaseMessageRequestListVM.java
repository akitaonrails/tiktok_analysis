package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm;

import X.AbstractC885540Yoa;
import X.C0YG2;
import X.C876470YZx;
import X.C876610YaB;
import X.C878960Ydy;
import X.C885430YoP;
import X.EnumC871430YGn;
import X.EnumC880520YgU;
import X.InterfaceC0148002o;
import X.InterfaceC1491305sd;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseMessageRequestListVM extends AssemViewModel<C885430YoP> implements C0YG2 {
    public abstract boolean AQ2();

    public abstract String BQ2();

    public abstract List<C878960Ydy> C40();

    public abstract boolean CQ2();

    public abstract boolean DQ2(List<? extends AbstractC885540Yoa<?>> list);

    public abstract void EQ2();

    public abstract void FQ2(C878960Ydy c878960Ydy, String str);

    public abstract void GQ2(EnumC880520YgU enumC880520YgU, String str);

    public abstract void HQ2(String str);

    public abstract void IQ2(int i);

    public abstract void JQ2(InterfaceC1491305sd interfaceC1491305sd);

    public abstract void KQ2(boolean z);

    public abstract void LJJJJLI();

    public abstract boolean Ro();

    public abstract EnumC871430YGn a1();

    public abstract void refreshData();

    public abstract void vQ2();

    public abstract void wQ2();

    public abstract void xQ2();

    @Override // X.C0YG2
    public final void xf0(C876610YaB c876610YaB) {
    }

    public abstract void yQ2(boolean z, C878960Ydy c878960Ydy);

    public abstract String zQ2();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C885430YoP(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C876470YZx.LIZ().LJIIL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public void onPrepared() {
        super.onPrepared();
        C876470YZx.LIZ().LJIIIZ(this);
    }

    @Override // X.C0YG2
    public final void I02(List<String> list) {
        if (!list.isEmpty()) {
            EQ2();
        }
    }
}

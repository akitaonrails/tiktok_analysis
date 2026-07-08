package com.ss.android.ugc.aweme.groupshot;

import X.C0I0B;
import X.C0PEM;
import X.C23250099c;
import X.C448500HiK;
import X.C458000Hxe;
import X.C458010Hxf;
import X.C869590Y9l;
import X.C912070ZqH;
import X.EnumC448510HiL;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotRecallVM;
import com.ss.android.ugc.aweme.im.message.template.card.AIGroupShotCardTemplate;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class AIGroupShotRecallVMImpl extends AIGroupShotRecallVM {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C448500HiK(0);
    }

    @Override // com.ss.android.ugc.aweme.aigroupshot.AIGroupShotRecallVM
    public final void vQ2(C869590Y9l c869590Y9l, AIGroupShotCardTemplate aIGroupShotCardTemplate, int i) {
        C912070ZqH.LIZIZ.LJIIL().LJIILIIL(i, EnumC448510HiL.DELETE_FOR_EVERYONE, C0I0B.LJFF.LIZIZ());
        if (getState().LL.LIZ.LIZ) {
            return;
        }
        setState(AFwS236S0000000_6.get$arr$(70));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C458000Hxe(aIGroupShotCardTemplate, c869590Y9l, this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.aigroupshot.AIGroupShotRecallVM
    public final void wQ2(C869590Y9l c869590Y9l, AIGroupShotCardTemplate aIGroupShotCardTemplate, int i) {
        C912070ZqH.LIZIZ.LJIIL().LJIILIIL(i, EnumC448510HiL.REMOVE_PHOTO, C0I0B.LJFF.LIZIZ());
        if (getState().LL.LIZ.LIZ) {
            return;
        }
        setState(AFwS236S0000000_6.get$arr$(71));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C458010Hxf(aIGroupShotCardTemplate, c869590Y9l, this, null), 2);
    }
}

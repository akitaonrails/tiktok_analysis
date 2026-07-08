package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.C09R9;
import X.C0ONX;
import X.C0PEM;
import X.C13LE;
import X.C23250099c;
import X.C593420NPg;
import X.C615580OCm;
import X.C618680OOk;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPollViewModel extends AssemViewModel<C593420NPg> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C0ONX.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C593420NPg(0);
    }

    public final void vQ2(int i, long j, long j2, long j3, long j4, int i2, BulletinListViewModel bulletinListViewModel, C618680OOk c618680OOk, C618680OOk c618680OOk2) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C615580OCm(this, i, j, j2, j3, j4, i2, bulletinListViewModel, c618680OOk, c618680OOk2, null), 2);
    }
}

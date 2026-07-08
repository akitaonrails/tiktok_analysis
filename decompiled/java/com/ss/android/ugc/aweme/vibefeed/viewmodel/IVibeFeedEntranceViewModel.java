package com.ss.android.ugc.aweme.vibefeed.viewmodel;

import X.C908580Zke;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes15.dex */
public abstract class IVibeFeedEntranceViewModel extends AssemViewModel<C908580Zke> {
    public boolean LL;
    public boolean LLILLJJLI = true;
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);

    public abstract void vQ2(String str, String str2, boolean z);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C908580Zke(0);
    }
}

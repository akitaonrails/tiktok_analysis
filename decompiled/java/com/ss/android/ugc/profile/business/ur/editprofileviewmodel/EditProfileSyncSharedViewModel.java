package com.ss.android.ugc.profile.business.ur.editprofileviewmodel;

import X.C01GW;
import X.C1215720hk2;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileSyncSharedViewModel extends AssemViewModel<C1215720hk2> {
    public static final /* synthetic */ int LLILZLL = 0;
    public boolean LL;
    public int LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(435));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(434));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2263));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1215720hk2(0);
    }

    public final boolean vQ2() {
        return ((Boolean) this.LLILZ.getValue()).booleanValue();
    }

    public final void wQ2() {
        setState(AFwS257S0000000_19.get$arr$(408));
    }
}

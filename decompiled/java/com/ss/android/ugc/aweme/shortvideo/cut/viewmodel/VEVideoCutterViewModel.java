package com.ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import X.C01GW;
import X.C452501pT;
import X.C574630MgH;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class VEVideoCutterViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(151));
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public final void vQ2(C574630MgH c574630MgH) {
        if (this.LLILLJJLI && c574630MgH.LIZ == 1) {
            return;
        }
        ((LiveData) this.LL.getValue()).setValue(c574630MgH);
    }
}

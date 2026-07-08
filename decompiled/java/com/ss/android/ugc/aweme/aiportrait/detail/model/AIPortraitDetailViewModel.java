package com.ss.android.ugc.aweme.aiportrait.detail.model;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C0OCX;
import X.C0OCY;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C558690Lvf;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AIPortraitDetailViewModel extends AssemViewModel<C0OCY> {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OCY(0);
    }

    public AIPortraitDetailViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C558690Lvf.LIZ);
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public final void vQ2(boolean z) {
        boolean z2;
        String str = this.LL;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(!z2)) {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.LLILLJJLI;
        if (str3 == null || str3.length() == 0) {
            str3 = "";
        }
        String str4 = this.LLILLL;
        if (str4 != null && str4.length() != 0) {
            str2 = str4;
        }
        setState(AFwS240S0000000_9.get$arr$(58));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0OCX(str, str3, str2, z, this, null), 3);
    }
}

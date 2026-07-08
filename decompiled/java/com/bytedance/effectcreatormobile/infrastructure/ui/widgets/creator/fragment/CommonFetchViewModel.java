package com.bytedance.effectcreatormobile.infrastructure.ui.widgets.creator.fragment;

import X.AnonymousClass0951;
import X.C09IC;
import X.C0DVK;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C342150DbB;
import X.InterfaceC342240DbK;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CommonFetchViewModel<T> extends CreatorBaseViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public T LLILLL;

    public abstract InterfaceC342240DbK wQ2();

    public CommonFetchViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C0DVK() { // from class: X.0DVL
        });
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public void vQ2() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C342150DbB(this, null), 3);
    }
}

package com.ss.android.ugc.aweme.account.org.permissions;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C0PEM;
import X.C1243070iS9;
import X.C1326205Gy;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SentInvitePageViewModel extends AndroidViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final AnonymousClass0951 LLILZ;
    public AnonymousClass0956 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final AnonymousClass0951 LLJ;
    public boolean LLJI;
    public String LLJIJIL;
    public String LLJILJIL;

    public final void vQ2() {
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLL.setValue(60);
        this.LLILZIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1326205Gy(this, null), 2);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public SentInvitePageViewModel(Application application) {
        super(application);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1243070iS9.LIZ);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(60);
        this.LLILLL = c2252321DDqLIZ2;
        this.LLILZ = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(null);
        this.LLILZLL = c2252321DDqLIZ3;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ3);
        C2252321DDq c2252321DDqLIZ4 = C1BNE.LIZ(Boolean.FALSE);
        this.LLIZLLLIL = c2252321DDqLIZ4;
        this.LLJ = C09IC.LIZIZ(c2252321DDqLIZ4);
    }

    public final void bu(String str) {
        C2252321DDq c2252321DDq = this.LLILZLL;
        if (Intrinsics.LJFF(str, "")) {
            str = null;
        }
        c2252321DDq.setValue(str);
    }
}

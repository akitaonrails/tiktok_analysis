package com.ss.android.ugc.aweme.account.org.permissions;

import X.AbstractC1243540iSu;
import X.AnonymousClass0951;
import X.C09IC;
import X.C0PEM;
import X.C1243440iSk;
import X.C1243580iSy;
import X.C1243600iT0;
import X.C1243670iT7;
import X.C1243680iT8;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ManagePageViewModel extends AndroidViewModel {
    public AbstractC1243540iSu LL;
    public final C2252321DDq LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public boolean LLIZLLLIL;

    public final void vQ2() {
        this.LL = null;
        this.LLILLJJLI.setValue(C1243670iT7.LIZ);
    }

    public final void yQ2() {
        this.LLILLJJLI.setValue(C1243680iT8.LIZ);
        this.LLILZ.setValue(null);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1243580iSy(this, null), 2);
    }

    public ManagePageViewModel(Application application) {
        super(application);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1243680iT8.LIZ);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        this.LLILZ = c2252321DDqLIZ2;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(null);
        this.LLILZLL = c2252321DDqLIZ3;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ3);
        this.LLIZLLLIL = true;
    }

    public static String xQ2(AbstractC1243540iSu abstractC1243540iSu) {
        if (abstractC1243540iSu instanceof C1243600iT0) {
            if (((C1243600iT0) abstractC1243540iSu).LJ) {
                return "expired";
            }
            return "invite";
        }
        return "effective";
    }

    public static String zQ2(AbstractC1243540iSu abstractC1243540iSu) {
        if (abstractC1243540iSu.LIZJ() == 1) {
            return "admin";
        }
        return "operator";
    }

    public final void bu(String str) {
        C2252321DDq c2252321DDq = this.LLILZLL;
        if (Intrinsics.LJFF(str, "")) {
            str = null;
        }
        c2252321DDq.setValue(str);
    }

    public final void wQ2(boolean z) {
        AbstractC1243540iSu abstractC1243540iSu = this.LL;
        if (abstractC1243540iSu != null && z) {
            C1243440iSk c1243440iSk = C1243440iSk.LIZ;
            String strXQ2 = xQ2(abstractC1243540iSu);
            String strZQ2 = zQ2(abstractC1243540iSu);
            c1243440iSk.getClass();
            C1243440iSk.LIZJ("cancel", strXQ2, strZQ2);
        }
        this.LL = null;
        this.LLILLJJLI.setValue(C1243670iT7.LIZ);
    }
}

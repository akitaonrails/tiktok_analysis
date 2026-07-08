package com.ss.android.ugc.aweme.recommend;

import X.C01GW;
import X.C1072880e1e;
import X.C1072890e1f;
import X.C1073610e2p;
import X.C1156810gD1;
import X.C1483410ohn;
import X.C1720106oR;
import X.C1E7L;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2246061Cvc;
import X.C2246071Cvd;
import X.C2276131E7f;
import X.C452501pT;
import X.EnumC1073720e30;
import X.EnumC1262370ixH;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes35.dex */
public final class RecUserInMainActivityViewModel extends ViewModel {
    public boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C2246061Cvc());
    public boolean LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData<Boolean> LLILZIL;
    public final MutableLiveData<Boolean> LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;

    public final C2246071Cvd wQ2() {
        return (C2246071Cvd) this.LLILLJJLI.getValue();
    }

    public RecUserInMainActivityViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LLILZ = new MutableLiveData<>(bool);
        this.LLILZIL = new MutableLiveData<>(bool);
        this.LLILZLL = new MutableLiveData<>(bool);
        this.LLIZ = new MutableLiveData<>(bool);
        this.LLIZLLLIL = "";
    }

    public final void vQ2(EnumC1262370ixH enumC1262370ixH, String str, EnumC1073720e30 enumC1073720e30) {
        int i;
        C2246071Cvd c2246071CvdWQ2 = wQ2();
        if (c2246071CvdWQ2.LIZJ) {
            c2246071CvdWQ2.LIZJ = false;
            long jCurrentTimeMillis = c2246071CvdWQ2.LIZ + (System.currentTimeMillis() - c2246071CvdWQ2.LIZLLL);
            c2246071CvdWQ2.LIZ = jCurrentTimeMillis;
            C2276131E7f.LIZIZ(C1E7L.REC_POP, new C1156810gD1(c2246071CvdWQ2.LIZIZ, jCurrentTimeMillis));
        }
        if (enumC1262370ixH == EnumC1262370ixH.FYP_POPUP) {
            C1483410ohn.LJLJJI().LJIILLIIL();
            this.LL = false;
        }
        if (wQ2().LIZ <= 0) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip duplicate metrics reporting for swiping to dismiss. dismissReason: ");
            sbLIZ.append(enumC1073720e30);
            C1720106oR.LIZ("rec user in FYP/Inbox/Profile", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            long j = wQ2().LIZ;
            String str2 = C1072890e1f.LIZIZ;
            if (C1072880e1e.LIZ().LIZ.getInt("dialog_close_without_action_in_times", 0) >= 2) {
                i = 1;
            } else {
                i = 0;
            }
            new C1073610e2p(str, j, enumC1073720e30, null, Integer.valueOf(i), 8).LIZLLL(null);
        }
        C2246071Cvd c2246071CvdWQ22 = wQ2();
        c2246071CvdWQ22.LIZ = 0L;
        c2246071CvdWQ22.LIZIZ = false;
        c2246071CvdWQ22.LIZJ = false;
        c2246071CvdWQ22.LIZLLL = 0L;
        if (enumC1262370ixH == EnumC1262370ixH.INBOX_PROFILE_POPUP) {
            this.LLIZ.setValue(Boolean.FALSE);
        }
    }
}

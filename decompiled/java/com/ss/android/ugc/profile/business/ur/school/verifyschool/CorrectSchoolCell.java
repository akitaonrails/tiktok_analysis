package com.ss.android.ugc.profile.business.ur.school.verifyschool;

import X.AnonymousClass0956;
import X.AnonymousClass1278;
import X.C01GW;
import X.C1229200i5m;
import X.C127K;
import X.C1308910kAL;
import X.C13LE;
import X.C1844360y5y;
import X.C1864630ycf;
import X.C1864830ycz;
import X.C2217381BqS;
import X.C23250099c;
import X.C331430Cyz;
import X.C419910GdJ;
import X.C440190HNx;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CorrectSchoolCell extends PowerCell<C331430Cyz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public C127K LLILLJJLI;
    public AnonymousClass1278 LLILLL;
    public AnonymousClass0956 LLILZ;
    public final C1864830ycz LL = new C1864830ycz(this, 1);
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(216));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(217));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CorrectSchoolCell.class, "control", "getControl()Lcom/ss/android/ugc/profile/business/ur/school/verifyschool/CorrectSchoolControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C331430Cyz c331430Cyz = (C331430Cyz) interfaceC1891350zJl;
        C127K c127k = this.LLILLJJLI;
        if (c127k != null) {
            c127k.setTitle(c331430Cyz.LL);
        }
        AnonymousClass1278 anonymousClass1278 = this.LLILLL;
        if (anonymousClass1278 != null) {
            anonymousClass1278.LJIILLIIL(new C1864630ycf(this, c331430Cyz, 5));
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1844360y5y(this, c331430Cyz, null), 3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LLILLL = new AnonymousClass1278(viewGroup.getContext());
        C127K c127k = new C127K(viewGroup.getContext(), null, 6);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_person_phd_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c127k.setIcon(c419910GdJ);
        c127k.setAccessory(this.LLILLL);
        C786410Ut5.Y6(c127k, C1229200i5m.LIZIZ(-1, -2, 0, ((Number) this.LLILZLL.getValue()).intValue(), 0, ((Number) this.LLILZLL.getValue()).intValue(), 0, 84));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, viewGroup.getContext());
        if (numLIZJ != null) {
            c127k.setBackground(new C440190HNx(((Number) this.LLILZIL.getValue()).floatValue(), numLIZJ.intValue()));
        }
        c127k.LJ(true, true);
        c127k.setGravity(16);
        this.LLILLJJLI = c127k;
        return c127k;
    }
}

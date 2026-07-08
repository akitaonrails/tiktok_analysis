package com.ss.android.ugc.aweme.account.org.permissions;

import X.AnonymousClass0951;
import X.C09IC;
import X.C1238330iKV;
import X.C1238350iKX;
import X.C1238380iKa;
import X.C1238390iKb;
import X.C1243440iSk;
import X.C1BNE;
import X.C20684815ws;
import X.C2252321DDq;
import X.C2344009Gk;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class InvitePageViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final AnonymousClass0951 LLILZ;
    public final C2252321DDq LLILZIL;
    public final AnonymousClass0951 LLILZLL;
    public final C2252321DDq LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;
    public String LLJ;
    public String LLJI;

    public final String wQ2() {
        return Intrinsics.LJFF(this.LLILLL.getValue(), C1238380iKa.LIZ) ? "email" : "phone";
    }

    public final boolean xQ2() {
        String str = this.LLJI;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = this.LLJ;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    public final void yQ2() {
        if (this.LL.getValue() instanceof C1238330iKV) {
            C1243440iSk c1243440iSk = C1243440iSk.LIZ;
            String strWQ2 = wQ2();
            c1243440iSk.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("invite_type", strWQ2);
            c2344009Gk.LJIIIIZZ("btn_click", "change_invite_type");
            C20684815ws.LJIILLIIL("org_permission_invite_click", c2344009Gk.LIZ);
            this.LLJ = null;
            this.LLJI = null;
            C2252321DDq c2252321DDq = this.LLILLL;
            c2252321DDq.setValue(c2252321DDq.getValue() instanceof C1238390iKb ? C1238380iKa.LIZ : C1238390iKb.LIZ);
            this.LL.setValue(new C1238330iKV(false));
        }
    }

    public InvitePageViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1238330iKV(false));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(C1238390iKb.LIZ);
        this.LLILLL = c2252321DDqLIZ2;
        this.LLILZ = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(null);
        this.LLILZIL = c2252321DDqLIZ3;
        this.LLILZLL = C09IC.LIZIZ(c2252321DDqLIZ3);
        C2252321DDq c2252321DDqLIZ4 = C1BNE.LIZ(Boolean.FALSE);
        this.LLIZ = c2252321DDqLIZ4;
        this.LLIZLLLIL = C09IC.LIZIZ(c2252321DDqLIZ4);
    }

    public final void vQ2(int i) {
        String str;
        if (i == 1) {
            str = "admin";
        } else {
            str = "operator";
        }
        C1243440iSk c1243440iSk = C1243440iSk.LIZ;
        String strWQ2 = wQ2();
        c1243440iSk.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("invite_type", strWQ2);
        c2344009Gk.LJIIIIZZ("btn_click", "invite");
        c2344009Gk.LJIIIIZZ("role_select", str);
        C20684815ws.LJIILLIIL("org_permission_invite_role_popup", c2344009Gk.LIZ);
        this.LL.setValue(new C1238350iKX(Integer.valueOf(i)));
    }
}

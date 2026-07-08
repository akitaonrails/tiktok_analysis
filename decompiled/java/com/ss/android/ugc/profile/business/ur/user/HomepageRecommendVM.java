package com.ss.android.ugc.profile.business.ur.user;

import X.AbstractC1261460ivo;
import X.AbstractC1623806Xk;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1075800e6M;
import X.C1250700ieS;
import X.C1250770ieZ;
import X.C1251330ifT;
import X.C1252710ihh;
import X.C1261340ivc;
import X.C1261480ivq;
import X.C13LE;
import X.C1494450ozb;
import X.C1623606Xi;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C491001vg;
import X.C626160OhC;
import X.EnumC1164360gPC;
import X.EnumC1250710ieT;
import X.EnumC1250760ieY;
import X.InterfaceC0148002o;
import X.InterfaceC1073860e3E;
import X.InterfaceC1252070igf;
import X.InterfaceC1261750iwH;
import X.InterfaceC1891350zJl;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS106S0110000_19;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HomepageRecommendVM extends AssemViewModel<C1250700ieS> implements InterfaceC1261750iwH {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2448));
    public boolean LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1250700ieS(0);
    }

    public final User wQ2() {
        User user;
        C1251330ifT c1251330ifT = (C1251330ifT) C1252710ihh.LJIIIZ(this, C13LE.LIZ(InterfaceC1252070igf.class));
        return (c1251330ifT == null || (user = c1251330ifT.LIZ) == null) ? ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser() : user;
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        if ((abstractC1261460ivo instanceof C1261340ivc) || (abstractC1261460ivo instanceof C1261480ivq)) {
            this.LLILLJJLI = true;
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        boolean z;
        List<InterfaceC1891350zJl> listLIZ;
        EnumC1164360gPC enumC1164360gPC;
        if (getState().LLILZ == EnumC1250710ieT.CLICK) {
            z = true;
        } else {
            z = false;
        }
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
        if (abstractC1623806Xk instanceof C491001vg) {
            Throwable th = null;
            C491001vg c491001vg = (C491001vg) abstractC1623806Xk;
            if (c491001vg != null) {
                th = c491001vg.LIZ;
            }
            if (th instanceof C1494450ozb) {
                enumC1164360gPC = EnumC1164360gPC.NO_NET;
                C1250770ieZ.LIZLLL(C1250770ieZ.LIZ, false, "no_net");
            } else {
                enumC1164360gPC = EnumC1164360gPC.API_ERROR;
                C1250770ieZ.LIZLLL(C1250770ieZ.LIZ, false, "api_error");
            }
            setState(new AwS106S0110000_19(z, enumC1164360gPC, 4));
            return;
        }
        if (!(abstractC1623806Xk instanceof C1623606Xi) || (listLIZ = c1075800e6M.LIZJ.LIZ()) == null) {
            return;
        }
        int size = listLIZ.size();
        if (getState().LL == EnumC1250760ieY.LOADING) {
            if (size <= 0) {
                C1250770ieZ.LIZLLL(C1250770ieZ.LIZ, false, "empty");
                setState(new AwS33S0010000_19(z, 15));
                return;
            } else {
                C1250770ieZ.LIZLLL(C1250770ieZ.LIZ, true, "begin_expand");
                setState(AFwS257S0000000_19.get$arr$(610));
                this.LLILLL = true;
                return;
            }
        }
        if (size > 0) {
            return;
        }
        setState(AFwS257S0000000_19.get$arr$(611));
        this.LLILLL = false;
    }

    public final void vQ2(EnumC1250710ieT enumC1250710ieT) {
        InterfaceC1073860e3E interfaceC1073860e3E;
        if (enumC1250710ieT != EnumC1250710ieT.UNINITIALIZED && (interfaceC1073860e3E = (InterfaceC1073860e3E) this.LL.getValue()) != null) {
            interfaceC1073860e3E.av(null);
        }
        C1250770ieZ c1250770ieZ = C1250770ieZ.LIZ;
        String lowerCase = enumC1250710ieT.name().toLowerCase(Locale.ROOT);
        c1250770ieZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("reason", lowerCase);
        C20684815ws.LJIILLIIL("homepage_rec_card_do_expand", c2344009Gk.LIZ);
        if (!this.LLILLL) {
            setState(new AwS598S0100000_19(enumC1250710ieT, 446));
        } else {
            setState(new AwS598S0100000_19(enumC1250710ieT, 447));
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
        this.LLILLJJLI = true;
    }
}

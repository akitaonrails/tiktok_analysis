package com.ss.android.ugc.profile.business.ur;

import X.AbstractC1261460ivo;
import X.AbstractC1623806Xk;
import X.C1075800e6M;
import X.C1250500ie8;
import X.C1250520ieA;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1720106oR;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C491001vg;
import X.C626160OhC;
import X.InterfaceC0148002o;
import X.InterfaceC1073860e3E;
import X.InterfaceC1261750iwH;
import X.InterfaceC1891350zJl;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS103S0201000_19;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS30S0102000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileUserCardVM extends AssemViewModel<C1250500ie8> implements InterfaceC1261750iwH {
    public static final /* synthetic */ int LLILZIL = 0;
    public InterfaceC1073860e3E LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
    }

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1250500ie8(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
    }

    public static boolean vQ2(User user) {
        GeneralPermission generalPermission;
        if (user == null) {
            return false;
        }
        GeneralPermission generalPermission2 = user.getGeneralPermission();
        if ((generalPermission2 == null || generalPermission2.getFollowToastType() != 1) && (((generalPermission = user.getGeneralPermission()) == null || generalPermission.getFollowToastType() != 2) && !user.isBlocked() && !user.isUserCancelled() && !user.isGeoBlocked())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        int size;
        AbstractC1623806Xk<Integer> abstractC1623806Xk = getState().LLILZIL;
        int i = getState().LLILLJJLI;
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2 = c1075800e6M.LIZ;
        if (abstractC1623806Xk2 instanceof C491001vg) {
            List<InterfaceC1891350zJl> listLIZ = c1075800e6M.LIZJ.LIZ();
            if (listLIZ != null && (size = listLIZ.size()) > 0) {
                setState(new AwS30S0102000_19(size, i, this, 1));
                setState(AFwS257S0000000_19.get$arr$(357));
            } else {
                setState(new AwS127S0101000_19(this, i, 20));
            }
        } else if (abstractC1623806Xk2 instanceof C1623706Xj) {
            setState(new AwS33S0001000_19(i, 12));
        } else if (abstractC1623806Xk2 instanceof C1623606Xi) {
            AbstractC1623806Xk<List<InterfaceC1891350zJl>> abstractC1623806Xk3 = c1075800e6M.LIZJ;
            if (abstractC1623806Xk3 instanceof C1623606Xi) {
                int size2 = ((List) ((C1623606Xi) abstractC1623806Xk3).LIZ).size();
                if (size2 <= 0) {
                    setState(new AwS30S0102000_19(0, i, this, 1));
                } else if (abstractC1623806Xk instanceof C1623706Xj) {
                    setState(new AwS30S0102000_19(size2, i, this, 1));
                }
            }
        }
        if (c1075800e6M.LJ()) {
            this.LLILLL = false;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user card state ");
        sbLIZ.append(abstractC1623806Xk);
        sbLIZ.append(" to ");
        sbLIZ.append(c1075800e6M);
        C1720106oR.LJI("UserCard_Assem", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void wQ2(String str) {
        int i;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on publish empty! isBlocked: ");
        sbLIZ.append(this.LLILLJJLI);
        C1720106oR.LJI("UserCard_Assem", C2188811AlT.LIZIZ(sbLIZ));
        C1250500ie8 state = getState();
        if (!vQ2(state.LLIZLLLIL) && !state.LLJI && !this.LLILLJJLI) {
            C1250520ieA.LIZ.getClass();
            if (!C1250520ieA.LIZ()) {
                setStateImmediate(AFwS257S0000000_19.get$arr$(358));
                InterfaceC1073860e3E interfaceC1073860e3E = this.LL;
                if (interfaceC1073860e3E != null) {
                    interfaceC1073860e3E.av(null);
                }
                C1720106oR.LJI("UserCard_Assem", "AutoExpand - onPublishEmpty, WantToExpand");
                if (Intrinsics.LJFF(str, "auto_no_post_item")) {
                    i = 2;
                } else {
                    i = 4;
                }
                zQ2(i, true);
            }
        }
    }

    public final void zQ2(int i, boolean z) {
        C1250500ie8 state = getState();
        AbstractC1623806Xk<Integer> abstractC1623806Xk = state.LLILZIL;
        int i2 = state.LLILLL;
        if (z) {
            if ((i == 2 || i == 5) && state.LLIZLLLIL == null) {
                this.LLILZ = true;
            }
            withState(new AwS103S0201000_19(this, (UserProfileUserCardVM) abstractC1623806Xk, (AbstractC1623806Xk<Integer>) i, 6));
            return;
        }
        if (i2 == 2) {
            return;
        }
        setState(AFwS257S0000000_19.get$arr$(704));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(com.ss.android.ugc.aweme.profile.model.User r20, boolean r21, X.InterfaceC665370Q7z r22) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM.yQ2(com.ss.android.ugc.aweme.profile.model.User, boolean, X.0Q7z):void");
    }

    public static void xQ2(int i, String str, boolean z, boolean z2, boolean z3) {
        String curUserId;
        int i2;
        AccountUserService accountUserServiceLJIIJ;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoExpand - bioNotEmpty ");
        sbLIZ.append(z);
        sbLIZ.append(", advancedFeatureNotEmpty ");
        sbLIZ.append(z2);
        sbLIZ.append(", tabNotEmpty ");
        sbLIZ.append(z3);
        C1720106oR.LJI("UserCard_Assem", C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        } else {
            curUserId = null;
        }
        c2344009Gk.LJIIIIZZ("object_user_id", curUserId);
        c2344009Gk.LJIIIIZZ("author_id", str);
        int i4 = 1;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "has_bio");
        if (!z2) {
            i4 = 0;
        }
        c2344009Gk.LIZJ(i4, "contain_advanced_feature");
        c2344009Gk.LIZJ(i, "contain_tab");
        C20684815ws.LJIILLIIL("profile_recommend_auto_expand_disable_reason", c2344009Gk.LIZ);
    }
}

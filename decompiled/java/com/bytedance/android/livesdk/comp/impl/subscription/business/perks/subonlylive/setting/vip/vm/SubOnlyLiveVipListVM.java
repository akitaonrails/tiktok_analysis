package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm;

import X.C09YA;
import X.C0IJT;
import X.C0JBB;
import X.C0JYR;
import X.C0JYZ;
import X.C0KPJ;
import X.C1559260qg8;
import X.C2188811AlT;
import X.C474500IjA;
import X.C491690JPz;
import X.C493780JYa;
import X.C493820JYe;
import X.C493830JYf;
import X.C493840JYg;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;
import webcast.api.sub.VIPSubOnlyLiveSettingInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyLiveVipListVM extends AssemViewModel<C0JBB> {
    public int LLILZ;
    public int LLILZIL;
    public C493830JYf LLIZ;
    public boolean LLIZLLLIL;
    public final C09YA LL = new C09YA(this, new C493840JYg());
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C491690JPz.class, (Class<Object>) null, (String) 13), true);
    public List<C493820JYe> LLILLL = new ArrayList();
    public List<C493820JYe> LLILZLL = new ArrayList();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JBB(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C493830JYf c493830JYf = this.LLIZ;
        if (c493830JYf != null) {
            C0KPJ.df.LIZJ(C0JYR.LIZIZ(c493830JYf));
        }
        super.onCleared();
    }

    public final void wQ2(String str) {
        if (this.LLIZLLLIL) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_visibility_threshold_type_switch_click");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(((C491690JPz) this.LLILLJJLI.getValue()).LLILLJJLI, "show_entrance");
            c474500IjALIZ.LJJII(str, "selected_threshold_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final void xQ2(int i) {
        if (i != 0) {
            if (i == 1 && (!this.LLILLL.isEmpty())) {
                wQ2("months");
                setState(new C0JYZ(this));
            }
        } else if (!this.LLILZLL.isEmpty()) {
            wQ2("plans");
            setState(new C493780JYa(this));
        }
        this.LLIZLLLIL = true;
    }

    public static boolean vQ2(int i, VIPSubOnlyLiveSettingInfo.Category category, C493830JYf c493830JYf) {
        boolean z;
        boolean z2;
        if (c493830JYf == null) {
            return false;
        }
        if (c493830JYf.LJ == 0 && c493830JYf.LJFF == 0) {
            if (category.lowerBound != 0) {
                return false;
            }
            return true;
        }
        if (i == 1) {
            if (c493830JYf.LIZIZ != 1) {
                return false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAccessoryCheckStatus-- ");
            if (c493830JYf.LJ == category.lowerBound) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            Logger.i("vip_lyp", C2188811AlT.LIZIZ(sbLIZ));
            if (c493830JYf.LJ != category.lowerBound) {
                return false;
            }
            return true;
        }
        if (i != 0 || c493830JYf.LIZIZ != 0) {
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getAccessoryCheckStatus-- ");
        if (c493830JYf.LJFF == category.lowerBound) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ2.append(z);
        Logger.i("vip_lyp", C2188811AlT.LIZIZ(sbLIZ2));
        if (c493830JYf.LJFF != category.lowerBound) {
            return false;
        }
        return true;
    }
}

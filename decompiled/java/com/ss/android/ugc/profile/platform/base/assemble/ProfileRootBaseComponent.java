package com.ss.android.ugc.profile.platform.base.assemble;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C0H1U;
import X.C1248210iaR;
import X.C1249090ibr;
import X.C1250680ieQ;
import X.C1251390ifZ;
import X.C1260280itu;
import X.C13LZ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1720106oR;
import X.C19252910Tv;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C299970BpL;
import X.C418440Gaw;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C814420VxA;
import X.EnumC1253850ijX;
import X.EnumC588120N4w;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileRootBaseComponent extends BaseContainerComponent implements IProfileBaseAbility {
    public ProfileUser LLJJIJI;
    public boolean LLJJIJIL;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, C1249090ibr.class, "root_data"), checkSupervisorPrepared());
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2452));

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final List<ProfilePlatformProtocol<BizBaseData>> AH2() {
        return (List) this.LLJJJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void No() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent.No():void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final ProfileComponents ZE() {
        ProfileUser profileUser = this.LLJJIJI;
        if (profileUser != null) {
            return profileUser.headerComponents;
        }
        return null;
    }

    public final C1249090ibr<ProfileUser> bp() {
        return (C1249090ibr) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final List<ContentCellProtocol> lx2() {
        List list = (List) this.LLJJJ.getValue();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ContentCellProtocol) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final String sa0() {
        LogPbBean logPbBean;
        ProfileUser profileUser = this.LLJJIJI;
        if (profileUser == null || (logPbBean = profileUser.logPb) == null) {
            return null;
        }
        return logPbBean.getImprId();
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final ProfileCommonInfo wG2() {
        ProfileUser profileUser = this.LLJJIJI;
        if (profileUser != null) {
            return profileUser.common;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final ProfileComponents yN0() {
        ProfileUser profileUser = this.LLJJIJI;
        if (profileUser != null) {
            return profileUser.tabsComponents;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final View cP() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String mode;
        ProfileUser profileUser;
        ProfileCommonInfo profileCommonInfo;
        ProfilePlatformViewModel profilePlatformViewModelSo = So();
        if (profilePlatformViewModelSo != null) {
            C1249090ibr<ProfileUser> c1249090ibrBp = bp();
            if (c1249090ibrBp == null || (profileUser = c1249090ibrBp.LL) == null || (profileCommonInfo = profileUser.common) == null || (mode = profileCommonInfo.getMode()) == null) {
                mode = "normal_mode";
            }
            profilePlatformViewModelSo.LL = mode;
        }
        super.onCreate();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IProfileBaseAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final void OJ1(ProfileCommonInfo profileCommonInfo) {
        ProfileUser profileUser = this.LLJJIJI;
        if (profileUser != null) {
            profileUser.common = profileCommonInfo;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ProfileComponents ap(String str) {
        ProfileUser profileUser;
        ProfileUser profileUser2;
        ProfileUser profileUser3;
        ProfileUser profileUser4;
        switch (str.hashCode()) {
            case -1221270899:
                if (!str.equals("header") || (profileUser4 = this.LLJJIJI) == null) {
                    return null;
                }
                return profileUser4.headerComponents;
            case -990990972:
                if (!str.equals("profile_background")) {
                    return null;
                }
                C1251390ifZ c1251390ifZ = C1251390ifZ.LIZ;
                boolean z = this.LLJILLL;
                c1251390ifZ.getClass();
                if (!C1251390ifZ.LIZIZ(z) || (profileUser3 = this.LLJJIJI) == null) {
                    return null;
                }
                return profileUser3.profileBackground;
            case 178027519:
                if (!str.equals("profile_tab") || (profileUser2 = this.LLJJIJI) == null) {
                    return null;
                }
                return profileUser2.tabsComponents;
            case 1730087671:
                if (!str.equals("nav_bar") || (profileUser = this.LLJJIJI) == null) {
                    return null;
                }
                return profileUser.navBarComponents;
            default:
                return null;
        }
    }

    public final void cp(ProfileUser profileUser) {
        ProfileComponents profileComponents;
        boolean z;
        boolean z2;
        IProfileBackgroundAbility iProfileBackgroundAbility;
        boolean zLJI = MethodIDManager.LJI(137360);
        ProfileUser profileUser2 = this.LLJJIJI;
        this.LLJJIJI = profileUser;
        C1251390ifZ c1251390ifZ = C1251390ifZ.LIZ;
        boolean z3 = this.LLJILLL;
        c1251390ifZ.getClass();
        if (C1251390ifZ.LIZIZ(z3)) {
            if (profileUser2 != null) {
                profileComponents = profileUser2.profileBackground;
            } else {
                profileComponents = null;
            }
            if (profileComponents != null) {
                z = true;
            } else {
                z = false;
            }
            if (profileUser != null && profileUser.profileBackground != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && !z2) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("BaseContainerComponent", "unloadInvalidRootComponents has no background");
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null && (iProfileBackgroundAbility = (IProfileBackgroundAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IProfileBackgroundAbility.class, null)) != null && iProfileBackgroundAbility.VR1()) {
                    iProfileBackgroundAbility.f2();
                }
            }
        }
        if (!C299970BpL.LIZ()) {
            C1250680ieQ.LIZ.getClass();
            if (C13LZ.LJIIJ(AbstractC19994813Le.Default, C13LZ.LJIILJJIL(0, 10)) <= 0) {
                ((LinkedHashMap) C1250680ieQ.LJI).clear();
            }
        }
        No();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        ProfileUser profileUser = null;
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IProfileBaseAbility.class, null, null);
        }
        C1249090ibr<ProfileUser> c1249090ibrBp = bp();
        if (c1249090ibrBp != null) {
            profileUser = c1249090ibrBp.LL;
        }
        this.LLJJIJI = profileUser;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility
    public final void zl2(String str, boolean z, boolean z2) {
        int iLIZIZ;
        int i;
        View viewFindViewById = LJJIJL().findViewById(R.id.s11);
        if (viewFindViewById == null) {
            return;
        }
        if (Intrinsics.LJFF(str, EnumC588120N4w.AVATAR_WIDGET.getScene()) && z) {
            if (z2) {
                i = 8;
            } else {
                i = 14;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        }
        if (viewFindViewById.getPaddingTop() != iLIZIZ && !C19252910Tv.LIZIZ.LIZLLL().LJI().LJJLL()) {
            C0H1U.LJIIJ(iLIZIZ, viewFindViewById);
            ((C1260280itu) LJJIJL().findViewById(R.id.u30)).setHeaderPaddingTop(iLIZIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyUpdateLayout isUpdateLayout=");
            sbLIZ.append(z);
            sbLIZ.append(", needShrink=");
            sbLIZ.append(z2);
            sbLIZ.append(", paddingTop=");
            sbLIZ.append(iLIZIZ);
            C1248210iaR.LJ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        }
    }
}

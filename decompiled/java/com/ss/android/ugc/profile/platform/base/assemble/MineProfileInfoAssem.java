package com.ss.android.ugc.profile.platform.base.assemble;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01GW;
import X.C0XQ7;
import X.C1248210iaR;
import X.C1249090ibr;
import X.C1250680ieQ;
import X.C1251320ifS;
import X.C1251330ifT;
import X.C1251540ifo;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1251790igD;
import X.EnumC1253850ijX;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724720Sbm;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MineProfileInfoAssem extends ProfileInfoAssem {
    public static final C1251320ifS LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final AssemVMLazy LLJILJILJ;
    public final C1559260qg8 LLJILLL;
    public final C01GW LLJJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ifS] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MineProfileInfoAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = new Object() { // from class: X.0ifS
        };
        LLJJIJI = 8;
    }

    public MineProfileInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2451), AFwS257S0000000_19.get$arr$(479), null, true);
        this.LLJILLL = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, null), checkSupervisorPrepared());
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2450));
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem, X.InterfaceC1252070igf, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem
    public String getEnterFrom() {
        return "personal_homepage";
    }

    @Override // X.InterfaceC1252070igf
    public void oA(int i, EnumC1251790igD enumC1251790igD) {
    }

    @Override // X.InterfaceC1252070igf
    public void qo(User user, EnumC1251790igD enumC1251790igD, boolean z) {
    }

    private final MyProfileAbility ap() {
        return (MyProfileAbility) this.LLJJ.getValue();
    }

    private final C1249090ibr<ProfileComponents> bp() {
        return (C1249090ibr) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC1252070igf
    public void Bm() {
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(477);
        Class<MineProfileInfoAssem> superclass = MineProfileInfoAssem.class;
        Class<?>[] interfaces = superclass.getInterfaces();
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : interfaces) {
            if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        while (arrayList.isEmpty()) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return;
            }
            Class<?>[] interfaces2 = superclass.getInterfaces();
            arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces2) {
                if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
        }
        getSupervisor().LJFF().LJI((Class) C13LP.LJJJJZI(arrayList), aFwS257S0000000_19);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem
    public void Oo() {
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(478);
        Class<MineProfileInfoAssem> superclass = MineProfileInfoAssem.class;
        Class<?>[] interfaces = superclass.getInterfaces();
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : interfaces) {
            if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        while (arrayList.isEmpty()) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return;
            }
            Class<?>[] interfaces2 = superclass.getInterfaces();
            arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces2) {
                if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
        }
        getSupervisor().LJFF().LJI((Class) C13LP.LJJJJZI(arrayList), aFwS257S0000000_19);
    }

    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Zo, reason: merged with bridge method [inline-methods] */
    public C1251330ifT lt() {
        return new C1251330ifT(0);
    }

    public final ProfilePlatformViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (ProfilePlatformViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem
    public void No() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.isDetached()) {
            C1250680ieQ.LIZ.getClass();
            C1250680ieQ.LJFF("MineProfileInfoAssem.sendRefreshEvent");
        } else {
            ProfilePlatformViewModel profilePlatformViewModelCp = cp();
            profilePlatformViewModelCp.getClass();
            profilePlatformViewModelCp.SQ2(AFwS257S0000000_19.get$arr$(0), false);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        C1249090ibr<ProfileComponents> c1249090ibrBp = bp();
        if (c1249090ibrBp == null || !Intrinsics.LJFF(c1249090ibrBp.LLILZIL, Boolean.TRUE)) {
            je(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), EnumC1251790igD.NORMAL, false);
        }
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0iek
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLILZLL;
            }
        }, null, new AwS633S0100000_19(this, 149), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0ifQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJ;
            }
        }, null, new AwS633S0100000_19(this, 150), 6);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem
    public void Go(int i, EnumC1251790igD enumC1251790igD, String str) {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        boolean z = true;
        if (fragmentLJI != null && fragmentLJI.isDetached()) {
            C1250680ieQ.LIZ.getClass();
            C1250680ieQ.LJFF("MineProfileInfoAssem.fetchProfilePlatformInfo");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchProfilePlatformInfo start from=");
        sbLIZ.append(i);
        sbLIZ.append(", action=");
        sbLIZ.append(enumC1251790igD);
        sbLIZ.append(", methodFrom=");
        sbLIZ.append(str);
        C1248210iaR.LJ("MineProfileInfoAssem", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.REQUEST, "RequestStart");
        MyProfileAbility myProfileAbilityAp = ap();
        if (myProfileAbilityAp == null || !myProfileAbilityAp.Om()) {
            z = false;
        }
        ProfilePlatformViewModel.OQ2(cp(), C1251540ifo.LIZ(z), i, enumC1251790igD, str, false, 16);
    }

    @Override // X.InterfaceC1252070igf
    public void je(User user, EnumC1251790igD enumC1251790igD, boolean z) {
        if (user == null) {
            return;
        }
        AwS385S0200000_19 awS385S0200000_19 = new AwS385S0200000_19(user, enumC1251790igD, 66);
        Class<MineProfileInfoAssem> superclass = MineProfileInfoAssem.class;
        Class<?>[] interfaces = superclass.getInterfaces();
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : interfaces) {
            if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        while (arrayList.isEmpty()) {
            superclass = superclass.getSuperclass();
            if (superclass != null) {
                Class<?>[] interfaces2 = superclass.getInterfaces();
                arrayList = new ArrayList();
                for (Class<?> cls2 : interfaces2) {
                    if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                        arrayList.add(cls2);
                    }
                }
            } else {
                return;
            }
        }
        getSupervisor().LJFF().LJI((Class) C13LP.LJJJJZI(arrayList), awS385S0200000_19);
    }
}

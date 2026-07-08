package com.ss.android.ugc.profile.platform.base.assemble.other;

import X.C019F;
import X.C1248210iaR;
import X.C1250680ieQ;
import X.C1251330ifT;
import X.C1251720ig6;
import X.C1260030itV;
import X.C127G;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1251790igD;
import X.EnumC1253850ijX;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724720Sbm;
import Y.AObjectS393S0100000_19;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS71S0210000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileInfoAssem extends ProfileInfoAssem {
    public static final C1251720ig6 LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final AssemVMLazy LLJILJILJ;
    public String LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public ViewModelProvider.Factory LLJJIII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ig6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UserProfileInfoAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = new Object() { // from class: X.0ig6
        };
        LLJJIJIL = 8;
    }

    public UserProfileInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2453), AFwS257S0000000_19.get$arr$(482), null, true);
        this.LLJJI = true;
    }

    private Function0 kp() {
        return new AObjectS393S0100000_19(this, 1);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem, X.InterfaceC1252070igf, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem
    public String getEnterFrom() {
        return "others_homepage";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        if (C1260030itV.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, bp(), new C2217381BqS() { // from class: X.0ig4
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJLIL;
                }
            }, null, new AwS633S0100000_19(this, 151), 6);
        } else {
            C736680Sv4.LJIIIIZZ(this, bp(), new C2217381BqS() { // from class: X.0ig5
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1251350ifV) obj).LLJLIL;
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 152), 4);
        }
        C736680Sv4.LJIIIIZZ(this, bp(), new C2217381BqS() { // from class: X.0ifR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1251350ifV) obj).LLJJ;
            }
        }, null, new AwS633S0100000_19(this, 153), 6);
    }

    private final ProfilePlatformViewModel bp() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (ProfilePlatformViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1252070igf
    public void Bm() {
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(480);
        Class<UserProfileInfoAssem> superclass = UserProfileInfoAssem.class;
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
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(481);
        Class<UserProfileInfoAssem> superclass = UserProfileInfoAssem.class;
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
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public C1251330ifT lt() {
        return new C1251330ifT(0);
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem
    public void No() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && fragmentLJI.isDetached()) {
            C1250680ieQ.LIZ.getClass();
            C1250680ieQ.LJFF("UserProfileInfoAssem.sendRefreshEvent");
        } else {
            ProfilePlatformViewModel profilePlatformViewModelBp = bp();
            profilePlatformViewModelBp.getClass();
            profilePlatformViewModelBp.SQ2(AFwS257S0000000_19.get$arr$(0), false);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        ViewModelProvider.Factory factory = this.LLJJIII;
        if (factory == null) {
            synchronized (this) {
                factory = this.LLJJIII;
                if (factory == null) {
                    C127G c127g = new C127G(new Object[]{ProfilePlatformViewModel.class, kp()}, defaultViewModelProviderFactory);
                    this.LLJJIII = c127g;
                    return c127g;
                }
            }
        }
        return factory;
    }

    public static ProfilePlatformViewModel dp(UserProfileInfoAssem userProfileInfoAssem) {
        return new ProfilePlatformViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0igD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cp(X.C291001Au<? extends kotlin.Pair<com.ss.android.ugc.profile.platform.base.data.ProfileUser, ? extends com.ss.android.ugc.aweme.profile.model.User>> r15) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.assemble.other.UserProfileInfoAssem.cp(X.01Au):void");
    }

    public final void ep(User user) {
        if (user == null) {
            return;
        }
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(user, 453);
        Class<UserProfileInfoAssem> superclass = UserProfileInfoAssem.class;
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
        getSupervisor().LJFF().LJI((Class) C13LP.LJJJJZI(arrayList), awS598S0100000_19);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // X.InterfaceC1252070igf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oA(int r6, X.EnumC1251790igD r7) {
        /*
            r5 = this;
            r0 = 201941(0x314d5, float:2.8298E-40)
            boolean r4 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r5)
            if (r0 == 0) goto L2f
            boolean r1 = r0.isDetached()
            r0 = 1
            if (r1 != r0) goto L2f
        L14:
            java.lang.String r3 = "UserProfileInfoAssem"
            if (r0 == 0) goto L31
            X.0ieQ r0 = X.C1250680ieQ.LIZ
            r0.getClass()
            java.lang.String r0 = "UserProfileInfoAssem.fetchProfileInfo"
            X.C1250680ieQ.LJFF(r0)
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "fetchProfileInfo fragment isDetached"
            X.C1720106oR.LIZ(r3, r0)
            if (r4 == 0) goto L2e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L2e:
            return
        L2f:
            r0 = 0
            goto L14
        L31:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchProfileInfo start from="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", action="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            X.0ijX r1 = X.EnumC1253850ijX.REQUEST
            java.lang.String r0 = "RequestStart"
            X.C1248210iaR.LJ(r3, r2, r1, r0)
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r2 = r5.bp()
            r1 = 0
            r0 = 9
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel.PQ2(r2, r6, r7, r1, r0)
            if (r4 == 0) goto L5f
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.assemble.other.UserProfileInfoAssem.oA(int, X.0igD):void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem
    public void Go(int i, EnumC1251790igD enumC1251790igD, String str) {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
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
        C1248210iaR.LJ("UserProfileInfoAssem", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.REQUEST, "RequestStart");
        ProfilePlatformViewModel.PQ2(bp(), i, enumC1251790igD, str, 1);
    }

    public final void hp(User user, EnumC1251790igD enumC1251790igD, boolean z) {
        if (user == null) {
            return;
        }
        AwS71S0210000_19 awS71S0210000_19 = new AwS71S0210000_19(user, enumC1251790igD, z, 3);
        Class<UserProfileInfoAssem> superclass = UserProfileInfoAssem.class;
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
        getSupervisor().LJFF().LJI((Class) C13LP.LJJJJZI(arrayList), awS71S0210000_19);
    }

    @Override // X.InterfaceC1252070igf
    public void je(User user, EnumC1251790igD enumC1251790igD, boolean z) {
        if (user == null) {
            return;
        }
        AwS71S0210000_19 awS71S0210000_19 = new AwS71S0210000_19(user, enumC1251790igD, z, 2);
        Class<UserProfileInfoAssem> superclass = UserProfileInfoAssem.class;
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
        getSupervisor().LJFF().LJI((Class) C13LP.LJJJJZI(arrayList), awS71S0210000_19);
    }

    @Override // X.InterfaceC1252070igf
    public void qo(User user, EnumC1251790igD enumC1251790igD, boolean z) {
        AwS385S0200000_19 awS385S0200000_19 = new AwS385S0200000_19(user, enumC1251790igD, 68);
        Class<UserProfileInfoAssem> superclass = UserProfileInfoAssem.class;
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

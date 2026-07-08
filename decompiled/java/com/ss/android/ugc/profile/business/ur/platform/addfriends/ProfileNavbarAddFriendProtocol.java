package com.ss.android.ugc.profile.business.ur.platform.addfriends;

import X.C01GW;
import X.C0XQ7;
import X.C1250210idf;
import X.C1250890iel;
import X.C1266340j3g;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1DGC;
import X.C2217381BqS;
import X.C283560B9m;
import X.C283570B9n;
import X.C452501pT;
import X.EnumC1253890ijb;
import X.EnumC1584360rKc;
import X.InterfaceC586170Myt;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.business.ur.entrances.ProfileMafRedPointsVM;
import com.ss.android.ugc.profile.business.ur.platform.AddFriendsData;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import u4.q0;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarAddFriendProtocol extends NavbarPlatformProtocol<BizBaseData> implements INavBarAddFriendsAbility, GenericLifecycleObserver {
    public static final EnumC1584360rKc LLLFZ = EnumC1584360rKc.PROFILE;
    public static final EnumC1253890ijb LLLI = EnumC1253890ijb.NUMBER;
    public final ProfileNavbarAddFriendProtocol LLJLL;
    public final String LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public final String LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public AddFriendsData LLLFF;
    public final C01GW LLLFFI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragment, null), this, INavBarAddFriendsAbility.class, null, null);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLL.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(AFwS257S0000000_19.get$arr$(764));
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LLL.getValue();
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 390);
        assemViewModel2.getClass();
        AssemViewModel.subscribe$default(assemViewModel2, null, null, null, new AwS598S0100000_19(awS598S0100000_19, 824), 7, null);
        if (((Boolean) C283560B9m.LIZIZ.getValue()).booleanValue()) {
            C0XQ7.LJ();
            C0XQ7.LIZ.LJIILL((InterfaceC586170Myt) this.LLLFFI.getValue());
            AssemViewModel assemViewModel3 = (AssemViewModel) this.LLLF.getValue();
            AwS598S0100000_19 awS598S0100000_192 = new AwS598S0100000_19(this, 391);
            assemViewModel3.getClass();
            AssemViewModel.selectSubscribe$default(assemViewModel3, new C2217381BqS() { // from class: X.0gMC
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1155440gAo) obj).LL);
                }
            }, null, null, null, new AwS598S0100000_19(awS598S0100000_192, 826), 14, null);
        }
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.JQ2(new AwS598S0100000_19(this, 392));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        View view = this.LLILZLL;
        if (view == null) {
            return false;
        }
        q0.LJIJ(view, new C1266340j3g(this, 6));
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragment, null), INavBarAddFriendsAbility.class, null);
        }
        if (((Boolean) C283560B9m.LIZIZ.getValue()).booleanValue() && ((Boolean) C283570B9n.LIZIZ.getValue()).booleanValue()) {
            C0XQ7.LJ();
            C0XQ7.LIZ.LJI((InterfaceC586170Myt) this.LLLFFI.getValue());
        }
    }

    public ProfileNavbarAddFriendProtocol() {
        this.LLJLL = ((Boolean) C283570B9n.LIZIZ.getValue()).booleanValue() ? this : null;
        this.LLJLLIL = "nav_bar_start_find_friends";
        this.LLJZIJLIL = C1250890iel.LIZ(LLLFZ, LLLI, "nav_add_friends");
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2406));
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2407));
        this.LLLFFI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2405));
    }

    @Override // com.ss.android.ugc.profile.business.ur.platform.addfriends.INavBarAddFriendsAbility
    public final void Ha() {
        User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
        ProfileMafRedPointsVM profileMafRedPointsVM = (ProfileMafRedPointsVM) this.LLLF.getValue();
        if (profileMafRedPointsVM != null) {
            profileMafRedPointsVM.vQ2(C1DGC.LIZ(curUser.mafRedCount));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return this.LLJLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.platform.addfriends.ProfileNavbarAddFriendProtocol.LJII(android.view.View):boolean");
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        this.LLLFF = (AddFriendsData) C1250210idf.LIZ(nVar.toString(), AddFriendsData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            LJJJLZIJ(nVar);
            return true;
        }
        return true;
    }
}

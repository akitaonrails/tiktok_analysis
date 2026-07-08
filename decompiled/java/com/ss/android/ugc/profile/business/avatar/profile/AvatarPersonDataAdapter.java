package com.ss.android.ugc.profile.business.avatar.profile;

import X.C10EU;
import X.C1252550ihR;
import X.C1256520inq;
import X.C1256630io1;
import X.C1256660io4;
import X.C1256670io5;
import X.C2188811AlT;
import X.C356901a3;
import X.EnumC1607270rvZ;
import X.InterfaceC1256690io7;
import X.InterfaceC1606880ruw;
import X.InterfaceC1607380rvk;
import X.InterfaceC1608820ry4;
import X.InterfaceC1608830ry5;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AvatarPersonDataAdapter implements InterfaceC1608820ry4<C1256520inq, C1256630io1>, InterfaceC1608830ry5<C1256520inq, C1256630io1>, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C1256630io1 LL;
    public InterfaceC1607380rvk LLILLJJLI;
    public C1256520inq LLILLL;
    public final Integer LLILZ;
    public final IProfileBadgeService LLILZIL;
    public final C1256660io4 LLILZLL;

    public AvatarPersonDataAdapter() {
        this(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0io4] */
    public AvatarPersonDataAdapter(C1256630io1 c1256630io1) {
        Integer num;
        this.LL = c1256630io1;
        if (c1256630io1 != null) {
            num = c1256630io1.LIZLLL;
        } else {
            num = null;
        }
        this.LLILZ = num;
        this.LLILZIL = ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false);
        this.LLILZLL = new InterfaceC1256690io7() { // from class: X.0io4
            @Override // X.InterfaceC1256690io7
            public final void LIZ(ProfileBadgeStruct profileBadgeStruct) {
                AccountUserService accountUserServiceLJIIJ;
                String uid;
                InterfaceC1607380rvk interfaceC1607380rvk;
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && (uid = accountUserServiceLJIIJ.getCurUser().getUid()) != null && (interfaceC1607380rvk = this.LIZ.LLILLJJLI) != null) {
                    interfaceC1607380rvk.LJIIZILJ(uid, profileBadgeStruct, EnumC1607270rvZ.PERSON, false, null);
                }
            }
        };
    }

    @Override // X.InterfaceC1608830ry5
    public final InterfaceC1606880ruw LIZLLL(Object obj) {
        ProfileBadgeStruct profileBadge;
        boolean z;
        String url = null;
        if (!(obj instanceof User) || obj == null) {
            return null;
        }
        User user = (User) obj;
        C1256630io1 c1256630io1 = this.LL;
        boolean z2 = false;
        if ((c1256630io1 != null && !c1256630io1.LIZIZ) || (profileBadge = user.getProfileBadge()) == null || !profileBadge.getShouldShow() || C10EU.LJIIIIZZ()) {
            z = false;
        } else {
            z = true;
        }
        C1256630io1 c1256630io12 = this.LL;
        if (c1256630io12 != null && c1256630io12.LIZ) {
            C1252550ihR.LIZ.getClass();
            if (!C1252550ihR.LJIIJJI(user, "photo", "video")) {
                z2 = true;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasOverlay = ");
        sbLIZ.append(z2);
        sbLIZ.append(", hasBadge ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1256670io5.LIZ.booleanValue();
        ProfileBadgeStruct profileBadge2 = user.getProfileBadge();
        if (profileBadge2 != null) {
            url = profileBadge2.getUrl();
        }
        C1256520inq c1256520inq = new C1256520inq(z, z2, url);
        this.LLILLL = c1256520inq;
        return c1256520inq;
    }

    @Override // X.InterfaceC1608820ry4
    public final InterfaceC1606880ruw LJFF(Object obj) {
        boolean z;
        boolean z2 = true;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof ProfileBadgeStruct;
        }
        C1256520inq c1256520inq = null;
        String url = null;
        c1256520inq = null;
        if (z) {
            ProfileBadgeStruct profileBadgeStruct = (ProfileBadgeStruct) obj;
            C1256520inq c1256520inq2 = this.LLILLL;
            if (c1256520inq2 != null) {
                C1256630io1 c1256630io1 = this.LL;
                if (c1256630io1 == null || !c1256630io1.LIZIZ || profileBadgeStruct == null || !profileBadgeStruct.getShouldShow() || C10EU.LJIIIIZZ()) {
                    z2 = false;
                }
                if (profileBadgeStruct != null) {
                    url = profileBadgeStruct.getUrl();
                }
                c1256520inq = new C1256520inq(z2, c1256520inq2.LLILLJJLI, url);
            }
            this.LLILLL = c1256520inq;
        }
        return c1256520inq;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        this.LLILZIL.subscribe(this.LLILZLL);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLILZIL.unsubscribe(this.LLILZLL);
    }

    @Override // X.InterfaceC1608820ry4
    public final void LJ(AvatarComponentView avatarComponentView, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        avatarComponentView.LJIIJJI(EnumC1607270rvZ.PERSON, new AwS385S0200000_19(avatarComponentView, this, 51));
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // X.InterfaceC1608820ry4
    public final void LIZJ(String str, InterfaceC1607380rvk interfaceC1607380rvk, Object obj) {
        this.LLILLJJLI = interfaceC1607380rvk;
    }
}

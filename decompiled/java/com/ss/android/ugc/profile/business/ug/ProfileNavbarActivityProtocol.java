package com.ss.android.ugc.profile.business.ug;

import X.AbstractC1250290idn;
import X.C01GW;
import X.C10EU;
import X.C1248940ibc;
import X.C1249360icI;
import X.C1250280idm;
import X.C1251150ifB;
import X.C1558420qem;
import X.C1558520qew;
import X.C1894570zOx;
import X.C1894700zPA;
import X.C2178808gE;
import X.C2214201BlK;
import X.C452501pT;
import X.EnumC1249130ibv;
import X.InterfaceC1894560zOw;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.profile.business.ug.ProfileNavbarActivityProtocol;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarActivityProtocol extends NavbarPlatformProtocol<BizBaseData> implements GenericLifecycleObserver {
    public C1894570zOx LLJLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(391));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2137));
    public boolean LLJZ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final void LJL(C1250280idm c1250280idm) {
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_start_activity";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        this.LLJLL = new C1894570zOx();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Boolean LJJLIIIJ() {
        return Boolean.valueOf(this.LLJZ);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final AbstractC1250290idn LJJLIIIJLJLI() {
        return (AbstractC1250290idn) this.LLJLLIL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C1894570zOx c1894570zOx = this.LLJLL;
        if (c1894570zOx != null) {
            c1894570zOx.LLILZIL = null;
            c1894570zOx.LLILZLL = null;
            c1894570zOx.LLIZ = null;
        }
        this.LLJLL = null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return Om();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final void LJJZZI() {
        Activity activityLJFF;
        C1894570zOx c1894570zOx;
        if (!Om() || C10EU.LJIIIIZZ() || (activityLJFF = C2214201BlK.LJFF()) == null || (c1894570zOx = this.LLJLL) == null) {
            return;
        }
        C1251150ifB c1251150ifB = (C1251150ifB) this.LLJLLIL.getValue();
        InterfaceC1894560zOw interfaceC1894560zOw = new InterfaceC1894560zOw() { // from class: X.0icq
            @Override // X.InterfaceC1894560zOw
            public final void LIZ() {
                EnumC1249130ibv enumC1249130ibv;
                this.LIZ.LJLI(Boolean.TRUE);
                C1248940ibc c1248940ibc = this.LIZ.LLJJJJ;
                if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null) {
                    return;
                }
                ProfileNavbarActivityProtocol profileNavbarActivityProtocol = this.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(profileNavbarActivityProtocol);
                String value = enumC1249130ibv.getValue();
                if (value == null) {
                    value = "";
                }
                INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
                if (iNavbarBaseAbility != null) {
                    profileNavbarActivityProtocol.getClass();
                    iNavbarBaseAbility.bq1("nav_bar_start_activity");
                }
                profileNavbarActivityProtocol.getClass();
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // X.InterfaceC1894560zOw
            public final void LIZIZ() {
                ?? r0 = this.LIZ.LLJJIII;
                if (r0 != 0) {
                    r0.invoke();
                }
            }

            @Override // X.InterfaceC1894560zOw
            public final void LIZJ() {
                this.LIZ.LJLI(null);
            }

            @Override // X.InterfaceC1894560zOw
            public final void LIZLLL() {
                EnumC1249130ibv enumC1249130ibv;
                this.LIZ.LJLI(Boolean.TRUE);
                AbstractC1250290idn abstractC1250290idn = (AbstractC1250290idn) this.LIZ.LLJLLIL.getValue();
                this.LIZ.getClass();
                abstractC1250290idn.LIZIZ = "nav_bar_start_activity";
                ProfileNavbarActivityProtocol profileNavbarActivityProtocol = this.LIZ;
                C1248940ibc c1248940ibc = profileNavbarActivityProtocol.LLJJJJ;
                if (c1248940ibc != null && (enumC1249130ibv = c1248940ibc.LL) != null) {
                    InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(profileNavbarActivityProtocol);
                    String value = enumC1249130ibv.getValue();
                    if (value == null) {
                        value = "";
                    }
                    INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
                    if (iNavbarBaseAbility != null) {
                        iNavbarBaseAbility.aP1(profileNavbarActivityProtocol.LLJ, (AbstractC1250290idn) profileNavbarActivityProtocol.LLJLLIL.getValue(), "nav_bar_start_activity");
                    }
                }
                INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) this.LIZ.LLJLLL.getValue();
                if (iNavBarActionAbility != null) {
                    iNavBarActionAbility.aG1();
                }
            }

            @Override // X.InterfaceC1894560zOw
            public final boolean LJFF() {
                return C20684815ws.LJI("profile_activity_reward_button_show");
            }

            @Override // X.InterfaceC1894560zOw
            public final void LJI() {
                EnumC1249130ibv enumC1249130ibv;
                this.LIZ.LJLI(Boolean.FALSE);
                C1248940ibc c1248940ibc = this.LIZ.LLJJJJ;
                if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null) {
                    return;
                }
                ProfileNavbarActivityProtocol profileNavbarActivityProtocol = this.LIZ;
                profileNavbarActivityProtocol.getClass();
                InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(profileNavbarActivityProtocol);
                String value = enumC1249130ibv.getValue();
                if (value == null) {
                    value = "";
                }
                INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
                if (iNavbarBaseAbility != null) {
                    iNavbarBaseAbility.Zr0("nav_bar_start_activity");
                }
            }

            @Override // X.InterfaceC1894560zOw
            public final void LJ(TuxIconView tuxIconView) {
                int iIntValue;
                int iIntValue2;
                int iIntValue3;
                ProfileNavbarActivityProtocol profileNavbarActivityProtocol = this.LIZ;
                if (C2537109wv.LJIIIIZZ() && C14KI.LJI(tuxIconView.getContext())) {
                    C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
                } else if (C2537109wv.LJIIIIZZ()) {
                    C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
                }
                profileNavbarActivityProtocol.getClass();
                C1251670ig1.LIZ(tuxIconView, "nav_bar_start_activity");
                Integer num = profileNavbarActivityProtocol.LLJL;
                int iIntValue4 = 0;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer num2 = profileNavbarActivityProtocol.LLJLILLLLZIIL;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                int i = (iIntValue - iIntValue2) / 2;
                Integer num3 = profileNavbarActivityProtocol.LLJLIL;
                if (num3 != null) {
                    iIntValue3 = num3.intValue();
                } else {
                    iIntValue3 = 0;
                }
                Integer num4 = profileNavbarActivityProtocol.LLJLILLLLZIIL;
                if (num4 != null) {
                    iIntValue4 = num4.intValue();
                }
                int i2 = (iIntValue3 - iIntValue4) / 2;
                C426750GoL.LJIIL(tuxIconView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), 16);
                Integer num5 = profileNavbarActivityProtocol.LLJL;
                if (num5 != null) {
                    C1744700vVE.LJIIL(tuxIconView, num5.intValue());
                }
                Integer num6 = profileNavbarActivityProtocol.LLJLIL;
                if (num6 != null) {
                    C1744700vVE.LJIIIIZZ(num6.intValue(), tuxIconView);
                }
            }
        };
        c1894570zOx.LLILZIL = activityLJFF;
        c1894570zOx.LLILZLL = c1251150ifB;
        c1894570zOx.LLIZ = interfaceC1894560zOw;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        if (C2178808gE.LIZ().LJ(3) != null) {
            c1894570zOx.LJIIJ();
            return;
        }
        InterfaceC1894560zOw interfaceC1894560zOw2 = c1894570zOx.LLIZ;
        if (interfaceC1894560zOw2 != null) {
            interfaceC1894560zOw2.LJI();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final boolean LJJLL(C1250280idm c1250280idm) {
        EnumC1249130ibv enumC1249130ibv;
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc != null && (enumC1249130ibv = c1248940ibc.LL) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            String value = enumC1249130ibv.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.aP1(this.LLJ, (AbstractC1250290idn) this.LLJLLIL.getValue(), "nav_bar_start_activity");
                return false;
            }
            return false;
        }
        return false;
    }

    public final void LJLI(Boolean bool) {
        if (bool != null) {
            this.LLJZ = bool.booleanValue();
        }
        C1249360icI c1249360icI = this.LLJJL;
        if (c1249360icI != null) {
            c1249360icI.invoke(bool);
        }
    }
}

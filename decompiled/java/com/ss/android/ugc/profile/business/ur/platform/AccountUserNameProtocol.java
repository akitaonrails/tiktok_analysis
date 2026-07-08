package com.ss.android.ugc.profile.business.ur.platform;

import X.AbstractC848400XPy;
import X.C0SE5;
import X.C0XQ7;
import X.C1238700iL6;
import X.C1248270iaX;
import X.C1248950ibd;
import X.C1250210idf;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1558360qeg;
import X.C1558520qew;
import X.C20145813s8;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C627150Oin;
import X.C786390Ut3;
import X.C814420VxA;
import X.C838130WuJ;
import X.EnumC1248260iaW;
import X.EnumC428940Grs;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountUserNameProtocol extends ProfilePlatformProtocol<UserNameData> implements IUserNameAbility, GenericLifecycleObserver {
    public String LLJJJIL;
    public UserNameData LLJJJJ;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJIJJLI() {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_account_user_name";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        IProfilePlatformVM iProfilePlatformVM;
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragment, null), this, IUserNameAbility.class, null, null);
        }
        if (!C0SE5.LIZ() || (iProfilePlatformVM = this.LLIZLLLIL) == null) {
            return;
        }
        iProfilePlatformVM.EQ2(new AwS598S0100000_19(this, 386));
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJI() {
        TuxTextView tuxTextView;
        View view = this.LLILZLL;
        if (!(view instanceof TuxTextView) || (tuxTextView = (TuxTextView) view) == null) {
            return;
        }
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setTuxFont(LJJJJJ().intValue());
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        String username;
        String strLIZIZ;
        UserProfileInfo userProfileInfo;
        TuxTextView tuxTextView;
        ProfileComponents profileComponents;
        String str;
        TextView textView;
        AppCompatTextView appCompatTextView;
        IAccountUserService iAccountUserServiceLJFF;
        User curUser;
        Describe describe;
        C428150Gqb.LIZ(this.LLILZLL, EnumC428940Grs.ALPHA, 0.0f);
        Context context = getContext();
        if (context != null) {
            T t = this.LLJILJIL;
            String str2 = "";
            if (t == 0 || (describe = t.getDescribe()) == null || (strLIZIZ = describe.getText()) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('@');
                ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
                if (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (username = userProfileInfo.getUsername()) == null) {
                    username = "";
                }
                sbLIZ.append(username);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (strLIZIZ.length() == 0 && ((iAccountUserServiceLJFF = C0XQ7.LJFF()) == null || (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) == null || (strLIZIZ = curUser.getUniqueId()) == null)) {
                strLIZIZ = "";
            }
            View view = this.LLILZLL;
            CharSequence text = null;
            if ((view instanceof TuxTextView) && (appCompatTextView = (AppCompatTextView) view) != null) {
                text = appCompatTextView.getText();
            }
            if (!Intrinsics.LJFF(strLIZIZ, text)) {
                View view2 = this.LLILZLL;
                if ((view2 instanceof TuxTextView) && (textView = (TextView) view2) != null) {
                    textView.setText(strLIZIZ);
                }
                if (C2537109wv.LJI()) {
                    View view3 = this.LLILZLL;
                    if ((view3 instanceof TuxTextView) && (tuxTextView = (TuxTextView) view3) != null) {
                        T t2 = this.LLJILJIL;
                        C1248950ibd c1248950ibd = this.LLIZ;
                        if (c1248950ibd != null && (profileComponents = c1248950ibd.LLILLJJLI) != null && (str = profileComponents.componentId) != null) {
                            str2 = str;
                        }
                        C1248270iaX.LIZJ(tuxTextView, t2, str2, C1308910kAL.LIZJ((!this.LLJI || C1238700iL6.LIZIZ()) ? R.attr.a1k : R.attr.a1m, context), LJJJJJ(), false, 16);
                    }
                }
                q0.LJIJ(this.LLILZLL, new C786390Ut3(16));
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility
    public final TuxTextView nx() {
        View view = this.LLILZLL;
        if (view instanceof TuxTextView) {
            return (TuxTextView) view;
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Fragment fragment = this.LLILZ;
        if (fragment != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragment, null), IUserNameAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility
    public final float wj0() {
        TextView textView;
        View view = this.LLILZLL;
        if (!(view instanceof TuxTextView) || (textView = (TextView) view) == null) {
            return 0.0f;
        }
        return textView.getTextSize();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJJJJ() {
        return Integer.valueOf(C268330AfP.LIZLLL() ? 72 : C2537109wv.LJI() ? 61 : 42);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return EnumC1248260iaW.TEXT;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        UserProfileInfo userProfileInfo;
        String username;
        UserProfileInfo userProfileInfo2;
        String username2;
        List<Action> list;
        String url;
        String str = "";
        if (C2537109wv.LJI() && this.LLJI) {
            ProfileComponents profileComponents = this.LLJILJILJ;
            if (profileComponents != null && (list = profileComponents.actions) != null) {
                for (Action action : list) {
                    if (Intrinsics.LJFF(action.getType(), "router")) {
                        Context context = getContext();
                        Action.RouterInfo router = action.getRouter();
                        if (router != null) {
                            url = router.getUrl();
                        } else {
                            url = null;
                        }
                        SmartRouter.buildRoute(context, url).open();
                    }
                }
            } else if (!C1238700iL6.LIZIZ()) {
                C627150Oin c627150Oin = new C627150Oin();
                c627150Oin.LIZ.putInt("need_focus_id_input", 1);
                Bundle bundle = c627150Oin.LIZ;
                if (getContext() != null) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://profile_edit");
                    if (bundle != null) {
                        smartRouteBuildRoute.withParam(bundle);
                    }
                    smartRouteBuildRoute.open();
                    SharePrefCache.inst().getIsProfileBubbleShown().LJ(Boolean.FALSE);
                    return true;
                }
            } else {
                ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
                if (profileCommonInfoLJIILIIL != null && (userProfileInfo2 = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null && (username2 = userProfileInfo2.getUsername()) != null) {
                    str = username2;
                }
                LJJLIIIJLJLI(str);
                return true;
            }
        } else {
            ProfileCommonInfo profileCommonInfoLJIILIIL2 = LJIILIIL();
            if (profileCommonInfoLJIILIIL2 != null && (userProfileInfo = profileCommonInfoLJIILIIL2.getUserProfileInfo()) != null && (username = userProfileInfo.getUsername()) != null) {
                str = username;
            }
            LJJLIIIJLJLI(str);
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        UserNameData userNameData;
        try {
            userNameData = (UserNameData) C1250210idf.LIZ(nVar.toString(), UserNameData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            userNameData = null;
        }
        this.LLJILJIL = userNameData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        n nVar;
        String text;
        Describe describe;
        String strValueOf = String.valueOf(profileComponents.bizData);
        if (!Intrinsics.LJFF(this.LLJJJIL, strValueOf) && (nVar = profileComponents.bizData) != null) {
            LJJJLZIJ(nVar);
            T t = this.LLJILJIL;
            UserNameData userNameData = this.LLJJJJ;
            String text2 = null;
            if (userNameData != null && (describe = userNameData.getDescribe()) != null) {
                text = describe.getText();
            } else {
                text = null;
            }
            Describe describe2 = t.getDescribe();
            if (describe2 != null) {
                text2 = describe2.getText();
            }
            if (Intrinsics.LJFF(text, text2)) {
                return false;
            }
            this.LLJJJJ = (UserNameData) this.LLJILJIL;
            this.LLJJJIL = strValueOf;
            LJJLIIIJILLIZJL();
        }
        return false;
    }

    public final void LJJLIIIJLJLI(String str) {
        Context context = getContext();
        if (context != null) {
            try {
                C20145813s8.LIZ("user_id", str, context, CertProviderManagerKt.findCert("bpea-profile_copy_user_name", 1476399109));
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131828861);
                    c1389890mGx.LJIIJJI();
                }
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
            } catch (SecurityException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2344809Gs.LIZ(e2);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility
    public final void um(int i) {
        TuxTextView tuxTextView;
        View view = this.LLILZLL;
        if (view != null && (view instanceof TuxTextView) && (view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
            tuxTextView.setTextColorRes(i);
        }
    }
}

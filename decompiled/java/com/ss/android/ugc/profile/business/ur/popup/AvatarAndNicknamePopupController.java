package com.ss.android.ugc.profile.business.ur.popup;

import X.AbstractC848400XPy;
import X.C013C;
import X.C0B9O;
import X.C0XQ7;
import X.C1154610g9T;
import X.C1169690gXn;
import X.C1169910gY9;
import X.C1196500hF2;
import X.C1235030iFB;
import X.C1235040iFC;
import X.C1252550ihR;
import X.C1390920mIc;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C703302op;
import X.DialogInterfaceOnDismissListenerC1208810hYt;
import X.EnumC1154590g9R;
import X.EnumC1154600g9S;
import X.EnumC1169600gXe;
import X.EnumC1261800iwM;
import X.EnumC1261810iwN;
import X.EnumC1261820iwO;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.TTSeller;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS78S0500000_18;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes19.dex */
public final class AvatarAndNicknamePopupController implements UpdateProfilePopupLauncher {
    public static final Regex LIZIZ = new Regex("[uU]ser\\d*");
    public WeakReference<C1196500hF2> LIZ;

    public static Pair LIZLLL() {
        EnumC1154590g9R enumC1154590g9R;
        User userLJ;
        SpecialAccount specialAccount;
        TTSeller seller;
        Keva keva = C1169910gY9.LIZ;
        User userLJ2 = LJ();
        EnumC1154600g9S enumC1154600g9S = null;
        if (C1169910gY9.LIZ(userLJ2 != null ? userLJ2.getUid() : null) >= 3) {
            return new Pair(null, null);
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        User userLJ3 = LJ();
        String uid = userLJ3 != null ? userLJ3.getUid() : null;
        Keva keva2 = C1169910gY9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uid);
        sbLIZ.append("/_last_popup_timestamp");
        long j = keva2.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        long seconds2 = TimeUnit.DAYS.toSeconds(1L) + j;
        if (j != 0 && seconds < seconds2) {
            return new Pair(null, null);
        }
        User userLJ4 = LJ();
        if (userLJ4 == null) {
            return new Pair(null, null);
        }
        boolean z = C703302op.LIZ(userLJ4.getCustomVerify()) || C703302op.LIZ(userLJ4.getEnterpriseVerifyReason());
        C1252550ihR.LIZ.getClass();
        boolean z2 = !C1252550ihR.LJIIJJI(userLJ4, "photo");
        boolean z3 = !C1252550ihR.LJIIJJI(userLJ4, "nickname") || LIZIZ.matches(userLJ4.getNickname());
        if (z || !(z2 || z3)) {
            return new Pair(null, null);
        }
        boolean zLIZJ = ComplianceServiceProvider.LJFF().LIZJ(4);
        if (!z2) {
            if (!zLIZJ && ((userLJ = LJ()) == null || (specialAccount = userLJ.specialAccount) == null || (seller = specialAccount.getSeller()) == null || seller.getType() != 1 || !seller.isAllowListSeller())) {
                C1235040iFC c1235040iFC = new C1235040iFC();
                final C013C c013c = new C013C();
                c013c.element = true;
                User userLJ5 = LJ();
                if (userLJ5 != null) {
                    c1235040iFC.LIZIZ(userLJ5, new C1235030iFB() { // from class: X.0hjr
                        @Override // X.C1235030iFB
                        public final void LIZJ(VerificationResponse verificationResponse) {
                            if (verificationResponse.isEmpty()) {
                                c013c.element = false;
                            }
                        }
                    });
                }
                if (!c013c.element) {
                    enumC1154590g9R = EnumC1154590g9R.NICKNAME_ONLY_FLOW;
                }
            }
            return new Pair(null, null);
        }
        if (z3) {
            enumC1154600g9S = EnumC1154600g9S.AVATAR_AND_NICKNAME_FLOW;
            enumC1154590g9R = EnumC1154590g9R.AVATAR_AND_NICKNAME_FLOW;
        } else {
            enumC1154590g9R = null;
            enumC1154600g9S = EnumC1154600g9S.AVATAR_ONLY_FLOW;
        }
        return new Pair(enumC1154600g9S, enumC1154590g9R);
    }

    public static void LJFF() {
        Keva keva = C1169910gY9.LIZ;
        User userLJ = LJ();
        String uid = userLJ != null ? userLJ.getUid() : null;
        Keva keva2 = C1169910gY9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uid);
        sbLIZ.append("/_popup_show_cnt");
        keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ), C1169910gY9.LIZ(uid) + 1);
        User userLJ2 = LJ();
        String uid2 = userLJ2 != null ? userLJ2.getUid() : null;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(uid2);
        sbLIZ2.append("/_last_popup_timestamp");
        keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), seconds);
    }

    @Override // com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher
    public final boolean LIZ() {
        C1196500hF2 c1196500hF2;
        if (((Number) C0B9O.LIZ.getValue()).intValue() == 0) {
            return false;
        }
        WeakReference<C1196500hF2> weakReference = this.LIZ;
        if (weakReference != null && (c1196500hF2 = weakReference.get()) != null && c1196500hF2.isShowing()) {
            return false;
        }
        Pair pairLIZLLL = LIZLLL();
        return (pairLIZLLL.getFirst() == null && pairLIZLLL.getSecond() == null) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher
    public final void LIZIZ() {
        C1196500hF2 c1196500hF2;
        WeakReference<C1196500hF2> weakReference = this.LIZ;
        if (weakReference == null || (c1196500hF2 = weakReference.get()) == null) {
            return;
        }
        c1196500hF2.dismiss();
    }

    public static User LJ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
    }

    @Override // com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher
    public final boolean LIZJ(Activity activity, EnumC1261800iwM enumC1261800iwM, EnumC1261820iwO enumC1261820iwO, EnumC1261810iwN enumC1261810iwN) {
        String uid;
        int i;
        EnumC1169600gXe enumC1169600gXe;
        if (!LIZ()) {
            return false;
        }
        Pair pairLIZLLL = LIZLLL();
        EnumC1154600g9S enumC1154600g9S = (EnumC1154600g9S) pairLIZLLL.getFirst();
        EnumC1154590g9R enumC1154590g9R = (EnumC1154590g9R) pairLIZLLL.getSecond();
        Keva keva = C1169910gY9.LIZ;
        User userLJ = LJ();
        if (userLJ != null) {
            uid = userLJ.getUid();
        } else {
            uid = null;
        }
        C1169690gXn c1169690gXn = new C1169690gXn(enumC1154600g9S, enumC1154590g9R, enumC1261800iwM, enumC1261820iwO, enumC1261810iwN, C1169910gY9.LIZ(uid));
        if (enumC1154600g9S == null) {
            i = -1;
        } else {
            i = C1154610g9T.LIZ[enumC1154600g9S.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                enumC1169600gXe = EnumC1169600gXe.ONLY_AVATAR;
            } else {
                enumC1169600gXe = EnumC1169600gXe.BOTH_AVATAR_AND_NICKNAME;
            }
        } else {
            enumC1169600gXe = EnumC1169600gXe.ONLY_NICKNAME;
        }
        if (((Number) C0B9O.LIZ.getValue()).intValue() == 2 && enumC1169600gXe != EnumC1169600gXe.ONLY_NICKNAME) {
            LJI(activity, c1169690gXn, enumC1169600gXe, null, true);
            return true;
        }
        C1196500hF2 c1196500hF2 = new C1196500hF2(activity, enumC1169600gXe);
        if (enumC1154600g9S != null) {
            c1196500hF2.LLILLL = new AwS78S0500000_18(c1169690gXn, this, activity, enumC1169600gXe, c1196500hF2, 0);
            c1196500hF2.LLILZ = new AwS562S0100000_18(c1169690gXn, 2412);
            c1196500hF2.LLILZIL = new AwS562S0100000_18(this, 2413);
            c1196500hF2.show();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c1169690gXn.LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("show_update_avatar_toast", c2344009Gk.LIZ);
        } else {
            c1196500hF2.LLILLL = new AwS78S0500000_18(c1169690gXn, this, activity, enumC1169600gXe, c1196500hF2, 1);
            c1196500hF2.LLILZ = new AwS562S0100000_18(c1169690gXn, 2414);
            c1196500hF2.LLILZIL = new AwS562S0100000_18(this, 2415);
            c1196500hF2.show();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c1169690gXn.LIZ(c2344009Gk2);
            C20684815ws.LJIILLIIL("show_update_nickname_toast", c2344009Gk2.LIZ);
        }
        this.LIZ = new WeakReference<>(c1196500hF2);
        return true;
    }

    public final void LJI(Activity activity, C1169690gXn c1169690gXn, final EnumC1169600gXe enumC1169600gXe, C1196500hF2 c1196500hF2, boolean z) {
        if (!(activity instanceof C19EG)) {
            return;
        }
        AvatarAndNicknamePopup avatarAndNicknamePopup = new AvatarAndNicknamePopup();
        avatarAndNicknamePopup.UR(c1169690gXn, enumC1169600gXe);
        final C013C c013c = new C013C();
        c013c.element = !z;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = avatarAndNicknamePopup;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1208810hYt(c1196500hF2, 4);
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.show(((C19EG) activity).getSupportFragmentManager(), "AvatarAndNicknamePopup");
        tuxSheet2.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.profile.business.ur.popup.AvatarAndNicknamePopupController$showSheet$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                C013C c013c2 = c013c;
                if (c013c2.element) {
                    return;
                }
                c013c2.element = true;
                if (((Number) C0B9O.LIZ.getValue()).intValue() != 2 || enumC1169600gXe == EnumC1169600gXe.ONLY_NICKNAME) {
                    return;
                }
                this.getClass();
                AvatarAndNicknamePopupController.LJFF();
            }
        });
    }
}

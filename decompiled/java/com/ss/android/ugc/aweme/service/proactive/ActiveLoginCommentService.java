package com.ss.android.ugc.aweme.service.proactive;

import X.AbstractC848400XPy;
import X.C04TD;
import X.C0XQ7;
import X.C10H8;
import X.C10HB;
import X.C1390920mIc;
import X.C19EG;
import X.C786410Ut5;
import X.C848800XRm;
import X.C960203pA;
import X.DialogInterfaceOnDismissListenerC19333210kM;
import X.InterfaceC744560TIo;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.service.proactive.experiment.ActiveLoginTriggerCommentsConfig;
import com.ss.android.ugc.aweme.ui.SignupBottomSheetFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class ActiveLoginCommentService implements IActiveLoginCommentService {
    public C10HB LIZ;
    public final Keva LIZIZ = Keva.getRepo("active_login_comment_repo");
    public TuxSheet LIZJ;
    public boolean LIZLLL;

    public static IActiveLoginCommentService LJIIIZ() {
        Object objLIZ = C04TD.LIZ(IActiveLoginCommentService.class, false);
        if (objLIZ != null) {
            return (IActiveLoginCommentService) objLIZ;
        }
        if (C04TD.s4 == null) {
            synchronized (IActiveLoginCommentService.class) {
                if (C04TD.s4 == null) {
                    C04TD.s4 = new ActiveLoginCommentService();
                }
            }
        }
        return C04TD.s4;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final void LIZ() {
        TuxSheet tuxSheet = this.LIZJ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final int LJI() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return -1;
        }
        C10H8.LIZ.getClass();
        Integer num = C10H8.LIZ().maxComments;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final boolean LJII() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        C10H8.LIZ.getClass();
        Boolean bool = C10H8.LIZ().emptyCommentSignupButtonEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final boolean LJIIIIZZ() {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        C10H8.LIZ.getClass();
        Boolean bool = C10H8.LIZ().hideInputPanel;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final void LJ(C10HB c10hb) {
        this.LIZ = c10hb;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final boolean LJFF(Long l) {
        long jLongValue;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C10H8.LIZ.getClass();
            Boolean bool = C10H8.LIZ().commentListLoginEnabled;
            if (bool != null && bool.booleanValue()) {
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                if (jLongValue > LJI()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final void LIZIZ(WeakReference weakReference, String str) {
        C19EG c19eg = (C19EG) weakReference.get();
        if (c19eg != null) {
            PopupManager.LJIJI(new C848800XRm(c19eg, str, "click_empty_comment_signup", c19eg.getResources().getString(2131829310), c19eg.getResources().getString(2131829351), null, 0.0d, new AwS607S0100000_28(this, 126), null, 352), true);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final boolean LIZLLL(String str, WeakReference weakReference) {
        boolean zBooleanValue;
        Boolean bool;
        Integer num;
        int iIntValue;
        Activity activity;
        Integer num2;
        int iIntValue2;
        String str2 = str;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C10H8.LIZ.getClass();
            ActiveLoginTriggerCommentsConfig activeLoginTriggerCommentsConfigLIZ = C10H8.LIZ();
            if (activeLoginTriggerCommentsConfigLIZ != null && (num = activeLoginTriggerCommentsConfigLIZ.triggerTap) != null && (iIntValue = num.intValue()) >= 0) {
                Keva keva = this.LIZIZ;
                keva.storeInt("trigger_tap_times", keva.getInt("trigger_tap_times", 0) + 1);
                if (this.LIZIZ.getInt("trigger_tap_times", 0) >= iIntValue) {
                    Keva keva2 = this.LIZIZ;
                    keva2.storeInt("panel_trigger_times", keva2.getInt("panel_trigger_times", 0) + 1);
                    ActiveLoginTriggerCommentsConfig activeLoginTriggerCommentsConfigLIZ2 = C10H8.LIZ();
                    if ((activeLoginTriggerCommentsConfigLIZ2 == null || (num2 = activeLoginTriggerCommentsConfigLIZ2.maxTriggerTimes) == null || (iIntValue2 = num2.intValue()) == -1 || this.LIZIZ.getInt("panel_trigger_times", 0) <= iIntValue2) && (activity = (Activity) weakReference.get()) != null && (activity instanceof C19EG)) {
                        C19EG c19eg = (C19EG) activity;
                        if (str2 == null) {
                            str2 = "comment_page";
                        }
                        PopupManager.LJIJI(new C848800XRm(c19eg, str2, "view_comment", c19eg.getResources().getString(2131845253), c19eg.getResources().getString(2131845254), null, 0.0d, new AwS607S0100000_28(this, 127), AFwS217S0000000_28.get$arr$(356), 96), true);
                    }
                }
            }
        }
        C10H8.LIZ.getClass();
        ActiveLoginTriggerCommentsConfig activeLoginTriggerCommentsConfigLIZ3 = C10H8.LIZ();
        if (activeLoginTriggerCommentsConfigLIZ3 != null && (bool = activeLoginTriggerCommentsConfigLIZ3.allowExpand) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        return !zBooleanValue;
    }

    @Override // com.ss.android.ugc.aweme.service.proactive.IActiveLoginCommentService
    public final void LIZJ(WeakReference<C19EG> weakReference, Context context, String str) {
        C19EG c19eg;
        int[] iArr;
        if (!this.LIZLLL && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && LJI() >= 0 && (c19eg = weakReference.get()) != null && context != null) {
            boolean zLIZIZ = C960203pA.LIZIZ(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (!zLIZIZ) {
                iArr = new int[]{Color.argb(0, 255, 255, 255), Color.argb(255, 255, 255, 255), Color.argb(255, 255, 255, 255), Color.argb(255, 255, 255, 255), Color.argb(255, 255, 255, 255), Color.argb(255, 255, 255, 255)};
            } else {
                iArr = new int[]{Color.argb(0, 0, 0, 0), Color.argb(255, 0, 0, 0), Color.argb(255, 0, 0, 0), Color.argb(255, 0, 0, 0), Color.argb(255, 0, 0, 0), Color.argb(255, 0, 0, 0)};
            }
            gradientDrawable.setColors(iArr);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setShape(0);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            if (str == null) {
                str = "comment_page";
            }
            InterfaceC744560TIo interfaceC744560TIo = new InterfaceC744560TIo() { // from class: X.10H9
                @Override // X.InterfaceC744560TIo
                public final void LIZ() {
                    C10HB c10hb = this.LIZ.LIZ;
                    if (c10hb != null) {
                        c10hb.LIZ(true, false);
                    }
                }

                @Override // X.InterfaceC744560TIo
                public final void dismiss() {
                    TuxSheet tuxSheet = this.LIZ.LIZJ;
                    if (tuxSheet != null) {
                        tuxSheet.dismiss();
                    }
                }
            };
            SignupBottomSheetFragment signupBottomSheetFragment = new SignupBottomSheetFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", str, bundle);
            C786410Ut5.LJJJI("enter_method", "view_comment", bundle);
            signupBottomSheetFragment.setArguments(bundle);
            signupBottomSheetFragment.LL = interfaceC744560TIo;
            c1390920mIc.LIZ.LLJJIJI = signupBottomSheetFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJIJIL = gradientDrawable;
            tuxSheet.LLJJIJIIJIL = false;
            tuxSheet.LLILLL = true;
            tuxSheet.LLJLLIL = false;
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC19333210kM(this, 7);
            tuxSheet.LLJLLL = false;
            this.LIZJ = tuxSheet;
            tuxSheet.show(c19eg.getSupportFragmentManager(), "comment_page");
            this.LIZLLL = true;
        }
    }
}

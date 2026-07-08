package com.ss.android.ugc.aweme.account.popup;

import X.AbstractC20660115st;
import X.C013C;
import X.C0XGR;
import X.C0XQ5;
import X.C1057450dcl;
import X.C1242960iRy;
import X.C1242970iRz;
import X.C1389890mGx;
import X.C19EG;
import X.C20515215Pi;
import X.C20684815ws;
import X.C259800zU;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C688120Qyw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC20647615qs;
import X.InterfaceC20660715sz;
import Y.ACListenerS25S0500000_19;
import android.app.Activity;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.account.api.UserSettingsResponse;
import com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("sync_nickname_username")
public final class SyncNicknameAndUsernamePopTask extends AbstractC20660115st<View> implements WeakHandler.IHandler {
    public final C19EG activity;
    public final ViewGroup contentView;
    public final Fragment fragment;
    public final WeakHandler handler;
    public final int priority;
    public final C20515215Pi tuxFloatingNotice;
    public static final C1242970iRz Companion = new Object() { // from class: X.0iRz
    };
    public static final int $stable = 8;

    public final C19EG getActivity() {
        return this.activity;
    }

    public final ViewGroup getContentView() {
        return this.contentView;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    @Override // X.InterfaceC20660515sx
    public int getPriority() {
        return this.priority;
    }

    public final C20515215Pi getTuxFloatingNotice() {
        return this.tuxFloatingNotice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View showNewPopup(C688120Qyw c688120Qyw) {
        T t;
        T t2;
        String str;
        C20515215Pi c20515215Pi = this.tuxFloatingNotice;
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ != null) {
            C259800zU c259800zU = new C259800zU();
            UserSettingsResponse.UserSettingsData userSettingsData = SyncNicknameAndUsernamePopUpHelper.LIZLLL;
            if (userSettingsData != null) {
                t = userSettingsData.syncNickname2Username;
            } else {
                t = 0;
            }
            c259800zU.element = t;
            C013C c013c = new C013C();
            c013c.element = true;
            String strLJJIFFI = u.LJJIFFI(c19egLIZIZ.getString(2131824537), "%s", "", false);
            CharSequence charSequence = (CharSequence) c259800zU.element;
            if (charSequence == null || charSequence.length() == 0) {
                UserSettingsResponse.UserSettingsData userSettingsData2 = SyncNicknameAndUsernamePopUpHelper.LIZLLL;
                if (userSettingsData2 != null) {
                    t2 = userSettingsData2.syncUsername2Nickname;
                } else {
                    t2 = 0;
                }
                c259800zU.element = t2;
                c013c.element = false;
                strLJJIFFI = u.LJJIFFI(c19egLIZIZ.getString(2131824534), "%s", "", false);
            }
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(strLJJIFFI).append((CharSequence) c259800zU.element);
            String str2 = (String) c259800zU.element;
            if (str2 != null) {
                int iLJJJ = a0.LJJJ(spannableStringBuilderAppend.toString(), str2, 0, false, 6);
                C786410Ut5.q2(spannableStringBuilderAppend, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 33);
            }
            C1242960iRy c1242960iRy = C1242960iRy.LIZ;
            boolean z = c013c.element;
            c1242960iRy.getClass();
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", "homepage_profile");
            if (z) {
                str = "username";
            } else {
                str = "nickname";
            }
            c0xgr.LIZLLL("banner_type", str);
            C20684815ws.LJIILLIIL("update_username_banner_show", c0xgr.LIZ);
            if (c20515215Pi != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_person_pen;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c20515215Pi.LJFF(c419910GdJ);
                c20515215Pi.LIZ.LJFF = spannableStringBuilderAppend;
                c20515215Pi.LIZ.LJI = c19egLIZIZ.getString(2131824539);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LJII = iLIZIZ;
                c1057450dcl.LJIIJ = 0;
                c1057450dcl.LJIILIIL = new ACListenerS25S0500000_19(c013c, c259800zU, this, c20515215Pi, c19egLIZIZ, 0);
                AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(c013c, 97);
                C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
                c1057450dcl2.LJIILJJIL = awS598S0100000_19;
                c1057450dcl2.LJIILL = true;
            }
        }
        SyncNicknameAndUsernamePopUpHelper.LJ().LIZ();
        if (c20515215Pi == null) {
            return null;
        }
        c20515215Pi.LJ();
        return c20515215Pi.LJ;
    }

    private final void updateNicknameOnProfilePage(String str) {
        AccountUserService accountUserServiceLIZ = C0XQ5.LIZ();
        User curUser = C0XQ5.LIZ().getCurUser();
        curUser.setNickname(str);
        accountUserServiceLIZ.LJJJI(curUser);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
                showErrorToast(this.activity, false);
            } else if (HandlerHook.getMessageObj(message.obj) instanceof UserResponse) {
                updateNicknameOnProfilePage(((UserResponse) HandlerHook.getMessageObj(message.obj)).getUser().getNickname());
                SyncNicknameAndUsernamePopUpHelper.LJ().LIZIZ();
                showSuccessToast(this.activity, false);
            }
        }
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public View showPopup(C688120Qyw c688120Qyw) {
        return showNewPopup(c688120Qyw);
    }

    public final void updateUsernameOnProfilePage(String str) {
        AccountUserService accountUserServiceLIZ = C0XQ5.LIZ();
        User curUser = C0XQ5.LIZ().getCurUser();
        curUser.setUniqueId(str);
        accountUserServiceLIZ.LJJJI(curUser);
    }

    private final void showErrorToast(Activity activity, boolean z) {
        String string;
        if (z) {
            string = activity.getString(2131824536);
        } else {
            string = activity.getString(2131824533);
        }
        C1242960iRy.LIZ.getClass();
        C1242960iRy.LIZ("update", z, false);
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
    }

    private final void showSuccessToast(Activity activity, boolean z) {
        String string;
        if (z) {
            string = activity.getString(2131824538);
        } else {
            string = activity.getString(2131824535);
        }
        C1242960iRy.LIZ.getClass();
        C1242960iRy.LIZ("update", z, true);
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
        c1389890mGx.LJII(R.attr.a0i);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
    }

    public SyncNicknameAndUsernamePopTask(C19EG c19eg, Fragment fragment, InterfaceC20660715sz interfaceC20660715sz, ViewGroup viewGroup, C20515215Pi c20515215Pi) {
        super(interfaceC20660715sz);
        this.activity = c19eg;
        this.fragment = fragment;
        this.contentView = viewGroup;
        this.tuxFloatingNotice = c20515215Pi;
        this.handler = new WeakHandler(this);
        this.priority = 442;
    }

    public static /* synthetic */ void showErrorToast$default(SyncNicknameAndUsernamePopTask syncNicknameAndUsernamePopTask, Activity activity, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        syncNicknameAndUsernamePopTask.showErrorToast(activity, z);
    }

    public static /* synthetic */ void showSuccessToast$default(SyncNicknameAndUsernamePopTask syncNicknameAndUsernamePopTask, Activity activity, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        syncNicknameAndUsernamePopTask.showSuccessToast(activity, z);
    }
}

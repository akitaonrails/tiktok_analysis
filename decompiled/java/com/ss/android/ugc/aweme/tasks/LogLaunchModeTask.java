package com.ss.android.ugc.aweme.tasks;

import X.C0CCZ;
import X.C0VZ0;
import X.C19290810dW;
import X.C460020I2e;
import X.C786410Ut5;
import X.C813020Vuu;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class LogLaunchModeTask implements C0CCZ {
    public final Uri LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LogLaunchModeTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri = this.LL;
        String str = "";
        if (uri == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_to");
        }
        long jLIZJ = C813020Vuu.LJIIL().LIZJ(C786410Ut5.M3(C460020I2e.LIZ), "red_point_count");
        C19290810dW c19290810dW = new C19290810dW();
        c19290810dW.LJIILLIIL = this.LLILLL;
        c19290810dW.LJIJI = Integer.toString(1);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        c19290810dW.LJIIZILJ = str;
        c19290810dW.LJIJ = Long.toString(jLIZJ);
        c19290810dW.LJIJJ = this.LLILLJJLI;
        c19290810dW.LJIJJLI = this.LLILZ;
        c19290810dW.LJIL = this.LLILZIL;
        c19290810dW.LJIILJJIL();
    }

    public LogLaunchModeTask(Uri uri, String str, String str2, String str3, String str4) {
        this.LL = uri;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}

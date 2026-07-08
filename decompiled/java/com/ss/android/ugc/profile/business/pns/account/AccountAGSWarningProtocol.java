package com.ss.android.ugc.profile.business.pns.account;

import X.C01GW;
import X.C1250210idf;
import X.C20684815ws;
import X.C2344009Gk;
import X.C268330AfP;
import X.C428150Gqb;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1248260iaW;
import X.EnumC428940Grs;
import X.InterfaceC304970BxP;
import Y.ACListenerS85S0300000_19;
import Y.ARunnableS119S0100000_19;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.standard.vm.IProfilePlatformVM;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data.AccountInfoData;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountAGSWarningProtocol extends ProfilePlatformProtocol<AccountInfoData> implements InterfaceC304970BxP, GenericLifecycleObserver {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2086));
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final LifecycleObserver LJJIZ() {
        return this;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "user_account_ags_warning";
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @Override // X.InterfaceC304970BxP
    public final void LIZ() {
        View view = this.LLILZLL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS119S0100000_19(this, 100));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLIIIJILLIZJL() {
        /*
            r6 = this;
            android.view.View r1 = r6.LLILZLL
            if (r1 == 0) goto L9
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L9:
            r3 = 0
            r6.LLJJJJ = r3
            X.01GW r0 = r6.LLJJJIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L57
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r6.LLJILJIL
            if (r0 == 0) goto L57
            android.view.View r0 = r6.LLILZLL
            if (r0 == 0) goto L25
            X.C786410Ut5.LJLLLLLL(r3, r0)
        L25:
            r0 = 1
            r6.LLJJJJ = r0
            X.0ibd r0 = r6.LLIZ
            r5 = 0
            if (r0 == 0) goto L8d
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = r0.LLILLJJLI
            if (r0 == 0) goto L8d
            java.util.List<com.ss.android.ugc.profile.platform.base.data.Action> r0 = r0.actions
            if (r0 == 0) goto L8d
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.android.ugc.profile.platform.base.data.Action r4 = (com.ss.android.ugc.profile.platform.base.data.Action) r4
            if (r4 == 0) goto L8e
            com.ss.android.ugc.profile.platform.base.data.DialogInfo r0 = r4.getDialog()
        L41:
            r1 = 0
            if (r0 == 0) goto L5d
            android.view.View r2 = r6.LLILZLL
            if (r2 == 0) goto L57
            X.0Grs r0 = X.EnumC428940Grs.ALPHA
            X.C428150Gqb.LIZ(r2, r0, r1)
            Y.ACListenerS85S0300000_19 r1 = new Y.ACListenerS85S0300000_19
            r0 = 13
            r1.<init>(r2, r4, r6, r0)
            X.C786410Ut5.I7(r1, r2)
        L57:
            android.view.View r0 = r6.LLILZLL
            r6.LJJLIIIJLJLI(r0)
            return r3
        L5d:
            android.view.View r2 = r6.LLILZLL
            if (r2 == 0) goto L57
            X.0Grs r0 = X.EnumC428940Grs.ALPHA
            X.C428150Gqb.LIZ(r2, r0, r1)
            r0 = 2131386603(0x7f0a60eb, float:1.839367E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L82
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r6.LLJILJIL
            if (r0 == 0) goto L7f
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r0.getDescribe()
            if (r0 == 0) goto L7f
            java.lang.String r5 = r0.getText()
        L7f:
            r1.setText(r5)
        L82:
            Y.ACListenerS122S0200000_19 r1 = new Y.ACListenerS122S0200000_19
            r0 = 25
            r1.<init>(r2, r6, r0)
            X.C786410Ut5.I7(r1, r2)
            goto L57
        L8d:
            r4 = r5
        L8e:
            r0 = r5
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.pns.account.AccountAGSWarningProtocol.LJJLIIIJILLIZJL():boolean");
    }

    public final boolean LJJLL() {
        return ((Boolean) this.LLJJJIL.getValue()).booleanValue() && ComplianceServiceProvider.LJFF().LJIIIIZZ();
    }

    public final void LJL() {
        if (this.LLJJL) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        AccountInfoData accountInfoData = (AccountInfoData) this.LLJILJIL;
        c2344009Gk.LJIIIIZZ("warning_content", LJJLJLI(accountInfoData != null ? accountInfoData.getLearnMoreUrl() : null));
        C20684815ws.LJIILLIIL("tns_profile_page_ags_warning_tag_show", c2344009Gk.LIZ);
        this.LLJJL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLJJJJJIL && !this.LLJJJJLIIL && LJJLL()) {
            LJJZZI();
        } else if (this.LLJJJJJIL && this.LLJJJJ) {
            LJL();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        SettingsManager.LIZLLL().LJIIIZ(this);
        IProfilePlatformVM iProfilePlatformVM = this.LLIZLLLIL;
        if (iProfilePlatformVM != null) {
            iProfilePlatformVM.JQ2(new AwS598S0100000_19(this, 329));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final TextUtils.TruncateAt LJJJJ() {
        if (C268330AfP.LJIIJJI()) {
            return TextUtils.TruncateAt.END;
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJJJJ() {
        return C268330AfP.LIZLLL() ? 71 : null;
    }

    public final void LJJZZI() {
        AgsWarningInfo agsWarningInfoLJ = ComplianceServiceProvider.LJFF().LJ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(agsWarningInfoLJ != null ? Integer.valueOf(agsWarningInfoLJ.warningLevel) : null, "warning_level");
        c2344009Gk.LJIIIIZZ("warning_content", LJJLJLI(agsWarningInfoLJ != null ? agsWarningInfoLJ.detailUrl : null));
        C20684815ws.LJIILLIIL("tns_profile_page_ags_warning_tag_show", c2344009Gk.LIZ);
        this.LLJJJJLIIL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        synchronized (settingsManagerLIZLLL.LIZJ) {
            try {
                ((ArrayList) settingsManagerLIZLLL.LIZJ).remove(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final EnumC1248260iaW LJJIIZI() {
        return EnumC1248260iaW.ICON_TEXT;
    }

    public static String LJJLJLI(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (str != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
            if (!(!a0.LJJJIL(str))) {
                str = null;
            }
            if (str != null) {
                try {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(URLDecoder.decode(str, "UTF-8")), "event_enum");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, "UTF-8")), "event_enum");
                        }
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LJJJLZIJ(n nVar) {
        AccountInfoData accountInfoData;
        try {
            accountInfoData = (AccountInfoData) C1250210idf.LIZ(nVar.toString(), AccountInfoData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            accountInfoData = null;
        }
        this.LLJILJIL = accountInfoData;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        LJJLIIIJILLIZJL();
        return false;
    }

    public final void LJJLIIIJLJLI(View view) {
        String str;
        if (this.LLJJJJ) {
            return;
        }
        if (LJJLL()) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            AgsWarningInfo agsWarningInfoLJ = ComplianceServiceProvider.LJFF().LJ();
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.s0_);
                C428150Gqb.LIZ(view, EnumC428940Grs.ALPHA, 0.0f);
                if (agsWarningInfoLJ != null) {
                    str = agsWarningInfoLJ.warningTitle;
                } else {
                    str = null;
                }
                textView.setText(str);
                C786410Ut5.I7(new ACListenerS85S0300000_19(agsWarningInfoLJ, view, this, 8), view);
                return;
            }
            return;
        }
        if (view == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }
}

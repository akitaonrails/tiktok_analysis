package com.ss.android.ugc.aweme.compliance.api.services.agegate;

import X.C0TGX;
import X.C0X53;
import X.C1238590iKv;
import X.C19249810Sq;
import X.C19257210Vm;
import X.C19EG;
import X.EnumC191814102i;
import X.InterfaceC19256710Vh;
import android.app.Activity;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeFromStoreService;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;

/* JADX INFO: loaded from: classes29.dex */
public interface IAgeGateService {
    EnumC191814102i LIZ();

    String LIZIZ();

    boolean LJFF();

    boolean LJI();

    int LJII();

    void LJIIIIZZ(Activity activity, InterfaceC19256710Vh interfaceC19256710Vh, String str);

    void LJIIIZ(String str);

    Class<?> LJIIJ();

    boolean LJIIJJI(C19249810Sq c19249810Sq, boolean z);

    boolean LJIIL();

    void LJIILIIL(Activity activity, C0X53 c0x53);

    void LJIILJJIL(Activity activity);

    void LJIILL(String str);

    Class LJIILLIIL();

    Class<?> LJIIZILJ();

    void LJIJ(C19EG c19eg, ViewGroup viewGroup, C0TGX c0tgx);

    C19257210Vm LJIJI();

    IPNSAgeFromStoreService LJIJJ();

    void LJIJJLI(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, C1238590iKv c1238590iKv, String str, int i, String str2, int i2, String str3, String str4, String str5, int i3, String str6, int i4, int i5, boolean z);

    void dismiss();

    void displayFeedback(PNSFeedbackModel pNSFeedbackModel);

    boolean isFtcForRegistration();

    void refreshUiModel();
}

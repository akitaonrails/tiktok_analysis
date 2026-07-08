package com.ss.android.ugc.aweme.im.push.api.alerttone.service;

import X.C189200o6;
import X.C891250Yxn;
import X.C891310Yxt;
import X.EnumC2198508jP;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import android.app.Activity;
import android.app.Notification;
import android.net.Uri;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface IMessageAlertToneService {
    public static final C891310Yxt LIZ = C891310Yxt.LIZ;

    Map<String, String> LIZJ(String str, String str2);

    void LIZLLL(Activity activity, String str);

    Object LJ(String str, String str2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void LJFF();

    void LJI();

    void LJII(String str, String str2);

    boolean LJIIIIZZ(String str, MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, String str2, boolean z);

    void LJIIIZ();

    void LJIIJ(List<C891250Yxn> list);

    void LJIIJJI();

    void LJIIL(int i, Notification notification, String str);

    void LJIILIIL(String str, String str2);

    boolean LJIILJJIL(Uri uri, MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, boolean z);

    void LJIILL();

    Object LJIILLIIL(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    Uri LJIIZILJ(String str);

    InterfaceC346201Wa<C189200o6<GetAlertToneResponse>> LJIJ(EnumC2198508jP enumC2198508jP);
}

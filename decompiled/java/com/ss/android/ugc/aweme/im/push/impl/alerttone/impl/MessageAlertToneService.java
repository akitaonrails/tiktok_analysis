package com.ss.android.ugc.aweme.im.push.impl.alerttone.impl;

import X.C01GW;
import X.C069P;
import X.C095D;
import X.C09IC;
import X.C0CNO;
import X.C0PEM;
import X.C0VSJ;
import X.C1074030e3V;
import X.C13LE;
import X.C1495805tM;
import X.C189200o6;
import X.C19328310jZ;
import X.C1ASZ;
import X.C1DFB;
import X.C20101413ky;
import X.C2097608Jq;
import X.C2168508eZ;
import X.C2188811AlT;
import X.C2197508jF;
import X.C2217371BqR;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C799520VXy;
import X.C861640Xr8;
import X.C891040YxS;
import X.C891050YxT;
import X.C891110YxZ;
import X.C891220Yxk;
import X.C891230Yxl;
import X.C891250Yxn;
import X.C893580Z3s;
import X.EnumC1725606pK;
import X.EnumC2198508jP;
import X.InterfaceC1364105Vn;
import X.InterfaceC15516065q;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346201Wa;
import android.app.Activity;
import android.app.Notification;
import android.net.Uri;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.MessageAlert;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.helper.AlertTonePlayer;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageAlertToneService implements IMessageAlertToneService {
    public static final C891040YxS LJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(152));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(151));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 576));

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(MessageAlertToneService.class, "hasInitInAppVibrationDefaultValueByUid", "getHasInitInAppVibrationDefaultValueByUid()Z", 0);
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217371BqR};
        LJ = new C891040YxS();
    }

    public final AlertTonePlayer LIZ() {
        return (AlertTonePlayer) this.LIZLLL.getValue();
    }

    public final void LIZIZ() {
        if (C19328310jZ.LIZIZ.LIZLLL("in_app_im_msg_sound") == 1) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C891220Yxk(this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJIILL() {
        IMContactApi.LIZ.getClass();
        InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
        EnumC1725606pK enumC1725606pK = EnumC1725606pK.MESSAGE_ALERT;
        MessageAlert messageAlert = (MessageAlert) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
        if (messageAlert != null && messageAlert.LIZIZ()) {
            C891050YxT c891050YxT = (C891050YxT) this.LIZJ.getValue();
            EnumC2198508jP enumC2198508jP = EnumC2198508jP.USER;
            c891050YxT.getClass();
            C095D c095d = new C095D(new C2197508jF(enumC2198508jP, c891050YxT, null));
            C1DFB c1dfb = C0PEM.LIZJ;
            C09IC.LJJI(C2296808zG.LIZ(c1dfb), new C861640Xr8(new C891230Yxl(this, null), C09IC.LJIL(c095d, c1dfb)));
        }
        LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJFF() {
        LIZ().LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJIIIZ() {
        AlertTonePlayer alertTonePlayerLIZ = LIZ();
        alertTonePlayerLIZ.getClass();
        IMContactApi.LIZ.getClass();
        InterfaceC15516065q interfaceC15516065qLIZJ = C069P.LIZ().LIZJ();
        EnumC1725606pK enumC1725606pK = EnumC1725606pK.MESSAGE_ALERT;
        MessageAlert messageAlert = (MessageAlert) interfaceC15516065qLIZJ.LJFF(enumC1725606pK, null, null, enumC1725606pK.getAllowUsingLocalStaleValue(), true);
        if (messageAlert == null || !messageAlert.LIZ()) {
            return;
        }
        C0CNO.LIZLLL(0L, new AwS558S0100000_14(alertTonePlayerLIZ, 1420));
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJIIJJI() {
        AlertTonePlayer alertTonePlayerLIZ = LIZ();
        AlertTonePlayer.ForegroundObserverForSilenceSound foregroundObserverForSilenceSound = alertTonePlayerLIZ.LIZLLL;
        if (foregroundObserverForSilenceSound != null) {
            alertTonePlayerLIZ.LIZLLL = null;
            C0CNO.LIZLLL(0L, new AwS557S0100000_13(foregroundObserverForSilenceSound, 120));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJI() {
        LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJIIJ(List<C891250Yxn> list) {
        ArrayList<C891250Yxn> arrayList = new ArrayList();
        for (C891250Yxn c891250Yxn : list) {
            if (c891250Yxn.LIZ.length() > 0) {
                arrayList.add(c891250Yxn);
            }
        }
        for (C891250Yxn c891250Yxn2 : arrayList) {
            ((C20101413ky) this.LIZIZ.getValue()).LIZ(0L, c891250Yxn2.LIZ, c891250Yxn2.LIZIZ, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final Uri LJIIZILJ(String str) {
        AlertTonePlayer alertTonePlayerLIZ = LIZ();
        String strLIZLLL = alertTonePlayerLIZ.LIZ.LIZLLL(str);
        new C0VSJ(strLIZLLL).exists();
        if (new C0VSJ(strLIZLLL).exists()) {
            if (((Boolean) alertTonePlayerLIZ.LJ.getValue()).booleanValue()) {
                if (!alertTonePlayerLIZ.LIZJ(str, null, "", false)) {
                    return null;
                }
            } else if (!alertTonePlayerLIZ.LIZ.LJ(strLIZLLL)) {
                return null;
            }
            return alertTonePlayerLIZ.LIZ();
        }
        alertTonePlayerLIZ.LIZ.LIZ(0L, str, "push_fallback", false);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final InterfaceC346201Wa<C189200o6<GetAlertToneResponse>> LJIJ(EnumC2198508jP enumC2198508jP) {
        C891050YxT c891050YxT = (C891050YxT) this.LIZJ.getValue();
        c891050YxT.getClass();
        return C09IC.LJIL(new C095D(new C2197508jF(enumC2198508jP, c891050YxT, null)), C0PEM.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final Map<String, String> LIZJ(String str, String str2) {
        C1495805tM.LIZ.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("conversation_id", str), new Pair("enter_from", "chat_settings"), new Pair("chat_type", str2));
        mapLJIIJ.putAll(C1495805tM.LIZJ(str, str2));
        return mapLJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LIZLLL(Activity activity, String str) {
        String strLIZ;
        MessageNotificationToneChooseFragment.LLJJIJIL.getClass();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("save_mode", "conversation");
        pairArr[1] = new Pair("conversation_id", str);
        pairArr[2] = new Pair("enter_from_source", "chat_settings");
        C1495805tM.LIZ.getClass();
        IIMAnalyticsUtil.LIZ.getClass();
        IIMAnalyticsUtil iIMAnalyticsUtilLIZ = C893580Z3s.LIZ();
        if (iIMAnalyticsUtilLIZ == null || (strLIZ = iIMAnalyticsUtilLIZ.LIZ(str)) == null) {
            strLIZ = "private";
        }
        pairArr[3] = new Pair("chat_type", strLIZ);
        C1074030e3V.LIZ.LIZJ(activity, MessageNotificationToneChooseFragment.class, C799520VXy.LIZ(pairArr), Integer.MIN_VALUE, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJII(String str, String str2) {
        C1495805tM.LIZ.getClass();
        Map mapLIZIZ = C1495805tM.LIZIZ(str, str2);
        mapLIZIZ.put("enter_from", "chat_settings");
        C1495805tM.LJ("ttsocial_chat_alert_tones_btn_show", mapLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJIILIIL(String str, String str2) {
        C1495805tM.LIZ.getClass();
        Map mapLIZIZ = C1495805tM.LIZIZ(str, str2);
        mapLIZIZ.put("enter_from", "chat_settings");
        C1495805tM.LJ("ttsocial_chat_alert_tones_btn_click", mapLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final Object LJIILLIIL(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C891050YxT c891050YxT = (C891050YxT) this.LIZJ.getValue();
        c891050YxT.getClass();
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2168508eZ(c891050YxT, str, null));
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final Object LJ(String str, String str2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C891050YxT c891050YxT = (C891050YxT) this.LIZJ.getValue();
        c891050YxT.getClass();
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C891110YxZ(str, str2, c891050YxT, null));
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final void LJIIL(int i, Notification notification, String str) {
        AlertTonePlayer alertTonePlayerLIZ = LIZ();
        alertTonePlayerLIZ.getClass();
        C0CNO.LIZLLL(0L, new C1ASZ(alertTonePlayerLIZ, i, notification, str));
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final boolean LJIILJJIL(Uri uri, MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, boolean z) {
        AlertTonePlayer alertTonePlayerLIZ = LIZ();
        alertTonePlayerLIZ.getClass();
        boolean zLIZIZ = alertTonePlayerLIZ.LIZIZ(messageNotificationToneChooseFragment, new AwS593S0100000_14(uri, 256), z);
        if (zLIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playToneByUri() called with: uri = ");
            sbLIZ.append(uri);
            sbLIZ.append(", successfully");
            C2188811AlT.LIZIZ(sbLIZ);
            return zLIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("playToneByUri() called with: uri = ");
        sbLIZ2.append(uri);
        sbLIZ2.append(", error = play error");
        C2188811AlT.LIZIZ(sbLIZ2);
        return zLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService
    public final boolean LJIIIIZZ(String str, MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, String str2, boolean z) {
        return LIZ().LIZJ(str, messageNotificationToneChooseFragment, str2, z);
    }
}

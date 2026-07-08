package com.ss.android.ugc.aweme.account.login.twostep;

import X.AbstractC316870CbV;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0PEM;
import X.C0XQ5;
import X.C0XTR;
import X.C0XZJ;
import X.C1157130gDX;
import X.C123100dR;
import X.C1233650iCx;
import X.C1233670iCz;
import X.C1233680iD0;
import X.C1233750iD7;
import X.C1233760iD8;
import X.C1233790iDB;
import X.C1233820iDE;
import X.C1233960iDS;
import X.C1234050iDb;
import X.C1234110iDh;
import X.C1234120iDi;
import X.C1266120j3K;
import X.C1266140j3M;
import X.C1266160j3O;
import X.C1388190mED;
import X.C15438062q;
import X.C1559260qg8;
import X.C15O7;
import X.C1697810uHb;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2472709mX;
import X.C316640Cb8;
import X.C317290CcB;
import X.C452501pT;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C703302op;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1233840iDG;
import X.EnumC1237810iJf;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC2385309Wh;
import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.BindOrUpdateTOTPResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.PasswordService;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS103S1200000_19;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS1S2211000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepVerificationActivityViewModel extends AssemListViewModel<C1233670iCz, C1233750iD7, Integer> {
    public static final /* synthetic */ int LLJI = 0;
    public boolean LLILZIL;
    public float LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1233680iD0.class, (Class<Object>) "two_step_verification_management_hierarchy_data_key", (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 198));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 199));
    public final TwoStepVerificationService LLILZ = (TwoStepVerificationService) C0XQ5.LIZIZ.LJFF();
    public Map<EnumC1233840iDG, C1233790iDB> LLILZLL = new LinkedHashMap();

    public static Bundle CQ2() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_idv", true);
        C786410Ut5.LJJJI("page", "twosv_setup", bundle);
        C786410Ut5.LJJJI("enter_method", "normal", bundle);
        return bundle;
    }

    public final C1233680iD0 BQ2() {
        return (C1233680iD0) this.LL.getValue();
    }

    public final List<C1233750iD7> DQ2() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<EnumC1233840iDG, C1233790iDB>> it2 = this.LLILZLL.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1233750iD7(it2.next().getValue()));
        }
        return arrayList;
    }

    public final List<String> FQ2() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) this.LLILZLL).entrySet().iterator();
        while (it2.hasNext()) {
            C1233790iDB c1233790iDB = (C1233790iDB) ((Map.Entry) it2.next()).getValue();
            if (c1233790iDB.LJ) {
                arrayList.add(this.LLILZ.getVerifyTypeFromMethod(c1233790iDB.LIZJ));
            }
        }
        return arrayList;
    }

    public final boolean GQ2() {
        AuthDeviceResponse.Data data;
        List<Device> list;
        AuthDeviceResponse previousAuthDeviceListStatus = this.LLILZ.getPreviousAuthDeviceListStatus();
        if (previousAuthDeviceListStatus == null || (data = previousAuthDeviceListStatus.data) == null || (list = data.auth_device) == null) {
            return false;
        }
        Iterator<Device> it2 = list.iterator();
        while (it2.hasNext()) {
            Device next = it2.next();
            if (Intrinsics.LJFF(String.valueOf(next.device_id), DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                return next != null;
            }
        }
        return false;
    }

    public final void LQ2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 2;
        for (Map.Entry entry : ((LinkedHashMap) this.LLILZLL).entrySet()) {
            Object key = entry.getKey();
            C1233790iDB c1233790iDB = (C1233790iDB) entry.getValue();
            linkedHashMap.put(key, c1233790iDB);
            if (!c1233790iDB.LIZ || c1233790iDB.LIZJ == EnumC1233840iDG.TOTP) {
                linkedHashMap.put(key, C1233790iDB.LIZ(c1233790iDB, false, false, null, false, false, 13));
            } else {
                linkedHashMap.put(key, C1233790iDB.LIZ(c1233790iDB, false, false, null, true, false, 13));
                i--;
            }
        }
        this.LLILZLL = linkedHashMap;
        while (i > 0) {
            Map<EnumC1233840iDG, C1233790iDB> map = this.LLILZLL;
            EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.SMS;
            C1233790iDB c1233790iDB2 = (C1233790iDB) ((LinkedHashMap) map).get(enumC1233840iDG);
            if (c1233790iDB2 == null || c1233790iDB2.LJ) {
                Map<EnumC1233840iDG, C1233790iDB> map2 = this.LLILZLL;
                EnumC1233840iDG enumC1233840iDG2 = EnumC1233840iDG.EMAIL;
                C1233790iDB c1233790iDB3 = (C1233790iDB) ((LinkedHashMap) map2).get(enumC1233840iDG2);
                if (c1233790iDB3 != null && !c1233790iDB3.LJ) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.LLILZLL;
                    C1233790iDB c1233790iDB4 = (C1233790iDB) linkedHashMap2.get(enumC1233840iDG2);
                    linkedHashMap2.put(enumC1233840iDG2, c1233790iDB4 != null ? C1233790iDB.LIZ(c1233790iDB4, false, false, null, true, false, 47) : new C1233790iDB(false, false, enumC1233840iDG2, null, true, false, 43));
                }
            } else {
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.LLILZLL;
                C1233790iDB c1233790iDB5 = (C1233790iDB) linkedHashMap3.get(enumC1233840iDG);
                linkedHashMap3.put(enumC1233840iDG, c1233790iDB5 != null ? C1233790iDB.LIZ(c1233790iDB5, false, false, null, true, false, 47) : new C1233790iDB(false, false, null, null, true, false, 47));
            }
            i--;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1233670iCz(0);
    }

    public final String getEnterFrom() {
        return (String) this.LLILLJJLI.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LLILLL.getValue();
    }

    public final void yQ2() {
        setStateImmediate(AFwS257S0000000_19.get$arr$(789));
        this.LLILZ.fetchDeviceName();
        TwoStepAuthApi.LIZIZ().LIZ().LJ(new C1266160j3O(this, 12), C15O7.LJI, null);
        if (HQ2()) {
            this.LLILZ.getAvailableWays().LJ(new C1266160j3O(this, 19), C15O7.LJIIIIZZ, null);
            return;
        }
        AddVerificationResponse twoStepVerificationResponseFromCache = this.LLILZ.getTwoStepVerificationResponseFromCache();
        if (twoStepVerificationResponseFromCache == null) {
            this.LLILZ.getTwoStepStatus(!HQ2()).LJ(new C1266160j3O(this, 5), C15O7.LJIIIIZZ, null);
        } else {
            EQ2(twoStepVerificationResponseFromCache);
            OQ2(twoStepVerificationResponseFromCache);
        }
    }

    public final Bundle zQ2() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", getEnterFrom(), bundle);
        bundle.putBoolean("show_success_toast", false);
        C786410Ut5.LJJJI("page", "twosv_setup", bundle);
        bundle.putBoolean("is_mandatory_two_sv", HQ2());
        if (!this.LLJ) {
            float f = this.LLIZLLLIL + 1.0f;
            this.LLIZLLLIL = f;
            float f2 = this.LLIZ;
            bundle.putInt("progress", f <= f2 ? (int) ((f / f2) * 100) : 100);
        }
        return bundle;
    }

    public final boolean HQ2() {
        return C123100dR.LIZ(BQ2().LL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean IQ2() {
        AddVerificationResponse.Data data;
        AddVerificationResponse.Data data2;
        C1233670iCz c1233670iCz = (C1233670iCz) getState();
        AddVerificationResponse addVerificationResponseLIZ = c1233670iCz.LLILLL.LIZ();
        String str = null;
        if (C123100dR.LIZ((addVerificationResponseLIZ == null || (data2 = addVerificationResponseLIZ.data) == null) ? null : data2.default_verify_way)) {
            return true;
        }
        AddVerificationResponse addVerificationResponseLIZ2 = c1233670iCz.LLILLJJLI.LIZ();
        if (addVerificationResponseLIZ2 != null && (data = addVerificationResponseLIZ2.data) != null) {
            str = data.default_verify_way;
        }
        return C123100dR.LIZ(str);
    }

    public final void JQ2() {
        String str = IQ2() ? "on" : "off";
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = getEnterFrom();
        C1233790iDB c1233790iDB = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.PASSWORD);
        boolean z = c1233790iDB != null ? c1233790iDB.LIZIZ : false;
        C1233790iDB c1233790iDB2 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.SMS);
        boolean z2 = c1233790iDB2 != null ? c1233790iDB2.LIZIZ : false;
        C1233790iDB c1233790iDB3 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.EMAIL);
        boolean z3 = c1233790iDB3 != null ? c1233790iDB3.LIZIZ : false;
        C1233790iDB c1233790iDB4 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.TOTP);
        boolean z4 = c1233790iDB4 != null ? c1233790iDB4.LIZIZ : false;
        c1233960iDS.getClass();
        C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", enterFrom);
        c2344009GkLIZ.LJIIIIZZ("page_type", str);
        c2344009GkLIZ.LJ(Boolean.valueOf(z), "is_pw_turned_on");
        c2344009GkLIZ.LJ(Boolean.valueOf(z2), "is_sms_turned_on");
        c2344009GkLIZ.LJ(Boolean.valueOf(z3), "is_email_turned_on");
        c2344009GkLIZ.LJ(Boolean.valueOf(z4), "is_totp_turned_on");
        C20684815ws.LJIILLIIL("twosv_click_learn_more", c2344009GkLIZ.LIZ);
    }

    public final void EQ2(AddVerificationResponse addVerificationResponse) {
        List<VerifyWay> list;
        boolean z;
        boolean z2;
        User userLIZJ = C0XQ5.LIZJ();
        AddVerificationResponse.Data data = addVerificationResponse.data;
        if (data != null && (list = data.two_step_verify_ways) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<VerifyWay> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().verify_way);
            }
            if (arrayList.contains("mobile_sms_verify")) {
                Map<EnumC1233840iDG, C1233790iDB> map = this.LLILZLL;
                EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.SMS;
                if (userLIZJ.isPhoneBinded() && C703302op.LIZ(userLIZJ.getBindPhone())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                map.put(enumC1233840iDG, new C1233790iDB(z2, false, null, userLIZJ.getBindPhone(), false, false, 54));
            }
            if (arrayList.contains("email_verify")) {
                Map<EnumC1233840iDG, C1233790iDB> map2 = this.LLILZLL;
                EnumC1233840iDG enumC1233840iDG2 = EnumC1233840iDG.EMAIL;
                if (userLIZJ.isHasEmail() && userLIZJ.isEmailVerified() && C703302op.LIZ(userLIZJ.getEmail())) {
                    z = true;
                } else {
                    z = false;
                }
                map2.put(enumC1233840iDG2, new C1233790iDB(z, false, enumC1233840iDG2, userLIZJ.getEmail(), false, false, 50));
            }
            if (arrayList.contains("totp_verify")) {
                Map<EnumC1233840iDG, C1233790iDB> map3 = this.LLILZLL;
                EnumC1233840iDG enumC1233840iDG3 = EnumC1233840iDG.TOTP;
                map3.put(enumC1233840iDG3, new C1233790iDB(false, false, enumC1233840iDG3, null, false, false, 59));
            }
            if (arrayList.contains("pwd_verify") && !Intrinsics.LJFF(addVerificationResponse.data.isPasskeySignupAccount(), Boolean.TRUE)) {
                Map<EnumC1233840iDG, C1233790iDB> map4 = this.LLILZLL;
                EnumC1233840iDG enumC1233840iDG4 = EnumC1233840iDG.PASSWORD;
                C0XQ5.LIZ();
                map4.put(enumC1233840iDG4, new C1233790iDB(AbstractC848400XPy.LJJIJIIJIL(), false, enumC1233840iDG4, null, false, false, 58));
            }
        }
    }

    public final void NQ2(AddVerificationResponse addVerificationResponse) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.LLILZ.setTwoStepVerificationResponseToCache(addVerificationResponse);
        AddVerificationResponse.Data data = addVerificationResponse.data;
        Integer num = null;
        if (data != null) {
            str = data.default_verify_way;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TQ2(addVerificationResponse);
        } else {
            LQ2();
        }
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = getEnterFrom();
        C1233790iDB c1233790iDB = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.PASSWORD);
        if (c1233790iDB != null) {
            z = c1233790iDB.LJ;
        } else {
            z = false;
        }
        C1233790iDB c1233790iDB2 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.SMS);
        if (c1233790iDB2 != null) {
            z2 = c1233790iDB2.LJ;
        } else {
            z2 = false;
        }
        C1233790iDB c1233790iDB3 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.EMAIL);
        if (c1233790iDB3 != null) {
            z3 = c1233790iDB3.LJ;
        } else {
            z3 = false;
        }
        C1233790iDB c1233790iDB4 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.TOTP);
        if (c1233790iDB4 != null) {
            z4 = c1233790iDB4.LJ;
        } else {
            z4 = false;
        }
        C1233650iCx c1233650iCx = BQ2().LLILZ;
        if (c1233650iCx != null) {
            num = c1233650iCx.LJII;
        }
        c1233960iDS.getClass();
        C1233960iDS.LJI(addVerificationResponse, enterFrom, z, z2, z3, z4, num);
        withState(new AwS385S0200000_19(this, addVerificationResponse, 13));
        this.LLILZIL = false;
    }

    public final void OQ2(AddVerificationResponse addVerificationResponse) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        AddVerificationResponse.Data data;
        if (addVerificationResponse != null) {
            this.LLILZ.setTwoStepVerificationResponseToCache(addVerificationResponse);
        }
        if (addVerificationResponse != null && (data = addVerificationResponse.data) != null) {
            str = data.default_verify_way;
        } else {
            str = null;
        }
        boolean z4 = false;
        if (str != null && str.length() != 0) {
            TQ2(addVerificationResponse);
        } else {
            LQ2();
        }
        if (addVerificationResponse != null && !this.LLILZIL) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = getEnterFrom();
            C1233790iDB c1233790iDB = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.PASSWORD);
            if (c1233790iDB != null) {
                z = c1233790iDB.LJ;
            } else {
                z = false;
            }
            C1233790iDB c1233790iDB2 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.SMS);
            if (c1233790iDB2 != null) {
                z2 = c1233790iDB2.LJ;
            } else {
                z2 = false;
            }
            C1233790iDB c1233790iDB3 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.EMAIL);
            if (c1233790iDB3 != null) {
                z3 = c1233790iDB3.LJ;
            } else {
                z3 = false;
            }
            C1233790iDB c1233790iDB4 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.TOTP);
            if (c1233790iDB4 != null) {
                z4 = c1233790iDB4.LJ;
            }
            C1233650iCx c1233650iCx = BQ2().LLILZ;
            if (c1233650iCx != null) {
                num = c1233650iCx.LJII;
            } else {
                num = null;
            }
            c1233960iDS.getClass();
            C1233960iDS.LJI(addVerificationResponse, enterFrom, z, z2, z3, z4, num);
        }
        withState(new AwS385S0200000_19(this, addVerificationResponse, 14));
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1233760iD8(this, null), 3);
    }

    public final void SQ2(EnumC1233840iDG enumC1233840iDG) {
        User userLIZJ = C0XQ5.LIZJ();
        int i = C1233820iDE.LIZ[enumC1233840iDG.ordinal()];
        Activity activityLIZ = null;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    PasswordService passwordServiceLJIIJJI = C0XQ5.LIZIZ.LJIIJJI();
                    Context context = BQ2().LLILLL;
                    if (context != null) {
                        activityLIZ = C1388190mED.LIZ(context);
                    }
                    String enterFrom = getEnterFrom();
                    String enterMethod = getEnterMethod();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("show_success_toast", false);
                    passwordServiceLJIIJJI.changePassword(activityLIZ, enterFrom, enterMethod, bundle, new C1266140j3M(this, 0));
                    return;
                }
                C1233960iDS c1233960iDS = C1233960iDS.LIZ;
                String enterFrom2 = getEnterFrom();
                c1233960iDS.getClass();
                C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
                c2344009GkLIZ.LJIIIIZZ("enter_from", enterFrom2);
                c2344009GkLIZ.LJIIIIZZ("popup_type", "totp");
                c2344009GkLIZ.LJIIIIZZ("click_button", "update");
                C20684815ws.LJIILLIIL("twosv_setup_update_confirmation_click", c2344009GkLIZ.LIZ);
                PQ2("update", new AwS598S0100000_19(this, 76), true);
                return;
            }
            setStateImmediate(AFwS257S0000000_19.get$arr$(788));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1234120iDi(this, enumC1233840iDG, userLIZJ, null), 2);
            return;
        }
        setStateImmediate(AFwS257S0000000_19.get$arr$(788));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C1234110iDh(this, enumC1233840iDG, userLIZJ, null), 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void TQ2(AddVerificationResponse addVerificationResponse) {
        AddVerificationResponse.Data data;
        List<VerifyWay> list;
        C1233790iDB c1233790iDB;
        C1233790iDB c1233790iDB2;
        C1233790iDB c1233790iDB3;
        C1233790iDB c1233790iDB4;
        if (addVerificationResponse != null && (data = addVerificationResponse.data) != null && (list = data.two_step_verify_ways) != null) {
            for (VerifyWay verifyWay : list) {
                Boolean boolIs_available = verifyWay.is_available();
                Boolean bool = Boolean.TRUE;
                boolean zLJFF = Intrinsics.LJFF(boolIs_available, bool);
                String str = verifyWay.verify_way;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -797498437:
                            if (str.equals("pwd_verify") && !Intrinsics.LJFF(addVerificationResponse.data.isPasskeySignupAccount(), bool)) {
                                Map<EnumC1233840iDG, C1233790iDB> map = this.LLILZLL;
                                EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.PASSWORD;
                                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                                C1233790iDB c1233790iDB5 = (C1233790iDB) linkedHashMap.get(enumC1233840iDG);
                                if (c1233790iDB5 != null) {
                                    c1233790iDB = C1233790iDB.LIZ(c1233790iDB5, false, zLJFF, null, false, true, 29);
                                } else {
                                    c1233790iDB = new C1233790iDB(false, zLJFF, enumC1233840iDG, null, false, true, 25);
                                }
                                linkedHashMap.put(enumC1233840iDG, c1233790iDB);
                            }
                            break;
                        case 300626556:
                            if (str.equals("email_verify")) {
                                Map<EnumC1233840iDG, C1233790iDB> map2 = this.LLILZLL;
                                EnumC1233840iDG enumC1233840iDG2 = EnumC1233840iDG.EMAIL;
                                LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                                C1233790iDB c1233790iDB6 = (C1233790iDB) linkedHashMap2.get(enumC1233840iDG2);
                                if (c1233790iDB6 != null) {
                                    c1233790iDB2 = C1233790iDB.LIZ(c1233790iDB6, false, zLJFF, null, false, true, 29);
                                } else {
                                    c1233790iDB2 = new C1233790iDB(false, zLJFF, enumC1233840iDG2, null, false, true, 25);
                                }
                                linkedHashMap2.put(enumC1233840iDG2, c1233790iDB2);
                            }
                            break;
                        case 312290780:
                            if (str.equals("mobile_sms_verify")) {
                                Map<EnumC1233840iDG, C1233790iDB> map3 = this.LLILZLL;
                                EnumC1233840iDG enumC1233840iDG3 = EnumC1233840iDG.SMS;
                                LinkedHashMap linkedHashMap3 = (LinkedHashMap) map3;
                                C1233790iDB c1233790iDB7 = (C1233790iDB) linkedHashMap3.get(enumC1233840iDG3);
                                if (c1233790iDB7 != null) {
                                    c1233790iDB3 = C1233790iDB.LIZ(c1233790iDB7, false, zLJFF, null, false, true, 29);
                                } else {
                                    c1233790iDB3 = new C1233790iDB(false, zLJFF, null, null, false, true, 29);
                                }
                                linkedHashMap3.put(enumC1233840iDG3, c1233790iDB3);
                            }
                            break;
                        case 1972338561:
                            if (str.equals("totp_verify")) {
                                Map<EnumC1233840iDG, C1233790iDB> map4 = this.LLILZLL;
                                EnumC1233840iDG enumC1233840iDG4 = EnumC1233840iDG.TOTP;
                                LinkedHashMap linkedHashMap4 = (LinkedHashMap) map4;
                                C1233790iDB c1233790iDB8 = (C1233790iDB) linkedHashMap4.get(enumC1233840iDG4);
                                if (c1233790iDB8 != null) {
                                    c1233790iDB4 = C1233790iDB.LIZ(c1233790iDB8, false, zLJFF, null, false, true, 29);
                                } else {
                                    c1233790iDB4 = new C1233790iDB(false, zLJFF, enumC1233840iDG4, null, false, true, 25);
                                }
                                linkedHashMap4.put(enumC1233840iDG4, c1233790iDB4);
                            }
                            break;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1233750iD7> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 75));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(0, interfaceC1364105Vn);
    }

    public final void KQ2(final EnumC1233840iDG enumC1233840iDG, final String str) {
        this.LLILZIL = true;
        setStateImmediate(AFwS257S0000000_19.get$arr$(788));
        final String verifyTypeFromMethod = this.LLILZ.getVerifyTypeFromMethod(enumC1233840iDG);
        TwoStepAuthApi.LIZIZ().removeVerificationV2(verifyTypeFromMethod).LJ(new InterfaceC2385309Wh() { // from class: X.0iDQ
            /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
            @Override // X.InterfaceC2385309Wh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object then(X.C15O7<com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse> r22) {
                /*
                    Method dump skipped, instruction units count: 334
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1233940iDQ.then(X.15O7):java.lang.Object");
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public final void RQ2(EnumC1233840iDG enumC1233840iDG, boolean z) {
        List<String> listFQ2;
        C1233790iDB c1233790iDB;
        if (Intrinsics.LJFF("mandatory_popup", getEnterFrom()) || Intrinsics.LJFF("nudge_popup", getEnterFrom())) {
            C1233960iDS.LIZ.getClass();
            C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
            c2344009GkLIZ.LJIIIIZZ("result", "turn_on");
            C20684815ws.LJIILLIIL("submit_2sv_mandatory_enrollment", c2344009GkLIZ.LIZ);
        }
        Map<EnumC1233840iDG, C1233790iDB> map = this.LLILZLL;
        EnumC1233840iDG enumC1233840iDG2 = EnumC1233840iDG.TOTP;
        C1233790iDB c1233790iDB2 = (C1233790iDB) ((LinkedHashMap) map).get(enumC1233840iDG2);
        if (c1233790iDB2 != null && c1233790iDB2.LJ) {
            this.LLILZLL.put(enumC1233840iDG2, C1233790iDB.LIZ(c1233790iDB2, false, false, null, false, false, 62));
        }
        if (enumC1233840iDG != null && ((LinkedHashMap) this.LLILZLL).get(enumC1233840iDG) != null && (c1233790iDB = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(enumC1233840iDG)) != null) {
            listFQ2 = C1697810uHb.LJIILJJIL(this.LLILZ.getVerifyTypeFromMethod(c1233790iDB.LIZJ));
        } else {
            listFQ2 = FQ2();
        }
        this.LLJ = z;
        vQ2("trusted_environment", null, listFQ2, false);
    }

    public final void UQ2(String str, Function1 function1) {
        boolean z;
        boolean z2;
        String str2;
        String str3;
        User userLIZJ = C0XQ5.LIZJ();
        C1233790iDB c1233790iDB = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.PASSWORD);
        if (c1233790iDB != null && c1233790iDB.LIZ) {
            z = true;
        } else {
            z = false;
        }
        Activity activityLIZ = null;
        if (z) {
            PasswordService passwordServiceLJIIJJI = C0XQ5.LIZIZ.LJIIJJI();
            Context context = BQ2().LLILLL;
            if (context != null) {
                activityLIZ = C1388190mED.LIZ(context);
            }
            String enterFrom = getEnterFrom();
            Bundle bundleCQ2 = CQ2();
            if (HQ2()) {
                bundleCQ2.putInt("current_scene", EnumC852660Xce.VERIFY_ACCOUNT_FROM_2SV.getValue());
            }
            passwordServiceLJIIJJI.verifyPassword(activityLIZ, enterFrom, bundleCQ2, new C1266120j3K(this, function1, 6));
            return;
        }
        Map<EnumC1233840iDG, C1233790iDB> map = this.LLILZLL;
        EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.SMS;
        C1233790iDB c1233790iDB2 = (C1233790iDB) ((LinkedHashMap) map).get(enumC1233840iDG);
        if (c1233790iDB2 != null && c1233790iDB2.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str4 = "";
        if (z2) {
            if (HQ2()) {
                BindService bindServiceLIZIZ = C0XQ5.LIZIZ();
                Context context2 = BQ2().LLILLL;
                if (context2 != null) {
                    activityLIZ = C1388190mED.LIZ(context2);
                }
                String enterFrom2 = getEnterFrom();
                String enterMethod = getEnterMethod();
                C1233790iDB c1233790iDB3 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(enumC1233840iDG);
                if (c1233790iDB3 != null && (str3 = c1233790iDB3.LIZLLL) != null) {
                    str4 = str3;
                }
                bindServiceLIZIZ.verifyMobileWithWorkflowTokenForTicket(activityLIZ, enterFrom2, enterMethod, str4, CQ2(), new C1266120j3K(this, function1, 7));
                return;
            }
            BindService bindServiceLIZIZ2 = C0XQ5.LIZIZ();
            Context context3 = BQ2().LLILLL;
            if (context3 != null) {
                activityLIZ = C1388190mED.LIZ(context3);
            }
            bindServiceLIZIZ2.verifyMobileForTicket(activityLIZ, getEnterFrom(), getEnterMethod(), CQ2(), new C1266120j3K(this, function1, 8));
            return;
        }
        if (!userLIZJ.isHasEmail()) {
            C1233790iDB c1233790iDB4 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.EMAIL);
            if (c1233790iDB4 == null || !c1233790iDB4.LIZ) {
                function1.invoke(new C1234050iDb(str, "oauth_verify"));
                return;
            }
        }
        if (HQ2()) {
            BindService bindServiceLIZIZ3 = C0XQ5.LIZIZ();
            Context context4 = BQ2().LLILLL;
            if (context4 != null) {
                activityLIZ = C1388190mED.LIZ(context4);
            }
            String enterFrom3 = getEnterFrom();
            String enterMethod2 = getEnterMethod();
            C1233790iDB c1233790iDB5 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.EMAIL);
            if (c1233790iDB5 != null && (str2 = c1233790iDB5.LIZLLL) != null) {
                str4 = str2;
            }
            bindServiceLIZIZ3.verifyEmailWithWorkflowTokenForTicket(activityLIZ, enterFrom3, enterMethod2, str4, CQ2(), new C1266120j3K(this, function1, 9));
            return;
        }
        BindService bindServiceLIZIZ4 = C0XQ5.LIZIZ();
        Context context5 = BQ2().LLILLL;
        if (context5 != null) {
            activityLIZ = C1388190mED.LIZ(context5);
        }
        bindServiceLIZIZ4.verifyEmailForTicket(activityLIZ, getEnterFrom(), getEnterMethod(), CQ2(), new C1266120j3K(this, function1, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object onLoadMore(int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C1233670iCz c1233670iCz = (C1233670iCz) getState();
        c1233670iCz.getClass();
        List listLIZ = C627260Oiy.LIZ(c1233670iCz);
        if (listLIZ == null) {
            listLIZ = new ArrayList();
        }
        c317290CcB.getClass();
        return new C316640Cb8(listLIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }

    public static C0XZJ AQ2(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Integer num, String str) {
        int iIntValue;
        String str2 = str;
        twoStepVerificationActivityViewModel.getClass();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -2;
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C0XZJ(iIntValue, str2, EnumC852660Xce.NONE, EnumC852910Xd3.NONE, null, "");
    }

    public final void PQ2(final String str, final Function1 function1, final boolean z) {
        C2472709mX c2472709mX;
        C15O7<BindOrUpdateTOTPResponse> c15o7RegisterTotp;
        if (z) {
            C844470XAv.LIZ.getClass();
            c2472709mX = null;
            c15o7RegisterTotp = TwoStepAuthApi.LIZIZ().updateTotp(C844470XAv.LJIIJ, CastLongProtector.parseLong(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()), null, TwoStepAuthApi.LJ("/passport/totp/update/"));
        } else {
            C844470XAv.LIZ.getClass();
            c2472709mX = null;
            c15o7RegisterTotp = TwoStepAuthApi.LIZIZ().registerTotp(C844470XAv.LJIIJ, CastLongProtector.parseLong(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()), null, TwoStepAuthApi.LJ("/passport/totp/register/v2/"));
        }
        c15o7RegisterTotp.LJ(new InterfaceC2385309Wh() { // from class: X.0iDH
            public final /* synthetic */ String LIZJ = null;

            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<BindOrUpdateTOTPResponse> c15o7) {
                int iIntValue;
                String str2;
                String string;
                Integer num;
                BindOrUpdateTOTPResponse.RegisterData registerData;
                C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.bindOrUpdateTOTP$1");
                Activity activityLIZ = null;
                if (!C09UZ.LIZLLL(c15o7)) {
                    if (c15o7.LJIIJJI() instanceof C1494450ozb) {
                        TwoStepVerificationActivityViewModel.xQ2(this.LIZ, Integer.valueOf(C0XWH.LIZ(c15o7.LJIIJJI())), null, 6);
                    } else {
                        TwoStepVerificationActivityViewModel.xQ2(this.LIZ, null, null, 7);
                    }
                    C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.bindOrUpdateTOTP$1");
                    return null;
                }
                BindOrUpdateTOTPResponse bindOrUpdateTOTPResponseLJIIL = c15o7.LJIIL();
                String str3 = "";
                if (u.LJIJI("success", bindOrUpdateTOTPResponseLJIIL.message, true) && (registerData = bindOrUpdateTOTPResponseLJIIL.data) != null) {
                    String str4 = registerData.totpSecret;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = registerData.totpKeyUri;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    if (z) {
                        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = this.LIZ;
                        String str6 = str;
                        Function1<String, Unit> function12 = function1;
                        twoStepVerificationActivityViewModel.getClass();
                        BindService bindServiceLIZIZ = C0XQ5.LIZIZ();
                        Context context = twoStepVerificationActivityViewModel.BQ2().LLILLL;
                        if (context != null) {
                            activityLIZ = C1388190mED.LIZ(context);
                        }
                        String enterFrom = twoStepVerificationActivityViewModel.getEnterFrom();
                        Bundle bundleZQ2 = twoStepVerificationActivityViewModel.zQ2();
                        C786410Ut5.LJJJI("totp_secret", str4, bundleZQ2);
                        C786410Ut5.LJJJI("totp_key_uri", str3, bundleZQ2);
                        bindServiceLIZIZ.updateTOTP(activityLIZ, enterFrom, str6, bundleZQ2, new C1266120j3K(twoStepVerificationActivityViewModel, function12, 4));
                    } else {
                        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2 = this.LIZ;
                        Function1<String, Unit> function13 = function1;
                        twoStepVerificationActivityViewModel2.getClass();
                        BindService bindServiceLIZIZ2 = C0XQ5.LIZIZ();
                        Context context2 = twoStepVerificationActivityViewModel2.BQ2().LLILLL;
                        if (context2 != null) {
                            activityLIZ = C1388190mED.LIZ(context2);
                        }
                        String enterFrom2 = twoStepVerificationActivityViewModel2.getEnterFrom();
                        String enterMethod = twoStepVerificationActivityViewModel2.getEnterMethod();
                        Bundle bundleZQ22 = twoStepVerificationActivityViewModel2.zQ2();
                        C786410Ut5.LJJJI("totp_secret", str4, bundleZQ22);
                        C786410Ut5.LJJJI("totp_key_uri", str3, bundleZQ22);
                        bindServiceLIZIZ2.bindTOTP(activityLIZ, enterFrom2, enterMethod, bundleZQ22, new C1266120j3K(twoStepVerificationActivityViewModel2, function13, 3));
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.bindOrUpdateTOTP$1");
                    return unit;
                }
                BindOrUpdateTOTPResponse.RegisterData registerData2 = bindOrUpdateTOTPResponseLJIIL.data;
                if (registerData2 != null && (num = registerData2.errorCode) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -2;
                }
                Context context3 = this.LIZ.BQ2().LLILLL;
                if (context3 != null && (string = context3.getString(2131850706)) != null) {
                    str3 = string;
                }
                if (1366 == iIntValue) {
                    TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel3 = this.LIZ;
                    String str7 = str;
                    String str8 = this.LIZJ;
                    Function1<String, Unit> function14 = function1;
                    twoStepVerificationActivityViewModel3.getClass();
                    BindService bindServiceLIZIZ3 = C0XQ5.LIZIZ();
                    Context context4 = twoStepVerificationActivityViewModel3.BQ2().LLILLL;
                    if (context4 != null) {
                        activityLIZ = C1388190mED.LIZ(context4);
                    }
                    String enterFrom3 = twoStepVerificationActivityViewModel3.getEnterFrom();
                    Bundle bundleZQ23 = twoStepVerificationActivityViewModel3.zQ2();
                    if (str8 != null) {
                        C786410Ut5.LJJJI("ticket", str8, bundleZQ23);
                    }
                    bindServiceLIZIZ3.verifyTOTP(activityLIZ, enterFrom3, str7, bundleZQ23, new C1266120j3K(twoStepVerificationActivityViewModel3, function14, 5));
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.bindOrUpdateTOTP$1");
                    return unit2;
                }
                if (2135 == iIntValue) {
                    TwoStepVerificationActivityViewModel.xQ2(this.LIZ, 0, null, 6);
                    C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.bindOrUpdateTOTP$1");
                    return null;
                }
                if (3101 == iIntValue) {
                    TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel4 = this.LIZ;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    BindOrUpdateTOTPResponse.RegisterData registerData3 = bindOrUpdateTOTPResponseLJIIL.data;
                    if (registerData3 != null) {
                        str2 = registerData3.description;
                    } else {
                        str2 = null;
                    }
                    TwoStepVerificationActivityViewModel.xQ2(twoStepVerificationActivityViewModel4, numValueOf, str2, 4);
                    C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.bindOrUpdateTOTP$1");
                    return null;
                }
                TwoStepVerificationActivityViewModel.xQ2(this.LIZ, Integer.valueOf(iIntValue), C849760XVe.LIZIZ(Integer.valueOf(iIntValue), str3), 4);
                C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.bindOrUpdateTOTP$1");
                return null;
            }
        }, C15O7.LJIIIIZZ, c2472709mX);
    }

    public static void MQ2(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        twoStepVerificationActivityViewModel.getClass();
        twoStepVerificationActivityViewModel.setState(new AwS103S1200000_19(twoStepVerificationActivityViewModel, num, str, 14));
    }

    public static void xQ2(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        twoStepVerificationActivityViewModel.getClass();
        twoStepVerificationActivityViewModel.withState(new AwS103S1200000_19(twoStepVerificationActivityViewModel, num, str, 16));
    }

    public final void vQ2(String str, String str2, List list, boolean z) {
        String str3;
        String str4;
        String email;
        setStateImmediate(AFwS257S0000000_19.get$arr$(788));
        if (BQ2().LLILZ == null) {
            str3 = null;
        } else {
            str3 = "confirm";
        }
        int i = !IQ2() ? 1 : 0;
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        if (IQ2()) {
            str4 = "on";
        } else {
            str4 = "off";
        }
        boolean zGQ2 = GQ2();
        String enterFrom = getEnterFrom();
        c1233960iDS.getClass();
        C1233960iDS.LIZJ(str4, enterFrom, zGQ2, str3, list);
        User userLIZJ = C0XQ5.LIZJ();
        this.LLIZ = 1.0f;
        this.LLIZLLLIL = 0.0f;
        C1233790iDB c1233790iDB = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.SMS);
        if (c1233790iDB == null || !c1233790iDB.LIZ) {
            this.LLIZ += 1.0f;
        }
        C1233790iDB c1233790iDB2 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.EMAIL);
        if ((c1233790iDB2 == null || !c1233790iDB2.LIZ) && (list.contains("email_verify") || !userLIZJ.isHasEmail() || (email = userLIZJ.getEmail()) == null || email.length() == 0 || HQ2())) {
            this.LLIZ += 1.0f;
        }
        if (list.contains("pwd_verify")) {
            C1233790iDB c1233790iDB3 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.PASSWORD);
            if (c1233790iDB3 == null || !c1233790iDB3.LIZ) {
                this.LLIZ += 1.0f;
            }
        }
        if (list.contains("totp_verify")) {
            C1233790iDB c1233790iDB4 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.TOTP);
            if (c1233790iDB4 == null || !c1233790iDB4.LIZ) {
                this.LLIZ += 1.0f;
            }
        }
        wQ2(str, str2, list, z, i);
    }

    public final void wQ2(String str, String str2, final List list, boolean z, int i) {
        Activity activityLIZ;
        String email;
        if (list.contains("mobile_sms_verify")) {
            Map<EnumC1233840iDG, C1233790iDB> map = this.LLILZLL;
            EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.SMS;
            C1233790iDB c1233790iDB = (C1233790iDB) ((LinkedHashMap) map).get(enumC1233840iDG);
            if (c1233790iDB == null || !c1233790iDB.LIZ) {
                QQ2(z, str, enumC1233840iDG, str2, list, i);
                return;
            }
        }
        if (list.contains("email_verify")) {
            Map<EnumC1233840iDG, C1233790iDB> map2 = this.LLILZLL;
            EnumC1233840iDG enumC1233840iDG2 = EnumC1233840iDG.EMAIL;
            C1233790iDB c1233790iDB2 = (C1233790iDB) ((LinkedHashMap) map2).get(enumC1233840iDG2);
            if (c1233790iDB2 == null || !c1233790iDB2.LIZ) {
                QQ2(z, str, enumC1233840iDG2, str2, list, i);
                return;
            }
        }
        if (list.contains("pwd_verify")) {
            Map<EnumC1233840iDG, C1233790iDB> map3 = this.LLILZLL;
            EnumC1233840iDG enumC1233840iDG3 = EnumC1233840iDG.PASSWORD;
            C1233790iDB c1233790iDB3 = (C1233790iDB) ((LinkedHashMap) map3).get(enumC1233840iDG3);
            if (c1233790iDB3 == null || !c1233790iDB3.LIZ) {
                QQ2(z, str, enumC1233840iDG3, str2, list, i);
                return;
            }
        }
        if (list.contains("totp_verify")) {
            Map<EnumC1233840iDG, C1233790iDB> map4 = this.LLILZLL;
            EnumC1233840iDG enumC1233840iDG4 = EnumC1233840iDG.TOTP;
            C1233790iDB c1233790iDB4 = (C1233790iDB) ((LinkedHashMap) map4).get(enumC1233840iDG4);
            if (c1233790iDB4 == null || !c1233790iDB4.LIZ) {
                QQ2(z, str, enumC1233840iDG4, str2, list, i);
                return;
            }
        }
        final AwS1S2211000_19 awS1S2211000_19 = new AwS1S2211000_19(i, this, str2, str, list, z, 1);
        User userLIZJ = C0XQ5.LIZJ();
        C1233790iDB c1233790iDB5 = (C1233790iDB) ((LinkedHashMap) this.LLILZLL).get(EnumC1233840iDG.EMAIL);
        if ((c1233790iDB5 != null && c1233790iDB5.LIZ) || (userLIZJ.isHasEmail() && (email = userLIZJ.getEmail()) != null && email.length() != 0 && !HQ2())) {
            awS1S2211000_19.invoke();
            return;
        }
        BindService bindServiceLIZIZ = C0XQ5.LIZIZ();
        Context context = BQ2().LLILLL;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        String enterFrom = getEnterFrom();
        String enterMethod = getEnterMethod();
        Bundle bundleZQ2 = zQ2();
        bundleZQ2.putBoolean("show_success_toast", false);
        bundleZQ2.putBoolean("show_skip", true);
        bundleZQ2.putInt("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_TWO_STEP_VERIFICATION.getValue());
        bindServiceLIZIZ.bindEmail(activityLIZ, enterFrom, enterMethod, bundleZQ2, true, new C0XTR() { // from class: X.0iDL
            @Override // X.C0XTR
            public final void onResult(int i2, int i3, Object obj) {
                C1233790iDB c1233790iDB6;
                BaseBundle baseBundle;
                if (i3 == 1) {
                    String string = null;
                    if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null) {
                        string = baseBundle.getString("bound_email");
                    }
                    Map<EnumC1233840iDG, C1233790iDB> map5 = this.LIZ.LLILZLL;
                    EnumC1233840iDG enumC1233840iDG5 = EnumC1233840iDG.EMAIL;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map5;
                    C1233790iDB c1233790iDB7 = (C1233790iDB) linkedHashMap.get(enumC1233840iDG5);
                    if (c1233790iDB7 != null) {
                        c1233790iDB6 = C1233790iDB.LIZ(c1233790iDB7, true, false, string, false, false, 54);
                    } else {
                        c1233790iDB6 = new C1233790iDB(true, false, enumC1233840iDG5, string, false, false, 50);
                    }
                    linkedHashMap.put(enumC1233840iDG5, c1233790iDB6);
                    list.add("email_verify");
                }
                awS1S2211000_19.invoke();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void QQ2(final boolean r23, final java.lang.String r24, final X.EnumC1233840iDG r25, final java.lang.String r26, final java.util.List<java.lang.String> r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel.QQ2(boolean, java.lang.String, X.0iDG, java.lang.String, java.util.List, int):void");
    }
}

package com.ss.android.ugc.aweme.account.login.utils;

import X.C09CT;
import X.C0C76;
import X.C2188811AlT;
import X.C837920Wty;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IDebugConfig;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class PhoneNumberUtil {

    public static class PhoneNumber implements Serializable {

        @C09CT("countryIso_")
        public String countryIso_ = C837920Wty.LIZIZ(Locale.CHINA);

        @C09CT("rawInput_")
        public String rawInput_ = "";

        @C09CT("countryCode_")
        public int countryCode_ = 86;

        @C09CT("nationalNumber_")
        public String nationalNumber_ = "";

        public static PhoneNumber createEmptyPhoneNumber() {
            return create(0, "");
        }

        public int getCountryCode() {
            return this.countryCode_;
        }

        public String getCountryIso() {
            return this.countryIso_;
        }

        public String getNationalNumber() {
            return this.nationalNumber_;
        }

        public PhoneNumber setCountryCode(int i) {
            this.countryCode_ = i;
            return this;
        }

        public void setCountryIso(String str) {
            this.countryIso_ = str;
        }

        public PhoneNumber setNationalNumber(String str) {
            this.nationalNumber_ = str;
            return this;
        }

        public static PhoneNumber create(int i, String str) {
            PhoneNumber phoneNumber = new PhoneNumber();
            phoneNumber.setCountryCode(i);
            phoneNumber.setNationalNumber(str);
            return phoneNumber;
        }
    }

    public static String LIZ(PhoneNumber phoneNumber) {
        if (phoneNumber == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("+");
        sbLIZ.append(phoneNumber.getCountryCode());
        sbLIZ.append(" ");
        sbLIZ.append(phoneNumber.getNationalNumber());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iIndexOf = str.indexOf(" ");
        if (!str.startsWith("+") || iIndexOf <= 0) {
            return "";
        }
        return str.substring(1, iIndexOf);
    }

    public static String LIZJ(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iIndexOf = str.indexOf(" ");
        if (str.startsWith("+") && iIndexOf > 0 && (i = iIndexOf + 1) < str.length()) {
            return str.substring(i);
        }
        return str;
    }

    public static PhoneNumber LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Integer numValueOf = CastIntegerProtector.valueOf(LIZIZ(str));
            return PhoneNumber.create(numValueOf.intValue(), LIZJ(str));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LJ(PhoneNumber phoneNumber) {
        long j;
        if (phoneNumber.getCountryCode() == 86) {
            if (String.valueOf(phoneNumber.getNationalNumber()).length() == 11) {
                return true;
            }
            return false;
        }
        try {
            j = CastLongProtector.parseLong(phoneNumber.getNationalNumber());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = 0;
        }
        if (phoneNumber.getCountryCode() != 0 && j >= 0) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(String str, String str2) {
        int i;
        boolean z;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str != null) {
            try {
                i = CastIntegerProtector.parseInt(str);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                IDebugConfig iDebugConfigLIZ = C0C76.LIZ();
                if (iDebugConfigLIZ != null) {
                    iDebugConfigLIZ.isOpen();
                }
                i = 0;
                z = false;
            }
        } else {
            i = 0;
        }
        z = true;
        if (str2 == null || !str2.matches("[0-9]+") || !z) {
            return false;
        }
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(i);
        phoneNumber.setNationalNumber(str2);
        return LJ(phoneNumber);
    }
}

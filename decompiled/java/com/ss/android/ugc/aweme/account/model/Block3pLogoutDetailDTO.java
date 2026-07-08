package com.ss.android.ugc.aweme.account.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX INFO: loaded from: classes14.dex */
public final class Block3pLogoutDetailDTO {

    @C09CT("passport_ticket")
    public final String passportTicket;

    @C09CT("pii_type")
    public final PiiType piiType;

    @C09CT("pii_value")
    public final String piiValue;

    @C09CT("popup_config")
    public final LogoutPopupConfig popupConfig;

    @C09CT("source")
    public final String source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PiiType {

        @C09CT("email")
        public static final PiiType EMAIL;
        public static final /* synthetic */ PiiType[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;

        @C09CT("mobile")
        public static final PiiType MOBILE;

        @C09CT("none")
        public static final PiiType NONE;

        public static InterfaceC2044707zh<PiiType> getEntries() {
            return LLILLJJLI;
        }

        static {
            PiiType piiType = new PiiType("NONE", 0);
            NONE = piiType;
            PiiType piiType2 = new PiiType("EMAIL", 1);
            EMAIL = piiType2;
            PiiType piiType3 = new PiiType("MOBILE", 2);
            MOBILE = piiType3;
            PiiType[] piiTypeArr = {piiType, piiType2, piiType3};
            LL = piiTypeArr;
            LLILLJJLI = new C2254308sP(piiTypeArr);
        }

        public static PiiType[] values() {
            return (PiiType[]) LL.clone();
        }

        public static PiiType valueOf(String str) {
            return (PiiType) C08FF.LIZ(PiiType.class, str);
        }

        public PiiType(String str, int i) {
        }
    }

    public Block3pLogoutDetailDTO() {
        this("", null, "", "", new LogoutPopupConfig("", "", false));
    }

    public Block3pLogoutDetailDTO(String str, PiiType piiType, String str2, String str3, LogoutPopupConfig logoutPopupConfig) {
        this.passportTicket = str;
        this.piiType = piiType;
        this.piiValue = str2;
        this.source = str3;
        this.popupConfig = logoutPopupConfig;
    }
}

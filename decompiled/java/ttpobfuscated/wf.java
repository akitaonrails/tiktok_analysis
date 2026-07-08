package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum wf {
    ACTIVATION("activation"),
    ORBU_SDK("orbu-sdk"),
    ORBU_NETWORK("orbu-network"),
    ORBU_WEB("orbu-web"),
    ORBU_WEBROUTER("orbu-webrouter"),
    ORBU_SOCKET("orbu-socket"),
    ORUB_APPTOAPP("orbu-apptoapp"),
    ORBU_SETTINGS("orbu-settings"),
    ORBU_PREDEFINED("orbu-predefined"),
    ORBU_GECKO("orbu-gecko"),
    ORBU_SYSTEM("orbu-system");

    public final String a;

    public final String b() {
        return this.a;
    }

    public static wf valueOf(String str) {
        return (wf) C08FF.LIZ(wf.class, str);
    }

    wf(String str) {
        this.a = str;
    }
}

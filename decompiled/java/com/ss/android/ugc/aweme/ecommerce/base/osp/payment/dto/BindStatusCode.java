package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class BindStatusCode {

    @C09CT("3")
    public static final BindStatusCode BINDING;

    @C09CT("2")
    public static final BindStatusCode ERROR;
    public static final /* synthetic */ BindStatusCode[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("1")
    public static final BindStatusCode SUCCESS;

    @C09CT("-1")
    public static final BindStatusCode UNKNOWN;

    public static InterfaceC2044707zh<BindStatusCode> getEntries() {
        return LLILLJJLI;
    }

    static {
        BindStatusCode bindStatusCode = new BindStatusCode("SUCCESS", 0);
        SUCCESS = bindStatusCode;
        BindStatusCode bindStatusCode2 = new BindStatusCode("ERROR", 1);
        ERROR = bindStatusCode2;
        BindStatusCode bindStatusCode3 = new BindStatusCode("BINDING", 2);
        BINDING = bindStatusCode3;
        BindStatusCode bindStatusCode4 = new BindStatusCode("UNKNOWN", 3);
        UNKNOWN = bindStatusCode4;
        BindStatusCode[] bindStatusCodeArr = {bindStatusCode, bindStatusCode2, bindStatusCode3, bindStatusCode4};
        LL = bindStatusCodeArr;
        LLILLJJLI = new C2254308sP(bindStatusCodeArr);
    }

    public static BindStatusCode[] values() {
        return (BindStatusCode[]) LL.clone();
    }

    public static BindStatusCode valueOf(String str) {
        return (BindStatusCode) C08FF.LIZ(BindStatusCode.class, str);
    }

    public BindStatusCode(String str, int i) {
    }
}

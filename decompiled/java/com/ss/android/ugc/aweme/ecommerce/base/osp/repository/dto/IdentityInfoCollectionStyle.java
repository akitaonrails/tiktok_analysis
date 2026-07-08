package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C02RV;
import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class IdentityInfoCollectionStyle {
    public static final C02RV Companion;
    public static final /* synthetic */ IdentityInfoCollectionStyle[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final IdentityInfoCollectionStyle STYLE0;

    @C09CT("1")
    public static final IdentityInfoCollectionStyle STYLE1;
    public final int LL;

    public static InterfaceC2044707zh<IdentityInfoCollectionStyle> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.02RV] */
    static {
        IdentityInfoCollectionStyle identityInfoCollectionStyle = new IdentityInfoCollectionStyle("STYLE0", 0, 0);
        STYLE0 = identityInfoCollectionStyle;
        IdentityInfoCollectionStyle identityInfoCollectionStyle2 = new IdentityInfoCollectionStyle("STYLE1", 1, 1);
        STYLE1 = identityInfoCollectionStyle2;
        IdentityInfoCollectionStyle[] identityInfoCollectionStyleArr = {identityInfoCollectionStyle, identityInfoCollectionStyle2};
        LLILLJJLI = identityInfoCollectionStyleArr;
        LLILLL = new C2254308sP(identityInfoCollectionStyleArr);
        Companion = new Object() { // from class: X.02RV
        };
    }

    public static IdentityInfoCollectionStyle[] values() {
        return (IdentityInfoCollectionStyle[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static IdentityInfoCollectionStyle valueOf(String str) {
        return (IdentityInfoCollectionStyle) C08FF.LIZ(IdentityInfoCollectionStyle.class, str);
    }

    public IdentityInfoCollectionStyle(String str, int i, int i2) {
        this.LL = i2;
    }
}

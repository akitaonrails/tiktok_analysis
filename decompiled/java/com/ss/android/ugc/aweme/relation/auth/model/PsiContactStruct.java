package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;
import X.C09DE;
import android.util.Base64;

/* JADX INFO: loaded from: classes31.dex */
public final class PsiContactStruct {

    @C09DE
    public final transient byte[] hashA;

    @C09CT("hash_a")
    public String hashABase64;

    @C09CT("prefix")
    public final String prefix;

    public final void setHashABase64(String str) {
        this.hashABase64 = str;
    }

    public PsiContactStruct(byte[] bArr, String str) {
        this.hashA = bArr;
        this.prefix = str;
        this.hashABase64 = Base64.encodeToString(bArr, 2);
    }
}

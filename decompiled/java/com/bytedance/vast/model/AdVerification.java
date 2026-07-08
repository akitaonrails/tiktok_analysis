package com.bytedance.vast.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class AdVerification implements Serializable, Cloneable {

    @C09CT("javaScriptResource")
    public String javascriptResource;

    @C09CT("vendorKey")
    public String vender;

    @C09CT("verificationParameters")
    public String verificationParameters;

    public boolean valid() {
        String str = this.javascriptResource;
        return (str == null || str.isEmpty()) ? false : true;
    }
}

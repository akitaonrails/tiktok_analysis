package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes14.dex */
public class DeviceInfo {

    @C09CT("brand")
    public String brand;

    @C09CT("device")
    public String device;

    @C09CT("model")
    public String model;

    public String getBrand() throws C316660CbA {
        String str = this.brand;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getDevice() throws C316660CbA {
        String str = this.device;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getModel() throws C316660CbA {
        String str = this.model;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}

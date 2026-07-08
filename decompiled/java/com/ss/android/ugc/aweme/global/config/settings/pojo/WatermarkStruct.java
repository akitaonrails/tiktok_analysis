package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes30.dex */
public class WatermarkStruct {

    @C09CT("end_watermark_string")
    public String endWatermarkString;

    @C09CT("end_watermark_substring")
    public String endWatermarkSubstring;

    @C09CT("fps")
    public String fps;

    @C09CT("md5")
    public String md5;

    @C09CT("resource_url")
    public UrlModel resourceUrl;

    public String getEndWatermarkString() throws C316660CbA {
        String str = this.endWatermarkString;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getEndWatermarkSubstring() throws C316660CbA {
        String str = this.endWatermarkSubstring;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getFps() throws C316660CbA {
        String str = this.fps;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getMd5() throws C316660CbA {
        String str = this.md5;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public UrlModel getResourceUrl() throws C316660CbA {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }
}

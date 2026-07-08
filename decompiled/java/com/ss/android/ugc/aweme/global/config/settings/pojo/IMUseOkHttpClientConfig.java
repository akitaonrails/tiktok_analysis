package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class IMUseOkHttpClientConfig {

    @C09CT("downloader_use_okhttpclient")
    public Boolean downloaderUseOkhttpclient;

    @C09CT("gif_manager_use_okhttpclient")
    public Boolean gifManagerUseOkhttpclient;

    @C09CT("uploader_use_okhttpclient")
    public Boolean uploaderUseOkhttpclient;

    public Boolean getDownloaderUseOkhttpclient() throws C316660CbA {
        Boolean bool = this.downloaderUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getGifManagerUseOkhttpclient() throws C316660CbA {
        Boolean bool = this.gifManagerUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Boolean getUploaderUseOkhttpclient() throws C316660CbA {
        Boolean bool = this.uploaderUseOkhttpclient;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }
}

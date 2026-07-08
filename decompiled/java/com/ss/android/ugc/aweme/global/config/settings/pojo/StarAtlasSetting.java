package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class StarAtlasSetting {

    @C09CT("star_atlas_enable")
    public Boolean starAtlasEnable;

    @C09CT("star_atlas_redirect_url")
    public String starAtlasRedirectUrl;

    @C09CT("star_atlas_url")
    public String starAtlasUrl;

    public Boolean getStarAtlasEnable() throws C316660CbA {
        Boolean bool = this.starAtlasEnable;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public String getStarAtlasRedirectUrl() throws C316660CbA {
        String str = this.starAtlasRedirectUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getStarAtlasUrl() throws C316660CbA {
        String str = this.starAtlasUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}

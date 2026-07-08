package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class EPlatformSettings {

    @C09CT("block_hint")
    public String blockHint;

    @C09CT("block_mode")
    public Integer blockMode;

    @C09CT("jump_block_list")
    public List<String> jumpBlockList = new ArrayList();

    @C09CT("jump_redirect_url")
    public String jumpRedirectUrl;

    @C09CT("lite_link")
    public String liteLink;

    @C09CT("profile_add_contact_info_text")
    public String profileAddContactInfoText;

    public String getBlockHint() throws C316660CbA {
        String str = this.blockHint;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getBlockMode() throws C316660CbA {
        Integer num = this.blockMode;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getJumpRedirectUrl() throws C316660CbA {
        String str = this.jumpRedirectUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getLiteLink() throws C316660CbA {
        String str = this.liteLink;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getProfileAddContactInfoText() throws C316660CbA {
        String str = this.profileAddContactInfoText;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public List<String> getJumpBlockList() {
        return this.jumpBlockList;
    }
}

package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class BioLinkData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("bio_link_click_action")
    public Integer bioLinkClickAction;

    @C09CT("bio_secure_url")
    public String bioSecureUrl;

    @C09CT("bio_url")
    public String bioUrl;

    @C09CT("block_bio_link_jump")
    public Integer blockLinkJump;

    public final Integer getBioLinkClickAction() {
        return this.bioLinkClickAction;
    }

    public final String getBioSecureUrl() {
        return this.bioSecureUrl;
    }

    public final String getBioUrl() {
        return this.bioUrl;
    }

    public final Integer getBlockLinkJump() {
        return this.blockLinkJump;
    }

    public final void setBioLinkClickAction(Integer num) {
        this.bioLinkClickAction = num;
    }

    public final void setBioSecureUrl(String str) {
        this.bioSecureUrl = str;
    }

    public final void setBioUrl(String str) {
        this.bioUrl = str;
    }

    public final void setBlockLinkJump(Integer num) {
        this.blockLinkJump = num;
    }
}

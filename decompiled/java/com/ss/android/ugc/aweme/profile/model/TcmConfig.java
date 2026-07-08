package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class TcmConfig implements Serializable {

    @C09CT("bc_schema_after_post")
    public final String bcSchemaAfterPost;

    @C09CT("bc_schema_in_post")
    public final String bcSchemaInPost;

    @C09CT("bc_usage_confirm_threshold")
    public final BcUsageConfirmThreshold bcUsageConfirmThreshold;

    @C09CT("can_use_tcm_console")
    public final boolean canUseTcmConsole;

    @C09CT("check_ba_before_post")
    public final boolean checkBABeforePost;

    @C09CT("bc_hashtag_list")
    public final List<String> hashtagList;

    @C09CT("is_branded_content_creator")
    public final boolean isBrandedContentCreator;

    @C09CT("is_tcm_creator")
    public final boolean isTcmCreator;

    @C09CT("tcm_entrance_schema_url")
    public final String tcmEntranceSchemaUrl;

    @C09CT("tcm_fe_params")
    public final String tcmFeParams;

    @C09CT("use_bc_entrance_after_post")
    public final boolean useBcEntranceAfterPost;

    @C09CT("use_bc_entrance_in_post")
    public final boolean useBcEntranceInPost;

    @C09CT("use_new_bc_settings")
    public final boolean useNewBCSetting;

    public final String getBcSchemaAfterPost() {
        return this.bcSchemaAfterPost;
    }

    public final String getBcSchemaInPost() {
        return this.bcSchemaInPost;
    }

    public final BcUsageConfirmThreshold getBcUsageConfirmThreshold() {
        return this.bcUsageConfirmThreshold;
    }

    public final boolean getCanUseTcmConsole() {
        return this.canUseTcmConsole;
    }

    public final boolean getCheckBABeforePost() {
        return this.checkBABeforePost;
    }

    public final List<String> getHashtagList() {
        return this.hashtagList;
    }

    public final String getTcmEntranceSchemaUrl() {
        return this.tcmEntranceSchemaUrl;
    }

    public final String getTcmFeParams() {
        return this.tcmFeParams;
    }

    public final boolean getUseBcEntranceAfterPost() {
        return this.useBcEntranceAfterPost;
    }

    public final boolean getUseBcEntranceInPost() {
        return this.useBcEntranceInPost;
    }

    public final boolean getUseNewBCSetting() {
        return this.useNewBCSetting;
    }

    public final boolean isBrandedContentCreator() {
        return this.isBrandedContentCreator;
    }

    public final boolean isTcmCreator() {
        return this.isTcmCreator;
    }
}

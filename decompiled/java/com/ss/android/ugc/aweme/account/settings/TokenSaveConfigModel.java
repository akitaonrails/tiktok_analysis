package com.ss.android.ugc.aweme.account.settings;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class TokenSaveConfigModel {
    public static final C13BV LIZ = C13BV.INSTANCE;

    @C09CT("block_enable")
    public boolean blockEnable;

    @C09CT("block_invalid_aid")
    public boolean blockInvalidAid;

    @C09CT("block_invalid_domain")
    public boolean blockInvalidDomain;

    @C09CT("block_invalid_path")
    public boolean blockInvalidPath;

    @C09CT("block_invalid_request_xtoken")
    public boolean blockInvalidRequestXtoken;

    @C09CT("block_invalid_uid")
    public boolean blockInvalidUid;

    @C09CT("check_aid")
    public boolean checkAid;

    @C09CT("check_uid")
    public boolean checkUid;

    @C09CT("check_xtoken")
    public boolean checkXtoken;

    @C09CT("domain_suffix")
    public List<String> domainSuffix;

    @C09CT("enable")
    public boolean enable;

    @C09CT("exclude_domain_suffix")
    public List<String> excludeDomainSuffix;

    @C09CT("exclude_path_prefix")
    public List<String> excludePathPrefix;

    @C09CT("path_prefix")
    public List<String> pathPrefix;

    public TokenSaveConfigModel() {
        this(false, false, LIZ, LIZ, LIZ, LIZ, false, false, false, false, false, false, false, false);
    }

    public TokenSaveConfigModel(boolean z, boolean z2, List<String> list, List<String> list2, List<String> list3, List<String> list4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.enable = z;
        this.blockEnable = z2;
        this.domainSuffix = list;
        this.pathPrefix = list2;
        this.excludeDomainSuffix = list3;
        this.excludePathPrefix = list4;
        this.checkAid = z3;
        this.checkUid = z4;
        this.checkXtoken = z5;
        this.blockInvalidAid = z6;
        this.blockInvalidPath = z7;
        this.blockInvalidDomain = z8;
        this.blockInvalidUid = z9;
        this.blockInvalidRequestXtoken = z10;
    }
}

package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class OAuthScope implements Serializable {

    @C09CT("app_icon")
    public final String appIcon;

    @C09CT("app_name")
    public final String appName;

    @C09CT("has_scope_learn_more_text")
    public final Boolean hasScopeLearnMoreText;

    @C09CT("scope_content")
    public final String scopeContent;

    @C09CT("scope_detail")
    public final String scopeDetail;

    @C09CT("scope_learn_more_contents")
    public final List<String> scopeLearnMoreContents;

    @C09CT("scope_learn_more_starling_key")
    public final List<String> scopeLearnMoreStarlingKey;

    @C09CT("scope_name")
    public final String scopeName;

    @C09CT("is_scope_required")
    public final Boolean scopeRequired;

    @C09CT("scope_title")
    public final String scopeTitle;

    @C09CT("is_scope_toggle_off")
    public final Boolean scopeToggleOff;

    @C09CT("is_scope_toggle_unmutable")
    public final Boolean scopeToggleUnmutable;

    public OAuthScope() {
        this(null, null, null, null, null, null, null, Boolean.TRUE, Boolean.FALSE, null, null, null);
    }

    public OAuthScope(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, Boolean bool2, Boolean bool3, Boolean bool4, List<String> list, List<String> list2) {
        this.appName = str;
        this.appIcon = str2;
        this.scopeRequired = bool;
        this.scopeName = str3;
        this.scopeContent = str4;
        this.scopeDetail = str5;
        this.scopeTitle = str6;
        this.scopeToggleOff = bool2;
        this.scopeToggleUnmutable = bool3;
        this.hasScopeLearnMoreText = bool4;
        this.scopeLearnMoreContents = list;
        this.scopeLearnMoreStarlingKey = list2;
    }
}

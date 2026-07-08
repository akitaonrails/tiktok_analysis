package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class OAuthScopeStruct implements Serializable {

    @C09CT("authorized_scope_list")
    public final List<OAuthScope> authorizedScopeList;

    @C09CT("request_scope_list")
    public final List<OAuthScope> requestScopeList;

    @C09CT("request_scope_list_toggle_off")
    public final List<OAuthScope> requestScopeListToggleOff;

    public OAuthScopeStruct() {
        this(null, null, null);
    }

    public OAuthScopeStruct(List<OAuthScope> list, List<OAuthScope> list2, List<OAuthScope> list3) {
        this.requestScopeList = list;
        this.authorizedScopeList = list2;
        this.requestScopeListToggleOff = list3;
    }
}

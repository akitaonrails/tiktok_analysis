package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RemoveAuthInfoScopeRequest {

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("scopes")
    public final List<String> scopes;

    public RemoveAuthInfoScopeRequest(String str, List<String> list) {
        this.clientKey = str;
        this.scopes = list;
    }
}

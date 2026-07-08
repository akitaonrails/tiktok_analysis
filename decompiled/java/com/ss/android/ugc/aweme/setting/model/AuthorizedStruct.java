package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthorizedStruct implements Serializable {
    public static final int $stable = 8;

    @C09CT("access_msg")
    public final String accessMsg;

    @C09CT("removal_alert")
    public final String alert;

    @C09CT("authorized_scopes")
    public List<AuthScopeInfo> authorizedScopes;

    @C09CT("authorized_time_text")
    public final String authorizedTimeText;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("desc")
    public final String desc;

    @C09CT("icon")
    public final String icon;

    @C09CT("name")
    public final String name;

    @C09CT("partner_identifier")
    public final String partnerIdentifier;

    @C09CT("client_permission_url")
    public final String permissionUrl;

    @C09CT("removal_popup_content")
    public final String removalPopupContent;

    @C09CT("removal_popup_title")
    public final String removalPopupTitle;

    @C09CT("scope_names")
    public final List<String> scopeNames;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public final String getAccessMsg() {
        return this.accessMsg;
    }

    public final String getAlert() {
        return this.alert;
    }

    public final List<AuthScopeInfo> getAuthorizedScopes() {
        return this.authorizedScopes;
    }

    public final String getAuthorizedTimeText() {
        return this.authorizedTimeText;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartnerIdentifier() {
        return this.partnerIdentifier;
    }

    public final String getPermissionUrl() {
        return this.permissionUrl;
    }

    public final String getRemovalPopupContent() {
        return this.removalPopupContent;
    }

    public final String getRemovalPopupTitle() {
        return this.removalPopupTitle;
    }

    public final List<String> getScopeNames() {
        return this.scopeNames;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setAuthorizedScopes(List<AuthScopeInfo> list) {
        this.authorizedScopes = list;
    }
}

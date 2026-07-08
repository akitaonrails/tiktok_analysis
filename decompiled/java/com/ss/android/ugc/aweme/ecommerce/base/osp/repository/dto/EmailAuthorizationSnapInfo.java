package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EmailAuthorizationSnapInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("auth_type")
    public final Integer authType;

    @C09CT("is_authorized")
    public final Boolean isAuthorized;

    @C09CT("to_authorized_seller_ids")
    public final List<String> toAuthorizedSellerIds;

    public EmailAuthorizationSnapInfo() {
        this(null, null, null);
    }

    public final EmailAuthorizationSnapInfo copy(Boolean bool, List<String> list, Integer num) {
        return new EmailAuthorizationSnapInfo(bool, list, num);
    }

    public final Boolean isAuthorized() {
        return this.isAuthorized;
    }

    public EmailAuthorizationSnapInfo(Boolean bool, List<String> list, Integer num) {
        this.isAuthorized = bool;
        this.toAuthorizedSellerIds = list;
        this.authType = num;
    }
}

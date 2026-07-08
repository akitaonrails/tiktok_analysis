package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EnterpriseUserInfo implements Serializable {

    @C09CT("commerce_info")
    public final CommerceInfo commerceInfo;

    @C09CT("permissions")
    public final List<EnterprisePermission> permissions;

    public final CommerceInfo getCommerceInfo() {
        return this.commerceInfo;
    }

    public final List<EnterprisePermission> getPermissions() {
        return this.permissions;
    }

    public final boolean hasPermission(String str) {
        List<EnterprisePermission> list;
        String key;
        EnterprisePermission next;
        if (str == null || str.length() == 0 || (list = this.permissions) == null || list.isEmpty()) {
            return false;
        }
        Iterator<EnterprisePermission> it2 = this.permissions.iterator();
        do {
            key = null;
            if (it2.hasNext()) {
                next = it2.next();
                EnterprisePermission enterprisePermission = next;
                if (enterprisePermission != null) {
                    key = enterprisePermission.getKey();
                }
            } else {
                return false;
            }
        } while (!TextUtils.equals(str, key));
        if (next != null) {
            return true;
        }
        return false;
    }
}

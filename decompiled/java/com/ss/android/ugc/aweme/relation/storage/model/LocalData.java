package com.ss.android.ugc.aweme.relation.storage.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.EnumC816850W2p;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class LocalData {

    @C09CT("has_more")
    public final Boolean _hasMore;

    @C09CT("local_type")
    public final Integer _localType;

    @C09CT("user_ids")
    public final List<String> _userIds;

    @C09CT("users")
    public final List<UserData> _userList;

    public final EnumC816850W2p LIZ() {
        Integer num = this._localType;
        for (EnumC816850W2p enumC816850W2p : EnumC816850W2p.values()) {
            int value = enumC816850W2p.getValue();
            if (num != null && value == num.intValue()) {
                return enumC816850W2p;
            }
        }
        return null;
    }

    public final List<String> LIZIZ() {
        List<String> list = this._userIds;
        return list == null ? C13BV.INSTANCE : list;
    }

    public final List<UserData> LIZJ() {
        List<UserData> list = this._userList;
        return list == null ? C13BV.INSTANCE : list;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalData(_localType=");
        sbLIZ.append(LIZ());
        sbLIZ.append(", _userList=");
        List<UserData> list = this._userList;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        sbLIZ.append(", _userIds=");
        sbLIZ.append(this._userIds);
        sbLIZ.append(", _hasMore=");
        sbLIZ.append(this._hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocalData(Integer num, List<UserData> list, List<String> list2, Boolean bool) {
        this._localType = num;
        this._userList = list;
        this._userIds = list2;
        this._hasMore = bool;
    }
}

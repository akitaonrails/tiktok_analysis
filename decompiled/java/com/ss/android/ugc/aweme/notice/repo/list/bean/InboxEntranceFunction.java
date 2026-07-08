package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxEntranceFunction {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int actionStatus;

    @C09CT("entrance_cell_function_type")
    public int functionType;

    @C09CT("icon_url")
    public TuxImageModel iconModel;

    @C09CT("name")
    public String name;

    public InboxEntranceFunction() {
        this("", -1, 0, null);
    }

    public final InboxEntranceFunction copy(String str, int i, int i2, TuxImageModel tuxImageModel) {
        return new InboxEntranceFunction(str, i, i2, tuxImageModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxEntranceFunction)) {
            return false;
        }
        InboxEntranceFunction inboxEntranceFunction = (InboxEntranceFunction) obj;
        return Intrinsics.LJFF(this.name, inboxEntranceFunction.name) && this.functionType == inboxEntranceFunction.functionType && this.actionStatus == inboxEntranceFunction.actionStatus && Intrinsics.LJFF(this.iconModel, inboxEntranceFunction.iconModel);
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.functionType) * 31) + this.actionStatus) * 31;
        TuxImageModel tuxImageModel = this.iconModel;
        return iHashCode + (tuxImageModel == null ? 0 : tuxImageModel.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxEntranceFunction(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", functionType=");
        sbLIZ.append(this.functionType);
        sbLIZ.append(", actionStatus=");
        sbLIZ.append(this.actionStatus);
        sbLIZ.append(", iconModel=");
        sbLIZ.append(this.iconModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setActionStatus(int i) {
        this.actionStatus = i;
    }

    public final void setFunctionType(int i) {
        this.functionType = i;
    }

    public final void setIconModel(TuxImageModel tuxImageModel) {
        this.iconModel = tuxImageModel;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public InboxEntranceFunction(String str, int i, int i2, TuxImageModel tuxImageModel) {
        this.name = str;
        this.functionType = i;
        this.actionStatus = i2;
        this.iconModel = tuxImageModel;
    }
}

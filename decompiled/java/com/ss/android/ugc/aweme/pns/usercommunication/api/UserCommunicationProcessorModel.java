package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class UserCommunicationProcessorModel implements Serializable {

    @C09CT("necessary")
    public final Boolean necessary;

    @C09CT("params")
    public final Object processorData;

    @C09CT("processor")
    public final String processorID;

    public UserCommunicationProcessorModel() {
        this("", null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommunicationProcessorModel)) {
            return false;
        }
        UserCommunicationProcessorModel userCommunicationProcessorModel = (UserCommunicationProcessorModel) obj;
        return Intrinsics.LJFF(this.processorID, userCommunicationProcessorModel.processorID) && Intrinsics.LJFF(this.processorData, userCommunicationProcessorModel.processorData) && Intrinsics.LJFF(this.necessary, userCommunicationProcessorModel.necessary);
    }

    public int hashCode() {
        int iHashCode = this.processorID.hashCode() * 31;
        Object obj = this.processorData;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.necessary;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserCommunicationProcessorModel(processorID=");
        sbLIZ.append(this.processorID);
        sbLIZ.append(", processorData=");
        sbLIZ.append(this.processorData);
        sbLIZ.append(", necessary=");
        sbLIZ.append(this.necessary);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserCommunicationProcessorModel(String str, Object obj, Boolean bool) {
        this.processorID = str;
        this.processorData = obj;
        this.necessary = bool;
    }
}

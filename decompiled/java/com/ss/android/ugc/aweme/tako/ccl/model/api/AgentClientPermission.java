package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes10.dex */
public final class AgentClientPermission {

    @C09CT("location")
    public final PermissionState location;

    @C09CT("notification")
    public final PermissionState notification;

    @C09CT("storage")
    public final PermissionState storage;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentClientPermission)) {
            return false;
        }
        AgentClientPermission agentClientPermission = (AgentClientPermission) obj;
        return this.location == agentClientPermission.location && this.storage == agentClientPermission.storage && this.notification == agentClientPermission.notification;
    }

    public final int hashCode() {
        return (((this.location.hashCode() * 31) + this.storage.hashCode()) * 31) + this.notification.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgentClientPermission(location=");
        sbLIZ.append(this.location);
        sbLIZ.append(", storage=");
        sbLIZ.append(this.storage);
        sbLIZ.append(", notification=");
        sbLIZ.append(this.notification);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AgentClientPermission() {
        this(PermissionState.UNKNOWN, PermissionState.UNKNOWN, PermissionState.UNKNOWN);
    }

    public AgentClientPermission(PermissionState permissionState, PermissionState permissionState2, PermissionState permissionState3) {
        this.location = permissionState;
        this.storage = permissionState2;
        this.notification = permissionState3;
    }
}

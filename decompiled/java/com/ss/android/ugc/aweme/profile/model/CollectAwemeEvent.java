package com.ss.android.ugc.aweme.profile.model;

import X.C1440005kM;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1294060jmO
public final class CollectAwemeEvent implements IEvent {
    public final int action;
    public final String awemeId;
    public final int awemeType;

    public final CollectAwemeEvent copy(String str, int i, int i2) {
        return new CollectAwemeEvent(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectAwemeEvent)) {
            return false;
        }
        CollectAwemeEvent collectAwemeEvent = (CollectAwemeEvent) obj;
        return Intrinsics.LJFF(this.awemeId, collectAwemeEvent.awemeId) && this.action == collectAwemeEvent.action && this.awemeType == collectAwemeEvent.awemeType;
    }

    public int hashCode() {
        return (((this.awemeId.hashCode() * 31) + this.action) * 31) + this.awemeType;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectAwemeEvent(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getAction() {
        return this.action;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public CollectAwemeEvent(String str, int i, int i2) {
        this.awemeId = str;
        this.action = i;
        this.awemeType = i2;
    }
}

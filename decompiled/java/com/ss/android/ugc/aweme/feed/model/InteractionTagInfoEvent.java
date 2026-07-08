package com.ss.android.ugc.aweme.feed.model;

import X.C1440005kM;
import X.C2188811AlT;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InteractionTagInfoEvent implements IEvent {
    public final Aweme aweme;

    public final InteractionTagInfoEvent copy(Aweme aweme) {
        return new InteractionTagInfoEvent(aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InteractionTagInfoEvent) && Intrinsics.LJFF(this.aweme, ((InteractionTagInfoEvent) obj).aweme);
    }

    public int hashCode() {
        return this.aweme.hashCode();
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
        sbLIZ.append("InteractionTagInfoEvent(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public InteractionTagInfoEvent(Aweme aweme) {
        this.aweme = aweme;
    }
}

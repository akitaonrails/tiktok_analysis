package com.ss.android.ugc.aweme.feed.model;

import X.C1440005kM;
import X.C2188811AlT;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InteractionTagLabelEvent implements IEvent {
    public final Aweme aweme;

    public final InteractionTagLabelEvent copy(Aweme aweme) {
        return new InteractionTagLabelEvent(aweme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InteractionTagLabelEvent) && Intrinsics.LJFF(this.aweme, ((InteractionTagLabelEvent) obj).aweme);
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
        sbLIZ.append("InteractionTagLabelEvent(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public InteractionTagLabelEvent(Aweme aweme) {
        this.aweme = aweme;
    }
}

package com.ss.bytertc.engine.avclient;

import X.C2097608Jq;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LyraxAVBusinessMessage {
    public static final Companion Companion = new Companion();
    public String businessID;
    public LyraxAVBusinessPayload payload;

    public static final class Companion {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyraxAVBusinessMessage)) {
            return false;
        }
        LyraxAVBusinessMessage lyraxAVBusinessMessage = (LyraxAVBusinessMessage) obj;
        return Intrinsics.LJFF(this.businessID, lyraxAVBusinessMessage.businessID) && Intrinsics.LJFF(this.payload, lyraxAVBusinessMessage.payload);
    }

    public int hashCode() {
        return (this.businessID.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAVBusinessMessage(businessID=");
        sbLIZ.append(this.businessID);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.payload);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAVBusinessMessage() {
        this("tako", new LyraxAVBusinessPayload("", "", C2097608Jq.LJ()));
    }

    public final void setBusinessID(String str) {
        this.businessID = str;
    }

    public final void setPayload(LyraxAVBusinessPayload lyraxAVBusinessPayload) {
        this.payload = lyraxAVBusinessPayload;
    }

    public LyraxAVBusinessMessage(String str, LyraxAVBusinessPayload lyraxAVBusinessPayload) {
        this.businessID = str;
        this.payload = lyraxAVBusinessPayload;
    }
}

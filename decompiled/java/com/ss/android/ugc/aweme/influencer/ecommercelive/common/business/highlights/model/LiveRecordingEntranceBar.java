package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LiveRecordingEntranceBar implements Serializable, InterfaceC1891350zJl {
    public static final int $stable = 0;

    @C09CT("desc")
    public final String desc;

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final String title;

    public LiveRecordingEntranceBar() {
        this(null, null, null);
    }

    public final LiveRecordingEntranceBar copy(String str, String str2, String str3) {
        return new LiveRecordingEntranceBar(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveRecordingEntranceBar)) {
            return false;
        }
        LiveRecordingEntranceBar liveRecordingEntranceBar = (LiveRecordingEntranceBar) obj;
        return Intrinsics.LJFF(this.title, liveRecordingEntranceBar.title) && Intrinsics.LJFF(this.desc, liveRecordingEntranceBar.desc) && Intrinsics.LJFF(this.schema, liveRecordingEntranceBar.schema);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRecordingEntranceBar(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public LiveRecordingEntranceBar(String str, String str2, String str3) {
        this.title = str;
        this.desc = str2;
        this.schema = str3;
    }
}

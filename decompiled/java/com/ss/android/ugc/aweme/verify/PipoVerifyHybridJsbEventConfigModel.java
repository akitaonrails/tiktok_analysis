package com.ss.android.ugc.aweme.verify;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PipoVerifyHybridJsbEventConfigModel {

    @C09CT("enable_optimize")
    public final boolean enableOptimize;

    @C09CT("enable_publish_ev_page_loaded")
    public final boolean enablePublishEvPageLoaded;

    @C09CT("reason_code_to_jsb_event")
    public final List<ReasonCodeToJsbEventItem> reasonCodeToJsbEvent;

    public PipoVerifyHybridJsbEventConfigModel() {
        this(false, false, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoVerifyHybridJsbEventConfigModel)) {
            return false;
        }
        PipoVerifyHybridJsbEventConfigModel pipoVerifyHybridJsbEventConfigModel = (PipoVerifyHybridJsbEventConfigModel) obj;
        return this.enableOptimize == pipoVerifyHybridJsbEventConfigModel.enableOptimize && this.enablePublishEvPageLoaded == pipoVerifyHybridJsbEventConfigModel.enablePublishEvPageLoaded && Intrinsics.LJFF(this.reasonCodeToJsbEvent, pipoVerifyHybridJsbEventConfigModel.reasonCodeToJsbEvent);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enableOptimize) * 31) + C786410Ut5.Z2(this.enablePublishEvPageLoaded)) * 31) + this.reasonCodeToJsbEvent.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoVerifyHybridJsbEventConfigModel(enableOptimize=");
        sbLIZ.append(this.enableOptimize);
        sbLIZ.append(", enablePublishEvPageLoaded=");
        sbLIZ.append(this.enablePublishEvPageLoaded);
        sbLIZ.append(", reasonCodeToJsbEvent=");
        sbLIZ.append(this.reasonCodeToJsbEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoVerifyHybridJsbEventConfigModel(boolean z, boolean z2, List<ReasonCodeToJsbEventItem> list) {
        this.enableOptimize = z;
        this.enablePublishEvPageLoaded = z2;
        this.reasonCodeToJsbEvent = list;
    }

    public PipoVerifyHybridJsbEventConfigModel(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}

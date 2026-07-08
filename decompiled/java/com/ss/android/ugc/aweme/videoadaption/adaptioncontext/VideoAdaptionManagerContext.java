package com.ss.android.ugc.aweme.videoadaption.adaptioncontext;

import X.C2188811AlT;
import X.InterfaceC1869450ykR;
import X.InterfaceC20561915d3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoAdaptionManagerContext implements InterfaceC1869450ykR {
    public final String eventType;
    public final InterfaceC20561915d3 strategyFactory;

    public final VideoAdaptionManagerContext copy(String str, InterfaceC20561915d3 interfaceC20561915d3) {
        return new VideoAdaptionManagerContext(str, interfaceC20561915d3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdaptionManagerContext)) {
            return false;
        }
        VideoAdaptionManagerContext videoAdaptionManagerContext = (VideoAdaptionManagerContext) obj;
        return Intrinsics.LJFF(this.eventType, videoAdaptionManagerContext.eventType) && Intrinsics.LJFF(this.strategyFactory, videoAdaptionManagerContext.strategyFactory);
    }

    public int hashCode() {
        String str = this.eventType;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.strategyFactory.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoAdaptionManagerContext(eventType=");
        sbLIZ.append(this.eventType);
        sbLIZ.append(", strategyFactory=");
        sbLIZ.append(this.strategyFactory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getEventType() {
        return this.eventType;
    }

    @Override // X.InterfaceC1869450ykR
    public InterfaceC20561915d3 getStrategyFactory() {
        return this.strategyFactory;
    }

    public VideoAdaptionManagerContext(String str, InterfaceC20561915d3 interfaceC20561915d3) {
        this.eventType = str;
        this.strategyFactory = interfaceC20561915d3;
    }
}

package com.ss.android.ugc.feed.platform.cell.component.adaption.strategy;

import X.C01GW;
import X.C15438062q;
import X.C1866580yfo;
import X.C1869340ykG;
import X.C1869350ykH;
import X.C1869360ykI;
import X.C1869370ykJ;
import X.C1869380ykK;
import X.C20562815dC;
import X.C20564615dU;
import X.C20566715dp;
import X.C2188811AlT;
import X.C452501pT;
import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedVideoAdaptionStrategyFactory extends C20564615dU {
    public static final int $stable = 8;
    public final transient C01GW feedHandlerFactoryV2$delegate;
    public final List<Float> heightThreshold;
    public final List<Float> widthThreshold;

    private final List<Float> component1() {
        return this.widthThreshold;
    }

    private final List<Float> component2() {
        return this.heightThreshold;
    }

    public final FeedVideoAdaptionStrategyFactory copy(List<Float> list, List<Float> list2) {
        return new FeedVideoAdaptionStrategyFactory(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedVideoAdaptionStrategyFactory)) {
            return false;
        }
        FeedVideoAdaptionStrategyFactory feedVideoAdaptionStrategyFactory = (FeedVideoAdaptionStrategyFactory) obj;
        return Intrinsics.LJFF(this.widthThreshold, feedVideoAdaptionStrategyFactory.widthThreshold) && Intrinsics.LJFF(this.heightThreshold, feedVideoAdaptionStrategyFactory.heightThreshold);
    }

    public int hashCode() {
        return (this.widthThreshold.hashCode() * 31) + this.heightThreshold.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedVideoAdaptionStrategyFactory(widthThreshold=");
        sbLIZ.append(this.widthThreshold);
        sbLIZ.append(", heightThreshold=");
        sbLIZ.append(this.heightThreshold);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1869350ykH getFeedHandlerFactoryV2() {
        return (C1869350ykH) this.feedHandlerFactoryV2$delegate.getValue();
    }

    public FeedVideoAdaptionStrategyFactory() {
        List<Float> list = C1866580yfo.LIZ().multi_container_width_threshold;
        List<Float> list2 = C1866580yfo.LIZ().multi_container_width_threshold;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<Float> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().floatValue();
            arrayList.add(Float.valueOf(1.0f));
        }
        this(list, arrayList);
    }

    @Override // X.C20564615dU
    public C20566715dp getFeedMultiContainerThresholdStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext) {
        return new C20566715dp(new C1869340ykG(this, videoAdaptionManagerContext));
    }

    public final C20562815dC getMultiContainerThresholdHandler(C1869360ykI c1869360ykI) {
        C1869370ykJ c1869370ykJ = new C1869370ykJ(this.widthThreshold, this.heightThreshold, c1869360ykI);
        C20562815dC c20562815dC = C20562815dC.LLILZ;
        if (c20562815dC == null) {
            C20562815dC c20562815dC2 = new C20562815dC(c1869370ykJ);
            C20562815dC.LLILZ = c20562815dC2;
            return c20562815dC2;
        }
        return c20562815dC;
    }

    public FeedVideoAdaptionStrategyFactory(List<Float> list, List<Float> list2) {
        this.widthThreshold = list;
        this.heightThreshold = list2;
        this.feedHandlerFactoryV2$delegate = C452501pT.LIZIZ(new C1869380ykK(this));
    }
}

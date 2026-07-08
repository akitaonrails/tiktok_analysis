package com.ss.android.ugc.aweme.component.gestureupcomponent;

import X.C09CT;
import X.C1003590cDt;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleGestureContextModel implements Serializable {
    public static final int $stable = 8;

    @C09CT("slide_context")
    public final SlideContext slideContext;

    @C09CT("tap_context")
    public final TapContext tapContext;

    public AnoleGestureContextModel() {
        this(null, null);
    }

    public static final class SlideContext implements Serializable {

        @C09CT("direction")
        public final List<String> direction;

        @C09CT("distance_threshold_max")
        public final Float distanceThresholdMax;

        @C09CT("distance_threshold_min")
        public final Float distanceThresholdMin;

        @C09CT("log_info")
        public final AnoleLogInfo logInfo;
        public static final C1003590cDt Companion = new Object() { // from class: X.0cDt
        };
        public static final int $stable = 8;

        public SlideContext() {
            this(null, null, null, null);
        }

        public final List<String> getDirection() {
            return this.direction;
        }

        public final Float getDistanceThresholdMax() {
            return this.distanceThresholdMax;
        }

        public final Float getDistanceThresholdMin() {
            return this.distanceThresholdMin;
        }

        public final AnoleLogInfo getLogInfo() {
            return this.logInfo;
        }

        public SlideContext(AnoleLogInfo anoleLogInfo, List<String> list, Float f, Float f2) {
            this.logInfo = anoleLogInfo;
            this.direction = list;
            this.distanceThresholdMax = f;
            this.distanceThresholdMin = f2;
        }
    }

    public static final class TapContext implements Serializable {
        public static final int $stable = 8;

        @C09CT("log_info")
        public final AnoleLogInfo logInfo;

        public TapContext() {
            this(null);
        }

        public final AnoleLogInfo getLogInfo() {
            return this.logInfo;
        }

        public TapContext(AnoleLogInfo anoleLogInfo) {
            this.logInfo = anoleLogInfo;
        }
    }

    public final SlideContext getSlideContext() {
        return this.slideContext;
    }

    public final TapContext getTapContext() {
        return this.tapContext;
    }

    public AnoleGestureContextModel(TapContext tapContext, SlideContext slideContext) {
        this.tapContext = tapContext;
        this.slideContext = slideContext;
    }
}

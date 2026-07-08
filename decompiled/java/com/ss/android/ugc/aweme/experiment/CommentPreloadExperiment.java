package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C1361950lXt;
import X.C452501pT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPreloadExperiment {
    public static final CommentPreloadExperiment LIZ = new CommentPreloadExperiment();
    public static final Meta LIZIZ = new Meta(false, 0, 300000, false, false, false, new String[]{"notification_page", "inner_push"});
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1361950lXt());

    public static final class Meta implements Serializable {

        @C09CT("bind_with_panel_animation")
        public final boolean bindWithPanelAnimation;

        @C09CT("enable_scene")
        public final String[] enableScene;

        @C09CT("enabled")
        public final boolean isEnable;

        @C09CT("only_unread_notice")
        public final boolean onlyUnreadNotice;

        @C09CT("strategy")
        public final int strategy;

        @C09CT("time_to_live")
        public final int ttl;

        @C09CT("use_local_cache")
        public final boolean useLocalCache;

        public Meta() {
            this(false, 0, 300000, false, false, false, new String[]{"notification_page", "inner_push"});
        }

        public final boolean isEnable() {
            return this.isEnable;
        }

        public Meta(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, String[] strArr) {
            this.isEnable = z;
            this.strategy = i;
            this.ttl = i2;
            this.onlyUnreadNotice = z2;
            this.bindWithPanelAnimation = z3;
            this.useLocalCache = z4;
            this.enableScene = strArr;
        }
    }

    public static int LIZ() {
        return ((Meta) LIZJ.getValue()).strategy;
    }
}

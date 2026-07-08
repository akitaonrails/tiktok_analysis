package com.ss.android.ugc.aweme.minidrama.common.component.ab;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesMonitorSettings {
    public static final MonitorScenes LIZ() {
        return (MonitorScenes) SettingsManager.LIZLLL().LJIIIIZZ("mini_drama_monitor_scene", MonitorScenes.class, null);
    }

    public static final class MonitorScenes {

        @C09CT("check_cta_info")
        public final boolean checkCTAInfo;

        @C09CT("check_category")
        public final boolean checkCategory;

        @C09CT("check_collection_id")
        public final boolean checkCollectionId;

        @C09CT("check_limited_free")
        public final boolean checkLimitedFree;

        @C09CT("check_new_cta_info")
        public final boolean checkNewCTAInfo;

        @C09CT("scenes")
        public final List<String> scenes;

        public MonitorScenes() {
            this(null, false, false, false, false, false, 63, null);
        }

        public MonitorScenes(List<String> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.scenes = list;
            this.checkCollectionId = z;
            this.checkLimitedFree = z2;
            this.checkCTAInfo = z3;
            this.checkCategory = z4;
            this.checkNewCTAInfo = z5;
        }

        public MonitorScenes(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) == 0 ? z5 : false);
        }
    }
}

package com.ss.android.ugc.aweme.compliance.common.hydrogen.configs;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class ActivityCenterLibraSetting {
    public static final ActivityCenterSettingModel LIZ = new ActivityCenterSettingModel(null, null, 3, null);

    public static final class ActivityCenterSettingModel {

        @C09CT("ac_entry_uri")
        public final String acEntry;

        @C09CT("feats")
        public final List<String> feats;

        public ActivityCenterSettingModel() {
            this(null, null, 3, null);
        }

        public ActivityCenterSettingModel(String str, List<String> list) {
            this.acEntry = str;
            this.feats = list;
        }

        public ActivityCenterSettingModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}

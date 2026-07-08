package com.ss.android.ugc.aweme.i18n.xbridge.depend.runtime;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class UpdateNonLazyResourceSwitch {
    public static final UpdateNonLazyResourceModel LIZ = new UpdateNonLazyResourceModel(C13BV.INSTANCE, false);

    public static final class UpdateNonLazyResourceModel {

        @C09CT("deny_list")
        public final List<String> denyList;

        /* JADX INFO: renamed from: switch, reason: not valid java name */
        @C09CT("switch")
        public final boolean f69switch;

        public UpdateNonLazyResourceModel(List<String> list, boolean z) {
            this.denyList = list;
            this.f69switch = z;
        }
    }
}

package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RecommendedPlaybookInfo {

    @C09CT("playbook_ids")
    public List<Long> playbookIds = new ArrayList();

    @C09CT("playbook_biz_extras")
    public Map<Long, PlaybookBizExtra> playbookBizExtras = new LinkedHashMap();

    public static final class PlaybookBizExtra {

        @C09CT("custom_atomic_capabilities")
        public Map<String, String> customAtomicCapabilities = new LinkedHashMap();
    }
}

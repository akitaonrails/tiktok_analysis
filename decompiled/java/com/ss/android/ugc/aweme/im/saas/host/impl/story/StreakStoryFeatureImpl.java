package com.ss.android.ugc.aweme.im.saas.host.impl.story;

import X.AbstractC1387200mCc;
import X.AbstractC1711506n3;
import X.C06NT;
import X.C1906580ziK;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StreakStoryFeature;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakStoryFeatureImpl implements StreakStoryFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StreakStoryFeature
    public final Pair<Boolean, Boolean> LIZ() {
        return C06NT.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StreakStoryFeature
    public final boolean LIZJ(int i) {
        Activity activityLIZIZ;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            if (!creativeToolsPluginService.LJI(activityLIZIZ)) {
                return false;
            }
        }
        if (i == AbstractC1711506n3.LIZ) {
            return C06NT.LIZIZ.LIZ().getFirst().booleanValue();
        }
        if (i != AbstractC1711506n3.LIZIZ) {
            return false;
        }
        return C06NT.LIZIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StreakStoryFeature
    public final void LIZIZ(Context context, StoryStreakEnterEditParam storyStreakEnterEditParam) {
        C06NT.LIZIZ.LIZIZ(context, storyStreakEnterEditParam);
    }
}

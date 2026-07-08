package com.ss.android.ugc.gamora.editor.lightening.storynote;

import X.C0DMI;
import X.C1404520meY;
import X.C1404940mfE;
import X.C1444330ngl;
import X.C23250099c;
import X.InterfaceC497601wk;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.IStoryNoteService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryNoteService implements IStoryNoteService {
    @Override // com.ss.android.ugc.aweme.services.story.IStoryNoteService
    public final void publishStoryNote(Context context, StoryNoteInfoModel storyNoteInfoModel, C1404940mfE c1404940mfE) {
        IUserService iUserService;
        User currentUser;
        C1404520meY.LIZ.getClass();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(context, "story_note", true) && (iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null)) != null && (currentUser = iUserService.getCurrentUser()) != null) {
            C23250099c.LIZLLL((InterfaceC497601wk) C1404520meY.LIZIZ.getValue(), null, null, new C1444330ngl(context, currentUser, storyNoteInfoModel, c1404940mfE, C0DMI.LIZIZ(null), null), 3);
        }
    }
}

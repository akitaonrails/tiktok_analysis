package com.ss.android.ugc.aweme.story.celebration.create.reqeust;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationMaterialLegoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CelebrationMaterialLegoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        StoryFriendAnniversaryService storyFriendAnniversaryService = (StoryFriendAnniversaryService) PluggableExtentionKt.pluggableSpi$default(StoryFriendAnniversaryService.class, false, false, false, 14, null);
        if (storyFriendAnniversaryService != null) {
            storyFriendAnniversaryService.LIZJ();
        }
        ((ICelebrationCreateService) ServiceManager.get().getService(ICelebrationCreateService.class)).preloadCelebrationAndMaterial(context);
    }
}

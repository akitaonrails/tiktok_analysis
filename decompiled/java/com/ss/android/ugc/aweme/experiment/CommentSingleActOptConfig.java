package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.post.mode.debug.IPostModeDebugService;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentSingleActOptConfig {

    @C09CT("disable_main_page_ability_scope")
    public final boolean disableMainPageAbilitySingleAct;

    @C09CT("disable_main_page")
    public final boolean disableMainPageSingleAct;

    @C09CT("disable_main_page_vm_scope")
    public final boolean disableMainPageVMSingleAct;

    @C09CT("disable_post_mode_page")
    public final boolean disablePostModeSingleAct;

    @C09CT("cache_is_support_main_page")
    public final boolean needCacheIsSupportMainPage;

    @C09CT("limit_comment_root_ability_scope")
    public final boolean shouldLimitRootAbility;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentSingleActOptConfig() {
        this(false, false, false, false, false, false);
        IPostModeDebugService iPostModeDebugService = (IPostModeDebugService) PluggableExtentionKt.pluggableSpi$default(IPostModeDebugService.class, false, false, false, 14, null);
        if (iPostModeDebugService != null) {
            iPostModeDebugService.LIZ();
        }
        IPostModeDebugService iPostModeDebugService2 = (IPostModeDebugService) PluggableExtentionKt.pluggableSpi$default(IPostModeDebugService.class, false, false, false, 14, null);
        if (iPostModeDebugService2 != null) {
            iPostModeDebugService2.LIZ();
        }
    }

    public CommentSingleActOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.disableMainPageSingleAct = z;
        this.disablePostModeSingleAct = z2;
        this.needCacheIsSupportMainPage = z3;
        this.disableMainPageAbilitySingleAct = z4;
        this.disableMainPageVMSingleAct = z5;
        this.shouldLimitRootAbility = z6;
    }
}

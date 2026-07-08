package com.ss.ugc.effectplatform;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectsPredownloadPreloadConfigModel {

    @C09CT("edit_effect_panel_left_pre_download_count")
    public int editEffectPanelLeftPreDownloadCount;

    @C09CT("edit_effect_panel_right_pre_download_count")
    public int editEffectPanelRightPreDownloadCount;

    @C09CT("effect_download_insert_at_head_enabled")
    public boolean effectDownloadInsertAtHeadEnabled;

    @C09CT("effect_insert_head_panel_list")
    public String[] effectInsertHeadPanelList;

    @C09CT("prop_panel_left_pre_download_count")
    public int propPanelLeftPreDownloadCount;

    @C09CT("prop_panel_left_preload_count")
    public int propPanelLeftPreloadCount;

    @C09CT("prop_panel_right_pre_download_count")
    public int propPanelRightPreDownloadCount;

    @C09CT("prop_panel_right_preload_count")
    public int propPanelRightPreloadCount;

    @C09CT("shooting_prefetch_first_effect_opt_enabled")
    public boolean shootingPrefetchFirstEffectEnabled;

    @C09CT("task_manager_queue_opt_bugfix_enabled")
    public boolean taskManagerQueueOptBugfixEnabled;

    public EffectsPredownloadPreloadConfigModel() {
        this(false, 2, 2, 2, 2, false, 2, 2, false, new String[]{"", "default", "effect", "editingeffect"});
    }

    public final void setEditEffectPanelLeftPreDownloadCount(int i) {
        this.editEffectPanelLeftPreDownloadCount = i;
    }

    public final void setEditEffectPanelRightPreDownloadCount(int i) {
        this.editEffectPanelRightPreDownloadCount = i;
    }

    public final void setEffectDownloadInsertAtHeadEnabled(boolean z) {
        this.effectDownloadInsertAtHeadEnabled = z;
    }

    public final void setEffectInsertHeadPanelList(String[] strArr) {
        this.effectInsertHeadPanelList = strArr;
    }

    public final void setPropPanelLeftPreDownloadCount(int i) {
        this.propPanelLeftPreDownloadCount = i;
    }

    public final void setPropPanelLeftPreloadCount(int i) {
        this.propPanelLeftPreloadCount = i;
    }

    public final void setPropPanelRightPreDownloadCount(int i) {
        this.propPanelRightPreDownloadCount = i;
    }

    public final void setPropPanelRightPreloadCount(int i) {
        this.propPanelRightPreloadCount = i;
    }

    public final void setShootingPrefetchFirstEffectEnabled(boolean z) {
        this.shootingPrefetchFirstEffectEnabled = z;
    }

    public final void setTaskManagerQueueOptBugfixEnabled(boolean z) {
        this.taskManagerQueueOptBugfixEnabled = z;
    }

    public EffectsPredownloadPreloadConfigModel(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, boolean z3, String[] strArr) {
        this.taskManagerQueueOptBugfixEnabled = z;
        this.propPanelLeftPreDownloadCount = i;
        this.propPanelRightPreDownloadCount = i2;
        this.propPanelLeftPreloadCount = i3;
        this.propPanelRightPreloadCount = i4;
        this.shootingPrefetchFirstEffectEnabled = z2;
        this.editEffectPanelLeftPreDownloadCount = i5;
        this.editEffectPanelRightPreDownloadCount = i6;
        this.effectDownloadInsertAtHeadEnabled = z3;
        this.effectInsertHeadPanelList = strArr;
    }
}

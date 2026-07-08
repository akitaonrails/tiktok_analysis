package com.ss.android.ugc.aweme.services;

import android.content.Context;

/* JADX INFO: loaded from: classes32.dex */
public final class InitMusicTabViewsData {
    public final Context context;
    public final boolean enableNewCollectTab;
    public final boolean inEditorPro;
    public final boolean isFromPromoteCopyright;
    public final boolean isReplaceMultiMusic;

    public final Context getContext() {
        return this.context;
    }

    public final boolean getEnableNewCollectTab() {
        return this.enableNewCollectTab;
    }

    public final boolean getInEditorPro() {
        return this.inEditorPro;
    }

    public final boolean isFromPromoteCopyright() {
        return this.isFromPromoteCopyright;
    }

    public final boolean isReplaceMultiMusic() {
        return this.isReplaceMultiMusic;
    }

    public InitMusicTabViewsData(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        this.context = context;
        this.isReplaceMultiMusic = z;
        this.isFromPromoteCopyright = z2;
        this.inEditorPro = z3;
        this.enableNewCollectTab = z4;
    }
}

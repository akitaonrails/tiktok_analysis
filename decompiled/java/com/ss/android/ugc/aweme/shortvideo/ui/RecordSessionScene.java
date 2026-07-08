package com.ss.android.ugc.aweme.shortvideo.ui;

import X.InterfaceC1674890tgd;
import X.InterfaceC20011613Rq;
import android.os.Bundle;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import nv7.c0;

/* JADX INFO: loaded from: classes26.dex */
public abstract class RecordSessionScene extends BaseScreenAdaptScene implements InterfaceC20011613Rq {
    public boolean LLJJL;

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final String LLLLL() {
        return "video_shoot_page";
    }

    @Override // X.AbstractC214814194y, X.C198H
    public void finish() {
        this.LLJJL = false;
        super.finish();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public void onDestroyView() {
        this.LLJJL = false;
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public InterfaceC1674890tgd LLLLLILLIL() {
        return c0.LIZ;
    }

    @Override // X.InterfaceC20011613Rq
    public final boolean isRecording() {
        return this.LLJJL;
    }

    @Override // X.AbstractC214814194y, X.C19A3, com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        this.LLJJL = true;
        super.onCreate(bundle);
    }
}

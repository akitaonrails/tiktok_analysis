package com.ss.android.ugc.aweme.portrait.preview;

import X.AbstractC214814194y;
import X.C0MGE;
import X.C1686990u09;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitStylePreviewRootScene extends AbstractC214814194y implements C0MGE {
    public AIPortraitStylePreviewRootScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(55));
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (findSceneByTag("AIPortraitStylePreviewChild") == null) {
            add(R.id.aqp, new C1686990u09(), "AIPortraitStylePreviewChild");
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        frameLayout.setId(R.id.aqp);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}

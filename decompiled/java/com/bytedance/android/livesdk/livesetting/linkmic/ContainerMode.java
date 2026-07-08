package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class ContainerMode {
    public static final TypeAdapter ADAPTER = new ContainerMode_OptTypeAdapter(NormalGson.singleton());

    @C09CT("pad_landscape")
    public ContainerModeScene padLandscape;

    @C09CT("pad_portrait")
    public ContainerModeScene padPortrait;

    @C09CT("canvas")
    public ContainerModeScene viewForCanvas;

    @C09CT("link")
    public ContainerModeScene viewForLink;

    @C09CT("search")
    public ContainerModeScene viewForSearch;

    public ContainerMode() {
        this(new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null));
    }

    public ContainerMode(ContainerModeScene containerModeScene, ContainerModeScene containerModeScene2, ContainerModeScene containerModeScene3, ContainerModeScene containerModeScene4, ContainerModeScene containerModeScene5) {
        this.viewForCanvas = containerModeScene;
        this.viewForLink = containerModeScene2;
        this.viewForSearch = containerModeScene3;
        this.padPortrait = containerModeScene4;
        this.padLandscape = containerModeScene5;
    }
}

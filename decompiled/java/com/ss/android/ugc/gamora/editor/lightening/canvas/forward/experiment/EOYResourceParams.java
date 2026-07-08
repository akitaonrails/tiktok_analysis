package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class EOYResourceParams {

    @C09CT("background")
    public final String background;

    @C09CT("create_tab_album_guide_background")
    public final String createTabAlbumGuide;

    @C09CT("create_tab_background")
    public final String createTabBackground;

    @C09CT("loading_lottie")
    public final String loadingLottie;

    @C09CT("post_btn_lottie")
    public final String postBtnLottie;

    @C09CT("preview_lottie")
    public final String previewLottie;

    public EOYResourceParams() {
        this("", "", "", "", "", "");
    }

    public EOYResourceParams(String str, String str2, String str3, String str4, String str5, String str6) {
        this.background = str;
        this.createTabBackground = str2;
        this.previewLottie = str3;
        this.loadingLottie = str4;
        this.postBtnLottie = str5;
        this.createTabAlbumGuide = str6;
    }
}

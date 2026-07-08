package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubCustomizedBenefitMedia {

    @C09CT("icon_img")
    public ImageModel iconImg;

    @C09CT("icon_img_dark")
    public ImageModel iconImgDark;

    @C09CT("is_edited")
    public boolean isEdited;

    @C09CT("title")
    public String title = "";

    @C09CT("content")
    public String content = "";

    @C09CT("url")
    public String url = "";

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("prompts")
    public List<String> prompts = new ArrayList();
}

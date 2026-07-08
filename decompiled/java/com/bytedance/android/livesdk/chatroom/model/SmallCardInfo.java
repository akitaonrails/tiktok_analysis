package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallCardInfo {

    @C09CT("container_type")
    public int containerType;

    @C09CT("log_data")
    public LogData logData;

    @C09CT("container_schema")
    public String containerSchema = "";

    @C09CT("img_url")
    public String imgUrl = "";

    @C09CT("enter_animate_lottie_url")
    public String enterAnimateLottieUrl = "";

    @C09CT("enter_img_url")
    public String enterImgUrl = "";

    @C09CT("end_animate_lottie_url")
    public String endAnimateLottieUrl = "";

    @C09CT("end_img_url")
    public String endImgUrl = "";

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("click_config")
    public List<ClickItem> clickConfig = new ArrayList();

    @C09CT("render_config")
    public String renderConfig = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();
}

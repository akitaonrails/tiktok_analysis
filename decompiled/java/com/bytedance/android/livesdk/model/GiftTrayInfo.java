package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class GiftTrayInfo {

    @C09CT("can_mirror")
    public boolean canMirror;

    @C09CT("tray_dynamic_img")
    public ImageModel mDynamicImg;

    @C09CT("right_tag_bg_color")
    public List<String> rightTagBgColor;

    @C09CT("right_tag_bg_img")
    public ImageModel rightTagBgImg;

    @C09CT("right_tag_text")
    public Text rightTagText;

    @C09CT("tray_normal_bg_color")
    public List<String> trayNormalBgColor;

    @C09CT("tray_normal_bg_img")
    public ImageModel trayNormalBgImg;

    @C09CT("tray_small_bg_color")
    public List<String> traySmallBgColor;

    @C09CT("tray_small_bg_img")
    public ImageModel traySmallBgImg;

    @C09CT("tray_desc_text_color")
    public String trayDescTextColor = "";

    @C09CT("right_tag_jump_schema")
    public String rightTagJumpSchema = "";

    @C09CT("gift_tray_jump_schema")
    public String giftTrayJumpSchema = "";

    @C09CT("tray_name_text_color")
    public String trayNameTextColor = "";
}

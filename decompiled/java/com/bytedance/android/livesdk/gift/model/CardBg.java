package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CardBg {

    @C09CT("compact_layout")
    public boolean compactLayout;

    @C09CT("name_active_opacity")
    public double nameActiveOpacity;

    @C09CT("name_inactive_opacity")
    public double nameInactiveOpacity;

    @C09CT("border_radius")
    public String borderRadius = "";

    @C09CT("img_border_color")
    public String imgBorderColor = "";

    @C09CT("name_border_color")
    public String nameBorderColor = "";

    @C09CT("name_text_color")
    public String nameTextColor = "";

    @C09CT("name_bg_color")
    public String nameBgColor = "";

    @C09CT("effect_name_text_class")
    public List<String> effectNameTextClass = new ArrayList();

    @C09CT("content_text_class")
    public List<String> contentTextClass = new ArrayList();

    @C09CT("user_name_text_class")
    public List<String> userNameTextClass = new ArrayList();

    @C09CT("description_text_class")
    public List<String> descriptionTextClass = new ArrayList();

    @C09CT("close_icon_color")
    public String closeIconColor = "";
}

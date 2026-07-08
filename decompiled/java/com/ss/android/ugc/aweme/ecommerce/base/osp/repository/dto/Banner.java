package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Banner {

    @C09CT("background_color")
    public CustomColor backgroundColor;

    @C09CT("content")
    public Map<String, String> eventTrackInfo;

    @C09CT("icon")
    public Icon icon;

    @C09CT("priority")
    public Long priority;

    @C09CT("schema")
    public String schema;

    @C09CT("sub_title")
    public TextAttribute subTitle;

    @C09CT("title")
    public TextAttribute title;

    @C09CT("title_en")
    public TextAttribute titleEn;

    public Banner() {
        this(null, null, null, null, null, null, null, null);
    }

    public Banner(Long l, Icon icon, TextAttribute textAttribute, TextAttribute textAttribute2, TextAttribute textAttribute3, CustomColor customColor, String str, Map<String, String> map) {
        this.priority = l;
        this.icon = icon;
        this.title = textAttribute;
        this.titleEn = textAttribute2;
        this.subTitle = textAttribute3;
        this.backgroundColor = customColor;
        this.schema = str;
        this.eventTrackInfo = map;
    }
}

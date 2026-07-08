package com.bytedance.hybrid.spark.raven.data;

import X.C09CS;
import X.C09CT;
import com.bytedance.hybrid.spark.raven.utils.RrggbbaaUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class Features implements Serializable {

    @C09CT("auto_load_more")
    public final Boolean autoLoadMore;

    @C09CT("background_color")
    @C09CS(RrggbbaaUtils.class)
    public final int backgroundColor;

    @C09CT("background_color_dark")
    @C09CS(RrggbbaaUtils.class)
    public final int backgroundColorDark;

    @C09CT("column")
    public final int column;

    @C09CT("container_key")
    public final String containerKey;

    @C09CT("dynamic_events")
    public final List<RavenEvent> dynamicEvents;

    @C09CT("events")
    public final Map<String, EventModel> events;

    @C09CT("gap")
    public final int gap;

    @C09CT("group_layout_type")
    public final String groupLayoutType;

    @C09CT("height")
    public final Integer height;

    @C09CT("horizontal")
    public final String horizontal;

    @C09CT("index")
    public final Integer index;

    @C09CT("is_sticky")
    public final Boolean isSticky;

    @C09CT("layout_type")
    public final String layoutType;

    @C09CT("offset")
    public final Integer[] offset;

    @C09CT("padding_bottom")
    public final int paddingBottom;

    @C09CT("padding_left")
    public final int paddingLeft;

    @C09CT("padding_right")
    public final int paddingRight;

    @C09CT("padding_top")
    public final int paddingTop;

    @C09CT("pre_load_more_count")
    public final Integer preLoadMoreCount;

    @C09CT("sub_type")
    public final String subType;

    @C09CT("type")
    public final String type;

    @C09CT("url")
    public final String url;

    @C09CT("vertical")
    public final String vertical;

    @C09CT("width")
    public final Integer width;

    public Features() {
        this(null, null, null, null, 1, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    public Features(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Boolean bool, String str5, String str6, Map<String, EventModel> map, List<RavenEvent> list, Boolean bool2, Integer num, String str7, String str8, Integer[] numArr, Integer num2, Integer num3, Integer num4) {
        this.containerKey = str;
        this.type = str2;
        this.layoutType = str3;
        this.groupLayoutType = str4;
        this.column = i;
        this.gap = i2;
        this.paddingLeft = i3;
        this.paddingRight = i4;
        this.paddingTop = i5;
        this.paddingBottom = i6;
        this.backgroundColor = i7;
        this.backgroundColorDark = i8;
        this.isSticky = bool;
        this.url = str5;
        this.subType = str6;
        this.events = map;
        this.dynamicEvents = list;
        this.autoLoadMore = bool2;
        this.preLoadMoreCount = num;
        this.vertical = str7;
        this.horizontal = str8;
        this.offset = numArr;
        this.index = num2;
        this.width = num3;
        this.height = num4;
    }
}

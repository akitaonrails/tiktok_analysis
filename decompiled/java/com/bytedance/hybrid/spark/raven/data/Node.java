package com.bytedance.hybrid.spark.raven.data;

import X.C09CT;
import X.InterfaceC1294060jmO;
import com.google.gson.k;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class Node {

    @C09CT("column")
    public final int column;

    @C09CT("data")
    public final k data;

    @C09CT("dynamic_events")
    public final List<RavenEvent> dynamicEvents;

    @C09CT("events")
    public final Map<String, EventModel> events;

    @C09CT("features")
    public final Features features;

    @C09CT("gap")
    public final int gap;

    @C09CT("group_layout_type")
    public final String groupLayoutType;

    @C09CT("is_sticky")
    public final Boolean isSticky;

    @C09CT("layout_type")
    public final String layoutType;

    @C09CT("name")
    public final String name;

    @C09CT("sub_type")
    public final String subType;

    @C09CT("type")
    public final String type;

    @C09CT("url")
    public final String url;

    public Node() {
        this(null, null, null, null, null, null, 1, 0, null, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getColumn$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getDynamicEvents$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getEvents$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getGap$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getGroupLayoutType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getLayoutType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSubType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getUrl$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void isSticky$annotations() {
    }

    public final Node copy(String str, k kVar, Features features, String str2, String str3, String str4, int i, int i2, Boolean bool, String str5, String str6, Map<String, EventModel> map, List<RavenEvent> list) {
        return new Node(str, kVar, features, str2, str3, str4, i, i2, bool, str5, str6, map, list);
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    public Node(String str, k kVar, Features features, String str2, String str3, String str4, int i, int i2, Boolean bool, String str5, String str6, Map<String, EventModel> map, List<RavenEvent> list) {
        this.name = str;
        this.data = kVar;
        this.features = features;
        this.type = str2;
        this.layoutType = str3;
        this.groupLayoutType = str4;
        this.column = i;
        this.gap = i2;
        this.isSticky = bool;
        this.url = str5;
        this.subType = str6;
        this.events = map;
        this.dynamicEvents = list;
    }
}

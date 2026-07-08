package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class MapModeEnterMethod {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MapModeEnterMethod[] $VALUES;
    public final String enterMethod;
    public static final MapModeEnterMethod CLICK_ADDRESS = new MapModeEnterMethod("CLICK_ADDRESS", 0, "click_address");
    public static final MapModeEnterMethod CLICK_MAP_OTHER_AREA = new MapModeEnterMethod("CLICK_MAP_OTHER_AREA", 1, "click_map_other_area");
    public static final MapModeEnterMethod CLICK_MAP_TOP_DISCOVER = new MapModeEnterMethod("CLICK_MAP_TOP_DISCOVER", 2, "click_map_top_discover");
    public static final MapModeEnterMethod CLICK_MAP_POI_MARKER = new MapModeEnterMethod("CLICK_MAP_POI_MARKER", 3, "click_map_poi_marker");
    public static final MapModeEnterMethod CLICK_MAP_FULL_SCREEN = new MapModeEnterMethod("CLICK_MAP_FULL_SCREEN", 4, "click_map_full_screen");
    public static final MapModeEnterMethod CLICK_MAP_BOTTOM_BTN = new MapModeEnterMethod("CLICK_MAP_BOTTOM_BTN", 5, "click_map_bottom_btn");
    public static final MapModeEnterMethod CLICK_POI_CARD = new MapModeEnterMethod("CLICK_POI_CARD", 6, "click_poi_card");

    public static final /* synthetic */ MapModeEnterMethod[] $values() {
        return new MapModeEnterMethod[]{CLICK_ADDRESS, CLICK_MAP_OTHER_AREA, CLICK_MAP_TOP_DISCOVER, CLICK_MAP_POI_MARKER, CLICK_MAP_FULL_SCREEN, CLICK_MAP_BOTTOM_BTN, CLICK_POI_CARD};
    }

    public static InterfaceC2044707zh<MapModeEnterMethod> getEntries() {
        return $ENTRIES;
    }

    static {
        MapModeEnterMethod[] mapModeEnterMethodArr$values = $values();
        $VALUES = mapModeEnterMethodArr$values;
        $ENTRIES = new C2254308sP(mapModeEnterMethodArr$values);
    }

    public static MapModeEnterMethod[] values() {
        return (MapModeEnterMethod[]) $VALUES.clone();
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public static MapModeEnterMethod valueOf(String str) {
        return (MapModeEnterMethod) C08FF.LIZ(MapModeEnterMethod.class, str);
    }

    public MapModeEnterMethod(String str, int i, String str2) {
        this.enterMethod = str2;
    }
}

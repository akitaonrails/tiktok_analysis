package com.ss.android.ugc.aweme.discover.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBackgroundConfig implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("background_type")
    public final Integer backgroundType;

    @C09CT("dark_background_color")
    public final String darkBackgroundColor;

    @C09CT("dark_background_url")
    public final String darkBackgroundUrl;

    @C09CT("disappear_strategy")
    public final Integer disappearStrategy;

    @C09CT("display_position")
    public final Integer displayPosition;
    public boolean isCacheData;

    @C09CT("light_background_color")
    public final String lightBackgroundColor;

    @C09CT("light_background_url")
    public final String lightBackgroundUrl;

    @C09CT("show_background")
    public final Boolean showBackground;

    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DisplayPosition {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ DisplayPosition[] $VALUES;
        public final int value;
        public static final DisplayPosition FROM_STATUS_BAR = new DisplayPosition("FROM_STATUS_BAR", 0, 8);
        public static final DisplayPosition FROM_SEARCH_BOX = new DisplayPosition("FROM_SEARCH_BOX", 1, 1);

        public static final /* synthetic */ DisplayPosition[] $values() {
            return new DisplayPosition[]{FROM_STATUS_BAR, FROM_SEARCH_BOX};
        }

        public static InterfaceC2044707zh<DisplayPosition> getEntries() {
            return $ENTRIES;
        }

        static {
            DisplayPosition[] displayPositionArr$values = $values();
            $VALUES = displayPositionArr$values;
            $ENTRIES = new C2254308sP(displayPositionArr$values);
        }

        public static DisplayPosition[] values() {
            return (DisplayPosition[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static DisplayPosition valueOf(String str) {
            return (DisplayPosition) C08FF.LIZ(DisplayPosition.class, str);
        }

        public DisplayPosition(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public SearchBackgroundConfig() {
        this(Boolean.FALSE, 8, null, null, 0, null, null, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBackgroundConfig)) {
            return false;
        }
        SearchBackgroundConfig searchBackgroundConfig = (SearchBackgroundConfig) obj;
        return Intrinsics.LJFF(this.showBackground, searchBackgroundConfig.showBackground) && Intrinsics.LJFF(this.displayPosition, searchBackgroundConfig.displayPosition) && Intrinsics.LJFF(this.darkBackgroundUrl, searchBackgroundConfig.darkBackgroundUrl) && Intrinsics.LJFF(this.lightBackgroundUrl, searchBackgroundConfig.lightBackgroundUrl) && Intrinsics.LJFF(this.disappearStrategy, searchBackgroundConfig.disappearStrategy) && Intrinsics.LJFF(this.backgroundType, searchBackgroundConfig.backgroundType) && Intrinsics.LJFF(this.darkBackgroundColor, searchBackgroundConfig.darkBackgroundColor) && Intrinsics.LJFF(this.lightBackgroundColor, searchBackgroundConfig.lightBackgroundColor) && this.isCacheData == searchBackgroundConfig.isCacheData;
    }

    public final boolean isCacheData() {
        return this.isCacheData;
    }

    public final void setCacheData(boolean z) {
        this.isCacheData = z;
    }

    public SearchBackgroundConfig(Boolean bool, Integer num, String str, String str2, Integer num2, Integer num3, String str3, String str4, boolean z) {
        this.showBackground = bool;
        this.displayPosition = num;
        this.darkBackgroundUrl = str;
        this.lightBackgroundUrl = str2;
        this.disappearStrategy = num2;
        this.backgroundType = num3;
        this.darkBackgroundColor = str3;
        this.lightBackgroundColor = str4;
        this.isCacheData = z;
    }
}

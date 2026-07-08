package com.ss.android.ugc.aweme.profile.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes20.dex */
public final class ShopEntranceInfo implements Serializable {

    @C09CT("count")
    public final int count;

    @C09CT("creator_type")
    public final int creatorType;

    @C09CT("schema")
    public final String schema;

    @C09CT("shop_type")
    public final int shopType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes27.dex */
    public static final class ShopCreatorTypeEnum {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ ShopCreatorTypeEnum[] $VALUES;
        public static final Companion Companion;
        public final String mobString;
        public final int value;
        public static final ShopCreatorTypeEnum UNKNOWN = new ShopCreatorTypeEnum("UNKNOWN", 0, 0, "unknown");
        public static final ShopCreatorTypeEnum OFFICIAL = new ShopCreatorTypeEnum("OFFICIAL", 1, 1, "official");
        public static final ShopCreatorTypeEnum CHANNEL = new ShopCreatorTypeEnum("CHANNEL", 2, 2, "channel");
        public static final ShopCreatorTypeEnum NORMAL = new ShopCreatorTypeEnum("NORMAL", 3, 3, "normal");

        public static final /* synthetic */ ShopCreatorTypeEnum[] $values() {
            return new ShopCreatorTypeEnum[]{UNKNOWN, OFFICIAL, CHANNEL, NORMAL};
        }

        public static InterfaceC2044707zh<ShopCreatorTypeEnum> getEntries() {
            return $ENTRIES;
        }

        static {
            ShopCreatorTypeEnum[] shopCreatorTypeEnumArr$values = $values();
            $VALUES = shopCreatorTypeEnumArr$values;
            $ENTRIES = new C2254308sP(shopCreatorTypeEnumArr$values);
            Companion = new Companion();
        }

        public static ShopCreatorTypeEnum[] values() {
            return (ShopCreatorTypeEnum[]) $VALUES.clone();
        }

        public final String getMobString() {
            return this.mobString;
        }

        public final int getValue() {
            return this.value;
        }

        public static final class Companion {
            public final ShopCreatorTypeEnum fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (ShopCreatorTypeEnum shopCreatorTypeEnum : ShopCreatorTypeEnum.values()) {
                        if (shopCreatorTypeEnum.getValue() == num.intValue()) {
                            return shopCreatorTypeEnum;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return ShopCreatorTypeEnum.OFFICIAL;
            }
        }

        public static ShopCreatorTypeEnum valueOf(String str) {
            return (ShopCreatorTypeEnum) C08FF.LIZ(ShopCreatorTypeEnum.class, str);
        }

        public ShopCreatorTypeEnum(String str, int i, int i2, String str2) {
            this.value = i2;
            this.mobString = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ShopTypeEnum {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ ShopTypeEnum[] $VALUES;
        public static final Companion Companion;
        public final int value;
        public static final ShopTypeEnum UNKNOWN = new ShopTypeEnum("UNKNOWN", 0, 0);
        public static final ShopTypeEnum SHOWCASE = new ShopTypeEnum("SHOWCASE", 1, 1);
        public static final ShopTypeEnum SHOP = new ShopTypeEnum("SHOP", 2, 2);

        public static final /* synthetic */ ShopTypeEnum[] $values() {
            return new ShopTypeEnum[]{UNKNOWN, SHOWCASE, SHOP};
        }

        public static InterfaceC2044707zh<ShopTypeEnum> getEntries() {
            return $ENTRIES;
        }

        static {
            ShopTypeEnum[] shopTypeEnumArr$values = $values();
            $VALUES = shopTypeEnumArr$values;
            $ENTRIES = new C2254308sP(shopTypeEnumArr$values);
            Companion = new Companion();
        }

        public static ShopTypeEnum[] values() {
            return (ShopTypeEnum[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static final class Companion {
            public final ShopTypeEnum fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (ShopTypeEnum shopTypeEnum : ShopTypeEnum.values()) {
                        if (shopTypeEnum.getValue() == num.intValue()) {
                            return shopTypeEnum;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return ShopTypeEnum.UNKNOWN;
            }
        }

        public static ShopTypeEnum valueOf(String str) {
            return (ShopTypeEnum) C08FF.LIZ(ShopTypeEnum.class, str);
        }

        public ShopTypeEnum(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public final ShopCreatorTypeEnum getCreatorType() {
        return ShopCreatorTypeEnum.Companion.fromInt(Integer.valueOf(this.creatorType));
    }

    public final ShopTypeEnum getShopType() {
        return ShopTypeEnum.Companion.fromInt(Integer.valueOf(this.shopType));
    }

    public ShopEntranceInfo(String str, int i, int i2, int i3) {
        this.schema = str;
        this.count = i;
        this.shopType = i2;
        this.creatorType = i3;
    }
}

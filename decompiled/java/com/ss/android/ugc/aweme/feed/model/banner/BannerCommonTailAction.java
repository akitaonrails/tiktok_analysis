package com.ss.android.ugc.aweme.feed.model.banner;

import X.C08FF;
import X.C09CT;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class BannerCommonTailAction implements Serializable {

    @C09CT("actions")
    public List<BannerCommonAction> actions;

    @C09CT("type")
    public int type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BannerActionType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ BannerActionType[] $VALUES;
        public static final Companion Companion;
        public final int type;
        public static final BannerActionType BANNER_ACTION_TYPE_UNKNOWN = new BannerActionType("BANNER_ACTION_TYPE_UNKNOWN", 0, 0);
        public static final BannerActionType BANNER_ACTION_TYPE_ARROW_JUMP = new BannerActionType("BANNER_ACTION_TYPE_ARROW_JUMP", 1, 1);
        public static final BannerActionType BANNER_ACTION_TYPE_BUTTON_SELECTION = new BannerActionType("BANNER_ACTION_TYPE_BUTTON_SELECTION", 2, 2);
        public static final BannerActionType BANNER_ACTION_TYPE_TEXT_SELECTION = new BannerActionType("BANNER_ACTION_TYPE_TEXT_SELECTION", 3, 3);
        public static final BannerActionType BANNER_ACTION_TYPE_CLOSE = new BannerActionType("BANNER_ACTION_TYPE_CLOSE", 4, 4);
        public static final BannerActionType BANNER_ACTION_TYPE_CUSTOM = new BannerActionType("BANNER_ACTION_TYPE_CUSTOM", 5, 5);
        public static final BannerActionType BANNER_ACTION_TYPE_SEARCH_TAKO_TEXT_ICON = new BannerActionType("BANNER_ACTION_TYPE_SEARCH_TAKO_TEXT_ICON", 6, 6);

        public static final /* synthetic */ BannerActionType[] $values() {
            return new BannerActionType[]{BANNER_ACTION_TYPE_UNKNOWN, BANNER_ACTION_TYPE_ARROW_JUMP, BANNER_ACTION_TYPE_BUTTON_SELECTION, BANNER_ACTION_TYPE_TEXT_SELECTION, BANNER_ACTION_TYPE_CLOSE, BANNER_ACTION_TYPE_CUSTOM, BANNER_ACTION_TYPE_SEARCH_TAKO_TEXT_ICON};
        }

        public static final BannerActionType fromValue(int i) {
            return Companion.fromValue(i);
        }

        public static InterfaceC2044707zh<BannerActionType> getEntries() {
            return $ENTRIES;
        }

        static {
            BannerActionType[] bannerActionTypeArr$values = $values();
            $VALUES = bannerActionTypeArr$values;
            $ENTRIES = new C2254308sP(bannerActionTypeArr$values);
            Companion = new Companion();
        }

        public static BannerActionType[] values() {
            return (BannerActionType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }

        public static final class Companion {
            public final BannerActionType fromValue(int i) {
                for (BannerActionType bannerActionType : BannerActionType.values()) {
                    if (bannerActionType.getType() == i) {
                        return bannerActionType;
                    }
                }
                return BannerActionType.BANNER_ACTION_TYPE_UNKNOWN;
            }
        }

        public static BannerActionType valueOf(String str) {
            return (BannerActionType) C08FF.LIZ(BannerActionType.class, str);
        }

        public BannerActionType(String str, int i, int i2) {
            this.type = i2;
        }
    }

    public BannerCommonTailAction() {
        this(BannerActionType.BANNER_ACTION_TYPE_UNKNOWN.getType(), null);
    }

    public final BannerCommonTailAction copy(int i, List<BannerCommonAction> list) {
        return new BannerCommonTailAction(i, list);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerCommonTailAction(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.actions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final BannerActionType getTailActionType() {
        return BannerActionType.Companion.fromValue(this.type);
    }

    public BannerCommonTailAction(int i, List<BannerCommonAction> list) {
        this.type = i;
        this.actions = list;
    }
}

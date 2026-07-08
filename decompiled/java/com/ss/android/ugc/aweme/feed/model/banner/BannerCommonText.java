package com.ss.android.ugc.aweme.feed.model.banner;

import X.C08FF;
import X.C09CT;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerCommonText implements Serializable {

    @C09CT("action_type")
    public int action;

    @C09CT("body")
    public String textBody;

    @C09CT("text_color")
    public String textColor;

    @C09CT("schema")
    public String textSchema;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BannerTextActionType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ BannerTextActionType[] $VALUES;
        public static final BannerTextActionType BANNER_TEXT_ACTION_TYPE_NONE = new BannerTextActionType("BANNER_TEXT_ACTION_TYPE_NONE", 0, 0);
        public static final BannerTextActionType BANNER_TEXT_ACTION_TYPE_SCHEMA_JUMP = new BannerTextActionType("BANNER_TEXT_ACTION_TYPE_SCHEMA_JUMP", 1, 1);
        public static final Companion Companion;
        public final int type;

        public static final /* synthetic */ BannerTextActionType[] $values() {
            return new BannerTextActionType[]{BANNER_TEXT_ACTION_TYPE_NONE, BANNER_TEXT_ACTION_TYPE_SCHEMA_JUMP};
        }

        public static final BannerTextActionType fromValue(int i) {
            return Companion.fromValue(i);
        }

        public static InterfaceC2044707zh<BannerTextActionType> getEntries() {
            return $ENTRIES;
        }

        static {
            BannerTextActionType[] bannerTextActionTypeArr$values = $values();
            $VALUES = bannerTextActionTypeArr$values;
            $ENTRIES = new C2254308sP(bannerTextActionTypeArr$values);
            Companion = new Companion();
        }

        public static BannerTextActionType[] values() {
            return (BannerTextActionType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }

        public static final class Companion {
            public final BannerTextActionType fromValue(int i) {
                for (BannerTextActionType bannerTextActionType : BannerTextActionType.values()) {
                    if (bannerTextActionType.getType() == i) {
                        return bannerTextActionType;
                    }
                }
                return BannerTextActionType.BANNER_TEXT_ACTION_TYPE_NONE;
            }
        }

        public static BannerTextActionType valueOf(String str) {
            return (BannerTextActionType) C08FF.LIZ(BannerTextActionType.class, str);
        }

        public BannerTextActionType(String str, int i, int i2) {
            this.type = i2;
        }
    }

    public BannerCommonText() {
        this(null, null, null, BannerTextActionType.BANNER_TEXT_ACTION_TYPE_NONE.getType());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerCommonText(textBody=");
        sbLIZ.append(this.textBody);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", textSchema=");
        sbLIZ.append(this.textSchema);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final BannerTextActionType getTextActionType() {
        return BannerTextActionType.Companion.fromValue(this.action);
    }

    public final void setTextBody(String str) {
        this.textBody = str;
    }

    public BannerCommonText(String str, String str2, String str3, int i) {
        this.textBody = str;
        this.textColor = str2;
        this.textSchema = str3;
        this.action = i;
    }
}

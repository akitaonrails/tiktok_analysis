package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnchorAnimateStruct implements Serializable {

    @C09CT("record")
    public long record = -1;

    @C09CT("animate_type")
    public int animateType = AnchorAnimateType.ANIMATE_TYPE_NONE.getType();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnchorAnimateType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ AnchorAnimateType[] $VALUES;
        public final int type;
        public static final AnchorAnimateType ANIMATE_TYPE_NONE = new AnchorAnimateType("ANIMATE_TYPE_NONE", 0, 0);
        public static final AnchorAnimateType ANIMATE_TYPE_GENERAL = new AnchorAnimateType("ANIMATE_TYPE_GENERAL", 1, 1);

        public static final /* synthetic */ AnchorAnimateType[] $values() {
            return new AnchorAnimateType[]{ANIMATE_TYPE_NONE, ANIMATE_TYPE_GENERAL};
        }

        public static InterfaceC2044707zh<AnchorAnimateType> getEntries() {
            return $ENTRIES;
        }

        static {
            AnchorAnimateType[] anchorAnimateTypeArr$values = $values();
            $VALUES = anchorAnimateTypeArr$values;
            $ENTRIES = new C2254308sP(anchorAnimateTypeArr$values);
        }

        public static AnchorAnimateType[] values() {
            return (AnchorAnimateType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }

        public static AnchorAnimateType valueOf(String str) {
            return (AnchorAnimateType) C08FF.LIZ(AnchorAnimateType.class, str);
        }

        public AnchorAnimateType(String str, int i, int i2) {
            this.type = i2;
        }
    }

    public final int getAnimateType() {
        return this.animateType;
    }

    public final long getRecord() {
        return this.record;
    }
}

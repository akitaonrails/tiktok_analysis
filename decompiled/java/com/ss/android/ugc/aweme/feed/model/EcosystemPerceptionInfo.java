package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C15438062q;
import X.C2097908Jt;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class EcosystemPerceptionInfo implements Serializable {

    @C09CT("eco_penalty_musk_layer_text")
    public final String penaltyMaskLayerText;

    @C09CT("eco_penalty_result")
    public final Integer penaltyResult;

    @C09CT("eco_penalty_source")
    public final Integer penaltySource;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PenaltyResultEnum {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ PenaltyResultEnum[] $VALUES;
        public static final Companion Companion;
        public static final Map<Integer, PenaltyResultEnum> MAP;
        public final int penaltyResult;
        public static final PenaltyResultEnum UNSPECIFIED = new PenaltyResultEnum("UNSPECIFIED", 0, 0);
        public static final PenaltyResultEnum NO_PENALTY = new PenaltyResultEnum("NO_PENALTY", 1, 1);
        public static final PenaltyResultEnum NOT_FOR_FEED = new PenaltyResultEnum("NOT_FOR_FEED", 2, 2);
        public static final PenaltyResultEnum NOT_RECOMMENDED = new PenaltyResultEnum("NOT_RECOMMENDED", 3, 3);

        public static final /* synthetic */ PenaltyResultEnum[] $values() {
            return new PenaltyResultEnum[]{UNSPECIFIED, NO_PENALTY, NOT_FOR_FEED, NOT_RECOMMENDED};
        }

        public static InterfaceC2044707zh<PenaltyResultEnum> getEntries() {
            return $ENTRIES;
        }

        static {
            PenaltyResultEnum[] penaltyResultEnumArr$values = $values();
            $VALUES = penaltyResultEnumArr$values;
            $ENTRIES = new C2254308sP(penaltyResultEnumArr$values);
            Companion = new Companion();
            InterfaceC2044707zh<PenaltyResultEnum> entries = getEntries();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
            for (PenaltyResultEnum penaltyResultEnum : entries) {
                linkedHashMap.put(Integer.valueOf(penaltyResultEnum.penaltyResult), penaltyResultEnum);
            }
            MAP = linkedHashMap;
        }

        public static PenaltyResultEnum[] values() {
            return (PenaltyResultEnum[]) $VALUES.clone();
        }

        public final int getPenaltyResult() {
            return this.penaltyResult;
        }

        public static final class Companion {
            public final PenaltyResultEnum fromInt(Integer num) {
                PenaltyResultEnum penaltyResultEnum = PenaltyResultEnum.MAP.get(num);
                if (penaltyResultEnum == null) {
                    return PenaltyResultEnum.UNSPECIFIED;
                }
                return penaltyResultEnum;
            }
        }

        public static PenaltyResultEnum valueOf(String str) {
            return (PenaltyResultEnum) C08FF.LIZ(PenaltyResultEnum.class, str);
        }

        public PenaltyResultEnum(String str, int i, int i2) {
            this.penaltyResult = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PenaltySourceEnum {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ PenaltySourceEnum[] $VALUES;
        public static final Companion Companion;
        public static final Map<Integer, PenaltySourceEnum> MAP;
        public final Integer penaltySource;
        public static final PenaltySourceEnum UNSPECIFIED = new PenaltySourceEnum("UNSPECIFIED", 0, 0);
        public static final PenaltySourceEnum TNS = new PenaltySourceEnum("TNS", 1, 1);
        public static final PenaltySourceEnum FQ = new PenaltySourceEnum("FQ", 2, 2);

        public static final /* synthetic */ PenaltySourceEnum[] $values() {
            return new PenaltySourceEnum[]{UNSPECIFIED, TNS, FQ};
        }

        public static InterfaceC2044707zh<PenaltySourceEnum> getEntries() {
            return $ENTRIES;
        }

        static {
            PenaltySourceEnum[] penaltySourceEnumArr$values = $values();
            $VALUES = penaltySourceEnumArr$values;
            $ENTRIES = new C2254308sP(penaltySourceEnumArr$values);
            Companion = new Companion();
            InterfaceC2044707zh<PenaltySourceEnum> entries = getEntries();
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
            for (PenaltySourceEnum penaltySourceEnum : entries) {
                linkedHashMap.put(penaltySourceEnum.penaltySource, penaltySourceEnum);
            }
            MAP = linkedHashMap;
        }

        public static PenaltySourceEnum[] values() {
            return (PenaltySourceEnum[]) $VALUES.clone();
        }

        public final Integer getPenaltySource() {
            return this.penaltySource;
        }

        public static final class Companion {
            public final PenaltySourceEnum fromInt(Integer num) {
                PenaltySourceEnum penaltySourceEnum = PenaltySourceEnum.MAP.get(num);
                if (penaltySourceEnum == null) {
                    return PenaltySourceEnum.UNSPECIFIED;
                }
                return penaltySourceEnum;
            }
        }

        public static PenaltySourceEnum valueOf(String str) {
            return (PenaltySourceEnum) C08FF.LIZ(PenaltySourceEnum.class, str);
        }

        public PenaltySourceEnum(String str, int i, Integer num) {
            this.penaltySource = num;
        }
    }

    public EcosystemPerceptionInfo() {
        this(0, 0, null);
    }

    public final PenaltyResultEnum getPenaltyResult() {
        return PenaltyResultEnum.Companion.fromInt(this.penaltyResult);
    }

    public final PenaltySourceEnum getPenaltySource() {
        return PenaltySourceEnum.Companion.fromInt(this.penaltySource);
    }

    public EcosystemPerceptionInfo(Integer num, Integer num2, String str) {
        this.penaltySource = num;
        this.penaltyResult = num2;
        this.penaltyMaskLayerText = str;
    }
}

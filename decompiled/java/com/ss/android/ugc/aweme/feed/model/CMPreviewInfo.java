package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class CMPreviewInfo implements Serializable {

    @C09CT("generated_preview_duration")
    public Long generatedPreviewDuration;

    @C09CT("generated_preview_start_time")
    public Long generatedPreviewStartTime;

    @C09CT("preview_settings_duration")
    public Long previewSettingsDuration;

    @C09CT("preview_settings_start_time")
    public Long previewSettingsStartTime;

    @C09CT("cm_preview_type")
    public Integer previewType;

    @C09CT("should_show_preview")
    public Boolean shouldShowPreview = Boolean.FALSE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes10.dex */
    public static final class PreviewType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ PreviewType[] $VALUES;
        public static final PreviewType CM_PREVIEW_TYPE_NO_CM_PREVIEW = new PreviewType("CM_PREVIEW_TYPE_NO_CM_PREVIEW", 0, 0);
        public static final PreviewType CM_PREVIEW_TYPE_SOV_PARTIAL_PREVIEW = new PreviewType("CM_PREVIEW_TYPE_SOV_PARTIAL_PREVIEW", 1, 1);
        public final int value;

        public static final /* synthetic */ PreviewType[] $values() {
            return new PreviewType[]{CM_PREVIEW_TYPE_NO_CM_PREVIEW, CM_PREVIEW_TYPE_SOV_PARTIAL_PREVIEW};
        }

        public static InterfaceC2044707zh<PreviewType> getEntries() {
            return $ENTRIES;
        }

        static {
            PreviewType[] previewTypeArr$values = $values();
            $VALUES = previewTypeArr$values;
            $ENTRIES = new C2254308sP(previewTypeArr$values);
        }

        public static PreviewType[] values() {
            return (PreviewType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static PreviewType valueOf(String str) {
            return (PreviewType) C08FF.LIZ(PreviewType.class, str);
        }

        public PreviewType(String str, int i, int i2) {
            this.value = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SubsStatus {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ SubsStatus[] $VALUES;
        public static final Companion Companion;
        public final int value;
        public static final SubsStatus UNKNOWN = new SubsStatus("UNKNOWN", 0, 0);
        public static final SubsStatus SUBSCRIBED_NOT_EXPIRED = new SubsStatus("SUBSCRIBED_NOT_EXPIRED", 1, 1);
        public static final SubsStatus SUBSCRIBED_EXPIRED_GRACE_PERIOD = new SubsStatus("SUBSCRIBED_EXPIRED_GRACE_PERIOD", 2, 2);
        public static final SubsStatus NOT_SUBSCRIBED = new SubsStatus("NOT_SUBSCRIBED", 3, 3);
        public static final SubsStatus CREATOR_SELF = new SubsStatus("CREATOR_SELF", 4, 4);

        public static final /* synthetic */ SubsStatus[] $values() {
            return new SubsStatus[]{UNKNOWN, SUBSCRIBED_NOT_EXPIRED, SUBSCRIBED_EXPIRED_GRACE_PERIOD, NOT_SUBSCRIBED, CREATOR_SELF};
        }

        public static InterfaceC2044707zh<SubsStatus> getEntries() {
            return $ENTRIES;
        }

        static {
            SubsStatus[] subsStatusArr$values = $values();
            $VALUES = subsStatusArr$values;
            $ENTRIES = new C2254308sP(subsStatusArr$values);
            Companion = new Companion();
        }

        public static SubsStatus[] values() {
            return (SubsStatus[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static final class Companion {
            public final SubsStatus fromInt(Integer num) {
                for (SubsStatus subsStatus : SubsStatus.values()) {
                    int value = subsStatus.getValue();
                    if (num != null && value == num.intValue()) {
                        return subsStatus;
                    }
                }
                return SubsStatus.UNKNOWN;
            }
        }

        public static SubsStatus valueOf(String str) {
            return (SubsStatus) C08FF.LIZ(SubsStatus.class, str);
        }

        public SubsStatus(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public final Long getGeneratedPreviewDuration() {
        return this.generatedPreviewDuration;
    }

    public final Long getGeneratedPreviewStartTime() {
        return this.generatedPreviewStartTime;
    }

    public final Long getPreviewSettingsDuration() {
        return this.previewSettingsDuration;
    }

    public final Long getPreviewSettingsStartTime() {
        return this.previewSettingsStartTime;
    }

    public final Integer getPreviewType() {
        return this.previewType;
    }

    public final Boolean getShouldShowPreview() {
        return this.shouldShowPreview;
    }

    public final void setGeneratedPreviewDuration(Long l) {
        this.generatedPreviewDuration = l;
    }

    public final void setGeneratedPreviewStartTime(Long l) {
        this.generatedPreviewStartTime = l;
    }

    public final void setPreviewSettingsDuration(Long l) {
        this.previewSettingsDuration = l;
    }

    public final void setPreviewSettingsStartTime(Long l) {
        this.previewSettingsStartTime = l;
    }

    public final void setPreviewType(Integer num) {
        this.previewType = num;
    }

    public final void setShouldShowPreview(Boolean bool) {
        this.shouldShowPreview = bool;
    }
}

package com.ss.bytertc.engine;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public class InternalVideoSourceConfig {
    public int source_category;
    public int source_type;

    public enum VideoContentCategory {
        VIDEO_CONTENT_CATEGORY_CAMERA(0),
        VIDEO_CONTENT_CATEGRORY_SCREEN(1);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static VideoContentCategory valueOf(String str) {
            return (VideoContentCategory) C08FF.LIZ(VideoContentCategory.class, str);
        }

        VideoContentCategory(int i) {
            this.value = i;
        }
    }

    public enum VideoSourceType {
        VIDEO_SOURCE_TYPE_EXTERNAL(0),
        VIDEO_SOURCE_TYPE_INTERNAL(1),
        VIDEO_SOURCE_TYPE_ENCODER_WITH_AUTO_SIMULCAST(2),
        VIDEO_SOURCE_TYPE_ENCODER_WITHOUT_AUTO_SIMULCAST(3),
        VIDEO_SOURCE_TYPE_FILE(4);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static VideoSourceType valueOf(String str) {
            return (VideoSourceType) C08FF.LIZ(VideoSourceType.class, str);
        }

        VideoSourceType(int i) {
            this.value = i;
        }
    }

    public int getVideoSourceCategory() {
        return this.source_category;
    }

    public int getVideoSourceType() {
        return this.source_type;
    }

    public InternalVideoSourceConfig(VideoSourceType videoSourceType, VideoContentCategory videoContentCategory) {
        this.source_type = videoSourceType.getValue();
        this.source_category = videoContentCategory.getValue();
    }
}

package com.ss.mediakit.image;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class MIOImageTaskConfig {
    public final long endOffset;
    public final String fileKey;
    public final Map<String, String> headers;
    public final String imageId;
    public final Map<String, Object> options;
    public final String partition;
    public final int priority;
    public final String scenario;
    public final long startOffset;
    public final String tag;
    public final String traceId;
    public final List<String> urls;

    public static class Builder {
        public String fileKey;
        public Map<String, String> headers;
        public String imageId;
        public Map<String, Object> options;
        public String partition;
        public String scenario;
        public long startOffset;
        public String tag;
        public String traceId;
        public List<String> urls;
        public int priority = 3;
        public long endOffset = -1;

        public MIOImageTaskConfig build() {
            return new MIOImageTaskConfig(this);
        }

        public Builder setEndOffset(long j) {
            this.endOffset = j;
            return this;
        }

        public Builder setFileKey(String str) {
            this.fileKey = str;
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.headers = map;
            return this;
        }

        public Builder setImageId(String str) {
            this.imageId = str;
            return this;
        }

        public Builder setOptions(Map<String, Object> map) {
            this.options = map;
            return this;
        }

        public Builder setPartition(String str) {
            this.partition = str;
            return this;
        }

        public Builder setPriority(int i) {
            this.priority = i;
            return this;
        }

        public Builder setScenario(String str) {
            this.scenario = str;
            return this;
        }

        public Builder setStartOffset(long j) {
            this.startOffset = j;
            return this;
        }

        public Builder setTag(String str) {
            this.tag = str;
            return this;
        }

        public Builder setTraceId(String str) {
            this.traceId = str;
            return this;
        }

        public Builder setUrls(List<String> list) {
            this.urls = list;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean isValid() {
        return !MIOImageUtils.isNullOrEmpty(this.urls);
    }

    public String mainUrl() {
        List<String> list = this.urls;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.urls, 0);
    }

    public long endOffset() {
        return this.endOffset;
    }

    public String fileKey() {
        return this.fileKey;
    }

    public Map<String, String> headers() {
        return this.headers;
    }

    public String imageId() {
        return this.imageId;
    }

    public Map<String, Object> options() {
        return this.options;
    }

    public String partition() {
        return this.partition;
    }

    public int priority() {
        return this.priority;
    }

    public String scenario() {
        return this.scenario;
    }

    public long startOffset() {
        return this.startOffset;
    }

    public String tag() {
        return this.tag;
    }

    public String traceId() {
        return this.traceId;
    }

    public List<String> urls() {
        return this.urls;
    }

    public MIOImageTaskConfig(Builder builder) {
        this.traceId = builder.traceId;
        this.imageId = builder.imageId;
        this.scenario = builder.scenario;
        this.priority = builder.priority;
        this.urls = builder.urls;
        this.headers = builder.headers;
        this.options = builder.options;
        this.startOffset = builder.startOffset;
        this.endOffset = builder.endOffset;
        this.fileKey = builder.fileKey;
        this.partition = builder.partition;
        this.tag = builder.tag;
    }
}

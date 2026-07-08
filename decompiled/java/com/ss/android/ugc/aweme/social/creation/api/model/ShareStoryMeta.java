package com.ss.android.ugc.aweme.social.creation.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class ShareStoryMeta {

    @C09CT("biz")
    public BizInfo biz;

    @C09CT("et")
    public EtInfo et;

    public ShareStoryMeta() {
        this(new BizInfo(1, 1), new EtInfo(1, false, 0L, 0L, false, 0L, false, false));
    }

    public static final class BizInfo {

        @C09CT("interact_type")
        public int interactType;

        @C09CT("share_type")
        public int shareType;

        public BizInfo() {
            this(1, 1);
        }

        public BizInfo(int i, int i2) {
            this.shareType = i;
            this.interactType = i2;
        }
    }

    public ShareStoryMeta(BizInfo bizInfo, EtInfo etInfo) {
        this.biz = bizInfo;
        this.et = etInfo;
    }

    public static final class EtInfo {

        @C09CT("has_text")
        public boolean hasText;

        @C09CT("is_mention")
        public boolean isMention;

        @C09CT("is_own_video")
        public boolean isOwnVideo;

        @C09CT("is_template")
        public boolean isTemplate;

        @C09CT("media_type")
        public int mediaType;

        @C09CT("mentions")
        public long mentions;

        @C09CT("orig_author_id")
        public long origAuthorId;

        @C09CT("orig_aweme_id")
        public long origAwemeId;

        public EtInfo() {
            this(1, false, 0L, 0L, false, 0L, false, false);
        }

        public EtInfo(int i, boolean z, long j, long j2, boolean z2, long j3, boolean z3, boolean z4) {
            this.mediaType = i;
            this.isTemplate = z;
            this.origAuthorId = j;
            this.origAwemeId = j2;
            this.hasText = z2;
            this.mentions = j3;
            this.isOwnVideo = z3;
            this.isMention = z4;
        }
    }
}

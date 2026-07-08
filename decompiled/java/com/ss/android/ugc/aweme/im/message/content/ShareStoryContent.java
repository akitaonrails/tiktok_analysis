package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareStoryContent extends ShareAwemeContent {
    public static final Companion Companion = new Companion();

    @C09CT("expired_at")
    public Long expireAt = 0L;

    @C09CT("source_type")
    public Integer sourceType = 0;

    public static final boolean isStory(BaseContent baseContent) {
        return Companion.isStory(baseContent);
    }

    public static final boolean isStoryExpired(ShareStoryContent shareStoryContent) {
        return Companion.isStoryExpired(shareStoryContent);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent
    public boolean showQuoteHint() {
        return true;
    }

    public ShareStoryContent() {
        setStory(true);
    }

    public final Long getExpireAt() {
        return this.expireAt;
    }

    public final Integer getSourceType() {
        return this.sourceType;
    }

    public static final class Companion {
        public final int getAweType(Integer num) {
            if (num == null || num.intValue() != 1) {
                return 1;
            }
            return 0;
        }

        public final boolean isStory(BaseContent baseContent) {
            return baseContent instanceof ShareStoryContent;
        }

        public final boolean isStoryExpired(ShareStoryContent shareStoryContent) {
            Long expireAt = shareStoryContent.getExpireAt();
            if (expireAt != null && expireAt.longValue() < System.currentTimeMillis()) {
                return true;
            }
            return false;
        }
    }

    public final void setExpireAt(Long l) {
        this.expireAt = l;
    }

    public final void setSourceType(Integer num) {
        this.sourceType = num;
    }
}

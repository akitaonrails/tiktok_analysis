package com.ss.android.ugc.aweme.ogc.news.anchor;

import X.C09CT;
import X.C11WZ;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: loaded from: classes30.dex */
public interface INewsAnchorProducer {
    public static final C11WZ LIZ = C11WZ.LIZ;

    void LIZ(VideoPublishEditModel videoPublishEditModel);

    public static final class PublishAnchorConfig {

        @C09CT("anchor_info_content")
        public String content;

        public PublishAnchorConfig() {
            this(null);
        }

        public PublishAnchorConfig(String str) {
            this.content = str;
        }
    }
}

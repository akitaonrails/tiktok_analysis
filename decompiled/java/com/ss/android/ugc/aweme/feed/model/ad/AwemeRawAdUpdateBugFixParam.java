package com.ss.android.ugc.aweme.feed.model.ad;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeRawAdUpdateBugFixParam {
    public final boolean photoModeImageInfoUpdated;

    public static final class Builder {
        public boolean photoModeImageInfoUpdated;

        public final AwemeRawAdUpdateBugFixParam build() {
            return new AwemeRawAdUpdateBugFixParam(this.photoModeImageInfoUpdated);
        }

        public final Builder setPhotoModeImageInfoUpdated(boolean z) {
            this.photoModeImageInfoUpdated = z;
            return this;
        }
    }

    public final boolean getPhotoModeImageInfoUpdated() {
        return this.photoModeImageInfoUpdated;
    }

    public AwemeRawAdUpdateBugFixParam(boolean z) {
        this.photoModeImageInfoUpdated = z;
    }
}

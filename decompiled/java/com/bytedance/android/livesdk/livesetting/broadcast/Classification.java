package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class Classification {
    public static final TypeAdapter ADAPTER = new Classification_OptTypeAdapter(NormalGson.singleton());

    @C09CT("crowd")
    public long crowd;

    @C09CT("post")
    public Post post;

    @C09CT("pre")
    public Post pre;

    @C09CT("skip")
    public boolean skip;

    public Classification() {
        this(-1L, true, new Post(0, 0), new Post(0, 0));
    }

    public final long getCrowd() {
        return this.crowd;
    }

    public final Post getPost() {
        return this.post;
    }

    public final Post getPre() {
        return this.pre;
    }

    public final boolean getSkip() {
        return this.skip;
    }

    public final void setCrowd(long j) {
        this.crowd = j;
    }

    public final void setPost(Post post) {
        this.post = post;
    }

    public final void setPre(Post post) {
        this.pre = post;
    }

    public final void setSkip(boolean z) {
        this.skip = z;
    }

    public Classification(long j, boolean z, Post post, Post post2) {
        this.crowd = j;
        this.skip = z;
        this.pre = post;
        this.post = post2;
    }
}

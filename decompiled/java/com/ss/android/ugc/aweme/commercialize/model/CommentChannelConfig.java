package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CommentChannelConfig implements Serializable {

    @C09CT("comment_channel_name")
    public final String commentChannelName;

    public CommentChannelConfig() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommentChannelConfig) && Intrinsics.LJFF(this.commentChannelName, ((CommentChannelConfig) obj).commentChannelName);
    }

    public int hashCode() {
        String str = this.commentChannelName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentChannelConfig(commentChannelName=");
        sbLIZ.append(this.commentChannelName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommentChannelConfig(String str) {
        this.commentChannelName = str;
    }
}

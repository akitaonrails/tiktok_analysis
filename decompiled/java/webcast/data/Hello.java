package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Hello {

    @C09CT("content")
    public String content;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        sb.replace(0, 2, "Hello{");
        sb.append('}');
        return sb.toString();
    }
}

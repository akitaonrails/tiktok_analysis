package webcast.api.grouplive;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class MemberState {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("is_pk")
    public boolean isPk;

    @C09CT("is_staged")
    public boolean isStaged;

    @C09CT("uid")
    public String uid = "";

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("combo_count")
    public String comboCount = "";
}

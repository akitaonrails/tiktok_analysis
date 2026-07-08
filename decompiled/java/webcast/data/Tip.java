package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Tip {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("tip_card_type")
    public int tipCardType;

    @C09CT("tip_type")
    public int tipType;

    @C09CT("title")
    public String title = "";

    @C09CT("random_texts")
    public List<String> randomTexts = new ArrayList();
}

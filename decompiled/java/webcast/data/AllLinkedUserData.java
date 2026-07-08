package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AllLinkedUserData {

    @C09CT("card_type")
    public int cardType;

    @C09CT("describe_message")
    public CardTag describeMessage;

    @C09CT("relation_tag")
    public CardTag relationTag;

    @C09CT("linked_user_list")
    public List<User> linkedUserList = new ArrayList();

    @C09CT("friend_list")
    public List<Long> friendList = new ArrayList();
}

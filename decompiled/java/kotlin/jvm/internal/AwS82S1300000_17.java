package kotlin.jvm.internal;

import X.AbstractC1110800f0o;
import X.AbstractC1136060ffY;
import X.C09AY;
import X.C1113510f5B;
import X.C480460Ism;
import X.C786410Ut5;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class AwS82S1300000_17 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS82S1300000_17 awS82S1300000_17) {
        String strJ3;
        C480460Ism.LIZ().getClass();
        CommentApi commentApi = (CommentApi) C480460Ism.LIZLLL(CommentApi.class);
        long id = ((Room) awS82S1300000_17.l1).getId();
        long ownerUserId = ((Room) awS82S1300000_17.l1).getOwnerUserId();
        boolean zY1 = ((QuickCommentWidget) awS82S1300000_17.l2).y1();
        String str = awS82S1300000_17.s0;
        JSONObject jSONObject = (JSONObject) awS82S1300000_17.l3;
        if (jSONObject == null || (strJ3 = C786410Ut5.J3(jSONObject)) == null) {
            strJ3 = "";
        }
        return commentApi.queryQuickComments(id, ownerUserId, zY1, str, strJ3);
    }

    public static final Object invoke$1(AwS82S1300000_17 awS82S1300000_17) {
        int i;
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton;
        ((C1113510f5B) awS82S1300000_17.l1).LJIIJJI((AbstractC1110800f0o) awS82S1300000_17.l2, awS82S1300000_17.s0);
        C1113510f5B c1113510f5B = (C1113510f5B) awS82S1300000_17.l1;
        AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = (AbstractC1110800f0o) awS82S1300000_17.l2;
        String str = awS82S1300000_17.s0;
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic = (PublicAreaMessageCommon.CreatorSuccessInfo.Topic) awS82S1300000_17.l3;
        if (topic != null && (actionButton = topic.actionButton) != null) {
            i = actionButton.buttonType;
        } else {
            i = 0;
        }
        c1113510f5B.LJIIIZ(abstractC1110800f0o, 0, str, i);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS82S1300000_17(C1113510f5B c1113510f5B, C1113510f5B c1113510f5B2, AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, String str, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
        super(0);
        this.$t = topic;
        this.l1 = c1113510f5B;
        this.l2 = c1113510f5B2;
        this.s0 = abstractC1110800f0o;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S1300000_17(Room room, QuickCommentWidget quickCommentWidget, String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.l1 = room;
        this.l2 = quickCommentWidget;
        this.s0 = str;
        this.l3 = jSONObject;
    }
}

package kotlin.jvm.internal;

import X.C09AY;
import X.C18WR;
import X.C18WU;
import X.C19EG;
import X.C21290818Tq;
import android.content.Context;
import android.os.Parcelable;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.tools.chat.room.model.CreationChatRoomEnterParams;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS68S1300000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS68S1300000_32 awS68S1300000_32, Object obj) {
        ((C18WR) awS68S1300000_32.l1).W1(awS68S1300000_32.s0, (AIChatGenNode) awS68S1300000_32.l2, (C18WU) awS68S1300000_32.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS68S1300000_32 awS68S1300000_32, Object obj) {
        C21290818Tq.LIZ("AiChatRoomLauncher", "launchFromAnchorAlbum");
        AIChatGenModel aIChatGenModel = new AIChatGenModel(null, (AIChatGenConsumptionModel) awS68S1300000_32.l1, null, 5, null);
        AIChatGenConsumptionModel aIChatGenConsumptionModel = (AIChatGenConsumptionModel) awS68S1300000_32.l1;
        String str = aIChatGenConsumptionModel.enterFrom;
        String str2 = aIChatGenConsumptionModel.enterMethod;
        int i = aIChatGenConsumptionModel.originImageCount;
        String string = UUID.randomUUID().toString();
        String str3 = awS68S1300000_32.s0;
        CreationChatRoomEnterParams creationChatRoomEnterParams = new CreationChatRoomEnterParams((String) obj, str3, str3, string, "anchor", str, str2, "visual_poet_anchor", Integer.valueOf(i), "unknow", null, null, null, null);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS68S1300000_32.l2, "//creation/chat/host");
        smartRouteBuildRoute.withParam("enter_params", creationChatRoomEnterParams);
        smartRouteBuildRoute.withParam("key_ai_chat_gen_model", aIChatGenModel);
        smartRouteBuildRoute.withParam("key_ai_chat_gen_node", (Parcelable) awS68S1300000_32.l3);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S1300000_32(C18WR c18wr, String str, AIChatGenNode aIChatGenNode, C18WU c18wu, int i) {
        super(1);
        this.$t = i;
        this.l1 = c18wr;
        this.s0 = str;
        this.l2 = aIChatGenNode;
        this.l3 = c18wu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S1300000_32(C19EG c19eg, AIChatGenConsumptionModel aIChatGenConsumptionModel, AIChatGenNode aIChatGenNode, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aIChatGenConsumptionModel;
        this.s0 = str;
        this.l2 = c19eg;
        this.l3 = aIChatGenNode;
    }
}

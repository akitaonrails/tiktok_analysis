package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UpsellConsultationContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DMInfo {

    @C09CT("dm_send_type")
    public int dmSendType;

    @C09CT("service_info")
    public ServiceInfo serviceInfo;

    @C09CT("sku_id")
    public long skuId;

    @C09CT("schema")
    public String schema = "";

    @C09CT("suggested_question_list")
    public List<UpsellConsultationContent> suggestedQuestionList = new ArrayList();

    @C09CT("capsule_schema")
    public String capsuleSchema = "";
}

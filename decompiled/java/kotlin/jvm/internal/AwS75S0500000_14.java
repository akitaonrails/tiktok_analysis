package kotlin.jvm.internal;

import X.C09AY;
import X.C09K7;
import X.C0Y8T;
import X.C0YIN;
import X.C0YMW;
import X.C1322110kVd;
import X.C1443990ngD;
import X.C1455340nyW;
import X.C19EG;
import X.C868070Y3p;
import X.C869590Y9l;
import X.C897110ZHh;
import X.EnumC868530Y5j;
import X.InterfaceC856560Xiw;
import android.content.Context;
import com.bytedance.im.core.proto.BatchSetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.IndependentAppBubbleItem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS75S0500000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS75S0500000_14 awS75S0500000_14) {
        return ((C897110ZHh) awS75S0500000_14.l0).LIZJ((SessionInfo) awS75S0500000_14.l1, ((C869590Y9l) awS75S0500000_14.l2).getUuid(), (Context) awS75S0500000_14.l3, (IndependentAppBubbleItem) awS75S0500000_14.l4);
    }

    public static final Object invoke$1(AwS75S0500000_14 awS75S0500000_14) {
        C1443990ngD c1443990ngD = C1443990ngD.LIZ;
        C1455340nyW c1455340nyWLIZJ = ((InterfaceC856560Xiw) awS75S0500000_14.l0).LIZJ();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS75S0500000_14.l1;
        AwS106S0400000_8 awS106S0400000_8 = new AwS106S0400000_8((C19EG) awS75S0500000_14.l2, (C1322110kVd) awS75S0500000_14.l3, videoPublishEditModel, (C09K7) awS75S0500000_14.l4, 9);
        c1443990ngD.getClass();
        C1443990ngD.LIZ(c1455340nyWLIZJ, videoPublishEditModel, awS106S0400000_8);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS75S0500000_14 awS75S0500000_14) {
        int size;
        EnumC868530Y5j enumC868530Y5j;
        Boolean bool;
        Boolean bool2;
        List<String> list;
        List<String> list2;
        RequestBody requestBody;
        BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody;
        List<SetConversationSettingInfoRequestBody> list3;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody;
        RequestBody requestBody2;
        BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody2;
        List<SetConversationSettingInfoRequestBody> list4;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody2;
        RequestBody requestBody3;
        BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody3;
        List<SetConversationSettingInfoRequestBody> list5;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody3;
        RequestBody requestBody4;
        BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody4;
        List<SetConversationSettingInfoRequestBody> list6;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody4;
        RequestBody requestBody5;
        BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody5;
        List<SetConversationSettingInfoRequestBody> list7;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody5;
        RequestBody requestBody6;
        BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody6;
        List<SetConversationSettingInfoRequestBody> list8;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody6;
        int iAddAndGet = ((AtomicInteger) awS75S0500000_14.l0).addAndGet(1);
        List list9 = (List) awS75S0500000_14.l1;
        if (list9 != null) {
            size = list9.size();
        } else {
            size = 0;
        }
        if (iAddAndGet >= size) {
            if (!((List) awS75S0500000_14.l2).isEmpty()) {
                C868070Y3p c868070Y3p = (C868070Y3p) awS75S0500000_14.l3;
                C0YIN c0yin = (C0YIN) awS75S0500000_14.l4;
                List<C0Y8T> list10 = (List) awS75S0500000_14.l2;
                c868070Y3p.LJ = true;
                Request request = c0yin.LLILZLL;
                Integer num = null;
                if (request != null && (requestBody6 = request.body) != null && (batchSetConversationSettingInfoRequestBody6 = requestBody6.batch_set_conversation_setting_info_body) != null && (list8 = batchSetConversationSettingInfoRequestBody6.set_requests) != null && (setConversationSettingInfoRequestBody6 = (SetConversationSettingInfoRequestBody) ListProtector.get(list8, 0)) != null) {
                    enumC868530Y5j = setConversationSettingInfoRequestBody6.set_category;
                } else {
                    enumC868530Y5j = null;
                }
                Request request2 = c0yin.LLILZLL;
                if (request2 != null && (requestBody5 = request2.body) != null && (batchSetConversationSettingInfoRequestBody5 = requestBody5.batch_set_conversation_setting_info_body) != null && (list7 = batchSetConversationSettingInfoRequestBody5.set_requests) != null && (setConversationSettingInfoRequestBody5 = (SetConversationSettingInfoRequestBody) ListProtector.get(list7, 0)) != null) {
                    bool = setConversationSettingInfoRequestBody5.set_mute;
                } else {
                    bool = null;
                }
                Request request3 = c0yin.LLILZLL;
                if (request3 != null && (requestBody4 = request3.body) != null && (batchSetConversationSettingInfoRequestBody4 = requestBody4.batch_set_conversation_setting_info_body) != null && (list6 = batchSetConversationSettingInfoRequestBody4.set_requests) != null && (setConversationSettingInfoRequestBody4 = (SetConversationSettingInfoRequestBody) ListProtector.get(list6, 0)) != null) {
                    bool2 = setConversationSettingInfoRequestBody4.set_stick_on_top;
                } else {
                    bool2 = null;
                }
                Request request4 = c0yin.LLILZLL;
                if (request4 == null || (requestBody3 = request4.body) == null || (batchSetConversationSettingInfoRequestBody3 = requestBody3.batch_set_conversation_setting_info_body) == null || (list5 = batchSetConversationSettingInfoRequestBody3.set_requests) == null || (setConversationSettingInfoRequestBody3 = (SetConversationSettingInfoRequestBody) ListProtector.get(list5, 0)) == null || (list = setConversationSettingInfoRequestBody3.add_conversation_tags) == null || !(!list.isEmpty())) {
                    list = null;
                }
                Request request5 = c0yin.LLILZLL;
                if (request5 == null || (requestBody2 = request5.body) == null || (batchSetConversationSettingInfoRequestBody2 = requestBody2.batch_set_conversation_setting_info_body) == null || (list4 = batchSetConversationSettingInfoRequestBody2.set_requests) == null || (setConversationSettingInfoRequestBody2 = (SetConversationSettingInfoRequestBody) ListProtector.get(list4, 0)) == null || (list2 = setConversationSettingInfoRequestBody2.del_conversation_tags) == null || !(!list2.isEmpty())) {
                    list2 = null;
                }
                Request request6 = c0yin.LLILZLL;
                if (request6 != null && (requestBody = request6.body) != null && (batchSetConversationSettingInfoRequestBody = requestBody.batch_set_conversation_setting_info_body) != null && (list3 = batchSetConversationSettingInfoRequestBody.set_requests) != null && (setConversationSettingInfoRequestBody = (SetConversationSettingInfoRequestBody) ListProtector.get(list3, 0)) != null) {
                    num = setConversationSettingInfoRequestBody.set_fake_unread_count;
                }
                if (enumC868530Y5j == null && bool == null && bool2 == null && ((list == null || list.isEmpty()) && ((list2 == null || list2.isEmpty()) && num == null))) {
                    C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                    c0ymw.statusMsg = "nothing to change";
                    c868070Y3p.LIZIZ(c0ymw);
                } else {
                    c868070Y3p.LJIIL(list10, new AwS32S0600000_14(enumC868530Y5j, (EnumC868530Y5j) bool, bool2, (Boolean) list, list2, (List<String>) num, (Integer) 2));
                }
            } else {
                ((C868070Y3p) awS75S0500000_14.l3).LIZ((C0YIN) awS75S0500000_14.l4);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0500000_14(InterfaceC856560Xiw interfaceC856560Xiw, VideoPublishEditModel videoPublishEditModel, C19EG c19eg, C1322110kVd c1322110kVd, C09K7 c09k7, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC856560Xiw;
        this.l1 = videoPublishEditModel;
        this.l2 = c19eg;
        this.l3 = c1322110kVd;
        this.l4 = c09k7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS75S0500000_14(C897110ZHh c897110ZHh, SessionInfo sessionInfo, C869590Y9l c869590Y9l, Context context, IndependentAppBubbleItem independentAppBubbleItem, int i) {
        super(0);
        this.$t = i;
        this.l0 = c897110ZHh;
        this.l1 = sessionInfo;
        this.l2 = c869590Y9l;
        this.l3 = context;
        this.l4 = independentAppBubbleItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS75S0500000_14(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, List<SetConversationSettingInfoRequestBody> list, List<C0Y8T> list2, C868070Y3p c868070Y3p, C0YIN c0yin) {
        super(0);
        this.$t = c0yin;
        this.l0 = atomicInteger;
        this.l1 = atomicInteger2;
        this.l2 = list;
        this.l3 = list2;
        this.l4 = c868070Y3p;
    }
}

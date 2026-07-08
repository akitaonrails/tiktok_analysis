package kotlin.jvm.internal;

import X.C08CX;
import X.C09AY;
import X.C0Y8T;
import X.C0YMW;
import X.C0ZEM;
import X.C0ZEP;
import X.C0ZES;
import X.C291001Au;
import X.C866340Xyi;
import X.C869590Y9l;
import X.C875480YWc;
import X.C889840YvW;
import X.C889910Yvd;
import X.EnumC880480YgQ;
import X.InterfaceC863600XuI;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS66S0210000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS66S0210000_14 awS66S0210000_14, Object obj) {
        ((C866340Xyi) awS66S0210000_14.l0).LIZ.LJJIJIL((List) awS66S0210000_14.l1, Boolean.valueOf(awS66S0210000_14.z2), (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS66S0210000_14 awS66S0210000_14, Object obj) {
        C08CX c08cx = C08CX.INSTANCE;
        BotSharePostPickerViewModel botSharePostPickerViewModel = (BotSharePostPickerViewModel) awS66S0210000_14.l0;
        return C0ZES.LIZ((C0ZES) obj, (C0ZEM) awS66S0210000_14.l1, botSharePostPickerViewModel.yQ2(botSharePostPickerViewModel.LLILZ), c08cx, new C0ZEP(false, awS66S0210000_14.z2), null, null, null, null, null, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static final Object invoke$2(AwS66S0210000_14 awS66S0210000_14, Object obj) {
        return C889840YvW.LIZ((C889840YvW) obj, null, null, new Pair(((C889910Yvd) awS66S0210000_14.l0).LIZ, Boolean.valueOf(awS66S0210000_14.z2)), (Set) awS66S0210000_14.l1, new C291001Au(Unit.LIZ), 3);
    }

    public static final Object invoke$3(AwS66S0210000_14 awS66S0210000_14, Object obj) {
        String str;
        String logId;
        Long lValueOf;
        String checkMsg;
        Integer numValueOf;
        String statusMsg;
        long createdAt;
        String str2;
        Map<String, String> ext;
        Map<String, String> ext2;
        Map<String, String> localExt;
        Map map = (Map) obj;
        C869590Y9l c869590Y9l = (C869590Y9l) awS66S0210000_14.l0;
        if (c869590Y9l == null || (localExt = c869590Y9l.getLocalExt()) == null || (str = localExt.get("t:is_resend")) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("success_status", Integer.valueOf(awS66S0210000_14.z2 ? 1 : 0));
        C0YMW c0ymw = (C0YMW) awS66S0210000_14.l1;
        String str3 = null;
        if (c0ymw != null) {
            logId = c0ymw.getLogId();
        } else {
            logId = null;
        }
        map.put("log_id", logId);
        C0YMW c0ymw2 = (C0YMW) awS66S0210000_14.l1;
        if (c0ymw2 != null) {
            lValueOf = Long.valueOf(c0ymw2.getCheck());
        } else {
            lValueOf = null;
        }
        map.put("check_code", lValueOf);
        C0YMW c0ymw3 = (C0YMW) awS66S0210000_14.l1;
        if (c0ymw3 != null) {
            checkMsg = c0ymw3.getCheckMsg();
        } else {
            checkMsg = null;
        }
        map.put("check_message", checkMsg);
        C0YMW c0ymw4 = (C0YMW) awS66S0210000_14.l1;
        if (c0ymw4 != null) {
            numValueOf = Integer.valueOf(c0ymw4.getCode());
        } else {
            numValueOf = null;
        }
        map.put("error_code", numValueOf);
        C0YMW c0ymw5 = (C0YMW) awS66S0210000_14.l1;
        if (c0ymw5 != null) {
            statusMsg = c0ymw5.getStatusMsg();
        } else {
            statusMsg = null;
        }
        map.put("error_messsage", statusMsg);
        map.put("is_resend", str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C869590Y9l c869590Y9l2 = (C869590Y9l) awS66S0210000_14.l0;
        if (c869590Y9l2 != null) {
            createdAt = c869590Y9l2.getCreatedAt();
        } else {
            createdAt = 0;
        }
        map.put("span", Long.valueOf(jCurrentTimeMillis - createdAt));
        C869590Y9l c869590Y9l3 = (C869590Y9l) awS66S0210000_14.l0;
        if (c869590Y9l3 == null || (ext2 = c869590Y9l3.getExt()) == null || (str2 = ext2.get("type")) == null) {
            str2 = "unknow";
        }
        map.put("msg_ext_type", str2);
        C869590Y9l c869590Y9l4 = (C869590Y9l) awS66S0210000_14.l0;
        if (c869590Y9l4 != null && (ext = c869590Y9l4.getExt()) != null) {
            str3 = ext.get("a:translate_status");
        }
        map.put("translate_status", str3);
        C875480YWc.LIZ((C869590Y9l) awS66S0210000_14.l0, map);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS66S0210000_14(C866340Xyi c866340Xyi, C866340Xyi c866340Xyi2, List<C0Y8T> list, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c866340Xyi;
        this.l1 = c866340Xyi2;
        this.z2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0210000_14(C0YMW c0ymw, C869590Y9l c869590Y9l, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c869590Y9l;
        this.z2 = z;
        this.l1 = c0ymw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS66S0210000_14(C889910Yvd c889910Yvd, C889910Yvd c889910Yvd2, boolean z, Set<? extends EnumC880480YgQ> set) {
        super(1);
        this.$t = set;
        this.l0 = c889910Yvd;
        this.z2 = c889910Yvd2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0210000_14(BotSharePostPickerViewModel botSharePostPickerViewModel, boolean z, C0ZEM c0zem, int i) {
        super(1);
        this.$t = i;
        this.l0 = botSharePostPickerViewModel;
        this.z2 = z;
        this.l1 = c0zem;
    }
}

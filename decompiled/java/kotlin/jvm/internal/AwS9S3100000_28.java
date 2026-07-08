package kotlin.jvm.internal;

import X.C09AY;
import X.C1870150ylZ;
import X.C1912680zsA;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* JADX INFO: loaded from: classes29.dex */
public class AwS9S3100000_28 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS9S3100000_28 awS9S3100000_28, Object obj) {
        Long lValueOf;
        BriefGameTask next;
        String str;
        PartnershipTask partnershipTask;
        AnchorRoomInfoResponse.ResponseData responseData = (AnchorRoomInfoResponse.ResponseData) obj;
        GamePartnershipGamePinCardWidget gamePartnershipGamePinCardWidget = (GamePartnershipGamePinCardWidget) awS9S3100000_28.l3;
        AnchorRoomInfoResponse.PartnershipInfo partnershipInfo = responseData.partnershipInfo;
        if (partnershipInfo != null) {
            lValueOf = Long.valueOf(partnershipInfo.cpsClickId);
        } else {
            lValueOf = null;
        }
        gamePartnershipGamePinCardWidget.LLJJIII = String.valueOf(lValueOf);
        List<BriefGameTask> list = responseData.gameTasks;
        String str2 = awS9S3100000_28.s0;
        Iterator<BriefGameTask> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                BriefGameTask briefGameTask = next;
                PartnershipTask partnershipTask2 = briefGameTask.task;
                if (partnershipTask2 != null) {
                    str = partnershipTask2.idStr;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, str2) && (partnershipTask = briefGameTask.task) != null && partnershipTask.taskMode == 40) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BriefGameTask briefGameTask2 = next;
        if (briefGameTask2 == null) {
            return null;
        }
        ((GamePartnershipGamePinCardWidget) awS9S3100000_28.l3).L1(new C1870150ylZ(0, awS9S3100000_28.s0, awS9S3100000_28.s1, briefGameTask2.pinDuration * ((long) LSPassThroughRecordSizeConfig.DEFAULT), briefGameTask2, responseData.gameCtaMap.get(briefGameTask2.briefGame.idStr), 32), awS9S3100000_28.s2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S3100000_28 awS9S3100000_28, Object obj) {
        Function0 function0 = (Function0) awS9S3100000_28.l3;
        if (function0 != null) {
            function0.invoke();
        }
        C1912680zsA c1912680zsA = C1912680zsA.LIZ;
        String str = awS9S3100000_28.s0;
        String str2 = awS9S3100000_28.s1;
        String str3 = awS9S3100000_28.s2;
        c1912680zsA.getClass();
        C1912680zsA.LIZIZ(str, str2, str3, "proceed");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS9S3100000_28 awS9S3100000_28, Object obj) {
        Function0 function0 = (Function0) awS9S3100000_28.l3;
        if (function0 != null) {
            function0.invoke();
        }
        C1912680zsA c1912680zsA = C1912680zsA.LIZ;
        String str = awS9S3100000_28.s0;
        String str2 = awS9S3100000_28.s1;
        String str3 = awS9S3100000_28.s2;
        c1912680zsA.getClass();
        C1912680zsA.LIZIZ(str, str2, str3, "proceed");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S3100000_28(GamePartnershipGamePinCardWidget gamePartnershipGamePinCardWidget, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = gamePartnershipGamePinCardWidget;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S3100000_28(String str, Function0 function0, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = function0;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}

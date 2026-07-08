package kotlin.jvm.internal;

import X.C09AY;
import X.C0CHQ;
import X.C11S5;
import X.C1403010mc7;
import X.C1411660mq4;
import X.C1411690mq7;
import X.C1411720mqA;
import X.C1437510nVl;
import X.C1458410o3T;
import X.C1701940uOG;
import X.C2188811AlT;
import X.EnumC1287340jbY;
import X.EnumC1411090mp9;
import X.EnumC1411640mq2;
import X.InterfaceC1411770mqF;
import Y.AfS157S0200000_22;
import Y.AfS191S0100000_22;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescRequestBody;
import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelRequestBody;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS13S0300100_22 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS13S0300100_22 awS13S0300100_22, Object obj) {
        boolean z;
        String str = (String) obj;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip label", "ai_tip upload_task error uri is empty");
            C1403010mc7.LIZ.getMusicService().dl();
            C1458410o3T.LJIIJJI(true);
            ((Function1) awS13S0300100_22.l0).invoke(EnumC1411090mp9.NO_RESULT_RETURN);
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis() - awS13S0300100_22.j3;
            RequestLabelRequestBody requestLabelRequestBody = new RequestLabelRequestBody(str);
            C1411720mqA c1411720mqA = new C1411720mqA();
            long j = 30000 - jCurrentTimeMillis;
            Function1 function1 = (Function1) awS13S0300100_22.l1;
            Function1 function12 = (Function1) awS13S0300100_22.l0;
            System.currentTimeMillis();
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip label", "ai_tip photo_text_description/label start");
            ((C1411690mq7) awS13S0300100_22.l2).LIZLLL.LIZ(((InterfaceC1411770mqF) c1411720mqA.LIZ.getValue()).LIZ(requestLabelRequestBody).LJLJI(j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS157S0200000_22(function12, function1, 0), new AfS191S0100000_22(function12, 2)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS13S0300100_22 awS13S0300100_22, Object obj) {
        int length;
        Throwable th = (Throwable) obj;
        if (th instanceof TimeoutException) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("ai_tip", "ai_tip upload_task error timeout");
            ((Function1) awS13S0300100_22.l0).invoke(EnumC1411090mp9.TIMEOUT);
        } else {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ai_tip upload_task error ");
            sbLIZ.append(th.getMessage());
            c1437510nVlLJJLIIIJ.LIZ("ai_tip", C2188811AlT.LIZIZ(sbLIZ));
            ((Function1) awS13S0300100_22.l0).invoke(EnumC1411090mp9.NO_RESULT_RETURN);
        }
        RecommendDescRequestBody recommendDescRequestBody = ((C1411690mq7) awS13S0300100_22.l1).LIZ;
        if (recommendDescRequestBody != null) {
            length = recommendDescRequestBody.texts.length() + recommendDescRequestBody.description.length();
        } else {
            length = 0;
        }
        C1411660mq4 c1411660mq4 = C1411660mq4.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS13S0300100_22.l2;
        EnumC1287340jbY enumC1287340jbY = EnumC1287340jbY.FAILURE;
        EnumC1411640mq2 enumC1411640mq2 = EnumC1411640mq2.UPLOAD_TOS_FAIL;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - awS13S0300100_22.j3;
        c1411660mq4.getClass();
        C1411660mq4.LIZ(videoPublishEditModel, enumC1287340jbY, enumC1411640mq2, message, jCurrentTimeMillis, 0L, length);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0300100_22(AwS231S0300000_22 awS231S0300000_22, C1411690mq7 c1411690mq7, VideoPublishEditModel videoPublishEditModel, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS231S0300000_22;
        this.l1 = c1411690mq7;
        this.l2 = videoPublishEditModel;
        this.j3 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0300100_22(AwS231S0300000_22 awS231S0300000_22, long j, VideoPublishEditModel videoPublishEditModel, Function1 function1, C1411690mq7 c1411690mq7, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS231S0300000_22;
        this.j3 = j;
        this.l1 = function1;
        this.l2 = c1411690mq7;
    }
}

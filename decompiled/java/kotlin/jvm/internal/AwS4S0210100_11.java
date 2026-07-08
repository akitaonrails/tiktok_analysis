package kotlin.jvm.internal;

import X.C09AY;
import X.C0SRH;
import X.C0SYI;
import X.C1440005kM;
import X.C259800zU;
import X.C723240SYo;
import X.C730490Sl5;
import X.C731910SnN;
import X.C732160Snm;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.detail.videorepost.VideoRepostVM;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS4S0210100_11 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
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

    public static final Object invoke$0(AwS4S0210100_11 awS4S0210100_11, Object obj) {
        C0SYI c0syiVQ2 = ((PostDiggViewModel) awS4S0210100_11.l0).vQ2(awS4S0210100_11.j3, (Aweme) awS4S0210100_11.l1, awS4S0210100_11.z2);
        obj.getClass();
        return new C0SRH(c0syiVQ2);
    }

    public static final Object invoke$1(AwS4S0210100_11 awS4S0210100_11, Object obj) {
        C731910SnN c731910SnNVQ2 = ((VideoRepostVM) awS4S0210100_11.l0).vQ2(awS4S0210100_11.j3, (Aweme) awS4S0210100_11.l1, awS4S0210100_11.z2);
        obj.getClass();
        return new C732160Snm(c731910SnNVQ2);
    }

    public static final Object invoke$2(AwS4S0210100_11 awS4S0210100_11, Object obj) {
        return C730490Sl5.LIZ((C730490Sl5) obj, ((VideoDiggVM) awS4S0210100_11.l0).AQ2(awS4S0210100_11.j3, (Aweme) awS4S0210100_11.l1, awS4S0210100_11.z2), null, null, null, null, 61);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS4S0210100_11 awS4S0210100_11, Object obj) {
        String str = (String) obj;
        if (str != null) {
            Aweme aweme = (Aweme) awS4S0210100_11.l0;
            long j = awS4S0210100_11.j3;
            boolean z = awS4S0210100_11.z2;
            C259800zU c259800zU = (C259800zU) awS4S0210100_11.l1;
            aweme.getAuthor().roomId = j;
            if (z && c259800zU.element != 0 && aweme.getAuthor() != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("ec_live_head_params") || jSONObject.isNull("ec_live_head_params")) {
                        jSONObject.put("ec_live_head_params", c259800zU.element);
                    }
                    aweme.getAuthor().roomData = C786410Ut5.J3(jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    aweme.getAuthor().roomData = str;
                }
            } else {
                aweme.getAuthor().roomData = str;
            }
            C723240SYo c723240SYo = new C723240SYo();
            c723240SYo.LIZJ = aweme.getAid();
            c723240SYo.LIZ = aweme.getAuthor().getUid();
            c723240SYo.LIZIZ = false;
            C1440005kM.LIZ(c723240SYo);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0210100_11(VideoDiggVM videoDiggVM, long j, Aweme aweme, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoDiggVM;
        this.j3 = j;
        this.l1 = aweme;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:boolean), (r1 I:kotlin.jvm.internal.AwS4S0210100_11) (LINE:83951623) kotlin.jvm.internal.AwS4S0210100_11.z2 boolean, block:B:2:0x0000 */
    public AwS4S0210100_11(Aweme aweme, Aweme aweme2, long j, boolean z, C259800zU<Object> c259800zU) {
        boolean z2;
        super(1);
        this.$t = c259800zU;
        this.l0 = aweme;
        this.j3 = aweme2;
        this.z2 = z2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0210100_11(VideoRepostVM videoRepostVM, long j, Aweme aweme, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoRepostVM;
        this.j3 = j;
        this.l1 = aweme;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0210100_11(PostDiggViewModel postDiggViewModel, long j, Aweme aweme, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = postDiggViewModel;
        this.j3 = j;
        this.l1 = aweme;
        this.z2 = z;
    }
}

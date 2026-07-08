package kotlin.jvm.internal;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C09AY;
import X.C11NZ;
import X.C11S5;
import X.C1239330iM7;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C262150APd;
import X.C786410Ut5;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS101S1000000_16 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
        }
        return this.s0;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS101S1000000_16 awS101S1000000_16) {
        C11NZ<BaseResponse> c11nzLIZJ;
        Keva repo = Keva.getRepo(C786410Ut5.j4("repo_maf_follow_back_notice_%s", Arrays.copyOf(new Object[]{awS101S1000000_16.s0}, 1)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = repo.getLong("key_maf_follow_back_notice", 0L);
        long j2 = jCurrentTimeMillis - j;
        C01GW c01gw = C262150APd.LIZ;
        if (j2 < ((long) ((Number) c01gw.getValue()).intValue()) * 86400000) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("filter by frequency name = key_maf_follow_back_notice, interval = ");
            sbLIZ.append(((Number) c01gw.getValue()).intValue());
            sbLIZ.append(", currentTime = ");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(", lastTime = ");
            sbLIZ.append(j);
            C1720106oR.LJI("MafFollowBackBootRequest", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            repo.storeLong("key_maf_follow_back_notice", jCurrentTimeMillis);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("MafFollowBackBootRequest", "report to server");
            FriendApi.LIZ.getClass();
            FriendApi friendApiLIZ = C1239330iM7.LIZ();
            if (friendApiLIZ != null) {
                c11nzLIZJ = friendApiLIZ.LIZJ(1);
            } else {
                c11nzLIZJ = null;
            }
            AbstractC19484711Kz.LJIJJ(c11nzLIZJ).LJJIJIIJI(C11S5.LIZ()).LJJIIJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS101S1000000_16(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}

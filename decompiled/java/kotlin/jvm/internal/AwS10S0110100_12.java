package kotlin.jvm.internal;

import X.C09AY;
import X.C0IJT;
import X.C474500IjA;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS10S0110100_12 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S0110100_12 awS10S0110100_12) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_filter_resource_download");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - awS10S0110100_12.j2), "duration");
        c474500IjALIZ.LJJII(((LiveEffect) awS10S0110100_12.l0).LLJLL(), "filter_id");
        c474500IjALIZ.LJJII(((LiveEffect) awS10S0110100_12.l0).getResourceId(), "resource_id");
        String strLJJIJLIJ = ((LiveEffect) awS10S0110100_12.l0).LJJIJLIJ();
        if (strLJJIJLIJ == null) {
            strLJJIJLIJ = ((LiveEffect) awS10S0110100_12.l0).getName();
        }
        c474500IjALIZ.LJJII(strLJJIJLIJ, "beauty_type_name");
        if (awS10S0110100_12.z1) {
            str = "done";
        } else {
            str = "failed";
        }
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S0110100_12 awS10S0110100_12) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_filter_resource_download");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - awS10S0110100_12.j2), "duration");
        c474500IjALIZ.LJJII(((LiveEffect) awS10S0110100_12.l0).LLJLL(), "filter_id");
        c474500IjALIZ.LJJII(((LiveEffect) awS10S0110100_12.l0).getResourceId(), "resource_id");
        String strLJJIJLIJ = ((LiveEffect) awS10S0110100_12.l0).LJJIJLIJ();
        if (strLJJIJLIJ == null) {
            strLJJIJLIJ = ((LiveEffect) awS10S0110100_12.l0).getName();
        }
        c474500IjALIZ.LJJII(strLJJIJLIJ, "beauty_type_name");
        if (awS10S0110100_12.z1) {
            str = "done";
        } else {
            str = "failed";
        }
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0110100_12(long j, LiveEffect liveEffect, boolean z, int i) {
        super(0);
        this.$t = i;
        this.j2 = j;
        this.l0 = liveEffect;
        this.z1 = z;
    }
}

package defpackage;

import X.C09AY;
import X.C0NDE;
import X.C0NDV;
import X.C118300cf;
import X.C2268981DrU;
import X.C2344009Gk;
import X.C590280NDe;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(int i, long j, Aweme aweme) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iOptInt;
        int i;
        int i2;
        C590280NDe c590280NDeLJI;
        String str;
        C590280NDe c590280NDeLJI2;
        String str2;
        C0NDE c0nde = C0NDE.LIZ;
        String aid = this.LL.getAid();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0NDV c0ndv = C0NDV.LIZ;
        String aid2 = this.LL.getAid();
        c0ndv.getClass();
        C590280NDe c590280NDeLJI3 = C0NDV.LJI(aid2);
        long j = c590280NDeLJI3 != null ? c590280NDeLJI3.LJIIIZ : 0L;
        String aid3 = this.LL.getAid();
        if ((aid3 == null || aid3.length() == 0) || (c590280NDeLJI2 = C0NDV.LJI(aid3)) == null || (str2 = c590280NDeLJI2.LJIIZILJ) == null || str2.length() == 0) {
            iOptInt = -1;
        } else {
            try {
                iOptInt = new JSONObject(str2).optInt("feed_index", -1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iOptInt = -1;
            }
        }
        C0NDV c0ndv2 = C0NDV.LIZ;
        String aid4 = this.LL.getAid();
        int i3 = this.LLILLJJLI;
        c0ndv2.getClass();
        String strJ3 = "";
        if (!(aid4 == null || aid4.length() == 0) && (c590280NDeLJI = C0NDV.LJI(aid4)) != null && (str = c590280NDeLJI.LJIIZILJ) != null && str.length() != 0) {
            try {
                String strOptString = new JSONObject(str).optString("snapshots", "");
                JSONObject jSONObject = strOptString.length() > 0 ? new JSONObject(strOptString) : new JSONObject();
                jSONObject.put("behaviors", i3);
                strJ3 = C786410Ut5.J3(jSONObject);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C0NDV c0ndv3 = C0NDV.LIZ;
        String aid5 = this.LL.getAid();
        c0ndv3.getClass();
        C590280NDe c590280NDeLJI4 = C0NDV.LJI(aid5);
        float f = c590280NDeLJI4 != null ? c590280NDeLJI4.LJIILLIIL : 0.0f;
        int cacheSourceType = AwemeBizExtKt.getCacheSourceType(this.LL);
        long j2 = this.LLILLL;
        String aid6 = this.LL.getAid();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        if (!C0NDV.LJIIJ() || aid6 == null || a0.LJJJIL(aid6)) {
            i = c118300cf.element;
        } else {
            C0NDV.LJIILIIL(new AwS158S1100000_9(aid6, c118300cf, 36));
            i = c118300cf.element;
        }
        String aid7 = this.LL.getAid();
        C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = -1;
        if (!a0.LJJJIL(aid7) && C0NDV.LJIIJ() && C2268981DrU.LIZ() > 0) {
            C0NDV.LJIILIIL(new AwS158S1100000_9(aid7, c118300cf2, 37));
            i2 = c118300cf2.element;
        } else {
            i2 = c118300cf2.element;
        }
        c0nde.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "cache_type");
        c2344009Gk.LJIIIIZZ("aweme_id", aid);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "consume_timestamp");
        c2344009Gk.LIZLLL(j, "cache_timestamp");
        c2344009Gk.LIZJ(iOptInt, "feed_index");
        c2344009Gk.LJIIIIZZ("ordering_snapshot", strJ3);
        c2344009Gk.LIZIZ(f, "score");
        c2344009Gk.LIZJ(cacheSourceType, "cache_source");
        c2344009Gk.LIZLLL(j2, "play_time");
        c2344009Gk.LIZJ(i, "is_complete");
        c2344009Gk.LIZJ(i2, "marked_eliminate_count");
        C0NDE.LJ("cache_video_used_status", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}

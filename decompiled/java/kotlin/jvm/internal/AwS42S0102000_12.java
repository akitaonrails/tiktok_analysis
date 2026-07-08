package kotlin.jvm.internal;

import X.1JLP;
import X.1JLc;
import X.C09AY;
import X.C0THL;
import X.C11LS;
import X.C1CC2;
import X.C743540TEq;
import X.C744020TGm;
import X.C744110TGv;
import X.InterfaceC500940Jki;
import android.content.Intent;
import android.media.projection.MediaProjection;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AwS42S0102000_12 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AwS42S0102000_12 awS42S0102000_12) throws JSONException {
        MediaProjection mediaProjection;
        try {
            C0THL c0thl = GameCast.LIZJ;
            if (c0thl != null) {
                c0thl.LJFF(awS42S0102000_12.i1, (Intent) awS42S0102000_12.l0);
            }
            C0THL c0thl2 = GameCast.LIZJ;
            if (c0thl2 != null) {
                c0thl2.LIZ();
            }
            C0THL c0thl3 = GameCast.LIZJ;
            if (c0thl3 != null && (mediaProjection = c0thl3.LIZLLL) != null) {
                GameCast gameCast = GameCast.LIZ;
                GameCast.LIZIZ("setOption with MediaProjection");
                1JLc r2 = GameCast.LIZIZ;
                if (r2 != null) {
                    r2.LJIIIZ(10015, new Object[]{mediaProjection});
                }
            }
            C0THL c0thl4 = GameCast.LIZJ;
            if (c0thl4 == null || c0thl4.LIZLLL == null) {
                C743540TEq.LJJIIJ(true, 10092, 0, "media projection is null");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C743540TEq.LJJIIJ(true, 10092, 0, e.toString());
        }
        C743540TEq.LJJIFFI(true);
        C743540TEq.LJJIIZI(awS42S0102000_12.i1, 1, awS42S0102000_12.i2, ((Intent) awS42S0102000_12.l0).toString(), true);
        JSONObject jSONObject = new JSONObject();
        int i = awS42S0102000_12.i2;
        int i2 = awS42S0102000_12.i1;
        Intent intent = (Intent) awS42S0102000_12.l0;
        jSONObject.put("isWireless", true);
        jSONObject.put("requestCode", i);
        jSONObject.put("resultCode", i2);
        jSONObject.put("data", intent.toString());
        C1CC2.LJIIIIZZ("ttlive_game_cast_result", 1, jSONObject);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AwS42S0102000_12 awS42S0102000_12) throws JSONException {
        long currentUserId;
        MediaProjection mediaProjection;
        1JLc r0;
        1JLP r02;
        try {
            C0THL c0thl = C744020TGm.LIZJ;
            if (c0thl != null) {
                c0thl.LJFF(awS42S0102000_12.i1, (Intent) awS42S0102000_12.l0);
            }
            C0THL c0thl2 = C744020TGm.LIZJ;
            if (c0thl2 != null) {
                c0thl2.LIZ();
            }
            C0THL c0thl3 = C744020TGm.LIZJ;
            if (c0thl3 != null && (mediaProjection = c0thl3.LIZLLL) != null && (r0 = C744020TGm.LIZ) != null && (r02 = r0.LIZLLL()) != null) {
                r02.LJFF(mediaProjection);
            }
            C0THL c0thl4 = C744020TGm.LIZJ;
            if (c0thl4 == null || c0thl4.LIZLLL == null) {
                C743540TEq.LJJIIJ(true, 10092, 0, "media projection is null");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C743540TEq.LJJIIJ(false, 10092, 0, e.toString());
        }
        1JLc r03 = C744020TGm.LIZ;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = 0;
        }
        C744020TGm.LJIIIIZZ = currentUserId;
        C744020TGm.LJII = (C11LS) UserService.getInstance().user().LJII().LJIIL(C744110TGv.LL);
        C743540TEq.LJJIIZI(awS42S0102000_12.i1, 1, awS42S0102000_12.i2, ((Intent) awS42S0102000_12.l0).toString(), false);
        JSONObject jSONObject = new JSONObject();
        int i = awS42S0102000_12.i2;
        int i2 = awS42S0102000_12.i1;
        Intent intent = (Intent) awS42S0102000_12.l0;
        jSONObject.put("isWireless", false);
        jSONObject.put("requestCode", i);
        jSONObject.put("resultCode", i2);
        jSONObject.put("data", intent.toString());
        C1CC2.LJIIIIZZ("ttlive_game_cast_result", 1, jSONObject);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS42S0102000_12(int i, int i2, Intent intent, int i3) {
        super(0);
        this.$t = i3;
        this.i1 = i;
        this.l0 = intent;
        this.i2 = i2;
    }
}

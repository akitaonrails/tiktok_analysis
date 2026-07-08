package kotlin.jvm.internal;

import X.C09AY;
import X.C0UC4;
import X.C0UC8;
import X.C0UCF;
import X.C0UDE;
import X.C0UVC;
import X.C1161920gLG;
import X.C11TG;
import X.C1338270kvh;
import X.C158B;
import X.C19ME;
import X.C20441214yg;
import X.C2188811AlT;
import X.C238400w2;
import X.C500260Jjc;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkKaraokeLyricInfoSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AwS244S0000000_12 extends C09AY implements Function1 {
    public final int $t;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0000000_12(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0000000_12(DataChannel dataChannel, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        if (LiveSdkKaraokeLyricInfoSetting.INSTANCE.isEnable()) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        C0UC8 c0uc8;
        boolean z;
        C0UCF c0ucf = (C0UCF) obj;
        C0UC4 c0uc4 = C0UC4.LIZ;
        LiveEffect liveEffect = c0ucf.LIZ;
        if (liveEffect != null) {
            lValueOf = Long.valueOf(liveEffect.getEffectId());
        } else {
            lValueOf = null;
        }
        C0UC8 c0uc82 = C0UC4.LJFF;
        if (c0uc82 != null) {
            lValueOf2 = Long.valueOf(c0uc82.LIZ);
        } else {
            lValueOf2 = null;
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
            LiveEffect liveEffect2 = c0ucf.LIZ;
            if (liveEffect2 != null && !liveEffect2.LJJIJIIJI()) {
                long effectId = c0ucf.LIZ.getEffectId();
                String resourceId = c0ucf.LIZ.getResourceId();
                String name = c0ucf.LIZ.getName();
                boolean zLJJLIIIJILLIZJL = c0ucf.LIZ.LJJLIIIJILLIZJL();
                String str = c0ucf.LIZJ;
                String broadcastScene = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
                boolean z2 = c0ucf.LIZ.getLogParams().LIZ;
                boolean z3 = c0ucf.LIZ.getLogParams().LIZIZ;
                String str2 = c0ucf.LIZIZ;
                String strLJJJJI = c0ucf.LIZ.LJJJJI();
                String strLJJIJLIJ = c0ucf.LIZ.LJJIJLIJ();
                String strLLILII = c0ucf.LIZ.LLILII();
                boolean z4 = c0ucf.LIZLLL;
                long jLIZ = C158B.LIZ();
                LiveEffect liveEffect3 = c0ucf.LIZ;
                if (!C0UDE.LIZ(liveEffect3.getExtra()) && !C0UDE.LIZ(liveEffect3.LJJIII())) {
                    z = false;
                } else {
                    z = true;
                }
                c0uc8 = new C0UC8(effectId, resourceId, name, zLJJLIIIJILLIZJL, str, broadcastScene, z2, z3, str2, strLJJJJI, strLJJIJLIJ, strLLILII, null, null, z4, jLIZ, false, null, z, 0L, c0ucf.LIZ.getSource(), c0ucf.LIZ.LJJLIIIJL(), c0ucf.LIZ.getLogParams().LIZJ, c0ucf.LIZ.getLogParams().LIZLLL, false, null, null, c0ucf.LIZ.LJJJI(), c0ucf.LIZ.getSessionId(), C500260Jjc.LJJJI(Boolean.valueOf(c0ucf.LIZ.LLJJJ())) ? 1 : 0);
            } else {
                c0uc8 = null;
            }
            C0UC4.LJI = c0uc8;
            c0uc4.LJIIIIZZ();
        }
        LiveEffect liveEffect4 = c0ucf.LIZ;
        if (liveEffect4 != null) {
            lValueOf3 = Long.valueOf(liveEffect4.getEffectId());
        } else {
            lValueOf3 = null;
        }
        C0UC8 c0uc83 = C0UC4.LJFF;
        if (c0uc83 != null) {
            lValueOf4 = Long.valueOf(c0uc83.LIZ);
        } else {
            lValueOf4 = null;
        }
        if (!Intrinsics.LJFF(lValueOf3, lValueOf4)) {
            C0UC4.LJFF = C0UC4.LJI;
            C0UC4.LJI = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestCompetitionInfo");
        sbLIZ.append(": Retry competition info request failed, throwable ");
        sbLIZ.append(th);
        C20441214yg.LJ("CompetitionInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ));
        C0UVC.LIZIZ(th);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAndValidateCompetitionInfo");
        sbLIZ.append(": Request competition info request failed, throwable ");
        sbLIZ.append(th);
        C20441214yg.LJ("CompetitionSeiIdentifier", C2188811AlT.LIZIZ(sbLIZ));
        C0UVC.LIZIZ(th);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        C19ME c19me = (C19ME) obj;
        c19me.topToTop = R.id.bh2;
        c19me.bottomToBottom = R.id.bh2;
        c19me.startToStart = R.id.bh2;
        c19me.endToEnd = R.id.bh2;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestBattleInfo");
        sbLIZ.append(": Retry battle info request failed, throwable ");
        sbLIZ.append(th);
        C20441214yg.LJ("MatchBattleInfoIdentifier", C2188811AlT.LIZIZ(sbLIZ));
        C0UVC.LIZIZ(th);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestBattleInfo");
        sbLIZ.append(": Retry battle info request failed, throwable ");
        sbLIZ.append(th);
        C20441214yg.LJ("MatchSeiIdentifier", C2188811AlT.LIZIZ(sbLIZ));
        C0UVC.LIZIZ(th);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        C11TG c11tg = (C11TG) obj;
        c11tg.LIZIZ = AFwS296S0000000_12.get$arr$(16);
        c11tg.LIZJ = new AwS295S0000000_12(0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        C11TG c11tg = (C11TG) obj;
        c11tg.LIZIZ = AFwS296S0000000_12.get$arr$(21);
        c11tg.LIZJ = new AwS295S0000000_12(1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS244S0000000_12 awS244S0000000_12, Object obj) {
        C11TG c11tg = (C11TG) obj;
        c11tg.LIZIZ = AFwS296S0000000_12.get$arr$(22);
        c11tg.LIZJ = new AwS295S0000000_12(2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS244S0000000_12(JSONObject jSONObject, KaraokeHoverWidget karaokeHoverWidget, C238400w2 c238400w2, int i) {
        super(1);
        this.$t = i;
    }
}

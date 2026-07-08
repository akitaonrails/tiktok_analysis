package kotlin.jvm.internal;

import X.C086I;
import X.C08LY;
import X.C098200Yq;
import X.C09AY;
import X.C09RB;
import X.C0U83;
import X.C0U8I;
import X.C13BV;
import X.C189200o6;
import X.C1939607ik;
import X.C2101208La;
import X.C5183020f;
import X.C761740TuO;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import tikcast.api.anchor_tool.EffectListResponse;
import webcast.data.EffectCategory;

/* JADX INFO: loaded from: classes13.dex */
public class AwS290S0300000_12 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS290S0300000_12 awS290S0300000_12, Object obj, Object obj2) {
        Object c098200Yq;
        List<? extends LiveEffect> listLJJII;
        int iIntValue = ((Number) obj).intValue();
        LiveEffect liveEffect = (LiveEffect) obj2;
        boolean zLJ = false;
        if (liveEffect.getPanel().length() == 0) {
            liveEffect.LJJLJ(((C0U8I) awS290S0300000_12.l0).LIZJ);
        }
        liveEffect.LJZ(Integer.valueOf(iIntValue));
        liveEffect.LLJLIL(((EffectCategory) awS290S0300000_12.l1).name);
        liveEffect.LJIIJJI(((EffectCategory) awS290S0300000_12.l1).key);
        String str = ((EffectCategory) awS290S0300000_12.l1).extra;
        ((C0U8I) awS290S0300000_12.l0).getClass();
        try {
            new p();
            k kVarLJJIIZ = p.LIZJ(str).LJIILIIL().LJJIIZ("exclusive");
            if (kVarLJJIIZ != null) {
                zLJ = kVarLJJIIZ.LJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        liveEffect.LJIL(zLJ);
        ((C0U8I) awS290S0300000_12.l0).getClass();
        String extra = liveEffect.getExtra();
        if (extra != null) {
            try {
                JSONObject jSONObject = new JSONObject(extra);
                if (liveEffect.LJLJLLL() == null) {
                    liveEffect.LJIJJ(new LiveEffect.StickerSDKExtra());
                }
                LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
                if (stickerSDKExtraLJLJLLL != null) {
                    stickerSDKExtraLJLJLLL.redDotKey = jSONObject.optString("red_dot_key");
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        C0U8I c0u8i = (C0U8I) awS290S0300000_12.l0;
        EffectCategory effectCategory = (EffectCategory) awS290S0300000_12.l1;
        String str2 = effectCategory.name;
        String str3 = effectCategory.key;
        EffectListResponse.Data data = (EffectListResponse.Data) awS290S0300000_12.l2;
        c0u8i.getClass();
        if (liveEffect.LJJL() == 1 && !C086I.LIZIZ(liveEffect.LIZ())) {
            List<String> listLIZ = liveEffect.LIZ();
            if (listLIZ == null || (listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C2101208La(C09RB.LJIIJJI(new C08LY(new C1939607ik(listLIZ), new C5183020f(data, 313))), new C0U83(iIntValue, liveEffect, str2, str3)), AFwS245S0000000_12.get$arr$(235)))) == null) {
                listLJJII = C13BV.INSTANCE;
            }
            liveEffect.LLD(listLJJII);
        }
        return liveEffect;
    }

    public static final Object invoke$1(AwS290S0300000_12 awS290S0300000_12, Object obj, Object obj2) {
        ((C761740TuO) awS290S0300000_12.l0).LIZ.remove((SoundEffect) awS290S0300000_12.l1);
        ((Function1) awS290S0300000_12.l2).invoke(-3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS290S0300000_12(C761740TuO c761740TuO, C761740TuO c761740TuO2, SoundEffect soundEffect, Function1<? super Integer, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = c761740TuO;
        this.l1 = c761740TuO2;
        this.l2 = soundEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS290S0300000_12(C0U8I c0u8i, EffectCategory effectCategory, EffectListResponse.Data data, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0u8i;
        this.l1 = effectCategory;
        this.l2 = data;
    }
}

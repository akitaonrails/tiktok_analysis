package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C20361214lm;
import X.C259800zU;
import X.C761850TuZ;
import X.C768240UBq;
import X.InterfaceC20354714kj;
import com.bytedance.android.live.effect.playentity.BackgroundEffectEntity;
import com.bytedance.android.live.effect.playentity.MusicEntity;
import com.bytedance.android.live.effect.playentity.MusicEntityConfig;
import com.bytedance.android.live.effect.playentity.PropEffectEntity;
import com.bytedance.android.live.effect.playentity.StickerEffectEntity;
import com.bytedance.android.live.effect.playentity.VoiceEffectsEntity;
import com.bytedance.android.live.effect.playentity.VoiceEntityConfig;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public class AwS180S0400000_31 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS180S0400000_31 awS180S0400000_31, Object obj, Object obj2) {
        PlayEntityUtilKt.LIZJ((BackgroundEffectEntity) awS180S0400000_31.l0, obj2, (C20361214lm) awS180S0400000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS180S0400000_31.l2).element, ((C013C) awS180S0400000_31.l3).element);
        ((C013C) awS180S0400000_31.l3).element = false;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS180S0400000_31 awS180S0400000_31, Object obj, Object obj2) {
        Long l;
        String str;
        C768240UBq c768240UBq = (C768240UBq) obj2;
        MusicEntityConfig musicEntityConfig = null;
        if (c768240UBq != null) {
            l = c768240UBq.LIZ;
            str = c768240UBq.LIZIZ;
        } else {
            l = null;
            str = null;
        }
        MusicEntity musicEntity = (MusicEntity) awS180S0400000_31.l0;
        if (l != null && str != null) {
            musicEntity.LLJJJJLIIL.put(Long.valueOf(l.longValue()), str);
        }
        MusicEntity musicEntity2 = (MusicEntity) awS180S0400000_31.l0;
        if (c768240UBq != null) {
            musicEntity2.getClass();
            musicEntityConfig = new MusicEntityConfig(c768240UBq.LIZ);
        }
        PlayEntityUtilKt.LIZJ(musicEntity2, musicEntityConfig, (C20361214lm) awS180S0400000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS180S0400000_31.l2).element, ((C013C) awS180S0400000_31.l3).element);
        ((C013C) awS180S0400000_31.l3).element = false;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS180S0400000_31 awS180S0400000_31, Object obj, Object obj2) {
        PlayEntityUtilKt.LIZJ((PropEffectEntity) awS180S0400000_31.l0, obj2, (C20361214lm) awS180S0400000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS180S0400000_31.l2).element, ((C013C) awS180S0400000_31.l3).element);
        PlayEntityUtilKt.LJ((PropEffectEntity) awS180S0400000_31.l0, 1, (C20361214lm) awS180S0400000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS180S0400000_31.l2).element);
        ((C013C) awS180S0400000_31.l3).element = false;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS180S0400000_31 awS180S0400000_31, Object obj, Object obj2) {
        PlayEntityUtilKt.LIZJ((StickerEffectEntity) awS180S0400000_31.l0, obj2, (C20361214lm) awS180S0400000_31.l1, (InterfaceC20354714kj) ((Function0) awS180S0400000_31.l2).invoke(), ((C013C) awS180S0400000_31.l3).element);
        ((C013C) awS180S0400000_31.l3).element = false;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS180S0400000_31 awS180S0400000_31, Object obj, Object obj2) {
        String str;
        String str2;
        C761850TuZ c761850TuZ = (C761850TuZ) obj2;
        String str3 = null;
        if (c761850TuZ != null) {
            str = c761850TuZ.LIZ;
            str2 = c761850TuZ.LIZIZ;
        } else {
            str = null;
            str2 = null;
        }
        VoiceEffectsEntity voiceEffectsEntity = (VoiceEffectsEntity) awS180S0400000_31.l0;
        if (str != null && str2 != null) {
            voiceEffectsEntity.LLJJJJLIIL.put(str, str2);
        }
        VoiceEffectsEntity voiceEffectsEntity2 = (VoiceEffectsEntity) awS180S0400000_31.l0;
        voiceEffectsEntity2.getClass();
        if (c761850TuZ != null) {
            str3 = c761850TuZ.LIZ;
        }
        PlayEntityUtilKt.LIZJ(voiceEffectsEntity2, new VoiceEntityConfig(str3), (C20361214lm) awS180S0400000_31.l1, (InterfaceC20354714kj) ((C259800zU) awS180S0400000_31.l2).element, ((C013C) awS180S0400000_31.l3).element);
        ((C013C) awS180S0400000_31.l3).element = false;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS180S0400000_31(BackgroundEffectEntity backgroundEffectEntity, BackgroundEffectEntity backgroundEffectEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = backgroundEffectEntity;
        this.l1 = backgroundEffectEntity2;
        this.l2 = c20361214lm;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS180S0400000_31(MusicEntity musicEntity, MusicEntity musicEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = musicEntity;
        this.l1 = musicEntity2;
        this.l2 = c20361214lm;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS180S0400000_31(PropEffectEntity propEffectEntity, PropEffectEntity propEffectEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = propEffectEntity;
        this.l1 = propEffectEntity2;
        this.l2 = c20361214lm;
        this.l3 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS180S0400000_31(StickerEffectEntity stickerEffectEntity, StickerEffectEntity stickerEffectEntity2, C20361214lm c20361214lm, Function0<? extends InterfaceC20354714kj> function0, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = stickerEffectEntity;
        this.l1 = stickerEffectEntity2;
        this.l2 = c20361214lm;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS180S0400000_31(VoiceEffectsEntity voiceEffectsEntity, VoiceEffectsEntity voiceEffectsEntity2, C20361214lm c20361214lm, C259800zU<InterfaceC20354714kj> c259800zU, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = voiceEffectsEntity;
        this.l1 = voiceEffectsEntity2;
        this.l2 = c20361214lm;
        this.l3 = c259800zU;
    }
}

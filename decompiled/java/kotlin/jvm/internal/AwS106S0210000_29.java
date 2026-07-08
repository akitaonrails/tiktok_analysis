package kotlin.jvm.internal;

import X.AnonymousClass1232;
import X.C09AY;
import X.C11VR;
import X.C11Y7;
import X.C123100dR;
import X.C19519111Yf;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS106S0210000_29 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS106S0210000_29 awS106S0210000_29) {
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        String str;
        if (((TTSSpeakerInfo) awS106S0210000_29.l0) != null) {
            TTSSpeakerInfo tTSSpeakerInfo = (TTSSpeakerInfo) awS106S0210000_29.l0;
            Effect effect = null;
            if (tTSSpeakerInfo != null) {
                effect = tTSSpeakerInfo.LIZIZ;
            }
            if (effect != null) {
                if (tTSSpeakerInfo != null && (readTextEffectSpeakerExtra = tTSSpeakerInfo.LIZ) != null) {
                    VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = new VoiceCloneReadTextEffectBean(effect, readTextEffectSpeakerExtra);
                    voiceCloneReadTextEffectBean.isPrivate = awS106S0210000_29.z2;
                    C19519111Yf c19519111Yf = (C19519111Yf) awS106S0210000_29.l1;
                    if (C123100dR.LIZ(C11VR.LIZIZ().creationDefaultText)) {
                        str = C11VR.LIZIZ().creationDefaultText;
                    } else {
                        str = "Hello! This is text-to-speech. Try adding different voices and text";
                    }
                    c19519111Yf.W1(voiceCloneReadTextEffectBean, str);
                    ((C19519111Yf) awS106S0210000_29.l1).Z1();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS106S0210000_29 awS106S0210000_29) {
        C11Y7 c11y7 = (C11Y7) awS106S0210000_29.l0;
        c11y7.LLLJ.LIZIZ = false;
        c11y7.LLLLIIIILLL = awS106S0210000_29.z2;
        Function1 function1 = (Function1) awS106S0210000_29.l1;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS106S0210000_29 awS106S0210000_29) {
        if (awS106S0210000_29.z2) {
            ((AnonymousClass1232) awS106S0210000_29.l0).LIZ = null;
        }
        Function0 function0 = (Function0) awS106S0210000_29.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS106S0210000_29 awS106S0210000_29) {
        if (!awS106S0210000_29.z2) {
            ((AnonymousClass1232) awS106S0210000_29.l0).LIZ = null;
        }
        Function0 function0 = (Function0) awS106S0210000_29.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0210000_29(C11Y7 c11y7, C11Y7 c11y72, boolean z, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = c11y7;
        this.z2 = c11y72;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S0210000_29(TTSSpeakerInfo tTSSpeakerInfo, C19519111Yf c19519111Yf, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = tTSSpeakerInfo;
        this.l1 = c19519111Yf;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS106S0210000_29(boolean z, boolean z2, AnonymousClass1232 anonymousClass1232, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = anonymousClass1232;
    }
}

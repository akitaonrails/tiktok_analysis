package n86;

import X.C1294230jmf;
import X.C1297940jse;
import X.C1313490kHj;
import X.C1314420kJE;
import X.C2188811AlT;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class a$g extends AnimatorListenerAdapter {
    public static final Map<String, Object> LLILLL;
    public final WeakReference<SDUIBaseUI> LL;
    public final int LLILLJJLI;

    static {
        HashMap map = new HashMap();
        LLILLL = map;
        map.put("animation_type", "transition");
    }

    public final void LIZ(String str) {
        String str2;
        SDUIBaseUI sDUIBaseUI = this.LL.get();
        if (sDUIBaseUI == null) {
            return;
        }
        if (sDUIBaseUI instanceof C1313490kHj) {
            sDUIBaseUI = ((C1313490kHj) sDUIBaseUI).LLLLZI;
        }
        Map<String, C1297940jse> map = sDUIBaseUI.LLJIJIL;
        if (map != null && map.containsKey(str)) {
            Map<String, Object> map2 = LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("transition-");
            int i = this.LLILLJJLI;
            if (i != 1) {
                if (i == 2) {
                    str2 = "scaleX";
                } else {
                    switch (i) {
                        case 4:
                            str2 = "scaleY";
                            break;
                        case 8:
                            str2 = "scaleXY";
                            break;
                        case 16:
                            str2 = "width";
                            break;
                        case 32:
                            str2 = "height";
                            break;
                        case 64:
                            str2 = "background-color";
                            break;
                        case 128:
                            str2 = "visibility";
                            break;
                        case 256:
                            str2 = "left";
                            break;
                        case 512:
                            str2 = "top";
                            break;
                        case 1024:
                            str2 = "right";
                            break;
                        case SpeechEngineDefines.ASR_WORK_MODE_OFFLINE /* 2048 */:
                            str2 = "bottom";
                            break;
                        case SpeechEngineDefines.TTS_WORK_MODE_BOTH /* 4096 */:
                            str2 = "transform";
                            break;
                        default:
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Unsupported animated property: ");
                            sbLIZ2.append(i);
                            C1314420kJE.LIZIZ(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2)));
                            throw null;
                    }
                }
            } else {
                str2 = "opacity";
            }
            sbLIZ.append(str2);
            ((HashMap) map2).put("animation_type", C2188811AlT.LIZIZ(sbLIZ));
            sDUIBaseUI.LLILZ.LLILLL.LIZJ(new C1294230jmf(sDUIBaseUI.LLJJ, str, map2));
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        LIZ("transitionend");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        LIZ("transitionstart");
    }

    public a$g(SDUIBaseUI sDUIBaseUI, int i) {
        this.LL = new WeakReference<>(sDUIBaseUI);
        this.LLILLJJLI = i;
    }
}

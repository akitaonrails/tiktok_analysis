package kotlin.jvm.internal;

import X.C09AY;
import X.C373410EkV;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.ies.nle.editor_jni.EpResourceCallback;
import com.bytedance.ies.nle.editor_jni.EpResourceDelegate;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.service.NLETextStickerServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS33S2100000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS33S2100000_5 awS33S2100000_5, Object obj) {
        return Boolean.valueOf(((EpResourceDelegate) ((NLETextStickerServiceImpl) awS33S2100000_5.l2).LIZIZ.getValue()).request(awS33S2100000_5.s0, awS33S2100000_5.s1, (EpResourceCallback) obj));
    }

    public static final Object invoke$1(AwS33S2100000_5 awS33S2100000_5, Object obj) {
        String str;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        TuxIconView tuxIconView = ((C373410EkV) awS33S2100000_5.l2).LLJLL;
        if (tuxIconView != null && tuxIconView.isActivated()) {
            str = awS33S2100000_5.s0;
        } else {
            str = awS33S2100000_5.s1;
        }
        accessibilityNodeInfoCompat.setContentDescription(str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S2100000_5(C373410EkV c373410EkV, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c373410EkV;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S2100000_5(NLETextStickerServiceImpl nLETextStickerServiceImpl, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = nLETextStickerServiceImpl;
        this.s0 = str;
        this.s1 = str2;
    }
}

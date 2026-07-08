package kotlin.jvm.internal;

import X.AbstractC21274918Nn;
import X.C09AY;
import X.C18UP;
import X.C19A3;
import X.C21273718Nb;
import X.C21287618Sk;
import X.C21301018Xo;
import android.text.SpannableString;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.feed.model.ECAnchorInfo;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS86S0500000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS86S0500000_32 awS86S0500000_32) {
        C21273718Nb c21273718Nb = C21273718Nb.LIZ;
        List<String> list = ((ECAnchorInfo) awS86S0500000_32.l0).prefixSecondaryImageUrls;
        AbstractC21274918Nn abstractC21274918Nn = (AbstractC21274918Nn) awS86S0500000_32.l1;
        Function1 function1 = (Function1) awS86S0500000_32.l2;
        Function0 function0 = (Function0) awS86S0500000_32.l3;
        Function0 function02 = (Function0) awS86S0500000_32.l4;
        c21273718Nb.getClass();
        C21273718Nb.LIZIZ(list, abstractC21274918Nn, function1, function0, function02);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS86S0500000_32 awS86S0500000_32) {
        ((C21301018Xo) awS86S0500000_32.l0).LJ((C19A3) awS86S0500000_32.l1);
        ((Function0) awS86S0500000_32.l2).invoke();
        C18UP c18up = C18UP.LIZ;
        AIChatGenModel aIChatGenModel = (AIChatGenModel) awS86S0500000_32.l3;
        AIChatTrackingConfig aIChatTrackingConfig = (AIChatTrackingConfig) awS86S0500000_32.l4;
        c18up.getClass();
        C18UP.LJIIIZ(aIChatGenModel, aIChatTrackingConfig, "leave");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS86S0500000_32 awS86S0500000_32) {
        ((C21301018Xo) awS86S0500000_32.l0).LIZIZ.setValue(Boolean.TRUE);
        ((Keva) C21287618Sk.LIZ.getValue()).storeBoolean("key_privacy_passed", true);
        ((C21301018Xo) awS86S0500000_32.l0).LJ((C19A3) awS86S0500000_32.l1);
        Function0 function0 = (Function0) awS86S0500000_32.l2;
        if (function0 != null) {
            function0.invoke();
        }
        C18UP c18up = C18UP.LIZ;
        AIChatGenModel aIChatGenModel = (AIChatGenModel) awS86S0500000_32.l3;
        AIChatTrackingConfig aIChatTrackingConfig = (AIChatTrackingConfig) awS86S0500000_32.l4;
        c18up.getClass();
        C18UP.LJIIIZ(aIChatGenModel, aIChatTrackingConfig, "start");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S0500000_32(C21301018Xo c21301018Xo, C21301018Xo c21301018Xo2, C19A3 c19a3, Function0<Unit> function0, AIChatGenModel aIChatGenModel, AIChatTrackingConfig aIChatTrackingConfig) {
        super(0);
        this.$t = aIChatTrackingConfig;
        this.l0 = c21301018Xo;
        this.l1 = c21301018Xo2;
        this.l2 = c19a3;
        this.l3 = function0;
        this.l4 = aIChatGenModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS86S0500000_32(ECAnchorInfo eCAnchorInfo, ECAnchorInfo eCAnchorInfo2, AbstractC21274918Nn abstractC21274918Nn, Function1<? super SpannableString, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = eCAnchorInfo;
        this.l1 = eCAnchorInfo2;
        this.l2 = abstractC21274918Nn;
        this.l3 = function1;
        this.l4 = function0;
    }
}

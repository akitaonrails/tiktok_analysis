package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C198H;
import X.C20622515mp;
import X.C23250099c;
import X.C2497709qZ;
import X.C378920EtO;
import X.C386820FEq;
import X.InterfaceC20597015ii;
import X.InterfaceC377040EqM;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS67S0500000_5 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS67S0500000_5 awS67S0500000_5) {
        C013C c013c = (C013C) awS67S0500000_5.l0;
        if (!c013c.element) {
            c013c.element = true;
            String strLJFF = ((MediaModel) awS67S0500000_5.l1).LJFF();
            if (((MediaModel) awS67S0500000_5.l1).LJIILJJIL() && (!a0.LJJJIL(strLJFF))) {
                ((C378920EtO) awS67S0500000_5.l2).H5(AIGCGenerationParam.LIZ((AIGCGenerationParam) awS67S0500000_5.l3, null, null, strLJFF, null, null, null, false, 0, false, null, null, null, null, -5, 7));
            } else {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C378920EtO) awS67S0500000_5.l2), null, null, new C2497709qZ((C378920EtO) awS67S0500000_5.l2, (NLETrackSlot) awS67S0500000_5.l4, (AIGCGenerationParam) awS67S0500000_5.l3, null), 3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS67S0500000_5 awS67S0500000_5) {
        Scene scene;
        C198H c198hLC = ((InterfaceC20597015ii) awS67S0500000_5.l0).LC();
        if (c198hLC != null && (scene = c198hLC.getScene()) != null && scene.mActivity != null) {
            ((C386820FEq) awS67S0500000_5.l1).LIZIZ(C20622515mp.LJIIZILJ((InterfaceC20597015ii) awS67S0500000_5.l0, (Activity) awS67S0500000_5.l2), (VideoPublishEditModel) awS67S0500000_5.l3, (InterfaceC377040EqM) awS67S0500000_5.l4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS67S0500000_5 awS67S0500000_5) {
        ((C386820FEq) awS67S0500000_5.l0).LIZIZ(C20622515mp.LJIIZILJ((InterfaceC20597015ii) awS67S0500000_5.l1, (Activity) awS67S0500000_5.l2), (VideoPublishEditModel) awS67S0500000_5.l3, (InterfaceC377040EqM) awS67S0500000_5.l4);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS67S0500000_5(android.app.Activity r3, X.InterfaceC20597015ii r4, X.InterfaceC377040EqM r5, X.C386820FEq r6, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            int r8 = 1 - r8
            if (r8 == 0) goto L16
            r1 = r2
            r1.l0 = r6
            r1.l1 = r4
            r1.l2 = r3
            r1.l3 = r7
            r1.l4 = r5
            r0 = 0
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r6
            r1.l2 = r3
            r1.l3 = r7
            r1.l4 = r5
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS67S0500000_5.<init>(android.app.Activity, X.15ii, X.0EqM, X.0FEq, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0500000_5(C013C c013c, MediaModel mediaModel, C378920EtO c378920EtO, AIGCGenerationParam aIGCGenerationParam, NLETrackSlot nLETrackSlot, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = mediaModel;
        this.l2 = c378920EtO;
        this.l3 = aIGCGenerationParam;
        this.l4 = nLETrackSlot;
    }
}

package kotlin.jvm.internal;

import X.C09AY;
import X.C347570Djv;
import X.C348100Dkm;
import X.InterfaceC1452170ntP;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS26S0202000_22 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS26S0202000_22 awS26S0202000_22, Object obj) {
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        if (Intrinsics.LJFF(((EffectPointModel) awS26S0202000_22.l0).getKey(), "2")) {
            ((EffectPointModel) awS26S0202000_22.l0).setUuid(c348100Dkm.LIZLLL().LJJIZ(C347570Djv.LIZ(awS26S0202000_22.i2, awS26S0202000_22.i3)));
        } else if (Intrinsics.LJFF(((EffectPointModel) awS26S0202000_22.l0).getKey(), "3")) {
            ((EffectPointModel) awS26S0202000_22.l0).setUuid(c348100Dkm.LIZLLL().LJJIZ(C347570Djv.LIZIZ(awS26S0202000_22.i2, awS26S0202000_22.i3)));
        }
        InterfaceC1452170ntP interfaceC1452170ntP = (InterfaceC1452170ntP) awS26S0202000_22.l1;
        interfaceC1452170ntP.Rf(interfaceC1452170ntP.getDuration(), VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS26S0202000_22 r9, java.lang.Object r10) {
        /*
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r2 = r10.booleanValue()
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel r1 = r0.editSaveLocalModel
            r0 = 1
            r1.isFromQuickPublish = r0
            r1.isQuickPostAsStory = r2
            java.lang.Object r0 = r9.l1
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            boolean r0 = X.C855610XhP.LIZ()
            if (r0 == 0) goto L22
            if (r2 == 0) goto L55
        L22:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.09Js r3 = new X.09Js
            java.lang.Object r4 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r4
            java.lang.String r5 = "save"
            int r6 = r9.i2
            int r7 = r9.i3
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r8, r8, r3, r0)
            if (r2 == 0) goto L55
            java.lang.String r4 = "story_to_save"
        L40:
            X.0n1k r0 = X.C1418900n1k.LIZ
            java.lang.Object r3 = r9.l0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r3
            int r2 = r9.i2
            int r1 = r9.i3
            r0.getClass()
            java.lang.String r0 = "save"
            X.C1418900n1k.LIZIZ(r2, r1, r3, r0, r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L55:
            java.lang.String r4 = "post_to_save"
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS26S0202000_22.invoke$1(kotlin.jvm.internal.AwS26S0202000_22, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0202000_22(EffectPointModel effectPointModel, int i, int i2, InterfaceC1452170ntP interfaceC1452170ntP, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = effectPointModel;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = interfaceC1452170ntP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0202000_22(VideoPublishEditModel videoPublishEditModel, Function0 function0, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = videoPublishEditModel;
        this.l1 = function0;
        this.i2 = i;
        this.i3 = i2;
    }
}

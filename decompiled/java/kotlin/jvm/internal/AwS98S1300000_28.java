package kotlin.jvm.internal;

import X.C09AY;
import X.C10IZ;
import X.C127K;
import X.C1403740mdI;
import X.C19222710If;
import X.C19223110Ij;
import X.C19EG;
import X.C20684815ws;
import X.InterfaceC19222210Ia;
import com.ss.android.ugc.aweme.compliance.IContentClassificationService;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class AwS98S1300000_28 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final Object invoke$0(AwS98S1300000_28 awS98S1300000_28, Object obj, Object obj2) {
        Map<String, String> mapLIZ = C1403740mdI.LIZ((VideoPublishEditModel) awS98S1300000_28.l1, awS98S1300000_28.s0);
        C20684815ws.LJIILLIIL("turn_on_mature_themes", mapLIZ);
        IContentClassificationService.LIZ.getClass();
        C19222710If.LIZ().LIZ((C19EG) awS98S1300000_28.l2, mapLIZ, new AwS429S0200000_28((C19223110Ij) awS98S1300000_28.l3, (C127K) obj2, 59));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS98S1300000_28 awS98S1300000_28, Object obj, Object obj2) {
        final C127K c127k = (C127K) obj2;
        final C19223110Ij c19223110Ij = (C19223110Ij) awS98S1300000_28.l3;
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS98S1300000_28.l2;
        C10IZ.LJIIJJI(new InterfaceC19222210Ia() { // from class: X.10Ib
            @Override // X.InterfaceC19222210Ia
            public final void LIZ() {
                c19223110Ij.LJIIIIZZ = false;
            }

            @Override // X.InterfaceC19222210Ia
            public final void LIZIZ() {
                CreativeModel creativeModel;
                PrivacySettingModel privacySettingModel;
                AIGCInfo aIGCInfo;
                C11GO c11go;
                c19223110Ij.LJ = true;
                C127M accessory = c127k.getAccessory();
                if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                    c11go.LJIILJJIL(true);
                }
                c19223110Ij.LJIIIIZZ = false;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                if (videoPublishEditModel2 == null || (creativeModel = videoPublishEditModel2.creativeModel) == null || (privacySettingModel = creativeModel.privacySettingModel) == null || (aIGCInfo = privacySettingModel.aigcInfo) == null) {
                    return;
                }
                aIGCInfo.manualChangeSwitch = true;
            }
        }, (C19EG) awS98S1300000_28.l1, videoPublishEditModel, awS98S1300000_28.s0);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS98S1300000_28(X.C19EG r3, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4, X.C19223110Ij r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            if (r6 == 0) goto L14
            r1 = r2
            r1.l1 = r3
            r1.l2 = r4
            java.lang.String r0 = "video_edit_page"
            r1.s0 = r0
            r1.l3 = r5
            r0 = 2
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l1 = r4
            java.lang.String r0 = "video_edit_page"
            r1.s0 = r0
            r1.l2 = r3
            r1.l3 = r5
            r0 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS98S1300000_28.<init>(X.19EG, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.10Ij, int):void");
    }
}

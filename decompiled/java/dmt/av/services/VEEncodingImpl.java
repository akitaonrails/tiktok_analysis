package dmt.av.services;

import X.C04TD;
import X.C1435130nRv;
import X.C1437030nUz;
import X.InterfaceC1452170ntP;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: loaded from: classes23.dex */
public final class VEEncodingImpl implements IVEEncodingSetting {
    public static IVEEncodingSetting LIZIZ() {
        Object objLIZ = C04TD.LIZ(IVEEncodingSetting.class, false);
        if (objLIZ != null) {
            return (IVEEncodingSetting) objLIZ;
        }
        if (C04TD.j7 == null) {
            synchronized (IVEEncodingSetting.class) {
                if (C04TD.j7 == null) {
                    C04TD.j7 = new VEEncodingImpl();
                }
            }
        }
        return C04TD.j7;
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting
    public final VEVideoEncodeSettings LIZ(VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP) {
        return C1437030nUz.LIZJ(videoPublishEditModel, null, interfaceC1452170ntP, "", C1435130nRv.LIZIZ, false, false, false);
    }
}

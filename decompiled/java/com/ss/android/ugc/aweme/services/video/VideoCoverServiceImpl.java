package com.ss.android.ugc.aweme.services.video;

import X.C1438570nXT;
import X.C1456230nzx;
import X.C1457050o1H;
import X.C1457060o1I;
import X.C201955140j;
import X.C2188811AlT;
import X.InterfaceC1457180o1U;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoCoverServiceImpl implements IVideoCoverService {
    public static final int $stable = 0;

    private final Bitmap mergeCoverTextImage(Bitmap bitmap, CoverPublishModel coverPublishModel) {
        if (coverPublishModel == null) {
            return bitmap;
        }
        return coverPublishModel.getEffectTextModel().mergeCoverText(bitmap);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoCoverService
    public void getVideoCoverByCallback(AwemeDraft awemeDraft, final IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(awemeDraft.LJ());
        EffectPointModel effectPointModel = awemeDraft.LIZ.editEffectModel.timeEffect;
        if (effectPointModel != null) {
            arrayList.add(effectPointModel);
            TextUtils.equals(effectPointModel.getKey(), "1");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftBoxViewHolder SetCoverImage EffectPointModelList:");
        sbLIZ.append(arrayList);
        sbLIZ.append("\n filterId:");
        sbLIZ.append(awemeDraft.LJJJJIZL.filterId);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        new C1438570nXT("cover");
        C1456230nzx c1456230nzx = new C1456230nzx(C1438570nXT.LIZJ(awemeDraft, false));
        c1456230nzx.LIZ.LJIJI = true;
        c1456230nzx.LIZ.LJII = new AwS587S0100000_8(onVideoCoverCallback, 89);
        InterfaceC1457180o1U interfaceC1457180o1U = new InterfaceC1457180o1U() { // from class: com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl.getVideoCoverByCallback.2
            @Override // X.InterfaceC1457180o1U
            public final void onError(int i, String str) {
                IEffectService.OnVideoCoverCallback onVideoCoverCallback2 = onVideoCoverCallback;
                if (onVideoCoverCallback2 != null) {
                    onVideoCoverCallback2.onGetVideoCoverFailed(i);
                }
            }
        };
        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
        c1457050o1H.LJIIJ = interfaceC1457180o1U;
        C1457060o1I.LIZIZ(c1457050o1H);
    }
}

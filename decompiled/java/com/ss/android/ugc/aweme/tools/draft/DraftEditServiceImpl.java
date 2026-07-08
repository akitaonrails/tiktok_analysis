package com.ss.android.ugc.aweme.tools.draft;

import X.C0M2T;
import X.C542550LPp;
import X.C542610LPv;
import X.C570560MZi;
import X.InterfaceC537370L5r;
import X.InterfaceC542470LPh;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS212S0300000_3;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftEditServiceImpl implements IDraftEditService {
    @Override // com.ss.android.ugc.aweme.tools.draft.IDraftEditService
    public final void LIZ(Activity activity, AwemeDraft awemeDraft, int i, long j) {
        C570560MZi.LJFF(activity, awemeDraft, i, j, null);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.IDraftEditService
    public final void LIZIZ(AwemeDraft awemeDraft, final Context context, final LifecycleOwner lifecycleOwner, final AwS212S0300000_3 awS212S0300000_3) {
        C542610LPv.LIZLLL(new C542550LPp(new InterfaceC537370L5r(context, lifecycleOwner) { // from class: X.0LBL
            public final Context LIZ;
            public final LifecycleOwner LIZIZ;

            @Override // X.InterfaceC537370L5r
            public final IDraftListener LIZ() {
                return null;
            }

            @Override // X.InterfaceC537370L5r
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC537370L5r
            public final Context getContext() {
                return this.LIZ;
            }

            @Override // X.InterfaceC537370L5r
            public final LifecycleOwner getLifecycleOwner() {
                return this.LIZIZ;
            }

            {
                this.LIZ = context;
                this.LIZIZ = lifecycleOwner;
            }
        }, awemeDraft, new C0M2T(false, null, "clickFromContinuePopup", 0, false, 23)), new InterfaceC542470LPh() { // from class: X.0LBK
            @Override // X.InterfaceC542470LPh
            public final void LIZ(C0LBJ c0lbj) {
                VideoPublishEditModel videoPublishEditModel = c0lbj.LIZIZ;
                if (videoPublishEditModel != null) {
                    awS212S0300000_3.invoke(videoPublishEditModel);
                } else {
                    C0MYY.LIZ(c0lbj.LIZ, context);
                }
            }

            @Override // X.InterfaceC542470LPh
            public final void LIZIZ(C0LBJ c0lbj) {
                C0MYY.LIZ(c0lbj.LIZ, context);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.IDraftEditService
    public final void LIZJ(Context context, AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel, long j, String str) {
        C570560MZi.LJIIJJI(context, awemeDraft, true, videoPublishEditModel, 6, j, str, true);
    }
}

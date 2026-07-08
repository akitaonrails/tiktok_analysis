package com.ss.android.ugc.aweme.story.edit.opt;

import X.C05YF;
import X.C0ET4;
import X.C0L2D;
import X.C0L2F;
import X.C0L2G;
import X.C0L2H;
import X.C1659700tI8;
import X.C2188811AlT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryAlbumComponentService;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryAlbumEnterEditOptComponentService implements StoryAlbumComponentService {
    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryAlbumComponentService
    public final void LIZIZ() {
        C0L2D.LLILZ.getClass();
        C0L2D c0l2d = C0L2D.LLILZLL;
        if (c0l2d != null) {
            c0l2d.W1();
        }
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.mediapicker.StoryAlbumComponentService
    public final void LIZ(C539960LFq c539960LFq, EnterStoryParam enterStoryParam) {
        if (!C0L2G.LIZJ()) {
            return;
        }
        C0L2F c0l2f = C0L2H.LLJ;
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(enterStoryParam, 373);
        c0l2f.getClass();
        C0L2F.LIZ(c539960LFq, awS552S0100000_8, "StoryAlbumEnterEditOpt");
        C0L2D.LLILZ.getClass();
        if (!C0L2D.LLILZIL.get()) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C0L2D.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(C05YF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C0L2D.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 290));
        }
    }
}

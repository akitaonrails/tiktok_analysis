package com.ss.android.ugc.aweme.social.creation.openstory;

import X.C0LNW;
import X.C0MNO;
import X.C0MNT;
import X.C0MNU;
import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.social.creation.api.addtostory.IOpenStoryService;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class OpenStoryServiceNewImpl implements IOpenStoryService {
    public final C0MNT LIZ = new C0LNW<C0MNU>() { // from class: X.0MNT
        public final C567400MNe LJ = new C567400MNe();

        @Override // X.C0LNW
        public final String LIZLLL() {
            return "No photo sharing data provided";
        }

        @Override // X.C0LNW
        public final C0MNU LIZJ(C0MNQ c0mnq) {
            return c0mnq.LIZIZ;
        }

        @Override // X.C0LNW
        public final Intent LJFF(CreativeInfo creativeInfo, Object obj, C0MNQ c0mnq, C0MNU c0mnu) {
            String str;
            C0MNU c0mnu2 = c0mnu;
            CanvasVideoData canvasVideoData = (CanvasVideoData) obj;
            C567370MNb c567370MNb = this.LIZ;
            C0MNR c0mnr = c0mnq.LIZ;
            if (c0mnr != null) {
                str = c0mnr.LIZIZ;
            } else {
                str = null;
            }
            List<C1EJ2> list = c0mnu2.LIZJ;
            c567370MNb.getClass();
            Intent intent = new Intent();
            C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
            Workspace workspaceLIZ = C14D2.LIZ(creativeInfo);
            intent.putExtra("creation_id", creativeInfo.getCreationId());
            intent.putExtra("shoot_way", str);
            C0MUK.LIZIZ(intent).canvasVideoData = canvasVideoData;
            C0MUK.LIZIZ(intent).workspace = workspaceLIZ;
            intent.putExtra("workspace", workspaceLIZ);
            DisplayMetrics displayMetrics = C20642515q3.LJFF().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            C577660MlA.LIZ.getClass();
            VideoFileInfo videoFileInfo = new VideoFileInfo(i, i2, C577660MlA.LIZ().defaultDuration, 30, 0, 0, 0, 0, 0.0f, 496, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CONCAT, null, false, 12));
            sbLIZ.append(C1449640npK.LIZ(".mp4"));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C570490MZb.LJI(new C0VSJ(strLIZIZ));
            C0MUK.LIZIZ(intent).editModel.editPreviewInfo = new C538330L9j(i, i2, 12).LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
            if (!list.isEmpty()) {
                DisplayMetrics displayMetrics2 = C20642515q3.LJFF().getDisplayMetrics();
                C0MUK.LIZIZ(intent).stickerModel.mentionStickerModel.addAll(C567370MNb.LIZ(list, new Pair(Integer.valueOf(displayMetrics2.widthPixels), Integer.valueOf(displayMetrics2.heightPixels))));
            }
            return intent;
        }

        @Override // X.C0LNW
        public final Object LJI(Context context, C0MNU c0mnu, CreativeInfo creativeInfo, InterfaceC1364105Vn interfaceC1364105Vn) {
            return this.LJ.LIZ(context, c0mnu, creativeInfo, interfaceC1364105Vn);
        }
    };
    public final C0MNO LIZIZ = new C0MNO();

    @Override // com.ss.android.ugc.aweme.social.creation.api.addtostory.IOpenStoryService
    public final void LIZ(Context context, AwS122S1100000_8 awS122S1100000_8) {
        this.LIZIZ.LJII(context, awS122S1100000_8);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.addtostory.IOpenStoryService
    public final void LIZIZ(Context context, AwS59S1000000_8 awS59S1000000_8) {
        LJII(context, awS59S1000000_8);
    }
}

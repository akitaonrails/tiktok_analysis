package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PreviewCommentInfo_ProtoDecoder implements C0IMD<PreviewCommentInfo> {
    public static PreviewCommentInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreviewCommentInfo previewCommentInfo = new PreviewCommentInfo();
        previewCommentInfo.commentList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    previewCommentInfo.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                previewCommentInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            previewCommentInfo.expireTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        previewCommentInfo.commentList.add(_PreviewCommentItem_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    previewCommentInfo.pollingInterval = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewCommentInfo;
            }
        }
    }

    public static void LJ(PreviewCommentInfo previewCommentInfo) {
        List<PreviewCommentItem> list = previewCommentInfo.commentList;
        if (list == null) {
            previewCommentInfo.commentList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PreviewCommentItem> it2 = previewCommentInfo.commentList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        ImageModel imageModel = previewCommentInfo.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PreviewCommentInfo previewCommentInfo) {
        LJ(previewCommentInfo);
    }

    @Override // X.C0IMD
    public final PreviewCommentInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreviewCommentInfo previewCommentInfo, List list) {
    }
}

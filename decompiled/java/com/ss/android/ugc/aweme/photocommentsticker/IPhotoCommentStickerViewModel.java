package com.ss.android.ugc.aweme.photocommentsticker;

import X.C00CQ;
import X.C00CR;
import X.C05YD;
import X.C869590Y9l;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class IPhotoCommentStickerViewModel extends AssemViewModel<InterfaceC0148002o> {
    public abstract boolean checkFakeMsgValidityOnExit(String str, List<? extends C869590Y9l> list);

    public abstract void fetchPhotoCommentSticker(C00CQ c00cq, String str, int i);

    public abstract String getEnteredAwemeId();

    public abstract C05YD<C00CR> getPhotoCommentStickerUIData();

    public abstract void recordEnteredAweme(String str, List<? extends C869590Y9l> list);

    public abstract void resetState();
}

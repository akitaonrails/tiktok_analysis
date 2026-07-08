package com.ss.android.ugc.aweme.texttoimage.choose;

import X.AbstractC558210Lut;
import X.C01GW;
import X.C0LIV;
import X.C1533950q1J;
import X.C452501pT;
import X.C558230Luv;
import X.C572250McR;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageChooseListViewModel extends ViewModel {
    public VideoPublishEditModel LLILLJJLI;
    public int LLILLL;
    public final List<AbstractC558210Lut> LL = new ArrayList();
    public final MutableLiveData<C558230Luv> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(206));

    public final void wQ2() {
        TextImageTaskInfo textImageTaskInfoLIZLLL;
        String uri;
        CreativeModel creativeModel;
        Text2ImageModel text2ImageModel;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        String type = null;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (text2ImageModel = creativeModel.text2ImageModel) == null) {
            textImageTaskInfoLIZLLL = null;
        } else {
            textImageTaskInfoLIZLLL = C572250McR.LIZLLL(text2ImageModel, Integer.valueOf(this.LLILLL));
            if (textImageTaskInfoLIZLLL != null) {
                type = textImageTaskInfoLIZLLL.getType();
            }
        }
        boolean zLJFF = Intrinsics.LJFF(type, C0LIV.AI.getType());
        boolean z = false;
        if (zLJFF && (C1533950q1J.LJ(textImageTaskInfoLIZLLL.getFailReason()) || (uri = textImageTaskInfoLIZLLL.getUri()) == null || uri.length() == 0)) {
            z = true;
        }
        this.LLILZIL.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(X.AbstractC558210Lut r6, int r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageChooseListViewModel.vQ2(X.0Lut, int, java.lang.String):void");
    }
}

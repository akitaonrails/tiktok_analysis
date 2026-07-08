package com.ss.android.ugc.aweme.feed.assem.tns.statecontrol;

import X.C144100gp;
import X.C710580Ru4;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ScmLabelInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;

/* JADX INFO: loaded from: classes12.dex */
public final class StateControlMediaVM extends FeedBaseViewModel<C144100gp> {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C144100gp(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        String str;
        AVUploadMiscInfoStruct uploadMiscInfoStruct;
        ScmLabelInfo scmLabelInfo;
        String str2;
        AVUploadMiscInfoStruct uploadMiscInfoStruct2;
        ScmLabelInfo scmLabelInfo2;
        boolean zLIZ = C710580Ru4.LIZ(videoItemParams);
        Aweme aweme = videoItemParams.getAweme();
        String str3 = "";
        if (aweme == null || (uploadMiscInfoStruct2 = AwemeExtKt.getUploadMiscInfoStruct(aweme)) == null || (scmLabelInfo2 = uploadMiscInfoStruct2.scmLabelInfo) == null || (str = scmLabelInfo2.content) == null) {
            str = "";
        }
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 != null && (uploadMiscInfoStruct = AwemeExtKt.getUploadMiscInfoStruct(aweme2)) != null && (scmLabelInfo = uploadMiscInfoStruct.scmLabelInfo) != null && (str2 = scmLabelInfo.learnMoreUrl) != null) {
            str3 = str2;
        }
        interfaceC0148002o.getClass();
        return new C144100gp(zLIZ, str, str3);
    }
}

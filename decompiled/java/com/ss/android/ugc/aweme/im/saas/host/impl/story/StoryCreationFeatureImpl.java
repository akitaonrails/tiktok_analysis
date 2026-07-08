package com.ss.android.ugc.aweme.im.saas.host.impl.story;

import X.C13LP;
import X.C2188811AlT;
import X.C461620I8i;
import X.C729510SjV;
import X.C869590Y9l;
import X.C882400YjW;
import X.C882690Yjz;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryCreationFeature;
import com.ss.android.ugc.aweme.social.creation.api.addtostory.IOpenStoryService;
import java.util.List;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;

/* JADX INFO: loaded from: classes15.dex */
public final class StoryCreationFeatureImpl implements StoryCreationFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryCreationFeature
    public final void LIZ(View view, C869590Y9l c869590Y9l) {
        Aweme awemeLJIJ;
        Video video;
        UrlModel cover;
        List<String> urlList;
        String str;
        Aweme awemeLJIILIIL;
        Video video2;
        VideoUrlModel playAddr;
        List<String> urlList2;
        String str2;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickAddToStory() called for message: ");
        sbLIZ.append(c869590Y9l.getMsgId());
        C2188811AlT.LIZIZ(sbLIZ);
        C882690Yjz.LJ("StoryCreationFeatureImpl");
        int msgType = c869590Y9l.getMsgType();
        if (msgType == 1803) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null) {
                awemeLJIILIIL = iMCameraBridgeApiLIZ.LJIILIIL(c869590Y9l, null);
            } else {
                awemeLJIILIIL = null;
            }
            IOpenStoryService iOpenStoryService = (IOpenStoryService) PluggableExtentionKt.pluggableSpi$default(IOpenStoryService.class, false, false, false, 14, null);
            if (iOpenStoryService != null && awemeLJIILIIL != null && (video2 = awemeLJIILIIL.getVideo()) != null && (playAddr = video2.getPlayAddr()) != null && (urlList2 = playAddr.getUrlList()) != null && (str2 = (String) C13LP.LJJJLL(urlList2)) != null) {
                Context context = view.getContext();
                if (context != null) {
                    iOpenStoryService.LIZ(context, new AwS122S1100000_8(awemeLJIILIIL, str2, 0));
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return;
        }
        if (msgType != 1802) {
            return;
        }
        IMCameraBridgeApi.LIZ.getClass();
        IMCameraBridgeApi iMCameraBridgeApiLIZ2 = C461620I8i.LIZ();
        if (iMCameraBridgeApiLIZ2 != null) {
            awemeLJIJ = iMCameraBridgeApiLIZ2.LJIJ(c869590Y9l, null);
        } else {
            awemeLJIJ = null;
        }
        IOpenStoryService iOpenStoryService2 = (IOpenStoryService) PluggableExtentionKt.pluggableSpi$default(IOpenStoryService.class, false, false, false, 14, null);
        if (iOpenStoryService2 == null || awemeLJIJ == null || (video = awemeLJIJ.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
            return;
        }
        Context context2 = view.getContext();
        if (context2 != null) {
            iOpenStoryService2.LIZIZ(context2, new AwS59S1000000_8(str, 0));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryCreationFeature
    public final boolean LIZIZ(Aweme aweme, String str) {
        return C729510SjV.LJJJJL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryCreationFeature
    public final void LIZJ(Aweme aweme, String str) {
        if (aweme != null && C729510SjV.LJJJJL(aweme, str)) {
            aweme.getIsTikTokStory();
        }
    }
}

package com.ss.android.ugc.aweme.music.understanding.api;

import X.C092G;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501290pAd;
import X.InterfaceC1501320pAg;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedString;

/* JADX INFO: loaded from: classes4.dex */
public interface IContentUnderstandingApi {
    @C092G
    @InterfaceC1501320pAg(2)
    @InterfaceC1501290pAd(4)
    @InterfaceC1501170pAR("/aweme/v1/music/recommend/content/understanding/")
    Object uploadForUnderstandingHighPriority(@InterfaceC1501030pAD("content_source") TypedString typedString, @InterfaceC1501030pAD("content_type") TypedString typedString2, @InterfaceC1501030pAD("creation_id") TypedString typedString3, @InterfaceC1501030pAD("file_type") TypedString typedString4, @InterfaceC1501030pAD("frame_file") TypedString typedString5, @InterfaceC1501030pAD("understanding_key") TypedString typedString6, @InterfaceC1501030pAD("frame_file_binary") TypedByteArray typedByteArray, @InterfaceC1501030pAD("local_emb") TypedString typedString7, @InterfaceC1501070pAH("photo_cnt") Integer num, @InterfaceC1501070pAH("video_cnt") Integer num2, @InterfaceC1501070pAH("live_photo_cnt") Integer num3, @InterfaceC1501070pAH("shoot_way") String str, InterfaceC1364105Vn<? super ContentUnderstandingResponse> interfaceC1364105Vn);
}

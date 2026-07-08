package com.ss.android.ugc.aweme.sticker;

import X.C15L9;
import X.C15LG;
import X.C19EG;
import X.C634930OvL;
import android.app.Activity;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import com.ss.android.ugc.gamora.recorder.AddYoursAvatarHelper;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursStickerRecordServiceImpl implements IAddYoursStickerRecordService {
    @Override // com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService
    public final void LIZIZ(long j, Function2 function2) {
        AddYoursAvatarHelper.LIZ(j, function2);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService
    public final C634930OvL LIZ(C19EG c19eg, Aweme aweme, AddYourRecordParam addYourRecordParam) {
        AddYoursStickerStruct addYoursStickerStructCopy;
        AddYoursStickerStruct addYoursStickerStruct = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct != null) {
            addYoursStickerStructCopy = addYoursStickerStruct.copy(addYoursStickerStruct.topicId, addYoursStickerStruct.fromItemId, addYoursStickerStruct.text, addYoursStickerStruct.shootFrom, addYoursStickerStruct.userAvatars, addYoursStickerStruct.videoCount, addYoursStickerStruct.fromQuestion, addYoursStickerStruct.addYoursInvitees, addYoursStickerStruct.viewerInvited, addYoursStickerStruct.timeStamp, addYoursStickerStruct.fontSize, addYoursStickerStruct.eoyCampaign, addYoursStickerStruct.eoyCampaignSchema, addYoursStickerStruct.topicType);
        } else {
            addYoursStickerStructCopy = null;
        }
        C634930OvL c634930OvL = new C634930OvL(c19eg, aweme, addYourRecordParam.copy(addYoursStickerStructCopy, addYourRecordParam.autoEnterStickerEdit, addYourRecordParam.forceLandRecordPage, addYourRecordParam.enterFrom, addYourRecordParam.shootWay, addYourRecordParam.addYoursEnterMethod, addYourRecordParam.followStatus, addYourRecordParam.isFollowAY, addYourRecordParam.isFromQA, addYourRecordParam.fromGroupId, addYourRecordParam.topicId, addYourRecordParam.trendSource, addYourRecordParam.isOperationSet, addYourRecordParam.effectId, addYourRecordParam.musicId, addYourRecordParam.hashTags, addYourRecordParam.landingBack, addYourRecordParam.musicSelectedFrom, addYourRecordParam.completedEvent, addYourRecordParam.fromPhotoMode, addYourRecordParam.addYoursFromGroupContent, addYourRecordParam.sourceOfTrendsAddYoursInVideo, addYourRecordParam.wwaCampaignId, addYourRecordParam.wwaSourcePlatformChannel, addYourRecordParam.wwaBackUrl, addYourRecordParam.wwaShowStoryButton, addYourRecordParam.autoOpenAlbum));
        c634930OvL.LIZLLL = new C15L9((Activity) c19eg, (C15LG) c634930OvL.LJIIJJI, false);
        return c634930OvL;
    }
}

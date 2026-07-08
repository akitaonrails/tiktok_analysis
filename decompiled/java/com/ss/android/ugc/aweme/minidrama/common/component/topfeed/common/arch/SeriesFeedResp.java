package com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch;

import X.C09CT;
import X.EnumC1577000r8k;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.minidrama.common.component.service.MiniDramaLimitedFreePopUpConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFeedResp {
    public final transient int LIZ;

    @C09CT("drama_tab_block_reason")
    public final Integer dramaTabBlockReason;

    @C09CT("drama_tab_block_text")
    public final String dramaTabBlockText;

    @C09CT("awemes")
    public List<? extends Aweme> feedItemList;

    @C09CT("feedback_link")
    public final String feedbackLink;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("landing_tab")
    public EnumC1577000r8k landingTab;

    @C09CT("limited_free_pop_up_config")
    public final MiniDramaLimitedFreePopUpConfig limitedFreePopConfig;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("should_show_limited_free_pop")
    public final Boolean showLimitedFreePop;

    @C09CT("skylight_model")
    public SkylightBlocks skylightBlocks;

    @C09CT("skylight_model_v2")
    public SkylightBlocks skylightBlocksV2;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public static SeriesFeedResp LIZ(SeriesFeedResp seriesFeedResp, List list, Boolean bool, SkylightBlocks skylightBlocks, SkylightBlocks skylightBlocks2, int i) {
        Boolean bool2;
        MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig;
        LogPbBean logPbBean;
        Integer num;
        String str;
        Integer num2;
        String str2;
        String str3;
        int i2;
        SkylightBlocks skylightBlocks3 = skylightBlocks2;
        SkylightBlocks skylightBlocks4 = skylightBlocks;
        Boolean bool3 = bool;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = seriesFeedResp.feedItemList;
        }
        if ((i & 2) != 0) {
            bool3 = seriesFeedResp.hasMore;
        }
        if ((i & 4) != 0) {
            skylightBlocks4 = seriesFeedResp.skylightBlocks;
        }
        EnumC1577000r8k enumC1577000r8k = null;
        if ((i & 8) != 0) {
            bool2 = seriesFeedResp.showLimitedFreePop;
        } else {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            miniDramaLimitedFreePopUpConfig = seriesFeedResp.limitedFreePopConfig;
        } else {
            miniDramaLimitedFreePopUpConfig = null;
        }
        if ((i & 32) != 0) {
            logPbBean = seriesFeedResp.logPb;
        } else {
            logPbBean = null;
        }
        if ((i & 64) != 0) {
            num = seriesFeedResp.statusCode;
        } else {
            num = null;
        }
        if ((i & 128) != 0) {
            str = seriesFeedResp.statusMsg;
        } else {
            str = null;
        }
        if ((i & 256) != 0) {
            num2 = seriesFeedResp.dramaTabBlockReason;
        } else {
            num2 = null;
        }
        if ((i & 512) != 0) {
            str2 = seriesFeedResp.dramaTabBlockText;
        } else {
            str2 = null;
        }
        if ((i & 1024) != 0) {
            str3 = seriesFeedResp.feedbackLink;
        } else {
            str3 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            skylightBlocks3 = seriesFeedResp.skylightBlocksV2;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            enumC1577000r8k = seriesFeedResp.landingTab;
        }
        if ((i & 8192) != 0) {
            i2 = seriesFeedResp.LIZ;
        } else {
            i2 = 0;
        }
        seriesFeedResp.getClass();
        return new SeriesFeedResp(list2, bool3, skylightBlocks4, bool2, miniDramaLimitedFreePopUpConfig, logPbBean, num, str, num2, str2, str3, skylightBlocks3, enumC1577000r8k, i2);
    }

    public SeriesFeedResp(List<? extends Aweme> list, Boolean bool, SkylightBlocks skylightBlocks, Boolean bool2, MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig, LogPbBean logPbBean, Integer num, String str, Integer num2, String str2, String str3, SkylightBlocks skylightBlocks2, EnumC1577000r8k enumC1577000r8k, int i) {
        this.feedItemList = list;
        this.hasMore = bool;
        this.skylightBlocks = skylightBlocks;
        this.showLimitedFreePop = bool2;
        this.limitedFreePopConfig = miniDramaLimitedFreePopUpConfig;
        this.logPb = logPbBean;
        this.statusCode = num;
        this.statusMsg = str;
        this.dramaTabBlockReason = num2;
        this.dramaTabBlockText = str2;
        this.feedbackLink = str3;
        this.skylightBlocksV2 = skylightBlocks2;
        this.landingTab = enumC1577000r8k;
        this.LIZ = i;
    }
}

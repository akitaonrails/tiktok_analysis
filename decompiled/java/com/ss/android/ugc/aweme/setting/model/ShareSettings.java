package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.QuickExternalShareBtnConfig;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import com.ss.android.ugc.aweme.share.ShareCrowd;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.aweme.share.SharePlatformConfig;
import com.ss.android.ugc.aweme.share.SharePlatformLists;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ShareSettings extends BaseResponse {

    @C09CT("command_patterns")
    public List<String> commandPatterns;

    @C09CT("muted_share_platforms")
    public List<String> mutedSharePlatforms;

    @C09CT("press_actions")
    public List<ShareItemOrderBean> pressActionOrderList;

    @C09CT("quick_share_btn_config")
    public QuickExternalShareBtnConfig quickExternalShareBtnConfig;

    @C09CT("share_actions")
    public List<ShareItemOrderBean> shareActionOrderList;

    @C09CT("share_crowds")
    public List<ShareCrowd> shareCrowds;

    @C09CT("share_download_platforms")
    public List<SharePlatform> shareDownloadPlatforms;

    @C09CT("share_entry_platform_lists")
    public SharePlatformLists shareEntryPlatformLists;

    @C09CT("share_gif_platforms")
    public List<SharePlatform> shareGifPlatforms;

    @C09CT("photo_download_share_platforms")
    public SharePlatformConfig sharePhotoDownloadPlatforms;

    @C09CT("share_platforms")
    public List<SharePlatform> sharePlatforms;

    @C09CT("share_platforms_meta")
    public List<ShareChannelInfo> sharePlatformsMeta;
}

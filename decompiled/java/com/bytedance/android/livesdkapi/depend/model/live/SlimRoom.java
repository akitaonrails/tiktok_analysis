package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import X.C19748512Ol;
import X.C495520Jby;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SlimRoom {
    public final int MAIN_HORIZONTAL;

    @C09CT("caption_info")
    public CaptionInfo captionInfo;

    @C09CT("client_version")
    public String clientVersion;

    @C09CT("custom_tab_info")
    public CustomTabInfo customTabInfo;

    @C09CT("ec_live_head_params")
    public ECLiveHeadToLiveRoomParams ecLiveHeadParams;

    @C09CT("ecommerce_room_head_tag")
    public EcommerceRoomHeadTag ecommerceRoomHeadTag;

    @C09CT("enlarge_view_info")
    public EnlargeViewInfo enlargeViewInfo;

    @C09CT("has_commerce_goods")
    public boolean hasCommerceGoods;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("live_type_screenshot")
    public boolean isScreenshot;

    @C09CT("live_type_third_party")
    public boolean isThirdParty;

    @C09CT("common_label_list")
    public String labels;

    @C09CT("layout")
    public long layout;

    @C09CT("link_mic")
    public LinkMic linkMic;

    @C09CT("live_room_mode")
    public int liveRoomMode;

    @C09CT("live_type_audio")
    public boolean liveTypeAudio;

    @C09CT("log_id")
    public String logId;

    @C09CT("mask_layer")
    public MaskLayer maskLayer;

    @C09CT("multi_stream_id")
    public long multiStreamId;

    @C09CT("multi_stream_scene")
    public long multiStreamScene;

    @C09CT("multi_stream_source")
    public long multiStreamSource;

    @C09CT("multi_stream_url")
    public StreamUrl multiStreamUrl;
    public String optionsSting;

    @C09CT("orientation")
    public int orientation;

    @C09CT("owner")
    public User owner;

    @C09CT("owner_user_id")
    public long ownerUserId;

    @C09CT("os_type")
    public int platform;

    @C09CT("private_info")
    public String privateInfo;

    @C09CT("room_auth")
    public RoomAuthStatus roomAuthStatus;

    @C09CT("room_layout")
    public long roomLayout;

    @C09CT("fyp_skylight_avatar_refresh")
    public int skylightAvatarRefresh;

    @C09CT("stream_url")
    public StreamUrl streamUrl;

    @C09CT("taxonomy_tag_info")
    public TaxonomyTagInfo taxonomyTagInfo;

    @C09CT("title")
    public String title;

    @C09CT("warning_tag")
    public WarningTag warningTag;

    @C09CT("multi_stream_id_str")
    public String multiStreamIdStr = "";
    public long clientAcceptanceTime = -1;

    /* JADX INFO: loaded from: classes34.dex */
    public static class LinkMic {

        @C09CT("audience_id_list")
        public List<Long> audienceIdList;

        @C09CT("followed_count")
        public int followedCount;

        @C09CT("show_user_list")
        public List<User> followedList;
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static class RoomAuthStatus {

        @C09CT("CommercePermission")
        public int commercePermission;
    }

    public String buildExtraSreamPullUrl() {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        String str = streamUrl.qualityMap.get(streamUrl.LJ);
        if (str == null) {
            return null;
        }
        C495520Jby c495520Jby = new C495520Jby(str);
        c495520Jby.LIZ(this.platform, "anchor_device_platform");
        c495520Jby.LIZJ("anchor_version", this.clientVersion);
        c495520Jby.LIZIZ(this.id, "room_id");
        c495520Jby.LIZIZ(this.ownerUserId, "anchor_id");
        return c495520Jby.LIZLLL();
    }

    public String buildPullUrl() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return buildPullUrl(streamUrl.LJ);
    }

    public boolean forcedLowLatency() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        return (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null || this.streamUrl.liveCoreSDKData.getPullData().getOptions() == null || !this.streamUrl.liveCoreSDKData.getPullData().getOptions().forcedLowLatency) ? false : true;
    }

    public String getExtraSdkParams() {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        return getExtraSdkParams(streamUrl.LJ);
    }

    public String getExtraStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getExtraStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public StreamUrlExtra getExtraStreamUrlExtra() {
        StreamUrlExtra streamUrlExtra;
        StreamUrl streamUrl = this.multiStreamUrl;
        return (streamUrl == null || (streamUrlExtra = streamUrl.extra) == null) ? new StreamUrlExtra() : streamUrlExtra;
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public Map<String, String> getMultiStreamLogParams() {
        String str;
        HashMap map = new HashMap();
        if (this.multiStreamScene != 1) {
            map.put("is_multi_stream_room", CardStruct.IStatusCode.DEFAULT);
            map.put("main_stream_orientation", "portrait");
            return map;
        }
        map.put("is_multi_stream_room", "1");
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (str = streamUrl.idStr) == null) {
            str = "";
        }
        map.put("multi_stream_id", str);
        if (isMainStreamHorizontal()) {
            map.put("main_stream_orientation", "landscape");
            return map;
        }
        map.put("main_stream_orientation", "portrait");
        return map;
    }

    public String getOptions() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null || this.streamUrl.liveCoreSDKData.getPullData().getOptions() == null) {
            return null;
        }
        if (TextUtils.isEmpty(this.optionsSting)) {
            this.optionsSting = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, this.streamUrl.liveCoreSDKData.getPullData().getOptions());
        }
        return this.optionsSting;
    }

    public String getSdkParams() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return getSdkParams(streamUrl.LJ);
    }

    public LiveMode getStreamType() {
        return this.layout == 1 ? LiveMode.OFFICIAL_ACTIVITY : this.isScreenshot ? LiveMode.SCREEN_RECORD : this.isThirdParty ? LiveMode.THIRD_PARTY : this.liveTypeAudio ? LiveMode.AUDIO : this.liveRoomMode == 7 ? LiveMode.LIVE_VOICE : LiveMode.VIDEO;
    }

    public StreamUrlExtra getStreamUrlExtra() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.extra;
    }

    public void init() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            streamUrl.LJIIIIZZ();
            StreamUrl streamUrl2 = this.streamUrl;
            if (streamUrl2.liveCoreSDKData != null) {
                streamUrl2.LJII();
            }
        }
        StreamUrl streamUrl3 = this.multiStreamUrl;
        if (streamUrl3 != null) {
            streamUrl3.LJIIIIZZ();
            StreamUrl streamUrl4 = this.multiStreamUrl;
            if (streamUrl4.liveCoreSDKData != null) {
                streamUrl4.LJII();
            }
        }
    }

    public boolean isMainStreamHorizontal() {
        return 1 == this.multiStreamScene && 0 == this.multiStreamSource;
    }

    public StreamUrlExtra getStreamUrlExtraSafely() {
        StreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        return streamUrlExtra == null ? new StreamUrlExtra() : streamUrlExtra;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public long getId() {
        return this.id;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLayout() {
        return this.layout;
    }

    public LinkMic getLinkMic() {
        return this.linkMic;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public int getSkylightAvatarRefresh() {
        return this.skylightAvatarRefresh;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public boolean isLiveTypeScreenshot() {
        return this.isScreenshot;
    }

    public String buildPullUrl(String str) {
        String str2;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (str2 = streamUrl.qualityMap.get(str)) == null) {
            return null;
        }
        C495520Jby c495520Jby = new C495520Jby(str2);
        c495520Jby.LIZ(this.platform, "anchor_device_platform");
        c495520Jby.LIZJ("anchor_version", this.clientVersion);
        c495520Jby.LIZIZ(this.id, "room_id");
        c495520Jby.LIZIZ(this.ownerUserId, "anchor_id");
        return c495520Jby.LIZLLL();
    }

    public String getExtraSdkParams(String str) {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.sdkParamsMap.get(str);
    }

    public String getSdkParams(String str) {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.sdkParamsMap.get(str);
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLayout(long j) {
        this.layout = j;
    }

    public void setLinkMic(LinkMic linkMic) {
        this.linkMic = linkMic;
    }

    public void setLiveTypeScreenshot(boolean z) {
        this.isScreenshot = z;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setStreamUrl(StreamUrl streamUrl) {
        this.streamUrl = streamUrl;
    }
}

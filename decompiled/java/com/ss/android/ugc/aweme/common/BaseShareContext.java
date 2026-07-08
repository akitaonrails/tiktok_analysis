package com.ss.android.ugc.aweme.common;

import X.C09C2;
import X.C09CT;
import X.C2188811AlT;
import X.C2401009ay;
import X.C569050MTn;
import X.C786410Ut5;
import X.EnumC569040MTm;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStoryAnchorStruct;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public abstract class BaseShareContext implements Serializable {

    @C09CT("attributionLinkStickerStruct")
    public AttributionLinkStickerStruct attributionLinkStickerStruct;

    @C09CT("attributionLinkStoryAnchorStruct")
    public AttributionLinkStoryAnchorStruct attributionLinkStoryAnchorStruct;

    @C09CT("callerLocalEntry")
    public String callerLocalEntry;

    @C09CT("creativeInitModelJson")
    public String creativeInitModelJson;

    @C09CT("extraET")
    public Map<String, String> extraET;

    @C09CT("isLinkShare")
    public boolean isLinkShare;

    @C09CT("linkShareSettings")
    public LinkShareSettings linkShareSettings;

    @C09CT("mAnchorInfo")
    public String mAnchorInfo;

    @C09CT("mAnchorSourceType")
    public String mAnchorSourceType;

    @C09CT("mAppName")
    public String mAppName;

    @C09CT("mApplyEffectResourceId")
    public String mApplyEffectResourceId;

    @C09CT("mCallerPackage")
    public String mCallerPackage;

    @C09CT("mChallengeName")
    public String mChallengeName;

    @C09CT("mClientKey")
    public String mClientKey;

    @C09CT("mCurrentPage")
    public String mCurrentPage;

    @C09CT("mExtraShareOptions")
    public HashMap<String, Integer> mExtraShareOptions;

    @C09CT("mExtras")
    public String mExtras;

    @C09CT("mHashTags")
    public ArrayList<String> mHashTags;

    @C09CT("mIsFromDraft")
    public boolean mIsFromDraft;

    @C09CT("mMusicContent")
    public MusicContent mMusicContent;

    @C09CT("mNeedShowDialog")
    public boolean mNeedShowDialog;

    @C09CT("mOpenPlatformExtra")
    public String mOpenPlatformExtra;

    @C09CT("mPublishSettings")
    public PublishSettings mPublishSettings;

    @C09CT("mSdkName")
    public String mSdkName;

    @C09CT("mSdkVersion")
    public String mSdkVersion;

    @C09CT("mShareFormat")
    public EnumC569040MTm mShareFormat;

    @C09CT("mShareKitPanel")
    public ShareKitPanel mShareKitPanel;

    @C09CT("mShareMediaType")
    public int mShareMediaType;

    @C09CT("mShareModel")
    public BaseShareContext mShareModel;

    @C09CT("mSharePanelOption")
    public String mSharePanelOption;

    @C09CT("mState")
    public String mState;

    @C09CT("mTargetSceneType")
    public int mTargetSceneType;

    @C09CT("oldHashTag")
    public String oldHashTag;

    @C09CT("photoMode")
    public boolean photoMode;

    @C09CT("requestId")
    public String requestId;

    public Bundle getShareRequestBundle() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry, bundle);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_caller_package", this.mCallerPackage, bundle);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_client_key", this.mClientKey, bundle);
        C786410Ut5.LJJJI("_aweme_params_caller_open_sdk_name", this.mSdkName, bundle);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_state", this.mState, bundle);
        C786410Ut5.LJJJIL(bundle, "_aweme_open_sdk_params_hashtag_list", this.mHashTags);
        bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
        C786410Ut5.LJJJI("_aweme_open_sdk_params_anchor_info", this.mAnchorInfo, bundle);
        C786410Ut5.LJJJI("extra", this.mOpenPlatformExtra, bundle);
        C786410Ut5.LJJJI("anchor_source_type", this.mAnchorSourceType, bundle);
        C786410Ut5.LJJIZ(bundle, "_aweme_open_sdk_extra_share_options", this.mExtraShareOptions);
        C786410Ut5.LJJIZ(bundle, "publish_settings", this.mPublishSettings);
        C786410Ut5.LJJJI("_aweme_apply_effect_resource_id", this.mApplyEffectResourceId, bundle);
        C786410Ut5.LJJJI("_aweme_share_panel_option", this.mSharePanelOption, bundle);
        bundle.putInt("_aweme_share_media_type", this.mShareMediaType);
        EnumC569040MTm enumC569040MTm = this.mShareFormat;
        if (enumC569040MTm != null) {
            bundle.putInt("_aweme_open_sdk_params_share_format", enumC569040MTm.getValue());
        }
        C786410Ut5.LJJIJL(bundle, "share_kit_panel", this.mShareKitPanel);
        C786410Ut5.LJJIZ(bundle, "share_model", this.mShareModel);
        C786410Ut5.LJJJI("creative_initial_model", this.creativeInitModelJson, bundle);
        bundle.putBoolean("photo_mode", this.photoMode);
        bundle.putBoolean("is_link_share", this.isLinkShare);
        C786410Ut5.LJJIZ(bundle, "link_share_settings", this.linkShareSettings);
        C786410Ut5.LJJIZ(bundle, "request_id", this.requestId);
        C786410Ut5.LJJIZ(bundle, "attribution_link_sticker_struct", this.attributionLinkStickerStruct);
        String str = this.mExtras;
        if (str != null && !str.isEmpty()) {
            Bundle bundle2 = new Bundle();
            try {
                String str2 = (String) new JSONObject(this.mExtras).get("style_id");
                if (!str2.isEmpty()) {
                    C786410Ut5.LJJJI("style_id", str2, bundle2);
                }
                C786410Ut5.LJJIIZI(bundle, bundle2, "_bytedance_params_extra");
                return bundle;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return bundle;
    }

    public BaseShareContext() {
        this.mHashTags = new ArrayList<>();
        this.mNeedShowDialog = true;
        this.mTargetSceneType = 0;
        this.mApplyEffectResourceId = null;
        this.mSharePanelOption = "";
        this.mShareMediaType = 0;
    }

    public String getChallengeName() {
        return this.mChallengeName;
    }

    public BaseShareContext(Bundle bundle) {
        this.mHashTags = new ArrayList<>();
        this.mNeedShowDialog = true;
        this.mTargetSceneType = 0;
        this.mApplyEffectResourceId = null;
        this.mSharePanelOption = "";
        this.mShareMediaType = 0;
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mSdkName = bundle.getString("_aweme_params_caller_open_sdk_name");
        this.mSdkVersion = bundle.getString("_aweme_params_caller_open_sdk_version", "");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
        this.oldHashTag = bundle.getString("_aweme_open_sdk_params_target_scene");
        if (bundle.containsKey("_aweme_open_sdk_params_hashtag_list")) {
            this.mHashTags = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
        }
        if (C2401009ay.LIZ(this.mHashTags)) {
            if (!TextUtils.isEmpty(this.oldHashTag)) {
                ArrayList<String> arrayList = new ArrayList<>();
                this.mHashTags = arrayList;
                arrayList.add(this.oldHashTag.trim());
            }
        } else {
            for (int i = 0; i < this.mHashTags.size(); i++) {
                ArrayList<String> arrayList2 = this.mHashTags;
                ListProtector.set(arrayList2, i, ((String) ListProtector.get(arrayList2, i)).trim());
            }
        }
        this.mAnchorInfo = bundle.getString("_aweme_open_sdk_params_anchor_info");
        this.mExtras = LIZ(bundle.getBundle("_bytedance_params_extra"));
        this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene");
        this.mOpenPlatformExtra = bundle.getString("extra");
        this.mAnchorSourceType = bundle.getString("anchor_source_type");
        this.mExtraShareOptions = (HashMap) bundle.getSerializable("_aweme_open_sdk_extra_share_options");
        if (bundle.containsKey("publish_settings")) {
            this.mPublishSettings = (PublishSettings) GsonProtectorUtils.fromJson(C09C2.LIZ(), bundle.getString("publish_settings"), PublishSettings.class);
        }
        this.mApplyEffectResourceId = bundle.getString("_aweme_apply_effect_resource_id");
        this.mSharePanelOption = bundle.getString("_aweme_share_panel_option");
        this.mShareMediaType = bundle.getInt("_aweme_share_media_type");
        int i2 = bundle.getInt("_aweme_open_sdk_params_share_format");
        EnumC569040MTm.Companion.getClass();
        this.mShareFormat = C569050MTn.LIZ(i2);
        this.mShareKitPanel = (ShareKitPanel) bundle.getParcelable("share_kit_panel");
        this.mShareModel = (BaseShareContext) bundle.getSerializable("share_model");
        this.attributionLinkStickerStruct = (AttributionLinkStickerStruct) bundle.getSerializable("attribution_link_sticker_struct");
        if (bundle.containsKey("music_content")) {
            this.mMusicContent = (MusicContent) GsonProtectorUtils.fromJson(C09C2.LIZ(), bundle.getString("music_content"), MusicContent.class);
        }
        try {
            if (this.mExtras != null) {
                this.creativeInitModelJson = new JSONObject(this.mExtras).optString("creative_initial_model");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.photoMode = bundle.getBoolean("photo_mode", false);
        this.isLinkShare = bundle.getBoolean("is_link_share", false);
        this.linkShareSettings = (LinkShareSettings) bundle.getSerializable("link_share_settings");
        this.requestId = bundle.getString("request_id", null);
    }

    public static String LIZ(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, wrap(INVOKEVIRTUAL_com_ss_android_ugc_aweme_common_BaseShareContext_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static String getCreativeInitialModelJson(Bundle bundle) {
        String strOptString = null;
        if (bundle == null) {
            return null;
        }
        try {
            strOptString = new JSONObject(LIZ(bundle.getBundle("_bytedance_params_extra"))).optString("creative_initial_model");
            return strOptString;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }

    public static JSONArray toJSONArray(Object obj) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray.put(wrap(Array.get(obj, i)));
            }
            return jSONArray;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Not a primitive array: ");
        sbLIZ.append(obj.getClass());
        throw new JSONException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Object wrap(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return toJSONArray(obj);
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public void setChallengeName(String str) {
        this.mChallengeName = str;
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_aweme_common_BaseShareContext_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}

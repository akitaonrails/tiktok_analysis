package com.ss.android.ugc.aweme.shortvideo;

import X.C09C2;
import X.C09CT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.ScmLabelInfo;
import com.ss.android.ugc.aweme.feed.model.ShareWarnInfo;
import com.ss.android.ugc.aweme.feed.model.ShareWarnModule;
import com.ss.android.ugc.aweme.feed.model.TnsImInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class AVUploadMiscInfoStruct implements Serializable {

    @C09CT("autocut_template_group_id")
    public String autoCutTemplateGroupId;

    @C09CT("diamond_game_id")
    public String diamondGameId;

    @C09CT("hproject_info")
    public F2ProjectInfo f2ProjectInfo;

    @C09CT("green_screen")
    public int greenScreen;

    @C09CT("koi_fish")
    public int koiFish;

    @C09CT("ktf_info")
    public KtfInfo ktfInfo;

    @C09CT("status_template_id")
    public String mStatusId;

    @C09CT("video_tag")
    public int mVideoTag;

    @C09CT("mv_info")
    public MvModel mvInfo;

    @C09CT("mv_id")
    public String mvThemeId;

    @C09CT("mv_template_type")
    public int mvType;

    @C09CT("ocr_location")
    public String ocrLocation;

    @C09CT("share_warn_info")
    public ShareWarnInfo samShareWarnInfo;

    @C09CT("scm_tag_info")
    public ScmLabelInfo scmLabelInfo;

    @C09CT("share_warn_module")
    public ShareWarnModule shareWarnModule;

    @C09CT("source_id")
    public int sourceId = 1;

    @C09CT("tns_im_info")
    public TnsImInfo tnsImInfo;

    public static class F2ProjectInfo implements Serializable {

        @C09CT("icon_url")
        public UrlModel iconUrl;

        @C09CT("schema_url")
        public String schemaUrl;

        @C09CT("title")
        public String title;
    }

    public OcrLocation getOcrLocation() {
        if (TextUtils.isEmpty(this.ocrLocation)) {
            return null;
        }
        try {
            return (OcrLocation) new Gson().LJII(this.ocrLocation, OcrLocation.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static AVUploadMiscInfoStruct createStruct(String str) {
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct;
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct2 = new AVUploadMiscInfoStruct();
        if (TextUtils.isEmpty(str)) {
            return aVUploadMiscInfoStruct2;
        }
        try {
            aVUploadMiscInfoStruct = (AVUploadMiscInfoStruct) C09C2.LIZ().LJII(str, AVUploadMiscInfoStruct.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (aVUploadMiscInfoStruct != null) {
            return aVUploadMiscInfoStruct;
        }
        return aVUploadMiscInfoStruct2;
    }
}

package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class EffectStruct {

    @C09CT("effect_type")
    public int effectType;

    @C09CT("file_diff")
    public DiffInfo fileDiff;

    @C09CT("file_url")
    public UrlDataStruct fileUrl;

    @C09CT("from_app_id")
    public long fromAppId;

    @C09CT("hint_file")
    public UrlDataStruct hintFile;

    @C09CT("hint_file_format")
    public int hintFileFormat;

    @C09CT("hint_icon")
    public UrlDataStruct hintIcon;

    @C09CT("icon_url")
    public UrlDataStruct iconUrl;

    @C09CT("is_busi")
    public boolean isBusi;

    @C09CT("is_poi")
    public boolean isPoi;

    @C09CT("package_size")
    public long packageSize;

    @C09CT("provider")
    public int provider;

    @C09CT("ptime")
    public long ptime;

    @C09CT("rec_tag")
    public long recTag;

    @C09CT("source")
    public int source;

    @C09CT("template_effect_extra")
    public TemplateEffectExtra templateEffectExtra;

    @C09CT("trans_file_url")
    public UrlDataStruct transFileUrl;

    @C09CT("use_number")
    public long useNumber;

    @C09CT("name")
    public String name = "";

    @C09CT("hint")
    public String hint = "";

    @C09CT("sdk_version")
    public String sdkVersion = "";

    @C09CT("app_version")
    public String appVersion = "";

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("effect_id")
    public String effectId = "";

    @C09CT("device_platform")
    public String devicePlatform = "";

    @C09CT("types")
    public List<String> types = new ArrayList();

    @C09CT("tags")
    public List<String> tags = new ArrayList();

    @C09CT("tags_updated_at")
    public String tagsUpdatedAt = "";

    @C09CT("parent")
    public String parent = "";

    @C09CT("children")
    public List<String> children = new ArrayList();

    @C09CT("music")
    public List<String> music = new ArrayList();

    @C09CT("designer_id")
    public String designerId = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("requirements")
    public List<String> requirements = new ArrayList();

    @C09CT("extra")
    public String extra = "";

    @C09CT("designer_encrypted_id")
    public String designerEncryptedId = "";

    @C09CT("sdk_extra")
    public String sdkExtra = "";

    @C09CT("resource_id")
    public String resourceId = "";

    @C09CT("ad_raw_data")
    public String adRawData = "";

    @C09CT("bind_ids")
    public List<String> bindIds = new ArrayList();

    @C09CT("grade_key")
    public String gradeKey = "";

    @C09CT("composer_params")
    public String composerParams = "";

    @C09CT("types_sec")
    public List<String> typesSec = new ArrayList();

    @C09CT("requirements_sec")
    public List<String> requirementsSec = new ArrayList();

    @C09CT("panel")
    public String panel = "";

    @C09CT("model_names")
    public String modelNames = "";

    @C09CT("model_names_sec")
    public String modelNamesSec = "";

    @C09CT("poi_id")
    public String poiId = "";

    @C09CT("challenge")
    public List<String> challenge = new ArrayList();

    @C09CT("system_list")
    public List<String> systemList = new ArrayList();

    @C09CT("original_effect_id")
    public String originalEffectId = "";

    @C09CT("template_effect_id")
    public String templateEffectId = "";
}

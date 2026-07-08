package com.ss.android.ugc.effectmanager.effect.model;

import X.C0XRT;
import X.C13BV;
import X.C13LP;
import X.C13S0;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C296620Bjw;
import com.ss.android.ugc.effectmanager.common.model.BaseInfo;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetUtilsKt {
    public static final String buildAssetMaterialResourceKey(Asset asset) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asset_");
        sbLIZ.append(asset.getAsset_type());
        sbLIZ.append('_');
        sbLIZ.append(asset.getAsset_id());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String buildAssetMaterialResourceTypeTag(Asset asset) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asset_");
        sbLIZ.append(asset.getAsset_type());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Asset convertToAsset(Effect effect) {
        List listSingletonList;
        boolean zLIZ = C296620Bjw.LIZ();
        List listSingletonList2 = null;
        String str = null;
        CoverInfo coverInfo = new CoverInfo(null, null, null, null, null);
        List listSingletonList3 = null;
        FileInf fileInf = new FileInf(effect.getFileUrl().getUri(), null, null, effect.getFileUrl().getUrlList(), null);
        Icon icon = new Icon(effect.getIconUrl().getUri(), null, null, effect.getIconUrl().getUrlList());
        String effectId = effect.getEffectId();
        int value = AssetType.EFFECT_INHOUSE.getValue();
        int value2 = AssetParentType.EFFECT.getValue();
        int value3 = AssetConsumerType.EDIT_EFFECT.getValue();
        String resource_id = effect.getResource_id();
        String name = effect.getName();
        Author author = new Author(effect.getDesigner_id(), null, null, null);
        if (zLIZ) {
            listSingletonList2 = Collections.singletonList(fileInf);
            listSingletonList3 = Collections.singletonList(coverInfo);
            listSingletonList = Collections.singletonList(icon);
        } else {
            listSingletonList = null;
        }
        String device_platform = effect.getDevice_platform();
        String tags_updated_at = effect.getTags_updated_at();
        String parent = effect.getParent();
        List<String> children = effect.getChildren();
        int effect_type = effect.getEffect_type();
        List<String> music = effect.getMusic();
        if (music != null) {
            str = (String) C13LP.LJJJLZIJ(0, music);
        }
        int source = effect.getSource();
        int from_source = effect.getFrom_source();
        boolean zIs_busi = effect.is_busi();
        String designer_encrypted_id = effect.getDesigner_encrypted_id();
        String sdkExtra = effect.getSdkExtra();
        String ad_raw_data = effect.getAd_raw_data();
        List<String> bind_ids = effect.getBind_ids();
        long ptime = effect.getPtime();
        List<String> types_sec = effect.getTypes_sec();
        String model_names_sec = effect.getModel_names_sec();
        UrlModel trans_file_url = effect.getTrans_file_url();
        DiffEffect file_diff = effect.getFile_diff();
        TemplateEffectExtra template_effect_extra = effect.getTemplate_effect_extra();
        String unzipPath = effect.getUnzipPath();
        String zipPath = effect.getZipPath();
        long package_size = effect.getPackage_size();
        String panel = effect.getPanel();
        String transResPath = effect.getTransResPath();
        BusinessExtra businessExtra = new BusinessExtra(null, null, null, null, null, "", "", null, null, null, effect.getHint(), effect.getHint_icon(), null, device_platform, tags_updated_at, parent, children, Integer.valueOf(effect_type), Integer.valueOf(source), Integer.valueOf(from_source), "", types_sec, effect.getRequirements_sec(), Boolean.valueOf(zIs_busi), designer_encrypted_id, sdkExtra, ad_raw_data, bind_ids, Long.valueOf(ptime), null, model_names_sec, trans_file_url, file_diff, Long.valueOf(package_size), template_effect_extra, effect.getId(), unzipPath, zipPath, panel, transResPath, null, null, str, "", false, null, null, null, null, null, null, null, null, null, null, null, false, null, Boolean.FALSE, null, null, null, null, null, null, "", null, null, null, null, null, null);
        List<String> tags = effect.getTags();
        if (tags == null) {
            tags = C13BV.INSTANCE;
        }
        String extra = effect.getExtra();
        if (extra == null) {
            extra = "";
        }
        return new Asset(effectId, value2, value3, value, resource_id, name, "", author, fileInf, listSingletonList2, coverInfo, listSingletonList3, icon, listSingletonList, businessExtra, tags, extra, "", null, effect.getFrom_source());
    }

    public static final MaterialResource convertToMaterialResource(Asset asset) {
        boolean zLJFF;
        long jLongValue;
        Long lLJIILIIL;
        FileInf fileInfEffectiveDownloadFile = effectiveDownloadFile(asset);
        String strResolveMaterialResourceExt = resolveMaterialResourceExt(fileInfEffectiveDownloadFile);
        String strBuildAssetMaterialResourceTypeTag = buildAssetMaterialResourceTypeTag(asset);
        FileInfExtra extra = fileInfEffectiveDownloadFile.getExtra();
        if (extra != null) {
            zLJFF = Intrinsics.LJFF(extra.getSkip_verify_md5(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        String strBuildAssetMaterialResourceKey = buildAssetMaterialResourceKey(asset);
        List<String> url_list = fileInfEffectiveDownloadFile.getUrl_list();
        if (url_list == null) {
            url_list = C13BV.INSTANCE;
        }
        String uri = fileInfEffectiveDownloadFile.getUri();
        if (uri == null) {
            uri = "";
        }
        String strBuildAssetMaterialResourceUri = buildAssetMaterialResourceUri(uri, asset.getResource_id(), zLJFF);
        String file_size = fileInfEffectiveDownloadFile.getFile_size();
        if (file_size != null && (lLJIILIIL = C2095008Iq.LJIILIIL(file_size)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        return new MaterialResource(strBuildAssetMaterialResourceKey, url_list, strBuildAssetMaterialResourceUri, new BaseInfo(strResolveMaterialResourceExt, jLongValue, null, null, null), 0, strBuildAssetMaterialResourceTypeTag, true, zLJFF, Integer.valueOf(asset.getAsset_type()));
    }

    public static final FileInf effectiveDownloadFile(Asset asset) {
        FileInf fileInf;
        if (asset.getAsset_type() != AssetType.BASEIMAGE.getValue() && asset.getAsset_type() != AssetType.BASEVIDEO.getValue() && !C296620Bjw.LIZ()) {
            return asset.getFile();
        }
        List<FileInf> package_list = asset.getPackage_list();
        if (package_list != null && (fileInf = (FileInf) C13LP.LJJJLL(package_list)) != null) {
            return fileInf;
        }
        return asset.getFile();
    }

    public static final String resolveMaterialResourceExt(FileInf fileInf) {
        String file_ext;
        String string;
        String strLJJJJZ;
        String lowerCase;
        String string2;
        String file_type = fileInf.getFile_type();
        String lowerCase2 = null;
        if (file_type != null && (string2 = a0.LJLIIIL(file_type).toString()) != null) {
            lowerCase2 = string2.toLowerCase(Locale.ROOT);
        }
        if (lowerCase2 == null) {
            lowerCase2 = "";
        }
        if (Intrinsics.LJFF(lowerCase2, "zip")) {
            return "zip";
        }
        FileInfExtra extra = fileInf.getExtra();
        if (extra == null || (file_ext = extra.getFile_ext()) == null || (string = a0.LJLIIIL(file_ext).toString()) == null || (strLJJJJZ = a0.LJJJJZ(e3.d, string)) == null || (lowerCase = strLJJJJZ.toLowerCase(Locale.ROOT)) == null) {
            return "";
        }
        return lowerCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.effectmanager.effect.model.Effect convertAssetToEffect(com.ss.android.ugc.effectmanager.effect.model.Asset r79, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.String> r80) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.AssetUtilsKt.convertAssetToEffect(com.ss.android.ugc.effectmanager.effect.model.Asset, kotlin.jvm.functions.Function2):com.ss.android.ugc.effectmanager.effect.model.Effect");
    }

    public static final String buildAssetMaterialResourceUri(String str, String str2, boolean z) {
        if (z && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("#rk=");
            sbLIZ.append(str2);
            return C0XRT.LIZ(C13S0.LIZ(C2188811AlT.LIZIZ(sbLIZ).getBytes(Charsets.UTF_8)));
        }
        return str;
    }
}

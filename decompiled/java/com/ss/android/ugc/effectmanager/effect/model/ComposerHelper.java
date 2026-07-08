package com.ss.android.ugc.effectmanager.effect.model;

import X.C2188811AlT;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public class ComposerHelper {
    public static List<String> serverURLs = new ArrayList();

    public static List<String> getServerUrls() {
        return serverURLs;
    }

    public static void setServerUrls(List<String> list) {
        serverURLs = list;
    }

    public static int versionCompare(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length && strArrSplit[i].equals(strArrSplit2[i])) {
            i++;
        }
        if (i < strArrSplit.length && i < strArrSplit2.length) {
            return Integer.signum(CastIntegerProtector.valueOf(strArrSplit[i]).compareTo(CastIntegerProtector.valueOf(strArrSplit2[i])));
        }
        return Integer.signum(strArrSplit.length - strArrSplit2.length);
    }

    public static ComposerNode parseComposerMaterial(String str, String str2, String str3) {
        FileUtils fileUtils = FileUtils.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        String str4 = File.separator;
        sbLIZ.append(str4);
        sbLIZ.append("config.json");
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(new JSONObject(fileUtils.getFileContent(C2188811AlT.LIZIZ(sbLIZ))), "effect"), "Link");
            if (jSONArray.length() <= 0) {
                return null;
            }
            String string = JSONObjectProtectorUtils.getString(JSONArrayProtectorUtils.getJSONObject(jSONArray, 0), "path");
            if (!JSONObjectProtectorUtils.getString(JSONArrayProtectorUtils.getJSONObject(jSONArray, 0), "type").toLowerCase().equals("composer")) {
                return null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str4);
            sbLIZ2.append(string);
            sbLIZ2.append("content.json");
            JSONObject jSONObject = new JSONObject(fileUtils.getFileContent(C2188811AlT.LIZIZ(sbLIZ2)));
            ComposerNode composerNode = new ComposerNode();
            composerNode.tag_name = "root";
            composerNode.UI_name = "Composer";
            composerNode.type = 4;
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "content");
            composerNode.children = new ArrayList();
            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "nodes");
            for (int i = 0; i < jSONArray2.length(); i++) {
                ComposerNode composerNode2 = parseComposerNode(JSONArrayProtectorUtils.getJSONObject(jSONArray2, i), str2, str3);
                if (composerNode2 != null) {
                    composerNode2.parent = composerNode;
                }
                composerNode.children.add(composerNode2);
            }
            return composerNode;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static ComposerNode parseComposerNode(JSONObject jSONObject, String str, String str2) {
        try {
            ComposerNode composerNode = new ComposerNode();
            composerNode.type = JSONObjectProtectorUtils.getInt(jSONObject, "type");
            composerNode.file = jSONObject.optString("file", "");
            if (!CollectionUtil.isListEmpty(getServerUrls())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(getServerUrls().get(0));
                sbLIZ.append(jSONObject.optString("icon", null));
                composerNode.icon = C2188811AlT.LIZIZ(sbLIZ);
                composerNode.UI_name = jSONObject.optString("UI_name", null);
                composerNode.tag_name = JSONObjectProtectorUtils.getString(jSONObject, "tag_name");
                composerNode.default_value = (float) jSONObject.optDouble("default_value", 0.0d);
                composerNode.min_value = (float) jSONObject.optDouble("min_value", 0.0d);
                composerNode.max_value = (float) jSONObject.optDouble("max_value", 0.0d);
                composerNode.switch_mode = jSONObject.optInt("switch_mode", 0);
                if (jSONObject.has("nodes")) {
                    composerNode.children = new ArrayList();
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "nodes");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        ComposerNode composerNode2 = parseComposerNode(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), str, str2);
                        if (composerNode2 != null) {
                            composerNode2.parent = composerNode;
                            composerNode.children.add(composerNode2);
                        }
                    }
                    if (composerNode.children.size() == 0 || (composerNode.children.size() == 1 && composerNode.children.get(0).type == -1)) {
                        return null;
                    }
                } else {
                    List<String> serverUrls = getServerUrls();
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : serverUrls) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str3);
                        sbLIZ2.append(composerNode.file);
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(arrayList);
                    urlModel.setUri(composerNode.file);
                    Effect effect = new Effect();
                    effect.setFileUrl(urlModel);
                    effect.setId(composerNode.file);
                    effect.setEffectId(composerNode.file);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str2);
                    String str4 = File.separator;
                    sbLIZ3.append(str4);
                    sbLIZ3.append(effect.getId());
                    sbLIZ3.append(".zip");
                    effect.setZipPath(C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str2);
                    sbLIZ4.append(str4);
                    sbLIZ4.append(effect.getId());
                    effect.setUnzipPath(C2188811AlT.LIZIZ(sbLIZ4));
                    composerNode.effect = effect;
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra_info");
                    String strOptString = CardStruct.IStatusCode.DEFAULT;
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("version", CardStruct.IStatusCode.DEFAULT);
                    }
                    if (versionCompare(str, strOptString) < 0) {
                        return null;
                    }
                }
                return composerNode;
            }
            throw new IllegalArgumentException("serverURLs list is empty, call setServerUrls first.");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

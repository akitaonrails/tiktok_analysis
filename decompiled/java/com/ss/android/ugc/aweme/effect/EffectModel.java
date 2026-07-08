package com.ss.android.ugc.aweme.effect;

import X.C09CT;
import X.C19837412jU;
import X.C20012313Rx;
import X.C201955140j;
import X.C2188811AlT;
import X.EnumC1429610nJ1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class EffectModel implements Serializable {

    @C09CT("adjust_params")
    public String adjustParams;

    @C09CT("category")
    public String category;

    @C09CT("challenge")
    public String challenge;

    @C09CT("color")
    public int color;

    @C09CT("designer_encrypted_id")
    public String designerEncryptedId;

    @C09CT("designer_id")
    public String designerId;

    @C09CT("duration")
    public int duration;

    @C09CT("entrance_point")
    public String entrancePoint;

    @C09CT("extra")
    public String extra;

    @C09CT("gameplay_algorithm")
    public String gameplayAlgorithm;

    @C09CT("hint")
    public String hint;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("image_path")
    public int imagePath;

    @C09CT("index")
    public int index;

    @C09CT("key")
    public String key;

    @C09CT("name")
    public String name;

    @C09CT("recommend_reason")
    public String recommendReason;

    @C09CT("recommend_rule_tags")
    public String recommendRuleTags;

    @C09CT("res_dir")
    public String resDir;

    @C09CT("res_id")
    public String resId;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT("select_from")
    public String selectFrom;

    @C09CT("source")
    public int source;

    @C09CT("tags")
    public List<String> tags;

    @C09CT("type")
    public int type;

    @C09CT("video_anim_type")
    public String videoAnimType;

    @C09CT("is_new_engine_effect")
    public Boolean isNewEngineEffect = Boolean.FALSE;

    @C09CT("is_go_to_cap_cut_effect")
    public boolean isGoToCapCutEffect = false;

    @C09CT("is_enabled")
    public boolean isEnabled = true;

    @C09CT("is_from_edit_pro")
    public boolean isFromEditPro = false;

    @C09CT("video_anim_default_duration")
    public double videoAnimDefaultDuration = 0.0d;

    @C09CT("file_url")
    public String fileUrl = "";

    @C09CT("search_model")
    public EffectSearchModel searchModel = null;

    public Boolean hasRealDuration() {
        List<String> list = this.tags;
        if (list == null) {
            return Boolean.FALSE;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().contains("duration:")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name, this.hint, Integer.valueOf(this.imagePath), this.key, Integer.valueOf(this.type), this.iconUrl, this.resDir, Integer.valueOf(this.color), Integer.valueOf(this.duration), Integer.valueOf(this.index), this.category, this.extra, this.tags, Boolean.valueOf(this.isEnabled), this.resourceId, this.selectFrom, this.challenge, Boolean.valueOf(this.isFromEditPro), this.videoAnimType, Double.valueOf(this.videoAnimDefaultDuration)});
    }

    public Boolean isClientEffect() {
        try {
            String str = this.extra;
            return (str == null || str.isEmpty()) ? Boolean.FALSE : Boolean.valueOf(new JSONObject(this.extra).optString("game_play_type", "").equals(EnumC1429610nJ1.EDIT_EFFECT_CLIENT.getType()));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isClientEffect :: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIIIIZZ(c20012313Rx, "EffectModel", C2188811AlT.LIZIZ(sbLIZ));
            return Boolean.FALSE;
        }
    }

    public Boolean isCombinedEffect() {
        try {
            String str = this.extra;
            return (str == null || str.isEmpty()) ? Boolean.FALSE : Boolean.valueOf(new JSONObject(this.extra).optString("game_play_type", "").equals(EnumC1429610nJ1.EDIT_EFFECT_COMBINED.getType()));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isMixedEffect :: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIIIIZZ(c20012313Rx, "EffectModel", C2188811AlT.LIZIZ(sbLIZ));
            return Boolean.FALSE;
        }
    }

    public Boolean isServerEffect() {
        try {
            String str = this.extra;
            return (str == null || str.isEmpty()) ? Boolean.FALSE : Boolean.valueOf(new JSONObject(this.extra).optString("game_play_type", "").equals(EnumC1429610nJ1.EDIT_EFFECT_SERVER.getType()));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isServerEffect :: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIIIIZZ(c20012313Rx, "EffectModel", C2188811AlT.LIZIZ(sbLIZ));
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean isVideoAnimEffect() {
        /*
            r5 = this;
            java.lang.String r0 = r5.extra     // Catch: org.json.JSONException -> L5d
            if (r0 == 0) goto L5a
            boolean r0 = r0.isEmpty()     // Catch: org.json.JSONException -> L5d
            if (r0 != 0) goto L5a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5d
            java.lang.String r0 = r5.extra     // Catch: org.json.JSONException -> L5d
            r2.<init>(r0)     // Catch: org.json.JSONException -> L5d
            java.lang.String r1 = "video_anim_type"
            java.lang.String r0 = ""
            java.lang.String r4 = r2.optString(r1, r0)     // Catch: org.json.JSONException -> L5d
            int r3 = r4.hashCode()     // Catch: org.json.JSONException -> L5d
            r0 = -510575962(0xffffffffe1913aa6, float:-3.348755E20)
            r2 = 2
            r1 = 1
            if (r3 == r0) goto L41
            r0 = 41552559(0x27a0aaf, float:1.8370165E-37)
            if (r3 == r0) goto L37
            r0 = 1307747558(0x4df2a4e6, float:5.0886163E8)
            if (r3 != r0) goto L4b
            java.lang.String r0 = "out_video_anim"
            boolean r0 = r4.equals(r0)     // Catch: org.json.JSONException -> L5d
            if (r0 == 0) goto L4b
            goto L4d
        L37:
            java.lang.String r0 = "in_video_anim"
            boolean r0 = r4.equals(r0)     // Catch: org.json.JSONException -> L5d
            if (r0 == 0) goto L4b
            r0 = 0
            goto L4e
        L41:
            java.lang.String r0 = "combo_video_anim"
            boolean r0 = r4.equals(r0)     // Catch: org.json.JSONException -> L5d
            if (r0 == 0) goto L4b
            r0 = 2
            goto L4e
        L4b:
            r0 = -1
            goto L4e
        L4d:
            r0 = 1
        L4e:
            if (r0 == 0) goto L57
            if (r0 == r1) goto L57
            if (r0 == r2) goto L57
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: org.json.JSONException -> L5d
            return r0
        L57:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: org.json.JSONException -> L5d
            return r0
        L5a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: org.json.JSONException -> L5d
            return r0
        L5d:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.13Rx r2 = X.C20012313Rx.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isVideoAnimeEffect :: "
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "EffectModel"
            X.C201955140j.LJIIIIZZ(r2, r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.EffectModel.isVideoAnimEffect():java.lang.Boolean");
    }

    public Boolean isServerOrCombinedEffect() {
        return Boolean.valueOf(isServerEffect().booleanValue() || isCombinedEffect().booleanValue());
    }

    public Boolean isTrickEffect() {
        return Boolean.valueOf(isCombinedEffect().booleanValue() || isClientEffect().booleanValue() || isServerEffect().booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EffectModel effectModel = (EffectModel) obj;
        if (this.imagePath == effectModel.imagePath && this.type == effectModel.type && this.color == effectModel.color && this.duration == effectModel.duration && this.index == effectModel.index && this.isEnabled == effectModel.isEnabled && C19837412jU.LIZ(this.name, effectModel.name) && C19837412jU.LIZ(this.hint, effectModel.hint) && C19837412jU.LIZ(this.key, effectModel.key) && C19837412jU.LIZ(this.resId, effectModel.resId) && C19837412jU.LIZ(this.iconUrl, effectModel.iconUrl) && C19837412jU.LIZ(this.resDir, effectModel.resDir) && C19837412jU.LIZ(this.category, effectModel.category) && C19837412jU.LIZ(this.extra, effectModel.extra) && C19837412jU.LIZ(this.tags, effectModel.tags) && C19837412jU.LIZ(this.resourceId, effectModel.resourceId) && C19837412jU.LIZ(this.selectFrom, effectModel.selectFrom) && C19837412jU.LIZ(this.challenge, effectModel.challenge) && C19837412jU.LIZ(Boolean.valueOf(this.isFromEditPro), Boolean.valueOf(effectModel.isFromEditPro)) && this.isGoToCapCutEffect == effectModel.isGoToCapCutEffect && C19837412jU.LIZ(this.gameplayAlgorithm, effectModel.gameplayAlgorithm)) {
            return true;
        }
        return false;
    }
}

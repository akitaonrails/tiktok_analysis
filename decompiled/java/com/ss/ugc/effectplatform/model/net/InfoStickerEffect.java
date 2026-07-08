package com.ss.ugc.effectplatform.model.net;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class InfoStickerEffect implements Serializable {
    public Effect loki_effect;
    public Integer source;
    public ProviderEffect sticker;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoStickerEffect() {
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        this.loki_effect = new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54);
        this.sticker = new ProviderEffect("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    public final String getId() {
        Integer num = this.source;
        return num != null ? num.intValue() == 1 ? getLoki_effect().getId() : num.intValue() == 2 ? getSticker().getId() : "" : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Effect getLoki_effect() {
        Effect effect = this.loki_effect;
        if (effect != null) {
            return effect;
        }
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        return new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54);
    }

    public final ProviderEffect getSticker() {
        ProviderEffect providerEffect = this.sticker;
        return providerEffect == null ? new ProviderEffect("", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false) : providerEffect;
    }

    public final List<String> getBindIds() {
        return getLoki_effect().getBind_ids();
    }

    public final List<String> getChallenge() {
        return getLoki_effect().getChallenge();
    }

    public final List<Effect> getChildEffects() {
        return getLoki_effect().getChild_effects();
    }

    public final List<String> getChildren() {
        return getLoki_effect().getChildren();
    }

    public final String getClickUrl() {
        return getSticker().getClick_url();
    }

    public final String getComposerParams() {
        return getLoki_effect().getComposer_params();
    }

    public final List<String> getComposerPath() {
        return getLoki_effect().getComposerPath();
    }

    public final String getDesignerEncryptedId() {
        return getLoki_effect().getDesigner_encrypted_id();
    }

    public final String getDesignerId() {
        return getLoki_effect().getDesigner_id();
    }

    public final String getDevicePlatform() {
        return getLoki_effect().getDevice_platform();
    }

    public final String getEffectId() {
        return getLoki_effect().getEffect_id();
    }

    public final Integer getEffectType() {
        return Integer.valueOf(getLoki_effect().getEffect_type());
    }

    public final String getExtra() {
        return getLoki_effect().getExtra();
    }

    public final UrlModel getFileUrl() {
        return getLoki_effect().getFile_url();
    }

    public final String getGradeKey() {
        return getLoki_effect().getGrade_key();
    }

    public final String getHint() {
        return getLoki_effect().getHint();
    }

    public final UrlModel getHintFile() {
        return getLoki_effect().getHint_file();
    }

    public final Integer getHintFileFormat() {
        return Integer.valueOf(getLoki_effect().getHint_file_format());
    }

    public final UrlModel getHintIcon() {
        return getLoki_effect().getHint_icon();
    }

    public final UrlModel getIconUrl() {
        return getLoki_effect().getIcon_url();
    }

    public final String getIopId() {
        return getLoki_effect().getIop_id();
    }

    public final Integer getLokiEffectFromSource() {
        return Integer.valueOf(getLoki_effect().getFrom_source());
    }

    public final Integer getLokiEffectSource() {
        return Integer.valueOf(getLoki_effect().getSource());
    }

    public final String getModelNames() {
        return getLoki_effect().getModel_names();
    }

    public final String getModelNamesSec() {
        return getLoki_effect().getModel_names_sec();
    }

    public final List<String> getMusic() {
        return getLoki_effect().getMusic();
    }

    public final String getName() {
        return getLoki_effect().getName();
    }

    public final String getPanel() {
        return getLoki_effect().getPanel();
    }

    public final String getParent() {
        return getLoki_effect().getParent();
    }

    public final String getPath() {
        return getSticker().getPath();
    }

    public final Long getPtime() {
        return Long.valueOf(getLoki_effect().getPtime());
    }

    public final String getRecId() {
        return getLoki_effect().getRecId();
    }

    public final List<String> getRequirements() {
        return getLoki_effect().getRequirements();
    }

    public final List<String> getRequirementsSec() {
        return getLoki_effect().getRequirements_sec();
    }

    public final String getResourceId() {
        return getLoki_effect().getResource_id();
    }

    public final String getSchema() {
        return getLoki_effect().getSchema();
    }

    public final String getSdkExtra() {
        return getLoki_effect().getSdkExtra();
    }

    public final ProviderEffect.StickerBean getStickerInfo() {
        return getSticker().getSticker_info();
    }

    public final List<String> getTags() {
        return getLoki_effect().getTags();
    }

    public final String getTagsUpdatedAt() {
        return getLoki_effect().getTags_updated_at();
    }

    public final ProviderEffect.StickerBean getThumbnailSticker() {
        return getSticker().getThumbnail_sticker();
    }

    public final String getTitle() {
        return getSticker().getTitle();
    }

    public final List<String> getTypes() {
        return getLoki_effect().getTypes();
    }

    public final List<String> getTypesSec() {
        return getLoki_effect().getTypes_sec();
    }

    public final String getUnzipPath() {
        return getLoki_effect().getUnzipPath();
    }

    public final String getZipPath() {
        return getLoki_effect().getZipPath();
    }

    public final Boolean isBusi() {
        return Boolean.valueOf(getLoki_effect().is_busi());
    }

    public final Boolean isDownloaded() {
        return Boolean.valueOf(getLoki_effect().isDownloaded());
    }

    public final Boolean isIop() {
        return Boolean.valueOf(getLoki_effect().is_iop());
    }

    public final Integer getSource() {
        return this.source;
    }

    public final void setLoki_effect(Effect effect) {
        this.loki_effect = effect;
    }

    public final void setSource(Integer num) {
        this.source = num;
    }

    public final void setSticker(ProviderEffect providerEffect) {
        this.sticker = providerEffect;
    }
}

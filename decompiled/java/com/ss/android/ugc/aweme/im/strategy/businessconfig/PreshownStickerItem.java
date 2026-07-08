package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionGiphyMessage;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;

/* JADX INFO: loaded from: classes7.dex */
public final class PreshownStickerItem {

    @C09CT("aimoji")
    public final AIMojiStickerConfig aimoji;

    @C09CT("giphy")
    public final LightInteractionGiphyMessage giphy;

    @C09CT("quote_string_key")
    public final String quoteStringKey;

    @C09CT("receiver_copy_string_key")
    public final String receiverCopyStringKey;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("template")
    public final LightInteractionStickerSetMessage template;

    public final int hashCode() {
        Integer num = this.stickerType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        LightInteractionGiphyMessage lightInteractionGiphyMessage = this.giphy;
        int iHashCode2 = (iHashCode + (lightInteractionGiphyMessage == null ? 0 : lightInteractionGiphyMessage.hashCode())) * 31;
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage = this.template;
        int iHashCode3 = (iHashCode2 + (lightInteractionStickerSetMessage == null ? 0 : lightInteractionStickerSetMessage.hashCode())) * 31;
        AIMojiStickerConfig aIMojiStickerConfig = this.aimoji;
        int iHashCode4 = (iHashCode3 + (aIMojiStickerConfig == null ? 0 : aIMojiStickerConfig.hashCode())) * 31;
        String str = this.receiverCopyStringKey;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.quoteStringKey;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public static PreshownStickerItem LIZ(PreshownStickerItem preshownStickerItem, Integer num, LightInteractionStickerSetMessage lightInteractionStickerSetMessage, AIMojiStickerConfig aIMojiStickerConfig, int i) {
        LightInteractionGiphyMessage lightInteractionGiphyMessage;
        String str;
        AIMojiStickerConfig aIMojiStickerConfig2 = aIMojiStickerConfig;
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage2 = lightInteractionStickerSetMessage;
        Integer num2 = num;
        if ((i & 1) != 0) {
            num2 = preshownStickerItem.stickerType;
        }
        String str2 = null;
        if ((i & 2) != 0) {
            lightInteractionGiphyMessage = preshownStickerItem.giphy;
        } else {
            lightInteractionGiphyMessage = null;
        }
        if ((i & 4) != 0) {
            lightInteractionStickerSetMessage2 = preshownStickerItem.template;
        }
        if ((i & 8) != 0) {
            aIMojiStickerConfig2 = preshownStickerItem.aimoji;
        }
        if ((i & 16) != 0) {
            str = preshownStickerItem.receiverCopyStringKey;
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            str2 = preshownStickerItem.quoteStringKey;
        }
        preshownStickerItem.getClass();
        return new PreshownStickerItem(num2, lightInteractionGiphyMessage, lightInteractionStickerSetMessage2, aIMojiStickerConfig2, str, str2);
    }

    public PreshownStickerItem(Integer num, LightInteractionGiphyMessage lightInteractionGiphyMessage, LightInteractionStickerSetMessage lightInteractionStickerSetMessage, AIMojiStickerConfig aIMojiStickerConfig, String str, String str2) {
        this.stickerType = num;
        this.giphy = lightInteractionGiphyMessage;
        this.template = lightInteractionStickerSetMessage;
        this.aimoji = aIMojiStickerConfig;
        this.receiverCopyStringKey = str;
        this.quoteStringKey = str2;
    }
}

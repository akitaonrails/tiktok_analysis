package com.ss.android.ugc.aweme.im.strategy.commonresource;

import X.C09CT;
import X.C0ZMF;
import X.C0ZMI;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionCommonResource extends C0ZMF {
    public static final C0ZMI Companion = new Object() { // from class: X.0ZMI
    };

    @C09CT("event_name")
    public final String eventName;

    @C09CT("fullscreen_animate_id")
    public final String fullscreenAnimateId;

    @C09CT("gecko_animation_channel")
    public final String geckoAnimationChannel;

    @C09CT("giphy_msg")
    public final LightInteractionGiphyMessage giphyMessage;

    @C09CT("interaction_name")
    public String interactionName;

    @C09CT("loop_time")
    public final Integer loopTime;

    @C09CT("message_type")
    public final String messageType;

    @C09CT("need_image_flip")
    public final Boolean needImageFlip;

    @C09CT("need_vibrate")
    public final Boolean needVibrate;

    @C09CT("push_sent_string")
    public final String pushSentString;

    @C09CT("quote_text")
    public final String quoteText;

    @C09CT("quote_top_receiver")
    public final String quoteTopReceiver;

    @C09CT("quote_top_sender")
    public final String quoteTopSender;

    @C09CT("receiver_preview_hint_text")
    public final String receiverPreviewHintText;

    @C09CT("reference_scene")
    public final String referenceScene;

    @C09CT("sender_preview_hint_text")
    public final String senderPreviewHintText;

    @C09CT("sticker_set_msg")
    public final LightInteractionStickerSetMessage stickerSetMsg;

    @C09CT("text_msg")
    public final LightInteractionTextMessage textMsg;

    @C09CT("toast_string")
    public final String toastString;

    public LightInteractionCommonResource() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final LightInteractionCommonResource copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, LightInteractionTextMessage lightInteractionTextMessage, LightInteractionGiphyMessage lightInteractionGiphyMessage, LightInteractionStickerSetMessage lightInteractionStickerSetMessage, Boolean bool, Boolean bool2, Integer num, String str11, String str12, String str13) {
        return new LightInteractionCommonResource(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, lightInteractionTextMessage, lightInteractionGiphyMessage, lightInteractionStickerSetMessage, bool, bool2, num, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightInteractionCommonResource)) {
            return false;
        }
        LightInteractionCommonResource lightInteractionCommonResource = (LightInteractionCommonResource) obj;
        return Intrinsics.LJFF(this.interactionName, lightInteractionCommonResource.interactionName) && Intrinsics.LJFF(this.senderPreviewHintText, lightInteractionCommonResource.senderPreviewHintText) && Intrinsics.LJFF(this.receiverPreviewHintText, lightInteractionCommonResource.receiverPreviewHintText) && Intrinsics.LJFF(this.quoteTopSender, lightInteractionCommonResource.quoteTopSender) && Intrinsics.LJFF(this.quoteTopReceiver, lightInteractionCommonResource.quoteTopReceiver) && Intrinsics.LJFF(this.quoteText, lightInteractionCommonResource.quoteText) && Intrinsics.LJFF(this.toastString, lightInteractionCommonResource.toastString) && Intrinsics.LJFF(this.pushSentString, lightInteractionCommonResource.pushSentString) && Intrinsics.LJFF(this.messageType, lightInteractionCommonResource.messageType) && Intrinsics.LJFF(this.referenceScene, lightInteractionCommonResource.referenceScene) && Intrinsics.LJFF(this.textMsg, lightInteractionCommonResource.textMsg) && Intrinsics.LJFF(this.giphyMessage, lightInteractionCommonResource.giphyMessage) && Intrinsics.LJFF(this.stickerSetMsg, lightInteractionCommonResource.stickerSetMsg) && Intrinsics.LJFF(this.needVibrate, lightInteractionCommonResource.needVibrate) && Intrinsics.LJFF(this.needImageFlip, lightInteractionCommonResource.needImageFlip) && Intrinsics.LJFF(this.loopTime, lightInteractionCommonResource.loopTime) && Intrinsics.LJFF(this.fullscreenAnimateId, lightInteractionCommonResource.fullscreenAnimateId) && Intrinsics.LJFF(this.eventName, lightInteractionCommonResource.eventName) && Intrinsics.LJFF(this.geckoAnimationChannel, lightInteractionCommonResource.geckoAnimationChannel);
    }

    public int hashCode() {
        String str = this.interactionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.senderPreviewHintText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.receiverPreviewHintText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quoteTopSender;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.quoteTopReceiver;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.quoteText;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.toastString;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pushSentString;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.messageType;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.referenceScene;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        LightInteractionTextMessage lightInteractionTextMessage = this.textMsg;
        int iHashCode11 = (iHashCode10 + (lightInteractionTextMessage == null ? 0 : lightInteractionTextMessage.hashCode())) * 31;
        LightInteractionGiphyMessage lightInteractionGiphyMessage = this.giphyMessage;
        int iHashCode12 = (iHashCode11 + (lightInteractionGiphyMessage == null ? 0 : lightInteractionGiphyMessage.hashCode())) * 31;
        LightInteractionStickerSetMessage lightInteractionStickerSetMessage = this.stickerSetMsg;
        int iHashCode13 = (iHashCode12 + (lightInteractionStickerSetMessage == null ? 0 : lightInteractionStickerSetMessage.hashCode())) * 31;
        Boolean bool = this.needVibrate;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.needImageFlip;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.loopTime;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.fullscreenAnimateId;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.eventName;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.geckoAnimationChannel;
        return iHashCode18 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        return "LightInteractionCommonResource(interactionName=" + this.interactionName + ", senderPreviewHintText=" + this.senderPreviewHintText + ", receiverPreviewHintText=" + this.receiverPreviewHintText + ", quoteTopSender=" + this.quoteTopSender + ", quoteTopReceiver=" + this.quoteTopReceiver + ", quoteText=" + this.quoteText + ", toastString=" + this.toastString + ", pushSentString=" + this.pushSentString + ", messageType=" + this.messageType + ", referenceScene=" + this.referenceScene + ", textMsg=" + this.textMsg + ", giphyMessage=" + this.giphyMessage + ", stickerSetMsg=" + this.stickerSetMsg + ", needVibrate=" + this.needVibrate + ", needImageFlip=" + this.needImageFlip + ", loopTime=" + this.loopTime + ", fullscreenAnimateId=" + this.fullscreenAnimateId + ", eventName=" + this.eventName + ", geckoAnimationChannel=" + this.geckoAnimationChannel + ')';
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getFullscreenAnimateId() {
        return this.fullscreenAnimateId;
    }

    public final String getGeckoAnimationChannel() {
        return this.geckoAnimationChannel;
    }

    public final LightInteractionGiphyMessage getGiphyMessage() {
        return this.giphyMessage;
    }

    public final String getInteractionName() {
        return this.interactionName;
    }

    public final Integer getLoopTime() {
        return this.loopTime;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final Boolean getNeedImageFlip() {
        return this.needImageFlip;
    }

    public final Boolean getNeedVibrate() {
        return this.needVibrate;
    }

    public final String getPushSentString() {
        return this.pushSentString;
    }

    public final String getQuoteText() {
        return this.quoteText;
    }

    public final String getQuoteTopReceiver() {
        return this.quoteTopReceiver;
    }

    public final String getQuoteTopSender() {
        return this.quoteTopSender;
    }

    public final String getReceiverPreviewHintText() {
        return this.receiverPreviewHintText;
    }

    public final String getReferenceScene() {
        return this.referenceScene;
    }

    public final String getSenderPreviewHintText() {
        return this.senderPreviewHintText;
    }

    public final LightInteractionStickerSetMessage getStickerSetMsg() {
        return this.stickerSetMsg;
    }

    public final LightInteractionTextMessage getTextMsg() {
        return this.textMsg;
    }

    public final String getToastString() {
        return this.toastString;
    }

    public final void setInteractionName(String str) {
        this.interactionName = str;
    }

    public LightInteractionCommonResource(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, LightInteractionTextMessage lightInteractionTextMessage, LightInteractionGiphyMessage lightInteractionGiphyMessage, LightInteractionStickerSetMessage lightInteractionStickerSetMessage, Boolean bool, Boolean bool2, Integer num, String str11, String str12, String str13) {
        this.interactionName = str;
        this.senderPreviewHintText = str2;
        this.receiverPreviewHintText = str3;
        this.quoteTopSender = str4;
        this.quoteTopReceiver = str5;
        this.quoteText = str6;
        this.toastString = str7;
        this.pushSentString = str8;
        this.messageType = str9;
        this.referenceScene = str10;
        this.textMsg = lightInteractionTextMessage;
        this.giphyMessage = lightInteractionGiphyMessage;
        this.stickerSetMsg = lightInteractionStickerSetMessage;
        this.needVibrate = bool;
        this.needImageFlip = bool2;
        this.loopTime = num;
        this.fullscreenAnimateId = str11;
        this.eventName = str12;
        this.geckoAnimationChannel = str13;
    }
}

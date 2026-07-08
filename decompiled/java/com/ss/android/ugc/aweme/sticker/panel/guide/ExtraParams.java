package com.ss.android.ugc.aweme.sticker.panel.guide;

import X.C09CT;
import X.C21523519Ld;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes33.dex */
public class ExtraParams implements Parcelable {
    public static final Parcelable.Creator<ExtraParams> CREATOR = new C21523519Ld(8);

    @C09CT("clickable_open_url")
    public String clickableOpenUrl;

    @C09CT("clickable_web_url")
    public String clickableWebUrl;

    @C09CT("enable_new_prompt")
    public int enableNewPrompt;

    @C09CT("gif_type")
    public int gifType;

    @C09CT("interaction_icon")
    public String interactionIcon;

    @C09CT("interaction_text")
    public String interactionText;

    @C09CT("interaction_type")
    public int interactionType;

    @C09CT("interaction_url")
    public String interactionUrl;

    @C09CT("lottie_type")
    public int lottieType;

    @C09CT("manual_close")
    public int manualClose;

    @C09CT("prop_offline_toast")
    public String offlineToast;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean enableNewPrompt() {
        return this.enableNewPrompt == 1;
    }

    public boolean isGifValid() {
        int i = this.gifType;
        return 1 == i || 2 == i;
    }

    public boolean isLottieValid() {
        int i = this.lottieType;
        return 1 == i || 2 == i;
    }

    public boolean isUrlInteractionStickerValid() {
        if (this.interactionType != 1 || TextUtils.isEmpty(this.interactionText)) {
            return false;
        }
        return (TextUtils.isEmpty(this.interactionUrl) && TextUtils.isEmpty(this.clickableOpenUrl) && TextUtils.isEmpty(this.clickableWebUrl)) ? false : true;
    }

    public ExtraParams() {
    }

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public String getInteractionIcon() {
        return this.interactionIcon;
    }

    public String getInteractionText() {
        return this.interactionText;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public String getOfflineToast() {
        return this.offlineToast;
    }

    public ExtraParams(Parcel parcel) {
        this.gifType = parcel.readInt();
        this.interactionType = parcel.readInt();
        this.interactionText = parcel.readString();
        this.interactionIcon = parcel.readString();
        this.interactionUrl = parcel.readString();
        this.clickableOpenUrl = parcel.readString();
        this.clickableWebUrl = parcel.readString();
        this.offlineToast = parcel.readString();
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionIcon(String str) {
        this.interactionIcon = str;
    }

    public void setInteractionText(String str) {
        this.interactionText = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public void setOfflineToast(String str) {
        this.offlineToast = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gifType);
        parcel.writeInt(this.interactionType);
        parcel.writeString(this.interactionText);
        parcel.writeString(this.interactionIcon);
        parcel.writeString(this.interactionUrl);
        parcel.writeString(this.clickableOpenUrl);
        parcel.writeString(this.clickableWebUrl);
        parcel.writeString(this.offlineToast);
    }
}

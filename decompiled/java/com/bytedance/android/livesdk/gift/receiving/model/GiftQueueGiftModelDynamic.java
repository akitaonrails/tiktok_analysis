package com.bytedance.android.livesdk.gift.receiving.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1136850fgp;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftQueueGiftModelDynamic implements InterfaceC1136850fgp {

    @C09CT("diamond_count")
    public int diamondCount;

    @C09CT("duration")
    public int duration;

    @C09CT("gift_sub_type")
    public int giftSubType;

    @C09CT("image")
    public ImageModel image;

    @C09CT("name")
    public String name = "";

    @C09CT("primary_effect_id")
    public long primaryEffectId;

    @C09CT("scheme_info")
    public Gift.SchemeInfo schemeInfo;

    @C09CT("type")
    public int type;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftQueueGiftModelDynamic(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", diamondCount=");
        sbLIZ.append(this.diamondCount);
        sbLIZ.append(", image=");
        ImageModel imageModel = this.image;
        sbLIZ.append(imageModel != null ? imageModel.mUri : null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1136850fgp
    public final long LIZ() {
        return this.primaryEffectId;
    }

    @Override // X.InterfaceC1136850fgp
    public final Gift.SchemeInfo LIZIZ() {
        return this.schemeInfo;
    }

    @Override // X.InterfaceC1136850fgp
    public final int LIZJ() {
        return this.giftSubType;
    }

    @Override // X.InterfaceC1136850fgp
    public final int getDiamondCount() {
        return this.diamondCount;
    }

    @Override // X.InterfaceC1136850fgp
    public final int getDuration() {
        return this.duration;
    }

    @Override // X.InterfaceC1136850fgp
    public final ImageModel getImage() {
        return this.image;
    }

    @Override // X.InterfaceC1136850fgp
    public final String getName() {
        return this.name;
    }

    @Override // X.InterfaceC1136850fgp
    public final int getType() {
        return this.type;
    }

    public final void LIZLLL(int i) {
        this.diamondCount = i;
    }

    public final void LJ(int i) {
        this.duration = i;
    }

    public final void LJFF(int i) {
        this.giftSubType = i;
    }

    public final void LJI(ImageModel imageModel) {
        this.image = imageModel;
    }

    public final void LJII(String str) {
        this.name = str;
    }

    public final void LJIIIIZZ(long j) {
        this.primaryEffectId = j;
    }

    public final void LJIIIZ(Gift.SchemeInfo schemeInfo) {
        this.schemeInfo = schemeInfo;
    }

    public final void LJIIJ(int i) {
        this.type = i;
    }
}

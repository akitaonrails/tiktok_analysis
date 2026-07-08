package com.bytedance.android.livesdk.gift.receiving.model;

import X.C09CT;
import X.C2188811AlT;
import X.C500260Jjc;
import X.InterfaceC1136160ffi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftResource;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GiftQueueGiftModel implements InterfaceC1136160ffi {

    @C09CT("color_infos")
    public List<GiftColorInfo> colorInfos;

    @C09CT("color_picker_info")
    public Gift.ColorPickerInfo colorPickerInfo;

    @C09CT("cross_screen_effect_info")
    public Gift.CrossScreenEffectInfo crossScreenEffectInfo;

    @C09CT("describe")
    public String describe;

    @C09CT("diamond_count")
    public int diamondCount;

    @C09CT("duration")
    public int duration;

    @C09CT("gift_resources")
    public Map<String, GiftResource> giftResources;

    @C09CT("gift_sub_type")
    public int giftSubType;

    @C09CT("gift_vertical_scenarios")
    public List<Integer> giftVerticalScenarios;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("is_random_gift")
    public boolean isRandomGift;

    @C09CT("lynx_cross_screen_effect_info")
    public Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo;

    @C09CT("name")
    public String name = "";

    @C09CT("primary_effect_id")
    public long primaryEffectId;

    @C09CT("random_effect_info")
    public GiftRandomEffectInfo randomEffectInfo;

    @C09CT("scheme_info")
    public Gift.SchemeInfo schemeInfo;

    @C09CT("type")
    public int type;

    @Override // X.InterfaceC1136160ffi
    public final boolean LJI() {
        Map<Long, Integer> map;
        Map<Long, Integer> map2;
        Map<Long, Integer> map3;
        if (C500260Jjc.LJJIJIIJI(this.colorInfos)) {
            return true;
        }
        GiftRandomEffectInfo giftRandomEffectInfo = this.randomEffectInfo;
        if (C500260Jjc.LJJIJIIJI(giftRandomEffectInfo != null ? giftRandomEffectInfo.effectIds : null)) {
            return true;
        }
        Gift.CrossScreenEffectInfo crossScreenEffectInfo = this.crossScreenEffectInfo;
        if (C500260Jjc.LJJJI((crossScreenEffectInfo == null || (map3 = crossScreenEffectInfo.singleActionEffectIds) == null) ? null : Boolean.valueOf(!map3.isEmpty()))) {
            return true;
        }
        Gift.CrossScreenEffectInfo crossScreenEffectInfo2 = this.crossScreenEffectInfo;
        if (C500260Jjc.LJJJI((crossScreenEffectInfo2 == null || (map2 = crossScreenEffectInfo2.actionEffectIds) == null) ? null : Boolean.valueOf(!map2.isEmpty()))) {
            return true;
        }
        Gift.CrossScreenEffectInfo crossScreenEffectInfo3 = this.crossScreenEffectInfo;
        if (C500260Jjc.LJJJI((crossScreenEffectInfo3 == null || (map = crossScreenEffectInfo3.reactionEffectIds) == null) ? null : Boolean.valueOf(!map.isEmpty()))) {
            return true;
        }
        Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo = this.lynxCrossScreenEffectInfo;
        return C500260Jjc.LJJIJIIJI(lynxCrossScreenEffectInfo != null ? lynxCrossScreenEffectInfo.effectIds : null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftQueueGiftModel(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", diamondCount=");
        sbLIZ.append(this.diamondCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1136160ffi
    public final long LIZ() {
        return this.primaryEffectId;
    }

    @Override // X.InterfaceC1136160ffi
    public final Gift.SchemeInfo LIZIZ() {
        return this.schemeInfo;
    }

    @Override // X.InterfaceC1136160ffi
    public final int LIZJ() {
        return this.giftSubType;
    }

    @Override // X.InterfaceC1136160ffi
    public final Map<String, GiftResource> LIZLLL() {
        return this.giftResources;
    }

    @Override // X.InterfaceC1136160ffi
    public final String LJ() {
        return this.describe;
    }

    @Override // X.InterfaceC1136160ffi
    public final List<Integer> LJFF() {
        return this.giftVerticalScenarios;
    }

    @Override // X.InterfaceC1136160ffi
    public final List<GiftColorInfo> LJII() {
        return this.colorInfos;
    }

    @Override // X.InterfaceC1136160ffi
    public final Gift.LynxCrossScreenEffectInfo LJIIIIZZ() {
        return this.lynxCrossScreenEffectInfo;
    }

    @Override // X.InterfaceC1136160ffi
    public final Gift.ColorPickerInfo LJIIIZ() {
        return this.colorPickerInfo;
    }

    @Override // X.InterfaceC1136160ffi
    public final Gift.CrossScreenEffectInfo LJIIJ() {
        return this.crossScreenEffectInfo;
    }

    @Override // X.InterfaceC1136160ffi
    public final GiftRandomEffectInfo LJIIJJI() {
        return this.randomEffectInfo;
    }

    @Override // X.InterfaceC1136160ffi
    public final boolean LJIIL() {
        return this.isRandomGift;
    }

    @Override // X.InterfaceC1136160ffi
    public final int getDiamondCount() {
        return this.diamondCount;
    }

    @Override // X.InterfaceC1136160ffi
    public final int getDuration() {
        return this.duration;
    }

    @Override // X.InterfaceC1136160ffi
    public final long getId() {
        return this.id;
    }

    @Override // X.InterfaceC1136160ffi
    public final ImageModel getImage() {
        return this.image;
    }

    @Override // X.InterfaceC1136160ffi
    public final String getName() {
        return this.name;
    }

    @Override // X.InterfaceC1136160ffi
    public final int getType() {
        return this.type;
    }

    public final void LJIILIIL(List<GiftColorInfo> list) {
        this.colorInfos = list;
    }

    public final void LJIILJJIL(Gift.ColorPickerInfo colorPickerInfo) {
        this.colorPickerInfo = colorPickerInfo;
    }

    public final void LJIILL(Gift.CrossScreenEffectInfo crossScreenEffectInfo) {
        this.crossScreenEffectInfo = crossScreenEffectInfo;
    }

    public final void LJIILLIIL(String str) {
        this.describe = str;
    }

    public final void LJIIZILJ(int i) {
        this.diamondCount = i;
    }

    public final void LJIJ(int i) {
        this.duration = i;
    }

    public final void LJIJI(Map<String, GiftResource> map) {
        this.giftResources = map;
    }

    public final void LJIJJ(int i) {
        this.giftSubType = i;
    }

    public final void LJIJJLI(List<Integer> list) {
        this.giftVerticalScenarios = list;
    }

    public final void LJIL(long j) {
        this.id = j;
    }

    public final void LJJ(ImageModel imageModel) {
        this.image = imageModel;
    }

    public final void LJJI(Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo) {
        this.lynxCrossScreenEffectInfo = lynxCrossScreenEffectInfo;
    }

    public final void LJJIFFI(String str) {
        this.name = str;
    }

    public final void LJJII(long j) {
        this.primaryEffectId = j;
    }

    public final void LJJIII(GiftRandomEffectInfo giftRandomEffectInfo) {
        this.randomEffectInfo = giftRandomEffectInfo;
    }

    public final void LJJIIJ(boolean z) {
        this.isRandomGift = z;
    }

    public final void LJJIIJZLJL(Gift.SchemeInfo schemeInfo) {
        this.schemeInfo = schemeInfo;
    }

    public final void LJJIIZ(int i) {
        this.type = i;
    }
}

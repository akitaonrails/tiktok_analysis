package com.bytedance.android.livesdk.gift.receiving.model;

import X.C09CT;
import X.C15438062q;
import X.C2188811AlT;
import X.InterfaceC1136230ffp;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.DistributionStrategy;
import com.bytedance.android.livesdk.gift.model.FlyingMicResources;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectStreamSpec;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.android.livesdk.gift.model.SecondaryEffectInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftQueueEffectModel implements InterfaceC1136230ffp {

    @C09CT("asset")
    public AssetsModel asset;

    @C09CT("assets")
    public List<AssetsModel> assets;

    @C09CT("color_id")
    public long colorId;

    @C09CT("distribution_strategy")
    public List<DistributionStrategy> distributionStrategy;

    @C09CT("effect_extra")
    public String effectExtra;

    @C09CT("flying_mic_resources")
    public FlyingMicResources flyingMicResources;

    @C09CT("flying_mic_resources_v2")
    public FlyingMicResources flyingMicResourcesV2;

    @C09CT("gift_effect")
    public GiftEffect giftEffect;

    @C09CT("gift_variant_id")
    public int giftVariantId;

    @C09CT("is_asset_bundle_gift")
    public boolean isAssetBundleGift;

    @C09CT("lynx_extra")
    public List<LynxGiftExtra> lynxExtra;

    @C09CT("prefab_bundle")
    public AssetBundle.PrefabBundle prefabBundle;

    @C09CT("secondary_effect_info")
    public SecondaryEffectInfo secondaryEffectInfo;

    @C09CT("shiny_card_unlock_token")
    public String shinyCardUnlockToken = "";

    @C09CT("stream_effect_spec")
    public GiftEffectStreamSpec streamEffectSpec;

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftQueueEffectModel(asset=");
        AssetsModel assetsModel = this.asset;
        ArrayList arrayList = null;
        sb.append(assetsModel != null ? LIZ(assetsModel) : null);
        sb.append(", assets=");
        List<AssetsModel> list = this.assets;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<AssetsModel> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZ(it2.next()));
            }
        }
        sb.append(arrayList);
        sb.append(", distributionStrategy=");
        sb.append(this.distributionStrategy);
        sb.append(", prefabBundle=");
        sb.append(this.prefabBundle);
        sb.append(", isAssetBundleGift=");
        sb.append(this.isAssetBundleGift);
        sb.append(", colorId=");
        sb.append(this.colorId);
        sb.append(", lynxExtra=");
        sb.append(this.lynxExtra);
        sb.append(", flyingMicResources=");
        sb.append(this.flyingMicResources);
        sb.append(", flyingMicResourcesV2=");
        sb.append(this.flyingMicResourcesV2);
        sb.append(", effectExtra=");
        sb.append(this.effectExtra);
        sb.append(", giftEffect=");
        sb.append(this.giftEffect);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC1136230ffp
    public final List<AssetsModel> LJIIJ() {
        return this.assets;
    }

    @Override // X.InterfaceC1136230ffp
    public final int LJIIJJI() {
        return this.giftVariantId;
    }

    @Override // X.InterfaceC1136230ffp
    public final long LJIIL() {
        return this.colorId;
    }

    @Override // X.InterfaceC1136230ffp
    public final AssetBundle.PrefabBundle LJIILIIL() {
        return this.prefabBundle;
    }

    @Override // X.InterfaceC1136230ffp
    public final FlyingMicResources LJIILJJIL() {
        return this.flyingMicResources;
    }

    @Override // X.InterfaceC1136230ffp
    public final GiftEffectStreamSpec LJIILL() {
        return this.streamEffectSpec;
    }

    @Override // X.InterfaceC1136230ffp
    public final String LJIILLIIL() {
        return this.shinyCardUnlockToken;
    }

    @Override // X.InterfaceC1136230ffp
    public final SecondaryEffectInfo LJIIZILJ() {
        return this.secondaryEffectInfo;
    }

    @Override // X.InterfaceC1136230ffp
    public final String LJIJ() {
        return this.effectExtra;
    }

    @Override // X.InterfaceC1136230ffp
    public final GiftEffect LJIJI() {
        return this.giftEffect;
    }

    @Override // X.InterfaceC1136230ffp
    public final List<DistributionStrategy> LJIJJ() {
        return this.distributionStrategy;
    }

    @Override // X.InterfaceC1136230ffp
    public final boolean LJIJJLI() {
        return this.isAssetBundleGift;
    }

    @Override // X.InterfaceC1136230ffp
    public final List<LynxGiftExtra> LJIL() {
        return this.lynxExtra;
    }

    @Override // X.InterfaceC1136230ffp
    public final AssetsModel LJJ() {
        return this.asset;
    }

    @Override // X.InterfaceC1136230ffp
    public final FlyingMicResources LJJIFFI() {
        return this.flyingMicResourcesV2;
    }

    public static String LIZ(AssetsModel assetsModel) {
        if (assetsModel == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetsModel(id=");
        sbLIZ.append(assetsModel.id);
        sbLIZ.append(", md5=");
        sbLIZ.append(assetsModel.md5);
        sbLIZ.append(", resourceType=");
        sbLIZ.append(assetsModel.resourceType);
        sbLIZ.append(", resourceUri=");
        sbLIZ.append(assetsModel.resourceUri);
        sbLIZ.append(", forceUseIm=");
        sbLIZ.append(assetsModel.forceUseImOrRespAsset);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(AssetsModel assetsModel) {
        this.asset = assetsModel;
    }

    public final void LIZJ(boolean z) {
        this.isAssetBundleGift = z;
    }

    public final void LIZLLL(List<AssetsModel> list) {
        this.assets = list;
    }

    public final void LJ(List<DistributionStrategy> list) {
        this.distributionStrategy = list;
    }

    public final void LJFF(String str) {
        this.effectExtra = str;
    }

    public final void LJI(FlyingMicResources flyingMicResources) {
        this.flyingMicResources = flyingMicResources;
    }

    public final void LJII(FlyingMicResources flyingMicResources) {
        this.flyingMicResourcesV2 = flyingMicResources;
    }

    public final void LJIIIIZZ(GiftEffect giftEffect) {
        this.giftEffect = giftEffect;
    }

    public final void LJIIIZ(int i) {
        this.giftVariantId = i;
    }

    @Override // X.InterfaceC1136230ffp
    public final void LJJI(long j) {
        this.colorId = j;
    }

    public final void LJJII(List<LynxGiftExtra> list) {
        this.lynxExtra = list;
    }

    public final void LJJIII(AssetBundle.PrefabBundle prefabBundle) {
        this.prefabBundle = prefabBundle;
    }

    public final void LJJIIJ(SecondaryEffectInfo secondaryEffectInfo) {
        this.secondaryEffectInfo = secondaryEffectInfo;
    }

    public final void LJJIIJZLJL(String str) {
        this.shinyCardUnlockToken = str;
    }

    public final void LJJIIZ(GiftEffectStreamSpec giftEffectStreamSpec) {
        this.streamEffectSpec = giftEffectStreamSpec;
    }
}

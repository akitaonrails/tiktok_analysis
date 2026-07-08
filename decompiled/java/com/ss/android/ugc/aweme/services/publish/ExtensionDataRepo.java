package com.ss.android.ugc.aweme.services.publish;

import X.C13BV;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.product.ProductRecommendModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ExtensionDataRepo extends ViewModel {
    public final MutableLiveData<Boolean> anchorExtension;
    public final MutableLiveData<Boolean> anchorState;
    public final MutableLiveData<Boolean> couponExtension;
    public List<AnchorTransData> defaultAnchorList;
    public final MutableLiveData<Boolean> gameExtension;
    public final MutableLiveData<Boolean> goodsExtension;
    public final MutableLiveData<Boolean> goodsState;
    public final MutableLiveData<Boolean> i18nPrivacy;
    public final MutableLiveData<Boolean> i18nShopExtension;
    public final MutableLiveData<Boolean> i18nStarAtlasClosed;
    public IPermissionAction iPermissionAction;
    public final MutableLiveData<Boolean> isFromCreateTemplate;
    public final MutableLiveData<Boolean> isGoodsAdd;
    public final MutableLiveData<Boolean> mediumExtension;
    public final MutableLiveData<Boolean> microAppExtension;
    public final MutableLiveData<Boolean> movieExtension;
    public final MutableLiveData<String> openPlatformExtraUpdate;
    public final MutableLiveData<Boolean> postExtension;
    public ProductRecommendModel productRecommendModel;
    public final MutableLiveData<Boolean> seedingExtension;
    public Function1<? super Integer, Boolean> showPermissionAction;
    public final MutableLiveData<Boolean> starAtlasState;
    public final MutableLiveData<Boolean> wikiExtension;
    public Function0<Unit> resetGoodsAction = AFwS201S0000000_14.get$arr$(299);
    public Function0<Unit> resetAnchor = AFwS201S0000000_14.get$arr$(298);
    public Function1<? super String, Unit> restoreGoodsPublishModel = AFwS248S0000000_14.get$arr$(316);
    public MutableLiveData<String> zipUrl = new MutableLiveData<>();
    public MutableLiveData<AnchorTransData> updateAnchor = new MutableLiveData<>();
    public MutableLiveData<List<AnchorTransData>> updateAnchors = new MutableLiveData<>();

    public ExtensionDataRepo() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.isGoodsAdd = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        Boolean bool2 = Boolean.TRUE;
        mutableLiveData2.setValue(bool2);
        this.i18nPrivacy = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(bool2);
        this.i18nStarAtlasClosed = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(bool2);
        this.starAtlasState = mutableLiveData4;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(bool2);
        this.goodsState = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        mutableLiveData6.setValue(bool2);
        this.anchorState = mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>();
        mutableLiveData7.setValue(bool);
        this.movieExtension = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        mutableLiveData8.setValue(bool);
        this.postExtension = mutableLiveData8;
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>();
        mutableLiveData9.setValue(bool);
        this.seedingExtension = mutableLiveData9;
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>();
        mutableLiveData10.setValue(bool);
        this.goodsExtension = mutableLiveData10;
        MutableLiveData<Boolean> mutableLiveData11 = new MutableLiveData<>();
        mutableLiveData11.setValue(bool);
        this.i18nShopExtension = mutableLiveData11;
        MutableLiveData<Boolean> mutableLiveData12 = new MutableLiveData<>();
        mutableLiveData12.setValue(bool);
        this.wikiExtension = mutableLiveData12;
        MutableLiveData<Boolean> mutableLiveData13 = new MutableLiveData<>();
        mutableLiveData13.setValue(bool);
        this.gameExtension = mutableLiveData13;
        MutableLiveData<Boolean> mutableLiveData14 = new MutableLiveData<>();
        mutableLiveData14.setValue(bool);
        this.anchorExtension = mutableLiveData14;
        MutableLiveData<Boolean> mutableLiveData15 = new MutableLiveData<>();
        mutableLiveData15.setValue(bool);
        this.couponExtension = mutableLiveData15;
        MutableLiveData<Boolean> mutableLiveData16 = new MutableLiveData<>();
        mutableLiveData16.setValue(bool);
        this.mediumExtension = mutableLiveData16;
        MutableLiveData<Boolean> mutableLiveData17 = new MutableLiveData<>();
        mutableLiveData17.setValue(bool);
        this.microAppExtension = mutableLiveData17;
        this.defaultAnchorList = C13BV.INSTANCE;
        this.productRecommendModel = new ProductRecommendModel(null, null);
        this.openPlatformExtraUpdate = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData18 = new MutableLiveData<>();
        mutableLiveData18.setValue(bool);
        this.isFromCreateTemplate = mutableLiveData18;
    }

    public final MutableLiveData<Boolean> getAnchorExtension() {
        return this.anchorExtension;
    }

    public final MutableLiveData<Boolean> getAnchorState() {
        return this.anchorState;
    }

    public final MutableLiveData<Boolean> getCouponExtension() {
        return this.couponExtension;
    }

    public final List<AnchorTransData> getDefaultAnchorList() {
        return this.defaultAnchorList;
    }

    public final MutableLiveData<Boolean> getGameExtension() {
        return this.gameExtension;
    }

    public final MutableLiveData<Boolean> getGoodsExtension() {
        return this.goodsExtension;
    }

    public final MutableLiveData<Boolean> getGoodsState() {
        return this.goodsState;
    }

    public final MutableLiveData<Boolean> getI18nPrivacy() {
        return this.i18nPrivacy;
    }

    public final MutableLiveData<Boolean> getI18nShopExtension() {
        return this.i18nShopExtension;
    }

    public final MutableLiveData<Boolean> getI18nStarAtlasClosed() {
        return this.i18nStarAtlasClosed;
    }

    public final IPermissionAction getIPermissionAction() {
        return this.iPermissionAction;
    }

    public final MutableLiveData<Boolean> getMediumExtension() {
        return this.mediumExtension;
    }

    public final MutableLiveData<Boolean> getMicroAppExtension() {
        return this.microAppExtension;
    }

    public final MutableLiveData<Boolean> getMovieExtension() {
        return this.movieExtension;
    }

    public final MutableLiveData<String> getOpenPlatformExtraUpdate() {
        return this.openPlatformExtraUpdate;
    }

    public final MutableLiveData<Boolean> getPostExtension() {
        return this.postExtension;
    }

    public final ProductRecommendModel getProductRecommendModel() {
        return this.productRecommendModel;
    }

    public final Function0<Unit> getResetAnchor() {
        return this.resetAnchor;
    }

    public final Function0<Unit> getResetGoodsAction() {
        return this.resetGoodsAction;
    }

    public final Function1<String, Unit> getRestoreGoodsPublishModel() {
        return this.restoreGoodsPublishModel;
    }

    public final MutableLiveData<Boolean> getSeedingExtension() {
        return this.seedingExtension;
    }

    public final Function1<Integer, Boolean> getShowPermissionAction() {
        return this.showPermissionAction;
    }

    public final MutableLiveData<Boolean> getStarAtlasState() {
        return this.starAtlasState;
    }

    public final MutableLiveData<AnchorTransData> getUpdateAnchor() {
        return this.updateAnchor;
    }

    public final MutableLiveData<List<AnchorTransData>> getUpdateAnchors() {
        return this.updateAnchors;
    }

    public final MutableLiveData<Boolean> getWikiExtension() {
        return this.wikiExtension;
    }

    public final MutableLiveData<String> getZipUrl() {
        return this.zipUrl;
    }

    public final MutableLiveData<Boolean> isFromCreateTemplate() {
        return this.isFromCreateTemplate;
    }

    public final MutableLiveData<Boolean> isGoodsAdd() {
        return this.isGoodsAdd;
    }

    public final void setDefaultAnchorList(List<AnchorTransData> list) {
        this.defaultAnchorList = list;
    }

    public final void setIPermissionAction(IPermissionAction iPermissionAction) {
        this.iPermissionAction = iPermissionAction;
    }

    public final void setProductRecommendModel(ProductRecommendModel productRecommendModel) {
        this.productRecommendModel = productRecommendModel;
    }

    public final void setResetAnchor(Function0<Unit> function0) {
        this.resetAnchor = function0;
    }

    public final void setResetGoodsAction(Function0<Unit> function0) {
        this.resetGoodsAction = function0;
    }

    public final void setRestoreGoodsPublishModel(Function1<? super String, Unit> function1) {
        this.restoreGoodsPublishModel = function1;
    }

    public final void setShowPermissionAction(Function1<? super Integer, Boolean> function1) {
        this.showPermissionAction = function1;
    }

    public final void setUpdateAnchor(MutableLiveData<AnchorTransData> mutableLiveData) {
        this.updateAnchor = mutableLiveData;
    }

    public final void setUpdateAnchors(MutableLiveData<List<AnchorTransData>> mutableLiveData) {
        this.updateAnchors = mutableLiveData;
    }

    public final void setZipUrl(MutableLiveData<String> mutableLiveData) {
        this.zipUrl = mutableLiveData;
    }
}

package com.ss.android.ugc.aweme.services.publish;

import X.C786410Ut5;
import X.InterfaceC19511611Vi;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.GpsConsumingOptModel;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.poi.PoiPublishInfoModel;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;

/* JADX INFO: loaded from: classes19.dex */
public final class ExtensionMisc {
    public final String candidateLog;
    public final AVMusic currentMusic;
    public final EditPostMobParam editPostMobParam;
    public final EditPostPermission editPostPermission;
    public final ExtensionDataRepo extensionDataRepo;
    public final GpsConsumingOptModel gpsConsumingOptModel;
    public final boolean hasEditPageWikiAnchor;
    public final boolean isImageMode;
    public final boolean isImageNewStyleUi;
    public final MobParam mobParam;
    public final String pContext;
    public final PoiData poiData;
    public final PoiPublishInfoModel poiPublishModel;
    public final PoiReTagInfo poiReTagInfo;
    public final InterfaceC19511611Vi publishExtensionDataContainer;
    public final Context sceneContext;
    public final MicroAppModel transMicroAppInfo;

    public int hashCode() {
        String str = this.candidateLog;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pContext;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MicroAppModel microAppModel = this.transMicroAppInfo;
        int iHashCode3 = (iHashCode2 + (microAppModel == null ? 0 : microAppModel.hashCode())) * 31;
        InterfaceC19511611Vi interfaceC19511611Vi = this.publishExtensionDataContainer;
        int iHashCode4 = (((((((((iHashCode3 + (interfaceC19511611Vi == null ? 0 : interfaceC19511611Vi.hashCode())) * 31) + this.extensionDataRepo.hashCode()) * 31) + this.mobParam.hashCode()) * 31) + C786410Ut5.Z2(this.hasEditPageWikiAnchor)) * 31) + C786410Ut5.Z2(this.isImageMode)) * 31;
        AVMusic aVMusic = this.currentMusic;
        int iHashCode5 = (((iHashCode4 + (aVMusic == null ? 0 : aVMusic.hashCode())) * 31) + C786410Ut5.Z2(this.isImageNewStyleUi)) * 31;
        PoiData poiData = this.poiData;
        int iHashCode6 = (iHashCode5 + (poiData == null ? 0 : poiData.hashCode())) * 31;
        EditPostPermission editPostPermission = this.editPostPermission;
        int iHashCode7 = (iHashCode6 + (editPostPermission == null ? 0 : editPostPermission.hashCode())) * 31;
        EditPostMobParam editPostMobParam = this.editPostMobParam;
        int iHashCode8 = (iHashCode7 + (editPostMobParam == null ? 0 : editPostMobParam.hashCode())) * 31;
        Context context = this.sceneContext;
        int iHashCode9 = (iHashCode8 + (context == null ? 0 : context.hashCode())) * 31;
        PoiReTagInfo poiReTagInfo = this.poiReTagInfo;
        int iHashCode10 = (iHashCode9 + (poiReTagInfo == null ? 0 : poiReTagInfo.hashCode())) * 31;
        PoiPublishInfoModel poiPublishInfoModel = this.poiPublishModel;
        int iHashCode11 = (iHashCode10 + (poiPublishInfoModel == null ? 0 : poiPublishInfoModel.hashCode())) * 31;
        GpsConsumingOptModel gpsConsumingOptModel = this.gpsConsumingOptModel;
        return iHashCode11 + (gpsConsumingOptModel != null ? gpsConsumingOptModel.hashCode() : 0);
    }

    public final boolean isImageMode() {
        return this.isImageMode;
    }

    public final boolean isImageNewStyleUi() {
        return this.isImageNewStyleUi;
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, false, false, null, false, null, null, null, null, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, false, null, false, null, null, null, null, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, null, false, null, null, null, null, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, aVMusic, false, null, null, null, null, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, boolean z3) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, aVMusic, z3, null, null, null, null, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, boolean z3, PoiData poiData) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, aVMusic, z3, poiData, null, null, null, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, boolean z3, PoiData poiData, EditPostPermission editPostPermission) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, aVMusic, z3, poiData, editPostPermission, null, null, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, boolean z3, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, aVMusic, z3, poiData, editPostPermission, editPostMobParam, null, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, boolean z3, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam, Context context) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, aVMusic, z3, poiData, editPostPermission, editPostMobParam, context, null, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, boolean z3, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam, Context context, PoiReTagInfo poiReTagInfo) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, aVMusic, z3, poiData, editPostPermission, editPostMobParam, context, poiReTagInfo, null, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, boolean z3, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam, Context context, PoiReTagInfo poiReTagInfo, PoiPublishInfoModel poiPublishInfoModel) {
        this(str, str2, microAppModel, interfaceC19511611Vi, extensionDataRepo, mobParam, z, z2, aVMusic, z3, poiData, editPostPermission, editPostMobParam, context, poiReTagInfo, poiPublishInfoModel, null);
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC19511611Vi interfaceC19511611Vi, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, boolean z3, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam, Context context, PoiReTagInfo poiReTagInfo, PoiPublishInfoModel poiPublishInfoModel, GpsConsumingOptModel gpsConsumingOptModel) {
        this.candidateLog = str;
        this.pContext = str2;
        this.transMicroAppInfo = microAppModel;
        this.publishExtensionDataContainer = interfaceC19511611Vi;
        this.extensionDataRepo = extensionDataRepo;
        this.mobParam = mobParam;
        this.hasEditPageWikiAnchor = z;
        this.isImageMode = z2;
        this.currentMusic = aVMusic;
        this.isImageNewStyleUi = z3;
        this.poiData = poiData;
        this.editPostPermission = editPostPermission;
        this.editPostMobParam = editPostMobParam;
        this.sceneContext = context;
        this.poiReTagInfo = poiReTagInfo;
        this.poiPublishModel = poiPublishInfoModel;
        this.gpsConsumingOptModel = gpsConsumingOptModel;
    }
}

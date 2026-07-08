package com.ss.android.ugc.effectmanager.knadapt;

import X.C13MA;
import X.C13NY;
import X.C13NZ;
import X.C13PH;
import X.C13QI;
import X.C15438062q;
import X.C1662010tLr;
import X.C1C7U;
import X.C20001113Np;
import X.C2179971ATj;
import X.InterfaceC1634240sd4;
import X.InterfaceC19999613Na;
import X.InterfaceC20001313Nr;
import X.InterfaceC790780V0i;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.IDownloadMaterialResourceListener;
import com.ss.android.ugc.effectmanager.IFetchMaterialInfoListener;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.EffectExtra;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListenerExt;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchGradeEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchModelInfoListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.INothingListener;
import com.ss.android.ugc.effectmanager.effect.listener.IQueryCustomizedEffectsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.CustomizedEffectsResponse;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.QueryGradeEffectsByIdResponse;
import com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class ListenerAdaptExtKt {
    public static final void preProcess(List<? extends Effect> list) {
        for (Effect effect : list) {
            effect.getRequirements();
            effect.getModel_names();
        }
    }

    public static final C13NY toKNListener(final IFetchEffectListener iFetchEffectListener) {
        if (iFetchEffectListener == null) {
            return null;
        }
        final ListenerAdaptExtKt$toKNListener$defaultImpl$1 listenerAdaptExtKt$toKNListener$defaultImpl$1 = new ListenerAdaptExtKt$toKNListener$defaultImpl$1(iFetchEffectListener);
        if (iFetchEffectListener instanceof IFetchEffectListenerExt) {
            return new InterfaceC19999613Na() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.1
                public Effect oldEffect;

                @Override // X.C13MA
                public void preProcess(Effect effect) {
                }

                @Override // X.C13NY
                public void onStart(Effect effect) {
                    listenerAdaptExtKt$toKNListener$defaultImpl$1.onStart(effect);
                }

                @Override // X.C13MA
                public void onSuccess(Effect effect) {
                    listenerAdaptExtKt$toKNListener$defaultImpl$1.onSuccess(effect);
                }

                @Override // X.C13MA
                public void onFail(Effect effect, C1662010tLr c1662010tLr) {
                    listenerAdaptExtKt$toKNListener$defaultImpl$1.onFail(effect, c1662010tLr);
                }

                @Override // X.InterfaceC19999613Na
                public void onSuccess(Effect effect, C13NZ c13nz) {
                    if (this.oldEffect == null) {
                        this.oldEffect = effect;
                    }
                    ((IFetchEffectListenerExt) iFetchEffectListener).onSuccess(this.oldEffect, EffectExtra.Companion.create(c13nz));
                }

                @Override // X.C13NY
                public void onProgress(Effect effect, int i, long j) {
                    listenerAdaptExtKt$toKNListener$defaultImpl$1.onProgress(effect, i, j);
                }
            };
        }
        return listenerAdaptExtKt$toKNListener$defaultImpl$1;
    }

    public static final ExceptionResult toOldExceptionResult(C1662010tLr c1662010tLr) {
        ExceptionResult exceptionResult = new ExceptionResult(c1662010tLr.LIZ, c1662010tLr.LIZLLL, c1662010tLr.LIZJ);
        exceptionResult.setMsg(c1662010tLr.LIZIZ);
        return exceptionResult;
    }

    public static final InterfaceC1634240sd4 toKNListener(final IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        if (iDownloadProviderEffectListener == null) {
            return null;
        }
        return new InterfaceC1634240sd4() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.14
            @Override // X.C13MA
            public void preProcess(ProviderEffect providerEffect) {
            }

            @Override // X.C13MA
            public void onSuccess(ProviderEffect providerEffect) {
                iDownloadProviderEffectListener.onSuccess(providerEffect);
            }

            @Override // X.C13MA
            public void onFail(ProviderEffect providerEffect, C1662010tLr c1662010tLr) {
                iDownloadProviderEffectListener.onFail(providerEffect, ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }

            @Override // X.InterfaceC1634240sd4
            public void onProgress(ProviderEffect providerEffect, int i, long j) {
                IDownloadProviderEffectListener iDownloadProviderEffectListener2 = iDownloadProviderEffectListener;
                if (iDownloadProviderEffectListener2 instanceof IDownloadProviderEffectProgressListener) {
                    ((IDownloadProviderEffectProgressListener) iDownloadProviderEffectListener2).onProgress(providerEffect, i, j);
                }
            }
        };
    }

    public static final C13MA<String> toKNListener(final IDownloadMaterialResourceListener iDownloadMaterialResourceListener) {
        if (iDownloadMaterialResourceListener == null) {
            return null;
        }
        return new C13MA<String>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.29
            @Override // X.C13MA
            public void onFail(String str, C1662010tLr c1662010tLr) {
            }

            @Override // X.C13MA
            public void preProcess(String str) {
            }

            @Override // X.C13MA
            public void onSuccess(String str) {
                iDownloadMaterialResourceListener.onSuccess(str);
            }
        };
    }

    public static final C13MA<List<MaterialResource>> toKNListener(final IFetchMaterialInfoListener iFetchMaterialInfoListener) {
        if (iFetchMaterialInfoListener == null) {
            return null;
        }
        return new C13MA<List<? extends MaterialResource>>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.28
            /* JADX INFO: renamed from: preProcess, reason: avoid collision after fix types in other method */
            public void preProcess2(List<MaterialResource> list) {
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void onSuccess(List<? extends MaterialResource> list) {
                onSuccess2((List<MaterialResource>) list);
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void preProcess(List<? extends MaterialResource> list) {
                preProcess2((List<MaterialResource>) list);
            }

            /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
            public void onSuccess2(List<MaterialResource> list) {
                iFetchMaterialInfoListener.onSuccess(list);
            }

            /* JADX INFO: renamed from: onFail, reason: avoid collision after fix types in other method */
            public void onFail2(List<MaterialResource> list, C1662010tLr c1662010tLr) {
                iFetchMaterialInfoListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void onFail(List<? extends MaterialResource> list, C1662010tLr c1662010tLr) {
                onFail2((List<MaterialResource>) list, c1662010tLr);
            }
        };
    }

    public static final C13MA<Boolean> toKNListener(final ICheckChannelListener iCheckChannelListener) {
        if (iCheckChannelListener == null) {
            return null;
        }
        return new C13MA<Boolean>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.7
            public void preProcess(boolean z) {
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
                onSuccess(bool.booleanValue());
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void preProcess(Boolean bool) {
                preProcess(bool.booleanValue());
            }

            public void onSuccess(boolean z) {
                iCheckChannelListener.checkChannelSuccess(z);
            }

            @Override // X.C13MA
            public void onFail(Boolean bool, C1662010tLr c1662010tLr) {
                iCheckChannelListener.checkChannelFailed(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<EffectListResponse> toKNListener(final IEffectListResponseListener iEffectListResponseListener) {
        if (iEffectListResponseListener == null) {
            return null;
        }
        return new C13MA<EffectListResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.23
            @Override // X.C13MA
            public void preProcess(EffectListResponse effectListResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(EffectListResponse effectListResponse) {
                iEffectListResponseListener.onSuccess(effectListResponse);
            }

            @Override // X.C13MA
            public void onFail(EffectListResponse effectListResponse, C1662010tLr c1662010tLr) {
                iEffectListResponseListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<AssetCategoryResponse> toKNListener(final IFetchAssetCategoryInfo iFetchAssetCategoryInfo) {
        if (iFetchAssetCategoryInfo == null) {
            return null;
        }
        return new C13MA<AssetCategoryResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.19
            @Override // X.C13MA
            public void preProcess(AssetCategoryResponse assetCategoryResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(AssetCategoryResponse assetCategoryResponse) {
                iFetchAssetCategoryInfo.onSuccess(assetCategoryResponse);
            }

            @Override // X.C13MA
            public void onFail(AssetCategoryResponse assetCategoryResponse, C1662010tLr c1662010tLr) {
                iFetchAssetCategoryInfo.onFailed(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<AssetItemResponse> toKNListener(final IFetchAssetItemInfo iFetchAssetItemInfo) {
        if (iFetchAssetItemInfo == null) {
            return null;
        }
        return new C13MA<AssetItemResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.20
            @Override // X.C13MA
            public void preProcess(AssetItemResponse assetItemResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(AssetItemResponse assetItemResponse) {
                iFetchAssetItemInfo.onSuccess(assetItemResponse);
            }

            @Override // X.C13MA
            public void onFail(AssetItemResponse assetItemResponse, C1662010tLr c1662010tLr) {
                iFetchAssetItemInfo.onFailed(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<AssetPanelResponse> toKNListener(final IFetchAssetPanelInfo iFetchAssetPanelInfo) {
        if (iFetchAssetPanelInfo == null) {
            return null;
        }
        return new C13MA<AssetPanelResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.21
            @Override // X.C13MA
            public void preProcess(AssetPanelResponse assetPanelResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(AssetPanelResponse assetPanelResponse) {
                iFetchAssetPanelInfo.onSuccess(assetPanelResponse);
            }

            @Override // X.C13MA
            public void onFail(AssetPanelResponse assetPanelResponse, C1662010tLr c1662010tLr) {
                iFetchAssetPanelInfo.onFailed(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<EffectListResponse> toKNListener(final IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        if (iFetchEffectListByIdsListener == null) {
            return null;
        }
        return new C13MA<EffectListResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.5
            @Override // X.C13MA
            public void preProcess(EffectListResponse effectListResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(EffectListResponse effectListResponse) {
                iFetchEffectListByIdsListener.onSuccess(effectListResponse);
            }

            @Override // X.C13MA
            public void onFail(EffectListResponse effectListResponse, C1662010tLr c1662010tLr) {
                iFetchEffectListByIdsListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<List<Effect>> toKNListener(final IFetchEffectListListener iFetchEffectListListener) {
        if (iFetchEffectListListener == null) {
            return null;
        }
        return new C13MA<List<? extends Effect>>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.4
            @Override // X.C13MA
            public void preProcess(List<? extends Effect> list) {
            }

            @Override // X.C13MA
            public void onSuccess(List<? extends Effect> list) {
                IFetchEffectListListener iFetchEffectListListener2 = iFetchEffectListListener;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<? extends Effect> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                iFetchEffectListListener2.onSuccess(arrayList);
            }

            @Override // X.C13MA
            public void onFail(List<? extends Effect> list, C1662010tLr c1662010tLr) {
                iFetchEffectListListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<FetchFavoriteListResponse> toKNListener(final IFetchFavoriteList iFetchFavoriteList) {
        if (iFetchFavoriteList == null) {
            return null;
        }
        return new C13MA<FetchFavoriteListResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.22
            @Override // X.C13MA
            public void preProcess(FetchFavoriteListResponse fetchFavoriteListResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
                iFetchFavoriteList.onSuccess(fetchFavoriteListResponse);
            }

            @Override // X.C13MA
            public void onFail(FetchFavoriteListResponse fetchFavoriteListResponse, C1662010tLr c1662010tLr) {
                iFetchFavoriteList.onFailed(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<QueryGradeEffectsByIdResponse> toKNListener(final IFetchGradeEffectListByIdsListener iFetchGradeEffectListByIdsListener) {
        if (iFetchGradeEffectListByIdsListener == null) {
            return null;
        }
        return new C13MA<QueryGradeEffectsByIdResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.6
            @Override // X.C13MA
            public void preProcess(QueryGradeEffectsByIdResponse queryGradeEffectsByIdResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(QueryGradeEffectsByIdResponse queryGradeEffectsByIdResponse) {
                iFetchGradeEffectListByIdsListener.onSuccess(queryGradeEffectsByIdResponse);
            }

            @Override // X.C13MA
            public void onFail(QueryGradeEffectsByIdResponse queryGradeEffectsByIdResponse, C1662010tLr c1662010tLr) {
                iFetchGradeEffectListByIdsListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<FetchHotEffectResponse> toKNListener(final IFetchHotEffectListener iFetchHotEffectListener) {
        if (iFetchHotEffectListener == null) {
            return null;
        }
        return new C13MA<FetchHotEffectResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.24
            @Override // X.C13MA
            public void preProcess(FetchHotEffectResponse fetchHotEffectResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(FetchHotEffectResponse fetchHotEffectResponse) {
                iFetchHotEffectListener.onSuccess(fetchHotEffectResponse);
            }

            @Override // X.C13MA
            public void onFail(FetchHotEffectResponse fetchHotEffectResponse, C1662010tLr c1662010tLr) {
                iFetchHotEffectListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<List<ModelInfo>> toKNListener(final IFetchModelInfoListListener iFetchModelInfoListListener) {
        if (iFetchModelInfoListListener == null) {
            return null;
        }
        return new C13MA<List<? extends ModelInfo>>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.18
            @Override // X.C13MA
            public void preProcess(List<? extends ModelInfo> list) {
            }

            @Override // X.C13MA
            public void onSuccess(List<? extends ModelInfo> list) {
                iFetchModelInfoListListener.onSuccess(list);
            }

            @Override // X.C13MA
            public void onFail(List<? extends ModelInfo> list, C1662010tLr c1662010tLr) {
                iFetchModelInfoListListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<ProviderEffectModel> toKNListener(final IFetchProviderEffect iFetchProviderEffect) {
        if (iFetchProviderEffect == null) {
            return null;
        }
        return new C13MA<ProviderEffectModel>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.13
            @Override // X.C13MA
            public void preProcess(ProviderEffectModel providerEffectModel) {
            }

            @Override // X.C13MA
            public void onSuccess(ProviderEffectModel providerEffectModel) {
                iFetchProviderEffect.onSuccess(providerEffectModel);
            }

            @Override // X.C13MA
            public void onFail(ProviderEffectModel providerEffectModel, C1662010tLr c1662010tLr) {
                iFetchProviderEffect.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<ResourceListModel> toKNListener(final IFetchResourceListener iFetchResourceListener) {
        if (iFetchResourceListener == null) {
            return null;
        }
        return new C13MA<ResourceListModel>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.25
            @Override // X.C13MA
            public void preProcess(ResourceListModel resourceListModel) {
            }

            @Override // X.C13MA
            public void onSuccess(ResourceListModel resourceListModel) {
                iFetchResourceListener.onSuccess(resourceListModel);
            }

            @Override // X.C13MA
            public void onFail(ResourceListModel resourceListModel, C1662010tLr c1662010tLr) {
                iFetchResourceListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<Boolean> toKNListener(final IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (iIsTagNeedUpdatedListener == null) {
            return null;
        }
        return new C13MA<Boolean>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.12
            public void preProcess(boolean z) {
            }

            public void onSuccess(boolean z) {
                if (z) {
                    iIsTagNeedUpdatedListener.onTagNeedUpdate();
                } else {
                    iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
                }
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void preProcess(Boolean bool) {
                preProcess(bool.booleanValue());
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
                onSuccess(bool.booleanValue());
            }

            @Override // X.C13MA
            public void onFail(Boolean bool, C1662010tLr c1662010tLr) {
                iIsTagNeedUpdatedListener.onTagNeedNotUpdate();
            }
        };
    }

    public static final C13MA<List<String>> toKNListener(final IModFavoriteList iModFavoriteList) {
        if (iModFavoriteList == null) {
            return null;
        }
        return new C13MA<List<? extends String>>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.17
            /* JADX INFO: renamed from: preProcess, reason: avoid collision after fix types in other method */
            public void preProcess2(List<String> list) {
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void onSuccess(List<? extends String> list) {
                onSuccess2((List<String>) list);
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void preProcess(List<? extends String> list) {
                preProcess2((List<String>) list);
            }

            /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
            public void onSuccess2(List<String> list) {
                iModFavoriteList.onSuccess(list);
            }

            /* JADX INFO: renamed from: onFail, reason: avoid collision after fix types in other method */
            public void onFail2(List<String> list, C1662010tLr c1662010tLr) {
                iModFavoriteList.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }

            @Override // X.C13MA
            public /* bridge */ /* synthetic */ void onFail(List<? extends String> list, C1662010tLr c1662010tLr) {
                onFail2((List<String>) list, c1662010tLr);
            }
        };
    }

    public static final C13MA toKNListener(final INothingListener iNothingListener) {
        if (iNothingListener == null) {
            return null;
        }
        return new C13MA() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.27
            @Override // X.C13MA
            public void preProcess(Void r1) {
            }

            @Override // X.C13MA
            public void onSuccess(Void r2) {
                iNothingListener.onSuccess(r2);
            }

            @Override // X.C13MA
            public void onFail(Void r3, C1662010tLr c1662010tLr) {
                iNothingListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<CustomizedEffectsResponse> toKNListener(final IQueryCustomizedEffectsListener iQueryCustomizedEffectsListener) {
        if (iQueryCustomizedEffectsListener == null) {
            return null;
        }
        return new C13MA<CustomizedEffectsResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.3
            @Override // X.C13MA
            public void preProcess(CustomizedEffectsResponse customizedEffectsResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(CustomizedEffectsResponse customizedEffectsResponse) {
                iQueryCustomizedEffectsListener.onSuccess(customizedEffectsResponse);
            }

            @Override // X.C13MA
            public void onFail(CustomizedEffectsResponse customizedEffectsResponse, C1662010tLr c1662010tLr) {
                iQueryCustomizedEffectsListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<QueryRewardEffectsResponse> toKNListener(final IRewardEffectsListener iRewardEffectsListener) {
        if (iRewardEffectsListener == null) {
            return null;
        }
        return new C13MA<QueryRewardEffectsResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.8
            @Override // X.C13MA
            public void preProcess(QueryRewardEffectsResponse queryRewardEffectsResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(QueryRewardEffectsResponse queryRewardEffectsResponse) {
                iRewardEffectsListener.onSuccess(queryRewardEffectsResponse);
            }

            @Override // X.C13MA
            public void onFail(QueryRewardEffectsResponse queryRewardEffectsResponse, C1662010tLr c1662010tLr) {
                iRewardEffectsListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<Effect> toKNListener(final IScanQRCodeListener iScanQRCodeListener) {
        if (iScanQRCodeListener == null) {
            return null;
        }
        return new C13MA<Effect>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.26
            @Override // X.C13MA
            public void preProcess(Effect effect) {
            }

            @Override // X.C13MA
            public void onSuccess(Effect effect) {
                iScanQRCodeListener.onSuccess(effect);
            }

            @Override // X.C13MA
            public void onFail(Effect effect, C1662010tLr c1662010tLr) {
                iScanQRCodeListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<SearchEffectResponse> toKNListener(final ISearchEffectListener iSearchEffectListener) {
        if (iSearchEffectListener == null) {
            return null;
        }
        return new C13MA<SearchEffectResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.9
            @Override // X.C13MA
            public void preProcess(SearchEffectResponse searchEffectResponse) {
            }

            @Override // X.C13MA
            public void onSuccess(SearchEffectResponse searchEffectResponse) {
                iSearchEffectListener.onSuccess(searchEffectResponse);
            }

            @Override // X.C13MA
            public void onFail(SearchEffectResponse searchEffectResponse, C1662010tLr c1662010tLr) {
                iSearchEffectListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<SearchEffectResponseV2> toKNListener(final ISearchEffectListenerV2 iSearchEffectListenerV2) {
        if (iSearchEffectListenerV2 == null) {
            return null;
        }
        return new C13MA<SearchEffectResponseV2>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.10
            @Override // X.C13MA
            public void preProcess(SearchEffectResponseV2 searchEffectResponseV2) {
            }

            @Override // X.C13MA
            public void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
                SearchEffectResponseV2 searchEffectResponseV22 = new SearchEffectResponseV2(null, null, 0, null);
                searchEffectResponseV22.setData(searchEffectResponseV2.getData());
                searchEffectResponseV22.setStatus_code(searchEffectResponseV2.getStatus_code());
                searchEffectResponseV22.setMessage(searchEffectResponseV2.getMessage());
                iSearchEffectListenerV2.onSuccess(searchEffectResponseV22);
            }

            @Override // X.C13MA
            public void onFail(SearchEffectResponseV2 searchEffectResponseV2, C1662010tLr c1662010tLr) {
                iSearchEffectListenerV2.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13PH toKNListener(final IUpdateTagListener iUpdateTagListener) {
        if (iUpdateTagListener == null) {
            return null;
        }
        return new C13PH() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.11
            @Override // X.C13PH
            public void onFinally() {
                iUpdateTagListener.onFinally();
            }
        };
    }

    public static final C13MA<CategoryPageModel> toKNListener(final IFetchCategoryEffectListener iFetchCategoryEffectListener, final C20001113Np c20001113Np) {
        if (iFetchCategoryEffectListener == null) {
            return null;
        }
        return new C13MA<CategoryPageModel>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.15
            @Override // X.C13MA
            public void preProcess(CategoryPageModel categoryPageModel) {
            }

            @Override // X.C13MA
            public void onSuccess(CategoryPageModel categoryPageModel) {
                if (DataPreProcess.enable) {
                    ListenerAdaptExtKt.preProcess(categoryPageModel, c20001113Np, new AwS609S0100000_30(iFetchCategoryEffectListener, 121));
                } else {
                    iFetchCategoryEffectListener.onSuccess(categoryPageModel);
                }
            }

            @Override // X.C13MA
            public void onFail(CategoryPageModel categoryPageModel, C1662010tLr c1662010tLr) {
                iFetchCategoryEffectListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<EffectChannelResponse> toKNListener(final IFetchEffectChannelListener iFetchEffectChannelListener, final C20001113Np c20001113Np) {
        if (iFetchEffectChannelListener == null) {
            return null;
        }
        return new C13MA<EffectChannelResponse>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.2
            @Override // X.C13MA
            public void onSuccess(EffectChannelResponse effectChannelResponse) {
                if (DataPreProcess.enable) {
                    ListenerAdaptExtKt.preProcess(effectChannelResponse, c20001113Np, new AwS609S0100000_30(iFetchEffectChannelListener, 123));
                } else {
                    iFetchEffectChannelListener.onSuccess(effectChannelResponse);
                }
            }

            @Override // X.C13MA
            public void preProcess(EffectChannelResponse effectChannelResponse) {
                if (!DataPreProcess.enableOptimize) {
                    EPLog.d("EFFECT_CALLBACK", "do preProcess close");
                } else {
                    EPLog.d("EFFECT_CALLBACK", "do preProcess");
                    effectChannelResponse.getAllCategoryEffects();
                }
            }

            @Override // X.C13MA
            public void onFail(EffectChannelResponse effectChannelResponse, C1662010tLr c1662010tLr) {
                iFetchEffectChannelListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final C13MA<PanelInfoModel> toKNListener(final IFetchPanelInfoListener iFetchPanelInfoListener, final C20001113Np c20001113Np) {
        if (iFetchPanelInfoListener == null) {
            return null;
        }
        return new C13MA<PanelInfoModel>() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.toKNListener.16
            @Override // X.C13MA
            public void preProcess(PanelInfoModel panelInfoModel) {
            }

            @Override // X.C13MA
            public void onSuccess(PanelInfoModel panelInfoModel) {
                if (DataPreProcess.enable) {
                    ListenerAdaptExtKt.preProcess(panelInfoModel, c20001113Np, new AwS609S0100000_30(iFetchPanelInfoListener, 122));
                } else {
                    iFetchPanelInfoListener.onSuccess(panelInfoModel);
                }
            }

            @Override // X.C13MA
            public void onFail(PanelInfoModel panelInfoModel, C1662010tLr c1662010tLr) {
                iFetchPanelInfoListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(c1662010tLr));
            }
        };
    }

    public static final void preProcess(CategoryPageModel categoryPageModel, C20001113Np c20001113Np, Function1<? super CategoryPageModel, Unit> function1) {
        if (c20001113Np != null) {
            commit(c20001113Np, categoryPageModel, AFwS274S0000000_30.get$arr$(229), function1);
        }
    }

    public static final void preProcess(EffectChannelResponse effectChannelResponse, C20001113Np c20001113Np, Function1<? super EffectChannelResponse, Unit> function1) {
        if (c20001113Np != null) {
            commit(c20001113Np, effectChannelResponse, AFwS266S0000000_25.get$arr$(266), function1);
        }
    }

    public static final void preProcess(PanelInfoModel panelInfoModel, C20001113Np c20001113Np, Function1<? super PanelInfoModel, Unit> function1) {
        if (c20001113Np != null) {
            commit(c20001113Np, panelInfoModel, AFwS274S0000000_30.get$arr$(230), function1);
        }
    }

    public static final <T, R> void commit(C20001113Np c20001113Np, final T t, final Function1<? super T, ? extends R> function1, final Function1<? super R, Unit> function12) {
        c20001113Np.LIZIZ(new InterfaceC20001313Nr() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt.commit.1
            public int level;
            public long modifyTime;
            public final String id = "";
            public String tag = "EffectManagerAdapter";

            @Override // X.InterfaceC20001313Nr
            public void cancel() {
            }

            @Override // X.InterfaceC20001313Nr
            public void pause(boolean z) {
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC20001313Nr
            public void run() {
                final Object objInvoke = function1.invoke(t);
                InterfaceC790780V0i interfaceC790780V0i = C13QI.LIZ;
                final Function1<R, Unit> function13 = function12;
                C13QI.LIZ(new Runnable() { // from class: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$commit$1$run$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("ListenerAdaptExtKt@d710.commit$1$run$1");
                        com_ss_android_ugc_effectmanager_knadapt_ListenerAdaptExtKt$commit$1$run$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("ListenerAdaptExtKt@d710.commit$1$run$1");
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    public final void com_ss_android_ugc_effectmanager_knadapt_ListenerAdaptExtKt$commit$1$run$1__run$___twin___() {
                        function13.invoke(objInvoke);
                    }

                    public static void com_ss_android_ugc_effectmanager_knadapt_ListenerAdaptExtKt$commit$1$run$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ListenerAdaptExtKt$commit$1$run$1 listenerAdaptExtKt$commit$1$run$1) {
                        try {
                            listenerAdaptExtKt$commit$1$run$1.com_ss_android_ugc_effectmanager_knadapt_ListenerAdaptExtKt$commit$1$run$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                });
            }

            @Override // X.InterfaceC20001313Nr
            public String getId() {
                return this.id;
            }

            @Override // X.InterfaceC20001313Nr
            public int getLevel() {
                return this.level;
            }

            @Override // X.InterfaceC20001313Nr
            public long getModifyTime() {
                return this.modifyTime;
            }

            public String getTag() {
                return this.tag;
            }

            @Override // X.InterfaceC20001313Nr
            public void setLevel(int i) {
                this.level = i;
            }

            @Override // X.InterfaceC20001313Nr
            public void setModifyTime(long j) {
                this.modifyTime = j;
            }

            @Override // X.InterfaceC20001313Nr
            public void setTag(String str) {
                this.tag = str;
            }
        });
    }
}

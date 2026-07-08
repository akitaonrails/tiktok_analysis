package com.ss.android.ugc.effectmanager;

import X.AbstractC20000013Ne;
import X.C13BV;
import X.C13LD;
import X.C13LP;
import X.C13M0;
import X.C13MA;
import X.C13MB;
import X.C13MG;
import X.C13NY;
import X.C13O1;
import X.C13O2;
import X.C13OD;
import X.C13OF;
import X.C13OO;
import X.C13OY;
import X.C13P0;
import X.C13P1;
import X.C13PH;
import X.C13R0;
import X.C13R6;
import X.C13RD;
import X.C13SB;
import X.C13SS;
import X.C1528550psb;
import X.C1662010tLr;
import X.C194402113w;
import X.C19995313Lj;
import X.C19996613Lw;
import X.C20000613Nk;
import X.C20001113Np;
import X.C20002413Oc;
import X.C20006913Pv;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C504670Jqj;
import X.InterfaceC20001313Nr;
import X.InterfaceC20004513Ox;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchGradeEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchModelInfoListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.INothingListener;
import com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetUtilsKt;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;
import com.ss.android.ugc.effectmanager.effect.model.FetchTemplateFavoriteListResponse;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.QueryGradeEffectsByIdResponse;
import com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService;
import com.ss.ugc.effectplatform.VEPluginNotLoadedExceptionInCKResources;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDResponse;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import com.ss.ugc.effectplatform.model.net.MaterialResourceListResponse;
import com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.ss.ugc.effectplatform.model.net.ResourceListResponse;
import com.ss.ugc.effectplatform.task.CategoryVersion;
import com.ss.ugc.effectplatform.task.FetchHorizontalEffectsTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public class EffectManager {
    public C13OY mEffectPlatform;

    public void onEnterScene(String str) {
    }

    public void cleanOthersCache() {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LIZIZ();
        }
    }

    public void clearCurrentEffectChannel() {
        ((C194402113w) this.mEffectPlatform.LJI.getValue()).LIZ = new EffectChannelResponse(null, null, null, null, new ArrayList(), new ArrayList(), new EffectPanelModel(null, null, new UrlModel(new ArrayList(), null, null, null, null), new ArrayList(), null, null), new ArrayList(), new ArrayList(), null, false);
    }

    public void clearEffects() {
        final C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        final String strLIZ = C1528550psb.LIZ();
        AbstractC20000013Ne abstractC20000013Ne = new AbstractC20000013Ne(strLIZ) { // from class: X.13P2
            @Override // X.AbstractC20000013Ne
            public final void onCancel() {
            }

            @Override // X.AbstractC20000013Ne
            public final void execute() {
                InterfaceC20004513Ox interfaceC20004513Ox = c13oy.LIZ.LJJIFFI;
                if (interfaceC20004513Ox != null) {
                    interfaceC20004513Ox.clear();
                }
                C2278408wI c2278408wI = C13P7.LIZ;
                c2278408wI.LIZ();
                try {
                    ((LinkedHashMap) C13P7.LIZIZ).clear();
                    C13P7.LIZJ.LIZJ(false);
                    c2278408wI.LIZIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c2278408wI.LIZIZ();
                    throw th;
                }
            }
        };
        C20001113Np c20001113Np = c13oy.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(abstractC20000013Ne);
        }
    }

    public void destroy() {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C20001113Np c20001113Np = c13oy.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            if (!c20001113Np.LIZLLL.isEmpty()) {
                for (Map.Entry<String, InterfaceC20001313Nr> entry : c20001113Np.LIZLLL.entrySet()) {
                    entry.getKey();
                    entry.getValue().cancel();
                }
            }
            c20001113Np.LIZLLL.clear();
        }
        c13oy.LIZ.LJJJI.getClass();
        C13MG.LIZJ.clear();
        c13oy.LIZ.LJJJIL.LIZ.clear();
    }

    public EffectChannelResponse getCurrentEffectChannel() {
        return ((C194402113w) this.mEffectPlatform.LJI.getValue()).LIZ;
    }

    public Pair<Long, Long> getEffectCacheSize() {
        Pair<Long, Long> pairLJIILLIIL;
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return new Pair<>(0L, 0L);
        }
        InterfaceC20004513Ox interfaceC20004513Ox = c13oy.LIZ.LJJIFFI;
        return (interfaceC20004513Ox == null || (pairLJIILLIIL = interfaceC20004513Ox.LJIILLIIL()) == null) ? new Pair<>(0L, 0L) : pairLJIILLIIL;
    }

    public void removeListener() {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LIZ.LJJJIL.LIZ.clear();
    }

    public C13OY getEffectPlatform() {
        return this.mEffectPlatform;
    }

    public C13OY getKNEffectPlatform() {
        return this.mEffectPlatform;
    }

    public void cancelEffectTask(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LIZ(effect);
        }
    }

    public void cleanDownloadedAssets(int[] iArr) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C19995313Lj c19995313Lj = (C19995313Lj) c13oy.LJIIZILJ().LIZIZ.getValue();
        c19995313Lj.getClass();
        if (iArr.length != 0) {
            InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(c19995313Lj.LIZ.LJJIJL);
            LinkedHashSet linkedHashSet = new LinkedHashSet(C2097908Jt.LIZIZ(iArr.length));
            for (int i : iArr) {
                linkedHashSet.add(Integer.valueOf(i));
            }
            Iterator it2 = C13LP.LLIIII(linkedHashSet).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("asset_");
                sbLIZ.append(iIntValue);
                sbLIZ.append("_.*");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cleanAssetResources assetType=");
                sbLIZ2.append(iIntValue);
                sbLIZ2.append(" pattern=");
                sbLIZ2.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss.getClass();
                C13SS.LIZ("MaterialResRepo", strLIZIZ2);
                if (interfaceC20004513OxLIZ != null) {
                    interfaceC20004513OxLIZ.LJIILL(strLIZIZ);
                }
            }
        }
    }

    public void clearCache(String str) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null && str != null) {
            InterfaceC20004513Ox interfaceC20004513Ox = c13oy.LIZ.LJJIFFI;
            if (interfaceC20004513Ox != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("effectchannel");
                sbLIZ.append(str);
                sbLIZ.append("(.*)");
                interfaceC20004513Ox.LJIILL(C2188811AlT.LIZIZ(sbLIZ));
            }
            InterfaceC20004513Ox interfaceC20004513Ox2 = c13oy.LIZ.LJJIFFI;
            if (interfaceC20004513Ox2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(C13SB.LIZ);
                sbLIZ2.append("effect_version(.*)");
                interfaceC20004513Ox2.LJIILL(C2188811AlT.LIZIZ(sbLIZ2));
            }
            InterfaceC20004513Ox interfaceC20004513Ox3 = c13oy.LIZ.LJJIFFI;
            if (interfaceC20004513Ox3 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(C13SB.LIZ);
                sbLIZ3.append("effectchannel(.*)");
                interfaceC20004513Ox3.LJIILL(C2188811AlT.LIZIZ(sbLIZ3));
            }
            InterfaceC20004513Ox interfaceC20004513Ox4 = c13oy.LIZ.LJJIFFI;
            if (interfaceC20004513Ox4 != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append(C13SB.LIZ);
                sbLIZ4.append("category_version(.*)");
                interfaceC20004513Ox4.LJIILL(C2188811AlT.LIZIZ(sbLIZ4));
            }
            InterfaceC20004513Ox interfaceC20004513Ox5 = c13oy.LIZ.LJJIFFI;
            if (interfaceC20004513Ox5 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("effectchannelinfosticker");
                sbLIZ5.append(str);
                sbLIZ5.append("(.*)");
                interfaceC20004513Ox5.LJIILL(C2188811AlT.LIZIZ(sbLIZ5));
            }
            InterfaceC20004513Ox interfaceC20004513Ox6 = c13oy.LIZ.LJJIFFI;
            if (interfaceC20004513Ox6 != null) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(str);
                sbLIZ6.append(C13SB.LIZ);
                sbLIZ6.append("info_sticker_version(.*)");
                interfaceC20004513Ox6.LJIILL(C2188811AlT.LIZIZ(sbLIZ6));
            }
            InterfaceC20004513Ox interfaceC20004513Ox7 = c13oy.LIZ.LJJIFFI;
            if (interfaceC20004513Ox7 != null) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("effect_version");
                sbLIZ7.append(str);
                interfaceC20004513Ox7.remove(C2188811AlT.LIZIZ(sbLIZ7));
            }
        }
    }

    public void clearVersion(String str) {
        InterfaceC20004513Ox interfaceC20004513Ox;
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null && (interfaceC20004513Ox = c13oy.LIZ.LJJIFFI) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("effect_version");
            sbLIZ.append(str);
            interfaceC20004513Ox.remove(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void deleteEffect(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        if (effect == null) {
            c13oy.getClass();
            return;
        }
        InterfaceC20004513Ox interfaceC20004513Ox = c13oy.LIZ.LJJIFFI;
        if (interfaceC20004513Ox != null) {
            interfaceC20004513Ox.remove(effect.getId());
        }
        InterfaceC20004513Ox interfaceC20004513Ox2 = c13oy.LIZ.LJJIFFI;
        if (interfaceC20004513Ox2 == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(effect.getId());
        sbLIZ.append(".zip");
        interfaceC20004513Ox2.remove(C2188811AlT.LIZIZ(sbLIZ));
    }

    public Pair<String, Boolean> getDownloadedAssetFilePath(Asset asset) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return null;
        }
        C19995313Lj c19995313Lj = (C19995313Lj) c13oy.LJIIZILJ().LIZIZ.getValue();
        c19995313Lj.getClass();
        MaterialResource materialResourceConvertToMaterialResource = AssetUtilsKt.convertToMaterialResource(asset);
        return c19995313Lj.LIZIZ(materialResourceConvertToMaterialResource.getResourceKey(), materialResourceConvertToMaterialResource.getUri());
    }

    public boolean init(EffectConfiguration effectConfiguration) {
        this.mEffectPlatform = new C13OY(effectConfiguration.getEffectConfig());
        return true;
    }

    public boolean isEffectDownloaded(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return false;
        }
        return c13oy.LJIJ(effect);
    }

    public boolean isEffectDownloading(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        c13oy.getClass();
        C13LD.LIZ.getClass();
        if (C13LD.LJI(effect)) {
            C13MG c13mg = c13oy.LIZ.LJJJI;
            String effect_id = effect.getEffect_id();
            c13mg.getClass();
            if (C13MG.LIZLLL(effect_id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isEffectReady(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return false;
        }
        return c13oy.LJIJI(effect);
    }

    public boolean isEffectReadyWithoutSDK(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return false;
        }
        return c13oy.LJIJ(effect);
    }

    public void markEffectUsed(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJIJJ(effect);
        }
    }

    public void markEffectUsedWithoutSDK(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markEffectUsedWithoutSDK: id: ");
            sbLIZ.append(effect.getEffect_id());
            sbLIZ.append(", name: ");
            sbLIZ.append(effect.getName());
            sbLIZ.append(", panel: ");
            sbLIZ.append(effect.getPanel());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("CKResource", strLIZIZ);
            c13oy.LJIILLIIL().LJIIIZ(effect);
        }
    }

    public void pauseEffectTask(Effect effect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJIL(effect);
        }
    }

    public void recommendSearchWords(C13MA<RecommendSearchWordsResponse> c13ma) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C20000613Nk c20000613NkLJIILLIIL = c13oy.LJIILLIIL();
        c20000613NkLJIILLIIL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c20000613NkLJIILLIIL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        final C13RD c13rd = c20000613NkLJIILLIIL.LIZ;
        C20001113Np c20001113Np = c13rd.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C13OD<RecommendSearchWordsResponse, RecommendSearchWordsResponse>(c13rd, strLIZ) { // from class: X.13O8
                public final C13RD LIZ;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10003;
                }

                @Override // X.C13OD
                public final C0XSU buildRequest() throws Throwable {
                    HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJJIIJZLJL);
                    this.LIZ.getClass();
                    sbLIZ.append("/effect/api");
                    sbLIZ.append("/search/recommend");
                    return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                    this.LIZ = c13rd;
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str, RecommendSearchWordsResponse.class);
                }
            });
        }
    }

    public long removeUnused(long j) {
        Pair<Integer, Long> pair;
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return 0L;
        }
        InterfaceC20004513Ox interfaceC20004513Ox = c13oy.LJIILLIIL().LIZ.LJJIFFI;
        if (interfaceC20004513Ox == null || (pair = interfaceC20004513Ox.LIZIZ(j)) == null) {
            pair = new Pair<>(0, 0L);
        }
        pair.getFirst().intValue();
        long jLongValue = pair.getSecond().longValue();
        Pair<Integer, Long> pairLIZIZ = c13oy.LJIILJJIL().LIZLLL.LIZIZ(j);
        pairLIZIZ.getFirst().intValue();
        long jLongValue2 = pairLIZIZ.getSecond().longValue();
        c13oy.LIZIZ();
        return jLongValue + jLongValue2;
    }

    public void triggerCacheClean(long j) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            InterfaceC20004513Ox interfaceC20004513Ox = c13oy.LJIILLIIL().LIZ.LJJIFFI;
            if (interfaceC20004513Ox != null) {
                interfaceC20004513Ox.LIZ(j);
            }
            c13oy.LJIILJJIL().LIZLLL.LIZ(j);
            c13oy.LIZIZ();
        }
    }

    public void checkPanelIsUpdate(String str, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 2, null, iCheckChannelListener);
    }

    public void checkedEffectListUpdate(String str, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 0, null, iCheckChannelListener);
    }

    public String downloadAsset(Asset asset, C13MA<String> c13ma) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return "";
        }
        C19995313Lj c19995313Lj = (C19995313Lj) c13oy.LJIIZILJ().LIZIZ.getValue();
        c19995313Lj.getClass();
        return c19995313Lj.LIZ(AssetUtilsKt.convertToMaterialResource(asset), c13ma);
    }

    public void downloadEffectList(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
        downloadEffectList(list, iFetchEffectListListener, null);
    }

    public void downloadMaterialResource(MaterialResource materialResource, C13MA<String> c13ma) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        ((C19995313Lj) c13oy.LJIIIIZZ.getValue()).LIZ(materialResource, c13ma);
    }

    public void downloadProviderEffect(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILLIIL().LIZJ(providerEffect, ListenerAdaptExtKt.toKNListener(iDownloadProviderEffectListener));
    }

    public void downloadProviderEffectWithoutSDK(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILLIIL().LIZJ(providerEffect, ListenerAdaptExtKt.toKNListener(iDownloadProviderEffectListener));
    }

    public void fetchEffect(EffectQRCode effectQRCode, IScanQRCodeListener iScanQRCodeListener) {
        boolean zLJI = MethodIDManager.LJI(137985);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C13MA<Effect> kNListener = ListenerAdaptExtKt.toKNListener(iScanQRCodeListener);
        c13oy.getClass();
        boolean zLJI2 = MethodIDManager.LJI(137867);
        c13oy.LJFF(effectQRCode, kNListener, false);
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchEffectList(List<String> list, IFetchEffectListListener iFetchEffectListListener) {
        boolean zLJI = MethodIDManager.LJI(137772);
        fetchEffectList(list, true, (Map<String, String>) null, iFetchEffectListListener);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchEffectListFromCache(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MB c13mb = new C13MB(c13oy, ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, c13oy.LIZ.LJJIIJ));
        if (!C504670Jqj.LIZIZ(str)) {
            c13oy.LJIILL().LIZJ(str, true, null, c13mb);
        } else {
            c13oy.LJIILL().LIZJ("default", true, null, c13mb);
        }
    }

    public void fetchEffectListFromCacheChecked(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MB c13mb = new C13MB(c13oy, ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, c13oy.LIZ.LJJIIJ));
        if (!C504670Jqj.LIZIZ(str)) {
            c13oy.LJIILL().LIZLLL(str, true, null, c13mb);
        } else {
            c13oy.LJIILL().LIZLLL("default", true, null, c13mb);
        }
    }

    public void fetchEffectWithoutSDK(Effect effect, IFetchEffectListener iFetchEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILLIIL().LIZLLL(effect, false, false, false, false, ListenerAdaptExtKt.toKNListener(iFetchEffectListener), true);
    }

    public void fetchExistEffectList(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, c13oy.LIZ.LJJIIJ);
        if (!C504670Jqj.LIZIZ(str)) {
            c13oy.LJIILL().LIZIZ(str, kNListener);
        } else {
            c13oy.LJIILL().LIZIZ("default", kNListener);
        }
    }

    public void fetchFavoriteList(String str, IFetchFavoriteList iFetchFavoriteList) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIIJ(str, null, ListenerAdaptExtKt.toKNListener(iFetchFavoriteList));
    }

    public void fetchModelInfoList(String str, IFetchModelInfoListListener iFetchModelInfoListListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null && str != null) {
            C13MA<List<ModelInfo>> kNListener = ListenerAdaptExtKt.toKNListener(iFetchModelInfoListListener);
            if (!C504670Jqj.LIZIZ(str) && kNListener != null) {
                C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
                c20002413OcLJIILL.getClass();
                String strLIZ = C1528550psb.LIZ();
                c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
                C20006913Pv c20006913Pv = new C20006913Pv(c20002413OcLJIILL.LIZ, str, strLIZ);
                C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
                if (c20001113Np != null) {
                    c20001113Np.LIZIZ(c20006913Pv);
                }
            }
        }
    }

    public void fetchResourceList(final Map<String, String> map, com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener iFetchResourceListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<ResourceListModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchResourceListener);
        C20000613Nk c20000613NkLJIILLIIL = c13oy.LJIILLIIL();
        c20000613NkLJIILLIIL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20000613NkLJIILLIIL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        final C13RD c13rd = c20000613NkLJIILLIIL.LIZ;
        C20001113Np c20001113Np = c13rd.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C13OD<ResourceListModel, ResourceListResponse>(c13rd, strLIZ, map) { // from class: X.13O9
                public final C13RD LIZ;
                public final Map<String, String> LIZIZ;

                @Override // X.C13OD
                public final C0XSU buildRequest() throws Throwable {
                    HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                    Map<String, String> map2 = this.LIZIZ;
                    if (map2 != null) {
                        mapLIZ.putAll(map2);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJJIIJZLJL);
                    this.LIZ.getClass();
                    sbLIZ.append("/effect/api");
                    sbLIZ.append("/moji/resource");
                    return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str, ResourceListResponse.class);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                    this.LIZ = c13rd;
                    this.LIZIZ = map;
                }
            });
        }
    }

    public Pair<String, Boolean> getDownloadedMaterialResourceFilePath(String str, String str2) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return null;
        }
        return ((C19995313Lj) c13oy.LJIIIIZZ.getValue()).LIZIZ(str, str2);
    }

    public void queryVideoUsedStickers(Map<String, String> map, IEffectListResponseListener iEffectListResponseListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iEffectListResponseListener);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        C13O1 c13o1 = new C13O1(c20002413OcLJIILL.LIZ, strLIZ, map);
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13o1);
        }
    }

    public void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
        boolean zLJI = MethodIDManager.LJI(137985);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            c13oy.LJ(effect, ListenerAdaptExtKt.toKNListener(iFetchEffectListener));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public void fetchEffectWithoutSDK(EffectQRCode effectQRCode, IScanQRCodeListener iScanQRCodeListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJFF(effectQRCode, ListenerAdaptExtKt.toKNListener(iScanQRCodeListener), true);
    }

    public void fetchEffect(String str, IFetchEffectListener iFetchEffectListener) {
        boolean zLJI = MethodIDManager.LJI(137985);
        fetchEffectWithDownload(str, null, iFetchEffectListener);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void checkCategoryIsUpdate(String str, String str2, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, str2, 1, null, iCheckChannelListener);
    }

    public void checkPanelIsUpdate(String str, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 2, map, iCheckChannelListener);
    }

    public void checkedEffectListUpdate(String str, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 0, map, iCheckChannelListener);
    }

    public void downloadEffectList(List<Effect> list, IFetchEffectListListener iFetchEffectListListener, DownloadEffectExtra downloadEffectExtra) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<List<Effect>> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListListener);
        c13oy.getClass();
        boolean zLJI = MethodIDManager.LJI(137865);
        ICKResourceVEPluginStatusService iCKResourceVEPluginStatusService = (ICKResourceVEPluginStatusService) PluggableExtentionKt.pluggableSpi$default(ICKResourceVEPluginStatusService.class, false, false, false, 14, null);
        if (iCKResourceVEPluginStatusService != null && iCKResourceVEPluginStatusService.LIZIZ()) {
            if (kNListener != null) {
                kNListener.onFail(null, new C1662010tLr(10031, new VEPluginNotLoadedExceptionInCKResources("downloadEffectList")));
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        ICKResourceVEPluginStatusService iCKResourceVEPluginStatusService2 = (ICKResourceVEPluginStatusService) PluggableExtentionKt.pluggableSpi$default(ICKResourceVEPluginStatusService.class, false, false, false, 14, null);
        if (iCKResourceVEPluginStatusService2 != null) {
            iCKResourceVEPluginStatusService2.LIZ();
        }
        c13oy.LJIILLIIL().LJFF(list, downloadEffectExtra, kNListener, false);
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }

    public void downloadEffectListWithoutSDK(List<Effect> list, IFetchEffectListListener iFetchEffectListListener, DownloadEffectExtra downloadEffectExtra) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILLIIL().LJFF(list, downloadEffectExtra, ListenerAdaptExtKt.toKNListener(iFetchEffectListListener), true);
    }

    public void fetchEffectFirst(Effect effect, boolean z, IFetchEffectListener iFetchEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJIILLIIL().LIZLLL(effect, false, true, z, false, ListenerAdaptExtKt.toKNListener(iFetchEffectListener), false);
        }
    }

    public void fetchEffectList(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        boolean zLJI = MethodIDManager.LJI(137772);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C13MA<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener);
        c13oy.getClass();
        boolean zLJI2 = MethodIDManager.LJI(202045);
        c13oy.LJIILLIIL().LJII(kNListener, list, map, false);
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchEffectList2(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        if (this.mEffectPlatform == null) {
            return;
        }
        this.mEffectPlatform.LJIIIIZZ(new ArrayList<>(list), map, ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener));
    }

    public void fetchEffectListWithoutSDK(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILLIIL().LJII(ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener), list, map, true);
    }

    public void fetchEffectWithDownload(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13NY kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListener);
        boolean zLJI = MethodIDManager.LJI(137867);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        c13oy.LJIIIZ(arrayList, true, map, new C13M0(kNListener), false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchEffectWithDownloadWithoutSDK(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13NY kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListener);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        c13oy.LJIIIZ(arrayList, true, map, new C13M0(kNListener), true);
    }

    public void fetchFavoriteList(String str, Map<String, String> map, IFetchFavoriteList iFetchFavoriteList) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIIJ(str, map, ListenerAdaptExtKt.toKNListener(iFetchFavoriteList));
    }

    public void fetchGradeEffectList(final List<String> list, final Map<String, String> map, IFetchGradeEffectListByIdsListener iFetchGradeEffectListByIdsListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<QueryGradeEffectsByIdResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchGradeEffectListByIdsListener);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            final C13RD c13rd = c20002413OcLJIILL.LIZ;
            c20001113Np.LIZIZ(new C13OD<QueryGradeEffectsByIdResponse, QueryGradeEffectsByIdResponse>(c13rd, strLIZ, list, map) { // from class: X.13O4
                public final C13RD LIZ;
                public final List<String> LIZIZ;
                public final Map<String, String> LIZJ;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10002;
                }

                @Override // X.C13OD
                public final C0XSU buildRequest() {
                    String strConvertObjToJson;
                    HashMap map2 = new HashMap();
                    map2.putAll(C13RE.LIZ(this.LIZ, true));
                    List<String> list2 = this.LIZIZ;
                    C13R7 c13r7 = this.LIZ.LJIJI;
                    if (c13r7 != null && (strConvertObjToJson = c13r7.LIZ.convertObjToJson(list2)) != null) {
                        map2.put("effect_ids", strConvertObjToJson);
                    }
                    Map<String, String> map3 = this.LIZJ;
                    if (map3 != null) {
                        map2.putAll(map3);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.LIZ.LJJIIJZLJL);
                    this.LIZ.getClass();
                    sb.append("/effect/api/grade/list");
                    return new C0XSU(C1535105zh.LIZ(map2, sb.toString()), null, C0XSV.GET, null, null, false, null, null, 1018);
                }

                @Override // X.C13OD
                public final int getRetryCount() {
                    return this.LIZ.LJIILL;
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str, QueryGradeEffectsByIdResponse.class);
                }

                @Override // X.C13OD
                public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
                    c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
                    super.onFailure(str, str2, c1662010tLr);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                    this.LIZ = c13rd;
                    this.LIZIZ = list;
                    this.LIZJ = map;
                }

                @Override // X.C13OD
                public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
                    QueryGradeEffectsByIdResponse queryGradeEffectsByIdResponse = (QueryGradeEffectsByIdResponse) c13oe;
                    for (List<Effect> list2 : queryGradeEffectsByIdResponse.getData().values()) {
                        C13LD c13ld = C13LD.LIZ;
                        String str = this.LIZ.LJII;
                        c13ld.getClass();
                        C13LD.LJIILIIL(str, "", "", list2);
                        if (this.LIZ.LJIJ == 2) {
                            C13LD.LJIILLIIL(queryGradeEffectsByIdResponse.getUrl_prefix(), list2);
                        }
                    }
                    super.onSuccess(j, j2, j3, queryGradeEffectsByIdResponse);
                }
            });
        }
    }

    public void fetchMaterialResourceInfo(final List<String> list, final Map<String, String> map, C13MA<List<MaterialResource>> c13ma) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C19995313Lj c19995313Lj = (C19995313Lj) c13oy.LJIIIIZZ.getValue();
        c19995313Lj.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c19995313Lj.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        final C13RD c13rd = c19995313Lj.LIZ;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C13OD<List<? extends MaterialResource>, MaterialResourceListResponse> c13od = new C13OD<List<? extends MaterialResource>, MaterialResourceListResponse>(c13rd, strLIZ, list, map) { // from class: X.13PW
            public final C13RD LIZ;
            public final List<String> LIZIZ;
            public final Map<String, String> LIZJ;
            public final String LIZLLL;

            @Override // X.C13OD
            public final C0XSU buildRequest() {
                HashMap map2 = new HashMap();
                map2.put("resource_key", C13LP.LJJLIIIJ(this.LIZIZ, ",", null, null, 0, null, null, 62));
                map2.put("access_key", "253cbc66f0020e93j00rpwjpvirxc02a7206");
                HashMap map3 = new HashMap();
                map3.put("ac", "WIFI");
                String str = this.LIZ.LIZLLL;
                if (str == null) {
                    str = "";
                }
                map3.put("device_id", str);
                map3.put("device_platform", "android");
                String str2 = this.LIZ.LJI;
                map3.put("device_type", str2 != null ? str2 : "");
                map3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
                map2.put("base_info", map3);
                Map<String, String> map4 = this.LIZJ;
                if (map4 != null) {
                    map2.putAll(map4);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJJIIJZLJL);
                sbLIZ.append(this.LIZLLL);
                return new C0XSU(C2188811AlT.LIZIZ(sbLIZ), null, C0XSV.POST, map2, "application/json", false, null, null, 970);
            }

            @Override // X.C13OD
            public final C13OE parseResponse(C13R7 c13r7, String str) {
                return (C13OE) c13r7.LIZ.convertJsonToObj(str, MaterialResourceListResponse.class);
            }

            {
                super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, c13rd);
                this.LIZ = c13rd;
                this.LIZIZ = list;
                this.LIZJ = map;
                this.LIZLLL = "/material/resource/api/resources";
            }
        };
        C20001113Np c20001113Np = c19995313Lj.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13od);
        }
    }

    public void fetchRecentUsedEffect(final String str, final Map<String, String> map, IFetchFavoriteList iFetchFavoriteList) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<FetchFavoriteListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchFavoriteList);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        final C13RD c13rd = c20002413OcLJIILL.LIZ;
        C13OD<FetchFavoriteListResponse, FetchFavoriteListResponse> c13od = new C13OD<FetchFavoriteListResponse, FetchFavoriteListResponse>(c13rd, str, strLIZ, map) { // from class: X.13OA
            public final C13RD LIZ;
            public final String LIZIZ;
            public final Map<String, String> LIZJ;

            @Override // X.C13OD
            public final int getFailCode() {
                return 10002;
            }

            @Override // X.C13OD
            public final C0XSU buildRequest() throws Throwable {
                HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                mapLIZ.put("panel", this.LIZIZ);
                Map<String, String> map2 = this.LIZJ;
                if (map2 != null) {
                    mapLIZ.putAll(map2);
                }
                C0XSV c0xsv = C0XSV.GET;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJJIIJZLJL);
                this.LIZ.getClass();
                sbLIZ.append("/effect/api");
                sbLIZ.append("/effect/user/effects");
                return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, c0xsv, null, null, false, null, null, 1018);
            }

            @Override // X.C13OD
            public final int getRetryCount() {
                return this.LIZ.LJIILL;
            }

            @Override // X.C13OD
            public final C13OE parseResponse(C13R7 c13r7, String str2) {
                return (C13OE) c13r7.LIZ.convertJsonToObj(str2, FetchFavoriteListResponse.class);
            }

            @Override // X.C13OD
            public final void onFailure(String str2, String str3, C1662010tLr c1662010tLr) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed: ");
                sbLIZ.append(c1662010tLr);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("QueryRecentUsedEffectTask", strLIZIZ, null);
                c1662010tLr.LIZ(str2, this.LIZ.LJJIIJZLJL, str3);
                super.onFailure(str2, str3, c1662010tLr);
                C13RD c13rd2 = this.LIZ;
                InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                if (interfaceC1633730scF != null) {
                    C19997513Mf.LIZ(interfaceC1633730scF, false, "recent_use_effect", c13rd2, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("panel", this.LIZIZ), new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ)), new Pair("url_path", "/effect/user/effects")), c1662010tLr.LIZIZ);
                }
            }

            {
                super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                this.LIZ = c13rd;
                this.LIZIZ = str;
                this.LIZJ = map;
            }

            @Override // X.C13OD
            public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
                FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) c13oe;
                if (fetchFavoriteListResponse.getData().isEmpty()) {
                    onFailure(null, null, new C1662010tLr(10022));
                    return;
                }
                for (Effect effect : fetchFavoriteListResponse.getEffect_list()) {
                    effect.setId(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
                }
                for (Effect effect2 : fetchFavoriteListResponse.getCollection_effects()) {
                    effect2.setId(u.LJJIFFI(u.LJJIFFI(effect2.getId(), "\"", "_", false), "/", "_", false));
                }
                C13LD c13ld = C13LD.LIZ;
                String str2 = this.LIZ.LJII;
                List<Effect> effect_list = fetchFavoriteListResponse.getEffect_list();
                c13ld.getClass();
                C13LD.LJIIIZ(str2, effect_list);
                C13LD.LJIIIZ(this.LIZ.LJII, fetchFavoriteListResponse.getCollection_effects());
                super.onSuccess(j, j2, j3, fetchFavoriteListResponse);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C13RD c13rd2 = this.LIZ;
                InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                if (interfaceC1633730scF == null) {
                    return;
                }
                C19997513Mf.LIZ(interfaceC1633730scF, true, "recent_use_effect", c13rd2, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("panel", this.LIZIZ), new Pair("duration", Long.valueOf(jCurrentTimeMillis - j)), new Pair("network_time", Long.valueOf(j2 - j)), new Pair("json_time", Long.valueOf(j3 - j2)), new Pair("io_time", Long.valueOf(jCurrentTimeMillis - j3)), new Pair("size", 0L), new Pair("url_path", "/effect/user/effects")), "");
            }
        };
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13od);
        }
    }

    public void getCustomizedEffectId(final long j, final Map<String, String> map, C13MA<GetCustomizedEffectIDData> c13ma) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            final C13RD c13rd = c20002413OcLJIILL.LIZ;
            c20001113Np.LIZIZ(new C13OD<GetCustomizedEffectIDData, GetCustomizedEffectIDResponse>(c13rd, j, strLIZ, map) { // from class: X.13Oz
                public final C13RD LIZ;
                public final long LIZIZ;
                public final Map<String, String> LIZJ;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10002;
                }

                @Override // X.C13OD
                public final C0XSU buildRequest() throws Throwable {
                    HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                    mapLIZ.put("aid", String.valueOf(this.LIZIZ));
                    Map<String, String> map2 = this.LIZJ;
                    if (map2 != null) {
                        mapLIZ.putAll(map2);
                    }
                    C0XSV c0xsv = C0XSV.GET;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJJIIJZLJL);
                    this.LIZ.getClass();
                    sbLIZ.append("/effect/api");
                    sbLIZ.append("/customized/id");
                    return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, c0xsv, null, null, false, null, null, 1018);
                }

                @Override // X.C13OD
                public final int getRetryCount() {
                    return this.LIZ.LJIILL;
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str, GetCustomizedEffectIDResponse.class);
                }

                @Override // X.C13OD
                public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
                    c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
                    super.onFailure(str, str2, c1662010tLr);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                    this.LIZ = c13rd;
                    this.LIZIZ = j;
                    this.LIZJ = map;
                }
            });
        }
    }

    public void isTagUpdated(final String str, final String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        final C13MA<Boolean> kNListener = ListenerAdaptExtKt.toKNListener(iIsTagNeedUpdatedListener);
        final C13P1 c13p1 = (C13P1) c13oy.LIZLLL.getValue();
        c13p1.getClass();
        String strLIZ = C1528550psb.LIZ();
        if (c13p1.LIZIZ == null) {
            c13p1.LIZ.LJJJIL.LIZIZ(strLIZ, new C13MA<HashMap<String, String>>() { // from class: X.13P3
                @Override // X.C13MA
                public final void onSuccess(HashMap<String, String> map) {
                    HashMap<String, String> map2 = map;
                    C13P1 c13p12 = c13p1;
                    if (c13p12.LIZIZ == null) {
                        c13p12.LIZIZ = new ConcurrentHashMap<>();
                    }
                    ConcurrentHashMap<String, String> concurrentHashMap = c13p1.LIZIZ;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.putAll(map2);
                    }
                    c13p1.LIZ(str, str2, kNListener);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(HashMap<String, String> map) {
                }

                @Override // X.C13MA
                public final void onFail(HashMap<String, String> map, C1662010tLr c1662010tLr) {
                    C13P1 c13p12 = c13p1;
                    if (c13p12.LIZIZ == null) {
                        c13p12.LIZIZ = new ConcurrentHashMap<>();
                    }
                    C13MA<Boolean> c13ma = kNListener;
                    if (c13ma != null) {
                        c13ma.onSuccess(Boolean.TRUE);
                    }
                }
            });
            C13R0 c13r0 = new C13R0(c13p1.LIZ, strLIZ);
            C20001113Np c20001113Np = c13p1.LIZ.LJJIIJ;
            if (c20001113Np != null) {
                c20001113Np.LIZIZ(c13r0);
                return;
            }
            return;
        }
        c13p1.LIZ(str, str2, kNListener);
    }

    public void resumeEffectTask(Effect effect, boolean z, boolean z2) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJJ(effect, z, z2);
        }
    }

    public void updateTag(final String str, final String str2, IUpdateTagListener iUpdateTagListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        final C13PH kNListener = ListenerAdaptExtKt.toKNListener(iUpdateTagListener);
        final C13P1 c13p1 = (C13P1) c13oy.LIZLLL.getValue();
        c13p1.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (c13p1.LIZIZ == null) {
            c13p1.LIZ.LJJJIL.LIZIZ(strLIZ, new C13MA<HashMap<String, String>>() { // from class: X.13P4
                @Override // X.C13MA
                public final void onSuccess(HashMap<String, String> map) {
                    HashMap<String, String> map2 = map;
                    C13P1 c13p12 = c13p1;
                    if (c13p12.LIZIZ == null) {
                        c13p12.LIZIZ = new ConcurrentHashMap<>();
                    }
                    ConcurrentHashMap<String, String> concurrentHashMap = c13p1.LIZIZ;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.putAll(map2);
                    }
                    c13p1.LIZIZ(strLIZ, str, str2, kNListener);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(HashMap<String, String> map) {
                }

                @Override // X.C13MA
                public final void onFail(HashMap<String, String> map, C1662010tLr c1662010tLr) {
                    C13P1 c13p12 = c13p1;
                    if (c13p12.LIZIZ == null) {
                        c13p12.LIZIZ = new ConcurrentHashMap<>();
                    }
                }
            });
            C13R0 c13r0 = new C13R0(c13p1.LIZ, strLIZ);
            C20001113Np c20001113Np = c13p1.LIZ.LJJIIJ;
            if (c20001113Np != null) {
                c20001113Np.LIZIZ(c13r0);
                return;
            }
            return;
        }
        c13p1.LIZIZ(strLIZ, str, str2, kNListener);
    }

    public void fetchEffectList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        boolean zLJI = MethodIDManager.LJI(137772);
        fetchEffectList(str, z, (Map<String, String>) null, iFetchEffectChannelListener);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchEffectList(List<String> list, boolean z, IFetchEffectListListener iFetchEffectListListener) {
        boolean zLJI = MethodIDManager.LJI(137772);
        fetchEffectList(list, z, (Map<String, String>) null, iFetchEffectListListener);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void checkCategoryIsUpdate(String str, String str2, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, str2, 1, map, iCheckChannelListener);
    }

    public AssetCategoryResponse fetchAssetCategoryInfFromCache(String str, String str2, int i, int i2) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            C13P0 c13p0LJIIZILJ = c13oy.LJIIZILJ();
            c13p0LJIIZILJ.getClass();
            return C13O2.LIZ(str, str2, i, i2, c13p0LJIIZILJ.LIZ);
        }
        return null;
    }

    public void fetchAssetItemInf(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo, IFetchAssetItemInfo iFetchAssetItemInfo) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            C13MA<AssetItemResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchAssetItemInfo);
            C13P0 c13p0LJIIZILJ = c13oy.LJIIZILJ();
            c13p0LJIIZILJ.getClass();
            String strLIZ = C1528550psb.LIZ();
            if (kNListener != null) {
                c13p0LJIIZILJ.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
            }
            C13R6 c13r6 = new C13R6(c13p0LJIIZILJ.LIZ, mixedAssetsQueryAdditionalParameters, str, mixedItemAssetsRequestBodyInfo, strLIZ);
            C20001113Np c20001113Np = c13p0LJIIZILJ.LIZ.LJJIIJ;
            if (c20001113Np != null) {
                c20001113Np.LIZIZ(c13r6);
            }
        }
    }

    public AssetPanelResponse fetchAssetPanelInfFromCache(String str, String str2, int i, int i2) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            C13P0 c13p0LJIIZILJ = c13oy.LJIIZILJ();
            c13p0LJIIZILJ.getClass();
            return C13O2.LIZIZ(str, str2, i, i2, c13p0LJIIZILJ.LIZ);
        }
        return null;
    }

    public void fetchEffectList(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        boolean zLJI = MethodIDManager.LJI(137772);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C13MA<List<Effect>> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListListener);
        c13oy.getClass();
        boolean zLJI2 = MethodIDManager.LJI(202043);
        c13oy.LJIIIZ(list, z, map, kNListener, false);
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchEffectListChecked(String str, boolean z, Map<String, String> map, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<EffectChannelResponse> c13maLIZJ = c13oy.LIZJ(z, ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, c13oy.LIZ.LJJIIJ), false);
        if (!C504670Jqj.LIZIZ(str)) {
            c13oy.LJIILL().LIZLLL(str, false, map, c13maLIZJ);
        } else {
            c13oy.LJIILL().LIZLLL("default", false, map, c13maLIZJ);
        }
    }

    public void fetchEffectListWithoutSDK(String str, boolean z, Map<String, String> map, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<EffectChannelResponse> c13maLIZJ = c13oy.LIZJ(z, ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, c13oy.LIZ.LJJIIJ), true);
        if (C504670Jqj.LIZIZ(str)) {
            str = "default";
        }
        c13oy.LJIILL().LIZJ(str, false, map, c13maLIZJ);
    }

    public void fetchHorizontalEffectsInfoFromCache(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, String str, int i) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        String strLIZ = C1528550psb.LIZ();
        c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        C13SS.LIZ.getClass();
        C13SS.LJ("effect_request_chine_tag", "fetchHorizontalEffectsInfoFromCache");
        C13OF c13of = new C13OF(map, c20002413OcLJIILL.LIZ, strLIZ, str, i);
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13of);
        }
    }

    public void fetchTemplateFavoriteList(final MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, final int i, final int i2, C13MA<FetchTemplateFavoriteListResponse.ResponseData> c13ma) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            C13P0 c13p0LJIIZILJ = c13oy.LJIIZILJ();
            c13p0LJIIZILJ.getClass();
            final String strLIZ = C1528550psb.LIZ();
            if (c13ma != null) {
                c13p0LJIIZILJ.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
            }
            final C13RD c13rd = c13p0LJIIZILJ.LIZ;
            C13OD<FetchTemplateFavoriteListResponse.ResponseData, FetchTemplateFavoriteListResponse> c13od = new C13OD<FetchTemplateFavoriteListResponse.ResponseData, FetchTemplateFavoriteListResponse>(c13rd, mixedAssetsQueryAdditionalParameters, i, i2, strLIZ) { // from class: X.13PP
                public final C13RD LIZ;
                public final MixedAssetsQueryAdditionalParameters LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;

                @Override // X.C13OD
                public final C0XSU buildRequest() throws Throwable {
                    HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                    mapLIZ.putAll(C13RC.LIZIZ(this.LIZIZ));
                    String str = C289070BUr.LIZ() ? "/asset/api/editing/relation/template/collect/list" : "/asset/relation/template/collect/list";
                    C0XSV c0xsv = C0XSV.POST;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJJIIJZLJL);
                    sbLIZ.append(str);
                    String strLIZ2 = C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ));
                    C13DA c13da = new C13DA();
                    c13da.put("cursor", Integer.valueOf(this.LIZJ));
                    c13da.put("count", Integer.valueOf(this.LIZLLL));
                    return new C0XSU(strLIZ2, null, c0xsv, c13da.build(), "application/json", true, null, null, 842);
                }

                @Override // X.C13OD
                public final int getRetryCount() {
                    return this.LIZ.LJIILL;
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str, FetchTemplateFavoriteListResponse.class);
                }

                @Override // X.C13OD
                public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
                    c1662010tLr.LIZ(str, this.LIZ.LJJIIJZLJL, str2);
                    super.onFailure(str, str2, c1662010tLr);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, c13rd);
                    this.LIZ = c13rd;
                    this.LIZIZ = mixedAssetsQueryAdditionalParameters;
                    this.LIZJ = i;
                    this.LIZLLL = i2;
                }
            };
            C20001113Np c20001113Np = c13p0LJIIZILJ.LIZ.LJJIIJ;
            if (c20001113Np != null) {
                c20001113Np.LIZIZ(c13od);
            }
        }
    }

    public void modifyFavoriteList(String str, String str2, Boolean bool, IModFavoriteList iModFavoriteList) {
        boolean zLJI = MethodIDManager.LJI(202188);
        if (this.mEffectPlatform == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            this.mEffectPlatform.LJIJJLI(str, arrayList, bool.booleanValue(), ListenerAdaptExtKt.toKNListener(iModFavoriteList));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public void fetchEffectList(String str, boolean z, Map<String, String> map, IFetchEffectChannelListener iFetchEffectChannelListener) {
        boolean zLJI = MethodIDManager.LJI(137772);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            c13oy.LJII(str, z, map, ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, c13oy.LIZ.LJJIIJ));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public void fetchEffectListWithoutSDK(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIIIZ(list, z, map, ListenerAdaptExtKt.toKNListener(iFetchEffectListListener), true);
    }

    public void modifyFavoriteList(String str, List<String> list, Boolean bool, IModFavoriteList iModFavoriteList) {
        boolean zLJI = MethodIDManager.LJI(202188);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            c13oy.LJIJJLI(str, list, bool.booleanValue(), ListenerAdaptExtKt.toKNListener(iModFavoriteList));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    private void checkUpdate(String str, String str2, int i, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        boolean zLJI = MethodIDManager.LJI(137383);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C13MA<Boolean> kNListener = ListenerAdaptExtKt.toKNListener(iCheckChannelListener);
        boolean zLJI2 = MethodIDManager.LJI(202037);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        C13OO c13oo = new C13OO(c20002413OcLJIILL.LIZ, strLIZ, str, str2, i, map);
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13oo);
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchEffectExt(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        boolean zLJI = MethodIDManager.LJI(137776);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJI(effect, z, z2, z3, ListenerAdaptExtKt.toKNListener(iFetchEffectListener));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchEffectExtWithoutSDK(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJIILLIIL().LIZLLL(effect, false, z, z2, z3, ListenerAdaptExtKt.toKNListener(iFetchEffectListener), true);
        }
    }

    public void fetchHotEffect(final int i, final int i2, final Map<String, String> map, boolean z, IFetchHotEffectListener iFetchHotEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<FetchHotEffectResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchHotEffectListener);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        final C13RD c13rd = c20002413OcLJIILL.LIZ;
        C13OD<FetchHotEffectResponse, FetchHotEffectResponse> c13od = new C13OD<FetchHotEffectResponse, FetchHotEffectResponse>(c13rd, i, i2, strLIZ, map) { // from class: X.13OC
            public final C13RD LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final Map<String, String> LIZLLL;

            @Override // X.C13OD
            public final C0XSU buildRequest() throws Throwable {
                HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                mapLIZ.put("cursor", String.valueOf(this.LIZJ));
                mapLIZ.put("count", String.valueOf(this.LIZIZ));
                mapLIZ.put("panel", "default");
                Map<String, String> map2 = this.LIZLLL;
                if (map2 != null) {
                    mapLIZ.putAll(map2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJJIIJZLJL);
                this.LIZ.getClass();
                sbLIZ.append("/effect/api");
                sbLIZ.append("/hoteffects");
                return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, null, null, null, false, null, null, 1022);
            }

            /* JADX WARN: Removed duplicated region for block: B:104:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:106:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0171  */
            @Override // X.C13OD, X.AbstractC20000013Ne
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void execute() {
                /*
                    Method dump skipped, instruction units count: 395
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C13OC.execute():void");
            }

            @Override // X.C13OD
            public final C13OE parseResponse(C13R7 c13r7, String str) {
                return (C13OE) c13r7.LIZ.convertJsonToObj(str, FetchHotEffectResponse.class);
            }

            @Override // X.C13OD
            /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
            public final void onSuccess(long j, long j2, long j3, FetchHotEffectResponse fetchHotEffectResponse) {
                String strConvertObjToJson;
                InterfaceC20004513Ox interfaceC20004513Ox;
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<Effect> effect_list = fetchHotEffectResponse.getEffect_list();
                if (effect_list != null) {
                    for (Effect effect : effect_list) {
                        effect.setId(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
                    }
                }
                List<Effect> collection_list = fetchHotEffectResponse.getCollection_list();
                if (collection_list != null) {
                    for (Effect effect2 : collection_list) {
                        effect2.setId(u.LJJIFFI(u.LJJIFFI(effect2.getId(), "\"", "_", false), "/", "_", false));
                    }
                }
                C13LD c13ld = C13LD.LIZ;
                String str = this.LIZ.LJII;
                List<Effect> effect_list2 = fetchHotEffectResponse.getEffect_list();
                c13ld.getClass();
                C13LD.LJIIIZ(str, effect_list2);
                C13LD.LJIIIZ(this.LIZ.LJII, fetchHotEffectResponse.getCollection_list());
                C13LD.LJIILLIIL(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getEffect_list());
                C13LD.LJIILLIIL(fetchHotEffectResponse.getUrlPrefix(), fetchHotEffectResponse.getCollection_list());
                C13LD.LJIIJJI(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getEffect_list());
                C13LD.LJIIJJI(fetchHotEffectResponse.getRecId(), fetchHotEffectResponse.getCollection_list());
                C13RD c13rd2 = this.LIZ;
                InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                if (interfaceC1633730scF != null) {
                    C19997513Mf.LIZ(interfaceC1633730scF, true, "hot", c13rd2, C2097608Jq.LJIIIIZZ(new Pair("log_id", this.logId), new Pair("duration", Long.valueOf(jCurrentTimeMillis - j)), new Pair("network_time", Long.valueOf(j2 - j)), new Pair("json_time", Long.valueOf(j3 - j2)), new Pair("url_path", "/hoteffects")), "");
                }
                super.onSuccess(j, j2, j3, fetchHotEffectResponse);
                try {
                    try {
                        C13R7 c13r7 = this.LIZ.LJIJI;
                        if (c13r7 != null && (strConvertObjToJson = c13r7.LIZ.convertObjToJson(fetchHotEffectResponse)) != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                            interfaceC20004513Ox.LJIIJ("effectgalleryhot", strConvertObjToJson, "");
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("saveHotEffectList: ");
                        sbLIZ.append(e);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZIZ("FetchHotEffectListTask", strLIZIZ, null);
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }

            {
                super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                this.LIZ = c13rd;
                this.LIZIZ = i;
                this.LIZJ = i2;
                this.LIZLLL = map;
            }
        };
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13od);
        }
    }

    public void fetchProviderEffect(String str, boolean z, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        fetchProviderEffect(str, z, i, i2, null, null, null, iFetchProviderEffect);
    }

    public void fetchProviderEffectsByGiphyIds(String str, String str2, Map<String, String> map, boolean z, C13MA<GifProviderEffectListResponse> c13ma) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILLIIL().LJIIIIZZ(str, str2, map, z, c13ma);
    }

    public void fetchProviderEffectsByGiphyIdsWithoutSDK(String str, String str2, Map<String, String> map, boolean z, C13MA<GifProviderEffectListResponse> c13ma) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILLIIL().LJIIIIZZ(str, str2, map, z, c13ma);
    }

    public void fetchRewardEffects(final String str, final int i, final int i2, final Map<String, String> map, IRewardEffectsListener iRewardEffectsListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<QueryRewardEffectsResponse> kNListener = ListenerAdaptExtKt.toKNListener(iRewardEffectsListener);
        boolean zLJI = MethodIDManager.LJI(202451);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            final C13RD c13rd = c20002413OcLJIILL.LIZ;
            c20001113Np.LIZIZ(new C13OD<QueryRewardEffectsResponse, QueryRewardEffectsResponse>(c13rd, str, strLIZ, i, i2, map) { // from class: X.13O6
                public final C13RD LIZ;
                public final String LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;
                public final Map<String, String> LJ;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10002;
                }

                @Override // X.C13OD
                public final C0XSU buildRequest() throws Throwable {
                    HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                    mapLIZ.put("panel", this.LIZIZ);
                    mapLIZ.put("cursor", String.valueOf(this.LIZLLL));
                    mapLIZ.put("count", String.valueOf(this.LIZJ));
                    Map<String, String> map2 = this.LJ;
                    if (map2 != null) {
                        mapLIZ.putAll(map2);
                    }
                    C0XSV c0xsv = C0XSV.GET;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJJIIJZLJL);
                    this.LIZ.getClass();
                    sbLIZ.append("/effect/api");
                    sbLIZ.append("/v3/effect/reward");
                    return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, c0xsv, null, null, false, null, null, 1018);
                }

                @Override // X.C13OD
                public final int getRetryCount() {
                    return this.LIZ.LJIILL;
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str2) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str2, QueryRewardEffectsResponse.class);
                }

                @Override // X.C13OD
                public final void onFailure(String str2, String str3, C1662010tLr c1662010tLr) {
                    c1662010tLr.LIZ(str2, this.LIZ.LJJIIJZLJL, str3);
                    super.onFailure(str2, str3, c1662010tLr);
                }

                @Override // X.C13OD
                public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
                    QueryRewardEffectsResponse queryRewardEffectsResponse = (QueryRewardEffectsResponse) c13oe;
                    C13LD c13ld = C13LD.LIZ;
                    String str2 = this.LIZ.LJII;
                    String str3 = this.LIZIZ;
                    List<Effect> reward_effects = queryRewardEffectsResponse.getReward_effects();
                    c13ld.getClass();
                    C13LD.LJIILIIL(str2, str3, "", reward_effects);
                    if (this.LIZ.LJIJ == 2) {
                        C13LD.LJIILLIIL(queryRewardEffectsResponse.getUrl_prefix(), queryRewardEffectsResponse.getReward_effects());
                    }
                    super.onSuccess(j, j2, j3, queryRewardEffectsResponse);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                    this.LIZ = c13rd;
                    this.LIZIZ = str;
                    this.LIZJ = i;
                    this.LIZLLL = i2;
                    this.LJ = map;
                }
            });
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchHorizontalEffectsInfo(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, String str, String str2, int i, Map<String, String> map2) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        String strLIZ = C1528550psb.LIZ();
        c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        FetchHorizontalEffectsTask fetchHorizontalEffectsTask = new FetchHorizontalEffectsTask(map, c20002413OcLJIILL.LIZ, strLIZ, str, str2, i, map2);
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(fetchHorizontalEffectsTask);
        }
    }

    public void fetchPanelInfoFromCache(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        fetchPanelInfoFromCache(str, z, str2, i, i2, 0, iFetchPanelInfoListener);
    }

    public void fetchPanelInfoFromCacheChecked(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIIL(str, z, str2, i, i2, true, null, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, c13oy.LIZ.LJJIIJ));
    }

    public void searchEffect(final String str, final String str2, final int i, final int i2, final Map<String, String> map, ISearchEffectListener iSearchEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<SearchEffectResponse> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListener);
        C20000613Nk c20000613NkLJIILLIIL = c13oy.LJIILLIIL();
        c20000613NkLJIILLIIL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20000613NkLJIILLIIL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        final C13RD c13rd = c20000613NkLJIILLIIL.LIZ;
        C20001113Np c20001113Np = c13rd.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C13OD<SearchEffectResponse, SearchEffectResponse>(c13rd, str, str2, i, i2, map, strLIZ) { // from class: X.13Nv
                public final C13RD LIZ;
                public final String LIZIZ;
                public final String LIZJ;
                public final int LIZLLL;
                public final int LJ;
                public final Map<String, String> LJFF;

                @Override // X.C13OD
                public final int getFailCode() {
                    return 10014;
                }

                @Override // X.C13OD
                public final C0XSU buildRequest() throws Throwable {
                    HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                    mapLIZ.put("panel", this.LIZIZ);
                    mapLIZ.put("keyword", this.LIZJ);
                    mapLIZ.put("cursor", String.valueOf(this.LJ));
                    mapLIZ.put("count", String.valueOf(this.LIZLLL));
                    Map<String, String> map2 = this.LJFF;
                    if (map2 != null) {
                        mapLIZ.putAll(map2);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJJIIJZLJL);
                    this.LIZ.getClass();
                    sbLIZ.append("/effect/api");
                    sbLIZ.append("/search");
                    return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
                }

                @Override // X.C13OD
                public final C13OE parseResponse(C13R7 c13r7, String str3) {
                    return (C13OE) c13r7.LIZ.convertJsonToObj(str3, SearchEffectResponse.class);
                }

                @Override // X.C13OD
                public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
                    SearchEffectResponse searchEffectResponse = (SearchEffectResponse) c13oe;
                    C13LD c13ld = C13LD.LIZ;
                    String str3 = this.LIZ.LJII;
                    String str4 = this.LIZIZ;
                    List<Effect> effect_list = searchEffectResponse.getEffect_list();
                    c13ld.getClass();
                    C13LD.LJIILIIL(str3, str4, "", effect_list);
                    C13LD.LJIILIIL(this.LIZ.LJII, this.LIZIZ, "", searchEffectResponse.getCollection_list());
                    C13LD.LJIILIIL(this.LIZ.LJII, this.LIZIZ, "", searchEffectResponse.getBind_effects());
                    super.onSuccess(j, j2, j3, searchEffectResponse);
                }

                {
                    super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                    this.LIZ = c13rd;
                    this.LIZIZ = str;
                    this.LIZJ = str2;
                    this.LIZLLL = i;
                    this.LJ = i2;
                    this.LJFF = map;
                }
            });
        }
    }

    public void searchProviderEffect(String str, String str2, int i, int i2, boolean z, IFetchProviderEffect iFetchProviderEffect) {
        searchProviderEffect(str, str2, i, i2, z, null, null, iFetchProviderEffect);
    }

    public void updateUsedEffect(String str, List<String> list, boolean z, long j, Map<String, String> map, INothingListener iNothingListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJJI(str, list, z, j, map, ListenerAdaptExtKt.toKNListener(iNothingListener));
    }

    public void fetchAutoCutAssetPanelInf(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetPanelInfo iFetchAssetPanelInfo) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            ((C13P0) c13oy.LJIIIZ.getValue()).LIZIZ(mixedAssetsQueryAdditionalParameters, str, str2, i, i2, mixedAssetsRequestBodyInfo, false, ListenerAdaptExtKt.toKNListener(iFetchAssetPanelInfo));
        }
    }

    public void fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LIZLLL(str, str2, i, i2, i3, str3, 0, null, ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, c13oy.LIZ.LJJIIJ));
    }

    public void fetchCategoryEffectFromCache(String str, String str2, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        fetchCategoryEffectFromCache(str, str2, i, i2, i3, str3, 0, iFetchCategoryEffectListener);
    }

    public void fetchPanelInfo(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener, Map<String, String> map) {
        boolean zLJI = MethodIDManager.LJI(138042);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            c13oy.LJIIJJI(str, z, str2, i, i2, 0, map, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, c13oy.LIZ.LJJIIJ));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public void fetchPanelInfoChecked(String str, boolean z, String str2, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIIL(str, z, str2, i, i2, false, map, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, c13oy.LIZ.LJJIIJ));
    }

    public void fetchPanelInfoFromCache(String str, boolean z, String str2, int i, int i2, int i3, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILL().LJ(str, z, str2, i, i2, true, i3, null, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, c13oy.LIZ.LJJIIJ));
    }

    public void searchEffects(String str, String str2, int i, int i2, Map<String, String> map, int i3, ISearchEffectListenerV2 iSearchEffectListenerV2) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILLIIL().LJIIJ(i, i2, i3, ListenerAdaptExtKt.toKNListener(iSearchEffectListenerV2), str, str2, null, map);
    }

    public void fetchAssetCategoryInf(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, String str3, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetCategoryInfo iFetchAssetCategoryInfo) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJIIZILJ().LIZ(mixedAssetsQueryAdditionalParameters, str, str2, str3, i, i2, mixedAssetsRequestBodyInfo, ListenerAdaptExtKt.toKNListener(iFetchAssetCategoryInfo));
        }
    }

    public void fetchAssetPanelInf(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, boolean z, IFetchAssetPanelInfo iFetchAssetPanelInfo) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            C13MA<AssetPanelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchAssetPanelInfo);
            boolean zLJI = MethodIDManager.LJI(202452);
            c13oy.LJIIZILJ().LIZIZ(mixedAssetsQueryAdditionalParameters, str, str2, i, i2, mixedAssetsRequestBodyInfo, z, kNListener);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public void fetchAutoCutAssetCategoryInf(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, String str3, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetCategoryInfo iFetchAssetCategoryInfo) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            ((C13P0) c13oy.LJIIIZ.getValue()).LIZ(mixedAssetsQueryAdditionalParameters, str, str2, str3, i, i2, mixedAssetsRequestBodyInfo, ListenerAdaptExtKt.toKNListener(iFetchAssetCategoryInfo));
        }
    }

    public void fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, Map<String, String> map, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        fetchCategoryEffect(str, str2, i, i2, i3, str3, 0, map, iFetchCategoryEffectListener);
    }

    public void fetchCategoryEffectFromCache(String str, String str2, int i, int i2, int i3, String str3, int i4, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LJIILL().LIZ(str, str2, i, i2, i3, str3, true, i4, null, ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, c13oy.LIZ.LJJIIJ));
    }

    public void fetchCategoryPagingEffect(final String str, final String str2, final int i, final int i2, final int i3, final String str3, final Map<String, String> map, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, c13oy.LIZ.LJJIIJ);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        final C13RD c13rd = c20002413OcLJIILL.LIZ;
        C13OD<CategoryPageModel, CategoryEffectListResponse> c13od = new C13OD<CategoryPageModel, CategoryEffectListResponse>(i, i2, i3, c13rd, str, strLIZ, str2, str3, map) { // from class: X.13ON
            public final C13RD LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final int LIZLLL;
            public final int LJ;
            public final int LJFF;
            public final String LJI;
            public final Map<String, String> LJII;

            @Override // X.C13OD
            public final int getFailCode() {
                return 10002;
            }

            @Override // X.C13OD
            public final C0XSU buildRequest() throws Throwable {
                HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                mapLIZ.put("panel", this.LIZIZ);
                String str4 = this.LIZJ;
                if (str4 == null) {
                    str4 = "hot";
                }
                mapLIZ.put("category", str4);
                mapLIZ.put("cursor", String.valueOf(this.LJ));
                mapLIZ.put("count", String.valueOf(this.LIZLLL));
                mapLIZ.put("sorting_position", String.valueOf(this.LJFF));
                String str5 = this.LJI;
                if (str5 == null) {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                mapLIZ.put("version", str5);
                String str6 = this.LIZ.LJJIII;
                if (str6 != null) {
                    mapLIZ.put("test_status", str6);
                }
                Map<String, String> map2 = this.LJII;
                if (map2 != null) {
                    mapLIZ.putAll(map2);
                }
                C0XSV c0xsv = C0XSV.GET;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJJIIJZLJL);
                this.LIZ.getClass();
                sbLIZ.append("/effect/api");
                sbLIZ.append("/category/page/effects");
                return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, c0xsv, null, null, false, null, null, 1018);
            }

            @Override // X.C13OD
            public final int getRetryCount() {
                return this.LIZ.LJIILL;
            }

            public final long LIZ(CategoryEffectListResponse categoryEffectListResponse) {
                long length;
                C13R7 c13r7;
                String strConvertObjToJson;
                try {
                    c13r7 = this.LIZ.LJIJI;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Json Exception: ");
                    sbLIZ.append(e);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZIZ("FetchCategoryPagingEffectTask", strLIZIZ, null);
                }
                if (c13r7 != null && (strConvertObjToJson = c13r7.LIZ.convertObjToJson(categoryEffectListResponse)) != null) {
                    length = strConvertObjToJson.length();
                } else {
                    length = 0;
                }
                return length / ((long) 1024);
            }

            @Override // X.C13OD
            public final C13OE parseResponse(C13R7 c13r7, String str4) {
                return (C13OE) c13r7.LIZ.convertJsonToObj(str4, CategoryEffectListResponse.class);
            }

            public final long LIZIZ(String str4, CategoryEffectListResponse categoryEffectListResponse, CategoryVersion categoryVersion) {
                String strConvertObjToJson;
                InterfaceC20004513Ox interfaceC20004513Ox;
                boolean z;
                String strConvertObjToJson2;
                long jLJIIJ;
                long jLJIIJ2;
                String strLJ = C13OQ.LJ(this.LIZLLL, this.LJ, this.LJFF, 0, this.LIZIZ, this.LIZJ);
                long j = 0;
                try {
                    if (str4.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && this.isJsonOptimize) {
                        InterfaceC20004513Ox interfaceC20004513Ox2 = this.LIZ.LJJIFFI;
                        if (interfaceC20004513Ox2 != null) {
                            jLJIIJ2 = interfaceC20004513Ox2.LJIIJ(strLJ, str4, "");
                        } else {
                            jLJIIJ2 = 0;
                        }
                        j = jLJIIJ2 / ((long) 1024);
                    } else {
                        C13R7 c13r7 = this.LIZ.LJIJI;
                        if (c13r7 != null && (strConvertObjToJson2 = c13r7.LIZ.convertObjToJson(categoryEffectListResponse)) != null) {
                            InterfaceC20004513Ox interfaceC20004513Ox3 = this.LIZ.LJJIFFI;
                            if (interfaceC20004513Ox3 != null) {
                                jLJIIJ = interfaceC20004513Ox3.LJIIJ(strLJ, strConvertObjToJson2, "");
                            } else {
                                jLJIIJ = 0;
                            }
                            j = jLJIIJ / ((long) 1024);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Json Exception: ");
                    sbLIZ.append(e);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZIZ("FetchCategoryPagingEffectTask", strLIZIZ, null);
                }
                try {
                    C13R7 c13r72 = this.LIZ.LJIJI;
                    if (c13r72 != null && (strConvertObjToJson = c13r72.LIZ.convertObjToJson(categoryVersion)) != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                        interfaceC20004513Ox.LJIIJ(C13OQ.LJFF(this.LIZIZ, this.LIZJ), strConvertObjToJson, "");
                        return j;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Json Exception: ");
                    sbLIZ2.append(e2);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss2.getClass();
                    C13SS.LIZIZ("FetchCategoryPagingEffectTask", strLIZIZ2, null);
                }
                return j;
            }

            /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
            /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
            @Override // X.C13OD
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onFailure(java.lang.String r23, java.lang.String r24, X.C1662010tLr r25) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 383
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C13ON.onFailure(java.lang.String, java.lang.String, X.0tLr):void");
            }

            @Override // X.C13OD
            public final void onSuccess(long j, long j2, long j3, String str4, C13OE c13oe) {
                String version;
                int cursor;
                int sorting_position;
                long jLIZ;
                long jCurrentTimeMillis;
                CategoryEffectModel category_effects;
                CategoryEffectModel category_effects2;
                CategoryEffectModel category_effects3;
                CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) c13oe;
                CategoryPageModel data = categoryEffectListResponse.getData();
                if (data != null) {
                    C13LD c13ld = C13LD.LIZ;
                    C13RD c13rd2 = this.LIZ;
                    String str5 = this.LIZIZ;
                    String str6 = this.logId;
                    c13ld.getClass();
                    C13LD.LIZJ(c13rd2, str5, data, true, str6);
                    CategoryPageModel data2 = categoryEffectListResponse.getData();
                    if (data2 == null || (category_effects3 = data2.getCategory_effects()) == null || (version = category_effects3.getVersion()) == null) {
                        version = CardStruct.IStatusCode.DEFAULT;
                    }
                    CategoryPageModel data3 = categoryEffectListResponse.getData();
                    if (data3 != null && (category_effects2 = data3.getCategory_effects()) != null) {
                        cursor = category_effects2.getCursor();
                    } else {
                        cursor = 0;
                    }
                    CategoryPageModel data4 = categoryEffectListResponse.getData();
                    if (data4 != null && (category_effects = data4.getCategory_effects()) != null) {
                        sorting_position = category_effects.getSorting_position();
                    } else {
                        sorting_position = 0;
                    }
                    CategoryVersion categoryVersion = new CategoryVersion(version, cursor, sorting_position, this.logId);
                    if (this.isJsonOptimize) {
                        super.onSuccess(j, j2, j3, categoryEffectListResponse);
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (this.LJ == 0) {
                            jLIZ = LIZIZ(str4, categoryEffectListResponse, categoryVersion);
                        } else {
                            jLIZ = LIZ(categoryEffectListResponse);
                        }
                    } else {
                        if (this.LJ == 0) {
                            jLIZ = LIZIZ(str4, categoryEffectListResponse, categoryVersion);
                        } else {
                            jLIZ = LIZ(categoryEffectListResponse);
                        }
                        super.onSuccess(j, j2, j3, categoryEffectListResponse);
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    C13RD c13rd3 = this.LIZ;
                    InterfaceC1633730scF interfaceC1633730scF = c13rd3.LJIJJLI;
                    if (interfaceC1633730scF != null) {
                        Pair[] pairArr = new Pair[9];
                        pairArr[0] = new Pair("log_id", this.logId);
                        pairArr[1] = new Pair("panel", this.LIZIZ);
                        String str7 = this.LIZJ;
                        if (str7 == null) {
                            str7 = "";
                        }
                        pairArr[2] = new Pair("category", str7);
                        pairArr[3] = new Pair("duration", Long.valueOf(jCurrentTimeMillis - j));
                        pairArr[4] = new Pair("network_time", Long.valueOf(j2 - j));
                        pairArr[5] = new Pair("json_time", Long.valueOf(j3 - j2));
                        pairArr[6] = new Pair("io_time", Long.valueOf(jCurrentTimeMillis - j3));
                        pairArr[7] = new Pair("size", Long.valueOf(jLIZ));
                        pairArr[8] = new Pair("url_path", "/category/page/effects");
                        C19997513Mf.LIZ(interfaceC1633730scF, true, "category_paged", c13rd3, C2097608Jq.LJIIIIZZ(pairArr), "");
                    }
                }
            }

            {
                super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, c13rd);
                this.LIZ = c13rd;
                this.LIZIZ = str;
                this.LIZJ = str2;
                this.LIZLLL = i;
                this.LJ = i2;
                this.LJFF = i3;
                this.LJI = str3;
                this.LJII = map;
            }
        };
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13od);
        }
    }

    public void fetchPanelInfo(String str, boolean z, String str2, int i, int i2, int i3, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener) {
        boolean zLJI = MethodIDManager.LJI(138042);
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            c13oy.LJIIJJI(str, z, str2, i, i2, i3, map, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, c13oy.LIZ.LJJIIJ));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public void fetchPanelInfoPagingChecked(String str, String str2, int i, int i2, int i3, String str3, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJIILIIL(str, str2, i, i2, i3, str3, false, map, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, c13oy.LIZ.LJJIIJ));
        }
    }

    public void fetchPanelInfoPagingCheckedFromCache(String str, String str2, int i, int i2, int i3, String str3, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy != null) {
            c13oy.LJIILIIL(str, str2, i, i2, i3, str3, true, map, ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, c13oy.LIZ.LJJIIJ));
        }
    }

    public void fetchProviderEffect(final String str, boolean z, final int i, final int i2, final String str2, final String str3, final Map<String, String> map, IFetchProviderEffect iFetchProviderEffect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<ProviderEffectModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchProviderEffect);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        final C13RD c13rd = c20002413OcLJIILL.LIZ;
        C13OD<ProviderEffectModel, ProviderEffectListResponse> c13od = new C13OD<ProviderEffectModel, ProviderEffectListResponse>(c13rd, strLIZ, str, i, i2, str2, str3, map) { // from class: X.13PK
            public final C13RD LIZ;
            public final String LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final Map<String, String> LJI;

            @Override // X.C13OD
            public final C0XSU buildRequest() throws Throwable {
                HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                String str4 = this.LIZIZ;
                if (str4 != null) {
                    mapLIZ.put("library", str4);
                }
                mapLIZ.put("cursor", String.valueOf(this.LIZJ));
                mapLIZ.put("count", String.valueOf(this.LIZLLL));
                String str5 = this.LJ;
                if (str5 != null && !a0.LJJJIL(str5)) {
                    mapLIZ.put("giphy_type", this.LJ);
                }
                String str6 = this.LJFF;
                if (str6 != null) {
                    mapLIZ.put("scenario", str6);
                }
                Map<String, String> map2 = this.LJI;
                if (map2 != null) {
                    mapLIZ.putAll(map2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJJIIJZLJL);
                this.LIZ.getClass();
                sbLIZ.append("/effect/api");
                sbLIZ.append("/stickers/recommend");
                return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
            }

            @Override // X.C13OD
            public final C13OE parseResponse(C13R7 c13r7, String str4) {
                return (C13OE) c13r7.LIZ.convertJsonToObj(str4, ProviderEffectListResponse.class);
            }

            @Override // X.C13OD
            public final void onFailure(String str4, String str5, C1662010tLr c1662010tLr) {
                c1662010tLr.LIZ(null, null, null);
                super.onFailure(str4, str5, c1662010tLr);
            }

            @Override // X.C13OD
            public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
                String strConvertObjToJson;
                InterfaceC20004513Ox interfaceC20004513Ox;
                List<ProviderEffect> sticker_list;
                ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) c13oe;
                ProviderEffectModel data = providerEffectListResponse.getData();
                if (data != null) {
                    if (data.getSticker_list() != null && (sticker_list = data.getSticker_list()) != null) {
                        for (ProviderEffect providerEffect : sticker_list) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(this.LIZ.LJII);
                            sbLIZ.append(C13SB.LIZ);
                            sbLIZ.append(providerEffect.getId());
                            sbLIZ.append(".gif");
                            providerEffect.setPath(C2188811AlT.LIZIZ(sbLIZ));
                            String media_source = providerEffect.getMedia_source();
                            if (media_source == null || a0.LJJJIL(media_source)) {
                                String media_source2 = data.getMedia_source();
                                if (media_source2 != null) {
                                    providerEffect.setMedia_source(media_source2);
                                }
                            }
                        }
                    }
                    try {
                        String strLJIILLIIL = C13OQ.LJIILLIIL(this.LIZ, this.LIZIZ);
                        C13R7 c13r7 = this.LIZ.LJIJI;
                        if (c13r7 != null && (strConvertObjToJson = c13r7.LIZ.convertObjToJson(data)) != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                            interfaceC20004513Ox.LJIIJ(strLJIILLIIL, strConvertObjToJson, "");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C13SS c13ss = C13SS.LIZ;
                        String strValueOf = String.valueOf(e);
                        c13ss.getClass();
                        C13SS.LIZIZ("FetchProviderEffectTask", strValueOf, null);
                    }
                    super.onSuccess(j, j2, j3, providerEffectListResponse);
                }
            }

            {
                super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                this.LIZ = c13rd;
                this.LIZIZ = str;
                this.LIZJ = i;
                this.LIZLLL = i2;
                this.LJ = str2;
                this.LJFF = str3;
                this.LJI = map;
            }
        };
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13od);
        }
    }

    public void searchProviderEffect(final String str, final String str2, final int i, final int i2, boolean z, final String str3, final String str4, IFetchProviderEffect iFetchProviderEffect) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        C13MA<ProviderEffectModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchProviderEffect);
        boolean zLJI = MethodIDManager.LJI(202053);
        C20002413Oc c20002413OcLJIILL = c13oy.LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (kNListener != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, kNListener);
        }
        final C13RD c13rd = c20002413OcLJIILL.LIZ;
        C13OD<ProviderEffectModel, ProviderEffectListResponse> c13od = new C13OD<ProviderEffectModel, ProviderEffectListResponse>(c13rd, strLIZ, str, str2, i, i2, str3, str4) { // from class: X.13PM
            public final C13RD LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final int LIZLLL;
            public final int LJ;
            public final String LJFF;
            public final String LJI;

            @Override // X.C13OD
            public final C0XSU buildRequest() throws Throwable {
                HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
                String str5 = this.LIZJ;
                if (str5 != null) {
                    mapLIZ.put("library", str5);
                }
                String str6 = this.LIZIZ;
                if (str6 != null) {
                    mapLIZ.put("word", str6);
                }
                mapLIZ.put("cursor", String.valueOf(this.LIZLLL));
                mapLIZ.put("count", String.valueOf(this.LJ));
                String str7 = this.LJFF;
                if (str7 != null && !a0.LJJJIL(str7)) {
                    mapLIZ.put("giphy_type", this.LJFF);
                }
                String str8 = this.LJI;
                if (str8 != null) {
                    mapLIZ.put("scenario", str8);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJJIIJZLJL);
                this.LIZ.getClass();
                sbLIZ.append("/effect/api");
                sbLIZ.append("/stickers/search");
                return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
            }

            @Override // X.C13OD
            public final C13OE parseResponse(C13R7 c13r7, String str5) {
                return (C13OE) c13r7.LIZ.convertJsonToObj(str5, ProviderEffectListResponse.class);
            }

            @Override // X.C13OD
            public final void onFailure(String str5, String str6, C1662010tLr c1662010tLr) {
                c1662010tLr.LIZ(str5, this.LIZ.LJJIIJZLJL, str6);
                super.onFailure(str5, str6, c1662010tLr);
            }

            @Override // X.C13OD
            public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
                List<ProviderEffect> sticker_list;
                ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) c13oe;
                ProviderEffectModel data = providerEffectListResponse.getData();
                if (data != null && (sticker_list = data.getSticker_list()) != null) {
                    for (ProviderEffect providerEffect : sticker_list) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LIZ.LJII);
                        sbLIZ.append(C13SB.LIZ);
                        sbLIZ.append(providerEffect.getId());
                        sbLIZ.append(".gif");
                        providerEffect.setPath(C2188811AlT.LIZIZ(sbLIZ));
                        String media_source = providerEffect.getMedia_source();
                        if (media_source == null || a0.LJJJIL(media_source)) {
                            String media_source2 = data.getMedia_source();
                            if (media_source2 != null) {
                                providerEffect.setMedia_source(media_source2);
                            }
                        }
                    }
                    super.onSuccess(j, j2, j3, providerEffectListResponse);
                }
            }

            {
                super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                this.LIZ = c13rd;
                this.LIZIZ = str;
                this.LIZJ = str2;
                this.LIZLLL = i;
                this.LJ = i2;
                this.LJFF = str3;
                this.LJI = str4;
            }
        };
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13od);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, int i4, Map<String, String> map, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C13OY c13oy = this.mEffectPlatform;
        if (c13oy == null) {
            return;
        }
        c13oy.LIZLLL(str, str2, i, i2, i3, str3, i4, map, ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, c13oy.LIZ.LJJIIJ));
    }
}

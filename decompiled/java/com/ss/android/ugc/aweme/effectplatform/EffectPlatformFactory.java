package com.ss.android.ugc.aweme.effectplatform;

import X.C01GW;
import X.C04QT;
import X.C09DC;
import X.C0C64;
import X.C0CHQ;
import X.C0VSJ;
import X.C0XS9;
import X.C13Q5;
import X.C13RB;
import X.C13RE;
import X.C13RX;
import X.C1635470sf3;
import X.C19221910Hx;
import X.C20000913Nn;
import X.C20186013yc;
import X.C201955140j;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2477509nJ;
import X.C262560AQs;
import X.C278800AwI;
import X.C278810AwJ;
import X.C297340Bl6;
import X.C297880Bly;
import X.C306100BzE;
import X.C306130BzH;
import X.C365090ETb;
import X.C823050WQl;
import X.C844470XAv;
import X.InterfaceC1635410sex;
import X.InterfaceC19370610qO;
import X.InterfaceC19997313Md;
import android.os.Build;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatformFactory;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.property.EffectPlatformSingleConfig;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.ugc.effectplatform.EffectSingleDownloadOpt;
import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import w1p.a;

/* JADX INFO: loaded from: classes31.dex */
public class EffectPlatformFactory implements IEffectPlatformFactory {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public static long LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final List<Host> getDownloadableModelHosts() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Host("https://api-va.tiktokv.com"));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final List<Host> getHosts() {
        ArrayList arrayList = new ArrayList();
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            arrayList.add(new Host("https://api-va.tiktokv.com/tiktok/v1/kids"));
            return arrayList;
        }
        arrayList.add(new Host("https://api-va.tiktokv.com"));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final InterfaceC1635410sex create(final EffectPlatformBuilder effectPlatformBuilder) {
        C0CHQ.LIZ().initDownloadableModel();
        EffectConfiguration.Builder builderCreateEffectConfigurationBuilder = createEffectConfigurationBuilder(effectPlatformBuilder);
        if (C13Q5.LIZJ()) {
            builderCreateEffectConfigurationBuilder.knEffectFetcher(new InterfaceC19997313Md() { // from class: X.13Q3
                public final C13NP LIZ = C13Q5.LIZ().LIZIZ();
                public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(70));

                @Override // X.InterfaceC19997313Md
                public final C13NN<C13NR> LIZ(C13NQ c13nq) {
                    boolean zLJIIIZ;
                    boolean zLIZ;
                    boolean z;
                    if (c13nq.LJIIIIZZ) {
                        return ((C19997213Mc) this.LIZIZ.getValue()).LIZ(c13nq);
                    }
                    boolean z2 = true;
                    try {
                        zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_effect_parallel_download_enabled", true, false);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        zLJIIIZ = false;
                    }
                    try {
                        zLIZ = C290890Bah.LIZ();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        zLIZ = false;
                    }
                    if (zLJIIIZ || zLIZ) {
                        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_effect_download_pause_resume_enabled", true, false) && !zLIZ) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_effect_parallel_download_enabled", true, false) && !zLIZ && !effectPlatformBuilder.isSingleton()) {
                            z2 = false;
                        }
                        c13nq.LIZLLL = new C13NJ(z, z2, C1635470sf3.LIZ());
                    }
                    TENativeLibsLoader.loadLibrary();
                    return this.LIZ.LIZ(c13nq);
                }
            });
        }
        final InterfaceC1635410sex interfaceC1635410sexCreate = create(builderCreateEffectConfigurationBuilder, AFwS274S0000000_30.get$arr$(57), false, effectPlatformBuilder.isSingleton());
        interfaceC1635410sexCreate.ug(effectPlatformBuilder.getMonitorExtraParams());
        interfaceC1635410sexCreate.yg(C2097908Jt.LIZJ(new Pair("show_filtered_effects", "true")));
        return new InterfaceC1635410sex() { // from class: X.0sew
            public final /* synthetic */ InterfaceC1635410sex LL;

            @Override // X.InterfaceC1635410sex
            public final void Ag(String str, String str2, ICheckChannelListener iCheckChannelListener) {
                this.LL.Ag("default", str2, iCheckChannelListener);
            }

            @Override // X.InterfaceC1635410sex
            public final void Bg(String str, C2225608nm c2225608nm) {
                this.LL.Bg(str, c2225608nm);
            }

            @Override // X.InterfaceC1635410sex
            public final void Cg(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
                this.LL.Cg(list, map, iFetchEffectListByIdsListener);
            }

            @Override // X.InterfaceC1635410sex
            public final void Dg(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.Dg(str, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635410sex
            public final Map<String, String> Eg() {
                return this.LL.Eg();
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
                this.LL.LIZ(list, map, iFetchEffectListByIdsListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
                this.LL.LIZIZ(str, map, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener) {
                this.LL.LIZJ(effect, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LIZLLL(String str) {
                this.LL.LIZLLL(str);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener) {
                this.LL.LJ(effect, z, z2, z3, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LJFF(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
                this.LL.LJFF(list, z, map, iFetchEffectListListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LJI(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
                boolean zLJI = MethodIDManager.LJI(137381);
                this.LL.LJI(str, z, iFetchEffectChannelListener);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }

            @Override // X.InterfaceC1635390sev
            public final void LJII(Effect effect) {
                this.LL.LJII(effect);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LJIIIZ(String str, boolean z, String str2, int i, int i2, Map<String, String> map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z2) {
                this.LL.LJIIIZ(str, z, str2, i, i2, map, iFetchPanelInfoListener, z2);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LJIIJJI(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
                this.LL.LJIIJJI(providerEffect, iDownloadProviderEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIIL(Effect effect, IFetchEffectListener iFetchEffectListener) {
                this.LL.LJIIL(effect, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIILIIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, boolean z, IFetchAssetPanelInfo iFetchAssetPanelInfo) {
                this.LL.LJIILIIL(mixedAssetsQueryAdditionalParameters, str, str2, i, i2, mixedAssetsRequestBodyInfo, z, iFetchAssetPanelInfo);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIILJJIL(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633120sbG c1633120sbG) {
                this.LL.LJIILJJIL(str, str2, str3, i, i2, map, i3, c1633120sbG);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIILL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, String str2, int i, int i2, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetCategoryInfo iFetchAssetCategoryInfo) {
                this.LL.LJIILL(mixedAssetsQueryAdditionalParameters, str, str2, i, i2, mixedAssetsRequestBodyInfo, iFetchAssetCategoryInfo);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIILLIIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, int i, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, C1635500sf6 c1635500sf6) {
                this.LL.LJIILLIIL(mixedAssetsQueryAdditionalParameters, i, mixedAssetsRequestBodyInfo, c1635500sf6);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIIZILJ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
                this.LL.LJIIZILJ(str, map, iFetchEffectListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIJ(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, int i, int i2, C1423840n9i c1423840n9i) {
                this.LL.LJIJ(mixedAssetsQueryAdditionalParameters, i, i2, c1423840n9i);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJIJI(str, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final AssetPanelResponse LJIJJ(String str, String str2, int i) {
                return this.LL.LJIJJ(str, str2, i);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJIL(C1634110scr c1634110scr, InfoStickerEffect infoStickerEffect) {
                this.LL.LJIL(c1634110scr, infoStickerEffect);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJ(Effect effect) {
                this.LL.LJJ(effect);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJI(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, String str, int i, MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo, IFetchAssetPanelInfo iFetchAssetPanelInfo) {
                this.LL.LJJI(mixedAssetsQueryAdditionalParameters, str, i, mixedAssetsRequestBodyInfo, iFetchAssetPanelInfo);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIFFI(String str, int i, int i2, int i3, String str2, Map map, IFetchPanelInfoListener iFetchPanelInfoListener, boolean z) {
                this.LL.LJJIFFI(str, i, i2, i3, str2, map, iFetchPanelInfoListener, z);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJII(String str, EnumC1285060jXs enumC1285060jXs, boolean z, int i, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJJII(str, enumC1285060jXs, z, i, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIII(String str, C1638390sjl c1638390sjl) {
                this.LL.LJJIII(str, c1638390sjl);
            }

            @Override // X.InterfaceC1635390sev
            public final AssetCategoryResponse LJJIIJ(String str, String str2, int i, int i2) {
                return this.LL.LJJIIJ(str, str2, i, i2);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIIJZLJL(Map<String, String> map, C13MA<HorizontalEffectsModel> c13ma, boolean z, String str, int i) {
                this.LL.LJJIIJZLJL(map, c13ma, z, str, i);
            }

            @Override // X.InterfaceC1635390sev
            public final EffectConfiguration LJJIIZ() {
                return this.LL.LJJIIZ();
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIIZI(String str, String str2, int i, int i2, int i3, String str3, C1631900sZI c1631900sZI) {
                this.LL.LJJIIZI(str, str2, i, i2, i3, str3, c1631900sZI);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJ(String str, String str2, String str3, int i, int i2, Map map, int i3, C1633130sbH c1633130sbH) {
                this.LL.LJJIJ(str, str2, str3, i, i2, map, i3, c1633130sbH);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJIIJI(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener) {
                this.LL.LJJIJIIJI(list, z, map, iFetchEffectListListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJIIJIL(String str, String str2, int i, int i2, boolean z, String str3, String str4, IFetchProviderEffect iFetchProviderEffect) {
                this.LL.LJJIJIIJIL(str, str2, i, i2, z, str3, str4, iFetchProviderEffect);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJIL(String str, Map map, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJJIJIL(str, map, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJL(String str, String str2, int i, Map map, ICheckChannelListener iCheckChannelListener) {
                boolean zLJI = MethodIDManager.LJI(137816);
                this.LL.LJJIJL(str, str2, i, map, iCheckChannelListener);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIJLIJ(String str) {
                this.LL.LJJIJLIJ(str);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIL(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters, MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo, IFetchAssetItemInfo iFetchAssetItemInfo) {
                this.LL.LJJIL(mixedAssetsQueryAdditionalParameters, mixedItemAssetsRequestBodyInfo, iFetchAssetItemInfo);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJIZ(String str, boolean z, String str2, int i, int i2, boolean z2, boolean z3, int i3, IFetchPanelInfoListener iFetchPanelInfoListener, Map<String, String> map) {
                this.LL.LJJIZ(str, z, str2, i, i2, z2, z3, i3, iFetchPanelInfoListener, map);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJ(int i, int i2, int i3, int i4, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, Map map, boolean z) {
                this.LL.LJJJ(i, i2, i3, i4, iFetchCategoryEffectListener, str, str2, str3, map, z);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJI(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJJJI(str, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJIL(long j, C13MA<GetCustomizedEffectIDData> c13ma) {
                this.LL.LJJJIL(j, c13ma);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJJ(int i, int i2, int i3, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, String str3, boolean z) {
                this.LL.LJJJJ(i, i2, i3, iFetchCategoryEffectListener, str, str2, str3, z);
            }

            @Override // X.InterfaceC1635390sev
            public final void LJJJJI(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.LJJJJI(str, z, z2, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final EffectManager LLJILJILJ() {
                return this.LL.LLJILJILJ();
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void destroy() {
                this.LL.destroy();
            }

            @Override // X.InterfaceC1635410sex
            public final void kg(LifecycleOwner lifecycleOwner) {
                this.LL.kg(lifecycleOwner);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void lg(String str, String str2, IUpdateTagListener iUpdateTagListener) {
                this.LL.lg(str, str2, iUpdateTagListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void mg(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
                this.LL.mg(str, list, str2, iIsTagNeedUpdatedListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void ng() {
                this.LL.ng();
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void og(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
                this.LL.og(list, iFetchEffectListListener);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void pg(String str, int i, int i2, String str2, String str3, Map map, IFetchProviderEffect iFetchProviderEffect) {
                this.LL.pg(str, i, i2, str2, str3, map, iFetchProviderEffect);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void qg(IModFavoriteList iModFavoriteList, String str, List list, boolean z) {
                this.LL.qg(iModFavoriteList, str, list, z);
            }

            @Override // X.InterfaceC1635410sex
            public final void rg(C194380113a c194380113a) {
                this.LL.rg(c194380113a);
            }

            @Override // X.InterfaceC1635410sex
            public final void sg(String str, String str2, int i, int i2, int i3, Map map, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
                this.LL.sg(str, str2, i, i2, i3, map, iFetchCategoryEffectListener);
            }

            @Override // X.InterfaceC1635410sex
            public final void tg(int i, IFetchCategoryEffectListener iFetchCategoryEffectListener, String str, String str2, boolean z) {
                this.LL.tg(i, iFetchCategoryEffectListener, str, str2, z);
            }

            @Override // X.InterfaceC1635410sex
            public final void ug(Map<String, Object> map) {
                this.LL.ug(map);
            }

            @Override // X.InterfaceC1635410sex
            public final void vg(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
                this.LL.vg("editorpro_adjust", true, iFetchEffectChannelListener);
            }

            @Override // X.InterfaceC1635410sex
            public final void wg(String str, String str2, int i, IFetchPanelInfoListener iFetchPanelInfoListener) {
                this.LL.wg(str, str2, i, iFetchPanelInfoListener);
            }

            @Override // X.InterfaceC1635410sex
            public final void xg(String str, C1638600sk6 c1638600sk6) {
                this.LL.xg(str, c1638600sk6);
            }

            @Override // X.InterfaceC1635410sex
            public final void yg(Map<String, String> map) {
                this.LL.yg(map);
            }

            @Override // X.InterfaceC1635410sex
            public final boolean zg(String str, String str2) {
                return this.LL.zg(str, str2);
            }

            {
                this.LL = this.LLILLJJLI;
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final boolean LJIIIIZZ(Effect effect) {
                TENativeLibsLoader.loadLibrary();
                return this.LLILLJJLI.LJIIIIZZ(effect);
            }

            @Override // X.InterfaceC1635390sev
            public final boolean LJIJJLI(Effect effect) {
                TENativeLibsLoader.loadLibrary();
                return this.LLILLJJLI.LJIJJLI(effect);
            }

            @Override // X.InterfaceC1635410sex, X.InterfaceC1635390sev
            public final void LJIIJ(List list, Map map, C396901gV c396901gV) {
                this.LLILLJJLI.LJIIJ(list, map, c396901gV);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final EffectConfiguration.Builder createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder) {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
        int iIntValue;
        EffectConfiguration.UnZipSolution unZipSolution;
        String absolutePath;
        boolean zLJIIIZ;
        long jLJIJJLI;
        if (effectPlatformBuilder.getContext() != null) {
            String str = "";
            if (effectPlatformBuilder.getRegion() == null) {
                C0CHQ.LIZ().getRegionService();
                String strLIZ = C20186013yc.LIZ();
                if (strLIZ == null) {
                    strLIZ = "";
                }
                effectPlatformBuilder.setRegion(strLIZ);
            }
            if (effectPlatformBuilder.getAccessKey() == null) {
                effectPlatformBuilder.setAccessKey(C0CHQ.LIZ().LJJJ().LIZLLL());
            }
            if (effectPlatformBuilder.getCacheDir() == null) {
                effectPlatformBuilder.setCacheDir(EffectPlatform.LLILZ);
            }
            File cacheDir = effectPlatformBuilder.getCacheDir();
            C0VSJ c0vsj = EffectPlatform.LLILZ;
            if (Intrinsics.LJFF(cacheDir, c0vsj)) {
                C01GW c01gw = C306130BzH.LIZ;
                if (C2477509nJ.LIZ()) {
                    zLJIIIZ = ((Boolean) C306130BzH.LIZ.getValue()).booleanValue();
                } else {
                    zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_open_effect_cache", true, false);
                }
                if (zLJIIIZ) {
                    C01GW c01gw2 = C306100BzE.LIZ;
                    if (C2477509nJ.LIZ()) {
                        jLJIJJLI = ((Number) C306100BzE.LIZ.getValue()).longValue();
                    } else {
                        jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 800L, "creative_tool_effect_cache_threshold", true) * 1048576;
                    }
                    effectPlatformBuilder.effectMaxCacheSize = jLJIJJLI;
                }
                effectPlatformBuilder.setEffectDir(true);
            }
            if (effectPlatformBuilder.getSdkVersion() == null) {
                effectPlatformBuilder.setSdkVersion(C0CHQ.LIZ().LJJJ().getEffectSDKVersion());
            }
            if (effectPlatformBuilder.getChannel() == null) {
                C0CHQ.LIZ().getApplicationService().getClass();
                C844470XAv.LIZ.getClass();
                String str2 = C844470XAv.LJIILL;
                C13RX c13rx = C13RX.LIZIZ;
                C201955140j.LIZJ(c13rx, "generateChannel: " + str2);
                C365090ETb.LIZIZ();
                C201955140j.LIZJ(c13rx, "generateChannel: final chanel: " + str2);
                effectPlatformBuilder.setChannel(str2);
            }
            if (effectPlatformBuilder.getAppVersion() == null) {
                C0CHQ.LIZ().getApplicationService();
                effectPlatformBuilder.setAppVersion(C19221910Hx.LIZIZ());
            }
            if (effectPlatformBuilder.getAppID() == null) {
                effectPlatformBuilder.setAppID(EffectPlatform.LJJJJJ());
            }
            if (effectPlatformBuilder.getAppLanguage() == null) {
                effectPlatformBuilder.setAppLanguage(((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage());
            }
            if (effectPlatformBuilder.getSystemLanguage() == null) {
                effectPlatformBuilder.setSystemLanguage(((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getSysLanguage());
            }
            if (effectPlatformBuilder.getRetryCount() == null) {
                effectPlatformBuilder.setRetryCount(Integer.valueOf(((Number) C278800AwI.LIZ.getValue()).intValue()));
            }
            if (effectPlatformBuilder.getBackupRetryCount() == null) {
                effectPlatformBuilder.setBackupRetryCount(Integer.valueOf(((EffectSingleDownloadOpt.Config) EffectSingleDownloadOpt.LIZIZ.getValue()).backupUrlRetryCount));
            }
            if (effectPlatformBuilder.getHosts() == null) {
                effectPlatformBuilder.setHosts(getHosts());
            }
            if (effectPlatformBuilder.getEffectNetWorker() == null) {
                effectPlatformBuilder.setEffectNetWorker(new C0XS9());
            }
            if (effectPlatformBuilder.getExecutorService() == null) {
                effectPlatformBuilder.setExecutorService(C823050WQl.LIZLLL());
            }
            if (effectPlatformBuilder.getJsonConverter() == null) {
                effectPlatformBuilder.setJsonConverter(new C09DC(C0CHQ.LIZ().getGson()));
            }
            if (effectPlatformBuilder.getRequestStrategy() == null) {
                effectPlatformBuilder.setRequestStrategy(2);
            }
            if (effectPlatformBuilder.effectMaxCacheSize <= 0) {
                effectPlatformBuilder.effectMaxCacheSize = 838860800L;
            }
            if (effectPlatformBuilder.getObjIdConversionConfig() == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0CHQ.LIZ().getNetworkService().getApiHost());
                sbLIZ.append("/aweme/v1/sticker/resource/");
                effectPlatformBuilder.setObjIdConversionConfig(new C20000913Nn(C2188811AlT.LIZIZ(sbLIZ)));
            }
            C13RE.LIZ = true;
            final String appID = effectPlatformBuilder.getAppID();
            EffectConfiguration.Builder builder = new EffectConfiguration.Builder();
            builder.accessKey(String.valueOf(effectPlatformBuilder.getAccessKey()));
            builder.channel(String.valueOf(effectPlatformBuilder.getChannel()));
            builder.sdkVersion(String.valueOf(effectPlatformBuilder.getSdkVersion()));
            builder.appVersion(String.valueOf(effectPlatformBuilder.getAppVersion()));
            builder.platform("android");
            builder.deviceType(Build.MODEL);
            builder.JsonConverter(effectPlatformBuilder.getJsonConverter());
            builder.monitorService(new EffectPlatformMonitor());
            if (AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() == null) {
                strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = CardStruct.IStatusCode.DEFAULT;
            } else {
                strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            }
            builder.deviceId(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
            builder.appID(appID);
            builder.appLanguage(effectPlatformBuilder.getAppLanguage());
            builder.sysLanguage(effectPlatformBuilder.getSystemLanguage());
            builder.retryCount(effectPlatformBuilder.getRetryCount().intValue());
            Integer backupRetryCount = effectPlatformBuilder.getBackupRetryCount();
            if (backupRetryCount != null) {
                iIntValue = backupRetryCount.intValue();
            } else {
                iIntValue = 0;
            }
            builder.backupUrlRetryCount(iIntValue);
            builder.effectDir(effectPlatformBuilder.getCacheDir());
            builder.effectNetWorker(effectPlatformBuilder.getEffectNetWorker());
            builder.region(String.valueOf(effectPlatformBuilder.getRegion()));
            builder.hosts(effectPlatformBuilder.getHosts());
            builder.context(effectPlatformBuilder.getContext());
            builder.executor(effectPlatformBuilder.getExecutorService());
            builder.requestStrategy(effectPlatformBuilder.getRequestStrategy().intValue());
            builder.effectMaxCacheSize(effectPlatformBuilder.effectMaxCacheSize);
            builder.isEffectDir(Boolean.valueOf(effectPlatformBuilder.isEffectDir()));
            builder.objIdConversionConfig(effectPlatformBuilder.getObjIdConversionConfig());
            if (((Boolean) C04QT.LIZ.getValue()).booleanValue()) {
                unZipSolution = EffectConfiguration.UnZipSolution.UNZIP3;
            } else if (((Boolean) C278810AwJ.LIZ.getValue()).booleanValue()) {
                unZipSolution = EffectConfiguration.UnZipSolution.MINI_ZIP;
            } else {
                unZipSolution = EffectConfiguration.UnZipSolution.NEW_SOLUTION;
            }
            builder.setUnzipSolution(unZipSolution);
            builder.ignoreBuiltInModel(false);
            builder.jsonOptimizeType(C0C64.LJIILLIIL().LJIJ(31744, 0, "ep_json_optimize", true));
            builder.abDiffEffect(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ep_diff_effect", true, false));
            builder.modelNameCache(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ep_model_name_cache", true, false));
            builder.canUseNewFillModel(EffectFullWidthHorizontalCarouselAB.isEnabled());
            builder.effectListV4(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ep_effect_list_v4", true, false));
            builder.regionAsPartOfCacheKey(true);
            builder.extraParams(new InterfaceC19370610qO() { // from class: X.13Re
                @Override // X.InterfaceC19370610qO
                public final Map<String, String> getExtraParams() {
                    if (((Boolean) C0ATB.LIZ.getValue()).booleanValue() && System.currentTimeMillis() - EffectPlatformFactory.LIZIZ > ((Number) C263040ASo.LIZ.getValue()).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                        C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(C12HP.LJIIIIZZ(appID));
                        HashMap<String, String> map = new HashMap<>();
                        c09gaLIZIZ.LJIILL(map);
                        EffectPlatformFactory.LIZ.put("bytebench_param", C2292508yZ.LIZJ(map));
                        EffectPlatformFactory.LIZIZ = System.currentTimeMillis();
                    }
                    return EffectPlatformFactory.LIZ;
                }
            });
            if (((Boolean) C262560AQs.LIZ.getValue()).booleanValue()) {
                builder.networkQuality(new C13RB() { // from class: X.13Rf
                    @Override // X.C13RB
                    public final int LIZ() {
                        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                        C13RX c13rx2 = C13RX.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("networkQuality: ");
                        sbLIZ2.append(effectiveConnectionType);
                        C201955140j.LIZJ(c13rx2, C2188811AlT.LIZIZ(sbLIZ2));
                        return effectiveConnectionType;
                    }
                });
            }
            if (C297880Bly.LIZ() || a.LIZ().effectDownloadInsertAtHeadEnabled) {
                builder.abInsertHead(true);
                builder.abInsertHeadPanels(C1635470sf3.LIZ());
            }
            if (C297340Bl6.LIZIZ() && ((EffectPlatformSingleConfig.PlatformAPIConfig) EffectPlatformSingleConfig.LIZIZ.getValue()).useIOExecutor) {
                builder.executor(C823050WQl.LIZLLL());
            } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tools_effect_thread_core_size_configuration", true) > 0) {
                builder.threadCoreSize(C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tools_effect_thread_core_size_configuration", true));
            }
            File cacheDir2 = effectPlatformBuilder.getCacheDir();
            if (cacheDir2 != null) {
                absolutePath = cacheDir2.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            if (Intrinsics.LJFF(absolutePath, new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJIL("")).getAbsolutePath())) {
                str = "font";
            } else if (Intrinsics.LJFF(absolutePath, new C0VSJ(o.LJJ.LJIIIIZZ().LIZ().LIZLLL()).getAbsolutePath())) {
                str = "mv";
            } else if (Intrinsics.LJFF(absolutePath, c0vsj.getAbsolutePath())) {
                str = "effect";
            } else if (Intrinsics.LJFF(absolutePath, EffectPlatform.LLILZIL.getAbsolutePath())) {
                str = "effect_model";
            }
            builder.customDiskName(str);
            return builder;
        }
        "context is null.".toString();
        throw new IllegalArgumentException("context is null.");
    }

    @Override // com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory
    public final InterfaceC1635410sex create(EffectConfiguration.Builder builder, Function1<? super EffectConfiguration, Unit> function1, boolean z, boolean z2) {
        EffectConfiguration effectConfigurationBuild = builder.build();
        if (function1 != null) {
            function1.invoke(effectConfigurationBuild);
        }
        return new EffectPlatform(effectConfigurationBuild, z2);
    }
}

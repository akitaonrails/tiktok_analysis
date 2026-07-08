package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.AbstractC738140SxQ;
import X.C03H5;
import X.C08A4;
import X.C0C64;
import X.C0O2O;
import X.C0RF0;
import X.C0RJN;
import X.C0SGE;
import X.C0SJF;
import X.C0SJM;
import X.C0XQ7;
import X.C1012040cRW;
import X.C1206840hVi;
import X.C1308910kAL;
import X.C13DV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C1483410ohn;
import X.C15438062q;
import X.C1565660qqS;
import X.C1565670qqT;
import X.C1697810uHb;
import X.C1697820uHc;
import X.C19EG;
import X.C20642515q3;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C259800zU;
import X.C295470Bi5;
import X.C298280Bmc;
import X.C690870R8b;
import X.C718180SFc;
import X.C718260SFk;
import X.C718360SFu;
import X.C718440SGc;
import X.C718450SGd;
import X.C718460SGe;
import X.C718480SGg;
import X.C718510SGj;
import X.C718840SHq;
import Y.ARunnableS35S0300000_2;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner.SeriesBannerTrigger;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton.MiniDramaBottomButtonBackupTriggerAssem;
import com.ss.android.ugc.aweme.series.commonfeed.component.overlay.PaidContentCellOverlayComponentOptTrigger;
import com.ss.android.ugc.aweme.series.commonfeed.component.overlay.PaidContentCellOverlayComponentTrigger;
import com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextTriggerAssem;
import com.ss.android.ugc.aweme.series.commonfeed.component.preload.SeriesVideoPreloadComponent;
import com.ss.android.ugc.aweme.series.commonfeed.component.tag.FeedPaidContentPreviewTagTrigger;
import com.ss.android.ugc.aweme.series.commonfeed.component.tag.FeedPaidContentPreviewTagTriggerV2;
import com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentImmersiveViewHolder;
import com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentLockVideoViewHolder;
import com.ss.android.ugc.aweme.series.commonfeed.holder.PaidContentVideoViewHolder;
import com.ss.android.ugc.aweme.series.innerfeed.component.MiniDramaPlayBackComponent;
import com.ss.android.ugc.aweme.series.innerfeed.lynxcard.DramaDetailLynxCardContainerAssem;
import com.ss.android.ugc.aweme.service.IPaidContentFeedSeries;
import com.ss.android.ugc.aweme.service.ISeriesFavoriteService;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public class PaidContentFeedService implements IPaidContentFeedSeries {

    public interface AppDiffProtocol {
        public static final C718440SGc LIZ = C718440SGc.LIZ;

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.PaidContentFeedService.AppDiffProtocol
            public final void LIZ() {
            }
        }

        void LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final ReusedAssem<? extends C03H5> LJII() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJIIZILJ(String str) {
        return C13LE.LIZ(AutoPlayNextTriggerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final ReusedAssem<? extends C03H5> LIZLLL() {
        return new SeriesVideoPreloadComponent();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIILJJIL() {
        if (((Boolean) C298280Bmc.LIZ.getValue()).booleanValue()) {
            return new DramaDetailLynxCardContainerAssem();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIILL() {
        return new FeedPaidContentPreviewTagTriggerV2();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIJ() {
        return new SeriesBannerTrigger();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJJI() {
        return new FeedPaidContentPreviewTagTrigger();
    }

    public PaidContentFeedService() {
        C1206840hVi c1206840hVi = new C0O2O() { // from class: X.0hVi
            public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1206850hVj());
            public static final C01GW LLILLL = C452501pT.LIZIZ(new C1206860hVk());

            @Override // X.C0O2O
            public final void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
                IAwemeService iAwemeService;
                Aweme awemeLLILZ;
                PaidContentInfo paidContentInfo;
                if (enumC612200Nzm == EnumC612200Nzm.MUTATION && (iAwemeService = (IAwemeService) LLILLJJLI.getValue()) != null && (awemeLLILZ = iAwemeService.LLILZ(str)) != null && (paidContentInfo = awemeLLILZ.mPaidContentInfo) != null) {
                    long paidCollectionId = paidContentInfo.getPaidCollectionId();
                    if (paidCollectionId != 0) {
                        ((ISeriesFavoriteService) LLILLL.getValue()).LIZ(paidCollectionId, z, true).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIJ();
                    }
                }
            }

            @Override // X.InterfaceC612260Nzs
            public final void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
                Wz(str, bool.booleanValue(), enumC612200Nzm);
            }
        };
        c1206840hVi.getClass();
        ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber(c1206840hVi);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJI() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "mini_drama_cta_standardize_migrate", true, true)) {
            return null;
        }
        return C13LE.LIZ(MiniDramaBottomButtonBackupTriggerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Function0<C13IQ<? extends ReusedUISlotAssem<?>>> LJIIIZ() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "mini_drama_cta_standardize_migrate", true, true)) {
            return AFwS198S0000000_11.get$arr$(131);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C13IQ<? extends AbstractC738140SxQ> LJIIJ() {
        if (C295470Bi5.LIZIZ()) {
            return C13LE.LIZ(MiniDramaPlayBackComponent.class);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIIJJI() {
        return C295470Bi5.LIZIZ() ? new C1565670qqT() : new C1565660qqS();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LIZJ(final C718360SFu c718360SFu) {
        return new C718260SFk(c718360SFu) { // from class: X.0SFj
            @Override // X.C718260SFk, X.InterfaceC707420Roy
            public final Map<String, String> LIZ() {
                String string;
                Aweme aweme;
                PaidContentInfo paidContentInfo;
                PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
                Map<String, String> logExtra;
                HashMap<String, String> mobParams;
                String str;
                PaidContentInfo paidContentInfo2;
                PaidContentInfo paidContentInfo3;
                PaidContentInfo paidContentInfo4;
                C2344009Gk c2344009Gk = new C2344009Gk();
                Aweme aweme2 = this.LIZ.LIZJ;
                if (aweme2 == null || (paidContentInfo4 = aweme2.mPaidContentInfo) == null || (string = Long.valueOf(paidContentInfo4.getCategory()).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("series_category", string);
                Aweme aweme3 = this.LIZ.LIZJ;
                c2344009Gk.LJIIIIZZ("series_collection_id", String.valueOf((aweme3 == null || (paidContentInfo3 = aweme3.mPaidContentInfo) == null) ? null : Long.valueOf(paidContentInfo3.getPaidCollectionId())));
                Aweme aweme4 = this.LIZ.LIZJ;
                boolean z = true;
                if ((aweme4 == null || (paidContentInfo2 = aweme4.mPaidContentInfo) == null || !paidContentInfo2.isLimitedFreeShortDrama()) && ((aweme = this.LIZ.LIZJ) == null || !C718300SFo.LIZ(aweme))) {
                    z = false;
                }
                C718270SFl.LIZ(c2344009Gk, z);
                C0RRR.LIZ(c2344009Gk);
                C718360SFu c718360SFu2 = this.LIZ;
                c2344009Gk.LJIIIIZZ("series_feed_type", C718180SFc.LIZLLL(c718360SFu2.LIZJ, c718360SFu2.LJFF));
                Aweme aweme5 = this.LIZ.LIZJ;
                c2344009Gk.LJIIIIZZ("series_video_type", aweme5 != null ? C718180SFc.LJ(aweme5) : null);
                C718360SFu c718360SFu3 = this.LIZ;
                Aweme aweme6 = c718360SFu3.LIZJ;
                String str2 = "";
                c2344009Gk.LJIIIIZZ("series_component_type", aweme6 != null ? C718180SFc.LIZJ(aweme6, c718360SFu3.LJFF) : "");
                Aweme aweme7 = this.LIZ.LIZJ;
                if (aweme7 != null && (mobParams = aweme7.getMobParams()) != null && (str = mobParams.get("is_from_series_dnu_insertion")) != null) {
                    str2 = str;
                }
                c2344009Gk.LJIIIIZZ("is_from_series_dnu_insertion", str2);
                Aweme aweme8 = this.LIZ.LIZJ;
                if (aweme8 != null && (paidContentInfo = aweme8.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
                    c2344009Gk.LJII(logExtra);
                }
                return c2344009Gk.LIZ;
            }

            @Override // X.C718260SFk, X.InterfaceC707420Roy
            public final Map<String, String> LIZIZ() {
                String string;
                Aweme aweme;
                PaidContentInfo paidContentInfo;
                PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
                Map<String, String> logExtra;
                HashMap<String, String> mobParams;
                String str;
                PaidContentInfo paidContentInfo2;
                PaidContentInfo paidContentInfo3;
                PaidContentInfo paidContentInfo4;
                C2344009Gk c2344009Gk = new C2344009Gk();
                Aweme aweme2 = this.LIZ.LIZJ;
                if (aweme2 == null || (paidContentInfo4 = aweme2.mPaidContentInfo) == null || (string = Long.valueOf(paidContentInfo4.getCategory()).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("series_category", string);
                Aweme aweme3 = this.LIZ.LIZJ;
                c2344009Gk.LJIIIIZZ("series_collection_id", String.valueOf((aweme3 == null || (paidContentInfo3 = aweme3.mPaidContentInfo) == null) ? null : Long.valueOf(paidContentInfo3.getPaidCollectionId())));
                Aweme aweme4 = this.LIZ.LIZJ;
                boolean z = true;
                if ((aweme4 == null || (paidContentInfo2 = aweme4.mPaidContentInfo) == null || !paidContentInfo2.isLimitedFreeShortDrama()) && ((aweme = this.LIZ.LIZJ) == null || !C718300SFo.LIZ(aweme))) {
                    z = false;
                }
                C718270SFl.LIZ(c2344009Gk, z);
                C0RRR.LIZ(c2344009Gk);
                C718360SFu c718360SFu2 = this.LIZ;
                c2344009Gk.LJIIIIZZ("series_feed_type", C718180SFc.LIZLLL(c718360SFu2.LIZJ, c718360SFu2.LJFF));
                Aweme aweme5 = this.LIZ.LIZJ;
                c2344009Gk.LJIIIIZZ("series_video_type", aweme5 != null ? C718180SFc.LJ(aweme5) : null);
                C718360SFu c718360SFu3 = this.LIZ;
                Aweme aweme6 = c718360SFu3.LIZJ;
                String str2 = "";
                c2344009Gk.LJIIIIZZ("series_component_type", aweme6 != null ? C718180SFc.LIZJ(aweme6, c718360SFu3.LJFF) : "");
                Aweme aweme7 = this.LIZ.LIZJ;
                if (aweme7 != null && (mobParams = aweme7.getMobParams()) != null && (str = mobParams.get("is_from_series_dnu_insertion")) != null) {
                    str2 = str;
                }
                c2344009Gk.LJIIIIZZ("is_from_series_dnu_insertion", str2);
                Aweme aweme8 = this.LIZ.LIZJ;
                if (aweme8 != null && (paidContentInfo = aweme8.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
                    c2344009Gk.LJII(logExtra);
                }
                return c2344009Gk.LIZ;
            }

            @Override // X.C718260SFk, X.InterfaceC707420Roy
            public final Map<String, String> LIZJ() {
                String string;
                Aweme aweme;
                PaidContentInfo paidContentInfo;
                PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
                Map<String, String> logExtra;
                PaidContentInfo paidContentInfo2;
                PaidContentInfo paidContentInfo3;
                PaidContentInfo paidContentInfo4;
                C2344009Gk c2344009Gk = new C2344009Gk();
                Aweme aweme2 = this.LIZ.LIZJ;
                if (aweme2 == null || (paidContentInfo4 = aweme2.mPaidContentInfo) == null || (string = Long.valueOf(paidContentInfo4.getCategory()).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("series_category", string);
                Aweme aweme3 = this.LIZ.LIZJ;
                c2344009Gk.LJIIIIZZ("series_collection_id", String.valueOf((aweme3 == null || (paidContentInfo3 = aweme3.mPaidContentInfo) == null) ? null : Long.valueOf(paidContentInfo3.getPaidCollectionId())));
                Aweme aweme4 = this.LIZ.LIZJ;
                boolean z = true;
                if ((aweme4 == null || (paidContentInfo2 = aweme4.mPaidContentInfo) == null || !paidContentInfo2.isLimitedFreeShortDrama()) && ((aweme = this.LIZ.LIZJ) == null || !C718300SFo.LIZ(aweme))) {
                    z = false;
                }
                C718270SFl.LIZ(c2344009Gk, z);
                C0RRR.LIZ(c2344009Gk);
                C718360SFu c718360SFu2 = this.LIZ;
                c2344009Gk.LJIIIIZZ("series_feed_type", C718180SFc.LIZLLL(c718360SFu2.LIZJ, c718360SFu2.LJFF));
                Aweme aweme5 = this.LIZ.LIZJ;
                c2344009Gk.LJIIIIZZ("series_video_type", aweme5 != null ? C718180SFc.LJ(aweme5) : null);
                C718360SFu c718360SFu3 = this.LIZ;
                Aweme aweme6 = c718360SFu3.LIZJ;
                c2344009Gk.LJIIIIZZ("series_component_type", aweme6 != null ? C718180SFc.LIZJ(aweme6, c718360SFu3.LJFF) : "");
                Aweme aweme7 = this.LIZ.LIZJ;
                if (aweme7 != null && (paidContentInfo = aweme7.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
                    c2344009Gk.LJII(logExtra);
                }
                return c2344009Gk.LIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final boolean LJIIIIZZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        if (aweme != null && aweme.isPaidContent && !C718510SGj.LIZJ(aweme) && (paidContentInfo = aweme.mPaidContentInfo) != null && !paidContentInfo.getShouldShowPreview() && !paidContentInfo.isVideoPurchased() && !paidContentInfo.isPaidCollectionIntro() && !LJIILLIIL(aweme) && !paidContentInfo.isLimitedFreeShortDrama()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIIL(final C718360SFu c718360SFu) {
        return new C0SGE(c718360SFu) { // from class: X.0SGZ
            @Override // X.C0SGE, X.C0SH2
            public final void LIZIZ(BannerCommonTailAction.BannerActionType bannerActionType, C0SH1 c0sh1) {
                String strDecode;
                String str;
                Object obj;
                String str2;
                C0RJN c0rjnLIZIZ;
                Fragment fragment;
                Context context;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                String str3;
                Boolean boolValueOf;
                Integer numValueOf;
                String groupId;
                String aid;
                String authorUid;
                String aid2;
                String groupId2;
                String authorUid2;
                String innerFeedPanelFreeTagText;
                String innerFeedPanelTitle;
                PaidContentInfo paidContentInfo;
                PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
                PaidContentInfo paidContentInfo2;
                PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
                PaidContentInfo paidContentInfo3;
                PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ3;
                BaseFeedPageParams baseFeedPageParams;
                C2189821An6 c2189821An6;
                PaidContentInfo paidContentInfo4;
                String aid3;
                Uri uri;
                BannerCommonKey bannerCommonKey;
                if (C718420SGa.LIZ[bannerActionType.ordinal()] == 1) {
                    BannerCommonAction bannerCommonAction = c0sh1.LIZIZ;
                    if (bannerCommonAction != null && (strDecode = bannerCommonAction.schema) != null) {
                        boolean zIsLimitedFreeShortDrama = false;
                        if (strDecode.length() > 0) {
                            BannerCommonStruct bannerCommonStruct = this.LIZ.LIZLLL;
                            String innerFeedPanelDesc = null;
                            if (bannerCommonStruct != null) {
                                str = bannerCommonStruct.customizedInfo;
                            } else {
                                str = null;
                            }
                            Map map = (Map) C105700ad.LIZ(str, Map.class);
                            if (map != null) {
                                obj = map.get("is_schema_encoded");
                            } else {
                                obj = null;
                            }
                            if (!(obj instanceof Boolean)) {
                                obj = null;
                            }
                            BannerCommonStruct bannerCommonStruct2 = this.LIZ.LIZLLL;
                            if (bannerCommonStruct2 != null && (bannerCommonKey = bannerCommonStruct2.bannerKey) != null) {
                                str2 = bannerCommonKey.componentKey;
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.LJFF(str2, "bottom_banner_series_mini_drama") && Intrinsics.LJFF(obj, Boolean.TRUE)) {
                                strDecode = Uri.decode(strDecode);
                            }
                            C690870R8b c690870R8b = this.LIZ.LJ;
                            if (c690870R8b != null && (c0rjnLIZIZ = c690870R8b.LIZIZ()) != null && (fragment = c0rjnLIZIZ.LJ) != null && (context = fragment.getContext()) != null) {
                                if (strDecode != null && (uri = UriProtector.parse(strDecode)) != null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID);
                                } else {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                                }
                                Aweme aweme = this.LIZ.LIZJ;
                                String strLIZIZ = "";
                                if (aweme == null || (aid3 = aweme.getAid()) == null || !Intrinsics.LJFF(aid3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                    str3 = "";
                                } else {
                                    C1012040cRW.LIZIZ().LIZ = C1483410ohn.LJLJJI();
                                    C1012040cRW.LIZIZ().LIZJ = System.currentTimeMillis();
                                    C1012040cRW.LIZIZ().LIZIZ = aid3;
                                    str3 = "1";
                                }
                                Aweme aweme2 = this.LIZ.LIZJ;
                                if (aweme2 != null && (paidContentInfo4 = aweme2.mPaidContentInfo) != null) {
                                    zIsLimitedFreeShortDrama = paidContentInfo4.isLimitedFreeShortDrama();
                                }
                                boolean zLIZIZ = C718510SGj.LIZIZ(this.LIZ.LIZJ);
                                if (zLIZIZ) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(this.LIZ.LJFF);
                                    sbLIZ.append("_outerfeed");
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                }
                                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, strDecode);
                                smartRouteBuildRoute.withParam("is_from_bottom_banner", true);
                                Aweme aweme3 = this.LIZ.LIZJ;
                                if (aweme3 != null) {
                                    boolValueOf = Boolean.valueOf(aweme3.isPaidContent);
                                } else {
                                    boolValueOf = null;
                                }
                                smartRouteBuildRoute.withParam("is_intro_or_preview", boolValueOf);
                                smartRouteBuildRoute.withParam("enter_from", this.LIZ.LJFF);
                                C690870R8b c690870R8b2 = this.LIZ.LJ;
                                if (c690870R8b2 != null && (baseFeedPageParams = c690870R8b2.LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                                    numValueOf = Integer.valueOf(c2189821An6.getCursor());
                                } else {
                                    numValueOf = null;
                                }
                                smartRouteBuildRoute.withParam("start_cursor", numValueOf);
                                Aweme aweme4 = this.LIZ.LIZJ;
                                if (aweme4 != null) {
                                    groupId = aweme4.getGroupId();
                                } else {
                                    groupId = null;
                                }
                                smartRouteBuildRoute.withParam("anchor_group_id", groupId);
                                Aweme aweme5 = this.LIZ.LIZJ;
                                if (aweme5 != null) {
                                    aid = aweme5.getAid();
                                } else {
                                    aid = null;
                                }
                                smartRouteBuildRoute.withParam("anchor_video_id", aid);
                                Aweme aweme6 = this.LIZ.LIZJ;
                                if (aweme6 != null) {
                                    authorUid = AwemeExtKt.getAuthorUid(aweme6);
                                } else {
                                    authorUid = null;
                                }
                                smartRouteBuildRoute.withParam("anchor_author_id", authorUid);
                                smartRouteBuildRoute.withParam("use_share_player", str3);
                                smartRouteBuildRoute.withParam("root_scene", "2");
                                smartRouteBuildRoute.withParam("is_limited_free", zIsLimitedFreeShortDrama);
                                Aweme aweme7 = this.LIZ.LIZJ;
                                if (aweme7 != null) {
                                    aid2 = aweme7.getAid();
                                } else {
                                    aid2 = null;
                                }
                                smartRouteBuildRoute.withParam("source_video_id", aid2);
                                Aweme aweme8 = this.LIZ.LIZJ;
                                if (aweme8 != null) {
                                    groupId2 = aweme8.getGroupId();
                                } else {
                                    groupId2 = null;
                                }
                                smartRouteBuildRoute.withParam("source_group_id", groupId2);
                                Aweme aweme9 = this.LIZ.LIZJ;
                                if (aweme9 != null) {
                                    authorUid2 = AwemeExtKt.getAuthorUid(aweme9);
                                } else {
                                    authorUid2 = null;
                                }
                                smartRouteBuildRoute.withParam("source_author_id", authorUid2);
                                smartRouteBuildRoute.withParam("source_video_type", C718180SFc.LJ(this.LIZ.LIZJ));
                                smartRouteBuildRoute.withParam("log_extra", C718180SFc.LIZIZ(this.LIZ.LIZJ));
                                C718360SFu c718360SFu2 = this.LIZ;
                                smartRouteBuildRoute.withParam("series_feed_type", C718180SFc.LIZLLL(c718360SFu2.LIZJ, c718360SFu2.LJFF));
                                Aweme aweme10 = this.LIZ.LIZJ;
                                if (aweme10 != null && (paidContentInfo3 = aweme10.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ3 = C718180SFc.LIZ(paidContentInfo3)) != null) {
                                    innerFeedPanelFreeTagText = paidContentMiniDramaInfoLIZ3.getInnerFeedPanelFreeTagText();
                                } else {
                                    innerFeedPanelFreeTagText = null;
                                }
                                smartRouteBuildRoute.withParam("free_tag_text", innerFeedPanelFreeTagText);
                                Aweme aweme11 = this.LIZ.LIZJ;
                                if (aweme11 != null && (paidContentInfo2 = aweme11.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo2)) != null) {
                                    innerFeedPanelTitle = paidContentMiniDramaInfoLIZ2.getInnerFeedPanelTitle();
                                } else {
                                    innerFeedPanelTitle = null;
                                }
                                smartRouteBuildRoute.withParam("inner_feed_panel_title", innerFeedPanelTitle);
                                Aweme aweme12 = this.LIZ.LIZJ;
                                if (aweme12 != null && (paidContentInfo = aweme12.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null) {
                                    innerFeedPanelDesc = paidContentMiniDramaInfoLIZ.getInnerFeedPanelDesc();
                                }
                                smartRouteBuildRoute.withParam("inner_feed_panel_desc", innerFeedPanelDesc);
                                smartRouteBuildRoute.withParam("drama_extra_tracking_params", new DramaExtraTrackingParams(Boolean.FALSE, Boolean.valueOf(zLIZIZ), strLIZIZ, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE).toJson());
                                smartRouteBuildRoute.open();
                                return;
                            }
                            this.LIZIZ.LJIIIZ("routeToInnerFeed action context is empty");
                            return;
                        }
                        this.LIZIZ.LJ("schema is empty");
                        return;
                    }
                    return;
                }
                C707460Rp2 c707460Rp2 = this.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("default action is not supported ");
                sbLIZ2.append(bannerActionType);
                c707460Rp2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final boolean LJIILIIL(Fragment fragment) {
        String string;
        if (fragment == null) {
            return false;
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("category");
        } else {
            string = null;
        }
        SeriesCategory seriesCategoryLIZ = C718480SGg.LIZ(string);
        if (seriesCategoryLIZ == null) {
            seriesCategoryLIZ = SeriesCategory.DEFAULT;
        }
        if (seriesCategoryLIZ != SeriesCategory.MINI_DRAMA) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final boolean LJIILLIIL(Aweme aweme) {
        String curUserId;
        String uid;
        User author;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUserId = iAccountUserServiceLJFF.getCurUserId()) != null) {
            if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            return curUserId.equals(uid);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIJI(Object obj) {
        if (!(obj instanceof C0RF0) || obj == null) {
            return null;
        }
        return new PaidContentImmersiveViewHolder((C0RF0) obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIJJ(Object obj) {
        if (!(obj instanceof C0RF0) || obj == null) {
            return null;
        }
        return new PaidContentVideoViewHolder((C0RF0) obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final Object LJIJJLI(Object obj) {
        if (!(obj instanceof C0RF0) || obj == null) {
            return null;
        }
        return new PaidContentLockVideoViewHolder((C0RF0) obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final boolean LJIL(Aweme aweme) {
        String str;
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            str = mobParams.get("paid_content_inner_feed_continue_play");
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "1");
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C13IQ LJJ(C690870R8b c690870R8b) {
        Fragment fragment;
        Bundle arguments;
        C0RJN c0rjnLIZIZ;
        String string = null;
        if ((c690870R8b instanceof C690870R8b) && c690870R8b != null && (c0rjnLIZIZ = c690870R8b.LIZIZ()) != null) {
            fragment = c0rjnLIZIZ.LJ;
        } else {
            fragment = null;
        }
        if (fragment != null && (arguments = fragment.getArguments()) != null) {
            string = arguments.getString("category");
        }
        SeriesCategory seriesCategoryLIZ = C718480SGg.LIZ(string);
        if (seriesCategoryLIZ == null) {
            seriesCategoryLIZ = SeriesCategory.DEFAULT;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "mini_drama_overlay_opt", true, true) && seriesCategoryLIZ == SeriesCategory.MINI_DRAMA) {
            return C13LE.LIZ(PaidContentCellOverlayComponentOptTrigger.class);
        }
        return C13LE.LIZ(PaidContentCellOverlayComponentTrigger.class);
    }

    public static String LJJIFFI(PaidContentInfo paidContentInfo, PaidContentMiniDramaInfo paidContentMiniDramaInfo) {
        Integer episodeNumInList;
        if (paidContentMiniDramaInfo == null) {
            return null;
        }
        String videoTitlePrefixForEpisodes = paidContentMiniDramaInfo.getVideoTitlePrefixForEpisodes();
        if (videoTitlePrefixForEpisodes != null && videoTitlePrefixForEpisodes.length() != 0 && !paidContentInfo.isPaidCollectionIntro() && (paidContentMiniDramaInfo == null || !Intrinsics.LJFF(paidContentMiniDramaInfo.isHighLight(), Boolean.TRUE))) {
            String episodeNumber = paidContentInfo.getEpisodeNumber();
            if (episodeNumber == null || (episodeNumInList = C2095008Iq.LJIIJJI(episodeNumber)) == null) {
                if (paidContentMiniDramaInfo != null) {
                    episodeNumInList = paidContentMiniDramaInfo.getEpisodeNumInList();
                } else {
                    episodeNumInList = null;
                }
            }
            if (C08A4.LIZ(episodeNumInList)) {
                return u.LJJIFFI(videoTitlePrefixForEpisodes, "{s_count}", String.valueOf(episodeNumInList), false);
            }
        }
        if (paidContentMiniDramaInfo == null) {
            return null;
        }
        return paidContentMiniDramaInfo.getVideoTitlePrefix();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final void LJ(TuxTextView tuxTextView, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL(it2.next()).toString());
        }
        if (tuxTextView.getWidth() == 0) {
            HandlerHook.viewPost(tuxTextView, new ARunnableS35S0300000_2((Object) this, (Activity) tuxTextView, (C259800zU<ECAsyncInflaterV2>) arrayList, (Lifecycle) 1));
            return;
        }
        int width = (tuxTextView.getWidth() - tuxTextView.getPaddingLeft()) - tuxTextView.getPaddingRight();
        TextPaint paint = tuxTextView.getPaint();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String strLIZIZ : arrayList) {
            int i2 = i + 1;
            if (sb.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((Object) sb);
                sbLIZ.append(" · ");
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (paint.measureText(strLIZIZ) > width && i != 0) {
                break;
            }
            sb.setLength(0);
            sb.append(strLIZIZ);
            i = i2;
        }
        tuxTextView.setText(sb.toString());
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C0SJF LIZIZ(C0SJF c0sjf, Context context, Aweme aweme) {
        Long lValueOf;
        PaidContentInfo paidContentInfo;
        String strLJJIFFI;
        try {
            PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
            Integer numValueOf = null;
            if (paidContentInfo2 != null) {
                lValueOf = Long.valueOf(paidContentInfo2.getCategory());
            } else {
                lValueOf = null;
            }
            long jOrdinal = SeriesCategory.MINI_DRAMA.ordinal();
            if (lValueOf != null && lValueOf.longValue() == jOrdinal && (paidContentInfo = aweme.mPaidContentInfo) != null && (((strLJJIFFI = LJJIFFI(paidContentInfo, C718180SFc.LIZ(paidContentInfo))) != null && strLJJIFFI.length() != 0) || !paidContentInfo.isPaidCollectionIntro())) {
                String string = C20642515q3.LJFF().getString(2131848665);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append('|');
                sbLIZ.append(string);
                C0SJM c0sjm = new C0SJM(0, 0, C2188811AlT.LIZIZ(sbLIZ));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ei, context);
                if (numLIZJ != null) {
                    c0sjm.LLIZLLLIL.add(new ForegroundColorSpan(numLIZJ.intValue()));
                }
                if (strLJJIFFI != null && strLJJIFFI.length() != 0) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJIFFI, new String[]{" | "}, 0, 6);
                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                    int i = 0;
                    for (Object obj : listLJJLIIIJILLIZJL) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            c13dvLIZIZ.add(new C0SJM(0, 0, (String) obj));
                            if (i != listLJJLIIIJILLIZJL.size() - 1 || listLJJLIIIJILLIZJL.size() == 1) {
                                c13dvLIZIZ.add(c0sjm);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
                    List listLLIIIJ = C13LP.LLIIIJ(c0sjf.LLILLJJLI);
                    ((ArrayList) listLLIIIJ).addAll(0, listLIZ);
                    c0sjf.LLILLJJLI = listLLIIIJ;
                    return c0sjf;
                }
                String episodeNumber = paidContentInfo.getEpisodeNumber();
                if (episodeNumber != null) {
                    numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(episodeNumber));
                }
                if (C08A4.LIZ(numValueOf)) {
                    C0SJM c0sjm2 = new C0SJM(0, 0, context.getString(2131847442, numValueOf));
                    String desc = aweme.getDesc();
                    if (desc != null && desc.length() != 0) {
                        List listLJIIJJI = C1697810uHb.LJIIJJI(c0sjm2, c0sjm);
                        List listLLIIIJ2 = C13LP.LLIIIJ(c0sjf.LLILLJJLI);
                        ((ArrayList) listLLIIIJ2).addAll(0, listLJIIJJI);
                        c0sjf.LLILLJJLI = listLLIIIJ2;
                        return c0sjf;
                    }
                    List listLLIIIJ3 = C13LP.LLIIIJ(c0sjf.LLILLJJLI);
                    ListProtector.add(listLLIIIJ3, 0, c0sjm2);
                    c0sjf.LLILLJJLI = listLLIIIJ3;
                    return c0sjf;
                }
                return c0sjf;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return c0sjf;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final C718840SHq LJFF(C718840SHq c718840SHq, Context context, Aweme aweme) {
        PaidContentInfo paidContentInfo;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null) {
            try {
                String strLJJIFFI = LJJIFFI(paidContentInfo, C718180SFc.LIZ(paidContentInfo));
                if ((strLJJIFFI != null && strLJJIFFI.length() != 0) || !paidContentInfo.isPaidCollectionIntro()) {
                    C718450SGd c718450SGd = new C718450SGd(context, strLJJIFFI, paidContentInfo, aweme);
                    ArrayList arrayList = new ArrayList(c718840SHq.LIZ);
                    arrayList.addAll(0, c718450SGd.invoke());
                    c718840SHq.LIZ = arrayList;
                    return c718840SHq;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c718840SHq;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentFeedSeries
    public final void LIZ(C19EG c19eg, Context context, String str, Aweme aweme, String str2, Boolean bool, String str3, Function1<? super SmartRoute, Unit> function1) {
        Long lValueOf;
        Long lValueOf2;
        String str4;
        boolean zIsLimitedFreeShortDrama;
        String str5;
        String str6;
        String innerFeedPanelFreeTagText;
        String innerFeedPanelTitle;
        String innerFeedPanelDesc;
        UrlModel coverUrl;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ3;
        C718460SGe.LIZ.LIZ(aweme);
        String aid = aweme.getAid();
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        String collectionName = null;
        if (paidContentInfo != null) {
            lValueOf = Long.valueOf(paidContentInfo.getPaidCollectionId());
        } else {
            lValueOf = null;
        }
        PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
        if (paidContentInfo2 != null) {
            lValueOf2 = Long.valueOf(paidContentInfo2.getCategory());
        } else {
            lValueOf2 = null;
        }
        String strLIZIZ = "";
        if (!Intrinsics.LJFF(str, aid) || c19eg == null) {
            str4 = "";
        } else {
            C1012040cRW.LIZIZ().LIZ = C1483410ohn.LJLJJI();
            C1012040cRW.LIZIZ().LIZJ = System.currentTimeMillis();
            C1012040cRW.LIZIZ().LIZIZ = aid;
            str4 = "1";
        }
        PaidContentInfo paidContentInfo3 = aweme.mPaidContentInfo;
        if (paidContentInfo3 != null) {
            zIsLimitedFreeShortDrama = paidContentInfo3.isLimitedFreeShortDrama();
        } else {
            zIsLimitedFreeShortDrama = false;
        }
        boolean zLIZIZ = C718510SGj.LIZIZ(aweme);
        if (zLIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_outerfeed");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aweme://paidcontent/innerfeed?enter_from=");
        sbLIZ2.append(str2);
        sbLIZ2.append("&collection_id=");
        sbLIZ2.append(lValueOf);
        sbLIZ2.append("&category=");
        sbLIZ2.append(lValueOf2);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ2));
        smartRouteBuildRoute.withParam("is_from_bottom_banner", true);
        smartRouteBuildRoute.withParam("is_intro_or_preview", aweme.isPaidContent);
        smartRouteBuildRoute.withParam("should_hide_video_list", "1");
        smartRouteBuildRoute.withParam("root_scene", "2");
        smartRouteBuildRoute.withParam("use_share_player", str4);
        if (str != null && str.length() != 0) {
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
        }
        smartRouteBuildRoute.withParam("is_limited_free", zIsLimitedFreeShortDrama);
        smartRouteBuildRoute.withParam("source_video_id", aweme.getAid());
        smartRouteBuildRoute.withParam("source_author_id", AwemeExtKt.getAuthorUid(aweme));
        smartRouteBuildRoute.withParam("source_video_type", C718180SFc.LJ(aweme));
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null) {
            str5 = mobParams.get("source_video_id");
        } else {
            str5 = null;
        }
        smartRouteBuildRoute.withParam("source_continue_video_id", str5);
        smartRouteBuildRoute.withParam("log_extra", C718180SFc.LIZIZ(aweme));
        smartRouteBuildRoute.withParam("series_feed_type", C718180SFc.LIZLLL(aweme, str2));
        HashMap<String, String> mobParams2 = aweme.getMobParams();
        if (mobParams2 == null || (str6 = mobParams2.get("is_series_continuation_play")) == null) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        smartRouteBuildRoute.withParam("is_from_outfeed_series_continuation_play", str6);
        PaidContentInfo paidContentInfo4 = aweme.mPaidContentInfo;
        if (paidContentInfo4 != null && (paidContentMiniDramaInfoLIZ3 = C718180SFc.LIZ(paidContentInfo4)) != null) {
            innerFeedPanelFreeTagText = paidContentMiniDramaInfoLIZ3.getInnerFeedPanelFreeTagText();
        } else {
            innerFeedPanelFreeTagText = null;
        }
        smartRouteBuildRoute.withParam("free_tag_text", innerFeedPanelFreeTagText);
        PaidContentInfo paidContentInfo5 = aweme.mPaidContentInfo;
        if (paidContentInfo5 != null && (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo5)) != null) {
            innerFeedPanelTitle = paidContentMiniDramaInfoLIZ2.getInnerFeedPanelTitle();
        } else {
            innerFeedPanelTitle = null;
        }
        smartRouteBuildRoute.withParam("inner_feed_panel_title", innerFeedPanelTitle);
        PaidContentInfo paidContentInfo6 = aweme.mPaidContentInfo;
        if (paidContentInfo6 != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo6)) != null) {
            innerFeedPanelDesc = paidContentMiniDramaInfoLIZ.getInnerFeedPanelDesc();
        } else {
            innerFeedPanelDesc = null;
        }
        smartRouteBuildRoute.withParam("inner_feed_panel_desc", innerFeedPanelDesc);
        smartRouteBuildRoute.withParam("should_open_selection_panel", bool);
        smartRouteBuildRoute.withParam("component_preload_scene", str3);
        PaidContentInfo paidContentInfo7 = aweme.mPaidContentInfo;
        if (paidContentInfo7 != null) {
            coverUrl = paidContentInfo7.getCoverUrl();
        } else {
            coverUrl = null;
        }
        smartRouteBuildRoute.withParam("cover_url", coverUrl);
        PaidContentInfo paidContentInfo8 = aweme.mPaidContentInfo;
        if (paidContentInfo8 != null) {
            collectionName = paidContentInfo8.getCollectionName();
        }
        smartRouteBuildRoute.withParam("collection_name", collectionName);
        smartRouteBuildRoute.withParam("drama_extra_tracking_params", new DramaExtraTrackingParams(Boolean.FALSE, Boolean.valueOf(zLIZIZ), strLIZIZ, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE).toJson());
        AppDiffProtocol.LIZ.getClass();
        C718440SGc.LIZIZ.getValue().LIZ();
        function1.invoke(smartRouteBuildRoute);
        smartRouteBuildRoute.open();
    }
}

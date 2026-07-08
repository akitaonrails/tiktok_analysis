package com.ss.android.ugc.aweme.feed.adapter.widget.ad;

import X.C01GW;
import X.C0X9S;
import X.C1019100ccu;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C1ACA;
import X.C20441214yg;
import X.C452501pT;
import X.C998710c61;
import X.C998820c6C;
import X.C998830c6D;
import X.C998850c6F;
import X.C998990c6T;
import X.C999410c79;
import X.EnumC494740Jai;
import X.EnumC999300c6y;
import X.InterfaceC594300NSq;
import X.InterfaceC990070bs5;
import Y.ALAdapterS12S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.LiveProduct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Set;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdCardWidget extends AbsLivePreviewBottomCardWidget implements Observer<C998850c6F> {
    public static final EnumC999300c6y LLJJIJIIJIL = EnumC999300c6y.EC_AD_CARD;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public C0X9S<LiveAdCardModel> LLJJIII;
    public boolean LLJJIJI;

    public AdCardWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 279), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJILJIL = C452501pT.LIZIZ(new C998710c61(this));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 278));
        this.LLJILLL = C452501pT.LIZIZ(new C998820c6C(this));
        this.LLJJ = C452501pT.LIZIZ(new C998830c6D(this));
        this.LLJJI = C452501pT.LIZIZ(new C998990c6T(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final InterfaceC990070bs5 N1() {
        return (InterfaceC990070bs5) this.LLJJ.getValue();
    }

    public final ViewGroup O1() {
        return (ViewGroup) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        C1ACA c1acaZ1 = z1();
        if (C1019100ccu.LJI(c1acaZ1 != null ? c1acaZ1.LIZIZ : null)) {
            InterfaceC990070bs5 interfaceC990070bs5N1 = N1();
            C1ACA c1acaZ12 = z1();
            interfaceC990070bs5N1.LJI(c1acaZ12 != null ? c1acaZ12.LIZIZ : null);
            N1().LJII((C999410c79) this.LLJJI.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        Aweme aweme;
        C1ACA c1acaZ1 = z1();
        if (C1019100ccu.LJI(c1acaZ1 != null ? c1acaZ1.LIZIZ : null)) {
            C0X9S<LiveAdCardModel> c0x9s = this.LLJJIII;
            if (c0x9s != null) {
                c0x9s.cancel();
            }
            this.LLJJIII = null;
            N1().LJIIIIZZ();
            P1();
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 == null || (aweme = c1acaZ12.LIZIZ) == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return;
        }
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIIL(hashCode());
    }

    public final void P1() {
        Set<EnumC999300c6y> set;
        C1ACA c1acaZ1 = z1();
        if (C1019100ccu.LJI(c1acaZ1 != null ? c1acaZ1.LIZIZ : null) && this.LLJJIJI) {
            C20441214yg.LJIIIZ("AdCardWidget", "liveAdCardHide");
            O1().animate().translationY(0.0f).setDuration(360L).setStartDelay(250L).setListener(new ALAdapterS12S0100000_16(this, 4)).start();
            int childCount = O1().getChildCount();
            for (int i = 0; i < childCount; i++) {
                O1().getChildAt(i).animate().alpha(1.0f).setDuration(200L).setStartDelay(450L).start();
            }
            this.LLJJIJI = false;
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 == null || (set = c1acaZ12.LJLJL) == null) {
                return;
            }
            set.remove(LLJJIJIIJIL);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        N1().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        final Aweme aweme;
        final LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1;
        long jLongValue;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Long creativeId;
        AwemeRawAd awemeRawAd3;
        C1ACA c1acaZ12 = z1();
        String liveComponentPayload = null;
        if (c1acaZ12 != null) {
            aweme = c1acaZ12.LIZIZ;
        } else {
            aweme = null;
        }
        int componentType = 0;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIIZ(hashCode(), aweme);
        }
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null && (liveRoomStruct = c1acaZ13.LIZJ) != null && C1019100ccu.LJI(aweme) && (c1acaZ1 = z1()) != null && c1acaZ1.LJFF) {
            N1().LIZ();
            ICommercializeLiveService iCommercializeLiveService = (ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class);
            String strValueOf = String.valueOf(liveRoomStruct.id);
            String uid = liveRoomStruct.owner.getUid();
            String secUid = liveRoomStruct.owner.getSecUid();
            if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
                componentType = awemeRawAd3.getComponentType();
            }
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (creativeId = awemeRawAd2.getCreativeId()) != null) {
                jLongValue = creativeId.longValue();
            } else {
                jLongValue = 0;
            }
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                liveComponentPayload = awemeRawAd.getLiveComponentPayload();
            }
            this.LLJJIII = iCommercializeLiveService.LJIIJJI(componentType, strValueOf, uid, jLongValue, secUid, liveComponentPayload);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C0X9S<LiveAdCardModel> c0x9s = this.LLJJIII;
            if (c0x9s != null) {
                c0x9s.enqueue(new InterfaceC594300NSq<LiveAdCardModel>() { // from class: X.0bs4
                    @Override // X.InterfaceC594300NSq
                    public final void onFailure(C0X9S<LiveAdCardModel> c0x9s2, Throwable th) {
                        AwemeRawAd awemeRawAd4;
                        C1ACA c1acaZ14 = this.z1();
                        if (c1acaZ14 != null && c1acaZ14.LJII) {
                            Aweme aweme2 = aweme;
                            if (aweme2 != null) {
                                awemeRawAd4 = aweme2.getAwemeRawAd();
                            } else {
                                awemeRawAd4 = null;
                            }
                            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", awemeRawAd4);
                            c1022820ciuLIZLLL.LIZJ("card", "refer");
                            c1022820ciuLIZLLL.LIZIZ("app_tech_problem", "fail_reason");
                            c1022820ciuLIZLLL.LJII();
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r5v2, types: [X.0bs6] */
                    @Override // X.InterfaceC594300NSq
                    public final void onResponse(C0X9S<LiveAdCardModel> c0x9s2, C0X52<LiveAdCardModel> c0x52) throws JSONException {
                        LiveAdCardModel liveAdCardModel;
                        ComponentData componentData;
                        CardStruct cardStruct;
                        Integer numValueOf;
                        String strLIZLLL;
                        Aweme aweme2 = aweme;
                        AwemeRawAd awemeRawAd4 = null;
                        String strLIZLLL2 = null;
                        AwemeRawAd awemeRawAd5 = null;
                        if (aweme2 != null && C1019100ccu.LJI(aweme2)) {
                            if (c0x52 != null) {
                                liveAdCardModel = c0x52.LIZIZ;
                            } else {
                                liveAdCardModel = null;
                            }
                            if (liveAdCardModel != null && c0x52.LIZJ() && c0x52.LIZIZ.getComponentData() != null && (componentData = c0x52.LIZIZ.getComponentData()) != null && componentData.cardInfo != null) {
                                String componentFailReason = c0x52.LIZIZ.getComponentFailReason();
                                if (componentFailReason != null) {
                                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
                                    c1022820ciuLIZLLL.LIZJ("card", "refer");
                                    c1022820ciuLIZLLL.LIZIZ(componentFailReason, "fail_reason");
                                    c1022820ciuLIZLLL.LJII();
                                    return;
                                }
                                LiveProduct liveProductCase = c0x52.LIZIZ.getLiveProductCase();
                                Object frontendExtraData = c0x52.LIZIZ.getFrontendExtraData();
                                if (liveProductCase != null) {
                                    if (liveProductCase.productStatus != 1) {
                                        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
                                        c1022820ciuLIZLLL2.LIZJ("card", "refer");
                                        c1022820ciuLIZLLL2.LIZIZ("sold_out", "fail_reason");
                                        c1022820ciuLIZLLL2.LJII();
                                        return;
                                    }
                                } else if (frontendExtraData == null) {
                                    C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
                                    c1022820ciuLIZLLL3.LIZJ("card", "refer");
                                    c1022820ciuLIZLLL3.LIZIZ("no_live_product", "fail_reason");
                                    c1022820ciuLIZLLL3.LJII();
                                    return;
                                }
                                ComponentData componentData2 = c0x52.LIZIZ.getComponentData();
                                if (componentData2 != null) {
                                    cardStruct = componentData2.cardInfo;
                                    if (cardStruct != null && Intrinsics.LJFF(cardStruct.getOnlyTrackEventNotShow(), Boolean.TRUE)) {
                                        C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", aweme.getAwemeRawAd());
                                        c1022820ciuLIZLLL4.LIZJ("card", "refer");
                                        c1022820ciuLIZLLL4.LIZIZ("only_track", "fail_reason");
                                        c1022820ciuLIZLLL4.LJII();
                                        return;
                                    }
                                } else {
                                    cardStruct = null;
                                }
                                JSONObject jSONObject = new JSONObject();
                                long j = jCurrentTimeMillis;
                                Aweme aweme3 = aweme;
                                jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - j));
                                AwemeRawAd awemeRawAd6 = aweme3.getAwemeRawAd();
                                if (awemeRawAd6 != null) {
                                    numValueOf = Integer.valueOf(awemeRawAd6.getComponentType());
                                } else {
                                    numValueOf = null;
                                }
                                jSONObject.putOpt("component_type", numValueOf);
                                C20684815ws.LJIJ("ad_live_card_request", jSONObject);
                                if (cardStruct != null) {
                                    AdCardWidget adCardWidget = this;
                                    Aweme aweme4 = aweme;
                                    LiveRoomStruct liveRoomStruct2 = liveRoomStruct;
                                    adCardWidget.N1().LJFF(cardStruct);
                                    AwemeRawAd awemeRawAd7 = aweme4.getAwemeRawAd();
                                    if (awemeRawAd7 == null) {
                                        awemeRawAd7 = new AwemeRawAd();
                                    }
                                    AdLiveEnterRoomConfig adLiveEnterRoomConfigLIZJ = C1019100ccu.LIZJ(aweme4, awemeRawAd7);
                                    adLiveEnterRoomConfigLIZJ.followStatus = String.valueOf(liveRoomStruct2.owner.getFollowStatus());
                                    InterfaceC990070bs5 interfaceC990070bs5N1 = adCardWidget.N1();
                                    String strLIZLLL3 = C08JS.LIZLLL(adLiveEnterRoomConfigLIZJ);
                                    Object liveProduct = c0x52.LIZIZ.getLiveProduct();
                                    if (liveProduct != null) {
                                        strLIZLLL = C08JS.LIZLLL(liveProduct);
                                    } else {
                                        strLIZLLL = null;
                                    }
                                    if (frontendExtraData != null) {
                                        strLIZLLL2 = C08JS.LIZLLL(frontendExtraData);
                                    }
                                    interfaceC990070bs5N1.LIZJ(strLIZLLL3, strLIZLLL, strLIZLLL2);
                                    AwemeRawAd awemeRawAd8 = aweme4.getAwemeRawAd();
                                    if (awemeRawAd8 != null && awemeRawAd8.getLiveCardIncentiveInfo() != null) {
                                        adCardWidget.N1().LIZIZ(((IFeedAdShoppingService) ServiceManager.get().getService(IFeedAdShoppingService.class)).LIZLLL(aweme4), GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, awemeRawAd8.getLiveCardIncentiveInfo()));
                                    }
                                    adCardWidget.N1().load();
                                    ?? r5 = new Object() { // from class: X.0bs6
                                    };
                                    if (cardStruct.getShowSeconds() > 0) {
                                        adCardWidget.N1().LJ(((long) cardStruct.getShowSeconds()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), r5);
                                        return;
                                    } else {
                                        adCardWidget.N1().LJ(0L, r5);
                                        return;
                                    }
                                }
                                return;
                            }
                            Aweme aweme5 = aweme;
                            if (aweme5 != null) {
                                awemeRawAd5 = aweme5.getAwemeRawAd();
                            }
                            C1022820ciu c1022820ciuLIZLLL5 = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", awemeRawAd5);
                            c1022820ciuLIZLLL5.LIZJ("card", "refer");
                            c1022820ciuLIZLLL5.LIZIZ("no_live_product", "fail_reason");
                            c1022820ciuLIZLLL5.LJII();
                            return;
                        }
                        Aweme aweme6 = aweme;
                        if (aweme6 != null) {
                            awemeRawAd4 = aweme6.getAwemeRawAd();
                        }
                        C1022820ciu c1022820ciuLIZLLL6 = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", awemeRawAd4);
                        c1022820ciuLIZLLL6.LIZJ("card", "refer");
                        c1022820ciuLIZLLL6.LIZIZ("app_tech_problem", "fail_reason");
                        c1022820ciuLIZLLL6.LJII();
                    }
                });
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C998850c6F c998850c6F) {
        Aweme aweme;
        NextLiveData<Boolean> nextLiveData;
        C998850c6F c998850c6F2 = c998850c6F;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && c1acaZ1.LJII) {
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null) {
                aweme = c1acaZ12.LIZIZ;
            } else {
                aweme = null;
            }
            if (C1019100ccu.LJI(aweme)) {
                String str = c998850c6F2.LIZ;
                int iHashCode = str.hashCode();
                if (iHashCode != 97530138) {
                    if (iHashCode == 97857237 && str.equals("ad_live_card_show") && !this.LLJJIJI) {
                        M1();
                        LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
                        if (livePreviewBottomCardVMM1 == null || (nextLiveData = livePreviewBottomCardVMM1.LLILLJJLI) == null || !Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) {
                            M1();
                            HandlerHook.viewPost((View) this.LLJILJIL.getValue(), new ARunnableS116S0100000_16(this, 52));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!str.equals("ad_live_card_hide")) {
                    return;
                }
                P1();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        ((C999410c79) this.LLJJI.getValue()).LIZ("ad_live_card_hide", this);
        ((C999410c79) this.LLJJI.getValue()).LIZ("ad_live_card_show", this);
    }
}

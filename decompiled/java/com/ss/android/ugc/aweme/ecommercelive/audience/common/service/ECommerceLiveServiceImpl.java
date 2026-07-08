package com.ss.android.ugc.aweme.ecommercelive.audience.common.service;

import X.C01GW;
import X.C05D4;
import X.C099F;
import X.C099G;
import X.C099R;
import X.C0C64;
import X.C0PEM;
import X.C0WZX;
import X.C1003900cEO;
import X.C1005440cGs;
import X.C123100dR;
import X.C1232604s0;
import X.C1311670kEn;
import X.C13BV;
import X.C1507790pL7;
import X.C1701330uNH;
import X.C1733130vCZ;
import X.C1733150vCb;
import X.C1733990vDx;
import X.C1743900vTw;
import X.C180F;
import X.C180G;
import X.C180H;
import X.C180I;
import X.C180J;
import X.C183S;
import X.C188I;
import X.C19719512Dh;
import X.C20337514hx;
import X.C2095008Iq;
import X.C21163717rv;
import X.C21163817rw;
import X.C21179617uU;
import X.C21183717v9;
import X.C21183917vB;
import X.C21191817wS;
import X.C21206717yr;
import X.C21212717zp;
import X.C21212817zq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C2341109Fh;
import X.C258240AAc;
import X.C452501pT;
import X.C599470NfF;
import X.C817503Hh;
import X.C830490Whz;
import X.EnumC21192017wU;
import X.EnumC600280NgY;
import X.InterfaceC1364105Vn;
import X.InterfaceC1611000s1a;
import X.InterfaceC497601wk;
import X.InterfaceC999030c6X;
import Y.ACListenerS166S0100000_32;
import Y.AUListenerS214S0200000_2;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.AudienceApi;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config.EcWidgetLoadPriorityConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.config.PrefetchPinConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.cache.LiveExposedProductsCache;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.BFFData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.CardConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api.GoLiveCard;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.data.FeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.BottomScenesAllowlist;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.PreviewGoLiveCardFrequency;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackActivity;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayActivity;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.business.billboard.feed.SeaLiveOecPreviewRoomData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.SeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionUserInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.RegularAuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.prefetch.UsLiveRoomFragmentObserver;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ShoppingBagList;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.base.TrackParams;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.prefetch.LiveRoomFragmentObserver;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.FYPCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import com.ss.android.ugc.aweme.feed.model.live.GoLiveCardTargetRoomInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.OecLivePreviewRoomData;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCardType;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import defpackage.n1;
import g1c.AjS46S0200000_32;
import g1c.AjS72S0100000_32;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class ECommerceLiveServiceImpl implements IEcommerceLiveService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C180I());

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean Ba() {
        return ((EcWidgetLoadPriorityConfig) C180H.LIZIZ.getValue()).loadShopCartIconAsP0;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean Ch() {
        return ((EcWidgetLoadPriorityConfig) C180H.LIZIZ.getValue()).loadPinCardAsP0;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final InterfaceC999030c6X LJJIII() {
        return new C1003900cEO();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean LJJIIJ() {
        IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
        return iEcommerceRegionService != null && iEcommerceRegionService.LIZIZ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean LJJIIZ() {
        return ((EcWidgetLoadPriorityConfig) C180H.LIZIZ.getValue()).loadWidgetAfterFrameCallback;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final C188I LJJIJ() {
        return new C188I() { // from class: X.182z
            public Integer LIZ = 0;
            public C183F LIZIZ;
            public Function1<? super C183I, Unit> LIZJ;
            public ViewGroup LIZLLL;

            @Override // X.C188I
            public final C188K build() {
                C212206182q c212206182q = new C212206182q();
                c212206182q.LLJ = this.LIZJ;
                c212206182q.LLIZLLLIL = this.LIZIZ;
                ViewGroup viewGroup = this.LIZLLL;
                if (viewGroup == null) {
                    return null;
                }
                c212206182q.LLILLJJLI = viewGroup;
                Integer num = this.LIZ;
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 1) {
                    c212206182q.LLILLL = new AnonymousClass1833() { // from class: X.182t
                        @Override // X.AnonymousClass1833
                        public final Animator LIZ(AbstractC212214182y abstractC212214182y) {
                            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(abstractC212214182y, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, abstractC212214182y.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, abstractC212214182y.getTranslationY(), abstractC212214182y.getLayoutParams().height));
                            objectAnimatorOfPropertyValuesHolder.setDuration(290L);
                            return objectAnimatorOfPropertyValuesHolder;
                        }

                        @Override // X.AnonymousClass1833
                        public final Animator LIZLLL(AbstractC212214182y abstractC212214182y) {
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y);
                            abstractC212214182y.setAlpha(0.0f);
                            float f = abstractC212214182y.getLayoutParams().height;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y);
                            abstractC212214182y.setTranslationY(f);
                            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(abstractC212214182y, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, abstractC212214182y.getLayoutParams().height, 0.0f));
                            objectAnimatorOfPropertyValuesHolder.setStartDelay(200L);
                            objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
                            objectAnimatorOfPropertyValuesHolder.setDuration(290L);
                            return objectAnimatorOfPropertyValuesHolder;
                        }

                        /* JADX WARN: Type inference failed for: r1v2, types: [X.182D, X.182y, android.view.View, java.lang.Object] */
                        public static AbstractC212214182y LJ(GoLiveCard goLiveCard, Context context) {
                            boolean z;
                            Integer num2;
                            Integer num3;
                            int i = 0;
                            if (goLiveCard != null && (num3 = goLiveCard.style) != null && num3.intValue() == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            AttributeSet attributeSet = null;
                            if (z) {
                                C182F c182f = new C182F(context, null, 0);
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c182f);
                                c182f.setLayoutParams(marginLayoutParams);
                                c182f.setGoLiveCard(goLiveCard);
                                return c182f;
                            }
                            if (goLiveCard == null || (num2 = goLiveCard.style) == null || num2.intValue() != 2) {
                                return null;
                            }
                            ?? r1 = new AbstractC212214182y(context, attributeSet, i) { // from class: X.182D
                                public TuxIconView LLILZ;
                                public TuxTextView LLILZIL;
                                public TuxTextView LLILZLL;
                                public SmartImageView LLIZ;
                                public ConstraintLayout LLIZLLLIL;
                                public GoLiveCard LLJ;

                                @Override // X.AbstractC212214182y
                                public final void e0() {
                                }

                                @Override // X.AbstractC212214182y
                                public Map<String, String> getContentShowParams() {
                                    String str;
                                    HashMap map;
                                    try {
                                        GoLiveCard goLiveCard2 = this.LLJ;
                                        return (goLiveCard2 == null || (str = goLiveCard2.daInfo) == null || (map = (HashMap) C08JS.LIZIZ().LJIIIIZZ(str, new TypeToken<HashMap<String, String>>() { // from class: X.182E
                                        }.getType())) == null) ? C2097608Jq.LJ() : map;
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        return C2097608Jq.LJ();
                                    }
                                }

                                public final TuxTextView getEcommerceliveGoLiveButtonFromXml() {
                                    KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                                    if (callbackFindViewById == null) {
                                        callbackFindViewById = findViewById(R.id.gl3);
                                        this.LLILZLL = (TuxTextView) callbackFindViewById;
                                    }
                                    return (TuxTextView) callbackFindViewById;
                                }

                                public final ConstraintLayout getEcommerceliveGoLiveContentContainerFromXml() {
                                    KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
                                    if (callbackFindViewById == null) {
                                        callbackFindViewById = findViewById(R.id.gl5);
                                        this.LLIZLLLIL = (ConstraintLayout) callbackFindViewById;
                                    }
                                    return (ConstraintLayout) callbackFindViewById;
                                }

                                public final TuxTextView getEcommerceliveGoLiveContentFromXml() {
                                    KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                                    if (callbackFindViewById == null) {
                                        callbackFindViewById = findViewById(R.id.gl4);
                                        this.LLILZIL = (TuxTextView) callbackFindViewById;
                                    }
                                    return (TuxTextView) callbackFindViewById;
                                }

                                public final TuxIconView getEcommerceliveIconCloseFromXml() {
                                    KeyEvent.Callback callbackFindViewById = this.LLILZ;
                                    if (callbackFindViewById == null) {
                                        callbackFindViewById = findViewById(R.id.gl8);
                                        this.LLILZ = (TuxIconView) callbackFindViewById;
                                    }
                                    return (TuxIconView) callbackFindViewById;
                                }

                                public final SmartImageView getEcommerceliveProductImageFromXml() {
                                    KeyEvent.Callback callbackFindViewById = this.LLIZ;
                                    if (callbackFindViewById == null) {
                                        callbackFindViewById = findViewById(R.id.gm5);
                                        this.LLIZ = (SmartImageView) callbackFindViewById;
                                    }
                                    return (SmartImageView) callbackFindViewById;
                                }

                                public final void setEcommerceliveGoLiveButtonFromXml(TuxTextView tuxTextView) {
                                    this.LLILZLL = tuxTextView;
                                }

                                public final void setEcommerceliveGoLiveContentContainerFromXml(ConstraintLayout constraintLayout) {
                                    this.LLIZLLLIL = constraintLayout;
                                }

                                public final void setEcommerceliveGoLiveContentFromXml(TuxTextView tuxTextView) {
                                    this.LLILZIL = tuxTextView;
                                }

                                public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
                                    this.LLILZ = tuxIconView;
                                }

                                public final void setEcommerceliveProductImageFromXml(SmartImageView smartImageView) {
                                    this.LLIZ = smartImageView;
                                }

                                public final void setGoLiveCard(GoLiveCard goLiveCard2) {
                                    String str;
                                    this.LLJ = goLiveCard2;
                                    TuxTextView ecommerceliveGoLiveContentFromXml = getEcommerceliveGoLiveContentFromXml();
                                    if (ecommerceliveGoLiveContentFromXml != null) {
                                        ecommerceliveGoLiveContentFromXml.setText(goLiveCard2.content);
                                    }
                                    TuxTextView ecommerceliveGoLiveButtonFromXml = getEcommerceliveGoLiveButtonFromXml();
                                    if (ecommerceliveGoLiveButtonFromXml != null) {
                                        ecommerceliveGoLiveButtonFromXml.setText(goLiveCard2.buttonText);
                                    }
                                    ConstraintLayout ecommerceliveGoLiveContentContainerFromXml = getEcommerceliveGoLiveContentContainerFromXml();
                                    if (ecommerceliveGoLiveContentContainerFromXml != null) {
                                        C786410Ut5.I7(new AjS46S0200000_32(this, goLiveCard2, 4), ecommerceliveGoLiveContentContainerFromXml);
                                    }
                                    ECImage eCImage = goLiveCard2.cover;
                                    if (eCImage != null && (str = eCImage.url) != null && C123100dR.LIZ(str)) {
                                        C19411510wz.LIZIZ(C19411510wz.LIZ, str, EnumC1769850w9n.FYP_GO_LIVE_CARD_PRODUCT_IMAGE);
                                        SmartImageView ecommerceliveProductImageFromXml = getEcommerceliveProductImageFromXml();
                                        if (ecommerceliveProductImageFromXml != null) {
                                            C1326790kdB.LIZ.getClass();
                                            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
                                            c1331670kl3LIZLLL.LJJ(ecommerceliveProductImageFromXml);
                                            C786410Ut5.h3(c1331670kl3LIZLLL);
                                        }
                                    }
                                }

                                {
                                    super(context, attributeSet, i);
                                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z5);
                                    C786410Ut5.Sd(R.layout.bvc, C786410Ut5.ne(contextThemeWrapper), this);
                                    setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmd));
                                    TuxIconView ecommerceliveIconCloseFromXml = getEcommerceliveIconCloseFromXml();
                                    if (ecommerceliveIconCloseFromXml != null) {
                                        C786410Ut5.I7(new AjS72S0100000_32(this, 7), ecommerceliveIconCloseFromXml);
                                    }
                                }

                                @Override // X.AbstractC212214182y
                                public final void h0(C182T c182t, long j, GoLiveCard goLiveCard2, Integer num4) {
                                    if (goLiveCard2 != null) {
                                        setGoLiveCard(goLiveCard2);
                                    }
                                }
                            };
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r1);
                            r1.setLayoutParams(marginLayoutParams2);
                            r1.setGoLiveCard(goLiveCard);
                            return r1;
                        }

                        @Override // X.AnonymousClass1833
                        public final AbstractC212214182y LIZIZ(GoLiveCard goLiveCard, Context context) {
                            Integer num2;
                            if (goLiveCard != null && (num2 = goLiveCard.triggerPoint) != null && num2.intValue() == 2) {
                                return LJ(goLiveCard, context);
                            }
                            return null;
                        }

                        @Override // X.AnonymousClass1833
                        public final AbstractC212214182y LIZJ(C182T c182t, long j, Context context, boolean z, GoLiveCard goLiveCard, ShoppingBagList shoppingBagList, Integer num2) {
                            String str;
                            ViewGroup.MarginLayoutParams marginLayoutParams;
                            ViewGroup.MarginLayoutParams marginLayoutParams2;
                            ViewGroup.MarginLayoutParams marginLayoutParams3;
                            Integer num3;
                            CardConfig cardConfig;
                            BFFData bFFData = c182t.LIZLLL;
                            if (bFFData != null && (cardConfig = bFFData.cardConfig) != null) {
                                str = cardConfig.cardSchema;
                            } else {
                                str = null;
                            }
                            if (C703302op.LIZ(str)) {
                                C21207017yu c21207017yu = new C21207017yu(context, null, 0);
                                c21207017yu.h0(c182t, j, goLiveCard, num2);
                                ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21207017yu);
                                c21207017yu.setLayoutParams(marginLayoutParams4);
                                return c21207017yu;
                            }
                            if (num2 != null && num2.intValue() == 100 && shoppingBagList != null) {
                                C212201182l c212201182l = new C212201182l(context, null, 0);
                                C2271391DvN.LIZ(c212201182l, C2271381DvM.Z);
                                ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.u2));
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212201182l);
                                c212201182l.setLayoutParams(marginLayoutParams5);
                                c212201182l.setProductListData(shoppingBagList);
                                return c212201182l;
                            }
                            if (goLiveCard != null && (num3 = goLiveCard.triggerPoint) != null && num3.intValue() == 1) {
                                return LJ(goLiveCard, context);
                            }
                            if (num2 != null && num2.intValue() == 99) {
                                AuctionData auctionDataLIZ = c182t.LIZ();
                                if (auctionDataLIZ != null && auctionDataLIZ.auctionType == 1) {
                                    AnonymousClass1835 anonymousClass1835 = new AnonymousClass1835();
                                    anonymousClass1835.LIZ = c182t;
                                    anonymousClass1835.LIZIZ = j;
                                    anonymousClass1835.LIZJ = 1;
                                    anonymousClass1835.LIZLLL = z;
                                    anonymousClass1835.LJ = num2;
                                    C182T c182t2 = anonymousClass1835.LIZ;
                                    if (c182t2 == null) {
                                        return null;
                                    }
                                    AbstractC212214182y abstractC212214182y = new AbstractC212214182y(anonymousClass1835.LIZJ, context, anonymousClass1835.LIZLLL) { // from class: X.181e
                                        public SmartImageView LLILZ;
                                        public TuxTextView LLILZIL;
                                        public TuxTextView LLILZLL;
                                        public FrameLayout LLIZ;
                                        public FrameLayout LLIZLLLIL;
                                        public TuxIconView LLJ;
                                        public C182T LLJI;
                                        public final C186Z<ViewGroup> LLJIJIL;
                                        public final AnonymousClass1873 LLJILJIL;
                                        public final C212170181g LLJILJILJ;

                                        @Override // X.AbstractC212214182y
                                        public final void e0() {
                                        }

                                        @Override // X.AbstractC212214182y
                                        public Map<String, String> getContentShowParams() {
                                            FeedProduct feedProduct;
                                            BcmStandardTrack bcmStandardTrack;
                                            Map<String, String> map;
                                            AuctionData auctionDataLIZ2;
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            C182T c182t3 = this.LLJI;
                                            if (c182t3 != null && (auctionDataLIZ2 = c182t3.LIZ()) != null) {
                                                linkedHashMap.put("auction_status", C19673811yC.LIZ(auctionDataLIZ2.auctionStatus));
                                                linkedHashMap.put("card_name", C19673811yC.LIZIZ(auctionDataLIZ2.auctionType));
                                                linkedHashMap.put("auction_type", C19673811yC.LIZIZ(auctionDataLIZ2.auctionType));
                                                Long l = auctionDataLIZ2.auctionId;
                                                if (l != null) {
                                                    linkedHashMap.put("auction_id", String.valueOf(l.longValue()));
                                                }
                                                linkedHashMap.put("is_extended_auction", C19673811yC.LIZJ(auctionDataLIZ2.extendAuctionCfg));
                                            }
                                            Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c7998.d5945", PageFinder.via((View) this), null, 4, null);
                                            if (!mapCreateReportParams$default.isEmpty()) {
                                                for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                                                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                                                }
                                            }
                                            C182T c182t4 = this.LLJI;
                                            if (c182t4 != null && (feedProduct = c182t4.LIZ) != null && (bcmStandardTrack = feedProduct.bcmStandardTrack) != null && (map = bcmStandardTrack.trackParam) != null) {
                                                linkedHashMap.putAll(map);
                                            }
                                            return linkedHashMap;
                                        }

                                        @Override // X.AbstractC212214182y
                                        public Map<String, String> getDiscountTagEventParams() {
                                            return new LinkedHashMap();
                                        }

                                        public final TuxTextView getEcommerceliveAuctionDescFromXml() {
                                            KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                                            if (callbackFindViewById == null) {
                                                callbackFindViewById = findViewById(R.id.gkx);
                                                this.LLILZIL = (TuxTextView) callbackFindViewById;
                                            }
                                            return (TuxTextView) callbackFindViewById;
                                        }

                                        public final SmartImageView getEcommerceliveAuctionIconFromXml() {
                                            KeyEvent.Callback callbackFindViewById = this.LLILZ;
                                            if (callbackFindViewById == null) {
                                                callbackFindViewById = findViewById(R.id.gl0);
                                                this.LLILZ = (SmartImageView) callbackFindViewById;
                                            }
                                            return (SmartImageView) callbackFindViewById;
                                        }

                                        public final FrameLayout getEcommerceliveAuctionProgressBarContainerFromXml() {
                                            KeyEvent.Callback callbackFindViewById = this.LLIZ;
                                            if (callbackFindViewById == null) {
                                                callbackFindViewById = findViewById(R.id.gky);
                                                this.LLIZ = (FrameLayout) callbackFindViewById;
                                            }
                                            return (FrameLayout) callbackFindViewById;
                                        }

                                        public final TuxTextView getEcommerceliveAuctionTitleFromXml() {
                                            KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                                            if (callbackFindViewById == null) {
                                                callbackFindViewById = findViewById(R.id.gkz);
                                                this.LLILZLL = (TuxTextView) callbackFindViewById;
                                            }
                                            return (TuxTextView) callbackFindViewById;
                                        }

                                        public final FrameLayout getEcommerceliveAuctionWinnerInfoContainerFromXml() {
                                            KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
                                            if (callbackFindViewById == null) {
                                                callbackFindViewById = findViewById(R.id.b_t);
                                                this.LLIZLLLIL = (FrameLayout) callbackFindViewById;
                                            }
                                            return (FrameLayout) callbackFindViewById;
                                        }

                                        public final TuxIconView getEcommerceliveIconCloseFromXml() {
                                            KeyEvent.Callback callbackFindViewById = this.LLJ;
                                            if (callbackFindViewById == null) {
                                                callbackFindViewById = findViewById(R.id.gl8);
                                                this.LLJ = (TuxIconView) callbackFindViewById;
                                            }
                                            return (TuxIconView) callbackFindViewById;
                                        }

                                        private final void setIconInfo(AuctionData auctionData) {
                                            String str2;
                                            ECImage eCImage;
                                            C19411510wz c19411510wz = C19411510wz.LIZ;
                                            EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.FYP_SURPRISE_AUCTION_CARD_ICON;
                                            SmartImageView ecommerceliveAuctionIconFromXml = getEcommerceliveAuctionIconFromXml();
                                            SurpriseSetData surpriseSetData = auctionData.surpriseSetData;
                                            if (surpriseSetData != null && (eCImage = surpriseSetData.auctionIconDark) != null) {
                                                str2 = eCImage.url;
                                            } else {
                                                str2 = null;
                                            }
                                            c19411510wz.LJ(enumC1769850w9n, ecommerceliveAuctionIconFromXml, str2);
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
                                        /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
                                        /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
                                        /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
                                        /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
                                        /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
                                        /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
                                        /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        private final void setPriceAndWinnerInfo(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData r33) {
                                            /*
                                                Method dump skipped, instruction units count: 246
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C212168181e.setPriceAndWinnerInfo(com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData):void");
                                        }

                                        private final void setProgressBarInfo(AuctionData auctionData) {
                                            C212170181g c212170181g = this.LLJILJILJ;
                                            if (c212170181g != null) {
                                                c212170181g.LJIIJJI(auctionData);
                                            }
                                            C212170181g c212170181g2 = this.LLJILJILJ;
                                            if (c212170181g2 != null) {
                                                C427980GqK c427980GqK = new C427980GqK(R.attr.a1j, 61);
                                                C427970GqJ c427970GqJ = c212170181g2.LJFF;
                                                if (c427970GqJ != null) {
                                                    c427970GqJ.setStyle(c427980GqK);
                                                }
                                            }
                                        }

                                        public final void setEcommerceliveAuctionDescFromXml(TuxTextView tuxTextView) {
                                            this.LLILZIL = tuxTextView;
                                        }

                                        public final void setEcommerceliveAuctionIconFromXml(SmartImageView smartImageView) {
                                            this.LLILZ = smartImageView;
                                        }

                                        public final void setEcommerceliveAuctionProgressBarContainerFromXml(FrameLayout frameLayout) {
                                            this.LLIZ = frameLayout;
                                        }

                                        public final void setEcommerceliveAuctionTitleFromXml(TuxTextView tuxTextView) {
                                            this.LLILZLL = tuxTextView;
                                        }

                                        public final void setEcommerceliveAuctionWinnerInfoContainerFromXml(FrameLayout frameLayout) {
                                            this.LLIZLLLIL = frameLayout;
                                        }

                                        public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
                                            this.LLJ = tuxIconView;
                                        }

                                        {
                                            super(context, null, 0);
                                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z4);
                                            LayoutInflater layoutInflaterNe = C786410Ut5.ne(contextThemeWrapper);
                                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("FeedSurpriseSetView init ,style = ");
                                            sbLIZ.append(i);
                                            sbLIZ.append(" , showAsBig = ");
                                            sbLIZ.append(z);
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            c2341109Fh.getClass();
                                            C2341109Fh.LJ(strLIZIZ);
                                            C786410Ut5.Sd(R.layout.bvl, layoutInflaterNe, this);
                                            setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmf));
                                            this.LLJIJIL = new C186Z<>(this, new C212296186c(), 1);
                                            FrameLayout ecommerceliveAuctionProgressBarContainerFromXml = getEcommerceliveAuctionProgressBarContainerFromXml();
                                            if (ecommerceliveAuctionProgressBarContainerFromXml != null) {
                                                this.LLJILJILJ = new C212170181g(ecommerceliveAuctionProgressBarContainerFromXml, R.style.z4, 2);
                                            }
                                            FrameLayout ecommerceliveAuctionWinnerInfoContainerFromXml = getEcommerceliveAuctionWinnerInfoContainerFromXml();
                                            if (ecommerceliveAuctionWinnerInfoContainerFromXml != null) {
                                                this.LLJILJIL = new AnonymousClass1873(ecommerceliveAuctionWinnerInfoContainerFromXml, 0, 6);
                                            }
                                            C786410Ut5.a9(getEcommerceliveIconCloseFromXml(), new ACListenerS166S0100000_32(this, 90));
                                        }

                                        @Override // X.AbstractC212214182y
                                        public final void h0(C182T c182t3, long j2, GoLiveCard goLiveCard2, Integer num4) {
                                            String str2;
                                            this.LLJI = c182t3;
                                            AuctionData auctionDataLIZ2 = c182t3.LIZ();
                                            if (auctionDataLIZ2 == null) {
                                                return;
                                            }
                                            setIconInfo(auctionDataLIZ2);
                                            TuxTextView ecommerceliveAuctionDescFromXml = getEcommerceliveAuctionDescFromXml();
                                            if (ecommerceliveAuctionDescFromXml != null) {
                                                SurpriseSetData surpriseSetData = auctionDataLIZ2.surpriseSetData;
                                                if (surpriseSetData != null) {
                                                    str2 = surpriseSetData.topTitle;
                                                } else {
                                                    str2 = null;
                                                }
                                                ecommerceliveAuctionDescFromXml.setText(str2);
                                            }
                                            TuxTextView ecommerceliveAuctionTitleFromXml = getEcommerceliveAuctionTitleFromXml();
                                            if (ecommerceliveAuctionTitleFromXml != null) {
                                                ecommerceliveAuctionTitleFromXml.setText(auctionDataLIZ2.auctionTitle);
                                            }
                                            setProgressBarInfo(auctionDataLIZ2);
                                            setPriceAndWinnerInfo(auctionDataLIZ2);
                                        }
                                    };
                                    abstractC212214182y.h0(c182t2, anonymousClass1835.LIZIZ, null, anonymousClass1835.LJ);
                                    if (z) {
                                        marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.u_));
                                    } else {
                                        marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.u2));
                                    }
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y);
                                    abstractC212214182y.setLayoutParams(marginLayoutParams3);
                                    return abstractC212214182y;
                                }
                                AnonymousClass1834 anonymousClass1834 = new AnonymousClass1834();
                                anonymousClass1834.LIZ = c182t;
                                anonymousClass1834.LIZIZ = j;
                                anonymousClass1834.LIZJ = 1;
                                anonymousClass1834.LIZLLL = z;
                                anonymousClass1834.LJ = num2;
                                C182T c182t3 = anonymousClass1834.LIZ;
                                if (c182t3 == null) {
                                    return null;
                                }
                                AbstractC212214182y abstractC212214182y2 = new AbstractC212214182y(anonymousClass1834.LIZJ, context, anonymousClass1834.LIZLLL) { // from class: X.181f
                                    public C18QS LLILZ;
                                    public ConstraintLayout LLILZIL;
                                    public TuxIconView LLILZLL;
                                    public C182T LLIZ;
                                    public final C212197182h LLIZLLLIL;
                                    public final C186Z<ViewGroup> LLJ;
                                    public final C186B<ConstraintLayout> LLJI;
                                    public final AnonymousClass1873 LLJIJIL;
                                    public final FrameLayout LLJILJIL;

                                    @Override // X.AbstractC212214182y
                                    public final void e0() {
                                    }

                                    @Override // X.AbstractC212214182y
                                    public Map<String, String> getContentShowParams() {
                                        FeedProduct feedProduct;
                                        BcmStandardTrack bcmStandardTrack;
                                        Map<String, String> map;
                                        AuctionData auctionDataLIZ2;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        C182T c182t4 = this.LLIZ;
                                        if (c182t4 != null && (auctionDataLIZ2 = c182t4.LIZ()) != null) {
                                            linkedHashMap.put("auction_status", C19673811yC.LIZ(auctionDataLIZ2.auctionStatus));
                                            linkedHashMap.put("card_name", C19673811yC.LIZIZ(auctionDataLIZ2.auctionType));
                                            linkedHashMap.put("auction_type", C19673811yC.LIZIZ(auctionDataLIZ2.auctionType));
                                            Long l = auctionDataLIZ2.auctionId;
                                            if (l != null) {
                                                linkedHashMap.put("auction_id", String.valueOf(l.longValue()));
                                            }
                                            linkedHashMap.put("is_extended_auction", C19673811yC.LIZJ(auctionDataLIZ2.extendAuctionCfg));
                                        }
                                        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c7998.d5945", PageFinder.via((View) this), null, 4, null);
                                        if (!mapCreateReportParams$default.isEmpty()) {
                                            for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                                                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                                            }
                                        }
                                        C182T c182t5 = this.LLIZ;
                                        if (c182t5 != null && (feedProduct = c182t5.LIZ) != null && (bcmStandardTrack = feedProduct.bcmStandardTrack) != null && (map = bcmStandardTrack.trackParam) != null) {
                                            linkedHashMap.putAll(map);
                                        }
                                        return linkedHashMap;
                                    }

                                    public final TuxIconView getEcommerceliveIconCloseFromXml() {
                                        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
                                        if (callbackFindViewById == null) {
                                            callbackFindViewById = findViewById(R.id.gl8);
                                            this.LLILZLL = (TuxIconView) callbackFindViewById;
                                        }
                                        return (TuxIconView) callbackFindViewById;
                                    }

                                    public final C18QS getEcommerceliveProductDescFromXml() {
                                        KeyEvent.Callback callbackFindViewById = this.LLILZ;
                                        if (callbackFindViewById == null) {
                                            callbackFindViewById = findViewById(R.id.glx);
                                            this.LLILZ = (C18QS) callbackFindViewById;
                                        }
                                        return (C18QS) callbackFindViewById;
                                    }

                                    public final ConstraintLayout getEcommerceliveProductMainImageLayoutFromXml() {
                                        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
                                        if (callbackFindViewById == null) {
                                            callbackFindViewById = findViewById(R.id.gm8);
                                            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
                                        }
                                        return (ConstraintLayout) callbackFindViewById;
                                    }

                                    @Override // X.AbstractC212214182y
                                    public Map<String, String> getDiscountTagEventParams() {
                                        return C2097608Jq.LJ();
                                    }

                                    @Override // X.AbstractC212214182y
                                    public Map<String, String> getSellingPointEventParams() {
                                        return C2097608Jq.LJ();
                                    }

                                    public final void setEcommerceliveIconCloseFromXml(TuxIconView tuxIconView) {
                                        this.LLILZLL = tuxIconView;
                                    }

                                    public final void setEcommerceliveProductDescFromXml(C18QS c18qs) {
                                        this.LLILZ = c18qs;
                                    }

                                    public final void setEcommerceliveProductMainImageLayoutFromXml(ConstraintLayout constraintLayout) {
                                        this.LLILZIL = constraintLayout;
                                    }

                                    {
                                        int i;
                                        super(context, null, 0);
                                        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z4);
                                        LayoutInflater layoutInflaterNe = C786410Ut5.ne(contextThemeWrapper);
                                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("FeedAuctionView init ,style = ");
                                        sbLIZ.append(i);
                                        sbLIZ.append(" , showAsBig = ");
                                        sbLIZ.append(z);
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        c2341109Fh.getClass();
                                        C2341109Fh.LJ(strLIZIZ);
                                        if (z) {
                                            C786410Ut5.Sd(R.layout.bvf, layoutInflaterNe, this);
                                        } else {
                                            C786410Ut5.Sd(R.layout.bva, layoutInflaterNe, this);
                                        }
                                        setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmf));
                                        C212296186c c212296186c = new C212296186c();
                                        if (z) {
                                            i = 1;
                                        } else {
                                            i = 2;
                                        }
                                        this.LLJ = new C186Z<>(this, c212296186c, i);
                                        C212197182h c212197182h = new C212197182h(getEcommerceliveProductDescFromXml());
                                        this.LLIZLLLIL = c212197182h;
                                        c212197182h.LJIIL(2);
                                        C186B<ConstraintLayout> c186b = new C186B<>(getEcommerceliveProductMainImageLayoutFromXml(), new C428460Gr6(z));
                                        c186b.LJIJI(new C428560GrG());
                                        this.LLJI = c186b;
                                        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.b_s);
                                        this.LLJILJIL = frameLayout;
                                        if (frameLayout != null) {
                                            this.LLJIJIL = new AnonymousClass1873(frameLayout, 0, 6);
                                        }
                                        C786410Ut5.a9(getEcommerceliveIconCloseFromXml(), new ACListenerS166S0100000_32(this, 89));
                                    }

                                    @Override // X.AbstractC212214182y
                                    public final void h0(C182T c182t4, long j2, GoLiveCard goLiveCard2, Integer num4) {
                                        boolean z2;
                                        RegularAuctionData regularAuctionData;
                                        ECImage eCImage;
                                        String str2;
                                        List<PlacementLabel> list;
                                        String str3;
                                        String strCurrency;
                                        AnonymousClass1873 anonymousClass1873;
                                        Long l;
                                        String str4;
                                        String str5;
                                        SinglePriceItem singlePriceItem;
                                        SinglePriceItem singlePriceItem2;
                                        SinglePriceItem singlePriceItem3;
                                        RegularAuctionData regularAuctionData2;
                                        RegularAuctionData regularAuctionData3;
                                        this.LLIZ = c182t4;
                                        AuctionData auctionDataLIZ2 = c182t4.LIZ();
                                        boolean z3 = false;
                                        if (auctionDataLIZ2 != null && auctionDataLIZ2.auctionType == 2 && (regularAuctionData3 = auctionDataLIZ2.regularAuctionData) != null && regularAuctionData3.noImgModeOptimization) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        Boolean bool = null;
                                        if (z2) {
                                            ConstraintLayout ecommerceliveProductMainImageLayoutFromXml = getEcommerceliveProductMainImageLayoutFromXml();
                                            if (ecommerceliveProductMainImageLayoutFromXml != null) {
                                                C786410Ut5.LL(8, ecommerceliveProductMainImageLayoutFromXml);
                                            }
                                        } else {
                                            ConstraintLayout ecommerceliveProductMainImageLayoutFromXml2 = getEcommerceliveProductMainImageLayoutFromXml();
                                            if (ecommerceliveProductMainImageLayoutFromXml2 != null) {
                                                C786410Ut5.LL(0, ecommerceliveProductMainImageLayoutFromXml2);
                                            }
                                            if (auctionDataLIZ2 != null && (regularAuctionData = auctionDataLIZ2.regularAuctionData) != null && (eCImage = regularAuctionData.auctionImg) != null && C123100dR.LIZ(eCImage.url)) {
                                                this.LLJI.LJIILL(C19411510wz.LIZLLL(eCImage.url, 216, 216, EnumC1769850w9n.FYP_AUCTION_CARD_PRODUCT_IMAGE), null);
                                            }
                                        }
                                        C212197182h c212197182h = this.LLIZLLLIL;
                                        AuctionData auctionDataLIZ3 = c182t4.LIZ();
                                        if (auctionDataLIZ3 == null || (str2 = auctionDataLIZ3.auctionTitle) == null) {
                                            str2 = "";
                                        }
                                        AuctionData auctionDataLIZ4 = c182t4.LIZ();
                                        if (auctionDataLIZ4 != null && (regularAuctionData2 = auctionDataLIZ4.regularAuctionData) != null) {
                                            list = regularAuctionData2.placementLabels;
                                        } else {
                                            list = null;
                                        }
                                        c212197182h.LJIIJJI(new C212199182j(str2, false, list, 28));
                                        C186Z<ViewGroup> c186z = this.LLJ;
                                        AuctionData auctionDataLIZ5 = c182t4.LIZ();
                                        if (auctionDataLIZ5 != null && (singlePriceItem3 = auctionDataLIZ5.currentBidPrice) != null) {
                                            str3 = singlePriceItem3.salePriceFormat;
                                        } else {
                                            str3 = null;
                                        }
                                        AuctionData auctionDataLIZ6 = c182t4.LIZ();
                                        if (auctionDataLIZ6 != null && (singlePriceItem2 = auctionDataLIZ6.currentBidPrice) != null) {
                                            strCurrency = singlePriceItem2.currency();
                                        } else {
                                            strCurrency = null;
                                        }
                                        AuctionData auctionDataLIZ7 = c182t4.LIZ();
                                        if (auctionDataLIZ7 != null && (singlePriceItem = auctionDataLIZ7.currentBidPrice) != null && singlePriceItem.symbolPosition == 0) {
                                            z3 = true;
                                        }
                                        c186z.LJIIJJI(new C212294186a(str3, strCurrency, true ^ z3));
                                        AuctionData auctionDataLIZ8 = c182t4.LIZ();
                                        if (auctionDataLIZ8 != null && (anonymousClass1873 = this.LLJIJIL) != null) {
                                            AuctionUserInfo auctionUserInfo = auctionDataLIZ8.bidderInfo;
                                            if (auctionUserInfo != null) {
                                                l = auctionUserInfo.userId;
                                                str4 = auctionUserInfo.nickName;
                                                ECImage eCImage2 = auctionUserInfo.avatar;
                                                if (eCImage2 != null) {
                                                    str5 = eCImage2.url;
                                                }
                                                bool = auctionUserInfo.isWinner;
                                                anonymousClass1873.LJIIL(new AnonymousClass1872(l, str4, str5, bool, auctionDataLIZ8.auctionStatusText, false, auctionDataLIZ8.auctionStatus, auctionDataLIZ8.auctionTextType, true, null, auctionDataLIZ8.isCarousel, auctionDataLIZ8.carouselCfg, 1536));
                                            }
                                            l = null;
                                            str4 = null;
                                            str5 = null;
                                            if (auctionUserInfo != null) {
                                                bool = auctionUserInfo.isWinner;
                                            }
                                            anonymousClass1873.LJIIL(new AnonymousClass1872(l, str4, str5, bool, auctionDataLIZ8.auctionStatusText, false, auctionDataLIZ8.auctionStatus, auctionDataLIZ8.auctionTextType, true, null, auctionDataLIZ8.isCarousel, auctionDataLIZ8.carouselCfg, 1536));
                                        }
                                    }
                                };
                                abstractC212214182y2.h0(c182t3, anonymousClass1834.LIZIZ, null, anonymousClass1834.LJ);
                                if (z) {
                                    marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.u_));
                                } else {
                                    marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.u2));
                                }
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y2);
                                abstractC212214182y2.setLayoutParams(marginLayoutParams2);
                                return abstractC212214182y2;
                            }
                            if (c182t.LIZ != null) {
                                AnonymousClass1832 anonymousClass1832 = new AnonymousClass1832();
                                anonymousClass1832.LIZ = c182t;
                                anonymousClass1832.LIZIZ = j;
                                anonymousClass1832.LIZJ = 1;
                                anonymousClass1832.LIZLLL = z;
                                anonymousClass1832.LJ = num2;
                                C182U c182uLIZ = anonymousClass1832.LIZ(context);
                                if (c182uLIZ == null) {
                                    return null;
                                }
                                if (z) {
                                    marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.u_));
                                } else {
                                    marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.u2));
                                }
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c182uLIZ);
                                c182uLIZ.setLayoutParams(marginLayoutParams);
                                return c182uLIZ;
                            }
                            if (c182t.LIZIZ == null) {
                                return null;
                            }
                            AnonymousClass1856 anonymousClass1856 = new AnonymousClass1856(context, null, 0);
                            anonymousClass1856.h0(c182t, j, null, num2);
                            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.vb));
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(anonymousClass1856);
                            anonymousClass1856.setLayoutParams(marginLayoutParams6);
                            return anonymousClass1856;
                        }
                    };
                    return c212206182q;
                }
                if (iIntValue == 2) {
                    c212206182q.LLILLL = new AnonymousClass1833() { // from class: X.182x
                        @Override // X.AnonymousClass1833
                        public final AbstractC212214182y LIZIZ(GoLiveCard goLiveCard, Context context) {
                            return null;
                        }

                        @Override // X.AnonymousClass1833
                        public final Animator LIZ(AbstractC212214182y abstractC212214182y) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) abstractC212214182y.getLayoutParams();
                            layoutParams.bottomMargin = -layoutParams.height;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y);
                            abstractC212214182y.setLayoutParams(layoutParams);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS214S0200000_2(abstractC212214182y, layoutParams, 5));
                            valueAnimatorOfFloat.setDuration(200L);
                            return valueAnimatorOfFloat;
                        }

                        @Override // X.AnonymousClass1833
                        public final Animator LIZLLL(AbstractC212214182y abstractC212214182y) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) abstractC212214182y.getLayoutParams();
                            layoutParams.bottomMargin = -layoutParams.height;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y);
                            abstractC212214182y.setLayoutParams(layoutParams);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS214S0200000_2(abstractC212214182y, layoutParams, 4));
                            valueAnimatorOfFloat.setInterpolator(new InterpolatorC21388318n3() { // from class: X.18my
                                {
                                    PointF pointF = this.LIZIZ;
                                    pointF.x = 0.65f;
                                    pointF.y = 0.0f;
                                    PointF pointF2 = this.LIZJ;
                                    pointF2.x = 0.35f;
                                    pointF2.y = 1.0f;
                                }
                            });
                            valueAnimatorOfFloat.setDuration(200L);
                            return valueAnimatorOfFloat;
                        }

                        @Override // X.AnonymousClass1833
                        public final AbstractC212214182y LIZJ(C182T c182t, long j, Context context, boolean z, GoLiveCard goLiveCard, ShoppingBagList shoppingBagList, Integer num2) {
                            FrameLayout.LayoutParams layoutParams;
                            if (c182t.LIZ != null) {
                                AnonymousClass1832 anonymousClass1832 = new AnonymousClass1832();
                                anonymousClass1832.LIZ = c182t;
                                anonymousClass1832.LIZIZ = j;
                                anonymousClass1832.LIZJ = 2;
                                anonymousClass1832.LIZLLL = z;
                                C182U c182uLIZ = anonymousClass1832.LIZ(context);
                                if (c182uLIZ != null) {
                                    if (z) {
                                        layoutParams = new FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.u0));
                                    } else {
                                        layoutParams = new FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelOffset(R.dimen.v5));
                                        layoutParams.bottomMargin = -20;
                                    }
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c182uLIZ);
                                    c182uLIZ.setLayoutParams(layoutParams);
                                    return c182uLIZ;
                                }
                                return null;
                            }
                            return null;
                        }
                    };
                }
                return c212206182q;
            }

            @Override // X.C188I
            public final void LIZ(C188L c188l) {
                this.LIZIZ = c188l;
            }

            @Override // X.C188I
            public final void LIZIZ(Integer num) {
                this.LIZ = num;
            }

            @Override // X.C188I
            public final void LIZJ(ViewGroup viewGroup) {
                this.LIZLLL = viewGroup;
            }

            @Override // X.C188I
            public final void LIZLLL(AwS611S0100000_32 awS611S0100000_32) {
                this.LIZJ = awS611S0100000_32;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final long LJJIJIIJI() {
        C20337514hx.LIZ.getClass();
        long jLIZ = C20337514hx.LIZ("departure_time");
        PreviewGoLiveCardFrequency previewGoLiveCardFrequencyLIZ = C180F.LIZ();
        long j = ((long) ((previewGoLiveCardFrequencyLIZ != null ? previewGoLiveCardFrequencyLIZ.departureIntervalDays : 0) * 24 * 60 * 60)) * 1000;
        long jLIZ2 = C20337514hx.LIZ("last_show_time");
        PreviewGoLiveCardFrequency previewGoLiveCardFrequencyLIZ2 = C180F.LIZ();
        long j2 = 60;
        long j3 = (previewGoLiveCardFrequencyLIZ2 != null ? previewGoLiveCardFrequencyLIZ2.showLimitDuration : 0L) * j2 * j2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fc: departureTimestamp: ");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", departureDuration: ");
        sbLIZ.append(j);
        sbLIZ.append("，lastShowTime: ");
        sbLIZ.append(jLIZ2);
        sbLIZ.append(", limitDuration: ");
        sbLIZ.append(j3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (jLIZ != 0) {
            long j4 = jLIZ + j;
            if (j4 > System.currentTimeMillis()) {
                return j4;
            }
            C20337514hx.LIZJ(0L);
            C20337514hx.LJ(0);
        }
        if (System.currentTimeMillis() - jLIZ2 >= j3) {
            return 0L;
        }
        return j3 + jLIZ2;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final InterfaceC1611000s1a LJJIJLIJ() {
        IEcommerceRegionService iEcommerceRegionService;
        IEcommerceRegionService iEcommerceRegionService2 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
        return (iEcommerceRegionService2 == null || !iEcommerceRegionService2.LIZ() || (iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) == null || !iEcommerceRegionService.isUS()) ? new InterfaceC1611000s1a() { // from class: X.0vCe
            public C1733170vCd LL;
            public SeaLiveContextAbility LLILLJJLI;

            @Override // X.InterfaceC1611000s1a
            public final void destroy() {
                C1733170vCd c1733170vCd = this.LL;
                if (c1733170vCd != null) {
                    c1733170vCd.LIZIZ();
                }
                this.LLILLJJLI = null;
                this.LL = null;
            }

            @Override // X.InterfaceC1611000s1a
            public final void LIZ(Context context, FrameLayout frameLayout, String str, LiveRoomStruct liveRoomStruct) {
                List<n> list;
                String string;
                int iLJIIJJI;
                String strLJIL;
                k kVarLJJIIZ;
                k kVarLJJIIZ2;
                String str2;
                String str3;
                Long lValueOf;
                C03DZ.LIZJ(frameLayout);
                SeaLiveOecPreviewRoomData seaLiveOecPreviewRoomDataLIZ = C1005440cGs.LIZ(str);
                if (seaLiveOecPreviewRoomDataLIZ == null || (list = seaLiveOecPreviewRoomDataLIZ.billboard) == null) {
                    return;
                }
                String string2 = null;
                try {
                    for (n nVar : list) {
                        int iLJIIJJI2 = nVar.LJJIIZ("type").LJIIJJI();
                        String strLJIL2 = nVar.LJJIIZ(FollowStatusChangeMethod.PARAM_UID).LJIL();
                        if (liveRoomStruct != null) {
                            str3 = liveRoomStruct.idStr;
                            lValueOf = Long.valueOf(liveRoomStruct.ownerUserId);
                        } else {
                            str3 = null;
                            lValueOf = null;
                        }
                        C1729260v6K.LIZ("billboard_get", "", null, "2", str3, String.valueOf(lValueOf), strLJIL2, iLJIIJJI2, 0, 772);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                SeaLiveContextAbility seaLiveContextAbility = new SeaLiveContextAbility(null, null);
                this.LLILLJJLI = seaLiveContextAbility;
                InterfaceC599740Nfg interfaceC599740NfgSU1 = seaLiveContextAbility.SU1();
                if (interfaceC599740NfgSU1 != null) {
                    interfaceC599740NfgSU1.LIZLLL(Scene.SCENE_SERVICE, 2, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                    if (liveRoomStruct != null) {
                        str2 = liveRoomStruct.idStr;
                    } else {
                        str2 = null;
                    }
                    interfaceC599740NfgSU1.LIZLLL("room_id", str2, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
                }
                C1733170vCd c1733170vCd = new C1733170vCd(context);
                c1733170vCd.setContextAbility(this.LLILLJJLI);
                this.LL = c1733170vCd;
                C786410Ut5.LJJJJIZL(frameLayout);
                frameLayout.addView(this.LL);
                n nVar2 = (n) C13LP.LJJJLL(list);
                if (liveRoomStruct != null) {
                    string = Long.valueOf(liveRoomStruct.id).toString();
                    string2 = Long.valueOf(liveRoomStruct.ownerUserId).toString();
                } else {
                    string = null;
                }
                if (nVar2 != null && (kVarLJJIIZ2 = nVar2.LJJIIZ("type")) != null) {
                    iLJIIJJI = kVarLJJIIZ2.LJIIJJI();
                } else {
                    iLJIIJJI = -1;
                }
                if (nVar2 == null || (kVarLJJIIZ = nVar2.LJJIIZ(FollowStatusChangeMethod.PARAM_UID)) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
                    strLJIL = "";
                }
                C1733200vCg c1733200vCg = new C1733200vCg("2", (String) null, iLJIIJJI, string, string2, strLJIL, 18);
                C1733170vCd c1733170vCd2 = this.LL;
                if (c1733170vCd2 != null) {
                    c1733170vCd2.LIZLLL(list.size(), EnumC1732850vC7.SERVER, seaLiveOecPreviewRoomDataLIZ, c1733200vCg, null, null);
                }
            }
        } : new C1733130vCZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final C183S LJJIZ() {
        IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
        if (iEcommerceRegionService == null || !iEcommerceRegionService.LIZIZ(Boolean.FALSE)) {
            return null;
        }
        return new C183S() { // from class: X.183R
            /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
            @Override // X.C183S
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r7) {
                /*
                    r6 = this;
                    r5 = 1
                    if (r7 == 0) goto Lc
                    com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo r0 = r7.getEcommerceFypRecommendInfo()
                    if (r0 == 0) goto Lc
                    r0.setDisplayStyle(r5)
                Lc:
                    r2 = 0
                    if (r7 == 0) goto L3c
                    com.ss.android.ugc.aweme.feed.model.live.FYPCommerceStruct r0 = r7.fypCommerceStruct
                    if (r0 == 0) goto L2a
                    com.ss.android.ugc.aweme.feed.model.live.OecLivePreviewRoomData r0 = r0.getOecLivePreviewRoomDataObject()
                    if (r0 == 0) goto L2a
                    com.ss.android.ugc.aweme.feed.model.live.GoLiveCardTargetRoomInfo r0 = r0.goLiveCardTargetRoomInfo
                    if (r0 == 0) goto L2a
                    java.lang.Boolean r1 = r0.enableGoLiveCard
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L28
                    return r5
                L28:
                    if (r7 == 0) goto L3c
                L2a:
                    com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo r0 = r7.getEcommerceFypRecommendInfo()
                    if (r0 == 0) goto L3c
                    long r3 = r0.getDisplayProductId()
                    r1 = 0
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L3b
                    r5 = 0
                L3b:
                    return r5
                L3c:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C183R.LIZ(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct):boolean");
            }

            @Override // X.C183S
            public final void LIZIZ(Context context, C188K c188k, LiveRoomStruct liveRoomStruct, Integer num, String str, boolean z, boolean z2, Map<String, String> map) {
                boolean zLJFF;
                long jLJJIJIIJI;
                long delayShowTime;
                OecLivePreviewRoomData oecLivePreviewRoomDataObject;
                GoLiveCardTargetRoomInfo goLiveCardTargetRoomInfo;
                if (liveRoomStruct == null) {
                    return;
                }
                int value = PreviewCardType.TASK_CARD.getValue();
                String str2 = null;
                if (num != null && num.intValue() == value) {
                    FypRecommendInfo ecommerceFypRecommendInfo = liveRoomStruct.getEcommerceFypRecommendInfo();
                    if (ecommerceFypRecommendInfo != null) {
                        str2 = ecommerceFypRecommendInfo.origin;
                    }
                    c188k.LIZIZ(liveRoomStruct, context, z, map, str2, 0L, z2, false, null, str);
                    return;
                }
                FYPCommerceStruct fYPCommerceStruct = liveRoomStruct.fypCommerceStruct;
                if (fYPCommerceStruct != null && (oecLivePreviewRoomDataObject = fYPCommerceStruct.getOecLivePreviewRoomDataObject()) != null && (goLiveCardTargetRoomInfo = oecLivePreviewRoomDataObject.goLiveCardTargetRoomInfo) != null) {
                    zLJFF = Intrinsics.LJFF(goLiveCardTargetRoomInfo.enableGoLiveCard, Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
                if (iEcommerceLiveService != null) {
                    jLJJIJIIJI = iEcommerceLiveService.LJJIJIIJI();
                } else {
                    jLJJIJIIJI = 0;
                }
                FypRecommendInfo ecommerceFypRecommendInfo2 = liveRoomStruct.getEcommerceFypRecommendInfo();
                if (ecommerceFypRecommendInfo2 != null) {
                    str2 = ecommerceFypRecommendInfo2.origin;
                }
                FypRecommendInfo ecommerceFypRecommendInfo3 = liveRoomStruct.getEcommerceFypRecommendInfo();
                if (ecommerceFypRecommendInfo3 != null) {
                    delayShowTime = ecommerceFypRecommendInfo3.getDelayShowTime();
                } else {
                    delayShowTime = 0;
                }
                c188k.LIZIZ(liveRoomStruct, context, z, map, str2, delayShowTime, z2, zLJFF, Long.valueOf(jLJJIJIIJI), str);
            }

            @Override // X.C183S
            public final C188K LIZJ(ViewGroup viewGroup, Integer num, boolean z, boolean z2, C188M c188m, AwS611S0100000_32 awS611S0100000_32, AwS576S0100000_32 awS576S0100000_32, AwS576S0100000_32 awS576S0100000_322) {
                int value = PreviewCardType.TASK_CARD.getValue();
                if (num != null && num.intValue() == value) {
                    return new C183V(viewGroup, c188m);
                }
                AnonymousClass1831 anonymousClass1831 = new AnonymousClass1831();
                anonymousClass1831.LIZJ = new C183T(z, awS576S0100000_32, z2, awS576S0100000_322, awS611S0100000_32);
                anonymousClass1831.LIZLLL = viewGroup;
                anonymousClass1831.LIZ = 1;
                anonymousClass1831.LIZIZ = c188m;
                return anonymousClass1831.build();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean Wh() {
        return ((PrefetchPinConfig) C180J.LIZIZ.getValue()).isEnabled;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final Map<String, String> getRoomInfo() {
        C21206717yr.LIZ.getClass();
        return C21206717yr.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean s7() {
        return ((PrefetchPinConfig) C180J.LIZIZ.getValue()).isEnabledGroupTwo;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean K6() {
        return C180G.LIZ().loadPinCardAsCore;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final List<C1311670kEn> LJJII() {
        return ((IECommerceHybridService) ServiceManager.get().getService(IECommerceHybridService.class)).LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final Pair<Boolean, List<String>> LJJIL() {
        Object obj;
        BottomScenesAllowlist bottomScenesAllowlist = (BottomScenesAllowlist) SettingsManager.LIZLLL().LJIIIIZZ("ec_live_preview_bottom_scenes_allowlist", BottomScenesAllowlist.class, C1232604s0.LIZ);
        Boolean boolValueOf = Boolean.valueOf(bottomScenesAllowlist != null ? bottomScenesAllowlist.enable : false);
        if (bottomScenesAllowlist == null || (obj = bottomScenesAllowlist.allowlist) == null) {
            obj = C13BV.INSTANCE;
        }
        return new Pair<>(boolValueOf, obj);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final LifecycleObserver Nf() {
        return (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() && ((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) ? new UsLiveRoomFragmentObserver() : new LiveRoomFragmentObserver();
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean lf() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "ec_live_small_window_hide_when_multi_guest", true, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean zs() {
        return C180G.LIZ().loadShopCartIconAsCore;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean LJJIJIIJIL(String str) {
        boolean z;
        SeaLiveOecPreviewRoomData seaLiveOecPreviewRoomDataLIZ;
        List<n> list;
        IEcommerceRegionService iEcommerceRegionService;
        com.ss.android.ugc.aweme.ecommercelive.audience.us.business.billboard.feed.OecLivePreviewRoomData oecLivePreviewRoomDataLIZ;
        List<ECBillboard> list2;
        boolean z2 = false;
        IEcommerceRegionService iEcommerceRegionService2 = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
        if (iEcommerceRegionService2 != null && iEcommerceRegionService2.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null)) == null || !iEcommerceRegionService.isUS() ? (seaLiveOecPreviewRoomDataLIZ = C1005440cGs.LIZ(str)) == null || (list = seaLiveOecPreviewRoomDataLIZ.billboard) == null || list.isEmpty() : (oecLivePreviewRoomDataLIZ = C1733150vCb.LIZ(str)) == null || (list2 = oecLivePreviewRoomDataLIZ.billboard) == null || list2.isEmpty()) {
            z2 = true;
        }
        return !z2;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void LJJJ(List<? extends Aweme> list) {
        IECommerceRegionService iECommerceRegionService;
        String str;
        FYPCommerceStruct fYPCommerceStruct;
        LiveRoomStruct newLiveRoomDataExt;
        FYPCommerceStruct fYPCommerceStruct2;
        OecLivePreviewRoomData oecLivePreviewRoomDataObject;
        if (list != null && !list.isEmpty() && (iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null)) != null && iECommerceRegionService.isEnable()) {
            for (Aweme aweme : list) {
                String requestId = null;
                if (aweme != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null && (fYPCommerceStruct2 = newLiveRoomDataExt.fypCommerceStruct) != null && (oecLivePreviewRoomDataObject = fYPCommerceStruct2.getOecLivePreviewRoomDataObject()) != null) {
                    str = oecLivePreviewRoomDataObject.regionInfo;
                } else {
                    str = null;
                }
                if (C123100dR.LIZ(str)) {
                    EnumC21192017wU enumC21192017wU = EnumC21192017wU.FYP;
                    if (aweme != null) {
                        requestId = aweme.getRequestId();
                    }
                    iECommerceRegionService.LJI(enumC21192017wU, str, requestId, null);
                    return;
                }
                LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(aweme);
                if (newLiveRoomDataExt2 != null && (fYPCommerceStruct = newLiveRoomDataExt2.fypCommerceStruct) != null && fYPCommerceStruct.getOecLivePreviewRoomData() != null) {
                    C21191817wS c21191817wS = C21191817wS.LIZ;
                    EnumC21192017wU enumC21192017wU2 = EnumC21192017wU.FYP;
                    String requestId2 = aweme.getRequestId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No region found: fyp,");
                    sbLIZ.append(str);
                    C21191817wS.LIZIZ(c21191817wS, enumC21192017wU2, requestId2, 1, C2188811AlT.LIZIZ(sbLIZ), 2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean isECVisible(Room room) {
        OecInitData oecInitDataLIZ = C1733990vDx.LIZ(room);
        if (oecInitDataLIZ == null) {
            return false;
        }
        if (oecInitDataLIZ.productNum <= 0 && oecInitDataLIZ.displayProductNum <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void setCurrentRoomId(Long l) {
        ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).setCurrentRoomId(l);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void LJJIIJZLJL(String str, String str2) {
        String strLJFF;
        if (str != null && str.length() != 0) {
            IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
            if (iECommerceRegionService != null) {
                strLJFF = iECommerceRegionService.LJFF();
            } else {
                strLJFF = null;
            }
            if (!C123100dR.LIZ(strLJFF) && iECommerceRegionService != null && iECommerceRegionService.isEnable()) {
                iECommerceRegionService.LJI(EnumC21192017wU.FYP_RETRY, str, str2, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void LJJIIZI(long j, C099F c099f) {
        if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() && ((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) {
            C21163817rw.LIZ.put(Long.valueOf(j), c099f);
        } else {
            C21163717rv.LIZ.put(Long.valueOf(j), c099f);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void LJJIJIL(Fragment fragment, Map map) {
        String string;
        Object obj;
        Object obj2;
        if (map == null || (obj2 = map.get("btm_string")) == null || (string = obj2.toString()) == null) {
            string = "";
        }
        C830490Whz c830490Whz = new C830490Whz();
        if (map != null && (obj = map.get("da_info")) != null) {
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    c830490Whz.put(next, jSONObject.optString(next, ""));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C599470NfF.LIZ(EnumC600280NgY.ON_EXPOSURE);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        PageFinder pageFinderVia = PageFinder.via(fragment);
        c1507790pL7.getClass();
        C1507790pL7.LIZIZ(pageFinderVia, "livesdk_live_show", string, c830490Whz);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r4
      0x001d: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String), (r4v3 java.lang.String) binds: [B:27:0x005b, B:8:0x0015, B:10:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL(androidx.fragment.app.Fragment r6, java.util.Map r7) {
        /*
            r5 = this;
            r3 = 0
            if (r7 == 0) goto L5a
            java.lang.String r0 = "schema"
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L5a
            java.lang.String r4 = r0.toString()
        Lf:
            java.lang.String r0 = "btm_string"
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L1d
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L1f
        L1d:
            java.lang.String r2 = ""
        L1f:
            com.bytedance.android.btm.api.BtmSDK r1 = com.bytedance.android.btm.api.BtmSDK.INSTANCE
            com.bytedance.android.btm.api.model.PageFinder r0 = com.bytedance.android.btm.api.model.PageFinder.via(r6)
            java.lang.String r3 = r1.createJumpSourceBtmToken(r2, r0, r3)
            X.0NgY r0 = X.EnumC600280NgY.CLICK
            X.C599470NfF.LIZ(r0)
            if (r4 == 0) goto L36
            int r0 = r4.length()
            if (r0 != 0) goto L3b
        L36:
            X.0NgY r0 = X.EnumC600280NgY.ILLEGAL_SCHEMA
            X.C599470NfF.LIZ(r0)
        L3b:
            if (r6 == 0) goto L43
            X.19EG r0 = r6.getActivity()
            if (r0 != 0) goto L48
        L43:
            X.0NgY r0 = X.EnumC600280NgY.ILLEGAL_CONTEXT
            X.C599470NfF.LIZ(r0)
        L48:
            if (r6 == 0) goto L59
            X.19EG r2 = r6.getActivity()
            if (r2 == 0) goto L59
            Y.ARunnableS1S2100000_1 r1 = new Y.ARunnableS1S2100000_1
            r0 = 0
            r1.<init>(r6, r4, r3, r0)
            r2.runOnUiThread(r1)
        L59:
            return
        L5a:
            r4 = r3
            if (r7 == 0) goto L1d
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.audience.common.service.ECommerceLiveServiceImpl.LJJIJL(androidx.fragment.app.Fragment, java.util.Map):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final n getLiveRelatedProductInfo(String str, String str2) {
        LiveExposedProductsCache.LIZ.getClass();
        return LiveExposedProductsCache.LIZIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final String il(String str, Map<String, String> map) {
        Map map2;
        int iIntValue;
        String strLIZJ;
        Integer numLJIIJJI;
        C21212717zp.LIZ.getClass();
        try {
            C21212717zp.LIZJ = C19719512Dh.LIZJ(map);
            C21212717zp.LIZJ();
            TrackParams trackParamsLIZ = C21212717zp.LIZ();
            C1743900vTw c1743900vTw = C21212717zp.LIZIZ;
            if (c1743900vTw != null) {
                map2 = (Map) c1743900vTw.LIZIZ();
            } else {
                map2 = null;
            }
            Map mapLIZ = n1.LIZ(map2);
            C1743900vTw c1743900vTw2 = C21212717zp.LIZIZ;
            if (c1743900vTw2 != null && (strLIZJ = c1743900vTw2.LIZJ("product_source")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZJ)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            String strLIZIZ = C21212817zq.LIZIZ(iIntValue, str, trackParamsLIZ, null, mapLIZ, null, null);
            if (strLIZIZ == null) {
                return str;
            }
            return strLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void startVideoPlaybackActivity(Context context, RouteIntent routeIntent) {
        Intent intent = new Intent(context, (Class<?>) ECLivePlaybackActivity.class);
        intent.putExtra("key_intent", routeIntent.getExtra());
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodjmteOITq7YcivYy3qxs9i2OJGSgr3kDItg2+elyWjlTCq0uxMP21/WGHJvSzU037Blji7/R", null));
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void startVideoReplayActivity(Context context, RouteIntent routeIntent) {
        Intent intent = new Intent(context, (Class<?>) ECLiveVideoReplayActivity.class);
        Intent extra = routeIntent.getExtra();
        if (extra != null) {
            intent.putExtras(extra);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodjmteOITq7YcivYy3qxs9i2OJGSgr3kDItg2+elyWjlTCq0uxMP21/WGHJvSzU037Blji7/R", null));
    }

    public static C099G LIZ(long j, HashMap map, LifecycleOwner lifecycleOwner) {
        InterfaceC497601wk lifecycleScope;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            lifecycleScope = C817503Hh.LL;
        }
        return C23250099c.LIZIZ(lifecycleScope, C0PEM.LIZJ, null, new C21179617uU(j, map, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void Xt(int i, long j, HashMap map) {
        Map<Long, C21183917vB> map2;
        Map<Long, C21183717v9> map3;
        if (((LinkedHashMap) C1733990vDx.LIZIZ).get(Long.valueOf(j)) != null) {
            return;
        }
        Object obj = null;
        if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ() && ((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).isUS()) {
            C099G c099gLIZ = LIZ(j, map, null);
            Iterator<UsLiveRoomFragmentObserver> it2 = UsLiveRoomFragmentObserver.LLILLJJLI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                UsLiveRoomFragmentObserver next = it2.next();
                if (next.hashCode() == i) {
                    obj = next;
                    break;
                }
            }
            UsLiveRoomFragmentObserver usLiveRoomFragmentObserver = (UsLiveRoomFragmentObserver) obj;
            if (usLiveRoomFragmentObserver != null && (map3 = usLiveRoomFragmentObserver.LL) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                map3.put(Long.valueOf(j), new C21183717v9(System.currentTimeMillis(), c099gLIZ));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sessionId:");
                sbLIZ.append(i);
                sbLIZ.append(", roomId:");
                sbLIZ.append(j);
                sbLIZ.append(" prefetch pin cached. cacheTime:");
                sbLIZ.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            return;
        }
        C099G c099gLIZ2 = LIZ(j, map, null);
        Iterator<LiveRoomFragmentObserver> it3 = LiveRoomFragmentObserver.LLILLJJLI.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            LiveRoomFragmentObserver next2 = it3.next();
            if (next2.hashCode() == i) {
                obj = next2;
                break;
            }
        }
        LiveRoomFragmentObserver liveRoomFragmentObserver = (LiveRoomFragmentObserver) obj;
        if (liveRoomFragmentObserver == null || (map2 = liveRoomFragmentObserver.LL) == null) {
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        map2.put(Long.valueOf(j), new C21183917vB(System.currentTimeMillis(), c099gLIZ2));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sessionId:");
        sbLIZ2.append(i);
        sbLIZ2.append(", roomId:");
        sbLIZ2.append(j);
        sbLIZ2.append(" prefetch pin cached. cacheTime:");
        sbLIZ2.append(jCurrentTimeMillis2);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void Yt(long j, HashMap<String, String> map, LifecycleOwner lifecycleOwner) {
        C1733990vDx.LIZIZ.put(Long.valueOf(j), LIZ(j, map, lifecycleOwner));
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final void fw(Integer num, String str, Map map) {
        C05D4.LIZJ("rd_ec_live_enter_room_error_report", num, str, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final boolean Pf(int i, String str, boolean z, boolean z2) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEcomForLiveStream, switch: ");
        C01GW c01gw = C258240AAc.LIZ;
        sbLIZ.append(((Number) c01gw.getValue()).intValue());
        sbLIZ.append(", scene: ");
        sbLIZ.append(str);
        sbLIZ.append(", hasCommerceGoods: ");
        sbLIZ.append(z);
        sbLIZ.append(", existedCommerceGoods: ");
        sbLIZ.append(z2);
        sbLIZ.append(", productNum: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        int iIntValue = ((Number) c01gw.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                return z2;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService
    public final Object reportAction(String str, String str2, String str3, int i, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = AudienceApi.LIZ.LIZ(str, str2, str3, i, interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}

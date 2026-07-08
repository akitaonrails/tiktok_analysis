package com.bytedance.android.livesdk.envelope.widget;

import X.C013C;
import X.C01GW;
import X.C09OP;
import X.C09OV;
import X.C09OY;
import X.C0IPN;
import X.C0TZM;
import X.C1104530eqh;
import X.C1104670eqv;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LP;
import X.C158B;
import X.C1697810uHb;
import X.C1819620xS4;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C238400w2;
import X.C439101nJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C817503Hh;
import X.C963140bAe;
import X.EnumC1102750enp;
import X.EnumC452301pR;
import X.InterfaceC1085330eLj;
import X.InterfaceC1087010eOR;
import X.InterfaceC1101720emA;
import X.InterfaceC1104320eqM;
import X.InterfaceC1104760er4;
import X.InterfaceC1142670fqD;
import X.InterfaceC978780bZs;
import Y.ALAdapterS0S1200000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.dataChannel.InitEnvelopeListChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdk.gift.event.TreasureBoxStatusChannel;
import com.bytedance.android.livesdk.livesetting.redenvelope.PortalLottiePreloadSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.PortalPushIntoUIUpdate;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeSkinSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeURLConfig;
import com.bytedance.android.livesdk.livesetting.redenvelope.TreasureBoxAnimationImageSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.TreasureBoxLottiePreloadSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.TreasureBoxPushIntoUIUpdate;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardTreasureBoxSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public final class RedEnvelopeWidget extends LiveRecyclableWidget implements InterfaceC1104760er4 {
    public static volatile boolean LLJILLL;
    public C1324720kZq LL;
    public C1104670eqv LLILLJJLI;
    public boolean LLILLL;
    public Exception LLILZ;
    public boolean LLJI;
    public WeakReference<InterfaceC978780bZs> LLJILJILJ;
    public boolean LLILZIL = true;
    public final List<C09OY> LLILZLL = Collections.synchronizedList(new ArrayList());
    public final ReentrantLock LLIZ = new ReentrantLock();
    public final C01GW LLIZLLLIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS205S0000000_17.get$arr$(40));
    public final List<Long> LLJ = C1697810uHb.LJIILJJIL(20L);
    public final Map<Integer, Long> LLJIJIL = new LinkedHashMap();
    public final Map<Integer, Boolean> LLJILJIL = new LinkedHashMap();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        if (this.context != null) {
            IHybridStorageService iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class);
            if (iHybridStorageService != null) {
                iHybridStorageService.CM(this.context, Boolean.TRUE, "TREASURE_BOX_SHORT_TOUCH_IS_SHOWING", null);
            }
            C1().LJI();
            C1().LIZIZ();
        }
    }

    public final InterfaceC1104320eqM C1() {
        return (InterfaceC1104320eqM) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1104760er4
    public final void LLJJI() {
        C1104670eqv c1104670eqv = this.LLILLJJLI;
        if (c1104670eqv != null) {
            c1104670eqv.LLILZIL = 0;
            c1104670eqv.LIZ();
        }
        this.dataChannel.zW(TreasureBoxStatusChannel.class, 0);
    }

    @Override // X.InterfaceC1104760er4
    public final void e0() {
        C1104670eqv c1104670eqv = this.LLILLJJLI;
        if (c1104670eqv != null) {
            c1104670eqv.LLILZIL = 1;
            c1104670eqv.LIZ();
        }
        this.dataChannel.zW(TreasureBoxStatusChannel.class, 1);
    }

    @Override // X.InterfaceC1104760er4
    public final Context getViewContext() {
        return super.getContext();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C1().onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C1().onResume();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1().LIZJ();
        IHybridContainerManageService iHybridContainerManageService = (IHybridContainerManageService) C1161920gLG.LIZJ(IHybridContainerManageService.class);
        if (iHybridContainerManageService != null) {
            iHybridContainerManageService.ZP(true);
        }
        C1().LJFF(null);
        this.LLJ.clear();
        this.LLILZLL.clear();
    }

    @Override // X.InterfaceC1104760er4
    public final WeakReference<InterfaceC978780bZs> LIZJ() {
        return this.LLJILJILJ;
    }

    public final Map<String, String> B1(int i) {
        Map<String, String> map = null;
        for (Map<String, String> map2 : TreasureBoxAnimationImageSetting.INSTANCE.getValue()) {
            String str = map2.get("business_type");
            if (str != null && CastIntegerProtector.parseInt(str) == 1) {
                map = map2;
            }
        }
        return map;
    }

    @Override // X.InterfaceC1104760er4
    public final void LJJLJLI(C1104530eqh c1104530eqh) {
        String str;
        String idStr;
        String sendUrl = RedEnvelopeURLConfig.INSTANCE.getSendUrl();
        Uri.Builder builderBuildUpon = UriProtector.parse(sendUrl).buildUpon();
        builderBuildUpon.appendQueryParameter("time_stamp", String.valueOf(C158B.LIZ())).appendQueryParameter("guide_reason", c1104530eqh.LIZIZ).appendQueryParameter("guide_from", c1104530eqh.LIZJ).appendQueryParameter("time_diff", String.valueOf(C963140bAe.LIZJ() - System.currentTimeMillis()));
        String string = builderBuildUpon.build().toString();
        if (sendUrl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openRedEnvelopeCreate: url=");
            sbLIZ.append(sendUrl);
            C20441214yg.LIZIZ("RedEnvelopeWidget", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("openRedEnvelopeCreateDialog: lynxUrl=");
            sbLIZ2.append(string);
            C20441214yg.LIZIZ("RedEnvelopeWidget", C2188811AlT.LIZIZ(sbLIZ2));
            Uri.Builder builderBuildUpon2 = UriProtector.parse(string).buildUpon();
            w.LIZ.getClass();
            Uri.Builder builderAppendQueryParameter = builderBuildUpon2.appendQueryParameter("enter_from_merge", w.LJIIIZ()).appendQueryParameter("enter_method", w.LJIIL());
            if (C1().isAnchor()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_anchor", str).appendQueryParameter("entrance", c1104530eqh.LIZ);
            Room roomLIZ = C1().LIZ();
            if (roomLIZ == null || (idStr = roomLIZ.getIdStr()) == null) {
                idStr = "";
            }
            Uri uriBuild = UriProtector.parse(builderAppendQueryParameter2.appendQueryParameter("room_id", idStr).toString());
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "gravity");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                uriBuild = uriBuild.buildUpon().appendQueryParameter("gravity", "bottom").build();
            }
            String string2 = uriBuild.toString();
            this.LLJILJILJ = c1104530eqh.LJ;
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.context, string2, new AwS383S0200000_17(c1104530eqh, this, 47));
            return;
        }
        C20441214yg.LJ("RedEnvelopeWidget", "openRedEnvelopeCreate: send url is empty");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean zBooleanValue;
        String str;
        String str2;
        File fileHX;
        this.LL = new C1324720kZq(this.context);
        Boolean bool = (Boolean) this.dataChannel.gg0(C0TZM.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJI = zBooleanValue;
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.REDENVELOPE;
        DataChannel dataChannel = this.dataChannel;
        C1104670eqv c1104670eqv = new C1104670eqv(dataChannel);
        this.LLILLJJLI = c1104670eqv;
        enumC1102750enp.load(dataChannel, c1104670eqv);
        this.LLJ.clear();
        C1().LJII(this.dataChannel, this);
        this.LLILZLL.clear();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, InitEnvelopeListChannel.class, new AwS596S0100000_17(this, 276));
        }
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        if (iHostResource != null && !LLJILLL) {
            LLJILLL = true;
            if (TreasureBoxPushIntoUIUpdate.INSTANCE.getValue() && TreasureBoxLottiePreloadSetting.INSTANCE.getValue()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Map<String, Map<String, String>> value = RedEnvelopeSkinSetting.INSTANCE.getValue();
                if (value != null) {
                    Iterator<Map.Entry<String, Map<String, String>>> it2 = value.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map<String, String> value2 = it2.next().getValue();
                        String str3 = value2.get("shorttouch_appear_lottie_channel");
                        if (str3 != null && (str2 = value2.get("shorttouch_appear_lottie_path")) != null && ((fileHX = iHostResource.HX(str3, str2)) == null || !fileHX.exists())) {
                            linkedHashSet.add(str3);
                        }
                    }
                }
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    iHostResource.NP0((String) it3.next());
                }
            }
            if (PortalLottiePreloadSetting.INSTANCE.getValue()) {
                PortalPushIntoUIUpdate portalPushIntoUIUpdate = PortalPushIntoUIUpdate.INSTANCE;
                String strLIZ = "tiktok_live_revenue_normal_1";
                if (!portalPushIntoUIUpdate.getValue()) {
                    strLIZ = C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_revenue_normal_1");
                }
                if (portalPushIntoUIUpdate.getValue()) {
                    str = "liveroom_portal_data_pushinto_new.zip";
                } else {
                    str = "liveroom_portal_data_pushinto_ad_label.zip";
                }
                File fileHX2 = iHostResource.HX(strLIZ, str);
                if (fileHX2 != null && fileHX2.exists()) {
                    return;
                }
                iHostResource.NP0(strLIZ);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118 A[PHI: r1 r2
      0x0118: PHI (r1v7 java.util.Map<java.lang.String, java.lang.String>) = (r1v4 java.util.Map<java.lang.String, java.lang.String>), (r1v9 java.util.Map<java.lang.String, java.lang.String>) binds: [B:57:0x0116, B:55:0x0113] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r2v6 java.lang.String) = (r2v4 java.lang.String), (r2v8 java.lang.String) binds: [B:57:0x0116, B:55:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v70, types: [T, com.bytedance.android.live.base.model.ImageModel] */
    /* JADX WARN: Type inference failed for: r0v74, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v85, types: [T, com.bytedance.android.live.base.model.ImageModel] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, X.0jpS] */
    @Override // X.InterfaceC1104760er4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a1(java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget.a1(java.lang.String, java.lang.String):void");
    }

    public final void x1(Uri uri, final C1295960jpS c1295960jpS) {
        InterfaceC1101720emA interfaceC1101720emA;
        InterfaceC1085330eLj interfaceC1085330eLjVd = ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Vd(this.context, uri, null, "shortTouchTreasureBox", null, true);
        if (interfaceC1085330eLjVd != null) {
            C1().LJFF(interfaceC1085330eLjVd.dT1());
            InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
            if (c1295960jpS == null) {
                interfaceC1101720emA = null;
            } else {
                interfaceC1101720emA = new InterfaceC1101720emA() { // from class: X.0eqI
                    @Override // X.InterfaceC1101720emA
                    public final void LJLJL() {
                    }

                    @Override // X.InterfaceC1101720emA
                    public final void LLLZI() {
                    }

                    @Override // X.InterfaceC1101720emA
                    public final boolean Ur() {
                        return false;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final int Vr() {
                        return 0;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final String Sr() {
                        return C1099470eiX.LIZ(this);
                    }

                    @Override // X.InterfaceC1101720emA
                    public final View LLLILZJ() {
                        return c1295960jpS;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
                        final C1295960jpS c1295960jpS2 = c1295960jpS;
                        final RedEnvelopeWidget redEnvelopeWidget = this;
                        return new InterfaceC1101940emW() { // from class: X.0eqH
                            @Override // X.InterfaceC1101940emW
                            public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                                return new AwS596S0100000_17(c1295960jpS2, 116);
                            }

                            @Override // X.InterfaceC1101940emW
                            public final void LIZIZ() {
                                c1295960jpS2.cancelAnimation();
                            }

                            @Override // X.InterfaceC1101940emW
                            public final void LIZJ() {
                                if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
                                    IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
                                    C1104280eqI c1104280eqI = this.LIZ;
                                    c1104280eqI.getClass();
                                    C1101820emK c1101820emKTd = iShortTouchService.Td(C1099470eiX.LIZ(c1104280eqI));
                                    if (c1101820emKTd != null) {
                                        RedEnvelopeWidget redEnvelopeWidget2 = redEnvelopeWidget;
                                        C1295960jpS c1295960jpS3 = c1295960jpS2;
                                        c1101820emKTd.LIZJ = !Intrinsics.LJFF(redEnvelopeWidget2.LLJILJIL.remove(Integer.valueOf(c1295960jpS3.hashCode())), Boolean.TRUE) ? 1 : 0;
                                        Long lRemove = redEnvelopeWidget2.LLJIJIL.remove(Integer.valueOf(c1295960jpS3.hashCode()));
                                        c1101820emKTd.LIZLLL = lRemove != null ? lRemove.longValue() : 0L;
                                    }
                                }
                                c1295960jpS2.playAnimation();
                            }

                            @Override // X.InterfaceC1101940emW
                            public final boolean isRunning() {
                                return c1295960jpS2.isAnimating();
                            }
                        };
                    }
                };
            }
            interfaceC1087010eOR.Yd(interfaceC1085330eLjVd, interfaceC1101720emA);
        }
    }

    public final void y1(String str, final String str2) {
        boolean zBooleanValue;
        String str3;
        String str4;
        String str5;
        Map<String, String> map;
        List<RedEnvelopeMessage4FE> list;
        RedEnvelopeMessage4FE redEnvelopeMessage4FE;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE = (RedEnvelopeInfoModel4FE) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, str, new TypeToken<RedEnvelopeInfoModel4FE>() { // from class: X.09Ob
        }.getType());
        Boolean bool = (Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class);
        int i = 0;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Map<String, String> mapB1 = B1(1);
        InterfaceC1101720emA interfaceC1101720emA = null;
        if (mapB1 != null) {
            str3 = mapB1.get("short_touch");
        } else {
            str3 = null;
        }
        if (redEnvelopeInfoModel4FE != null && (list = redEnvelopeInfoModel4FE.envelopList) != null && (redEnvelopeMessage4FE = (RedEnvelopeMessage4FE) C13LP.LJJJLZIJ(0, list)) != null && (redEnvelopInfo4FE = redEnvelopeMessage4FE.envelopInfo) != null) {
            i = redEnvelopInfo4FE.skinId;
        }
        Map<String, Map<String, String>> value = RedEnvelopeSkinSetting.INSTANCE.getValue();
        if (value != null && (map = value.get(String.valueOf(i))) != null) {
            str4 = map.get("shorttouch_appear_img");
        } else {
            str4 = null;
        }
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        InterfaceC1142670fqD interfaceC1142670fqD = new InterfaceC1142670fqD() { // from class: X.09OX
            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
                c238400w2.element = System.currentTimeMillis();
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str6, Exception exc) {
                int i2;
                this.LLIZ.lock();
                RedEnvelopeWidget redEnvelopeWidget = this;
                redEnvelopeWidget.LLILLL = false;
                redEnvelopeWidget.LLILZ = exc;
                redEnvelopeWidget.LLILZIL = false;
                for (C09OY c09oy : redEnvelopeWidget.LLILZLL) {
                    if (this.LLILLL) {
                        i2 = 0;
                    } else {
                        i2 = -1;
                    }
                    C1104350eqP.LIZIZ(i2, c09oy.LIZ, c09oy.LIZIZ, Boolean.valueOf(c09oy.LIZJ), this.LLILZ, false);
                }
                this.LLILZLL.clear();
                this.LLIZ.unlock();
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i2, int i3, String str6) {
                int i4;
                this.LLIZ.lock();
                RedEnvelopeWidget redEnvelopeWidget = this;
                redEnvelopeWidget.LLILLL = true;
                redEnvelopeWidget.LLILZIL = false;
                for (C09OY c09oy : redEnvelopeWidget.LLILZLL) {
                    if (this.LLILLL) {
                        i4 = 0;
                    } else {
                        i4 = -1;
                    }
                    C1104350eqP.LIZIZ(i4, c09oy.LIZ, c09oy.LIZIZ, Boolean.valueOf(c09oy.LIZJ), null, false);
                }
                this.LLILZLL.clear();
                this.LLIZ.unlock();
                RedEnvelopeWidget redEnvelopeWidget2 = this;
                C1324720kZq c1324720kZq = redEnvelopeWidget2.LL;
                if (c1324720kZq != null) {
                    redEnvelopeWidget2.LLJIJIL.put(Integer.valueOf(c1324720kZq.hashCode()), Long.valueOf(System.currentTimeMillis() - c238400w2.element));
                    redEnvelopeWidget2.LLJILJIL.put(Integer.valueOf(c1324720kZq.hashCode()), Boolean.TRUE);
                }
            }
        };
        if (!TextUtils.isEmpty(str4)) {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(str4);
            url.LJIL = true;
            url.LJJ = Boolean.FALSE;
            url.LJIIL = interfaceC1142670fqD;
            url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            url.LJJI(this.LL);
        } else {
            C1143680frq.LJFF(this.LL, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_normal_1"), "ttlive_treasure_box_anim_pic.png", ImageView.ScaleType.CENTER_CROP, interfaceC1142670fqD);
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str3).buildUpon().appendQueryParameter("initial_data", str);
        String str6 = "1";
        if (zBooleanValue) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_anchor", str5);
        w.LIZ.getClass();
        if (!Intrinsics.LJFF(w.LJIIL(), "portal")) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri uriBuild = builderAppendQueryParameter2.appendQueryParameter("is_portal_user", str6).appendQueryParameter("portal_id", String.valueOf(w.LJIJ())).build();
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C09OV(this, str2, redEnvelopeInfoModel4FE, zBooleanValue, null), 3);
        final C1324720kZq c1324720kZq = this.LL;
        final List<RedEnvelopeMessage4FE> list2 = redEnvelopeInfoModel4FE.envelopList;
        InterfaceC1085330eLj interfaceC1085330eLjVd = ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Vd(this.context, uriBuild, null, "shortTouchTreasureBox", null, true);
        if (interfaceC1085330eLjVd != null) {
            C1().LJFF(interfaceC1085330eLjVd.dT1());
            InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
            if (this.LLJI && c1324720kZq != null) {
                interfaceC1101720emA = new InterfaceC1101720emA() { // from class: X.0eqK
                    @Override // X.InterfaceC1101720emA
                    public final void LJLJL() {
                    }

                    @Override // X.InterfaceC1101720emA
                    public final void LLLZI() {
                    }

                    @Override // X.InterfaceC1101720emA
                    public final int Vr() {
                        return 0;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final View LLLILZJ() {
                        C1324720kZq c1324720kZq2 = c1324720kZq;
                        C786410Ut5.u6(c1324720kZq2, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(70.0f), (int) C497740JfY.LIZIZ(70.0f)));
                        return c1324720kZq2;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final boolean Ur() {
                        return LiveShortTouchBigCardTreasureBoxSetting.INSTANCE.enable();
                    }

                    @Override // X.InterfaceC1101720emA
                    public final String Sr() {
                        return C1099470eiX.LIZ(this);
                    }

                    @Override // X.InterfaceC1101720emA
                    public final InterfaceC1101940emW Tr(final ViewGroup viewGroup, boolean z) {
                        final Animator animatorRb0 = ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).rb0(viewGroup, z);
                        if (animatorRb0 != null) {
                            final List<RedEnvelopeMessage4FE> list3 = list2;
                            final String str7 = str2;
                            final RedEnvelopeWidget redEnvelopeWidget = this;
                            animatorRb0.addListener(new AnimatorListenerAdapter() { // from class: X.0eqL
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    List<RedEnvelopeMessage4FE> list4 = list3;
                                    if (list4 != null) {
                                        C1104350eqP.LIZLLL(Boolean.valueOf(redEnvelopeWidget.C1().isAnchor()), str7, list4);
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    viewGroup.setPivotX((int) C497740JfY.LIZIZ(35.0f));
                                    viewGroup.setPivotY((int) C497740JfY.LIZIZ(35.0f));
                                    List<RedEnvelopeMessage4FE> list4 = list3;
                                    if (list4 != null) {
                                        C1104350eqP.LIZJ(Boolean.valueOf(redEnvelopeWidget.C1().isAnchor()), str7, list4);
                                    }
                                }
                            });
                        } else {
                            animatorRb0 = null;
                        }
                        final RedEnvelopeWidget redEnvelopeWidget2 = this;
                        final C1324720kZq c1324720kZq2 = c1324720kZq;
                        return new InterfaceC1101940emW() { // from class: X.0eqJ
                            @Override // X.InterfaceC1101940emW
                            public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                                return new AwS596S0100000_17(animatorRb0, 275);
                            }

                            @Override // X.InterfaceC1101940emW
                            public final void LIZIZ() {
                                Animator animator = animatorRb0;
                                if (animator != null) {
                                    animator.cancel();
                                }
                            }

                            @Override // X.InterfaceC1101940emW
                            public final void LIZJ() {
                                if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
                                    IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
                                    C1104300eqK c1104300eqK = this.LIZ;
                                    c1104300eqK.getClass();
                                    C1101820emK c1101820emKTd = iShortTouchService.Td(C1099470eiX.LIZ(c1104300eqK));
                                    if (c1101820emKTd != null) {
                                        RedEnvelopeWidget redEnvelopeWidget3 = redEnvelopeWidget2;
                                        C1324720kZq c1324720kZq3 = c1324720kZq2;
                                        c1101820emKTd.LIZJ = !Intrinsics.LJFF(redEnvelopeWidget3.LLJILJIL.remove(Integer.valueOf(c1324720kZq3.hashCode())), Boolean.TRUE) ? 1 : 0;
                                        Long lRemove = redEnvelopeWidget3.LLJIJIL.remove(Integer.valueOf(c1324720kZq3.hashCode()));
                                        c1101820emKTd.LIZLLL = lRemove != null ? lRemove.longValue() : 0L;
                                    }
                                }
                                Animator animator = animatorRb0;
                                if (animator != null) {
                                    animator.start();
                                }
                            }

                            @Override // X.InterfaceC1101940emW
                            public final boolean isRunning() {
                                Animator animator = animatorRb0;
                                if (animator != null) {
                                    return animator.isRunning();
                                }
                                return false;
                            }
                        };
                    }
                };
            }
            interfaceC1087010eOR.Yd(interfaceC1085330eLjVd, interfaceC1101720emA);
        }
        A1();
    }

    public final void z1(String str, String str2) {
        boolean zBooleanValue;
        String str3;
        String str4;
        String str5;
        Map<String, String> map;
        String str6;
        Map<String, String> map2;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE = (RedEnvelopeInfoModel4FE) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, str, new TypeToken<RedEnvelopeInfoModel4FE>() { // from class: X.09Oc
        }.getType());
        if (redEnvelopeInfoModel4FE == null) {
            A1();
            return;
        }
        Boolean bool = (Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class);
        int i = 0;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        RedEnvelopeMessage4FE redEnvelopeMessage4FE = (RedEnvelopeMessage4FE) C13LP.LJJJLZIJ(0, redEnvelopeInfoModel4FE.envelopList);
        if (redEnvelopeMessage4FE != null && (redEnvelopInfo4FE = redEnvelopeMessage4FE.envelopInfo) != null) {
            i = redEnvelopInfo4FE.skinId;
        }
        RedEnvelopeSkinSetting redEnvelopeSkinSetting = RedEnvelopeSkinSetting.INSTANCE;
        Map<String, Map<String, String>> value = redEnvelopeSkinSetting.getValue();
        String str7 = "";
        if (value == null || (map2 = value.get(String.valueOf(i))) == null || (str3 = map2.get("shorttouch_appear_lottie_channel")) == null) {
            str3 = "";
        }
        Map<String, Map<String, String>> value2 = redEnvelopeSkinSetting.getValue();
        if (value2 != null && (map = value2.get(String.valueOf(i))) != null && (str6 = map.get("shorttouch_appear_lottie_path")) != null) {
            str7 = str6;
        }
        Map<String, String> mapB1 = B1(1);
        if (mapB1 != null) {
            str4 = mapB1.get("short_touch");
        } else {
            str4 = null;
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str4).buildUpon().appendQueryParameter("initial_data", str);
        String str8 = "1";
        if (zBooleanValue) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("is_anchor", str5);
        w.LIZ.getClass();
        if (!Intrinsics.LJFF(w.LJIIL(), "portal")) {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        Uri uriBuild = builderAppendQueryParameter2.appendQueryParameter("is_portal_user", str8).appendQueryParameter("portal_id", String.valueOf(w.LJIJ())).build();
        if (this.LLJI) {
            C1295960jpS c1295960jpS = new C1295960jpS(this.context);
            C786410Ut5.s6(c1295960jpS, new LinearLayout.LayoutParams(C439101nJ.LIZ(90), C439101nJ.LIZ(100)));
            c1295960jpS.addAnimatorListener(new ALAdapterS0S1200000_17(str2, redEnvelopeInfoModel4FE, this, 0));
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C09OP(str3, str7, new CountDownLatch(1), c1295960jpS, new C013C(), new CountDownLatch(1), this, str2, redEnvelopeInfoModel4FE, zBooleanValue, uriBuild, null), 3);
            return;
        }
        x1(uriBuild, null);
        A1();
    }
}

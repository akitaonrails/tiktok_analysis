package com.bytedance.android.livesdk.impl.revenue.goodybag.widget;

import X.C01GW;
import X.C0UY7;
import X.C1143680frq;
import X.C1161920gLG;
import X.C13LP;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C421300GfY;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1085330eLj;
import X.InterfaceC1087010eOR;
import X.InterfaceC1101720emA;
import X.InterfaceC1104570eql;
import X.InterfaceC1104610eqp;
import X.InterfaceC1142670fqD;
import X.InterfaceC978780bZs;
import Y.ALAdapterS12S0200000_17;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.impl.revenue.goodybag.model.GoodyBagShortTouchInitData;
import com.bytedance.android.livesdk.impl.revenue.goodybag.model.GoodyBagShourTouchModel4FE;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagURLConfig;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public final class GoodyBagWidget extends LiveRecyclableWidget implements InterfaceC1104610eqp {
    public C421300GfY LL;
    public final C01GW LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS205S0000000_17.get$arr$(50));
    public long LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public WeakReference<InterfaceC978780bZs> LLILZLL;

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

    public final InterfaceC1104570eql x1() {
        return (InterfaceC1104570eql) this.LLILLJJLI.getValue();
    }

    public final String y1() {
        return ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1() ? "program_live" : (C1161920gLG.LIZJ(IMicRoomService.class) == null || !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1()) ? C1161920gLG.LIZJ(IInteractService.class) != null ? ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2() : "normal_video_live" : "video_anchor_order";
    }

    @Override // X.InterfaceC1104610eqp
    public final Context getViewContext() {
        return super.getContext();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        x1().onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        x1().onResume();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        x1().LIZJ();
        IHybridContainerManageService iHybridContainerManageService = (IHybridContainerManageService) C1161920gLG.LIZJ(IHybridContainerManageService.class);
        if (iHybridContainerManageService != null) {
            iHybridContainerManageService.ZP(true);
        }
    }

    @Override // X.InterfaceC1104610eqp
    public final WeakReference<InterfaceC978780bZs> LIZJ() {
        return this.LLILZLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04c6  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // X.InterfaceC1104610eqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(webcast.api.goody_bag.GetGoodyBagLotteryResponse.ResponseData r38) {
        /*
            Method dump skipped, instruction units count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget.D0(webcast.api.goody_bag.GetGoodyBagLotteryResponse$ResponseData):void");
    }

    @Override // X.InterfaceC1104610eqp
    public final void LJJZ(String str) {
        int iYy2;
        String str2;
        InterfaceC1101720emA interfaceC1101720emA;
        List<GoodyBagShortTouchInitData> list;
        GoodyBagShortTouchInitData goodyBagShortTouchInitData;
        if (x1().LIZ() != null) {
            return;
        }
        String shortTouchUrl = GoodyBagURLConfig.INSTANCE.getShortTouchUrl();
        boolean zIsAnchor = x1().isAnchor();
        IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
        int i = 0;
        if (iRankService != null) {
            iYy2 = iRankService.yy2();
        } else {
            iYy2 = 0;
        }
        GoodyBagShourTouchModel4FE goodyBagShourTouchModel4FE = (GoodyBagShourTouchModel4FE) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, str, GoodyBagShourTouchModel4FE.class);
        if (goodyBagShourTouchModel4FE != null && (list = goodyBagShourTouchModel4FE.goodyBagList) != null && (goodyBagShortTouchInitData = (GoodyBagShortTouchInitData) C13LP.LJJJLZIJ(0, list)) != null) {
            i = goodyBagShortTouchInitData.goodyBagBiz;
        }
        InterfaceC1142670fqD interfaceC1142670fqD = new InterfaceC1142670fqD() { // from class: X.0eqk
            public long LIZ = System.currentTimeMillis();

            @Override // X.InterfaceC1142670fqD
            public final void LIZIZ(Animatable animatable) {
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZ() {
                this.LIZ = System.currentTimeMillis();
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZLLL(String str3, Exception exc) {
                this.LIZIZ.LLILZ = false;
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i2, int i3, String str3) {
                GoodyBagWidget goodyBagWidget = this.LIZIZ;
                goodyBagWidget.LLILZ = true;
                goodyBagWidget.LLILLL = System.currentTimeMillis() - this.LIZ;
            }
        };
        if (i != 100 && i != 101) {
            if (i != 110 && i != 111) {
                if (i != 120 && i != 121) {
                    if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
                        C1143680frq.LJFF(this.LL, "tiktok_live_revenue_normal_1", "ttlive_goody_bag_anim_pic.png", ImageView.ScaleType.CENTER_CROP, interfaceC1142670fqD);
                    } else {
                        C1143680frq.LIZLLL(this.LL, "tiktok_live_revenue_normal_1", "ttlive_goody_bag_anim_pic.png");
                    }
                } else if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
                    C1143680frq.LJFF(this.LL, "tiktok_live_revenue_normal_1", "ttlive_goody_bag_league.png", ImageView.ScaleType.CENTER_CROP, interfaceC1142670fqD);
                } else {
                    C1143680frq.LIZLLL(this.LL, "tiktok_live_revenue_normal_1", "ttlive_goody_bag_league.png");
                }
            } else if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
                C1143680frq.LJFF(this.LL, "tiktok_live_revenue_normal_1", "ttlive_goody_bag_anim_level_up_pic.png", ImageView.ScaleType.CENTER_CROP, interfaceC1142670fqD);
            } else {
                C1143680frq.LIZLLL(this.LL, "tiktok_live_revenue_normal_1", "ttlive_goody_bag_anim_level_up_pic.png");
            }
        } else if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
            C1143680frq.LJFF(this.LL, "tiktok_live_revenue_normal_1", "ttlive_goody_bag_anim_moy_pic.png", ImageView.ScaleType.CENTER_CROP, interfaceC1142670fqD);
        } else {
            C1143680frq.LIZLLL(this.LL, "tiktok_live_revenue_normal_1", "ttlive_goody_bag_anim_moy_pic.png");
        }
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(shortTouchUrl).buildUpon().appendQueryParameter("initial_data", str).appendQueryParameter("is_anchor", String.valueOf(zIsAnchor ? 1 : 0)).appendQueryParameter("online_watch_users", String.valueOf(iYy2)).appendQueryParameter(Scene.SCENE_SERVICE, y1());
        w.LIZ.getClass();
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("action_type", w.LIZLLL()).appendQueryParameter("enter_from_merge", w.LJIIIZ()).appendQueryParameter("enter_method", w.LJIIL());
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        InterfaceC1085330eLj interfaceC1085330eLjVd = ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Vd(this.context, builderAppendQueryParameter2.appendQueryParameter("enable_code_cache", str2).build(), null, "shortTouchTypeGoodyBag", null, true);
        if (interfaceC1085330eLjVd != null) {
            InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
            if (this.LLILZIL && this.LL != null) {
                interfaceC1101720emA = new InterfaceC1101720emA() { // from class: X.0eqj
                    @Override // X.InterfaceC1101720emA
                    public final void LJLJL() {
                    }

                    @Override // X.InterfaceC1101720emA
                    public final void LLLZI() {
                    }

                    @Override // X.InterfaceC1101720emA
                    public final boolean Ur() {
                        return true;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final int Vr() {
                        return 0;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final View LLLILZJ() {
                        C421300GfY c421300GfY = this.LIZ.LL;
                        C786410Ut5.u6(c421300GfY, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(70.0f), (int) C497740JfY.LIZIZ(70.0f)));
                        return c421300GfY;
                    }

                    @Override // X.InterfaceC1101720emA
                    public final String Sr() {
                        return C1099470eiX.LIZ(this);
                    }

                    @Override // X.InterfaceC1101720emA
                    public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
                        final Animator animatorRb0 = ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).rb0(viewGroup, z);
                        if (animatorRb0 != null) {
                            animatorRb0.addListener(new ALAdapterS12S0200000_17(this.LIZ, viewGroup, 26));
                        } else {
                            animatorRb0 = null;
                        }
                        final GoodyBagWidget goodyBagWidget = this.LIZ;
                        return new InterfaceC1101940emW() { // from class: X.0eqi
                            @Override // X.InterfaceC1101940emW
                            public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                                return new AwS596S0100000_17(animatorRb0, 430);
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
                                    C1104550eqj c1104550eqj = this.LIZ;
                                    c1104550eqj.getClass();
                                    C1101820emK c1101820emKTd = iShortTouchService.Td(C1099470eiX.LIZ(c1104550eqj));
                                    if (c1101820emKTd != null) {
                                        GoodyBagWidget goodyBagWidget2 = goodyBagWidget;
                                        c1101820emKTd.LIZJ = !goodyBagWidget2.LLILZ ? 1 : 0;
                                        c1101820emKTd.LIZLLL = goodyBagWidget2.LLILLL;
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
            } else {
                interfaceC1101720emA = null;
            }
            interfaceC1087010eOR.Yd(interfaceC1085330eLjVd, interfaceC1101720emA);
        }
    }

    @Override // X.InterfaceC1104610eqp
    public final void Y(C0UY7 c0uy7) {
        int iYy2;
        int i;
        Uri uriBuild;
        String sendUrl = GoodyBagURLConfig.INSTANCE.getSendUrl();
        if (sendUrl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openGoodyBagCreate ");
            sbLIZ.append(sendUrl);
            C20441214yg.LIZIZ("GoodyBagWidget", C2188811AlT.LIZIZ(sbLIZ));
            Uri uri = UriProtector.parse(sendUrl);
            IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
            boolean z = false;
            if (iRankService != null) {
                iYy2 = iRankService.yy2();
            } else {
                iYy2 = 0;
            }
            if (x1().LIZ() != null) {
                i = 1;
            } else {
                i = 0;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("hasGoodyBag: ");
            sbLIZ2.append(i);
            C20441214yg.LIZIZ("GoodyBagWidget", C2188811AlT.LIZIZ(sbLIZ2));
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gravity");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                z = true;
            }
            String str = "1";
            if (z) {
                Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("gravity", "bottom").appendQueryParameter("online_watch_users", String.valueOf(iYy2)).appendQueryParameter(Scene.SCENE_SERVICE, y1());
                w.LIZ.getClass();
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("action_type", w.LIZLLL()).appendQueryParameter("enter_from_merge", w.LJIIIZ()).appendQueryParameter("enter_method", w.LJIIL()).appendQueryParameter("has_goody_bag", String.valueOf(i));
                if (!SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                uriBuild = builderAppendQueryParameter2.appendQueryParameter("enable_code_cache", str).build();
            } else {
                Uri.Builder builderAppendQueryParameter3 = uri.buildUpon().appendQueryParameter("online_watch_users", String.valueOf(iYy2)).appendQueryParameter(Scene.SCENE_SERVICE, y1());
                w.LIZ.getClass();
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("action_type", w.LIZLLL()).appendQueryParameter("enter_from_merge", w.LJIIIZ()).appendQueryParameter("enter_method", w.LJIIL()).appendQueryParameter("has_goody_bag", String.valueOf(i));
                if (!SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                uriBuild = builderAppendQueryParameter4.appendQueryParameter("enable_code_cache", str).build();
            }
            String string = uriBuild.toString();
            this.LLILZLL = c0uy7.LIZ;
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.context, string, new AwS383S0200000_17(c0uy7, this, 82));
            return;
        }
        C20441214yg.LJ("GoodyBagWidget", "openGoodyBagCreate: send url is empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dc  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0GfY] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget.onLoad(java.lang.Object[]):void");
    }
}

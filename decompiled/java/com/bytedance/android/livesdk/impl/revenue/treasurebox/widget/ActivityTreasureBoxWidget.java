package com.bytedance.android.livesdk.impl.revenue.treasurebox.widget;

import X.C01GW;
import X.C0IJT;
import X.C0IPN;
import X.C0TZM;
import X.C1104380eqS;
import X.C1104450eqZ;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LP;
import X.C1819620xS4;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2095008Iq;
import X.C23250099c;
import X.C238400w2;
import X.C439101nJ;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C817503Hh;
import X.C930940aKi;
import X.C973880bRy;
import X.EnumC452301pR;
import X.InterfaceC1085330eLj;
import X.InterfaceC1087010eOR;
import X.InterfaceC1101720emA;
import X.InterfaceC1104490eqd;
import X.InterfaceC1104520eqg;
import X.InterfaceC1142670fqD;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import android.animation.Animator;
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
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.dataChannel.InitEnvelopeListChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfo4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxMessage4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import com.bytedance.android.livesdk.livesetting.redenvelope.RedEnvelopeSkinSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.TreasureBoxAnimationImageSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchAllInOneReportSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardTreasureBoxSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivityTreasureBoxWidget extends LiveRecyclableWidget implements InterfaceC1104520eqg {
    public C1324720kZq LL;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C01GW LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS205S0000000_17.get$arr$(60));
    public final Map<Integer, Long> LLILZIL = new LinkedHashMap();
    public final Map<Integer, Boolean> LLILZLL = new LinkedHashMap();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final InterfaceC1104490eqd C1() {
        return (InterfaceC1104490eqd) this.LLILLJJLI.getValue();
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
        C1324720kZq c1324720kZq = this.LL;
        if (c1324720kZq != null) {
            C500260Jjc.LJJJLL(c1324720kZq);
        }
    }

    public final Map<String, String> B1(int i) {
        Map<String, String> map = null;
        for (Map<String, String> map2 : TreasureBoxAnimationImageSetting.INSTANCE.getValue()) {
            String str = map2.get("business_type");
            if (str != null && CastIntegerProtector.parseInt(str) == i) {
                map = map2;
            }
        }
        return map;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = new C1324720kZq(this.context);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean zBooleanValue;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILLL = zBooleanValue;
        C1().LJ(this.dataChannel, this);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, InitEnvelopeListChannel.class, new AwS596S0100000_17(this, 419));
        }
    }

    public static void D1(Map.Entry entry, boolean z) {
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE;
        String str;
        String str2;
        int iIntValue;
        int iIntValue2;
        String str3;
        Long lLJIILIIL;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        Integer num = (Integer) entry.getKey();
        if (num != null && num.intValue() == 20) {
            Set<String> set = C973880bRy.LIZ;
            List<ActivityTreasureBoxMessage4FE> list = ((ActivityTreasureBoxInfoModel4FE) entry.getValue()).envelopList;
            int i = 0;
            ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE = (ActivityTreasureBoxMessage4FE) C13LP.LJJJLZIJ(0, list);
            if (activityTreasureBoxMessage4FE != null && (activityTreasureBoxInfo4FE = activityTreasureBoxMessage4FE.envelopInfo) != null && (str = activityTreasureBoxInfo4FE.envelopeId) != null && str.length() != 0) {
                if (C973880bRy.LIZ.add(str)) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_match_virtual_tickets_icon_show");
                    HashMap map = new HashMap(16);
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room != null) {
                        String idStr = room.getIdStr();
                        if (idStr == null) {
                            idStr = String.valueOf(room.getId());
                        }
                        map.put("room_id", idStr);
                        map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    }
                    UserService userService = UserService.getInstance();
                    if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                        map.put("user_id", String.valueOf(currentUser.getId()));
                    }
                    if (z) {
                        str2 = "anchor";
                    } else {
                        str2 = "user";
                    }
                    map.put("user_type", str2);
                    map.put("pk_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()));
                    map.put("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
                    String str4 = activityTreasureBoxInfo4FE.envelopeId;
                    if (str4 == null) {
                        str4 = "";
                    }
                    map.put("redpacket_id", str4);
                    Integer num2 = activityTreasureBoxInfo4FE.diamondCount;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map.put("send_number", String.valueOf(iIntValue));
                    Integer num3 = activityTreasureBoxInfo4FE.unpackAt;
                    if (num3 != null && (iIntValue2 = num3.intValue()) > 0 && (str3 = activityTreasureBoxInfo4FE.createAt) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null) {
                        long jLongValue = lLJIILIIL.longValue();
                        if (jLongValue > 0) {
                            if (jLongValue > 10000000000L) {
                                jLongValue /= 1000;
                            }
                            i = (int) (((long) iIntValue2) - jLongValue);
                        }
                    }
                    map.put("countdown_seconds", String.valueOf(i));
                    IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
                    if (iRankService != null) {
                        map.put("online_watch_users", String.valueOf(iRankService.yy2()));
                    }
                    map.put("is_self_room", "1");
                    map.put("is_opponent_user", String.valueOf(C973880bRy.LIZ()));
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LIZ();
                    return;
                }
                return;
            }
            C20441214yg.LJIIL("VirtualTicketTreasureBoxTracker", "reportIconShow skipped: empty envelope_id");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x015d A[PHI: r3
      0x015d: PHI (r3v7 java.lang.String) = (r3v5 java.lang.String), (r3v9 java.lang.String) binds: [B:64:0x015b, B:62:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0083 A[SYNTHETIC] */
    @Override // X.InterfaceC1104520eqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZL(java.util.Map r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget.LLZL(java.util.Map, java.lang.String):void");
    }

    public final void x1(final Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> entry, final String str) {
        int iIntValue;
        Integer numValueOf;
        String str2;
        Map<String, String> map;
        C20441214yg.LIZIZ("ActivityTreasureBoxWidget", "notify envelope data created");
        int iIntValue2 = 0;
        this.LLILZ = false;
        Integer key = entry.getKey();
        if (key != null) {
            iIntValue = key.intValue();
        } else {
            iIntValue = 0;
        }
        Map<String, String> mapB1 = B1(iIntValue);
        if (mapB1 == null) {
            return;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, entry.getValue());
        final C238400w2 c238400w2 = new C238400w2();
        InterfaceC1142670fqD interfaceC1142670fqD = new InterfaceC1142670fqD() { // from class: X.0eqT
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
                C1104380eqS.LIZIZ(entry.getValue().envelopList, str, -1, Boolean.valueOf(this.LIZIZ.C1().isAnchor()));
            }

            @Override // X.InterfaceC1142670fqD
            public final void LIZJ(int i, int i2, String str3) {
                this.LIZIZ.LLILZ = true;
                C1104380eqS.LIZIZ(entry.getValue().envelopList, str, 0, Boolean.valueOf(this.LIZIZ.C1().isAnchor()));
                c238400w2.element = System.currentTimeMillis() - this.LIZ;
            }
        };
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE = ((ActivityTreasureBoxMessage4FE) ListProtector.get(entry.getValue().envelopList, 0)).envelopInfo;
        InterfaceC1101720emA interfaceC1101720emA = null;
        if (activityTreasureBoxInfo4FE != null) {
            numValueOf = Integer.valueOf(activityTreasureBoxInfo4FE.skinId);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue3 = numValueOf.intValue();
            Map<String, Map<String, String>> value = RedEnvelopeSkinSetting.INSTANCE.getValue();
            if (value != null && (map = value.get(String.valueOf(iIntValue3))) != null) {
                str2 = map.get("shorttouch_appear_img");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C1324610kZf url = C1819620xS4.LIZ().setUrl(str2);
                url.LJIL = true;
                url.LJJ = Boolean.FALSE;
                url.LJIIL = interfaceC1142670fqD;
                url.LJIJJ = scaleType;
                url.LJJI(this.LL);
            } else {
                C1143680frq.LJFF(this.LL, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_normal_1"), mapB1.get("effect_url"), ImageView.ScaleType.CENTER_CROP, interfaceC1142670fqD);
            }
        }
        String str3 = mapB1.get("short_touch");
        if (str3 == null) {
            return;
        }
        Uri uriA1 = A1(entry.getKey(), str3, json);
        String str4 = mapB1.get("type_name");
        if (str4 != null) {
            InterfaceC1085330eLj interfaceC1085330eLjVd = ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Vd(this.context, uriA1, null, str4, null, true);
            if (interfaceC1085330eLjVd == null) {
                C1104380eqS.LIZ(Boolean.valueOf(C1().isAnchor()), "shortTouchView create fail", entry.getValue().envelopList);
                if (interfaceC1085330eLjVd == null) {
                    return;
                }
            }
            InterfaceC1104490eqd interfaceC1104490eqdC1 = C1();
            Integer key2 = entry.getKey();
            if (key2 != null) {
                iIntValue2 = key2.intValue();
            }
            interfaceC1104490eqdC1.LIZ(iIntValue2, interfaceC1085330eLjVd.dT1());
            D1(entry, C1().isAnchor());
            final C1324720kZq c1324720kZq = this.LL;
            InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
            if (this.LLILLL && c1324720kZq != null) {
                interfaceC1101720emA = new InterfaceC1101720emA() { // from class: X.0eqU
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
                    public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
                        return new C1104410eqV(viewGroup, z, this, this, c238400w2);
                    }
                };
            }
            interfaceC1087010eOR.Yd(interfaceC1085330eLjVd, interfaceC1101720emA);
        }
    }

    public final void y1(Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> entry, String str) {
        boolean zBooleanValue;
        int i;
        String str2;
        String str3;
        Map<String, String> map;
        String str4;
        Map<String, String> map2;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE;
        Boolean bool = (Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class);
        int iIntValue = 0;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE = (ActivityTreasureBoxMessage4FE) C13LP.LJJJLZIJ(0, entry.getValue().envelopList);
        if (activityTreasureBoxMessage4FE != null && (activityTreasureBoxInfo4FE = activityTreasureBoxMessage4FE.envelopInfo) != null) {
            i = activityTreasureBoxInfo4FE.skinId;
        } else {
            i = 0;
        }
        RedEnvelopeSkinSetting redEnvelopeSkinSetting = RedEnvelopeSkinSetting.INSTANCE;
        Map<String, Map<String, String>> value = redEnvelopeSkinSetting.getValue();
        String str5 = "";
        if (value == null || (map2 = value.get(String.valueOf(i))) == null || (str2 = map2.get("shorttouch_appear_lottie_channel")) == null) {
            str2 = "";
        }
        Map<String, Map<String, String>> value2 = redEnvelopeSkinSetting.getValue();
        if (value2 != null && (map = value2.get(String.valueOf(i))) != null && (str4 = map.get("shorttouch_appear_lottie_path")) != null) {
            str5 = str4;
        }
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, entry.getValue());
        Integer key = entry.getKey();
        if (key != null) {
            iIntValue = key.intValue();
        }
        Map<String, String> mapB1 = B1(iIntValue);
        if (mapB1 == null || (str3 = mapB1.get("short_touch")) == null) {
            return;
        }
        Uri uriA1 = A1(entry.getKey(), str3, json);
        if (this.LLILLL) {
            C1295960jpS c1295960jpS = new C1295960jpS(this.context);
            C786410Ut5.s6(c1295960jpS, new LinearLayout.LayoutParams(C439101nJ.LIZ(90), C439101nJ.LIZ(100)));
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1104450eqZ(str2, str5, new CountDownLatch(1), c1295960jpS, new CountDownLatch(1), this, str, entry, zBooleanValue, uriA1, null), 3);
            return;
        }
        z1(this, entry, uriA1, null);
    }

    public static Uri A1(Integer num, String str, String str2) {
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("initial_data", str2);
        if (num != null && num.intValue() == 20) {
            builderAppendQueryParameter.appendQueryParameter("is_opponent_user", String.valueOf(C973880bRy.LIZ()));
        }
        return builderAppendQueryParameter.build();
    }

    public static final void z1(final ActivityTreasureBoxWidget activityTreasureBoxWidget, Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> entry, Uri uri, final C1295960jpS c1295960jpS) {
        int iIntValue;
        InterfaceC1101720emA interfaceC1101720emA;
        InterfaceC1085330eLj interfaceC1085330eLjVd = ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Vd(activityTreasureBoxWidget.context, uri, null, "shortTouchTreasureBox", null, true);
        if (interfaceC1085330eLjVd != null) {
            InterfaceC1104490eqd interfaceC1104490eqdC1 = activityTreasureBoxWidget.C1();
            Integer key = entry.getKey();
            if (key != null) {
                iIntValue = key.intValue();
            } else {
                iIntValue = 0;
            }
            interfaceC1104490eqdC1.LIZ(iIntValue, interfaceC1085330eLjVd.dT1());
            D1(entry, activityTreasureBoxWidget.C1().isAnchor());
            InterfaceC1087010eOR interfaceC1087010eOR = (InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class);
            if (c1295960jpS == null) {
                interfaceC1101720emA = null;
            } else {
                interfaceC1101720emA = new InterfaceC1101720emA() { // from class: X.0eqX
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
                        final ActivityTreasureBoxWidget activityTreasureBoxWidget2 = activityTreasureBoxWidget;
                        return new InterfaceC1101940emW() { // from class: X.0eqW
                            @Override // X.InterfaceC1101940emW
                            public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                                return new AwS596S0100000_17(c1295960jpS2, 179);
                            }

                            @Override // X.InterfaceC1101940emW
                            public final void LIZIZ() {
                                c1295960jpS2.cancelAnimation();
                            }

                            @Override // X.InterfaceC1101940emW
                            public final void LIZJ() {
                                if (LiveShortTouchAllInOneReportSetting.INSTANCE.enable()) {
                                    IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
                                    C1104430eqX c1104430eqX = this.LIZ;
                                    c1104430eqX.getClass();
                                    C1101820emK c1101820emKTd = iShortTouchService.Td(C1099470eiX.LIZ(c1104430eqX));
                                    if (c1101820emKTd != null) {
                                        ActivityTreasureBoxWidget activityTreasureBoxWidget3 = activityTreasureBoxWidget2;
                                        C1295960jpS c1295960jpS3 = c1295960jpS2;
                                        c1101820emKTd.LIZJ = !Intrinsics.LJFF(activityTreasureBoxWidget3.LLILZLL.remove(Integer.valueOf(c1295960jpS3.hashCode())), Boolean.TRUE) ? 1 : 0;
                                        Long lRemove = activityTreasureBoxWidget3.LLILZIL.remove(Integer.valueOf(c1295960jpS3.hashCode()));
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
}

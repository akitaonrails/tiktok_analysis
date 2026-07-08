package kotlin.jvm.internal;

import X.AbstractC1100450ek7;
import X.AbstractC1110790f0n;
import X.AbstractC1110800f0o;
import X.AbstractC1145640fv0;
import X.AnonymousClass0207;
import X.C01GW;
import X.C09AY;
import X.C09R7;
import X.C0IJT;
import X.C1078640eAw;
import X.C1100420ek4;
import X.C1109770ez9;
import X.C1113490f59;
import X.C1113510f5B;
import X.C1113520f5C;
import X.C1117220fBA;
import X.C1121570fIB;
import X.C1124580fN2;
import X.C1124600fN4;
import X.C1124610fN5;
import X.C1124620fN6;
import X.C1124670fNB;
import X.C1124710fNF;
import X.C1125090fNr;
import X.C1127430fRd;
import X.C1127450fRf;
import X.C1127490fRj;
import X.C1127520fRm;
import X.C1127540fRo;
import X.C1127550fRp;
import X.C1127560fRq;
import X.C1127590fRt;
import X.C1127620fRw;
import X.C1127650fRz;
import X.C1127870fSL;
import X.C1128710fTh;
import X.C1135280feI;
import X.C1135590fen;
import X.C1136560fgM;
import X.C1144350fsv;
import X.C1144460ft6;
import X.C1144530ftD;
import X.C1144880ftm;
import X.C1144900fto;
import X.C1144910ftp;
import X.C1145600fuw;
import X.C1149760g1e;
import X.C13BV;
import X.C13IQ;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1697810uHb;
import X.C1946707jt;
import X.C20409114tV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2436109gd;
import X.C474500IjA;
import X.C500260Jjc;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C970370bMJ;
import X.C973660bRc;
import X.EnumC1144450ft5;
import X.EnumC919170a1j;
import X.InterfaceC1075600e62;
import X.InterfaceC1127800fSE;
import X.InterfaceC1127910fSP;
import X.InterfaceC1135620feq;
import X.InterfaceC1136020ffU;
import X.InterfaceC1145720fv8;
import X.InterfaceC1149850g1n;
import X.InterfaceC1766500w4O;
import X.InterfaceC500940Jki;
import X.InterfaceC973730bRj;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchBottomNoticeCard;
import com.bytedance.android.live.wallet.viewmodel.exchange.LiveIncomeExchangeAndNoSendDialogVM;
import com.bytedance.android.livesdk.BatchBannerVisibilityChannel;
import com.bytedance.android.livesdk.CollaborateGiftingStateChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.LiveCPCViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.TeamRankProgress;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.guide.model.LocalCurrencyGiftInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorClusterSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEnigmaMatchBannerSchemaSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRankingExclusiveTabSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public class AwS146S0400000_17 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS146S0400000_17 awS146S0400000_17) {
        User owner;
        String str;
        String str2;
        Long lValueOf;
        String string;
        String str3;
        String str4;
        Integer num;
        Room roomLJJLIIIIJ;
        C1145600fuw c1145600fuw = (C1145600fuw) awS146S0400000_17.l0;
        AbstractC1145640fv0 abstractC1145640fv0 = c1145600fuw.LIZ;
        if (abstractC1145640fv0 instanceof C1144900fto) {
            ((MatchBottomNoticeCard) awS146S0400000_17.l1).So((View) ((InterfaceC1145720fv8) awS146S0400000_17.l2));
            Function0 function0 = (Function0) awS146S0400000_17.l3;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (abstractC1145640fv0 instanceof C1144910ftp) {
            MatchBottomNoticeCard matchBottomNoticeCard = (MatchBottomNoticeCard) awS146S0400000_17.l1;
            matchBottomNoticeCard.getClass();
            C20441214yg.LIZIZ("MatchBottomNoticeCard", "open gift panel");
            DataChannel dataChannel = matchBottomNoticeCard.LLJJ;
            Long lValueOf2 = null;
            if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null) {
                owner = roomLJJLIIIIJ.getOwner();
            } else {
                owner = null;
            }
            C1121570fIB c1121570fIB = new C1121570fIB(owner);
            C1144880ftm c1144880ftm = c1145600fuw.LJ;
            if (c1144880ftm != null && (num = c1144880ftm.LJII) != null && num.intValue() == 2) {
                str = "no2_booster_effect_notice";
            } else {
                str = "no3_booster_effect_notice";
            }
            c1121570fIB.LIZJ = str;
            DataChannel dataChannel2 = matchBottomNoticeCard.LLJJ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(SendGiftEvent.class, c1121570fIB);
            }
            C973660bRc c973660bRc = C973660bRc.LIZ;
            C1144880ftm c1144880ftm2 = ((C1145600fuw) awS146S0400000_17.l0).LJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
            C973660bRc.LJJIIJZLJL(linkedHashMap);
            C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
            linkedHashMap.put(C973660bRc.LJJ, String.valueOf(C973660bRc.LJJIJLIJ()));
            String str5 = C973660bRc.LJJII;
            if (C973660bRc.LJLLLL()) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            linkedHashMap.put(str5, str2);
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                lValueOf = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
            } else {
                lValueOf = null;
            }
            linkedHashMap.put("pk_id", String.valueOf(lValueOf));
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf22 != null) {
                lValueOf2 = Long.valueOf(interfaceC973730bRjYf22.LJJL());
            }
            linkedHashMap.put("channel_id", String.valueOf(lValueOf2));
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            String str6 = "";
            if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                string = "";
            }
            linkedHashMap.put("user_id", string);
            if (c1144880ftm2 == null || (str3 = c1144880ftm2.LIZ) == null) {
                str3 = "";
            }
            linkedHashMap.put("notification_type", str3);
            if (c1144880ftm2 != null) {
                if (Intrinsics.LJFF(c1144880ftm2.LJFF, "count_down")) {
                    str4 = "countdown";
                } else {
                    str4 = c1144880ftm2.LJFF;
                    if (str4 == null) {
                        str4 = "";
                    }
                }
                linkedHashMap.put("trigger_type", str4);
                String str7 = c1144880ftm2.LJI;
                if (str7 != null) {
                    str6 = str7;
                }
                linkedHashMap.put("notification_request_id", str6);
                C1144460ft6 c1144460ft6 = EnumC1144450ft5.Companion;
                int i = (int) (c1144880ftm2.LIZIZ / ((long) 10000));
                c1144460ft6.getClass();
                linkedHashMap.put("match_item_type", String.valueOf(C1144460ft6.LIZ(i)));
            }
            C1144530ftD.LIZ(c973660bRc, linkedHashMap);
            String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
            if (strLIZIZ == null) {
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                c917350Zyn.getClass();
                strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
            }
            if (C970370bMJ.LJII()) {
                C973660bRc.LJZ(c973660bRc, "livesdk_match_item_effect_notice_send_click", linkedHashMap, strLIZIZ);
            } else {
                C973660bRc.LJZI(c973660bRc, "livesdk_match_item_effect_notice_send_click", linkedHashMap, strLIZIZ);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$1(AwS146S0400000_17 awS146S0400000_17) {
        Fragment fragment = (Fragment) awS146S0400000_17.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS146S0400000_17.l1).invoke(), C09R7.LIZ((C13IQ) awS146S0400000_17.l2));
        Function2 function2 = (Function2) awS146S0400000_17.l3;
        Fragment fragment2 = (Fragment) awS146S0400000_17.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(LiveCPCViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS383S0200000_17(function2, fragment2, 43));
        return jediViewModel;
    }

    public static final Object invoke$10(AwS146S0400000_17 awS146S0400000_17) {
        C1113510f5B c1113510f5B = (C1113510f5B) awS146S0400000_17.l0;
        AbstractC1110790f0n abstractC1110790f0n = (AbstractC1110790f0n) awS146S0400000_17.l1;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list = (List) awS146S0400000_17.l2;
        C13BV c13bv = C13BV.INSTANCE;
        c1113510f5B.LJIIJ(abstractC1110790f0n, list, c13bv, c13bv, (Map) awS146S0400000_17.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS146S0400000_17 awS146S0400000_17) {
        String str;
        C1113510f5B c1113510f5B = (C1113510f5B) awS146S0400000_17.l0;
        AbstractC1110790f0n abstractC1110790f0n = (AbstractC1110790f0n) awS146S0400000_17.l1;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list = (List) awS146S0400000_17.l2;
        List list2 = (List) awS146S0400000_17.l3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (it2.hasNext()) {
                it2.next();
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    if (i2 >= list2.size()) {
                        i3 = 0;
                    }
                    arrayList.add(Integer.valueOf(i3));
                    i2 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                List list3 = (List) awS146S0400000_17.l2;
                List list4 = (List) awS146S0400000_17.l3;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    it3.next();
                    int i5 = i + 1;
                    if (i >= 0) {
                        if (i < list4.size()) {
                            str = "";
                        } else {
                            str = "NoSpace";
                        }
                        arrayList2.add(str);
                        i = i5;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                c1113510f5B.LJIILIIL(abstractC1110790f0n, list, arrayList, arrayList2, "negative_page_fixed_icon");
                C1113510f5B c1113510f5B2 = (C1113510f5B) awS146S0400000_17.l0;
                C1109770ez9 c1109770ez9 = c1113510f5B2.LJIJI;
                if (c1109770ez9 == null) {
                    return null;
                }
                c1113510f5B2.LJIIIIZZ(c1109770ez9, !((List) awS146S0400000_17.l3).isEmpty());
                return Unit.LIZ;
            }
        }
    }

    public static final Object invoke$2(AwS146S0400000_17 awS146S0400000_17) {
        return new LiveIncomeExchangeAndNoSendDialogVM((C1149760g1e) awS146S0400000_17.l0, (Context) awS146S0400000_17.l1, (C1144350fsv) awS146S0400000_17.l2, (InterfaceC1149850g1n) awS146S0400000_17.l3);
    }

    public static final Object invoke$3(AwS146S0400000_17 awS146S0400000_17) {
        C1127870fSL c1127870fSL;
        C1128710fTh c1128710fTh;
        InterfaceC1127800fSE[] interfaceC1127800fSEArr = new InterfaceC1127800fSE[31];
        final View view = (View) awS146S0400000_17.l0;
        final DataChannel dataChannel = (DataChannel) awS146S0400000_17.l1;
        interfaceC1127800fSEArr[0] = new InterfaceC1127800fSE(view, dataChannel) { // from class: X.0fS2
            public final DataChannel LL;
            public final EnumC1127500fRk LLILLJJLI = EnumC1127500fRk.PAD;
            public final C01GW LLILLL;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view2, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C420570GeN) this.LLILLL.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                boolean zBooleanValue;
                Boolean bool;
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(C0TZM.class)) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                if (C753060TgO.LIZ() && !zBooleanValue) {
                    return true;
                }
                return false;
            }

            {
                this.LL = dataChannel;
                this.LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view, 528));
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                return (View) this.LLILLL.getValue();
            }
        };
        final View view2 = (View) awS146S0400000_17.l0;
        final Context context = ((C1127650fRz) awS146S0400000_17.l2).LL;
        interfaceC1127800fSEArr[1] = new InterfaceC1127800fSE(context, view2) { // from class: X.0fRc
            public final EnumC1127500fRk LL = EnumC1127500fRk.ENIGMA_MATCH;
            public final C01GW LLILLJJLI;
            public boolean LLILLL;
            public boolean LLILZ;
            public final C987150bnN LLILZIL;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view3, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1123340fL2) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
                C1548820qPI.LJIIIIZZ("ENIGMA_MATCH_GIFT_BANNER_CLICK", this.LLILZIL);
                this.LLILZ = false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
                this.LLILLL = InterfaceC1106030et7.S6.LIZIZ().booleanValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
                C1548820qPI.LJIIIIZZ("ENIGMA_MATCH_GIFT_BANNER_CLICK", this.LLILZIL);
                this.LLILZ = false;
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                boolean z;
                User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
                if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zLJIL = C1128450fTH.LJIL();
                boolean zWo1 = C1128450fTH.LIZJ.Wo1();
                if (!z || !zLJIL || !zWo1 || this.LLILLL) {
                    return false;
                }
                InterfaceC1106030et7.S6.LJFF(Boolean.TRUE);
                return true;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view2, 537));
                this.LLILZIL = new C987150bnN(context, 3);
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                C495520Jby c495520Jby = new C495520Jby(LiveGiftEnigmaMatchBannerSchemaSetting.INSTANCE.getValue());
                c495520Jby.LIZIZ(C1128450fTH.LJIIJJI(), "channel_id");
                c495520Jby.LIZIZ(C1128450fTH.LIZJ(), "pk_id");
                c495520Jby.LIZJ("sub_match_type", C1128450fTH.LJIIZILJ());
                c495520Jby.LIZ(1, "is_enigma");
                ILiveMatchService iLiveMatchService = C1128450fTH.LIZJ;
                c495520Jby.LIZIZ(iLiveMatchService.Nt0(), "enigma_count");
                c495520Jby.LIZIZ(iLiveMatchService.y90(), "enigma_total_points");
                c495520Jby.LIZIZ(c1124680fNC.LJFF, "gift_id");
                String strLIZLLL = c495520Jby.LIZLLL();
                strLIZLLL.toString();
                if (!this.LLILZ) {
                    C1548820qPI.LIZLLL("ENIGMA_MATCH_GIFT_BANNER_CLICK", this.LLILZIL);
                    this.LLILZ = true;
                }
                return C1124590fN3.LIZ((C1123340fL2) this.LLILLJJLI.getValue(), c1124680fNC, strLIZLLL, interfaceC1124700fNE);
            }
        };
        View view3 = (View) awS146S0400000_17.l0;
        AbstractC1100450ek7 abstractC1100450ek7 = ((C1127650fRz) awS146S0400000_17.l2).LLIZLLLIL;
        InterfaceC1127800fSE interfaceC1127800fSE = null;
        if (!(abstractC1100450ek7 instanceof C1128710fTh) || (c1128710fTh = (C1128710fTh) abstractC1100450ek7) == null || (c1127870fSL = c1128710fTh.LLLIIIL) == null) {
            c1127870fSL = new C1127870fSL();
        }
        interfaceC1127800fSEArr[2] = new C1127520fRm(view3, c1127870fSL);
        final View view4 = (View) awS146S0400000_17.l0;
        final DataChannel dataChannel2 = (DataChannel) awS146S0400000_17.l1;
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) awS146S0400000_17.l3;
        interfaceC1127800fSEArr[3] = new InterfaceC1127800fSE(view4, lifecycleOwner, dataChannel2) { // from class: X.0fO1
            public final DataChannel LL;
            public final LifecycleOwner LLILLJJLI;
            public final EnumC1127500fRk LLILLL = EnumC1127500fRk.COLLABORATIVE_GIFT;
            public final C01GW LLILZ;
            public final C01GW LLILZIL;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE2, View view5, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1124780fNM) this.LLILZ.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
                ((C1124780fNM) this.LLILZ.getValue()).j0();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                AbstractC1132210fZL abstractC1132210fZL;
                if (c1124680fNC.LJFF != ((Number) this.LLILZIL.getValue()).longValue()) {
                    long j = c1124680fNC.LJFF;
                    DataChannel dataChannel3 = this.LL;
                    if (dataChannel3 != null && (abstractC1132210fZL = (AbstractC1132210fZL) dataChannel3.gg0(CollaborateGiftingStateChannel.class)) != null && !(abstractC1132210fZL instanceof C1132240fZO)) {
                        if (abstractC1132210fZL instanceof C1132220fZM) {
                            if (j != ((C1132220fZM) abstractC1132210fZL).LIZLLL.fuelGiftId) {
                                return false;
                            }
                        } else {
                            if (!(abstractC1132210fZL instanceof C1132230fZN)) {
                                throw new C1954807lC();
                            }
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                return true;
            }

            {
                this.LL = dataChannel2;
                this.LLILLJJLI = lifecycleOwner;
                EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
                this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(view4, 530));
                this.LLILZIL = C452501pT.LIZ(enumC452301pR, AFwS205S0000000_17.get$arr$(270));
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                boolean z;
                C1128710fTh c1128710fTh2;
                AbstractC1100450ek7 abstractC1100450ek72 = c1124680fNC.LJIIJ;
                if ((abstractC1100450ek72 instanceof C1128710fTh) && (c1128710fTh2 = (C1128710fTh) abstractC1100450ek72) != null) {
                    z = c1128710fTh2.LLLLLLIL;
                } else {
                    z = false;
                }
                C1124780fNM c1124780fNM = (C1124780fNM) this.LLILZ.getValue();
                if (z) {
                    c1124780fNM.n0(c1124680fNC.LIZIZ, this.LL, this.LLILLJJLI, Intrinsics.LJFF(c1124680fNC.LIZJ, c1124680fNC.LIZIZ));
                }
                return c1124780fNM;
            }
        };
        final View view5 = (View) awS146S0400000_17.l0;
        final DataChannel dataChannel3 = (DataChannel) awS146S0400000_17.l1;
        interfaceC1127800fSEArr[4] = new InterfaceC1127800fSE(view5, dataChannel3) { // from class: X.0fRg
            public final DataChannel LL;
            public final EnumC1127500fRk LLILLJJLI = EnumC1127500fRk.VIEWER_WISHES;
            public final C01GW LLILLL;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE2, View view6, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1124780fNM) this.LLILLL.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LLILLJJLI;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0059 A[EDGE_INSN: B:37:0x0059->B:29:0x0059 BREAK  A[LOOP:0: B:22:0x003f->B:40:0x003f], SYNTHETIC] */
            @Override // X.InterfaceC1127800fSE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJFF(X.C1124680fNC r11) {
                /*
                    r10 = this;
                    com.bytedance.ies.sdk.datachannel.DataChannel r1 = r10.LL
                    r9 = 0
                    if (r1 == 0) goto L60
                    java.lang.Class<com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus> r0 = com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus.class
                    java.lang.Object r1 = r1.gg0(r0)
                    X.1AHm r1 = (X.C2176881AHm) r1
                    if (r1 == 0) goto L61
                    X.0UXz r0 = r1.LIZ
                    if (r0 == 0) goto L61
                    boolean r0 = r0.isViewerWishAudience()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                L1b:
                    boolean r0 = X.C176600m4.LIZIZ(r0)
                    r8 = 1
                    if (r0 == 0) goto L5e
                    com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig r0 = com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig.INSTANCE
                    com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig$ViewerWishesConfigModel r0 = r0.getGetValue()
                    boolean r0 = r0.audienceEnabled
                    if (r0 == 0) goto L5e
                    r7 = 1
                L2d:
                    if (r1 == 0) goto L59
                    X.0fOx r0 = r1.LIZIZ
                    if (r0 == 0) goto L59
                    com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo r0 = r0.LIZIZ
                    if (r0 == 0) goto L59
                    java.util.List<com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore> r0 = r0.giftPickList
                    if (r0 == 0) goto L59
                    java.util.Iterator r6 = r0.iterator()
                L3f:
                    boolean r0 = r6.hasNext()
                    if (r0 == 0) goto L59
                    java.lang.Object r5 = r6.next()
                    r0 = r5
                    com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore r0 = (com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore) r0
                    com.bytedance.android.livesdk.viewer_picks.model.GiftPick r0 = r0.giftPick
                    if (r0 == 0) goto L3f
                    long r3 = r0.giftId
                    long r1 = r11.LJFF
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 != 0) goto L3f
                    r9 = r5
                L59:
                    if (r7 == 0) goto L63
                    if (r9 == 0) goto L63
                    return r8
                L5e:
                    r7 = 0
                    goto L2d
                L60:
                    r1 = r9
                L61:
                    r0 = r9
                    goto L1b
                L63:
                    r8 = 0
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1127460fRg.LJFF(X.0fNC):boolean");
            }

            {
                this.LL = dataChannel3;
                this.LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view5, 518));
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                C2176881AHm c2176881AHm;
                String str;
                String strLJIJJ;
                C1125770fOx c1125770fOx;
                ViewerPicksInfo viewerPicksInfo;
                List<GiftPickWithScore> list;
                GiftPickWithScore next;
                DataChannel dataChannel4 = this.LL;
                GiftPick giftPick = null;
                if (dataChannel4 != null) {
                    c2176881AHm = (C2176881AHm) dataChannel4.gg0(ViewerWishesStatus.class);
                } else {
                    c2176881AHm = null;
                }
                if (c2176881AHm != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (viewerPicksInfo = c1125770fOx.LIZIZ) != null && (list = viewerPicksInfo.giftPickList) != null) {
                    Iterator<GiftPickWithScore> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            GiftPick giftPick2 = next.giftPick;
                            if (giftPick2 != null && giftPick2.giftId == c1124680fNC.LJFF) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    GiftPickWithScore giftPickWithScore = next;
                    if (giftPickWithScore != null) {
                        giftPick = giftPickWithScore.giftPick;
                    }
                }
                ((C1124780fNM) this.LLILLL.getValue()).setViewerWishesStyle(c1124680fNC.LIZIZ);
                if (giftPick != null && giftPick.isPriorityRequest) {
                    strLJIJJ = C497740JfY.LJIJI(2131857004);
                } else {
                    Object[] objArr = new Object[1];
                    if (giftPick == null || (str = giftPick.customizedDesc) == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    strLJIJJ = C497740JfY.LJIJJ(2131856988, objArr);
                }
                ((C1124780fNM) this.LLILLL.getValue()).setDescriptionText(strLJIJJ);
                return (View) this.LLILLL.getValue();
            }
        };
        interfaceC1127800fSEArr[5] = new C1127620fRw((View) awS146S0400000_17.l0);
        interfaceC1127800fSEArr[6] = new C1127560fRq(((C1127650fRz) awS146S0400000_17.l2).LL, (View) awS146S0400000_17.l0, (DataChannel) awS146S0400000_17.l1);
        interfaceC1127800fSEArr[7] = new C1127590fRt(((C1127650fRz) awS146S0400000_17.l2).LL, (View) awS146S0400000_17.l0);
        interfaceC1127800fSEArr[8] = new C1124710fNF((View) awS146S0400000_17.l0, (DataChannel) awS146S0400000_17.l1, (LifecycleOwner) awS146S0400000_17.l3, ((C1127650fRz) awS146S0400000_17.l2).LL);
        final View view6 = (View) awS146S0400000_17.l0;
        interfaceC1127800fSEArr[9] = new InterfaceC1127800fSE(view6) { // from class: X.0fRv
            public final EnumC1127500fRk LL = EnumC1127500fRk.HAMMER;
            public final C01GW LLILLJJLI;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE2, View view7, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1118050fCV) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view6, 521));
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
            @Override // X.InterfaceC1127800fSE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJFF(X.C1124680fNC r5) {
                /*
                    r4 = this;
                    X.0fQI<? extends X.0054> r0 = r5.LIZIZ
                    r3 = 0
                    if (r0 == 0) goto L22
                    boolean r0 = r0.LJIJJ()
                    r2 = 1
                    if (r0 != r2) goto L22
                Lc:
                    X.0fQI<? extends X.0054> r0 = r5.LIZIZ
                    r1 = 0
                    if (r0 == 0) goto L13
                    T extends X.0054 r1 = r0.LIZIZ
                L13:
                    boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.Gift
                    if (r0 == 0) goto L1d
                    com.bytedance.android.livesdk.model.Gift r1 = (com.bytedance.android.livesdk.model.Gift) r1
                    if (r1 == 0) goto L1d
                    int r3 = r1.diamondCount
                L1d:
                    boolean r0 = X.C1133200faw.LIZIZ(r3, r2)
                    return r0
                L22:
                    r2 = 0
                    goto Lc
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1127610fRv.LJFF(X.0fNC):boolean");
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                int i;
                Gift gift;
                C1118050fCV c1118050fCV = (C1118050fCV) this.LLILLJJLI.getValue();
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
                Object obj = null;
                if (abstractC1126600fQI != null) {
                    obj = abstractC1126600fQI.LIZIZ;
                }
                if ((obj instanceof Gift) && (gift = (Gift) obj) != null) {
                    i = gift.diamondCount;
                } else {
                    i = 0;
                }
                c1118050fCV.setData(i);
                return (View) this.LLILLJJLI.getValue();
            }
        };
        View view7 = (View) awS146S0400000_17.l0;
        C1127650fRz c1127650fRz = (C1127650fRz) awS146S0400000_17.l2;
        C1127490fRj c1127490fRj = new C1127490fRj(view7, c1127650fRz.LL, (DataChannel) awS146S0400000_17.l1, (LifecycleOwner) awS146S0400000_17.l3, c1127650fRz.LLJJJ);
        C01GW c01gw = C1078640eAw.LIZ;
        if (!((Boolean) c01gw.getValue()).booleanValue()) {
            c1127490fRj = null;
        }
        interfaceC1127800fSEArr[10] = c1127490fRj;
        interfaceC1127800fSEArr[11] = new C1124600fN4((View) awS146S0400000_17.l0, (LifecycleOwner) awS146S0400000_17.l3, (DataChannel) awS146S0400000_17.l1);
        interfaceC1127800fSEArr[12] = new C1127430fRd((View) awS146S0400000_17.l0, (LifecycleOwner) awS146S0400000_17.l3, (DataChannel) awS146S0400000_17.l1);
        interfaceC1127800fSEArr[13] = new C1125090fNr(((C1127650fRz) awS146S0400000_17.l2).LL, (View) awS146S0400000_17.l0, (DataChannel) awS146S0400000_17.l1);
        final View view8 = (View) awS146S0400000_17.l0;
        InterfaceC1127800fSE interfaceC1127800fSE2 = new InterfaceC1127800fSE(view8) { // from class: X.0fPA
            public final EnumC1127500fRk LL = EnumC1127500fRk.GOAL;
            public final C01GW LLILLJJLI;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view9, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1125880fP8) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view8, 519));
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                GiftPanelBanner giftPanelBanner;
                GiftsInfo giftsInfo;
                if (C1125160fNy.LIZLLL(c1124680fNC.LIZIZ)) {
                    GiftListResult giftListResult = c1124680fNC.LJI;
                    if (giftListResult != null && (giftsInfo = giftListResult.giftsInfo) != null) {
                        giftPanelBanner = giftsInfo.liveGoalBanner;
                    } else {
                        giftPanelBanner = null;
                    }
                    return C1125160fNy.LIZJ(c1124680fNC.LIZIZ, giftPanelBanner);
                }
                return false;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
            @Override // X.InterfaceC1127800fSE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View LJI(X.C1124680fNC r7, X.InterfaceC1124700fNE r8, X.InterfaceC1123410fL9 r9) {
                /*
                    r6 = this;
                    com.bytedance.android.livesdk.gift.model.GiftListResult r0 = r7.LJI
                    r5 = 0
                    if (r0 == 0) goto L56
                    com.bytedance.android.livesdk.gift.model.GiftsInfo r0 = r0.giftsInfo
                    if (r0 == 0) goto L56
                    com.bytedance.android.livesdk.model.GiftPanelBanner r1 = r0.liveGoalBanner
                Lb:
                    X.01GW r0 = r6.LLILLJJLI
                    java.lang.Object r4 = r0.getValue()
                    X.0fP8 r4 = (X.C1125880fP8) r4
                    r4.setupLayout(r1)
                    long r0 = r7.LJFF
                    java.lang.Long r3 = java.lang.Long.valueOf(r0)
                    X.0ek7 r0 = r7.LJIIJ
                    if (r0 == 0) goto L28
                    X.0ek4 r0 = r0.LLILZIL
                    if (r0 == 0) goto L28
                    androidx.fragment.app.Fragment r5 = r0.getFragment()
                L28:
                    X.0ek7 r1 = r7.LJIIJ
                    boolean r0 = r1 instanceof X.C1128710fTh
                    if (r0 == 0) goto L54
                    X.0fTh r1 = (X.C1128710fTh) r1
                    r2 = 1
                    if (r1 == 0) goto L54
                    boolean r0 = r1.LLLLLLIL
                    if (r0 != r2) goto L54
                    X.0fQI<? extends X.0054> r1 = r7.LIZIZ
                    X.0fQI<? extends X.0054> r0 = r7.LIZJ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 != 0) goto L54
                L41:
                    kotlin.jvm.internal.AwS418S0200000_17 r1 = new kotlin.jvm.internal.AwS418S0200000_17
                    r0 = 91
                    r1.<init>(r7, r8, r0)
                    r4.LIZ(r3, r5, r2, r1)
                    X.01GW r0 = r6.LLILLJJLI
                    java.lang.Object r0 = r0.getValue()
                    android.view.View r0 = (android.view.View) r0
                    return r0
                L54:
                    r2 = 0
                    goto L41
                L56:
                    r1 = r5
                    goto Lb
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1125900fPA.LJI(X.0fNC, X.0fNE, X.0fL9):android.view.View");
            }
        };
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            interfaceC1127800fSE = interfaceC1127800fSE2;
        }
        interfaceC1127800fSEArr[14] = interfaceC1127800fSE;
        final View view9 = (View) awS146S0400000_17.l0;
        interfaceC1127800fSEArr[15] = new InterfaceC1127800fSE(view9) { // from class: X.0fS3
            public final EnumC1127500fRk LL = EnumC1127500fRk.MATCH_ONLY;
            public final C01GW LLILLJJLI;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view10, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1124780fNM) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view9, 525));
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
                if (!C1128450fTH.LJIL() || (abstractC1126600fQI = c1124680fNC.LIZIZ) == null || C1128450fTH.LJJIJIIJI() != abstractC1126600fQI.LJI()) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                C1124780fNM c1124780fNM = (C1124780fNM) this.LLILLJJLI.getValue();
                c1124780fNM.p0();
                return c1124780fNM;
            }
        };
        final View view10 = (View) awS146S0400000_17.l0;
        interfaceC1127800fSEArr[16] = new InterfaceC1127800fSE(view10) { // from class: X.0fRr
            public final EnumC1127500fRk LL = EnumC1127500fRk.LOCAL_CURRENCY_GIFT;
            public final C01GW LLILLJJLI;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view11, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1123340fL2) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view10, 522));
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
                String str;
                LocalCurrencyGiftInfo localCurrencyGiftInfoLIZIZ = C1127580fRs.LIZIZ();
                if (localCurrencyGiftInfoLIZIZ == null || (abstractC1126600fQI = c1124680fNC.LIZIZ) == null || localCurrencyGiftInfoLIZIZ.giftId != abstractC1126600fQI.LJFF()) {
                    return false;
                }
                GiftPanelBanner giftPanelBanner = localCurrencyGiftInfoLIZIZ.banner;
                if (giftPanelBanner != null) {
                    str = giftPanelBanner.bannerLynxUrl;
                } else {
                    str = null;
                }
                if (!C500260Jjc.LJJIIZ(str)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                String str;
                GiftPanelBanner giftPanelBanner;
                C1123340fL2 c1123340fL2 = (C1123340fL2) this.LLILLJJLI.getValue();
                LocalCurrencyGiftInfo localCurrencyGiftInfoLIZIZ = C1127580fRs.LIZIZ();
                if (localCurrencyGiftInfoLIZIZ == null || (giftPanelBanner = localCurrencyGiftInfoLIZIZ.banner) == null || (str = giftPanelBanner.bannerLynxUrl) == null) {
                    str = "";
                }
                return C1124590fN3.LIZ(c1123340fL2, c1124680fNC, str, interfaceC1124700fNE);
            }
        };
        interfaceC1127800fSEArr[17] = new C1127540fRo((View) awS146S0400000_17.l0, (LifecycleOwner) awS146S0400000_17.l3, ((C1127650fRz) awS146S0400000_17.l2).LLJJJIL);
        interfaceC1127800fSEArr[18] = new C1127450fRf((View) awS146S0400000_17.l0, (LifecycleOwner) awS146S0400000_17.l3);
        interfaceC1127800fSEArr[19] = new C1124620fN6(((C1127650fRz) awS146S0400000_17.l2).LL, (View) awS146S0400000_17.l0);
        interfaceC1127800fSEArr[20] = new C1127550fRp((View) awS146S0400000_17.l0, (DataChannel) awS146S0400000_17.l1, new AwS561S0100000_17((C1127650fRz) awS146S0400000_17.l2, 490));
        final View view11 = (View) awS146S0400000_17.l0;
        final Context context2 = ((C1127650fRz) awS146S0400000_17.l2).LL;
        interfaceC1127800fSEArr[21] = new InterfaceC1127800fSE(context2, view11) { // from class: X.0fND
            public final Context LL;
            public final EnumC1127500fRk LLILLJJLI = EnumC1127500fRk.TEAM_RANK;
            public final C01GW LLILLL;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view12, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
            public final C1124780fNM LJ() {
                return (C1124780fNM) this.LLILLL.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
                Gift gift;
                GiftLockInfo giftLockInfo;
                if (GiftManager.inst().getTeamRankManager().LIZJ(c1124680fNC.LJFF) && (abstractC1126600fQI = c1124680fNC.LIZIZ) != null && !abstractC1126600fQI.LJIJJ()) {
                    T t = c1124680fNC.LIZIZ.LIZIZ;
                    if (!(t instanceof Gift) || (gift = (Gift) t) == null || (giftLockInfo = gift.giftSubInfo) == null || giftLockInfo.mLockType != 5) {
                        return true;
                    }
                }
                return false;
            }

            {
                this.LL = context2;
                this.LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view11, 536));
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                String str;
                GiftPanelBanner giftPanelBanner = c1124680fNC.LJII;
                if (giftPanelBanner != null) {
                    C1124590fN3.LIZIZ(LJ(), this.LL, giftPanelBanner, c1124680fNC);
                    C1118340fCy teamRankManager = GiftManager.inst().getTeamRankManager();
                    TeamRankProgress teamRankProgress = teamRankManager.LIZ;
                    if (teamRankProgress != null) {
                        Text text = giftPanelBanner.displayText;
                        if (text == null || (str = text.defaultPattern) == null) {
                            str = "";
                        }
                        String strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{Integer.valueOf(teamRankProgress.currentNumber), Integer.valueOf(teamRankProgress.targetNumber)}, 2));
                        TeamRankProgress teamRankProgress2 = teamRankManager.LIZ;
                        if (teamRankProgress2 != null && teamRankProgress2.currentNumber >= teamRankProgress2.targetNumber) {
                            String value = C1118340fCy.LJIILIIL.getValue();
                            if (!teamRankManager.LJII) {
                                teamRankManager.LJII = true;
                                LJ().setDescriptionText(strJ4);
                                LJ().e0(value, LiveGiftRankingExclusiveTabSetting.INSTANCE.getBannerTransitionDelay() * 1000);
                            } else {
                                LJ().setDescriptionText(value);
                            }
                        } else {
                            teamRankManager.LJII = false;
                            LJ().setDescriptionText(strJ4);
                        }
                    }
                }
                return LJ();
            }
        };
        interfaceC1127800fSEArr[22] = new C1124580fN2(((C1127650fRz) awS146S0400000_17.l2).LL, (View) awS146S0400000_17.l0, (DataChannel) awS146S0400000_17.l1);
        interfaceC1127800fSEArr[23] = new C1124610fN5(((C1127650fRz) awS146S0400000_17.l2).LL, (View) awS146S0400000_17.l0);
        final View view12 = (View) awS146S0400000_17.l0;
        C1127650fRz c1127650fRz2 = (C1127650fRz) awS146S0400000_17.l2;
        final Context context3 = c1127650fRz2.LL;
        final GiftPanelLeafViewModel giftPanelLeafViewModel = c1127650fRz2.LLJJJIL;
        interfaceC1127800fSEArr[24] = new InterfaceC1127800fSE(view12, context3, giftPanelLeafViewModel) { // from class: X.0fN9
            public final Context LL;
            public final GiftPanelLeafViewModel LLILLJJLI;
            public final EnumC1127500fRk LLILLL = EnumC1127500fRk.GIFT;
            public final C01GW LLILZ;
            public final C01GW LLILZIL;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view13, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
            public final C1123340fL2 LJ() {
                return (C1123340fL2) this.LLILZ.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                if (c1124680fNC.LJII != null) {
                    return true;
                }
                return false;
            }

            {
                this.LL = context3;
                this.LLILLJJLI = giftPanelLeafViewModel;
                EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
                this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(view12, 515));
                this.LLILZIL = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(view12, 516));
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                Long value;
                Long lValueOf;
                String secUid;
                Long lValueOf2;
                boolean z;
                Fragment fragment;
                C1100420ek4 c1100420ek4;
                C1128710fTh c1128710fTh2;
                GiftLockInfo giftLockInfo;
                MutableLiveData<Long> mutableLiveData;
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
                GiftPanelBanner giftPanelBanner = c1124680fNC.LJII;
                if (giftPanelBanner != null) {
                    if (C500260Jjc.LJJIIZ(giftPanelBanner.bannerLynxUrl)) {
                        if (c1124680fNC.LIZ == 16 && (abstractC1126600fQI = c1124680fNC.LIZJ) != null) {
                            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = c1124680fNC.LIZIZ;
                            if ((abstractC1126600fQI instanceof C1126980fQu) && (abstractC1126600fQI2 instanceof C1126980fQu) && ((C1126980fQu) abstractC1126600fQI2).LJJIIJZLJL((C1126980fQu) abstractC1126600fQI)) {
                                return LJ();
                            }
                        }
                        User userLIZJ = C1125800fP0.LIZJ();
                        if (userLIZJ == null) {
                            Room room = c1124680fNC.LJIIJJI;
                            if (room != null) {
                                userLIZJ = room.getOwner();
                            } else {
                                userLIZJ = null;
                            }
                        }
                        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
                        C1123340fL2 c1123340fL2LJ = LJ();
                        String str = giftPanelBanner.bannerLynxUrl;
                        GiftPanelLeafViewModel giftPanelLeafViewModel2 = this.LLILLJJLI;
                        if (giftPanelLeafViewModel2 != null && (mutableLiveData = giftPanelLeafViewModel2.LLILZIL) != null) {
                            value = mutableLiveData.getValue();
                        } else {
                            value = null;
                        }
                        if (userLIZJ != null) {
                            lValueOf = Long.valueOf(userLIZJ.getId());
                            secUid = userLIZJ.getSecUid();
                        } else {
                            lValueOf = null;
                            secUid = null;
                        }
                        String strLIZLLL = C0KVU.LIZLLL(userLIZJ);
                        String strLIZLLL2 = C0KVU.LIZLLL(userLJIJJLI);
                        Room room2 = c1124680fNC.LJIIJJI;
                        if (room2 != null) {
                            lValueOf2 = Long.valueOf(room2.getId());
                        } else {
                            lValueOf2 = null;
                        }
                        Integer numValueOf = Integer.valueOf(C1125800fP0.LJ());
                        Gift gift = c1124680fNC.LJ;
                        if (gift != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 8) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1123340fL2LJ.getClass();
                        String strLIZ = C1123340fL2.LIZ(str, value, lValueOf, secUid, strLIZLLL, strLIZLLL2, lValueOf2, numValueOf, z);
                        AbstractC1100450ek7 abstractC1100450ek72 = c1124680fNC.LJIIJ;
                        if ((abstractC1100450ek72 instanceof C1128710fTh) && (c1128710fTh2 = (C1128710fTh) abstractC1100450ek72) != null && !c1128710fTh2.LLLLLLIL) {
                            return null;
                        }
                        if (LJ().getShowingUrl() == null || LJ().getLynxExtra() == null || !Intrinsics.LJFF(LJ().getShowingUrl(), strLIZ) || !Intrinsics.LJFF(LJ().getLynxExtra(), giftPanelBanner.bannerLynxExtra)) {
                            C1123340fL2 c1123340fL2LJ2 = LJ();
                            String str2 = giftPanelBanner.bannerLynxExtra;
                            AbstractC1100450ek7 abstractC1100450ek73 = c1124680fNC.LJIIJ;
                            if (abstractC1100450ek73 != null && (c1100420ek4 = abstractC1100450ek73.LLILZIL) != null) {
                                fragment = c1100420ek4.getFragment();
                            } else {
                                fragment = null;
                            }
                            c1123340fL2LJ2.LIZIZ(strLIZ, str2, fragment, new AwS596S0100000_17(c1124680fNC, 579), new C1124640fN8(c1124680fNC, giftPanelBanner, interfaceC1124700fNE));
                        }
                        LJ().setShouldBlockClick(new AwS561S0100000_17(c1124680fNC, 517));
                        return LJ();
                    }
                    GiftPanelBanner giftPanelBanner2 = c1124680fNC.LJII;
                    if (giftPanelBanner2 != null) {
                        C1124780fNM c1124780fNM = (C1124780fNM) this.LLILZIL.getValue();
                        C1124590fN3.LIZIZ(c1124780fNM, this.LL, giftPanelBanner2, c1124680fNC);
                        return c1124780fNM;
                    }
                    return null;
                }
                return null;
            }
        };
        final View view13 = (View) awS146S0400000_17.l0;
        interfaceC1127800fSEArr[25] = new InterfaceC1127800fSE(view13) { // from class: X.0fS9
            public final EnumC1127500fRk LL = EnumC1127500fRk.MATCH_ITEM_BACKPACK;
            public final C01GW LLILLJJLI;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view14, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C420550GeL) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view13, 523));
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                if (c1124680fNC.LIZ == 16) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                if (c1124680fNC.LJFF > 0) {
                    return null;
                }
                return (View) this.LLILLJJLI.getValue();
            }
        };
        final View view14 = (View) awS146S0400000_17.l0;
        interfaceC1127800fSEArr[26] = new InterfaceC1127800fSE(view14) { // from class: X.0fRx
            public final EnumC1127500fRk LL = EnumC1127500fRk.DEFAULT_LYNX;
            public final C01GW LLILLJJLI;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view15, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1123340fL2) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view14, 535));
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                return C500260Jjc.LJJIIZ(C1130100fVw.LIZ.LJIJI);
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                return C1124590fN3.LIZ((C1123340fL2) this.LLILLJJLI.getValue(), c1124680fNC, C1130100fVw.LIZ.LJIJI, interfaceC1124700fNE);
            }
        };
        final View view15 = (View) awS146S0400000_17.l0;
        interfaceC1127800fSEArr[27] = new InterfaceC1127800fSE(view15) { // from class: X.0fS8
            public final C01GW LLILLJJLI;
            public final EnumC1127500fRk LL = EnumC1127500fRk.DEFAULT_GENERIC;
            public final boolean LLILLL = true;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view16, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1124780fNM) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view15, 533));
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                return ((C1124780fNM) this.LLILLJJLI.getValue()).z0(c1124680fNC.LJFF);
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                return (View) this.LLILLJJLI.getValue();
            }
        };
        interfaceC1127800fSEArr[28] = new C1124670fNB((View) awS146S0400000_17.l0, (DataChannel) awS146S0400000_17.l1, ((C1127650fRz) awS146S0400000_17.l2).LLIZLLLIL);
        final View view16 = (View) awS146S0400000_17.l0;
        interfaceC1127800fSEArr[29] = new InterfaceC1127800fSE(view16) { // from class: X.0fSB
            public final C01GW LLILLJJLI;
            public final EnumC1127500fRk LL = EnumC1127500fRk.DEFAULT;
            public final boolean LLILLL = true;

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view17, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                return true;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C420570GeN) this.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LL;
            }

            {
                this.LLILLJJLI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view16, 532));
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                return (View) this.LLILLJJLI.getValue();
            }
        };
        final View view17 = (View) awS146S0400000_17.l0;
        final DataChannel dataChannel4 = (DataChannel) awS146S0400000_17.l1;
        interfaceC1127800fSEArr[30] = new InterfaceC1127800fSE(view17, dataChannel4) { // from class: X.0fRl
            public final DataChannel LL;
            public final C01GW LLILLL;
            public final EnumC1127500fRk LLILLJJLI = EnumC1127500fRk.BATCH_PACKAGE;
            public final boolean LLILZ = true;

            @Override // X.InterfaceC1127800fSE
            public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE3, View view18, C1124680fNC c1124680fNC) {
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LJFF(C1124680fNC c1124680fNC) {
                return true;
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1127800fSE
            public final C0T8B LJ() {
                return (C1143190fr3) this.LLILLL.getValue();
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJII() {
                DataChannel dataChannel5 = this.LL;
                if (dataChannel5 != null) {
                    dataChannel5.zW(BatchBannerVisibilityChannel.class, Boolean.FALSE);
                }
            }

            @Override // X.InterfaceC1127800fSE
            public final void LJIIIZ() {
                DataChannel dataChannel5 = this.LL;
                if (dataChannel5 != null) {
                    dataChannel5.zW(BatchBannerVisibilityChannel.class, Boolean.FALSE);
                }
            }

            @Override // X.InterfaceC1127800fSE
            public final boolean LIZ() {
                return this.LLILZ;
            }

            @Override // X.InterfaceC1127800fSE
            public final EnumC1127500fRk getBannerType() {
                return this.LLILLJJLI;
            }

            {
                this.LL = dataChannel4;
                this.LLILLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(view17, 514));
            }

            @Override // X.InterfaceC1127800fSE
            public final View LJI(C1124680fNC c1124680fNC, InterfaceC1124700fNE interfaceC1124700fNE, InterfaceC1123410fL9 interfaceC1123410fL9) {
                String str;
                C1127960fSU c1127960fSU;
                List<Long> list;
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
                Object obj = null;
                if (abstractC1126600fQI != null) {
                    obj = abstractC1126600fQI.LIZIZ;
                }
                if (obj instanceof Gift) {
                    Gift gift = (Gift) abstractC1126600fQI.LIZIZ;
                    ImageModel imageModelLJII = abstractC1126600fQI.LJFF;
                    if (imageModelLJII == null) {
                        imageModelLJII = abstractC1126600fQI.LJII();
                    }
                    if (imageModelLJII != null) {
                        C1143190fr3 c1143190fr3 = (C1143190fr3) this.LLILLL.getValue();
                        Long lValueOf = Long.valueOf(abstractC1126600fQI.LJFF());
                        int i = gift.diamondCount;
                        String str2 = gift.name;
                        Gift.BatchGiftInfo batchGiftInfo = gift.batchGiftInfo;
                        if (batchGiftInfo == null || (list = batchGiftInfo.availableCounts) == null) {
                            list = C13BV.INSTANCE;
                        }
                        c1143190fr3.LIZ(lValueOf, imageModelLJII, i, str2, list);
                    }
                    if (!(interfaceC1123410fL9 instanceof C1127960fSU) || (c1127960fSU = (C1127960fSU) interfaceC1123410fL9) == null || (str = c1127960fSU.LIZ) == null) {
                        str = "";
                    }
                    if (!Intrinsics.LJFF(c1124680fNC.LIZLLL, this.LLILLL.getValue())) {
                        DataChannel dataChannel5 = this.LL;
                        if (dataChannel5 != null) {
                            dataChannel5.zW(BatchBannerVisibilityChannel.class, Boolean.TRUE);
                        }
                        ((C1143190fr3) this.LLILLL.getValue()).setTriggerReason(str);
                        C1128760fTm.LJIIJ.LJJII(abstractC1126600fQI.LJFF(), str);
                    }
                }
                return (View) this.LLILLL.getValue();
            }
        };
        final List listLJIJI = C13LQ.LJIJI(interfaceC1127800fSEArr);
        return new InterfaceC1127910fSP(listLJIJI) { // from class: X.0fSD
            public final List<InterfaceC1127800fSE> LIZ;
            public final List<InterfaceC1127800fSE> LIZIZ = new ArrayList();
            public final List<InterfaceC1127800fSE> LIZJ = new ArrayList();

            @Override // X.InterfaceC1127910fSP
            public final List<InterfaceC1127800fSE> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1127910fSP
            public final List<InterfaceC1127800fSE> LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1127910fSP
            public final List<InterfaceC1127800fSE> LIZJ() {
                return this.LIZJ;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = listLJIJI;
                for (InterfaceC1127800fSE interfaceC1127800fSE3 : (ArrayList) listLJIJI) {
                    if (interfaceC1127800fSE3.LIZJ()) {
                        ((ArrayList) this.LIZIZ).add(interfaceC1127800fSE3);
                    }
                    if (!interfaceC1127800fSE3.LIZ()) {
                        ((ArrayList) this.LIZJ).add(interfaceC1127800fSE3);
                    }
                }
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS146S0400000_17 awS146S0400000_17) {
        Fragment fragment;
        C1100420ek4 c1100420ek4 = ((AbstractC1100450ek7) awS146S0400000_17.l0).LLILZIL;
        if (c1100420ek4 != null) {
            fragment = c1100420ek4.getFragment();
        } else {
            fragment = null;
        }
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) ((AbstractC1100450ek7) awS146S0400000_17.l0)).jl()).get((String) ((Function0) awS146S0400000_17.l1).invoke(), C09R7.LIZ((C13IQ) awS146S0400000_17.l2));
        Function1 function1 = (Function1) awS146S0400000_17.l3;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(LiveCPCViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(function1);
        return jediViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$5(AwS146S0400000_17 awS146S0400000_17) {
        Fragment fragment = (Fragment) awS146S0400000_17.l0;
        ViewModel viewModel = ViewModelProviders.of(fragment, ((InterfaceC1075600e62) fragment).jl()).get((String) ((Function0) awS146S0400000_17.l1).invoke(), C09R7.LIZ((C13IQ) awS146S0400000_17.l2));
        Function2 function2 = (Function2) awS146S0400000_17.l3;
        Fragment fragment2 = (Fragment) awS146S0400000_17.l0;
        JediViewModel jediViewModel = (JediViewModel) viewModel;
        InterfaceC1766500w4O interfaceC1766500w4OCreate = jediViewModel.LLILZ.create(LiveCPCViewModel.class);
        if (interfaceC1766500w4OCreate != null) {
            interfaceC1766500w4OCreate.LIZ();
        }
        jediViewModel.JQ2(new AwS383S0200000_17(function2, fragment2, 116));
        return jediViewModel;
    }

    public static final Object invoke$6(AwS146S0400000_17 awS146S0400000_17) {
        InterfaceC1135620feq interfaceC1135620feq = ((C1135590fen) awS146S0400000_17.l0).LIZLLL;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZIZ((InterfaceC1136020ffU) awS146S0400000_17.l1, (C1135280feI) awS146S0400000_17.l2, (ConcurrentHashMap) awS146S0400000_17.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS146S0400000_17 awS146S0400000_17) {
        InterfaceC1135620feq interfaceC1135620feq = ((C1135590fen) awS146S0400000_17.l0).LIZLLL;
        if (interfaceC1135620feq != null) {
            interfaceC1135620feq.LIZJ((InterfaceC1136020ffU) awS146S0400000_17.l1, (C1136560fgM) awS146S0400000_17.l2, (Map) awS146S0400000_17.l3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS146S0400000_17 awS146S0400000_17) {
        Uri uri = ((C2436109gd) awS146S0400000_17.l0).LIZ;
        if (uri != null) {
            C20409114tV c20409114tV = (C20409114tV) awS146S0400000_17.l1;
            Context context = (Context) awS146S0400000_17.l2;
            Map<String, String> map = (Map) awS146S0400000_17.l3;
            Uri uriBuild = uri.buildUpon().appendQueryParameter("title", C1946707jt.LIZ(uri, "live_title")).build();
            C1117220fBA c1117220fBA = c20409114tV.LIZIZ;
            C2436109gd c2436109gd = new C2436109gd();
            c2436109gd.LIZ = c20409114tV.LJIIJ(uriBuild);
            c1117220fBA.LIZJ(context, c2436109gd, map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS146S0400000_17 awS146S0400000_17) {
        ArrayList arrayList;
        Long lValueOf;
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo;
        List<PublicAreaMessageCommon.CreatorSuccessInfo.Topic> list;
        String str;
        C1113490f59 c1113490f59 = (C1113490f59) awS146S0400000_17.l0;
        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) awS146S0400000_17.l1;
        c1113490f59.getClass();
        DataChannel dataChannel = abstractC1110800f0o.LLIIIILZ().LJIIIZ;
        AbstractC1110800f0o abstractC1110800f0o2 = (AbstractC1110800f0o) awS146S0400000_17.l1;
        List list2 = (List) awS146S0400000_17.l2;
        List list3 = (List) awS146S0400000_17.l3;
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110800f0o2.LLIIII();
        String strLJJLIIIJ = null;
        if (publicAreaMessageCommonLLIIII != null && (creatorSuccessInfo = publicAreaMessageCommonLLIIII.creatorSuccessInfo) != null && (list = creatorSuccessInfo.topicList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic : list) {
                int i = topic.displayLocation;
                if (i == 2 || i == 0) {
                    arrayList2.add(topic);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Text text = ((PublicAreaMessageCommon.CreatorSuccessInfo.Topic) it2.next()).topicText;
                if (text == null || (str = text.key) == null) {
                    str = "";
                }
                arrayList.add(str);
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null && arrayList.size() == list2.size() && list2.size() == list3.size()) {
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"is_show\":\"");
                sbLIZ.append(((Number) ListProtector.get(list2, i2)).intValue());
                sbLIZ.append("\", \"drop_reason\":\"");
                sbLIZ.append((String) ListProtector.get(list3, i2));
                sbLIZ.append("\", \"tag_id\":\"");
                sbLIZ.append((String) ListProtector.get(arrayList, i2));
                sbLIZ.append("\"}");
                arrayList3.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_companion_tool_message_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        User user = abstractC1110800f0o2.getUser();
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "tag_user_id");
        c474500IjALIZ.LJJII(LiveAnchorClusterSetting.INSTANCE.getValue(), "anchor_cluster_level");
        c474500IjALIZ.LJJII(abstractC1110800f0o2.LLII(), "log_id");
        if (arrayList != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, e3.e, e3.f, 0, null, AnonymousClass0207.get$arr$(173), 25);
        }
        c474500IjALIZ.LJJII(strLJJLIIIJ, "tag_id");
        c474500IjALIZ.LJJII(C1113520f5C.LIZ(abstractC1110800f0o2), "msg_type");
        c474500IjALIZ.LJJII(list2.toString(), "is_show");
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(list3, null, e3.e, e3.f, 0, null, AnonymousClass0207.get$arr$(174), 25), "drop_reason");
        c474500IjALIZ.LJJII(arrayList3.toString(), "id_params");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS146S0400000_17(C2436109gd c2436109gd, C2436109gd c2436109gd2, C20409114tV c20409114tV, Context context, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = c2436109gd;
        this.l1 = c2436109gd2;
        this.l2 = c20409114tV;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0400000_17(AbstractC1100450ek7 abstractC1100450ek7, Function0 function0, C13IQ c13iq, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1100450ek7;
        this.l1 = function0;
        this.l2 = c13iq;
        this.l3 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS146S0400000_17(C1113490f59 c1113490f59, C1113490f59 c1113490f592, AbstractC1110800f0o<?> abstractC1110800f0o, List<Integer> list, List<String> list2) {
        super(0);
        this.$t = list2;
        this.l0 = c1113490f59;
        this.l1 = c1113490f592;
        this.l2 = abstractC1110800f0o;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS146S0400000_17(C1113510f5B c1113510f5B, C1113510f5B c1113510f5B2, AbstractC1110790f0n abstractC1110790f0n, List<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem> list, Map<PublicAreaMessageCommon.CreatorSuccessInfo.TagItem, String> map) {
        super(0);
        this.$t = map;
        this.l0 = c1113510f5B;
        this.l1 = c1113510f5B2;
        this.l2 = abstractC1110790f0n;
        this.l3 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0400000_17(C1113510f5B c1113510f5B, AbstractC1110800f0o abstractC1110800f0o, List list, List list2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1113510f5B;
        this.l1 = abstractC1110800f0o;
        this.l2 = list;
        this.l3 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS146S0400000_17(C1135590fen c1135590fen, C1135590fen c1135590fen2, InterfaceC1136020ffU interfaceC1136020ffU, C1135280feI c1135280feI, ConcurrentHashMap<String, String> concurrentHashMap) {
        super(0);
        this.$t = concurrentHashMap;
        this.l0 = c1135590fen;
        this.l1 = c1135590fen2;
        this.l2 = interfaceC1136020ffU;
        this.l3 = c1135280feI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS146S0400000_17(C1135590fen c1135590fen, C1135590fen c1135590fen2, InterfaceC1136020ffU interfaceC1136020ffU, C1136560fgM c1136560fgM, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l0 = c1135590fen;
        this.l1 = c1135590fen2;
        this.l2 = interfaceC1136020ffU;
        this.l3 = c1136560fgM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS146S0400000_17(C1145600fuw c1145600fuw, C1145600fuw c1145600fuw2, MatchBottomNoticeCard matchBottomNoticeCard, InterfaceC1145720fv8 interfaceC1145720fv8, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c1145600fuw;
        this.l1 = c1145600fuw2;
        this.l2 = matchBottomNoticeCard;
        this.l3 = interfaceC1145720fv8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0400000_17(C1149760g1e c1149760g1e, Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1149760g1e;
        this.l1 = context;
        this.l2 = c1144350fsv;
        this.l3 = interfaceC1149850g1n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0400000_17(View view, DataChannel dataChannel, C1127650fRz c1127650fRz, LifecycleOwner lifecycleOwner, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = dataChannel;
        this.l2 = c1127650fRz;
        this.l3 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS146S0400000_17(Fragment fragment, Function0 function0, C13IQ c13iq, Function2 function2, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = function0;
        this.l2 = c13iq;
        this.l3 = function2;
    }
}

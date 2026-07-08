package kotlin.jvm.internal;

import X.AbstractC1604130rqV;
import X.AbstractC20356314kz;
import X.AbstractC316870CbV;
import X.AnonymousClass1604;
import X.C013C;
import X.C01GW;
import X.C09AY;
import X.C0Q69;
import X.C0SK1;
import X.C0SZC;
import X.C0UFE;
import X.C11BY;
import X.C1294720jnS;
import X.C1295960jpS;
import X.C1391840mK6;
import X.C1397660mTU;
import X.C13LP;
import X.C1485670olR;
import X.C15AO;
import X.C15AU;
import X.C15SN;
import X.C15T8;
import X.C15TH;
import X.C15TI;
import X.C160B;
import X.C1835340xrQ;
import X.C1AZW;
import X.C20359414lU;
import X.C20361214lm;
import X.C20441214yg;
import X.C20526015Tm;
import X.C20600815jK;
import X.C207056160o;
import X.C207128163i;
import X.C20739016Dk;
import X.C2188811AlT;
import X.C295340Bhs;
import X.C317290CcB;
import X.C323380Cm0;
import X.C500260Jjc;
import X.C5183020f;
import X.C627260Oiy;
import X.C710840RuU;
import X.C915190ZvJ;
import X.C930940aKi;
import X.C978360bZC;
import X.C979410bat;
import X.EnumC1779330wP5;
import X.EnumC323450Cm7;
import X.EnumC941710ac5;
import X.InterfaceC1361890lXn;
import X.InterfaceC1508380pM4;
import X.InterfaceC20354714kj;
import X.InterfaceC20507515Mj;
import X.InterfaceC636270OxV;
import X.InterfaceC636340Oxc;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.effect.playentity.BackgroundEffectEntity;
import com.bytedance.android.live.effect.playentity.StickerEffectEntity;
import com.bytedance.android.live.effect.playentity.VoiceEffectsEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LiveGoalEntity;
import com.bytedance.android.livesdk.impl.revenue.playentity.GoodyBagEntity;
import com.bytedance.android.livesdk.impl.revenue.playentity.TreasureBoxEntity;
import com.bytedance.android.livesdk.interaction.playentity.DrawGuessEntity;
import com.bytedance.android.livesdk.interaction.playentity.PollAndGiftVoteEntity;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public class AwS126S0400000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        if (obj == C0UFE.OFF) {
            PlayEntityUtilKt.LJII((BackgroundEffectEntity) awS126S0400000_31.l0, 1, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, true);
        } else {
            ((C013C) awS126S0400000_31.l3).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && room.cppVersion == 1 && obj != C0UFE.ON) {
            PlayEntityUtilKt.LJII((StickerEffectEntity) awS126S0400000_31.l0, 1, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, true);
        } else {
            ((C013C) awS126S0400000_31.l3).element = true;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$10(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        InterfaceC636340Oxc interfaceC636340Oxc = (InterfaceC636340Oxc) obj;
        AssemListViewModel assemListViewModel = (AssemListViewModel) awS126S0400000_31.l0;
        C20600815jK<ITEM> c20600815jK = assemListViewModel.state;
        if (c20600815jK != 0) {
            c20600815jK.LIZLLL((Collection<? extends T>) ((Collection) awS126S0400000_31.l3), null);
            assemListViewModel.modifyListState(interfaceC636340Oxc, c20600815jK);
        }
        InterfaceC1361890lXn<T> operator = ((AssemListViewModel) awS126S0400000_31.l0).getConfig().getOperator();
        EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Refresh;
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        Object obj2 = awS126S0400000_31.l1;
        Object obj3 = awS126S0400000_31.l2;
        List listLLIIII = C13LP.LLIIII((Collection) awS126S0400000_31.l3);
        c317290CcB.getClass();
        operator.LIZJ(enumC323450Cm7, new C323380Cm0(obj2, obj3, listLLIIII), false);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$11(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        ((AssemSingleListViewModel) awS126S0400000_31.l0).modifyListState((InterfaceC636270OxV) obj, new C5183020f((Collection) awS126S0400000_31.l3, (Collection<Object>) 129));
        Object first = awS126S0400000_31.l1;
        if (first == null) {
            first = ((AssemSingleListViewModel) awS126S0400000_31.l0).lastPageResult.getFirst();
        }
        Object second = awS126S0400000_31.l2;
        if (second == null) {
            second = ((AssemSingleListViewModel) awS126S0400000_31.l0).lastPageResult.getSecond();
        }
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) awS126S0400000_31.l0;
        assemSingleListViewModel.lastPageResult = assemSingleListViewModel.lastPageResult.copy((Object) first, (Object) second);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        C0Q69 c0q69;
        String str;
        C207056160o c207056160o;
        C0SK1 c0sk1LIZIZ;
        if (C295340Bhs.LIZ() && (c0q69 = (C0Q69) awS126S0400000_31.l0) != null && ((C160B) awS126S0400000_31.l1) == C160B.EXPANDED && ((C710840RuU) awS126S0400000_31.l2).LIZ.length() != 0 && (str = c0q69.LIZ) != null && str.length() != 0) {
            CLACaptionViewModelV2 cLACaptionViewModelV2Bp = ((CLACaptionAssemV2) awS126S0400000_31.l3).Bp();
            cLACaptionViewModelV2Bp.getClass();
            if (Intrinsics.LJFF(str, AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp)) && (c207056160o = ((CLACaptionAssemV2) awS126S0400000_31.l3).LLLII) != null && (c0sk1LIZIZ = c207056160o.LIZIZ()) != null) {
                CLACaptionViewModelV2 cLACaptionViewModelV2Bp2 = ((CLACaptionAssemV2) awS126S0400000_31.l3).Bp();
                cLACaptionViewModelV2Bp2.getClass();
                String strLIZ = AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp2);
                if (strLIZ != null) {
                    C710840RuU c710840RuU = (C710840RuU) awS126S0400000_31.l2;
                    CLACaptionAssemV2 cLACaptionAssemV2 = (CLACaptionAssemV2) awS126S0400000_31.l3;
                    C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CLACaptionAssemV2, awemeId: ");
                    sbLIZ.append(strLIZ);
                    sbLIZ.append(", updateCaptionUI, captionDisplayUIData: ");
                    sbLIZ.append(c710840RuU);
                    sbLIZ.append(", shouldBlockUIUpdate: ");
                    sbLIZ.append(cLACaptionAssemV2.LLLFZ.LJIIIIZZ);
                    sbLIZ.append(", result: ");
                    sbLIZ.append(c0sk1LIZIZ);
                    C0SZC.LIZJ(strLIZ, "real_display", C2188811AlT.LIZIZ(sbLIZ));
                }
                C1485670olR.LIZ().LJIIZILJ(c0q69, c0sk1LIZIZ.name());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        int size;
        C15SN c15sn = (C15SN) obj;
        c15sn.getClass();
        List listLIZ = C627260Oiy.LIZ(c15sn);
        if (listLIZ != null) {
            size = listLIZ.size() - 1;
        } else {
            size = 0;
        }
        List<C20526015Tm> listIQ2 = ((ExploreTopicGeneralFeedListViewModel) awS126S0400000_31.l0).IQ2((ExploreTopicAwemeListResponse) awS126S0400000_31.l1, (C15TH) awS126S0400000_31.l2, (ExploreFeedRequestOverride) awS126S0400000_31.l3);
        if (!listIQ2.isEmpty()) {
            ((ExploreTopicGeneralFeedListViewModel) awS126S0400000_31.l0).listAddAllAt(size + 1, listIQ2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("channelName: ");
            sbLIZ.append(((C15AO) awS126S0400000_31.l0).LIZ);
            sbLIZ.append(", fileName: ");
            sbLIZ.append(((C15AO) awS126S0400000_31.l0).LIZIZ);
            sbLIZ.append(", gecko file is null");
            C20441214yg.LJ("GeniusViewUtils", C2188811AlT.LIZIZ(sbLIZ));
            Function2<Boolean, String, Unit> actionSuccess = ((C15AU) awS126S0400000_31.l1).getActionSuccess();
            if (actionSuccess != null) {
                actionSuccess.invoke(Boolean.FALSE, "LottieComposition is null");
            }
            ((C15AU) awS126S0400000_31.l1).setActionSuccess(null);
        } else {
            C500260Jjc.LJLJLJ((C1295960jpS) awS126S0400000_31.l2, true);
            C01GW c01gw = C1835340xrQ.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("update delay:");
            sbLIZ2.append(((C15AO) awS126S0400000_31.l0).LJFF);
            C1835340xrQ.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            ((C15AU) awS126S0400000_31.l1).LIZ((Function2) awS126S0400000_31.l3, (C1295960jpS) awS126S0400000_31.l2, (C15AO) awS126S0400000_31.l0, c1294720jnS);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        ((C013C) awS126S0400000_31.l0).element = true;
        new C11BY().LJIILL((Mission) awS126S0400000_31.l1, Intrinsics.LJFF(((LiveData) ((C1391840mK6) awS126S0400000_31.l2).LIZLLL.getValue()).getValue(), Boolean.TRUE), EnumC1779330wP5.CANCEL);
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        ((InterfaceC20507515Mj) awS126S0400000_31.l3).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        if (!((ExploreFeedListViewModel) awS126S0400000_31.l0).JQ2((ExploreAwemeList) awS126S0400000_31.l1, C15TI.UG_CARD.getValue(), new AwS610S0100000_31((ExploreLynxParams) awS126S0400000_31.l3, 365), ((Boolean) obj).booleanValue())) {
            ((Function1) awS126S0400000_31.l2).invoke(Boolean.FALSE);
        } else {
            ExploreFeedListViewModel exploreFeedListViewModel = (ExploreFeedListViewModel) awS126S0400000_31.l0;
            C15T8.LL.getClass();
            exploreFeedListViewModel.LLJILJIL = C15T8.LLILZLL;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((BasePlaybookEditorViewModel) awS126S0400000_31.l0).FQ2((C20359414lU) awS126S0400000_31.l1);
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LJIJ("edit_playbook", "delete_step_confirm", (Long) ((Function0) awS126S0400000_31.l2).invoke(), (String) ((Function0) awS126S0400000_31.l3).invoke(), false, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        C20739016Dk c20739016Dk = (C20739016Dk) obj;
        boolean zIsPlaying = ((InterfaceC1508380pM4) awS126S0400000_31.l0).LJ().isPlaying();
        boolean zIsLoading = ((InterfaceC1508380pM4) awS126S0400000_31.l0).LJ().isLoading();
        boolean zIsMute = ((InterfaceC1508380pM4) awS126S0400000_31.l0).isMute();
        Boolean bool = (Boolean) awS126S0400000_31.l1;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = c20739016Dk.LLILZLL;
        }
        Boolean bool2 = (Boolean) awS126S0400000_31.l2;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = c20739016Dk.LLILZ;
        }
        Boolean bool3 = (Boolean) awS126S0400000_31.l3;
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = c20739016Dk.LLILLJJLI;
        }
        return C20739016Dk.LIZ(c20739016Dk, false, zBooleanValue3, zIsPlaying, zBooleanValue2, zIsLoading, zBooleanValue, zIsMute, null, false, false, 897);
    }

    public static final Object invoke$2(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        if (obj != C0UFE.ON) {
            PlayEntityUtilKt.LJII((VoiceEffectsEntity) awS126S0400000_31.l0, 1, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, true);
        } else {
            ((C013C) awS126S0400000_31.l3).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        if (obj == C0UFE.OFF) {
            PlayEntityUtilKt.LJII((LiveGoalEntity) awS126S0400000_31.l0, 1, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, true);
        } else {
            ((C013C) awS126S0400000_31.l3).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        if (obj == C0UFE.OFF) {
            PlayEntityUtilKt.LJII((GoodyBagEntity) awS126S0400000_31.l0, 1, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, true);
        } else {
            ((C013C) awS126S0400000_31.l3).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        if (obj == C0UFE.OFF) {
            PlayEntityUtilKt.LJII((TreasureBoxEntity) awS126S0400000_31.l0, 1, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, true);
        } else {
            ((C013C) awS126S0400000_31.l3).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        DrawGuessEntity drawGuessEntity = (DrawGuessEntity) awS126S0400000_31.l0;
        C20361214lm c20361214lm = (C20361214lm) awS126S0400000_31.l1;
        InterfaceC20354714kj interfaceC20354714kj = (InterfaceC20354714kj) awS126S0400000_31.l2;
        C013C c013c = (C013C) awS126S0400000_31.l3;
        if (obj != C0UFE.ON) {
            PlayEntityUtilKt.LJII(drawGuessEntity, 1, c20361214lm, interfaceC20354714kj, true);
        } else {
            c013c.element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        if (obj != C0UFE.ON) {
            PlayEntityUtilKt.LJII((PollAndGiftVoteEntity) awS126S0400000_31.l0, 1, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, true);
        } else {
            ((C013C) awS126S0400000_31.l3).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        C1AZW.LJFF(C979410bat.LIZ(148, ((AbstractC20356314kz) awS126S0400000_31.l0).LJJJIL().LIZ), "onTaskStart error, canStart false", null, null);
        PlayEntityUtilKt.LJI((AbstractC20356314kz) awS126S0400000_31.l0, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, null, null, 0L, 56);
        ((Function1) awS126S0400000_31.l3).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS126S0400000_31 awS126S0400000_31, Object obj) {
        C1AZW.LJFF(C979410bat.LIZ(148, ((AbstractC20356314kz) awS126S0400000_31.l0).LJJJIL().LIZ), "onTaskStart error, canStart false", null, null);
        PlayEntityUtilKt.LJI((AbstractC20356314kz) awS126S0400000_31.l0, (C20361214lm) awS126S0400000_31.l1, (InterfaceC20354714kj) awS126S0400000_31.l2, null, null, 0L, 56);
        ((Function1) awS126S0400000_31.l3).invoke(obj);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(C013C c013c, Mission mission, C1391840mK6 c1391840mK6, InterfaceC20507515Mj interfaceC20507515Mj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = mission;
        this.l2 = c1391840mK6;
        this.l3 = interfaceC20507515Mj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(C0Q69 c0q69, C160B c160b, C710840RuU c710840RuU, CLACaptionAssemV2 cLACaptionAssemV2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0q69;
        this.l1 = c160b;
        this.l2 = c710840RuU;
        this.l3 = cLACaptionAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(C1295960jpS c1295960jpS, C15AU c15au, C15AO c15ao, Function2 function2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c15ao;
        this.l1 = c15au;
        this.l2 = c1295960jpS;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(InterfaceC1508380pM4 interfaceC1508380pM4, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1508380pM4;
        this.l1 = bool;
        this.l2 = bool2;
        this.l3 = bool3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS126S0400000_31(AbstractC20356314kz abstractC20356314kz, AbstractC20356314kz abstractC20356314kz2, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, Function1<? super EnumC941710ac5, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = abstractC20356314kz;
        this.l1 = abstractC20356314kz2;
        this.l2 = c20361214lm;
        this.l3 = interfaceC20354714kj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(BackgroundEffectEntity backgroundEffectEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = backgroundEffectEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(StickerEffectEntity stickerEffectEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = stickerEffectEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(VoiceEffectsEntity voiceEffectsEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = voiceEffectsEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS126S0400000_31(BasePlaybookEditorViewModel basePlaybookEditorViewModel, BasePlaybookEditorViewModel basePlaybookEditorViewModel2, C20359414lU c20359414lU, Function0<Long> function0, Function0<String> function02) {
        super(1);
        this.$t = function02;
        this.l0 = basePlaybookEditorViewModel;
        this.l1 = basePlaybookEditorViewModel2;
        this.l2 = c20359414lU;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(LiveGoalEntity liveGoalEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveGoalEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(GoodyBagEntity goodyBagEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = goodyBagEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(TreasureBoxEntity treasureBoxEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = treasureBoxEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(DrawGuessEntity drawGuessEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = drawGuessEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(PollAndGiftVoteEntity pollAndGiftVoteEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = pollAndGiftVoteEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS126S0400000_31(AssemListViewModel assemListViewModel, AssemListViewModel<S, ITEM, Cursor> assemListViewModel2, Cursor cursor, Cursor cursor2, Collection<? extends ITEM> collection) {
        super(1);
        this.$t = collection;
        this.l0 = assemListViewModel;
        this.l1 = assemListViewModel2;
        this.l2 = cursor;
        this.l3 = cursor2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS126S0400000_31(AssemSingleListViewModel assemSingleListViewModel, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2, Cursor cursor, Cursor cursor2, Collection<? extends ITEM> collection) {
        super(1);
        this.$t = collection;
        this.l0 = assemSingleListViewModel;
        this.l1 = assemSingleListViewModel2;
        this.l2 = cursor;
        this.l3 = cursor2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(ExploreFeedListViewModel exploreFeedListViewModel, ExploreAwemeList exploreAwemeList, AwS397S0200000_31 awS397S0200000_31, ExploreLynxParams exploreLynxParams, int i) {
        super(1);
        this.$t = i;
        this.l0 = exploreFeedListViewModel;
        this.l1 = exploreAwemeList;
        this.l2 = awS397S0200000_31;
        this.l3 = exploreLynxParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0400000_31(ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, ExploreTopicAwemeListResponse exploreTopicAwemeListResponse, C15TH c15th, ExploreFeedRequestOverride exploreFeedRequestOverride, int i) {
        super(1);
        this.$t = i;
        this.l0 = exploreTopicGeneralFeedListViewModel;
        this.l1 = exploreTopicAwemeListResponse;
        this.l2 = c15th;
        this.l3 = exploreFeedRequestOverride;
    }
}

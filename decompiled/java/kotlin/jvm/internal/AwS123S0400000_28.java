package kotlin.jvm.internal;

import X.C09AY;
import X.C0SY7;
import X.C100C;
import X.C10LM;
import X.C10LZ;
import X.C118300cf;
import X.C1397620mTQ;
import X.C1902390zbZ;
import X.C1914980zvs;
import X.C1915020zvw;
import X.C1916300zy0;
import X.C1917510zzx;
import X.C19218810Gs;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1876780ywG;
import X.InterfaceC1631630sYr;
import X.InterfaceC1915180zwC;
import X.InterfaceC1915190zwD;
import Y.ARunnableS24S0101000_13;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateCelebrationSettingFragment;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.consent.collector.PNSConsentCollectorServiceImpl;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tiktok.ban.UserBanAppealStatusResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS123S0400000_28 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS123S0400000_28 awS123S0400000_28, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131833817, new AwS237S0300000_28((C1916300zy0) awS123S0400000_28.l0, (C1916300zy0) awS123S0400000_28.l1, (InterfaceC1631630sYr<? super String, ? super EnumC1876780ywG, ? super String, ? super String, Unit>) awS123S0400000_28.l2, (CollectConsentParam) 0));
        c1397620mTQ.LJII(2131833818, new AwS394S0200000_28((C1916300zy0) awS123S0400000_28.l0, (Context) awS123S0400000_28.l3, 1));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS123S0400000_28 awS123S0400000_28, Object obj) {
        int i;
        int itemCount = 0;
        if (obj != C0SY7.FOLLOWED && obj != C0SY7.FOLLOW_REQUESTED && obj != C0SY7.FOLLOW_MUTUAL) {
            if (obj == C0SY7.UNFOLLOW) {
                C786410Ut5.t0((RelationButton) awS123S0400000_28.l1, 4);
                C786410Ut5.t0((RelationButton) awS123S0400000_28.l0, 0);
            }
        } else {
            C786410Ut5.t0((RelationButton) awS123S0400000_28.l0, 4);
            C786410Ut5.t0((RelationButton) awS123S0400000_28.l1, 0);
            User user = (User) awS123S0400000_28.l2;
            RecSwipeGalleryLayoutManager layoutManagerV2 = ((C10LZ) awS123S0400000_28.l3).getLayoutManagerV2();
            if (layoutManagerV2 != null) {
                i = layoutManagerV2.LLILZIL;
            } else {
                i = 0;
            }
            C19218810Gs.LIZIZ(i, user, "follow");
            C10LZ c10lz = (C10LZ) awS123S0400000_28.l3;
            RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = c10lz.LLJ;
            if (recSwipeGalleryLayoutManager != null) {
                int i2 = recSwipeGalleryLayoutManager.LLILZIL + 1;
                C10LM c10lm = c10lz.LLIZLLLIL;
                if (c10lm != null) {
                    itemCount = c10lm.getItemCount();
                }
                if (i2 < itemCount) {
                    C786410Ut5.LJLIIL(400L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS24S0101000_13(i2, c10lz, 13));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS123S0400000_28 awS123S0400000_28, Object obj) {
        ((PNSConsentCollectorServiceImpl) awS123S0400000_28.l0).LJI((Context) awS123S0400000_28.l1, (CollectConsentParam) awS123S0400000_28.l2, (InterfaceC1915180zwC) obj, (InterfaceC1915190zwD) awS123S0400000_28.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS123S0400000_28 awS123S0400000_28, Object obj) {
        int i = ((C118300cf) awS123S0400000_28.l0).element;
        int i2 = ((C118300cf) awS123S0400000_28.l1).element;
        int i3 = ((C118300cf) awS123S0400000_28.l2).element;
        int i4 = ((C118300cf) awS123S0400000_28.l3).element;
        obj.getClass();
        return new C1902390zbZ(i, i2, i3, i4);
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS123S0400000_28 awS123S0400000_28, Object obj) {
        UserBanAppealStatusResponse userBanAppealStatusResponse = (UserBanAppealStatusResponse) obj;
        C100C c100c = C100C.LIZ;
        c100c.LIZJ().LIZ("pns_ban_internal_behaviour", C2097608Jq.LJIIIIZZ(new Pair("ban_type", ((C1917510zzx) awS123S0400000_28.l0).LIZIZ()), new Pair("phase", "after_get_appeal_status")));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("appeal Status get. currentThread ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
        C1917510zzx c1917510zzx = (C1917510zzx) awS123S0400000_28.l0;
        Map map = (Map) awS123S0400000_28.l1;
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS123S0400000_28.l2;
        Function1 function1 = (Function1) awS123S0400000_28.l3;
        c1917510zzx.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (userBanAppealStatusResponse == null) {
            c1917510zzx.LIZJ();
            function1.invoke("appeal status api return empty model");
        } else {
            Object obj2 = map.get("user_id_str");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            Object obj3 = "";
            if (obj2 == null) {
                obj2 = "";
            }
            linkedHashMap.put("user_id", obj2);
            if (userBanAppealStatusResponse.getAppealType() == 12) {
                linkedHashMap.put("ban_appeal_type", "1");
            } else {
                linkedHashMap.put("ban_appeal_type", String.valueOf(userBanAppealStatusResponse.getAppealType()));
            }
            linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(userBanAppealStatusResponse.getStatus()));
            linkedHashMap2.put("punish_id", userBanAppealStatusResponse.getPunishId());
            linkedHashMap2.put("btn_logout", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap2.put("appeal_type", String.valueOf(userBanAppealStatusResponse.getAppealType()));
            linkedHashMap2.put("mode", "6");
            Object obj4 = map.get("enter_from_ban_url");
            if (!(obj4 instanceof String) || obj4 == null) {
                obj4 = "";
            }
            linkedHashMap2.put("enter_from_ban_url", obj4);
            linkedHashMap2.put("error_code", String.valueOf(map.get("error_code")));
            Object obj5 = map.get("user_id_str");
            if ((obj5 instanceof String) && obj5 != null) {
                obj3 = obj5;
            }
            linkedHashMap2.put("user_id", obj3);
            c100c.LIZJ().LIZ("pns_ban_internal_behaviour", C2097608Jq.LJIIIIZZ(new Pair("ban_type", c1917510zzx.LIZIZ()), new Pair("phase", "before_call_show_popup")));
            interfaceC1631630sYr.invoke(userBanAppealStatusResponse, map, linkedHashMap, linkedHashMap2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS123S0400000_28 awS123S0400000_28, Object obj) {
        ((C1397620mTQ) awS123S0400000_28.l0).LIZJ(0, ((PNSAgeConfirmOption) awS123S0400000_28.l1).optionContent, new AwS394S0200000_28((Map) awS123S0400000_28.l2, (Map<String, String>) awS123S0400000_28.l3, (AgeGateCelebrationSettingFragment) 106));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS123S0400000_28 awS123S0400000_28, Object obj) {
        ((C1397620mTQ) awS123S0400000_28.l0).LIZJ(0, ((PNSAgeConfirmOption) awS123S0400000_28.l1).optionContent, new AwS394S0200000_28((Map) awS123S0400000_28.l2, (Map<String, String>) awS123S0400000_28.l3, (AgeGateFragment) 108));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS123S0400000_28 awS123S0400000_28, Object obj) {
        if (((Number) obj).intValue() == 2) {
            ((C1915020zvw) awS123S0400000_28.l0).getClass();
            C1915020zvw.LJIIL("close");
        }
        Function0 function0 = (Function0) awS123S0400000_28.l1;
        if (function0 != null) {
            function0.invoke();
        }
        InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS123S0400000_28.l2;
        if (interfaceC1631630sYr != null) {
            CollectConsentParam collectConsentParam = (CollectConsentParam) awS123S0400000_28.l3;
            interfaceC1631630sYr.invoke(collectConsentParam.consentKey, EnumC1876780ywG.APPROVE, collectConsentParam.flow, collectConsentParam.scenario);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0400000_28(C118300cf c118300cf, C118300cf c118300cf2, C118300cf c118300cf3, C118300cf c118300cf4, int i) {
        super(1);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c118300cf3;
        this.l3 = c118300cf4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS123S0400000_28(C1397620mTQ c1397620mTQ, C1397620mTQ c1397620mTQ2, PNSAgeConfirmOption pNSAgeConfirmOption, Map<String, String> map, AgeGateCelebrationSettingFragment ageGateCelebrationSettingFragment) {
        super(1);
        this.$t = ageGateCelebrationSettingFragment;
        this.l0 = c1397620mTQ;
        this.l1 = c1397620mTQ2;
        this.l2 = pNSAgeConfirmOption;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS123S0400000_28(C1397620mTQ c1397620mTQ, C1397620mTQ c1397620mTQ2, PNSAgeConfirmOption pNSAgeConfirmOption, Map<String, String> map, AgeGateFragment ageGateFragment) {
        super(1);
        this.$t = ageGateFragment;
        this.l0 = c1397620mTQ;
        this.l1 = c1397620mTQ2;
        this.l2 = pNSAgeConfirmOption;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0400000_28(C1915020zvw c1915020zvw, AwS429S0200000_28 awS429S0200000_28, C1914980zvs c1914980zvs, CollectConsentParam collectConsentParam, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1915020zvw;
        this.l1 = awS429S0200000_28;
        this.l2 = c1914980zvs;
        this.l3 = collectConsentParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0400000_28(C1916300zy0 c1916300zy0, C1914980zvs c1914980zvs, CollectConsentParam collectConsentParam, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1916300zy0;
        this.l1 = c1914980zvs;
        this.l2 = collectConsentParam;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS123S0400000_28(C1917510zzx c1917510zzx, C1917510zzx c1917510zzx2, Map<String, ? extends Object> map, InterfaceC1631630sYr<? super UserBanAppealStatusResponse, ? super Map<String, ? extends Object>, ? super Map<String, String>, ? super Map<String, String>, Unit> interfaceC1631630sYr, Function1<? super String, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c1917510zzx;
        this.l1 = c1917510zzx2;
        this.l2 = map;
        this.l3 = interfaceC1631630sYr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0400000_28(PNSConsentCollectorServiceImpl pNSConsentCollectorServiceImpl, Context context, CollectConsentParam collectConsentParam, InterfaceC1915190zwD interfaceC1915190zwD, int i) {
        super(1);
        this.$t = i;
        this.l0 = pNSConsentCollectorServiceImpl;
        this.l1 = context;
        this.l2 = collectConsentParam;
        this.l3 = interfaceC1915190zwD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS123S0400000_28(RelationButton relationButton, RelationButton relationButton2, User user, C10LZ c10lz, int i) {
        super(1);
        this.$t = i;
        this.l0 = relationButton;
        this.l1 = relationButton2;
        this.l2 = user;
        this.l3 = c10lz;
    }
}

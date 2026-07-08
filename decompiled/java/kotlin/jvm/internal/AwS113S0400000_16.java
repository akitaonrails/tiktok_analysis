package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C013C;
import X.C06MM;
import X.C09AY;
import X.C0HTI;
import X.C0I27;
import X.C0I28;
import X.C1009240cN0;
import X.C1016940cZQ;
import X.C1021680ch4;
import X.C1021750chB;
import X.C1027410cqJ;
import X.C1027610cqd;
import X.C1035880d3y;
import X.C1039050d95;
import X.C1050610dRj;
import X.C1054430dXt;
import X.C1054440dXu;
import X.C1057930ddX;
import X.C1063050dln;
import X.C1069700dwW;
import X.C118300cf;
import X.C1220000hqw;
import X.C1388190mED;
import X.C1397620mTQ;
import X.C13LE;
import X.C13LP;
import X.C1667580tUq;
import X.C1906580ziK;
import X.C19EG;
import X.C20248814Kw;
import X.C338530DOx;
import X.C425220Gls;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C770750ULh;
import X.C786410Ut5;
import X.C817403Hg;
import X.C844470XAv;
import X.C989550brF;
import X.EnumC1070410dxf;
import X.InterfaceC1036110d4L;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.ss.android.ugc.aweme.feed.model.EfficiencyJumpData;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsAuthCell;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AwS113S0400000_16 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS113S0400000_16 awS113S0400000_16, Object obj) {
        ((C1063050dln) awS113S0400000_16.l0).LJ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) obj, (InteractiveBrandedEffectInfo) awS113S0400000_16.l1, (C1057930ddX) awS113S0400000_16.l2, (Aweme) awS113S0400000_16.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS113S0400000_16 awS113S0400000_16, Object obj) {
        View view;
        MotionEvent motionEvent = (MotionEvent) obj;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    ((C1021680ch4) awS113S0400000_16.l0).LLL.LIZ();
                }
            } else if (!((C013C) awS113S0400000_16.l3).element && ((C013C) awS113S0400000_16.l1).element) {
                ((C1021680ch4) awS113S0400000_16.l0).LLL.LIZ();
            }
        } else {
            C1021750chB c1021750chB = ((C1021680ch4) awS113S0400000_16.l0).LLL;
            View view2 = c1021750chB.LIZ;
            if ((view2 == null || view2.getVisibility() != 4) && (view = c1021750chB.LIZ) != null) {
                C786410Ut5.LJLLLLLL(4, view);
            }
            ((C1021680ch4) awS113S0400000_16.l0).LLILLL.LJIJ(new C989550brF(C1009240cN0.LIZ), (C1021680ch4) awS113S0400000_16.l0);
            C013C c013c = (C013C) awS113S0400000_16.l1;
            if (((C425220Gls) awS113S0400000_16.l2).findChildViewUnder(motionEvent.getX(), motionEvent.getY()) != null) {
                z = false;
            }
            c013c.element = z;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS113S0400000_16 awS113S0400000_16, Object obj) {
        List<String> list;
        AwemeRawAd awemeRawAd;
        LandingPageConfig landingPageConfig;
        boolean z;
        InterfaceC1036110d4L interfaceC1036110d4L;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        InterfaceC1036110d4L interfaceC1036110d4L2;
        List<String> list2;
        String str;
        String str2;
        String str3;
        EfficiencyComponents efficiencyComponents = (EfficiencyComponents) awS113S0400000_16.l0;
        Activity activityLIZIZ = null;
        if (efficiencyComponents == null || (list = efficiencyComponents.aiComponents) == null) {
            C1035880d3y c1035880d3y = (C1035880d3y) awS113S0400000_16.l1;
            if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null && (landingPageConfig = awemeRawAd.getLandingPageConfig()) != null) {
                list = landingPageConfig.aiComponents;
            } else {
                list = null;
            }
        }
        int size = 0;
        if (list != null && (!list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "";
        if (z) {
            C1016940cZQ c1016940cZQ = (C1016940cZQ) awS113S0400000_16.l2;
            EfficiencyComponents efficiencyComponents2 = (EfficiencyComponents) awS113S0400000_16.l0;
            c1016940cZQ.getClass();
            if (efficiencyComponents2 != null) {
                EfficiencyJumpData efficiencyJumpData = efficiencyComponents2.jumpData;
                if (efficiencyJumpData != null) {
                    str = efficiencyJumpData.lynxSchema;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    Context context = c1016940cZQ.getContext();
                    if (context == null) {
                        C844470XAv.LIZ.getClass();
                        context = C844470XAv.LIZ();
                    }
                    EfficiencyJumpData efficiencyJumpData2 = efficiencyComponents2.jumpData;
                    if (efficiencyJumpData2 == null || (str2 = efficiencyJumpData2.lynxSchema) == null) {
                        str2 = "";
                    }
                    EfficiencyJumpData efficiencyJumpData3 = efficiencyComponents2.jumpData;
                    if (efficiencyJumpData3 == null || (str3 = efficiencyJumpData3.frontendData) == null) {
                        str3 = "";
                    }
                    C1027410cqJ.LIZ(context, C1027610cqd.LIZ(str2, "", 0, 0, 0, 6, new JSONObject(str3), null, null, null, "", 1, null, 0, 0, 1, null, null, null, null, null, null, 8314880)).LIZ();
                }
            }
        } else {
            C1016940cZQ c1016940cZQ2 = (C1016940cZQ) awS113S0400000_16.l2;
            SparkContext sparkContext = (SparkContext) awS113S0400000_16.l3;
            c1016940cZQ2.getClass();
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.uo;
            c770750ULh.LIZ = c0hti.LIZ(c1016940cZQ2.getContext());
            c770750ULh.LIZLLL = 1;
            c770750ULh.LJ = c1016940cZQ2.getContext().getString(2131820790);
            c770750ULh.LJFF = c1016940cZQ2.getContext().getString(2131820791);
            c770750ULh.LJ(new C1667580tUq(R.raw.icon_store_fill, c1016940cZQ2.getContext().getString(2131820784), c1016940cZQ2.getContext().getString(2131820788), null, 8), new C1667580tUq(R.raw.icon_truck_moving_fill_ltr, c1016940cZQ2.getContext().getString(2131820785), c1016940cZQ2.getContext().getString(2131820789), null, 8), new C1667580tUq(R.raw.icon_comment_fill, c1016940cZQ2.getContext().getString(2131820786), c1016940cZQ2.getContext().getString(2131820787), null, 8));
            c770750ULh.LJIILLIIL = true;
            c770750ULh.LJI(c1016940cZQ2.getContext().getString(2131820783), AFwS252S0000000_16.get$arr$(434));
            TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            }
            Activity activityLIZ = C06MM.LIZ(activityLIZIZ);
            if (activityLIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxSheet.show(supportFragmentManager, "commerce_iab_ai_components");
            }
            if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                interfaceC1036110d4L.LJJIJL();
            }
        }
        C1016940cZQ c1016940cZQ3 = (C1016940cZQ) awS113S0400000_16.l2;
        SparkContext sparkContext2 = (SparkContext) awS113S0400000_16.l3;
        EfficiencyComponents efficiencyComponents3 = (EfficiencyComponents) awS113S0400000_16.l0;
        c1016940cZQ3.getClass();
        if (efficiencyComponents3 != null && (list2 = efficiencyComponents3.aiComponents) != null) {
            String str5 = (String) C13LP.LJJJLL(list2);
            if (str5 != null) {
                str4 = str5;
            }
            size = list2.size();
        }
        if (sparkContext2 != null && (interfaceC1036110d4L2 = (InterfaceC1036110d4L) sparkContext2.LJFF(InterfaceC1036110d4L.class)) != null) {
            interfaceC1036110d4L2.LJIIJ(size, str4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS113S0400000_16 awS113S0400000_16, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            RecFriendsAuthCell recFriendsAuthCell = (RecFriendsAuthCell) awS113S0400000_16.l0;
            Context context = (Context) awS113S0400000_16.l1;
            recFriendsAuthCell.getClass();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                ((FindFriendsPageVM) new C736950SvV(C13LE.LIZ(FindFriendsPageVM.class), AFwS204S0000000_16.get$arr$(528), new C452070Ho5(), C724750Sbp.LJII(c19egLIZIZ), C1220000hqw.LIZ(c19egLIZIZ), AFwS252S0000000_16.get$arr$(656), new C0I27(c19egLIZIZ), new C0I28(c19egLIZIZ), new C338530DOx(c19egLIZIZ)).getValue()).UA0((EnumC1070410dxf) awS113S0400000_16.l2, "click");
                AssemVMLazy assemVMLazy = ((RecFriendsAuthCell) awS113S0400000_16.l0).LLJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RecFriendsAuthCell.LLJI;
                ((RecFriendsVM) assemVMLazy.getValue()).yQ2(false);
                RecFriendsAuthCell recFriendsAuthCell2 = (RecFriendsAuthCell) awS113S0400000_16.l0;
                EnumC1070410dxf enumC1070410dxf = (EnumC1070410dxf) awS113S0400000_16.l2;
                Context context2 = (Context) awS113S0400000_16.l1;
                C1069700dwW c1069700dwW = (C1069700dwW) awS113S0400000_16.l3;
                recFriendsAuthCell2.getClass();
                RecFriendsAuthCell.T5(enumC1070410dxf, context2, c1069700dwW);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS113S0400000_16 awS113S0400000_16, Object obj) {
        new C1050610dRj().LJI("ttelite_ba_video_product_publish_pop_click_try", new Pair<>("dialog_type", Integer.valueOf(((C118300cf) awS113S0400000_16.l0).element)));
        BAAnchorServiceImpl bAAnchorServiceImpl = (BAAnchorServiceImpl) awS113S0400000_16.l1;
        Context context = (Context) awS113S0400000_16.l2;
        bAAnchorServiceImpl.getClass();
        BAAnchorServiceImpl.LJIJJ(2, context);
        ((Function0) awS113S0400000_16.l3).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS113S0400000_16 awS113S0400000_16, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131848116, new AwS225S0300000_16((C1054440dXu) awS113S0400000_16.l0, (C1054430dXt) awS113S0400000_16.l1, (AwemeRawAd) awS113S0400000_16.l2, 26));
        c1397620mTQ.LJII(2131848111, new AwS225S0300000_16((C1054430dXt) awS113S0400000_16.l1, (Context) awS113S0400000_16.l3, (AwemeRawAd) awS113S0400000_16.l2, 27));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS113S0400000_16 awS113S0400000_16, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS560S0100000_16((C1039050d95) awS113S0400000_16.l1, 1048);
        c20248814Kw.LIZIZ(new AwS294S0300000_16((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) awS113S0400000_16.l2, (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) awS113S0400000_16.l3, (HashSet<String>) awS113S0400000_16.l1, (C1039050d95) 6));
        C20248814Kw.LIZJ(c20248814Kw, true, true, ((C817403Hg) awS113S0400000_16.l0).element, 0, null, null, null, 112);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS113S0400000_16(C118300cf c118300cf, C118300cf c118300cf2, BAAnchorServiceImpl bAAnchorServiceImpl, Context context, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = bAAnchorServiceImpl;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS113S0400000_16(C817403Hg c817403Hg, C817403Hg c817403Hg2, C1039050d95 c1039050d95, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, HashSet<String> hashSet) {
        super(1);
        this.$t = hashSet;
        this.l0 = c817403Hg;
        this.l1 = c817403Hg2;
        this.l2 = c1039050d95;
        this.l3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0400000_16(C1021680ch4 c1021680ch4, C013C c013c, C425220Gls c425220Gls, C013C c013c2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1021680ch4;
        this.l1 = c013c;
        this.l2 = c425220Gls;
        this.l3 = c013c2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0400000_16(C1054440dXu c1054440dXu, C1054430dXt c1054430dXt, AwemeRawAd awemeRawAd, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1054440dXu;
        this.l1 = c1054430dXt;
        this.l2 = awemeRawAd;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0400000_16(C1063050dln c1063050dln, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo, C1057930ddX c1057930ddX, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1063050dln;
        this.l1 = interactiveBrandedEffectInfo;
        this.l2 = c1057930ddX;
        this.l3 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0400000_16(EfficiencyComponents efficiencyComponents, C1035880d3y c1035880d3y, C1016940cZQ c1016940cZQ, SparkContext sparkContext, int i) {
        super(1);
        this.$t = i;
        this.l0 = efficiencyComponents;
        this.l1 = c1035880d3y;
        this.l2 = c1016940cZQ;
        this.l3 = sparkContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS113S0400000_16(RecFriendsAuthCell recFriendsAuthCell, Context context, EnumC1070410dxf enumC1070410dxf, C1069700dwW c1069700dwW, int i) {
        super(1);
        this.$t = i;
        this.l0 = recFriendsAuthCell;
        this.l1 = context;
        this.l2 = enumC1070410dxf;
        this.l3 = c1069700dwW;
    }
}

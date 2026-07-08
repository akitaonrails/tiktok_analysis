package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C098200Yq;
import X.C09AY;
import X.C0PEM;
import X.C0SY7;
import X.C11H7;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1667560tUo;
import X.C1667570tUp;
import X.C1737910vKH;
import X.C1865850yed;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C1DFH;
import X.C20097313kJ;
import X.C20684815ws;
import X.C2107308Nj;
import X.C23250099c;
import X.C289860BXs;
import X.C291001Au;
import X.C303380Buq;
import X.C322240CkA;
import X.C322250CkB;
import X.C322460CkW;
import X.C339590DSz;
import X.C389001fE;
import X.C418440Gaw;
import X.C491001vg;
import X.C627660Ojc;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C898270ZLt;
import X.EnumC781860Ulk;
import X.InterfaceC1680500tpg;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS208S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.adexperience.AdFeeDeductionBottomBarAssem;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AFwS287S0000000_4 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(32);
    public final int $t;

    public static AFwS287S0000000_4 get$arr$(int i) {
        AFwS287S0000000_4 aFwS287S0000000_4 = (AFwS287S0000000_4) arr$.get(i);
        if (aFwS287S0000000_4 != null) {
            return aFwS287S0000000_4;
        }
        arr$.compareAndSet(i, null, new AFwS287S0000000_4(i));
        return (AFwS287S0000000_4) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS287S0000000_4(int i) {
        super(2);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        Object obj3;
        ((Boolean) obj).booleanValue();
        ModuleDecision moduleDecision = (ModuleDecision) obj2;
        try {
            String featureName = EnumC781860Ulk.TOUCH_AREA_DOWNGRADE.getFeatureName();
            Map<String, Object> map = moduleDecision.featureParams;
            Map map2 = null;
            if (map != null) {
                obj3 = map.get(featureName);
            } else {
                obj3 = null;
            }
            if (obj3 instanceof Map) {
                map2 = (Map) obj3;
            }
            C389001fE.LIZ("live_adaptive_lite_mode_downgrade", new JSONObject(map2), System.currentTimeMillis(), false);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$10(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        String str;
        Context context;
        Activity activityLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ) != null && (context = abstractC738140SxQ.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C197039127h c197039127h;
        boolean z;
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (viewLJJIJL != null && (c197039127h = (C197039127h) viewLJJIJL.findViewById(R.id.ttv)) != null) {
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.setEnabled(z);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C20684815ws.LJIJ((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C20684815ws.LJIJ((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C20684815ws.LJIJ((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C20684815ws.LJIJ((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C20684815ws.LJIJ((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C20684815ws.LJIJ((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        String str;
        ((Number) obj).intValue();
        ThoughtAggregatedModel thoughtAggregatedModel = (ThoughtAggregatedModel) obj2;
        ThoughtInfo thoughtInfo = thoughtAggregatedModel.thoughtInfo;
        if (thoughtInfo == null || (str = thoughtInfo.thoughtId) == null) {
            return Integer.valueOf(thoughtAggregatedModel.hashCode());
        }
        return str;
    }

    public static final Object invoke$19(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C303380Buq.LIZ((String) obj, (Map) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        return C627660Ojc.LIZ((C627660Ojc) obj, null, new C491001vg((Throwable) obj2), null, null, 13);
    }

    public static final Object invoke$20(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((C11H7) obj).LIZ.getClass(), ((C11H7) obj2).LIZ.getClass()));
    }

    public static final Object invoke$21(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        C0SY7 c0sy7 = C0SY7.FOLLOWED;
        if (iIntValue == c0sy7.getValue() && iIntValue2 == C0SY7.UNFOLLOW.getValue()) {
            i = 2131828965;
        } else if (iIntValue == c0sy7.getValue() && iIntValue2 == c0sy7.getValue()) {
            i = 2131828966;
        } else if (iIntValue == C0SY7.UNFOLLOW.getValue() && iIntValue2 == c0sy7.getValue()) {
            i = 2131828963;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$22(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C20684815ws.LJIJ((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$23(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        FragmentManager supportFragmentManager;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
        if (fragmentLJI != null && c291001Au != null) {
            Boolean.valueOf(((Boolean) c291001Au.LIZ).booleanValue()).booleanValue();
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                if (supportFragmentManager.LJJLIIIJL().size() > 1) {
                    C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                    c19ehLJIIJ.LJIJJ(R.anim.mi, R.anim.mh);
                    c19ehLJIIJ.LJIIZILJ(fragmentLJI);
                    c19ehLJIIJ.LJIIJ();
                } else {
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(abstractC738140SxQ);
                    if (c19egLIZ2 != null) {
                        c19egLIZ2.finish();
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        C322240CkA c322240CkA;
        List<C322250CkB> list;
        C322460CkW c322460CkW;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c322240CkA = (C322240CkA) c291001Au.LIZ()) != null && (list = c322240CkA.LIZ) != null) {
            Iterator<C322250CkB> it2 = list.iterator();
            while (it2.hasNext()) {
                Object obj3 = it2.next().LIZ;
                if ((obj3 instanceof C322460CkW) && (c322460CkW = (C322460CkW) obj3) != null) {
                    C1737910vKH.LIZ("prop_draft_card_delete", c322460CkW.LIZ());
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$25(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        View view;
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            Boolean.valueOf(((Boolean) c291001Au.LIZ).booleanValue()).booleanValue();
            C786410Ut5.LJLLLLLL(8, uIAssem.LJJIJL());
            Object parent = uIAssem.LJJIJL().getParent();
            if ((parent instanceof View) && (view = (View) parent) != null) {
                C20097313kJ.LIZJ(view);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$26(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        View view = (View) obj2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
            layoutParams2.gravity = 17;
            layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.W5(view, layoutParams2);
            return Unit.LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        View view = (View) obj2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
            layoutParams2.gravity = 17;
            C786410Ut5.W5(view, layoutParams2);
            return Unit.LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        View view = (View) obj2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            layoutParams2.gravity = 8388661;
            C786410Ut5.W5(view, layoutParams2);
            return Unit.LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public static final Object invoke$29(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1667570tUp.LIZIZ(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        return C627660Ojc.LIZ((C627660Ojc) obj, new C491001vg((Throwable) obj2), null, null, null, 14);
    }

    public static /* bridge */ /* synthetic */ Object invoke$30(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) obj;
        String str = (String) obj2;
        ((TextView) reusedUISlotAssem.getContentView().findViewById(R.id.tv_sharer_name)).setText(str);
        String string = null;
        if (C1865850yed.LIZ()) {
            TextView textView = (TextView) reusedUISlotAssem.getContentView().findViewById(R.id.so1);
            Context context = reusedUISlotAssem.getContext();
            if (context != null) {
                string = C786410Ut5.j4(context.getString(2131831562), Arrays.copyOf(new Object[]{str}, 1));
            }
            textView.setText(string);
        } else if (C289860BXs.LIZ()) {
            TextView textView2 = (TextView) reusedUISlotAssem.getContentView().findViewById(R.id.so1);
            Context context2 = reusedUISlotAssem.getContext();
            if (context2 != null) {
                string = context2.getString(2131835446, str);
            }
            textView2.setText(string);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1667560tUo.LIZ(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        return C627660Ojc.LIZ((C627660Ojc) obj, null, null, new C491001vg((Throwable) obj2), null, 11);
    }

    public static final Object invoke$5(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        AdFeeDeductionBottomBarAssem adFeeDeductionBottomBarAssem = (AdFeeDeductionBottomBarAssem) obj;
        if (obj2 != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(adFeeDeductionBottomBarAssem);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C339590DSz(adFeeDeductionBottomBarAssem, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) throws JSONException {
        String str = (String) obj;
        Map map = (Map) obj2;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && iSparkHostApi.LLIIIILZ()) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    jSONObject.put(str2, value);
                } else if (value instanceof Number) {
                    jSONObject.put(str2, value);
                } else if (value instanceof Boolean) {
                    jSONObject.put(str2, ((Boolean) value).booleanValue());
                } else {
                    jSONObject.put(str2, value.toString());
                }
            }
            ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi2 != null) {
                iSparkHostApi2.onEventV3(str, jSONObject);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        EventLiveData<FollowStatus> relationObservable;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) obj2;
        IMFriendsService.LIZ.getClass();
        IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
        if (iMFriendsServiceLIZ != null && (relationObservable = iMFriendsServiceLIZ.getRelationObservable()) != null) {
            relationObservable.observe(abstractC738140SxQ, new AObserverS208S0100000_4(viewOnAttachStateChangeListenerC20604515jv, 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        Activity activityLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            boolean zBooleanValue = ((Boolean) c291001Au.LIZ).booleanValue();
            Context context = abstractC738140SxQ.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                if (zBooleanValue) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131834420);
                    c1389890mGx.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                    c1389890mGx2.LJIIIZ(2131829440);
                    c1389890mGx2.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(AFwS287S0000000_4 aFwS287S0000000_4, Object obj, Object obj2) {
        int i;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        Boolean bool = (Boolean) ((C291001Au) obj2).LIZ;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 2131837741;
            } else {
                i = 2131829440;
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }
}

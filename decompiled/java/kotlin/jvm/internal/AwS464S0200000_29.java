package kotlin.jvm.internal;

import X.AbstractC1252750ihl;
import X.AbstractC194339111l;
import X.AbstractC214814194y;
import X.C01GW;
import X.C09AY;
import X.C11C7;
import X.C11DL;
import X.C11DM;
import X.C11DO;
import X.C11E1;
import X.C1206830hVh;
import X.C1252520ihO;
import X.C1252540ihQ;
import X.C12NU;
import X.C12QW;
import X.C12QX;
import X.C12SD;
import X.C12SE;
import X.C13LP;
import X.C1558520qew;
import X.C1664150tPJ;
import X.C1761680vwc;
import X.C1761690vwd;
import X.C1856450yPT;
import X.C1858060yS4;
import X.C1862330yYx;
import X.C19424410z4;
import X.C19425610zG;
import X.C19427810zc;
import X.C19429110zp;
import X.C19461811Ce;
import X.C19462211Ci;
import X.C19463711Cx;
import X.C19466211Dw;
import X.C19510811Va;
import X.C19639211sc;
import X.C19639811si;
import X.C19639911sj;
import X.C19644511tT;
import X.C19644811tW;
import X.C19646511tn;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C259800zU;
import X.C372650EjH;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC19645411tc;
import X.InterfaceC1631620sYq;
import X.InterfaceC19403010vc;
import X.InterfaceC19408510wV;
import X.InterfaceC19426310zN;
import X.InterfaceC19426410zO;
import X.InterfaceC2217461Bqa;
import X.InterfaceC874803bO;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS18S0500000_29;
import android.os.Looper;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoMixCardSugAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackCell;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes30.dex */
public class AwS464S0200000_29 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
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
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS464S0200000_29(com.bytedance.jedi.arch.ext.list.ListMiddleware r3, com.bytedance.jedi.arch.ext.list.ListMiddleware<X.C004I, java.lang.Object, X.C1761680vwc> r4, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.Object>, ? super java.util.List<java.lang.Object>, ? extends java.util.List<java.lang.Object>> r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 12 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS464S0200000_29.<init>(com.bytedance.jedi.arch.ext.list.ListMiddleware, kotlin.jvm.functions.Function2, int):void");
    }

    public static final Object invoke$0(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        AwS430S0200000_29 awS430S0200000_29;
        InterfaceC874803bO interfaceC874803bO = (InterfaceC874803bO) obj;
        List list = (List) obj2;
        C11DO c11do = (C11DO) awS464S0200000_29.l0;
        Function1 function1 = (Function1) awS464S0200000_29.l1;
        if (function1 != null) {
            awS430S0200000_29 = new AwS430S0200000_29(function1, (Function1<InterfaceC874803bO, Unit>) interfaceC874803bO, (InterfaceC874803bO) 9);
        } else {
            awS430S0200000_29 = null;
        }
        c11do.LLII(list, awS430S0200000_29);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        LiveEventModule liveEventModule = (LiveEventModule) C13LP.LJJJLZIJ(((Number) obj2).intValue(), (List) awS464S0200000_29.l0);
        if (liveEventModule != null) {
            C1206830hVh c1206830hVh = C1206830hVh.LIZ;
            String strValueOf = String.valueOf(liveEventModule.id);
            boolean z = !liveEventModule.isPaidEvent;
            ExtensionMisc extensionMiscLJIILL = ((C19510811Va) awS464S0200000_29.l1).LJIILL();
            c1206830hVh.getClass();
            C1206830hVh.LIZIZ(strValueOf, z, "choose_event", extensionMiscLJIILL);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$10(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        String str;
        if (((Boolean) obj).booleanValue()) {
            C19644511tT c19644511tT = (C19644511tT) awS464S0200000_29.l0;
            C19644811tW value = c19644511tT.LJI.getValue();
            C19644811tW c19644811tW = value;
            C19639811si c19639811si = (C19639811si) ((C259800zU) awS464S0200000_29.l1).element;
            C19646511tn c19646511tn = null;
            if (c19639811si != null) {
                str = c19639811si.LIZIZ;
                c19646511tn = c19639811si.LIZJ;
            } else {
                str = null;
            }
            c19644811tW.LJIIL(new C19639911sj(str, c19646511tn));
            c19644511tT.LIZJ = value;
            C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS129S0100000_29((C19644511tT) awS464S0200000_29.l0, 149));
        } else {
            C19639211sc c19639211sc = ((C19644511tT) awS464S0200000_29.l0).LIZLLL;
            if (c19639211sc != null) {
                c19639211sc.LIZ(EnumC19645411tc.ON_CONFIRMED);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        InterfaceC874803bO receiver = ((C11DL) awS464S0200000_29.l0).getReceiver();
        if (receiver != null) {
            ((InterfaceC1631620sYq) awS464S0200000_29.l1).invoke(receiver, obj, obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        ListState listState = (ListState) obj;
        AbstractC1252750ihl abstractC1252750ihl = (AbstractC1252750ihl) obj2;
        Pair pair = (Pair) abstractC1252750ihl.LIZ();
        if (pair != null) {
            ListMiddleware listMiddleware = (ListMiddleware) awS464S0200000_29.l0;
            Function2 function2 = (Function2) awS464S0200000_29.l1;
            List list = (List) pair.getFirst();
            C1761680vwc c1761680vwc = (C1761680vwc) pair.getSecond();
            int size = list.size();
            C01GW<C11E1> c01gw = listMiddleware.LLJ;
            if (c01gw.isInitialized()) {
                C11E1 value = c01gw.getValue();
                if (value.LLILLJJLI) {
                    value.LL = false;
                    if (size != 0) {
                        int i = value.LLILLL - size;
                        value.LLILLL = i;
                        if (i > 0) {
                            value.LL = true;
                            value.LIZ();
                        }
                    }
                }
            }
            List list2 = (List) function2.invoke(listState.getList(), list);
            C1761690vwd c1761690vwdLJFF = listMiddleware.LJFF(listState, list2);
            if (c1761680vwc != null) {
                ListState listStateCopy = listState.copy(c1761680vwc, list2, listState.refresh, new C1252540ihQ(list), c1761690vwdLJFF);
                if (listStateCopy != null) {
                    return listStateCopy;
                }
            }
            ListState listStateCopy2 = listState.copy(listState.payload, list2, listState.refresh, new C1252540ihQ(list), c1761690vwdLJFF);
            if (listStateCopy2 != null) {
                return listStateCopy2;
            }
        }
        ListMiddleware listMiddleware2 = (ListMiddleware) awS464S0200000_29.l0;
        if (abstractC1252750ihl instanceof C1252520ihO) {
            C1252520ihO c1252520ihO = (C1252520ihO) abstractC1252750ihl;
            C01GW<C11E1> c01gw2 = listMiddleware2.LLJ;
            if (c01gw2.isInitialized()) {
                C11E1 value2 = c01gw2.getValue();
                if (value2.LLILLJJLI) {
                    value2.LL = false;
                }
            }
            return listState.copy(listState.payload, listState.list, listState.refresh, new C1252520ihO(c1252520ihO.LIZ), listState.isEmpty);
        }
        return listState.copy(listState.payload, listState.list, listState.refresh, new C19466211Dw(), listState.isEmpty);
    }

    public static final Object invoke$13(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        ListState listStateCopy;
        ListState listState = (ListState) obj;
        AbstractC1252750ihl abstractC1252750ihl = (AbstractC1252750ihl) obj2;
        Pair pair = (Pair) abstractC1252750ihl.LIZ();
        if (pair != null) {
            Function2 function2 = (Function2) awS464S0200000_29.l0;
            ListMiddleware listMiddleware = (ListMiddleware) awS464S0200000_29.l1;
            Object first = pair.getFirst();
            C1761680vwc c1761680vwc = (C1761680vwc) pair.getSecond();
            List list = (List) function2.invoke(listState.getList(), first);
            C1761690vwd c1761690vwdLJFF = listMiddleware.LJFF(listState, list);
            if (c1761680vwc == null || (listStateCopy = listState.copy(c1761680vwc, list, new C1252540ihQ(first), listState.loadMore, c1761690vwdLJFF)) == null) {
                ListState listStateCopy2 = listState.copy(listState.payload, list, new C1252540ihQ(first), listState.loadMore, c1761690vwdLJFF);
                if (listStateCopy2 != null) {
                    return listStateCopy2;
                }
            } else {
                return listStateCopy;
            }
        }
        if (abstractC1252750ihl instanceof C1252520ihO) {
            return listState.copy(listState.payload, listState.list, new C1252520ihO(((C1252520ihO) abstractC1252750ihl).LIZ), listState.loadMore, listState.isEmpty);
        }
        return listState.copy(listState.payload, listState.list, new C19466211Dw(), listState.loadMore, listState.isEmpty);
    }

    public static final Object invoke$14(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        NestedState nestedState = (NestedState) obj;
        AbstractC1252750ihl abstractC1252750ihl = (AbstractC1252750ihl) obj2;
        Pair pair = (Pair) abstractC1252750ihl.LIZ();
        if (pair != null) {
            ListViewModel listViewModel = (ListViewModel) awS464S0200000_29.l0;
            Function2 function2 = (Function2) awS464S0200000_29.l1;
            List list = (List) pair.getFirst();
            C1761680vwc c1761680vwc = (C1761680vwc) pair.getSecond();
            int size = list.size();
            C01GW<C11DM> c01gw = listViewModel.LLIZ;
            if (c01gw.isInitialized()) {
                C11DM value = c01gw.getValue();
                if (value.LLILLJJLI) {
                    value.LL = false;
                    if (size != 0) {
                        int i = value.LLILLL - size;
                        value.LLILLL = i;
                        if (i > 0) {
                            value.LL = true;
                            value.LIZ();
                        }
                    }
                }
            }
            List list2 = (List) function2.invoke(((ListState) nestedState.getSubstate()).getList(), list);
            C1761690vwd c1761690vwdHR2 = listViewModel.hR2((ListState) nestedState.getSubstate(), list2);
            if (c1761680vwc != null) {
                ListState listState = (ListState) nestedState.getSubstate();
                NestedState nestedStateNewSubstate = nestedState.newSubstate(listState.copy(c1761680vwc, list2, listState.refresh, new C1252540ihQ(list), c1761690vwdHR2));
                if (nestedStateNewSubstate != null) {
                    return nestedStateNewSubstate;
                }
            }
            ListState listState2 = (ListState) nestedState.getSubstate();
            return nestedState.newSubstate(listState2.copy(listState2.payload, list2, listState2.refresh, new C1252540ihQ(list), c1761690vwdHR2));
        }
        ListViewModel listViewModel2 = (ListViewModel) awS464S0200000_29.l0;
        if (abstractC1252750ihl instanceof C1252520ihO) {
            C1252520ihO c1252520ihO = (C1252520ihO) abstractC1252750ihl;
            C01GW<C11DM> c01gw2 = listViewModel2.LLIZ;
            if (c01gw2.isInitialized()) {
                C11DM value2 = c01gw2.getValue();
                if (value2.LLILLJJLI) {
                    value2.LL = false;
                }
            }
            ListState listState3 = (ListState) nestedState.getSubstate();
            return nestedState.newSubstate(listState3.copy(listState3.payload, listState3.list, listState3.refresh, new C1252520ihO(c1252520ihO.LIZ), listState3.isEmpty));
        }
        ListState listState4 = (ListState) nestedState.getSubstate();
        return nestedState.newSubstate(listState4.copy(listState4.payload, listState4.list, listState4.refresh, new C19466211Dw(), listState4.isEmpty));
    }

    public static final Object invoke$15(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        NestedState nestedState = (NestedState) obj;
        AbstractC1252750ihl abstractC1252750ihl = (AbstractC1252750ihl) obj2;
        Pair pair = (Pair) abstractC1252750ihl.LIZ();
        if (pair != null) {
            Function2 function2 = (Function2) awS464S0200000_29.l0;
            ListViewModel listViewModel = (ListViewModel) awS464S0200000_29.l1;
            Object first = pair.getFirst();
            C1761680vwc c1761680vwc = (C1761680vwc) pair.getSecond();
            List list = (List) function2.invoke(((ListState) nestedState.getSubstate()).getList(), first);
            C1761690vwd c1761690vwdHR2 = listViewModel.hR2((ListState) nestedState.getSubstate(), list);
            if (c1761680vwc != null) {
                ListState listState = (ListState) nestedState.getSubstate();
                NestedState nestedStateNewSubstate = nestedState.newSubstate(listState.copy(c1761680vwc, list, new C1252540ihQ(first), listState.loadMore, c1761690vwdHR2));
                if (nestedStateNewSubstate != null) {
                    return nestedStateNewSubstate;
                }
            }
            ListState listState2 = (ListState) nestedState.getSubstate();
            return nestedState.newSubstate(listState2.copy(listState2.payload, list, new C1252540ihQ(first), listState2.loadMore, c1761690vwdHR2));
        }
        if (abstractC1252750ihl instanceof C1252520ihO) {
            ListState listState3 = (ListState) nestedState.getSubstate();
            return nestedState.newSubstate(listState3.copy(listState3.payload, listState3.list, new C1252520ihO(((C1252520ihO) abstractC1252750ihl).LIZ), listState3.loadMore, listState3.isEmpty));
        }
        ListState listState4 = (ListState) nestedState.getSubstate();
        return nestedState.newSubstate(listState4.copy(listState4.payload, listState4.list, new C19466211Dw(), listState4.loadMore, listState4.isEmpty));
    }

    public static final Object invoke$16(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        AwS430S0200000_29 awS430S0200000_29;
        InterfaceC874803bO interfaceC874803bO = (InterfaceC874803bO) obj;
        List list = (List) obj2;
        C11DO c11do = (C11DO) awS464S0200000_29.l0;
        Function1 function1 = (Function1) awS464S0200000_29.l1;
        if (function1 != null) {
            awS430S0200000_29 = new AwS430S0200000_29(function1, (Function1<InterfaceC874803bO, Unit>) interfaceC874803bO, (InterfaceC874803bO) 95);
        } else {
            awS430S0200000_29 = null;
        }
        c11do.LLII(list, awS430S0200000_29);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        AbstractC194339111l abstractC194339111l = (AbstractC194339111l) awS464S0200000_29.l0;
        abstractC194339111l.LJ.LIZ(abstractC194339111l.LJ((View) awS464S0200000_29.l1), iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        AbstractC194339111l abstractC194339111l = (AbstractC194339111l) awS464S0200000_29.l0;
        abstractC194339111l.LJ.LIZ(abstractC194339111l.LJ((View) awS464S0200000_29.l1), iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        AbstractC194339111l abstractC194339111l = (AbstractC194339111l) awS464S0200000_29.l0;
        abstractC194339111l.LJ.LIZ(abstractC194339111l.LJ((View) awS464S0200000_29.l1), iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        C12SE c12se = (C12SE) awS464S0200000_29.l0;
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.copyFrom((AudioRecorderParam) obj);
        c12se.LLJJJJ = audioRecorderParam;
        C12SE c12se2 = (C12SE) awS464S0200000_29.l0;
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom((AudioRecorderParam) obj2);
        c12se2.LLJJJJJIL = audioRecorderParam2;
        ((Function0) awS464S0200000_29.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        AbstractC194339111l abstractC194339111l = (AbstractC194339111l) awS464S0200000_29.l0;
        abstractC194339111l.LJ.LIZ(abstractC194339111l.LJ((View) awS464S0200000_29.l1), iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        AbstractC194339111l abstractC194339111l = (AbstractC194339111l) awS464S0200000_29.l0;
        abstractC194339111l.LJ.LIZ(abstractC194339111l.LJ((View) awS464S0200000_29.l1), iIntValue, iIntValue2);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$22(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        Function2<InterfaceC874803bO, Throwable, Unit> function2;
        C19462211Ci c19462211Ci = (C19462211Ci) awS464S0200000_29.l0;
        c19462211Ci.LIZJ.withState((ListViewModel) awS464S0200000_29.l1, new AwS608S0100000_29(c19462211Ci, (C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO>) 699));
        C19461811Ce c19461811Ce = ((C19462211Ci) awS464S0200000_29.l0).LJII;
        if (c19461811Ce != null && (function2 = c19461811Ce.LIZIZ) != null) {
            function2.invoke(obj, obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        C736680Sv4.LJIJJ(((HashtagFeedbackCell) awS464S0200000_29.l0).I5(), new AwS395S0200000_29((HashtagFeedbackCell) awS464S0200000_29.l0, (C11C7) awS464S0200000_29.l1, 114));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        C12SD c12sd = (C12SD) awS464S0200000_29.l0;
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.copyFrom((AudioRecorderParam) obj);
        c12sd.LLJLL = audioRecorderParam;
        C12SD c12sd2 = (C12SD) awS464S0200000_29.l0;
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom((AudioRecorderParam) obj2);
        c12sd2.LLJJLIIIJLLLLLLLZ = audioRecorderParam2;
        ((Function0) awS464S0200000_29.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        Effect effect = (Effect) obj;
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ((C12QW) awS464S0200000_29.l0);
        if (abstractC214814194yLIZ != null) {
            ((C12QW) awS464S0200000_29.l0).LLLLLJIL(abstractC214814194yLIZ, effect);
        }
        ((C12QW) awS464S0200000_29.l0).LLLJIL = (C1664150tPJ) awS464S0200000_29.l1;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        Effect effect = (Effect) obj;
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ((C12QX) awS464S0200000_29.l0);
        if (abstractC214814194yLIZ != null) {
            ((C12QX) awS464S0200000_29.l0).LLLLLJIL(abstractC214814194yLIZ, effect);
        }
        ((C12QX) awS464S0200000_29.l0).LLLJL = (C1664150tPJ) awS464S0200000_29.l1;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        Message messageYy1;
        View view = (View) obj;
        C12NU c12nu = (C12NU) obj2;
        TakoCardAbility takoCardAbility = (TakoCardAbility) ((TakoMixCardSugAssem) awS464S0200000_29.l0).LLJLIL.getValue();
        if (takoCardAbility != null) {
            messageYy1 = takoCardAbility.Yy1();
        } else {
            messageYy1 = null;
        }
        IMessageAbility iMessageAbility = (IMessageAbility) ((TakoMixCardSugAssem) awS464S0200000_29.l0).LLJL.getValue();
        if (iMessageAbility != null && iMessageAbility.oj()) {
            C1858060yS4.LJ(c12nu, C1558520qew.LJIIL((TakoMixCardSugAssem) awS464S0200000_29.l0), view, messageYy1, C2097908Jt.LIZJ(new Pair("source_id", ((InterfaceC19408510wV) awS464S0200000_29.l1).getSourceId())), null, 16);
        } else {
            AssemVMLazy assemVMLazy = ((TakoMixCardSugAssem) awS464S0200000_29.l0).LLJLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoMixCardSugAssem.LLJLLIL;
            MessageViewModel messageViewModel = (MessageViewModel) assemVMLazy.getValue();
            messageViewModel.withState(new AwS606S0100000_27(messageViewModel, 18));
            HandlerHook.viewPostDelay(view, new ARunnableS18S0500000_29((TakoMixCardSugAssem) awS464S0200000_29.l0, c12nu, view, messageYy1, (InterfaceC19408510wV) awS464S0200000_29.l1, 0), 200L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) throws JSONException {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        C1856450yPT c1856450yPT = (C1856450yPT) obj2;
        TakoCardAbility takoCardAbility = (TakoCardAbility) ((TakoMixCardSugAssem) awS464S0200000_29.l0).LLJLIL.getValue();
        Map<String, String> commonParams = null;
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) == null || takoMixFeedLJIIIZ.cardType != 107) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Map<String, String> mapLJIIL = C2097608Jq.LJIIL(C1858060yS4.LIZ(c1856450yPT, null, null), C2097908Jt.LIZJ(new Pair("source_id", ((InterfaceC19408510wV) awS464S0200000_29.l1).getSourceId())));
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) ((TakoMixCardSugAssem) awS464S0200000_29.l0).LLJLILLLLZIIL.getValue();
            if (iTakoContextAbility != null) {
                commonParams = iTakoContextAbility.getCommonParams();
            }
            c1862330yYx.mobTikbotQuickInteractionShow(mapLJIIL, commonParams);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        String key;
        InterfaceC19426410zO interfaceC19426410zO;
        Effect effect = (Effect) obj2;
        if (!((Boolean) obj).booleanValue() && effect != null) {
            ((InterfaceC19426310zN) awS464S0200000_29.l0).setPath(effect.getUnzipPath());
            ProfileNaviEditorViewModel profileNaviEditorViewModel = (ProfileNaviEditorViewModel) awS464S0200000_29.l1;
            InterfaceC19426310zN interfaceC19426310zN = (InterfaceC19426310zN) awS464S0200000_29.l0;
            profileNaviEditorViewModel.getClass();
            C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
            if (c19424410z4 != null) {
                InterfaceC19403010vc category = interfaceC19426310zN.getCategory();
                String groupId = category.getGroupId();
                if (groupId != null && groupId.length() != 0) {
                    key = category.getGroupId();
                } else {
                    key = category.getKey();
                }
                InterfaceC19426310zN interfaceC19426310zNLIZ = c19424410z4.LIZ(key);
                if (interfaceC19426310zNLIZ != null) {
                    if (C19425610zG.LIZIZ == null) {
                        C19425610zG.LIZIZ = profileNaviEditorViewModel;
                    }
                    if (Intrinsics.LJFF(interfaceC19426310zNLIZ.getKey(), interfaceC19426310zN.getKey())) {
                        String path = interfaceC19426310zNLIZ.getPath();
                        Iterator<InterfaceC19426310zN> it2 = C19425610zG.LIZ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (Intrinsics.LJFF(path, it2.next().getPath())) {
                                    break;
                                }
                            } else {
                                LinkedList<InterfaceC19426310zN> linkedList = C19425610zG.LIZ;
                                linkedList.addFirst(interfaceC19426310zN);
                                if ((!linkedList.isEmpty()) && (interfaceC19426410zO = C19425610zG.LIZIZ) != null) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(C19427810zc.LIZ(1, 66666, linkedList.getFirst().getPath()));
                                    linkedList.isEmpty();
                                    interfaceC19426410zO.Ls2(arrayList);
                                }
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS464S0200000_29 awS464S0200000_29, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Function0) awS464S0200000_29.l0).invoke();
        ((CompoundButton.OnCheckedChangeListener) awS464S0200000_29.l1).onCheckedChanged((CompoundButton) obj, zBooleanValue);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS464S0200000_29(com.bytedance.jedi.arch.ext.list.ListViewModel r3, com.bytedance.jedi.arch.ext.list.ListViewModel<java.lang.Object, X.C1761680vwc, com.bytedance.jedi.arch.ext.list.IListState<java.lang.Object, java.lang.Object>> r4, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.Object>, ? super java.util.List<java.lang.Object>, ? extends java.util.List<java.lang.Object>> r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 14 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS464S0200000_29.<init>(com.bytedance.jedi.arch.ext.list.ListViewModel, kotlin.jvm.functions.Function2, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS464S0200000_29(InterfaceC19426310zN interfaceC19426310zN, ProfileNaviEditorViewModel profileNaviEditorViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC19426310zN;
        this.l1 = profileNaviEditorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS464S0200000_29(AbstractC194339111l abstractC194339111l, AbstractC194339111l<T> abstractC194339111l2, T t) {
        super(2);
        this.$t = t;
        this.l0 = abstractC194339111l;
        this.l1 = abstractC194339111l2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS464S0200000_29(C19462211Ci c19462211Ci, C19462211Ci<Object, C19463711Cx<Object>, InterfaceC874803bO> c19462211Ci2, ListViewModel<Object, ?, IListState<Object, ?>> listViewModel) {
        super(2);
        this.$t = listViewModel;
        this.l0 = c19462211Ci;
        this.l1 = c19462211Ci2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS464S0200000_29(C11DL c11dl, C11DL<? extends RECEIVER> c11dl2, InterfaceC1631620sYq<? super RECEIVER, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        super(2);
        this.$t = interfaceC1631620sYq;
        this.l0 = c11dl;
        this.l1 = c11dl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS464S0200000_29(C11DO c11do, C11DO<T> c11do2, Function1<? super RECEIVER, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = c11do;
        this.l1 = c11do2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS464S0200000_29(C19644511tT c19644511tT, C19644511tT c19644511tT2, C259800zU<C19639811si> c259800zU) {
        super(2);
        this.$t = c259800zU;
        this.l0 = c19644511tT;
        this.l1 = c19644511tT2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS464S0200000_29(C12QW c12qw, C1664150tPJ c1664150tPJ, int i) {
        super(2);
        this.$t = i;
        this.l0 = c12qw;
        this.l1 = c1664150tPJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS464S0200000_29(C12QX c12qx, C1664150tPJ c1664150tPJ, int i) {
        super(2);
        this.$t = i;
        this.l0 = c12qx;
        this.l1 = c1664150tPJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS464S0200000_29(C12SD c12sd, C12SD c12sd2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c12sd;
        this.l1 = c12sd2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS464S0200000_29(C12SE c12se, C12SE c12se2, Function0<Unit> function0) {
        super(2);
        this.$t = function0;
        this.l0 = c12se;
        this.l1 = c12se2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS464S0200000_29(TakoMixCardSugAssem takoMixCardSugAssem, InterfaceC19408510wV interfaceC19408510wV, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoMixCardSugAssem;
        this.l1 = interfaceC19408510wV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS464S0200000_29(HashtagFeedbackCell hashtagFeedbackCell, C11C7 c11c7, int i) {
        super(2);
        this.$t = i;
        this.l0 = hashtagFeedbackCell;
        this.l1 = c11c7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS464S0200000_29(List list, List<LiveEventModule> list2, C19510811Va c19510811Va) {
        super(2);
        this.$t = c19510811Va;
        this.l0 = list;
        this.l1 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS464S0200000_29(AwS576S0100000_32 awS576S0100000_32, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS576S0100000_32;
        this.l1 = onCheckedChangeListener;
    }
}

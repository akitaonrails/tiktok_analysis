package kotlin.jvm.internal;

import X.AbstractC1335900krs;
import X.AbstractC857240Xk2;
import X.AbstractC879060Ye8;
import X.AbstractC880120Yfq;
import X.AnonymousClass0617;
import X.C01GW;
import X.C03H5;
import X.C059D;
import X.C06P6;
import X.C09AY;
import X.C0CHQ;
import X.C0I6E;
import X.C0I6Y;
import X.C0IB1;
import X.C0PEM;
import X.C0TMP;
import X.C0VSP;
import X.C0Y8T;
import X.C0YM2;
import X.C0YNP;
import X.C0Z2V;
import X.C0ZDX;
import X.C0ZE8;
import X.C0ZHA;
import X.C0ZHQ;
import X.C0ZJR;
import X.C0ZYK;
import X.C1297500jrw;
import X.C1325380kau;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C1383370m6R;
import X.C1391190mJ3;
import X.C1428470nHB;
import X.C1455340nyW;
import X.C1455820nzI;
import X.C15438062q;
import X.C1584506Ih;
import X.C1729806q0;
import X.C19252910Tv;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C451040HmQ;
import X.C454440Hru;
import X.C513601zK;
import X.C786410Ut5;
import X.C856790XjJ;
import X.C857220Xk0;
import X.C857300Xk8;
import X.C857640Xkg;
import X.C857680Xkk;
import X.C860920Xpy;
import X.C869590Y9l;
import X.C877210Yb9;
import X.C877540Ybg;
import X.C877700Ybw;
import X.C878360Yd0;
import X.C878460YdA;
import X.C878470YdB;
import X.C878590YdN;
import X.C878630YdR;
import X.C878670YdV;
import X.C878960Ydy;
import X.C879540Yeu;
import X.C879580Yey;
import X.C880370YgF;
import X.C880430YgL;
import X.C880490YgR;
import X.C880930Yh9;
import X.C880950YhB;
import X.C882850YkF;
import X.C882870YkH;
import X.C888120Ysk;
import X.C888210Yst;
import X.C888230Ysv;
import X.C889910Yvd;
import X.C890020Yvo;
import X.C890540Ywe;
import X.C897240ZHu;
import X.C897370ZIh;
import X.C910370ZnX;
import X.C914150Ztd;
import X.EnumC1596306Mv;
import X.EnumC1643306c3;
import X.EnumC714850S2h;
import X.EnumC877640Ybq;
import X.EnumC877690Ybv;
import X.EnumC879080YeA;
import X.EnumC880480YgQ;
import X.EnumC880520YgU;
import X.EnumC880570YgZ;
import X.EnumC910400Zna;
import X.InterfaceC0148002o;
import X.InterfaceC1482905rH;
import X.InterfaceC1491305sd;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC856160XiI;
import X.InterfaceC875610YWp;
import X.InterfaceC877650Ybr;
import X.InterfaceC878540YdI;
import X.InterfaceC878620YdQ;
import X.InterfaceC879010Ye3;
import X.InterfaceC897380ZIi;
import Y.AAListenerS266S0200000_14;
import Y.ARunnableS91S0200000_22;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent;
import com.bytedance.tts.pigeon.paas.detailpage.protocol.IConversationDetailContainer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.effect.EffectCreationBanStatusViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestTopBarAssem;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.wheeexclusive.WheeExclusiveBubbleMessageListViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class AwS258S0300000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS258S0300000_14 awS258S0300000_14) {
        C0Y8T c0y8t = (C0Y8T) awS258S0300000_14.l0;
        if (c0y8t != null) {
            C878670YdV.LIZ.getClass();
            if (C878670YdV.LIZIZ(c0y8t) && C878670YdV.LIZ((C0Y8T) awS258S0300000_14.l0)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
                C0Y8T c0y8t2 = (C0Y8T) awS258S0300000_14.l0;
                C877210Yb9 c877210Yb9 = ((C878470YdB) awS258S0300000_14.l1).LIZIZ;
                if (!C880370YgF.LJFF(c0y8t2, c877210Yb9.LIZ, c877210Yb9.LIZIZ)) {
                    C878460YdA c878460YdA = (C878460YdA) awS258S0300000_14.l2;
                    C0Y8T c0y8t3 = (C0Y8T) awS258S0300000_14.l0;
                    C0YM2 c0ym2 = ((C878470YdB) awS258S0300000_14.l1).LIZ.LL;
                    c878460YdA.getClass();
                    C879540Yeu c879540YeuLJIILLIIL = C878460YdA.LJIILLIIL(c0y8t3, c0ym2);
                    if (c879540YeuLJIILLIIL != null) {
                        arrayList2.add(c879540YeuLJIILLIIL);
                    }
                } else {
                    C878460YdA c878460YdA2 = (C878460YdA) awS258S0300000_14.l2;
                    C0Y8T c0y8t4 = (C0Y8T) awS258S0300000_14.l0;
                    C0YM2 c0ym22 = ((C878470YdB) awS258S0300000_14.l1).LIZ.LL;
                    c878460YdA2.getClass();
                    C879540Yeu c879540YeuLJIILLIIL2 = C878460YdA.LJIILLIIL(c0y8t4, c0ym22);
                    if (c879540YeuLJIILLIIL2 != null) {
                        arrayList.add(c879540YeuLJIILLIIL2);
                        arrayList2.add(c879540YeuLJIILLIIL2);
                    }
                }
                CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = ((C878460YdA) awS258S0300000_14.l2).LJIILL().get((C878470YdB) awS258S0300000_14.l1);
                if (copyOnWriteArrayList != null) {
                    C878470YdB c878470YdB = (C878470YdB) awS258S0300000_14.l1;
                    C878460YdA c878460YdA3 = (C878460YdA) awS258S0300000_14.l2;
                    Iterator<InterfaceC878540YdI> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZJ(c878470YdB.LIZ, arrayList, arrayList2, C878360Yd0.LIZIZ(c878460YdA3.LIZ, "create"));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS258S0300000_14 awS258S0300000_14) {
        if (((C0Y8T) awS258S0300000_14.l0) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            AnonymousClass0617 anonymousClass0617 = new AnonymousClass0617(((C878470YdB) awS258S0300000_14.l1).LIZ.LL, ((C0Y8T) awS258S0300000_14.l0).getConversationId());
            Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
            C0Y8T c0y8t = (C0Y8T) awS258S0300000_14.l0;
            C877210Yb9 c877210Yb9 = ((C878470YdB) awS258S0300000_14.l1).LIZIZ;
            if (!C880370YgF.LJFF(c0y8t, c877210Yb9.LIZ, c877210Yb9.LIZIZ)) {
                arrayList2.add(anonymousClass0617);
            } else {
                arrayList2.add(anonymousClass0617);
                arrayList.add(anonymousClass0617);
            }
            C878670YdV c878670YdV = C878670YdV.LIZ;
            C0Y8T c0y8t2 = (C0Y8T) awS258S0300000_14.l0;
            c878670YdV.getClass();
            if (C878670YdV.LIZIZ(c0y8t2)) {
                C19252910Tv.LIZIZ.LIZLLL().LJIIL().LIZ(((C0Y8T) awS258S0300000_14.l0).getConversationId());
            }
            CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = ((C878460YdA) awS258S0300000_14.l2).LJIILL().get((C878470YdB) awS258S0300000_14.l1);
            if (copyOnWriteArrayList != null) {
                C878470YdB c878470YdB = (C878470YdB) awS258S0300000_14.l1;
                C878460YdA c878460YdA = (C878460YdA) awS258S0300000_14.l2;
                Iterator<InterfaceC878540YdI> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c878470YdB.LIZ, arrayList, arrayList2, C878360Yd0.LIZIZ(c878460YdA.LIZ, "delete"));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS258S0300000_14 awS258S0300000_14) {
        Runnable runnable = (Runnable) awS258S0300000_14.l0;
        if (runnable != null) {
            ((C1455820nzI) awS258S0300000_14.l1).getClass();
            C1455340nyW c1455340nyWLIZJ = C0CHQ.LIZ().getPublishService().LJIIJ().LIZJ();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C059D(c1455340nyWLIZJ, runnable, null), 3);
        } else {
            ((Runnable) awS258S0300000_14.l2).run();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS258S0300000_14 awS258S0300000_14) {
        List list = (List) awS258S0300000_14.l0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C878630YdR((String) it2.next()));
        }
        try {
            Set<InterfaceC878620YdQ> set = ((C877540Ybg) awS258S0300000_14.l1).LJFF;
            if (set != null) {
                List list2 = (List) awS258S0300000_14.l0;
                Iterator<T> it3 = set.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC878620YdQ) it3.next()).LJFF(list2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = ((C878590YdN) awS258S0300000_14.l2).LJIILL().get((C877540Ybg) awS258S0300000_14.l1);
        if (copyOnWriteArrayList != null) {
            C877540Ybg c877540Ybg = (C877540Ybg) awS258S0300000_14.l1;
            C878590YdN c878590YdN = (C878590YdN) awS258S0300000_14.l2;
            for (InterfaceC878540YdI interfaceC878540YdI : copyOnWriteArrayList) {
                interfaceC878540YdI.LIZ(c877540Ybg.LIZ, arrayList, arrayList, c878590YdN.LIZLLL);
                c878590YdN.LJIILLIIL(c877540Ybg, interfaceC878540YdI, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS258S0300000_14 awS258S0300000_14) {
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = ((C878590YdN) awS258S0300000_14.l0).LJIILL().get((C877540Ybg) awS258S0300000_14.l1);
        if (copyOnWriteArrayList != null) {
            C878590YdN c878590YdN = (C878590YdN) awS258S0300000_14.l0;
            C0Y8T c0y8t = (C0Y8T) awS258S0300000_14.l2;
            C877540Ybg c877540Ybg = (C877540Ybg) awS258S0300000_14.l1;
            for (InterfaceC878540YdI interfaceC878540YdI : copyOnWriteArrayList) {
                c878590YdN.getClass();
                C0Z2V.LIZ.getClass();
                if (C0Z2V.LJI(c0y8t)) {
                    List<? extends C879540Yeu<?>> listSingletonList = Collections.singletonList(C878590YdN.LJIIJ(c0y8t));
                    try {
                        Set<InterfaceC878620YdQ> set = c877540Ybg.LJFF;
                        if (set != null) {
                            for (InterfaceC878620YdQ interfaceC878620YdQ : set) {
                                if (interfaceC878620YdQ.LJIIIIZZ(c877540Ybg)) {
                                    interfaceC878620YdQ.LJIIJJI(c877540Ybg, c0y8t);
                                }
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (c877540Ybg.LIZ.LLILLL == EnumC880520YgU.PRIORITY) {
                        String conversationId = c0y8t.getConversationId();
                        EnumC877690Ybv.Companion.getClass();
                        String strLJFF = C0YNP.LJFF(conversationId, C877700Ybw.LIZ().getKey());
                        if (strLJFF == null || strLJFF.length() == 0) {
                        }
                    }
                    interfaceC878540YdI.LIZJ(c877540Ybg.LIZ, listSingletonList, listSingletonList, "MessageRequestListDataSource:single_update");
                    c878590YdN.LJIILLIIL(c877540Ybg, interfaceC878540YdI, false);
                } else {
                    C1729806q0.LIZJ(c877540Ybg.LIZ, new AwS258S0300000_14(c878590YdN, c877540Ybg, Collections.singletonList(c0y8t.getConversationId()), false, 11));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS258S0300000_14 awS258S0300000_14) {
        Set<InterfaceC1491305sd> set = ((C880930Yh9) awS258S0300000_14.l0).LLILZIL.get((InterfaceC879010Ye3) awS258S0300000_14.l1);
        if (set != null) {
            C880950YhB c880950YhB = (C880950YhB) awS258S0300000_14.l2;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                InterfaceC1491305sd interfaceC1491305sd = (InterfaceC1491305sd) obj;
                if (interfaceC1491305sd instanceof C879580Yey) {
                    String key = ((C879580Yey) interfaceC1491305sd).getKey();
                    c880950YhB.getClass();
                    if (Intrinsics.LJFF(key, "message_request_spam")) {
                        arrayList.add(obj);
                    }
                }
            }
            CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJ = ((C880930Yh9) awS258S0300000_14.l0).LJIJJ();
            InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) awS258S0300000_14.l1;
            C880930Yh9 c880930Yh9 = (C880930Yh9) awS258S0300000_14.l0;
            Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayListLJIJJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(interfaceC879010Ye3, arrayList, c880930Yh9.LIZIZ(), c880930Yh9.LLILLJJLI);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS258S0300000_14 awS258S0300000_14) {
        C1297500jrw c1297500jrw;
        GreetingCardViewModel greetingCardViewModel = (GreetingCardViewModel) awS258S0300000_14.l0;
        String str = ((C910370ZnX) awS258S0300000_14.l1).LLJJIJI;
        greetingCardViewModel.getClass();
        String str2 = (String) GreetingCardViewModel.wQ2(str).get(EnumC910400Zna.SPARKLE_LOTTIE_JSON_PATH.getValue());
        if (str2 != null && (c1297500jrw = ((C910370ZnX) awS258S0300000_14.l1).LLILZLL) != null) {
            AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(401);
            C1584506Ih.LIZIZ(c1297500jrw);
            c1297500jrw.removeAllAnimatorListeners();
            c1297500jrw.addAnimatorListener(new AAListenerS266S0200000_14(c1297500jrw, aFwS201S0000000_14, 4));
            try {
                c1297500jrw.setAnimation(new C0VSP(str2), str2);
                c1297500jrw.setProgress(0.0f);
                c1297500jrw.playAnimation();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        ((Function0) awS258S0300000_14.l2).invoke();
        ((C910370ZnX) awS258S0300000_14.l1).setSendUI((GreetingCardViewModel) awS258S0300000_14.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS258S0300000_14 r7) {
        /*
            java.lang.Object r0 = r7.l0
            X.0Ywe r0 = (X.C890540Ywe) r0
            boolean r0 = r0.W5()
            if (r0 != 0) goto L2b
            java.lang.Object r0 = r7.l1
            X.0Yvo r0 = (X.C890020Yvo) r0
            X.0Yvd r0 = r0.getTab$awemenotice_release()
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r0 = r0.LIZ
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r2 = com.ss.android.ugc.aweme.inbox.filter.FilterTabType.REQUEST
            r6 = 0
            if (r0 == r2) goto L30
            java.lang.Object r0 = r7.l2
            X.0Yvd r0 = (X.C889910Yvd) r0
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r1 = r0.LIZ
            java.lang.Object r0 = r7.l0
            X.0Ywe r0 = (X.C890540Ywe) r0
            X.0Ywj r0 = r0.LLJJIJI
            if (r0 == 0) goto L2e
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r0 = r0.LLILZIL
        L29:
            if (r1 != r0) goto L30
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            r0 = r6
            goto L29
        L30:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "metrics-"
            r1.append(r0)
            java.lang.String r0 = "click tab start"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1618770sE7.LJ(r0)
            java.lang.Object r0 = r7.l1
            X.0Yvo r0 = (X.C890020Yvo) r0
            X.0Yvd r0 = r0.getTab$awemenotice_release()
            com.ss.android.ugc.aweme.inbox.filter.FilterTabType r0 = r0.LIZ
            if (r0 != r2) goto L99
            java.lang.Object r0 = r7.l1
            X.0Yvo r0 = (X.C890020Yvo) r0
            X.0Yvd r0 = r0.getTab$awemenotice_release()
            java.lang.Integer r0 = r0.LJFF
            int r0 = X.C1527905yX.LIZ(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "show_cnt"
            r1.<init>(r0, r2)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r1)
            java.lang.String r0 = "request_tab_entrance_click"
            X.C20684815ws.LJIILLIIL(r0, r1)
            X.0Ys6 r0 = com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI> r0 = X.C887720Ys6.LIZIZ
            java.lang.Object r5 = r0.getValue()
            com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI r5 = (com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI) r5
            if (r5 == 0) goto L2b
            java.lang.Object r0 = r7.l1
            X.0Yvo r0 = (X.C890020Yvo) r0
            android.content.Context r4 = r0.getContext()
            com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams r3 = new com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.String r0 = ""
            r3.<init>(r1, r0, r6)
            r5.LIZ(r4, r3)
            goto L2b
        L99:
            java.lang.Object r0 = r7.l0
            X.0Ywe r0 = (X.C890540Ywe) r0
            X.01GW r0 = r0.LLJJIJIIJIL
            java.lang.Object r4 = r0.getValue()
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel r4 = (com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel) r4
            if (r4 == 0) goto L2b
            java.lang.Object r0 = r7.l1
            X.0Yvo r0 = (X.C890020Yvo) r0
            X.0Yvd r3 = r0.getTab$awemenotice_release()
            java.lang.String r2 = "notification_page"
            java.lang.String r1 = "click_tab"
            r0 = 0
            r4.xQ2(r3, r2, r1, r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS258S0300000_14.invoke$15(kotlin.jvm.internal.AwS258S0300000_14):java.lang.Object");
    }

    public static final Object invoke$16(AwS258S0300000_14 awS258S0300000_14) {
        if (C0IB1.LIZJ((List) awS258S0300000_14.l0, ((ReusedSkeletonUISlotAssem) awS258S0300000_14.l1).LLJJLIIIJLLLLLLLZ)) {
            ((ReusedSkeletonUISlotAssem) awS258S0300000_14.l1).up(C0I6Y.LIZ((InterfaceC461380I7k) awS258S0300000_14.l2), ((ReusedSkeletonUISlotAssem) awS258S0300000_14.l1).op(), C0IB1.LIZ((List) awS258S0300000_14.l0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS258S0300000_14 awS258S0300000_14) {
        String str;
        C882850YkF c882850YkF = (C882850YkF) awS258S0300000_14.l0;
        c882850YkF.LLILZLL.LIZIZ((List) awS258S0300000_14.l1, (List) awS258S0300000_14.l2, Boolean.FALSE, new C914150Ztd(c882850YkF, 10));
        C882850YkF c882850YkF2 = (C882850YkF) awS258S0300000_14.l0;
        if (c882850YkF2.LLJ) {
            str = "spam";
        } else {
            str = "unspam";
        }
        AbstractC880120Yfq.LJFF(c882850YkF2, str, "single_undo", null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS258S0300000_14 awS258S0300000_14) {
        String str;
        C882870YkH c882870YkH = (C882870YkH) awS258S0300000_14.l0;
        AbstractC879060Ye8.LIZJ(c882870YkH.LLILZLL, (List) awS258S0300000_14.l1, (List) awS258S0300000_14.l2, null, new C914150Ztd(c882870YkH, 11), 4);
        C882870YkH c882870YkH2 = (C882870YkH) awS258S0300000_14.l0;
        if (c882870YkH2.LLJ) {
            str = "star";
        } else {
            str = "unstar";
        }
        AbstractC880120Yfq.LJFF(c882870YkH2, str, "single_undo", null, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS258S0300000_14 awS258S0300000_14) {
        ((Function0) awS258S0300000_14.l0).invoke();
        ((InterfaceC856160XiI) awS258S0300000_14.l1).LIZJ((AbstractC857240Xk2) awS258S0300000_14.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS258S0300000_14 awS258S0300000_14) {
        InterfaceC875610YWp interfaceC875610YWpCreateMessageListManager = ((GECPigeon) awS258S0300000_14.l0).createMessageListManager(((IConversationDetailContainer) awS258S0300000_14.l1).getConversationId());
        interfaceC875610YWpCreateMessageListManager.LJFF(((PigeonMessageListComponent) awS258S0300000_14.l2).LLJI);
        return interfaceC875610YWpCreateMessageListManager;
    }

    public static final Object invoke$20(AwS258S0300000_14 awS258S0300000_14) {
        C856790XjJ c856790XjJ = C856790XjJ.LIZ;
        String creationId = ((C857640Xkg) awS258S0300000_14.l0).LJIIJ.getCreationId();
        VideoPublishEditModel videoPublishEditModel = ((C857640Xkg) awS258S0300000_14.l0).LJIIJ;
        String str = videoPublishEditModel.mShootWay;
        if (str == null) {
            str = "";
        }
        String strValueOf = String.valueOf(videoPublishEditModel.getDraftId());
        String strLJIILL = C1428470nHB.LJIILL(((C857640Xkg) awS258S0300000_14.l0).LJIIJ);
        String strLJIILIIL = C1428470nHB.LJIILIIL(((C857640Xkg) awS258S0300000_14.l0).LJIIJ);
        String musicId = ((C857640Xkg) awS258S0300000_14.l0).LJIIJ.getMusicId();
        boolean zLIZIZ = C857680Xkk.LIZIZ(((C857640Xkg) awS258S0300000_14.l0).LJIIJ);
        c856790XjJ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", creationId);
        c2344009Gk.LJIIIIZZ("shoot_way", str);
        c2344009Gk.LJIIIIZZ("draft_id", strValueOf);
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        c2344009Gk.LJIIIIZZ("content_type", strLJIILL);
        c2344009Gk.LJIIIIZZ("content_source", strLJIILIIL);
        c2344009Gk.LJIIIIZZ("music_id", musicId);
        c2344009Gk.LJIIIIZZ("click_type", "post anyway");
        c2344009Gk.LIZJ(zLIZIZ ? 1 : 0, "is_sub_only_video");
        C20684815ws.LJIILLIIL("sound_copyright_check_post_notice_click", c2344009Gk.LIZ);
        ((InterfaceC856160XiI) awS258S0300000_14.l1).LIZ((AbstractC857240Xk2) awS258S0300000_14.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS258S0300000_14 awS258S0300000_14) {
        C0ZHA c0zha = ((C0ZJR) awS258S0300000_14.l0).LJIJJLI;
        if (c0zha != null) {
            EnumC1643306c3 enumC1643306c3 = (EnumC1643306c3) awS258S0300000_14.l1;
            EnumC1643306c3 enumC1643306c32 = (EnumC1643306c3) awS258S0300000_14.l2;
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJIIJJI();
            C0ZE8.LJIIIIZZ(c0zha.getValue(), enumC1643306c3, enumC1643306c32);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS258S0300000_14 awS258S0300000_14) {
        ((EffectCreationBanStatusViewModel) awS258S0300000_14.l0).LL.observe((LifecycleOwner) awS258S0300000_14.l1, new C513601zK((Function1) awS258S0300000_14.l2, 39));
        EffectCreationBanStatusViewModel effectCreationBanStatusViewModel = (EffectCreationBanStatusViewModel) awS258S0300000_14.l0;
        effectCreationBanStatusViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(effectCreationBanStatusViewModel), null, null, new C860920Xpy(effectCreationBanStatusViewModel, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS258S0300000_14 awS258S0300000_14) {
        Object next;
        InterfaceC877650Ybr interfaceC877650Ybr;
        EnumC877640Ybq enumC877640Ybq;
        MessageRequestTopBarAssem messageRequestTopBarAssem = (MessageRequestTopBarAssem) awS258S0300000_14.l0;
        List list = (List) awS258S0300000_14.l1;
        ArrayList<List> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C888210Yst) it2.next()).getSelectedOptionList());
        }
        messageRequestTopBarAssem.getClass();
        Iterator it3 = ((ArrayList) C15438062q.LJIJJLI(arrayList)).iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (((C888120Ysk) next).LIZIZ instanceof EnumC877640Ybq) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C888120Ysk c888120Ysk = (C888120Ysk) next;
        if (c888120Ysk != null) {
            interfaceC877650Ybr = c888120Ysk.LIZIZ;
        } else {
            interfaceC877650Ybr = null;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (List list2 : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                InterfaceC877650Ybr interfaceC877650Ybr2 = ((C888120Ysk) it4.next()).LIZIZ;
                if ((interfaceC877650Ybr2 instanceof EnumC880570YgZ) && interfaceC877650Ybr2 != null) {
                    arrayList3.add(interfaceC877650Ybr2);
                }
            }
            arrayList2.add(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!((List) obj).isEmpty()) {
                arrayList4.add(obj);
            }
        }
        C878960Ydy c878960Ydy = messageRequestTopBarAssem.op().getState().LLILLL;
        if (c878960Ydy != null) {
            if (!(interfaceC877650Ybr instanceof EnumC877640Ybq) || (enumC877640Ybq = (EnumC877640Ybq) interfaceC877650Ybr) == null) {
                enumC877640Ybq = EnumC877640Ybq.SORT_BY_TIME_RECENT;
            }
            messageRequestTopBarAssem.op().FQ2(C878960Ydy.LIZ(c878960Ydy, new C880430YgL(c878960Ydy.LLILLL, arrayList4), null, enumC877640Ybq, 21), "manual");
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((LinearLayout) awS258S0300000_14.l2, C888230Ysv.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS258S0300000_14 awS258S0300000_14) {
        String str;
        String string;
        final boolean zIsHighRiskConversation;
        int iIntValue;
        String strLIZ;
        final AwemeCardAssem awemeCardAssem = (AwemeCardAssem) awS258S0300000_14.l0;
        final C869590Y9l c869590Y9l = (C869590Y9l) awS258S0300000_14.l1;
        final AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) awS258S0300000_14.l2;
        awemeCardAssem.getClass();
        final BaseUserComponent baseUserComponent = awemeCardTemplate.baseUserComponent;
        String str2 = "";
        if (Intrinsics.LJFF(new Object(baseUserComponent) { // from class: X.0ZYM
            public final BaseUserComponent LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0ZYM) && Intrinsics.LJFF(this.LIZ, ((C0ZYM) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Show(baseUserComponent=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = baseUserComponent;
            }
        }, new Object() { // from class: X.0ZYQ
        })) {
            C786410Ut5.LJLLLLLL(8, awemeCardAssem.Ep());
            C786410Ut5.LJLLLLLL(8, (View) awemeCardAssem.LLL.getValue());
            C786410Ut5.LJLLLLLL(8, (View) awemeCardAssem.LLLIIL.getValue());
        } else {
            C786410Ut5.LJLLLLLL(0, (View) awemeCardAssem.LLJZIJLIL.getValue());
            TuxTextView tuxTextViewEp = awemeCardAssem.Ep();
            String str3 = c869590Y9l.getLocalExt().get("feed_ad_fake_nickname");
            if (str3 == null) {
                TextComponent textComponent = baseUserComponent.nickname;
                if (textComponent != null) {
                    str3 = textComponent.text;
                } else {
                    str3 = null;
                }
            }
            tuxTextViewEp.setText(str3);
            ImageComponent imageComponent = baseUserComponent.avatar;
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(AwemeCardAssem.fq(imageComponent));
            c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
            c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.c5w);
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) awemeCardAssem.LLL.getValue());
            if (imageComponent == null || (str = imageComponent.id) == null) {
                str = "";
            }
            Long l = baseUserComponent.userId;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            C1332130kln.LJ(c1331670kl3LJIIIIZZ, "AvatarOnAwemeVideoCardViewHolder", str, 0, false, new C0I6E(string), null, 220);
            C786410Ut5.LJLLLLLL(0, awemeCardAssem.Ep());
            C786410Ut5.LJLLLLLL(0, (View) awemeCardAssem.LLLIIL.getValue());
        }
        awemeCardAssem.up(C0ZYK.LLILLL);
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            zIsHighRiskConversation = false;
        } else {
            zIsHighRiskConversation = awemeCardAssem.Tp().isHighRiskConversation();
        }
        IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpiForReal(IIMAnalyticsUtil.class);
        if (iIMAnalyticsUtil != null && (strLIZ = iIMAnalyticsUtil.LIZ(awemeCardAssem.Tp().getConversationId())) != null) {
            str2 = strLIZ;
        }
        ImageComponent imageComponent2 = awemeCardTemplate.baseVideoComponent.coverImage;
        AbstractC1335900krs abstractC1335900krs = new AbstractC1335900krs() { // from class: X.0ZYJ
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                String message;
                if (zIsHighRiskConversation) {
                    awemeCardAssem.getClass();
                    awemeCardAssem.aq(R.attr.e1);
                    awemeCardAssem.dq();
                    C786410Ut5.LJLLLLLL(8, (View) awemeCardAssem.LLJZIJLIL.getValue());
                } else {
                    AwemeCardAssem awemeCardAssem2 = awemeCardAssem;
                    awemeCardAssem2.getClass();
                    awemeCardAssem2.aq(R.attr.c7);
                    View view2 = (View) awemeCardAssem2.LLJLLL.getValue();
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    View view3 = (View) awemeCardAssem2.LLJLL.getValue();
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                }
                AwemeCardAssem awemeCardAssem3 = awemeCardAssem;
                if (th == null || (message = th.getMessage()) == null) {
                    message = "";
                }
                awemeCardAssem3.LLLIL.LIZ("aweme_card_assem", new C0ZYR(message));
            }

            /* JADX WARN: Removed duplicated region for block: B:130:0x038a  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x03a5  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x03a8  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x042e  */
            /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
            @Override // X.InterfaceC427850Gq7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Ad(android.net.Uri r17, android.view.View r18, X.C428600GrK r19, android.graphics.drawable.Animatable r20) {
                /*
                    Method dump skipped, instruction units count: 1097
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0ZYJ.Ad(android.net.Uri, android.view.View, X.0GrK, android.graphics.drawable.Animatable):void");
            }
        };
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        Integer numLIZ = C451040HmQ.LIZ(R.attr.c7, awemeCardAssem.LJJIJL().getContext());
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -16776961;
        }
        paint.setColor(iIntValue);
        String str4 = c869590Y9l.getLocalExt().get("video_cover");
        if (str4 != null && str4.length() != 0) {
            C23250099c.LIZLLL(awemeCardAssem, C0PEM.LIZJ, null, new C1325380kau(imageComponent2, c869590Y9l, awemeCardAssem, str4, shapeDrawable, zIsHighRiskConversation, str2, abstractC1335900krs, null), 2);
        } else {
            AwemeCardAssem.Xp(c869590Y9l, awemeCardAssem, shapeDrawable, zIsHighRiskConversation, str2, abstractC1335900krs, AwemeCardAssem.fq(imageComponent2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS258S0300000_14 awS258S0300000_14) {
        return C0TMP.LIZIZ(72, R.attr.a1k, C1383370m6R.LJIIJ(2131831086), C1383370m6R.LJIIJ(2131831087), new AwS223S0300000_14((SkeletonLayoutAssembler) awS258S0300000_14.l0, (C0ZHQ) awS258S0300000_14.l1, (C869590Y9l) awS258S0300000_14.l2, 4));
    }

    public static final Object invoke$7(AwS258S0300000_14 awS258S0300000_14) {
        AssemVMLazy assemVMLazy = (AssemVMLazy) awS258S0300000_14.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C897240ZHu.LLILLL;
        ((WheeExclusiveBubbleMessageListViewModel) assemVMLazy.getValue()).LLILLL = false;
        ((WheeExclusiveBubbleMessageListViewModel) ((AssemVMLazy) awS258S0300000_14.l0).getValue()).LL = null;
        ((WheeExclusiveBubbleMessageListViewModel) ((AssemVMLazy) awS258S0300000_14.l0).getValue()).LLILLJJLI = null;
        ChatNoticeAbility chatNoticeAbility = (ChatNoticeAbility) ((C01GW) awS258S0300000_14.l1).getValue();
        if (chatNoticeAbility != null) {
            chatNoticeAbility.Ff0(EnumC1596306Mv.WHEE_BUBBLE_DIVERSION_CARD);
        }
        ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) ((C01GW) awS258S0300000_14.l2).getValue();
        if (chatroomEventAbility != null) {
            chatroomEventAbility.QU0(new C06P6(false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS258S0300000_14 awS258S0300000_14) {
        ((InboxFilterBarViewModel) awS258S0300000_14.l0).LL.setValue(new Pair<>((FilterTabType) awS258S0300000_14.l1, (Set) awS258S0300000_14.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS258S0300000_14 awS258S0300000_14) {
        ((InterfaceC856160XiI) awS258S0300000_14.l0).LIZJ((C857300Xk8) awS258S0300000_14.l1);
        ((Function0) awS258S0300000_14.l2).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(C857220Xk0 c857220Xk0, C857300Xk8 c857300Xk8, Function0 function0, int i) {
        super(0);
        this.$t = i;
        this.l0 = c857220Xk0;
        this.l1 = c857300Xk8;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(AbstractC857240Xk2 abstractC857240Xk2, C857220Xk0 c857220Xk0, AwS558S0100000_14 awS558S0100000_14, int i) {
        super(0);
        this.$t = i;
        this.l0 = awS558S0100000_14;
        this.l1 = c857220Xk0;
        this.l2 = abstractC857240Xk2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(C857640Xkg c857640Xkg, C857220Xk0 c857220Xk0, AbstractC857240Xk2 abstractC857240Xk2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c857640Xkg;
        this.l1 = c857220Xk0;
        this.l2 = abstractC857240Xk2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(C0Y8T c0y8t, C878470YdB c878470YdB, C878460YdA c878460YdA, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0y8t;
        this.l1 = c878470YdB;
        this.l2 = c878460YdA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(C878590YdN c878590YdN, C877540Ybg c877540Ybg, C0Y8T c0y8t, int i) {
        super(0);
        this.$t = i;
        this.l0 = c878590YdN;
        this.l1 = c877540Ybg;
        this.l2 = c0y8t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(C880930Yh9 c880930Yh9, InterfaceC879010Ye3 interfaceC879010Ye3, C880950YhB c880950YhB, int i) {
        super(0);
        this.$t = i;
        this.l0 = c880930Yh9;
        this.l1 = interfaceC879010Ye3;
        this.l2 = c880950YhB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS258S0300000_14(C882850YkF c882850YkF, C882850YkF c882850YkF2, List<EnumC879080YeA> list, List<EnumC879080YeA> list2) {
        super(0);
        this.$t = list2;
        this.l0 = c882850YkF;
        this.l1 = c882850YkF2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS258S0300000_14(C882870YkH c882870YkH, C882870YkH c882870YkH2, List<EnumC879080YeA> list, List<EnumC879080YeA> list2) {
        super(0);
        this.$t = list2;
        this.l0 = c882870YkH;
        this.l1 = c882870YkH2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(C890540Ywe c890540Ywe, C890020Yvo c890020Yvo, C889910Yvd c889910Yvd, int i) {
        super(0);
        this.$t = i;
        this.l0 = c890540Ywe;
        this.l1 = c890020Yvo;
        this.l2 = c889910Yvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(C0ZJR c0zjr, EnumC1643306c3 enumC1643306c3, EnumC1643306c3 enumC1643306c32, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0zjr;
        this.l1 = enumC1643306c3;
        this.l2 = enumC1643306c32;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS258S0300000_14(AssemVMLazy assemVMLazy, AssemVMLazy<InterfaceC0148002o, WheeExclusiveBubbleMessageListViewModel> assemVMLazy2, C01GW<? extends ChatNoticeAbility> c01gw, C01GW<? extends ChatroomEventAbility> c01gw2) {
        super(0);
        this.$t = c01gw2;
        this.l0 = assemVMLazy;
        this.l1 = assemVMLazy2;
        this.l2 = c01gw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(GECPigeon gECPigeon, IConversationDetailContainer iConversationDetailContainer, PigeonMessageListComponent pigeonMessageListComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = gECPigeon;
        this.l1 = iConversationDetailContainer;
        this.l2 = pigeonMessageListComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS258S0300000_14(EffectCreationBanStatusViewModel effectCreationBanStatusViewModel, EffectCreationBanStatusViewModel effectCreationBanStatusViewModel2, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        super(0);
        this.$t = function1;
        this.l0 = effectCreationBanStatusViewModel;
        this.l1 = effectCreationBanStatusViewModel2;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS258S0300000_14(MessageRequestTopBarAssem messageRequestTopBarAssem, MessageRequestTopBarAssem messageRequestTopBarAssem2, List<C888210Yst> list, LinearLayout linearLayout) {
        super(0);
        this.$t = linearLayout;
        this.l0 = messageRequestTopBarAssem;
        this.l1 = messageRequestTopBarAssem2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(AwemeCardAssem awemeCardAssem, C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate, int i) {
        super(0);
        this.$t = i;
        this.l0 = awemeCardAssem;
        this.l1 = c869590Y9l;
        this.l2 = awemeCardTemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(SkeletonLayoutAssembler skeletonLayoutAssembler, C0ZHQ c0zhq, C869590Y9l c869590Y9l, int i) {
        super(0);
        this.$t = i;
        this.l0 = skeletonLayoutAssembler;
        this.l1 = c0zhq;
        this.l2 = c869590Y9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS258S0300000_14(InboxFilterBarViewModel inboxFilterBarViewModel, InboxFilterBarViewModel inboxFilterBarViewModel2, FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set) {
        super(0);
        this.$t = set;
        this.l0 = inboxFilterBarViewModel;
        this.l1 = inboxFilterBarViewModel2;
        this.l2 = filterTabType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS258S0300000_14(GreetingCardViewModel greetingCardViewModel, GreetingCardViewModel greetingCardViewModel2, C910370ZnX c910370ZnX, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = greetingCardViewModel;
        this.l1 = greetingCardViewModel2;
        this.l2 = c910370ZnX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(Runnable runnable, C1455820nzI c1455820nzI, ARunnableS91S0200000_22 aRunnableS91S0200000_22, int i) {
        super(0);
        this.$t = i;
        this.l0 = runnable;
        this.l1 = c1455820nzI;
        this.l2 = aRunnableS91S0200000_22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS258S0300000_14(List list, List<? extends Object> list2, ReusedSkeletonUISlotAssem<C03H5, Object> reusedSkeletonUISlotAssem, InterfaceC461380I7k interfaceC461380I7k) {
        super(0);
        this.$t = interfaceC461380I7k;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = reusedSkeletonUISlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS258S0300000_14(C878590YdN c878590YdN, C877540Ybg c877540Ybg, List list, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.l1 = c877540Ybg;
        this.l2 = c878590YdN;
    }
}

package kotlin.jvm.internal;

import X.AbstractC1690640u62;
import X.AbstractC738140SxQ;
import X.AbstractDialogInterfaceC1397690mTX;
import X.C06H2;
import X.C06J1;
import X.C06LY;
import X.C06P7;
import X.C06PZ;
import X.C09AY;
import X.C0WZX;
import X.C0YHX;
import X.C0YM2;
import X.C0Z7V;
import X.C1070560dxu;
import X.C11H9;
import X.C12868051u;
import X.C1382705b7;
import X.C13BV;
import X.C13DA;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C1509305vX;
import X.C1558520qew;
import X.C1586906Jf;
import X.C1645906cT;
import X.C1668706g9;
import X.C1689390u41;
import X.C1690050u55;
import X.C1690080u58;
import X.C1697810uHb;
import X.C1733206qY;
import X.C19212010Ec;
import X.C197039127h;
import X.C19EG;
import X.C20441214yg;
import X.C20600815jK;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C291001Au;
import X.C337180DJs;
import X.C339190DRl;
import X.C461720I8s;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC1228990i5R;
import X.EnumC1514605wO;
import X.InterfaceC1891350zJl;
import X.InterfaceC461380I7k;
import X.InterfaceC881630YiH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS102S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AFwS285S0000000_2 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(71);
    public final int $t;

    public static AFwS285S0000000_2 get$arr$(int i) {
        AFwS285S0000000_2 aFwS285S0000000_2 = (AFwS285S0000000_2) arr$.get(i);
        if (aFwS285S0000000_2 != null) {
            return aFwS285S0000000_2;
        }
        arr$.compareAndSet(i, null, new AFwS285S0000000_2(i));
        return (AFwS285S0000000_2) arr$.get(i);
    }

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
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS285S0000000_2(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        boolean zLJJII = C500260Jjc.LJJII(((Number) obj2).intValue());
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (zLJJII) {
            C786410Ut5.LJLLLLLL(4, viewLJJIJL);
        } else {
            C500260Jjc.LLFFF(viewLJJIJL);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        int i = 0;
        if (obj2 != EnumC1228990i5R.PUBLIC_GROUP) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (((Number) obj2).intValue() == 3) {
            View viewFindViewById = uIAssem.LJJIJL().findViewById(R.id.hjo);
            if (viewFindViewById != null) {
                C337180DJs.LIZJ(viewFindViewById);
            }
        } else {
            View viewFindViewById2 = uIAssem.LJJIJL().findViewById(R.id.hjo);
            if (viewFindViewById2 != null) {
                C337180DJs.LIZ(viewFindViewById2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (((Number) obj2).intValue() == 2) {
            View viewFindViewById = uIAssem.LJJIJL().findViewById(R.id.s92);
            if (viewFindViewById != null) {
                C337180DJs.LIZJ(viewFindViewById);
            }
        } else {
            View viewFindViewById2 = uIAssem.LJJIJL().findViewById(R.id.s92);
            if (viewFindViewById2 != null) {
                C337180DJs.LIZ(viewFindViewById2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        String str = (String) obj2;
        TextView textView = (TextView) ((UIAssem) obj).LJJIJL().findViewById(R.id.s8j);
        if (textView != null) {
            textView.setText(str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$14(kotlin.jvm.internal.AFwS285S0000000_2 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.String r5 = (java.lang.String) r5
            com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext r6 = (com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext) r6
            java.lang.Long r0 = r6.currentTimestamp
            r6 = 1
            if (r0 == 0) goto L1a
            long r3 = r0.longValue()
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r5)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L2b
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L1a:
            long r4 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r5)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L2b
            goto L15
        L2b:
            r6 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS285S0000000_2.invoke$14(kotlin.jvm.internal.AFwS285S0000000_2, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$15(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIContentAssem uIContentAssem = (UIContentAssem) obj;
        final AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(uIContentAssem, 428);
        uIContentAssem.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$readReceiptConfig$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C0YHX c0yhxLIZ;
                InterfaceC881630YiH interfaceC881630YiHLJIIIIZZ;
                IIMCoreProxyService iIMCoreProxyService;
                C0YHX c0yhxLIZ2;
                InterfaceC881630YiH interfaceC881630YiHLJIIIIZZ2;
                int i = C1733206qY.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2 && (iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class)) != null && (c0yhxLIZ2 = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (interfaceC881630YiHLJIIIIZZ2 = c0yhxLIZ2.LJIIIIZZ()) != null) {
                        interfaceC881630YiHLJIIIIZZ2.LJFF(awS546S0100000_2);
                        return;
                    }
                    return;
                }
                IIMCoreProxyService iIMCoreProxyService2 = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
                if (iIMCoreProxyService2 == null || (c0yhxLIZ = iIMCoreProxyService2.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) == null || (interfaceC881630YiHLJIIIIZZ = c0yhxLIZ.LJIIIIZZ()) == null) {
                    return;
                }
                interfaceC881630YiHLJIIIIZZ.LJII(awS546S0100000_2);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(828);
        Iterator it2 = ((CopyOnWriteArraySet) C06PZ.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            aFwS229S0000000_2.invoke(it2.next());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        Long lValueOf;
        InterfaceC461380I7k interfaceC461380I7k;
        C869590Y9l c869590Y9l;
        InterfaceC461380I7k interfaceC461380I7k2;
        C869590Y9l c869590Y9l2;
        C11H9 c11h9 = (C11H9) obj2;
        Object objLJJJLL = C13LP.LJJJLL((List) ((C11H9) obj).LIZ);
        Long lValueOf2 = null;
        if ((objLJJJLL instanceof InterfaceC461380I7k) && (interfaceC461380I7k2 = (InterfaceC461380I7k) objLJJJLL) != null && (c869590Y9l2 = interfaceC461380I7k2.LLILII().LIZ.LIZ) != null) {
            lValueOf = Long.valueOf(c869590Y9l2.getMsgId());
        } else {
            lValueOf = null;
        }
        Object objLJJJLL2 = C13LP.LJJJLL((List) c11h9.LIZ);
        if ((objLJJJLL2 instanceof InterfaceC461380I7k) && (interfaceC461380I7k = (InterfaceC461380I7k) objLJJJLL2) != null && (c869590Y9l = interfaceC461380I7k.LLILII().LIZ.LIZ) != null) {
            lValueOf2 = Long.valueOf(c869590Y9l.getMsgId());
        }
        return Boolean.valueOf(Intrinsics.LJFF(lValueOf, lValueOf2));
    }

    public static final Object invoke$18(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((AbstractC738140SxQ) obj).getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$streakConfig$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                IStreakService.LJJIIZ.getClass();
                C06LY.LIZ().j(C06H2.CHAT);
                IStreakPetService.LIZ.getClass();
                C1586906Jf.LIZ().LJIL(EnumC1514605wO.CHAT);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIContentAssem uIContentAssem = (UIContentAssem) obj;
        final ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(C1509305vX.LIZ(new AwS546S0100000_2(uIContentAssem, 446)), 28);
        C06P7.LIZ.getClass();
        C06P7.LIZJ.add(aRunnableS102S0100000_2);
        uIContentAssem.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$locallyDeletedAwemeRefreshConfig$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C06P7 c06p7 = C06P7.LIZ;
                    Runnable runnable = aRunnableS102S0100000_2;
                    c06p7.getClass();
                    C06P7.LIZJ.remove(runnable);
                }
            }
        });
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            int iIntValue = ((Number) c291001Au.LIZ).intValue();
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                C2204961BRm.LLJJJ(c19egLIZ, iIntValue, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdUbKRNqe4YAAC3xnOOPGEOeD2IL5vDz01s0jWNX5rGQ2QfoLvIeRYgMOL790ho1e+Nj8E6TlAK9QIzU92dRKe", null));
                c19egLIZ.finish();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        C869590Y9l c869590Y9l = (C869590Y9l) obj;
        SystemContent.Key key = (SystemContent.Key) obj2;
        if (c869590Y9l != null) {
            if (key.getAction() == 26 || key.getAction() == 200002) {
                IStreakService.LJJIIZ.getClass();
                IStreakService iStreakServiceLIZ = C06LY.LIZ();
                String conversationId = c869590Y9l.getConversationId();
                if (conversationId == null) {
                    conversationId = "";
                }
                return iStreakServiceLIZ.B(conversationId, key);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$22(kotlin.jvm.internal.AFwS285S0000000_2 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            X.0Y9l r3 = (X.C869590Y9l) r3
            com.ss.android.ugc.aweme.im.message.content.SystemContent$Key r4 = (com.ss.android.ugc.aweme.im.message.content.SystemContent.Key) r4
            int r1 = r4.getAction()
            r0 = 200001(0x30d41, float:2.80261E-40)
            if (r1 != r0) goto L30
            X.06LY r0 = com.ss.android.ugc.aweme.im.streak.api.IStreakService.LJJIIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.IStreakService r2 = X.C06LY.LIZ()
            if (r3 == 0) goto L1e
            java.lang.String r1 = r3.getConversationId()
            if (r1 != 0) goto L20
        L1e:
            java.lang.String r1 = ""
        L20:
            java.util.Map r0 = r4.getExtra()
            boolean r0 = r2.h(r1, r0)
            if (r0 != 0) goto L30
            r0 = 1
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L30:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS285S0000000_2.invoke$22(kotlin.jvm.internal.AFwS285S0000000_2, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(kotlin.jvm.internal.AFwS285S0000000_2 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            java.lang.String r3 = (java.lang.String) r3
            com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext r4 = (com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext) r4
            java.lang.String r1 = r4.convId
            java.lang.Integer r0 = r4.streakPetStatus
            r2 = 1
            if (r0 == 0) goto L1a
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r3)
            int r0 = r0.intValue()
            if (r0 != r1) goto L3c
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L1a:
            if (r1 == 0) goto L3c
            int r0 = r1.length()
            if (r0 == 0) goto L3c
            X.06Jf r0 = com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService r0 = X.C1586906Jf.LIZ()
            com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r0 = r0.LIZJ(r1)
            if (r0 == 0) goto L3a
            int r1 = r0.status
        L33:
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r3)
            if (r1 != r0) goto L3c
            goto L15
        L3a:
            r1 = 0
            goto L33
        L3c:
            r2 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS285S0000000_2.invoke$23(kotlin.jvm.internal.AFwS285S0000000_2, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$24(kotlin.jvm.internal.AFwS285S0000000_2 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.String r5 = (java.lang.String) r5
            com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext r6 = (com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext) r6
            java.lang.String r4 = r6.convId
            java.lang.Integer r0 = r6.streakStatus
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r5)
            int r0 = r0.intValue()
            if (r0 != r1) goto L54
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L1b:
            if (r4 == 0) goto L54
            int r0 = r4.length()
            if (r0 == 0) goto L54
            X.06LY r0 = com.ss.android.ugc.aweme.im.streak.api.IStreakService.LJJIIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.streak.api.IStreakService r1 = X.C06LY.LIZ()
            com.ss.android.ugc.aweme.im.streak.api.StreakData r0 = r1.r(r4, r2)
            if (r0 == 0) goto L52
            X.06Gk r2 = r1.o(r0)
            if (r2 == 0) goto L52
            int[] r1 = X.C1579506Gj.LIZ
            int r0 = r2.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L50
            r0 = 2
            if (r1 == r0) goto L50
            int r1 = r2.ordinal()
        L49:
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r5)
            if (r1 != r0) goto L54
            goto L16
        L50:
            r1 = 3
            goto L49
        L52:
            r1 = 0
            goto L49
        L54:
            r3 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS285S0000000_2.invoke$24(kotlin.jvm.internal.AFwS285S0000000_2, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$25(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        Collection collection = (Collection) obj2;
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (viewLJJIJL != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.workbench_filter_list)) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(collection, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        List<? extends IMContact> listLLIIII = C13LP.LLIIII((Set) obj2);
        ICreateGroupAbility iCreateGroupAbility = (ICreateGroupAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) obj), ICreateGroupAbility.class, null);
        if (iCreateGroupAbility != null) {
            iCreateGroupAbility.x9(listLLIIII);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return C13BV.INSTANCE;
    }

    public static final Object invoke$28(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return C13LP.LJLIL((Iterable) obj2, (Collection) obj);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        Object objLIZJ = C12868051u.LIZJ((JSONObject) obj, (String) obj2);
        if (objLIZJ instanceof Boolean) {
            return Integer.valueOf(((Boolean) objLIZJ).booleanValue() ? 1 : 0);
        }
        return objLIZJ;
    }

    public static final Object invoke$31(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return C12868051u.LIZJ((JSONObject) obj, (String) obj2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$32(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        Object objOpt = ((JSONObject) obj).opt((String) obj2);
        if (objOpt == null) {
            objOpt = null;
        }
        if (objOpt instanceof Boolean) {
            return String.valueOf(((Boolean) objOpt).booleanValue());
        }
        if (objOpt instanceof Object[]) {
            return C13LQ.LJJJ((Object[]) objOpt, null, null, null, null, 63);
        }
        if (objOpt instanceof Map) {
            return C786410Ut5.J3(new JSONObject((Map) objOpt));
        }
        if (objOpt instanceof JSONObject) {
            return C786410Ut5.J3((JSONObject) objOpt);
        }
        if (!(objOpt instanceof JSONArray)) {
            return objOpt;
        }
        return ((JSONArray) objOpt).toString();
    }

    public static final Object invoke$33(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$34(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        C197039127h c197039127h;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (viewLJJIJL != null && (c197039127h = (C197039127h) viewLJJIJL.findViewById(R.id.tty)) != null) {
            c197039127h.setEnabled(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$35(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showCombinedMatchPanelDirectly, errorCode = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", message = ");
        sbLIZ.append((String) obj2);
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$37(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            bool.booleanValue();
            ((C197039127h) uIAssem.LJJIJL().findViewById(R.id.ckd)).setEnabled(bool.booleanValue());
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$38(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return Integer.valueOf(((C1689390u41) obj2).LJII());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$4(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$40(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$41(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        return Unit.LIZ;
    }

    public static final Object invoke$42(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((AbstractDialogInterfaceC1397690mTX) obj).LIZIZ(null);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$43(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            View viewFindViewById = uIAssem.LJJIJL().findViewById(R.id.nnp);
            if (viewFindViewById != null) {
                C337180DJs.LIZJ(viewFindViewById);
            }
        } else {
            View viewFindViewById2 = uIAssem.LJJIJL().findViewById(R.id.nnp);
            if (viewFindViewById2 != null) {
                C337180DJs.LIZ(viewFindViewById2);
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$45(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$46(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$47(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$48(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$49(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return Boolean.TRUE;
    }

    public static final Object invoke$50(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return C13LP.LJLIL((Iterable) obj2, (Collection) obj);
    }

    public static final Object invoke$51(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        List list = (List) obj2;
        if (!list.isEmpty()) {
            return list;
        }
        return obj;
    }

    public static final Object invoke$52(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        View viewFindViewById = null;
        if (!((Boolean) obj2).booleanValue()) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.wwq);
            }
            C339190DRl.LIZIZ(viewFindViewById);
        } else {
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById = viewLJJIJL2.findViewById(R.id.wwq);
            }
            C339190DRl.LIZLLL(viewFindViewById);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$53(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$54(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (Intrinsics.LJFF(((C291001Au) obj2).LIZ, Boolean.TRUE)) {
            C339190DRl.LIZLLL(uIAssem.LJJIJL());
        } else {
            C339190DRl.LIZIZ(uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unDoDecoration layout, isSuccess: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", message: ");
        sbLIZ.append((String) obj2);
        C20441214yg.LIZIZ("PlaybookDirector", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$56(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        C197039127h c197039127h;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (viewLJJIJL != null) {
            c197039127h = (C197039127h) viewLJJIJL.findViewById(R.id.cal);
        } else {
            c197039127h = null;
        }
        c197039127h.setEnabled(zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        C1690080u58 c1690080u58 = (C1690080u58) obj2;
        return C1697810uHb.LJIIJJI(Integer.valueOf(c1690080u58.LJII()), Integer.valueOf(c1690080u58.LJIIIIZZ()));
    }

    public static final Object invoke$58(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("friend-rank combined panel lynx error, errorCode: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", message: ");
        sbLIZ.append((String) obj2);
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$59(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$6(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$60(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        FrameLayout frameLayout = null;
        if (((Boolean) obj2).booleanValue()) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                frameLayout = (FrameLayout) viewLJJIJL.findViewById(R.id.u7m);
            }
            C786410Ut5.LJZ(0, frameLayout);
        } else {
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                frameLayout = (FrameLayout) viewLJJIJL2.findViewById(R.id.u7m);
            }
            C786410Ut5.LJZ(8, frameLayout);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$61(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        C1690050u55 c1690050u55 = (C1690050u55) obj2;
        return C1697810uHb.LJIIJJI(Integer.valueOf(c1690050u55.LJI()), Integer.valueOf(c1690050u55.LJII()));
    }

    public static final Object invoke$62(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        C197039127h c197039127h;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (viewLJJIJL != null) {
            c197039127h = (C197039127h) viewLJJIJL.findViewById(R.id.qih);
        } else {
            c197039127h = null;
        }
        c197039127h.setEnabled(zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$63(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        AbstractC1690640u62 abstractC1690640u62 = (AbstractC1690640u62) obj2;
        return C1697810uHb.LJIIJJI(Integer.valueOf(abstractC1690640u62.LJIIIZ()), Float.valueOf(C13LZ.LIZLLL(abstractC1690640u62.LJIIJ(), -0.5f, 0.5f)), Integer.valueOf(abstractC1690640u62.LJIILIIL()));
    }

    public static final Object invoke$64(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        View viewFindViewById = null;
        if (((Boolean) obj2).booleanValue()) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.m7l);
            }
            C337180DJs.LIZJ(viewFindViewById);
        } else {
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById = viewLJJIJL2.findViewById(R.id.m7l);
            }
            C337180DJs.LIZ(viewFindViewById);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        String str = (String) obj2;
        IIMSuggestedStickersAnalytics.LIZ.getClass();
        IIMSuggestedStickersAnalytics iIMSuggestedStickersAnalyticsLIZ = C1645906cT.LIZ();
        if (iIMSuggestedStickersAnalyticsLIZ != null) {
            iIMSuggestedStickersAnalyticsLIZ.LIZJ(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$66(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        String stringExtra;
        String strLIZIZ;
        C0Z7V c0z7vLJIILJJIL;
        Intent intent;
        Context context = (Context) obj;
        boolean zLJFF = Intrinsics.LJFF(obj2, "is_guide");
        Activity activity = null;
        if (context instanceof C19EG) {
            activity = (Activity) context;
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                stringExtra = intent.getStringExtra("previous_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "personal_homepage";
            }
        } else {
            stringExtra = "personal_homepage";
        }
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        c19212010Ec.LJJIZ(context, stringExtra, zLJFF);
        C1070560dxu.LIZ.getClass();
        C13DA c13da = new C13DA();
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService == null || (c0z7vLJIILJJIL = iIMBusinessChatService.LJIILJJIL()) == null || (strLIZIZ = c0z7vLJIILJJIL.LIZIZ(C461720I8s.LIZJ())) == null) {
            strLIZIZ = "";
        }
        c13da.put("account_type", strLIZIZ);
        c13da.put("enter_from", "settings_and_privacy");
        c13da.put("inbox_mode", c19212010Ec.LIZJ().getMobValue());
        c13da.put(Scene.SCENE_SERVICE, "messaging_experience");
        c13da.put("component_field", "content&display");
        c13da.put("previous_page", stringExtra);
        C20684815ws.LJIILLIIL("ttinfra_profile_setting_page_click", c13da.build());
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$67(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$68(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$69(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (obj2 == C06J1.SUCCESS) {
            C500260Jjc.LLFFF(uIAssem.LJJIJL());
        } else {
            C500260Jjc.LJIILIIL(uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return ((C1382705b7) obj2).LIZJ.LIZJ();
    }

    public static final Object invoke$70(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (obj2 == C06J1.FAIL) {
            C500260Jjc.LLFFF(uIAssem.LJJIJL());
        } else {
            C500260Jjc.LJIILIIL(uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return C786410Ut5.j4(((Context) obj).getString(2131835391), Arrays.copyOf(new Object[]{Integer.valueOf(((Number) obj2).intValue())}, 1));
    }

    public static final Object invoke$9(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        return ((Context) obj).getString(2131830891);
    }

    public static final Object invoke$29(AFwS285S0000000_2 aFwS285S0000000_2, Object obj, Object obj2) {
        return obj2;
    }
}

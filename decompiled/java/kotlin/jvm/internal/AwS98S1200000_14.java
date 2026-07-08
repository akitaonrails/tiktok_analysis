package kotlin.jvm.internal;

import X.AbstractC885540Yoa;
import X.AnonymousClass0629;
import X.C013C;
import X.C051M;
import X.C09AY;
import X.C0ET4;
import X.C0I0B;
import X.C0IC5;
import X.C0LAB;
import X.C0SZ4;
import X.C0Y01;
import X.C0Y3J;
import X.C0Y3O;
import X.C0Y3R;
import X.C0Y8T;
import X.C0YHX;
import X.C0YM2;
import X.C0YNP;
import X.C0YOY;
import X.C0YOZ;
import X.C0YP2;
import X.C0Z2F;
import X.C0ZL0;
import X.C1265504xJ;
import X.C13IQ;
import X.C1440005kM;
import X.C1462005nu;
import X.C1496910p3Z;
import X.C1516540pZE;
import X.C1697810uHb;
import X.C1705706m7;
import X.C1729206pu;
import X.C19A3;
import X.C1DRG;
import X.C214848196g;
import X.C2244601CtG;
import X.C291001Au;
import X.C455040Hss;
import X.C459930I1v;
import X.C461720I8s;
import X.C559610Lx9;
import X.C580270MpN;
import X.C747370TTj;
import X.C865340Xx6;
import X.C866530Xz1;
import X.C869590Y9l;
import X.C874730YTf;
import X.C874780YTk;
import X.C874810YTn;
import X.C875420YVw;
import X.C877840YcA;
import X.C880720Ygo;
import X.C880790Ygv;
import X.C885430YoP;
import X.C889060YuG;
import X.C889080YuI;
import X.C890330YwJ;
import X.C890540Ywe;
import X.C890590Ywj;
import X.C893940Z5c;
import X.C893990Z5h;
import X.C894660Z7w;
import X.C898020ZKu;
import X.C904800ZeY;
import X.C904840Zec;
import X.C904950Zen;
import X.C904960Zeo;
import X.C905560Zfm;
import X.C909540ZmC;
import X.EnumC1705606m6;
import X.EnumC868530Y5j;
import X.EnumC880850Yh1;
import X.EnumC904900Zei;
import X.InterfaceC1743406sC;
import X.InterfaceC863600XuI;
import X.InterfaceC884440Ymo;
import X.InterfaceC893080Z1u;
import X.InterfaceC904870Zef;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.GroupDetailFragment;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailApi;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxFilterBarViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tools.chat.demo.AiChatDemoRootScene;
import com.ss.android.ugc.tools.chat.demo.MockCell;
import com.ss.android.ugc.tools.chat.demo.WaitingForReplyCell;
import com.ss.android.ugc.tools.chat.message.component.AiChatMessageInfraComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public class AwS98S1200000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        ((ConcurrentHashMap) ((C909540ZmC) awS98S1200000_14.l1).LIZ).remove(new Pair(awS98S1200000_14.s0, (String[]) awS98S1200000_14.l2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        ((C0Y01) awS98S1200000_14.l1).LIZIZ.invoke(awS98S1200000_14.s0).LJJLIIIJLLLLLLLZ((Map) awS98S1200000_14.l2, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        String str = awS98S1200000_14.s0;
        C0Y3J c0y3j = (C0Y3J) awS98S1200000_14.l1;
        C0Y3O c0y3o = (C0Y3O) awS98S1200000_14.l2;
        c0y3j.getClass();
        ((Map) obj).put(str, C0Y3J.LJIILIIL(c0y3o));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        int i;
        IMAIBotInfo iMAIBotInfo = (IMAIBotInfo) obj;
        if (iMAIBotInfo != null) {
            String strLIZJ = C0YNP.LIZJ(5, String.valueOf(iMAIBotInfo.id));
            String string = awS98S1200000_14.s0;
            if (string == null) {
                int i2 = C1705706m7.LIZ[((EnumC1705606m6) awS98S1200000_14.l1).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        string = null;
                    } else {
                        i = 2131848496;
                    }
                } else {
                    i = 2131848499;
                }
                C0I0B.LJFF.LIZJ();
                string = C894660Z7w.LIZ().getString(i);
            }
            TextContent textContentObtain = TextContent.Companion.obtain(string, null, null, null, null, null);
            EnumC1705606m6 enumC1705606m6 = (EnumC1705606m6) awS98S1200000_14.l1;
            List<C2244601CtG> list = (List) awS98S1200000_14.l2;
            C889060YuG c889060YuG = new C889060YuG();
            c889060YuG.LIZLLL = enumC1705606m6;
            if (list != null) {
                C1516540pZE.LIZ(list);
                c889060YuG.LJ = list;
            }
            C889080YuI c889080YuILIZIZ = c889060YuG.build();
            C1496910p3Z c1496910p3Z = ByteString.Companion;
            C905560Zfm c905560Zfm = new C905560Zfm();
            c905560Zfm.LJIIIIZZ = c889080YuILIZIZ;
            ByteString byteStringLIZJ = C1496910p3Z.LIZJ(c1496910p3Z, c905560Zfm.build().encode());
            if (C455040Hss.LIZ()) {
                C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
                IIMCoreProxyService.LIZ.getClass();
                IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
                if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                    c0yozLJFF.LJI(new C0YP2(new C1265504xJ(strLIZJ), C877840YcA.LIZ(textContentObtain), new C459930I1v(C051M.LJ(textContentObtain, false)), null, null, null, null, byteStringLIZJ, null, null, null, null, 16248), new C0IC5(null, 3), new C0YOY() { // from class: X.0YuJ
                        @Override // X.C0YOY
                        public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                        }
                    });
                }
            } else {
                CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                c874730YTfLIZ.LIZIZ.LJFF = strLIZJ;
                c874730YTfLIZ.LIZIZ(textContentObtain);
                c874730YTfLIZ.LIZIZ.LJIIJ = byteStringLIZJ;
                c874730YTfLIZ.LJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        List<C880720Ygo> list;
        Integer num;
        C747370TTj c747370TTj = (C747370TTj) obj;
        C890540Ywe c890540Ywe = (C890540Ywe) awS98S1200000_14.l1;
        C890590Ywj c890590Ywj = c890540Ywe.LLJJIJI;
        if (c890590Ywj != null && (list = c890590Ywj.LLILZ) != null) {
            String str = awS98S1200000_14.s0;
            C013C c013c = (C013C) awS98S1200000_14.l2;
            Iterator<C880720Ygo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C880720Ygo next = it2.next();
                Object obj2 = c747370TTj.LIZLLL;
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                int value = next.LIZ.getValue();
                if (num != null && num.intValue() == value) {
                    InboxFilterBarViewModel inboxFilterBarViewModel = (InboxFilterBarViewModel) c890540Ywe.LLJJIJIIJIL.getValue();
                    if (inboxFilterBarViewModel != null) {
                        inboxFilterBarViewModel.wQ2(false, Collections.singleton(next.LIZ));
                    }
                    IMChatListApi.LJJIII.getClass();
                    C890330YwJ.LIZ().LIZIZ().LIZJ("notification_page", "option_select", str, next.LIZ.getMobValue(), next.LIZ.getMobValue());
                    c013c.element = true;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS98S1200000_14.l1;
        c0sz4.LLIZLLLIL = R.id.k6z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final String str = awS98S1200000_14.s0;
        GroupDetailFragment groupDetailFragment = (GroupDetailFragment) awS98S1200000_14.l2;
        linkedHashMap.put("key_conversation_id", str);
        final C0Z2F c0z2f = (C0Z2F) groupDetailFragment.LLJ.getValue();
        linkedHashMap.put("key_action_data_source", new InterfaceC893080Z1u(c0z2f, str) { // from class: X.0Z1w
            public final C0Z1N LL;
            public final C0Z2D LLILLJJLI;

            @Override // X.InterfaceC893080Z1u
            public final C0Z1M LJJJJ() {
                return null;
            }

            @Override // X.InterfaceC893080Z1u
            public final void LJI() {
                this.LL.LJI();
                this.LLILLJJLI.LJI();
            }

            @Override // X.InterfaceC893080Z1u
            public final void register() {
                this.LL.register();
                this.LLILLJJLI.register();
            }

            @Override // X.InterfaceC893080Z1u
            public final InterfaceC893120Z1y LJIIZILJ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC893080Z1u
            public final C0Z1N LJJJ() {
                return this.LL;
            }

            {
                IChatDetailApi.LIZ.getClass();
                this.LL = C04TC.LIZIZ.getValue().LIZ(str);
                this.LLILLJJLI = new C0Z2D(c0z2f, str);
            }
        });
        c0sz4.LLILZ = linkedHashMap;
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C0Y8T c0y8t = (C0Y8T) awS98S1200000_14.l1;
        String str = awS98S1200000_14.s0;
        Activity activity = (Activity) awS98S1200000_14.l2;
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        C1440005kM.LIZ(new C893940Z5c(true));
        c866530Xz1LIZIZ.LJI(new C893990Z5h(c0y8t, activity));
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_leave_pop", new Pair[]{new Pair("result", "leave"), new Pair("enter_from", "group_setting")}, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C0Y8T c0y8t = (C0Y8T) awS98S1200000_14.l1;
        String str = awS98S1200000_14.s0;
        Activity activity = (Activity) awS98S1200000_14.l2;
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        C1440005kM.LIZ(new C893940Z5c(true));
        c866530Xz1LIZIZ.LJI(new C893990Z5h(c0y8t, activity));
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_leave_pop", new Pair[]{new Pair("result", "leave"), new Pair("enter_from", "group_setting")}, C0I0B.LJFF.LIZIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZ().LJIILLIIL(((View) obj).getContext(), (C869590Y9l) awS98S1200000_14.l1, false, "long_press");
        ((C898020ZKu) awS98S1200000_14.l2).LJII((C869590Y9l) awS98S1200000_14.l1, awS98S1200000_14.s0);
        ((C898020ZKu) awS98S1200000_14.l2).LJ(C0ZL0.DISLIKE, null);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZ().LJIILLIIL(((View) obj).getContext(), (C869590Y9l) awS98S1200000_14.l1, true, "long_press");
        ((C898020ZKu) awS98S1200000_14.l2).LJII((C869590Y9l) awS98S1200000_14.l1, awS98S1200000_14.s0);
        ((C898020ZKu) awS98S1200000_14.l2).LJ(C0ZL0.LIKE, null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        ((C865340Xx6) awS98S1200000_14.l1).LIZIZ.invoke(awS98S1200000_14.s0).LL((EnumC868530Y5j) awS98S1200000_14.l2, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C19A3 c19a3 = (C19A3) ((AiChatDemoRootScene) awS98S1200000_14.l2).LLJJJIL.getValue();
        C904840Zec c904840Zec = new C904840Zec(new C904800ZeY(UUID.randomUUID().toString(), awS98S1200000_14.s0));
        c904840Zec.LIZIZ = C1697810uHb.LJIIJJI(new InterfaceC904870Zef<EnumC904900Zei, C904950Zen>() { // from class: X.0Zeh
            public final C904910Zej LIZ = new C904910Zej(AFwS248S0000000_14.get$arr$(3));
            public final Class<? extends PowerCell<C904950Zen>> LIZIZ = WaitingForReplyCell.class;
            public final C904920Zek LIZJ = C904920Zek.LIZ;

            @Override // X.InterfaceC904870Zef
            public final C904850Zed convert() {
                return new C904850Zed(this);
            }

            @Override // X.InterfaceC904870Zef
            public final InterfaceC904940Zem<C904950Zen> LLLLIILLL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC904870Zef
            public final /* bridge */ /* synthetic */ C904910Zej LLLLIL() {
                return this.LIZ;
            }

            @Override // X.InterfaceC904870Zef
            public final Enum getInterceptOrdering() {
                return EnumC904900Zei.DEMO_MESSAGE;
            }

            @Override // X.InterfaceC904870Zef
            public final Class<? extends PowerCell<C904950Zen>> getWithCell() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC904870Zef
            public final List<C898770ZNr> intercept(List<C898770ZNr> list) {
                ArrayList arrayList = (ArrayList) list;
                if (arrayList.isEmpty()) {
                    return C13BV.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((C898770ZNr) obj2).LIZIZ() == 1819) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }, new InterfaceC904870Zef<EnumC904900Zei, C904960Zeo>() { // from class: X.0Zeg
            public final C904910Zej LIZ = new C904910Zej(AFwS248S0000000_14.get$arr$(4));
            public final Class<? extends PowerCell<C904960Zeo>> LIZIZ = MockCell.class;
            public final C904930Zel LIZJ = C904930Zel.LIZ;

            @Override // X.InterfaceC904870Zef
            public final C904850Zed convert() {
                return new C904850Zed(this);
            }

            @Override // X.InterfaceC904870Zef
            public final InterfaceC904940Zem<C904960Zeo> LLLLIILLL() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC904870Zef
            public final /* bridge */ /* synthetic */ C904910Zej LLLLIL() {
                return this.LIZ;
            }

            @Override // X.InterfaceC904870Zef
            public final Enum getInterceptOrdering() {
                return EnumC904900Zei.MOCK_MESSAGE;
            }

            @Override // X.InterfaceC904870Zef
            public final Class<? extends PowerCell<C904960Zeo>> getWithCell() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC904870Zef
            public final List<C898770ZNr> intercept(List<C898770ZNr> list) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                while (arrayList.size() < 10) {
                    C869680Y9u c869680Y9u = new C869680Y9u(C866950Xzh.LIZLLL(C461720I8s.LIZIZ()), C461720I8s.LIZ());
                    c869680Y9u.msgType(1819);
                    c869680Y9u.content("");
                    arrayList.add(new C898770ZNr(c869680Y9u.build()));
                }
                return arrayList;
            }
        });
        AiChatMessageInfraComponent aiChatMessageInfraComponent = new AiChatMessageInfraComponent(c19a3, (C1DRG) obj, c904840Zec);
        ((C559610Lx9) awS98S1200000_14.l1).getClass();
        aiChatMessageInfraComponent.afterInit$als_release(jUptimeMillis);
        return aiChatMessageInfraComponent;
    }

    public static final Object invoke$4(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        int iLJFF;
        C1729206pu c1729206pu = (C1729206pu) obj;
        C291001Au c291001Au = new C291001Au(new ArrayList((List) awS98S1200000_14.l1));
        C0Z2F c0z2f = (C0Z2F) ((GroupDetailViewModel) awS98S1200000_14.l2).LLJI.getValue();
        int iLIZLLL = 0;
        if (c0z2f != null) {
            iLJFF = c0z2f.LJFF(Long.valueOf(C461720I8s.LIZJ()), awS98S1200000_14.s0);
        } else {
            iLJFF = 0;
        }
        C0Z2F c0z2f2 = (C0Z2F) ((GroupDetailViewModel) awS98S1200000_14.l2).LLJI.getValue();
        if (c0z2f2 != null) {
            iLIZLLL = c0z2f2.LIZLLL(((GroupDetailViewModel) awS98S1200000_14.l2).vQ2());
        }
        return C1729206pu.LIZ(c1729206pu, null, false, null, null, null, null, null, c291001Au, iLJFF, 0, iLIZLLL, null, null, false, 14975);
    }

    public static final Object invoke$5(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C885430YoP c885430YoP = (C885430YoP) obj;
        C880790Ygv c880790Ygv = C880790Ygv.LIZ;
        List list = (List) awS98S1200000_14.l1;
        List<AbstractC885540Yoa<?>> list2 = c885430YoP.LLILLJJLI;
        EnumC880850Yh1 enumC880850Yh1 = c885430YoP.LL;
        String str = awS98S1200000_14.s0;
        boolean z = ((MessageRequestListVMV2) awS98S1200000_14.l2).LLIZLLLIL;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((MessageRequestListVMV2) awS98S1200000_14.l2, 1299);
        c880790Ygv.getClass();
        return C885430YoP.LIZ(c885430YoP, null, C880790Ygv.LIZ(list, list2, enumC880850Yh1, str, z, awS558S0100000_14), null, null, null, false, null, 125);
    }

    public static final Object invoke$6(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C885430YoP c885430YoP = (C885430YoP) obj;
        C880790Ygv c880790Ygv = C880790Ygv.LIZ;
        List list = (List) awS98S1200000_14.l1;
        List<AbstractC885540Yoa<?>> list2 = c885430YoP.LLILZIL;
        EnumC880850Yh1 enumC880850Yh1 = c885430YoP.LL;
        String str = awS98S1200000_14.s0;
        boolean z = ((MessageRequestListVMV2) awS98S1200000_14.l2).LLIZLLLIL;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((MessageRequestListVMV2) awS98S1200000_14.l2, 1294);
        c880790Ygv.getClass();
        return C885430YoP.LIZ(c885430YoP, null, null, null, null, C880790Ygv.LIZ(list, list2, enumC880850Yh1, str, z, awS558S0100000_14), false, null, 111);
    }

    public static final Object invoke$7(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C885430YoP c885430YoP = (C885430YoP) obj;
        return C885430YoP.LIZ(c885430YoP, null, ((MessageRequestListVM) awS98S1200000_14.l1).LQ2((List) awS98S1200000_14.l2, c885430YoP.LLILLJJLI, c885430YoP.LL, awS98S1200000_14.s0), null, null, null, false, null, 125);
    }

    public static final Object invoke$8(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C885430YoP c885430YoP = (C885430YoP) obj;
        return C885430YoP.LIZ(c885430YoP, null, null, null, null, ((MessageRequestListVM) awS98S1200000_14.l1).LQ2((List) awS98S1200000_14.l2, c885430YoP.LLILZIL, c885430YoP.LL, awS98S1200000_14.s0), false, null, 111);
    }

    public static final Object invoke$9(AwS98S1200000_14 awS98S1200000_14, Object obj) {
        C0LAB c0lab = (C0LAB) ((Function1) awS98S1200000_14.l1).invoke(obj);
        c0lab.LJ("mix_type", "photo");
        c0lab.LIZ(1, "is_multi_content");
        C580270MpN.LIZJ(((C214848196g) awS98S1200000_14.l2).LIZ, c0lab, awS98S1200000_14.s0);
        return c0lab;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1200000_14(EnumC1705606m6 enumC1705606m6, String str, List list, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = enumC1705606m6;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1200000_14(C865340Xx6 c865340Xx6, String str, EnumC868530Y5j enumC868530Y5j, int i) {
        super(1);
        this.$t = i;
        this.l1 = c865340Xx6;
        this.s0 = str;
        this.l2 = enumC868530Y5j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S1200000_14(C0Y01 c0y01, C0Y01 c0y012, String str, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l1 = c0y01;
        this.s0 = c0y012;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1200000_14(C0Y8T c0y8t, String str, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l1 = c0y8t;
        this.s0 = str;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1200000_14(C869590Y9l c869590Y9l, C898020ZKu c898020ZKu, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c869590Y9l;
        this.l2 = c898020ZKu;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1200000_14(C890540Ywe c890540Ywe, String str, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l1 = c890540Ywe;
        this.s0 = str;
        this.l2 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1200000_14(C909540ZmC c909540ZmC, String str, String[] strArr, int i) {
        super(1);
        this.$t = i;
        this.l1 = c909540ZmC;
        this.s0 = str;
        this.l2 = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S1200000_14(C13IQ c13iq, C13IQ<? extends UISlotAssem> c13iq2, String str, GroupDetailFragment groupDetailFragment) {
        super(1);
        this.$t = groupDetailFragment;
        this.l1 = c13iq;
        this.s0 = c13iq2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S1200000_14(MessageRequestListVM messageRequestListVM, MessageRequestListVM messageRequestListVM2, List<? extends InterfaceC884440Ymo> list, String str) {
        super(1);
        this.$t = str;
        this.l1 = messageRequestListVM;
        this.l2 = messageRequestListVM2;
        this.s0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1200000_14(String str, C0Y3J c0y3j, C0Y3R c0y3r, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0y3j;
        this.l2 = c0y3r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S1200000_14(List list, List<C1462005nu> list2, GroupDetailViewModel groupDetailViewModel, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.l2 = list2;
        this.s0 = groupDetailViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S1200000_14(List list, List<? extends InterfaceC884440Ymo> list2, String str, MessageRequestListVMV2 messageRequestListVMV2) {
        super(1);
        this.$t = messageRequestListVMV2;
        this.l1 = list;
        this.s0 = list2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S1200000_14(Function1 function1, Function1<? super C0LAB, ? extends C0LAB> function12, C214848196g c214848196g, String str) {
        super(1);
        this.$t = str;
        this.l1 = function1;
        this.l2 = function12;
        this.s0 = c214848196g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1200000_14(C0ET4 c0et4, C559610Lx9 c559610Lx9, AiChatDemoRootScene aiChatDemoRootScene, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c559610Lx9;
        this.l2 = aiChatDemoRootScene;
        this.s0 = str;
    }
}

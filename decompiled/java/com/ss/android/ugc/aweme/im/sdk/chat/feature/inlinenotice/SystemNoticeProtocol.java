package com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C06XO;
import X.C06XP;
import X.C06Y7;
import X.C123100dR;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1622006Ws;
import X.C1622206Wu;
import X.C1622306Wv;
import X.C1769006wK;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C875230YVd;
import X.C898790ZNt;
import X.C902730ZbD;
import X.C987103tV;
import X.InterfaceC1411705fn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissContext;
import com.ss.android.ugc.aweme.im.message.content.utils.SystemContentDismissUtil;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.messagelist.api.notice.protocol.ISystemNoticeDisplayProtocol;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemNoticeProtocol implements IMMessageListProtocol<C06XO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C898790ZNt LLILLL;
    public final Class<SystemNoticePowerCell> LLILZ;
    public final MessageListProtocolEnum LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SystemNoticeProtocol.class, "streakVM", "getStreakVM()Lcom/ss/android/ugc/aweme/im/service/viewmodel/ChatRoomStreakViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C06XO> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C06XO> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<SystemNoticePowerCell> getWithCell() {
        return this.LLILZ;
    }

    public SystemNoticeProtocol(Fragment fragment) {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatRoomStreakViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 370);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(267);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragment, 371), aFwS229S0000000_2, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS546S0100000_2, new AwS546S0100000_2(fragment, 372), aFwS229S0000000_2, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) fragment, 373), aFwS229S0000000_2, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(478));
        this.LLILLL = new C898790ZNt(Arrays.copyOf(new int[]{1, 4007, 4008, 4011, 4010, 4043, 4013, 4050, 100000, 4044, 4052, 4054, 4055, 4058, 4084, 4056, 4064, 4065, 4066, 4069, 4070, 4072, 4073}, 23));
        this.LLILZ = SystemNoticePowerCell.class;
        this.LLILZIL = MessageListProtocolEnum.SYSTEM_NOTICE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        Object next;
        String conversationId;
        InterfaceC1411705fn interfaceC1411705fn;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        long jCurrentTimeMillis3;
        SystemContent systemContentLIZ;
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C123100dR.LIZ(((C869590Y9l) next).getConversationId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C869590Y9l c869590Y9l = (C869590Y9l) next;
        if (c869590Y9l == null || (conversationId = c869590Y9l.getConversationId()) == null) {
            conversationId = "";
        }
        int i = 1;
        if (conversationId.length() == 0 || (interfaceC1411705fn = (InterfaceC1411705fn) this.LLILLJJLI.getValue()) == null) {
            return list;
        }
        IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
        if (iMHostApi != null) {
            jCurrentTimeMillis = iMHostApi.LIZIZ();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (interfaceC1411705fn.LIZIZ(jCurrentTimeMillis, conversationId)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C869590Y9l c869590Y9l2 = (C869590Y9l) obj;
            if (c869590Y9l2.getMsgType() == i && (systemContentLIZ = C06Y7.LIZ(c869590Y9l2)) != null) {
                SystemContent.Key[] template = systemContentLIZ.getTemplate();
                if (template != null) {
                    int length = template.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (template[i2].getActionDismissConditions() != null) {
                            AssemVMLazy assemVMLazy = this.LL;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
                            ((ChatRoomStreakViewModel) assemVMLazy.getValue()).LLJ.add(c869590Y9l2.getUuid());
                            break;
                        }
                        i2++;
                    }
                }
                List<Map<String, String>> msgDismissConditions = systemContentLIZ.getMsgDismissConditions();
                if (msgDismissConditions != null) {
                    if (SystemContentDismissUtil.INSTANCE.shouldDismiss(new SystemContentDismissContext(c869590Y9l2.getConversationId(), null, null, null), msgDismissConditions)) {
                        C875230YVd.LIZ(c869590Y9l2, false, new C1769006wK(c869590Y9l2, this, 3));
                        i = 1;
                    } else {
                        AssemVMLazy assemVMLazy2 = this.LL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILZLL;
                        ((ChatRoomStreakViewModel) assemVMLazy2.getValue()).LLIZLLLIL.add(c869590Y9l2.getUuid());
                    }
                }
            }
            i = 1;
            arrayList.add(obj);
        }
        IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
        if (iMHostApi2 != null) {
            jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
        } else {
            jCurrentTimeMillis2 = System.currentTimeMillis();
        }
        IMHostApi iMHostApi3 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
        if (iMHostApi3 != null) {
            jCurrentTimeMillis3 = iMHostApi3.LIZIZ();
        } else {
            jCurrentTimeMillis3 = System.currentTimeMillis();
        }
        interfaceC1411705fn.LIZLLL(jCurrentTimeMillis2, jCurrentTimeMillis3, conversationId);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        float f;
        Object next;
        C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLZIJ(i - 1, list);
        if (c869590Y9l2 != null && c869590Y9l2.getMsgType() == 7) {
            f = 18.0f;
        } else {
            f = 0.0f;
        }
        SystemContent systemContentLIZ = C06Y7.LIZ(c869590Y9l);
        C1622306Wv c1622306WvFg1 = null;
        if (systemContentLIZ == null) {
            return new C06XO(new C06XP(c869590Y9l), null, null, f);
        }
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, ISystemNoticeDisplayProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((ISystemNoticeDisplayProtocol) next).Pe0(systemContentLIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ISystemNoticeDisplayProtocol iSystemNoticeDisplayProtocol = (ISystemNoticeDisplayProtocol) next;
            if (iSystemNoticeDisplayProtocol != null) {
                c1622306WvFg1 = iSystemNoticeDisplayProtocol.Fg1(c869590Y9l, systemContentLIZ);
            }
        }
        return new C06XO(new C06XP(c869590Y9l), new C1622006Ws(systemContentLIZ), c1622306WvFg1, f);
    }
}

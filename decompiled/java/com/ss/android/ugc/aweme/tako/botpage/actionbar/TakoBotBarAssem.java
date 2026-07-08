package com.ss.android.ugc.aweme.tako.botpage.actionbar;

import X.AbstractC1863870ybR;
import X.AbstractC1863890ybT;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C1155550gAz;
import X.C123100dR;
import X.C13LC;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1860520yW2;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1863860ybQ;
import X.C19719912Dl;
import X.C20232214Em;
import X.C20235014Fo;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C597050NbL;
import X.C723580SZw;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS129S0200000_27;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoBotBarAssem extends TakoBottomBarAssem<TakoActiveBotItem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final AssemVMLazy LLJLL;
    public final C1559260qg8 LLJLLIL;
    public final C01GW LLJLLL;
    public long LLJZ;
    public final int LLJZIJLIL;
    public volatile boolean LLL;
    public AnonymousClass0956 LLLF;
    public final List<TakoBotInfo> LLLFF;
    public long LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoBotBarAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoBotBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1216), AFwS264S0000000_24.get$arr$(416), null, true);
        this.LLJLLIL = new C1559260qg8(new C723580SZw(this, C1155550gAz.class, null), checkSupervisorPrepared());
        this.LLJLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1215));
        this.LLJZIJLIL = 500;
        this.LLLFF = new ArrayList();
        this.LLLFFI = -1L;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final synchronized void mp() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (this.LLL) {
            return;
        }
        this.LLL = true;
        List<TakoBotInfo> list = C1860520yW2.LIZ.LJIIIIZZ().botInfos;
        C1155550gAz c1155550gAz = (C1155550gAz) this.LLJLLIL.getValue();
        op(context, lp(list, c1155550gAz != null ? c1155550gAz.LL : null), true);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        sp((TakoActiveBotItem) this.LLJJIJIL);
        super.onPause();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        TakoActiveBotItem takoActiveBotItem;
        super.onResume();
        if (this.LLLFFI > 0 || (takoActiveBotItem = (TakoActiveBotItem) this.LLJJIJIL) == null || !takoActiveBotItem.isActive()) {
            return;
        }
        this.LLLFFI = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.actionbar.TakoBottomBarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJLLL.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.Gn2(new AwS582S0100000_3(this, 92));
        }
        IMessageAbility iMessageAbility2 = (IMessageAbility) this.LLJLLL.getValue();
        if (iMessageAbility2 != null) {
            iMessageAbility2.cE2(new AwS582S0100000_3(this, 93));
        }
        IMessageAbility iMessageAbility3 = (IMessageAbility) this.LLJLLL.getValue();
        if (iMessageAbility3 != null) {
            iMessageAbility3.B82(new AwS606S0100000_27(this, 365));
        }
    }

    public final void sp(TakoActiveBotItem takoActiveBotItem) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        if (takoActiveBotItem == null || !takoActiveBotItem.isActive() || this.LLLFFI <= 0) {
            return;
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str = c1863850ybP.LLILZIL;
            String str2 = c1863850ybP.LL;
            String str3 = c1863850ybP.LLILLJJLI;
            String str4 = c1863850ybP.LLILZLL;
            if (str4 == null) {
                str4 = "";
            }
            long j = c1863850ybP.LLJILLL;
            long j2 = takoActiveBotItem.bot.botId;
            String str5 = takoActiveBotItem.enterMethod;
            String str6 = takoActiveBotItem.processId;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLFFI;
            String str7 = c1863850ybP.LLIZ;
            Long lValueOf = Long.valueOf(j2);
            Long lValueOf2 = Long.valueOf(j);
            Long lValueOf3 = Long.valueOf(jCurrentTimeMillis);
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str), new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str7));
            if (lValueOf != null && lValueOf.longValue() > 0) {
                lValueOf.longValue();
                mapLJIIJ.put("bot_id", lValueOf.toString());
            }
            if (lValueOf2 != null && lValueOf2.longValue() > 0) {
                lValueOf2.longValue();
                mapLJIIJ.put("action_item_id", lValueOf2.toString());
            }
            if (str5 != null && C123100dR.LIZ(str5)) {
                mapLJIIJ.put("sub_enter_method", str5);
            }
            if (str6 != null && C123100dR.LIZ(str6)) {
                mapLJIIJ.put("sub_process_id", str6);
            }
            if (lValueOf3 != null && lValueOf3.longValue() > 0) {
                mapLJIIJ.put("duration", String.valueOf(lValueOf3.longValue()));
            }
            c20235014FoLIZ.LIZ("tikbot_sub_chat_stay_time", mapLJIIJ);
        }
        this.LLLFFI = -1L;
    }

    public static List lp(List list, TakoBotInfo takoBotInfo) {
        if (takoBotInfo != null && takoBotInfo.botId != 1 && 1 != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((TakoBotInfo) next).botId == takoBotInfo.botId) {
                    if (next != null) {
                        arrayList.add(next);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (((TakoBotInfo) obj).botId != takoBotInfo.botId) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList.addAll(arrayList2);
                        return arrayList;
                    }
                }
            }
            if (takoBotInfo.botName.length() > 0 && takoBotInfo.botAvatar.length() > 0) {
                arrayList.add(takoBotInfo);
                arrayList.addAll(list);
                return arrayList;
            }
            return list;
        }
        return list;
    }

    public final void op(final Context context, List<TakoBotInfo> list, boolean z) {
        TakoActiveBotItem takoActiveBotItem;
        AbstractC1863870ybR c1863860ybQ;
        ((ArrayList) this.LLLFF).clear();
        ((ArrayList) this.LLJJIJIIJIL).clear();
        int i = 0;
        for (TakoBotInfo takoBotInfo : list) {
            int i2 = i + 1;
            if (i >= 0) {
                TakoBotInfo takoBotInfo2 = takoBotInfo;
                int i3 = takoBotInfo2.botMode;
                if (i3 != 1) {
                    if (i3 == 2) {
                        c1863860ybQ = new C1863860ybQ(context);
                        c1863860ybQ.setRenderData(new C20232214Em(takoBotInfo2, String.valueOf(i)));
                    } else {
                        i = i2;
                    }
                } else {
                    c1863860ybQ = new AbstractC1863870ybR(context) { // from class: X.0zD7
                        {
                            super(context, null, 0);
                            TuxTextView exit = getExit();
                            if (exit != null) {
                                C786410Ut5.LLLLZLL(exit, 8);
                            }
                            TuxTextView name = getName();
                            if (name != null) {
                                C786410Ut5.h9(name, new ACListenerS129S0200000_27(context, this, 31));
                            }
                        }
                    };
                    c1863860ybQ.setRenderData(new C20232214Em(takoBotInfo2, String.valueOf(i)));
                }
                ((ArrayList) this.LLLFF).add(takoBotInfo2);
                ((ArrayList) this.LLJJIJIIJIL).add(c1863860ybQ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        hp();
        if (z && (takoActiveBotItem = (TakoActiveBotItem) this.LLJJIJIL) != null && takoActiveBotItem.isActive() && (!((ArrayList) this.LLJJIJIIJIL).isEmpty())) {
            Iterator it2 = ((ArrayList) this.LLJJIJIIJIL).iterator();
            while (it2.hasNext()) {
                ((AbstractC1863890ybT) it2.next()).LIZIZ(this.LLJJIJIL);
            }
            ip(this.LLJJIJIL);
        }
    }
}

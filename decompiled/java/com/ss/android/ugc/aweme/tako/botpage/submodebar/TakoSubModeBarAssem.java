package com.ss.android.ugc.aweme.tako.botpage.submodebar;

import X.C019F;
import X.C01GW;
import X.C04JC;
import X.C09R3;
import X.C0DSB;
import X.C0Q4Y;
import X.C0R2Q;
import X.C13LC;
import X.C13LE;
import X.C15438062q;
import X.C1558520qew;
import X.C1561220qjI;
import X.C1637806bA;
import X.C1637906bB;
import X.C1852690yJP;
import X.C1852820yJc;
import X.C1854130yLj;
import X.C1854150yLl;
import X.C1854490yMJ;
import X.C1854530yMN;
import X.C1855760yOM;
import X.C1860410yVr;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC1854550yMP;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.skilllabel.TakoInputSkillLabelViewModel;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ActionBarItemList;
import com.ss.android.ugc.aweme.tako.ccl.model.api.NewActionBarItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSubModeBarAssem extends UISlotAssem implements TakoSubModeBarAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public List<C1854150yLl> LLJJIII = new ArrayList();
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C1854150yLl LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSubModeBarAssem.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/tako/otherpage/sheet/TakoSheetVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoSubModeBarAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(TakoSubModeBarAssem.class, "messageModel", "getMessageModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(TakoSubModeBarAssem.class, "skillLabelViewModel", "getSkillLabelViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/skilllabel/TakoInputSkillLabelViewModel;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public TakoSubModeBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoSheetVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1278), AFwS269S0000000_27.get$arr$(226), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1279), AFwS269S0000000_27.get$arr$(227), null, true);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 814));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MessageViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ3, 1280), AFwS269S0000000_27.get$arr$(228), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1277));
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS264S0000000_24.get$arr$(437));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TakoInputSkillLabelViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bBLIZ, new AwS568S0100000_24(c19719912DlLIZ4, 1281), AFwS269S0000000_27.get$arr$(229), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fl8;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 583447868) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void qW1() {
        DF0(null);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void zJ0() {
        DF0(null);
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.MB1(null);
        }
        this.LLJJJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final List<C1854150yLl> E12() {
        List<C1854150yLl> list = this.LLJJIII;
        ArrayList arrayList = new ArrayList();
        for (C1854150yLl c1854150yLl : list) {
            if (c1854150yLl != null) {
                arrayList.add(c1854150yLl);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void Sd1() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
        }
        this.LLJJJ = false;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void br0() {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C0DSB.LIZIZ(view);
        }
        this.LLJJJIL = false;
    }

    public final TakoInputViewUIAbility ip() {
        return (TakoInputViewUIAbility) this.LLJJJJLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void kN2() {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C0DSB.LIZJ(view);
        }
        C1854150yLl c1854150yLl = this.LLJL;
        if (c1854150yLl != null) {
            kp(c1854150yLl);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void mJ1() {
        C20600815jK<InterfaceC1891350zJl> state;
        List<C1854150yLl> list = this.LLJJIII;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1854150yLl c1854150yLlLIZ : (ArrayList) list) {
            if (c1854150yLlLIZ != null && c1854150yLlLIZ.LL == 1 && c1854150yLlLIZ.LLJILJILJ) {
                DF0(null);
                c1854150yLlLIZ = C1854150yLl.LIZ(c1854150yLlLIZ, false, null, false, 1073737727);
            }
            arrayList.add(c1854150yLlLIZ);
        }
        this.LLJJIII = new ArrayList(arrayList);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return;
        }
        state.LJIILL(this.LLJJIII, null);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void CE() {
        View viewVl2;
        ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoChatPageAbility.class, null);
        if (iTakoChatPageAbility != null && (viewVl2 = iTakoChatPageAbility.Vl2()) != null) {
            C786410Ut5.LJLLLLLL(0, viewVl2);
        }
        if (this.LLJJIJIL) {
            this.LLJJJ = true;
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void Qo2() {
        if (C0R2Q.LIZ(C1854130yLj.LIZ()) == 5) {
            DF0(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void dy1() {
        if (C0R2Q.LIZ(C1854130yLj.LIZ()) == 4) {
            DF0(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.submodebar.TakoSubModeBarAbility
    public final void jA2() {
        if (C0R2Q.LIZ(C1854130yLj.LIZ()) == 6) {
            DF0(null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void DF0(C1854150yLl c1854150yLl) {
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.DF0(c1854150yLl);
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null) {
            iTakoContextAbility.PG0(new C1855760yOM(c1854150yLl));
        }
    }

    public final void kp(C1854150yLl c1854150yLl) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        String str2;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LL;
            String str4 = c1863850ybP.LLILLJJLI;
            String str5 = c1863850ybP.LLILZIL;
            String str6 = c1863850ybP.LLILZLL;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            String str8 = c1863850ybP.LLIZ;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = "on";
            if (c1854150yLl.LLJILJILJ) {
                str = "on";
            } else {
                str = "off";
            }
            C1862330yYx.LJLIIIL(c1862330yYx, str3, str4, str5, str6, str8, str, c1854150yLl.LLJ, "draw_image", null, null, "base", 2816);
            String str10 = c1863850ybP.LL;
            String str11 = c1863850ybP.LLILLJJLI;
            String str12 = c1863850ybP.LLILZIL;
            String str13 = c1863850ybP.LLILZLL;
            if (str13 == null) {
                str13 = "";
            }
            String str14 = c1863850ybP.LLIZ;
            if (str14 == null) {
                str14 = "";
            }
            if (c1854150yLl.LLJILJILJ) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            C1862330yYx.LJLIIIL(c1862330yYx, str10, str11, str12, str13, str14, str2, c1854150yLl.LLJ, "edit_image", null, null, "base", 2816);
            String str15 = c1863850ybP.LL;
            String str16 = c1863850ybP.LLILLJJLI;
            String str17 = c1863850ybP.LLILZIL;
            String str18 = c1863850ybP.LLILZLL;
            if (str18 == null) {
                str18 = "";
            }
            String str19 = c1863850ybP.LLIZ;
            if (str19 != null) {
                str7 = str19;
            }
            if (!c1854150yLl.LLJILJILJ) {
                str9 = "off";
            }
            C1862330yYx.LJLIIIL(c1862330yYx, str15, str16, str17, str18, str7, str9, c1854150yLl.LLJ, "convert_style", null, null, "base", 2816);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        boolean zLJII;
        Long l;
        Object next;
        long j;
        List<NewActionBarItem> list;
        Long l2;
        AIBotInfo botInfo;
        AIBotInfo botInfo2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        super.onViewCreated(view);
        this.LLJJI = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.oiu);
        if (C1860410yVr.LIZIZ().LIZIZ.isEmpty() && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJI) != null) {
            ViewGroup.LayoutParams layoutParams = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                C786410Ut5.W5(viewOnAttachStateChangeListenerC20604515jv, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJI;
        String str = null;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 0, false));
            viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL = C0Q4Y.LATEST;
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(TakoSubModeItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv2.setTag(R.id.rnd, C1558520qew.LJIIL(this));
            viewOnAttachStateChangeListenerC20604515jv2.setOverScrollMode(2);
            viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(new C04JC(16));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            List<C1854150yLl> list2 = this.LLJJIII;
            ArrayList arrayList = new ArrayList();
            ITakoAIBotUIAbility iTakoAIBotUIAbility = (ITakoAIBotUIAbility) this.LLJJJJ.getValue();
            if (iTakoAIBotUIAbility != null && (botInfo2 = iTakoAIBotUIAbility.getBotInfo()) != null && botInfo2.isCsiBot()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C1852820yJc c1852820yJcLIZIZ = C1860410yVr.LIZIZ();
                Map<String, ActionBarItemList> map = c1852820yJcLIZIZ.LJFF;
                if (map != null) {
                    ITakoAIBotUIAbility iTakoAIBotUIAbility2 = (ITakoAIBotUIAbility) this.LLJJJJ.getValue();
                    if (iTakoAIBotUIAbility2 != null && (botInfo = iTakoAIBotUIAbility2.getBotInfo()) != null) {
                        j = botInfo.botId;
                    } else {
                        j = 0;
                    }
                    ActionBarItemList actionBarItemList = map.get(String.valueOf(j));
                    if (actionBarItemList != null && (list = actionBarItemList.actionBarList) != null) {
                        ArrayList<NewActionBarItem> arrayList2 = new ArrayList();
                        for (NewActionBarItem newActionBarItem : list) {
                            NewActionBarItem newActionBarItem2 = newActionBarItem;
                            Long l3 = newActionBarItem2.displayFlag;
                            if (l3 == null || l3.longValue() == 1 || ((l2 = newActionBarItem2.displayFlag) != null && l2.longValue() == 3)) {
                                arrayList2.add(newActionBarItem);
                            }
                        }
                        for (NewActionBarItem newActionBarItem3 : arrayList2) {
                            int i = newActionBarItem3.type;
                            String strValueOf = String.valueOf(newActionBarItem3.name);
                            Integer numLIZ = C1852690yJP.LIZ(newActionBarItem3);
                            String str2 = newActionBarItem3.lightIcon;
                            arrayList.add(new C1854150yLl(i, strValueOf, numLIZ, newActionBarItem3.darkIcon, str2, newActionBarItem3.iconWidth, newActionBarItem3.iconHeight, newActionBarItem3.inputHint, C1852690yJP.LIZLLL(newActionBarItem3), c1852820yJcLIZIZ.LIZ, new AwS606S0100000_27(this, c1852820yJcLIZIZ, 648), AFwS269S0000000_27.get$arr$(492), C1852690yJP.LJII(newActionBarItem3), C1852690yJP.LJFF(newActionBarItem3), C1852690yJP.LJI(newActionBarItem3), newActionBarItem3.aiImage, C1852690yJP.LIZJ(newActionBarItem3), C1852690yJP.LIZIZ(newActionBarItem3), newActionBarItem3.messageToSend, Boolean.valueOf(C1852690yJP.LJ(newActionBarItem3)), null, null, null, null, null, null, 1069711360));
                        }
                    }
                }
            } else {
                C1852820yJc c1852820yJcLIZIZ2 = C1860410yVr.LIZIZ();
                List<NewActionBarItem> list3 = c1852820yJcLIZIZ2.LIZIZ;
                ArrayList<NewActionBarItem> arrayList3 = new ArrayList();
                for (NewActionBarItem newActionBarItem4 : list3) {
                    NewActionBarItem newActionBarItem5 = newActionBarItem4;
                    Long l4 = newActionBarItem5.displayFlag;
                    if (l4 == null || l4.longValue() == 1 || ((l = newActionBarItem5.displayFlag) != null && l.longValue() == 3)) {
                        arrayList3.add(newActionBarItem4);
                    }
                }
                for (NewActionBarItem newActionBarItem6 : arrayList3) {
                    int i2 = newActionBarItem6.type;
                    String strValueOf2 = String.valueOf(newActionBarItem6.name);
                    Integer numLIZ2 = C1852690yJP.LIZ(newActionBarItem6);
                    String str3 = newActionBarItem6.lightIcon;
                    String str4 = newActionBarItem6.darkIcon;
                    Integer num = newActionBarItem6.iconWidth;
                    Integer num2 = newActionBarItem6.iconHeight;
                    String str5 = newActionBarItem6.inputHint;
                    TakoSug takoSugLJI = C1852690yJP.LJI(newActionBarItem6);
                    String str6 = c1852820yJcLIZIZ2.LIZ;
                    String strLIZLLL = C1852690yJP.LIZLLL(newActionBarItem6);
                    C1561220qjI.LIZ.getClass();
                    if (C1561220qjI.LIZ()) {
                        AssemVMLazy assemVMLazy = this.LLJJL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
                        if (((C1854530yMN) assemVMLazy.getValue().getState()).LL.LIZ == EnumC1854550yMP.NONE && C1852690yJP.LJII(newActionBarItem6)) {
                            zLJII = true;
                        } else {
                            zLJII = false;
                        }
                    } else {
                        zLJII = C1852690yJP.LJII(newActionBarItem6);
                    }
                    arrayList.add(new C1854150yLl(i2, strValueOf2, numLIZ2, str4, str3, num, num2, str5, strLIZLLL, str6, new AwS393S0200000_27(this, c1852820yJcLIZIZ2, 178), AFwS269S0000000_27.get$arr$(493), zLJII, C1852690yJP.LJFF(newActionBarItem6), takoSugLJI, newActionBarItem6.aiImage, C1852690yJP.LIZJ(newActionBarItem6), C1852690yJP.LIZIZ(newActionBarItem6), null, Boolean.valueOf(C1852690yJP.LJ(newActionBarItem6)), newActionBarItem6.standardRatio, newActionBarItem6.subSkills, newActionBarItem6.skillNameText, newActionBarItem6.skillDescription, newActionBarItem6.skillDefaultPrompt, null, 550666240));
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C1854150yLl) next).LLJILJILJ) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1854150yLl c1854150yLl = (C1854150yLl) next;
            if (c1854150yLl != null) {
                DF0(c1854150yLl);
            }
            ((ArrayList) list2).addAll(arrayList);
            if (!((ArrayList) this.LLJJIII).isEmpty()) {
                C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jv3);
                str = null;
                viewOnAttachStateChangeListenerC20604515jv3.getState().LJIILL(this.LLJJIII, null);
            } else {
                str = null;
                C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv3);
            }
        }
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, str);
        if (iMessageAbility != null) {
            iMessageAbility.gl2(new AwS606S0100000_27(this, 650));
        }
        IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, str);
        if (iMessageAbility2 != null) {
            iMessageAbility2.iU(new AwS606S0100000_27(this, 651));
        }
        AssemVMLazy assemVMLazy2 = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJLIL;
        ((TakoMultipleSelectVM) assemVMLazy2.getValue()).GQ2(new AwS606S0100000_27(this, 649));
    }

    public final void hp(C1854150yLl c1854150yLl, int i) {
        if (i != 4) {
            EnumC1854550yMP enumC1854550yMPLJFF = C1854490yMJ.LJFF(Integer.valueOf(c1854150yLl.LL));
            TakoInputViewUIAbility takoInputViewUIAbilityIp = ip();
            if (takoInputViewUIAbilityIp != null) {
                takoInputViewUIAbilityIp.w7(enumC1854550yMPLJFF, C1854490yMJ.LIZJ(c1854150yLl.LL), null, null, null, null, null, false, false);
            }
        }
    }
}

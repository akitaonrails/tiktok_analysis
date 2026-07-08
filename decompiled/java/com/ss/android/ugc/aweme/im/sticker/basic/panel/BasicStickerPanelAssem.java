package com.ss.android.ugc.aweme.im.sticker.basic.panel;

import X.AbstractC21673619ry;
import X.AbstractC471570IeR;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0IDJ;
import X.C0Q4Y;
import X.C1173220gdU;
import X.C1308910kAL;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LZ;
import X.C1510905vn;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C426750GoL;
import X.C443950Haz;
import X.C449650HkB;
import X.C449670HkD;
import X.C449690HkF;
import X.C452501pT;
import X.C531650Kt9;
import X.C723590SZx;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC449720HkI;
import X.InterfaceC1733780vDc;
import X.InterfaceC2217461Bqa;
import X.InterfaceC444050Hb9;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.EmojiPanelShowingStateVM;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sticker.basic.panel.BasicStickerPanelAssem;
import com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class BasicStickerPanelAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public boolean LLJJJJ;
    public List<? extends InterfaceC444050Hb9> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C0IDJ LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasicStickerPanelAssem.class, "stickerPanelAssemVM", "getStickerPanelAssemVM()Lcom/ss/android/ugc/aweme/viewmodel/StickerPanelAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BasicStickerPanelAssem.class, "emojiPanelShowingStateVM", "getEmojiPanelShowingStateVM()Lcom/ss/android/ugc/aweme/emoji/common/emojipagev2/EmojiPanelShowingStateVM;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BasicStickerPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StickerPanelAssemViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ, 353), AFwS236S0000000_6.get$arr$(188), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(EmojiPanelShowingStateVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS550S0100000_6(c19719912DlLIZ2, 354), AFwS236S0000000_6.get$arr$(189), null, true);
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, C449650HkB.class, null), checkSupervisorPrepared());
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 352));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 349));
        this.LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 350));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 351));
        this.LLJJJJJIL = C13BV.INSTANCE;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 355));
        this.LLJJL = new C0IDJ(this, 0);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cs6;
    }

    public final C449650HkB hp() {
        return (C449650HkB) this.LLJJIJI.getValue();
    }

    public final ViewGroup ip() {
        return (ViewGroup) this.LLJJJ.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20631115oD kp() {
        return (ViewOnAttachStateChangeListenerC20631115oD) this.LLJJIJIIJIL.getValue();
    }

    public final StickerPanelAssemViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (StickerPanelAssemViewModel) assemVMLazy.getValue();
    }

    public final void aQ1() {
        InterfaceC444050Hb9 interfaceC444050Hb9BQ2 = lp().BQ2();
        if (interfaceC444050Hb9BQ2 == null) {
            return;
        }
        C449690HkF c449690HkF = C449690HkF.LL;
        c449690HkF.Dg(interfaceC444050Hb9BQ2.LIZJ());
        Long lLIZIZ = IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LIZIZ(interfaceC444050Hb9BQ2);
        c449690HkF.c8(lLIZIZ != null ? lLIZIZ.longValue() : -1L);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        aQ1();
        ((RecyclerView) this.LLJJIJIL.getValue()).setAdapter(null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        StickerSetInfo stickerSetInfo;
        Object next;
        int iDQ2;
        super.onViewCreated(view);
        C786410Ut5.LLLLL(kp(), 0);
        Integer numLIZJ = C1308910kAL.LIZJ(hp().LLILLJJLI, kp().getContext());
        if (numLIZJ != null) {
            kp().setBackgroundColor(numLIZJ.intValue());
        }
        kp().getViewItemOperator().setLifecycleOwner(this);
        kp().getViewItemOperator().getState().LIZLLL = C0Q4Y.BUFFER;
        InterfaceC1733780vDc viewItemOperator = kp().getViewItemOperator();
        C1173220gdU c1173220gdU = new C1173220gdU();
        c1173220gdU.LIZ = -1;
        viewItemOperator.LIZLLL(c1173220gdU);
        kp().registerOnPageChangeCallback(this.LLJJL);
        kp().getViewItemOperator().LJI(new AbstractC471570IeR() { // from class: X.0HkC
            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                Long lLIZIZ;
                BasicStickerPanelAssem basicStickerPanelAssem = this.LIZ;
                if (!basicStickerPanelAssem.LLJJJJ) {
                    C449690HkF c449690HkF = C449690HkF.LL;
                    int iFJ = c449690HkF.fJ();
                    long jHN = c449690HkF.hN();
                    int iAl = basicStickerPanelAssem.lp().Al();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < iAl) {
                            InterfaceC444050Hb9 interfaceC444050Hb9CQ2 = basicStickerPanelAssem.lp().CQ2(i3);
                            if (interfaceC444050Hb9CQ2 != null) {
                                if (interfaceC444050Hb9CQ2.LIZJ() == 7) {
                                    i4 = i3;
                                }
                                if (interfaceC444050Hb9CQ2.LIZJ() == iFJ && ((lLIZIZ = IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LIZIZ(interfaceC444050Hb9CQ2)) == null || lLIZIZ.longValue() == jHN)) {
                                    break;
                                }
                            }
                            i3++;
                        } else {
                            i3 = i4;
                            break;
                        }
                    }
                    this.LIZ.lp().IQ2(i3);
                    this.LIZ.kp().setCurrentItem(i3, false);
                    this.LIZ.LLJJJJ = true;
                }
            }
        });
        if (!hp().LLIZ) {
            C786410Ut5.LJLZ(8, ip());
        } else {
            ((RecyclerView) this.LLJJIJIL.getValue()).setAdapter((AbstractC21673619ry) this.LLJJJJLIIL.getValue());
            ((RecyclerView) this.LLJJIJIL.getValue()).setLayoutManager((RecyclerView.LayoutManager) this.LLJJJIL.getValue());
            C786410Ut5.LJLZ(0, ip());
            if (hp().LLILZ != null) {
                ip().setBackground(hp().LLILZ);
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(hp().LLILLL, ip().getContext());
                if (numLIZJ2 != null) {
                    ip().setBackgroundColor(numLIZJ2.intValue());
                }
            }
            if (hp().LLJJJJLIIL != null && (viewFindViewById = getContentView().findViewById(R.id.w6t)) != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            Integer num = hp().LLJJJIL;
            if (num != null) {
                ip().getLayoutParams().height = num.intValue();
                C426750GoL.LJIIL(ip(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), Integer.valueOf((num.intValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))) / 2), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 20);
            } else {
                ip().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                C426750GoL.LJIIL(ip(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 20);
            }
            ip().requestLayout();
            View viewFindViewById2 = getContentView().findViewById(R.id.w8u);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
        }
        C13IQ<? extends UISlotAssem> c13iq = hp().LLJILJIL;
        if (c13iq != null) {
            C723850SaN.LIZLLL(this, new AwS368S0200000_2(this, (BasicStickerPanelAssem) c13iq, (C13IQ<? extends UISlotAssem>) 47));
        }
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0Has
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C443860Haq) obj).LLILLL;
            }
        }, null, new AwS620S0100000_6(this, 161), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0Haw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C443860Haq) obj).LLILLJJLI);
            }
        }, null, new AwS620S0100000_6(this, 162), 6);
        Iterator<EnumC449720HkI> it2 = hp().LL.iterator();
        while (it2.hasNext()) {
            int i = C449670HkD.LIZ[it2.next().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LIZ(null, true);
                }
            } else {
                IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJIILJJIL(null, true);
            }
        }
        StickerPanelAssemViewModel.HQ2(lp());
        C443950Haz c443950Haz = hp().LLJILLL;
        if (c443950Haz != null && (stickerSetInfo = c443950Haz.LIZ) != null) {
            Integer num2 = stickerSetInfo.stickerType;
            if (num2 != null && num2.intValue() == 7) {
                iDQ2 = lp().DQ2(7);
            } else {
                C531650Kt9 it3 = C13LZ.LJIILJJIL(0, lp().Al()).iterator();
                while (true) {
                    if (it3.LLILLL) {
                        next = it3.next();
                        if (Intrinsics.LJFF(IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LIZIZ(lp().CQ2(((Number) next).intValue())), stickerSetInfo.setId)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Integer num3 = (Integer) next;
                if (num3 != null) {
                    iDQ2 = num3.intValue();
                } else {
                    iDQ2 = lp().DQ2(7);
                }
            }
            if (iDQ2 >= 0) {
                StickerPanelAssemViewModel stickerPanelAssemViewModelLp = lp();
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StickerPanelAssemViewModel.LLIZLLLIL;
                stickerPanelAssemViewModelLp.LLILLL = "click";
                lp().IQ2(iDQ2);
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1510905vn(this, null), 3);
    }
}

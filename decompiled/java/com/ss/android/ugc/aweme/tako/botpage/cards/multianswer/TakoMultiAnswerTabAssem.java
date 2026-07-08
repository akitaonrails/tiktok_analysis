package com.ss.android.ugc.aweme.tako.botpage.cards.multianswer;

import X.C019F;
import X.C01GW;
import X.C13LC;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1857960yRu;
import X.C1858230ySL;
import X.C1858330ySV;
import X.C1858340ySW;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C326880Cre;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS161S0100000_27;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import defpackage.w2;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMultiAnswerTabAssem extends ReusedUISlotAssem<TakoMultiAnswerTabAssem> implements InterfaceC712990Rxx<C1857960yRu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public C1857960yRu LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1264));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1266));
    public final AssemVMLazy LLJLILLLLZIIL;
    public boolean LLJLL;
    public String LLJLLIL;
    public FrameLayout LLJLLL;
    public FrameLayout LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoMultiAnswerTabAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoMultiAnswerTabAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1265), AFwS264S0000000_24.get$arr$(434), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fla;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void up() {
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strNZ0;
        C1857960yRu c1857960yRu = this.LLJJLIIIJLLLLLLLZ;
        if (c1857960yRu == null || this.LLJLL || getContentView().getVisibility() != 0) {
            return;
        }
        String str = c1857960yRu.LL.LLILLL.uuid;
        if (str.length() <= 0 || 1 == 0 || Intrinsics.LJFF(this.LLJLLIL, str) || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null)) == null || (c13lcT71 = iTakoContextAbility.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
            return;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        this.LLJLLIL = str;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str2 = c1863850ybP.LL;
        String str3 = c1863850ybP.LLILLJJLI;
        String str4 = c1863850ybP.LLILZIL;
        String str5 = c1863850ybP.LLILZLL;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = c1863850ybP.LLIZ;
        C1862330yYx.LJZL(c1862330yYx, str2, str3, str, str4, str5, str6 != null ? str6 : "", "top", strNZ0);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLLL = (FrameLayout) view.findViewById(R.id.i9k);
        this.LLJZ = (FrameLayout) view.findViewById(R.id.i9l);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.tv_response_1);
        this.LLL = (TuxTextView) view.findViewById(R.id.tv_response_2);
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        ((TakoMultipleSelectVM) assemVMLazy.getValue()).GQ2(new AwS606S0100000_27(this, 229));
        FrameLayout frameLayout = this.LLJLLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS161S0100000_27(this, 70));
        }
        FrameLayout frameLayout2 = this.LLJZ;
        if (frameLayout2 != null) {
            C786410Ut5.O7(frameLayout2, new ACListenerS161S0100000_27(this, 71));
        }
    }

    public final void op(int i) {
        if (i == 1) {
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.a1h);
            }
            TuxTextView tuxTextView2 = this.LLJZIJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.a1k);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColorRes(R.attr.a1k);
        }
        TuxTextView tuxTextView4 = this.LLJZIJLIL;
        if (tuxTextView4 == null) {
            return;
        }
        tuxTextView4.setTextColorRes(R.attr.a1h);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1857960yRu c1857960yRu) {
        int i;
        C1857960yRu c1857960yRu2 = c1857960yRu;
        this.LLJJLIIIJLLLLLLLZ = c1857960yRu2;
        View contentView = getContentView();
        if (this.LLJLL) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, contentView);
        up();
        op(c1857960yRu2.LL.LLILLL.selectedAnswerIndex);
    }

    public final void sp(int i) {
        C326880Cre c326880Cre;
        Message message;
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strNZ0;
        C1858330ySV c1858330ySVLIZ;
        C1857960yRu c1857960yRu = this.LLJJLIIIJLLLLLLLZ;
        if (c1857960yRu != null && (c326880Cre = c1857960yRu.LL) != null && (message = c326880Cre.LLILLL) != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            String str = message.uuid;
            if (str.length() > 0 && (c1858330ySVLIZ = C1858340ySW.LIZ(str)) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1858340ySW.LIZJ(jCurrentTimeMillis, str);
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str2 = c1863850ybP.LL;
                String str3 = c1863850ybP.LLILLJJLI;
                String str4 = message.uuid;
                Integer numValueOf = Integer.valueOf(c1858330ySVLIZ.LIZ + 1);
                String str5 = c1863850ybP.LLILZIL;
                String str6 = c1863850ybP.LLILZLL;
                String str7 = "";
                if (str6 == null) {
                    str6 = "";
                }
                String str8 = c1863850ybP.LLIZ;
                if (str8 != null) {
                    str7 = str8;
                }
                C1862330yYx.LJLJLLL(c1862330yYx, str2, str3, str4, numValueOf, str5, str6, str7, "switch", strNZ0, (jCurrentTimeMillis - c1858330ySVLIZ.LIZIZ) - c1858330ySVLIZ.LIZJ);
                C1858340ySW.LIZIZ(i, jCurrentTimeMillis, str);
            }
            C1858230ySL.LIZ((IMessageAbility) this.LLJL.getValue(), (ITakoContextAbility) this.LLJLIL.getValue(), (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null), message, i, w2.a.SWITCH_RESPONSE);
        }
    }

    public final void tp(int i) {
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strNZ0;
        String str;
        C1857960yRu c1857960yRu = this.LLJJLIIIJLLLLLLLZ;
        if (c1857960yRu == null) {
            return;
        }
        String str2 = c1857960yRu.LL.LLILLL.uuid;
        if (str2.length() > 0 && 1 != 0 && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
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
            if (str8 != null) {
                str7 = str8;
            }
            if (i == 1) {
                str = "click_response2";
            } else {
                str = "click_response1";
            }
            C1862330yYx.LJZI(c1862330yYx, str3, str4, str2, str5, str6, str7, "top", str, strNZ0);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1857960yRu c1857960yRu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1857960yRu c1857960yRu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

package com.ss.android.ugc.aweme.ogc.news.managetopics.cell;

import X.AbstractC2211791BhR;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1159480gHK;
import X.C1159490gHL;
import X.C13LE;
import X.C19719912Dl;
import X.C19I8;
import X.C19I9;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C995130c0F;
import X.EnumC1159500gHM;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS139S0100000_4;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsContentVM;
import com.ss.android.ugc.aweme.ogc.news.managetopics.cell.SeekBarCell;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SeekBarCell extends PowerCell<C1159480gHK> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public C19I8 LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public Integer LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeekBarCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ogc/news/managetopics/ManageTopicsContentVM;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dsw;
    }

    public SeekBarCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageTopicsContentVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 736);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(231);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 720), awS562S0100000_18, AFwS206S0000000_18.get$arr$(223), new AwS562S0100000_18((C03K6) this, 722), new AwS562S0100000_18((C03K6) this, 724), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 726), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 728), null, new AwS562S0100000_18((C03K6) this, 729));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 723);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 725);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 727);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 50));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 730);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 731);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 732);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 733);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 734);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 735), awS562S0100000_18, AFwS206S0000000_18.get$arr$(224), new AwS562S0100000_18((C03K6) this, 737), new AwS562S0100000_18((C03K6) this, 738), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 739), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 740), null, new AwS562S0100000_18((C03K6) this, 741));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 742), awS562S0100000_18, AFwS206S0000000_18.get$arr$(225), new AwS562S0100000_18((C03K6) this, 743), new AwS562S0100000_18((C03K6) this, 744), new AwS562S0100000_18((C03K6) this, 745), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 719));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (C19I8) this.itemView.findViewById(R.id.ujh);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.tv_title);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.ztp);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.llj);
        C19I8 c19i8 = this.LLILLJJLI;
        if (c19i8 != null) {
            c19i8.setSeekBarChangeListener(new C19I9() { // from class: X.0gNL
                @Override // X.C19I9
                public final void LIZ(float f) {
                    C1159480gHK item = this.LIZ.getItem();
                    if (item != null) {
                        AssemVMLazy assemVMLazy = this.LIZ.LL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SeekBarCell.LLIZ;
                        ((ManageTopicsContentVM) assemVMLazy.getValue()).yQ2(new C1159560gHS(item, f));
                    }
                }

                @Override // X.C19I9
                public final void LIZIZ(float f) {
                    EnumC1159500gHM.Companion.getClass();
                    EnumC1159500gHM enumC1159500gHMLIZ = C1159490gHL.LIZ(f);
                    if (enumC1159500gHMLIZ != null) {
                        int displayRes = enumC1159500gHMLIZ.getDisplayRes();
                        SeekBarCell seekBarCell = this.LIZ;
                        Integer num = seekBarCell.LLILZLL;
                        if (num != null && displayRes == num.intValue()) {
                            return;
                        }
                        seekBarCell.LLILZLL = Integer.valueOf(displayRes);
                        TuxTextView tuxTextView = seekBarCell.LLILZ;
                        if (tuxTextView != null) {
                            tuxTextView.setText(seekBarCell.itemView.getContext().getString(displayRes));
                        }
                    }
                }
            });
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS139S0100000_4(this, 40));
        }
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR() { // from class: X.0gNM
            public final AFwS206S0000000_18 LJ = AFwS206S0000000_18.get$arr$(222);
            public Function0<String> LJFF;

            @Override // X.AbstractC2211791BhR
            public final Map<String, String> LJII() {
                String str;
                C1159480gHK item = this.LJI.getItem();
                if (item == null || (str = item.LLILLJJLI) == null) {
                    str = "";
                }
                return C2097908Jt.LIZJ(new Pair("topic_name", str));
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJFF;
            }

            {
                this.LJFF = new AwS562S0100000_18(this.LJI, 721);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJFF = function0;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TuxIconView tuxIconView;
        C1159480gHK c1159480gHK = (C1159480gHK) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1159480gHK.LLILLJJLI);
        }
        C19I8 c19i8 = this.LLILLJJLI;
        if (c19i8 != null) {
            float f = c1159480gHK.LLILZ;
            float f2 = C19I8.LLL;
            c19i8.LJFF(f, AFwS206S0000000_18.get$arr$(22), false);
        }
        C19I8 c19i82 = this.LLILLJJLI;
        if (c19i82 != null) {
            c19i82.setEnabled(c1159480gHK.LLILZLL);
        }
        if (c1159480gHK.LLILLL == null && (tuxIconView = this.LLILZIL) != null) {
            C995130c0F.LIZLLL(tuxIconView, false);
        }
        C1159490gHL c1159490gHL = EnumC1159500gHM.Companion;
        float f3 = c1159480gHK.LLILZ;
        c1159490gHL.getClass();
        EnumC1159500gHM enumC1159500gHMLIZ = C1159490gHL.LIZ(f3);
        if (enumC1159500gHMLIZ != null) {
            int displayRes = enumC1159500gHMLIZ.getDisplayRes();
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(this.itemView.getContext().getString(displayRes));
            }
        }
    }
}

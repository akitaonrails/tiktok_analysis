package com.ss.android.ugc.aweme.chatdetail.redesign.notify;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C894180Z6a;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS504S0200000_14;

/* JADX INFO: loaded from: classes19.dex */
public final class GroupNotifyCell extends PowerCell<C894180Z6a> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupNotifyCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/notify/GroupNotifyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupNotifyCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupNotifyViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 110);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(38);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 121), awS562S0100000_18, AFwS206S0000000_18.get$arr$(83), new AwS562S0100000_18((C03K6) this, 94), new AwS562S0100000_18((C03K6) this, 96), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 98), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 100), null, new AwS562S0100000_18((C03K6) this, 101));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 95);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 97);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 99);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 17));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 102);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 104);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 106);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 107);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 108);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 109), awS562S0100000_18, AFwS206S0000000_18.get$arr$(84), new AwS562S0100000_18((C03K6) this, 111), new AwS562S0100000_18((C03K6) this, 112), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 113), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 114), null, new AwS562S0100000_18((C03K6) this, 115));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 116), awS562S0100000_18, AFwS206S0000000_18.get$arr$(85), new AwS562S0100000_18((C03K6) this, 117), new AwS562S0100000_18((C03K6) this, 118), new AwS562S0100000_18((C03K6) this, 119), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 120));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 105));
        this.LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 103));
        this.LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 93));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C894180Z6a c894180Z6a = (C894180Z6a) interfaceC1891350zJl;
        super.onBindItemView(c894180Z6a);
        ((TextView) this.LLILLJJLI.getValue()).setText(c894180Z6a.LL);
        ((TextView) this.LLILLL.getValue()).setText(c894180Z6a.LLILLJJLI);
        ((C1841350y17) this.LLILZ.getValue()).setChecked(c894180Z6a.LLILLL);
        C786410Ut5.I7(new AbS504S0200000_14(this, c894180Z6a, 2), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cjj, viewGroup, false);
    }
}

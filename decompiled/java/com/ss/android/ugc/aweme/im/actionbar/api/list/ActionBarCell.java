package com.ss.android.ugc.aweme.im.actionbar.api.list;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C127G;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C908560Zkc;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC901690ZYx;
import X.InterfaceC908930ZlD;
import Y.ACListenerS117S0200000_14;
import Y.AObjectS67S0000000_14;
import android.animation.AnimatorInflater;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ActionBarCell<T extends InterfaceC901690ZYx> extends PowerCell<T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public C127G LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ActionBarCell.class, "actionBarVM", "getActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/api/viewmodel/ActionBarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ActionBarCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ActionBarViewModel.class);
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c19719912DlLIZ, 132);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(49);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 197), awS552S0100000_8, AFwS201S0000000_14.get$arr$(82), new AwS558S0100000_14((C03K6) this, 173), new AwS558S0100000_14((C03K6) this, 175), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 177), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 179), null, new AwS558S0100000_14((C03K6) this, 180));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14((C03K6) this, 174);
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 176);
            AwS558S0100000_14 awS558S0100000_143 = new AwS558S0100000_14(c19719912DlLIZ, 178);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS415S0200000_14((InterfaceC451590HnJ) obj, awS558S0100000_14, 17));
            AwS558S0100000_14 awS558S0100000_144 = new AwS558S0100000_14(c01gwLIZIZ, 181);
            AwS558S0100000_14 awS558S0100000_145 = new AwS558S0100000_14(c01gwLIZIZ, 182);
            AwS558S0100000_14 awS558S0100000_146 = new AwS558S0100000_14(c01gwLIZIZ, 183);
            AwS558S0100000_14 awS558S0100000_147 = new AwS558S0100000_14(c01gwLIZIZ, 184);
            AwS558S0100000_14 awS558S0100000_148 = new AwS558S0100000_14(c01gwLIZIZ, 185);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS558S0100000_143, awS552S0100000_8, new C452080Ho6(), awS558S0100000_144, awS558S0100000_145, awS558S0100000_142, aFwS248S0000000_14, awS558S0100000_146, awS558S0100000_147, awS558S0100000_148);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 186), awS552S0100000_8, AFwS201S0000000_14.get$arr$(80), new AwS558S0100000_14((C03K6) this, 187), new AwS558S0100000_14((C03K6) this, 188), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 189), aFwS248S0000000_14, new AwS558S0100000_14((C03K6) this, 190), null, new AwS558S0100000_14((C03K6) this, 191));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS558S0100000_14(c19719912DlLIZ, 192), awS552S0100000_8, AFwS201S0000000_14.get$arr$(81), new AwS558S0100000_14((C03K6) this, 193), new AwS558S0100000_14((C03K6) this, 194), new AwS558S0100000_14((C03K6) this, 195), aFwS248S0000000_14, null, null, new AwS558S0100000_14((C03K6) this, 196));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        View view = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(view.getContext(), R.drawable.c9b));
    }

    public void LIZIZ() {
        T item = getItem();
        if (item != null) {
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
            ((ActionBarViewModel) assemVMLazy.getValue()).AQ2(item, getBindingAdapterPosition());
            ((ActionBarViewModel) this.LL.getValue()).zQ2();
            getAbsoluteAdapterPosition();
            C908560Zkc c908560Zkc = new C908560Zkc(item, getBindingAdapterPosition(), this.itemView);
            Function1<C908560Zkc, Unit> function1LJIILJJIL = item.LJIILJJIL();
            if (function1LJIILJJIL != null) {
                function1LJIILJJIL.invoke(c908560Zkc);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILLJJLI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILLJJLI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ActionBarViewModel.class, new AObjectS67S0000000_14(this, 21)}, defaultViewModelProviderFactory);
                    this.LLILLJJLI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        T item = getItem();
        if (item != null) {
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
            ((ActionBarViewModel) assemVMLazy.getValue()).BQ2(item, getBindingAdapterPosition());
            getAbsoluteAdapterPosition();
            C908560Zkc c908560Zkc = new C908560Zkc(item, getBindingAdapterPosition(), this.itemView);
            Function1<C908560Zkc, Unit> function1LLJJIII = item.LLJJIII();
            if (function1LLJJIII != null) {
                function1LLJJIII.invoke(c908560Zkc);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        super.onBindItemView(t);
        InterfaceC908930ZlD action = t.getAction();
        if (action == null) {
            C786410Ut5.I7(null, this.itemView);
        } else {
            C786410Ut5.I7(new ACListenerS117S0200000_14(action, this, 41), this.itemView);
        }
    }
}

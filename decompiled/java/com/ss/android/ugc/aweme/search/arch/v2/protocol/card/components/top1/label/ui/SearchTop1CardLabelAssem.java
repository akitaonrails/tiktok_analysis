package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.label.ui;

import X.C01GW;
import X.C07C6;
import X.C07E5;
import X.C0HXV;
import X.C0P5P;
import X.C0P6X;
import X.C0PCE;
import X.C1247530iZL;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19EG;
import X.C255980A1k;
import X.C339190DRl;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C427760Gpy;
import X.C452501pT;
import X.C607370Nrz;
import X.C657980PrQ;
import X.C658000PrS;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC639400P6c;
import X.InterfaceC655050Pmh;
import X.InterfaceC712990Rxx;
import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import wh6.AbS501S0200000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTop1CardLabelAssem extends ReusedUISlotAssem<SearchTop1CardLabelAssem> implements InterfaceC712990Rxx<InterfaceC655050Pmh>, ISearchTop1CardLabelAssemAbility {
    public ViewGroup LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public TuxTextView LLJLLIL;
    public LinearLayout LLJLLL;
    public TuxIconView LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxIconView LLL;
    public TuxTextView LLLF;
    public C427760Gpy LLLFF;
    public final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C657980PrQ.class, null), checkSupervisorPrepared());
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 263));
    public final List<C1247530iZL> LLLFFI = new ArrayList();
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 262));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 261));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(150));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String op() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.label.ui.SearchTop1CardLabelAssem.op():java.lang.String");
    }

    public final C657980PrQ sp() {
        return (C657980PrQ) this.LLJL.getValue();
    }

    public final C658000PrS tp() {
        return (C658000PrS) this.LLLII.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        C657980PrQ c657980PrQSp = sp();
        return (c657980PrQSp == null || c657980PrQSp.LLJJI == null) ? R.layout.ev6 : R.layout.ev8;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C658000PrS c658000PrSTp;
        MutableLiveData<Integer> mutableLiveDataLIZ;
        MutableLiveData<Integer> mutableLiveDataLIZ2;
        Taco tacoLIZ = C0PCE.LIZ(getContentView(), false);
        if (tacoLIZ == null || (c658000PrSTp = tp()) == null) {
            return;
        }
        C607370Nrz c607370Nrz = (C607370Nrz) tacoLIZ.LLILZ.getValue();
        c607370Nrz.getClass();
        if (c658000PrSTp instanceof C0P6X) {
            if (C0P5P.LIZ()) {
                Observer<Integer> observer = c607370Nrz.LIZLLL.get(c658000PrSTp);
                if (observer != null && (mutableLiveDataLIZ2 = c658000PrSTp.LIZ()) != null) {
                    mutableLiveDataLIZ2.removeObserver(observer);
                }
            } else {
                MutableLiveData<Integer> mutableLiveDataLIZ3 = c658000PrSTp.LIZ();
                if (mutableLiveDataLIZ3 != null) {
                    mutableLiveDataLIZ3.removeObserver(c607370Nrz.LIZJ);
                }
            }
        } else if (!(c658000PrSTp instanceof InterfaceC639400P6c)) {
            MutableLiveData<Integer> mutableLiveDataLIZ4 = c658000PrSTp.LIZ();
            if (mutableLiveDataLIZ4 != null) {
                mutableLiveDataLIZ4.removeObserver(c607370Nrz.LIZJ);
            }
        } else if (C255980A1k.LIZ()) {
            Observer<Integer> observer2 = c607370Nrz.LIZLLL.get(c658000PrSTp);
            if (observer2 != null && (mutableLiveDataLIZ = c658000PrSTp.LIZ()) != null) {
                mutableLiveDataLIZ.removeObserver(observer2);
            }
        } else {
            MutableLiveData<Integer> mutableLiveDataLIZ5 = c658000PrSTp.LIZ();
            if (mutableLiveDataLIZ5 != null) {
                mutableLiveDataLIZ5.removeObserver(c607370Nrz.LIZJ);
            }
        }
        c607370Nrz.LIZ().remove(c658000PrSTp);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ISearchTop1CardLabelAssemAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Integer num;
        Integer num2;
        Function0<Unit> function0;
        this.LLJLL = (TuxIconView) view.findViewById(R.id.y8g);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.y8h);
        this.LLJLLL = (LinearLayout) view.findViewById(R.id.y8b);
        this.LLJZ = (TuxIconView) view.findViewById(R.id.y8e);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.y8f);
        this.LLL = (TuxIconView) view.findViewById(R.id.y8i);
        this.LLJLILLLLZIIL = (ViewGroup) view.findViewById(R.id.y8_);
        TuxIconView tuxIconView = this.LLL;
        if (tuxIconView != null) {
            C427690Gpr.LJI(tuxIconView, null);
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        sAFHelper.getClass();
        FragmentManager fragmentManagerLJIILJJIL = SAFHelper.LJIILJJIL(fragmentLJI, c19egLIZ);
        if (fragmentManagerLJIILJJIL != null && C724240Sb0.LIZ(this) != null) {
            C657980PrQ c657980PrQSp = sp();
            if (c657980PrQSp != null && !c657980PrQSp.LLJJIJI) {
                C339190DRl.LIZIZ(this.LLL);
                C657980PrQ c657980PrQSp2 = sp();
                if ((c657980PrQSp2 == null || c657980PrQSp2.LLJJIJIIJIL) && C07C6.LIZ()) {
                    getContentView().setOnTouchListener(new View.OnTouchListener() { // from class: X.0PrT
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            int action = motionEvent.getAction();
                            if (action == 0 || action == 1) {
                                return true;
                            }
                            return false;
                        }
                    });
                }
            } else {
                C339190DRl.LIZLLL(this.LLL);
            }
            TuxIconView tuxIconView2 = this.LLL;
            if (tuxIconView2 != null) {
                C786410Ut5.I7(new AbS501S0200000_10(this, fragmentManagerLJIILJJIL, 2), tuxIconView2);
            }
            TuxIconView tuxIconView3 = this.LLL;
            if (tuxIconView3 != null) {
                HandlerHook.viewPost(tuxIconView3, new ARunnableS110S0100000_10(this, 181));
            }
            this.LLLF = (TuxTextView) getContentView().findViewById(R.id.tv_source_from_entities_in_label);
            this.LLLFF = (C427760Gpy) getContentView().findViewById(R.id.bkf);
            C657980PrQ c657980PrQSp3 = sp();
            if (c657980PrQSp3 != null && (function0 = c657980PrQSp3.LLJJIII) != null) {
                C786410Ut5.I7(new AbS692S0100000_10(function0, 37), getContentView());
            }
            C657980PrQ c657980PrQSp4 = sp();
            if (c657980PrQSp4 != null && (num2 = c657980PrQSp4.LLJJIJIL) != null) {
                int iIntValue = num2.intValue();
                ViewGroup viewGroup = this.LLJLILLLLZIIL;
                if (viewGroup != null) {
                    C0HXV.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))), viewGroup);
                }
            }
            C657980PrQ c657980PrQSp5 = sp();
            if (c657980PrQSp5 != null && (num = c657980PrQSp5.LLJJJ) != null) {
                int iIntValue2 = num.intValue();
                ViewGroup viewGroup2 = this.LLJLILLLLZIIL;
                if (viewGroup2 != null) {
                    C0HXV.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2))), viewGroup2);
                }
            }
        }
        Taco tacoLIZ = C0PCE.LIZ(view, false);
        if (tacoLIZ != null) {
            tacoLIZ.LIZIZ(tp());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.InterfaceC655050Pmh r12) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.label.ui.SearchTop1CardLabelAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC655050Pmh interfaceC655050Pmh) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655050Pmh interfaceC655050Pmh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

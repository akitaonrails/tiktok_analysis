package kotlin.jvm.internal;

import X.AbstractC21148617pU;
import X.AnonymousClass1927;
import X.C09AY;
import X.C0ET4;
import X.C109Y;
import X.C15438062q;
import X.C18L3;
import X.C1DRG;
import X.C21148517pT;
import X.C21148717pV;
import X.C21374118kl;
import X.C214820195e;
import X.C331200Cyc;
import X.C559610Lx9;
import X.C786410Ut5;
import X.InterfaceC21374418ko;
import X.InterfaceC475680Il4;
import X.InterfaceC487670JAn;
import Y.ARunnableS10S0210000_7;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelPaymentModuleWidget;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS83S0210000_32;
import uxk.a;

/* JADX INFO: loaded from: classes33.dex */
public class AwS83S0210000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS83S0210000_32 awS83S0210000_32, Object obj) {
        final C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        final C109Y c109y = (C109Y) awS83S0210000_32.l1;
        final boolean z = awS83S0210000_32.z2;
        AnonymousClass1927 anonymousClass1927 = new AnonymousClass1927(c1drg, c109y, z) { // from class: X.1929
            public static final int LLJJJ = 8;
            public final InterfaceC1738600vLO LLJJIJIL = EnumC214771193h.COMMENT;

            @Override // X.AnonymousClass1927
            public InterfaceC192004109q T4() {
                return new InterfaceC192004109q() { // from class: X.192A
                    @Override // X.InterfaceC192004109q
                    public final int LIZ() {
                        return t5().commentSetting;
                    }

                    @Override // X.InterfaceC192004109q
                    public final VideoPublishEditModel LIZIZ() {
                        return t5();
                    }

                    @Override // X.InterfaceC192004109q
                    public final void LIZJ(int i) {
                        t5().commentSetting = i;
                        a.LIZ.getClass();
                        a.LJII(i);
                    }
                };
            }

            @Override // X.AnonymousClass1927, X.C193N, X.C193O
            public InterfaceC1738600vLO E3() {
                return this.LLJJIJIL;
            }
        };
        ((C559610Lx9) awS83S0210000_32.l0).getClass();
        C559610Lx9.LIZ(anonymousClass1927);
        anonymousClass1927.afterInit$als_release(jUptimeMillis);
        return anonymousClass1927;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS83S0210000_32 awS83S0210000_32, Object obj) {
        final ViewGroup viewGroup = (ViewGroup) obj;
        if (awS83S0210000_32.z2) {
            C18L3 c18l3 = (C18L3) ((C214820195e) awS83S0210000_32.l0).LIZJ.getValue();
            int iLIZLLL = ((Widget) awS83S0210000_32.l1).LIZLLL();
            final C214820195e c214820195e = (C214820195e) awS83S0210000_32.l0;
            final Widget widget = (Widget) awS83S0210000_32.l1;
            c18l3.LIZ(iLIZLLL, viewGroup, new InterfaceC487670JAn() { // from class: X.195f
                @Override // X.InterfaceC487670JAn
                public final void onInflateFinished(View view, int i, ViewGroup viewGroup2) {
                    AwS83S0210000_32.lambda$semisugar$invoke$lambda$0$0$0(c214820195e, widget, viewGroup, view, i, viewGroup2);
                }
            });
        } else {
            C214820195e c214820195e2 = (C214820195e) awS83S0210000_32.l0;
            c214820195e2.LIZ((Widget) awS83S0210000_32.l1, viewGroup, C786410Ut5.Td((LayoutInflater) c214820195e2.LIZLLL.getValue(), ((Widget) awS83S0210000_32.l1).LIZLLL(), viewGroup, false));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS83S0210000_32 awS83S0210000_32, Object obj) {
        AbstractC21148617pU c21148717pV;
        C331200Cyc c331200Cyc = (C331200Cyc) obj;
        if (c331200Cyc != null) {
            ((C21374118kl) awS83S0210000_32.l0).LLILZ = c331200Cyc.LIZ;
            List<InterfaceC21374418ko> list = c331200Cyc.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (InterfaceC21374418ko interfaceC21374418ko : list) {
                if (interfaceC21374418ko.isLive()) {
                    c21148717pV = new C21148517pT(interfaceC21374418ko);
                } else {
                    c21148717pV = new C21148717pV(interfaceC21374418ko);
                }
                arrayList.add(c21148717pV);
            }
            C21374118kl c21374118kl = (C21374118kl) awS83S0210000_32.l0;
            boolean z = awS83S0210000_32.z2;
            c21374118kl.getClass();
            c21374118kl.LLILZIL = System.currentTimeMillis();
            C786410Ut5.LJJZZIII(c21374118kl.LLJI, new ARunnableS10S0210000_7(c21374118kl, arrayList, z, 2));
            int size = c331200Cyc.LIZIZ.size();
            InterfaceC475680Il4 interfaceC475680Il4 = (InterfaceC475680Il4) awS83S0210000_32.l1;
            if (interfaceC475680Il4 != null) {
                interfaceC475680Il4.LIZ(size);
            }
        } else {
            ((C21374118kl) awS83S0210000_32.l0).LLILZ = false;
        }
        ((C21374118kl) awS83S0210000_32.l0).LLILLL = false;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0210000_32(C214820195e c214820195e, SkuPanelPaymentModuleWidget skuPanelPaymentModuleWidget, int i) {
        super(1);
        this.$t = i;
        this.z2 = false;
        this.l0 = c214820195e;
        this.l1 = skuPanelPaymentModuleWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0210000_32(C21374118kl c21374118kl, boolean z, InterfaceC475680Il4 interfaceC475680Il4, int i) {
        super(1);
        this.$t = i;
        this.l0 = c21374118kl;
        this.z2 = z;
        this.l1 = interfaceC475680Il4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S0210000_32(C0ET4 c0et4, C559610Lx9 c559610Lx9, C109Y c109y, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = c109y;
        this.z2 = z;
    }

    public static void lambda$semisugar$invoke$lambda$0$0$0(C214820195e c214820195e, Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (c214820195e.LJI != null && !c214820195e.LIZIZ().isDetached() && !c214820195e.LIZIZ().isRemoving() && c214820195e.LIZIZ.getCurrentState() != Lifecycle.State.DESTROYED) {
            c214820195e.LIZ(widget, viewGroup, view);
        }
    }
}

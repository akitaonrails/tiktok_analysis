package com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell;

import X.AbstractC2211791BhR;
import X.AbstractC899510ZQn;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C0I6Y;
import X.C0ZL0;
import X.C0ZL7;
import X.C0ZLF;
import X.C0ZLL;
import X.C0ZOE;
import X.C0ZQI;
import X.C0ZRM;
import X.C0ZSM;
import X.C13IQ;
import X.C13LE;
import X.C14IR;
import X.C1558520qew;
import X.C1562980qm8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1AF0;
import X.C21652419oY;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C426750GoL;
import X.C452501pT;
import X.C461020I6a;
import X.C461690I8p;
import X.C631370Opb;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C788960UxC;
import X.C869590Y9l;
import X.C896070ZDh;
import X.C898020ZKu;
import X.C898900ZOe;
import X.C899550ZQr;
import X.EnumC461660I8m;
import X.EnumC898050ZKx;
import X.EnumC900290ZTn;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2187608he;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.InterfaceC911210Zot;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListLongPressAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.tracker.MessageListTracker;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.vm.SkeletonLayoutCellFragmentScopeViewModel;
import com.ss.android.ugc.aweme.views.InterceptingConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public abstract class IMSkeletonLayoutReusedUISlotAssem<T extends C03H5> extends AbsSkeletonLayoutReusedUISlotAssem<T> implements InterfaceC712990Rxx<InterfaceC461380I7k>, SkeletonLayoutCellAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 653));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 649));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 650));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 654));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 652));
    public final InterfaceC1731706qJ LLJZ;
    public C0ZSM LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final List<View> LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMSkeletonLayoutReusedUISlotAssem.class, "skeletonLayoutCellFragmentScopeViewModel", "getSkeletonLayoutCellFragmentScopeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/vm/SkeletonLayoutCellFragmentScopeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IMSkeletonLayoutReusedUISlotAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkeletonLayoutCellFragmentScopeViewModel.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 664), null, AFwS248S0000000_14.get$arr$(167));
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 651));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 662));
        this.LLLFF = C452501pT.LIZIZ(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 663));
        this.LLLFFI = new ArrayList();
    }

    public final boolean Ap() {
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null && !fragmentLJI.isRemoving() && !fragmentLJI.isDetached() && fragmentLJI.getFragmentManager() != null) {
                SkeletonLayoutCellFragmentScopeViewModel skeletonLayoutCellFragmentScopeViewModel = (SkeletonLayoutCellFragmentScopeViewModel) this.LLJZ.getValue(this, LLLFZ[0]);
                if (skeletonLayoutCellFragmentScopeViewModel.LL.add(C0I6Y.LIZ((InterfaceC461380I7k) bo()).getUuid())) {
                    return true;
                }
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMSkeletonLayoutReusedUISlotAssem: ");
            sbLIZ.append(getParent());
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public abstract EnumC461660I8m Jp();

    public void Tp() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SkeletonLayoutAssemblerBridge Bp() {
        return (SkeletonLayoutAssemblerBridge) this.LLJLILLLLZIIL.getValue();
    }

    public final C898900ZOe Ep() {
        return (C898900ZOe) this.LLL.getValue();
    }

    public final C899550ZQr Fp() {
        return (C899550ZQr) this.LLJLIL.getValue();
    }

    public final C21652419oY Qp() {
        return (C21652419oY) this.LLLFF.getValue();
    }

    public final C0ZQI Up() {
        C898020ZKu c898020ZKuEb1;
        MessageListLongPressAbility messageListLongPressAbility = (MessageListLongPressAbility) this.LLJLL.getValue();
        if (messageListLongPressAbility != null && (c898020ZKuEb1 = messageListLongPressAbility.Eb1()) != null) {
            return c898020ZKuEb1;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        C0ZSM c0zsm = this.LLJZIJLIL;
        if (c0zsm != null) {
            Animator animator = c0zsm.LJIILIIL;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = c0zsm.LJIILJJIL;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, SkeletonLayoutCellAbility.class, null, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C426750GoL.LJIIIZ(Qp(), 0, 0, 0, 0, false, 16);
        C2211751BhN.LIZ(view, new AbstractC2211791BhR(this) { // from class: X.0ZQq
            public Function0<String> LJ;
            public final boolean LJFF = true;
            public final float LJI = 0.001f;
            public final C914000ZtO LJII;

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJII;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIIZZ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJI;
            }

            {
                this.LJ = new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 655);
                this.LJII = new C914000ZtO(this, 2);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    public List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
        return yp(c869590Y9l, false);
    }

    public C0ZLF Ip(C869590Y9l c869590Y9l) {
        if (C896070ZDh.LIZJ(c869590Y9l, EnumC898050ZKx.REACTION)) {
            return new C0ZL7(true);
        }
        return C0ZLL.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.model.SkeletonLayoutCellAbility
    public final void dM(View view) {
        Set<View> set;
        C0ZSM c0zsm = this.LLJZIJLIL;
        if (c0zsm != null && (set = c0zsm.LJFF) != null) {
            set.add(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C21652419oY c21652419oYQp = Qp();
        c21652419oYQp.getClass();
        c21652419oYQp.LL = EnumC900290ZTn.REFACTOR;
        int i = C0ZSM.LJIILL;
        this.LLJZIJLIL = C461690I8p.LIZ(Jp(), (ViewGroup) LJJIJL(), new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 656), new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 657), new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 658));
        Qp().setDefaultSwipeAction(new AwS593S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 79));
        Qp().setDefaultOnLongPressAction(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 659));
        Qp().setSingleClickInterceptor(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 660));
        Qp().setDefaultOnDoubleTapAction(new AwS558S0100000_14((IMSkeletonLayoutReusedUISlotAssem) this, 661));
        dM(Qp());
        View viewFindViewById = view.findViewById(R.id.wse);
        C0ZSM c0zsm = this.LLJZIJLIL;
        if (c0zsm != null) {
            c0zsm.LJI = viewFindViewById;
        }
        super.onViewCreated(view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC461380I7k interfaceC461380I7k) {
        AbstractC899510ZQn<?, ?> abstractC899510ZQnFQ2;
        InterfaceC2187608he interfaceC2187608he;
        InterfaceC911210Zot interfaceC911210Zot;
        C0ZOE c0zoeAf2;
        InterfaceC461380I7k interfaceC461380I7k2 = interfaceC461380I7k;
        SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridgeBp = Bp();
        if (skeletonLayoutAssemblerBridgeBp != null && (c0zoeAf2 = skeletonLayoutAssemblerBridgeBp.Af2(interfaceC461380I7k2.LLILII().LIZ.LIZ)) != null) {
            ((InterceptingConstraintLayout) this.LLLF.getValue()).setMode(c0zoeAf2);
        }
        Ep().LL.setPadding(Ep().LL.getPaddingLeft(), interfaceC461380I7k2.LLILII().LIZIZ.LIZ.getPaddingDp(), Ep().LL.getPaddingRight(), interfaceC461380I7k2.LLILII().LIZIZ.LIZIZ.getPaddingDp());
        Qp().setGestureConfig(interfaceC461380I7k2.LLILII().LIZIZ.LIZJ);
        MessageListTracker messageListTracker = (MessageListTracker) this.LLJLLIL.getValue();
        if (messageListTracker != null) {
            messageListTracker.nc0(new C788960UxC(interfaceC461380I7k2.LLILII().LIZ.LIZ, C631370Opb.LIZIZ(this)));
        }
        for (Map.Entry<C14IR, C461020I6a<? extends Object>> entry : interfaceC461380I7k2.LLILII().LIZJ.entrySet()) {
            C14IR key = entry.getKey();
            if (entry.getValue().LIZIZ) {
                C13IQ c13iq = (C13IQ) ((LinkedHashMap) this.LLJL).get(key);
                if (c13iq != null) {
                    C723830SaL.LIZJ(this, c13iq, false);
                }
            } else {
                SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridgeBp2 = Bp();
                if (skeletonLayoutAssemblerBridgeBp2 != null && (abstractC899510ZQnFQ2 = skeletonLayoutAssemblerBridgeBp2.fQ2(key)) != null && (interfaceC2187608he = abstractC899510ZQnFQ2.LIZIZ) != null && (interfaceC911210Zot = (InterfaceC911210Zot) this.LLJLLL.getValue()) != null) {
                    interfaceC911210Zot.LIZLLL(interfaceC461380I7k2.LLILII().LIZ.LIZ.getUuid(), interfaceC2187608he);
                }
            }
        }
    }

    public final void up(View view) {
        ((ArrayList) this.LLLFFI).add(view);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC461380I7k interfaceC461380I7k) {
        return true;
    }

    public C0ZRM zp(C869590Y9l c869590Y9l) {
        return C0ZRM.LIZJ;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC461380I7k interfaceC461380I7k) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final List<C1562980qm8<C0ZL0>> yp(C869590Y9l c869590Y9l, boolean z) {
        return Up().LIZIZ(c869590Y9l, z);
    }
}

package com.ss.android.ugc.aweme.tako.botpage.cards.sug;

import X.AnonymousClass1425;
import X.C019F;
import X.C01GW;
import X.C04JC;
import X.C0B1C;
import X.C0Q4Y;
import X.C13LE;
import X.C13MK;
import X.C1558520qew;
import X.C1576600r86;
import X.C1637806bA;
import X.C1637906bB;
import X.C1858010yRz;
import X.C1864530ycV;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugGridItemCell;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugItemCell;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSugListCardAssem extends ReusedUISlotAssem<TakoSugListCardAssem> implements InterfaceC712990Rxx<C1858010yRz> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public static final boolean LLLIILIL;
    public View LLJJLIIIJLLLLLLLZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJLIL;
    public C1576600r86 LLJLILLLLZIIL;
    public ConstraintLayout LLJLL;
    public TuxTextView LLJLLIL;
    public SmartImageView LLJLLL;
    public LinearLayoutCompat LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxIconView LLL;
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 765));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 770));
    public final AssemVMLazy LLLFFI;
    public final AssemVMLazy LLLFZ;
    public View LLLI;
    public boolean LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public Integer LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSugListCardAssem.class, "messageModel", "getMessageModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TakoSugListCardAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0)};
        AnonymousClass1425.LIZ.getClass();
        ITakoDebugService iTakoDebugServiceLIZ = AnonymousClass1425.LIZ();
        if (iTakoDebugServiceLIZ != null) {
            iTakoDebugServiceLIZ.LJIIJ();
        }
        LLLIILIL = false;
    }

    public TakoSugListCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 768), AFwS269S0000000_27.get$arr$(217), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLLFZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 769), AFwS269S0000000_27.get$arr$(218), null, true);
        this.LLLIIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 766));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 767));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnn;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final boolean sp() {
        return ((Boolean) this.LLLIIII.getValue()).booleanValue();
    }

    public final ITakoContextAbility up() {
        return (ITakoContextAbility) this.LLLFF.getValue();
    }

    public final boolean op() {
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoScreenTypeAbility.class, null);
        if (C13MK.LIZ(iTakoScreenTypeAbility != null ? Boolean.valueOf(iTakoScreenTypeAbility.r41()) : null)) {
            return ((Boolean) C0B1C.LIZ.getValue()).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayout;
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.dz0);
        this.LLJL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.wnm);
        this.LLJLIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.wni);
        this.LLJLILLLLZIIL = (C1576600r86) view.findViewById(R.id.wnh);
        if (view instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) view;
        } else {
            constraintLayout = null;
        }
        this.LLJLL = constraintLayout;
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.tv_sug_title);
        this.LLJZIJLIL = (TuxTextView) view.findViewById(R.id.opx);
        this.LLJLLL = (SmartImageView) view.findViewById(R.id.lwf);
        this.LLJZ = (LinearLayoutCompat) view.findViewById(R.id.nig);
        this.LLL = (TuxIconView) view.findViewById(R.id.k4a);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJL;
        int i = 0;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext(), 1, false));
            viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoSugItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1864530ycV(this, 6));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new GridLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 2));
            viewOnAttachStateChangeListenerC20604515jv2.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jv2.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv2.getState().LIZLLL = C0Q4Y.BUFFER;
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(TakoSugGridItemCell.class);
            viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(new C04JC(5));
        }
        AssemVMLazy assemVMLazy = this.LLLFZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIL;
        ((TakoMultipleSelectVM) assemVMLazy.getValue()).GQ2(new AwS606S0100000_27(this, 344));
        TuxIconView tuxIconView = this.LLL;
        if (tuxIconView != null) {
            if (!LLLIILIL) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxIconView);
        }
    }

    public final int tp(C1858010yRz c1858010yRz) {
        Integer num = this.LLLIIIL;
        if (num != null) {
            num.intValue();
            if (LLLIILIL) {
                return num.intValue();
            }
        }
        TakoSug takoSug = c1858010yRz.LLILLJJLI;
        int i = takoSug.sugShowType;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 103) {
                                if (takoSug.isFirstSug) {
                                    return 102;
                                }
                                return 201;
                            }
                            return 208;
                        }
                        return 207;
                    }
                    return 206;
                }
                return 205;
            }
            return 103;
        }
        return 104;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1858010yRz c1858010yRz) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0573  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [w2$a] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: yp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1858010yRz r23) {
        /*
            Method dump skipped, instruction units count: 1830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.sug.TakoSugListCardAssem.up(X.0yRz):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1858010yRz c1858010yRz) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

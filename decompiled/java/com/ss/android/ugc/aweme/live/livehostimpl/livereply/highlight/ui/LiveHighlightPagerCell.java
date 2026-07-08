package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C1833730xop;
import X.C1834580xqC;
import X.C1834600xqE;
import X.C1834780xqW;
import X.C1835000xqs;
import X.C1864530ycV;
import X.C19719912Dl;
import X.C19ME;
import X.C20600815jK;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightVideobarSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUserPostHighlightSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveHighlightPagerCell extends PowerCell<C1833730xop> implements InterfaceC20631915oL {
    public static final C1834600xqE LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 316));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 313));
    public final AssemVMLazy LLILLL;
    public Integer LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveHighlightPagerCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/highlight/viewmodel/LiveHighlightViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = new C1834600xqE();
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ddv;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ViewOnAttachStateChangeListenerC20604515jv powerList = getPowerList();
        if (powerList != null) {
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LJIILIIL = true;
            powerList.setListConfig(c20603715jn);
            powerList.LJIILJJIL(LiveHighlightVideoCell.class);
            powerList.setOrientation(0);
            powerList.addItemDecoration(new C1864530ycV(this, 0));
        }
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        AssemViewModel.selectSubscribe$default(assemVMLazy.getValue(), C1835000xqs.LL, null, this, null, new AwS583S0100000_4(new AwS606S0100000_27(this, 129), (Function1<? super List<CommerceAgentActionBarItem>, Unit>) 319), 10, null);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
    }

    public LiveHighlightPagerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveHighlightViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 331);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(77);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 315), awS571S0100000_27, AFwS216S0000000_27.get$arr$(122), new AwS571S0100000_27((C03K6) this, 317), new AwS571S0100000_27((C03K6) this, 319), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 321), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 323), null, new AwS571S0100000_27((C03K6) this, 324));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27((C03K6) this, 318);
            AwS571S0100000_27 awS571S0100000_273 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 320);
            AwS571S0100000_27 awS571S0100000_274 = new AwS571S0100000_27(c19719912DlLIZ, 322);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS571S0100000_272, 18));
            AwS571S0100000_27 awS571S0100000_275 = new AwS571S0100000_27(c01gwLIZIZ, 325);
            AwS571S0100000_27 awS571S0100000_276 = new AwS571S0100000_27(c01gwLIZIZ, 326);
            AwS571S0100000_27 awS571S0100000_277 = new AwS571S0100000_27(c01gwLIZIZ, 327);
            AwS571S0100000_27 awS571S0100000_278 = new AwS571S0100000_27(c01gwLIZIZ, 328);
            AwS571S0100000_27 awS571S0100000_279 = new AwS571S0100000_27(c01gwLIZIZ, 329);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS571S0100000_274, awS571S0100000_27, new C452080Ho6(), awS571S0100000_275, awS571S0100000_276, awS571S0100000_273, aFwS269S0000000_27, awS571S0100000_277, awS571S0100000_278, awS571S0100000_279);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 330), awS571S0100000_27, AFwS216S0000000_27.get$arr$(123), new AwS571S0100000_27((C03K6) this, 332), new AwS571S0100000_27((C03K6) this, 333), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 334), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 335), null, new AwS571S0100000_27((C03K6) this, 336));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 337), awS571S0100000_27, AFwS216S0000000_27.get$arr$(124), new AwS571S0100000_27((C03K6) this, 338), new AwS571S0100000_27((C03K6) this, 339), new AwS571S0100000_27((C03K6) this, 312), aFwS269S0000000_27, null, null, new AwS571S0100000_27((C03K6) this, 314));
        }
        this.LLILLL = assemVMLazy;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1833730xop c1833730xop) {
        float fLIZIZ;
        int iLIZ;
        ViewOnAttachStateChangeListenerC20604515jv powerList;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLILZ = Integer.valueOf(c1833730xop.LLILLJJLI);
        if (c1833730xop.LLILLL.isEmpty()) {
            ((TextView) this.LLILLJJLI.getValue()).setText(c1833730xop.LLILZ);
            C500260Jjc.LLFFF((View) this.LLILLJJLI.getValue());
            ViewOnAttachStateChangeListenerC20604515jv powerList2 = getPowerList();
            if (powerList2 != null) {
                C500260Jjc.LJIILIIL(powerList2);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL((View) this.LLILLJJLI.getValue());
        ViewOnAttachStateChangeListenerC20604515jv powerList3 = getPowerList();
        if (powerList3 != null) {
            C500260Jjc.LLFFF(powerList3);
        }
        ViewOnAttachStateChangeListenerC20604515jv powerList4 = getPowerList();
        if (powerList4 != null && (state = powerList4.getState()) != null) {
            state.LJIIJJI(c1833730xop.LLILLL, null);
        }
        int i = 0;
        if (LiveReplayHighlightVideobarSetting.INSTANCE.enable()) {
            LLILZIL.getClass();
            iLIZ = C1834600xqE.LIZ(c1833730xop);
        } else {
            if (LiveUserPostHighlightSetting.INSTANCE.getValue()) {
                List<C1834580xqC> list = c1833730xop.LLILLL;
                if ((list instanceof Collection) && list.isEmpty()) {
                    fLIZIZ = C497740JfY.LIZIZ(95.0f);
                } else {
                    for (C1834580xqC c1834580xqC : list) {
                        if (c1834580xqC.LLILZLL.length() > 0 && c1834580xqC.LLJJJ > 0) {
                            fLIZIZ = C497740JfY.LIZIZ(105.0f);
                            break;
                        }
                    }
                    fLIZIZ = C497740JfY.LIZIZ(95.0f);
                }
            } else {
                fLIZIZ = C497740JfY.LIZIZ(95.0f);
            }
            iLIZ = (int) fLIZIZ;
        }
        ViewGroup.LayoutParams layoutParams = getPowerList().getLayoutParams();
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.height = iLIZ;
            C786410Ut5.E6(getPowerList(), marginLayoutParams);
        }
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        C1834580xqC c1834580xqCLIZ = ((C1834780xqW) assemVMLazy.getValue().getState()).LLILZ.LIZ();
        if (c1834580xqCLIZ == null) {
            return;
        }
        int i2 = c1834580xqCLIZ.LL;
        Integer num = this.LLILZ;
        if (num == null || i2 != num.intValue() || (powerList = getPowerList()) == null) {
            return;
        }
        int iLJIIIZ = getPowerList().getState().LJIIIZ(c1834580xqCLIZ);
        if (iLJIIIZ >= 0) {
            i = iLJIIIZ;
        }
        powerList.smoothScrollToPosition(i);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        ViewOnAttachStateChangeListenerC20604515jv powerList;
        C20600815jK<InterfaceC1891350zJl> state;
        C1833730xop c1833730xop = (C1833730xop) interfaceC1891350zJl;
        if (!list.isEmpty()) {
            int iIntValue = ((Integer) ListProtector.get(list, 0)).intValue();
            if (iIntValue >= 0 && iIntValue < c1833730xop.LLILLL.size() && (powerList = getPowerList()) != null && (state = powerList.getState()) != null) {
                state.LJIILJJIL(iIntValue, (InterfaceC1891350zJl) ListProtector.get(c1833730xop.LLILLL, iIntValue));
                return;
            }
            return;
        }
        onBindItemView(c1833730xop);
    }
}

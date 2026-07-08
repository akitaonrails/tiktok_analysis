package com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0PLP;
import X.C1558520qew;
import X.C189200o6;
import X.C1954807lC;
import X.C2248361CzK;
import X.C424260GkK;
import X.C656950Ppl;
import X.C698190Ra5;
import X.C786410Ut5;
import X.EnumC657070Ppx;
import X.InterfaceC1587906Jp;
import X.InterfaceC655070Pmj;
import X.InterfaceC655340PnA;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardBottomRecommentInfoAssem extends ReusedUISlotAssem<SearchCardBottomRecommentInfoAssem> implements InterfaceC712990Rxx<InterfaceC655340PnA> {
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.etz;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.lu2);
        this.LLJL = (TuxTextView) view.findViewById(R.id.tv_search_card_bottom_recommend_info);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC655340PnA interfaceC655340PnA) {
        Object c098200Yq;
        Object c098200Yq2;
        TuxTextView tuxTextView;
        CharSequence text;
        InterfaceC655070Pmj reason = interfaceC655340PnA.getReason();
        if (reason != null) {
            C786410Ut5.LJLLLLLL(0, getContentView());
            if (reason instanceof C0PLP) {
                TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconRes(((C0PLP) reason).LIZ);
                }
                C0PLP c0plp = (C0PLP) reason;
                Integer num = c0plp.LIZJ;
                if (num != null) {
                    int iIntValue = num.intValue();
                    TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setTintColorRes(iIntValue);
                    }
                }
                TuxTextView tuxTextView2 = this.LLJL;
                if (tuxTextView2 != null) {
                    Context context = getContext();
                    if (context != null) {
                        text = context.getText(c0plp.LIZIZ);
                    } else {
                        text = null;
                    }
                    tuxTextView2.setText(text);
                }
                Integer num2 = c0plp.LIZLLL;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    TuxTextView tuxTextView3 = this.LLJL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setTextColorRes(iIntValue2);
                    }
                }
            } else if (reason instanceof C424260GkK) {
                try {
                    C01GW c01gw = C2248361CzK.LIZ;
                    c098200Yq = C2248361CzK.LJFF(getContentView().getContext(), null);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C698190Ra5 c698190Ra5 = (C698190Ra5) c098200Yq;
                try {
                    C01GW c01gw2 = C2248361CzK.LIZ;
                    c098200Yq2 = C2248361CzK.LJ(getContentView().getContext(), null);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                Integer num3 = (Integer) c098200Yq2;
                if (c698190Ra5 != null) {
                    TuxIconView tuxIconView4 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxIconView4 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
                    }
                    TuxIconView tuxIconView5 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxIconView5 != null) {
                        tuxIconView5.setIconRes(c698190Ra5.LIZ);
                    }
                    Integer num4 = c698190Ra5.LIZIZ;
                    if (num4 != null) {
                        int iIntValue3 = num4.intValue();
                        TuxIconView tuxIconView6 = this.LLJJLIIIJLLLLLLLZ;
                        if (tuxIconView6 != null) {
                            tuxIconView6.setTintColor(iIntValue3);
                        }
                    }
                } else {
                    TuxIconView tuxIconView7 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxIconView7 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
                    }
                }
                TuxTextView tuxTextView4 = this.LLJL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText((CharSequence) null);
                }
                if (num3 != null && (tuxTextView = this.LLJL) != null) {
                    tuxTextView.setTextColor(num3.intValue());
                }
            } else {
                throw new C1954807lC();
            }
            IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IAdjustAbility.class, null);
            if (iAdjustAbility != null) {
                iAdjustAbility.qw1(EnumC657070Ppx.BOTTOM_RECOMMEND_INFO, C656950Ppl.LIZ);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(InterfaceC655340PnA interfaceC655340PnA) {
        if (interfaceC655340PnA.getReason() != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC655340PnA interfaceC655340PnA) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

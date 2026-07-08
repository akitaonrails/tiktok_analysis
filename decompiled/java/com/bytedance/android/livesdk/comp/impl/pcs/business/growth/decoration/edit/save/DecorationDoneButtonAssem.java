package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save;

import X.AbstractViewOnClickListenerC1637610siV;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0JGI;
import X.C0QSJ;
import X.C1161920gLG;
import X.C13LE;
import X.C1558860qfU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C16F5;
import X.C1814390xJd;
import X.C1814400xJe;
import X.C1814410xJf;
import X.C1814420xJg;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2217381BqS;
import X.C23250099c;
import X.C291301Ax;
import X.C452501pT;
import X.C490280JKo;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1814440xJi;
import X.InterfaceC1814530xJr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.DecorationEditLogDataEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.EnableDoneEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class DecorationDoneButtonAssem extends UIContentAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1814410xJf(this));
    public final AssemVMLazy LLJ;
    public final InterfaceC1814530xJr LLJI;
    public final C1559260qg8 LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public boolean LLJILJILJ;
    public volatile InterfaceC1814440xJi LLJILLL;
    public InterfaceC665370Q7z LLJJ;
    public C0QSJ LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DecorationDoneButtonAssem.class, "liveBoardUpsertViewModel", "getLiveBoardUpsertViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/boardspanel/upsert/LiveBoardUpsertViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(DecorationDoneButtonAssem.class, "ability", "getAbility()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/save/BoardSaveAbility;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public DecorationDoneButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveBoardUpsertViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C1558860qfU(c19719912DlLIZ), new C1814420xJg(), null, true);
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        this.LLJI = iEffectService != null ? iEffectService.getBoardsDisplayStateManager() : null;
        this.LLJIJIL = new C1559260qg8(new C723580SZw(this, C291301Ax.class, "save_data"), checkSupervisorPrepared());
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BoardSaveScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BoardSaveScope.class);
        return arrayList;
    }

    public final InterfaceC1814440xJi Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJJI;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJJ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{BoardSaveScope.class});
            this.LLJJI = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1814440xJi interfaceC1814440xJi = (InterfaceC1814440xJi) c0qsjLIZLLL.getAbility(InterfaceC1814440xJi.class);
        C687700QyG.LJ(interfaceC1814440xJi, InterfaceC1814440xJi.class);
        return interfaceC1814440xJi;
    }

    public final void Ho(boolean z) {
        float f;
        int i;
        this.LLJILJILJ = z;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.zd);
        TextView textView = (TextView) this.LLIZLLLIL.getValue();
        if (textView != null) {
            textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, contextThemeWrapper));
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.LLIZLLLIL.getValue();
        if (appCompatTextView != null) {
            if (z) {
                i = R.drawable.eda;
            } else {
                i = R.drawable.edb;
            }
            appCompatTextView.setBackgroundResource(i);
        }
        C16F5 c16f5 = (C16F5) this.LLIZLLLIL.getValue();
        if (c16f5 != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            C786410Ut5.k5(c16f5, f);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        super.onViewCreated(view);
        View view2 = (View) this.LLIZLLLIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xJh
                {
                    super(300L);
                }

                /* JADX WARN: Removed duplicated region for block: B:95:0x021a  */
                @Override // X.AbstractViewOnClickListenerC1637610siV
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.view.View r30) {
                    /*
                        Method dump skipped, instruction units count: 557
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1814430xJh.LIZ(android.view.View):void");
                }
            }, view2);
        }
        if (this.LLJILJIL == null) {
            this.LLJILJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0JGI(this, null), 3);
        }
        C291301Ax c291301Ax = (C291301Ax) this.LLJIJIL.getValue();
        if (c291301Ax != null && (dataChannel2 = c291301Ax.LLILLJJLI) != null) {
            dataChannel2.BQ2(this, EnableDoneEvent.class, new C490280JKo(this));
        }
        C291301Ax c291301Ax2 = (C291301Ax) this.LLJIJIL.getValue();
        if (c291301Ax2 != null && (dataChannel = c291301Ax2.LLILLJJLI) != null) {
            dataChannel.BQ2(this, DecorationEditLogDataEvent.class, new C1814400xJe(this));
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gLl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158950gGT) obj).LLILZ;
            }
        }, null, new C1814390xJd(this), 6);
    }
}

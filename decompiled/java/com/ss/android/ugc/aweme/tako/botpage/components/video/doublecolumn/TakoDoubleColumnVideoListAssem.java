package com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0P6P;
import X.C1220000hqw;
import X.C13LE;
import X.C14EU;
import X.C16HD;
import X.C1749280vcc;
import X.C20603715jn;
import X.C20615715lj;
import X.C2217381BqS;
import X.C329460Cvo;
import X.C329510Cvt;
import X.C340860DXw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C627260Oiy;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737030Svd;
import X.InterfaceC20615815lk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class TakoDoubleColumnVideoListAssem extends UIListContentAssem<TakoDoubleColumnVideoShareVM> implements InterfaceC20615815lk {
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 4;
        c20603715jn.LIZLLL = TakoVideoListFooterCell.class;
        return c20603715jn;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15li] */
    @Override // X.InterfaceC20615815lk
    public final C20615715lj LJIIZILJ() {
        return new C20615715lj(Go(), new C0P6P() { // from class: X.15li
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.ip().manualListRetry(EnumC323450Cm7.Next);
            }
        });
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final TakoDoubleColumnVideoShareVM ip() {
        return (TakoDoubleColumnVideoShareVM) this.LLIZLLLIL.getValue();
    }

    public TakoDoubleColumnVideoListAssem() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(289);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(TakoDoubleColumnVideoShareVM.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(230), new AwS575S0100000_31((AbstractC738140SxQ) this, 1172), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1171));
        this.LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1173));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20615815lk
    public final boolean f01() {
        C329460Cvo c329460Cvo = (C329460Cvo) ip().getState();
        c329460Cvo.getClass();
        List listLIZ = C627260Oiy.LIZ(c329460Cvo);
        return !(listLIZ == null || listLIZ.isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Aweme aweme;
        String aid;
        RecyclerView.LayoutManager layoutManager;
        String str;
        if (66 == c737030Svd.LIZ) {
            Object obj = c737030Svd.LIZIZ;
            if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (aid = aweme.getAid()) != null) {
                C329460Cvo c329460Cvo = (C329460Cvo) ip().getState();
                c329460Cvo.getClass();
                List listLIZ = C627260Oiy.LIZ(c329460Cvo);
                if (listLIZ != null) {
                    Iterator it2 = listLIZ.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            TakoVideoItem takoVideoItem = ((C329510Cvt) it2.next()).LLILLJJLI;
                            if (takoVideoItem != null) {
                                str = takoVideoItem.awemeId;
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str, aid)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    if (numValueOf != null && numValueOf.intValue() >= 0 && (layoutManager = Go().getLayoutManager()) != null) {
                        layoutManager.scrollToPosition(numValueOf.intValue());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(TakoDoubleColumnVideoItemCell.class);
        ((PowerAdapter) viewOnAttachStateChangeListenerC20604515jvGo.getAdapter()).LLLLII(this, TakoDoubleColumnVideoListAssem.class);
        C340860DXw.LIZ(viewOnAttachStateChangeListenerC20604515jvGo);
        viewOnAttachStateChangeListenerC20604515jvGo.addOnAttachStateChangeListener(new C16HD(this, 1));
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0CxG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C329460Cvo c329460Cvo = (C329460Cvo) obj;
                c329460Cvo.getClass();
                return C627260Oiy.LIZLLL(c329460Cvo);
            }
        }, this, null, new AwS610S0100000_31(this, 461), new AwS575S0100000_31(this, 1478), new AwS610S0100000_31(this, 462), 4, null);
    }
}

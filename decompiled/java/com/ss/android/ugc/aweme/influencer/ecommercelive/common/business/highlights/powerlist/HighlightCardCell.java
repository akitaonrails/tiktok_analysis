package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C07MW;
import X.C0H1U;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C290160BYw;
import X.C452080Ho6;
import X.C452501pT;
import X.C608160NtG;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightCard;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightCellItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightVideoInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS47S0200000_33;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class HighlightCardCell extends PowerCell<HighlightCard> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final int LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightCardCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/highlights/viewmodel/HighlightsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HighlightCardCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightsListViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2776);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(200);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2787), awS577S0100000_33, AFwS224S0000000_33.get$arr$(384), new AwS577S0100000_33((C03K6) this, 2762), new AwS577S0100000_33((C03K6) this, 2764), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2766), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2768), null, new AwS577S0100000_33((C03K6) this, 2769));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2763);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2765);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2767);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 106));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2770);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2771);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2772);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2773);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2774);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2775), awS577S0100000_33, AFwS224S0000000_33.get$arr$(385), new AwS577S0100000_33((C03K6) this, 2777), new AwS577S0100000_33((C03K6) this, 2778), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2779), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2780), null, new AwS577S0100000_33((C03K6) this, 2781));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2782), awS577S0100000_33, AFwS224S0000000_33.get$arr$(386), new AwS577S0100000_33((C03K6) this, 2783), new AwS577S0100000_33((C03K6) this, 2784), new AwS577S0100000_33((C03K6) this, 2785), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2786));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2761));
        int iLJ = 3;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("ec_highlight_default_show_count", 3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLILLL = iLJ;
    }

    public final HighlightsListViewModel N5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (HighlightsListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLILLJJLI.getValue();
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(HighlightClipItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(this.itemView.getContext(), 3));
    }

    public final void L5(HighlightCard highlightCard) {
        int size;
        List<HighlightCellItem> highlightItems = highlightCard.getHighlightItems();
        if (highlightItems != null) {
            size = highlightItems.size();
        } else {
            size = 0;
        }
        if (size <= this.LLILLL) {
            C786410Ut5.LL(8, (ConstraintLayout) this.itemView.findViewById(R.id.duu));
            C786410Ut5.LLIIZ((Space) this.itemView.findViewById(R.id.caw), 0);
            return;
        }
        C786410Ut5.LL(0, (ConstraintLayout) this.itemView.findViewById(R.id.duu));
        C786410Ut5.LLIIZ((Space) this.itemView.findViewById(R.id.caw), 8);
        if (N5().LLJILJIL.contains(Integer.valueOf(highlightCard.hashCode()))) {
            ((TextView) this.itemView.findViewById(R.id.z6o)).setText(C20642515q3.LJI(2131857251));
            C786410Ut5.Fb((TuxIconView) this.itemView.findViewById(R.id.l7h), 180.0f);
        } else {
            ((TextView) this.itemView.findViewById(R.id.z6o)).setText(C20642515q3.LJI(2131857252));
            C786410Ut5.Fb((TuxIconView) this.itemView.findViewById(R.id.l7h), 0.0f);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        HighlightCellItem highlightCellItem;
        HighlightVideoInfo highlightVideoInfo;
        HighlightCellItem highlightCellItem2;
        String str2;
        HighlightCellItem highlightCellItem3;
        HighlightVideoInfo highlightVideoInfo2;
        HighlightCellItem highlightCellItem4;
        HighlightCard highlightCard = (HighlightCard) interfaceC1891350zJl;
        super.onBindItemView(highlightCard);
        this.itemView.setBackgroundColor(0);
        String str3 = null;
        if (Intrinsics.LJFF(highlightCard.isTopHighlight(), Boolean.TRUE)) {
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.z3a));
            String title = highlightCard.getTitle();
            if (title != null && title.length() != 0) {
                ((TextView) this.itemView.findViewById(R.id.z7j)).setText(highlightCard.getTitle());
            } else {
                ((TextView) this.itemView.findViewById(R.id.z7j)).setText(C20642515q3.LJI(2131823203));
            }
            List<HighlightCellItem> highlightItems = highlightCard.getHighlightItems();
            if (highlightItems != null && (highlightCellItem4 = (HighlightCellItem) C13LP.LJJJLZIJ(0, highlightItems)) != null) {
                str2 = highlightCellItem4.daInfo;
            } else {
                str2 = null;
            }
            HighlightsListViewModel highlightsListViewModelN5 = N5();
            List<HighlightCellItem> highlightItems2 = highlightCard.getHighlightItems();
            if (highlightItems2 != null && (highlightCellItem3 = (HighlightCellItem) C13LP.LJJJLZIJ(0, highlightItems2)) != null && (highlightVideoInfo2 = highlightCellItem3.videoInfo) != null) {
                str3 = highlightVideoInfo2.fragmentId;
            }
            highlightsListViewModelN5.xQ2(str3, str2, true);
            C786410Ut5.LL(8, (ConstraintLayout) this.itemView.findViewById(R.id.duu));
            C786410Ut5.LLIIZ((Space) this.itemView.findViewById(R.id.caw), 0);
            I5(highlightCard, false);
            return;
        }
        if (highlightCard.getGroupDate() != null) {
            ((TextView) this.itemView.findViewById(R.id.z3a)).setText(highlightCard.getGroupDate());
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.z3a));
        } else {
            ((TextView) this.itemView.findViewById(R.id.z3a)).setText("");
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.z3a));
        }
        String title2 = highlightCard.getTitle();
        if (title2 != null && title2.length() != 0) {
            ((TextView) this.itemView.findViewById(R.id.z7j)).setText(highlightCard.getTitle());
        } else {
            ((TextView) this.itemView.findViewById(R.id.z7j)).setText(C20642515q3.LJI(2131823203));
        }
        List<HighlightCellItem> highlightItems3 = highlightCard.getHighlightItems();
        if (highlightItems3 != null && (highlightCellItem2 = (HighlightCellItem) C13LP.LJJJLZIJ(0, highlightItems3)) != null) {
            str = highlightCellItem2.daInfo;
        } else {
            str = null;
        }
        HighlightsListViewModel highlightsListViewModelN52 = N5();
        List<HighlightCellItem> highlightItems4 = highlightCard.getHighlightItems();
        if (highlightItems4 != null && (highlightCellItem = (HighlightCellItem) C13LP.LJJJLZIJ(0, highlightItems4)) != null && (highlightVideoInfo = highlightCellItem.videoInfo) != null) {
            str3 = highlightVideoInfo.fragmentId;
        }
        highlightsListViewModelN52.xQ2(str3, str, false);
        C786410Ut5.I7(new AjS47S0200000_33(this, highlightCard, 1), this.itemView.findViewById(R.id.duu));
        I5(highlightCard, N5().LLJILJIL.contains(Integer.valueOf(highlightCard.hashCode())));
        L5(highlightCard);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (!C290160BYw.LIZ() && !C07MW.LIZ()) {
            return PowerCell.inflateItemView$default(this, viewGroup, R.layout.btn, false, 4, null);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.btn, viewGroup, false);
    }

    public final void I5(HighlightCard highlightCard, boolean z) {
        boolean zLJFF = Intrinsics.LJFF(highlightCard.isTopHighlight(), Boolean.TRUE);
        List<HighlightCellItem> highlightItems = highlightCard.getHighlightItems();
        if (highlightItems != null) {
            List listLJJJJLI = C13LP.LJJJJLI(highlightItems);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C608160NtG((HighlightCellItem) it2.next(), zLJFF));
            }
            if (!arrayList.isEmpty()) {
                ((ViewOnAttachStateChangeListenerC20604515jv) this.LLILLJJLI.getValue()).getState().LJFF(null);
                if (z) {
                    ((ViewOnAttachStateChangeListenerC20604515jv) this.LLILLJJLI.getValue()).getState().LIZLLL(arrayList, null);
                } else {
                    ((ViewOnAttachStateChangeListenerC20604515jv) this.LLILLJJLI.getValue()).getState().LIZLLL(arrayList.subList(0, Math.max(1, Math.min(arrayList.size(), this.LLILLL))), null);
                }
            }
        }
    }
}

package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C01GW;
import X.C03H5;
import X.C07GB;
import X.C0BYF;
import X.C0PCU;
import X.C0QSJ;
import X.C13IQ;
import X.C13LE;
import X.C1840007Io;
import X.C1840307Ir;
import X.C2188811AlT;
import X.C452501pT;
import X.C659750PuH;
import X.C659980Pue;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.SearchOutOfCoverAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.ICardVisitedAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.ISearchPhotoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchHideLabelAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchPhotoCoverLabelAssem;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.assem.VisualSearchPhotoIconLeftToRightAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoRootAssem extends ReusedUIContentAssem<SearchPhotoRootAssem> implements InterfaceC712990Rxx<C659750PuH>, ISearchCardElementVisibilityControlAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public final boolean LLJJJJ;
    public final SearchPhotoRootAssem LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public ISearchCardElementVisibilityControlAbility LLJJL;
    public ICardVisitedAbility LLJJLIIIJLLLLLLLZ;

    public SearchPhotoRootAssem() {
        this(false);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility
    public final void T52() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == ISearchCardElementVisibilityControlAbility.class) {
            this.LLJJL = (ISearchCardElementVisibilityControlAbility) obj;
        } else if (cls == ICardVisitedAbility.class) {
            this.LLJJLIIIJLLLLLLLZ = (ICardVisitedAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPhotoScope.class, SearchCardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == ISearchCardElementVisibilityControlAbility.class) {
            return this.LLJJL;
        }
        if (cls == ICardVisitedAbility.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPhotoScope.class);
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == ISearchCardElementVisibilityControlAbility.class) {
            this.LLJJL = null;
        } else if (cls == ICardVisitedAbility.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility
    public final void vs1() {
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("change [");
        sbLIZ.append(this.LLJJJJLIIL.getValue());
        sbLIZ.append("] to hide by ability, ");
        View view2 = (View) this.LLJJJJLIIL.getValue();
        Boolean boolValueOf = null;
        sbLIZ.append(view2 != null ? Boolean.valueOf(view2.isInLayout()) : null);
        sbLIZ.append(' ');
        View view3 = (View) this.LLJJJJLIIL.getValue();
        Object parent = view3 != null ? view3.getParent() : null;
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            boolValueOf = Boolean.valueOf(view.isInLayout());
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        TuxTextView tuxTextView = (TuxTextView) this.LLJJJJLIIL.getValue();
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    public SearchPhotoRootAssem(boolean z) {
        this.LLJJJJ = z;
        this.LLJJJJJIL = this;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 515));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility
    public final void Xc1(int i) {
        TextView textView = (TextView) this.LLJJJJLIIL.getValue();
        if (textView != null) {
            textView.setMaxLines(1);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCardScope.class}).unbindAbility(this.LLJJJJJIL, ISearchCardElementVisibilityControlAbility.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS376S0200000_10(this, view, 40));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCardScope.class}).bindAbility(this.LLJJJJJIL, ISearchCardElementVisibilityControlAbility.class);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659750PuH c659750PuH) {
        ISearchVideoBottomAnchorProtocol iSearchVideoBottomAnchorProtocol;
        C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqGN2;
        String aid;
        C659750PuH c659750PuH2 = c659750PuH;
        Object obj = C659980Pue.LIZIZ().get(c659750PuH2.LLILLL);
        if ((obj instanceof ISearchPhotoBottomAnchorProtocol) && (iSearchVideoBottomAnchorProtocol = (ISearchVideoBottomAnchorProtocol) obj) != null && (c13iqGN2 = iSearchVideoBottomAnchorProtocol.gN2()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind safeTriggerAssemLazyLoad assemClass = ");
            sbLIZ.append(c13iqGN2);
            sbLIZ.append(" aid = ");
            Aweme aweme = c659750PuH2.LL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            C723830SaL.LJ(this, c13iqGN2, true, null);
        }
        if (!c659750PuH2.LLIZ) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchPhotoFeedbackAssem.class), true, null);
            C723830SaL.LJ(this, C13LE.LIZ(SearchPhotoScreenEffectiveOptAssem.class), true, null);
            if (C1840307Ir.LIZ()) {
                C723830SaL.LJ(this, C13LE.LIZ(SearchPhotoCoverLabelAssem.class), true, null);
                if (C0PCU.LIZIZ()) {
                    C723830SaL.LJ(this, C13LE.LIZ(SearchHideLabelAssem.class), true, null);
                }
            }
        } else {
            C723830SaL.LJ(this, C13LE.LIZ(SearchVisualPhotoFeedbackAssem.class), true, null);
            if (C0BYF.LIZ()) {
                C723830SaL.LJ(this, C13LE.LIZ(VisualSearchPhotoIconLeftToRightAssem.class), true, null);
                C723830SaL.LJ(this, C13LE.LIZ(SearchPhotoCoverLabelAssem.class), true, null);
                if (C0PCU.LIZIZ()) {
                    C723830SaL.LJ(this, C13LE.LIZ(SearchHideLabelAssem.class), true, null);
                }
            }
        }
        C723830SaL.LJ(this, C13LE.LIZ(SearchPhotoLikeAssem.class), true, null);
        C723830SaL.LJ(this, C13LE.LIZ(SearchPhotoStaticInfoAssem.class), true, null);
        if (c659750PuH2.LLIZLLLIL != null && C1840007Io.LIZ() == 2 && C07GB.LIZ()) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchOutOfCoverAnchorAssem.class), true, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659750PuH c659750PuH) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659750PuH c659750PuH) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

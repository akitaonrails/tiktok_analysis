package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C01GW;
import X.C03H5;
import X.C07GB;
import X.C098200Yq;
import X.C0PCU;
import X.C0Q45;
import X.C0Q6K;
import X.C0QSJ;
import X.C1012300cRw;
import X.C1255704vj;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1830207Eu;
import X.C1830307Ev;
import X.C1830407Ew;
import X.C1840007Io;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C426750GoL;
import X.C452501pT;
import X.C659520Ptu;
import X.C659990Puf;
import X.C661470Px3;
import X.C664410Q4h;
import X.C665390Q8b;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C724240Sb0;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC665990QAj;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC664630Q5d;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import X.InterfaceC737790Swr;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.SearchOutOfCoverAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.ICardVisitedAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchVideoDurationAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchVideoDurationCountdownAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS32S0310000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchRootAssem extends ReusedUIContentAssem<SearchRootAssem> implements InterfaceC712990Rxx<C659520Ptu>, InterfaceC664630Q5d, ISearchCardElementVisibilityControlAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public final boolean LLJJJJ;
    public final C01GW LLJJJJJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchVideoHolderVM.class), AFwS241S0000000_10.get$arr$(247));
    public final View LLJJJJLIIL;
    public final View LLJJL;
    public final View LLJJLIIIJLLLLLLLZ;
    public final SearchRootAssem LLJL;
    public final SearchRootAssem LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public Integer LLJLLIL;
    public InterfaceC664630Q5d LLJLLL;
    public ISearchCardElementVisibilityControlAbility LLJZ;
    public ICardVisitedAbility LLJZIJLIL;
    public List<InterfaceC687730QyJ> LLL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            this.LLJLLL = (InterfaceC664630Q5d) obj;
            C687700QyG.LJFF(this, this.LLL, obj, cls);
        } else if (cls == ISearchCardElementVisibilityControlAbility.class) {
            this.LLJZ = (ISearchCardElementVisibilityControlAbility) obj;
        } else if (cls == ICardVisitedAbility.class) {
            this.LLJZIJLIL = (ICardVisitedAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchVideoScope.class, SearchCLASubtitleScope.class, SearchCardScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            return this.LLJLLL;
        }
        if (cls == ISearchCardElementVisibilityControlAbility.class) {
            return this.LLJZ;
        }
        if (cls == ICardVisitedAbility.class) {
            return this.LLJZIJLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchVideoScope.class);
        arrayList.add(SearchCLASubtitleScope.class);
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchCLASubtitleScope.class);
        arrayList.add(SearchCardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC664630Q5d.class) {
            this.LLJLLL = null;
        } else if (cls == ISearchCardElementVisibilityControlAbility.class) {
            this.LLJZ = null;
        } else if (cls == ICardVisitedAbility.class) {
            this.LLJZIJLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility
    public final void vs1() {
        this.LLJLL = true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC664630Q5d
    public final C1012300cRw El() {
        return (C1012300cRw) this.LLJJJJLIIL.findViewById(R.id.wm6);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility
    public final void T52() {
        View view;
        Integer num = this.LLJLLIL;
        if (num != null) {
            int iIntValue = num.intValue();
            TuxTextView tuxTextViewCp = cp();
            if (tuxTextViewCp != null) {
                tuxTextViewCp.setMaxLines(iIntValue);
            }
        }
        if (this.LLJLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("change [");
            sbLIZ.append(cp());
            sbLIZ.append("] to hide by ability, ");
            TuxTextView tuxTextViewCp2 = cp();
            Boolean boolValueOf = null;
            sbLIZ.append(tuxTextViewCp2 != null ? Boolean.valueOf(tuxTextViewCp2.isInLayout()) : null);
            sbLIZ.append(' ');
            TuxTextView tuxTextViewCp3 = cp();
            Object parent = tuxTextViewCp3 != null ? tuxTextViewCp3.getParent() : null;
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                boolValueOf = Boolean.valueOf(view.isInLayout());
            }
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            TuxTextView tuxTextViewCp4 = cp();
            if (tuxTextViewCp4 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewCp4, 8);
            }
        }
    }

    public final TuxTextView cp() {
        return (TuxTextView) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC664630Q5d
    public final TextView m7() {
        return (TextView) this.LLJJJJLIIL.findViewById(R.id.wm5);
    }

    @Override // X.InterfaceC664630Q5d
    public final C661470Px3 X4() {
        ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVideoHolderAbility.class, null);
        if (iSearchVideoHolderAbility != null) {
            return iSearchVideoHolderAbility.X4();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.anchor.abililty.ISearchCardElementVisibilityControlAbility
    public final void Xc1(int i) {
        this.LLJLLIL = 1;
        TuxTextView tuxTextViewCp = cp();
        if (tuxTextViewCp != null) {
            tuxTextViewCp.setMaxLines(1);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCLASubtitleScope.class}).unbindAbility(this.LLJL, InterfaceC664630Q5d.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCardScope.class}).unbindAbility(this.LLJLIL, ISearchCardElementVisibilityControlAbility.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById;
        Object c098200Yq;
        C665390Q8b.LIZ(this);
        boolean z = true;
        if (C1830307Ev.LIZ() == 1) {
            try {
                viewFindViewById = view.findViewById(R.id.bw7);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C664410Q4h.LIZIZ(C0Q45.COMMON, EnumC665990QAj.CONTAINER, e, "SearchRootAssem findBestMatchSlot primary lookup failed", C2097608Jq.LJ(), C2097608Jq.LJ(), "search_framework");
                try {
                    c098200Yq = LJJIJL().findViewById(R.id.bw7);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C664410Q4h.LIZIZ(C0Q45.COMMON, EnumC665990QAj.CONTAINER, thM5exceptionOrNullimpl, "SearchRootAssem findBestMatchSlot fallback lookup failed", C2097608Jq.LJ(), C2097608Jq.LJ(), "search_framework");
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                viewFindViewById = (View) c098200Yq;
            }
            if (viewFindViewById == null) {
            }
            C723830SaL.LIZ(this, null, new AwS32S0310000_10(this, z, viewFindViewById, view, 2));
        }
        viewFindViewById = null;
        z = false;
        C723830SaL.LIZ(this, null, new AwS32S0310000_10(this, z, viewFindViewById, view, 2));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCLASubtitleScope.class}).bindAbility(this.LLJL, InterfaceC664630Q5d.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SearchCardScope.class}).bindAbility(this.LLJLIL, ISearchCardElementVisibilityControlAbility.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLL == null) {
            this.LLL = new ArrayList();
        }
        ((ArrayList) this.LLL).add(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqGN2;
        String aid;
        ISearchVideoBottomAnchorProtocol iSearchVideoBottomAnchorProtocol;
        C659520Ptu c659520Ptu2 = c659520Ptu;
        this.LLJLL = false;
        this.LLJLLIL = null;
        Object obj = C659990Puf.LIZIZ().get(c659520Ptu2.LLILLL);
        if ((obj instanceof ISearchVideoBottomAnchorProtocol) && (iSearchVideoBottomAnchorProtocol = (ISearchVideoBottomAnchorProtocol) obj) != null) {
            c13iqGN2 = iSearchVideoBottomAnchorProtocol.gN2();
        } else {
            c13iqGN2 = null;
        }
        if (c13iqGN2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBind safeTriggerAssemLazyLoad assemClass = ");
            sbLIZ.append(c13iqGN2);
            sbLIZ.append(" aid = ");
            Aweme aweme = c659520Ptu2.LL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            C723830SaL.LJ(this, c13iqGN2, true, null);
        }
        Aweme aweme2 = c659520Ptu2.LL;
        if (C0Q6K.LIZ(aweme2) && !C1255704vj.LIZ().LJIILIIL(C724240Sb0.LJI(this))) {
            if (C1830207Eu.LIZ()) {
                C786410Ut5.LJLLLLLL(0, this.LLJJJJLIIL);
                C786410Ut5.LLIL(m7(), 8);
                C786410Ut5.r1(El(), 8);
                View viewFindViewById = LJJIJL().findViewById(R.id.wm6);
                if (viewFindViewById != null) {
                    C426750GoL.LJIIIZ(viewFindViewById, null, null, null, 0, false, 23);
                }
                C723830SaL.LJ(this, C13LE.LIZ(SearchCLASubtitleCommonAssem.class), true, null);
            } else {
                C723830SaL.LJ(this, C13LE.LIZ(SearchCLASubtitleAssem.class), true, null);
            }
        }
        if (!this.LLJJJJ) {
            int iIntValue = ((Number) C1830407Ew.LIZ.getValue()).intValue();
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    C723830SaL.LJ(this, C13LE.LIZ(SearchVideoDurationCountdownAssem.class), true, null);
                }
            } else {
                C723830SaL.LJ(this, C13LE.LIZ(SearchVideoDurationAssem.class), true, null);
            }
        }
        if (C0PCU.LIZJ()) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchLoadingAssem.class), true, null);
        }
        if (C0PCU.LIZIZ()) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchHideLabelAssem.class), true, null);
        }
        if (c659520Ptu2.LLIZLLLIL != null && C1840007Io.LIZ() == 2 && C07GB.LIZ()) {
            C723830SaL.LJ(this, C13LE.LIZ(SearchOutOfCoverAnchorAssem.class), false, null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    public SearchRootAssem(View view, boolean z) {
        View viewFindViewById;
        this.LLJJJJ = z;
        this.LLJJJJLIIL = view.findViewById(R.id.ues);
        this.LLJJL = view.findViewById(R.id.dze);
        if (C07GB.LIZ()) {
            viewFindViewById = view.findViewById(R.id.u7d);
        } else {
            viewFindViewById = null;
        }
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        this.LLJL = this;
        this.LLJLIL = this;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 532));
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}

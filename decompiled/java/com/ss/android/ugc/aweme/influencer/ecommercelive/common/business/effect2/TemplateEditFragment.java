package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1391190mJ3;
import X.C13LE;
import X.C1421105hJ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1723530ux5;
import X.C1729250v6J;
import X.C1729570v6p;
import X.C1730240v7u;
import X.C1730250v7v;
import X.C1730260v7w;
import X.C1730290v7z;
import X.C1741890vQh;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C343950De5;
import X.C416901jj;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1729710v73;
import X.InterfaceC1730230v7t;
import X.InterfaceC1730270v7x;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.BigSaleTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.DiscountTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.FlashDealTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.LiveGiveawayTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.MultiTextTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.ProductTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.ShopBagTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.SingleTextTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.SizeChartTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BigSaleTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.FlashDealTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ShopBagTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SingleTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SizeChartTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateEditFragment extends Fragment implements InterfaceC344240DeY, InterfaceC1730230v7t, InterfaceC724530SbT {
    public static final C1730250v7v LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiLyMmLSsvLD19LSYjJCI2OiYpJSYlHELIOSLWsvJiI+JytiKzogISspOjx9LSMqLCwnemsYLCIjJCQ4LAo3ITEKOy40JSAiPQ==";
    public LinearLayout LL;
    public C1749280vcc LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public InterfaceC1730270v7x LLILZIL;
    public InterfaceC1729710v73 LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public TemplateItem LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateEditFragment.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TemplateEditFragment.class, "bottomAreaViewModel", "getBottomAreaViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/TemplateEditBottomAreaViewModel;", 0)};
        LLJILJIL = new C1730250v7v();
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public TemplateEditFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BillboardGlobalViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 764);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(342);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 765), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 766), aFwS268S0000000_26, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 767), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLL = assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TemplateEditBottomAreaViewModel.class);
        AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26(c19719912DlLIZ2, 768);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(343);
        if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 769), aFwS268S0000000_262, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new AwS570S0100000_26((Fragment) this, 770), aFwS268S0000000_262, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 763), aFwS268S0000000_262, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLILZ = assemVMLazy2;
        this.LLJ = -1L;
    }

    public final BillboardGlobalViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    public final C1749280vcc NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w0t) : null;
            this.LLILLJJLI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131821601);
        c0om1.LIZJ = c1250250idj;
        Integer numLIZ = C1723530ux5.LIZ(getContext());
        if (numLIZ != null) {
            c0om1.LIZJ(numLIZ.intValue());
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 762));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // X.InterfaceC1730230v7t
    public final void eN() {
        String templateId;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, new C343950De5());
        MR().yQ2(0);
        RootData rootData = MR().getState().LL;
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
        boolean z = rootData.isNewUser;
        TemplateItem templateItem = this.LLJI;
        if (templateItem == null || (templateId = templateItem.getTemplateId()) == null) {
            templateId = "";
        }
        TemplateItem templateItem2 = this.LLJI;
        int type = templateItem2 != null ? templateItem2.getType() : 0;
        String strLIZ = rootData.LIZ();
        int i = rootData.templateEntryType;
        C1730290v7z c1730290v7z = C1730290v7z.LIZ;
        TemplateItem templateItem3 = this.LLJI;
        c1730290v7z.getClass();
        C1729250v6J.LJ(str2, str3, jCurrentTimeMillis, z, templateId, type, "display", strLIZ, i, C1730290v7z.LJIILJJIL(templateItem3));
        InterfaceC1729710v73 interfaceC1729710v73 = this.LLILZLL;
        if (interfaceC1729710v73 != null) {
            interfaceC1729710v73.m3(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() throws JSONException {
        super.onDestroy();
        C1729570v6p.LIZIZ(System.currentTimeMillis() - this.LLIZLLLIL, "notice_board_edit", "notice_board_template", "onResume", "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws JSONException {
        super.onResume();
        C1729570v6p.LIZIZ(System.currentTimeMillis() - this.LLIZLLLIL, "notice_board_edit", "notice_board_template", "onViewCreated", "onResume");
        this.LLIZLLLIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1730230v7t
    public final void mM(TemplateItem templateItem) {
        InterfaceC1730270v7x interfaceC1730270v7x = this.LLILZIL;
        if (interfaceC1730270v7x != null) {
            interfaceC1730270v7x.LIZ();
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, new C343950De5());
        RootData rootData = MR().getState().LL;
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
        boolean z = rootData.isNewUser;
        String templateId = templateItem.getTemplateId();
        int type = templateItem.getType();
        String strLIZ = rootData.LIZ();
        int i = rootData.templateEntryType;
        C1730290v7z.LIZ.getClass();
        C1729250v6J.LJ(str2, str3, jCurrentTimeMillis, z, templateId, type, "save", strLIZ, i, C1730290v7z.LJIILJJIL(templateItem));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLIZ = jCurrentTimeMillis;
        this.LLIZLLLIL = jCurrentTimeMillis;
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        TemplateItem templateItem;
        HashMap<String, Object> mapLJIIJ;
        boolean zLJFF;
        Object obj;
        Object obj2;
        Integer numLJIIJJI;
        Object obj3;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        View[] viewArr = new View[1];
        View viewFindViewById = this.LL;
        Object obj4 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.ncv);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LinearLayout) viewFindViewById;
        }
        viewArr[0] = viewFindViewById;
        C1723530ux5.LIZIZ(context, viewArr);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        long j = arguments.getLong("create_time");
        long j2 = arguments.getLong("server_time");
        this.LLJ = arguments.getLong("start_click_time", -1L);
        if (arguments.getInt("schema") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = z;
        if (z) {
            Uri uri = (Uri) arguments.getParcelable("uri");
            if (uri != null) {
                String strLIZ = C416901jj.LIZ(uri, "track_params");
                if (strLIZ != null) {
                    mapLJIIJ = C1741890vQh.LJIIJ(strLIZ);
                } else {
                    mapLJIIJ = null;
                }
                RootData rootData = new RootData(null, null, false, 31);
                if (mapLJIIJ != null && (obj3 = mapLJIIJ.get("is_new_user")) != null) {
                    zLJFF = Intrinsics.LJFF(obj3, "1");
                } else {
                    zLJFF = false;
                }
                rootData.isNewUser = zLJFF;
                if (mapLJIIJ == null || (obj = mapLJIIJ.get("author_id")) == null) {
                    obj = "";
                }
                rootData.authorId = obj.toString();
                if (mapLJIIJ == null || (obj2 = mapLJIIJ.get("room_id")) == null) {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                rootData.roomId = obj2.toString();
                MR().wQ2(rootData, false);
                MR().xQ2();
                String strLIZ2 = C416901jj.LIZ(uri, "template_cache_key");
                String strLIZ3 = C416901jj.LIZ(uri, "template_type");
                if (strLIZ3 != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(strLIZ3);
                } else {
                    numLJIIJJI = null;
                }
                AssemVMLazy assemVMLazy = this.LLILZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
                C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0v7s
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj5) {
                        return ((C1730180v7o) obj5).LLILZ;
                    }
                }, C736820SvI.LIZLLL(), new AwS640S0100000_26(this, 0), 4);
                TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel = (TemplateEditBottomAreaViewModel) this.LLILZ.getValue();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(templateEditBottomAreaViewModel), null, null, new C1730240v7u(rootData.roomId, rootData.authorId, strLIZ2, null, numLJIIJJI, templateEditBottomAreaViewModel, null), 3);
                return;
            }
            return;
        }
        try {
            obj4 = arguments.get("extras_template_item");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if ((obj4 instanceof TemplateItem) && (templateItem = (TemplateItem) obj4) != null) {
            OR(templateItem, j, j2, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bu7, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    public final void OR(TemplateItem templateItem, long j, long j2, boolean z) {
        Class cls;
        C19719912Dl c19719912DlLIZ;
        this.LLJI = templateItem;
        if (templateItem instanceof MultiTextTemplateItem) {
            c19719912DlLIZ = C13LE.LIZ(MultiTextTemplateEditAssem.class);
        } else if (templateItem instanceof SingleTextTemplateItem) {
            c19719912DlLIZ = C13LE.LIZ(SingleTextTemplateEditAssem.class);
        } else if (templateItem instanceof ProductTemplateItem) {
            c19719912DlLIZ = C13LE.LIZ(ProductTemplateEditAssem.class);
        } else if (templateItem instanceof DiscountTemplateItem) {
            c19719912DlLIZ = C13LE.LIZ(DiscountTemplateEditAssem.class);
        } else if (templateItem instanceof SizeChartTemplateItem) {
            c19719912DlLIZ = C13LE.LIZ(SizeChartTemplateEditAssem.class);
        } else if (templateItem instanceof ShopBagTemplateItem) {
            c19719912DlLIZ = C13LE.LIZ(ShopBagTemplateEditAssem.class);
        } else if (templateItem instanceof BigSaleTemplateItem) {
            c19719912DlLIZ = C13LE.LIZ(BigSaleTemplateEditAssem.class);
        } else if (templateItem instanceof FlashDealTemplateItem) {
            c19719912DlLIZ = C13LE.LIZ(FlashDealTemplateEditAssem.class);
        } else {
            if (templateItem instanceof LiveGiveawayTemplateItem) {
                cls = LiveGiveawayTemplateEditAssem.class;
            } else {
                cls = SingleTextTemplateEditAssem.class;
            }
            c19719912DlLIZ = C13LE.LIZ(cls);
        }
        C723850SaN.LIZ(this, false, null, new C1730260v7w(this, templateItem, z, c19719912DlLIZ, j, j2), 3);
        RootData rootData = MR().getState().LL;
        String str = rootData.roomId;
        String str2 = rootData.authorId;
        boolean z2 = rootData.isNewUser;
        String templateId = templateItem.getTemplateId();
        int type = templateItem.getType();
        String strLIZ = rootData.LIZ();
        int i = rootData.templateEntryType;
        C1730290v7z.LIZ.getClass();
        boolean zLJIILJJIL = C1730290v7z.LJIILJJIL(templateItem);
        Map mapLIZ = C1729250v6J.LIZ(str, str2, strLIZ, z2, "notice_board_edit", Integer.valueOf(i));
        mapLIZ.put("template_id", templateId);
        mapLIZ.put("template_type", Integer.valueOf(type));
        mapLIZ.put("is_suggested_template", Integer.valueOf(zLJIILJJIL ? 1 : 0));
        C1421105hJ.LIZJ("livesdk_tiktokec_enter_page", mapLIZ);
        C1729570v6p.LIZLLL(System.currentTimeMillis() - this.LLJ, "notice_board_edit", "notice_board_template");
        C1729570v6p.LIZIZ(System.currentTimeMillis() - this.LLIZLLLIL, "notice_board_edit", "notice_board_template", "onCreate", "onViewCreated");
        this.LLIZLLLIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}

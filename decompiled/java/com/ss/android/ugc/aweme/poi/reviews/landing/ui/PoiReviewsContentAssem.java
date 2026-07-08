package com.ss.android.ugc.aweme.poi.reviews.landing.ui;

import X.C019F;
import X.C01GW;
import X.C03IJ;
import X.C09R3;
import X.C0HTI;
import X.C0T8U;
import X.C108400b4;
import X.C1161980gLM;
import X.C1186690gzD;
import X.C1187180h00;
import X.C1189960h4U;
import X.C1189970h4V;
import X.C1190160h4o;
import X.C1190250h4x;
import X.C1190360h58;
import X.C1190400h5C;
import X.C1190460h5I;
import X.C1190690h5f;
import X.C1190970h67;
import X.C1390410mHn;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C21578619ce;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C326850Crb;
import X.C418440Gaw;
import X.C425980Gn6;
import X.C452501pT;
import X.C622680Oba;
import X.C627660Ojc;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C787880UvS;
import X.C814420VxA;
import X.EnumC1156340gCG;
import X.EnumC1190310h53;
import X.InterfaceC1189980h4W;
import X.InterfaceC1191710h7J;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewsListAbility;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS440S0200000_4;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsContentAssem extends UIListContentAssem<PoiReviewsListViewModel> implements PoiReviewsListItemCell.PoiReviewCellVAbility, PoiReviewsListAbility, InterfaceC1189980h4W {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1190460h5I.class, "PoiReviewHierarchyData"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public C1190360h58 LLJILJIL;
    public C0T8U LLJILJILJ;
    public C1190400h5C LLJILLL;
    public C1190970h67 LLJJ;
    public C787880UvS LLJJI;
    public C1749280vcc LLJJIII;
    public C21578619ce LLJJIJI;
    public C425980Gn6 LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxTextView LLJJJ;
    public LinearLayout LLJJJIL;
    public C1749280vcc LLJJJJ;
    public PoiReviewsApi.PoiReviewDisclaimer LLJJJJJIL;
    public UrlModel LLJJJJLIIL;
    public boolean LLJJL;
    public final C1161980gLM LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final int LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public View LLJLLIL;
    public C1390410mHn LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsContentAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiReviewsContentAssem.class, "globalVM", "getGlobalVM()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsLandingViewModel;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiReviewsContentAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1836), AFwS256S0000000_18.get$arr$(580), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiReviewsLandingViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1837), AFwS256S0000000_18.get$arr$(581), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1832));
        this.LLJJLIIIJLLLLLLLZ = new C1161980gLM("poi_reviews", new AwS562S0100000_18(this, 1833), new AwS562S0100000_18(this, 1834), AFwS206S0000000_18.get$arr$(472));
        this.LLJL = true;
        this.LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell.PoiReviewCellVAbility
    public final C1190690h5f G1() {
        return new C1190690h5f();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        int iIntValue = ((Number) C108400b4.LIZ.getValue()).intValue();
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        c20603715jn.LIZ = iIntValue;
        return c20603715jn;
    }

    public final PoiReviewsListViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (PoiReviewsListViewModel) assemVMLazy.getValue();
    }

    public final PoiReviewsLandingViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (PoiReviewsLandingViewModel) assemVMLazy.getValue();
    }

    public final C1190460h5I Oo() {
        return (C1190460h5I) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        return Lo();
    }

    public final boolean So() {
        C1190460h5I c1190460h5IOo = Oo();
        if (c1190460h5IOo == null) {
            return false;
        }
        Integer num = c1190460h5IOo.LLILLJJLI;
        return num != null && num.intValue() == EnumC1156340gCG.POI_REVIEW_TABELOG_TAB.getValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell.PoiReviewCellVAbility
    public final UrlModel nj0() {
        if (So()) {
            return this.LLJJJJLIIL;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C622680Oba.LIZ(this)) {
            C622680Oba.LIZLLL(this);
        }
        C1161980gLM c1161980gLM = this.LLJJLIIIJLLLLLLLZ;
        RecyclerView recyclerView = c1161980gLM.LJI;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(c1161980gLM.LJII);
        }
        c1161980gLM.LJI = null;
        c1161980gLM.LJFF = null;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell.PoiReviewCellVAbility
    public final InterfaceC1191710h7J r0() {
        return Lo();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell.PoiReviewCellVAbility
    public final PoiReviewsApi.PoiReviewDisclaimer si0() {
        if (So()) {
            return this.LLJJJJJIL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewsListAbility
    public final void F90(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        C1190460h5I c1190460h5IOo = Oo();
        if (c1190460h5IOo != null) {
            Integer num = c1190460h5IOo.LLILLJJLI;
            int value = EnumC1190310h53.POI_REVIEW_TAB_TIKTOK.getValue();
            if (num != null && num.intValue() == value) {
                Lo().F90(poiReviewModel);
                C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0h5N
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1190250h4x) obj).LLJ;
                    }
                }, null, new AwS440S0200000_4(poiReviewModel, this, 5), 6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Vo(C1749280vcc c1749280vcc) {
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse;
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusAssem - onSuccess, listItemState is Empty: ");
        List<InterfaceC1891350zJl> list = ((C1190250h4x) Lo().getState()).LLJ.LLILZ;
        Boolean boolValueOf = null;
        if (list != null) {
            boolValueOf = Boolean.valueOf(list.isEmpty());
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        List<InterfaceC1891350zJl> list2 = ((C1190250h4x) Lo().getState()).LLJ.LLILZ;
        if (list2 != null && list2.isEmpty() && (poiReviewListResponse = ((C1190250h4x) Lo().getState()).LLIZLLLIL) != null && Intrinsics.LJFF(poiReviewListResponse.getFoldedHasMore(), Boolean.FALSE) && !Lo().LLJJJ) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n4;
            Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            Context context = getContext();
            if (context == null || (string = context.getString(2131846604)) == null) {
                string = "";
            }
            c1722300uv6.LJI = string;
            c1749280vcc.setStatus(c1722300uv6);
            C21578619ce c21578619ce = this.LLJJIJI;
            if (c21578619ce != null) {
                C786410Ut5.LLIZ(c21578619ce, 0);
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            return;
        }
        if (c1749280vcc.getVisibility() != 8) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        C21578619ce c21578619ce2 = this.LLJJIJI;
        if (c21578619ce2 == null) {
            return;
        }
        C786410Ut5.LLIZ(c21578619ce2, 8);
    }

    @Override // X.InterfaceC1189980h4W
    @C14EU(threadMode = ThreadMode.MAIN)
    public void onDeleteReviewEvent(C1187180h00 c1187180h00) {
        C1189960h4U.onDeleteReviewEvent(this, c1187180h00);
    }

    @Override // X.InterfaceC1189980h4W
    @C14EU(threadMode = ThreadMode.MAIN)
    public void onInteractionReviewEvent(C1189970h4V c1189970h4V) {
        C1189960h4U.onInteractionReviewEvent(this, c1189970h4V);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContentAssem for r19v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContentAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC1189980h4W
    @C14EU(threadMode = ThreadMode.MAIN)
    public void onWriteReviewEvent(C1186690gzD c1186690gzD) {
        C1189960h4U.onWriteReviewEvent(this, c1186690gzD);
    }

    @Override // X.InterfaceC1189980h4W
    public final void A8(PoiReviewsApi.PoiReviewModel poiReviewModel, String str) {
        C1190460h5I c1190460h5IOo;
        if (Intrinsics.LJFF(str, Lo().LL) && (c1190460h5IOo = Oo()) != null) {
            Integer num = c1190460h5IOo.LLILLJJLI;
            int value = EnumC1190310h53.POI_REVIEW_TAB_TIKTOK.getValue();
            if (num != null && num.intValue() == value) {
                Lo().F90(poiReviewModel);
                C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0h5P
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1190250h4x) obj).LLJ;
                    }
                }, null, new AwS440S0200000_4(poiReviewModel, this, 17), 6);
            }
        }
    }

    @Override // X.InterfaceC1189980h4W
    public final void fk(String str, String str2) {
        if (!Intrinsics.LJFF(str, Lo().LL)) {
            return;
        }
        PoiReviewsListViewModel poiReviewsListViewModelLo = Lo();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(poiReviewsListViewModelLo), null, null, new C326850Crb(poiReviewsListViewModelLo, str, str2, null), 3);
        C1190160h4o.LIZ.getClass();
        C1190160h4o.LIZIZ = null;
        C1190160h4o.LIZJ = null;
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewsListAbility
    public final void iM2(String str, String str2) {
        PoiReviewsListViewModel poiReviewsListViewModelLo = Lo();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(poiReviewsListViewModelLo), null, null, new C326850Crb(poiReviewsListViewModelLo, str2, str, null), 3);
        C1190160h4o.LIZ.getClass();
        C1190160h4o.LIZIZ = null;
        C1190160h4o.LIZJ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1189980h4W
    public final void i5(int i, String str, long j, String str2) {
        List<InterfaceC1891350zJl> list;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy2;
        PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModelCopy3;
        if (!Intrinsics.LJFF(str, Lo().LL)) {
            return;
        }
        PoiReviewsListViewModel poiReviewsListViewModelLo = Lo();
        C627660Ojc<InterfaceC1891350zJl> c627660Ojc = ((C1190250h4x) poiReviewsListViewModelLo.getState()).LLJ;
        if (c627660Ojc != null && (list = c627660Ojc.LLILZ) != null) {
            int i2 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                int i3 = i2 + 1;
                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModelCopy = null;
                if (i2 >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                    if (interfaceC1891350zJl2 instanceof PoiReviewsApi.PoiReviewModel) {
                        PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl2;
                        if (Intrinsics.LJFF(poiReviewModel.getReviewId(), str2) && Intrinsics.LJFF(poiReviewModel.getPoiId(), str)) {
                            if (i != 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
                                        if (statistics != null) {
                                            poiReviewStatisticsModelCopy3 = statistics.copy(Long.valueOf(j));
                                        } else {
                                            poiReviewStatisticsModelCopy3 = null;
                                        }
                                        PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
                                        if (userStatus != null) {
                                            poiReviewUserStatusModelCopy = userStatus.copy(Boolean.FALSE, Boolean.TRUE);
                                        }
                                        poiReviewsListViewModelLo.listSetItemAt(i2, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy3, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                        return;
                                    }
                                    return;
                                }
                                PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
                                if (statistics2 != null) {
                                    poiReviewStatisticsModelCopy2 = statistics2.copy(Long.valueOf(j));
                                } else {
                                    poiReviewStatisticsModelCopy2 = null;
                                }
                                PoiReviewsApi.PoiReviewUserStatusModel userStatus2 = poiReviewModel.getUserStatus();
                                if (userStatus2 != null) {
                                    poiReviewUserStatusModelCopy = userStatus2.copy(Boolean.TRUE, Boolean.FALSE);
                                }
                                poiReviewsListViewModelLo.listSetItemAt(i2, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy2, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                                return;
                            }
                            PoiReviewsApi.PoiReviewStatisticsModel statistics3 = poiReviewModel.getStatistics();
                            if (statistics3 != null) {
                                poiReviewStatisticsModelCopy = statistics3.copy(Long.valueOf(j));
                            } else {
                                poiReviewStatisticsModelCopy = null;
                            }
                            PoiReviewsApi.PoiReviewUserStatusModel userStatus3 = poiReviewModel.getUserStatus();
                            if (userStatus3 != null) {
                                Boolean bool = Boolean.FALSE;
                                poiReviewUserStatusModelCopy = userStatus3.copy(bool, bool);
                            }
                            poiReviewsListViewModelLo.listSetItemAt(i2, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewStatisticsModelCopy, poiReviewUserStatusModelCopy, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, poiReviewModel.LLILZLL, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
                            return;
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}

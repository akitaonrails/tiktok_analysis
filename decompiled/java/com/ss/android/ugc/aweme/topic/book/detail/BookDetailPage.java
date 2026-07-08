package com.ss.android.ugc.aweme.topic.book.detail;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0O4B;
import X.C0O4X;
import X.C0OAN;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C306780C0u;
import X.C338490DOt;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C626710Oi5;
import X.C626730Oi7;
import X.C626850OiJ;
import X.C626890OiN;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C987103tV;
import X.EnumC626900OiO;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.NavActionProvider;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BookDetailPage extends DetailBaseFragment implements ShootAbility, InterfaceC724530SbT, RefreshAbility, NavActionProvider, ViewPagerPageSelectedSubscriber {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSHELIOSYwZicjJiR9LCA4KCY/ZgcjJiQXLTEtICMDKSIp";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(319), "book_id", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(320), "tab", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(321), "enter_from", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.optionalArg(this, AFwS240S0000000_9.get$arr$(631), "show_recommend", Boolean.class);
    public final AssemVMLazy LLJIJIL;
    public final C736950SvV LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C736950SvV LLJJ;
    public final String LLJJI;
    public volatile boolean LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BookDetailPage.class, "bookDetailVM", "getBookDetailVM()Lcom/ss/android/ugc/aweme/topic/book/detail/vm/BookDetailVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BookDetailPage.class, "topicReviewVM", "getTopicReviewVM()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BookDetailPage.class, "topicReviewListVM", "getTopicReviewListVM()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewListVM;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return "book_detail_page";
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

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void te0() {
    }

    public BookDetailPage() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BookDetailVM.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1532);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(633);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJIJIL = new AssemVMLazy(function0LJIIJ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1533), aFwS240S0000000_9);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(this, 1526);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(BookVideoListVM.class), awS553S0100000_92, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(629), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TopicReviewVM.class);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(c19719912DlLIZ2, 1534);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(634);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_93, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1522), aFwS240S0000000_92, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_93, new AwS553S0100000_9((Fragment) this, 1523), aFwS240S0000000_92, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1524), aFwS240S0000000_92, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJILJ = assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TopicReviewListVM.class);
        AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ3, 1525);
        AFwS240S0000000_9 aFwS240S0000000_93 = AFwS240S0000000_9.get$arr$(632);
        if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_94, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1529), aFwS240S0000000_93, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_94, new AwS553S0100000_9((Fragment) this, 1530), aFwS240S0000000_93, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS553S0100000_94, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1531), aFwS240S0000000_93, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy2;
        AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(this, 1527);
        this.LLJJ = new C736950SvV(C13LE.LIZ(TopicRecommendListVM.class), awS553S0100000_95, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(630), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJI = String.valueOf(System.currentTimeMillis());
    }

    public final BookDetailVM UR() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (BookDetailVM) assemVMLazy.getValue();
    }

    public final String VR() {
        return (String) this.LLIZ.getValue();
    }

    public final TopicRecommendListVM WR() {
        return (TopicRecommendListVM) this.LLJJ.getValue();
    }

    public final TopicReviewListVM ZR() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (TopicReviewListVM) assemVMLazy.getValue();
    }

    public final TopicReviewVM aS() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (TopicReviewVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void lP0() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LIZJ(getActivity(), "book_topic", true)) {
            return;
        }
        C736680Sv4.LJIJJ(UR(), new AwS588S0100000_9(this, 394));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        ((BookVideoListVM) this.LLJILJIL.getValue()).LLIZLLLIL = true;
        UR().LLILLL = true;
        BookDetailVM bookDetailVMUR = UR();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bookDetailVMUR), null, null, new C0O4B(bookDetailVMUR, null), 3);
        ((AssemSingleListViewModel) this.LLJILJIL.getValue()).manualListRefresh();
        ZR().manualListRefresh();
        if (C306780C0u.LIZ() && Intrinsics.LJFF(this.LLJI.getValue(), Boolean.TRUE)) {
            TopicRecommendListVM topicRecommendListVMWR = WR();
            topicRecommendListVMWR.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(topicRecommendListVMWR), null, null, new C0OAN(topicRecommendListVMWR, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.NavActionProvider
    public final List<AbstractC1250290idn> ar0() {
        C19EG activity = getActivity();
        if (activity == null) {
            return null;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB.LIZJ(new AwS410S0200000_9(activity, this, 67));
        return Collections.singletonList(c1251150ifB);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C20684815ws.LJIILLIIL("close_detail_page", C2097908Jt.LIZJ(new Pair("enter_from", "book_detail_page")));
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void nm1() {
        lP0();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.topic.book.detail.BookDetailPage for r11v10 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.book.detail.BookDetailPage.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber
    public final void Pm0(int i, EnumC626900OiO enumC626900OiO) {
        String str;
        String str2;
        String str3;
        C626710Oi5 c626710Oi5 = C626710Oi5.LIZ;
        int i2 = C626890OiN.LIZ[enumC626900OiO.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (this.LLJJIII) {
                        str = "post_review";
                    } else {
                        str = "click";
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "slide";
            }
        } else {
            str = "enter_topic_detail";
        }
        Object value = this.LLJ.getValue();
        String strLIZ = C626730Oi7.LIZ(aS().LLILLJJLI);
        String str4 = aS().LL;
        Object obj = ((LinkedHashMap) aS().LLILLL).get("topic_title");
        if (i == 0) {
            str2 = "videos";
        } else {
            str2 = "reviews";
        }
        Boolean boolValueOf = Boolean.valueOf(aS().getState().LLILZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c626710Oi5.getClass();
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("enter_from", "topic_detail");
        pairArr[1] = new Pair("enter_method", str);
        pairArr[2] = new Pair("previous_page", value);
        pairArr[3] = new Pair("category", strLIZ);
        pairArr[4] = new Pair("topic_id", str4);
        pairArr[5] = new Pair("topic_title", obj);
        pairArr[6] = new Pair("tab_name", str2);
        if (boolValueOf != null) {
            if (boolValueOf.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str3 = null;
        }
        pairArr[7] = new Pair("is_score", str3);
        C20684815ws.LJIILLIIL("enter_topic_detail_tab", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), linkedHashMap));
        this.LLJJIII = false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UR().LL = VR();
        ((BookVideoListVM) this.LLJILJIL.getValue()).LLILZIL = VR();
        ((BookVideoListVM) this.LLJILJIL.getValue()).LLILZLL = this.LLJJI;
        aS().LL = VR();
        TopicReviewVM topicReviewVMAS = aS();
        C0O4X c0o4x = C0O4X.BOOK;
        topicReviewVMAS.LLILLJJLI = c0o4x.getType();
        aS().LLILLL.put("previous_page", (String) this.LLJ.getValue());
        ZR().LL = VR();
        ZR().LLILLJJLI = c0o4x.getType();
        ZR().LLILLL.put("previous_page", (String) this.LLJ.getValue());
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 47), 3);
        AssemViewModel.asyncSubscribe$default(UR(), new C2217381BqS() { // from class: X.0O4c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O46) obj).LL;
            }
        }, null, new AwS588S0100000_9(this, 392), new AwS553S0100000_9(this, 1528), new AwS588S0100000_9(this, 393), 2, null);
        if (C306780C0u.LIZ() && Intrinsics.LJFF(this.LLJI.getValue(), Boolean.TRUE)) {
            WR().LL = c0o4x;
            WR().LLILLJJLI = VR();
            TopicRecommendListVM topicRecommendListVMWR = WR();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("topic_recommend_list_vm");
            sbLIZ.append(VR());
            sbLIZ.append(this.LLJJI);
            topicRecommendListVMWR.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
            C736680Sv4.LJIIIIZZ(this, WR(), new C2217381BqS() { // from class: X.0OiK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OAO) obj).LLILLJJLI;
                }
            }, null, new AwS623S0100000_9(this, 144), 6);
            TopicRecommendListVM topicRecommendListVMWR2 = WR();
            topicRecommendListVMWR2.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(topicRecommendListVMWR2), null, null, new C0OAN(topicRecommendListVMWR2, null), 3);
        }
        BookDetailVM bookDetailVMUR = UR();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bookDetailVMUR), null, null, new C0O4B(bookDetailVMUR, null), 3);
        TopicReviewVM topicReviewVMAS2 = aS();
        C626850OiJ c626850OiJ = new C2217381BqS() { // from class: X.0OiJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C626430Ohd) obj).LLILZLL;
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        C736680Sv4.LJIIIIZZ(this, topicReviewVMAS2, c626850OiJ, c1770850wBP, new AwS623S0100000_9(this, 145), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        Integer numLIZJ;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(R.id.ex3);
        frameLayout.setFitsSystemWindows(true);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
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

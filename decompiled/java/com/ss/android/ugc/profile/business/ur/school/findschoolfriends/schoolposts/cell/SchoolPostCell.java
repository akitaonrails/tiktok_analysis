package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell;

import X.AbstractC1386130mAt;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C06VM;
import X.C0DOO;
import X.C0IKF;
import X.C0OAD;
import X.C123100dR;
import X.C1243240iSQ;
import X.C1245980iWq;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389340mG4;
import X.C13LE;
import X.C1581170rFT;
import X.C1581180rFU;
import X.C1581410rFr;
import X.C1605200rsE;
import X.C1843500y4a;
import X.C1910890zpH;
import X.C1912107eJ;
import X.C19651011uW;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19738212Km;
import X.C19738412Ko;
import X.C19EG;
import X.C20244914Jj;
import X.C21681819tI;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427660Gpo;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C465320IMo;
import X.C734140Sqy;
import X.C735410St1;
import X.C735840Sti;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1084770eKp;
import X.EnumC1334360kpO;
import X.EnumC1581430rFt;
import X.EnumC714850S2h;
import X.InterfaceC1245990iWr;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS158S0100000_24;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS69S0100000_24;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS673S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SchoolPostCell extends PowerCell<C1581170rFT> implements View.OnTouchListener, View.OnLongClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public C427660Gpo LLILZ;
    public TextView LLILZIL;
    public LinearLayout LLILZLL;
    public C06VM LLIZ;
    public TuxTextView LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public C734140Sqy LLJILJILJ;
    public TuxIconDrawable LLJJ;
    public boolean LLJJIII;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public final AssemVMLazy LLJJJIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(171));
    public final MutableLiveData<String> LLJILLL = new MutableLiveData<>(null);
    public int LLJJI = -1;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1617));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1602));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SchoolPostCell.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/schoolposts/SchoolPostsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SchoolPostCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SchoolPostsListViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1619);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(544);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 1608), awS568S0100000_24, AFwS224S0000000_33.get$arr$(529), new AwS568S0100000_24((C03K6) this, 1609), new AwS568S0100000_24((C03K6) this, 1611), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1613), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 1615), null, new AwS568S0100000_24((C03K6) this, 1616));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((C03K6) this, 1610);
            AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1612);
            AwS568S0100000_24 awS568S0100000_244 = new AwS568S0100000_24(c19719912DlLIZ, 1614);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS568S0100000_242, 146));
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c01gwLIZIZ, 3751);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c01gwLIZIZ, 3752);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c01gwLIZIZ, 3753);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 3754);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3755);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS568S0100000_244, awS568S0100000_24, new C452080Ho6(), awS577S0100000_33, awS577S0100000_332, awS568S0100000_243, aFwS264S0000000_24, awS577S0100000_333, awS577S0100000_334, awS577S0100000_335);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 1618), awS568S0100000_24, AFwS224S0000000_33.get$arr$(530), new AwS568S0100000_24((C03K6) this, 1620), new AwS568S0100000_24((C03K6) this, 1598), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1599), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 1600), null, new AwS568S0100000_24((C03K6) this, 1601));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 1603), awS568S0100000_24, AFwS224S0000000_33.get$arr$(528), new AwS568S0100000_24((C03K6) this, 1604), new AwS568S0100000_24((C03K6) this, 1605), new AwS568S0100000_24((C03K6) this, 1606), aFwS264S0000000_24, null, null, new AwS568S0100000_24((C03K6) this, 1607));
        }
        this.LLJJJIL = assemVMLazy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1605200rsE I5() {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostCell.I5():X.0rsE");
    }

    public final void N5() {
        Aweme aweme;
        String aid;
        if (this.itemView.isAttachedToWindow()) {
            Rect rect = new Rect();
            if (!this.itemView.getGlobalVisibleRect(rect) || rect.height() <= 0) {
                return;
            }
            if (!U5().LLILZLL) {
                SchoolPostsListViewModel schoolPostsListViewModelU5 = U5();
                int layoutPosition = getLayoutPosition() >= 0 ? getLayoutPosition() : this.LLJJI;
                int i = U5().LLIZ;
                if (layoutPosition < i) {
                    layoutPosition = i;
                }
                schoolPostsListViewModelU5.LLIZ = layoutPosition;
            }
            C1581170rFT item = getItem();
            if (item == null || (aweme = item.LL) == null || (aid = aweme.getAid()) == null) {
                return;
            }
            SchoolPostsListViewModel schoolPostsListViewModelU52 = U5();
            if (aid.length() == 0 || !schoolPostsListViewModelU52.LLILZIL.add(aid)) {
                return;
            }
            this.LLJJIII = true;
            C1912107eJ c1912107eJ = U5().LLJ;
            c1912107eJ.getClass();
            if (aid.length() != 0 && !c1912107eJ.LIZIZ.contains(aid)) {
                c1912107eJ.LIZ.put(aid, Long.valueOf(System.currentTimeMillis()));
            }
            final C1605200rsE c1605200rsEI5 = I5();
            if (c1605200rsEI5 != null) {
                C1245980iWq.LIZ(new InterfaceC1245990iWr(c1605200rsEI5) { // from class: X.0heG
                    public final C1605200rsE LIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1212140heG) && Intrinsics.LJFF(this.LIZ, ((C1212140heG) obj).LIZ);
                    }

                    @Override // X.InterfaceC1245990iWr
                    public final String getEventName() {
                        return "ttsocial_school_card_show";
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SchoolPostCardShowEvent(params=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.InterfaceC1245990iWr
                    public final Map<String, String> LIZ() {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C1605170rsB.LIZ(c2344009Gk, this.LIZ);
                        return c2344009Gk.LIZ;
                    }

                    {
                        this.LIZ = c1605200rsEI5;
                    }
                });
            }
        }
    }

    public final EnumC1084770eKp R5() {
        C21681819tI c21681819tI;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        return ((!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) ? getLayoutPosition() : c21681819tI.LIZ()) % 2 == 0 ? EnumC1084770eKp.LEFT : EnumC1084770eKp.RIGHT;
    }

    public final SchoolPostsListViewModel U5() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (SchoolPostsListViewModel) assemVMLazy.getValue();
    }

    public final C1910890zpH V5() {
        return (C1910890zpH) this.LL.getValue();
    }

    public final void W5() {
        Aweme aweme;
        String aid;
        if (this.LLJJIII) {
            this.LLJJIII = false;
            C1581170rFT item = getItem();
            if (item == null || (aweme = item.LL) == null || (aid = aweme.getAid()) == null) {
                return;
            }
            SchoolPostsListViewModel schoolPostsListViewModelU5 = U5();
            AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(this, 413);
            C1912107eJ c1912107eJ = schoolPostsListViewModelU5.LLJ;
            c1912107eJ.getClass();
            if (aid.length() == 0 || c1912107eJ.LIZIZ.contains(aid)) {
                return;
            }
            c1912107eJ.LIZIZ.add(aid);
            awS603S0100000_24.invoke(((LinkedHashMap) c1912107eJ.LIZ).get(aid));
            c1912107eJ.LIZ.remove(aid);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() throws Exception {
        C1331070kk5 hierarchy;
        C1331100kk8 c1331100kk8;
        Context context;
        Integer numLIZJ;
        C1331070kk5 hierarchy2;
        ViewGroup.LayoutParams layoutParams;
        super.onItemViewCreated();
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.kgf);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.zz3);
        this.LLILZ = (C427660Gpo) this.itemView.findViewById(R.id.kg0);
        this.LLILZIL = (TextView) this.itemView.findViewById(R.id.zhs);
        this.LLILZLL = (LinearLayout) this.itemView.findViewById(R.id.fu8);
        this.LLIZ = (C06VM) this.itemView.findViewById(R.id.kgy);
        this.LLIZLLLIL = (TuxTextView) this.itemView.findViewById(R.id.ztu);
        this.LLJ = (FrameLayout) this.itemView.findViewById(R.id.o0x);
        this.LLJI = (FrameLayout) this.itemView.findViewById(R.id.kg1);
        this.itemView.findViewById(R.id.kmc);
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.ex2);
        this.LLJILJIL = (TuxIconView) this.itemView.findViewById(R.id.c4k);
        this.LLJILJILJ = new C734140Sqy(new WeakReference(this.itemView.getContext()), new AwS673S0100000_24(this, 6));
        LinearLayout linearLayout = this.LLILZLL;
        if (linearLayout != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 0), linearLayout);
        }
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 69), this.itemView);
        this.itemView.setOnLongClickListener(this);
        LinearLayout linearLayout2 = this.LLILZLL;
        if (linearLayout2 != null) {
            linearLayout2.setOnTouchListener(this);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setOnTouchListener(this);
        }
        C427660Gpo c427660Gpo = this.LLILZ;
        if (c427660Gpo != null) {
            c427660Gpo.setOnTouchListener(this);
        }
        this.itemView.setOnTouchListener(this);
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 1), tuxTextView2);
        }
        C427660Gpo c427660Gpo2 = this.LLILZ;
        if (c427660Gpo2 != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 2), c427660Gpo2);
        }
        FrameLayout frameLayout = this.LLJI;
        if (frameLayout != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 3), frameLayout);
        }
        int iWidth = C1389340mG4.LIZJ(this.itemView.getContext(), null).LIZIZ;
        C19EG currentActivity = getCurrentActivity();
        if (currentActivity != null && Build.VERSION.SDK_INT >= 35) {
            C0IKF.LIZ.getClass();
            C465320IMo.LIZ();
            C19738412Ko c19738412KoLIZ = C19738212Km.LIZ(currentActivity);
            C20244914Jj c20244914JjLIZIZ = c19738412KoLIZ.LIZIZ.LIZIZ(2);
            iWidth = (c19738412KoLIZ.LIZ().width() - c20244914JjLIZIZ.LIZ) - c20244914JjLIZIZ.LIZJ;
        }
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null && (layoutParams = smartImageView.getLayoutParams()) != null) {
            layoutParams.width = (iWidth - (C1581410rFr.LL * 3)) / 2;
        }
        SmartImageView smartImageView2 = this.LLILLJJLI;
        if (smartImageView2 != null && (hierarchy2 = smartImageView2.getHierarchy()) != null) {
            C1331100kk8 c1331100kk82 = new C1331100kk8();
            c1331100kk82.LJII(C418440Gaw.LIZIZ(10));
            hierarchy2.LJJIII(c1331100kk82);
        }
        SmartImageView smartImageView3 = this.LLILLJJLI;
        if (smartImageView3 == null || (hierarchy = smartImageView3.getHierarchy()) == null || (c1331100kk8 = hierarchy.LIZJ) == null) {
            return;
        }
        SmartImageView smartImageView4 = this.LLILLJJLI;
        c1331100kk8.LJFF = (smartImageView4 == null || (context = smartImageView4.getContext()) == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context)) == null) ? 0 : numLIZJ.intValue();
        c1331100kk8.LJFF(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        if (this.itemView.getParent() != null) {
            HandlerHook.viewPost(this.itemView, new ARunnableS124S0100000_24(this, 88));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        W5();
    }

    public final int L5(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return str.length();
    }

    public final void P5(String str) {
        String authorUid;
        String secAuthorUid;
        Integer numValueOf;
        String requestId;
        Aweme aweme;
        User author;
        Aweme aweme2;
        User author2;
        Aweme aweme3;
        Aweme aweme4;
        Context context = getContext();
        if (context == null) {
            return;
        }
        V5().LIZ("SchoolPostCell", "enterUserProfilePage, starting");
        U5().LLIZLLLIL = EnumC1581430rFt.ENTER_PERSONAL_DETAIL.getValue();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//user/profile");
        C1581170rFT item = getItem();
        Aweme aweme5 = null;
        if (item != null && (aweme4 = item.LL) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme4);
        } else {
            authorUid = null;
        }
        smartRouteBuildRoute.withParam("uid", authorUid);
        C1581170rFT item2 = getItem();
        if (item2 != null && (aweme3 = item2.LL) != null) {
            secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme3);
        } else {
            secAuthorUid = null;
        }
        smartRouteBuildRoute.withParam("sec_uid", secAuthorUid);
        smartRouteBuildRoute.withParam("enter_from", "school_community_page");
        smartRouteBuildRoute.withParam("enter_method", str);
        smartRouteBuildRoute.withParam("previous_page", "school_community_page");
        smartRouteBuildRoute.withParam("extra_from_pre_page", "school_community_page");
        smartRouteBuildRoute.withParam("extra_from_event_enter_from", "school_community_page");
        C1581170rFT item3 = getItem();
        if (item3 != null && (aweme2 = item3.LL) != null && (author2 = aweme2.getAuthor()) != null) {
            numValueOf = Integer.valueOf(author2.getCommerceUserLevel());
        } else {
            numValueOf = null;
        }
        smartRouteBuildRoute.withParam("profile_enterprise_type", numValueOf);
        C1581170rFT item4 = getItem();
        if (item4 != null && (aweme = item4.LL) != null && (author = aweme.getAuthor()) != null) {
            requestId = author.getRequestId();
        } else {
            requestId = null;
        }
        smartRouteBuildRoute.withParam("search_request_id", requestId);
        smartRouteBuildRoute.open();
        C0DOO c0doo = C0DOO.LIZ;
        C1581170rFT item5 = getItem();
        if (item5 != null) {
            aweme5 = item5.LL;
        }
        c0doo.getClass();
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C735410St1 c735410St1 = new C735410St1();
        c735410St1.LIZLLL = "school_community_page";
        c735410St1.LJJLIIIJILLIZJL = str;
        c735410St1.LJIJI(aweme5);
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme5, c735410St1);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme5, objLJIIIZ);
        ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, X.EnumC1605220rsG> T5(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostCell.T5(com.ss.android.ugc.aweme.feed.model.Aweme):kotlin.Pair");
    }

    public final void X5(Aweme aweme) {
        long diggCount;
        if (aweme == null) {
            return;
        }
        C06VM c06vm = this.LLIZ;
        if (c06vm != null) {
            c06vm.setSelected(aweme.isLike());
        }
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
            boolean zLIZIZ = C0OAD.LIZIZ(aweme);
            String strLIZIZ = CardStruct.IStatusCode.DEFAULT;
            if (!zLIZIZ && diggCount > 0) {
                strLIZIZ = C1843500y4a.LIZIZ(diggCount);
            }
            tuxTextView.setText(strLIZIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TuxIconView tuxIconView;
        UrlModel cover;
        Aweme aweme;
        boolean z;
        UrlModel cover2;
        float fFloatValue;
        Video video;
        C1581170rFT c1581170rFT = (C1581170rFT) interfaceC1891350zJl;
        super.onBindItemView(c1581170rFT);
        this.LLJJIII = false;
        if (getLayoutPosition() >= 0) {
            this.LLJJI = getLayoutPosition();
        }
        Aweme aweme2 = c1581170rFT.LL;
        Context context = getContext();
        if (context != null) {
            C734140Sqy c734140Sqy = this.LLJILJILJ;
            if (c734140Sqy != null) {
                c734140Sqy.LJFF(aweme2);
            }
            TuxIconView tuxIconView2 = this.LLJIJIL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            TextView textView = this.LLILZIL;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            TuxIconView tuxIconView3 = this.LLJILJIL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            SmartImageView smartImageView = this.LLILLJJLI;
            Float fValueOf = null;
            if (smartImageView != null) {
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                float f = smartImageView.getLayoutParams().width;
                Video video2 = aweme2.getVideo();
                if (video2 != null && video2.getWidth() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || ((video = aweme2.getVideo()) != null && video.getHeight() == 0)) {
                    Video video3 = aweme2.getVideo();
                    if (video3 != null && (cover2 = video3.getCover()) != null) {
                        fValueOf = Float.valueOf((cover2.getHeight() * 1.0f) / cover2.getWidth());
                    }
                } else {
                    if (aweme2.getVideo() != null) {
                        fValueOf = Float.valueOf((r2.getHeight() * 1.0f) / r2.getWidth());
                    }
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = 1.3333334f;
                }
                layoutParams.height = (int) (f * Math.min(Math.max(fFloatValue, 0.75f), 1.3333334f));
            }
            TuxIconView tuxIconView4 = this.LLJIJIL;
            if (tuxIconView4 != null) {
                C1581170rFT item = getItem();
                if (item != null && (aweme = item.LL) != null && AwemeExtKt.isPhotoMode(aweme)) {
                    if (this.LLJJ == null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_square_corner_border_fill;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                        c419910GdJ.LJFF = false;
                        this.LLJJ = c419910GdJ.LIZ(context);
                    }
                    TuxIconDrawable tuxIconDrawable = this.LLJJ;
                    if (tuxIconDrawable != null) {
                        tuxIconView4.setImageDrawable(tuxIconDrawable);
                        C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
                    }
                }
                if (tuxIconView4.getLayoutParams().width != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))) {
                    ViewGroup.LayoutParams layoutParams2 = tuxIconView4.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                        C786410Ut5.W5(tuxIconView4, layoutParams2);
                        C426750GoL.LJIIIZ(tuxIconView4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 25);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZ = C418440Gaw.LIZIZ(14);
                c19659111vp.LIZIZ(5);
                c19659111vp.LIZLLL = C418440Gaw.LIZIZ(Float.valueOf(6.0f));
                c19659111vp.LJFF = Integer.valueOf(ColorProtector.parseColor("#2E000000"));
                tuxIconView4.setBackground(c19659111vp.LIZ(context));
            }
            Video video4 = aweme2.getVideo();
            if (video4 != null && (cover = video4.getCover()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                c1331670kl3LJIIIIZZ.LJJIJL(context);
                c1331670kl3LJIIIIZZ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, context));
                c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIIIZZ.LJIILJJIL = 0;
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.DEFAULT;
                c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            String first = T5(aweme2).getFirst();
            if (first.length() > 0) {
                TextView textView2 = this.LLILZIL;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 0);
                }
                TextView textView3 = this.LLILZIL;
                if (textView3 != null) {
                    textView3.setText(first);
                }
            }
            User author = aweme2.getAuthor();
            if (author != null) {
                if ((author.getVerificationType() == 2 || author.getVerificationType() == 3 || C123100dR.LIZ(author.getCustomVerify()) || C123100dR.LIZ(author.getEnterpriseVerifyReason())) && (tuxIconView = this.LLJILJIL) != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                TuxTextView tuxTextView = this.LLILLL;
                if (tuxTextView != null) {
                    C1243240iSQ.LIZ.getClass();
                    tuxTextView.setText(C1243240iSQ.LIZ(author, true));
                }
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                c1331670kl3LJIIIIZZ2.LJJ(this.LLILZ);
                c1331670kl3LJIIIIZZ2.LJJIII = EnumC1334360kpO.LOW;
                C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
            }
            X5(aweme2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.eic, false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0GS7] */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onLongClick(android.view.View r23) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostCell.onLongClick(android.view.View):boolean");
    }

    public final String S5(Layout layout, String str) {
        if (layout != null && layout.getLineCount() > 1) {
            try {
                int ellipsisStart = layout.getEllipsisStart(1);
                if (ellipsisStart > 0) {
                    str = str.substring(0, layout.getLineEnd(0) + ellipsisStart);
                    return str;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        Aweme aweme;
        super.onBindItemView(interfaceC1891350zJl, list);
        if ((!list.isEmpty()) && (ListProtector.get(list, 0) instanceof C1581180rFU)) {
            C734140Sqy c734140Sqy = this.LLJILJILJ;
            Aweme aweme2 = null;
            if (c734140Sqy != null) {
                C1581170rFT item = getItem();
                if (item != null) {
                    aweme = item.LL;
                } else {
                    aweme = null;
                }
                c734140Sqy.LJFF(aweme);
            }
            C1581170rFT item2 = getItem();
            if (item2 != null) {
                aweme2 = item2.LL;
            }
            X5(aweme2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostCell.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

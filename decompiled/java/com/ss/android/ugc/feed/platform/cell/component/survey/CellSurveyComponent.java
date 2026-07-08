package com.ss.android.ugc.feed.platform.cell.component.survey;

import X.AbstractC20284914Yt;
import X.C01GW;
import X.C035D;
import X.C098200Yq;
import X.C0J0X;
import X.C0R8M;
import X.C0R8N;
import X.C0R8O;
import X.C0R8P;
import X.C0R8Q;
import X.C0R8R;
import X.C0R8S;
import X.C0R8T;
import X.C0RBT;
import X.C0RFL;
import X.C0RH0;
import X.C0SUL;
import X.C1047660dMy;
import X.C1157804fw;
import X.C1386360mBG;
import X.C14Z4;
import X.C14Z5;
import X.C14Z7;
import X.C14ZO;
import X.C14ZQ;
import X.C14ZW;
import X.C1558520qew;
import X.C189200o6;
import X.C19660111vz;
import X.C19660411w2;
import X.C19660511w3;
import X.C20285314Yx;
import X.C20286114Zf;
import X.C20286514Zj;
import X.C20286614Zk;
import X.C20286814Zm;
import X.C20286914Zn;
import X.C20288314a1;
import X.C20289214aA;
import X.C20291514aX;
import X.C20293414aq;
import X.C2188811AlT;
import X.C2552309zN;
import X.C265970Abb;
import X.C300680BqU;
import X.C452501pT;
import X.C687700QyG;
import X.C692060RCq;
import X.C704220Rjo;
import X.C724270Sb3;
import X.C729510SjV;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC20290714aP;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import X.InterfaceC689860R4e;
import X.InterfaceC690490R6p;
import X.InterfaceC987400bnm;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class CellSurveyComponent extends BaseCellContentComponent<CellSurveyComponent> implements CellSurveyComponentAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public View LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public SmartImageView LLJLL;
    public C0RH0 LLJLLIL;
    public C0SUL LLJLLL;
    public C704220Rjo LLJZ;
    public ImageView LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public FrameLayout LLLFF;
    public View LLLFFI;
    public View LLLFZ;
    public ViewStub LLLIIIIL;
    public ViewStub LLLIIL;
    public ViewStub LLLIILIL;
    public ViewStub LLLIL;
    public Boolean LLLILZ;
    public ViewStub LLLILZJ;
    public ViewStub LLLILZLLLI;
    public ViewStub LLLIZZ;
    public ViewStub LLLJ;
    public ViewStub LLLJIL;
    public C0J0X LLLJL;
    public C20286814Zm LLLL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1185));
    public final C01GW LLJJL = C452501pT.LIZIZ(new C0R8P(this));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 289));
    public final C01GW LLLI = C452501pT.LIZIZ(new C0R8N());
    public final C01GW LLLII = C452501pT.LIZIZ(new C0R8O());
    public final C01GW LLLIIII = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(197));
    public final C01GW LLLIIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(256));
    public final C01GW LLLLII = C452501pT.LIZIZ(new C0R8R(this));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new C0R8Q(this));
    public final C01GW LLLLIIL = C452501pT.LIZIZ(new C0RBT(this));
    public final C01GW LLLLIILL = C452501pT.LIZIZ(new C0R8T(this));
    public final C01GW LLLLIILLL = C452501pT.LIZIZ(new C0R8S(this));
    public final C01GW LLLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1186));

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 102985896) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final boolean Gg1() {
        C20286814Zm c20286814Zm = this.LLLL;
        if (c20286814Zm != null) {
            return c20286814Zm.LJIJJ;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        C20285314Yx c20285314Yx = (C20285314Yx) this.LLLI.getValue();
        c20285314Yx.LIZIZ.LIZJ();
        c20285314Yx.LIZJ.LIZJ();
        C20286814Zm c20286814Zm = this.LLLL;
        if (c20286814Zm != null) {
            c20286814Zm.LJII(null, null);
        }
        C20286814Zm c20286814Zm2 = this.LLLL;
        if (c20286814Zm2 != null) {
            c20286814Zm2.LJIJI();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void Uc() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        C692060RCq.LIZIZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        C724270Sb3 c724270Sb32 = this.LLJI;
        op(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), false);
        ISurveyInteractAbility iSurveyInteractAbility = (ISurveyInteractAbility) this.LLJJL.getValue();
        if (iSurveyInteractAbility != null) {
            iSurveyInteractAbility.Qn1();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void de0() {
        C0RH0 c0rh0 = this.LLJLLIL;
        if (c0rh0 != null) {
            c0rh0.LLILZ = this.LLLL;
        }
    }

    public final C19660111vz ep() {
        return (C19660111vz) this.LLLIIIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void ev() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (C20286514Zj.LJFF(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) || !C1386360mBG.LJII(false)) {
            return;
        }
        InterfaceC690490R6p interfaceC690490R6pKp = kp();
        if (interfaceC690490R6pKp != null) {
            ViewStub viewStub = this.LLLIL;
            Context context = getContext();
            C724270Sb3 c724270Sb32 = this.LLJI;
            interfaceC690490R6pKp.LJIIJ(viewStub, context, ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme(), this.LLJL, this.LLJLIL, this.LLLFZ, this.LLLFFI, true, null);
        }
        InterfaceC690490R6p interfaceC690490R6pKp2 = kp();
        if (interfaceC690490R6pKp2 != null) {
            interfaceC690490R6pKp2.LJIILIIL();
        }
    }

    public final IVideoCellAbility lp() {
        return (IVideoCellAbility) this.LLLLIILL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void qi() {
        InterfaceC690490R6p interfaceC690490R6pKp;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if ((C20286514Zj.LJFF(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) || Gg1()) && (interfaceC690490R6pKp = kp()) != null) {
            interfaceC690490R6pKp.LJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL() {
        /*
            r5 = this;
            X.0Q7z r2 = X.C1558520qew.LJIIL(r5)
            java.lang.Class<com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility> r0 = com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility.class
            r1 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility r0 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility) r0
            if (r0 == 0) goto L12
            r0.f02(r1)
        L12:
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto L18
            java.lang.Object r1 = r0.LL
        L18:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r1.getAweme()
            boolean r0 = r5.ti2()
            r2 = 0
            if (r0 == 0) goto La4
            boolean r0 = X.C14Z4.LJFF(r3)
            if (r0 != 0) goto L83
            boolean r0 = X.C14Z4.LJ(r3)
            if (r0 == 0) goto L37
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.isSubAweme(r3)
            if (r0 != 0) goto L83
        L37:
            boolean r0 = X.C14Z4.LIZIZ(r3)
            if (r0 != 0) goto L83
            boolean r0 = X.C1157804fw.LIZ()
            java.lang.String r4 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCellSurveyComponentPartial"
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchServiceLowEnd> r0 = com.ss.android.ugc.aweme.search.ISearchServiceLowEnd.class
            java.lang.Object r1 = r1.getService(r0)
            if (r1 != 0) goto L69
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L57:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.search.ISearchService> r0 = com.ss.android.ugc.aweme.search.ISearchService.class
            java.lang.Object r1 = r1.getService(r0)
            if (r1 != 0) goto L69
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L69:
            X.14aP r1 = (X.InterfaceC20290714aP) r1
            android.content.Context r0 = r5.getContext()
            boolean r0 = r1.LJIIIIZZ(r0)
            if (r0 != 0) goto L83
            X.0dMy r1 = X.C1047660dMy.LIZIZ
            boolean r0 = r1.Z2(r3)
            if (r0 != 0) goto L83
            boolean r0 = r1.b3(r3)
            if (r0 == 0) goto L8e
        L83:
            X.0R6p r1 = r5.kp()
            if (r1 == 0) goto L8e
            X.14Yi r0 = X.EnumC20283814Yi.SWIPE
            r1.LJIIJJI(r0, r3, r2)
        L8e:
            boolean r0 = X.C14Z4.LJFF(r3)
            if (r0 == 0) goto L9d
            X.0R6p r0 = r5.kp()
            if (r0 == 0) goto L9d
            r0.LIZJ()
        L9d:
            X.14Zm r0 = r5.LLLL
            if (r0 == 0) goto La4
            r0.LJIJ()
        La4:
            X.0R6p r0 = r5.kp()
            if (r0 == 0) goto Lad
            r0.g2()
        Lad:
            X.01GW r0 = r5.LLLIIII
            java.lang.Object r0 = r0.getValue()
            X.14Xe r0 = (X.C20280814Xe) r0
            boolean r0 = r0.LLJI
            if (r0 == 0) goto Lc6
            X.01GW r0 = r5.LLLIIII
            java.lang.Object r1 = r0.getValue()
            X.14Yt r1 = (X.AbstractC20284914Yt) r1
            X.14Yi r0 = X.EnumC20283814Yi.SWIPE
            r1.LJIIJJI(r0, r3, r2)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponent.LJL():void");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C20288314a1 c20288314a1;
        HomeViewPagerAbility homeViewPagerAbility;
        if (C0RFL.LIZ()) {
            onDestroyView();
        }
        if (!((Boolean) C265970Abb.LIZ.getValue()).booleanValue() || C0RFL.LIZ()) {
            return;
        }
        InterfaceC690490R6p interfaceC690490R6pKp = kp();
        if (interfaceC690490R6pKp != null) {
            interfaceC690490R6pKp.LIZ();
        }
        C20286814Zm c20286814Zm = this.LLLL;
        if (c20286814Zm == null || (c20288314a1 = c20286814Zm.LJJLIIIJJIZ) == null || (homeViewPagerAbility = c20286814Zm.LJJLIIIJJI) == null) {
            return;
        }
        homeViewPagerAbility.b3(c20288314a1);
    }

    public final InterfaceC690490R6p kp() {
        Object service;
        InterfaceC689860R4e interfaceC689860R4eK9;
        InterfaceC987400bnm interfaceC987400bnmLJJLL;
        InterfaceC689860R4e interfaceC689860R4eK92;
        InterfaceC987400bnm interfaceC987400bnmLJJLL2;
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCellSurveyComponentPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCellSurveyComponentPartial");
            }
        }
        if (((InterfaceC20290714aP) service).LJIIIIZZ(getContext())) {
            return (InterfaceC690490R6p) this.LLLII.getValue();
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C1047660dMy c1047660dMy = C1047660dMy.LIZIZ;
        if (c1047660dMy.b3(aweme)) {
            IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLJJJJLIIL.getValue();
            if (iVideoCellAbility == null || (interfaceC689860R4eK92 = iVideoCellAbility.K9()) == null || (interfaceC987400bnmLJJLL2 = interfaceC689860R4eK92.LJJLL()) == null) {
                return null;
            }
            return interfaceC987400bnmLJJLL2.PC();
        }
        if (!c1047660dMy.Z2(aweme)) {
            return C14Z4.LIZJ(aweme) ? (AbstractC20284914Yt) this.LLLIIII.getValue() : ((C20285314Yx) this.LLLI.getValue()).LIZ(aweme);
        }
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLJJJJLIIL.getValue();
        if (iVideoCellAbility2 == null || (interfaceC689860R4eK9 = iVideoCellAbility2.K9()) == null || (interfaceC987400bnmLJJLL = interfaceC689860R4eK9.LJJLL()) == null) {
            return null;
        }
        return interfaceC987400bnmLJJLL.HG0();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void onDestroyView() {
        C20288314a1 c20288314a1;
        HomeViewPagerAbility homeViewPagerAbility;
        InterfaceC690490R6p interfaceC690490R6pKp = kp();
        if (interfaceC690490R6pKp != null) {
            interfaceC690490R6pKp.LIZ();
        }
        C20286814Zm c20286814Zm = this.LLLL;
        if (c20286814Zm == null || (c20288314a1 = c20286814Zm.LJJLIIIJJIZ) == null || (homeViewPagerAbility = c20286814Zm.LJJLIIIJJI) == null) {
            return;
        }
        homeViewPagerAbility.b3(c20288314a1);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final boolean ti2() {
        InterfaceC690490R6p interfaceC690490R6pKp = kp();
        if (interfaceC690490R6pKp != null) {
            return interfaceC690490R6pKp.isShowing();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        Object obj;
        InterfaceC690490R6p interfaceC690490R6pKp = kp();
        if (interfaceC690490R6pKp != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            interfaceC690490R6pKp.LJ(((VideoItemParams) obj).getAweme(), false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        Object c098200Yq;
        Object obj;
        InterfaceC690490R6p interfaceC690490R6pKp = kp();
        if (interfaceC690490R6pKp != null) {
            interfaceC690490R6pKp.LJIIIIZZ();
        }
        InterfaceC690490R6p interfaceC690490R6pKp2 = kp();
        if (interfaceC690490R6pKp2 != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            interfaceC690490R6pKp2.LJ(((VideoItemParams) obj).getAweme(), true);
        }
        try {
            sp(getContext());
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility
    public final void Rl(C035D c035d) {
        ViewStub viewStub;
        Object obj = null;
        if (c035d != null && c035d.LIZ != null) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            if (Intrinsics.LJFF(c035d.LIZ.getAid(), aweme.getAid())) {
                if (c035d.LIZIZ >= 90.0f) {
                    if (ep().LJIILL() && !ep().isShowing()) {
                        ep().LJIIJ(this.LLLIIIIL, getContext(), aweme, this.LLJL, this.LLJLIL, this.LLLFZ, this.LLLFFI, false, null);
                        return;
                    }
                    return;
                }
                if (!C19660511w3.LJIIIIZZ(getContext(), aweme)) {
                    return;
                }
                if (ep().LL == null) {
                    C19660411w2 c19660411w2 = C19660411w2.LIZ;
                    String str = C19660511w3.LIZIZ;
                    Boolean bool = C19660511w3.LJFF;
                    c19660411w2.getClass();
                    C19660411w2.LIZIZ(bool, str);
                }
                if (ep().LJIILL() || (viewStub = this.LLLIIIIL) == null) {
                    return;
                }
                ep().LJIILJJIL(viewStub, getContext(), aweme, this.LLJL);
            }
        }
    }

    public final ViewStub hp(Aweme aweme) {
        C1047660dMy c1047660dMy = C1047660dMy.LIZIZ;
        if (c1047660dMy.b3(aweme)) {
            return this.LLLIIL;
        }
        if (c1047660dMy.Z2(aweme)) {
            return this.LLLIILIL;
        }
        if (C20286114Zf.LIZ(aweme)) {
            return this.LLLJ;
        }
        return this.LLLIZZ;
    }

    public final View ip(Aweme aweme) {
        View videoView;
        InterfaceC583650Mup interfaceC583650MupX3;
        InterfaceC583650Mup interfaceC583650MupX32;
        View viewHk;
        InterfaceC583650Mup interfaceC583650MupX33;
        if (aweme == null) {
            return null;
        }
        if (AwemeExtKt.isAdTraffic(aweme)) {
            IVideoCellAbility iVideoCellAbilityLp = lp();
            if (iVideoCellAbilityLp == null || (interfaceC583650MupX33 = iVideoCellAbilityLp.x3()) == null) {
                return null;
            }
            return interfaceC583650MupX33.getVideoView();
        }
        if (!C2552309zN.LIZ || !C20286114Zf.LIZ(aweme) || AwemeExtKt.isPhotoMode(aweme)) {
            videoView = this.LLJLILLLLZIIL;
        } else {
            IVideoCellAbility iVideoCellAbilityLp2 = lp();
            if (iVideoCellAbilityLp2 != null && (interfaceC583650MupX3 = iVideoCellAbilityLp2.x3()) != null && interfaceC583650MupX3.go1()) {
                IVideoCellAbility iVideoCellAbilityLp3 = lp();
                if (iVideoCellAbilityLp3 != null && (interfaceC583650MupX32 = iVideoCellAbilityLp3.x3()) != null && (viewHk = interfaceC583650MupX32.Hk()) != null) {
                    return viewHk;
                }
                IVideoCellAbility iVideoCellAbilityLp4 = lp();
                if (iVideoCellAbilityLp4 != null) {
                    videoView = iVideoCellAbilityLp4.getVideoView();
                }
            } else {
                IVideoCellAbility iVideoCellAbilityLp5 = lp();
                if (iVideoCellAbilityLp5 != null) {
                    videoView = iVideoCellAbilityLp5.getVideoView();
                }
            }
            return this.LLJLILLLLZIIL;
        }
        if (videoView != null) {
            return videoView;
        }
        return this.LLJLILLLLZIIL;
    }

    public final void mp(Aweme aweme) {
        C20288314a1 c20288314a1;
        HomeViewPagerAbility homeViewPagerAbility;
        C20286814Zm c20286814Zm = this.LLLL;
        if (c20286814Zm != null) {
            C1047660dMy c1047660dMy = C1047660dMy.LIZIZ;
            if (!c1047660dMy.Z2(aweme) && !c1047660dMy.b3(aweme)) {
                return;
            }
        }
        this.LLLL = new C20286814Zm();
        if (c20286814Zm != null && (c20288314a1 = c20286814Zm.LJJLIIIJJIZ) != null && (homeViewPagerAbility = c20286814Zm.LJJLIIIJJI) != null) {
            homeViewPagerAbility.b3(c20288314a1);
        }
        C20286814Zm c20286814Zm2 = this.LLLL;
        if (c20286814Zm2 != null) {
            c20286814Zm2.LJIIIIZZ = (CellAdaptionComponentAbility) this.LLLLIIIILLL.getValue();
        }
        C20286814Zm c20286814Zm3 = this.LLLL;
        if (c20286814Zm3 != null) {
            c20286814Zm3.LJII = new AwS574S0100000_30(this, 288);
        }
        C20286814Zm c20286814Zm4 = this.LLLL;
        if (c20286814Zm4 != null) {
            c20286814Zm4.LJIJJLI = new AwS609S0100000_30(this, 124);
        }
        C0RH0 c0rh0 = this.LLJLLIL;
        if (c0rh0 != null) {
            c0rh0.LLILZ = this.LLLL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011f  */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r3) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponent.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        boolean zLIZ;
        Object service;
        ViewStub viewStub;
        Object service2;
        InterfaceC690490R6p interfaceC690490R6pKp;
        C20286814Zm c20286814Zm;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme = videoItemParams2.getAweme();
        String str = videoItemParams2.mEventType;
        Context context = LJJIJL().getContext();
        if (C300680BqU.LIZ()) {
            zLIZ = C14ZO.LIZ(aweme, C14ZQ.BIND_BACKGROUND, str);
        } else {
            zLIZ = C20286914Zn.LIZ(aweme, str);
        }
        if (zLIZ) {
            mp(aweme);
            C0R8M c0r8m = new C0R8M(aweme, this);
            C20286814Zm c20286814Zm2 = this.LLLL;
            if (c20286814Zm2 != null) {
                c20286814Zm2.LJJIIZ = C1558520qew.LJIIL(this);
            }
            C20286814Zm c20286814Zm3 = this.LLLL;
            if (c20286814Zm3 != null) {
                c20286814Zm3.LJII(aweme, str);
            }
            InterfaceC690490R6p interfaceC690490R6pKp2 = kp();
            if (interfaceC690490R6pKp2 != null) {
                C0J0X c0j0x = this.LLLJL;
                if (c0j0x != null && (c20286814Zm = this.LLLL) != null) {
                    c20286814Zm.LJIIIZ(context, interfaceC690490R6pKp2, c0j0x, ip(aweme), this.LLJLL, this.LLJL, this.LLJLIL, this.LLLFZ, this.LLLFFI, this.LLJZIJLIL, this.LLL, this.LLLF, this.LLJZ, this.LLLFF, c0r8m, new C20289214aA(this));
                }
                C20286814Zm c20286814Zm4 = this.LLLL;
                C0SUL c0sul = this.LLJLLL;
                if (c0sul != null) {
                    c0sul.setVideoScalingListener(c20286814Zm4);
                }
                op(aweme, true);
            } else {
                return;
            }
        } else {
            InterfaceC690490R6p interfaceC690490R6pKp3 = kp();
            if (interfaceC690490R6pKp3 != null) {
                interfaceC690490R6pKp3.LIZLLL();
            }
        }
        this.LLLILZ = null;
        if (C300680BqU.LIZ()) {
            if (C14ZO.LIZ(aweme, C14ZQ.BIND_MASK, str)) {
                this.LLLILZ = Boolean.TRUE;
            }
        } else if (aweme == null) {
            C20286914Zn c20286914Zn = C20286914Zn.LIZ;
        } else {
            C20286914Zn.LIZ.getClass();
            if (Intrinsics.LJFF(str, "homepage_hot") && !AwemeBizExtKt.isSubAweme(aweme) && !C20286514Zj.LJFF(aweme) && !C729510SjV.LJJIJIL(aweme) && C1386360mBG.LJII(false)) {
                C20291514aX.LIZ.getClass();
                if (!C20291514aX.LIZIZ(aweme) || !C20291514aX.LIZJ(aweme, true)) {
                    C14Z7.LIZ.getClass();
                    boolean z = !C14ZW.LIZIZ.isEmpty();
                    boolean zLIZLLL = C20286614Zk.LIZLLL(aweme, false);
                    boolean zLIZJ = C14Z4.LIZJ(aweme);
                    C20293414aq c20293414aq = C20286914Zn.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isBottomMaskCardStyle:");
                    sbLIZ.append(zLIZJ);
                    sbLIZ.append(", needShow:");
                    sbLIZ.append(zLIZLLL);
                    c20293414aq.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), aweme);
                    if (zLIZJ && z && zLIZLLL) {
                        this.LLLILZ = Boolean.TRUE;
                    }
                }
            }
        }
        ep().LIZJ();
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCellSurveyComponentPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCellSurveyComponentPartial");
            }
        }
        if (((InterfaceC20290714aP) service).LJIIIIZZ(getContext()) && (interfaceC690490R6pKp = kp()) != null) {
            interfaceC690490R6pKp.LIZJ();
        }
        if (!C14Z4.LJ(aweme)) {
            if (C1157804fw.LIZ()) {
                service2 = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                if (service2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCellSurveyComponentPartial");
                }
            } else {
                service2 = ServiceManager.get().getService(ISearchService.class);
                if (service2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchCellSurveyComponentPartial");
                }
            }
            if (!((InterfaceC20290714aP) service2).LJIIIIZZ(getContext())) {
                return;
            }
        }
        if (C14ZW.LIZLLL(aweme) == C14Z5.COMMON_FORCE_VIDEO_LYNX.getType()) {
            viewStub = this.LLLJIL;
        } else {
            viewStub = this.LLLILZLLLI;
        }
        InterfaceC690490R6p interfaceC690490R6pKp4 = kp();
        if (interfaceC690490R6pKp4 != null) {
            interfaceC690490R6pKp4.LJIIJ(viewStub, getContext(), aweme, this.LLJL, this.LLJLIL, this.LLLFZ, this.LLLFFI, false, this.LLLL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, X.0mTF] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v36, types: [android.view.View, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sp(android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 1150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponent.sp(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(int r8, final com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponent.J1(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(com.ss.android.ugc.aweme.feed.model.Aweme r15, boolean r16) {
        /*
            r14 = this;
            X.14Zm r0 = r14.LLLL
            if (r0 == 0) goto L4a
            r1 = r16
            r0.LJIJJ(r1)
            if (r1 == 0) goto L4a
            X.0dPE r3 = new X.0dPE
            r6 = r15
            android.view.ViewStub r4 = r14.hp(r6)
            android.content.Context r5 = r14.getContext()
            android.view.View r7 = r14.LLJL
            android.view.View r8 = r14.LLJLIL
            android.view.View r9 = r14.LLLFZ
            android.view.View r10 = r14.LLLFFI
            X.14Zm r11 = r14.LLLL
            com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility r2 = r14.lp()
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.feed.adapter.ad.CommerceVideoViewHolder
            if (r0 == 0) goto L4b
            r1 = r2
            com.ss.android.ugc.aweme.feed.adapter.ad.CommerceVideoViewHolder r1 = (com.ss.android.ugc.aweme.feed.adapter.ad.CommerceVideoViewHolder) r1
            X.0S00 r0 = r1.U0
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L4b
            X.0dPW r12 = new X.0dPW
            X.0S0o r0 = r1.LLLLILI
            r12.<init>(r0)
        L3a:
            X.0R8b r13 = r14.jm()
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.0R6p r0 = r14.kp()
            if (r0 == 0) goto L4a
            r0.LJIIL(r3)
        L4a:
            return
        L4b:
            X.0dPU r12 = new X.0dPU
            if (r2 == 0) goto L57
            X.0SUL r0 = r2.om()
        L53:
            r12.<init>(r0)
            goto L3a
        L57:
            r0 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponent.op(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }
}

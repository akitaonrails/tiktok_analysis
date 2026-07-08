package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo;

import X.AbstractViewOnAttachStateChangeListenerC654600Ply;
import X.C01GW;
import X.C07P0;
import X.C0P72;
import X.C0PCQ;
import X.C0PPZ;
import X.C0RDF;
import X.C0SMN;
import X.C0SVP;
import X.C0SZS;
import X.C0SZT;
import X.C0SZU;
import X.C1011980cRQ;
import X.C1012300cRw;
import X.C13LE;
import X.C1524805y2;
import X.C19EG;
import X.C2174741A9g;
import X.C301290BrT;
import X.C436190H8n;
import X.C452501pT;
import X.C587060N0u;
import X.C650630PfZ;
import X.C653580PkK;
import X.C653660PkS;
import X.C655580PnY;
import X.C655720Pnm;
import X.C658260Prs;
import X.C658370Ps3;
import X.C658410Ps7;
import X.C659060PtA;
import X.C659080PtC;
import X.C661460Px2;
import X.C663180Pzo;
import X.C664400Q4g;
import X.C737910Sx3;
import X.C946803n0;
import X.EnumC1012120cRe;
import X.EnumC452301pR;
import X.EnumC655500PnQ;
import X.InterfaceC1294060jmO;
import X.InterfaceC1399350mWD;
import X.InterfaceC1631620sYq;
import X.InterfaceC584630MwP;
import X.InterfaceC641090PCp;
import X.InterfaceC648270Pbl;
import X.InterfaceC655270Pn3;
import X.InterfaceC656470Poz;
import X.InterfaceC658400Ps6;
import X.InterfaceC659190PtN;
import X.InterfaceC665370Q7z;
import X.InterfaceC719640SKs;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ext_power_list.AssemReusedDispatcher;
import com.bytedance.ext_power_list.AssemReusedVHContainer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class UserPhotoHolder extends AbstractViewOnAttachStateChangeListenerC654600Ply implements InterfaceC648270Pbl, InterfaceC658400Ps6, C0SMN<UserPhotoHolder, C658410Ps7> {
    public static final C658370Ps3 LLJJJJ = new C658370Ps3(C653580PkK.LIZJ);
    public final /* synthetic */ AssemReusedVHContainer<UserPhotoHolder, C658410Ps7> LLIZ;
    public final InterfaceC656470Poz LLIZLLLIL;
    public C658370Ps3 LLJ;
    public C661460Px2 LLJI;
    public ConstraintLayout LLJIJIL;
    public Aweme LLJILJIL;
    public InterfaceC1631620sYq<? super View, ? super Integer, ? super Aweme, Unit> LLJILJILJ;
    public C1012300cRw LLJILLL;
    public TuxIconView LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public int LLJJIJI;
    public SearchRefreshPredictMobCanShowVM LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C658260Prs LLJJJ;
    public final C19EG LLJJJIL;

    public UserPhotoHolder() {
        throw null;
    }

    @Override // X.C0SMN
    public final C0RDF C41() {
        return this.LLIZ.C41();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply
    public final C19EG L5() {
        throw null;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.C0SMN
    public final AssemReusedDispatcher<UserPhotoHolder, C658410Ps7> LJJJLL() {
        return this.LLIZ.LJJJLL();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LLIZ.LLIIIILZ();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        this.LLIZ.getClass();
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
    }

    @Override // X.C0SMN
    public final void Sl0(View view, InterfaceC719640SKs interfaceC719640SKs) {
        this.LLIZ.Sl0(view, interfaceC719640SKs);
    }

    @Override // X.C0SMO
    public final C0SZU<UserPhotoHolder, C658410Ps7> getChild() {
        return this.LLIZ.getChild();
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZ.getLifecycle();
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLIZ.k0();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.LLIZ.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.C0SMN
    public final void wY0() {
        this.LLIZ.wY0();
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLIZ.LLJJIJI;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLIZ.LLJJ;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        C661460Px2 c661460Px2;
        C658370Ps3 c658370Ps3 = this.LLJ;
        if (c658370Ps3 == null) {
            c658370Ps3 = null;
        }
        if (!c658370Ps3.LIZIZ || (c661460Px2 = this.LLJI) == null) {
            return;
        }
        c661460Px2.LJIIJ();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        C661460Px2 c661460Px2;
        C658370Ps3 c658370Ps3 = this.LLJ;
        if (c658370Ps3 == null) {
            c658370Ps3 = null;
        }
        if (!c658370Ps3.LIZIZ || (c661460Px2 = this.LLJI) == null) {
            return;
        }
        c661460Px2.LJIIJJI();
    }

    @Override // X.C0SMN
    public final ReusedUIAssem<?> NG1() {
        return this.LLIZ.LLJILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return this.LLIZ.LLILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LLIZ.LLJJI;
    }

    @Override // X.C0SMO
    public final C0SZS<UserPhotoHolder, C658410Ps7> getProxy() {
        return this.LLIZ.LLIZLLLIL;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        C661460Px2 c661460Px2 = this.LLJI;
        return c661460Px2 != null && c661460Px2.isPlaying();
    }

    @Override // X.C0SMN
    public final ViewModelStore md1() {
        return this.LLIZ.LLJIJIL;
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return this.itemView;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    @Override // X.InterfaceC658400Ps6
    public final void A5(final InterfaceC641090PCp interfaceC641090PCp) {
        InterfaceC641090PCp interfaceC641090PCp2 = new InterfaceC641090PCp() { // from class: X.0PCi
            @Override // X.InterfaceC641090PCp
            public final Fragment LIZ() {
                return interfaceC641090PCp.LIZ();
            }

            @Override // X.InterfaceC641090PCp
            public final Context getContext() {
                return interfaceC641090PCp.getContext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
            @Override // X.InterfaceC641090PCp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String getIdentifier() {
                /*
                    r7 = this;
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    java.lang.String r0 = "AladdinAweme_"
                    r4.<init>(r0)
                    com.ss.android.ugc.aweme.search.common.utils.SAFHelper r6 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
                    com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder r0 = r7.LIZ
                    android.view.View r5 = r0.itemView
                    android.content.Context r0 = r5.getContext()
                    X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
                    r3 = 0
                    if (r0 == 0) goto L3b
                    X.198i r2 = r0.LIZLLL()
                    if (r2 == 0) goto L3b
                L1e:
                    com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder r0 = r7.LIZ
                    android.view.View r0 = r0.itemView
                    android.content.Context r0 = r0.getContext()
                    if (r0 == 0) goto L2c
                    android.app.Activity r3 = X.C1388190mED.LIZ(r0)
                L2c:
                    r6.getClass()
                    java.lang.Integer r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJIJIIJI(r2, r3)
                    r4.append(r0)
                    java.lang.String r0 = r4.toString()
                    return r0
                L3b:
                    android.content.Context r0 = r5.getContext()
                    android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                    if (r0 == 0) goto L66
                    android.content.Context r0 = r5.getContext()
                    android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                    boolean r0 = X.C294780Bgy.LIZ()
                    if (r0 == 0) goto L59
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 != 0) goto L66
                L57:
                    r2 = r3
                    goto L1e
                L59:
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L57
                    X.198d r1 = (X.InterfaceC214897198d) r1
                    boolean r0 = r1.getEnableSAF()
                    if (r0 != 0) goto L66
                    goto L57
                L66:
                    androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r5)
                    if (r2 == 0) goto L57
                    android.content.Context r0 = r2.getContext()
                    if (r0 == 0) goto L81
                    android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                L76:
                    boolean r0 = X.C294780Bgy.LIZ()
                    if (r0 == 0) goto L83
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 != 0) goto L92
                    goto L57
                L81:
                    r1 = r3
                    goto L76
                L83:
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L57
                    X.198d r1 = (X.InterfaceC214897198d) r1
                    boolean r0 = r1.getEnableSAF()
                    if (r0 != 0) goto L92
                    goto L57
                L90:
                    if (r2 == 0) goto L57
                L92:
                    boolean r0 = r2 instanceof X.InterfaceC214902198i
                    if (r0 == 0) goto L99
                    X.198i r2 = (X.InterfaceC214902198i) r2
                    goto L1e
                L99:
                    androidx.fragment.app.Fragment r2 = r2.getParentFragment()
                    goto L90
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C641020PCi.getIdentifier():java.lang.String");
            }
        };
        C661460Px2 c661460Px2 = this.LLJI;
        if (c661460Px2 != null) {
            c661460Px2.setContainerStatusProvider(interfaceC641090PCp2);
        }
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, X.C0PT8
    public final void LLLIL(C653660PkS c653660PkS) {
        String strLIZ;
        c653660PkS.LJJLIIIIJ = "photo";
        Aweme aweme = this.LLJILJIL;
        if (aweme == null || (strLIZ = C436190H8n.LIZ(aweme)) == null) {
            strLIZ = "";
        }
        c653660PkS.LJIJJ = strLIZ;
        super.LLLIL(c653660PkS);
        this.LLJJI.getValue().getClass();
    }

    public final void P5(EnumC655500PnQ enumC655500PnQ) {
        String aid;
        C661460Px2 c661460Px2;
        C1012300cRw c1012300cRw;
        List<PhotoModeImageUrlModel> imageList;
        List<PhotoModeImageUrlModel> imageList2;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            C659080PtC.LIZ = false;
            c2174741A9g.LJIILL("general_search", enumC655500PnQ, C0SVP.STYLE_NO_BUTTON);
        }
        int i = !C659080PtC.LIZIZ() ? 1 : 0;
        C659080PtC.LIZJ(i);
        C653660PkS c653660PkSL3 = l3();
        Aweme aweme = this.LLJILJIL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c653660PkSL3.LJIJJ = aid;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme aweme2 = this.LLJILJIL;
        if (aweme2 != null) {
            PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
            Integer numValueOf = null;
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && !imageList.isEmpty()) {
                linkedHashMap.put("aweme_type", String.valueOf(aweme2.getAwemeType()));
                PhotoModeImageInfo photoModeImageInfo2 = aweme2.getPhotoModeImageInfo();
                if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null) {
                    numValueOf = Integer.valueOf(imageList2.size());
                }
                linkedHashMap.put("pic_cnt", String.valueOf(numValueOf));
            }
        }
        C655720Pnm c655720Pnm = C655720Pnm.LIZ;
        boolean zLIZIZ = C659080PtC.LIZIZ();
        C653660PkS c653660PkSL32 = l3();
        c655720Pnm.getClass();
        C655720Pnm.LIZ(zLIZIZ, c653660PkSL32, linkedHashMap);
        C661460Px2 c661460Px22 = this.LLJI;
        if (c661460Px22 != null) {
            c661460Px22.setMute(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, 0, this.LLJILJIL));
        }
        C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
        C659080PtC.LJFF();
        int i2 = C659080PtC.LIZIZ;
        c1011980cRQ.getClass();
        EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i2);
        if (enumC1012120cReLIZ != null && (c1012300cRw = this.LLJILLL) != null) {
            c1012300cRw.LIZ(enumC1012120cReLIZ, false);
        }
        C659060PtA.LIZLLL(C659060PtA.LIZ, this.LLJILJIL, this.LLJILLL, this.LLJJ, l3(), null, 16);
        if (C663180Pzo.LJI() && C301290BrT.LIZIZ() && i == 0 && (c661460Px2 = this.LLJI) != null) {
            c661460Px2.setCurrentPhotoItem(0);
        }
        Aweme aweme3 = this.LLJILJIL;
        if (aweme3 != null) {
            C663180Pzo c663180Pzo = C663180Pzo.LIZ;
            String aid2 = aweme3.getAid();
            c663180Pzo.getClass();
            C663180Pzo.LJII(i, aid2);
        }
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onViewAttachedToWindow(view);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = this.itemView;
        C19EG c19eg = this.LLJJJIL;
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19eg);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(this.LLJJJ);
        }
        if (C0PPZ.LIZ() && this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = C0P72.LIZ(C946803n0.LIZ(this.itemView));
        }
        this.LLJJIJIL = true;
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onViewDetachedFromWindow(view);
        LLJJJ();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = this.itemView;
        C19EG c19eg = this.LLJJJIL;
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19eg);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this.LLJJJ);
        }
        this.LLJJIJIL = false;
    }

    @Override // X.C0SMO
    public final void setProxy(C0SZS<UserPhotoHolder, C658410Ps7> c0szs) {
        this.LLIZ.LLIZLLLIL = c0szs;
    }

    @Override // X.C0SMN
    public final void SN1(int i, C658410Ps7 c658410Ps7) {
        this.LLIZ.LLJJJJLIIL(i, c658410Ps7, null);
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Prs] */
    public UserPhotoHolder(View view, C0SZT c0szt, Fragment fragment, InterfaceC656470Poz interfaceC656470Poz, AwS554S0100000_10 awS554S0100000_10) {
        super(view);
        this.LLIZ = new AssemReusedVHContainer<>(fragment, c0szt, new UserPhotoRootAssem(), view, awS554S0100000_10);
        this.LLIZLLLIL = interfaceC656470Poz;
        this.LLJJI = C737910Sx3.LIZLLL(this, C13LE.LIZ(UserPhotoViewModel.class), AFwS241S0000000_10.get$arr$(512), EnumC452301pR.SYNCHRONIZED);
        this.LLJJIII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1425));
        Sl0(view, this);
        C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this, 1183));
        this.LLJJJ = new InterfaceC1399350mWD() { // from class: X.0Prs
            @Override // X.InterfaceC1399350mWD
            public final /* synthetic */ boolean Fi() {
                return false;
            }

            @Override // X.InterfaceC1399350mWD
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                EnumC655500PnQ enumC655500PnQ;
                if (!C18127078b.LIZIZ() && this.LL.isPlaying() && C2174741A9g.LIZIZ.LJIILJJIL() && (i == 24 || i == 25)) {
                    UserPhotoHolder userPhotoHolder = this.LL;
                    if (i == 24) {
                        enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
                    } else {
                        enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                    }
                    userPhotoHolder.P5(enumC655500PnQ);
                }
                return false;
            }
        };
        this.LLJJJIL = super.L5();
    }
}

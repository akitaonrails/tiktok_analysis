package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2;

import X.AbstractC712240Rwk;
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
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1391190mJ3;
import X.C13LE;
import X.C1421105hJ;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1723530ux5;
import X.C1729070v61;
import X.C1729250v6J;
import X.C1729570v6p;
import X.C1729610v6t;
import X.C1729630v6v;
import X.C1730290v7z;
import X.C1770850wBP;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20632315oP;
import X.C20642515q3;
import X.C2217381BqS;
import X.C338490DOt;
import X.C343950De5;
import X.C416901jj;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1729710v73;
import X.InterfaceC1846110y8n;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardV2Fragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardV2Fragment extends Fragment implements InterfaceC344240DeY, InterfaceC1729710v73, InterfaceC724530SbT {
    public static final C1729610v6t LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiLyMmLSsvLD19LSYjJCI2OiYpJSHELIOSYlLWsvJiI+JytiKzogISspOjx9LSMqLCwnemsOICM/KiotOysFegM+KCg+LSs4";
    public C20632315oP LL;
    public C1846060y8i LLILLJJLI;
    public SmartImageView LLILLL;
    public TuxTextView LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public String LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0v6t] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BillboardV2Fragment.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BillboardV2Fragment.class, "imageListViewModel", "getImageListViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/ImageListViewModel;", 0)};
        LLJILJIL = new Object() { // from class: X.0v6t
        };
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

    public BillboardV2Fragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BillboardGlobalViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 755);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(340);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 756), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 757), aFwS268S0000000_26, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 758), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ImageListViewModel.class);
        AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26(c19719912DlLIZ2, 759);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(341);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 760), aFwS268S0000000_262, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new AwS570S0100000_26((Fragment) this, 761), aFwS268S0000000_262, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS570S0100000_262, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 754), aFwS268S0000000_262, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLILZLL = assemVMLazy2;
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJIJIL = "";
    }

    public final BillboardGlobalViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    public final C1846060y8i NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wwq) : null;
            this.LLILLJJLI = (C1846060y8i) viewFindViewById;
        }
        return (C1846060y8i) viewFindViewById;
    }

    public final C20632315oP OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.vpContent) : null;
            this.LL = (C20632315oP) viewFindViewById;
        }
        return (C20632315oP) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131832722);
        c0om1.LIZJ = c1250250idj;
        Integer numLIZ = C1723530ux5.LIZ(getContext());
        if (numLIZ != null) {
            c0om1.LIZJ(numLIZ.intValue());
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 752));
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_now_setting;
        c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 753));
        c0om1.LIZIZ(c1251150ifB2);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() throws JSONException {
        super.onDestroy();
        RootData rootData = MR().getState().LL;
        String str = rootData.roomId;
        String str2 = rootData.authorId;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJ;
        Map mapLIZ = C1729250v6J.LIZ(str, str2, rootData.LIZ(), rootData.isNewUser, "notice_board_template", Integer.valueOf(rootData.templateEntryType));
        mapLIZ.put("stay_time", Long.valueOf(jCurrentTimeMillis));
        C1421105hJ.LIZJ("livesdk_tiktokec_stay_page", mapLIZ);
        MR().vQ2();
        C1729570v6p.LIZIZ(System.currentTimeMillis() - this.LLJI, "notice_board_template", this.LLJIJIL, "onResume", "onDestroy");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws JSONException {
        super.onResume();
        C1729570v6p.LIZIZ(System.currentTimeMillis() - this.LLJI, "notice_board_template", this.LLJIJIL, "onViewCreated", "onResume");
        this.LLJI = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1729710v73
    public final void m3(boolean z) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, new C343950De5());
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_live_shop_widget_on_destroy", "{}");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Uri uri;
        boolean zBooleanValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJ = jCurrentTimeMillis;
        this.LLJI = jCurrentTimeMillis;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (uri = (Uri) arguments.getParcelable("uri")) != null) {
            int iIntValue = 0;
            RootData rootData = new RootData(null, null, false, 31);
            String strLIZ = C416901jj.LIZ(uri, "is_new_user");
            if (strLIZ != null) {
                zBooleanValue = Boolean.valueOf(Intrinsics.LJFF(strLIZ, "1")).booleanValue();
            } else {
                zBooleanValue = false;
            }
            rootData.isNewUser = zBooleanValue;
            String strLIZ2 = C416901jj.LIZ(uri, "author_id");
            String str = "";
            if (strLIZ2 == null) {
                strLIZ2 = "";
            }
            rootData.authorId = strLIZ2;
            String strLIZ3 = C416901jj.LIZ(uri, "room_id");
            String str2 = CardStruct.IStatusCode.DEFAULT;
            if (strLIZ3 == null) {
                strLIZ3 = CardStruct.IStatusCode.DEFAULT;
            }
            rootData.roomId = strLIZ3;
            try {
                String strLIZ4 = C416901jj.LIZ(uri, "template_entry_type");
                if (strLIZ4 != null) {
                    str2 = strLIZ4;
                }
                Integer numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str2));
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            rootData.templateEntryType = iIntValue;
            String strLIZ5 = C416901jj.LIZ(uri, "img_url");
            if (strLIZ5 == null) {
                strLIZ5 = "";
            }
            this.LLIZ = strLIZ5;
            String strLIZ6 = C416901jj.LIZ(uri, "content");
            if (strLIZ6 != null) {
                str = strLIZ6;
            }
            this.LLIZLLLIL = str;
            String strLIZ7 = C416901jj.LIZ(uri, "previous_page");
            if (strLIZ7 == null) {
                strLIZ7 = "shop_bag";
            }
            this.LLJIJIL = strLIZ7;
            MR().wQ2(rootData, true);
            C1421105hJ.LIZJ("livesdk_tiktokec_enter_page", C1729250v6J.LIZ(rootData.roomId, rootData.authorId, rootData.LIZ(), rootData.isNewUser, "notice_board_template", Integer.valueOf(rootData.templateEntryType)));
        }
        MR().xQ2();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        int i;
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        ImageListViewModel imageListViewModel = (ImageListViewModel) assemVMLazy.getValue();
        imageListViewModel.LLILZLL.clear();
        imageListViewModel.vQ2();
        imageListViewModel.setStateImmediate(new AwS605S0100000_26(imageListViewModel, 606));
        final C1729630v6v c1729630v6v = new C1729630v6v(this, this);
        OR().setAdapter(c1729630v6v);
        C1845940y8W c1845940y8WLJIIIZ = NR().LJIIIZ();
        ArrayList<Integer> arrayList = C1729630v6v.LLJIJIL;
        c1845940y8WLJIIIZ.LIZIZ(C20642515q3.LJI(((Number) ListProtector.get(arrayList, 0)).intValue()));
        C1845940y8W c1845940y8WLJIIIZ2 = NR().LJIIIZ();
        c1845940y8WLJIIIZ2.LIZIZ(C20642515q3.LJI(((Number) ListProtector.get(arrayList, 1)).intValue()));
        final C1846060y8i c1846060y8iNR = NR();
        c1846060y8iNR.LIZIZ(c1845940y8WLJIIIZ, 0, c1846060y8iNR.LLILZLL.isEmpty());
        c1846060y8iNR.LIZIZ(c1845940y8WLJIIIZ2, 1, c1846060y8iNR.LLILZLL.isEmpty());
        c1846060y8iNR.setHorizontalScrollBarEnabled(false);
        final C20632315oP c20632315oPOR = OR();
        c1846060y8iNR.LIZ(new InterfaceC1846110y8n() { // from class: X.0v6s
            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                c20632315oPOR.setCurrentItem(c1845940y8W.LIZLLL);
            }
        });
        c20632315oPOR.LIZIZ(new AbstractC712240Rwk(c1846060y8iNR) { // from class: X.0gSF
            public final WeakReference<C1846060y8i> LL;
            public int LLILLJJLI;
            public int LLILLL;

            {
                this.LL = new WeakReference<>(c1846060y8iNR);
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i2) {
                this.LLILLJJLI = this.LLILLL;
                this.LLILLL = i2;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i2) {
                boolean z;
                C1846060y8i c1846060y8i = this.LL.get();
                if (c1846060y8i != null && c1846060y8i.getSelectedTabPosition() != i2 && i2 < c1846060y8i.getTabCount()) {
                    int i3 = this.LLILLL;
                    if (i3 == 0 || (i3 == 2 && this.LLILLJJLI == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1846060y8i.LJIILL(c1846060y8i.LJII(i2), z);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[PHI: r1
              0x001a: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:15:0x0020, B:10:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC712240Rwk
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onPageScrolled(int r7, float r8, int r9) {
                /*
                    r6 = this;
                    java.lang.ref.WeakReference<X.0y8i> r0 = r6.LL
                    java.lang.Object r5 = r0.get()
                    X.0y8i r5 = (X.C1846060y8i) r5
                    if (r5 == 0) goto L1e
                    int r4 = r6.LLILLL
                    r3 = 0
                    r2 = 2
                    r1 = 1
                    if (r4 != r2) goto L1f
                    int r0 = r6.LLILLJJLI
                    if (r0 == r1) goto L1f
                    r1 = 0
                L16:
                    int r0 = r6.LLILLJJLI
                    if (r0 == 0) goto L1b
                L1a:
                    r3 = 1
                L1b:
                    r5.LJIJ(r7, r8, r1, r3)
                L1e:
                    return
                L1f:
                    r1 = 1
                    if (r4 != r2) goto L1a
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1166250gSF.onPageScrolled(int, float, int):void");
            }
        });
        C1723530ux5.LIZIZ(getContext(), NR(), OR());
        OR().LIZIZ(new AbstractC712240Rwk() { // from class: X.0v6q
            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i2) {
                boolean z;
                boolean zBooleanValue;
                Boolean boolValueOf;
                String str;
                RootData rootData = this.LL.MR().getState().LL;
                c1729630v6v.getClass();
                if (i2 == 0) {
                    z = true;
                    boolValueOf = null;
                } else {
                    z = false;
                    AssemVMLazy assemVMLazy2 = this.LL.LLILZLL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = BillboardV2Fragment.LLJILJILJ;
                    Boolean bool = ((C1729860v7I) assemVMLazy2.getValue().getState()).LLILLJJLI;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                    boolValueOf = Boolean.valueOf(!zBooleanValue);
                }
                Map mapLIZ = C1729250v6J.LIZ(rootData.roomId, rootData.authorId, rootData.LIZ(), rootData.isNewUser, "notice_board_template", Integer.valueOf(rootData.templateEntryType));
                if (z) {
                    str = "templates";
                } else {
                    str = "uploads";
                }
                mapLIZ.put("list_name", str);
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        mapLIZ.put("has_photo", 1);
                    } else {
                        mapLIZ.put("has_photo", 0);
                    }
                }
                C1421105hJ.LIZJ("livesdk_tiktokec_enter_list", mapLIZ);
            }
        });
        C20632315oP c20632315oPOR2 = OR();
        C1730290v7z c1730290v7z = C1730290v7z.LIZ;
        int i2 = MR().getState().LL.templateEntryType;
        c1730290v7z.getClass();
        if (i2 != 0 && i2 != 1) {
            i = 0;
        } else {
            MR().LL.LL.getClass();
            i = C1729070v61.LIZ().getInt("key_last_tab_index", 0);
        }
        c20632315oPOR2.setCurrentItem(i);
        if (MR().getState().LL.isNewUser && this.LLIZLLLIL.length() > 0 && this.LLIZ.length() > 0) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LLIZ);
            View viewFindViewById = this.LLILLL;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.l6g);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLL = (SmartImageView) viewFindViewById;
            }
            c1331670kl3LJIIIZ.LJJ((SmartImageView) viewFindViewById);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            View view3 = this.LLILZ;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById2 = view4.findViewById(R.id.z48);
                }
                this.LLILZ = (TuxTextView) viewFindViewById2;
                view3 = viewFindViewById2;
            }
            ((TextView) view3).setText(this.LLIZLLLIL);
        }
        Bundle arguments = getArguments();
        long j = -1;
        if (arguments != null) {
            j = arguments.getLong("start_click_time", -1L);
        }
        C1729570v6p.LIZLLL(System.currentTimeMillis() - j, "notice_board_template", this.LLJIJIL);
        C1729570v6p.LIZIZ(System.currentTimeMillis() - this.LLJI, "notice_board_template", this.LLJIJIL, "onCreate", "onViewCreated");
        this.LLJI = System.currentTimeMillis();
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0v6r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1728990v5t) obj).LLIZLLLIL);
            }
        }, null, new AwS640S0100000_26(this, 2), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (MR().getState().LL.isNewUser) {
            i = R.layout.bu5;
        } else {
            i = R.layout.bu0;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
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

package com.ss.android.ugc.aweme.ecommerce.search.vision.guide.view;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0P0T;
import X.C0QER;
import X.C1208904oB;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1391550mJd;
import X.C1391600mJi;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C612310Nzx;
import X.C621760Oa6;
import X.C634710Ouz;
import X.C634720Ov0;
import X.C634730Ov1;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724760Sbq;
import Y.ARunnableS42S0300000_9;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.ECPhotoSearchBubbleVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.model.ECSystemPhotoModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.view.ECPhotoSearchBubbleAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.guide.IECSearchBubbleContextAbility;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ECPhotoSearchBubbleAssem extends ReusedAssem<ECPhotoSearchBubbleAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public C0P0T LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public C0QER LLJJIJI;
    public KeyBoardVisibilityUtil LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public AnonymousClass0956 LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECPhotoSearchBubbleAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommerce/search/vision/guide/ECPhotoSearchBubbleVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECPhotoSearchBubbleAssem() {
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECPhotoSearchBubbleVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), interfaceC724760SbqLJJJIL, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 185), AFwS240S0000000_9.get$arr$(79), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 118));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C634710Ouz c634710OuzUA1;
        super.onParentViewCreated();
        C0QER c0qer = null;
        IECSearchBubbleContextAbility iECSearchBubbleContextAbility = (IECSearchBubbleContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IECSearchBubbleContextAbility.class, null);
        if (iECSearchBubbleContextAbility != null && (c634710OuzUA1 = iECSearchBubbleContextAbility.uA1()) != null) {
            c0qer = c634710OuzUA1.LIZ;
        }
        this.LLJJIJI = c0qer;
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0NZn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C596080NZm) obj).LL;
            }
        }, null, AFwS292S0000000_9.get$arr$(59), 6);
    }

    public final void Ao() {
        PopupWindow popupWindow;
        if (this.LLJJIJIIJIL == null) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            this.LLJJIJIIJIL = c19egLIZ != null ? new KeyBoardVisibilityUtil(c19egLIZ, 32, new AwS623S0100000_9(this, 19)) : null;
        }
        C0P0T c0p0t = this.LLJJ;
        if (c0p0t != null) {
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLJJIJIIJIL;
            c0p0t.LIZLLL(!(keyBoardVisibilityUtil != null && keyBoardVisibilityUtil.LIZ()));
        }
        Object obj = this.LLJJ;
        if (!(obj instanceof PopupWindow) || (popupWindow = (PopupWindow) obj) == null) {
            return;
        }
        popupWindow.update();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C1208904oB.LIZ.getClass();
        if (C1208904oB.LIZ()) {
            AnonymousClass0956 anonymousClass0956 = this.LLJJJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJJJ = null;
        }
    }

    public final void Bo(final ECSystemPhotoModel eCSystemPhotoModel, View view) {
        C0P0T c0p0t = this.LLJJ;
        if (c0p0t != null && c0p0t.isShowing()) {
            Ao();
            return;
        }
        final String str = eCSystemPhotoModel.imageUrl;
        if (str == null) {
            return;
        }
        C1391550mJd c1391550mJd = new C1391550mJd(view.getContext());
        c1391550mJd.LLILLJJLI.LIZIZ = view;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8));
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LJFF = iLIZIZ;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        C634730Ov1.LIZ.getClass();
        c1391550mJd.LLILLJJLI.LJII = C634730Ov1.LIZ().bubbleDuration * 1000;
        c1391550mJd.LJII(R.attr.zh);
        c1391550mJd.LLILLJJLI.LJIIIZ = true;
        c1391550mJd.LJ(new AwS553S0100000_9(this, 119));
        c1391550mJd.LIZJ(new AwS588S0100000_9(this, 83));
        c1391550mJd.LJIIIZ(true, new View.OnClickListener() { // from class: X.0Qf9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) throws Throwable {
                String trafficSourceList;
                Object c098200Yq;
                Context context = this.LL.getContext();
                if (context != null) {
                    ECPhotoSearchBubbleAssem eCPhotoSearchBubbleAssem = this.LL;
                    ECSystemPhotoModel eCSystemPhotoModel2 = eCSystemPhotoModel;
                    String str2 = str;
                    C0QER c0qer = eCPhotoSearchBubbleAssem.LLJJIJI;
                    IPhotoSearchService iPhotoSearchService = (IPhotoSearchService) ServiceManager.get().getService(IPhotoSearchService.class);
                    String strLIZ = C0QR7.LIZ(c0qer);
                    Bitmap bitmapLJFF = null;
                    if (c0qer != null) {
                        trafficSourceList = c0qer.getTrafficSourceList();
                    } else {
                        trafficSourceList = null;
                    }
                    PhotoSearchEnterParams photoSearchEnterParams = new PhotoSearchEnterParams(new PhotoSearchBusinessEnterParams(strLIZ, "photo_search_bubble_guide", trafficSourceList, null, "", 0, "", "", "", "search_middle_page", "photo_search", null, "", "", "", null, null, null, null, C0QXR.EC_PHOTO_SEARCH_BUBBLE_GUIDE.getValue(), null, null, null, null, null, null, eCSystemPhotoModel2.tosUri, String.valueOf(System.currentTimeMillis())), new PhotoSearchLogEnterParams(C0QR7.LJ(c0qer), "search_middle_page", null, null, C0QR7.LIZ(c0qer), C0QR7.LIZ(c0qer), "bubble_guide", null, null, null, null, null, null), new PhotoSearchToolsEnterParams(str2, Long.valueOf(System.currentTimeMillis()), "", null, null, null, null), new PhotoSearchPdpEnterParams(null, null, "bubble_pic", null, null, null, null), null, null, null, null, null);
                    try {
                        SettingsManager.LIZLLL().getClass();
                        c098200Yq = Boolean.valueOf(SettingsManager.LIZ("ecom_photo_search_uri_first_enable", true));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    Boolean bool = (Boolean) c098200Yq;
                    if (bool == null || bool.booleanValue()) {
                        bitmapLJFF = C1325290kal.LJFF(UriProtector.parse(str2));
                    }
                    iPhotoSearchService.LJIIIZ(context, photoSearchEnterParams, bitmapLJFF, null, null);
                    C1018703yb.LIZLLL("find_similar_tab_click", new AwS588S0100000_9(c0qer, 511));
                    eCPhotoSearchBubbleAssem.LLJJIJIL = true;
                    C0P0T c0p0t2 = eCPhotoSearchBubbleAssem.LLJJ;
                    if (c0p0t2 != null) {
                        c0p0t2.dismiss();
                    }
                }
            }
        });
        C634720Ov0 c634720Ov0 = new C634720Ov0(view.getContext(), null, 0);
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        c1331670kl3LIZLLL.LJJ(c634720Ov0.LL);
        C786410Ut5.h3(c1331670kl3LIZLLL);
        c1391550mJd.LLILLJJLI.LJIIZILJ = c634720Ov0;
        this.LLJJ = c1391550mJd.LIZIZ();
        Ao();
        C0P0T c0p0t2 = this.LLJJ;
        if (c0p0t2 != null) {
            c0p0t2.show();
        }
    }

    public final void zo(boolean z, ECSystemPhotoModel eCSystemPhotoModel, C621760Oa6 c621760Oa6) {
        if (!z || eCSystemPhotoModel == null) {
            return;
        }
        Thread threadU3 = C786410Ut5.u3();
        BPEAHandler bPEAHandler = C612310Nzx.LIZ;
        if (Intrinsics.LJFF(threadU3, bPEAHandler.getLooper().getThread())) {
            View view = c621760Oa6.LIZ;
            if (view.getWindowToken() != null && view.isAttachedToWindow()) {
                Bo(eCSystemPhotoModel, view);
                return;
            }
            return;
        }
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS42S0300000_9(c621760Oa6, this, eCSystemPhotoModel, 0));
    }
}

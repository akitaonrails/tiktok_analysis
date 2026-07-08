package com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0I0B;
import X.C0KFD;
import X.C0ZJ4;
import X.C13LE;
import X.C1729206pu;
import X.C1856280yPC;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C814420VxA;
import X.EnumC1242510iRF;
import X.EnumC1381750m3p;
import X.EnumC1381770m3r;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.MotionEvent;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.viewmodel.group.GroupDetailViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class GroupDetailMembersPageCell extends PowerCell<C1856280yPC> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 348));
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupDetailMembersPageCell.class, "mediaGridVM", "getMediaGridVM()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/MediaGridViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupDetailMembersPageCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/detailpage/viewmodel/group/GroupDetailViewModel;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cj3;
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
    }

    public GroupDetailMembersPageCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MediaGridViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 377);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(33);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 364), awS577S0100000_33, AFwS224S0000000_33.get$arr$(84), new AwS577S0100000_33((C03K6) this, 354), new AwS577S0100000_33((C03K6) this, 365), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 368), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 371), null, new AwS577S0100000_33((C03K6) this, 374));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 350);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 352);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 355);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 14));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 360);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 363);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 366);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 369);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 372);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 375), awS577S0100000_33, AFwS224S0000000_33.get$arr$(83), new AwS577S0100000_33((C03K6) this, 379), new AwS577S0100000_33((C03K6) this, 381), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 383), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 385), null, new AwS577S0100000_33((C03K6) this, 387));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 388), awS577S0100000_33, AFwS224S0000000_33.get$arr$(85), new AwS577S0100000_33((C03K6) this, 390), new AwS577S0100000_33((C03K6) this, 392), new AwS577S0100000_33((C03K6) this, 395), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 397));
        }
        this.LLILLJJLI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GroupDetailViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 345);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(32);
        if (Intrinsics.LJFF(obj, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 349), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(82), new AwS577S0100000_33((C03K6) this, 353), new AwS577S0100000_33((C03K6) this, 356), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 358), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 361), null, new AwS577S0100000_33((C03K6) this, 367));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 370);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 373);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 376);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 15));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 378);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 380);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 382);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 384);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 386);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 389), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(86), new AwS577S0100000_33((C03K6) this, 391), new AwS577S0100000_33((C03K6) this, 393), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 394), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 396), null, new AwS577S0100000_33((C03K6) this, 346));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 347), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(81), new AwS577S0100000_33((C03K6) this, 351), new AwS577S0100000_33((C03K6) this, 357), new AwS577S0100000_33((C03K6) this, 359), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 362));
        }
        this.LLILLL = assemVMLazy2;
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
        IIMMediaGridAnalytics iIMMediaGridAnalytics = (IIMMediaGridAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMediaGridAnalytics.class);
        if (iIMMediaGridAnalytics != null) {
            AssemVMLazy assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
            iIMMediaGridAnalytics.LIZ("ttsocial_chat_setting_media_module_exit", iIMMediaGridAnalytics.LIZJ(((MediaGridViewModel) this.LLILLJJLI.getValue()).xQ2(), null, EnumC1381770m3r.GROUP, EnumC1381750m3p.GROUP_MEMBER, ((C1729206pu) assemVMLazy.getValue().getState()).LLIZLLLIL.LIZ.isEmpty() ? EnumC1242510iRF.EMPTY : EnumC1242510iRF.NOT_EMPTY), C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        RecyclerView recyclerView = (RecyclerView) this.LL.getValue();
        C426750GoL.LJIIIZ(recyclerView, 0, 0, 0, null, false, 24);
        recyclerView.setBackground(null);
        recyclerView.setItemAnimator(null);
        C426750GoL.LJIIL(recyclerView, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 23);
        ((RecyclerView) this.LL.getValue()).addOnItemTouchListener(new C0KFD() { // from class: X.0yPF
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0 && recyclerView2.getScrollState() == 2) {
                    recyclerView2.stopScroll();
                    return false;
                }
                return false;
            }
        });
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LL.getValue()).LIZJ(new C0ZJ4());
    }
}

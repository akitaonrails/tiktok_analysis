package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.view.fragment;

import X.C019F;
import X.C01D1;
import X.C0JCK;
import X.C0K2Q;
import X.C0K4A;
import X.C0K4E;
import X.C0K4F;
import X.C0K4J;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C11S5;
import X.C1390410mHn;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC499440JiI;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.AfS143S0200000_7;
import Y.AfS172S0100000_3;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCTopicByCategory;
import webcast.api.pgc_sub.PGCTopicResponse;
import webcast.api.sub.SpaceTip;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlySpacePostTopicFragment extends SubscriptionBaseSheet {
    public static final C0K2Q LLLF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzZiOjHELIOSoxOzUtKip9JiA7OSAgPGs6ICokZiM+KCg+LSs4ZxwmKgoiJTYAOCQvLB88OzEYJj86KwM+KCg+LSs4";
    public final int LLJJJJLIIL = R.layout.ffp;
    public final float LLJJL = 0.5f;
    public final float LLJJLIIIJLLLLLLLZ = 0.6f;
    public final int LLJL = 375;
    public final boolean LLJLIL = true;
    public TextView LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public C0K4F LLJLLIL;
    public String LLJLLL;
    public PGCTopicResponse.ResponseData LLJZ;
    public SpaceTip LLJZIJLIL;
    public FrameLayout LLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0K2Q] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubOnlySpacePostTopicFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/newpost/vm/SubSpaceNewPostVM;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLF = new Object() { // from class: X.0K2Q
        };
    }

    public SubOnlySpacePostTopicFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceNewPostVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 506);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(228);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 507), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 508), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 509), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLL = assemVMLazy;
        this.LLJLLL = "";
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final Float WR() {
        return Float.valueOf(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final Integer ZR() {
        return Integer.valueOf(this.LLJL);
    }

    public final C0K4F gS() {
        if (this.LLJLLIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0K4F.class, null);
            this.LLJLLIL = interfaceC1555100qZQLIZIZ != null ? (C0K4F) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJLLIL;
    }

    public final SubSpaceNewPostVM hS() {
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (SubSpaceNewPostVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet, com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLILLLLZIIL = null;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final int VR() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final float aS() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.commonui.sheet.SubscriptionBaseSheet
    public final boolean bS() {
        return this.LLJLIL;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C0K4F(), C0K4F.class, "source_default_key");
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C0K4A c0k4a;
        SubSpaceNewPostVM subSpaceNewPostVMHS = hS();
        if (subSpaceNewPostVMHS.EQ2()) {
            C0K4E.LIZ().LIZJ("sub_space_new_post");
            C0K4F c0k4fDQ2 = subSpaceNewPostVMHS.DQ2();
            if (c0k4fDQ2 != null && (c0k4a = c0k4fDQ2.LL) != null) {
                c0k4a.LJFF = null;
            }
            C0K4F c0k4fDQ22 = subSpaceNewPostVMHS.DQ2();
            if (c0k4fDQ22 != null) {
                c0k4fDQ22.LLILLL = null;
            }
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        C11NZ c11nz;
        SpaceTopicInfo spaceTopicInfo;
        C0K4F c0k4fGS;
        C0K4A c0k4a;
        SpaceTopicInfo spaceTopicInfo2;
        SpaceTopicContent spaceTopicContent;
        C0K4F c0k4fGS2;
        C0K4A c0k4a2;
        SpaceTopicInfo spaceTopicInfo3;
        SpaceTopicCategory spaceTopicCategory;
        C0K4F c0k4fGS3;
        C0K4A c0k4a3;
        List<PGCTopicByCategory> list;
        C0K4F c0k4fGS4;
        C0K4A c0k4a4;
        super.onViewCreated(view, bundle);
        hS().LL = C1558360qeg.LJFF(this, null);
        hS();
        C19EG activity = getActivity();
        if (activity != null) {
            activity.getSupportFragmentManager();
        }
        C0K4F c0k4fGS5 = gS();
        if (c0k4fGS5 != null) {
            c0k4fGS5.LLILLJJLI = this.LLJLLL;
        }
        PGCTopicResponse.ResponseData responseData = this.LLJZ;
        if (responseData != null && (list = responseData.topicByCategoryList) != null && (c0k4fGS4 = gS()) != null && (c0k4a4 = c0k4fGS4.LL) != null) {
            c0k4a4.LIZ = list;
        }
        SpaceTip spaceTip = this.LLJZIJLIL;
        if (spaceTip != null && (spaceTopicInfo3 = spaceTip.topicInfo) != null && (spaceTopicCategory = spaceTopicInfo3.spaceTopicCategory) != null && (c0k4fGS3 = gS()) != null && (c0k4a3 = c0k4fGS3.LL) != null) {
            c0k4a3.LIZIZ = spaceTopicCategory;
        }
        SpaceTip spaceTip2 = this.LLJZIJLIL;
        if (spaceTip2 != null && (spaceTopicInfo2 = spaceTip2.topicInfo) != null && (spaceTopicContent = spaceTopicInfo2.spaceTopicContent) != null && (c0k4fGS2 = gS()) != null && (c0k4a2 = c0k4fGS2.LL) != null) {
            c0k4a2.LIZLLL = spaceTopicContent;
        }
        SpaceTip spaceTip3 = this.LLJZIJLIL;
        if (spaceTip3 != null && (spaceTopicInfo = spaceTip3.topicInfo) != null && (c0k4fGS = gS()) != null && (c0k4a = c0k4fGS.LL) != null) {
            c0k4a.LJ = spaceTopicInfo;
        }
        this.LLL = (FrameLayout) view.findViewById(R.id.nlo);
        View view2 = getView();
        if (view2 != null) {
            recyclerView = (RecyclerView) view2.findViewById(R.id.yf9);
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            C723850SaN.LIZ(this, false, null, new AwS373S0200000_7(this, recyclerView, 89), 3);
        }
        C723850SaN.LIZ(this, false, null, new AwS586S0100000_7(this, 560), 3);
        if (this.LLJZ == null) {
            Context context = getContext();
            if (context != null) {
                FrameLayout frameLayout = this.LLL;
                if (frameLayout != null && frameLayout.getChildCount() == 0) {
                    int i = (int) (36 * context.getResources().getDisplayMetrics().density);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                    layoutParams.gravity = 17;
                    C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
                    C786410Ut5.V6(c1390410mHn, layoutParams);
                    c1390410mHn.LIZJ();
                    FrameLayout frameLayout2 = this.LLL;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(c1390410mHn, layoutParams);
                    }
                }
                FrameLayout frameLayout3 = this.LLL;
                if (frameLayout3 != null) {
                    C786410Ut5.LJZ(0, frameLayout3);
                }
            }
            SubSpaceNewPostVM subSpaceNewPostVMHS = hS();
            AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 804);
            AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 562);
            C11NZ<DataResponse<PGCTopicResponse.ResponseData>> spaceTopics = C0K4J.LIZ().getSpaceTopics();
            if (spaceTopics != null && (c11nz = (C11NZ) C0JCK.LIZ(spaceTopics, EnumC499440JiI.GENERAL, "SubSpaceNewPostVM", "sub/space/topics", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceNewPostVMHS))) != null) {
                c11nz.LJJLL(new AfS143S0200000_7((Object) subSpaceNewPostVMHS, (EmoteModel) awS551S0100000_7, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 45), new AfS172S0100000_3((Object) awS586S0100000_7, 110));
            }
        }
    }
}

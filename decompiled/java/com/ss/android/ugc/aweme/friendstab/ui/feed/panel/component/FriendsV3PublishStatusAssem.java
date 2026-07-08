package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C01GW;
import X.C0GSF;
import X.C100400Zm;
import X.C100500Zn;
import X.C1087110eOb;
import X.C1386160mAw;
import X.C13LE;
import X.C1637806bA;
import X.C19659111vp;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C296350BjV;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C461980I9s;
import X.C462050I9z;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC429240GsM;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class FriendsV3PublishStatusAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final AssemVMLazy LLJJI;
    public C0GSF LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public int LLJJIJIL;
    public C1087110eOb LLJJJ;
    public C462050I9z LLJJJIL;
    public TuxTextView LLJJJJ;
    public C1087110eOb LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public EnumC429240GsM LLJLILLLLZIIL;
    public final C630740Ooa LLJLL;
    public final C630740Ooa LLJLLIL;
    public final C630740Ooa LLJLLL;
    public final C630740Ooa LLJZ;
    public final C630740Ooa LLJZIJLIL;
    public final C630740Ooa LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3PublishStatusAssem.class, "publishStatusVM", "getPublishStatusVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PublishStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3PublishStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3PublishStatusViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 97), AFwS236S0000000_6.get$arr$(64), null, true);
        this.LLJLILLLLZIIL = EnumC429240GsM.NONE;
        this.LLJLL = C628500Oky.LIZ(new AwS550S0100000_6(this, 93));
        this.LLJLLIL = C628500Oky.LIZ(AFwS192S0000000_6.get$arr$(52));
        this.LLJLLL = C628500Oky.LIZ(AFwS192S0000000_6.get$arr$(54));
        this.LLJZ = C628500Oky.LIZ(new AwS550S0100000_6(this, 95));
        this.LLJZIJLIL = C628500Oky.LIZ(new AwS550S0100000_6(this, 92));
        this.LLL = C628500Oky.LIZ(new AwS550S0100000_6(this, 94));
        this.LLLF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 96));
        this.LLLFF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(53));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cbb;
    }

    public final FriendsV3PublishStatusViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFFI;
        return (FriendsV3PublishStatusViewModel) assemVMLazy.getValue();
    }

    public final void ip() {
        AnimatorSet animatorSet;
        hp().setState(new AwS21S0010000_6(true, 18));
        HandlerHook.viewRemoveCallbacks(LJJIJL(), (Runnable) this.LLL.getValue());
        AnimatorSet animatorSet2 = (AnimatorSet) this.LLJLL.getValue();
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = (AnimatorSet) this.LLJZIJLIL.getValue();
        if ((animatorSet3 == null || !animatorSet3.isRunning()) && (animatorSet = (AnimatorSet) this.LLJZIJLIL.getValue()) != null) {
            animatorSet.start();
        }
    }

    public final void kp() {
        Pair<Integer, Integer> pair = hp().getState().LLILZIL;
        if (pair == null) {
            pair = new Pair<>(0, 0);
        }
        int iIntValue = pair.getSecond().intValue();
        if (((Number) C100400Zm.LIZ.getValue()).intValue() != 1 || iIntValue != 1 || this.LLJLILLLLZIIL != EnumC429240GsM.PUBLISHING) {
            TuxTextView tuxTextView = this.LLJJIJIIJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJIJIIJIL;
        if (tuxTextView2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJJIJIL);
            sbLIZ.append('%');
            tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        TuxTextView tuxTextView3 = this.LLJJIJIIJIL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.f8((C461980I9s) this.LLLF.getValue());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        IAVPublishService iAVPublishService;
        List<PublishModel> allProgressValidPublishModel;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onViewCreated(view);
        this.LLJJIII = (C0GSF) view.findViewById(R.id.sh7);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.sh9);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.sh8);
        if (((Number) C100400Zm.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0GSF c0gsf = this.LLJJIII;
            if (c0gsf != null) {
                C1386160mAw.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), c0gsf);
            }
            TuxTextView tuxTextView = this.LLJJIJI;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(42);
            }
            TuxTextView tuxTextView2 = this.LLJJIJIIJIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(42);
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
            Drawable drawableLIZ = c384050F3z.LIZ(view.getContext());
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZLLL = 50.0f;
            c19659111vp.LJ = Integer.valueOf(R.attr.oy);
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(view.getContext()));
            View contentView = getContentView();
            if ((contentView instanceof ViewGroup) && (viewGroup2 = (ViewGroup) contentView) != null) {
                getContentView().setBackground(layerDrawableLJIILIIL);
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
                viewGroup.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0);
            }
        }
        this.LLJJJ = (C1087110eOb) view.findViewById(R.id.sh2);
        this.LLJJJIL = (C462050I9z) view.findViewById(R.id.sgf);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.sgd);
        this.LLJJJJJIL = (C1087110eOb) view.findViewById(R.id.sgk);
        this.LLJJJJLIIL = view.findViewById(R.id.sgj);
        this.LLJJL = view.findViewById(R.id.sgl);
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 103), view2);
        }
        View view3 = this.LLJJL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 104), view3);
        }
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.sg6);
        this.LLJL = view.findViewById(R.id.sg7);
        View viewFindViewById = view.findViewById(R.id.sg8);
        this.LLJLIL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS141S0100000_6(this, 25), viewFindViewById);
        }
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.Kg((C461980I9s) this.LLLF.getValue(), AFwS236S0000000_6.get$arr$(63));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0I9l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C461930I9n) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 110), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0I9m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C461930I9n) obj).LLJI;
            }
        }, null, new AwS620S0100000_6(this, 111), 6);
        C296350BjV.LIZ.getClass();
        if (C296350BjV.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0I9h
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C461930I9n) obj).LLIZLLLIL);
                }
            }, null, new AwS620S0100000_6(this, 112), 6);
        } else {
            C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0I9i
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C461930I9n) obj).LLJ);
                }
            }, null, new AwS620S0100000_6(this, 113), 6);
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0I9j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C461930I9n) obj).LLILZIL;
            }
        }, null, new AwS620S0100000_6(this, 108), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0I9k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C461930I9n) obj).LLILZ;
            }
        }, null, new AwS620S0100000_6(this, 109), 6);
        IAVPublishService iAVPublishService2 = (IAVPublishService) this.LLJLLIL.getValue();
        if (iAVPublishService2 != null && iAVPublishService2.isPublishing() && ((Number) C100500Zn.LIZ.getValue()).intValue() == 1 && (iAVPublishService = (IAVPublishService) this.LLJLLIL.getValue()) != null && (allProgressValidPublishModel = iAVPublishService.getAllProgressValidPublishModel()) != null) {
            ArrayList<PublishModel> arrayList = new ArrayList();
            for (PublishModel publishModel : allProgressValidPublishModel) {
                if (!publishModel.isStoryPublish) {
                    arrayList.add(publishModel);
                }
            }
            for (PublishModel publishModel2 : arrayList) {
                if (!publishModel2.isStoryPublish) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("valid publish Compensation received, status:");
                    sbLIZ.append(publishModel2.creationId);
                    C2188811AlT.LIZIZ(sbLIZ);
                    FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModelHp = hp();
                    friendsV3PublishStatusViewModelHp.withState(new AwS372S0200000_6(publishModel2, friendsV3PublishStatusViewModelHp, 69));
                }
            }
        }
    }
}

package com.bytedance.android.livesdk.broadcast.end;

import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119920fFW;
import X.C1143680frq;
import X.C1295960jpS;
import X.C13LP;
import X.C14KS;
import X.C15CP;
import X.C15CR;
import X.C15CT;
import X.C15CU;
import X.C15CV;
import X.C15CY;
import X.C1685300txQ;
import X.C1697580uHE;
import X.C1697810uHb;
import X.C16F5;
import X.C16HK;
import X.C189200o6;
import X.C19263510Xx;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C20749616Hm;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC20481115Cf;
import Y.ACListenerS165S0100000_31;
import Y.ALAdapterS12S0110000_31;
import Y.ALAdapterS5S0000000_31;
import Y.ARunnableS131S0100000_31;
import Y.AUListenerS278S0100000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class EndIncentiveSettlementFragment extends BaseFragment implements C15CU, InterfaceC20481115Cf {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTHELIOSY4Zyo9LGsJJysaJiYpJzs6PiAfLDsnJCAhLCEnDjctLiI2JjE=";
    public FrameLayout LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public FrameLayout LLILZIL;
    public C16F5 LLILZLL;
    public C1295960jpS LLIZ;
    public FrameLayout LLIZLLLIL;
    public C16F5 LLJ;
    public C15CT LLJI;
    public C15CT LLJIJIL;
    public C15CT LLJILJIL;
    public C1295960jpS LLJILJILJ;
    public C1295960jpS LLJILLL;
    public C1295960jpS LLJJ;
    public ImageView LLJJI;
    public ImageView LLJJIII;
    public FrameLayout LLJJIJI;
    public ImageView LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public AnchorFinishEncourageData LLJJJIL;
    public C15CR LLJJJJ;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public AnimatorSet LLJLILLLLZIIL;
    public AnimatorSet LLJLL;
    public AnimatorSet LLJLLIL;
    public AnimatorSet LLJLLL;
    public AnimatorSet LLJZ;
    public boolean LLLF;
    public long LLLFF;
    public boolean LLLFFI;
    public boolean LLLI;
    public C15CV LLJJJ = C15CV.ACHIEVEMENT;
    public final int LLJJJJJIL = 1;
    public final int LLJJJJLIIL = 2;
    public int LLJJL = 0;
    public float LLJZIJLIL = 40.0f;
    public boolean LLL = true;
    public final ArrayList<C15CT> LLLFZ = new ArrayList<>();
    public final ArrayList<Long> LLLII = new ArrayList<>();
    public final C01GW LLLIIII = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(84));

    @Override // X.InterfaceC20481115Cf
    public final void KL() {
        this.LLLI = true;
    }

    @Override // X.InterfaceC20481115Cf
    public final Fragment getFragment() {
        return this;
    }

    public final void NR() {
        C1295960jpS c1295960jpSUR;
        if (this.LLL && C15CY.LJIILLIIL(this.LLJJJIL)) {
            this.LLLFFI = true;
            this.LLJJL = this.LLJJJJLIIL;
            if (this.LLJJLIIIJLLLLLLLZ) {
                AnimatorSet animatorSet = this.LLJLILLLLZIIL;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                cS(false);
            }
            if ((this.LLJJLIIIJLLLLLLLZ || this.LLJLIL) && (c1295960jpSUR = UR()) != null) {
                c1295960jpSUR.setProgress(1.0f);
            }
            C15CT c15ctAS = aS();
            if (c15ctAS != null) {
                c15ctAS.cancel();
            }
            C15CT c15ctVR = VR();
            if (c15ctVR != null) {
                c15ctVR.cancel();
            }
            C15CT c15ctOR = OR();
            if (c15ctOR != null) {
                c15ctOR.cancel();
            }
            C15CR c15cr = this.LLJJJJ;
            if (c15cr != null) {
                c15cr.f();
            }
        }
    }

    public final C15CT OR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cfv) : null;
            this.LLJILJIL = (C15CT) viewFindViewById;
        }
        return (C15CT) viewFindViewById;
    }

    public final Handler PR() {
        return (Handler) this.LLLIIII.getValue();
    }

    public final FrameLayout RR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m0h) : null;
            this.LLILZIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C16F5 SR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m0i) : null;
            this.LLILLJJLI = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C1295960jpS UR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nwt) : null;
            this.LLIZ = (C1295960jpS) viewFindViewById;
        }
        return (C1295960jpS) viewFindViewById;
    }

    public final C15CT VR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.oc8) : null;
            this.LLJIJIL = (C15CT) viewFindViewById;
        }
        return (C15CT) viewFindViewById;
    }

    public final C16F5 WR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wh1) : null;
            this.LLILZLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16F5 ZR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y3b) : null;
            this.LLJ = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C15CT aS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.yca) : null;
            this.LLJI = (C15CT) viewFindViewById;
        }
        return (C15CT) viewFindViewById;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iS() {
        /*
            Method dump skipped, instruction units count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment.iS():void");
    }

    public final void mS() {
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo;
        List<AnchorFinishEncourageData.Task> list;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo2;
        List<AnchorFinishEncourageData.Task> list2;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo3;
        List<AnchorFinishEncourageData.Task> list3;
        AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo4;
        List<AnchorFinishEncourageData.Task> list4;
        AnchorFinishEncourageData.LopInfo lopInfo;
        List<AnchorFinishEncourageData.Task> list5;
        AnchorFinishEncourageData.LopInfo lopInfo2;
        List<AnchorFinishEncourageData.Task> list6;
        AnchorFinishEncourageData.LopInfo lopInfo3;
        List<AnchorFinishEncourageData.Task> list7;
        AnchorFinishEncourageData.LopInfo lopInfo4;
        List<AnchorFinishEncourageData.Task> list8;
        AnchorFinishEncourageData.AchievementInfo achievementInfo;
        List<AnchorFinishEncourageData.Task> list9;
        AnchorFinishEncourageData.AchievementInfo achievementInfo2;
        List<AnchorFinishEncourageData.Task> list10;
        AnchorFinishEncourageData.AchievementInfo achievementInfo3;
        List<AnchorFinishEncourageData.Task> list11;
        AnchorFinishEncourageData.AchievementInfo achievementInfo4;
        List<AnchorFinishEncourageData.Task> list12;
        int i = C15CP.LIZ[this.LLJJJ.ordinal()];
        int i2 = 0;
        if (i == 1) {
            C15CT c15ctAS = aS();
            if (c15ctAS != null) {
                AnchorFinishEncourageData anchorFinishEncourageData = this.LLJJJIL;
                c15ctAS.h0((anchorFinishEncourageData == null || (liveJourneyInfo4 = anchorFinishEncourageData.liveJourneyInfo) == null || (list4 = liveJourneyInfo4.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(0, list4), this, 0);
            }
            C15CT c15ctVR = VR();
            if (c15ctVR != null) {
                AnchorFinishEncourageData anchorFinishEncourageData2 = this.LLJJJIL;
                c15ctVR.h0((anchorFinishEncourageData2 == null || (liveJourneyInfo3 = anchorFinishEncourageData2.liveJourneyInfo) == null || (list3 = liveJourneyInfo3.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(1, list3), this, 1);
            }
            C15CT c15ctOR = OR();
            if (c15ctOR != null) {
                AnchorFinishEncourageData anchorFinishEncourageData3 = this.LLJJJIL;
                c15ctOR.h0((anchorFinishEncourageData3 == null || (liveJourneyInfo2 = anchorFinishEncourageData3.liveJourneyInfo) == null || (list2 = liveJourneyInfo2.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(2, list2), this, 2);
            }
            AnchorFinishEncourageData anchorFinishEncourageData4 = this.LLJJJIL;
            if (anchorFinishEncourageData4 == null || (liveJourneyInfo = anchorFinishEncourageData4.liveJourneyInfo) == null || (list = liveJourneyInfo.taskList) == null) {
                return;
            }
            Iterator<AnchorFinishEncourageData.Task> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (i2 == 0) {
                    if (aS() != null) {
                        this.LLLFZ.add(aS());
                    }
                } else if (i2 == 1) {
                    if (VR() != null) {
                        this.LLLFZ.add(VR());
                    }
                } else if (i2 == 2 && OR() != null) {
                    this.LLLFZ.add(OR());
                }
                i2 = i3;
            }
            return;
        }
        if (i == 2) {
            C15CT c15ctAS2 = aS();
            if (c15ctAS2 != null) {
                AnchorFinishEncourageData anchorFinishEncourageData5 = this.LLJJJIL;
                c15ctAS2.h0((anchorFinishEncourageData5 == null || (lopInfo4 = anchorFinishEncourageData5.lopInfo) == null || (list8 = lopInfo4.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(0, list8), this, 0);
            }
            C15CT c15ctVR2 = VR();
            if (c15ctVR2 != null) {
                AnchorFinishEncourageData anchorFinishEncourageData6 = this.LLJJJIL;
                c15ctVR2.h0((anchorFinishEncourageData6 == null || (lopInfo3 = anchorFinishEncourageData6.lopInfo) == null || (list7 = lopInfo3.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(1, list7), this, 1);
            }
            C15CT c15ctOR2 = OR();
            if (c15ctOR2 != null) {
                AnchorFinishEncourageData anchorFinishEncourageData7 = this.LLJJJIL;
                c15ctOR2.h0((anchorFinishEncourageData7 == null || (lopInfo2 = anchorFinishEncourageData7.lopInfo) == null || (list6 = lopInfo2.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(2, list6), this, 2);
            }
            AnchorFinishEncourageData anchorFinishEncourageData8 = this.LLJJJIL;
            if (anchorFinishEncourageData8 == null || (lopInfo = anchorFinishEncourageData8.lopInfo) == null || (list5 = lopInfo.taskList) == null) {
                return;
            }
            Iterator<AnchorFinishEncourageData.Task> it3 = list5.iterator();
            while (it3.hasNext()) {
                it3.next();
                int i4 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (i2 == 0) {
                    if (aS() != null) {
                        this.LLLFZ.add(aS());
                    }
                } else if (i2 == 1) {
                    if (VR() != null) {
                        this.LLLFZ.add(VR());
                    }
                } else if (i2 == 2 && OR() != null) {
                    this.LLLFZ.add(OR());
                }
                i2 = i4;
            }
            return;
        }
        if (i == 3) {
            C15CT c15ctAS3 = aS();
            if (c15ctAS3 != null) {
                AnchorFinishEncourageData anchorFinishEncourageData9 = this.LLJJJIL;
                c15ctAS3.h0((anchorFinishEncourageData9 == null || (achievementInfo4 = anchorFinishEncourageData9.achievementInfo) == null || (list12 = achievementInfo4.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(0, list12), this, 0);
            }
            C15CT c15ctVR3 = VR();
            if (c15ctVR3 != null) {
                AnchorFinishEncourageData anchorFinishEncourageData10 = this.LLJJJIL;
                c15ctVR3.h0((anchorFinishEncourageData10 == null || (achievementInfo3 = anchorFinishEncourageData10.achievementInfo) == null || (list11 = achievementInfo3.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(1, list11), this, 1);
            }
            C15CT c15ctOR3 = OR();
            if (c15ctOR3 != null) {
                AnchorFinishEncourageData anchorFinishEncourageData11 = this.LLJJJIL;
                c15ctOR3.h0((anchorFinishEncourageData11 == null || (achievementInfo2 = anchorFinishEncourageData11.achievementInfo) == null || (list10 = achievementInfo2.taskList) == null) ? null : (AnchorFinishEncourageData.Task) C13LP.LJJJLZIJ(2, list10), this, 2);
            }
            AnchorFinishEncourageData anchorFinishEncourageData12 = this.LLJJJIL;
            if (anchorFinishEncourageData12 == null || (achievementInfo = anchorFinishEncourageData12.achievementInfo) == null || (list9 = achievementInfo.taskList) == null) {
                return;
            }
            Iterator<AnchorFinishEncourageData.Task> it4 = list9.iterator();
            while (it4.hasNext()) {
                it4.next();
                int i5 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (i2 == 0) {
                    if (aS() != null) {
                        this.LLLFZ.add(aS());
                    }
                } else if (i2 == 1) {
                    if (VR() != null) {
                        this.LLLFZ.add(VR());
                    }
                } else if (i2 == 2 && OR() != null) {
                    this.LLLFZ.add(OR());
                }
                i2 = i5;
            }
        }
    }

    @Override // X.InterfaceC20481115Cf
    public final boolean wt() {
        AnchorFinishEncourageData anchorFinishEncourageData = this.LLJJJIL;
        C15CV c15cv = this.LLJJJ;
        boolean zLJIJI = C15CY.LJIJI(anchorFinishEncourageData);
        boolean zLJIJ = C15CY.LJIJ(anchorFinishEncourageData);
        boolean z = true;
        if (c15cv == C15CV.ACHIEVEMENT || ((c15cv == C15CV.LOP && zLJIJI) || (c15cv == C15CV.LIVE_JOURNEY && zLJIJ))) {
            return this.LLLFFI;
        }
        Iterator<C15CT> it2 = this.LLLFZ.iterator();
        while (it2.hasNext()) {
            if (!it2.next().LLJJ) {
                z = false;
            }
        }
        return z;
    }

    public final void hS() {
        if (ZR() == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ZR(), (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLJLLL = animatorSet;
        animatorSet.play(objectAnimatorOfFloat);
        AnimatorSet animatorSet2 = this.LLJLLL;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new ALAdapterS5S0000000_31(0));
        }
        AnimatorSet animatorSet3 = this.LLJLLL;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
    }

    @Override // X.InterfaceC20481115Cf
    public final void release() {
        C1295960jpS c1295960jpSUR = UR();
        if (c1295960jpSUR != null) {
            c1295960jpSUR.cancelAnimation();
        }
        AnimatorSet animatorSet = this.LLJLL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJLL = null;
        AnimatorSet animatorSet2 = this.LLJZ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LLJZ = null;
        AnimatorSet animatorSet3 = this.LLJLILLLLZIIL;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.LLJLILLLLZIIL = null;
        AnimatorSet animatorSet4 = this.LLJLLIL;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        this.LLJLLIL = null;
        AnimatorSet animatorSet5 = this.LLJLLL;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        this.LLJLLL = null;
        C15CT c15ctAS = aS();
        if (c15ctAS != null) {
            c15ctAS.cancel();
        }
        C15CT c15ctVR = VR();
        if (c15ctVR != null) {
            c15ctVR.cancel();
        }
        C15CT c15ctOR = OR();
        if (c15ctOR != null) {
            c15ctOR.cancel();
        }
        this.LLLFZ.clear();
        ArrayList<Long> arrayList = this.LLLII;
        if (arrayList != null) {
            arrayList.clear();
        }
        PR().removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC20481115Cf
    public final void jh() {
        NR();
    }

    public final void cS(boolean z) {
        C1295960jpS c1295960jpSUR = UR();
        if (c1295960jpSUR != null) {
            C786410Ut5.f5(c1295960jpSUR, 1.0f);
        }
        C1295960jpS c1295960jpSUR2 = UR();
        if (c1295960jpSUR2 != null) {
            c1295960jpSUR2.loop(false);
            c1295960jpSUR2.addAnimatorUpdateListener(new AUListenerS278S0100000_31(this, 4));
            C1143680frq.LJIILL(c1295960jpSUR2, "tiktok_live_broadcast_demand_7", "ttlive_finish_encourage_journey_stageup.zip", z, new C20749616Hm(c1295960jpSUR2, this, 0));
        }
    }

    public final void dS(boolean z) {
        if (UR() == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(UR(), (Property<C1295960jpS, Float>) View.ROTATION_Y, 0.0f, -40.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(UR(), (Property<C1295960jpS, Float>) View.ROTATION_Y, -40.0f, 30.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(UR(), (Property<C1295960jpS, Float>) View.ROTATION_Y, 30.0f, -15.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(UR(), (Property<C1295960jpS, Float>) View.ROTATION_Y, -15.0f, 5.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(UR(), (Property<C1295960jpS, Float>) View.ROTATION_Y, 5.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat3.setDuration(100L);
        objectAnimatorOfFloat4.setDuration(100L);
        objectAnimatorOfFloat5.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLJLL = animatorSet;
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5);
        AnimatorSet animatorSet2 = this.LLJLL;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new ALAdapterS12S0110000_31(this, z, 1));
        }
        AnimatorSet animatorSet3 = this.LLJLL;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final void gS(boolean z) {
        C15CT c15ctAS = aS();
        if (c15ctAS != null) {
            c15ctAS.e0();
        }
        C15CT c15ctVR = VR();
        if (c15ctVR != null) {
            c15ctVR.e0();
        }
        C15CT c15ctOR = OR();
        if (c15ctOR != null) {
            c15ctOR.e0();
        }
        if (z) {
            C786410Ut5.LJLIIL(300L, PR(), new ARunnableS131S0100000_31(this, 141));
        }
    }

    public final void kS(String str) {
        C16F5 c16f5SR = SR();
        if (c16f5SR != null) {
            c16f5SR.setTextSize(1, 40.0f);
        }
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 17.0f, 1.0f, null, 0.0f, 0, null, 240);
        C16F5 c16f5SR2 = SR();
        if (c16f5SR2 != null) {
            c16f5SR2.setTypeface(typefaceLIZIZ);
        }
        C16F5 c16f5SR3 = SR();
        if (c16f5SR3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('X');
            sbLIZ.append(str);
            c16f5SR3.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/broadcast/end/EndIncentiveSettlementFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/kIl75NdxSKr2Dipy6sQFI7O4WOtUd0+pcuNblvSIzmDdE=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z && !this.LLL && !this.LLLF) {
            this.LLLF = true;
            this.LLJJL = this.LLJJJJJIL;
            C786410Ut5.LJLIIL(200L, PR(), new ARunnableS131S0100000_31(this, 30));
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(EndIncentiveSettlementFragment.class);
        }
    }

    public final void sf(C16F5 c16f5) {
        if (c16f5 == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 0.6f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 1.0f, 0.95f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 1.0f, 0.95f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, 0.95f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, 0.95f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat3.setDuration(300L);
        objectAnimatorOfFloat4.setDuration(100L);
        objectAnimatorOfFloat4.setStartDelay(300L);
        objectAnimatorOfFloat5.setDuration(100L);
        objectAnimatorOfFloat5.setStartDelay(300L);
        objectAnimatorOfFloat6.setDuration(100L);
        objectAnimatorOfFloat6.setStartDelay(400L);
        objectAnimatorOfFloat7.setDuration(100L);
        objectAnimatorOfFloat7.setStartDelay(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.LLJLLIL = animatorSet;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
        AnimatorSet animatorSet2 = this.LLJLLIL;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new ALAdapterS5S0000000_31(3));
        }
        AnimatorSet animatorSet3 = this.LLJLLIL;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final void Fx(C16F5 c16f5, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (Intrinsics.LJFF(C19263510Xx.LIZ(getContext()).toString(), "en")) {
            if (c16f5 != null) {
                c16f5.setTextSize(1, 40.0f);
            }
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 17.0f, 1.0f, null, 0.0f, 0, null, 240);
            if (c16f5 != null) {
                c16f5.setTypeface(typefaceLIZIZ);
                c16f5.setText(str);
            }
            View viewFindViewById = this.LLIZLLLIL;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.v52);
                } else {
                    viewFindViewById = null;
                }
                this.LLIZLLLIL = (FrameLayout) viewFindViewById;
            }
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            if (frameLayout != null) {
                C786410Ut5.Bb(frameLayout, -3.0f);
            }
            if (c16f5 == null) {
                return;
            }
        } else {
            SpannableString spannableString = new SpannableString(str);
            C1119920fFW.LJIIIIZZ(spannableString, 0, spannableString.length(), 17, OppoPermissionPopupMaskDelayExp.DEFAULT);
            if (c16f5 == null) {
                return;
            } else {
                c16f5.setText(spannableString);
            }
        }
        ViewTreeObserver viewTreeObserver = c16f5.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserver.OnPreDrawListener c16hk = new C16HK(c16f5, this, 0);
            viewTreeObserver.addOnPreDrawListener(c16hk);
            C2187701Ajg.LIZ(viewTreeObserver, c16hk, ViewTreeObserver.OnPreDrawListener.class);
        }
    }

    public final void bS(View view, boolean z) {
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.LLJZ = animatorSet;
            animatorSet.play(objectAnimatorOfFloat);
            AnimatorSet animatorSet2 = this.LLJZ;
            if (animatorSet2 != null) {
                animatorSet2.addListener(new ALAdapterS12S0110000_31(this, z, 0));
            }
            AnimatorSet animatorSet3 = this.LLJZ;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
    }

    public final void nS(C16F5 c16f5, String str) {
        if (!TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(str);
            C1119920fFW.LJIIIIZZ(spannableString, 0, spannableString.length(), 17, OppoPermissionPopupMaskDelayExp.DEFAULT);
            if (c16f5 != null) {
                c16f5.setText(spannableString);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        super.onViewCreated(view, bundle);
        boolean z = false;
        this.LLJJL = 0;
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.eqx);
            } else {
                viewFindViewById = null;
            }
            this.LL = (FrameLayout) viewFindViewById;
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS165S0100000_31(this, 41));
        }
        if (this.LLL) {
            this.LLJJL = this.LLJJJJJIL;
            iS();
            C15CR c15cr = this.LLJJJJ;
            if (c15cr != null) {
                if (!this.LLJJLIIIJLLLLLLLZ && !this.LLJLIL) {
                    j = 3000;
                } else {
                    j = Mp4ScreenVideoLoadTimeout.CONTROL;
                }
                if (this.LLJJL == this.LLJJJJLIIL) {
                    z = true;
                }
                c15cr.p(j, true, z);
            }
        }
    }

    @Override // X.C15CU
    public final void lJ(int i, int i2, int i3) {
        C1295960jpS c1295960jpS;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (i3 == -1) {
            return;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                View viewFindViewById = this.LLJJ;
                if (viewFindViewById == null) {
                    View view = getView();
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.cep);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLJJ = (C1295960jpS) viewFindViewById;
                }
                c1295960jpS = (C1295960jpS) viewFindViewById;
            } else {
                View viewFindViewById2 = this.LLJILLL;
                if (viewFindViewById2 == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById2 = view2.findViewById(R.id.oc7);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLJILLL = (C1295960jpS) viewFindViewById2;
                }
                c1295960jpS = (C1295960jpS) viewFindViewById2;
            }
        } else {
            View viewFindViewById3 = this.LLJILJILJ;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.ybg);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJILJILJ = (C1295960jpS) viewFindViewById3;
            }
            c1295960jpS = (C1295960jpS) viewFindViewById3;
        }
        if (c1295960jpS != null) {
            layoutParams = c1295960jpS.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (C497740JfY.LJJ()) {
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart((C14KS.LJFF() - i) - ((int) C497740JfY.LIZIZ(40)));
                float f = 40;
                marginLayoutParams.topMargin = ((i2 - ((int) C497740JfY.LIZIZ(f))) - C497740JfY.LJIJ()) - ((int) C497740JfY.LIZIZ(f));
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(i - ((int) C497740JfY.LIZIZ(10)));
            float f2 = 40;
            marginLayoutParams.topMargin = ((i2 - ((int) C497740JfY.LIZIZ(f2))) - C497740JfY.LJIJ()) - ((int) C497740JfY.LIZIZ(f2));
        }
        if (c1295960jpS != null) {
            C786410Ut5.s6(c1295960jpS, marginLayoutParams);
            if (c1295960jpS != null) {
                C786410Ut5.LLD(0, c1295960jpS);
                c1295960jpS.loop(false);
                c1295960jpS.addAnimatorUpdateListener(new AUListenerS278S0100000_31((Object) c1295960jpS, 5));
            }
        }
        C1143680frq.LJIILL(c1295960jpS, "tiktok_live_broadcast_demand_7", "ttlive_finish_encourage_task_explode.zip", true, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ghl, viewGroup, false);
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
}

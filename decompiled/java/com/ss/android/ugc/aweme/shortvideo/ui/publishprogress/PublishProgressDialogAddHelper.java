package com.ss.android.ugc.aweme.shortvideo.ui.publishprogress;

import X.C01TT;
import X.C09JN;
import X.C0SHX;
import X.C0Y8U;
import X.C11JF;
import X.C12WP;
import X.C1433730nPf;
import X.C1439650nZD;
import X.C1447750nmH;
import X.C1447770nmJ;
import X.C1447790nmL;
import X.C1447870nmT;
import X.C15438062q;
import X.C1561720qk6;
import X.C1599640rjG;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C19EG;
import X.C2214201BlK;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C430110Gtl;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC1447760nmI;
import X.InterfaceC1447890nmV;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AAListenerS333S0100000_22;
import Y.AObserverS217S0100000_13;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS116S0100000_16;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.publish.PublishProgressWidgetContainer;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishProgressDialogAddHelper {
    public static C1447770nmJ LIZIZ;
    public static C1447790nmL LJ;
    public static C11JF LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIL;
    public static final PublishProgressDialogAddHelper LIZ = new PublishProgressDialogAddHelper();
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
    public static final List<String> LJFF = C1697810uHb.LJ(SAAActivity.class.getName(), ChooseCoverActivity.class.getName(), "com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "com.ss.android.ugc.aweme.im.chatlist.impl.ui.fragment.SessionListFragment", "com.ss.android.ugc.aweme.im.chatlist.impl.ui.fragment.SessionListFragment2", "miniapp.views.MiniAppListH5Activity", "miniapp.RecentlyUsedMicroAppActivity", "com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "detail.ui.LiveDetailActivity", "live.LiveFeedActivity", "story.shootvideo.record.StoryRecordActivity", "notification.FansDetailActivity", "notification.NotificationDetailActivity", "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "com.ss.android.ugc.aweme.live.LiveBroadcastBgSceneWrapperActivity", "com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity", "com.ss.android.ugc.aweme.live.LivePlayActivity", "live.LivePlayActivity", "com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity", "com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "story.shootvideo.record.StoryRecordActivity", "com.ss.android.ugc.aweme.live.LiveCoverCameraActivity", "com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "com.ss.android.ugc.aweme.detail.ui.PublishPreviewDetailActivity", "com.ss.android.ugc.aweme.nows.ui.NowsEditActivity");
    public static final List<WeakReference<Activity>> LJI = new ArrayList();
    public static final WeakHashMap<Activity, CopyOnWriteArrayList<InterfaceC1447760nmI>> LJII = new WeakHashMap<>();
    public static boolean LJIIIIZZ = true;
    public static final Map<InterfaceC214897198d, LifecycleBoundSceneLifecycleCallbacks> LJIIJJI = new LinkedHashMap();

    public static final class LifecycleBoundSceneLifecycleCallbacks implements LifecycleEventObserver {
        public final C19EG LL;
        public final InterfaceC214897198d LLILLJJLI;
        public final C0Y8U LLILLL;
        public final InterfaceC1447890nmV LLILZ;

        public final void LIZ() {
            this.LL.getLifecycle().removeObserver(this);
            NavigationScene navigationScene = this.LLILLJJLI.getNavigationScene();
            if (navigationScene != null) {
                navigationScene.unregisterChildSceneLifecycleCallbacks(this.LLILLL);
            }
            NavigationScene navigationScene2 = this.LLILLJJLI.getNavigationScene();
            if (navigationScene2 != null) {
                InterfaceC1447890nmV interfaceC1447890nmV = this.LLILZ;
                C12WP.LIZ();
                ((ArrayList) navigationScene2.LLJL).remove(interfaceC1447890nmV);
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                C1447770nmJ c1447770nmJ = PublishProgressDialogAddHelper.LIZIZ;
                if (c1447770nmJ != null && c1447770nmJ.LJIIL != 0) {
                    if (c1447770nmJ.LJIIJ != null) {
                        c1447770nmJ.LIZJ(c1447770nmJ.LIZIZ);
                        c1447770nmJ.LJIIL = 0;
                    }
                    c1447770nmJ.LJIIJ = null;
                }
                LIZ();
                PublishProgressDialogAddHelper.LJIIJJI.remove(this.LLILLJJLI);
            }
        }

        public LifecycleBoundSceneLifecycleCallbacks(C19EG c19eg, InterfaceC214897198d interfaceC214897198d, C1447870nmT c1447870nmT, C1447870nmT c1447870nmT2) {
            this.LL = c19eg;
            this.LLILLJJLI = interfaceC214897198d;
            this.LLILLL = c1447870nmT;
            this.LLILZ = c1447870nmT2;
        }
    }

    public static void LJ() {
        if (LJIIJ) {
            return;
        }
        LJIIJ = true;
        C11JF c11jf = LJIIIZ;
        if (c11jf != null && (true ^ c11jf.isDisposed())) {
            c11jf.dispose();
        }
        LJIIIZ = (C11JF) C2214201BlK.LIZIZ().LJJLJLI(new C09JN() { // from class: X.0nmG
            @Override // X.C09JN
            public final void accept(Object obj) {
                ICreativeSAAService iCreativeSAAService;
                C1C7U.LIZ("PublishProgressDialogAddHelper@16ce.initGlobalProgress$2");
                C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) obj);
                if (c19egLIZIZ != null) {
                    PublishProgressDialogAddHelper.LIZ.getClass();
                    List<WeakReference<Activity>> list = PublishProgressDialogAddHelper.LJI;
                    if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
                        if (!PublishProgressDialogAddHelper.LJFF.contains(c19egLIZIZ.getClass().getName())) {
                            PublishProgressDialogAddHelper.LIZ(PublishProgressDialogAddHelper.LIZ, c19egLIZIZ, true, 0, 0, false, null, false, true, false, false, 892);
                        }
                    } else {
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(((Reference) it2.next()).get(), c19egLIZIZ)) {
                                break;
                            }
                        }
                        if (!PublishProgressDialogAddHelper.LJFF.contains(c19egLIZIZ.getClass().getName()) && ((!C294090Bfr.LIZ() || (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) == null || !iCreativeSAAService.isSAAActivity(c19egLIZIZ)) && C1433730nPf.LJIJI(null))) {
                            PublishProgressDialogAddHelper.LIZ(PublishProgressDialogAddHelper.LIZ, c19egLIZIZ, true, 0, 0, false, null, false, true, false, false, 892);
                        }
                    }
                }
                C1C7U.LIZIZ("PublishProgressDialogAddHelper@16ce.initGlobalProgress$2");
            }
        });
    }

    public static void LJFF() {
        if (LJ == null) {
            C844470XAv.LIZ.getClass();
            C1447790nmL c1447790nmL = new C1447790nmL(C844470XAv.LIZ());
            LJ = c1447790nmL;
            c1447790nmL.getState().LIZIZ.observeForever(new AObserverS217S0100000_13(c1447790nmL, 9));
            c1447790nmL.getState().LIZLLL.observeForever(new AObserverS225S0100000_22(c1447790nmL, 52));
            c1447790nmL.getState().LJ.observeForever(new AObserverS217S0100000_13(c1447790nmL, 10));
            c1447790nmL.getState().LJIIIIZZ.observeForever(new AObserverS225S0100000_22(c1447790nmL, 53));
            c1447790nmL.getState().LJIIIZ.observeForever(new AObserverS225S0100000_22(c1447790nmL, 48));
            c1447790nmL.getState().LJFF.observeForever(new AObserverS225S0100000_22(c1447790nmL, 49));
            c1447790nmL.getState().LJI.observeForever(new AObserverS225S0100000_22(c1447790nmL, 50));
            c1447790nmL.getState().LJII.observeForever(new AObserverS225S0100000_22(c1447790nmL, 51));
            C1447790nmL c1447790nmL2 = LJ;
            if (c1447790nmL2 != null) {
                c1447790nmL2.hide();
            }
        }
    }

    public static void LJI() {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        C1447770nmJ c1447770nmJ = LIZIZ;
        if (c1447770nmJ != null && (mutableLiveData = c1447770nmJ.LJJIJIL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            C1447770nmJ c1447770nmJ2 = LIZIZ;
            if (c1447770nmJ2 == null || (mutableLiveData2 = c1447770nmJ2.LJJIJIL) == null) {
                return;
            }
            mutableLiveData2.observeForever(new Observer<Boolean>() { // from class: X.0c0J
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Boolean bool) {
                    MutableLiveData<Boolean> mutableLiveData3;
                    if (!bool.booleanValue() && C1433730nPf.LJIIL() <= 0) {
                        C1447770nmJ c1447770nmJ3 = PublishProgressDialogAddHelper.LIZIZ;
                        if (c1447770nmJ3 != null) {
                            HandlerHook.viewPostDelay(c1447770nmJ3.LIZIZ, new ARunnableS116S0100000_16(c1447770nmJ3, 78), 1000L);
                        }
                        C1447770nmJ c1447770nmJ4 = PublishProgressDialogAddHelper.LIZIZ;
                        if (c1447770nmJ4 != null && (mutableLiveData3 = c1447770nmJ4.LJJIJIL) != null) {
                            mutableLiveData3.removeObserver(this);
                        }
                    }
                }
            });
            return;
        }
        C1447790nmL c1447790nmL = LJ;
        if (c1447790nmL != null) {
            c1447790nmL.hide();
        }
        C1447770nmJ c1447770nmJ3 = LIZIZ;
        if (c1447770nmJ3 != null && c1447770nmJ3.LJIIL != 0) {
            if (c1447770nmJ3.LJIIJ != null) {
                c1447770nmJ3.LIZJ(c1447770nmJ3.LIZIZ);
                c1447770nmJ3.LJIIL = 0;
            }
            c1447770nmJ3.LJIIJ = null;
        }
        C1447770nmJ c1447770nmJ4 = LIZIZ;
        if (c1447770nmJ4 != null) {
            C1447770nmJ.LIZIZ(c1447770nmJ4);
        }
        LJIIIIZZ = true;
        C1447790nmL c1447790nmL2 = LJ;
        if (c1447790nmL2 != null) {
            c1447790nmL2.LJIIIZ(0);
        }
        if (LJIIJ) {
            LJIIJ = false;
            C1447770nmJ c1447770nmJ5 = LIZIZ;
            if (c1447770nmJ5 != null) {
                c1447770nmJ5.LJIJI = false;
            }
            C11JF c11jf = LJIIIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LJIIIZ = null;
        }
        Iterator it2 = ((LinkedHashMap) LJIIJJI).entrySet().iterator();
        while (it2.hasNext()) {
            ((LifecycleBoundSceneLifecycleCallbacks) ((Map.Entry) it2.next()).getValue()).LIZ();
            it2.remove();
        }
    }

    public static boolean LIZIZ(InterfaceC214902198i interfaceC214902198i) {
        Activity activity;
        C19EG c19eg;
        IMFPubAbility iMFPubAbilityLIZJ;
        if (!(interfaceC214902198i instanceof PublishProgressWidgetContainer)) {
            return false;
        }
        SAFFragmentRootScene sAFFragmentRootSceneIb = interfaceC214902198i.ib();
        if (sAFFragmentRootSceneIb != null && (activity = sAFFragmentRootSceneIb.mActivity) != null) {
            Boolean boolValueOf = null;
            if (activity instanceof C19EG) {
                c19eg = (C19EG) activity;
            } else {
                c19eg = null;
            }
            Fragment fragmentBQ2 = C343710Ddh.LIZ(c19eg).BQ2();
            if (C1599640rjG.LIZIZ.Pu(fragmentBQ2)) {
                boolValueOf = Boolean.FALSE;
            } else if (fragmentBQ2 != null && (iMFPubAbilityLIZJ = C1561720qk6.LIZJ(fragmentBQ2)) != null) {
                boolValueOf = Boolean.valueOf(iMFPubAbilityLIZJ.iI2());
            }
            if (!(!Intrinsics.LJFF(boolValueOf, Boolean.FALSE))) {
                return false;
            }
        }
        return true;
    }

    public static void LIZJ(String str) {
        PublishModel publishModelLJIILJJIL = C1433730nPf.LJIILJJIL(str);
        if (publishModelLJIILJJIL != null && C1433730nPf.LJIJI(null) && C1433730nPf.LJIJ(publishModelLJIILJJIL) && str.length() > 0) {
            C01TT.LIZLLL(new AwS171S1100000_22(publishModelLJIILJJIL, str, 6));
        }
    }

    public static void LIZLLL(boolean z) {
        C1447790nmL c1447790nmL;
        LJIIL = z;
        C1447790nmL c1447790nmL2 = LJ;
        if (c1447790nmL2 != null && c1447790nmL2.getParent() != null && (c1447790nmL = LJ) != null) {
            c1447790nmL.hide();
        }
    }

    public static void LJII(boolean z) {
        C1447790nmL c1447790nmL;
        C1447790nmL c1447790nmL2;
        final int iLIZIZ;
        if (C1433730nPf.LJIIL() > 0 && (c1447790nmL = LJ) != null && c1447790nmL.getVisibility() == 8 && (c1447790nmL2 = LJ) != null && c1447790nmL2.getParent() != null) {
            C1447790nmL c1447790nmL3 = LJ;
            if (c1447790nmL3 != null) {
                int visibility = c1447790nmL3.getVisibility();
                c1447790nmL3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1447790nmL3);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1447790nmL3);
                c1447790nmL3.setAlpha(1.0f);
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    C0SHX.LIZ(topActivity, null).LJIIJJI("upload_progress_fragment", true, null);
                }
            }
            C430110Gtl.LIZ(LJ, AFwS210S0000000_22.get$arr$(164));
            if (z && !LJIIL) {
                final C1447770nmJ c1447770nmJ = LIZIZ;
                if (c1447770nmJ != null) {
                    AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(165);
                    final int i = c1447770nmJ.LJIILLIIL + c1447770nmJ.LJII;
                    final boolean z2 = C1439650nZD.LIZIZ;
                    if (!z2) {
                        iLIZIZ = i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
                    } else {
                        iLIZIZ = ((int) (((double) i) * 0.25d)) + i;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    c1447770nmJ.LJIIZILJ = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0neq
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C1447770nmJ c1447770nmJ2;
                            WindowManager windowManager;
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            C1447770nmJ c1447770nmJ3 = c1447770nmJ;
                            c1447770nmJ3.LJIIIZ.y = (int) (iLIZIZ + ((i - r2) * fFloatValue));
                            if (z2) {
                                C1447790nmL c1447790nmL4 = c1447770nmJ3.LIZIZ;
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1447790nmL4);
                                c1447790nmL4.setAlpha(fFloatValue);
                            }
                            if (c1447770nmJ.LIZIZ.getParent() != null && (windowManager = (c1447770nmJ2 = c1447770nmJ).LJIIJ) != null) {
                                windowManager.updateViewLayout(c1447770nmJ2.LIZIZ, c1447770nmJ2.LJIIIZ);
                            }
                        }
                    });
                    valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfFloat.addListener(new AAListenerS333S0100000_22(aFwS210S0000000_22, 2));
                    valueAnimatorOfFloat.start();
                }
            } else {
                C1447790nmL c1447790nmL4 = LJ;
                if (c1447790nmL4 != null) {
                    c1447790nmL4.LJIIIIZZ();
                }
            }
            LJIIIIZZ = false;
        }
    }

    public static void LJIIIIZZ(C19EG c19eg, Function0 function0, boolean z, boolean z2, boolean z3) {
        String strLJIILIIL;
        List<PublishModel> listLJII = C1433730nPf.LJII();
        ArrayList<String> arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
        for (PublishModel publishModel : (ArrayList) listLJII) {
            if (publishModel == null) {
                strLJIILIIL = "";
            } else {
                strLJIILIIL = C1433730nPf.LJIILIIL(publishModel);
            }
            arrayList.add(strLJIILIIL);
        }
        List<PublishModel> listLJIIJJI = C1433730nPf.LJIIJJI();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = ((ArrayList) listLJIIJJI).iterator();
        while (it2.hasNext()) {
            arrayList2.add(C1433730nPf.LJIILIIL((PublishModel) it2.next()));
        }
        for (String str : arrayList) {
            CopyOnWriteArrayList<InterfaceC1447760nmI> copyOnWriteArrayList = LJII.get(c19eg);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC1447760nmI> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZ(Boolean.valueOf(z), str);
                }
            }
        }
        if (z2) {
            if (((Boolean) function0.invoke()).booleanValue() && !LJIIJ) {
                LIZLLL(false);
            } else {
                LJII(z3);
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                it4.next();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    it5.next();
                    CopyOnWriteArrayList<InterfaceC1447760nmI> copyOnWriteArrayList2 = LJII.get(c19eg);
                    if (copyOnWriteArrayList2 != null) {
                        Iterator<InterfaceC1447760nmI> it6 = copyOnWriteArrayList2.iterator();
                        while (it6.hasNext()) {
                            it6.next().LIZJ();
                        }
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    it7.next();
                    CopyOnWriteArrayList<InterfaceC1447760nmI> copyOnWriteArrayList3 = LJII.get(c19eg);
                    if (copyOnWriteArrayList3 != null) {
                        Iterator<InterfaceC1447760nmI> it8 = copyOnWriteArrayList3.iterator();
                        while (it8.hasNext()) {
                            it8.next().LIZIZ();
                        }
                    }
                }
            }
        }
    }

    public static void LIZ(PublishProgressDialogAddHelper publishProgressDialogAddHelper, C19EG c19eg, boolean z, int i, int i2, boolean z2, Function0 function0, boolean z3, boolean z4, boolean z5, boolean z6, int i3) {
        boolean z7 = z6;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z2;
        int i4 = i2;
        int i5 = i;
        Function0 function02 = function0;
        boolean z12 = z;
        if ((i3 & 2) != 0) {
            z12 = false;
        }
        if ((i3 & 4) != 0) {
            i5 = -1;
        }
        if ((i3 & 8) != 0) {
            i4 = -1;
        }
        if ((i3 & 16) != 0) {
            z11 = false;
        }
        if ((i3 & 32) != 0) {
            function02 = AFwS210S0000000_22.get$arr$(169);
        }
        if ((i3 & 64) != 0) {
            z10 = true;
        }
        if ((i3 & 128) != 0) {
            z9 = false;
        }
        if ((i3 & 256) != 0) {
            z8 = false;
        }
        if ((i3 & 512) != 0) {
            z7 = false;
        }
        publishProgressDialogAddHelper.getClass();
        C01TT.LIZLLL(new C1447750nmH(i5, i4, c19eg, function02, z9, z11, z8, z12, z10, z7));
    }
}

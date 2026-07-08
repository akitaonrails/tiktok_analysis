package com.ss.android.ugc.aweme.im.messagelist.ui.viewmodel;

import X.C0Z53;
import X.C1239300iM4;
import X.C13BV;
import X.C1701940uOG;
import X.C1761306v5;
import X.C1762006vC;
import X.C1807670x8n;
import X.C1807770x8x;
import X.C2188811AlT;
import X.C356901a3;
import X.C905070Zez;
import X.C905080Zf0;
import X.EnumC1762106vD;
import Y.AfS183S0100000_14;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SocialIMSDKMessageListOperatorVM$initLifecycleOwner$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ SocialIMSDKMessageListOperatorVM LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MModelTrace VM.onCreate vm=");
            sbLIZ.append(System.identityHashCode(this.LL));
            sbLIZ.append(" messageModel=");
            sbLIZ.append(System.identityHashCode(this.LL.LLILLL));
            sbLIZ.append(" isFirstSubscribe=");
            sbLIZ.append(this.LL.LLJI);
            sbLIZ.append(" isEverRefreshed=");
            sbLIZ.append(this.LL.LLILLL.LJI());
            sbLIZ.append(" cid=");
            sbLIZ.append(this.LL.LLJ);
            iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
        }
        SocialIMSDKMessageListOperatorVM socialIMSDKMessageListOperatorVM = this.LL;
        if (socialIMSDKMessageListOperatorVM.LLJI) {
            socialIMSDKMessageListOperatorVM.LLILZLL.LIZ(C1239300iM4.LJ(socialIMSDKMessageListOperatorVM.LLJILJIL.LJJJLZIJ(socialIMSDKMessageListOperatorVM.LLIZLLLIL).LJJIJIIJIL(new AfS183S0100000_14(socialIMSDKMessageListOperatorVM, 10)).LJJJLZIJ(C1701940uOG.LIZIZ()), new AwS593S0100000_14(socialIMSDKMessageListOperatorVM, 245), C1239300iM4.LIZJ, AFwS248S0000000_14.get$arr$(428)));
            IMALogApi iMALogApiLIZ2 = C0Z53.LIZ();
            if (iMALogApiLIZ2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MModelTrace VM.observe messageModel=");
                sbLIZ2.append(System.identityHashCode(socialIMSDKMessageListOperatorVM.LLILLL));
                sbLIZ2.append(" isEverRefreshed=");
                sbLIZ2.append(socialIMSDKMessageListOperatorVM.LLILLL.LJI());
                sbLIZ2.append(" cid=");
                sbLIZ2.append(socialIMSDKMessageListOperatorVM.LLJ);
                iMALogApiLIZ2.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (socialIMSDKMessageListOperatorVM.LLJJIJIIJIL == null) {
                synchronized (socialIMSDKMessageListOperatorVM) {
                    if (socialIMSDKMessageListOperatorVM.LLJJIJIIJIL == null) {
                        socialIMSDKMessageListOperatorVM.LLJJIJIIJIL = (C1807770x8x) C1807670x8n.LLLLLLJ();
                    }
                }
            }
            socialIMSDKMessageListOperatorVM.LLILZLL.LIZ(C1239300iM4.LJ(new C1761306v5(socialIMSDKMessageListOperatorVM.LLILLL), new AwS593S0100000_14(socialIMSDKMessageListOperatorVM, 246), C1239300iM4.LIZJ, new C905080Zf0(socialIMSDKMessageListOperatorVM.LLJILJIL)));
            SocialIMSDKMessageListOperatorVM socialIMSDKMessageListOperatorVM2 = this.LL;
            socialIMSDKMessageListOperatorVM2.LLILZLL.LIZ(C1239300iM4.LJ(socialIMSDKMessageListOperatorVM2.LLJILJILJ.LJJJLZIJ(socialIMSDKMessageListOperatorVM2.LLIZLLLIL), new AwS593S0100000_14(socialIMSDKMessageListOperatorVM2, 243), C1239300iM4.LIZJ, new AwS593S0100000_14(socialIMSDKMessageListOperatorVM2, 244)));
            socialIMSDKMessageListOperatorVM2.LLILZLL.LIZ(C1239300iM4.LJ(socialIMSDKMessageListOperatorVM2.LLILZ.LIZ(socialIMSDKMessageListOperatorVM2.LLJ), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C905070Zez(socialIMSDKMessageListOperatorVM2.LLJILJILJ)));
            this.LL.LLJI = false;
            return;
        }
        socialIMSDKMessageListOperatorVM.LLJIJIL = true;
        socialIMSDKMessageListOperatorVM.LLJILJIL.onNext(new C1762006vC(C13BV.INSTANCE, EnumC1762106vD.SUCCESS));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLILLJJLI.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.LL.LLILLL.stop();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.LL.AQ2();
        this.LL.LLILLL.resume();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.LL.LLILZIL.LJ();
    }

    public SocialIMSDKMessageListOperatorVM$initLifecycleOwner$1(SocialIMSDKMessageListOperatorVM socialIMSDKMessageListOperatorVM, LifecycleOwner lifecycleOwner) {
        this.LL = socialIMSDKMessageListOperatorVM;
        this.LLILLJJLI = lifecycleOwner;
    }
}

package com.ss.android.videoshop.api.stub;

import X.C19353610ne;
import X.C1APC;
import X.C2178631AOf;
import X.C2178641AOg;
import X.C2178691AOl;
import X.C2188811AlT;
import X.C807710VmL;
import X.EnumC807700VmK;
import X.InterfaceC2178671AOj;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.videoshop.context.VideoContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class AutoPauseResumeLifeCycleHandler extends C807710VmL implements C1APC, WeakHandler.IHandler {
    public C2178691AOl autoPauseResumeCoordinator;
    public int autoPauseStatus;
    public Lifecycle lifecycle;
    public WeakHandler mWeakHandler;
    public VideoContext videoContext;

    public boolean enableClearScreenOffFlagOnResume() {
        return false;
    }

    public long getClearScreenOffFlagInterval() {
        return 500L;
    }

    @Override // X.C807710VmL
    public void onLifeCycleOnCreate(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
    }

    @Override // X.C1APC
    public boolean onTryAutoPause() {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2;
        InterfaceC2178671AOj interfaceC2178671AOj;
        List<C2178631AOf> list;
        InterfaceC2178671AOj interfaceC2178671AOj2;
        VideoContext videoContext = this.videoContext;
        if (videoContext == null) {
            return false;
        }
        if (this.lifecycle == null || videoContext.LJJJJJL() == this.lifecycle) {
            this.autoPauseStatus = 0;
            C2178641AOg c2178641AOg3 = this.videoContext.LLILLL;
            if ((c2178641AOg3 == null || (interfaceC2178671AOj2 = c2178641AOg3.LLJI) == null || !interfaceC2178671AOj2.LJJIIJZLJL()) && !this.videoContext.isPaused() && ((((c2178641AOg = this.videoContext.LLILLL) != null && (((interfaceC2178671AOj = c2178641AOg.LLJI) != null && interfaceC2178671AOj.LJJIJIIJI()) || c2178641AOg.LLJJJJJIL)) || ((c2178641AOg2 = this.videoContext.LLILLL) != null && c2178641AOg2.LJJJLZIJ())) && !this.videoContext.LJJJLZIJ())) {
                this.videoContext.pause();
                this.autoPauseStatus = 1;
            }
            if (this.videoContext.LJJJZ()) {
                C2178641AOg c2178641AOg4 = this.videoContext.LLILLL;
                if (c2178641AOg4 != null && (list = c2178641AOg4.LLLF) != null) {
                    for (C2178631AOf c2178631AOf : (ArrayList) list) {
                        if (c2178631AOf.LJJJLZIJ()) {
                            c2178631AOf.LJJLIIIJILLIZJL();
                        }
                    }
                }
                if (this.autoPauseStatus == 1) {
                    this.autoPauseStatus = 3;
                } else {
                    this.autoPauseStatus = 2;
                }
            }
            if (this.autoPauseStatus > 0) {
                return true;
            }
        }
        return false;
    }

    public void onViewPaused() {
        this.autoPauseResumeCoordinator.LIZIZ();
    }

    public AutoPauseResumeLifeCycleHandler(VideoContext videoContext) {
        this.mWeakHandler = new WeakHandler(this);
        this.autoPauseStatus = 0;
        C2178691AOl c2178691AOl = new C2178691AOl(videoContext);
        this.autoPauseResumeCoordinator = c2178691AOl;
        c2178691AOl.LJFF = this;
        this.videoContext = videoContext;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1001) {
            onScreenUserPresent(this.videoContext);
        }
    }

    @Override // X.C807710VmL
    public boolean onBackPressedWhenFullScreen(VideoContext videoContext) {
        if (this.lifecycle != null && videoContext.LJJJJJL() != this.lifecycle) {
            return false;
        }
        if (videoContext.LJJJJLI() != null && (!TextUtils.isEmpty(null))) {
            return true;
        }
        videoContext.LL.LJ(false, true);
        return true;
    }

    @Override // X.C807710VmL, X.InterfaceC807720VmM
    public void onScreenOff(VideoContext videoContext) {
        C2178691AOl c2178691AOl = this.autoPauseResumeCoordinator;
        c2178691AOl.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScreenOff ");
        sbLIZ.append(Integer.toHexString(c2178691AOl.hashCode()));
        C2188811AlT.LIZIZ(sbLIZ);
        c2178691AOl.LIZJ(4);
    }

    @Override // X.C807710VmL, X.InterfaceC807720VmM
    public void onScreenUserPresent(VideoContext videoContext) {
        C2178691AOl c2178691AOl = this.autoPauseResumeCoordinator;
        c2178691AOl.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScreenOn ");
        sbLIZ.append(Integer.toHexString(c2178691AOl.hashCode()));
        C2188811AlT.LIZIZ(sbLIZ);
        c2178691AOl.LIZ(4);
    }

    @Override // X.C1APC
    public boolean onTryAutoResume(boolean z) {
        List<C2178631AOf> videoPatchLayouts;
        VideoContext videoContext = this.videoContext;
        if (videoContext == null) {
            return false;
        }
        if (this.lifecycle == null || videoContext.LJJJJJL() == this.lifecycle) {
            int i = this.autoPauseStatus;
            if (i != 1 && i != 3) {
                if (i == 2) {
                    C2178641AOg c2178641AOg = this.videoContext.LLILLL;
                    if (c2178641AOg != null && (videoPatchLayouts = c2178641AOg.getVideoPatchLayouts()) != null) {
                        Iterator<C2178631AOf> it2 = videoPatchLayouts.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C2178631AOf next = it2.next();
                            InterfaceC2178671AOj interfaceC2178671AOj = next.LLJI;
                            if (interfaceC2178671AOj != null && interfaceC2178671AOj.isPaused()) {
                                next.LJJLIIIJJI();
                                break;
                            }
                        }
                    }
                    return true;
                }
            } else if (!z && this.videoContext.isPaused()) {
                C2178641AOg c2178641AOg2 = this.videoContext.LLILLL;
                if (c2178641AOg2 != null) {
                    c2178641AOg2.LJJLIIIJJI();
                }
                return true;
            }
        }
        return false;
    }

    public void setAutoResumeTimeOut(long j) {
        C2178691AOl c2178691AOl = this.autoPauseResumeCoordinator;
        if (c2178691AOl != null) {
            c2178691AOl.LIZ = j;
        }
    }

    public void setEnableAudioFocus(boolean z) {
        C2178691AOl c2178691AOl = this.autoPauseResumeCoordinator;
        c2178691AOl.LJIIIIZZ = z;
        if (z) {
            c2178691AOl.LIZLLL |= 1;
            return;
        }
        int i = c2178691AOl.LIZLLL;
        if ((i & 1) == 0) {
            return;
        }
        c2178691AOl.LIZLLL = i & (-2);
    }

    public void setEnableAutoAudioFocusLoss(boolean z) {
        this.autoPauseResumeCoordinator.LJII = z;
    }

    public AutoPauseResumeLifeCycleHandler(VideoContext videoContext, Lifecycle lifecycle) {
        this(videoContext);
        this.lifecycle = lifecycle;
    }

    @Override // X.C807710VmL
    public void onAudioFocusGain(VideoContext videoContext, boolean z) {
        C2178691AOl c2178691AOl = this.autoPauseResumeCoordinator;
        if (c2178691AOl.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAudioFocusGain ");
            sbLIZ.append(z);
            sbLIZ.append(" ");
            sbLIZ.append(Integer.toHexString(c2178691AOl.hashCode()));
            C2188811AlT.LIZIZ(sbLIZ);
            c2178691AOl.LIZ(1);
        }
    }

    @Override // X.C807710VmL
    public void onAudioFocusLoss(VideoContext videoContext, boolean z) {
        C2178691AOl c2178691AOl = this.autoPauseResumeCoordinator;
        if (c2178691AOl.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAudioFocusLoss ");
            sbLIZ.append(z);
            sbLIZ.append(" ");
            sbLIZ.append(Integer.toHexString(c2178691AOl.hashCode()));
            sbLIZ.append(" enableAutoAudioFocusLoss:");
            sbLIZ.append(c2178691AOl.LJII);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c2178691AOl.LJII) {
                c2178691AOl.LIZJ(1);
            } else {
                if (z) {
                    return;
                }
                c2178691AOl.LIZJ(1);
            }
        }
    }

    @Override // X.C807710VmL
    public void onLifeCycleOnDestroy(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        List<C2178631AOf> list;
        if (this.lifecycle == null || videoContext.LJJJJJL() == lifecycleOwner.getLifecycle()) {
            C2178641AOg c2178641AOg = videoContext.LLILLL;
            if (c2178641AOg != null) {
                c2178641AOg.LJJLIIIJL();
            }
            C2178641AOg c2178641AOg2 = videoContext.LLILLL;
            if (c2178641AOg2 != null && (list = c2178641AOg2.LLLF) != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((C2178631AOf) it2.next()).LJJLIIIJL();
                }
            }
        }
        C2178691AOl c2178691AOl = this.autoPauseResumeCoordinator;
        if (c2178691AOl.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop ");
            sbLIZ.append(Integer.toHexString(c2178691AOl.hashCode()));
            C2188811AlT.LIZIZ(sbLIZ);
            c2178691AOl.LJ = false;
            c2178691AOl.LIZJ = false;
        }
    }

    @Override // X.C807710VmL
    public void onLifeCycleOnPause(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnPause:");
        sbLIZ.append(lifecycleOwner.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        this.autoPauseResumeCoordinator.LIZIZ();
        this.mWeakHandler.removeMessages(1001);
    }

    @Override // X.C807710VmL
    public void onLifeCycleOnResume(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        C19353610ne c19353610ne;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnResume:");
        sbLIZ.append(lifecycleOwner.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        C2178691AOl c2178691AOl = this.autoPauseResumeCoordinator;
        if (!c2178691AOl.LJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start ");
            sbLIZ2.append(Integer.toHexString(c2178691AOl.hashCode()));
            C2188811AlT.LIZIZ(sbLIZ2);
            c2178691AOl.LIZJ = false;
            if (c2178691AOl.LJIIIIZZ) {
                c2178691AOl.LIZLLL = 1;
            } else {
                c2178691AOl.LIZLLL = 0;
            }
            c2178691AOl.LJ = true;
        }
        C19353610ne videoAudioFocusController = EnumC807700VmK.KEEPER.getVideoAudioFocusController();
        if (videoAudioFocusController != null) {
            C2178691AOl c2178691AOl2 = this.autoPauseResumeCoordinator;
            if (videoAudioFocusController.LLILZLL) {
                c2178691AOl2.LIZLLL &= -2;
            } else {
                c2178691AOl2.LIZLLL |= 1;
            }
        }
        C2178691AOl c2178691AOl3 = this.autoPauseResumeCoordinator;
        c2178691AOl3.getClass();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onViewResumed ");
        sbLIZ3.append(Integer.toHexString(c2178691AOl3.hashCode()));
        C2188811AlT.LIZIZ(sbLIZ3);
        c2178691AOl3.LIZ(2);
        if (c2178691AOl3.LJIIIIZZ && c2178691AOl3.LIZJ) {
            int i = c2178691AOl3.LIZLLL;
            if ((i & 1) != 0 && (i & 4) == 0 && (c19353610ne = c2178691AOl3.LJI.LLJIJIL) != null) {
                c19353610ne.LIZIZ(c19353610ne.LLILZIL);
            }
        }
        if ((this.autoPauseResumeCoordinator.LIZLLL & 4) != 0 && enableClearScreenOffFlagOnResume()) {
            this.mWeakHandler.sendEmptyMessageDelayed(1001, getClearScreenOffFlagInterval());
        }
    }

    @Override // X.C807710VmL
    public void onLifeCycleOnStart(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnStart:");
        sbLIZ.append(lifecycleOwner.toString());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C807710VmL
    public void onLifeCycleOnStop(LifecycleOwner lifecycleOwner, VideoContext videoContext) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLifeCycleOnStop:");
        sbLIZ.append(lifecycleOwner.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        this.autoPauseResumeCoordinator.LIZIZ();
    }

    public AutoPauseResumeLifeCycleHandler(VideoContext videoContext, Lifecycle lifecycle, boolean z) {
        this(videoContext, lifecycle);
        this.autoPauseResumeCoordinator.LJII = z;
    }
}

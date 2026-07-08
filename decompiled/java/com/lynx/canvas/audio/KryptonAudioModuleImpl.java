package com.lynx.canvas.audio;

import X.C1288370jdD;
import X.C2188811AlT;
import X.InterfaceC1303910k2H;
import a17.l;
import com.lynx.canvas.Krypton;
import com.lynx.canvas.KryptonApp;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class KryptonAudioModuleImpl extends l {
    public static boolean mLoadAudioEffectSuccess;
    public static boolean mLoadModuleSuccess;
    public WeakReference<InterfaceC1303910k2H> mWeakStatusListener;

    public static native boolean nativeLoadAudioEffectModuleFromPlugin(String str);

    public static native boolean nativeStartAudioEngine(long j);

    @Override // a17.l
    public String engineType() {
        return "audio";
    }

    private InterfaceC1303910k2H getStatusListener() {
        WeakReference<InterfaceC1303910k2H> weakReference = this.mWeakStatusListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a17.l
    public boolean loadAudioModule() {
        if (mLoadModuleSuccess) {
            C1288370jdD.LIZJ("KryptonAudio", "Audio module has already been loaded");
            return true;
        }
        Krypton.LIZIZ().getClass();
        mLoadModuleSuccess = Krypton.LIZJ("kryptonaudio", true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Load audio module result ");
        sbLIZ.append(mLoadModuleSuccess);
        C1288370jdD.LIZJ("KryptonAudio", C2188811AlT.LIZIZ(sbLIZ));
        return mLoadModuleSuccess;
    }

    @Override // a17.l
    public boolean loadAudioEffectModule(String str) {
        if (mLoadAudioEffectSuccess) {
            C1288370jdD.LIZJ("KryptonAudio", "Audio audio-effect module has already been loaded");
            return true;
        }
        if (str != null && str.length() != 0) {
            if (!nativeLoadAudioEffectModuleFromPlugin(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Load audio audio-effect module from plugin path ");
                sbLIZ.append(str);
                sbLIZ.append("failed");
                C1288370jdD.LIZJ("KryptonAudio", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        } else {
            Krypton.LIZIZ().getClass();
            if (!Krypton.LIZJ("kryptonaudioaudioeffect", true)) {
                C1288370jdD.LIZLLL("KryptonAudio", "Load audio audio-effect module failed. You can try to call load() after related plugin being loaded.");
                return false;
            }
        }
        mLoadAudioEffectSuccess = true;
        C1288370jdD.LIZJ("KryptonAudio", "Load audio audio-effect from plugin success");
        return true;
    }

    @Override // a17.l
    public void setStatusListener(InterfaceC1303910k2H interfaceC1303910k2H) {
        if (interfaceC1303910k2H == null) {
            this.mWeakStatusListener = null;
        } else {
            this.mWeakStatusListener = new WeakReference<>(interfaceC1303910k2H);
        }
    }

    @Override // a17.l
    public boolean startAudioEngine(KryptonApp kryptonApp) {
        if (kryptonApp == null) {
            C1288370jdD.LIZIZ("KryptonAudio", "kryptonApp null");
            return false;
        }
        if (!loadAudioModule()) {
            C1288370jdD.LIZIZ("KryptonAudio", "Audio module has not been loaded");
            return false;
        }
        if (!nativeStartAudioEngine(kryptonApp.LJIIIIZZ)) {
            C1288370jdD.LIZIZ("KryptonAudio", "Start audio engine failed");
            return false;
        }
        C1288370jdD.LIZJ("KryptonAudio", "Start audio engine success");
        return true;
    }

    public static void onAudioStatusChange(KryptonApp kryptonApp, int i) {
        InterfaceC1303910k2H statusListener;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudioStatusChange ");
        sbLIZ.append(i);
        C1288370jdD.LIZJ("KryptonAudio", C2188811AlT.LIZIZ(sbLIZ));
        l lVar = (l) kryptonApp.LIZLLL(l.class);
        if (lVar == null || !(lVar instanceof KryptonAudioModuleImpl) || (statusListener = ((KryptonAudioModuleImpl) lVar).getStatusListener()) == null) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Unknown audio status ");
                        sbLIZ2.append(i);
                        C1288370jdD.LIZLLL("KryptonAudio", C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    statusListener.LIZ();
                    return;
                }
                statusListener.LIZ();
                return;
            }
            statusListener.LIZ();
            return;
        }
        statusListener.LIZ();
    }
}

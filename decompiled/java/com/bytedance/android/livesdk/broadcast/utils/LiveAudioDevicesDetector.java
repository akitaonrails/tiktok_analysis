package com.bytedance.android.livesdk.broadcast.utils;

import X.C783270Uo1;
import X.InterfaceC466590IRl;
import X.InterfaceC779560Ui2;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAudioDevicesDetector implements InterfaceC466590IRl {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIZ;
    public static AudioManager LJIIJ;
    public static ARunnableS112S0100000_12 LJIIJJI;
    public static AudioDeviceCallback audioDeviceCallback;
    public static final LiveAudioDevicesDetector LIZ = new LiveAudioDevicesDetector();
    public static final CopyOnWriteArrayList<InterfaceC779560Ui2> LJIIIIZZ = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<Integer, Integer> LJIIL = new ConcurrentHashMap<>(2);

    public final void LIZ() {
        LIZIZ = false;
        Iterator<InterfaceC779560Ui2> it2 = LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(false);
        }
        LIZJ = false;
        Iterator<InterfaceC779560Ui2> it3 = LJIIIIZZ.iterator();
        while (it3.hasNext()) {
            it3.next().LJIIIZ();
        }
        LIZLLL = false;
        LJ = false;
        LJFF = false;
        LJI = false;
        LJII = false;
        LJIIIIZZ.clear();
        LJIIL.clear();
        LJIIIZ = false;
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = LJIIJJI;
        if (aRunnableS112S0100000_12 != null) {
            C783270Uo1.LIZJ().removeCallbacks(aRunnableS112S0100000_12);
        }
        LJIIJJI = null;
        AudioManager audioManager = LJIIJ;
        if (audioManager != null) {
            audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        LJIIJ = null;
        audioDeviceCallback = null;
    }

    public final void LIZIZ(Context context, boolean z) {
        LJ = z;
        if (context == null || LJIIIZ) {
            return;
        }
        LJIIIZ = true;
        audioDeviceCallback = new AudioDeviceCallback() { // from class: X.0Ui1
            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                int iIntValue;
                if (audioDeviceInfoArr != null) {
                    for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                        ConcurrentHashMap<Integer, Integer> concurrentHashMap = LiveAudioDevicesDetector.LJIIL;
                        Integer numValueOf = Integer.valueOf(audioDeviceInfo.getType());
                        Integer num = concurrentHashMap.get(Integer.valueOf(audioDeviceInfo.getType()));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        concurrentHashMap.put(numValueOf, Integer.valueOf(iIntValue + 1));
                    }
                }
                LiveAudioDevicesDetector.LIZ.getClass();
                C486790J7d.LIZJ(RunnableC779540Ui0.LL);
            }

            @Override // android.media.AudioDeviceCallback
            public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                int iIntValue;
                if (audioDeviceInfoArr != null) {
                    for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                        ConcurrentHashMap<Integer, Integer> concurrentHashMap = LiveAudioDevicesDetector.LJIIL;
                        if (concurrentHashMap.get(Integer.valueOf(audioDeviceInfo.getType())) != null && r0.intValue() - 1 > 0) {
                            concurrentHashMap.put(Integer.valueOf(audioDeviceInfo.getType()), Integer.valueOf(iIntValue));
                        } else {
                            concurrentHashMap.remove(Integer.valueOf(audioDeviceInfo.getType()));
                        }
                    }
                }
                LiveAudioDevicesDetector.LIZ.getClass();
                C486790J7d.LIZJ(RunnableC779540Ui0.LL);
            }
        };
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(context, 102);
        LJIIJJI = aRunnableS112S0100000_12;
        C783270Uo1.LJ(aRunnableS112S0100000_12);
    }
}

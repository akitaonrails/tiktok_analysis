package com.ss.android.ttve.nativePort;

import X.C2122808Ti;
import X.C2188811AlT;
import X.EnumC2122508Tf;
import X.InterfaceC2109808Oi;
import X.InterfaceC2122908Tj;
import android.content.Context;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.runtime.VESafelyLibsLoader;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TENativeLibsLoader {
    public static Context sContext;
    public static boolean sIsSegmentalLoad;
    public static volatile EnumC2122508Tf sLibraryLoadStatus = EnumC2122508Tf.NOT_LOAD;
    public static final String TAG = "TENativeLibsLoader";
    public static InterfaceC2109808Oi mLibraryLoader = null;
    public static InterfaceC2122908Tj mLibraryHooker = null;
    public static InterfaceC2109808Oi sDefaultLibraryLoader = new InterfaceC2109808Oi() { // from class: X.08OZ
        @Override // X.InterfaceC2109808Oi
        public final boolean onLoadNativeLibs(List<String> list) {
            C971740bOW.LIZ(4, "Load library start...");
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : list) {
                System.currentTimeMillis();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Start loadLibrary ");
                sbLIZ.append(str);
                C971740bOW.LIZ(3, C2188811AlT.LIZIZ(sbLIZ));
                if (!VESafelyLibsLoader.loadLibrary(str, TENativeLibsLoader.sContext)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadLibrary ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" failed");
                    C971740bOW.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Load ");
                sbLIZ3.append(str);
                sbLIZ3.append(" cost ");
                sbLIZ3.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                sbLIZ3.append("ms");
                C971740bOW.LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
                jCurrentTimeMillis = jCurrentTimeMillis2;
            }
            return true;
        }
    };
    public static InterfaceC2122908Tj sDefaultLibraryHooker = new InterfaceC2122908Tj() { // from class: X.08Th
        @Override // X.InterfaceC2122908Tj
        public final void LIZ(String[] strArr) {
        }
    };
    public static ArrayList<C2122808Ti> sLibraryReferenceList = new ArrayList<>();
    public static List<String> sEffectLibs = EffectSDKBuildConfig.getEffectLibs();
    public static boolean isLibraryLoadedOpt = false;
    public static boolean sLoadOptLibrary = false;

    public static List<String> getAllLibsList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("iesapplogger");
        arrayList.add("bytevc0");
        arrayList.add("ByteVC1_dec");
        arrayList.add("bvcparser");
        arrayList.add("fdk-aac");
        arrayList.add("sscronet");
        arrayList.addAll(FFmpegLibLoaderWrapper.LIZIZ());
        arrayList.add("yuv");
        arrayList.add("bytenn");
        arrayList.add("audioeffect");
        arrayList.add("ttheif_dec");
        for (String str : sEffectLibs) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        arrayList.add("fastcv");
        arrayList.add("lens");
        arrayList.add("ttvesdk");
        arrayList.add("bytebench");
        return arrayList;
    }

    public static int getLibraryLoadedVersion() {
        if (sLibraryLoadStatus != EnumC2122508Tf.LOADED) {
            return -1;
        }
        return isLibraryLoadedOpt ? 1 : 0;
    }

    public static void loadAllLibs() {
        if (sLibraryLoadStatus == EnumC2122508Tf.LOADED) {
            return;
        }
        List<String> allLibsList = getAllLibsList();
        String[] strArr = new String[allLibsList.size()];
        for (int i = 0; i < allLibsList.size(); i++) {
            if (!((String) ListProtector.get(allLibsList, i)).contentEquals("c++_shared") && !((String) ListProtector.get(allLibsList, i)).contentEquals("ttboringssl") && !((String) ListProtector.get(allLibsList, i)).contentEquals("ttcrypto")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lib");
                sbLIZ.append((String) ListProtector.get(allLibsList, i));
                sbLIZ.append(".so");
                strArr[i] = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        sLibraryLoadStatus = EnumC2122508Tf.LOADING;
        InterfaceC2109808Oi interfaceC2109808Oi = mLibraryLoader;
        if (interfaceC2109808Oi != null) {
            if (!interfaceC2109808Oi.onLoadNativeLibs(allLibsList)) {
                sLibraryLoadStatus = EnumC2122508Tf.NOT_LOAD;
                return;
            }
        } else if (!sDefaultLibraryLoader.onLoadNativeLibs(allLibsList)) {
            sLibraryLoadStatus = EnumC2122508Tf.NOT_LOAD;
            return;
        }
        sLibraryLoadStatus = EnumC2122508Tf.LOADED;
        InterfaceC2122908Tj interfaceC2122908Tj = mLibraryHooker;
        if (interfaceC2122908Tj != null) {
            interfaceC2122908Tj.LIZ(strArr);
        }
    }

    public static synchronized void loadBase() {
        loadLibrary();
    }

    public static synchronized void loadByteBench() {
        if (sIsSegmentalLoad) {
            segmentalLoad("bytebench");
        } else {
            loadAllLibs();
        }
    }

    public static synchronized void loadEditor() {
        loadLibrary();
    }

    public static synchronized void loadEffectSDK() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bytenn");
        for (String str : sEffectLibs) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        sDefaultLibraryLoader.onLoadNativeLibs(arrayList);
    }

    public static synchronized void loadImage() {
        loadLibrary();
    }

    public static synchronized void loadLibrary() {
        if (sIsSegmentalLoad) {
            segmentalLoad("ttvesdk");
        } else {
            loadAllLibs();
        }
    }

    public static synchronized void loadOldEditor() {
        loadLibrary();
    }

    public static synchronized void loadRecorder() {
        loadLibrary();
    }

    public static void initLibReferenceList() {
        List<String> allLibsList = getAllLibsList();
        Collections.reverse(allLibsList);
        Iterator<String> it2 = allLibsList.iterator();
        while (it2.hasNext()) {
            sLibraryReferenceList.add(new C2122808Ti(it2.next()));
        }
    }

    public static EnumC2122508Tf getLibraryLoadStatus() {
        return sLibraryLoadStatus;
    }

    public static boolean isSegmentalLoadEnable() {
        return sIsSegmentalLoad;
    }

    public static void enableLoadOptLibrary(boolean z) {
        sLoadOptLibrary = z;
    }

    public static void enableSegmentalLoading(boolean z) {
        sIsSegmentalLoad = z;
    }

    public static void segmentalLoad(String str) {
        if (sLibraryReferenceList.size() <= 0) {
            initLibReferenceList();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<C2122808Ti> it2 = sLibraryReferenceList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C2122808Ti next = it2.next();
            if (str == next.LIZ) {
                if (next.LIZIZ) {
                    return;
                }
                next.LIZIZ = true;
                linkedList.add(next.LIZ);
            }
        }
        while (it2.hasNext()) {
            C2122808Ti next2 = it2.next();
            if (next2.LIZIZ) {
                break;
            }
            next2.LIZIZ = true;
            linkedList.add(next2.LIZ);
        }
        Collections.reverse(linkedList);
        String[] strArr = new String[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lib");
            sbLIZ.append((String) linkedList.get(i));
            sbLIZ.append(".so");
            strArr[i] = C2188811AlT.LIZIZ(sbLIZ);
        }
        sLibraryLoadStatus = EnumC2122508Tf.LOADING;
        InterfaceC2109808Oi interfaceC2109808Oi = mLibraryLoader;
        if (interfaceC2109808Oi != null) {
            if (!interfaceC2109808Oi.onLoadNativeLibs(linkedList)) {
                sLibraryLoadStatus = EnumC2122508Tf.NOT_LOAD;
                return;
            }
        } else if (!sDefaultLibraryLoader.onLoadNativeLibs(linkedList)) {
            sLibraryLoadStatus = EnumC2122508Tf.NOT_LOAD;
            return;
        }
        sLibraryLoadStatus = EnumC2122508Tf.LOADED;
        InterfaceC2122908Tj interfaceC2122908Tj = mLibraryHooker;
        if (interfaceC2122908Tj != null) {
            interfaceC2122908Tj.LIZ(strArr);
        }
    }

    public static synchronized void setContext(Context context) {
        sContext = context;
    }

    public static void setLibraryHooker(InterfaceC2122908Tj interfaceC2122908Tj) {
        mLibraryHooker = interfaceC2122908Tj;
    }

    public static void setLibraryLoad(InterfaceC2109808Oi interfaceC2109808Oi) {
        mLibraryLoader = interfaceC2109808Oi;
    }
}

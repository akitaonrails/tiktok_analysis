package com.ss.android.ugc.aweme;

import X.AbstractC1387200mCc;
import X.AbstractC2199801B7q;
import X.C04RY;
import X.C04V8;
import X.C051M;
import X.C054G;
import X.C098200Yq;
import X.C0HVB;
import X.C0PEM;
import X.C0VSJ;
import X.C0YC6;
import X.C0Z53;
import X.C0ZX0;
import X.C0ZX4;
import X.C0ZX6;
import X.C123100dR;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13BV;
import X.C13DB;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C1906580ziK;
import X.C19741112Lp;
import X.C1BNE;
import X.C2188811AlT;
import X.C2212208lc;
import X.C2230008oU;
import X.C2252321DDq;
import X.C2296808zG;
import X.C259800zU;
import X.C458620Hye;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C901170ZWx;
import X.C901180ZWy;
import X.C985403tE;
import X.InterfaceC2329409Au;
import X.InterfaceC462440IBm;
import Y.AComparatorS22S0000000_3;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.im.core.proto.MediaURLStruct;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMDownloadAPI;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class IMVoiceMessageUtil {
    public static final IMVoiceMessageUtil LIZ = new IMVoiceMessageUtil();
    public static final C2252321DDq LIZIZ;
    public static final C2252321DDq LIZJ;
    public static String LIZLLL;
    public static final C054G LJ;
    public static volatile long LJFF;
    public static volatile long LJI;
    public static final AtomicBoolean LJII;
    public static final ConcurrentHashMap<String, Integer> LJIIIIZZ;
    public static final LifecycleEventObserver LJIIIZ;

    static {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        LIZIZ = c2252321DDqLIZ;
        LIZJ = c2252321DDqLIZ;
        LIZLLL = UUID.randomUUID().toString();
        LJ = C2296808zG.LIZ(C0PEM.LIZJ);
        LJFF = -1L;
        LJII = new AtomicBoolean(false);
        LJIIIIZZ = new ConcurrentHashMap<>();
        LJIIIZ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.IMVoiceMessageUtil$voiceMessageSessionlifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                int i = C2212208lc.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        IMVoiceMessageUtil.LIZ.getClass();
                        IMVoiceMessageUtil.LIZLLL = UUID.randomUUID().toString();
                        return;
                    }
                    return;
                }
                IMVoiceMessageUtil.LIZ.getClass();
                IMVoiceMessageUtil.LIZLLL = UUID.randomUUID().toString();
            }
        };
    }

    public static void LIZLLL() {
        C13LE.LIZ(IMVoiceMessageUtil.class);
    }

    public static String LIZ(C869590Y9l c869590Y9l) {
        String str;
        boolean z;
        k kVarLJJIIZ;
        String strLJIL;
        C0YC6 c0yc6;
        MediaURLStruct mediaURLStruct;
        C0YC6 next;
        String audioId;
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        String str2 = null;
        if (attachments != null) {
            Iterator<C0YC6> it2 = attachments.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C123100dR.LIZ(next.getAudioId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0YC6 c0yc62 = next;
            if (c0yc62 != null && (audioId = c0yc62.getAudioId()) != null) {
                return audioId;
            }
        }
        List<C0YC6> attachments2 = c869590Y9l.getAttachments();
        boolean z2 = false;
        if (attachments2 != null && (c0yc6 = (C0YC6) C13LP.LJJJLZIJ(0, attachments2)) != null && (mediaURLStruct = c0yc6.mediaUrlStruct) != null) {
            str = mediaURLStruct.video_model;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                n nVar = (n) C051M.LIZ.LJII(str, n.class);
                if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("video_id")) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                    if (strLJIL.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        str2 = strLJIL;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (str2 == null) {
            return c869590Y9l.getUuid();
        }
        return str2;
    }

    public static String LIZIZ(C869590Y9l c869590Y9l) {
        C0YC6 c0yc6;
        String str;
        MediaURLStruct mediaURLStruct;
        C0YC6 next;
        List<C0YC6> attachments = c869590Y9l.getAttachments();
        if (attachments != null) {
            Iterator<C0YC6> it2 = attachments.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.index < 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c0yc6 = next;
        } else {
            c0yc6 = null;
        }
        String strLIZ = LIZ(c869590Y9l);
        if (c0yc6 == null || (mediaURLStruct = c0yc6.mediaUrlStruct) == null || (str = mediaURLStruct.codec) == null || Intrinsics.LJFF(str, "aac")) {
            str = "m4a";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append('.');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static long LIZJ(C0VSJ c0vsj) {
        Object c098200Yq;
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.isFile()) {
                arrayList.add(file);
            }
        }
        Iterator it2 = arrayList.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            try {
                c098200Yq = Long.valueOf(((File) it2.next()).length());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = 0L;
            }
            jLongValue += ((Number) c098200Yq).longValue();
        }
        return jLongValue;
    }

    public static String LJFF(long j) {
        String strValueOf;
        long j2 = 60;
        long j3 = j / j2;
        long j4 = j % j2;
        String strValueOf2 = String.valueOf(j3);
        if (j4 < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('0');
            sbLIZ.append(j4);
            strValueOf = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strValueOf = String.valueOf(j4);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strValueOf2);
        sbLIZ2.append(':');
        sbLIZ2.append(strValueOf);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static C0VSJ LJI(Context context) {
        C0VSJ c0vsj = new C0VSJ(LJII(context), "download");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj;
    }

    public static C0VSJ LJII(Context context) {
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(context), "voicemessage");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj;
    }

    public static boolean LJIIIZ(C869590Y9l c869590Y9l) {
        if (C123100dR.LIZ(c869590Y9l.getExt().get("a:mask_type")) && !Intrinsics.LJFF(c869590Y9l.getLocalExt().get("a:voice_message_unmask"), "1")) {
            return true;
        }
        return false;
    }

    public final void LJIIL(String str) {
        synchronized (this) {
            try {
                C2252321DDq c2252321DDq = LIZIZ;
                Iterable iterable = (Iterable) c2252321DDq.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!Intrinsics.LJFF((String) obj, str)) {
                        arrayList.add(obj);
                    }
                }
                c2252321DDq.setValue(arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILJJIL(Context context) {
        long j;
        long jLIZJ;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        C0VSJ c0vsjLJI = LJI(context);
        File[] fileArrListFiles = c0vsjLJI.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    arrayList.add(file);
                }
            }
            synchronized (this) {
                try {
                    j = 0;
                    if (LJFF >= 0) {
                        jLIZJ = LJFF;
                    } else {
                        LIZ.getClass();
                        jLIZJ = LIZJ(c0vsjLJI);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            long jIntValue = ((long) ((Number) C04V8.LIZ.getValue()).intValue()) * 1024 * 1024;
            long jIntValue2 = ((long) ((Number) C04RY.LIZ.getValue()).intValue()) * 1024 * 1024;
            if (jLIZJ <= jIntValue) {
                return;
            }
            C13DB c13db = new C13DB();
            c13db.addAll((Collection) LIZIZ.getValue());
            C0ZX0 c0zx0 = (C0ZX0) C458620Hye.LIZ.LJII().LIZLLL().getValue();
            if (c0zx0 instanceof C0ZX4) {
                c13db.add(((C0ZX4) c0zx0).LIZ);
            } else if (c0zx0 instanceof C0ZX6) {
                c13db.add(((C0ZX6) c0zx0).LIZ);
            } else if (c0zx0 instanceof C901180ZWy) {
                c13db.add(((C901180ZWy) c0zx0).LIZ);
            }
            Set setBuild = c13db.build();
            ArrayList<File> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!setBuild.contains(((File) obj).getAbsolutePath())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (File file2 : arrayList2) {
                try {
                    c098200Yq3 = Long.valueOf(file2.lastModified());
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq3 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
                    c098200Yq3 = 0L;
                }
                arrayList3.add(new Pair(file2, c098200Yq3));
            }
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(5), arrayList3);
            ArrayList<File> arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
            Iterator it2 = listLJLLLL.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Pair) it2.next()).getFirst());
            }
            for (File file3 : arrayList4) {
                if (jLIZJ <= jIntValue2) {
                    break;
                }
                try {
                    c098200Yq = Long.valueOf(file3.length());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = 0L;
                }
                long jLongValue = ((Number) c098200Yq).longValue();
                try {
                    c098200Yq2 = Boolean.valueOf(file3.delete());
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq2 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                    c098200Yq2 = Boolean.FALSE;
                }
                if (((Boolean) c098200Yq2).booleanValue()) {
                    jLIZJ -= jLongValue;
                }
            }
            synchronized (this) {
                if (jLIZJ >= 0) {
                    j = jLIZJ;
                }
                try {
                    LJFF = j;
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    throw th5;
                }
            }
        }
    }

    public static void LJIIIIZZ(Context context, Function0 function0) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            Activity activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            if (activityLIZ != null) {
                C19741112Lp.LIZ.getClass();
                if (C19741112Lp.LIZLLL(activityLIZ, "android.permission.RECORD_AUDIO")) {
                    function0.invoke();
                    return;
                }
            }
            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZIZ);
            c1397580mTM.LJI(context.getString(2131832301));
            c1397580mTM.LIZIZ(context.getString(2131832298));
            C985403tE.LIZ(c1397580mTM, new AwS372S0200000_6(context, activityLIZIZ, 7));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static void LJIIJ(String str, String str2) {
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            iMALogApiLIZ.LIZ(4, str, str2);
        }
    }

    public static boolean LJIIJJI(C869590Y9l c869590Y9l, String str) {
        long j;
        String path;
        ArrayList arrayList;
        List listLJJLIIIJILLIZJL;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long ttl = c869590Y9l.getTtl();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isResourceExpired: msgId=");
        sbLIZ.append(c869590Y9l.getMsgId());
        sbLIZ.append(", ttl=");
        sbLIZ.append(ttl);
        sbLIZ.append(", currentTime=");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", url=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZLLL();
        if (ttl > 0 && jCurrentTimeMillis >= ttl) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Message resource expired by ttl: msgId=");
            sbLIZ2.append(c869590Y9l.getMsgId());
            sbLIZ2.append(", ttl=");
            sbLIZ2.append(ttl);
            sbLIZ2.append(", current=");
            sbLIZ2.append(jCurrentTimeMillis);
            sbLIZ2.append(", diff=");
            sbLIZ2.append(jCurrentTimeMillis - ttl);
            sbLIZ2.append('s');
            C2188811AlT.LIZIZ(sbLIZ2);
            LIZLLL();
            return true;
        }
        if (str != null && str.length() != 0) {
            try {
                path = new URI(str).getPath();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Failed to parse expiration time from url: ");
                sbLIZ3.append(str);
                sbLIZ3.append(", error: ");
                sbLIZ3.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ3);
                LIZLLL();
            }
            if (path != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(path, new String[]{"/"}, 0, 6)) != null) {
                arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJILLIZJL) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                String str2 = (String) C13LP.LJJJLZIJ(1, arrayList);
                if (str2 != null) {
                    j = CastLongProtector.parseLong(str2, 16);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("parseExpirationTimeFromUrl: hex=");
                    sbLIZ4.append(str2);
                    sbLIZ4.append(", timestamp=");
                    sbLIZ4.append(j);
                    sbLIZ4.append(", url=");
                    sbLIZ4.append(str);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    LIZLLL();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("URL expiration check: msgId=");
                    sbLIZ5.append(c869590Y9l.getMsgId());
                    sbLIZ5.append(", urlExpiration=");
                    sbLIZ5.append(j);
                    sbLIZ5.append(", current=");
                    sbLIZ5.append(jCurrentTimeMillis);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    LIZLLL();
                    if (j > 0 && jCurrentTimeMillis >= j) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("URL expired: msgId=");
                        sbLIZ6.append(c869590Y9l.getMsgId());
                        sbLIZ6.append(", urlExpiration=");
                        sbLIZ6.append(j);
                        sbLIZ6.append(", current=");
                        sbLIZ6.append(jCurrentTimeMillis);
                        sbLIZ6.append(", diff=");
                        sbLIZ6.append(jCurrentTimeMillis - j);
                        sbLIZ6.append('s');
                        C2188811AlT.LIZIZ(sbLIZ6);
                        LIZLLL();
                        return true;
                    }
                }
            } else {
                arrayList = null;
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("parseExpirationTimeFromUrl: path segment not found, url=");
            sbLIZ7.append(str);
            sbLIZ7.append(", segments=");
            sbLIZ7.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ7);
            LIZLLL();
            j = -1;
            StringBuilder sbLIZ52 = C2188811AlT.LIZ();
            sbLIZ52.append("URL expiration check: msgId=");
            sbLIZ52.append(c869590Y9l.getMsgId());
            sbLIZ52.append(", urlExpiration=");
            sbLIZ52.append(j);
            sbLIZ52.append(", current=");
            sbLIZ52.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ52);
            LIZLLL();
            if (j > 0) {
                StringBuilder sbLIZ62 = C2188811AlT.LIZ();
                sbLIZ62.append("URL expired: msgId=");
                sbLIZ62.append(c869590Y9l.getMsgId());
                sbLIZ62.append(", urlExpiration=");
                sbLIZ62.append(j);
                sbLIZ62.append(", current=");
                sbLIZ62.append(jCurrentTimeMillis);
                sbLIZ62.append(", diff=");
                sbLIZ62.append(jCurrentTimeMillis - j);
                sbLIZ62.append('s');
                C2188811AlT.LIZIZ(sbLIZ62);
                LIZLLL();
                return true;
            }
        }
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("Resource not expired: msgId=");
        sbLIZ8.append(c869590Y9l.getMsgId());
        C2188811AlT.LIZIZ(sbLIZ8);
        LIZLLL();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.08oU] */
    public final void LJ(String str, final Context context, String str2, final String str3, final C2230008oU c2230008oU, final Function0<Unit> function0, final Function2<? super String, ? super C2230008oU, Unit> function2) {
        synchronized (this) {
            try {
                if (((List) LIZIZ.getValue()).contains(str3)) {
                    return;
                }
                final String str4 = LIZLLL;
                C0VSJ c0vsjLJI = LJI(context);
                final C0VSJ c0vsj = new C0VSJ(c0vsjLJI, str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start download from ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                LIZLLL();
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = C2230008oU.LIZ(c2230008oU, 0, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, null, null, null, null, 524159);
                IMDownloadAPI.LIZ.getClass();
                IMDownloadAPI value = C901170ZWx.LIZIZ.getValue();
                if (value == null) {
                    return;
                }
                AbstractC2199801B7q abstractC2199801B7qLIZ = value.LIZ(str2);
                abstractC2199801B7qLIZ.LIZJ = str;
                abstractC2199801B7qLIZ.LJ = c0vsjLJI.getAbsolutePath();
                abstractC2199801B7qLIZ.LJII = 3;
                abstractC2199801B7qLIZ.LJIIJJI = new IDownloadListener() { // from class: X.08oW
                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onPause(DownloadInfo downloadInfo) {
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onCanceled(DownloadInfo downloadInfo) {
                        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
                        iMVoiceMessageUtil.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                        iMVoiceMessageUtil.LJIIL(str3);
                        IMVoiceMessageUtil.LJIIIIZZ.remove(str3);
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFirstStart(DownloadInfo downloadInfo) {
                        IMVoiceMessageUtil.LIZ.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFirstSuccess(DownloadInfo downloadInfo) {
                        IMVoiceMessageUtil.LIZ.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onPrepare(DownloadInfo downloadInfo) {
                        IMVoiceMessageUtil.LIZ.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onProgress(DownloadInfo downloadInfo) {
                        if (downloadInfo == null) {
                            return;
                        }
                        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onProgress ");
                        sbLIZ2.append(downloadInfo.getCurBytes() / downloadInfo.getTotalBytes());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        iMVoiceMessageUtil.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onStart(DownloadInfo downloadInfo) {
                        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
                        iMVoiceMessageUtil.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                        String str5 = str3;
                        synchronized (iMVoiceMessageUtil) {
                            try {
                                C2252321DDq c2252321DDq = IMVoiceMessageUtil.LIZIZ;
                                c2252321DDq.setValue(C13LP.LJLILLLLZI(str5, (Collection) c2252321DDq.getValue()));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.08oU] */
                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onSuccessed(DownloadInfo downloadInfo) {
                        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onSuccessed. exist=");
                        sbLIZ2.append(c0vsj.exists());
                        sbLIZ2.append(", ");
                        sbLIZ2.append(downloadInfo);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        iMVoiceMessageUtil.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                        iMVoiceMessageUtil.LJIIL(str3);
                        IMVoiceMessageUtil.LJIIIIZZ.remove(str3);
                        C259800zU<C2230008oU> c259800zU2 = c259800zU;
                        c259800zU2.element = C2230008oU.LIZ(c259800zU2.element, 0, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, null, null, null, 524031);
                        if (Intrinsics.LJFF(IMVoiceMessageUtil.LIZLLL, str4)) {
                            function2.invoke(c0vsj.getAbsolutePath(), c259800zU.element);
                            IMVoiceMessageUtil.LIZLLL();
                        }
                        if (Intrinsics.LJFF(c259800zU.element.LJIIZILJ, "preload")) {
                            c259800zU.element.LIZIZ();
                        }
                        C23250099c.LIZLLL(IMVoiceMessageUtil.LJ, null, null, new C2212308ld(context, c0vsj, null), 3);
                    }

                    /* JADX WARN: Type inference failed for: r0v12, types: [T, X.08oU] */
                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                        Integer numValueOf;
                        Integer numValueOf2;
                        IMVoiceMessageUtil iMVoiceMessageUtil = IMVoiceMessageUtil.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("download onFailed, audioId=");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(", httpCode=");
                        Integer numValueOf3 = null;
                        if (downloadInfo != null) {
                            numValueOf = Integer.valueOf(downloadInfo.getHttpStatusCode());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ2.append(numValueOf);
                        sbLIZ2.append(", err=");
                        if (baseException != null) {
                            numValueOf2 = Integer.valueOf(baseException.getErrorCode());
                        } else {
                            numValueOf2 = null;
                        }
                        sbLIZ2.append(numValueOf2);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        iMVoiceMessageUtil.getClass();
                        IMVoiceMessageUtil.LJIIJ("IMVoiceMessageUtil", strLIZIZ);
                        iMVoiceMessageUtil.LJIIL(str3);
                        IMVoiceMessageUtil.LJIIIIZZ.remove(str3);
                        function0.invoke();
                        C259800zU<C2230008oU> c259800zU2 = c259800zU;
                        C2230008oU c2230008oU2 = c2230008oU;
                        if (downloadInfo != null) {
                            numValueOf3 = Integer.valueOf(downloadInfo.getHttpStatusCode());
                        }
                        c259800zU2.element = C2230008oU.LIZ(c2230008oU2, 1, numValueOf3, null, null, null, null, null, null, null, null, null, null, 524239);
                        c259800zU.element.LIZIZ();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                        IMVoiceMessageUtil.LIZ.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
                    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                        IMVoiceMessageUtil.LIZ.getClass();
                        IMVoiceMessageUtil.LIZLLL();
                    }
                };
                abstractC2199801B7qLIZ.LJJ = value.LIZIZ();
                abstractC2199801B7qLIZ.LJIIJ = "voice_message";
                int iLJ = abstractC2199801B7qLIZ.LJ(new InterfaceC2329409Au() { // from class: X.08qB
                    @Override // X.InterfaceC2329409Au
                    public final void onStart(int i) {
                    }
                });
                if (iLJ > 0) {
                    LJIIIIZZ.put(str3, Integer.valueOf(iLJ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIILIIL(IMVoiceMessageUtil iMVoiceMessageUtil, String str, long j, float f, List list, String str2, InterfaceC462440IBm interfaceC462440IBm, C0HVB c0hvb, ReferenceInfo referenceInfo, AttachmentComponent attachmentComponent, Function1 function1, String str3, Map map, BaseHeaderComponent baseHeaderComponent, ByteString byteString, int i) {
        BaseHeaderComponent baseHeaderComponent2 = baseHeaderComponent;
        Map map2 = map;
        String str4 = str3;
        Function1 function12 = function1;
        AttachmentComponent attachmentComponent2 = attachmentComponent;
        ReferenceInfo referenceInfo2 = referenceInfo;
        ByteString byteString2 = null;
        if ((i & 128) != 0) {
            referenceInfo2 = null;
        }
        if ((i & 256) != 0) {
            attachmentComponent2 = null;
        }
        if ((i & 512) != 0) {
            function12 = null;
        }
        if ((i & 1024) != 0) {
            str4 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            baseHeaderComponent2 = null;
        }
        if ((i & 8192) == 0) {
            byteString2 = byteString;
        }
        iMVoiceMessageUtil.getClass();
        IIMVoiceMessageSender iIMVoiceMessageSender = (IIMVoiceMessageSender) PluggableExtentionKt.pluggableSpiForReal(IIMVoiceMessageSender.class);
        if (iIMVoiceMessageSender != null) {
            iIMVoiceMessageSender.LIZ(f, j, referenceInfo2, interfaceC462440IBm, c0hvb, attachmentComponent2, baseHeaderComponent2, str, str2, str4, list, map2, function12, byteString2);
        }
    }
}

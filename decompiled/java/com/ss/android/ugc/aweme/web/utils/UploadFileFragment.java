package com.ss.android.ugc.aweme.web.utils;

import X.C08RN;
import X.C09NT;
import X.C0VSJ;
import X.C0VSP;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1022620cia;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C1701330uNH;
import X.C2106108Mx;
import X.C2114508Qd;
import X.C2137908Zd;
import X.C2188811AlT;
import X.C2400409as;
import X.C2429209fW;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C844470XAv;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadFileFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjIpHELIOSK2EmPCwgOmEGOCkjKCsVISkpDz0yLygpJzs=";
    public ValueCallback<Uri[]> LL;
    public String LLILLJJLI;
    public boolean LLILLL;

    public final Intent NR() throws Throwable {
        Uri uriFromFile;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        C844470XAv.LIZ.getClass();
        File fileY2 = C786410Ut5.y2(C844470XAv.LIZ(), Environment.DIRECTORY_DCIM);
        if (fileY2 == null) {
            Context contextLIZ = C844470XAv.LIZ();
            File file = C786450Ut9.LIZJ;
            if (file == null || !C786450Ut9.LJ) {
                try {
                    C786450Ut9.LIZJ = contextLIZ.getFilesDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Context applicationContext = null;
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mInitialApplication");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(objInvoke);
                        if (obj instanceof Application) {
                            applicationContext = ((Application) obj).getApplicationContext();
                            PrintStream printStream = System.out;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Application context obtained through ActivityThread: ");
                            sbLIZ.append(applicationContext);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            System.out.println("Error: mInitialApplication is not an instance of Application");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream2 = System.out;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Error: ");
                        sbLIZ2.append(e.getMessage());
                        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (applicationContext == null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(th.getMessage());
                        sbLIZ3.append(":");
                        sbLIZ3.append(C08RN.LIZJ());
                        sbLIZ3.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                }
                file = C786450Ut9.LIZJ;
            }
            fileY2 = new C0VSJ(file, Environment.DIRECTORY_DCIM);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(fileY2.getAbsolutePath());
        String str = File.separator;
        sbLIZ4.append(str);
        sbLIZ4.append("browser-photos");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4));
        c0vsj.mkdirs();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(c0vsj.getAbsolutePath());
        sbLIZ5.append(str);
        sbLIZ5.append(System.currentTimeMillis());
        sbLIZ5.append(".jpg");
        this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ5);
        Context context = getContext();
        C0VSJ c0vsj2 = new C0VSJ(this.LLILLJJLI);
        if (context == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            uriFromFile = Uri.fromFile(c0vsj2);
        } else {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(context.getPackageName());
            sbLIZ6.append(".fileprovider");
            uriFromFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, C2188811AlT.LIZIZ(sbLIZ6), c0vsj2);
        }
        intent.putExtra("output", uriFromFile);
        return intent;
    }

    public final Intent PR() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent intentOR = OR(NR(), new Intent("android.media.action.VIDEO_CAPTURE"), new Intent("android.provider.MediaStore.RECORD_SOUND"));
        intentOR.putExtra("android.intent.extra.INTENT", intent);
        C2429209fW.LIZ().appendDataFlowId(intentOR, 1207965185);
        return intentOR;
    }

    public final Intent OR(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    public final void SR(String str) {
        List listLL;
        String str2;
        String str3;
        List listLL2;
        if (str == null) {
            str = "";
        }
        try {
            List<String> listSplit = new Regex(";").split(str, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listLL = C13BV.INSTANCE;
            } else {
                listLL = C13BV.INSTANCE;
            }
            String[] strArr = (String[]) listLL.toArray(new String[0]);
            if (strArr.length == 0) {
                str2 = "";
            } else {
                str2 = strArr[0];
            }
            if (!TextUtils.isEmpty("")) {
                str3 = "";
            } else {
                str3 = "filesystem";
            }
            if (Intrinsics.LJFF("", "filesystem")) {
                for (String str4 : strArr) {
                    List<String> listSplit2 = new Regex("=").split(str4, 0);
                    if (!listSplit2.isEmpty()) {
                        ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                        while (listIterator2.hasPrevious()) {
                            if (listIterator2.previous().length() != 0) {
                                listLL2 = C13LP.LL(listSplit2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                        listLL2 = C13BV.INSTANCE;
                    } else {
                        listLL2 = C13BV.INSTANCE;
                    }
                    String[] strArr2 = (String[]) listLL2.toArray(new String[0]);
                    if (strArr2.length == 2 && Intrinsics.LJFF("capture", strArr2[0])) {
                        str3 = strArr2[1];
                    }
                }
            }
            this.LLILLJJLI = null;
            int iHashCode = str2.hashCode();
            if (iHashCode != -661257167) {
                if (iHashCode != 452781974) {
                    if (iHashCode == 1911932022 && str2.equals("image/*")) {
                        if (Intrinsics.LJFF(str3, "camera")) {
                            Intent intentNR = NR();
                            C2429209fW.LIZ().appendDataFlowId(intentNR, 1207965441);
                            MR(this, intentNR);
                            return;
                        }
                        Intent intentOR = OR(NR());
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("image/*");
                        intentOR.putExtra("android.intent.extra.INTENT", intent);
                        C2429209fW.LIZ().appendDataFlowId(intentOR, 1207965185);
                        MR(this, intentOR);
                        return;
                    }
                } else if (str2.equals("video/*")) {
                    if (Intrinsics.LJFF(str3, "camcorder")) {
                        Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                        C2429209fW.LIZ().appendDataFlowId(intent2, 1207965442);
                        MR(this, intent2);
                        return;
                    }
                    Intent intentOR2 = OR(new Intent("android.media.action.VIDEO_CAPTURE"));
                    Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                    intent3.addCategory("android.intent.category.OPENABLE");
                    intent3.setType("video/*");
                    intentOR2.putExtra("android.intent.extra.INTENT", intent3);
                    C2429209fW.LIZ().appendDataFlowId(intentOR2, 1207965185);
                    MR(this, intentOR2);
                    return;
                }
            } else if (str2.equals("audio/*")) {
                if (Intrinsics.LJFF(str3, "microphone")) {
                    Intent intent4 = new Intent("android.provider.MediaStore.RECORD_SOUND");
                    C2429209fW.LIZ().appendDataFlowId(intent4, 1207964417);
                    MR(this, intent4);
                    return;
                }
                Intent intentOR3 = OR(new Intent("android.provider.MediaStore.RECORD_SOUND"));
                Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                intent5.addCategory("android.intent.category.OPENABLE");
                intent5.setType("audio/*");
                intentOR3.putExtra("android.intent.extra.INTENT", intent5);
                C2429209fW.LIZ().appendDataFlowId(intentOR3, 1207965185);
                MR(this, intentOR3);
                return;
            }
            MR(this, PR());
        } catch (ActivityNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                this.LLILLL = true;
                Intent intentPR = PR();
                C2429209fW.LIZ().appendDataFlowId(intentPR, 1207965185);
                MR(this, intentPR);
            } catch (ActivityNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public static void MR(UploadFileFragment uploadFileFragment, Intent intent) throws Throwable {
        Intent intent2;
        Fragment fragment;
        C1701330uNH.LIZ(intent, uploadFileFragment);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHbyDun0qdyZtbeN3xkdXaFFAJfEWQYl3k=", null);
        C0WST c0wst = new C0WST();
        int iIntValue = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        Object[] objArr = {intent, Integer.valueOf(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE)};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/ss/android/ugc/aweme/web/utils/UploadFileFragment", "startActivityForResult", uploadFileFragment, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11087, "com/ss/android/ugc/aweme/web/utils/UploadFileFragment", "startActivityForResult", null, objArr, uploadFileFragment, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            } else {
                fragment = uploadFileFragment;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            fragment = uploadFileFragment;
        }
        fragment.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11087, "com/ss/android/ugc/aweme/web/utils/UploadFileFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
    }

    public static boolean RR(String[] strArr, int[] iArr, String str) {
        if (C13LQ.LJJIJIIJI(str, strArr) >= 0 && iArr[C13LQ.LJJIJIIJI(str, strArr)] == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri uriFromFile;
        String strLIZIZ;
        String path;
        Uri uriLJ;
        Uri[] uriArr;
        String path2;
        String absolutePath;
        if (i == 2048 && this.LL != null) {
            if (i2 == 0 && this.LLILLL) {
                this.LLILLL = false;
                return;
            }
            if (intent != null && i2 == -1) {
                uriFromFile = intent.getData();
            } else {
                uriFromFile = null;
            }
            if (uriFromFile != null) {
                if (i2 == -1 && u.LJIJI("file", uriFromFile.getScheme(), true) && (path2 = uriFromFile.getPath()) != null && path2.length() != 0 && (absolutePath = new C0VSJ(path2).getAbsolutePath()) != null && absolutePath.length() != 0) {
                    C844470XAv.LIZ.getClass();
                    if (C2114508Qd.LJI(C844470XAv.LIZ(), absolutePath)) {
                        C1022620cia.LIZIZ("UploadFileFragment_TAG", "file in app sandbox");
                        return;
                    }
                }
            } else if (intent == null && i2 == -1) {
                C0VSJ c0vsj = new C0VSJ(this.LLILLJJLI);
                if (c0vsj.exists()) {
                    uriFromFile = Uri.fromFile(c0vsj);
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    String str = this.LLILLJJLI;
                    String name = c0vsj.getName();
                    C0VSJ c0vsj2 = new C0VSJ(name);
                    if (a0.LJJIIZI(name, Environment.DIRECTORY_DCIM, false)) {
                        strLIZIZ = name.substring(a0.LJJJ(name, Environment.DIRECTORY_DCIM, 0, false, 6));
                    } else if (!c0vsj2.isAbsolute()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(Environment.DIRECTORY_DCIM);
                        sbLIZ.append(File.separator);
                        sbLIZ.append(name);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(Environment.DIRECTORY_DCIM);
                        String str2 = File.separator;
                        sbLIZ2.append(str2);
                        sbLIZ2.append("Camera");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(c0vsj2.getName());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    C0VSJ c0vsj3 = new C0VSJ(strLIZIZ);
                    String name2 = c0vsj3.getName();
                    File parentFile = c0vsj3.getParentFile();
                    if (parentFile == null || (path = parentFile.getPath()) == null) {
                        path = "";
                    }
                    try {
                        if (u.LJJIIJZLJL("image", "image", false)) {
                            uriLJ = C2400409as.LIZJ(contextLIZ, name2, "image", path);
                        } else if (u.LJJIIJZLJL("image", "video", false)) {
                            uriLJ = C2400409as.LJ(contextLIZ, name2, "image", path);
                        }
                        if (uriLJ != null) {
                            try {
                                OutputStream outputStreamLJFF = C09NT.LJFF(contextLIZ.getContentResolver(), uriLJ);
                                if (outputStreamLJFF != null) {
                                    try {
                                        C0VSP c0vsp = new C0VSP(new C0VSJ(str));
                                        C2137908Zd.LIZJ.LIZIZ.getClass();
                                        C2106108Mx.LIZIZ(c0vsp, outputStreamLJFF);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            }
            ValueCallback<Uri[]> valueCallback = this.LL;
            if (valueCallback != null) {
                if (uriFromFile == null) {
                    uriArr = null;
                } else {
                    uriArr = new Uri[]{uriFromFile};
                }
                valueCallback.onReceiveValue(uriArr);
                this.LL = null;
            }
            this.LLILLL = false;
        }
    }
}

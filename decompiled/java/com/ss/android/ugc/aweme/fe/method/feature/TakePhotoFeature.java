package com.ss.android.ugc.aweme.fe.method.feature;

import X.AbstractC848400XPy;
import X.AsyncTaskC2430509fj;
import X.C0VSJ;
import X.C0WP3;
import X.C0WQX;
import X.C0WZX;
import X.C0XI4;
import X.C0XIR;
import X.C0XQ7;
import X.C1233040iBy;
import X.C19771812Xk;
import X.C20275914Vh;
import X.C20277714Vz;
import X.C2123408To;
import X.C2123508Tp;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2259691DcV;
import X.C2429209fW;
import X.C823050WQl;
import X.C838410Wul;
import X.InterfaceC19772112Xn;
import X.InterfaceC20276114Vj;
import X.InterfaceC20277514Vx;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.fe.method.feature.TakePhotoFeature;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.o;

/* JADX INFO: loaded from: classes31.dex */
public class TakePhotoFeature implements WeakHandler.IHandler, InterfaceC20277514Vx {
    public WeakReference<Activity> mActivityRef;
    public String mEncryptUrl;
    public String mNameSpace;
    public InterfaceC20276114Vj mOnFileSelected;
    public Executor mTakePhotoSingleThreadPool;
    public AsyncTaskC2430509fj mTakePhotoTask;
    public Executor mUploadPhotoSingleThreadPool;
    public C20277714Vz mUploadingDialog;
    public String mImageSource = "";
    public String mImageFilePath = "";

    @Override // X.InterfaceC20277514Vx
    public void cancelUpload() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.09fj, android.os.AsyncTask] */
    private void executeTakePhotoTask(final Activity activity) {
        AsyncTaskC2430509fj asyncTaskC2430509fj = this.mTakePhotoTask;
        if (asyncTaskC2430509fj != null) {
            asyncTaskC2430509fj.cancel(false);
        }
        ?? r2 = new PthreadAsyncTask<Void, Void, File>(activity, this) { // from class: X.09fj
            public final WeakReference<Activity> LIZ;
            public final WeakReference<TakePhotoFeature> LIZIZ;

            @Override // android.os.AsyncTask
            public final void onCancelled() {
                TakePhotoFeature takePhotoFeature = this.LIZIZ.get();
                if (takePhotoFeature == null) {
                    return;
                }
                takePhotoFeature.mOnFileSelected.LIZ(0, "uploadCancel");
            }

            public static File LIZ(Context context) throws Throwable {
                String str = new SimpleDateFormat("yyyy-MMdd_HHmmss").format(new Date());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Dou_fsm_");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                File file = C786450Ut9.LIZJ;
                if (file == null || !C786450Ut9.LJ) {
                    try {
                        C786450Ut9.LIZJ = context.getFilesDir();
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
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Application context obtained through ActivityThread: ");
                                sbLIZ2.append(applicationContext);
                                printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                            } else {
                                System.out.println("Error: mInitialApplication is not an instance of Application");
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            PrintStream printStream2 = System.out;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Error: ");
                            sbLIZ3.append(e.getMessage());
                            printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        if (applicationContext != null) {
                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                            C08RN.LIZ(applicationContext);
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(th.getMessage());
                            sbLIZ4.append(":");
                            sbLIZ4.append(C08RN.LIZJ());
                            sbLIZ4.append(" applicationContext is null");
                            throw new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                    file = C786450Ut9.LIZJ;
                }
                return File.createTempFile(strLIZIZ, ".jpg", file);
            }

            @Override // android.os.AsyncTask
            public final Object doInBackground(Object[] objArr) {
                Activity activity2 = this.LIZ.get();
                if (activity2 != null) {
                    try {
                        return LIZ(activity2);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
                return null;
            }

            @Override // android.os.AsyncTask
            public final void onPostExecute(Object obj) throws Throwable {
                File file = (File) obj;
                TakePhotoFeature takePhotoFeature = this.LIZIZ.get();
                Activity activity2 = this.LIZ.get();
                if (takePhotoFeature != null && activity2 != null) {
                    if (file == null) {
                        takePhotoFeature.mOnFileSelected.LIZ(0, "uploadFailed");
                        return;
                    }
                    takePhotoFeature.setFilePath(file.getAbsolutePath());
                    Uri uriLIZIZ = C2431009fo.LIZIZ(activity2, file);
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", uriLIZIZ);
                    intent.addFlags(3);
                    C2429209fW.LIZ().appendDataFlowId(intent, 1207965441);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                    C1701330uNH.LIZ(intent, activity2);
                    C2204961BRm.LJIIZILJ(1, activity2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkRdWPwuTTtDIsNhep3PNSCe7j0XbCyAdl0=", null));
                }
            }

            {
                this.LIZ = new WeakReference<>(activity);
                this.LIZIZ = new WeakReference<>(this);
            }
        };
        this.mTakePhotoTask = r2;
        C0WP3.LIZLLL(r2, this.mTakePhotoSingleThreadPool, new Void[0]);
    }

    public static boolean hasCameraFeature(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    private void requestPermissionAndTakePhoto(final Activity activity) {
        C19771812Xk.LIZIZ(activity, TokenCert.with("bpea-take_photo_camera_permission"), new String[]{"android.permission.CAMERA"}, new InterfaceC19772112Xn() { // from class: X.14Vg
            @Override // X.InterfaceC19772112Xn
            public final void LIZ(int[] iArr, String[] strArr) {
                this.lambda$requestPermissionAndTakePhoto$0(activity, strArr, iArr);
            }
        });
    }

    private void tryToTakePhoto(Activity activity) {
        if (C838410Wul.LIZ(activity, "android.permission.CAMERA") == 0) {
            executeTakePhotoTask(activity);
        } else {
            requestPermissionAndTakePhoto(activity);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        List<String> list;
        Activity activity = this.mActivityRef.get();
        if (activity == null) {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof C0XIR) {
            C1233040iBy c1233040iBy = new C1233040iBy(activity);
            c1233040iBy.LIZJ(((C0XIR) HandlerHook.getMessageObj(message.obj)).getErrorMsg());
            c1233040iBy.LIZLLL();
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) HandlerHook.getMessageObj(message.obj);
            if (avatarUri != null && (list = avatarUri.urlList) != null && !list.isEmpty()) {
                String str = (String) ListProtector.get(avatarUri.urlList, 0);
                Executor executor = this.mUploadPhotoSingleThreadPool;
                final C20275914Vh c20275914Vh = new C20275914Vh(str, avatarUri.uri, this.mImageFilePath);
                final InterfaceC20276114Vj interfaceC20276114Vj = this.mOnFileSelected;
                executor.execute(new Runnable(c20275914Vh, interfaceC20276114Vj) { // from class: X.14Vb
                    public final WeakReference<C20275914Vh> LL;
                    public final WeakReference<InterfaceC20276114Vj> LLILLJJLI;

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TakePhotoFeature$GenerateResponseTask@dd83.run");
                        try {
                            C20275914Vh c20275914Vh2 = this.LL.get();
                            InterfaceC20276114Vj interfaceC20276114Vj2 = this.LLILLJJLI.get();
                            if (c20275914Vh2 != null && interfaceC20276114Vj2 != null) {
                                try {
                                    interfaceC20276114Vj2.LIZJ(LIZ(c20275914Vh2));
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    interfaceC20276114Vj2.LIZ(0, "uploadFailed");
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TakePhotoFeature$GenerateResponseTask@dd83.run");
                    }

                    public static JSONArray LIZ(C20275914Vh c20275914Vh2) throws JSONException {
                        String str2 = c20275914Vh2.LIZJ;
                        final o oVar = new o();
                        try {
                            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().processService().compressPhoto(str2, 216, 384, new IAVProcessService.IProcessCallback() { // from class: X.14Vk
                                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
                                public final void finish(Object obj) {
                                    oVar.LJ(obj);
                                }
                            });
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C15O7<TResult> c15o7 = oVar.LIZ;
                        try {
                            c15o7.LJIJJLI();
                        } catch (InterruptedException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        String strLIZ = (String) c15o7.LJIIL();
                        if (strLIZ != null) {
                            try {
                                C2137908Zd.LIZJ.getClass();
                                strLIZ = C1796580wqu.LIZ(C2137908Zd.LJ(strLIZ));
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(c20275914Vh2.LIZ)) {
                            jSONObject.put("url", c20275914Vh2.LIZ);
                        }
                        if (!TextUtils.isEmpty(c20275914Vh2.LIZIZ)) {
                            jSONObject.put("uri", c20275914Vh2.LIZIZ);
                        }
                        jSONObject.put("base64", strLIZ);
                        jSONArray.put(jSONObject);
                        return jSONArray;
                    }

                    {
                        this.LL = new WeakReference<>(c20275914Vh);
                        this.LLILLJJLI = new WeakReference<>(interfaceC20276114Vj);
                    }
                });
                return;
            }
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof TcmImage) {
            TcmImage tcmImage = (TcmImage) HandlerHook.getMessageObj(message.obj);
            if (!TextUtils.isEmpty(tcmImage.getMid())) {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mid", tcmImage.getMid());
                    jSONArray.put(jSONObject);
                    this.mOnFileSelected.LIZJ(jSONArray);
                    return;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        this.mOnFileSelected.LIZ(0, "uploadFailed");
    }

    public void setFilePath(String str) {
        this.mImageFilePath = str;
    }

    private void tryToAddPicToGallery(Context context, File file) throws Throwable {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        if (!C2429209fW.LIZ().needInterceptBySandbox(intent, 1207966465)) {
            C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkRdWPwuTTtDIsNhep3PNSCe7j0XbCyAdl0=", null));
            C2204961BRm.LJLJJI(context, new String[]{file.toString()}, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkRdWPwuTTtDIsNhep3PNSCe7j0XbCyAdl0=", null));
        }
    }

    @Override // X.InterfaceC20277514Vx
    public void handleJsInvoke(JSONObject jSONObject, boolean z) {
        Activity activity = this.mActivityRef.get();
        if (activity == null) {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (!hasCameraFeature(activity)) {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        this.mImageSource = jSONObject.optString("source");
        this.mEncryptUrl = jSONObject.optString("encryptURL", "");
        this.mNameSpace = jSONObject.optString("nameSpace", "");
        tryToTakePhoto(activity);
    }

    public TakePhotoFeature(WeakReference<Activity> weakReference, C20277714Vz c20277714Vz, InterfaceC20276114Vj interfaceC20276114Vj) {
        C0WQX c0wqx = C0WQX.SERIAL;
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(c0wqx);
        c2123408ToLIZ.LIZIZ = "takephoto";
        this.mTakePhotoSingleThreadPool = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
        C2123408To c2123408ToLIZ2 = C2123508Tp.LIZ(c0wqx);
        c2123408ToLIZ2.LIZIZ = "uploadphoto";
        this.mUploadPhotoSingleThreadPool = C823050WQl.LIZ(c2123408ToLIZ2.LIZ());
        this.mEncryptUrl = "";
        this.mNameSpace = "";
        this.mUploadingDialog = c20277714Vz;
        this.mOnFileSelected = interfaceC20276114Vj;
        this.mActivityRef = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPermissionAndTakePhoto$0(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
            executeTakePhotoTask(activity);
            return;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(activity);
        c1233040iBy.LIZIZ(2131839203);
        c1233040iBy.LIZLLL();
        this.mOnFileSelected.LIZ(-1, "uploadFailed");
    }

    @Override // X.InterfaceC20277514Vx
    public boolean onActivityResult(int i, int i2, Intent intent) throws Throwable {
        if (i2 == 0) {
            this.mOnFileSelected.LIZ(0, "uploadCancel");
            return true;
        }
        if (i2 == -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Api.LIZIZ);
            sbLIZ.append("?uid=");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!TextUtils.isEmpty(this.mImageSource)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("&source=");
                sbLIZ2.append(this.mImageSource);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (!TextUtils.isEmpty(this.mEncryptUrl)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(Api.LIZ);
                sbLIZ3.append("/");
                sbLIZ3.append(this.mEncryptUrl);
                strLIZIZ = new C0XI4(C2188811AlT.LIZIZ(sbLIZ3)).LJFF();
            }
            this.mUploadingDialog.LIZ();
            tryToAddPicToGallery(this.mActivityRef.get(), new C0VSJ(this.mImageFilePath));
            this.mUploadingDialog.LIZIZ(this.mActivityRef.get());
            if (!TextUtils.isEmpty(this.mEncryptUrl)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C2259691DcV("NS", this.mNameSpace));
                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJZZI(new WeakHandler(this), strLIZIZ, this.mImageFilePath, arrayList);
                return true;
            }
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJZ(new WeakHandler(this), strLIZIZ, 8388608, this.mImageFilePath, null);
            return true;
        }
        this.mOnFileSelected.LIZ(0, "uploadFailed");
        return true;
    }
}
